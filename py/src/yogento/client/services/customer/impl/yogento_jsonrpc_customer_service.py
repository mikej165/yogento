from itertools import ifilterfalse
import __builtin__
import thryft.protocol.json_protocol
import yogento.api.models.customer.customer
import yogento.api.services.customer.customer_service
import yogento.client.services._yogento_jsonrpc_service


class YogentoJsonrpcCustomerService(yogento.client.services._yogento_jsonrpc_service._YogentoJsonrpcService, yogento.api.services.customer.customer_service.CustomerService):
    def __init__(self, api_url, headers=None):
        api_url = api_url.rstrip('/')
        if not api_url.endswith('/jsonrpc/customer'):
            api_url += '/jsonrpc/customer'
        yogento.client.services._yogento_jsonrpc_service._YogentoJsonrpcService.__init__(self, api_url=api_url, headers=headers)

    def _delete_customer_by_increment_id(self, **kwds):
        return self._request('delete_customer_by_increment_id', **kwds)

    def _get_customer_by_increment_id(self, **kwds):
        return_value = self._request('get_customer_by_increment_id', **kwds)
        iprot = thryft.protocol.json_protocol.JsonProtocol(return_value)
        return yogento.api.models.customer.customer.Customer.read(iprot)

    def _get_customer_increment_ids(self, **kwds):
        return_value = self._request('get_customer_increment_ids', **kwds)
        iprot = thryft.protocol.json_protocol.JsonProtocol(return_value)
        return frozenset([iprot.readString() for _ in xrange(iprot.readSetBegin()[1])] + (iprot.readSetEnd() is None and []))

    def _get_customers(self, **kwds):
        return_value = self._request('get_customers', **kwds)
        iprot = thryft.protocol.json_protocol.JsonProtocol(return_value)
        return frozenset([yogento.api.models.customer.customer.Customer.read(iprot) for _ in xrange(iprot.readSetBegin()[1])] + (iprot.readSetEnd() is None and []))

    def _head_customer_by_increment_id(self, **kwds):
        return self._request('head_customer_by_increment_id', **kwds)

    def _put_customer(self, **kwds):
        self._request('put_customer', **kwds)

    def _put_customers(self, **kwds):
        self._request('put_customers', **kwds)

