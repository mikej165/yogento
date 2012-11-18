from datetime import datetime
from time import sleep
from hamcrest.core import assert_that
from hamcrest.core.core.isequal import equal_to
from hamcrest.core.core.isinstanceof import instance_of
from yogento.api.models.user.user import User
from yogento.api.models.user.user_settings import UserSettings
from yogento.client.services.user.impl.yogento_rest_user_service import \
    YogentoRestUserService
from yogento_test.client.services.test._yogento_rest_service_test import \
    _YogentoRestServiceTest
import unittest


class YogentoRestUserServiceTest(unittest.TestCase, _YogentoRestServiceTest):
    def setUp(self):
        self.__user_service = YogentoRestUserService(self.API_URL)

    def test_get_current_user(self):
        user = self.__user_service.get_current_user()
        assert_that(user, instance_of(User))
        assert_that(user.username, equal_to(self.API_USERNAME))

    def test_get_current_user_settings(self):
        expected_user_settings = \
            UserSettings(
                magento_store_url='http://localhost/magento/',
                product_csv_mtime=datetime.utcnow()
            )
        self.__user_service.put_current_user_settings(expected_user_settings)

        user_settings = self.__user_service.get_current_user_settings()
        assert_that(user_settings, instance_of(UserSettings))

    def test_put_user_settings(self):
        expected_user_settings = \
            UserSettings(
                magento_store_url='http://localhost/magento/',
                product_csv_mtime=datetime.utcnow().replace(microsecond=0)
            )
        self.__user_service.put_current_user_settings(expected_user_settings)

        user_settings = self.__user_service.get_current_user_settings()
        assert_that(user_settings, instance_of(UserSettings))
        assert_that(user_settings, equal_to(expected_user_settings))

    def test_rewrite_user_settings(self):
        product_csv_mtime = datetime.utcnow().replace(microsecond=0)
        expected_user_settings = \
            UserSettings(
                magento_store_url='http://localhost/magento/',
                product_csv_mtime=product_csv_mtime
            )
        self.__user_service.put_current_user_settings(expected_user_settings)
        user_settings = self.__user_service.get_current_user_settings()
        assert_that(user_settings, equal_to(expected_user_settings))
        assert_that(user_settings.product_csv_mtime, equal_to(product_csv_mtime))

        sleep(1.0)

        new_product_csv_mtime = datetime.utcnow().replace(microsecond=0)
        expected_user_settings = user_settings.replace(product_csv_mtime=new_product_csv_mtime)
        # UserSettings.Builder().update(user_settings).set_product_csv_mtime(datetime.utcnow().replace(microsecond=0)).build()
        self.__user_service.put_current_user_settings(expected_user_settings)
        user_settings = self.__user_service.get_current_user_settings()
        assert_that(user_settings, equal_to(expected_user_settings))
        assert_that(user_settings.product_csv_mtime, equal_to(new_product_csv_mtime))

