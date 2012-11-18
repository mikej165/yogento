from xmlrpclib import Fault
from yogento.api.models.sales.order.magento.magento_order import MagentoOrder
from yogento.api.models.sales.order.magento.magento_order_address import \
    MagentoOrderAddress
from yogento.api.models.sales.order.order import Order
from yogento.api.services.sales.no_such_order_exception import \
    NoSuchOrderException
from yogento.api.services.sales.sales_service import SalesService
from yogento.client.protocols.magento_xmlrpc_protocol import \
    MagentoXmlrpcProtocol
from yogento.client.services._magento_xmlrpc_service import \
    _MagentoXmlrpcService
from yogento.client.utils import class_qname


class MagentoXmlrpcSalesService(_MagentoXmlrpcService, SalesService):
    def _delete_order_by_increment_id(self, increment_id):
        raise NotImplementedError(class_qname(self))

    def _get_order_by_increment_id(self, increment_id):
        with self._magento_xmlrpc_api_client.login() as magento_api:
            try:
                order_dict = magento_api.order.info(increment_id)
            except Fault, fault:
                if fault.faultCode == 101:
                    raise NoSuchOrderException
                else:
                    raise

#            for key in sorted(order_dict.iterkeys()):
#                value = order_dict[key]
#                if not isinstance(value, (dict, list)):
#                    continue
#                print key + ':'
#                if isinstance(value, dict):
#                    for subkey in sorted(value.iterkeys()):
#                        subvalue = value[subkey]
#                        print 'optional string', subkey + '; //', subvalue
#                else:
#                    for subvalue in value:
#                        for subsubkey in sorted(subvalue.iterkeys()):
#                            subsubvalue = subvalue[subsubkey]
#                            print 'optional string', subsubkey + '; //', subsubvalue
#                        break
#                print

            order = Order(MagentoOrder.read(MagentoXmlrpcProtocol(order_dict)))

            return order

    def _get_order_increment_ids(self):
        with self._magento_xmlrpc_api_client.login() as magento_api:
            order_stub_dicts = magento_api.order.list()
            return tuple([order_stub_dict['increment_id']
                          for order_stub_dict in order_stub_dicts])

    def _head_order_by_increment_id(self, increment_id):
        try:
            self._get_order_by_increment_id(increment_id)
            return True
        except NoSuchOrderException:
            return False

    def _put_order(self, order):
        magento_order = order.magento_order

        if len(magento_order.items) == 0:
            raise ValueError('magento_order must contain at least one item')

        with self._magento_xmlrpc_api_client.login() as magento_api:
            quote_id = magento_api.cart.create()

            customer = {
                'email': magento_order.customer_email is not None and \
                    magento_order.customer_email or \
                    'john.doe@example.com',
                'firstname': magento_order.customer_firstname is not None and\
                    magento_order.customer_firstname or \
                    'John',
                'group_id': magento_order.customer_group_id is not None and \
                    magento_order.customer_group_id or \
                    '0',
                'lastname': magento_order.customer_lastname is not None and\
                    magento_order.customer_lastname or \
                    'Doe',
                'mode': 'guest',
            }
            magento_api.cart_customer.set(quote_id, customer)

            address_dicts = []
            for address in (magento_order.billing_address, magento_order.shipping_address):
                assert isinstance(address, MagentoOrderAddress)
                address_dicts.append({
                    'city': address.city,
                    'country_id': address.country_id,
                    'firstname': address.firstname,
                    'lastname': address.lastname,
                    'mode': address is magento_order.billing_address and \
                        'billing' or \
                        'shipping',
                    'postcode': address.postcode,
                    'region': address.region,
                    'street': address.street,
                    'telephone': address.telephone
                })
            magento_api.cart_customer.addresses(quote_id, address_dicts)

            magento_api.cart_payment.method(
                quote_id,
                {
                    'method': 'free'
                }
            )

            item_dicts = []
            for item in magento_order.items:
                item_dicts.append({
                    'quantity': str(item.qty_ordered),
                    'sku': item.sku,
                })
            magento_api.cart_product.add(quote_id, item_dicts)

            if magento_order.shipping_method is not None:
                shipping_method = magento_order.shipping_method
            else:
                shipping_methods = magento_api.cart_shipping.list(quote_id)
                shipping_methods = shipping_methods[0]['code']
            magento_api.cart_shipping.method(quote_id, shipping_method)

            order_increment_id = magento_api.cart.magento_order(quote_id)

            return order_increment_id
