from decimal import Decimal
from hamcrest.core import assert_that
from hamcrest.core.core.isequal import equal_to
from hamcrest.core.core.isinstanceof import instance_of
from hamcrest.library.number.ordering_comparison import greater_than
from hamcrest.library.object.haslength import has_length
from yogento.api.models.catalog.product.magento.magento_product import \
    MagentoProduct
from yogento.api.models.catalog.product.magento.magento_product_status import \
    MagentoProductStatus
from yogento.api.models.catalog.product.magento.magento_product_type import \
    MagentoProductType
from yogento.api.models.catalog.product.product import Product
from yogento.api.services.catalog.no_such_product_exception import \
    NoSuchProductException
import unittest


# pylint: disable=C0111
class _CatalogServiceTest(unittest.TestCase):
    def __init__(self, *args, **kwds):
        unittest.TestCase.__init__(self, *args, **kwds)
        self.__catalog_service = None

        products = []
        product_skus = []
        for product_i in xrange(2):
            product = \
                Product(MagentoProduct(
                    description="Test product " + str(product_i),
                    name="Test product " + str(product_i),
                    price=Decimal(0),
                    short_description="Test product " + str(product_i),
                    sku="testproduct" + str(product_i),
                    status=MagentoProductStatus.ENABLED,
                    type=MagentoProductType.SIMPLE,
                    visibility=frozenset(("CATALOG",)),
                    url_key="testproduct" + str(product_i),
                    url_path="/testproduct" + str(product_i)
                ))
            products.append(product)
            product_skus.append(product.magento_product.sku);
        self.__products = frozenset(products)
        self.__product_skus = frozenset(product_skus)

    def __put_products(self):
        self.__catalog_service.put_products(self.__products)

    def _setUp(self, catalog_service, read_only):
        self.__catalog_service = catalog_service
        self.__read_only = read_only

    def test_delete_product_by_sku(self):
        if self.__catalog_service is None or self.__read_only:
            return

        self.__put_products()

        products = self.__catalog_service.get_products()
        assert_that(products, equal_to(self.__products))

        products = tuple(self.__products)
        deleted_product = products[0]
        remaining_products = products[1:]
        self.__catalog_service.delete_product_by_sku(deleted_product.magento_product.sku)

        products = self.__catalog_service.get_products()
        assert_that(products, equal_to(frozenset(remaining_products)))

    def test_delete_products(self):
        if self.__catalog_service is None or self.__read_only:
            return

        self.__put_products()

        products = self.__catalog_service.get_products()
        assert_that(products, equal_to(self.__products))

        self.__catalog_service.delete_products()
        products = self.__catalog_service.get_products()
        assert_that(products, has_length(0))

    def test_get_product_count(self):
        if self.__catalog_service is None:
            return

        if self.__read_only:
            product_count = self.__catalog_service.get_product_count()
            assert_that(product_count, greater_than(0))
        else:
            self.__put_products()

            product_count = self.__catalog_service.get_product_count()
            assert_that(product_count, equal_to(len(self.__products)))

    def test_get_products(self):
        if self.__catalog_service is None:
            return

        if not self.__read_only:
            self.__put_products()

        products = self.__catalog_service.get_products()
        assert_that(products, has_length(greater_than(0)))
        for product in products:
            assert_that(product, instance_of(Product))

        if not self.__read_only:
            assert_that(products, equal_to(self.__products))

    def test_get_products_include_disabled(self):
        if self.__catalog_service is None:
            return

        if self.__read_only:
            products = self.__catalog_service.get_products(include_disabled=True)
            assert_that(products, has_length(greater_than(0)))
        else:
            self.__put_products()

            disabled_product = list(self.__products)[0]
            disabled_product = disabled_product.replace(magento_product=disabled_product.magento_product.replace(sku='Test product disabled').replace(status=MagentoProductStatus.DISABLED))
            self.__catalog_service.put_product(disabled_product)

            products = self.__catalog_service.get_products(include_disabled=True)
            assert_that(products, equal_to(frozenset(list(self.__products) + [disabled_product])))

            enabled_products = self.__catalog_service.get_products(include_disabled=False)
            assert_that(enabled_products, equal_to(self.__products))

    def test_get_products_query(self):
        if self.__catalog_service is None:
            return

        if self.__read_only:
            products = self.__catalog_service.get_products(query='dvd')
            assert_that(products, has_length(greater_than(0)))
        else:
            self.__put_products()
            products = self.__catalog_service.get_products(query='1')
            assert_that(products, has_length(1))

    def test_get_product_by_sku(self):
        if self.__catalog_service is None:
            return

        if not self.__read_only:
            self.__put_products()

        product_skus = self.__catalog_service.get_product_skus()
        assert_that(product_skus, has_length(greater_than(0)))
        for product_sku in product_skus:
            product = self.__catalog_service.get_product_by_sku(product_sku)
            assert_that(product, instance_of(Product))

        try:
            self.__catalog_service.get_product_by_sku('nonexitantsku')
            self.fail()
        except NoSuchProductException:
            pass

    def test_get_product_skus(self):
        if self.__catalog_service is None:
            return

        if not self.__read_only:
            self.__put_products()

        product_skus = self.__catalog_service.get_product_skus()
        assert_that(product_skus, has_length(greater_than(0)))
        for product_sku in product_skus:
            assert_that(product_sku, instance_of(basestring))

        if not self.__read_only:
            assert_that(product_skus, equal_to(self.__product_skus))

    def test_head_product_by_sku(self):
        if self.__catalog_service is None:
            return

        if not self.__read_only:
            self.__put_products()

        product_skus = self.__catalog_service.get_product_skus()
        assert_that(product_skus, has_length(greater_than(0)))
        for product_sku in product_skus:
            head = self.__catalog_service.head_product_by_sku(product_sku)
            assert_that(head, instance_of(bool))
            self.assertTrue(head)
        self.assertFalse(self.__catalog_service.head_product_by_sku('nonextantsku'))

    def test_put_product(self):
        if self.__catalog_service is None or self.__read_only:
            return

        for product in self.__products:
            self.__catalog_service.put_product(product)
        products = self.__catalog_service.get_products()
        assert_that(products, equal_to(self.__products))

    def test_put_products(self):
        if self.__catalog_service is None or self.__read_only:
            return

        self.__put_products()
        products = self.__catalog_service.get_products()
        assert_that(products, equal_to(self.__products))
