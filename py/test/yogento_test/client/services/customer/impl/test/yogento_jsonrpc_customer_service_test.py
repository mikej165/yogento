from yogento.client.services.customer.impl.yogento_jsonrpc_customer_service import \
    YogentoJsonrpcCustomerService
from yogento_test.client.services.customer.test import _customer_service_test
from yogento_test.client.services.test._yogento_jsonrpc_service_test import \
    _YogentoJsonrpcServiceTest


class YogentoJsonrpcCustomerServiceTest(_customer_service_test._CustomerServiceTest):
    def setUp(self):
        self._setUp(YogentoJsonrpcCustomerService(**_YogentoJsonrpcServiceTest.KWDS))
