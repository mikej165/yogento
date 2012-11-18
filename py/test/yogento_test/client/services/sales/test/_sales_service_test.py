from hamcrest.core import assert_that
from hamcrest.core.core.isinstanceof import instance_of
from hamcrest.library.number.ordering_comparison import greater_than
from hamcrest.library.object.haslength import has_length
from yogento.api.models.sales.order.order import Order
import unittest


class _SalesServiceTest(unittest.TestCase):
    def __init__(self, *args, **kwds):
        unittest.TestCase.__init__(self, *args, **kwds)
        self.__sales_service = None

    def _setUp(self, sales_service):
        self.__sales_service = sales_service

    def test_get_order_by_increment_id(self):
        if self.__sales_service is None:
            return

        order_increment_ids = self.__sales_service.get_order_increment_ids()
        assert_that(order_increment_ids, has_length(greater_than(0)))
        for order_increment_id in order_increment_ids:
            order = \
                self.__sales_service.get_order_by_increment_id(
                    order_increment_id
                )
            assert_that(order, instance_of(Order))

    def test_get_order_increment_ids(self):
        if self.__sales_service is None:
            return

        order_increment_ids = self.__sales_service.get_order_increment_ids()
        assert_that(order_increment_ids, has_length(greater_than(0)))
        for order_increment_id in order_increment_ids:
            assert_that(order_increment_id, instance_of(basestring))

    def test_head_order_by_increment_id(self):
        if self.__sales_service is None:
            return

        order_increment_ids = self.__sales_service.get_order_increment_ids()
        assert_that(order_increment_ids, has_length(greater_than(0)))
        for order_increment_id in order_increment_ids:
            head = self.__sales_service.head_order_by_increment_id(order_increment_id)
            assert_that(head, instance_of(bool))
            self.assertTrue(head)
        self.assertFalse(self.__sales_service.head_order_by_increment_id('nonextantincrement_id'))
