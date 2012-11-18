from yogento.client.services.customer.impl.magento_xmlrpc_customer_service import \
    MagentoXmlrpcCustomerService
from yogento_test.client.services.customer.test import _customer_service_test
from yogento_test.client.services.test._magento_xmlrpc_service_test import \
    _MagentoXmlrpcServiceTest


if _MagentoXmlrpcServiceTest.canRunTest():
    # pylint: disable=C0111
    class MagentoXmlrpcCustomerServiceTest(_customer_service_test._CustomerServiceTest):
        def setUp(self):
            self._setUp(MagentoXmlrpcCustomerService(_MagentoXmlrpcServiceTest.API_URL))
