from yogento.client.magento_xmlrpc_api_client import MagentoXmlrpcApiClient


class _MagentoXmlrpcService(object):
    def __init__(self, api_url):
        self.__magento_xmlrpc_api_client = MagentoXmlrpcApiClient(api_url)

    @property
    def _magento_xmlrpc_api_client(self):
        return self.__magento_xmlrpc_api_client
