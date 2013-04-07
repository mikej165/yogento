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
from yogento.api.services.user_settings.no_such_user_settings_exception import \
    NoSuchUserSettingsException
from yogento.client.services.user_settings.impl.jsonrpc_client_user_settings_service import \
    JsonrpcClientUserSettingsService
import logging


class _JsonrpcClientServiceTest(object):
    API_PASSWORD = '_web_service_test'
    API_NETINFO = None
    API_PATH = None
    API_USERNAME = '_web_service_test'
    API_URL = None
    for api_netinfo, api_path in (
        ('localhost:8080', '/yogento/api/'),
        ('yogento.com', '/api/'),
    ):
        api_url = "http://%(API_USERNAME)s:%(API_PASSWORD)s@%(api_netinfo)s%(api_path)s" % locals()
        try:
            JsonrpcClientUserSettingsService(api_url).get_current_user_settings()
        except NoSuchUserSettingsException:
            pass
        except:
            logging.error("unable to contact %s", api_netinfo, exc_info=True)
            continue
        API_NETINFO = api_netinfo
        API_PATH = api_path
        API_URL = api_url
        break

    HEADERS = {'User-Agent': 'Test'}

    KWDS = {'api_url': API_URL, 'headers': HEADERS}
