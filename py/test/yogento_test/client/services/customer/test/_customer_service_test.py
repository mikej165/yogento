from hamcrest.core import assert_that
from hamcrest.core.core.isinstanceof import instance_of
from hamcrest.library.number.ordering_comparison import greater_than
from hamcrest.library.object.haslength import has_length
from yogento.api.models.customer.customer import Customer
import unittest


# pylint: disable=C0111
class _CustomerServiceTest(unittest.TestCase):
    def __init__(self, *args, **kwds):
        unittest.TestCase.__init__(self, *args, **kwds)
        self.__customer_service = None

    def _setUp(self, customer_service):
        self.__customer_service = customer_service

    def test_get_customer_by_increment_id(self):
        if self.__customer_service is None:
            return

        customer_increment_ids = self.__customer_service.get_customer_increment_ids()
        assert_that(customer_increment_ids, has_length(greater_than(0)))
        for customer_increment_id in customer_increment_ids:
            customer = self.__customer_service.get_customer_by_increment_id(customer_increment_id)
            assert_that(customer, instance_of(Customer))
            assert_that(customer.addresses, has_length(greater_than(0)))

    def test_get_customer_increment_ids(self):
        if self.__customer_service is None:
            return

        customer_increment_ids = self.__customer_service.get_customer_increment_ids()
        assert_that(customer_increment_ids, has_length(greater_than(0)))
        for customer_increment_id in customer_increment_ids:
            assert_that(customer_increment_id, instance_of(basestring))

    def test_get_customers(self):
        if self.__customer_service is None:
            return

        customers = self.__customer_service.get_customers()
        assert_that(customers, has_length(greater_than(0)))
        for customer in customers:
            assert_that(customer, instance_of(Customer))
            assert_that(customer.addresses, has_length(greater_than(0)))

    def test_head_customer_by_increment_id(self):
        if self.__customer_service is None:
            return

        customer_increment_ids = self.__customer_service.get_customer_increment_ids()
        assert_that(customer_increment_ids, has_length(greater_than(0)))
        for customer_increment_id in customer_increment_ids:
            head = self.__customer_service.head_customer_by_increment_id(customer_increment_id)
            assert_that(head, instance_of(bool))
            self.assertTrue(head)
        self.assertFalse(self.__customer_service.head_customer_by_increment_id('nonextantincrement_id'))
