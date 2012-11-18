from itertools import ifilterfalse
import __builtin__
import thryft.protocol.json_protocol
import yogento.api.models.sales.order.order
import yogento.api.services.sales.sales_service
import yogento.client.services._yogento_jsonrpc_service


class YogentoJsonrpcSalesService(yogento.client.services._yogento_jsonrpc_service._YogentoJsonrpcService, yogento.api.services.sales.sales_service.SalesService):
    def __init__(self, api_url, headers=None):
        api_url = api_url.rstrip('/')
        if not api_url.endswith('/jsonrpc/sales'):
            api_url += '/jsonrpc/sales'
        yogento.client.services._yogento_jsonrpc_service._YogentoJsonrpcService.__init__(self, api_url=api_url, headers=headers)

    def _delete_order_by_increment_id(self, **kwds):
        return self._request('delete_order_by_increment_id', **kwds)

    def _get_order_increment_ids(self, **kwds):
        return_value = self._request('get_order_increment_ids', **kwds)
        iprot = thryft.protocol.json_protocol.JsonProtocol(return_value)
        return frozenset([iprot.readString() for _ in xrange(iprot.readSetBegin()[1])] + (iprot.readSetEnd() is None and []))

    def _get_order_by_increment_id(self, **kwds):
        return_value = self._request('get_order_by_increment_id', **kwds)
        iprot = thryft.protocol.json_protocol.JsonProtocol(return_value)
        return yogento.api.models.sales.order.order.Order.read(iprot)

    def _head_order_by_increment_id(self, **kwds):
        return self._request('head_order_by_increment_id', **kwds)

    def _put_order(self, **kwds):
        self._request('put_order', **kwds)

    def _put_orders(self, **kwds):
        self._request('put_orders', **kwds)

