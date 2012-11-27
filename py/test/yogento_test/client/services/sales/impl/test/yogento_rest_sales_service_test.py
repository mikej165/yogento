from yogento.client.services.sales.impl.yogento_rest_sales_service import \
    YogentoRestSalesService
from yogento_test.client.services.sales.test import _sales_service_test
from yogento_test.client.services.test._yogento_rest_service_test import \
    _YogentoRestServiceTest


# pylint: disable=C0111
class YogentoRestSalesServiceTest(_sales_service_test._SalesServiceTest):
    def setUp(self):
        self._setUp(YogentoRestSalesService(**_YogentoRestServiceTest.KWDS))
