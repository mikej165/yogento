from yogento.client.services.mail.impl.yogento_jsonrpc_mail_service import \
    YogentoJsonrpcMailService
from yogento_test.client.services.mail.test import _mail_service_test
from yogento_test.client.services.test._yogento_jsonrpc_service_test import _YogentoJsonrpcServiceTest


class YogentoJsonrpcMailServiceTest(_mail_service_test._MailServiceTest):
    def setUp(self):
        self._setUp(
            YogentoJsonrpcMailService(
                api_url="http://%s%s" % (_YogentoJsonrpcServiceTest.API_NETINFO, _YogentoJsonrpcServiceTest.API_PATH),
                headers={'Cookie': 'JSESSIONID=580D4C2BC4AF3452D84EF698C39331E7; rememberMe=uWAQCw/giZ0B9bSmvb5gfw/fbr/Oa0BMxw9K98CGM1FKbguF6BFkip1bU1ctwqNtxjD/S2K6N6lJNMLRyddlMAI+2viQa4DEV0ndCkILR0U2lTPEtcWQBW+ZcMZbuyDGNVinXDXcIurkCy88uKU0VDydRmnkKAWZm/OF0zdkbT0qJNjnp3JJ6us9s+SvvFGtiHwnNXDBBufjbjszVzy+duZg2CHnztZre8Ka6OES9AXwRI1JdqjOWU7mZdBAC8rtA+0izEf8yKdtNJAA/itwToY3HPz6XBjye0w6yfZaj972rjhsdYYt+6lR8X4dFUxNvH/mEdJZrvExWPiMfOi35LXifxASVaqHc/sXv9B1EFaj10B2d2mTTKtuMMy2WrtOgiKUQboaheWaWB6dBHsfFlzoZS/CSYzwWUEGahFIjRyOGfN7csBbvlUIAvMAOwHEOOozXHgMxt/QOjRVQkUAzjBheojKzK7J9n+KLuD3uHKW+XfKRrKYa7eNxTQoesx/ArTig0tVCZwTui4naE7urQ=='}
            )
        )
