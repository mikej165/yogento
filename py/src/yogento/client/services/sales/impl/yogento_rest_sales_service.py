from itertools import ifilterfalse
import __builtin__
import thryft.protocol.json_protocol
import thryft.protocol.string_map_protocol
import urllib
import urllib2
import yogento.api.models.sales.order.order
import yogento.api.services.sales.sales_service
import yogento.client.services._yogento_rest_service


class YogentoRestSalesService(yogento.client.services._yogento_rest_service._YogentoRestService, yogento.api.services.sales.sales_service.SalesService):
    def __init__(self, api_url, headers=None):
        api_url = api_url.rstrip('/')
        if not api_url.endswith('/rest/'):
            api_url += '/rest/'
        yogento.client.services._yogento_rest_service._YogentoRestService.__init__(self, api_url=api_url, headers=headers)

    def _delete_order_by_increment_id(self, increment_id):
        try:
            self._request('DELETE', '/sales/order/' + urllib.quote(increment_id, safe=''), data=None, query=None)
            return True
        except urllib2.HTTPError, e:
            if e.code == 404:
                return False
            else:
                raise

    def _get_order_increment_ids(self):
        __return_value = self._request('GET', '/sales/order/increment/ids', data=None, query=None)
        iprot = thryft.protocol.json_protocol.JsonProtocol(__return_value)
        return frozenset([iprot.readString() for _ in xrange(iprot.readSetBegin()[1])] + (iprot.readSetEnd() is None and []))

    def _get_order_by_increment_id(self, increment_id):
        __return_value = self._request('GET', '/sales/order/' + urllib.quote(increment_id, safe=''), data=None, query=None)
        iprot = thryft.protocol.json_protocol.JsonProtocol(__return_value)
        return yogento.api.models.sales.order.order.Order.read(iprot)

    def _head_order_by_increment_id(self, increment_id):
        try:
            self._request('HEAD', '/sales/order/' + urllib.quote(increment_id, safe=''), data=None, query=None)
            return True
        except urllib2.HTTPError, e:
            if e.code == 404:
                return False
            else:
                raise

    def _put_order(self, **kwds):
        self._request('PUT', '/sales/order', data=str(thryft.protocol.json_protocol.JsonProtocol().writeMixed(dict((key, value) for key, value in kwds.iteritems() if value is not None))), query=None)

    def _put_orders(self, **kwds):
        self._request('PUT', '/sales/orders', data=str(thryft.protocol.json_protocol.JsonProtocol().writeMixed(dict((key, value) for key, value in kwds.iteritems() if value is not None))), query=None)

