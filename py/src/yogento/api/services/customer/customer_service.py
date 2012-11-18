from itertools import ifilterfalse
import __builtin__
import yogento.api.models.customer.customer


class CustomerService(object):
    def delete_customer_by_increment_id(self, increment_id):
        if increment_id is None:
            raise ValueError('increment_id is required')
        if not isinstance(increment_id, basestring):
            raise TypeError(getattr(__builtin__, 'type')(increment_id))

        delete_customer_by_increment_id_return_value = self._delete_customer_by_increment_id(increment_id=increment_id)

        if not isinstance(delete_customer_by_increment_id_return_value, bool):
            raise TypeError(getattr(__builtin__, 'type')(delete_customer_by_increment_id_return_value))

        return delete_customer_by_increment_id_return_value

    def _delete_customer_by_increment_id(self, increment_id):
        raise NotImplementedError(self.__class__.__module__ + '.' + self.__class__.__name__ + '._delete_customer_by_increment_id')

    def get_customer_by_increment_id(self, increment_id):
        if increment_id is None:
            raise ValueError('increment_id is required')
        if not isinstance(increment_id, basestring):
            raise TypeError(getattr(__builtin__, 'type')(increment_id))

        get_customer_by_increment_id_return_value = self._get_customer_by_increment_id(increment_id=increment_id)

        if not isinstance(get_customer_by_increment_id_return_value, yogento.api.models.customer.customer.Customer):
            raise TypeError(getattr(__builtin__, 'type')(get_customer_by_increment_id_return_value))

        return get_customer_by_increment_id_return_value

    def _get_customer_by_increment_id(self, increment_id):
        raise NotImplementedError(self.__class__.__module__ + '.' + self.__class__.__name__ + '._get_customer_by_increment_id')

    def get_customer_increment_ids(self):
        get_customer_increment_ids_return_value = self._get_customer_increment_ids()

        if not (isinstance(get_customer_increment_ids_return_value, frozenset) and len(list(ifilterfalse(lambda _: isinstance(_, basestring), get_customer_increment_ids_return_value))) == 0):
            raise TypeError(getattr(__builtin__, 'type')(get_customer_increment_ids_return_value))

        return get_customer_increment_ids_return_value

    def _get_customer_increment_ids(self):
        raise NotImplementedError(self.__class__.__module__ + '.' + self.__class__.__name__ + '._get_customer_increment_ids')

    def get_customers(self):
        get_customers_return_value = self._get_customers()

        if not (isinstance(get_customers_return_value, frozenset) and len(list(ifilterfalse(lambda _: isinstance(_, yogento.api.models.customer.customer.Customer), get_customers_return_value))) == 0):
            raise TypeError(getattr(__builtin__, 'type')(get_customers_return_value))

        return get_customers_return_value

    def _get_customers(self):
        raise NotImplementedError(self.__class__.__module__ + '.' + self.__class__.__name__ + '._get_customers')

    def head_customer_by_increment_id(self, increment_id):
        if increment_id is None:
            raise ValueError('increment_id is required')
        if not isinstance(increment_id, basestring):
            raise TypeError(getattr(__builtin__, 'type')(increment_id))

        head_customer_by_increment_id_return_value = self._head_customer_by_increment_id(increment_id=increment_id)

        if not isinstance(head_customer_by_increment_id_return_value, bool):
            raise TypeError(getattr(__builtin__, 'type')(head_customer_by_increment_id_return_value))

        return head_customer_by_increment_id_return_value

    def _head_customer_by_increment_id(self, increment_id):
        raise NotImplementedError(self.__class__.__module__ + '.' + self.__class__.__name__ + '._head_customer_by_increment_id')

    def put_customer(self, customer):
        if customer is None:
            raise ValueError('customer is required')
        if not isinstance(customer, yogento.api.models.customer.customer.Customer):
            raise TypeError(getattr(__builtin__, 'type')(customer))

        self._put_customer(customer=customer)

    def _put_customer(self, customer):
        raise NotImplementedError(self.__class__.__module__ + '.' + self.__class__.__name__ + '._put_customer')

    def put_customers(self, customers):
        if customers is None:
            raise ValueError('customers is required')
        if not (isinstance(customers, frozenset) and len(list(ifilterfalse(lambda _: isinstance(_, yogento.api.models.customer.customer.Customer), customers))) == 0):
            raise TypeError(getattr(__builtin__, 'type')(customers))

        self._put_customers(customers=customers)

    def _put_customers(self, customers):
        raise NotImplementedError(self.__class__.__module__ + '.' + self.__class__.__name__ + '._put_customers')
