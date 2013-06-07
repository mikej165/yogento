from itertools import ifilterfalse
import __builtin__
import yogento.api.models.catalog.product.magento.magento_product


class AgentService(object):
    def get_agent_magento_products(self, sync=None):
        if sync is not None:
            if not isinstance(sync, bool):
                raise TypeError(getattr(__builtin__, 'type')(sync))

        get_agent_magento_products_return_value = self._get_agent_magento_products(sync=sync)

        if not (isinstance(get_agent_magento_products_return_value, frozenset) and len(list(ifilterfalse(lambda _: isinstance(_, yogento.api.models.catalog.product.magento.magento_product.MagentoProduct), get_agent_magento_products_return_value))) == 0):
            raise TypeError(getattr(__builtin__, 'type')(get_agent_magento_products_return_value))

        return get_agent_magento_products_return_value

    def _get_agent_magento_products(self, sync=None):
        raise NotImplementedError(self.__class__.__module__ + '.' + self.__class__.__name__ + '._get_agent_magento_products')

    def head_magento_store(self, magento_store_url):
        if magento_store_url is None:
            raise ValueError('magento_store_url is required')
        if not isinstance(magento_store_url, str):
            raise TypeError(getattr(__builtin__, 'type')(magento_store_url))

        head_magento_store_return_value = self._head_magento_store(magento_store_url=magento_store_url)

        if not isinstance(head_magento_store_return_value, bool):
            raise TypeError(getattr(__builtin__, 'type')(head_magento_store_return_value))

        return head_magento_store_return_value

    def _head_magento_store(self, magento_store_url):
        raise NotImplementedError(self.__class__.__module__ + '.' + self.__class__.__name__ + '._head_magento_store')

    def put_agent_magento_products(self, magento_products_json, ticket, username):
        if magento_products_json is None:
            raise ValueError('magento_products_json is required')
        if not isinstance(magento_products_json, basestring):
            raise TypeError(getattr(__builtin__, 'type')(magento_products_json))
        if ticket is None:
            raise ValueError('ticket is required')
        if not isinstance(ticket, basestring):
            raise TypeError(getattr(__builtin__, 'type')(ticket))
        if username is None:
            raise ValueError('username is required')
        if not isinstance(username, basestring):
            raise TypeError(getattr(__builtin__, 'type')(username))

        self._put_agent_magento_products(magento_products_json=magento_products_json, ticket=ticket, username=username)

    def _put_agent_magento_products(self, magento_products_json, ticket, username):
        raise NotImplementedError(self.__class__.__module__ + '.' + self.__class__.__name__ + '._put_agent_magento_products')
