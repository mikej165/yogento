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

class YogentoClient(object):
    def __init__(self, api_url, headers=None):
        object.__init__(self)

        services = []
        for service_prefix in ('catalog', 'image', 'mail', 'user_settings'):
            service_infix = 'jsonrpc_' + service_prefix
            service_module_qname = "yogento.client.services.%(service_prefix)s.impl.yogento_%(service_infix)s_service" % locals()
            service_module = __import__(service_module_qname)
            for module_name in service_module_qname.split('.')[1:]:
                service_module = getattr(service_module, module_name)
            service_class_name = 'Yogento' + ''.join([x.capitalize() for x in service_infix.split('_')]) + 'Service'
            service_class = getattr(service_module, service_class_name)
            service = service_class(api_url=api_url, headers=headers)
            services.append(service)
        self.__services = services

    def __getattr__(self, attr):
        for service in self.__services:
            try:
                return getattr(service, attr)
            except AttributeError:
                pass
        raise AttributeError, attr
