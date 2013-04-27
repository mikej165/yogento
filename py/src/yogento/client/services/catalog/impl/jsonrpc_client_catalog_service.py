from itertools import ifilterfalse
from thryft.core.protocol.builtins_protocol import BuiltinsProtocol
from urlparse import urlparse
import __builtin__
import base64
import json
import logging
import re
import thryft.core.protocol.json_protocol
import urllib2
import yogento.api.models.catalog.product.product
import yogento.api.models.image.image_resolution
import yogento.api.services.catalog.catalog_service


class JsonrpcClientCatalogService(yogento.api.services.catalog.catalog_service.CatalogService):
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
        yogento.api.services.catalog.catalog_service.CatalogService.__init__(self)

        api_url = api_url.rstrip('/')
        if not api_url.endswith('/jsonrpc/catalog'):
            api_url += '/jsonrpc/catalog'
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
                    exception_class = self.__import_exception_class(exception_class_qname)
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

    def _delete_product_by_sku(self, **kwds):
        return self.__request('delete_product_by_sku', **kwds)

    def _delete_products(self, **kwds):
        self.__request('delete_products', **kwds)

    def _get_product_by_sku(self, **kwds):
        return_value = self.__request('get_product_by_sku', **kwds)
        iprot = thryft.core.protocol.json_protocol.JsonProtocol(return_value)
        return yogento.api.models.catalog.product.product.Product.read(iprot)

    def _get_product_count(self, **kwds):
        return self.__request('get_product_count', **kwds)

    def _get_product_skus(self, **kwds):
        return_value = self.__request('get_product_skus', **kwds)
        iprot = thryft.core.protocol.json_protocol.JsonProtocol(return_value)
        return frozenset([iprot.readString() for _ in xrange(iprot.readSetBegin()[1])] + (iprot.readSetEnd() is None and []))

    def _get_product_thumbnail_url(self, **kwds):
        return self.__request('get_product_thumbnail_url', **kwds)

    def _get_products(self, **kwds):
        return_value = self.__request('get_products', **kwds)
        iprot = thryft.core.protocol.json_protocol.JsonProtocol(return_value)
        return frozenset([yogento.api.models.catalog.product.product.Product.read(iprot) for _ in xrange(iprot.readSetBegin()[1])] + (iprot.readSetEnd() is None and []))

    def _get_products_by_skus(self, **kwds):
        return_value = self.__request('get_products_by_skus', **kwds)
        iprot = thryft.core.protocol.json_protocol.JsonProtocol(return_value)
        return frozenset([yogento.api.models.catalog.product.product.Product.read(iprot) for _ in xrange(iprot.readSetBegin()[1])] + (iprot.readSetEnd() is None and []))

    def _get_sample_product_by_sku(self, **kwds):
        return_value = self.__request('get_sample_product_by_sku', **kwds)
        iprot = thryft.core.protocol.json_protocol.JsonProtocol(return_value)
        return yogento.api.models.catalog.product.product.Product.read(iprot)

    def _get_sample_product_thumbnail_url(self, **kwds):
        return self.__request('get_sample_product_thumbnail_url', **kwds)

    def _get_sample_products(self, **kwds):
        return_value = self.__request('get_sample_products', **kwds)
        iprot = thryft.core.protocol.json_protocol.JsonProtocol(return_value)
        return frozenset([yogento.api.models.catalog.product.product.Product.read(iprot) for _ in xrange(iprot.readSetBegin()[1])] + (iprot.readSetEnd() is None and []))

    def _head_product_by_sku(self, **kwds):
        return self.__request('head_product_by_sku', **kwds)

    def _put_product(self, **kwds):
        self.__request('put_product', **kwds)

    def _put_products(self, **kwds):
        self.__request('put_products', **kwds)

