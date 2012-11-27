from yogento.client.services.user.impl.yogento_jsonrpc_user_service import \
    YogentoJsonrpcUserService
from yogento_test.client.services.test._yogento_jsonrpc_service_test import \
    _YogentoJsonrpcServiceTest
from yogento_test.client.services.user.test import _user_service_test


class YogentoJsonrpcUserServiceTest(_user_service_test._UserServiceTest):
    def setUp(self):
        self._setUp(YogentoJsonrpcUserService(**_YogentoJsonrpcServiceTest.KWDS))
