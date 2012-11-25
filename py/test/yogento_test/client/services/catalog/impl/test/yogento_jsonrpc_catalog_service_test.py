from yogento.client.services.catalog.impl.yogento_jsonrpc_catalog_service import \
    YogentoJsonrpcCatalogService
from yogento_test.client.services.catalog.test import _catalog_service_test
from yogento_test.client.services.test._yogento_jsonrpc_service_test import \
    _YogentoJsonrpcServiceTest


class YogentoJsonrpcCatalogServiceTest(_catalog_service_test._CatalogServiceTest):
    def setUp(self):
        self._setUp(YogentoJsonrpcCatalogService(api_url=_YogentoJsonrpcServiceTest.API_URL, headers=_YogentoJsonrpcServiceTest.HEADERS), read_only=False)
