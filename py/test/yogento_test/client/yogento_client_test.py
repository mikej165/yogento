from yogento.client import YogentoClient
from yogento_test.client.services.test._yogento_rest_service_test import \
    _YogentoRestServiceTest
import unittest


class YogentoClientTest(unittest.TestCase):
    def setUp(self):
        self.__client = YogentoClient(_YogentoRestServiceTest.API_URL)

    def test_get_current_user(self):
        self.__client.get_current_user()

    def test_get_products(self):
        self.__client.get_products()
