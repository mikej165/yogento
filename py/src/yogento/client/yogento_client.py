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
