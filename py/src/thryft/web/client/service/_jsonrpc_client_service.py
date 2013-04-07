#-------------------------------------------------------------------------------
# Copyright (c) 2013, Minor Gordon
# All rights reserved.
#
# Redistribution and use in source and binary forms, with or without
# modification, are permitted provided that the following conditions
# are met:
#
#     * Redistributions of source code must retain the above copyright
#       notice, this list of conditions and the following disclaimer.
#
#     * Redistributions in binary form must reproduce the above copyright
#       notice, this list of conditions and the following disclaimer in
#       the documentation and/or other materials provided with the
#       distribution.
#
# THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND
# CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES,
# INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF
# MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
# DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR
# CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
# SPECIAL, EXEMPLARY, OR CONSEQUENTIAL  DAMAGES (INCLUDING,
# BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
# SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
# INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
# LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
# (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT
# OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY
# OF SUCH DAMAGE.
#-------------------------------------------------------------------------------

from thryft.core.protocol.builtins_protocol import BuiltinsProtocol
from urlparse import urlparse
import base64
import logging
import re
import urllib2
try:
    import json
except ImportError:
    import simplejson as json


class _JsonrpcClientService(object):
    def __init__(self, api_url, headers=None):
        object.__init__(self)

        if headers is None:
            headers = {}
        else:
            if not isinstance(headers, dict):
                raise TypeError(headers)
            headers = headers.copy()

        self.__api_url = api_url.rstrip('/')
        parsed_api_url = urlparse(api_url)
        parsed_api_url_netloc = parsed_api_url.netloc.split('@', 1)
        if len(parsed_api_url_netloc) == 2:
            username_password = parsed_api_url_netloc[0].split(':', 1)
            if len(username_password) == 2:
                username, password = username_password
                netloc = parsed_api_url_netloc[1]
                headers['Authorization'] = \
                    'Basic ' + \
                        base64.b64encode(
                            "%s:%s" % (
                                username,
                                password
                            )
                        )
                self.__api_url = \
                    parsed_api_url.scheme + '://' + netloc + \
                        parsed_api_url.path + \
                        parsed_api_url.query

    #            auth_handler = urllib2.HTTPBasicAuthHandler()
    #            auth_handler.add_password(realm='Realm',
    #                                      uri=self.__api_url,
    #                                      user=username,
    #                                      passwd=password)
    #            opener = urllib2.build_opener(auth_handler)
    #            urllib2.install_opener(opener)

        self.__headers = headers

        self.__logger = logging.getLogger(self.__class__.__module__ + '.' + self.__class__.__name__)

        self.__next_id = 1

    @staticmethod
    def _import_exception_class(exception_class_qname):
        def decamelize(name):
            return re.sub('(((?<=[a-z])[A-Z])|([A-Z](?![A-Z]|$)))', '_\\1', name)\
                       .lower()\
                       .strip('_')

        exception_class_qname = exception_class_qname.split('.')
        if len(exception_class_qname) < 2:
            raise
        elif exception_class_qname[0] not in ('com', 'org'):
            raise

        exception_class_name = exception_class_qname[-1]
        exception_module_qname = \
            exception_class_qname[1:-1] + \
                [decamelize(exception_class_name)]

        exception_module = __import__('.'.join(exception_module_qname))
        for module_name in exception_module_qname[1:]:
            exception_module = getattr(exception_module, module_name)

        return getattr(exception_module, exception_class_name)

    def _request(self, method, headers=None, **kwds):
        request = {'jsonrpc': '2.0', 'method': method}
        request['id'] = id(request)
        params = {}
        params_oprot = BuiltinsProtocol(params)
        for key, value in kwds.iteritems():
            if value is None:
                continue
            params_oprot.writeFieldBegin(key)
            params_oprot.writeMixed(value)
            params_oprot.writeFieldEnd()
        request['params'] = params
        request_json = json.dumps(request)

        if headers is not None:
            headers = headers.copy()
            headers.update(self.__headers)
        else:
            headers = self.__headers

        request = urllib2.Request(self.__api_url, request_json, headers)
        request.get_method = lambda: 'POST'

        response = urllib2.urlopen(request)

        response_json = []
        while True:
            response_datum = response.read()
            if len(response_datum) == 0:
                break
            response_json.append(response_datum)
        response_json = ''.join(response_json)

        response = json.loads(response_json)
        if response.get('id') != str(request['id']):
            raise RuntimeError("JSON-RPC: mismatched id: got %s, expected %s" % (response.get('id'), request['id']))
        if response.get('jsonrpc') != '2.0':
            raise RuntimeError("JSON-RPC: unexpected version: " + str(response.get('jsonrpc')))
        error = response.get('error')
        if error is not None:
            code = error.get('code')
            if code is None:
                raise RuntimeError("JSON-RPC: error response is missing code")
            message = error.get('message')
            if message is None:
                raise RuntimeError("JSON-RPC: error response is missing message")
            exception_class_qname = error.get('@class')
            if exception_class_qname is not None:
                try:
                    exception_class = self._import_exception_class(exception_class_qname)
                except ImportError:
                    raise RuntimeError("JSON-RPC: error: code=%(code)u, message='%(message)s'" % locals())
                data = error.get('data')
                if isinstance(data, dict):
                    data_iprot = BuiltinsProtocol([data])
                    exception_ = exception_class.read(data_iprot)
                    raise exception_
                else:
                    raise exception_class()
            else:
                raise RuntimeError("JSON-RPC error: code=%s, message='%s'" % (code, message))
        return response.get('result')
