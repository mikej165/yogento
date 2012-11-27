from yogento.client.services.user.impl.yogento_rest_user_service import \
    YogentoRestUserService
from yogento_test.client.services.test._yogento_rest_service_test import \
    _YogentoRestServiceTest
from yogento_test.client.services.user.test import _user_service_test


class YogentoRestUserServiceTest(_user_service_test._UserServiceTest):
    def setUp(self):
        self._setUp(YogentoRestUserService(**_YogentoRestServiceTest.KWDS))
