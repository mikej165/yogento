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

from yogento.client.services.mail.impl.jsonrpc_client_mail_service import \
    JsonrpcClientMailService
from yogento_test.client.services.mail.test import _mail_service_test
from yogento_test.client.services.test._jsonrpc_client_service_test import _JsonrpcClientServiceTest


class JsonrpcClientMailServiceTest(_mail_service_test._MailServiceTest):
    def setUp(self):
        self._setUp(
            JsonrpcClientMailService(
                api_url="http://%s%s" % (_JsonrpcClientServiceTest.API_NETINFO, _JsonrpcClientServiceTest.API_PATH),
                headers={'Cookie': 'JSESSIONID=580D4C2BC4AF3452D84EF698C39331E7; rememberMe=uWAQCw/giZ0B9bSmvb5gfw/fbr/Oa0BMxw9K98CGM1FKbguF6BFkip1bU1ctwqNtxjD/S2K6N6lJNMLRyddlMAI+2viQa4DEV0ndCkILR0U2lTPEtcWQBW+ZcMZbuyDGNVinXDXcIurkCy88uKU0VDydRmnkKAWZm/OF0zdkbT0qJNjnp3JJ6us9s+SvvFGtiHwnNXDBBufjbjszVzy+duZg2CHnztZre8Ka6OES9AXwRI1JdqjOWU7mZdBAC8rtA+0izEf8yKdtNJAA/itwToY3HPz6XBjye0w6yfZaj972rjhsdYYt+6lR8X4dFUxNvH/mEdJZrvExWPiMfOi35LXifxASVaqHc/sXv9B1EFaj10B2d2mTTKtuMMy2WrtOgiKUQboaheWaWB6dBHsfFlzoZS/CSYzwWUEGahFIjRyOGfN7csBbvlUIAvMAOwHEOOozXHgMxt/QOjRVQkUAzjBheojKzK7J9n+KLuD3uHKW+XfKRrKYa7eNxTQoesx/ArTig0tVCZwTui4naE7urQ=='}
            )
        )
