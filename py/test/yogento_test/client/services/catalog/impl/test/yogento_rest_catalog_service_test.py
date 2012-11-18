from yogento.client.services.catalog.impl.yogento_rest_catalog_service import \
    YogentoRestCatalogService
from yogento_test.client.services.catalog.test import _catalog_service_test
from yogento_test.client.services.test._yogento_rest_service_test import \
    _YogentoRestServiceTest


class YogentoRestCatalogServiceTest(_catalog_service_test._CatalogServiceTest):
    def setUp(self):
        self._setUp(YogentoRestCatalogService(_YogentoRestServiceTest.API_URL, headers={'User-Agent': 'Test'}), read_only=False)
