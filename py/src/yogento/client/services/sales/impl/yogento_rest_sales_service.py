from yogento.api.models.sales.order.order import Order
from yogento.api.services.sales.sales_service import SalesService
from yogento.client.services._yogento_rest_service import _YogentoRestService


class YogentoRestSalesService(_YogentoRestService, SalesService):
    def _delete_order_by_increment_id(self, increment_id):
        return self._delete_model('/orders/' + increment_id)

    def _get_order_by_increment_id(self, increment_id):
        return self._get_model(Order, '/orders/' + increment_id)

    def _get_order_increment_ids(self):
        return self._get_string_set('/orders/increment_ids')

    def _head_order_by_increment_id(self, increment_id):
        return self._head_model('/orders/' + increment_id)

    def _put_order(self, order):
        return self._put_model(order, '/orders/' + order.increment_id)

    def _put_orders(self, orders):
        return self._put_model_set(orders, '/orders')
