from urllib import quote
from yogento.api.models.catalog.category.category import Category
from yogento.api.models.catalog.product.product import Product
from yogento.api.services.catalog.catalog_service import CatalogService
from yogento.client.services._yogento_rest_service import _YogentoRestService


class YogentoRestCatalogService(_YogentoRestService, CatalogService):
    def _delete_product_by_sku(self, sku):
        return self._delete_model('/products/' + self.__quote_product_sku(sku))

    def _delete_products(self):
        self._delete_models('/products')

    def _get_category_tree(self):
        return self._get_model(Category, '/categories')

    def _get_product_count(self):
        return self._get_model_count('/products/count')

    def _get_product_by_sku(self, sku):
        return self._get_model(Product, '/products/' + self.__quote_product_sku(sku))

    def _get_products(self, **kwds):
        return self._get_model_set(Product, '/products', query=kwds)

    def _get_product_skus(self):
        return self._get_string_set('/products/skus')

    def _head_product_by_sku(self, sku):
        return self._head_model('/products/' + self.__quote_product_sku(sku))

    def post_products_csv(self, products_csv):
        return self._post_models_csv(products_csv, '/products')

    def _put_category_tree(self, category_tree):
        return self._put_model(category_tree, '/categories')

    def _put_product(self, product):
        return self._put_model(product, '/products/' + self.__quote_product_sku(product.magento_product.sku))

    def _put_products(self, products):
        return self._put_model_set(products, '/products')

    @staticmethod
    def __quote_product_sku(sku):
        return quote(sku, safe='')
        # return b64encode(sku)
        # return sku

    def search_products(self, *args, **kwds):
        return self._get_products(*args, **kwds)
