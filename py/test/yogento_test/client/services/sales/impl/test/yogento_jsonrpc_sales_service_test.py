from yogento.client.services.sales.impl.yogento_jsonrpc_sales_service import \
    YogentoJsonrpcSalesService
from yogento_test.client.services.sales.test import _sales_service_test
from yogento_test.client.services.test._yogento_jsonrpc_service_test import \
    _YogentoJsonrpcServiceTest


class YogentoJsonrpcSalesServiceTest(_sales_service_test._SalesServiceTest):
    def setUp(self):
        self._setUp(YogentoJsonrpcSalesService(api_url=_YogentoJsonrpcServiceTest.API_URL, headers=_YogentoJsonrpcServiceTest.HEADERS))
