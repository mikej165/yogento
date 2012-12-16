from yogento.client.services.user_settings.impl.yogento_jsonrpc_user_settings_service import \
    YogentoJsonrpcUserSettingsService
from yogento_test.client.services.test._yogento_jsonrpc_service_test import \
    _YogentoJsonrpcServiceTest
from yogento_test.client.services.user_settings.test import \
    _user_settings_service_test


class YogentoJsonrpcUserSettingsServiceTest(_user_settings_service_test._UserSettingsServiceTest):
    def setUp(self):
        self._setUp(YogentoJsonrpcUserSettingsService(**_YogentoJsonrpcServiceTest.KWDS))
