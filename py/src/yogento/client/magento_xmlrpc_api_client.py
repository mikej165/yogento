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

from urlparse import urlparse
from xmlrpclib import ServerProxy
import logging


class MagentoXmlrpcApiClient(object):
    class Session(object):
        class Resource(object):
            def __init__(self, path, session):
                object.__init__(self)
                self.__path = path
                self.__session = session

            def __call__(self, *args):
                return self.__session.call(self.__path, args)

            def __getattr__(self, attr):
                return self.__class__(
                           self.__path + '.' + attr,
                           self.__session
                       )

        def __init__(self, id, xmlrpc_proxy): #@ReservedAssignment
            object.__init__(self)
            self.__id = id
            self.__xmlrpc_proxy = xmlrpc_proxy

        def __call__(self, resource_path, *args):
            return self.call(resource_path, args)

        def call(self, resource_path, arguments):
            return self.__xmlrpc_proxy.call(
                       self.__id,
                       resource_path,
                       arguments
                   )

        def __getattr__(self, attr):
            return self.Resource(attr, self)

        def __enter__(self):
            return self

        def end(self):
            return self.__xmlrpc_proxy.endSession(self.__id)

        def __exit__(self, type, value, traceback): #@ReservedAssignment
            self.end()

        def global_faults(self):
            return self.__xmlrpc_proxy.globalFaults(self.__id)

        def multi_call(self, calls, options):
            return self.__xmlrpc_proxy.multiCall(self.__id, calls, options)

        def resources(self):
            return self.__xmlrpc_proxy.resources(self.__id)

        def resource_faults(self, resource_name):
            return self.__xmlrpc_proxy.resourceFaults(self.__id)

    def __init__(self, api_url):
        object.__init__(self)
        api_url_parsed = urlparse(api_url)
        if api_url_parsed.path.endswith("/xmlrpc/"):
            xmlrpc_api_url = api_url
        else:
            xmlrpc_api_url = \
                api_url_parsed.scheme + '://' + api_url_parsed.netloc + \
                api_url_parsed.path.rstrip('/') + '/xmlrpc/' + \
                (len(api_url_parsed.query) > 0 and ('?' + api_url_parsed.query) or '')
        self.__xmlrpc_api_url = xmlrpc_api_url
        self.__xmlrpc_api_url_parsed = urlparse(xmlrpc_api_url)

    def login(self, api_user=None, api_key=None):
        if api_user is None:
            if self.__xmlrpc_api_url_parsed.username is not None:
                api_user = self.__xmlrpc_api_url_parsed.username
            else:
                raise ValueError('missing api_user')

        if api_key is None:
            if self.__xmlrpc_api_url_parsed.password is not None:
                api_key = self.__xmlrpc_api_url_parsed.password
            else:
                raise ValueError('missing api_key')

        xmlrpc_proxy = \
            ServerProxy(
                self.__xmlrpc_api_url,
                allow_none=True,
                verbose=logging.getLevelName(logging.getLogger().getEffectiveLevel()) == 'DEBUG'
            )

        session_id = xmlrpc_proxy.login(api_user, api_key)

        return self.Session(session_id, xmlrpc_proxy)
