from yogento.client.services.user_settings.impl.yogento_rest_user_settings_service import \
    YogentoRestUserSettingsService
from yogento_test.client.services.test._yogento_rest_service_test import \
    _YogentoRestServiceTest
from yogento_test.client.services.user_settings.test import _user_settings_service_test


class YogentoRestUserSettingsServiceTest(_user_settings_service_test._UserSettingsServiceTest):
    def setUp(self):
        self._setUp(YogentoRestUserSettingsService(**_YogentoRestServiceTest.KWDS))
