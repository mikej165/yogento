from itertools import ifilterfalse
import __builtin__
import thryft.protocol.json_protocol
import thryft.protocol.string_map_protocol
import urllib
import urllib2
import yogento.api.models.customer.customer
import yogento.api.services.customer.customer_service
import yogento.client.services._yogento_rest_service


class YogentoRestCustomerService(yogento.client.services._yogento_rest_service._YogentoRestService, yogento.api.services.customer.customer_service.CustomerService):
    def __init__(self, api_url, headers=None):
        api_url = api_url.rstrip('/')
        if not api_url.endswith('/rest/'):
            api_url += '/rest/'
        yogento.client.services._yogento_rest_service._YogentoRestService.__init__(self, api_url=api_url, headers=headers)

    def _delete_customer_by_increment_id(self, increment_id):
        try:
            self._request('DELETE', '/customer/' + urllib.quote(increment_id, safe=''), data=None, query=None)
            return True
        except urllib2.HTTPError, e:
            if e.code == 404:
                return False
            else:
                raise

    def _get_customer_by_increment_id(self, increment_id):
        __return_value = self._request('GET', '/customer/' + urllib.quote(increment_id, safe=''), data=None, query=None)
        iprot = thryft.protocol.json_protocol.JsonProtocol(__return_value)
        return yogento.api.models.customer.customer.Customer.read(iprot)

    def _get_customer_increment_ids(self):
        __return_value = self._request('GET', '/customer/increment/ids', data=None, query=None)
        iprot = thryft.protocol.json_protocol.JsonProtocol(__return_value)
        return frozenset([iprot.readString() for _ in xrange(iprot.readSetBegin()[1])] + (iprot.readSetEnd() is None and []))

    def _get_customers(self):
        __return_value = self._request('GET', '/customers', data=None, query=None)
        iprot = thryft.protocol.json_protocol.JsonProtocol(__return_value)
        return frozenset([yogento.api.models.customer.customer.Customer.read(iprot) for _ in xrange(iprot.readSetBegin()[1])] + (iprot.readSetEnd() is None and []))

    def _head_customer_by_increment_id(self, increment_id):
        try:
            self._request('HEAD', '/customer/' + urllib.quote(increment_id, safe=''), data=None, query=None)
            return True
        except urllib2.HTTPError, e:
            if e.code == 404:
                return False
            else:
                raise

    def _put_customer(self, **kwds):
        self._request('PUT', '/customer', data=str(thryft.protocol.json_protocol.JsonProtocol().writeMixed(dict((key, value) for key, value in kwds.iteritems() if value is not None))), query=None)

    def _put_customers(self, **kwds):
        self._request('PUT', '/customers', data=str(thryft.protocol.json_protocol.JsonProtocol().writeMixed(dict((key, value) for key, value in kwds.iteritems() if value is not None))), query=None)

