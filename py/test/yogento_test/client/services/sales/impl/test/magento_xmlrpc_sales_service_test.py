from yogento.client.services.sales.impl.magento_xmlrpc_sales_service import \
    MagentoXmlrpcSalesService
from yogento_test.client.services.sales.test import _sales_service_test
from yogento_test.client.services.test._magento_xmlrpc_service_test import \
    _MagentoXmlrpcServiceTest


# pylint: disable=C0111
if _MagentoXmlrpcServiceTest.canRunTest():
    class MagentoXmlrpcSalesServiceTest(_sales_service_test._SalesServiceTest):
        def setUp(self):
            self._setUp(MagentoXmlrpcSalesService(_MagentoXmlrpcServiceTest.API_URL))
