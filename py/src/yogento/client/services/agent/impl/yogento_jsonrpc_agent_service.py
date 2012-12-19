from itertools import ifilterfalse
import __builtin__
import thryft.protocol.json_protocol
import yogento.api.models.catalog.product.magento.magento_product
import yogento.api.services.agent.agent_service
import yogento.client.services._yogento_jsonrpc_service


class YogentoJsonrpcAgentService(yogento.client.services._yogento_jsonrpc_service._YogentoJsonrpcService, yogento.api.services.agent.agent_service.AgentService):
    def __init__(self, api_url, headers=None):
        api_url = api_url.rstrip('/')
        if not api_url.endswith('/jsonrpc/agent'):
            api_url += '/jsonrpc/agent'
        yogento.client.services._yogento_jsonrpc_service._YogentoJsonrpcService.__init__(self, api_url=api_url, headers=headers)

    def _get_agent_magento_products(self, **kwds):
        return_value = self._request('get_agent_magento_products', **kwds)
        iprot = thryft.protocol.json_protocol.JsonProtocol(return_value)
        return frozenset([yogento.api.models.catalog.product.magento.magento_product.MagentoProduct.read(iprot) for _ in xrange(iprot.readSetBegin()[1])] + (iprot.readSetEnd() is None and []))

    def _head_magento_store(self, **kwds):
        return self._request('head_magento_store', **kwds)

    def _put_agent_magento_products(self, **kwds):
        self._request('put_agent_magento_products', **kwds)

