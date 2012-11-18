from xmlrpclib import Fault
from yogento.api.models.catalog.category.category import Category
from yogento.api.models.catalog.category.magento.magento_category import \
    MagentoCategory
from yogento.api.models.catalog.product.magento.magento_product import \
    MagentoProduct
from yogento.api.models.catalog.product.product import Product
from yogento.api.services.catalog.catalog_service import CatalogService
from yogento.api.services.catalog.no_such_category_exception import \
    NoSuchCategoryException
from yogento.api.services.catalog.no_such_product_exception import \
    NoSuchProductException
from yogento.client.protocols.magento_xmlrpc_protocol import \
    MagentoXmlrpcProtocol
from yogento.client.services._magento_xmlrpc_service import \
    _MagentoXmlrpcService


class MagentoXmlrpcCatalogService(_MagentoXmlrpcService, CatalogService):
    def _get_category_tree(self):
        with self._magento_xmlrpc_api_client.login() as magento_api:
            def expand_category_tree(subtree_category_dict):
                child_category_dicts = subtree_category_dict.get('children', [])
                for child_category_dict in child_category_dicts:
                    try:
                        expand_category_tree(child_category_dict)
                    except NoSuchCategoryException:
                        pass
                try:
                    subtree_category_dict_expanded = \
                        magento_api.catalog_category.info(
                            subtree_category_dict['category_id']
                        )
                    subtree_category_dict.update(subtree_category_dict_expanded)
                    subtree_category_dict['children'] = child_category_dicts
                except Fault, fault:
                    if fault.faultCode == 101:
                        raise NoSuchCategoryException
                    else:
                        raise
                try:
                    del subtree_category_dict['all_children']
                except KeyError:
                    pass
            root_category_dict = magento_api.catalog_category.tree()
            expand_category_tree(root_category_dict)
            return Category(MagentoCategory.read(MagentoXmlrpcProtocol(root_category_dict)))

    def _get_product_by_sku(self, sku):
        with self._magento_xmlrpc_api_client.login() as magento_api:
            return self.__get_product(magento_api, sku)

    def _get_product_skus(self):
        with self._magento_xmlrpc_api_client.login() as magento_api:
            return tuple([product['sku'] for product in magento_api.catalog_product.list()])

    def _get_products(self):
        with self._magento_xmlrpc_api_client.login() as magento_api:
            products = []
            product_stub_dicts = magento_api.catalog_product.list()
            for product_stub_dict in product_stub_dicts:
                product = \
                    self.__get_product(
                        magento_api,
                        product_stub_dict['product_id']
                    )
                products.append(product)
            return tuple(products)

    def __get_product(self, magento_api, product_id_or_sku):
        try:
            product_dict = magento_api.catalog_product.info(product_id_or_sku)
        except Fault, fault:
            if fault.faultCode == 101:
                raise NoSuchProductException
            else:
                raise

        try:
            product_media_list = \
                magento_api.catalog_product_media.list(product_dict['product_id'])
            assert not 'images' in product_dict
            product_dict['images'] = product_media_list
        except Fault, fault:
            pass

        try:
            product_tags = \
                magento_api.catalog_product_tag.list(product_dict['product_id'])
            if isinstance(product_tags, dict):
                assert not 'tags' in product_dict
                product_dict['tags'] = [tag['name']
                                        for tag in product_tags.itervalues()]
        except Fault, fault:
            pass

        product = Product(MagentoProduct.read(MagentoXmlrpcProtocol(product_dict)))

        return product

    def _head_product_by_sku(self, sku):
        try:
            self._get_product_by_sku(sku)
            return True
        except NoSuchProductException:
            return False

    def _put_orders(self, orders):
        for order in orders:
            self._put_order(order)
