from itertools import ifilterfalse
import __builtin__
import yogento.api.models.sales.order.order


class SalesService(object):
    def delete_order_by_increment_id(self, increment_id):
        if increment_id is None:
            raise ValueError('increment_id is required')
        if not isinstance(increment_id, basestring):
            raise TypeError(getattr(__builtin__, 'type')(increment_id))

        delete_order_by_increment_id_return_value = self._delete_order_by_increment_id(increment_id=increment_id)

        if not isinstance(delete_order_by_increment_id_return_value, bool):
            raise TypeError(getattr(__builtin__, 'type')(delete_order_by_increment_id_return_value))

        return delete_order_by_increment_id_return_value

    def _delete_order_by_increment_id(self, increment_id):
        raise NotImplementedError(self.__class__.__module__ + '.' + self.__class__.__name__ + '._delete_order_by_increment_id')

    def get_order_increment_ids(self):
        get_order_increment_ids_return_value = self._get_order_increment_ids()

        if not (isinstance(get_order_increment_ids_return_value, frozenset) and len(list(ifilterfalse(lambda _: isinstance(_, basestring), get_order_increment_ids_return_value))) == 0):
            raise TypeError(getattr(__builtin__, 'type')(get_order_increment_ids_return_value))

        return get_order_increment_ids_return_value

    def _get_order_increment_ids(self):
        raise NotImplementedError(self.__class__.__module__ + '.' + self.__class__.__name__ + '._get_order_increment_ids')

    def get_order_by_increment_id(self, increment_id):
        if increment_id is None:
            raise ValueError('increment_id is required')
        if not isinstance(increment_id, basestring):
            raise TypeError(getattr(__builtin__, 'type')(increment_id))

        get_order_by_increment_id_return_value = self._get_order_by_increment_id(increment_id=increment_id)

        if not isinstance(get_order_by_increment_id_return_value, yogento.api.models.sales.order.order.Order):
            raise TypeError(getattr(__builtin__, 'type')(get_order_by_increment_id_return_value))

        return get_order_by_increment_id_return_value

    def _get_order_by_increment_id(self, increment_id):
        raise NotImplementedError(self.__class__.__module__ + '.' + self.__class__.__name__ + '._get_order_by_increment_id')

    def head_order_by_increment_id(self, increment_id):
        if increment_id is None:
            raise ValueError('increment_id is required')
        if not isinstance(increment_id, basestring):
            raise TypeError(getattr(__builtin__, 'type')(increment_id))

        head_order_by_increment_id_return_value = self._head_order_by_increment_id(increment_id=increment_id)

        if not isinstance(head_order_by_increment_id_return_value, bool):
            raise TypeError(getattr(__builtin__, 'type')(head_order_by_increment_id_return_value))

        return head_order_by_increment_id_return_value

    def _head_order_by_increment_id(self, increment_id):
        raise NotImplementedError(self.__class__.__module__ + '.' + self.__class__.__name__ + '._head_order_by_increment_id')

    def put_order(self, order):
        if order is None:
            raise ValueError('order is required')
        if not isinstance(order, yogento.api.models.sales.order.order.Order):
            raise TypeError(getattr(__builtin__, 'type')(order))

        self._put_order(order=order)

    def _put_order(self, order):
        raise NotImplementedError(self.__class__.__module__ + '.' + self.__class__.__name__ + '._put_order')

    def put_orders(self, orders):
        if orders is None:
            raise ValueError('orders is required')
        if not (isinstance(orders, frozenset) and len(list(ifilterfalse(lambda _: isinstance(_, yogento.api.models.sales.order.order.Order), orders))) == 0):
            raise TypeError(getattr(__builtin__, 'type')(orders))

        self._put_orders(orders=orders)

    def _put_orders(self, orders):
        raise NotImplementedError(self.__class__.__module__ + '.' + self.__class__.__name__ + '._put_orders')
