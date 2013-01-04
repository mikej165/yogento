#-------------------------------------------------------------------------------
# Copyright (c) 2013, Minor Gordon
# All rights reserved.
# 
# Redistribution and use in source and binary forms, with or without
# modification, are permitted provided that the following conditions
# are met:
# 
#     * Redistributions of source code must retain the above copyright
#       notice, this list of conditions and the following disclaimer.
# 
#     * Redistributions in binary form must reproduce the above copyright
#       notice, this list of conditions and the following disclaimer in
#       the documentation and/or other materials provided with the
#       distribution.
# 
# THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND
# CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES,
# INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF
# MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
# DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR
# CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
# SPECIAL, EXEMPLARY, OR CONSEQUENTIAL  DAMAGES (INCLUDING,
# BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
# SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
# INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
# LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
# (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT
# OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY
# OF SUCH DAMAGE.
#-------------------------------------------------------------------------------

from datetime import datetime
from hamcrest.core import assert_that
from hamcrest.core.core.isequal import equal_to
from hamcrest.core.core.isinstanceof import instance_of
from time import sleep
from yogento.api.models.user_settings.user_settings import UserSettings
import unittest


class _UserSettingsServiceTest(unittest.TestCase):
    def _setUp(self, user_settings_service):
        self.__user_settings_service = user_settings_service

    def test_get_current_user_settings(self):
        expected_user_settings = \
            UserSettings(
                magento_store_url='http://localhost/magento/',
                product_csv_mtime=datetime.utcnow()
            )
        self.__user_settings_service.put_current_user_settings(expected_user_settings)

        user_settings = self.__user_settings_service.get_current_user_settings()
        assert_that(user_settings, instance_of(UserSettings))

    def test_put_current_user_settings(self):
        expected_user_settings = \
            UserSettings(
                magento_store_url='http://localhost/magento/',
                product_csv_mtime=datetime.utcnow().replace(microsecond=0)
            )
        self.__user_settings_service.put_current_user_settings(expected_user_settings)

        user_settings = self.__user_settings_service.get_current_user_settings()
        assert_that(user_settings, instance_of(UserSettings))
        assert_that(user_settings, equal_to(expected_user_settings))

    def test_rewrite_user_settings(self):
        product_csv_mtime = datetime.utcnow().replace(microsecond=0)
        expected_user_settings = \
            UserSettings(
                magento_store_url='http://localhost/magento/',
                product_csv_mtime=product_csv_mtime
            )
        self.__user_settings_service.put_current_user_settings(expected_user_settings)
        user_settings = self.__user_settings_service.get_current_user_settings()
        assert_that(user_settings, equal_to(expected_user_settings))
        assert_that(user_settings.product_csv_mtime, equal_to(product_csv_mtime))

        sleep(1.0)

        new_product_csv_mtime = datetime.utcnow().replace(microsecond=0)
        expected_user_settings = user_settings.replace(product_csv_mtime=new_product_csv_mtime)
        # UserSettings.Builder().update(user_settings).set_product_csv_mtime(datetime.utcnow().replace(microsecond=0)).build()
        self.__user_settings_service.put_current_user_settings(expected_user_settings)
        user_settings = self.__user_settings_service.get_current_user_settings()
        assert_that(user_settings, equal_to(expected_user_settings))
        assert_that(user_settings.product_csv_mtime, equal_to(new_product_csv_mtime))
