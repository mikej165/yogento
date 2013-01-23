from itertools import ifilterfalse
import __builtin__
import thryft.protocol.json_protocol
import yogento.api.models.catalog.category.category
import yogento.api.models.catalog.product.product
import yogento.api.models.image.image_resolution
import yogento.api.services.catalog.catalog_service
import yogento.client.services._yogento_jsonrpc_service


class YogentoJsonrpcCatalogService(yogento.client.services._yogento_jsonrpc_service._YogentoJsonrpcService, yogento.api.services.catalog.catalog_service.CatalogService):
    def __init__(self, api_url, headers=None):
        api_url = api_url.rstrip('/')
        if not api_url.endswith('/jsonrpc/catalog'):
            api_url += '/jsonrpc/catalog'
        yogento.client.services._yogento_jsonrpc_service._YogentoJsonrpcService.__init__(self, api_url=api_url, headers=headers)

    def _delete_category_tree(self, **kwds):
        return self._request('delete_category_tree', **kwds)

    def _delete_product_by_sku(self, **kwds):
        return self._request('delete_product_by_sku', **kwds)

    def _delete_products(self, **kwds):
        self._request('delete_products', **kwds)

    def _get_category_tree(self, **kwds):
        return_value = self._request('get_category_tree', **kwds)
        iprot = thryft.protocol.json_protocol.JsonProtocol(return_value)
        return yogento.api.models.catalog.category.category.Category.read(iprot)

    def _get_product_count(self, **kwds):
        return self._request('get_product_count', **kwds)

    def _get_product_by_sku(self, **kwds):
        return_value = self._request('get_product_by_sku', **kwds)
        iprot = thryft.protocol.json_protocol.JsonProtocol(return_value)
        return yogento.api.models.catalog.product.product.Product.read(iprot)

    def _get_product_skus(self, **kwds):
        return_value = self._request('get_product_skus', **kwds)
        iprot = thryft.protocol.json_protocol.JsonProtocol(return_value)
        return frozenset([iprot.readString() for _ in xrange(iprot.readSetBegin()[1])] + (iprot.readSetEnd() is None and []))

    def _get_products(self, **kwds):
        return_value = self._request('get_products', **kwds)
        iprot = thryft.protocol.json_protocol.JsonProtocol(return_value)
        return frozenset([yogento.api.models.catalog.product.product.Product.read(iprot) for _ in xrange(iprot.readSetBegin()[1])] + (iprot.readSetEnd() is None and []))

    def _get_products_by_skus(self, **kwds):
        return_value = self._request('get_products_by_skus', **kwds)
        iprot = thryft.protocol.json_protocol.JsonProtocol(return_value)
        return frozenset([yogento.api.models.catalog.product.product.Product.read(iprot) for _ in xrange(iprot.readSetBegin()[1])] + (iprot.readSetEnd() is None and []))

    def _get_product_thumbnail_url(self, **kwds):
        return self._request('get_product_thumbnail_url', **kwds)

    def _get_sample_products(self, **kwds):
        return_value = self._request('get_sample_products', **kwds)
        iprot = thryft.protocol.json_protocol.JsonProtocol(return_value)
        return frozenset([yogento.api.models.catalog.product.product.Product.read(iprot) for _ in xrange(iprot.readSetBegin()[1])] + (iprot.readSetEnd() is None and []))

    def _head_product_by_sku(self, **kwds):
        return self._request('head_product_by_sku', **kwds)

    def _put_category_tree(self, **kwds):
        self._request('put_category_tree', **kwds)

    def _put_product(self, **kwds):
        self._request('put_product', **kwds)

    def _put_products(self, **kwds):
        self._request('put_products', **kwds)

