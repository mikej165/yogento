from urlparse import urlparse
import __builtin__
import base64
import json
import logging
import re
import thryft.protocol.builtins_protocol
import thryft.protocol.json_protocol
import urllib2
import yogento.api.models.image.image_resolution
import yogento.api.services.image.image_service


class JsonrpcClientImageService(yogento.api.services.image.image_service.ImageService):
    @staticmethod
    def __import_exception_class(exception_class_qname):
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

    def __init__(self, api_url, headers=None):
        yogento.api.services.image.image_service.ImageService.__init__(self)

        api_url = api_url.rstrip('/')
        if not api_url.endswith('/jsonrpc/image'):
            api_url += '/jsonrpc/image'
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

        if headers is None:
            headers = {}
        else:
            if not isinstance(headers, dict):
                raise TypeError(headers)
            headers = headers.copy()
        self.__headers = headers

        self.__logger = logging.getLogger(self.__class__.__module__ + '.' + self.__class__.__name__)

        self.__next_id = 1

    def __request(self, method, headers=None, **kwds):
        request = {'jsonrpc': '2.0', 'method': method}
        request['id'] = id(request)
        params = {}
        params_oprot = thryft.protocol.builtins_protocol.BuiltinsProtocol(params)
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
                    exception_class = self.__import_exception_class(exception_class_qname)
                except ImportError:
                    raise RuntimeError("JSON-RPC: error: code=%(code)u, message='%(message)s'" % locals())
                data = error.get('data')
                if isinstance(data, dict):
                    data_iprot = thryft.protocol.builtins_protocol.BuiltinsProtocol([data])
                    exception_ = exception_class.read(data_iprot)
                    raise exception_
                else:
                    raise exception_class()
            else:
                raise RuntimeError("JSON-RPC error: code=%s, message='%s'" % (code, message))
        return response.get('result')

    def _delete_image_thumbnail(self, **kwds):
        return self.__request('delete_image_thumbnail', **kwds)

    def _get_image_thumbnail_url(self, **kwds):
        return self.__request('get_image_thumbnail_url', **kwds)

    def _put_image(self, **kwds):
        return self.__request('put_image', **kwds)

