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

from thryft.web.client.service._web_client_service import _WebClientService
from thryft.core.protocol.builtins_protocol import BuiltinsProtocol
try:
    import json
except ImportError:
    import simplejson as json

class _JsonrpcClientService(_WebClientService):
    def __init__(self, *args, **kwds):
        _WebClientService.__init__(self, *args, **kwds)
        self.__next_id = 1

    def _request(self, method, **kwds):
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

        response = _WebClientService._request(self, 'POST', '', request_json)

        response_json = self._read_response(response)
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
