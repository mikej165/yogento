from itertools import ifilterfalse
import __builtin__
import thryft.core.protocol.json_protocol
import thryft.core.protocol.string_map_protocol
import thryft.web.service._rest_web_service
import urllib
import urllib2
import yogento.api.models.catalog.product.magento.magento_product
import yogento.api.services.agent.agent_service


class RestAgentService(thryft.web.service._rest_web_service._RestWebService, yogento.api.services.agent.agent_service.AgentService):
    def __init__(self, api_url, headers=None):
        api_url = api_url.rstrip('/')
        if not api_url.endswith('/rest/'):
            api_url += '/rest/'
        thryft.web.service._rest_web_service._RestWebService.__init__(self, api_url=api_url, headers=headers)

    def _get_agent_magento_products(self, **kwds):
        __return_value = self._request('GET', '/agent/magento_products', data=None, query=thryft.core.protocol.string_map_protocol.StringMapProtocol().writeMixed(dict((key, value) for key, value in kwds.iteritems() if value is not None)).to_string_map())
        iprot = thryft.core.protocol.json_protocol.JsonProtocol(__return_value)
        return frozenset([yogento.api.models.catalog.product.magento.magento_product.MagentoProduct.read(iprot) for _ in xrange(iprot.readSetBegin()[1])] + (iprot.readSetEnd() is None and []))

    def _head_magento_store(self, magento_store_url):
        try:
            self._request('HEAD', '/agent/magento_store' + urllib.quote(magento_store_url, safe=''), data=None, query=None)
            return True
        except urllib2.HTTPError, e:
            if e.code == 404:
                return False
            else:
                raise

    def _put_agent_magento_products(self, **kwds):
        self._request('PUT', '/agent/magento_products', data=str(thryft.core.protocol.json_protocol.JsonProtocol().writeMixed(dict((key, value) for key, value in kwds.iteritems() if value is not None))), query=None)

