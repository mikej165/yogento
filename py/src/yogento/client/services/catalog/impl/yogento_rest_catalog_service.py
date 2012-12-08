from itertools import ifilterfalse
import __builtin__
import thryft.protocol.json_protocol
import thryft.protocol.string_map_protocol
import urllib
import urllib2
import yogento.api.models.catalog.category.category
import yogento.api.models.catalog.product.product
import yogento.api.services.catalog.catalog_service
import yogento.client.services._yogento_rest_service


class YogentoRestCatalogService(yogento.client.services._yogento_rest_service._YogentoRestService, yogento.api.services.catalog.catalog_service.CatalogService):
    def __init__(self, api_url, headers=None):
        api_url = api_url.rstrip('/')
        if not api_url.endswith('/rest/'):
            api_url += '/rest/'
        yogento.client.services._yogento_rest_service._YogentoRestService.__init__(self, api_url=api_url, headers=headers)

    def _delete_category_tree(self):
        try:
            self._request('DELETE', '/catalog/category_tree', data=None, query=None)
            return True
        except urllib2.HTTPError, e:
            if e.code == 404:
                return False
            else:
                raise

    def _delete_product_by_sku(self, sku):
        try:
            self._request('DELETE', '/catalog/product/' + urllib.quote(sku, safe=''), data=None, query=None)
            return True
        except urllib2.HTTPError, e:
            if e.code == 404:
                return False
            else:
                raise

    def _delete_products(self):
        self._request('DELETE', '/catalog/products', data=None, query=None)

    def _get_category_tree(self):
        __return_value = self._request('GET', '/catalog/category_tree', data=None, query=None)
        iprot = thryft.protocol.json_protocol.JsonProtocol(__return_value)
        return yogento.api.models.catalog.category.category.Category.read(iprot)

    def _get_products(self, **kwds):
        __return_value = self._request('GET', '/catalog/products', data=None, query=thryft.protocol.string_map_protocol.StringMapProtocol().writeMixed(dict((key, value) for key, value in kwds.iteritems() if value is not None)).to_string_map())
        iprot = thryft.protocol.json_protocol.JsonProtocol(__return_value)
        return frozenset([yogento.api.models.catalog.product.product.Product.read(iprot) for _ in xrange(iprot.readSetBegin()[1])] + (iprot.readSetEnd() is None and []))

    def _get_product_count(self):
        __return_value = self._request('GET', '/catalog/product_count', data=None, query=None)
        iprot = thryft.protocol.json_protocol.JsonProtocol(__return_value)
        iprot.readListBegin()
        __return_value = iprot.readI32()
        iprot.readListEnd()
        return __return_value

    def _get_product_skus(self):
        __return_value = self._request('GET', '/catalog/product_skus', data=None, query=None)
        iprot = thryft.protocol.json_protocol.JsonProtocol(__return_value)
        return frozenset([iprot.readString() for _ in xrange(iprot.readSetBegin()[1])] + (iprot.readSetEnd() is None and []))

    def _get_product_by_sku(self, sku):
        __return_value = self._request('GET', '/catalog/product/' + urllib.quote(sku, safe=''), data=None, query=None)
        iprot = thryft.protocol.json_protocol.JsonProtocol(__return_value)
        return yogento.api.models.catalog.product.product.Product.read(iprot)

    def _get_products_by_skus(self, **kwds):
        __return_value = self._request('GET', '/catalog/products/', data=None, query=thryft.protocol.string_map_protocol.StringMapProtocol().writeMixed(dict((key, value) for key, value in kwds.iteritems() if value is not None)).to_string_map())
        iprot = thryft.protocol.json_protocol.JsonProtocol(__return_value)
        return frozenset([yogento.api.models.catalog.product.product.Product.read(iprot) for _ in xrange(iprot.readSetBegin()[1])] + (iprot.readSetEnd() is None and []))

    def _head_product_by_sku(self, sku):
        try:
            self._request('HEAD', '/catalog/product/' + urllib.quote(sku, safe=''), data=None, query=None)
            return True
        except urllib2.HTTPError, e:
            if e.code == 404:
                return False
            else:
                raise

    def _put_category_tree(self, **kwds):
        self._request('PUT', '/catalog/category_tree', data=str(thryft.protocol.json_protocol.JsonProtocol().writeMixed(dict((key, value) for key, value in kwds.iteritems() if value is not None))), query=None)

    def _put_product(self, **kwds):
        self._request('PUT', '/catalog/product', data=str(thryft.protocol.json_protocol.JsonProtocol().writeMixed(dict((key, value) for key, value in kwds.iteritems() if value is not None))), query=None)

    def _put_products(self, **kwds):
        self._request('PUT', '/catalog/products', data=str(thryft.protocol.json_protocol.JsonProtocol().writeMixed(dict((key, value) for key, value in kwds.iteritems() if value is not None))), query=None)

