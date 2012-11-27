from yogento.client.services.customer.impl.yogento_rest_customer_service import \
    YogentoRestCustomerService
from yogento_test.client.services.customer.test import _customer_service_test
from yogento_test.client.services.test._yogento_rest_service_test import \
    _YogentoRestServiceTest


class YogentoRestCustomerServiceTest(_customer_service_test._CustomerServiceTest):
    def setUp(self):
        self._setUp(YogentoRestCustomerService(**_YogentoRestServiceTest.KWDS))
