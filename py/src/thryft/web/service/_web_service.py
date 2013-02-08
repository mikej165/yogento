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

from inspect import isclass
from urllib import urlencode
from urlparse import urlparse
import base64
import logging
import re
import urllib2


def class_qname(class_):
    if not isclass(class_):
        class_ = class_.__class__
    return class_.__module__ + '.' + class_.__name__


def decamelize(name):
    return re.sub('(((?<=[a-z])[A-Z])|([A-Z](?![A-Z]|$)))', '_\\1', name)\
               .lower()\
               .strip('_')


def get_logger(cls_or_self):
    return logging.getLogger(class_qname(cls_or_self))


class _WebService(object):
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

        self._logger = get_logger(self)

    @staticmethod
    def _import_exception_class(exception_class_qname):
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

    @staticmethod
    def _read_response(response_fp):
        response_data = []
        while True:
            response_datum = response_fp.read()
            if len(response_datum) == 0:
                return ''.join(response_data)
            response_data.append(response_datum)

    def _request(self, method, url, data=None, headers=None, query=None):
        if headers is not None:
            headers = headers.copy()
            headers.update(self.__headers)
        else:
            headers = self.__headers

        url = self.__api_url + url
        if query is not None:
            if not isinstance(query, dict):
                raise TypeError(type(query))
            sanitized_query = {}
            for key, value in query.iteritems():
                if value is None:
                    continue
                elif isinstance(value, bool):
                    if value:
                        value = '1'
                    else:
                        value = '0'
                sanitized_query[key] = value
            if len(sanitized_query) > 0:
                url += '?' + urlencode(sanitized_query, doseq=True)

        self._logger.info("%s %u bytes to %s", method, data is not None and len(data) or 0, url)
        if data is not None:
            self._logger.debug("%s data: %s", method, data)

        request = urllib2.Request(url, data, headers)
        request.get_method = lambda: method

        return urllib2.urlopen(request)
