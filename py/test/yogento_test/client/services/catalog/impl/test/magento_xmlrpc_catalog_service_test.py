from yogento.client.services.catalog.impl.magento_xmlrpc_catalog_service import \
    MagentoXmlrpcCatalogService
from yogento_test.client.services.catalog.test import _catalog_service_test
from yogento_test.client.services.test._magento_xmlrpc_service_test import \
    _MagentoXmlrpcServiceTest


if _MagentoXmlrpcServiceTest.canRunTest():
    class MagentoXmlrpcCatalogServiceTest(_catalog_service_test._CatalogServiceTest):
        def setUp(self):
            self._setUp(MagentoXmlrpcCatalogService(_MagentoXmlrpcServiceTest.API_URL), read_only=True)
