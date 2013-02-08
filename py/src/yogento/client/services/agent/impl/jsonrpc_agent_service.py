from itertools import ifilterfalse
import __builtin__
import thryft.core.protocol.json_protocol
import thryft.web.service._jsonrpc_web_service
import yogento.api.models.catalog.product.magento.magento_product
import yogento.api.services.agent.agent_service


class JsonrpcAgentService(thryft.web.service._jsonrpc_web_service._JsonrpcWebService, yogento.api.services.agent.agent_service.AgentService):
    def __init__(self, api_url, headers=None):
        api_url = api_url.rstrip('/')
        if not api_url.endswith('/jsonrpc/agent'):
            api_url += '/jsonrpc/agent'
        thryft.web.service._jsonrpc_web_service._JsonrpcWebService.__init__(self, api_url=api_url, headers=headers)

    def _get_agent_magento_products(self, **kwds):
        return_value = self._request('get_agent_magento_products', **kwds)
        iprot = thryft.core.protocol.json_protocol.JsonProtocol(return_value)
        return frozenset([yogento.api.models.catalog.product.magento.magento_product.MagentoProduct.read(iprot) for _ in xrange(iprot.readSetBegin()[1])] + (iprot.readSetEnd() is None and []))

    def _head_magento_store(self, **kwds):
        return self._request('head_magento_store', **kwds)

    def _put_agent_magento_products(self, **kwds):
        self._request('put_agent_magento_products', **kwds)

