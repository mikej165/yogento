from __future__ import absolute_import; import decimal
from datetime import datetime
from itertools import ifilterfalse
from time import mktime
import __builtin__
import yogento.api.models.sales.order.magento.magento_order_address
import yogento.api.models.sales.order.magento.magento_order_item
import yogento.api.models.sales.order.magento.magento_order_status
import yogento.api.models.sales.order.magento.magento_order_status_history


class MagentoOrder(object):
    class Builder:
        def __init__(
            self,
            created_at,
            grand_total,
            increment_id,
            is_virtual,
            order_currency_code,
            updated_at,
            adjustment_negative=None,
            adjustment_positive=None,
            base_adjustment_negative=None,
            base_adjustment_positive=None,
            base_currency_code=None,
            base_custbalance_amount=None,
            base_discount_amount=None,
            base_discount_canceled=None,
            base_discount_invoiced=None,
            base_discount_refunded=None,
            base_grand_total=None,
            base_hidden_tax_amount=None,
            base_hidden_tax_invoiced=None,
            base_hidden_tax_refunded=None,
            base_shipping_amount=None,
            base_shipping_canceled=None,
            base_shipping_discount_amount=None,
            base_shipping_hidden_tax_amnt=None,
            base_shipping_hidden_tax_amount=None,
            base_shipping_incl_tax=None,
            base_shipping_invoiced=None,
            base_shipping_refunded=None,
            base_shipping_tax_amount=None,
            base_shipping_tax_refunded=None,
            base_subtotal=None,
            base_subtotal_canceled=None,
            base_subtotal_incl_tax=None,
            base_subtotal_invoiced=None,
            base_subtotal_refunded=None,
            base_tax_amount=None,
            base_tax_canceled=None,
            base_tax_invoiced=None,
            base_tax_refunded=None,
            base_to_global_rate=None,
            base_to_order_rate=None,
            base_total_canceled=None,
            base_total_due=None,
            base_total_invoiced=None,
            base_total_invoiced_cost=None,
            base_total_offline_refunded=None,
            base_total_online_refunded=None,
            base_total_paid=None,
            base_total_qty_ordered=None,
            base_total_refunded=None,
            billing_address=None,
            billing_address_id=None,
            can_ship_partially=None,
            can_ship_partially_item=None,
            coupon_code=None,
            coupon_rule_name=None,
            currency_code=None,
            currency_rate=None,
            custbalance_amount=None,
            customer_dob=None,
            customer_email=None,
            customer_firstname=None,
            customer_gender=None,
            customer_group_id=None,
            customer_id=None,
            customer_is_guest=None,
            customer_lastname=None,
            customer_middlename=None,
            customer_note=None,
            customer_note_notify=None,
            customer_prefix=None,
            customer_suffix=None,
            customer_taxvat=None,
            discount_amount=None,
            discount_canceled=None,
            discount_description=None,
            discount_invoiced=None,
            discount_refunded=None,
            edit_increment=None,
            email_sent=None,
            forced_do_shipment_with_invoice=None,
            forced_shipment_with_invoice=None,
            gift_message_id=None,
            global_currency_code=None,
            hidden_tax_amount=None,
            hidden_tax_invoiced=None,
            hidden_tax_refunded=None,
            is_hold=None,
            is_multi_payment=None,
            items=None,
            order_id=None,
            original_increment_id=None,
            quote_id=None,
            relation_child_id=None,
            relation_child_real_id=None,
            relation_parent_id=None,
            relation_parent_real_id=None,
            remote_ip=None,
            shipping_address=None,
            shipping_address_id=None,
            shipping_amount=None,
            shipping_canceled=None,
            shipping_description=None,
            shipping_discount_amount=None,
            shipping_hidden_tax_amount=None,
            shipping_incl_tax=None,
            shipping_invoiced=None,
            shipping_method=None,
            shipping_refunded=None,
            shipping_tax_amount=None,
            shipping_tax_refunded=None,
            state=None,
            status=None,
            status_history=None,
            store_currency_code=None,
            store_id=None,
            store_name=None,
            store_to_base_rate=None,
            store_to_order_rate=None,
            subtotal=None,
            subtotal_canceled=None,
            subtotal_incl_tax=None,
            subtotal_invoiced=None,
            subtotal_refunded=None,
            tax_amount=None,
            tax_canceled=None,
            tax_invoiced=None,
            tax_percent=None,
            tax_refunded=None,
            total_canceled=None,
            total_due=None,
            total_invoiced=None,
            total_item_count=None,
            total_offline_refunded=None,
            total_online_refunded=None,
            total_paid=None,
            total_qty_ordered=None,
            total_refunded=None,
            tracking_numbers=None,
            weight=None,
            x_forwarded_for=None
        ):
            self.__adjustment_negative = adjustment_negative
            self.__adjustment_positive = adjustment_positive
            self.__base_adjustment_negative = base_adjustment_negative
            self.__base_adjustment_positive = base_adjustment_positive
            self.__base_currency_code = base_currency_code
            self.__base_custbalance_amount = base_custbalance_amount
            self.__base_discount_amount = base_discount_amount
            self.__base_discount_canceled = base_discount_canceled
            self.__base_discount_invoiced = base_discount_invoiced
            self.__base_discount_refunded = base_discount_refunded
            self.__base_grand_total = base_grand_total
            self.__base_hidden_tax_amount = base_hidden_tax_amount
            self.__base_hidden_tax_invoiced = base_hidden_tax_invoiced
            self.__base_hidden_tax_refunded = base_hidden_tax_refunded
            self.__base_shipping_amount = base_shipping_amount
            self.__base_shipping_canceled = base_shipping_canceled
            self.__base_shipping_discount_amount = base_shipping_discount_amount
            self.__base_shipping_hidden_tax_amnt = base_shipping_hidden_tax_amnt
            self.__base_shipping_hidden_tax_amount = base_shipping_hidden_tax_amount
            self.__base_shipping_incl_tax = base_shipping_incl_tax
            self.__base_shipping_invoiced = base_shipping_invoiced
            self.__base_shipping_refunded = base_shipping_refunded
            self.__base_shipping_tax_amount = base_shipping_tax_amount
            self.__base_shipping_tax_refunded = base_shipping_tax_refunded
            self.__base_subtotal = base_subtotal
            self.__base_subtotal_canceled = base_subtotal_canceled
            self.__base_subtotal_incl_tax = base_subtotal_incl_tax
            self.__base_subtotal_invoiced = base_subtotal_invoiced
            self.__base_subtotal_refunded = base_subtotal_refunded
            self.__base_tax_amount = base_tax_amount
            self.__base_tax_canceled = base_tax_canceled
            self.__base_tax_invoiced = base_tax_invoiced
            self.__base_tax_refunded = base_tax_refunded
            self.__base_to_global_rate = base_to_global_rate
            self.__base_to_order_rate = base_to_order_rate
            self.__base_total_canceled = base_total_canceled
            self.__base_total_due = base_total_due
            self.__base_total_invoiced = base_total_invoiced
            self.__base_total_invoiced_cost = base_total_invoiced_cost
            self.__base_total_offline_refunded = base_total_offline_refunded
            self.__base_total_online_refunded = base_total_online_refunded
            self.__base_total_paid = base_total_paid
            self.__base_total_qty_ordered = base_total_qty_ordered
            self.__base_total_refunded = base_total_refunded
            self.__billing_address = billing_address
            self.__billing_address_id = billing_address_id
            self.__can_ship_partially = can_ship_partially
            self.__can_ship_partially_item = can_ship_partially_item
            self.__coupon_code = coupon_code
            self.__coupon_rule_name = coupon_rule_name
            self.__created_at = created_at
            self.__currency_code = currency_code
            self.__currency_rate = currency_rate
            self.__custbalance_amount = custbalance_amount
            self.__customer_dob = customer_dob
            self.__customer_email = customer_email
            self.__customer_firstname = customer_firstname
            self.__customer_gender = customer_gender
            self.__customer_group_id = customer_group_id
            self.__customer_id = customer_id
            self.__customer_is_guest = customer_is_guest
            self.__customer_lastname = customer_lastname
            self.__customer_middlename = customer_middlename
            self.__customer_note = customer_note
            self.__customer_note_notify = customer_note_notify
            self.__customer_prefix = customer_prefix
            self.__customer_suffix = customer_suffix
            self.__customer_taxvat = customer_taxvat
            self.__discount_amount = discount_amount
            self.__discount_canceled = discount_canceled
            self.__discount_description = discount_description
            self.__discount_invoiced = discount_invoiced
            self.__discount_refunded = discount_refunded
            self.__edit_increment = edit_increment
            self.__email_sent = email_sent
            self.__forced_do_shipment_with_invoice = forced_do_shipment_with_invoice
            self.__forced_shipment_with_invoice = forced_shipment_with_invoice
            self.__gift_message_id = gift_message_id
            self.__global_currency_code = global_currency_code
            self.__grand_total = grand_total
            self.__hidden_tax_amount = hidden_tax_amount
            self.__hidden_tax_invoiced = hidden_tax_invoiced
            self.__hidden_tax_refunded = hidden_tax_refunded
            self.__increment_id = increment_id
            self.__is_hold = is_hold
            self.__is_multi_payment = is_multi_payment
            self.__is_virtual = is_virtual
            self.__items = items
            self.__order_currency_code = order_currency_code
            self.__order_id = order_id
            self.__original_increment_id = original_increment_id
            self.__quote_id = quote_id
            self.__relation_child_id = relation_child_id
            self.__relation_child_real_id = relation_child_real_id
            self.__relation_parent_id = relation_parent_id
            self.__relation_parent_real_id = relation_parent_real_id
            self.__remote_ip = remote_ip
            self.__shipping_address = shipping_address
            self.__shipping_address_id = shipping_address_id
            self.__shipping_amount = shipping_amount
            self.__shipping_canceled = shipping_canceled
            self.__shipping_description = shipping_description
            self.__shipping_discount_amount = shipping_discount_amount
            self.__shipping_hidden_tax_amount = shipping_hidden_tax_amount
            self.__shipping_incl_tax = shipping_incl_tax
            self.__shipping_invoiced = shipping_invoiced
            self.__shipping_method = shipping_method
            self.__shipping_refunded = shipping_refunded
            self.__shipping_tax_amount = shipping_tax_amount
            self.__shipping_tax_refunded = shipping_tax_refunded
            self.__state = state
            self.__status = status
            self.__status_history = status_history
            self.__store_currency_code = store_currency_code
            self.__store_id = store_id
            self.__store_name = store_name
            self.__store_to_base_rate = store_to_base_rate
            self.__store_to_order_rate = store_to_order_rate
            self.__subtotal = subtotal
            self.__subtotal_canceled = subtotal_canceled
            self.__subtotal_incl_tax = subtotal_incl_tax
            self.__subtotal_invoiced = subtotal_invoiced
            self.__subtotal_refunded = subtotal_refunded
            self.__tax_amount = tax_amount
            self.__tax_canceled = tax_canceled
            self.__tax_invoiced = tax_invoiced
            self.__tax_percent = tax_percent
            self.__tax_refunded = tax_refunded
            self.__total_canceled = total_canceled
            self.__total_due = total_due
            self.__total_invoiced = total_invoiced
            self.__total_item_count = total_item_count
            self.__total_offline_refunded = total_offline_refunded
            self.__total_online_refunded = total_online_refunded
            self.__total_paid = total_paid
            self.__total_qty_ordered = total_qty_ordered
            self.__total_refunded = total_refunded
            self.__tracking_numbers = tracking_numbers
            self.__updated_at = updated_at
            self.__weight = weight
            self.__x_forwarded_for = x_forwarded_for

        def build(self):
            return MagentoOrder(adjustment_negative=self.__adjustment_negative, adjustment_positive=self.__adjustment_positive, base_adjustment_negative=self.__base_adjustment_negative, base_adjustment_positive=self.__base_adjustment_positive, base_currency_code=self.__base_currency_code, base_custbalance_amount=self.__base_custbalance_amount, base_discount_amount=self.__base_discount_amount, base_discount_canceled=self.__base_discount_canceled, base_discount_invoiced=self.__base_discount_invoiced, base_discount_refunded=self.__base_discount_refunded, base_grand_total=self.__base_grand_total, base_hidden_tax_amount=self.__base_hidden_tax_amount, base_hidden_tax_invoiced=self.__base_hidden_tax_invoiced, base_hidden_tax_refunded=self.__base_hidden_tax_refunded, base_shipping_amount=self.__base_shipping_amount, base_shipping_canceled=self.__base_shipping_canceled, base_shipping_discount_amount=self.__base_shipping_discount_amount, base_shipping_hidden_tax_amnt=self.__base_shipping_hidden_tax_amnt, base_shipping_hidden_tax_amount=self.__base_shipping_hidden_tax_amount, base_shipping_incl_tax=self.__base_shipping_incl_tax, base_shipping_invoiced=self.__base_shipping_invoiced, base_shipping_refunded=self.__base_shipping_refunded, base_shipping_tax_amount=self.__base_shipping_tax_amount, base_shipping_tax_refunded=self.__base_shipping_tax_refunded, base_subtotal=self.__base_subtotal, base_subtotal_canceled=self.__base_subtotal_canceled, base_subtotal_incl_tax=self.__base_subtotal_incl_tax, base_subtotal_invoiced=self.__base_subtotal_invoiced, base_subtotal_refunded=self.__base_subtotal_refunded, base_tax_amount=self.__base_tax_amount, base_tax_canceled=self.__base_tax_canceled, base_tax_invoiced=self.__base_tax_invoiced, base_tax_refunded=self.__base_tax_refunded, base_to_global_rate=self.__base_to_global_rate, base_to_order_rate=self.__base_to_order_rate, base_total_canceled=self.__base_total_canceled, base_total_due=self.__base_total_due, base_total_invoiced=self.__base_total_invoiced, base_total_invoiced_cost=self.__base_total_invoiced_cost, base_total_offline_refunded=self.__base_total_offline_refunded, base_total_online_refunded=self.__base_total_online_refunded, base_total_paid=self.__base_total_paid, base_total_qty_ordered=self.__base_total_qty_ordered, base_total_refunded=self.__base_total_refunded, billing_address=self.__billing_address, billing_address_id=self.__billing_address_id, can_ship_partially=self.__can_ship_partially, can_ship_partially_item=self.__can_ship_partially_item, coupon_code=self.__coupon_code, coupon_rule_name=self.__coupon_rule_name, created_at=self.__created_at, currency_code=self.__currency_code, currency_rate=self.__currency_rate, custbalance_amount=self.__custbalance_amount, customer_dob=self.__customer_dob, customer_email=self.__customer_email, customer_firstname=self.__customer_firstname, customer_gender=self.__customer_gender, customer_group_id=self.__customer_group_id, customer_id=self.__customer_id, customer_is_guest=self.__customer_is_guest, customer_lastname=self.__customer_lastname, customer_middlename=self.__customer_middlename, customer_note=self.__customer_note, customer_note_notify=self.__customer_note_notify, customer_prefix=self.__customer_prefix, customer_suffix=self.__customer_suffix, customer_taxvat=self.__customer_taxvat, discount_amount=self.__discount_amount, discount_canceled=self.__discount_canceled, discount_description=self.__discount_description, discount_invoiced=self.__discount_invoiced, discount_refunded=self.__discount_refunded, edit_increment=self.__edit_increment, email_sent=self.__email_sent, forced_do_shipment_with_invoice=self.__forced_do_shipment_with_invoice, forced_shipment_with_invoice=self.__forced_shipment_with_invoice, gift_message_id=self.__gift_message_id, global_currency_code=self.__global_currency_code, grand_total=self.__grand_total, hidden_tax_amount=self.__hidden_tax_amount, hidden_tax_invoiced=self.__hidden_tax_invoiced, hidden_tax_refunded=self.__hidden_tax_refunded, increment_id=self.__increment_id, is_hold=self.__is_hold, is_multi_payment=self.__is_multi_payment, is_virtual=self.__is_virtual, items=self.__items, order_currency_code=self.__order_currency_code, order_id=self.__order_id, original_increment_id=self.__original_increment_id, quote_id=self.__quote_id, relation_child_id=self.__relation_child_id, relation_child_real_id=self.__relation_child_real_id, relation_parent_id=self.__relation_parent_id, relation_parent_real_id=self.__relation_parent_real_id, remote_ip=self.__remote_ip, shipping_address=self.__shipping_address, shipping_address_id=self.__shipping_address_id, shipping_amount=self.__shipping_amount, shipping_canceled=self.__shipping_canceled, shipping_description=self.__shipping_description, shipping_discount_amount=self.__shipping_discount_amount, shipping_hidden_tax_amount=self.__shipping_hidden_tax_amount, shipping_incl_tax=self.__shipping_incl_tax, shipping_invoiced=self.__shipping_invoiced, shipping_method=self.__shipping_method, shipping_refunded=self.__shipping_refunded, shipping_tax_amount=self.__shipping_tax_amount, shipping_tax_refunded=self.__shipping_tax_refunded, state=self.__state, status=self.__status, status_history=self.__status_history, store_currency_code=self.__store_currency_code, store_id=self.__store_id, store_name=self.__store_name, store_to_base_rate=self.__store_to_base_rate, store_to_order_rate=self.__store_to_order_rate, subtotal=self.__subtotal, subtotal_canceled=self.__subtotal_canceled, subtotal_incl_tax=self.__subtotal_incl_tax, subtotal_invoiced=self.__subtotal_invoiced, subtotal_refunded=self.__subtotal_refunded, tax_amount=self.__tax_amount, tax_canceled=self.__tax_canceled, tax_invoiced=self.__tax_invoiced, tax_percent=self.__tax_percent, tax_refunded=self.__tax_refunded, total_canceled=self.__total_canceled, total_due=self.__total_due, total_invoiced=self.__total_invoiced, total_item_count=self.__total_item_count, total_offline_refunded=self.__total_offline_refunded, total_online_refunded=self.__total_online_refunded, total_paid=self.__total_paid, total_qty_ordered=self.__total_qty_ordered, total_refunded=self.__total_refunded, tracking_numbers=self.__tracking_numbers, updated_at=self.__updated_at, weight=self.__weight, x_forwarded_for=self.__x_forwarded_for)

        def set_adjustment_negative(self, adjustment_negative):
            self.__adjustment_negative = adjustment_negative
            return self

        def set_adjustment_positive(self, adjustment_positive):
            self.__adjustment_positive = adjustment_positive
            return self

        def set_base_adjustment_negative(self, base_adjustment_negative):
            self.__base_adjustment_negative = base_adjustment_negative
            return self

        def set_base_adjustment_positive(self, base_adjustment_positive):
            self.__base_adjustment_positive = base_adjustment_positive
            return self

        def set_base_currency_code(self, base_currency_code):
            self.__base_currency_code = base_currency_code
            return self

        def set_base_custbalance_amount(self, base_custbalance_amount):
            self.__base_custbalance_amount = base_custbalance_amount
            return self

        def set_base_discount_amount(self, base_discount_amount):
            self.__base_discount_amount = base_discount_amount
            return self

        def set_base_discount_canceled(self, base_discount_canceled):
            self.__base_discount_canceled = base_discount_canceled
            return self

        def set_base_discount_invoiced(self, base_discount_invoiced):
            self.__base_discount_invoiced = base_discount_invoiced
            return self

        def set_base_discount_refunded(self, base_discount_refunded):
            self.__base_discount_refunded = base_discount_refunded
            return self

        def set_base_grand_total(self, base_grand_total):
            self.__base_grand_total = base_grand_total
            return self

        def set_base_hidden_tax_amount(self, base_hidden_tax_amount):
            self.__base_hidden_tax_amount = base_hidden_tax_amount
            return self

        def set_base_hidden_tax_invoiced(self, base_hidden_tax_invoiced):
            self.__base_hidden_tax_invoiced = base_hidden_tax_invoiced
            return self

        def set_base_hidden_tax_refunded(self, base_hidden_tax_refunded):
            self.__base_hidden_tax_refunded = base_hidden_tax_refunded
            return self

        def set_base_shipping_amount(self, base_shipping_amount):
            self.__base_shipping_amount = base_shipping_amount
            return self

        def set_base_shipping_canceled(self, base_shipping_canceled):
            self.__base_shipping_canceled = base_shipping_canceled
            return self

        def set_base_shipping_discount_amount(self, base_shipping_discount_amount):
            self.__base_shipping_discount_amount = base_shipping_discount_amount
            return self

        def set_base_shipping_hidden_tax_amnt(self, base_shipping_hidden_tax_amnt):
            self.__base_shipping_hidden_tax_amnt = base_shipping_hidden_tax_amnt
            return self

        def set_base_shipping_hidden_tax_amount(self, base_shipping_hidden_tax_amount):
            self.__base_shipping_hidden_tax_amount = base_shipping_hidden_tax_amount
            return self

        def set_base_shipping_incl_tax(self, base_shipping_incl_tax):
            self.__base_shipping_incl_tax = base_shipping_incl_tax
            return self

        def set_base_shipping_invoiced(self, base_shipping_invoiced):
            self.__base_shipping_invoiced = base_shipping_invoiced
            return self

        def set_base_shipping_refunded(self, base_shipping_refunded):
            self.__base_shipping_refunded = base_shipping_refunded
            return self

        def set_base_shipping_tax_amount(self, base_shipping_tax_amount):
            self.__base_shipping_tax_amount = base_shipping_tax_amount
            return self

        def set_base_shipping_tax_refunded(self, base_shipping_tax_refunded):
            self.__base_shipping_tax_refunded = base_shipping_tax_refunded
            return self

        def set_base_subtotal(self, base_subtotal):
            self.__base_subtotal = base_subtotal
            return self

        def set_base_subtotal_canceled(self, base_subtotal_canceled):
            self.__base_subtotal_canceled = base_subtotal_canceled
            return self

        def set_base_subtotal_incl_tax(self, base_subtotal_incl_tax):
            self.__base_subtotal_incl_tax = base_subtotal_incl_tax
            return self

        def set_base_subtotal_invoiced(self, base_subtotal_invoiced):
            self.__base_subtotal_invoiced = base_subtotal_invoiced
            return self

        def set_base_subtotal_refunded(self, base_subtotal_refunded):
            self.__base_subtotal_refunded = base_subtotal_refunded
            return self

        def set_base_tax_amount(self, base_tax_amount):
            self.__base_tax_amount = base_tax_amount
            return self

        def set_base_tax_canceled(self, base_tax_canceled):
            self.__base_tax_canceled = base_tax_canceled
            return self

        def set_base_tax_invoiced(self, base_tax_invoiced):
            self.__base_tax_invoiced = base_tax_invoiced
            return self

        def set_base_tax_refunded(self, base_tax_refunded):
            self.__base_tax_refunded = base_tax_refunded
            return self

        def set_base_to_global_rate(self, base_to_global_rate):
            self.__base_to_global_rate = base_to_global_rate
            return self

        def set_base_to_order_rate(self, base_to_order_rate):
            self.__base_to_order_rate = base_to_order_rate
            return self

        def set_base_total_canceled(self, base_total_canceled):
            self.__base_total_canceled = base_total_canceled
            return self

        def set_base_total_due(self, base_total_due):
            self.__base_total_due = base_total_due
            return self

        def set_base_total_invoiced(self, base_total_invoiced):
            self.__base_total_invoiced = base_total_invoiced
            return self

        def set_base_total_invoiced_cost(self, base_total_invoiced_cost):
            self.__base_total_invoiced_cost = base_total_invoiced_cost
            return self

        def set_base_total_offline_refunded(self, base_total_offline_refunded):
            self.__base_total_offline_refunded = base_total_offline_refunded
            return self

        def set_base_total_online_refunded(self, base_total_online_refunded):
            self.__base_total_online_refunded = base_total_online_refunded
            return self

        def set_base_total_paid(self, base_total_paid):
            self.__base_total_paid = base_total_paid
            return self

        def set_base_total_qty_ordered(self, base_total_qty_ordered):
            self.__base_total_qty_ordered = base_total_qty_ordered
            return self

        def set_base_total_refunded(self, base_total_refunded):
            self.__base_total_refunded = base_total_refunded
            return self

        def set_billing_address(self, billing_address):
            self.__billing_address = billing_address
            return self

        def set_billing_address_id(self, billing_address_id):
            self.__billing_address_id = billing_address_id
            return self

        def set_can_ship_partially(self, can_ship_partially):
            self.__can_ship_partially = can_ship_partially
            return self

        def set_can_ship_partially_item(self, can_ship_partially_item):
            self.__can_ship_partially_item = can_ship_partially_item
            return self

        def set_coupon_code(self, coupon_code):
            self.__coupon_code = coupon_code
            return self

        def set_coupon_rule_name(self, coupon_rule_name):
            self.__coupon_rule_name = coupon_rule_name
            return self

        def set_created_at(self, created_at):
            self.__created_at = created_at
            return self

        def set_currency_code(self, currency_code):
            self.__currency_code = currency_code
            return self

        def set_currency_rate(self, currency_rate):
            self.__currency_rate = currency_rate
            return self

        def set_custbalance_amount(self, custbalance_amount):
            self.__custbalance_amount = custbalance_amount
            return self

        def set_customer_dob(self, customer_dob):
            self.__customer_dob = customer_dob
            return self

        def set_customer_email(self, customer_email):
            self.__customer_email = customer_email
            return self

        def set_customer_firstname(self, customer_firstname):
            self.__customer_firstname = customer_firstname
            return self

        def set_customer_gender(self, customer_gender):
            self.__customer_gender = customer_gender
            return self

        def set_customer_group_id(self, customer_group_id):
            self.__customer_group_id = customer_group_id
            return self

        def set_customer_id(self, customer_id):
            self.__customer_id = customer_id
            return self

        def set_customer_is_guest(self, customer_is_guest):
            self.__customer_is_guest = customer_is_guest
            return self

        def set_customer_lastname(self, customer_lastname):
            self.__customer_lastname = customer_lastname
            return self

        def set_customer_middlename(self, customer_middlename):
            self.__customer_middlename = customer_middlename
            return self

        def set_customer_note(self, customer_note):
            self.__customer_note = customer_note
            return self

        def set_customer_note_notify(self, customer_note_notify):
            self.__customer_note_notify = customer_note_notify
            return self

        def set_customer_prefix(self, customer_prefix):
            self.__customer_prefix = customer_prefix
            return self

        def set_customer_suffix(self, customer_suffix):
            self.__customer_suffix = customer_suffix
            return self

        def set_customer_taxvat(self, customer_taxvat):
            self.__customer_taxvat = customer_taxvat
            return self

        def set_discount_amount(self, discount_amount):
            self.__discount_amount = discount_amount
            return self

        def set_discount_canceled(self, discount_canceled):
            self.__discount_canceled = discount_canceled
            return self

        def set_discount_description(self, discount_description):
            self.__discount_description = discount_description
            return self

        def set_discount_invoiced(self, discount_invoiced):
            self.__discount_invoiced = discount_invoiced
            return self

        def set_discount_refunded(self, discount_refunded):
            self.__discount_refunded = discount_refunded
            return self

        def set_edit_increment(self, edit_increment):
            self.__edit_increment = edit_increment
            return self

        def set_email_sent(self, email_sent):
            self.__email_sent = email_sent
            return self

        def set_forced_do_shipment_with_invoice(self, forced_do_shipment_with_invoice):
            self.__forced_do_shipment_with_invoice = forced_do_shipment_with_invoice
            return self

        def set_forced_shipment_with_invoice(self, forced_shipment_with_invoice):
            self.__forced_shipment_with_invoice = forced_shipment_with_invoice
            return self

        def set_gift_message_id(self, gift_message_id):
            self.__gift_message_id = gift_message_id
            return self

        def set_global_currency_code(self, global_currency_code):
            self.__global_currency_code = global_currency_code
            return self

        def set_grand_total(self, grand_total):
            self.__grand_total = grand_total
            return self

        def set_hidden_tax_amount(self, hidden_tax_amount):
            self.__hidden_tax_amount = hidden_tax_amount
            return self

        def set_hidden_tax_invoiced(self, hidden_tax_invoiced):
            self.__hidden_tax_invoiced = hidden_tax_invoiced
            return self

        def set_hidden_tax_refunded(self, hidden_tax_refunded):
            self.__hidden_tax_refunded = hidden_tax_refunded
            return self

        def set_increment_id(self, increment_id):
            self.__increment_id = increment_id
            return self

        def set_is_hold(self, is_hold):
            self.__is_hold = is_hold
            return self

        def set_is_multi_payment(self, is_multi_payment):
            self.__is_multi_payment = is_multi_payment
            return self

        def set_is_virtual(self, is_virtual):
            self.__is_virtual = is_virtual
            return self

        def set_items(self, items):
            self.__items = items
            return self

        def set_order_currency_code(self, order_currency_code):
            self.__order_currency_code = order_currency_code
            return self

        def set_order_id(self, order_id):
            self.__order_id = order_id
            return self

        def set_original_increment_id(self, original_increment_id):
            self.__original_increment_id = original_increment_id
            return self

        def set_quote_id(self, quote_id):
            self.__quote_id = quote_id
            return self

        def set_relation_child_id(self, relation_child_id):
            self.__relation_child_id = relation_child_id
            return self

        def set_relation_child_real_id(self, relation_child_real_id):
            self.__relation_child_real_id = relation_child_real_id
            return self

        def set_relation_parent_id(self, relation_parent_id):
            self.__relation_parent_id = relation_parent_id
            return self

        def set_relation_parent_real_id(self, relation_parent_real_id):
            self.__relation_parent_real_id = relation_parent_real_id
            return self

        def set_remote_ip(self, remote_ip):
            self.__remote_ip = remote_ip
            return self

        def set_shipping_address(self, shipping_address):
            self.__shipping_address = shipping_address
            return self

        def set_shipping_address_id(self, shipping_address_id):
            self.__shipping_address_id = shipping_address_id
            return self

        def set_shipping_amount(self, shipping_amount):
            self.__shipping_amount = shipping_amount
            return self

        def set_shipping_canceled(self, shipping_canceled):
            self.__shipping_canceled = shipping_canceled
            return self

        def set_shipping_description(self, shipping_description):
            self.__shipping_description = shipping_description
            return self

        def set_shipping_discount_amount(self, shipping_discount_amount):
            self.__shipping_discount_amount = shipping_discount_amount
            return self

        def set_shipping_hidden_tax_amount(self, shipping_hidden_tax_amount):
            self.__shipping_hidden_tax_amount = shipping_hidden_tax_amount
            return self

        def set_shipping_incl_tax(self, shipping_incl_tax):
            self.__shipping_incl_tax = shipping_incl_tax
            return self

        def set_shipping_invoiced(self, shipping_invoiced):
            self.__shipping_invoiced = shipping_invoiced
            return self

        def set_shipping_method(self, shipping_method):
            self.__shipping_method = shipping_method
            return self

        def set_shipping_refunded(self, shipping_refunded):
            self.__shipping_refunded = shipping_refunded
            return self

        def set_shipping_tax_amount(self, shipping_tax_amount):
            self.__shipping_tax_amount = shipping_tax_amount
            return self

        def set_shipping_tax_refunded(self, shipping_tax_refunded):
            self.__shipping_tax_refunded = shipping_tax_refunded
            return self

        def set_state(self, state):
            self.__state = state
            return self

        def set_status(self, status):
            self.__status = status
            return self

        def set_status_history(self, status_history):
            self.__status_history = status_history
            return self

        def set_store_currency_code(self, store_currency_code):
            self.__store_currency_code = store_currency_code
            return self

        def set_store_id(self, store_id):
            self.__store_id = store_id
            return self

        def set_store_name(self, store_name):
            self.__store_name = store_name
            return self

        def set_store_to_base_rate(self, store_to_base_rate):
            self.__store_to_base_rate = store_to_base_rate
            return self

        def set_store_to_order_rate(self, store_to_order_rate):
            self.__store_to_order_rate = store_to_order_rate
            return self

        def set_subtotal(self, subtotal):
            self.__subtotal = subtotal
            return self

        def set_subtotal_canceled(self, subtotal_canceled):
            self.__subtotal_canceled = subtotal_canceled
            return self

        def set_subtotal_incl_tax(self, subtotal_incl_tax):
            self.__subtotal_incl_tax = subtotal_incl_tax
            return self

        def set_subtotal_invoiced(self, subtotal_invoiced):
            self.__subtotal_invoiced = subtotal_invoiced
            return self

        def set_subtotal_refunded(self, subtotal_refunded):
            self.__subtotal_refunded = subtotal_refunded
            return self

        def set_tax_amount(self, tax_amount):
            self.__tax_amount = tax_amount
            return self

        def set_tax_canceled(self, tax_canceled):
            self.__tax_canceled = tax_canceled
            return self

        def set_tax_invoiced(self, tax_invoiced):
            self.__tax_invoiced = tax_invoiced
            return self

        def set_tax_percent(self, tax_percent):
            self.__tax_percent = tax_percent
            return self

        def set_tax_refunded(self, tax_refunded):
            self.__tax_refunded = tax_refunded
            return self

        def set_total_canceled(self, total_canceled):
            self.__total_canceled = total_canceled
            return self

        def set_total_due(self, total_due):
            self.__total_due = total_due
            return self

        def set_total_invoiced(self, total_invoiced):
            self.__total_invoiced = total_invoiced
            return self

        def set_total_item_count(self, total_item_count):
            self.__total_item_count = total_item_count
            return self

        def set_total_offline_refunded(self, total_offline_refunded):
            self.__total_offline_refunded = total_offline_refunded
            return self

        def set_total_online_refunded(self, total_online_refunded):
            self.__total_online_refunded = total_online_refunded
            return self

        def set_total_paid(self, total_paid):
            self.__total_paid = total_paid
            return self

        def set_total_qty_ordered(self, total_qty_ordered):
            self.__total_qty_ordered = total_qty_ordered
            return self

        def set_total_refunded(self, total_refunded):
            self.__total_refunded = total_refunded
            return self

        def set_tracking_numbers(self, tracking_numbers):
            self.__tracking_numbers = tracking_numbers
            return self

        def set_updated_at(self, updated_at):
            self.__updated_at = updated_at
            return self

        def set_weight(self, weight):
            self.__weight = weight
            return self

        def set_x_forwarded_for(self, x_forwarded_for):
            self.__x_forwarded_for = x_forwarded_for
            return self

        def update(self, magento_order):
            if isinstance(magento_order, MagentoOrder):
                self.set_adjustment_negative(magento_order.adjustment_negative)
                self.set_adjustment_positive(magento_order.adjustment_positive)
                self.set_base_adjustment_negative(magento_order.base_adjustment_negative)
                self.set_base_adjustment_positive(magento_order.base_adjustment_positive)
                self.set_base_currency_code(magento_order.base_currency_code)
                self.set_base_custbalance_amount(magento_order.base_custbalance_amount)
                self.set_base_discount_amount(magento_order.base_discount_amount)
                self.set_base_discount_canceled(magento_order.base_discount_canceled)
                self.set_base_discount_invoiced(magento_order.base_discount_invoiced)
                self.set_base_discount_refunded(magento_order.base_discount_refunded)
                self.set_base_grand_total(magento_order.base_grand_total)
                self.set_base_hidden_tax_amount(magento_order.base_hidden_tax_amount)
                self.set_base_hidden_tax_invoiced(magento_order.base_hidden_tax_invoiced)
                self.set_base_hidden_tax_refunded(magento_order.base_hidden_tax_refunded)
                self.set_base_shipping_amount(magento_order.base_shipping_amount)
                self.set_base_shipping_canceled(magento_order.base_shipping_canceled)
                self.set_base_shipping_discount_amount(magento_order.base_shipping_discount_amount)
                self.set_base_shipping_hidden_tax_amnt(magento_order.base_shipping_hidden_tax_amnt)
                self.set_base_shipping_hidden_tax_amount(magento_order.base_shipping_hidden_tax_amount)
                self.set_base_shipping_incl_tax(magento_order.base_shipping_incl_tax)
                self.set_base_shipping_invoiced(magento_order.base_shipping_invoiced)
                self.set_base_shipping_refunded(magento_order.base_shipping_refunded)
                self.set_base_shipping_tax_amount(magento_order.base_shipping_tax_amount)
                self.set_base_shipping_tax_refunded(magento_order.base_shipping_tax_refunded)
                self.set_base_subtotal(magento_order.base_subtotal)
                self.set_base_subtotal_canceled(magento_order.base_subtotal_canceled)
                self.set_base_subtotal_incl_tax(magento_order.base_subtotal_incl_tax)
                self.set_base_subtotal_invoiced(magento_order.base_subtotal_invoiced)
                self.set_base_subtotal_refunded(magento_order.base_subtotal_refunded)
                self.set_base_tax_amount(magento_order.base_tax_amount)
                self.set_base_tax_canceled(magento_order.base_tax_canceled)
                self.set_base_tax_invoiced(magento_order.base_tax_invoiced)
                self.set_base_tax_refunded(magento_order.base_tax_refunded)
                self.set_base_to_global_rate(magento_order.base_to_global_rate)
                self.set_base_to_order_rate(magento_order.base_to_order_rate)
                self.set_base_total_canceled(magento_order.base_total_canceled)
                self.set_base_total_due(magento_order.base_total_due)
                self.set_base_total_invoiced(magento_order.base_total_invoiced)
                self.set_base_total_invoiced_cost(magento_order.base_total_invoiced_cost)
                self.set_base_total_offline_refunded(magento_order.base_total_offline_refunded)
                self.set_base_total_online_refunded(magento_order.base_total_online_refunded)
                self.set_base_total_paid(magento_order.base_total_paid)
                self.set_base_total_qty_ordered(magento_order.base_total_qty_ordered)
                self.set_base_total_refunded(magento_order.base_total_refunded)
                self.set_billing_address(magento_order.billing_address)
                self.set_billing_address_id(magento_order.billing_address_id)
                self.set_can_ship_partially(magento_order.can_ship_partially)
                self.set_can_ship_partially_item(magento_order.can_ship_partially_item)
                self.set_coupon_code(magento_order.coupon_code)
                self.set_coupon_rule_name(magento_order.coupon_rule_name)
                self.set_created_at(magento_order.created_at)
                self.set_currency_code(magento_order.currency_code)
                self.set_currency_rate(magento_order.currency_rate)
                self.set_custbalance_amount(magento_order.custbalance_amount)
                self.set_customer_dob(magento_order.customer_dob)
                self.set_customer_email(magento_order.customer_email)
                self.set_customer_firstname(magento_order.customer_firstname)
                self.set_customer_gender(magento_order.customer_gender)
                self.set_customer_group_id(magento_order.customer_group_id)
                self.set_customer_id(magento_order.customer_id)
                self.set_customer_is_guest(magento_order.customer_is_guest)
                self.set_customer_lastname(magento_order.customer_lastname)
                self.set_customer_middlename(magento_order.customer_middlename)
                self.set_customer_note(magento_order.customer_note)
                self.set_customer_note_notify(magento_order.customer_note_notify)
                self.set_customer_prefix(magento_order.customer_prefix)
                self.set_customer_suffix(magento_order.customer_suffix)
                self.set_customer_taxvat(magento_order.customer_taxvat)
                self.set_discount_amount(magento_order.discount_amount)
                self.set_discount_canceled(magento_order.discount_canceled)
                self.set_discount_description(magento_order.discount_description)
                self.set_discount_invoiced(magento_order.discount_invoiced)
                self.set_discount_refunded(magento_order.discount_refunded)
                self.set_edit_increment(magento_order.edit_increment)
                self.set_email_sent(magento_order.email_sent)
                self.set_forced_do_shipment_with_invoice(magento_order.forced_do_shipment_with_invoice)
                self.set_forced_shipment_with_invoice(magento_order.forced_shipment_with_invoice)
                self.set_gift_message_id(magento_order.gift_message_id)
                self.set_global_currency_code(magento_order.global_currency_code)
                self.set_grand_total(magento_order.grand_total)
                self.set_hidden_tax_amount(magento_order.hidden_tax_amount)
                self.set_hidden_tax_invoiced(magento_order.hidden_tax_invoiced)
                self.set_hidden_tax_refunded(magento_order.hidden_tax_refunded)
                self.set_increment_id(magento_order.increment_id)
                self.set_is_hold(magento_order.is_hold)
                self.set_is_multi_payment(magento_order.is_multi_payment)
                self.set_is_virtual(magento_order.is_virtual)
                self.set_items(magento_order.items)
                self.set_order_currency_code(magento_order.order_currency_code)
                self.set_order_id(magento_order.order_id)
                self.set_original_increment_id(magento_order.original_increment_id)
                self.set_quote_id(magento_order.quote_id)
                self.set_relation_child_id(magento_order.relation_child_id)
                self.set_relation_child_real_id(magento_order.relation_child_real_id)
                self.set_relation_parent_id(magento_order.relation_parent_id)
                self.set_relation_parent_real_id(magento_order.relation_parent_real_id)
                self.set_remote_ip(magento_order.remote_ip)
                self.set_shipping_address(magento_order.shipping_address)
                self.set_shipping_address_id(magento_order.shipping_address_id)
                self.set_shipping_amount(magento_order.shipping_amount)
                self.set_shipping_canceled(magento_order.shipping_canceled)
                self.set_shipping_description(magento_order.shipping_description)
                self.set_shipping_discount_amount(magento_order.shipping_discount_amount)
                self.set_shipping_hidden_tax_amount(magento_order.shipping_hidden_tax_amount)
                self.set_shipping_incl_tax(magento_order.shipping_incl_tax)
                self.set_shipping_invoiced(magento_order.shipping_invoiced)
                self.set_shipping_method(magento_order.shipping_method)
                self.set_shipping_refunded(magento_order.shipping_refunded)
                self.set_shipping_tax_amount(magento_order.shipping_tax_amount)
                self.set_shipping_tax_refunded(magento_order.shipping_tax_refunded)
                self.set_state(magento_order.state)
                self.set_status(magento_order.status)
                self.set_status_history(magento_order.status_history)
                self.set_store_currency_code(magento_order.store_currency_code)
                self.set_store_id(magento_order.store_id)
                self.set_store_name(magento_order.store_name)
                self.set_store_to_base_rate(magento_order.store_to_base_rate)
                self.set_store_to_order_rate(magento_order.store_to_order_rate)
                self.set_subtotal(magento_order.subtotal)
                self.set_subtotal_canceled(magento_order.subtotal_canceled)
                self.set_subtotal_incl_tax(magento_order.subtotal_incl_tax)
                self.set_subtotal_invoiced(magento_order.subtotal_invoiced)
                self.set_subtotal_refunded(magento_order.subtotal_refunded)
                self.set_tax_amount(magento_order.tax_amount)
                self.set_tax_canceled(magento_order.tax_canceled)
                self.set_tax_invoiced(magento_order.tax_invoiced)
                self.set_tax_percent(magento_order.tax_percent)
                self.set_tax_refunded(magento_order.tax_refunded)
                self.set_total_canceled(magento_order.total_canceled)
                self.set_total_due(magento_order.total_due)
                self.set_total_invoiced(magento_order.total_invoiced)
                self.set_total_item_count(magento_order.total_item_count)
                self.set_total_offline_refunded(magento_order.total_offline_refunded)
                self.set_total_online_refunded(magento_order.total_online_refunded)
                self.set_total_paid(magento_order.total_paid)
                self.set_total_qty_ordered(magento_order.total_qty_ordered)
                self.set_total_refunded(magento_order.total_refunded)
                self.set_tracking_numbers(magento_order.tracking_numbers)
                self.set_updated_at(magento_order.updated_at)
                self.set_weight(magento_order.weight)
                self.set_x_forwarded_for(magento_order.x_forwarded_for)
            elif isinstance(magento_order, dict):
                for key, value in magento_order.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(magento_order)
            return self

    def __init__(
        self,
        created_at,
        grand_total,
        increment_id,
        is_virtual,
        order_currency_code,
        updated_at,
        adjustment_negative=None,
        adjustment_positive=None,
        base_adjustment_negative=None,
        base_adjustment_positive=None,
        base_currency_code=None,
        base_custbalance_amount=None,
        base_discount_amount=None,
        base_discount_canceled=None,
        base_discount_invoiced=None,
        base_discount_refunded=None,
        base_grand_total=None,
        base_hidden_tax_amount=None,
        base_hidden_tax_invoiced=None,
        base_hidden_tax_refunded=None,
        base_shipping_amount=None,
        base_shipping_canceled=None,
        base_shipping_discount_amount=None,
        base_shipping_hidden_tax_amnt=None,
        base_shipping_hidden_tax_amount=None,
        base_shipping_incl_tax=None,
        base_shipping_invoiced=None,
        base_shipping_refunded=None,
        base_shipping_tax_amount=None,
        base_shipping_tax_refunded=None,
        base_subtotal=None,
        base_subtotal_canceled=None,
        base_subtotal_incl_tax=None,
        base_subtotal_invoiced=None,
        base_subtotal_refunded=None,
        base_tax_amount=None,
        base_tax_canceled=None,
        base_tax_invoiced=None,
        base_tax_refunded=None,
        base_to_global_rate=None,
        base_to_order_rate=None,
        base_total_canceled=None,
        base_total_due=None,
        base_total_invoiced=None,
        base_total_invoiced_cost=None,
        base_total_offline_refunded=None,
        base_total_online_refunded=None,
        base_total_paid=None,
        base_total_qty_ordered=None,
        base_total_refunded=None,
        billing_address=None,
        billing_address_id=None,
        can_ship_partially=None,
        can_ship_partially_item=None,
        coupon_code=None,
        coupon_rule_name=None,
        currency_code=None,
        currency_rate=None,
        custbalance_amount=None,
        customer_dob=None,
        customer_email=None,
        customer_firstname=None,
        customer_gender=None,
        customer_group_id=None,
        customer_id=None,
        customer_is_guest=None,
        customer_lastname=None,
        customer_middlename=None,
        customer_note=None,
        customer_note_notify=None,
        customer_prefix=None,
        customer_suffix=None,
        customer_taxvat=None,
        discount_amount=None,
        discount_canceled=None,
        discount_description=None,
        discount_invoiced=None,
        discount_refunded=None,
        edit_increment=None,
        email_sent=None,
        forced_do_shipment_with_invoice=None,
        forced_shipment_with_invoice=None,
        gift_message_id=None,
        global_currency_code=None,
        hidden_tax_amount=None,
        hidden_tax_invoiced=None,
        hidden_tax_refunded=None,
        is_hold=None,
        is_multi_payment=None,
        items=None,
        order_id=None,
        original_increment_id=None,
        quote_id=None,
        relation_child_id=None,
        relation_child_real_id=None,
        relation_parent_id=None,
        relation_parent_real_id=None,
        remote_ip=None,
        shipping_address=None,
        shipping_address_id=None,
        shipping_amount=None,
        shipping_canceled=None,
        shipping_description=None,
        shipping_discount_amount=None,
        shipping_hidden_tax_amount=None,
        shipping_incl_tax=None,
        shipping_invoiced=None,
        shipping_method=None,
        shipping_refunded=None,
        shipping_tax_amount=None,
        shipping_tax_refunded=None,
        state=None,
        status=None,
        status_history=None,
        store_currency_code=None,
        store_id=None,
        store_name=None,
        store_to_base_rate=None,
        store_to_order_rate=None,
        subtotal=None,
        subtotal_canceled=None,
        subtotal_incl_tax=None,
        subtotal_invoiced=None,
        subtotal_refunded=None,
        tax_amount=None,
        tax_canceled=None,
        tax_invoiced=None,
        tax_percent=None,
        tax_refunded=None,
        total_canceled=None,
        total_due=None,
        total_invoiced=None,
        total_item_count=None,
        total_offline_refunded=None,
        total_online_refunded=None,
        total_paid=None,
        total_qty_ordered=None,
        total_refunded=None,
        tracking_numbers=None,
        weight=None,
        x_forwarded_for=None
    ):
        if adjustment_negative is not None:
            if not isinstance(adjustment_negative, decimal.Decimal):
                raise TypeError(getattr(__builtin__, 'type')(adjustment_negative))
        self.__adjustment_negative = adjustment_negative

        if adjustment_positive is not None:
            if not isinstance(adjustment_positive, decimal.Decimal):
                raise TypeError(getattr(__builtin__, 'type')(adjustment_positive))
        self.__adjustment_positive = adjustment_positive

        if base_adjustment_negative is not None:
            if not isinstance(base_adjustment_negative, decimal.Decimal):
                raise TypeError(getattr(__builtin__, 'type')(base_adjustment_negative))
        self.__base_adjustment_negative = base_adjustment_negative

        if base_adjustment_positive is not None:
            if not isinstance(base_adjustment_positive, decimal.Decimal):
                raise TypeError(getattr(__builtin__, 'type')(base_adjustment_positive))
        self.__base_adjustment_positive = base_adjustment_positive

        if base_currency_code is not None:
            if not isinstance(base_currency_code, basestring):
                raise TypeError(getattr(__builtin__, 'type')(base_currency_code))
        self.__base_currency_code = base_currency_code

        if base_custbalance_amount is not None:
            if not isinstance(base_custbalance_amount, decimal.Decimal):
                raise TypeError(getattr(__builtin__, 'type')(base_custbalance_amount))
        self.__base_custbalance_amount = base_custbalance_amount

        if base_discount_amount is not None:
            if not isinstance(base_discount_amount, decimal.Decimal):
                raise TypeError(getattr(__builtin__, 'type')(base_discount_amount))
        self.__base_discount_amount = base_discount_amount

        if base_discount_canceled is not None:
            if not isinstance(base_discount_canceled, decimal.Decimal):
                raise TypeError(getattr(__builtin__, 'type')(base_discount_canceled))
        self.__base_discount_canceled = base_discount_canceled

        if base_discount_invoiced is not None:
            if not isinstance(base_discount_invoiced, decimal.Decimal):
                raise TypeError(getattr(__builtin__, 'type')(base_discount_invoiced))
        self.__base_discount_invoiced = base_discount_invoiced

        if base_discount_refunded is not None:
            if not isinstance(base_discount_refunded, decimal.Decimal):
                raise TypeError(getattr(__builtin__, 'type')(base_discount_refunded))
        self.__base_discount_refunded = base_discount_refunded

        if base_grand_total is not None:
            if not isinstance(base_grand_total, decimal.Decimal):
                raise TypeError(getattr(__builtin__, 'type')(base_grand_total))
        self.__base_grand_total = base_grand_total

        if base_hidden_tax_amount is not None:
            if not isinstance(base_hidden_tax_amount, decimal.Decimal):
                raise TypeError(getattr(__builtin__, 'type')(base_hidden_tax_amount))
        self.__base_hidden_tax_amount = base_hidden_tax_amount

        if base_hidden_tax_invoiced is not None:
            if not isinstance(base_hidden_tax_invoiced, decimal.Decimal):
                raise TypeError(getattr(__builtin__, 'type')(base_hidden_tax_invoiced))
        self.__base_hidden_tax_invoiced = base_hidden_tax_invoiced

        if base_hidden_tax_refunded is not None:
            if not isinstance(base_hidden_tax_refunded, decimal.Decimal):
                raise TypeError(getattr(__builtin__, 'type')(base_hidden_tax_refunded))
        self.__base_hidden_tax_refunded = base_hidden_tax_refunded

        if base_shipping_amount is not None:
            if not isinstance(base_shipping_amount, decimal.Decimal):
                raise TypeError(getattr(__builtin__, 'type')(base_shipping_amount))
        self.__base_shipping_amount = base_shipping_amount

        if base_shipping_canceled is not None:
            if not isinstance(base_shipping_canceled, decimal.Decimal):
                raise TypeError(getattr(__builtin__, 'type')(base_shipping_canceled))
        self.__base_shipping_canceled = base_shipping_canceled

        if base_shipping_discount_amount is not None:
            if not isinstance(base_shipping_discount_amount, decimal.Decimal):
                raise TypeError(getattr(__builtin__, 'type')(base_shipping_discount_amount))
        self.__base_shipping_discount_amount = base_shipping_discount_amount

        if base_shipping_hidden_tax_amnt is not None:
            if not isinstance(base_shipping_hidden_tax_amnt, decimal.Decimal):
                raise TypeError(getattr(__builtin__, 'type')(base_shipping_hidden_tax_amnt))
        self.__base_shipping_hidden_tax_amnt = base_shipping_hidden_tax_amnt

        if base_shipping_hidden_tax_amount is not None:
            if not isinstance(base_shipping_hidden_tax_amount, decimal.Decimal):
                raise TypeError(getattr(__builtin__, 'type')(base_shipping_hidden_tax_amount))
        self.__base_shipping_hidden_tax_amount = base_shipping_hidden_tax_amount

        if base_shipping_incl_tax is not None:
            if not isinstance(base_shipping_incl_tax, decimal.Decimal):
                raise TypeError(getattr(__builtin__, 'type')(base_shipping_incl_tax))
        self.__base_shipping_incl_tax = base_shipping_incl_tax

        if base_shipping_invoiced is not None:
            if not isinstance(base_shipping_invoiced, decimal.Decimal):
                raise TypeError(getattr(__builtin__, 'type')(base_shipping_invoiced))
        self.__base_shipping_invoiced = base_shipping_invoiced

        if base_shipping_refunded is not None:
            if not isinstance(base_shipping_refunded, decimal.Decimal):
                raise TypeError(getattr(__builtin__, 'type')(base_shipping_refunded))
        self.__base_shipping_refunded = base_shipping_refunded

        if base_shipping_tax_amount is not None:
            if not isinstance(base_shipping_tax_amount, decimal.Decimal):
                raise TypeError(getattr(__builtin__, 'type')(base_shipping_tax_amount))
        self.__base_shipping_tax_amount = base_shipping_tax_amount

        if base_shipping_tax_refunded is not None:
            if not isinstance(base_shipping_tax_refunded, decimal.Decimal):
                raise TypeError(getattr(__builtin__, 'type')(base_shipping_tax_refunded))
        self.__base_shipping_tax_refunded = base_shipping_tax_refunded

        if base_subtotal is not None:
            if not isinstance(base_subtotal, decimal.Decimal):
                raise TypeError(getattr(__builtin__, 'type')(base_subtotal))
        self.__base_subtotal = base_subtotal

        if base_subtotal_canceled is not None:
            if not isinstance(base_subtotal_canceled, decimal.Decimal):
                raise TypeError(getattr(__builtin__, 'type')(base_subtotal_canceled))
        self.__base_subtotal_canceled = base_subtotal_canceled

        if base_subtotal_incl_tax is not None:
            if not isinstance(base_subtotal_incl_tax, decimal.Decimal):
                raise TypeError(getattr(__builtin__, 'type')(base_subtotal_incl_tax))
        self.__base_subtotal_incl_tax = base_subtotal_incl_tax

        if base_subtotal_invoiced is not None:
            if not isinstance(base_subtotal_invoiced, decimal.Decimal):
                raise TypeError(getattr(__builtin__, 'type')(base_subtotal_invoiced))
        self.__base_subtotal_invoiced = base_subtotal_invoiced

        if base_subtotal_refunded is not None:
            if not isinstance(base_subtotal_refunded, decimal.Decimal):
                raise TypeError(getattr(__builtin__, 'type')(base_subtotal_refunded))
        self.__base_subtotal_refunded = base_subtotal_refunded

        if base_tax_amount is not None:
            if not isinstance(base_tax_amount, decimal.Decimal):
                raise TypeError(getattr(__builtin__, 'type')(base_tax_amount))
        self.__base_tax_amount = base_tax_amount

        if base_tax_canceled is not None:
            if not isinstance(base_tax_canceled, decimal.Decimal):
                raise TypeError(getattr(__builtin__, 'type')(base_tax_canceled))
        self.__base_tax_canceled = base_tax_canceled

        if base_tax_invoiced is not None:
            if not isinstance(base_tax_invoiced, decimal.Decimal):
                raise TypeError(getattr(__builtin__, 'type')(base_tax_invoiced))
        self.__base_tax_invoiced = base_tax_invoiced

        if base_tax_refunded is not None:
            if not isinstance(base_tax_refunded, decimal.Decimal):
                raise TypeError(getattr(__builtin__, 'type')(base_tax_refunded))
        self.__base_tax_refunded = base_tax_refunded

        if base_to_global_rate is not None:
            if not isinstance(base_to_global_rate, decimal.Decimal):
                raise TypeError(getattr(__builtin__, 'type')(base_to_global_rate))
        self.__base_to_global_rate = base_to_global_rate

        if base_to_order_rate is not None:
            if not isinstance(base_to_order_rate, decimal.Decimal):
                raise TypeError(getattr(__builtin__, 'type')(base_to_order_rate))
        self.__base_to_order_rate = base_to_order_rate

        if base_total_canceled is not None:
            if not isinstance(base_total_canceled, decimal.Decimal):
                raise TypeError(getattr(__builtin__, 'type')(base_total_canceled))
        self.__base_total_canceled = base_total_canceled

        if base_total_due is not None:
            if not isinstance(base_total_due, decimal.Decimal):
                raise TypeError(getattr(__builtin__, 'type')(base_total_due))
        self.__base_total_due = base_total_due

        if base_total_invoiced is not None:
            if not isinstance(base_total_invoiced, decimal.Decimal):
                raise TypeError(getattr(__builtin__, 'type')(base_total_invoiced))
        self.__base_total_invoiced = base_total_invoiced

        if base_total_invoiced_cost is not None:
            if not isinstance(base_total_invoiced_cost, decimal.Decimal):
                raise TypeError(getattr(__builtin__, 'type')(base_total_invoiced_cost))
        self.__base_total_invoiced_cost = base_total_invoiced_cost

        if base_total_offline_refunded is not None:
            if not isinstance(base_total_offline_refunded, decimal.Decimal):
                raise TypeError(getattr(__builtin__, 'type')(base_total_offline_refunded))
        self.__base_total_offline_refunded = base_total_offline_refunded

        if base_total_online_refunded is not None:
            if not isinstance(base_total_online_refunded, decimal.Decimal):
                raise TypeError(getattr(__builtin__, 'type')(base_total_online_refunded))
        self.__base_total_online_refunded = base_total_online_refunded

        if base_total_paid is not None:
            if not isinstance(base_total_paid, decimal.Decimal):
                raise TypeError(getattr(__builtin__, 'type')(base_total_paid))
        self.__base_total_paid = base_total_paid

        if base_total_qty_ordered is not None:
            if not isinstance(base_total_qty_ordered, decimal.Decimal):
                raise TypeError(getattr(__builtin__, 'type')(base_total_qty_ordered))
        self.__base_total_qty_ordered = base_total_qty_ordered

        if base_total_refunded is not None:
            if not isinstance(base_total_refunded, decimal.Decimal):
                raise TypeError(getattr(__builtin__, 'type')(base_total_refunded))
        self.__base_total_refunded = base_total_refunded

        if billing_address is not None:
            if not isinstance(billing_address, yogento.api.models.sales.order.magento.magento_order_address.MagentoOrderAddress):
                raise TypeError(getattr(__builtin__, 'type')(billing_address))
        self.__billing_address = billing_address

        if billing_address_id is not None:
            if not isinstance(billing_address_id, int):
                raise TypeError(getattr(__builtin__, 'type')(billing_address_id))
        self.__billing_address_id = billing_address_id

        if can_ship_partially is not None:
            if not isinstance(can_ship_partially, bool):
                raise TypeError(getattr(__builtin__, 'type')(can_ship_partially))
        self.__can_ship_partially = can_ship_partially

        if can_ship_partially_item is not None:
            if not isinstance(can_ship_partially_item, bool):
                raise TypeError(getattr(__builtin__, 'type')(can_ship_partially_item))
        self.__can_ship_partially_item = can_ship_partially_item

        if coupon_code is not None:
            if not isinstance(coupon_code, basestring):
                raise TypeError(getattr(__builtin__, 'type')(coupon_code))
        self.__coupon_code = coupon_code

        if coupon_rule_name is not None:
            if not isinstance(coupon_rule_name, basestring):
                raise TypeError(getattr(__builtin__, 'type')(coupon_rule_name))
        self.__coupon_rule_name = coupon_rule_name

        if created_at is None:
            raise ValueError('created_at is required')
        if not isinstance(created_at, datetime):
            raise TypeError(getattr(__builtin__, 'type')(created_at))
        self.__created_at = created_at

        if currency_code is not None:
            if not isinstance(currency_code, basestring):
                raise TypeError(getattr(__builtin__, 'type')(currency_code))
        self.__currency_code = currency_code

        if currency_rate is not None:
            if not isinstance(currency_rate, basestring):
                raise TypeError(getattr(__builtin__, 'type')(currency_rate))
        self.__currency_rate = currency_rate

        if custbalance_amount is not None:
            if not isinstance(custbalance_amount, basestring):
                raise TypeError(getattr(__builtin__, 'type')(custbalance_amount))
        self.__custbalance_amount = custbalance_amount

        if customer_dob is not None:
            if not isinstance(customer_dob, basestring):
                raise TypeError(getattr(__builtin__, 'type')(customer_dob))
        self.__customer_dob = customer_dob

        if customer_email is not None:
            if not isinstance(customer_email, basestring):
                raise TypeError(getattr(__builtin__, 'type')(customer_email))
        self.__customer_email = customer_email

        if customer_firstname is not None:
            if not isinstance(customer_firstname, basestring):
                raise TypeError(getattr(__builtin__, 'type')(customer_firstname))
        self.__customer_firstname = customer_firstname

        if customer_gender is not None:
            if not isinstance(customer_gender, basestring):
                raise TypeError(getattr(__builtin__, 'type')(customer_gender))
        self.__customer_gender = customer_gender

        if customer_group_id is not None:
            if not isinstance(customer_group_id, int):
                raise TypeError(getattr(__builtin__, 'type')(customer_group_id))
        self.__customer_group_id = customer_group_id

        if customer_id is not None:
            if not isinstance(customer_id, int):
                raise TypeError(getattr(__builtin__, 'type')(customer_id))
        self.__customer_id = customer_id

        if customer_is_guest is not None:
            if not isinstance(customer_is_guest, bool):
                raise TypeError(getattr(__builtin__, 'type')(customer_is_guest))
        self.__customer_is_guest = customer_is_guest

        if customer_lastname is not None:
            if not isinstance(customer_lastname, basestring):
                raise TypeError(getattr(__builtin__, 'type')(customer_lastname))
        self.__customer_lastname = customer_lastname

        if customer_middlename is not None:
            if not isinstance(customer_middlename, basestring):
                raise TypeError(getattr(__builtin__, 'type')(customer_middlename))
        self.__customer_middlename = customer_middlename

        if customer_note is not None:
            if not isinstance(customer_note, basestring):
                raise TypeError(getattr(__builtin__, 'type')(customer_note))
        self.__customer_note = customer_note

        if customer_note_notify is not None:
            if not isinstance(customer_note_notify, bool):
                raise TypeError(getattr(__builtin__, 'type')(customer_note_notify))
        self.__customer_note_notify = customer_note_notify

        if customer_prefix is not None:
            if not isinstance(customer_prefix, basestring):
                raise TypeError(getattr(__builtin__, 'type')(customer_prefix))
        self.__customer_prefix = customer_prefix

        if customer_suffix is not None:
            if not isinstance(customer_suffix, basestring):
                raise TypeError(getattr(__builtin__, 'type')(customer_suffix))
        self.__customer_suffix = customer_suffix

        if customer_taxvat is not None:
            if not isinstance(customer_taxvat, basestring):
                raise TypeError(getattr(__builtin__, 'type')(customer_taxvat))
        self.__customer_taxvat = customer_taxvat

        if discount_amount is not None:
            if not isinstance(discount_amount, decimal.Decimal):
                raise TypeError(getattr(__builtin__, 'type')(discount_amount))
        self.__discount_amount = discount_amount

        if discount_canceled is not None:
            if not isinstance(discount_canceled, decimal.Decimal):
                raise TypeError(getattr(__builtin__, 'type')(discount_canceled))
        self.__discount_canceled = discount_canceled

        if discount_description is not None:
            if not isinstance(discount_description, decimal.Decimal):
                raise TypeError(getattr(__builtin__, 'type')(discount_description))
        self.__discount_description = discount_description

        if discount_invoiced is not None:
            if not isinstance(discount_invoiced, decimal.Decimal):
                raise TypeError(getattr(__builtin__, 'type')(discount_invoiced))
        self.__discount_invoiced = discount_invoiced

        if discount_refunded is not None:
            if not isinstance(discount_refunded, decimal.Decimal):
                raise TypeError(getattr(__builtin__, 'type')(discount_refunded))
        self.__discount_refunded = discount_refunded

        if edit_increment is not None:
            if not isinstance(edit_increment, basestring):
                raise TypeError(getattr(__builtin__, 'type')(edit_increment))
        self.__edit_increment = edit_increment

        if email_sent is not None:
            if not isinstance(email_sent, bool):
                raise TypeError(getattr(__builtin__, 'type')(email_sent))
        self.__email_sent = email_sent

        if forced_do_shipment_with_invoice is not None:
            if not isinstance(forced_do_shipment_with_invoice, bool):
                raise TypeError(getattr(__builtin__, 'type')(forced_do_shipment_with_invoice))
        self.__forced_do_shipment_with_invoice = forced_do_shipment_with_invoice

        if forced_shipment_with_invoice is not None:
            if not isinstance(forced_shipment_with_invoice, bool):
                raise TypeError(getattr(__builtin__, 'type')(forced_shipment_with_invoice))
        self.__forced_shipment_with_invoice = forced_shipment_with_invoice

        if gift_message_id is not None:
            if not isinstance(gift_message_id, int):
                raise TypeError(getattr(__builtin__, 'type')(gift_message_id))
        self.__gift_message_id = gift_message_id

        if global_currency_code is not None:
            if not isinstance(global_currency_code, basestring):
                raise TypeError(getattr(__builtin__, 'type')(global_currency_code))
        self.__global_currency_code = global_currency_code

        if grand_total is None:
            raise ValueError('grand_total is required')
        if not isinstance(grand_total, decimal.Decimal):
            raise TypeError(getattr(__builtin__, 'type')(grand_total))
        self.__grand_total = grand_total

        if hidden_tax_amount is not None:
            if not isinstance(hidden_tax_amount, decimal.Decimal):
                raise TypeError(getattr(__builtin__, 'type')(hidden_tax_amount))
        self.__hidden_tax_amount = hidden_tax_amount

        if hidden_tax_invoiced is not None:
            if not isinstance(hidden_tax_invoiced, decimal.Decimal):
                raise TypeError(getattr(__builtin__, 'type')(hidden_tax_invoiced))
        self.__hidden_tax_invoiced = hidden_tax_invoiced

        if hidden_tax_refunded is not None:
            if not isinstance(hidden_tax_refunded, decimal.Decimal):
                raise TypeError(getattr(__builtin__, 'type')(hidden_tax_refunded))
        self.__hidden_tax_refunded = hidden_tax_refunded

        if increment_id is None:
            raise ValueError('increment_id is required')
        if not isinstance(increment_id, basestring):
            raise TypeError(getattr(__builtin__, 'type')(increment_id))
        self.__increment_id = increment_id

        if is_hold is not None:
            if not isinstance(is_hold, bool):
                raise TypeError(getattr(__builtin__, 'type')(is_hold))
        self.__is_hold = is_hold

        if is_multi_payment is not None:
            if not isinstance(is_multi_payment, bool):
                raise TypeError(getattr(__builtin__, 'type')(is_multi_payment))
        self.__is_multi_payment = is_multi_payment

        if is_virtual is None:
            raise ValueError('is_virtual is required')
        if not isinstance(is_virtual, bool):
            raise TypeError(getattr(__builtin__, 'type')(is_virtual))
        self.__is_virtual = is_virtual

        if items is not None:
            if not (isinstance(items, frozenset) and len(list(ifilterfalse(lambda _: isinstance(_, yogento.api.models.sales.order.magento.magento_order_item.MagentoOrderItem), items))) == 0):
                raise TypeError(getattr(__builtin__, 'type')(items))
        self.__items = items

        if order_currency_code is None:
            raise ValueError('order_currency_code is required')
        if not isinstance(order_currency_code, basestring):
            raise TypeError(getattr(__builtin__, 'type')(order_currency_code))
        self.__order_currency_code = order_currency_code

        if order_id is not None:
            if not isinstance(order_id, int):
                raise TypeError(getattr(__builtin__, 'type')(order_id))
        self.__order_id = order_id

        if original_increment_id is not None:
            if not isinstance(original_increment_id, basestring):
                raise TypeError(getattr(__builtin__, 'type')(original_increment_id))
        self.__original_increment_id = original_increment_id

        if quote_id is not None:
            if not isinstance(quote_id, int):
                raise TypeError(getattr(__builtin__, 'type')(quote_id))
        self.__quote_id = quote_id

        if relation_child_id is not None:
            if not isinstance(relation_child_id, int):
                raise TypeError(getattr(__builtin__, 'type')(relation_child_id))
        self.__relation_child_id = relation_child_id

        if relation_child_real_id is not None:
            if not isinstance(relation_child_real_id, int):
                raise TypeError(getattr(__builtin__, 'type')(relation_child_real_id))
        self.__relation_child_real_id = relation_child_real_id

        if relation_parent_id is not None:
            if not isinstance(relation_parent_id, int):
                raise TypeError(getattr(__builtin__, 'type')(relation_parent_id))
        self.__relation_parent_id = relation_parent_id

        if relation_parent_real_id is not None:
            if not isinstance(relation_parent_real_id, int):
                raise TypeError(getattr(__builtin__, 'type')(relation_parent_real_id))
        self.__relation_parent_real_id = relation_parent_real_id

        if remote_ip is not None:
            if not isinstance(remote_ip, basestring):
                raise TypeError(getattr(__builtin__, 'type')(remote_ip))
        self.__remote_ip = remote_ip

        if shipping_address is not None:
            if not isinstance(shipping_address, yogento.api.models.sales.order.magento.magento_order_address.MagentoOrderAddress):
                raise TypeError(getattr(__builtin__, 'type')(shipping_address))
        self.__shipping_address = shipping_address

        if shipping_address_id is not None:
            if not isinstance(shipping_address_id, int):
                raise TypeError(getattr(__builtin__, 'type')(shipping_address_id))
        self.__shipping_address_id = shipping_address_id

        if shipping_amount is not None:
            if not isinstance(shipping_amount, decimal.Decimal):
                raise TypeError(getattr(__builtin__, 'type')(shipping_amount))
        self.__shipping_amount = shipping_amount

        if shipping_canceled is not None:
            if not isinstance(shipping_canceled, decimal.Decimal):
                raise TypeError(getattr(__builtin__, 'type')(shipping_canceled))
        self.__shipping_canceled = shipping_canceled

        if shipping_description is not None:
            if not isinstance(shipping_description, basestring):
                raise TypeError(getattr(__builtin__, 'type')(shipping_description))
        self.__shipping_description = shipping_description

        if shipping_discount_amount is not None:
            if not isinstance(shipping_discount_amount, decimal.Decimal):
                raise TypeError(getattr(__builtin__, 'type')(shipping_discount_amount))
        self.__shipping_discount_amount = shipping_discount_amount

        if shipping_hidden_tax_amount is not None:
            if not isinstance(shipping_hidden_tax_amount, decimal.Decimal):
                raise TypeError(getattr(__builtin__, 'type')(shipping_hidden_tax_amount))
        self.__shipping_hidden_tax_amount = shipping_hidden_tax_amount

        if shipping_incl_tax is not None:
            if not isinstance(shipping_incl_tax, decimal.Decimal):
                raise TypeError(getattr(__builtin__, 'type')(shipping_incl_tax))
        self.__shipping_incl_tax = shipping_incl_tax

        if shipping_invoiced is not None:
            if not isinstance(shipping_invoiced, decimal.Decimal):
                raise TypeError(getattr(__builtin__, 'type')(shipping_invoiced))
        self.__shipping_invoiced = shipping_invoiced

        if shipping_method is not None:
            if not isinstance(shipping_method, basestring):
                raise TypeError(getattr(__builtin__, 'type')(shipping_method))
        self.__shipping_method = shipping_method

        if shipping_refunded is not None:
            if not isinstance(shipping_refunded, decimal.Decimal):
                raise TypeError(getattr(__builtin__, 'type')(shipping_refunded))
        self.__shipping_refunded = shipping_refunded

        if shipping_tax_amount is not None:
            if not isinstance(shipping_tax_amount, decimal.Decimal):
                raise TypeError(getattr(__builtin__, 'type')(shipping_tax_amount))
        self.__shipping_tax_amount = shipping_tax_amount

        if shipping_tax_refunded is not None:
            if not isinstance(shipping_tax_refunded, decimal.Decimal):
                raise TypeError(getattr(__builtin__, 'type')(shipping_tax_refunded))
        self.__shipping_tax_refunded = shipping_tax_refunded

        if state is not None:
            if not isinstance(state, basestring):
                raise TypeError(getattr(__builtin__, 'type')(state))
        self.__state = state

        if status is not None:
            if not isinstance(status, yogento.api.models.sales.order.magento.magento_order_status.MagentoOrderStatus):
                raise TypeError(getattr(__builtin__, 'type')(status))
        self.__status = status

        if status_history is not None:
            if not (isinstance(status_history, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, yogento.api.models.sales.order.magento.magento_order_status_history.MagentoOrderStatusHistory), status_history))) == 0):
                raise TypeError(getattr(__builtin__, 'type')(status_history))
        self.__status_history = status_history

        if store_currency_code is not None:
            if not isinstance(store_currency_code, basestring):
                raise TypeError(getattr(__builtin__, 'type')(store_currency_code))
        self.__store_currency_code = store_currency_code

        if store_id is not None:
            if not isinstance(store_id, int):
                raise TypeError(getattr(__builtin__, 'type')(store_id))
        self.__store_id = store_id

        if store_name is not None:
            if not isinstance(store_name, basestring):
                raise TypeError(getattr(__builtin__, 'type')(store_name))
        self.__store_name = store_name

        if store_to_base_rate is not None:
            if not isinstance(store_to_base_rate, decimal.Decimal):
                raise TypeError(getattr(__builtin__, 'type')(store_to_base_rate))
        self.__store_to_base_rate = store_to_base_rate

        if store_to_order_rate is not None:
            if not isinstance(store_to_order_rate, decimal.Decimal):
                raise TypeError(getattr(__builtin__, 'type')(store_to_order_rate))
        self.__store_to_order_rate = store_to_order_rate

        if subtotal is not None:
            if not isinstance(subtotal, decimal.Decimal):
                raise TypeError(getattr(__builtin__, 'type')(subtotal))
        self.__subtotal = subtotal

        if subtotal_canceled is not None:
            if not isinstance(subtotal_canceled, decimal.Decimal):
                raise TypeError(getattr(__builtin__, 'type')(subtotal_canceled))
        self.__subtotal_canceled = subtotal_canceled

        if subtotal_incl_tax is not None:
            if not isinstance(subtotal_incl_tax, decimal.Decimal):
                raise TypeError(getattr(__builtin__, 'type')(subtotal_incl_tax))
        self.__subtotal_incl_tax = subtotal_incl_tax

        if subtotal_invoiced is not None:
            if not isinstance(subtotal_invoiced, decimal.Decimal):
                raise TypeError(getattr(__builtin__, 'type')(subtotal_invoiced))
        self.__subtotal_invoiced = subtotal_invoiced

        if subtotal_refunded is not None:
            if not isinstance(subtotal_refunded, decimal.Decimal):
                raise TypeError(getattr(__builtin__, 'type')(subtotal_refunded))
        self.__subtotal_refunded = subtotal_refunded

        if tax_amount is not None:
            if not isinstance(tax_amount, decimal.Decimal):
                raise TypeError(getattr(__builtin__, 'type')(tax_amount))
        self.__tax_amount = tax_amount

        if tax_canceled is not None:
            if not isinstance(tax_canceled, decimal.Decimal):
                raise TypeError(getattr(__builtin__, 'type')(tax_canceled))
        self.__tax_canceled = tax_canceled

        if tax_invoiced is not None:
            if not isinstance(tax_invoiced, decimal.Decimal):
                raise TypeError(getattr(__builtin__, 'type')(tax_invoiced))
        self.__tax_invoiced = tax_invoiced

        if tax_percent is not None:
            if not isinstance(tax_percent, decimal.Decimal):
                raise TypeError(getattr(__builtin__, 'type')(tax_percent))
        self.__tax_percent = tax_percent

        if tax_refunded is not None:
            if not isinstance(tax_refunded, decimal.Decimal):
                raise TypeError(getattr(__builtin__, 'type')(tax_refunded))
        self.__tax_refunded = tax_refunded

        if total_canceled is not None:
            if not isinstance(total_canceled, decimal.Decimal):
                raise TypeError(getattr(__builtin__, 'type')(total_canceled))
        self.__total_canceled = total_canceled

        if total_due is not None:
            if not isinstance(total_due, decimal.Decimal):
                raise TypeError(getattr(__builtin__, 'type')(total_due))
        self.__total_due = total_due

        if total_invoiced is not None:
            if not isinstance(total_invoiced, decimal.Decimal):
                raise TypeError(getattr(__builtin__, 'type')(total_invoiced))
        self.__total_invoiced = total_invoiced

        if total_item_count is not None:
            if not isinstance(total_item_count, decimal.Decimal):
                raise TypeError(getattr(__builtin__, 'type')(total_item_count))
        self.__total_item_count = total_item_count

        if total_offline_refunded is not None:
            if not isinstance(total_offline_refunded, decimal.Decimal):
                raise TypeError(getattr(__builtin__, 'type')(total_offline_refunded))
        self.__total_offline_refunded = total_offline_refunded

        if total_online_refunded is not None:
            if not isinstance(total_online_refunded, decimal.Decimal):
                raise TypeError(getattr(__builtin__, 'type')(total_online_refunded))
        self.__total_online_refunded = total_online_refunded

        if total_paid is not None:
            if not isinstance(total_paid, decimal.Decimal):
                raise TypeError(getattr(__builtin__, 'type')(total_paid))
        self.__total_paid = total_paid

        if total_qty_ordered is not None:
            if not isinstance(total_qty_ordered, decimal.Decimal):
                raise TypeError(getattr(__builtin__, 'type')(total_qty_ordered))
        self.__total_qty_ordered = total_qty_ordered

        if total_refunded is not None:
            if not isinstance(total_refunded, decimal.Decimal):
                raise TypeError(getattr(__builtin__, 'type')(total_refunded))
        self.__total_refunded = total_refunded

        if tracking_numbers is not None:
            if not (isinstance(tracking_numbers, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, basestring), tracking_numbers))) == 0):
                raise TypeError(getattr(__builtin__, 'type')(tracking_numbers))
        self.__tracking_numbers = tracking_numbers

        if updated_at is None:
            raise ValueError('updated_at is required')
        if not isinstance(updated_at, datetime):
            raise TypeError(getattr(__builtin__, 'type')(updated_at))
        self.__updated_at = updated_at

        if weight is not None:
            if not isinstance(weight, decimal.Decimal):
                raise TypeError(getattr(__builtin__, 'type')(weight))
        self.__weight = weight

        if x_forwarded_for is not None:
            if not isinstance(x_forwarded_for, basestring):
                raise TypeError(getattr(__builtin__, 'type')(x_forwarded_for))
        self.__x_forwarded_for = x_forwarded_for

    def __eq__(self, other):
        if self.adjustment_negative != other.adjustment_negative:
            return False
        if self.adjustment_positive != other.adjustment_positive:
            return False
        if self.base_adjustment_negative != other.base_adjustment_negative:
            return False
        if self.base_adjustment_positive != other.base_adjustment_positive:
            return False
        if self.base_currency_code != other.base_currency_code:
            return False
        if self.base_custbalance_amount != other.base_custbalance_amount:
            return False
        if self.base_discount_amount != other.base_discount_amount:
            return False
        if self.base_discount_canceled != other.base_discount_canceled:
            return False
        if self.base_discount_invoiced != other.base_discount_invoiced:
            return False
        if self.base_discount_refunded != other.base_discount_refunded:
            return False
        if self.base_grand_total != other.base_grand_total:
            return False
        if self.base_hidden_tax_amount != other.base_hidden_tax_amount:
            return False
        if self.base_hidden_tax_invoiced != other.base_hidden_tax_invoiced:
            return False
        if self.base_hidden_tax_refunded != other.base_hidden_tax_refunded:
            return False
        if self.base_shipping_amount != other.base_shipping_amount:
            return False
        if self.base_shipping_canceled != other.base_shipping_canceled:
            return False
        if self.base_shipping_discount_amount != other.base_shipping_discount_amount:
            return False
        if self.base_shipping_hidden_tax_amnt != other.base_shipping_hidden_tax_amnt:
            return False
        if self.base_shipping_hidden_tax_amount != other.base_shipping_hidden_tax_amount:
            return False
        if self.base_shipping_incl_tax != other.base_shipping_incl_tax:
            return False
        if self.base_shipping_invoiced != other.base_shipping_invoiced:
            return False
        if self.base_shipping_refunded != other.base_shipping_refunded:
            return False
        if self.base_shipping_tax_amount != other.base_shipping_tax_amount:
            return False
        if self.base_shipping_tax_refunded != other.base_shipping_tax_refunded:
            return False
        if self.base_subtotal != other.base_subtotal:
            return False
        if self.base_subtotal_canceled != other.base_subtotal_canceled:
            return False
        if self.base_subtotal_incl_tax != other.base_subtotal_incl_tax:
            return False
        if self.base_subtotal_invoiced != other.base_subtotal_invoiced:
            return False
        if self.base_subtotal_refunded != other.base_subtotal_refunded:
            return False
        if self.base_tax_amount != other.base_tax_amount:
            return False
        if self.base_tax_canceled != other.base_tax_canceled:
            return False
        if self.base_tax_invoiced != other.base_tax_invoiced:
            return False
        if self.base_tax_refunded != other.base_tax_refunded:
            return False
        if self.base_to_global_rate != other.base_to_global_rate:
            return False
        if self.base_to_order_rate != other.base_to_order_rate:
            return False
        if self.base_total_canceled != other.base_total_canceled:
            return False
        if self.base_total_due != other.base_total_due:
            return False
        if self.base_total_invoiced != other.base_total_invoiced:
            return False
        if self.base_total_invoiced_cost != other.base_total_invoiced_cost:
            return False
        if self.base_total_offline_refunded != other.base_total_offline_refunded:
            return False
        if self.base_total_online_refunded != other.base_total_online_refunded:
            return False
        if self.base_total_paid != other.base_total_paid:
            return False
        if self.base_total_qty_ordered != other.base_total_qty_ordered:
            return False
        if self.base_total_refunded != other.base_total_refunded:
            return False
        if self.billing_address != other.billing_address:
            return False
        if self.billing_address_id != other.billing_address_id:
            return False
        if self.can_ship_partially != other.can_ship_partially:
            return False
        if self.can_ship_partially_item != other.can_ship_partially_item:
            return False
        if self.coupon_code != other.coupon_code:
            return False
        if self.coupon_rule_name != other.coupon_rule_name:
            return False
        if self.created_at != other.created_at:
            return False
        if self.currency_code != other.currency_code:
            return False
        if self.currency_rate != other.currency_rate:
            return False
        if self.custbalance_amount != other.custbalance_amount:
            return False
        if self.customer_dob != other.customer_dob:
            return False
        if self.customer_email != other.customer_email:
            return False
        if self.customer_firstname != other.customer_firstname:
            return False
        if self.customer_gender != other.customer_gender:
            return False
        if self.customer_group_id != other.customer_group_id:
            return False
        if self.customer_id != other.customer_id:
            return False
        if self.customer_is_guest != other.customer_is_guest:
            return False
        if self.customer_lastname != other.customer_lastname:
            return False
        if self.customer_middlename != other.customer_middlename:
            return False
        if self.customer_note != other.customer_note:
            return False
        if self.customer_note_notify != other.customer_note_notify:
            return False
        if self.customer_prefix != other.customer_prefix:
            return False
        if self.customer_suffix != other.customer_suffix:
            return False
        if self.customer_taxvat != other.customer_taxvat:
            return False
        if self.discount_amount != other.discount_amount:
            return False
        if self.discount_canceled != other.discount_canceled:
            return False
        if self.discount_description != other.discount_description:
            return False
        if self.discount_invoiced != other.discount_invoiced:
            return False
        if self.discount_refunded != other.discount_refunded:
            return False
        if self.edit_increment != other.edit_increment:
            return False
        if self.email_sent != other.email_sent:
            return False
        if self.forced_do_shipment_with_invoice != other.forced_do_shipment_with_invoice:
            return False
        if self.forced_shipment_with_invoice != other.forced_shipment_with_invoice:
            return False
        if self.gift_message_id != other.gift_message_id:
            return False
        if self.global_currency_code != other.global_currency_code:
            return False
        if self.grand_total != other.grand_total:
            return False
        if self.hidden_tax_amount != other.hidden_tax_amount:
            return False
        if self.hidden_tax_invoiced != other.hidden_tax_invoiced:
            return False
        if self.hidden_tax_refunded != other.hidden_tax_refunded:
            return False
        if self.increment_id != other.increment_id:
            return False
        if self.is_hold != other.is_hold:
            return False
        if self.is_multi_payment != other.is_multi_payment:
            return False
        if self.is_virtual != other.is_virtual:
            return False
        if self.items != other.items:
            return False
        if self.order_currency_code != other.order_currency_code:
            return False
        if self.order_id != other.order_id:
            return False
        if self.original_increment_id != other.original_increment_id:
            return False
        if self.quote_id != other.quote_id:
            return False
        if self.relation_child_id != other.relation_child_id:
            return False
        if self.relation_child_real_id != other.relation_child_real_id:
            return False
        if self.relation_parent_id != other.relation_parent_id:
            return False
        if self.relation_parent_real_id != other.relation_parent_real_id:
            return False
        if self.remote_ip != other.remote_ip:
            return False
        if self.shipping_address != other.shipping_address:
            return False
        if self.shipping_address_id != other.shipping_address_id:
            return False
        if self.shipping_amount != other.shipping_amount:
            return False
        if self.shipping_canceled != other.shipping_canceled:
            return False
        if self.shipping_description != other.shipping_description:
            return False
        if self.shipping_discount_amount != other.shipping_discount_amount:
            return False
        if self.shipping_hidden_tax_amount != other.shipping_hidden_tax_amount:
            return False
        if self.shipping_incl_tax != other.shipping_incl_tax:
            return False
        if self.shipping_invoiced != other.shipping_invoiced:
            return False
        if self.shipping_method != other.shipping_method:
            return False
        if self.shipping_refunded != other.shipping_refunded:
            return False
        if self.shipping_tax_amount != other.shipping_tax_amount:
            return False
        if self.shipping_tax_refunded != other.shipping_tax_refunded:
            return False
        if self.state != other.state:
            return False
        if self.status != other.status:
            return False
        if self.status_history != other.status_history:
            return False
        if self.store_currency_code != other.store_currency_code:
            return False
        if self.store_id != other.store_id:
            return False
        if self.store_name != other.store_name:
            return False
        if self.store_to_base_rate != other.store_to_base_rate:
            return False
        if self.store_to_order_rate != other.store_to_order_rate:
            return False
        if self.subtotal != other.subtotal:
            return False
        if self.subtotal_canceled != other.subtotal_canceled:
            return False
        if self.subtotal_incl_tax != other.subtotal_incl_tax:
            return False
        if self.subtotal_invoiced != other.subtotal_invoiced:
            return False
        if self.subtotal_refunded != other.subtotal_refunded:
            return False
        if self.tax_amount != other.tax_amount:
            return False
        if self.tax_canceled != other.tax_canceled:
            return False
        if self.tax_invoiced != other.tax_invoiced:
            return False
        if self.tax_percent != other.tax_percent:
            return False
        if self.tax_refunded != other.tax_refunded:
            return False
        if self.total_canceled != other.total_canceled:
            return False
        if self.total_due != other.total_due:
            return False
        if self.total_invoiced != other.total_invoiced:
            return False
        if self.total_item_count != other.total_item_count:
            return False
        if self.total_offline_refunded != other.total_offline_refunded:
            return False
        if self.total_online_refunded != other.total_online_refunded:
            return False
        if self.total_paid != other.total_paid:
            return False
        if self.total_qty_ordered != other.total_qty_ordered:
            return False
        if self.total_refunded != other.total_refunded:
            return False
        if self.tracking_numbers != other.tracking_numbers:
            return False
        if self.updated_at != other.updated_at:
            return False
        if self.weight != other.weight:
            return False
        if self.x_forwarded_for != other.x_forwarded_for:
            return False
        return True

    def __hash__(self):
        return hash((self.adjustment_negative,self.adjustment_positive,self.base_adjustment_negative,self.base_adjustment_positive,self.base_currency_code,self.base_custbalance_amount,self.base_discount_amount,self.base_discount_canceled,self.base_discount_invoiced,self.base_discount_refunded,self.base_grand_total,self.base_hidden_tax_amount,self.base_hidden_tax_invoiced,self.base_hidden_tax_refunded,self.base_shipping_amount,self.base_shipping_canceled,self.base_shipping_discount_amount,self.base_shipping_hidden_tax_amnt,self.base_shipping_hidden_tax_amount,self.base_shipping_incl_tax,self.base_shipping_invoiced,self.base_shipping_refunded,self.base_shipping_tax_amount,self.base_shipping_tax_refunded,self.base_subtotal,self.base_subtotal_canceled,self.base_subtotal_incl_tax,self.base_subtotal_invoiced,self.base_subtotal_refunded,self.base_tax_amount,self.base_tax_canceled,self.base_tax_invoiced,self.base_tax_refunded,self.base_to_global_rate,self.base_to_order_rate,self.base_total_canceled,self.base_total_due,self.base_total_invoiced,self.base_total_invoiced_cost,self.base_total_offline_refunded,self.base_total_online_refunded,self.base_total_paid,self.base_total_qty_ordered,self.base_total_refunded,self.billing_address,self.billing_address_id,self.can_ship_partially,self.can_ship_partially_item,self.coupon_code,self.coupon_rule_name,self.created_at,self.currency_code,self.currency_rate,self.custbalance_amount,self.customer_dob,self.customer_email,self.customer_firstname,self.customer_gender,self.customer_group_id,self.customer_id,self.customer_is_guest,self.customer_lastname,self.customer_middlename,self.customer_note,self.customer_note_notify,self.customer_prefix,self.customer_suffix,self.customer_taxvat,self.discount_amount,self.discount_canceled,self.discount_description,self.discount_invoiced,self.discount_refunded,self.edit_increment,self.email_sent,self.forced_do_shipment_with_invoice,self.forced_shipment_with_invoice,self.gift_message_id,self.global_currency_code,self.grand_total,self.hidden_tax_amount,self.hidden_tax_invoiced,self.hidden_tax_refunded,self.increment_id,self.is_hold,self.is_multi_payment,self.is_virtual,self.items,self.order_currency_code,self.order_id,self.original_increment_id,self.quote_id,self.relation_child_id,self.relation_child_real_id,self.relation_parent_id,self.relation_parent_real_id,self.remote_ip,self.shipping_address,self.shipping_address_id,self.shipping_amount,self.shipping_canceled,self.shipping_description,self.shipping_discount_amount,self.shipping_hidden_tax_amount,self.shipping_incl_tax,self.shipping_invoiced,self.shipping_method,self.shipping_refunded,self.shipping_tax_amount,self.shipping_tax_refunded,self.state,self.status,self.status_history,self.store_currency_code,self.store_id,self.store_name,self.store_to_base_rate,self.store_to_order_rate,self.subtotal,self.subtotal_canceled,self.subtotal_incl_tax,self.subtotal_invoiced,self.subtotal_refunded,self.tax_amount,self.tax_canceled,self.tax_invoiced,self.tax_percent,self.tax_refunded,self.total_canceled,self.total_due,self.total_invoiced,self.total_item_count,self.total_offline_refunded,self.total_online_refunded,self.total_paid,self.total_qty_ordered,self.total_refunded,self.tracking_numbers,self.updated_at,self.weight,self.x_forwarded_for,))

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        if self.adjustment_negative is not None:
            field_reprs.append('adjustment_negative=' + repr(self.adjustment_negative))
        if self.adjustment_positive is not None:
            field_reprs.append('adjustment_positive=' + repr(self.adjustment_positive))
        if self.base_adjustment_negative is not None:
            field_reprs.append('base_adjustment_negative=' + repr(self.base_adjustment_negative))
        if self.base_adjustment_positive is not None:
            field_reprs.append('base_adjustment_positive=' + repr(self.base_adjustment_positive))
        if self.base_currency_code is not None:
            field_reprs.append('base_currency_code=' + "'" + self.base_currency_code.encode('ascii', 'replace') + "'")
        if self.base_custbalance_amount is not None:
            field_reprs.append('base_custbalance_amount=' + repr(self.base_custbalance_amount))
        if self.base_discount_amount is not None:
            field_reprs.append('base_discount_amount=' + repr(self.base_discount_amount))
        if self.base_discount_canceled is not None:
            field_reprs.append('base_discount_canceled=' + repr(self.base_discount_canceled))
        if self.base_discount_invoiced is not None:
            field_reprs.append('base_discount_invoiced=' + repr(self.base_discount_invoiced))
        if self.base_discount_refunded is not None:
            field_reprs.append('base_discount_refunded=' + repr(self.base_discount_refunded))
        if self.base_grand_total is not None:
            field_reprs.append('base_grand_total=' + repr(self.base_grand_total))
        if self.base_hidden_tax_amount is not None:
            field_reprs.append('base_hidden_tax_amount=' + repr(self.base_hidden_tax_amount))
        if self.base_hidden_tax_invoiced is not None:
            field_reprs.append('base_hidden_tax_invoiced=' + repr(self.base_hidden_tax_invoiced))
        if self.base_hidden_tax_refunded is not None:
            field_reprs.append('base_hidden_tax_refunded=' + repr(self.base_hidden_tax_refunded))
        if self.base_shipping_amount is not None:
            field_reprs.append('base_shipping_amount=' + repr(self.base_shipping_amount))
        if self.base_shipping_canceled is not None:
            field_reprs.append('base_shipping_canceled=' + repr(self.base_shipping_canceled))
        if self.base_shipping_discount_amount is not None:
            field_reprs.append('base_shipping_discount_amount=' + repr(self.base_shipping_discount_amount))
        if self.base_shipping_hidden_tax_amnt is not None:
            field_reprs.append('base_shipping_hidden_tax_amnt=' + repr(self.base_shipping_hidden_tax_amnt))
        if self.base_shipping_hidden_tax_amount is not None:
            field_reprs.append('base_shipping_hidden_tax_amount=' + repr(self.base_shipping_hidden_tax_amount))
        if self.base_shipping_incl_tax is not None:
            field_reprs.append('base_shipping_incl_tax=' + repr(self.base_shipping_incl_tax))
        if self.base_shipping_invoiced is not None:
            field_reprs.append('base_shipping_invoiced=' + repr(self.base_shipping_invoiced))
        if self.base_shipping_refunded is not None:
            field_reprs.append('base_shipping_refunded=' + repr(self.base_shipping_refunded))
        if self.base_shipping_tax_amount is not None:
            field_reprs.append('base_shipping_tax_amount=' + repr(self.base_shipping_tax_amount))
        if self.base_shipping_tax_refunded is not None:
            field_reprs.append('base_shipping_tax_refunded=' + repr(self.base_shipping_tax_refunded))
        if self.base_subtotal is not None:
            field_reprs.append('base_subtotal=' + repr(self.base_subtotal))
        if self.base_subtotal_canceled is not None:
            field_reprs.append('base_subtotal_canceled=' + repr(self.base_subtotal_canceled))
        if self.base_subtotal_incl_tax is not None:
            field_reprs.append('base_subtotal_incl_tax=' + repr(self.base_subtotal_incl_tax))
        if self.base_subtotal_invoiced is not None:
            field_reprs.append('base_subtotal_invoiced=' + repr(self.base_subtotal_invoiced))
        if self.base_subtotal_refunded is not None:
            field_reprs.append('base_subtotal_refunded=' + repr(self.base_subtotal_refunded))
        if self.base_tax_amount is not None:
            field_reprs.append('base_tax_amount=' + repr(self.base_tax_amount))
        if self.base_tax_canceled is not None:
            field_reprs.append('base_tax_canceled=' + repr(self.base_tax_canceled))
        if self.base_tax_invoiced is not None:
            field_reprs.append('base_tax_invoiced=' + repr(self.base_tax_invoiced))
        if self.base_tax_refunded is not None:
            field_reprs.append('base_tax_refunded=' + repr(self.base_tax_refunded))
        if self.base_to_global_rate is not None:
            field_reprs.append('base_to_global_rate=' + repr(self.base_to_global_rate))
        if self.base_to_order_rate is not None:
            field_reprs.append('base_to_order_rate=' + repr(self.base_to_order_rate))
        if self.base_total_canceled is not None:
            field_reprs.append('base_total_canceled=' + repr(self.base_total_canceled))
        if self.base_total_due is not None:
            field_reprs.append('base_total_due=' + repr(self.base_total_due))
        if self.base_total_invoiced is not None:
            field_reprs.append('base_total_invoiced=' + repr(self.base_total_invoiced))
        if self.base_total_invoiced_cost is not None:
            field_reprs.append('base_total_invoiced_cost=' + repr(self.base_total_invoiced_cost))
        if self.base_total_offline_refunded is not None:
            field_reprs.append('base_total_offline_refunded=' + repr(self.base_total_offline_refunded))
        if self.base_total_online_refunded is not None:
            field_reprs.append('base_total_online_refunded=' + repr(self.base_total_online_refunded))
        if self.base_total_paid is not None:
            field_reprs.append('base_total_paid=' + repr(self.base_total_paid))
        if self.base_total_qty_ordered is not None:
            field_reprs.append('base_total_qty_ordered=' + repr(self.base_total_qty_ordered))
        if self.base_total_refunded is not None:
            field_reprs.append('base_total_refunded=' + repr(self.base_total_refunded))
        if self.billing_address is not None:
            field_reprs.append('billing_address=' + repr(self.billing_address))
        if self.billing_address_id is not None:
            field_reprs.append('billing_address_id=' + repr(self.billing_address_id))
        if self.can_ship_partially is not None:
            field_reprs.append('can_ship_partially=' + repr(self.can_ship_partially))
        if self.can_ship_partially_item is not None:
            field_reprs.append('can_ship_partially_item=' + repr(self.can_ship_partially_item))
        if self.coupon_code is not None:
            field_reprs.append('coupon_code=' + "'" + self.coupon_code.encode('ascii', 'replace') + "'")
        if self.coupon_rule_name is not None:
            field_reprs.append('coupon_rule_name=' + "'" + self.coupon_rule_name.encode('ascii', 'replace') + "'")
        field_reprs.append('created_at=' + repr(self.created_at))
        if self.currency_code is not None:
            field_reprs.append('currency_code=' + "'" + self.currency_code.encode('ascii', 'replace') + "'")
        if self.currency_rate is not None:
            field_reprs.append('currency_rate=' + "'" + self.currency_rate.encode('ascii', 'replace') + "'")
        if self.custbalance_amount is not None:
            field_reprs.append('custbalance_amount=' + "'" + self.custbalance_amount.encode('ascii', 'replace') + "'")
        if self.customer_dob is not None:
            field_reprs.append('customer_dob=' + "'" + self.customer_dob.encode('ascii', 'replace') + "'")
        if self.customer_email is not None:
            field_reprs.append('customer_email=' + "'" + self.customer_email.encode('ascii', 'replace') + "'")
        if self.customer_firstname is not None:
            field_reprs.append('customer_firstname=' + "'" + self.customer_firstname.encode('ascii', 'replace') + "'")
        if self.customer_gender is not None:
            field_reprs.append('customer_gender=' + "'" + self.customer_gender.encode('ascii', 'replace') + "'")
        if self.customer_group_id is not None:
            field_reprs.append('customer_group_id=' + repr(self.customer_group_id))
        if self.customer_id is not None:
            field_reprs.append('customer_id=' + repr(self.customer_id))
        if self.customer_is_guest is not None:
            field_reprs.append('customer_is_guest=' + repr(self.customer_is_guest))
        if self.customer_lastname is not None:
            field_reprs.append('customer_lastname=' + "'" + self.customer_lastname.encode('ascii', 'replace') + "'")
        if self.customer_middlename is not None:
            field_reprs.append('customer_middlename=' + "'" + self.customer_middlename.encode('ascii', 'replace') + "'")
        if self.customer_note is not None:
            field_reprs.append('customer_note=' + "'" + self.customer_note.encode('ascii', 'replace') + "'")
        if self.customer_note_notify is not None:
            field_reprs.append('customer_note_notify=' + repr(self.customer_note_notify))
        if self.customer_prefix is not None:
            field_reprs.append('customer_prefix=' + "'" + self.customer_prefix.encode('ascii', 'replace') + "'")
        if self.customer_suffix is not None:
            field_reprs.append('customer_suffix=' + "'" + self.customer_suffix.encode('ascii', 'replace') + "'")
        if self.customer_taxvat is not None:
            field_reprs.append('customer_taxvat=' + "'" + self.customer_taxvat.encode('ascii', 'replace') + "'")
        if self.discount_amount is not None:
            field_reprs.append('discount_amount=' + repr(self.discount_amount))
        if self.discount_canceled is not None:
            field_reprs.append('discount_canceled=' + repr(self.discount_canceled))
        if self.discount_description is not None:
            field_reprs.append('discount_description=' + repr(self.discount_description))
        if self.discount_invoiced is not None:
            field_reprs.append('discount_invoiced=' + repr(self.discount_invoiced))
        if self.discount_refunded is not None:
            field_reprs.append('discount_refunded=' + repr(self.discount_refunded))
        if self.edit_increment is not None:
            field_reprs.append('edit_increment=' + "'" + self.edit_increment.encode('ascii', 'replace') + "'")
        if self.email_sent is not None:
            field_reprs.append('email_sent=' + repr(self.email_sent))
        if self.forced_do_shipment_with_invoice is not None:
            field_reprs.append('forced_do_shipment_with_invoice=' + repr(self.forced_do_shipment_with_invoice))
        if self.forced_shipment_with_invoice is not None:
            field_reprs.append('forced_shipment_with_invoice=' + repr(self.forced_shipment_with_invoice))
        if self.gift_message_id is not None:
            field_reprs.append('gift_message_id=' + repr(self.gift_message_id))
        if self.global_currency_code is not None:
            field_reprs.append('global_currency_code=' + "'" + self.global_currency_code.encode('ascii', 'replace') + "'")
        field_reprs.append('grand_total=' + repr(self.grand_total))
        if self.hidden_tax_amount is not None:
            field_reprs.append('hidden_tax_amount=' + repr(self.hidden_tax_amount))
        if self.hidden_tax_invoiced is not None:
            field_reprs.append('hidden_tax_invoiced=' + repr(self.hidden_tax_invoiced))
        if self.hidden_tax_refunded is not None:
            field_reprs.append('hidden_tax_refunded=' + repr(self.hidden_tax_refunded))
        field_reprs.append('increment_id=' + "'" + self.increment_id.encode('ascii', 'replace') + "'")
        if self.is_hold is not None:
            field_reprs.append('is_hold=' + repr(self.is_hold))
        if self.is_multi_payment is not None:
            field_reprs.append('is_multi_payment=' + repr(self.is_multi_payment))
        field_reprs.append('is_virtual=' + repr(self.is_virtual))
        if self.items is not None:
            field_reprs.append('items=' + repr(self.items))
        field_reprs.append('order_currency_code=' + "'" + self.order_currency_code.encode('ascii', 'replace') + "'")
        if self.order_id is not None:
            field_reprs.append('order_id=' + repr(self.order_id))
        if self.original_increment_id is not None:
            field_reprs.append('original_increment_id=' + "'" + self.original_increment_id.encode('ascii', 'replace') + "'")
        if self.quote_id is not None:
            field_reprs.append('quote_id=' + repr(self.quote_id))
        if self.relation_child_id is not None:
            field_reprs.append('relation_child_id=' + repr(self.relation_child_id))
        if self.relation_child_real_id is not None:
            field_reprs.append('relation_child_real_id=' + repr(self.relation_child_real_id))
        if self.relation_parent_id is not None:
            field_reprs.append('relation_parent_id=' + repr(self.relation_parent_id))
        if self.relation_parent_real_id is not None:
            field_reprs.append('relation_parent_real_id=' + repr(self.relation_parent_real_id))
        if self.remote_ip is not None:
            field_reprs.append('remote_ip=' + "'" + self.remote_ip.encode('ascii', 'replace') + "'")
        if self.shipping_address is not None:
            field_reprs.append('shipping_address=' + repr(self.shipping_address))
        if self.shipping_address_id is not None:
            field_reprs.append('shipping_address_id=' + repr(self.shipping_address_id))
        if self.shipping_amount is not None:
            field_reprs.append('shipping_amount=' + repr(self.shipping_amount))
        if self.shipping_canceled is not None:
            field_reprs.append('shipping_canceled=' + repr(self.shipping_canceled))
        if self.shipping_description is not None:
            field_reprs.append('shipping_description=' + "'" + self.shipping_description.encode('ascii', 'replace') + "'")
        if self.shipping_discount_amount is not None:
            field_reprs.append('shipping_discount_amount=' + repr(self.shipping_discount_amount))
        if self.shipping_hidden_tax_amount is not None:
            field_reprs.append('shipping_hidden_tax_amount=' + repr(self.shipping_hidden_tax_amount))
        if self.shipping_incl_tax is not None:
            field_reprs.append('shipping_incl_tax=' + repr(self.shipping_incl_tax))
        if self.shipping_invoiced is not None:
            field_reprs.append('shipping_invoiced=' + repr(self.shipping_invoiced))
        if self.shipping_method is not None:
            field_reprs.append('shipping_method=' + "'" + self.shipping_method.encode('ascii', 'replace') + "'")
        if self.shipping_refunded is not None:
            field_reprs.append('shipping_refunded=' + repr(self.shipping_refunded))
        if self.shipping_tax_amount is not None:
            field_reprs.append('shipping_tax_amount=' + repr(self.shipping_tax_amount))
        if self.shipping_tax_refunded is not None:
            field_reprs.append('shipping_tax_refunded=' + repr(self.shipping_tax_refunded))
        if self.state is not None:
            field_reprs.append('state=' + "'" + self.state.encode('ascii', 'replace') + "'")
        if self.status is not None:
            field_reprs.append('status=' + repr(self.status))
        if self.status_history is not None:
            field_reprs.append('status_history=' + repr(self.status_history))
        if self.store_currency_code is not None:
            field_reprs.append('store_currency_code=' + "'" + self.store_currency_code.encode('ascii', 'replace') + "'")
        if self.store_id is not None:
            field_reprs.append('store_id=' + repr(self.store_id))
        if self.store_name is not None:
            field_reprs.append('store_name=' + "'" + self.store_name.encode('ascii', 'replace') + "'")
        if self.store_to_base_rate is not None:
            field_reprs.append('store_to_base_rate=' + repr(self.store_to_base_rate))
        if self.store_to_order_rate is not None:
            field_reprs.append('store_to_order_rate=' + repr(self.store_to_order_rate))
        if self.subtotal is not None:
            field_reprs.append('subtotal=' + repr(self.subtotal))
        if self.subtotal_canceled is not None:
            field_reprs.append('subtotal_canceled=' + repr(self.subtotal_canceled))
        if self.subtotal_incl_tax is not None:
            field_reprs.append('subtotal_incl_tax=' + repr(self.subtotal_incl_tax))
        if self.subtotal_invoiced is not None:
            field_reprs.append('subtotal_invoiced=' + repr(self.subtotal_invoiced))
        if self.subtotal_refunded is not None:
            field_reprs.append('subtotal_refunded=' + repr(self.subtotal_refunded))
        if self.tax_amount is not None:
            field_reprs.append('tax_amount=' + repr(self.tax_amount))
        if self.tax_canceled is not None:
            field_reprs.append('tax_canceled=' + repr(self.tax_canceled))
        if self.tax_invoiced is not None:
            field_reprs.append('tax_invoiced=' + repr(self.tax_invoiced))
        if self.tax_percent is not None:
            field_reprs.append('tax_percent=' + repr(self.tax_percent))
        if self.tax_refunded is not None:
            field_reprs.append('tax_refunded=' + repr(self.tax_refunded))
        if self.total_canceled is not None:
            field_reprs.append('total_canceled=' + repr(self.total_canceled))
        if self.total_due is not None:
            field_reprs.append('total_due=' + repr(self.total_due))
        if self.total_invoiced is not None:
            field_reprs.append('total_invoiced=' + repr(self.total_invoiced))
        if self.total_item_count is not None:
            field_reprs.append('total_item_count=' + repr(self.total_item_count))
        if self.total_offline_refunded is not None:
            field_reprs.append('total_offline_refunded=' + repr(self.total_offline_refunded))
        if self.total_online_refunded is not None:
            field_reprs.append('total_online_refunded=' + repr(self.total_online_refunded))
        if self.total_paid is not None:
            field_reprs.append('total_paid=' + repr(self.total_paid))
        if self.total_qty_ordered is not None:
            field_reprs.append('total_qty_ordered=' + repr(self.total_qty_ordered))
        if self.total_refunded is not None:
            field_reprs.append('total_refunded=' + repr(self.total_refunded))
        if self.tracking_numbers is not None:
            field_reprs.append('tracking_numbers=' + repr(self.tracking_numbers))
        field_reprs.append('updated_at=' + repr(self.updated_at))
        if self.weight is not None:
            field_reprs.append('weight=' + repr(self.weight))
        if self.x_forwarded_for is not None:
            field_reprs.append('x_forwarded_for=' + "'" + self.x_forwarded_for.encode('ascii', 'replace') + "'")
        return 'MagentoOrder(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        if self.adjustment_negative is not None:
            field_reprs.append('adjustment_negative=' + repr(self.adjustment_negative))
        if self.adjustment_positive is not None:
            field_reprs.append('adjustment_positive=' + repr(self.adjustment_positive))
        if self.base_adjustment_negative is not None:
            field_reprs.append('base_adjustment_negative=' + repr(self.base_adjustment_negative))
        if self.base_adjustment_positive is not None:
            field_reprs.append('base_adjustment_positive=' + repr(self.base_adjustment_positive))
        if self.base_currency_code is not None:
            field_reprs.append('base_currency_code=' + "'" + self.base_currency_code.encode('ascii', 'replace') + "'")
        if self.base_custbalance_amount is not None:
            field_reprs.append('base_custbalance_amount=' + repr(self.base_custbalance_amount))
        if self.base_discount_amount is not None:
            field_reprs.append('base_discount_amount=' + repr(self.base_discount_amount))
        if self.base_discount_canceled is not None:
            field_reprs.append('base_discount_canceled=' + repr(self.base_discount_canceled))
        if self.base_discount_invoiced is not None:
            field_reprs.append('base_discount_invoiced=' + repr(self.base_discount_invoiced))
        if self.base_discount_refunded is not None:
            field_reprs.append('base_discount_refunded=' + repr(self.base_discount_refunded))
        if self.base_grand_total is not None:
            field_reprs.append('base_grand_total=' + repr(self.base_grand_total))
        if self.base_hidden_tax_amount is not None:
            field_reprs.append('base_hidden_tax_amount=' + repr(self.base_hidden_tax_amount))
        if self.base_hidden_tax_invoiced is not None:
            field_reprs.append('base_hidden_tax_invoiced=' + repr(self.base_hidden_tax_invoiced))
        if self.base_hidden_tax_refunded is not None:
            field_reprs.append('base_hidden_tax_refunded=' + repr(self.base_hidden_tax_refunded))
        if self.base_shipping_amount is not None:
            field_reprs.append('base_shipping_amount=' + repr(self.base_shipping_amount))
        if self.base_shipping_canceled is not None:
            field_reprs.append('base_shipping_canceled=' + repr(self.base_shipping_canceled))
        if self.base_shipping_discount_amount is not None:
            field_reprs.append('base_shipping_discount_amount=' + repr(self.base_shipping_discount_amount))
        if self.base_shipping_hidden_tax_amnt is not None:
            field_reprs.append('base_shipping_hidden_tax_amnt=' + repr(self.base_shipping_hidden_tax_amnt))
        if self.base_shipping_hidden_tax_amount is not None:
            field_reprs.append('base_shipping_hidden_tax_amount=' + repr(self.base_shipping_hidden_tax_amount))
        if self.base_shipping_incl_tax is not None:
            field_reprs.append('base_shipping_incl_tax=' + repr(self.base_shipping_incl_tax))
        if self.base_shipping_invoiced is not None:
            field_reprs.append('base_shipping_invoiced=' + repr(self.base_shipping_invoiced))
        if self.base_shipping_refunded is not None:
            field_reprs.append('base_shipping_refunded=' + repr(self.base_shipping_refunded))
        if self.base_shipping_tax_amount is not None:
            field_reprs.append('base_shipping_tax_amount=' + repr(self.base_shipping_tax_amount))
        if self.base_shipping_tax_refunded is not None:
            field_reprs.append('base_shipping_tax_refunded=' + repr(self.base_shipping_tax_refunded))
        if self.base_subtotal is not None:
            field_reprs.append('base_subtotal=' + repr(self.base_subtotal))
        if self.base_subtotal_canceled is not None:
            field_reprs.append('base_subtotal_canceled=' + repr(self.base_subtotal_canceled))
        if self.base_subtotal_incl_tax is not None:
            field_reprs.append('base_subtotal_incl_tax=' + repr(self.base_subtotal_incl_tax))
        if self.base_subtotal_invoiced is not None:
            field_reprs.append('base_subtotal_invoiced=' + repr(self.base_subtotal_invoiced))
        if self.base_subtotal_refunded is not None:
            field_reprs.append('base_subtotal_refunded=' + repr(self.base_subtotal_refunded))
        if self.base_tax_amount is not None:
            field_reprs.append('base_tax_amount=' + repr(self.base_tax_amount))
        if self.base_tax_canceled is not None:
            field_reprs.append('base_tax_canceled=' + repr(self.base_tax_canceled))
        if self.base_tax_invoiced is not None:
            field_reprs.append('base_tax_invoiced=' + repr(self.base_tax_invoiced))
        if self.base_tax_refunded is not None:
            field_reprs.append('base_tax_refunded=' + repr(self.base_tax_refunded))
        if self.base_to_global_rate is not None:
            field_reprs.append('base_to_global_rate=' + repr(self.base_to_global_rate))
        if self.base_to_order_rate is not None:
            field_reprs.append('base_to_order_rate=' + repr(self.base_to_order_rate))
        if self.base_total_canceled is not None:
            field_reprs.append('base_total_canceled=' + repr(self.base_total_canceled))
        if self.base_total_due is not None:
            field_reprs.append('base_total_due=' + repr(self.base_total_due))
        if self.base_total_invoiced is not None:
            field_reprs.append('base_total_invoiced=' + repr(self.base_total_invoiced))
        if self.base_total_invoiced_cost is not None:
            field_reprs.append('base_total_invoiced_cost=' + repr(self.base_total_invoiced_cost))
        if self.base_total_offline_refunded is not None:
            field_reprs.append('base_total_offline_refunded=' + repr(self.base_total_offline_refunded))
        if self.base_total_online_refunded is not None:
            field_reprs.append('base_total_online_refunded=' + repr(self.base_total_online_refunded))
        if self.base_total_paid is not None:
            field_reprs.append('base_total_paid=' + repr(self.base_total_paid))
        if self.base_total_qty_ordered is not None:
            field_reprs.append('base_total_qty_ordered=' + repr(self.base_total_qty_ordered))
        if self.base_total_refunded is not None:
            field_reprs.append('base_total_refunded=' + repr(self.base_total_refunded))
        if self.billing_address is not None:
            field_reprs.append('billing_address=' + repr(self.billing_address))
        if self.billing_address_id is not None:
            field_reprs.append('billing_address_id=' + repr(self.billing_address_id))
        if self.can_ship_partially is not None:
            field_reprs.append('can_ship_partially=' + repr(self.can_ship_partially))
        if self.can_ship_partially_item is not None:
            field_reprs.append('can_ship_partially_item=' + repr(self.can_ship_partially_item))
        if self.coupon_code is not None:
            field_reprs.append('coupon_code=' + "'" + self.coupon_code.encode('ascii', 'replace') + "'")
        if self.coupon_rule_name is not None:
            field_reprs.append('coupon_rule_name=' + "'" + self.coupon_rule_name.encode('ascii', 'replace') + "'")
        field_reprs.append('created_at=' + repr(self.created_at))
        if self.currency_code is not None:
            field_reprs.append('currency_code=' + "'" + self.currency_code.encode('ascii', 'replace') + "'")
        if self.currency_rate is not None:
            field_reprs.append('currency_rate=' + "'" + self.currency_rate.encode('ascii', 'replace') + "'")
        if self.custbalance_amount is not None:
            field_reprs.append('custbalance_amount=' + "'" + self.custbalance_amount.encode('ascii', 'replace') + "'")
        if self.customer_dob is not None:
            field_reprs.append('customer_dob=' + "'" + self.customer_dob.encode('ascii', 'replace') + "'")
        if self.customer_email is not None:
            field_reprs.append('customer_email=' + "'" + self.customer_email.encode('ascii', 'replace') + "'")
        if self.customer_firstname is not None:
            field_reprs.append('customer_firstname=' + "'" + self.customer_firstname.encode('ascii', 'replace') + "'")
        if self.customer_gender is not None:
            field_reprs.append('customer_gender=' + "'" + self.customer_gender.encode('ascii', 'replace') + "'")
        if self.customer_group_id is not None:
            field_reprs.append('customer_group_id=' + repr(self.customer_group_id))
        if self.customer_id is not None:
            field_reprs.append('customer_id=' + repr(self.customer_id))
        if self.customer_is_guest is not None:
            field_reprs.append('customer_is_guest=' + repr(self.customer_is_guest))
        if self.customer_lastname is not None:
            field_reprs.append('customer_lastname=' + "'" + self.customer_lastname.encode('ascii', 'replace') + "'")
        if self.customer_middlename is not None:
            field_reprs.append('customer_middlename=' + "'" + self.customer_middlename.encode('ascii', 'replace') + "'")
        if self.customer_note is not None:
            field_reprs.append('customer_note=' + "'" + self.customer_note.encode('ascii', 'replace') + "'")
        if self.customer_note_notify is not None:
            field_reprs.append('customer_note_notify=' + repr(self.customer_note_notify))
        if self.customer_prefix is not None:
            field_reprs.append('customer_prefix=' + "'" + self.customer_prefix.encode('ascii', 'replace') + "'")
        if self.customer_suffix is not None:
            field_reprs.append('customer_suffix=' + "'" + self.customer_suffix.encode('ascii', 'replace') + "'")
        if self.customer_taxvat is not None:
            field_reprs.append('customer_taxvat=' + "'" + self.customer_taxvat.encode('ascii', 'replace') + "'")
        if self.discount_amount is not None:
            field_reprs.append('discount_amount=' + repr(self.discount_amount))
        if self.discount_canceled is not None:
            field_reprs.append('discount_canceled=' + repr(self.discount_canceled))
        if self.discount_description is not None:
            field_reprs.append('discount_description=' + repr(self.discount_description))
        if self.discount_invoiced is not None:
            field_reprs.append('discount_invoiced=' + repr(self.discount_invoiced))
        if self.discount_refunded is not None:
            field_reprs.append('discount_refunded=' + repr(self.discount_refunded))
        if self.edit_increment is not None:
            field_reprs.append('edit_increment=' + "'" + self.edit_increment.encode('ascii', 'replace') + "'")
        if self.email_sent is not None:
            field_reprs.append('email_sent=' + repr(self.email_sent))
        if self.forced_do_shipment_with_invoice is not None:
            field_reprs.append('forced_do_shipment_with_invoice=' + repr(self.forced_do_shipment_with_invoice))
        if self.forced_shipment_with_invoice is not None:
            field_reprs.append('forced_shipment_with_invoice=' + repr(self.forced_shipment_with_invoice))
        if self.gift_message_id is not None:
            field_reprs.append('gift_message_id=' + repr(self.gift_message_id))
        if self.global_currency_code is not None:
            field_reprs.append('global_currency_code=' + "'" + self.global_currency_code.encode('ascii', 'replace') + "'")
        field_reprs.append('grand_total=' + repr(self.grand_total))
        if self.hidden_tax_amount is not None:
            field_reprs.append('hidden_tax_amount=' + repr(self.hidden_tax_amount))
        if self.hidden_tax_invoiced is not None:
            field_reprs.append('hidden_tax_invoiced=' + repr(self.hidden_tax_invoiced))
        if self.hidden_tax_refunded is not None:
            field_reprs.append('hidden_tax_refunded=' + repr(self.hidden_tax_refunded))
        field_reprs.append('increment_id=' + "'" + self.increment_id.encode('ascii', 'replace') + "'")
        if self.is_hold is not None:
            field_reprs.append('is_hold=' + repr(self.is_hold))
        if self.is_multi_payment is not None:
            field_reprs.append('is_multi_payment=' + repr(self.is_multi_payment))
        field_reprs.append('is_virtual=' + repr(self.is_virtual))
        if self.items is not None:
            field_reprs.append('items=' + repr(self.items))
        field_reprs.append('order_currency_code=' + "'" + self.order_currency_code.encode('ascii', 'replace') + "'")
        if self.order_id is not None:
            field_reprs.append('order_id=' + repr(self.order_id))
        if self.original_increment_id is not None:
            field_reprs.append('original_increment_id=' + "'" + self.original_increment_id.encode('ascii', 'replace') + "'")
        if self.quote_id is not None:
            field_reprs.append('quote_id=' + repr(self.quote_id))
        if self.relation_child_id is not None:
            field_reprs.append('relation_child_id=' + repr(self.relation_child_id))
        if self.relation_child_real_id is not None:
            field_reprs.append('relation_child_real_id=' + repr(self.relation_child_real_id))
        if self.relation_parent_id is not None:
            field_reprs.append('relation_parent_id=' + repr(self.relation_parent_id))
        if self.relation_parent_real_id is not None:
            field_reprs.append('relation_parent_real_id=' + repr(self.relation_parent_real_id))
        if self.remote_ip is not None:
            field_reprs.append('remote_ip=' + "'" + self.remote_ip.encode('ascii', 'replace') + "'")
        if self.shipping_address is not None:
            field_reprs.append('shipping_address=' + repr(self.shipping_address))
        if self.shipping_address_id is not None:
            field_reprs.append('shipping_address_id=' + repr(self.shipping_address_id))
        if self.shipping_amount is not None:
            field_reprs.append('shipping_amount=' + repr(self.shipping_amount))
        if self.shipping_canceled is not None:
            field_reprs.append('shipping_canceled=' + repr(self.shipping_canceled))
        if self.shipping_description is not None:
            field_reprs.append('shipping_description=' + "'" + self.shipping_description.encode('ascii', 'replace') + "'")
        if self.shipping_discount_amount is not None:
            field_reprs.append('shipping_discount_amount=' + repr(self.shipping_discount_amount))
        if self.shipping_hidden_tax_amount is not None:
            field_reprs.append('shipping_hidden_tax_amount=' + repr(self.shipping_hidden_tax_amount))
        if self.shipping_incl_tax is not None:
            field_reprs.append('shipping_incl_tax=' + repr(self.shipping_incl_tax))
        if self.shipping_invoiced is not None:
            field_reprs.append('shipping_invoiced=' + repr(self.shipping_invoiced))
        if self.shipping_method is not None:
            field_reprs.append('shipping_method=' + "'" + self.shipping_method.encode('ascii', 'replace') + "'")
        if self.shipping_refunded is not None:
            field_reprs.append('shipping_refunded=' + repr(self.shipping_refunded))
        if self.shipping_tax_amount is not None:
            field_reprs.append('shipping_tax_amount=' + repr(self.shipping_tax_amount))
        if self.shipping_tax_refunded is not None:
            field_reprs.append('shipping_tax_refunded=' + repr(self.shipping_tax_refunded))
        if self.state is not None:
            field_reprs.append('state=' + "'" + self.state.encode('ascii', 'replace') + "'")
        if self.status is not None:
            field_reprs.append('status=' + repr(self.status))
        if self.status_history is not None:
            field_reprs.append('status_history=' + repr(self.status_history))
        if self.store_currency_code is not None:
            field_reprs.append('store_currency_code=' + "'" + self.store_currency_code.encode('ascii', 'replace') + "'")
        if self.store_id is not None:
            field_reprs.append('store_id=' + repr(self.store_id))
        if self.store_name is not None:
            field_reprs.append('store_name=' + "'" + self.store_name.encode('ascii', 'replace') + "'")
        if self.store_to_base_rate is not None:
            field_reprs.append('store_to_base_rate=' + repr(self.store_to_base_rate))
        if self.store_to_order_rate is not None:
            field_reprs.append('store_to_order_rate=' + repr(self.store_to_order_rate))
        if self.subtotal is not None:
            field_reprs.append('subtotal=' + repr(self.subtotal))
        if self.subtotal_canceled is not None:
            field_reprs.append('subtotal_canceled=' + repr(self.subtotal_canceled))
        if self.subtotal_incl_tax is not None:
            field_reprs.append('subtotal_incl_tax=' + repr(self.subtotal_incl_tax))
        if self.subtotal_invoiced is not None:
            field_reprs.append('subtotal_invoiced=' + repr(self.subtotal_invoiced))
        if self.subtotal_refunded is not None:
            field_reprs.append('subtotal_refunded=' + repr(self.subtotal_refunded))
        if self.tax_amount is not None:
            field_reprs.append('tax_amount=' + repr(self.tax_amount))
        if self.tax_canceled is not None:
            field_reprs.append('tax_canceled=' + repr(self.tax_canceled))
        if self.tax_invoiced is not None:
            field_reprs.append('tax_invoiced=' + repr(self.tax_invoiced))
        if self.tax_percent is not None:
            field_reprs.append('tax_percent=' + repr(self.tax_percent))
        if self.tax_refunded is not None:
            field_reprs.append('tax_refunded=' + repr(self.tax_refunded))
        if self.total_canceled is not None:
            field_reprs.append('total_canceled=' + repr(self.total_canceled))
        if self.total_due is not None:
            field_reprs.append('total_due=' + repr(self.total_due))
        if self.total_invoiced is not None:
            field_reprs.append('total_invoiced=' + repr(self.total_invoiced))
        if self.total_item_count is not None:
            field_reprs.append('total_item_count=' + repr(self.total_item_count))
        if self.total_offline_refunded is not None:
            field_reprs.append('total_offline_refunded=' + repr(self.total_offline_refunded))
        if self.total_online_refunded is not None:
            field_reprs.append('total_online_refunded=' + repr(self.total_online_refunded))
        if self.total_paid is not None:
            field_reprs.append('total_paid=' + repr(self.total_paid))
        if self.total_qty_ordered is not None:
            field_reprs.append('total_qty_ordered=' + repr(self.total_qty_ordered))
        if self.total_refunded is not None:
            field_reprs.append('total_refunded=' + repr(self.total_refunded))
        if self.tracking_numbers is not None:
            field_reprs.append('tracking_numbers=' + repr(self.tracking_numbers))
        field_reprs.append('updated_at=' + repr(self.updated_at))
        if self.weight is not None:
            field_reprs.append('weight=' + repr(self.weight))
        if self.x_forwarded_for is not None:
            field_reprs.append('x_forwarded_for=' + "'" + self.x_forwarded_for.encode('ascii', 'replace') + "'")
        return 'MagentoOrder(' + ', '.join(field_reprs) + ')'

    @property
    def adjustment_negative(self):
        return self.__adjustment_negative

    @property
    def adjustment_positive(self):
        return self.__adjustment_positive

    def as_dict(self):
        return {'adjustment_negative': self.adjustment_negative, 'adjustment_positive': self.adjustment_positive, 'base_adjustment_negative': self.base_adjustment_negative, 'base_adjustment_positive': self.base_adjustment_positive, 'base_currency_code': self.base_currency_code, 'base_custbalance_amount': self.base_custbalance_amount, 'base_discount_amount': self.base_discount_amount, 'base_discount_canceled': self.base_discount_canceled, 'base_discount_invoiced': self.base_discount_invoiced, 'base_discount_refunded': self.base_discount_refunded, 'base_grand_total': self.base_grand_total, 'base_hidden_tax_amount': self.base_hidden_tax_amount, 'base_hidden_tax_invoiced': self.base_hidden_tax_invoiced, 'base_hidden_tax_refunded': self.base_hidden_tax_refunded, 'base_shipping_amount': self.base_shipping_amount, 'base_shipping_canceled': self.base_shipping_canceled, 'base_shipping_discount_amount': self.base_shipping_discount_amount, 'base_shipping_hidden_tax_amnt': self.base_shipping_hidden_tax_amnt, 'base_shipping_hidden_tax_amount': self.base_shipping_hidden_tax_amount, 'base_shipping_incl_tax': self.base_shipping_incl_tax, 'base_shipping_invoiced': self.base_shipping_invoiced, 'base_shipping_refunded': self.base_shipping_refunded, 'base_shipping_tax_amount': self.base_shipping_tax_amount, 'base_shipping_tax_refunded': self.base_shipping_tax_refunded, 'base_subtotal': self.base_subtotal, 'base_subtotal_canceled': self.base_subtotal_canceled, 'base_subtotal_incl_tax': self.base_subtotal_incl_tax, 'base_subtotal_invoiced': self.base_subtotal_invoiced, 'base_subtotal_refunded': self.base_subtotal_refunded, 'base_tax_amount': self.base_tax_amount, 'base_tax_canceled': self.base_tax_canceled, 'base_tax_invoiced': self.base_tax_invoiced, 'base_tax_refunded': self.base_tax_refunded, 'base_to_global_rate': self.base_to_global_rate, 'base_to_order_rate': self.base_to_order_rate, 'base_total_canceled': self.base_total_canceled, 'base_total_due': self.base_total_due, 'base_total_invoiced': self.base_total_invoiced, 'base_total_invoiced_cost': self.base_total_invoiced_cost, 'base_total_offline_refunded': self.base_total_offline_refunded, 'base_total_online_refunded': self.base_total_online_refunded, 'base_total_paid': self.base_total_paid, 'base_total_qty_ordered': self.base_total_qty_ordered, 'base_total_refunded': self.base_total_refunded, 'billing_address': self.billing_address, 'billing_address_id': self.billing_address_id, 'can_ship_partially': self.can_ship_partially, 'can_ship_partially_item': self.can_ship_partially_item, 'coupon_code': self.coupon_code, 'coupon_rule_name': self.coupon_rule_name, 'created_at': self.created_at, 'currency_code': self.currency_code, 'currency_rate': self.currency_rate, 'custbalance_amount': self.custbalance_amount, 'customer_dob': self.customer_dob, 'customer_email': self.customer_email, 'customer_firstname': self.customer_firstname, 'customer_gender': self.customer_gender, 'customer_group_id': self.customer_group_id, 'customer_id': self.customer_id, 'customer_is_guest': self.customer_is_guest, 'customer_lastname': self.customer_lastname, 'customer_middlename': self.customer_middlename, 'customer_note': self.customer_note, 'customer_note_notify': self.customer_note_notify, 'customer_prefix': self.customer_prefix, 'customer_suffix': self.customer_suffix, 'customer_taxvat': self.customer_taxvat, 'discount_amount': self.discount_amount, 'discount_canceled': self.discount_canceled, 'discount_description': self.discount_description, 'discount_invoiced': self.discount_invoiced, 'discount_refunded': self.discount_refunded, 'edit_increment': self.edit_increment, 'email_sent': self.email_sent, 'forced_do_shipment_with_invoice': self.forced_do_shipment_with_invoice, 'forced_shipment_with_invoice': self.forced_shipment_with_invoice, 'gift_message_id': self.gift_message_id, 'global_currency_code': self.global_currency_code, 'grand_total': self.grand_total, 'hidden_tax_amount': self.hidden_tax_amount, 'hidden_tax_invoiced': self.hidden_tax_invoiced, 'hidden_tax_refunded': self.hidden_tax_refunded, 'increment_id': self.increment_id, 'is_hold': self.is_hold, 'is_multi_payment': self.is_multi_payment, 'is_virtual': self.is_virtual, 'items': self.items, 'order_currency_code': self.order_currency_code, 'order_id': self.order_id, 'original_increment_id': self.original_increment_id, 'quote_id': self.quote_id, 'relation_child_id': self.relation_child_id, 'relation_child_real_id': self.relation_child_real_id, 'relation_parent_id': self.relation_parent_id, 'relation_parent_real_id': self.relation_parent_real_id, 'remote_ip': self.remote_ip, 'shipping_address': self.shipping_address, 'shipping_address_id': self.shipping_address_id, 'shipping_amount': self.shipping_amount, 'shipping_canceled': self.shipping_canceled, 'shipping_description': self.shipping_description, 'shipping_discount_amount': self.shipping_discount_amount, 'shipping_hidden_tax_amount': self.shipping_hidden_tax_amount, 'shipping_incl_tax': self.shipping_incl_tax, 'shipping_invoiced': self.shipping_invoiced, 'shipping_method': self.shipping_method, 'shipping_refunded': self.shipping_refunded, 'shipping_tax_amount': self.shipping_tax_amount, 'shipping_tax_refunded': self.shipping_tax_refunded, 'state': self.state, 'status': self.status, 'status_history': self.status_history, 'store_currency_code': self.store_currency_code, 'store_id': self.store_id, 'store_name': self.store_name, 'store_to_base_rate': self.store_to_base_rate, 'store_to_order_rate': self.store_to_order_rate, 'subtotal': self.subtotal, 'subtotal_canceled': self.subtotal_canceled, 'subtotal_incl_tax': self.subtotal_incl_tax, 'subtotal_invoiced': self.subtotal_invoiced, 'subtotal_refunded': self.subtotal_refunded, 'tax_amount': self.tax_amount, 'tax_canceled': self.tax_canceled, 'tax_invoiced': self.tax_invoiced, 'tax_percent': self.tax_percent, 'tax_refunded': self.tax_refunded, 'total_canceled': self.total_canceled, 'total_due': self.total_due, 'total_invoiced': self.total_invoiced, 'total_item_count': self.total_item_count, 'total_offline_refunded': self.total_offline_refunded, 'total_online_refunded': self.total_online_refunded, 'total_paid': self.total_paid, 'total_qty_ordered': self.total_qty_ordered, 'total_refunded': self.total_refunded, 'tracking_numbers': self.tracking_numbers, 'updated_at': self.updated_at, 'weight': self.weight, 'x_forwarded_for': self.x_forwarded_for}

    @property
    def base_adjustment_negative(self):
        return self.__base_adjustment_negative

    @property
    def base_adjustment_positive(self):
        return self.__base_adjustment_positive

    @property
    def base_currency_code(self):
        return self.__base_currency_code

    @property
    def base_custbalance_amount(self):
        return self.__base_custbalance_amount

    @property
    def base_discount_amount(self):
        return self.__base_discount_amount

    @property
    def base_discount_canceled(self):
        return self.__base_discount_canceled

    @property
    def base_discount_invoiced(self):
        return self.__base_discount_invoiced

    @property
    def base_discount_refunded(self):
        return self.__base_discount_refunded

    @property
    def base_grand_total(self):
        return self.__base_grand_total

    @property
    def base_hidden_tax_amount(self):
        return self.__base_hidden_tax_amount

    @property
    def base_hidden_tax_invoiced(self):
        return self.__base_hidden_tax_invoiced

    @property
    def base_hidden_tax_refunded(self):
        return self.__base_hidden_tax_refunded

    @property
    def base_shipping_amount(self):
        return self.__base_shipping_amount

    @property
    def base_shipping_canceled(self):
        return self.__base_shipping_canceled

    @property
    def base_shipping_discount_amount(self):
        return self.__base_shipping_discount_amount

    @property
    def base_shipping_hidden_tax_amnt(self):
        return self.__base_shipping_hidden_tax_amnt

    @property
    def base_shipping_hidden_tax_amount(self):
        return self.__base_shipping_hidden_tax_amount

    @property
    def base_shipping_incl_tax(self):
        return self.__base_shipping_incl_tax

    @property
    def base_shipping_invoiced(self):
        return self.__base_shipping_invoiced

    @property
    def base_shipping_refunded(self):
        return self.__base_shipping_refunded

    @property
    def base_shipping_tax_amount(self):
        return self.__base_shipping_tax_amount

    @property
    def base_shipping_tax_refunded(self):
        return self.__base_shipping_tax_refunded

    @property
    def base_subtotal(self):
        return self.__base_subtotal

    @property
    def base_subtotal_canceled(self):
        return self.__base_subtotal_canceled

    @property
    def base_subtotal_incl_tax(self):
        return self.__base_subtotal_incl_tax

    @property
    def base_subtotal_invoiced(self):
        return self.__base_subtotal_invoiced

    @property
    def base_subtotal_refunded(self):
        return self.__base_subtotal_refunded

    @property
    def base_tax_amount(self):
        return self.__base_tax_amount

    @property
    def base_tax_canceled(self):
        return self.__base_tax_canceled

    @property
    def base_tax_invoiced(self):
        return self.__base_tax_invoiced

    @property
    def base_tax_refunded(self):
        return self.__base_tax_refunded

    @property
    def base_to_global_rate(self):
        return self.__base_to_global_rate

    @property
    def base_to_order_rate(self):
        return self.__base_to_order_rate

    @property
    def base_total_canceled(self):
        return self.__base_total_canceled

    @property
    def base_total_due(self):
        return self.__base_total_due

    @property
    def base_total_invoiced(self):
        return self.__base_total_invoiced

    @property
    def base_total_invoiced_cost(self):
        return self.__base_total_invoiced_cost

    @property
    def base_total_offline_refunded(self):
        return self.__base_total_offline_refunded

    @property
    def base_total_online_refunded(self):
        return self.__base_total_online_refunded

    @property
    def base_total_paid(self):
        return self.__base_total_paid

    @property
    def base_total_qty_ordered(self):
        return self.__base_total_qty_ordered

    @property
    def base_total_refunded(self):
        return self.__base_total_refunded

    @property
    def billing_address(self):
        return self.__billing_address

    @property
    def billing_address_id(self):
        return self.__billing_address_id

    @property
    def can_ship_partially(self):
        return self.__can_ship_partially

    @property
    def can_ship_partially_item(self):
        return self.__can_ship_partially_item

    @property
    def coupon_code(self):
        return self.__coupon_code

    @property
    def coupon_rule_name(self):
        return self.__coupon_rule_name

    @property
    def created_at(self):
        return self.__created_at

    @property
    def currency_code(self):
        return self.__currency_code

    @property
    def currency_rate(self):
        return self.__currency_rate

    @property
    def custbalance_amount(self):
        return self.__custbalance_amount

    @property
    def customer_dob(self):
        return self.__customer_dob

    @property
    def customer_email(self):
        return self.__customer_email

    @property
    def customer_firstname(self):
        return self.__customer_firstname

    @property
    def customer_gender(self):
        return self.__customer_gender

    @property
    def customer_group_id(self):
        return self.__customer_group_id

    @property
    def customer_id(self):
        return self.__customer_id

    @property
    def customer_is_guest(self):
        return self.__customer_is_guest

    @property
    def customer_lastname(self):
        return self.__customer_lastname

    @property
    def customer_middlename(self):
        return self.__customer_middlename

    @property
    def customer_note(self):
        return self.__customer_note

    @property
    def customer_note_notify(self):
        return self.__customer_note_notify

    @property
    def customer_prefix(self):
        return self.__customer_prefix

    @property
    def customer_suffix(self):
        return self.__customer_suffix

    @property
    def customer_taxvat(self):
        return self.__customer_taxvat

    @property
    def discount_amount(self):
        return self.__discount_amount

    @property
    def discount_canceled(self):
        return self.__discount_canceled

    @property
    def discount_description(self):
        return self.__discount_description

    @property
    def discount_invoiced(self):
        return self.__discount_invoiced

    @property
    def discount_refunded(self):
        return self.__discount_refunded

    @property
    def edit_increment(self):
        return self.__edit_increment

    @property
    def email_sent(self):
        return self.__email_sent

    @property
    def forced_do_shipment_with_invoice(self):
        return self.__forced_do_shipment_with_invoice

    @property
    def forced_shipment_with_invoice(self):
        return self.__forced_shipment_with_invoice

    @property
    def gift_message_id(self):
        return self.__gift_message_id

    @property
    def global_currency_code(self):
        return self.__global_currency_code

    @property
    def grand_total(self):
        return self.__grand_total

    @property
    def hidden_tax_amount(self):
        return self.__hidden_tax_amount

    @property
    def hidden_tax_invoiced(self):
        return self.__hidden_tax_invoiced

    @property
    def hidden_tax_refunded(self):
        return self.__hidden_tax_refunded

    @property
    def increment_id(self):
        return self.__increment_id

    @property
    def is_hold(self):
        return self.__is_hold

    @property
    def is_multi_payment(self):
        return self.__is_multi_payment

    @property
    def is_virtual(self):
        return self.__is_virtual

    @property
    def items(self):
        return self.__items

    @property
    def order_currency_code(self):
        return self.__order_currency_code

    @property
    def order_id(self):
        return self.__order_id

    @property
    def original_increment_id(self):
        return self.__original_increment_id

    @property
    def quote_id(self):
        return self.__quote_id

    @classmethod
    def read(cls, iprot):
        init_kwds = {}

        iprot.readStructBegin()
        while True:
            ifield_name, ifield_type, _ifield_id = iprot.readFieldBegin()
            if ifield_type == 0: # STOP
                break
            elif ifield_name == 'adjustment_negative':
                try:
                    init_kwds['adjustment_negative'] = iprot.readDecimal() if hasattr(iprot, 'readDecimal') else decimal.Decimal(iprot.readString())
                except (decimal.InvalidOperation, TypeError,):
                    pass
            elif ifield_name == 'adjustment_positive':
                try:
                    init_kwds['adjustment_positive'] = iprot.readDecimal() if hasattr(iprot, 'readDecimal') else decimal.Decimal(iprot.readString())
                except (decimal.InvalidOperation, TypeError,):
                    pass
            elif ifield_name == 'base_adjustment_negative':
                try:
                    init_kwds['base_adjustment_negative'] = iprot.readDecimal() if hasattr(iprot, 'readDecimal') else decimal.Decimal(iprot.readString())
                except (decimal.InvalidOperation, TypeError,):
                    pass
            elif ifield_name == 'base_adjustment_positive':
                try:
                    init_kwds['base_adjustment_positive'] = iprot.readDecimal() if hasattr(iprot, 'readDecimal') else decimal.Decimal(iprot.readString())
                except (decimal.InvalidOperation, TypeError,):
                    pass
            elif ifield_name == 'base_currency_code':
                try:
                    init_kwds['base_currency_code'] = iprot.readString()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'base_custbalance_amount':
                try:
                    init_kwds['base_custbalance_amount'] = iprot.readDecimal() if hasattr(iprot, 'readDecimal') else decimal.Decimal(iprot.readString())
                except (decimal.InvalidOperation, TypeError,):
                    pass
            elif ifield_name == 'base_discount_amount':
                try:
                    init_kwds['base_discount_amount'] = iprot.readDecimal() if hasattr(iprot, 'readDecimal') else decimal.Decimal(iprot.readString())
                except (decimal.InvalidOperation, TypeError,):
                    pass
            elif ifield_name == 'base_discount_canceled':
                try:
                    init_kwds['base_discount_canceled'] = iprot.readDecimal() if hasattr(iprot, 'readDecimal') else decimal.Decimal(iprot.readString())
                except (decimal.InvalidOperation, TypeError,):
                    pass
            elif ifield_name == 'base_discount_invoiced':
                try:
                    init_kwds['base_discount_invoiced'] = iprot.readDecimal() if hasattr(iprot, 'readDecimal') else decimal.Decimal(iprot.readString())
                except (decimal.InvalidOperation, TypeError,):
                    pass
            elif ifield_name == 'base_discount_refunded':
                try:
                    init_kwds['base_discount_refunded'] = iprot.readDecimal() if hasattr(iprot, 'readDecimal') else decimal.Decimal(iprot.readString())
                except (decimal.InvalidOperation, TypeError,):
                    pass
            elif ifield_name == 'base_grand_total':
                try:
                    init_kwds['base_grand_total'] = iprot.readDecimal() if hasattr(iprot, 'readDecimal') else decimal.Decimal(iprot.readString())
                except (decimal.InvalidOperation, TypeError,):
                    pass
            elif ifield_name == 'base_hidden_tax_amount':
                try:
                    init_kwds['base_hidden_tax_amount'] = iprot.readDecimal() if hasattr(iprot, 'readDecimal') else decimal.Decimal(iprot.readString())
                except (decimal.InvalidOperation, TypeError,):
                    pass
            elif ifield_name == 'base_hidden_tax_invoiced':
                try:
                    init_kwds['base_hidden_tax_invoiced'] = iprot.readDecimal() if hasattr(iprot, 'readDecimal') else decimal.Decimal(iprot.readString())
                except (decimal.InvalidOperation, TypeError,):
                    pass
            elif ifield_name == 'base_hidden_tax_refunded':
                try:
                    init_kwds['base_hidden_tax_refunded'] = iprot.readDecimal() if hasattr(iprot, 'readDecimal') else decimal.Decimal(iprot.readString())
                except (decimal.InvalidOperation, TypeError,):
                    pass
            elif ifield_name == 'base_shipping_amount':
                try:
                    init_kwds['base_shipping_amount'] = iprot.readDecimal() if hasattr(iprot, 'readDecimal') else decimal.Decimal(iprot.readString())
                except (decimal.InvalidOperation, TypeError,):
                    pass
            elif ifield_name == 'base_shipping_canceled':
                try:
                    init_kwds['base_shipping_canceled'] = iprot.readDecimal() if hasattr(iprot, 'readDecimal') else decimal.Decimal(iprot.readString())
                except (decimal.InvalidOperation, TypeError,):
                    pass
            elif ifield_name == 'base_shipping_discount_amount':
                try:
                    init_kwds['base_shipping_discount_amount'] = iprot.readDecimal() if hasattr(iprot, 'readDecimal') else decimal.Decimal(iprot.readString())
                except (decimal.InvalidOperation, TypeError,):
                    pass
            elif ifield_name == 'base_shipping_hidden_tax_amnt':
                try:
                    init_kwds['base_shipping_hidden_tax_amnt'] = iprot.readDecimal() if hasattr(iprot, 'readDecimal') else decimal.Decimal(iprot.readString())
                except (decimal.InvalidOperation, TypeError,):
                    pass
            elif ifield_name == 'base_shipping_hidden_tax_amount':
                try:
                    init_kwds['base_shipping_hidden_tax_amount'] = iprot.readDecimal() if hasattr(iprot, 'readDecimal') else decimal.Decimal(iprot.readString())
                except (decimal.InvalidOperation, TypeError,):
                    pass
            elif ifield_name == 'base_shipping_incl_tax':
                try:
                    init_kwds['base_shipping_incl_tax'] = iprot.readDecimal() if hasattr(iprot, 'readDecimal') else decimal.Decimal(iprot.readString())
                except (decimal.InvalidOperation, TypeError,):
                    pass
            elif ifield_name == 'base_shipping_invoiced':
                try:
                    init_kwds['base_shipping_invoiced'] = iprot.readDecimal() if hasattr(iprot, 'readDecimal') else decimal.Decimal(iprot.readString())
                except (decimal.InvalidOperation, TypeError,):
                    pass
            elif ifield_name == 'base_shipping_refunded':
                try:
                    init_kwds['base_shipping_refunded'] = iprot.readDecimal() if hasattr(iprot, 'readDecimal') else decimal.Decimal(iprot.readString())
                except (decimal.InvalidOperation, TypeError,):
                    pass
            elif ifield_name == 'base_shipping_tax_amount':
                try:
                    init_kwds['base_shipping_tax_amount'] = iprot.readDecimal() if hasattr(iprot, 'readDecimal') else decimal.Decimal(iprot.readString())
                except (decimal.InvalidOperation, TypeError,):
                    pass
            elif ifield_name == 'base_shipping_tax_refunded':
                try:
                    init_kwds['base_shipping_tax_refunded'] = iprot.readDecimal() if hasattr(iprot, 'readDecimal') else decimal.Decimal(iprot.readString())
                except (decimal.InvalidOperation, TypeError,):
                    pass
            elif ifield_name == 'base_subtotal':
                try:
                    init_kwds['base_subtotal'] = iprot.readDecimal() if hasattr(iprot, 'readDecimal') else decimal.Decimal(iprot.readString())
                except (decimal.InvalidOperation, TypeError,):
                    pass
            elif ifield_name == 'base_subtotal_canceled':
                try:
                    init_kwds['base_subtotal_canceled'] = iprot.readDecimal() if hasattr(iprot, 'readDecimal') else decimal.Decimal(iprot.readString())
                except (decimal.InvalidOperation, TypeError,):
                    pass
            elif ifield_name == 'base_subtotal_incl_tax':
                try:
                    init_kwds['base_subtotal_incl_tax'] = iprot.readDecimal() if hasattr(iprot, 'readDecimal') else decimal.Decimal(iprot.readString())
                except (decimal.InvalidOperation, TypeError,):
                    pass
            elif ifield_name == 'base_subtotal_invoiced':
                try:
                    init_kwds['base_subtotal_invoiced'] = iprot.readDecimal() if hasattr(iprot, 'readDecimal') else decimal.Decimal(iprot.readString())
                except (decimal.InvalidOperation, TypeError,):
                    pass
            elif ifield_name == 'base_subtotal_refunded':
                try:
                    init_kwds['base_subtotal_refunded'] = iprot.readDecimal() if hasattr(iprot, 'readDecimal') else decimal.Decimal(iprot.readString())
                except (decimal.InvalidOperation, TypeError,):
                    pass
            elif ifield_name == 'base_tax_amount':
                try:
                    init_kwds['base_tax_amount'] = iprot.readDecimal() if hasattr(iprot, 'readDecimal') else decimal.Decimal(iprot.readString())
                except (decimal.InvalidOperation, TypeError,):
                    pass
            elif ifield_name == 'base_tax_canceled':
                try:
                    init_kwds['base_tax_canceled'] = iprot.readDecimal() if hasattr(iprot, 'readDecimal') else decimal.Decimal(iprot.readString())
                except (decimal.InvalidOperation, TypeError,):
                    pass
            elif ifield_name == 'base_tax_invoiced':
                try:
                    init_kwds['base_tax_invoiced'] = iprot.readDecimal() if hasattr(iprot, 'readDecimal') else decimal.Decimal(iprot.readString())
                except (decimal.InvalidOperation, TypeError,):
                    pass
            elif ifield_name == 'base_tax_refunded':
                try:
                    init_kwds['base_tax_refunded'] = iprot.readDecimal() if hasattr(iprot, 'readDecimal') else decimal.Decimal(iprot.readString())
                except (decimal.InvalidOperation, TypeError,):
                    pass
            elif ifield_name == 'base_to_global_rate':
                try:
                    init_kwds['base_to_global_rate'] = iprot.readDecimal() if hasattr(iprot, 'readDecimal') else decimal.Decimal(iprot.readString())
                except (decimal.InvalidOperation, TypeError,):
                    pass
            elif ifield_name == 'base_to_order_rate':
                try:
                    init_kwds['base_to_order_rate'] = iprot.readDecimal() if hasattr(iprot, 'readDecimal') else decimal.Decimal(iprot.readString())
                except (decimal.InvalidOperation, TypeError,):
                    pass
            elif ifield_name == 'base_total_canceled':
                try:
                    init_kwds['base_total_canceled'] = iprot.readDecimal() if hasattr(iprot, 'readDecimal') else decimal.Decimal(iprot.readString())
                except (decimal.InvalidOperation, TypeError,):
                    pass
            elif ifield_name == 'base_total_due':
                try:
                    init_kwds['base_total_due'] = iprot.readDecimal() if hasattr(iprot, 'readDecimal') else decimal.Decimal(iprot.readString())
                except (decimal.InvalidOperation, TypeError,):
                    pass
            elif ifield_name == 'base_total_invoiced':
                try:
                    init_kwds['base_total_invoiced'] = iprot.readDecimal() if hasattr(iprot, 'readDecimal') else decimal.Decimal(iprot.readString())
                except (decimal.InvalidOperation, TypeError,):
                    pass
            elif ifield_name == 'base_total_invoiced_cost':
                try:
                    init_kwds['base_total_invoiced_cost'] = iprot.readDecimal() if hasattr(iprot, 'readDecimal') else decimal.Decimal(iprot.readString())
                except (decimal.InvalidOperation, TypeError,):
                    pass
            elif ifield_name == 'base_total_offline_refunded':
                try:
                    init_kwds['base_total_offline_refunded'] = iprot.readDecimal() if hasattr(iprot, 'readDecimal') else decimal.Decimal(iprot.readString())
                except (decimal.InvalidOperation, TypeError,):
                    pass
            elif ifield_name == 'base_total_online_refunded':
                try:
                    init_kwds['base_total_online_refunded'] = iprot.readDecimal() if hasattr(iprot, 'readDecimal') else decimal.Decimal(iprot.readString())
                except (decimal.InvalidOperation, TypeError,):
                    pass
            elif ifield_name == 'base_total_paid':
                try:
                    init_kwds['base_total_paid'] = iprot.readDecimal() if hasattr(iprot, 'readDecimal') else decimal.Decimal(iprot.readString())
                except (decimal.InvalidOperation, TypeError,):
                    pass
            elif ifield_name == 'base_total_qty_ordered':
                try:
                    init_kwds['base_total_qty_ordered'] = iprot.readDecimal() if hasattr(iprot, 'readDecimal') else decimal.Decimal(iprot.readString())
                except (decimal.InvalidOperation, TypeError,):
                    pass
            elif ifield_name == 'base_total_refunded':
                try:
                    init_kwds['base_total_refunded'] = iprot.readDecimal() if hasattr(iprot, 'readDecimal') else decimal.Decimal(iprot.readString())
                except (decimal.InvalidOperation, TypeError,):
                    pass
            elif ifield_name == 'billing_address':
                init_kwds['billing_address'] = yogento.api.models.sales.order.magento.magento_order_address.MagentoOrderAddress.read(iprot)
            elif ifield_name == 'billing_address_id':
                try:
                    init_kwds['billing_address_id'] = iprot.readI32()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'can_ship_partially':
                try:
                    init_kwds['can_ship_partially'] = iprot.readBool()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'can_ship_partially_item':
                try:
                    init_kwds['can_ship_partially_item'] = iprot.readBool()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'coupon_code':
                try:
                    init_kwds['coupon_code'] = iprot.readString()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'coupon_rule_name':
                try:
                    init_kwds['coupon_rule_name'] = iprot.readString()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'created_at':
                init_kwds['created_at'] = iprot.readDateTime() if hasattr(iprot, 'readDateTime') else datetime.fromtimestamp(iprot.readI64() / 1000.0)
            elif ifield_name == 'currency_code':
                try:
                    init_kwds['currency_code'] = iprot.readString()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'currency_rate':
                try:
                    init_kwds['currency_rate'] = iprot.readString()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'custbalance_amount':
                try:
                    init_kwds['custbalance_amount'] = iprot.readString()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'customer_dob':
                try:
                    init_kwds['customer_dob'] = iprot.readString()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'customer_email':
                try:
                    init_kwds['customer_email'] = iprot.readString()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'customer_firstname':
                try:
                    init_kwds['customer_firstname'] = iprot.readString()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'customer_gender':
                try:
                    init_kwds['customer_gender'] = iprot.readString()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'customer_group_id':
                try:
                    init_kwds['customer_group_id'] = iprot.readI32()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'customer_id':
                try:
                    init_kwds['customer_id'] = iprot.readI32()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'customer_is_guest':
                try:
                    init_kwds['customer_is_guest'] = iprot.readBool()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'customer_lastname':
                try:
                    init_kwds['customer_lastname'] = iprot.readString()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'customer_middlename':
                try:
                    init_kwds['customer_middlename'] = iprot.readString()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'customer_note':
                try:
                    init_kwds['customer_note'] = iprot.readString()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'customer_note_notify':
                try:
                    init_kwds['customer_note_notify'] = iprot.readBool()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'customer_prefix':
                try:
                    init_kwds['customer_prefix'] = iprot.readString()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'customer_suffix':
                try:
                    init_kwds['customer_suffix'] = iprot.readString()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'customer_taxvat':
                try:
                    init_kwds['customer_taxvat'] = iprot.readString()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'discount_amount':
                try:
                    init_kwds['discount_amount'] = iprot.readDecimal() if hasattr(iprot, 'readDecimal') else decimal.Decimal(iprot.readString())
                except (decimal.InvalidOperation, TypeError,):
                    pass
            elif ifield_name == 'discount_canceled':
                try:
                    init_kwds['discount_canceled'] = iprot.readDecimal() if hasattr(iprot, 'readDecimal') else decimal.Decimal(iprot.readString())
                except (decimal.InvalidOperation, TypeError,):
                    pass
            elif ifield_name == 'discount_description':
                try:
                    init_kwds['discount_description'] = iprot.readDecimal() if hasattr(iprot, 'readDecimal') else decimal.Decimal(iprot.readString())
                except (decimal.InvalidOperation, TypeError,):
                    pass
            elif ifield_name == 'discount_invoiced':
                try:
                    init_kwds['discount_invoiced'] = iprot.readDecimal() if hasattr(iprot, 'readDecimal') else decimal.Decimal(iprot.readString())
                except (decimal.InvalidOperation, TypeError,):
                    pass
            elif ifield_name == 'discount_refunded':
                try:
                    init_kwds['discount_refunded'] = iprot.readDecimal() if hasattr(iprot, 'readDecimal') else decimal.Decimal(iprot.readString())
                except (decimal.InvalidOperation, TypeError,):
                    pass
            elif ifield_name == 'edit_increment':
                try:
                    init_kwds['edit_increment'] = iprot.readString()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'email_sent':
                try:
                    init_kwds['email_sent'] = iprot.readBool()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'forced_do_shipment_with_invoice':
                try:
                    init_kwds['forced_do_shipment_with_invoice'] = iprot.readBool()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'forced_shipment_with_invoice':
                try:
                    init_kwds['forced_shipment_with_invoice'] = iprot.readBool()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'gift_message_id':
                try:
                    init_kwds['gift_message_id'] = iprot.readI32()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'global_currency_code':
                try:
                    init_kwds['global_currency_code'] = iprot.readString()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'grand_total':
                init_kwds['grand_total'] = iprot.readDecimal() if hasattr(iprot, 'readDecimal') else decimal.Decimal(iprot.readString())
            elif ifield_name == 'hidden_tax_amount':
                try:
                    init_kwds['hidden_tax_amount'] = iprot.readDecimal() if hasattr(iprot, 'readDecimal') else decimal.Decimal(iprot.readString())
                except (decimal.InvalidOperation, TypeError,):
                    pass
            elif ifield_name == 'hidden_tax_invoiced':
                try:
                    init_kwds['hidden_tax_invoiced'] = iprot.readDecimal() if hasattr(iprot, 'readDecimal') else decimal.Decimal(iprot.readString())
                except (decimal.InvalidOperation, TypeError,):
                    pass
            elif ifield_name == 'hidden_tax_refunded':
                try:
                    init_kwds['hidden_tax_refunded'] = iprot.readDecimal() if hasattr(iprot, 'readDecimal') else decimal.Decimal(iprot.readString())
                except (decimal.InvalidOperation, TypeError,):
                    pass
            elif ifield_name == 'increment_id':
                init_kwds['increment_id'] = iprot.readString()
            elif ifield_name == 'is_hold':
                try:
                    init_kwds['is_hold'] = iprot.readBool()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'is_multi_payment':
                try:
                    init_kwds['is_multi_payment'] = iprot.readBool()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'is_virtual':
                init_kwds['is_virtual'] = iprot.readBool()
            elif ifield_name == 'items':
                init_kwds['items'] = frozenset([yogento.api.models.sales.order.magento.magento_order_item.MagentoOrderItem.read(iprot) for _ in xrange(iprot.readSetBegin()[1])] + (iprot.readSetEnd() is None and []))
            elif ifield_name == 'order_currency_code':
                init_kwds['order_currency_code'] = iprot.readString()
            elif ifield_name == 'order_id':
                try:
                    init_kwds['order_id'] = iprot.readI32()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'original_increment_id':
                try:
                    init_kwds['original_increment_id'] = iprot.readString()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'quote_id':
                try:
                    init_kwds['quote_id'] = iprot.readI32()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'relation_child_id':
                try:
                    init_kwds['relation_child_id'] = iprot.readI32()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'relation_child_real_id':
                try:
                    init_kwds['relation_child_real_id'] = iprot.readI32()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'relation_parent_id':
                try:
                    init_kwds['relation_parent_id'] = iprot.readI32()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'relation_parent_real_id':
                try:
                    init_kwds['relation_parent_real_id'] = iprot.readI32()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'remote_ip':
                try:
                    init_kwds['remote_ip'] = iprot.readString()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'shipping_address':
                init_kwds['shipping_address'] = yogento.api.models.sales.order.magento.magento_order_address.MagentoOrderAddress.read(iprot)
            elif ifield_name == 'shipping_address_id':
                try:
                    init_kwds['shipping_address_id'] = iprot.readI32()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'shipping_amount':
                try:
                    init_kwds['shipping_amount'] = iprot.readDecimal() if hasattr(iprot, 'readDecimal') else decimal.Decimal(iprot.readString())
                except (decimal.InvalidOperation, TypeError,):
                    pass
            elif ifield_name == 'shipping_canceled':
                try:
                    init_kwds['shipping_canceled'] = iprot.readDecimal() if hasattr(iprot, 'readDecimal') else decimal.Decimal(iprot.readString())
                except (decimal.InvalidOperation, TypeError,):
                    pass
            elif ifield_name == 'shipping_description':
                try:
                    init_kwds['shipping_description'] = iprot.readString()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'shipping_discount_amount':
                try:
                    init_kwds['shipping_discount_amount'] = iprot.readDecimal() if hasattr(iprot, 'readDecimal') else decimal.Decimal(iprot.readString())
                except (decimal.InvalidOperation, TypeError,):
                    pass
            elif ifield_name == 'shipping_hidden_tax_amount':
                try:
                    init_kwds['shipping_hidden_tax_amount'] = iprot.readDecimal() if hasattr(iprot, 'readDecimal') else decimal.Decimal(iprot.readString())
                except (decimal.InvalidOperation, TypeError,):
                    pass
            elif ifield_name == 'shipping_incl_tax':
                try:
                    init_kwds['shipping_incl_tax'] = iprot.readDecimal() if hasattr(iprot, 'readDecimal') else decimal.Decimal(iprot.readString())
                except (decimal.InvalidOperation, TypeError,):
                    pass
            elif ifield_name == 'shipping_invoiced':
                try:
                    init_kwds['shipping_invoiced'] = iprot.readDecimal() if hasattr(iprot, 'readDecimal') else decimal.Decimal(iprot.readString())
                except (decimal.InvalidOperation, TypeError,):
                    pass
            elif ifield_name == 'shipping_method':
                try:
                    init_kwds['shipping_method'] = iprot.readString()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'shipping_refunded':
                try:
                    init_kwds['shipping_refunded'] = iprot.readDecimal() if hasattr(iprot, 'readDecimal') else decimal.Decimal(iprot.readString())
                except (decimal.InvalidOperation, TypeError,):
                    pass
            elif ifield_name == 'shipping_tax_amount':
                try:
                    init_kwds['shipping_tax_amount'] = iprot.readDecimal() if hasattr(iprot, 'readDecimal') else decimal.Decimal(iprot.readString())
                except (decimal.InvalidOperation, TypeError,):
                    pass
            elif ifield_name == 'shipping_tax_refunded':
                try:
                    init_kwds['shipping_tax_refunded'] = iprot.readDecimal() if hasattr(iprot, 'readDecimal') else decimal.Decimal(iprot.readString())
                except (decimal.InvalidOperation, TypeError,):
                    pass
            elif ifield_name == 'state':
                try:
                    init_kwds['state'] = iprot.readString()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'status':
                try:
                    init_kwds['status'] = yogento.api.models.sales.order.magento.magento_order_status.MagentoOrderStatus.value_of(iprot.readString().strip().upper())
                except (TypeError,):
                    pass
            elif ifield_name == 'status_history':
                init_kwds['status_history'] = tuple([yogento.api.models.sales.order.magento.magento_order_status_history.MagentoOrderStatusHistory.read(iprot) for _ in xrange(iprot.readListBegin()[1])] + (iprot.readListEnd() is None and []))
            elif ifield_name == 'store_currency_code':
                try:
                    init_kwds['store_currency_code'] = iprot.readString()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'store_id':
                try:
                    init_kwds['store_id'] = iprot.readI32()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'store_name':
                try:
                    init_kwds['store_name'] = iprot.readString()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'store_to_base_rate':
                try:
                    init_kwds['store_to_base_rate'] = iprot.readDecimal() if hasattr(iprot, 'readDecimal') else decimal.Decimal(iprot.readString())
                except (decimal.InvalidOperation, TypeError,):
                    pass
            elif ifield_name == 'store_to_order_rate':
                try:
                    init_kwds['store_to_order_rate'] = iprot.readDecimal() if hasattr(iprot, 'readDecimal') else decimal.Decimal(iprot.readString())
                except (decimal.InvalidOperation, TypeError,):
                    pass
            elif ifield_name == 'subtotal':
                try:
                    init_kwds['subtotal'] = iprot.readDecimal() if hasattr(iprot, 'readDecimal') else decimal.Decimal(iprot.readString())
                except (decimal.InvalidOperation, TypeError,):
                    pass
            elif ifield_name == 'subtotal_canceled':
                try:
                    init_kwds['subtotal_canceled'] = iprot.readDecimal() if hasattr(iprot, 'readDecimal') else decimal.Decimal(iprot.readString())
                except (decimal.InvalidOperation, TypeError,):
                    pass
            elif ifield_name == 'subtotal_incl_tax':
                try:
                    init_kwds['subtotal_incl_tax'] = iprot.readDecimal() if hasattr(iprot, 'readDecimal') else decimal.Decimal(iprot.readString())
                except (decimal.InvalidOperation, TypeError,):
                    pass
            elif ifield_name == 'subtotal_invoiced':
                try:
                    init_kwds['subtotal_invoiced'] = iprot.readDecimal() if hasattr(iprot, 'readDecimal') else decimal.Decimal(iprot.readString())
                except (decimal.InvalidOperation, TypeError,):
                    pass
            elif ifield_name == 'subtotal_refunded':
                try:
                    init_kwds['subtotal_refunded'] = iprot.readDecimal() if hasattr(iprot, 'readDecimal') else decimal.Decimal(iprot.readString())
                except (decimal.InvalidOperation, TypeError,):
                    pass
            elif ifield_name == 'tax_amount':
                try:
                    init_kwds['tax_amount'] = iprot.readDecimal() if hasattr(iprot, 'readDecimal') else decimal.Decimal(iprot.readString())
                except (decimal.InvalidOperation, TypeError,):
                    pass
            elif ifield_name == 'tax_canceled':
                try:
                    init_kwds['tax_canceled'] = iprot.readDecimal() if hasattr(iprot, 'readDecimal') else decimal.Decimal(iprot.readString())
                except (decimal.InvalidOperation, TypeError,):
                    pass
            elif ifield_name == 'tax_invoiced':
                try:
                    init_kwds['tax_invoiced'] = iprot.readDecimal() if hasattr(iprot, 'readDecimal') else decimal.Decimal(iprot.readString())
                except (decimal.InvalidOperation, TypeError,):
                    pass
            elif ifield_name == 'tax_percent':
                try:
                    init_kwds['tax_percent'] = iprot.readDecimal() if hasattr(iprot, 'readDecimal') else decimal.Decimal(iprot.readString())
                except (decimal.InvalidOperation, TypeError,):
                    pass
            elif ifield_name == 'tax_refunded':
                try:
                    init_kwds['tax_refunded'] = iprot.readDecimal() if hasattr(iprot, 'readDecimal') else decimal.Decimal(iprot.readString())
                except (decimal.InvalidOperation, TypeError,):
                    pass
            elif ifield_name == 'total_canceled':
                try:
                    init_kwds['total_canceled'] = iprot.readDecimal() if hasattr(iprot, 'readDecimal') else decimal.Decimal(iprot.readString())
                except (decimal.InvalidOperation, TypeError,):
                    pass
            elif ifield_name == 'total_due':
                try:
                    init_kwds['total_due'] = iprot.readDecimal() if hasattr(iprot, 'readDecimal') else decimal.Decimal(iprot.readString())
                except (decimal.InvalidOperation, TypeError,):
                    pass
            elif ifield_name == 'total_invoiced':
                try:
                    init_kwds['total_invoiced'] = iprot.readDecimal() if hasattr(iprot, 'readDecimal') else decimal.Decimal(iprot.readString())
                except (decimal.InvalidOperation, TypeError,):
                    pass
            elif ifield_name == 'total_item_count':
                try:
                    init_kwds['total_item_count'] = iprot.readDecimal() if hasattr(iprot, 'readDecimal') else decimal.Decimal(iprot.readString())
                except (decimal.InvalidOperation, TypeError,):
                    pass
            elif ifield_name == 'total_offline_refunded':
                try:
                    init_kwds['total_offline_refunded'] = iprot.readDecimal() if hasattr(iprot, 'readDecimal') else decimal.Decimal(iprot.readString())
                except (decimal.InvalidOperation, TypeError,):
                    pass
            elif ifield_name == 'total_online_refunded':
                try:
                    init_kwds['total_online_refunded'] = iprot.readDecimal() if hasattr(iprot, 'readDecimal') else decimal.Decimal(iprot.readString())
                except (decimal.InvalidOperation, TypeError,):
                    pass
            elif ifield_name == 'total_paid':
                try:
                    init_kwds['total_paid'] = iprot.readDecimal() if hasattr(iprot, 'readDecimal') else decimal.Decimal(iprot.readString())
                except (decimal.InvalidOperation, TypeError,):
                    pass
            elif ifield_name == 'total_qty_ordered':
                try:
                    init_kwds['total_qty_ordered'] = iprot.readDecimal() if hasattr(iprot, 'readDecimal') else decimal.Decimal(iprot.readString())
                except (decimal.InvalidOperation, TypeError,):
                    pass
            elif ifield_name == 'total_refunded':
                try:
                    init_kwds['total_refunded'] = iprot.readDecimal() if hasattr(iprot, 'readDecimal') else decimal.Decimal(iprot.readString())
                except (decimal.InvalidOperation, TypeError,):
                    pass
            elif ifield_name == 'tracking_numbers':
                init_kwds['tracking_numbers'] = tuple([iprot.readString() for _ in xrange(iprot.readListBegin()[1])] + (iprot.readListEnd() is None and []))
            elif ifield_name == 'updated_at':
                init_kwds['updated_at'] = iprot.readDateTime() if hasattr(iprot, 'readDateTime') else datetime.fromtimestamp(iprot.readI64() / 1000.0)
            elif ifield_name == 'weight':
                try:
                    init_kwds['weight'] = iprot.readDecimal() if hasattr(iprot, 'readDecimal') else decimal.Decimal(iprot.readString())
                except (decimal.InvalidOperation, TypeError,):
                    pass
            elif ifield_name == 'x_forwarded_for':
                try:
                    init_kwds['x_forwarded_for'] = iprot.readString()
                except (TypeError, ValueError,):
                    pass
            iprot.readFieldEnd()
        iprot.readStructEnd()

        return cls(**init_kwds)

    @property
    def relation_child_id(self):
        return self.__relation_child_id

    @property
    def relation_child_real_id(self):
        return self.__relation_child_real_id

    @property
    def relation_parent_id(self):
        return self.__relation_parent_id

    @property
    def relation_parent_real_id(self):
        return self.__relation_parent_real_id

    @property
    def remote_ip(self):
        return self.__remote_ip

    def replace(self, adjustment_negative=None, adjustment_positive=None, base_adjustment_negative=None, base_adjustment_positive=None, base_currency_code=None, base_custbalance_amount=None, base_discount_amount=None, base_discount_canceled=None, base_discount_invoiced=None, base_discount_refunded=None, base_grand_total=None, base_hidden_tax_amount=None, base_hidden_tax_invoiced=None, base_hidden_tax_refunded=None, base_shipping_amount=None, base_shipping_canceled=None, base_shipping_discount_amount=None, base_shipping_hidden_tax_amnt=None, base_shipping_hidden_tax_amount=None, base_shipping_incl_tax=None, base_shipping_invoiced=None, base_shipping_refunded=None, base_shipping_tax_amount=None, base_shipping_tax_refunded=None, base_subtotal=None, base_subtotal_canceled=None, base_subtotal_incl_tax=None, base_subtotal_invoiced=None, base_subtotal_refunded=None, base_tax_amount=None, base_tax_canceled=None, base_tax_invoiced=None, base_tax_refunded=None, base_to_global_rate=None, base_to_order_rate=None, base_total_canceled=None, base_total_due=None, base_total_invoiced=None, base_total_invoiced_cost=None, base_total_offline_refunded=None, base_total_online_refunded=None, base_total_paid=None, base_total_qty_ordered=None, base_total_refunded=None, billing_address=None, billing_address_id=None, can_ship_partially=None, can_ship_partially_item=None, coupon_code=None, coupon_rule_name=None, created_at=None, currency_code=None, currency_rate=None, custbalance_amount=None, customer_dob=None, customer_email=None, customer_firstname=None, customer_gender=None, customer_group_id=None, customer_id=None, customer_is_guest=None, customer_lastname=None, customer_middlename=None, customer_note=None, customer_note_notify=None, customer_prefix=None, customer_suffix=None, customer_taxvat=None, discount_amount=None, discount_canceled=None, discount_description=None, discount_invoiced=None, discount_refunded=None, edit_increment=None, email_sent=None, forced_do_shipment_with_invoice=None, forced_shipment_with_invoice=None, gift_message_id=None, global_currency_code=None, grand_total=None, hidden_tax_amount=None, hidden_tax_invoiced=None, hidden_tax_refunded=None, increment_id=None, is_hold=None, is_multi_payment=None, is_virtual=None, items=None, order_currency_code=None, order_id=None, original_increment_id=None, quote_id=None, relation_child_id=None, relation_child_real_id=None, relation_parent_id=None, relation_parent_real_id=None, remote_ip=None, shipping_address=None, shipping_address_id=None, shipping_amount=None, shipping_canceled=None, shipping_description=None, shipping_discount_amount=None, shipping_hidden_tax_amount=None, shipping_incl_tax=None, shipping_invoiced=None, shipping_method=None, shipping_refunded=None, shipping_tax_amount=None, shipping_tax_refunded=None, state=None, status=None, status_history=None, store_currency_code=None, store_id=None, store_name=None, store_to_base_rate=None, store_to_order_rate=None, subtotal=None, subtotal_canceled=None, subtotal_incl_tax=None, subtotal_invoiced=None, subtotal_refunded=None, tax_amount=None, tax_canceled=None, tax_invoiced=None, tax_percent=None, tax_refunded=None, total_canceled=None, total_due=None, total_invoiced=None, total_item_count=None, total_offline_refunded=None, total_online_refunded=None, total_paid=None, total_qty_ordered=None, total_refunded=None, tracking_numbers=None, updated_at=None, weight=None, x_forwarded_for=None):
        if adjustment_negative is None:
            adjustment_negative = self.adjustment_negative
        if adjustment_positive is None:
            adjustment_positive = self.adjustment_positive
        if base_adjustment_negative is None:
            base_adjustment_negative = self.base_adjustment_negative
        if base_adjustment_positive is None:
            base_adjustment_positive = self.base_adjustment_positive
        if base_currency_code is None:
            base_currency_code = self.base_currency_code
        if base_custbalance_amount is None:
            base_custbalance_amount = self.base_custbalance_amount
        if base_discount_amount is None:
            base_discount_amount = self.base_discount_amount
        if base_discount_canceled is None:
            base_discount_canceled = self.base_discount_canceled
        if base_discount_invoiced is None:
            base_discount_invoiced = self.base_discount_invoiced
        if base_discount_refunded is None:
            base_discount_refunded = self.base_discount_refunded
        if base_grand_total is None:
            base_grand_total = self.base_grand_total
        if base_hidden_tax_amount is None:
            base_hidden_tax_amount = self.base_hidden_tax_amount
        if base_hidden_tax_invoiced is None:
            base_hidden_tax_invoiced = self.base_hidden_tax_invoiced
        if base_hidden_tax_refunded is None:
            base_hidden_tax_refunded = self.base_hidden_tax_refunded
        if base_shipping_amount is None:
            base_shipping_amount = self.base_shipping_amount
        if base_shipping_canceled is None:
            base_shipping_canceled = self.base_shipping_canceled
        if base_shipping_discount_amount is None:
            base_shipping_discount_amount = self.base_shipping_discount_amount
        if base_shipping_hidden_tax_amnt is None:
            base_shipping_hidden_tax_amnt = self.base_shipping_hidden_tax_amnt
        if base_shipping_hidden_tax_amount is None:
            base_shipping_hidden_tax_amount = self.base_shipping_hidden_tax_amount
        if base_shipping_incl_tax is None:
            base_shipping_incl_tax = self.base_shipping_incl_tax
        if base_shipping_invoiced is None:
            base_shipping_invoiced = self.base_shipping_invoiced
        if base_shipping_refunded is None:
            base_shipping_refunded = self.base_shipping_refunded
        if base_shipping_tax_amount is None:
            base_shipping_tax_amount = self.base_shipping_tax_amount
        if base_shipping_tax_refunded is None:
            base_shipping_tax_refunded = self.base_shipping_tax_refunded
        if base_subtotal is None:
            base_subtotal = self.base_subtotal
        if base_subtotal_canceled is None:
            base_subtotal_canceled = self.base_subtotal_canceled
        if base_subtotal_incl_tax is None:
            base_subtotal_incl_tax = self.base_subtotal_incl_tax
        if base_subtotal_invoiced is None:
            base_subtotal_invoiced = self.base_subtotal_invoiced
        if base_subtotal_refunded is None:
            base_subtotal_refunded = self.base_subtotal_refunded
        if base_tax_amount is None:
            base_tax_amount = self.base_tax_amount
        if base_tax_canceled is None:
            base_tax_canceled = self.base_tax_canceled
        if base_tax_invoiced is None:
            base_tax_invoiced = self.base_tax_invoiced
        if base_tax_refunded is None:
            base_tax_refunded = self.base_tax_refunded
        if base_to_global_rate is None:
            base_to_global_rate = self.base_to_global_rate
        if base_to_order_rate is None:
            base_to_order_rate = self.base_to_order_rate
        if base_total_canceled is None:
            base_total_canceled = self.base_total_canceled
        if base_total_due is None:
            base_total_due = self.base_total_due
        if base_total_invoiced is None:
            base_total_invoiced = self.base_total_invoiced
        if base_total_invoiced_cost is None:
            base_total_invoiced_cost = self.base_total_invoiced_cost
        if base_total_offline_refunded is None:
            base_total_offline_refunded = self.base_total_offline_refunded
        if base_total_online_refunded is None:
            base_total_online_refunded = self.base_total_online_refunded
        if base_total_paid is None:
            base_total_paid = self.base_total_paid
        if base_total_qty_ordered is None:
            base_total_qty_ordered = self.base_total_qty_ordered
        if base_total_refunded is None:
            base_total_refunded = self.base_total_refunded
        if billing_address is None:
            billing_address = self.billing_address
        if billing_address_id is None:
            billing_address_id = self.billing_address_id
        if can_ship_partially is None:
            can_ship_partially = self.can_ship_partially
        if can_ship_partially_item is None:
            can_ship_partially_item = self.can_ship_partially_item
        if coupon_code is None:
            coupon_code = self.coupon_code
        if coupon_rule_name is None:
            coupon_rule_name = self.coupon_rule_name
        if created_at is None:
            created_at = self.created_at
        if currency_code is None:
            currency_code = self.currency_code
        if currency_rate is None:
            currency_rate = self.currency_rate
        if custbalance_amount is None:
            custbalance_amount = self.custbalance_amount
        if customer_dob is None:
            customer_dob = self.customer_dob
        if customer_email is None:
            customer_email = self.customer_email
        if customer_firstname is None:
            customer_firstname = self.customer_firstname
        if customer_gender is None:
            customer_gender = self.customer_gender
        if customer_group_id is None:
            customer_group_id = self.customer_group_id
        if customer_id is None:
            customer_id = self.customer_id
        if customer_is_guest is None:
            customer_is_guest = self.customer_is_guest
        if customer_lastname is None:
            customer_lastname = self.customer_lastname
        if customer_middlename is None:
            customer_middlename = self.customer_middlename
        if customer_note is None:
            customer_note = self.customer_note
        if customer_note_notify is None:
            customer_note_notify = self.customer_note_notify
        if customer_prefix is None:
            customer_prefix = self.customer_prefix
        if customer_suffix is None:
            customer_suffix = self.customer_suffix
        if customer_taxvat is None:
            customer_taxvat = self.customer_taxvat
        if discount_amount is None:
            discount_amount = self.discount_amount
        if discount_canceled is None:
            discount_canceled = self.discount_canceled
        if discount_description is None:
            discount_description = self.discount_description
        if discount_invoiced is None:
            discount_invoiced = self.discount_invoiced
        if discount_refunded is None:
            discount_refunded = self.discount_refunded
        if edit_increment is None:
            edit_increment = self.edit_increment
        if email_sent is None:
            email_sent = self.email_sent
        if forced_do_shipment_with_invoice is None:
            forced_do_shipment_with_invoice = self.forced_do_shipment_with_invoice
        if forced_shipment_with_invoice is None:
            forced_shipment_with_invoice = self.forced_shipment_with_invoice
        if gift_message_id is None:
            gift_message_id = self.gift_message_id
        if global_currency_code is None:
            global_currency_code = self.global_currency_code
        if grand_total is None:
            grand_total = self.grand_total
        if hidden_tax_amount is None:
            hidden_tax_amount = self.hidden_tax_amount
        if hidden_tax_invoiced is None:
            hidden_tax_invoiced = self.hidden_tax_invoiced
        if hidden_tax_refunded is None:
            hidden_tax_refunded = self.hidden_tax_refunded
        if increment_id is None:
            increment_id = self.increment_id
        if is_hold is None:
            is_hold = self.is_hold
        if is_multi_payment is None:
            is_multi_payment = self.is_multi_payment
        if is_virtual is None:
            is_virtual = self.is_virtual
        if items is None:
            items = self.items
        if order_currency_code is None:
            order_currency_code = self.order_currency_code
        if order_id is None:
            order_id = self.order_id
        if original_increment_id is None:
            original_increment_id = self.original_increment_id
        if quote_id is None:
            quote_id = self.quote_id
        if relation_child_id is None:
            relation_child_id = self.relation_child_id
        if relation_child_real_id is None:
            relation_child_real_id = self.relation_child_real_id
        if relation_parent_id is None:
            relation_parent_id = self.relation_parent_id
        if relation_parent_real_id is None:
            relation_parent_real_id = self.relation_parent_real_id
        if remote_ip is None:
            remote_ip = self.remote_ip
        if shipping_address is None:
            shipping_address = self.shipping_address
        if shipping_address_id is None:
            shipping_address_id = self.shipping_address_id
        if shipping_amount is None:
            shipping_amount = self.shipping_amount
        if shipping_canceled is None:
            shipping_canceled = self.shipping_canceled
        if shipping_description is None:
            shipping_description = self.shipping_description
        if shipping_discount_amount is None:
            shipping_discount_amount = self.shipping_discount_amount
        if shipping_hidden_tax_amount is None:
            shipping_hidden_tax_amount = self.shipping_hidden_tax_amount
        if shipping_incl_tax is None:
            shipping_incl_tax = self.shipping_incl_tax
        if shipping_invoiced is None:
            shipping_invoiced = self.shipping_invoiced
        if shipping_method is None:
            shipping_method = self.shipping_method
        if shipping_refunded is None:
            shipping_refunded = self.shipping_refunded
        if shipping_tax_amount is None:
            shipping_tax_amount = self.shipping_tax_amount
        if shipping_tax_refunded is None:
            shipping_tax_refunded = self.shipping_tax_refunded
        if state is None:
            state = self.state
        if status is None:
            status = self.status
        if status_history is None:
            status_history = self.status_history
        if store_currency_code is None:
            store_currency_code = self.store_currency_code
        if store_id is None:
            store_id = self.store_id
        if store_name is None:
            store_name = self.store_name
        if store_to_base_rate is None:
            store_to_base_rate = self.store_to_base_rate
        if store_to_order_rate is None:
            store_to_order_rate = self.store_to_order_rate
        if subtotal is None:
            subtotal = self.subtotal
        if subtotal_canceled is None:
            subtotal_canceled = self.subtotal_canceled
        if subtotal_incl_tax is None:
            subtotal_incl_tax = self.subtotal_incl_tax
        if subtotal_invoiced is None:
            subtotal_invoiced = self.subtotal_invoiced
        if subtotal_refunded is None:
            subtotal_refunded = self.subtotal_refunded
        if tax_amount is None:
            tax_amount = self.tax_amount
        if tax_canceled is None:
            tax_canceled = self.tax_canceled
        if tax_invoiced is None:
            tax_invoiced = self.tax_invoiced
        if tax_percent is None:
            tax_percent = self.tax_percent
        if tax_refunded is None:
            tax_refunded = self.tax_refunded
        if total_canceled is None:
            total_canceled = self.total_canceled
        if total_due is None:
            total_due = self.total_due
        if total_invoiced is None:
            total_invoiced = self.total_invoiced
        if total_item_count is None:
            total_item_count = self.total_item_count
        if total_offline_refunded is None:
            total_offline_refunded = self.total_offline_refunded
        if total_online_refunded is None:
            total_online_refunded = self.total_online_refunded
        if total_paid is None:
            total_paid = self.total_paid
        if total_qty_ordered is None:
            total_qty_ordered = self.total_qty_ordered
        if total_refunded is None:
            total_refunded = self.total_refunded
        if tracking_numbers is None:
            tracking_numbers = self.tracking_numbers
        if updated_at is None:
            updated_at = self.updated_at
        if weight is None:
            weight = self.weight
        if x_forwarded_for is None:
            x_forwarded_for = self.x_forwarded_for
        return self.__class__(adjustment_negative=adjustment_negative, adjustment_positive=adjustment_positive, base_adjustment_negative=base_adjustment_negative, base_adjustment_positive=base_adjustment_positive, base_currency_code=base_currency_code, base_custbalance_amount=base_custbalance_amount, base_discount_amount=base_discount_amount, base_discount_canceled=base_discount_canceled, base_discount_invoiced=base_discount_invoiced, base_discount_refunded=base_discount_refunded, base_grand_total=base_grand_total, base_hidden_tax_amount=base_hidden_tax_amount, base_hidden_tax_invoiced=base_hidden_tax_invoiced, base_hidden_tax_refunded=base_hidden_tax_refunded, base_shipping_amount=base_shipping_amount, base_shipping_canceled=base_shipping_canceled, base_shipping_discount_amount=base_shipping_discount_amount, base_shipping_hidden_tax_amnt=base_shipping_hidden_tax_amnt, base_shipping_hidden_tax_amount=base_shipping_hidden_tax_amount, base_shipping_incl_tax=base_shipping_incl_tax, base_shipping_invoiced=base_shipping_invoiced, base_shipping_refunded=base_shipping_refunded, base_shipping_tax_amount=base_shipping_tax_amount, base_shipping_tax_refunded=base_shipping_tax_refunded, base_subtotal=base_subtotal, base_subtotal_canceled=base_subtotal_canceled, base_subtotal_incl_tax=base_subtotal_incl_tax, base_subtotal_invoiced=base_subtotal_invoiced, base_subtotal_refunded=base_subtotal_refunded, base_tax_amount=base_tax_amount, base_tax_canceled=base_tax_canceled, base_tax_invoiced=base_tax_invoiced, base_tax_refunded=base_tax_refunded, base_to_global_rate=base_to_global_rate, base_to_order_rate=base_to_order_rate, base_total_canceled=base_total_canceled, base_total_due=base_total_due, base_total_invoiced=base_total_invoiced, base_total_invoiced_cost=base_total_invoiced_cost, base_total_offline_refunded=base_total_offline_refunded, base_total_online_refunded=base_total_online_refunded, base_total_paid=base_total_paid, base_total_qty_ordered=base_total_qty_ordered, base_total_refunded=base_total_refunded, billing_address=billing_address, billing_address_id=billing_address_id, can_ship_partially=can_ship_partially, can_ship_partially_item=can_ship_partially_item, coupon_code=coupon_code, coupon_rule_name=coupon_rule_name, created_at=created_at, currency_code=currency_code, currency_rate=currency_rate, custbalance_amount=custbalance_amount, customer_dob=customer_dob, customer_email=customer_email, customer_firstname=customer_firstname, customer_gender=customer_gender, customer_group_id=customer_group_id, customer_id=customer_id, customer_is_guest=customer_is_guest, customer_lastname=customer_lastname, customer_middlename=customer_middlename, customer_note=customer_note, customer_note_notify=customer_note_notify, customer_prefix=customer_prefix, customer_suffix=customer_suffix, customer_taxvat=customer_taxvat, discount_amount=discount_amount, discount_canceled=discount_canceled, discount_description=discount_description, discount_invoiced=discount_invoiced, discount_refunded=discount_refunded, edit_increment=edit_increment, email_sent=email_sent, forced_do_shipment_with_invoice=forced_do_shipment_with_invoice, forced_shipment_with_invoice=forced_shipment_with_invoice, gift_message_id=gift_message_id, global_currency_code=global_currency_code, grand_total=grand_total, hidden_tax_amount=hidden_tax_amount, hidden_tax_invoiced=hidden_tax_invoiced, hidden_tax_refunded=hidden_tax_refunded, increment_id=increment_id, is_hold=is_hold, is_multi_payment=is_multi_payment, is_virtual=is_virtual, items=items, order_currency_code=order_currency_code, order_id=order_id, original_increment_id=original_increment_id, quote_id=quote_id, relation_child_id=relation_child_id, relation_child_real_id=relation_child_real_id, relation_parent_id=relation_parent_id, relation_parent_real_id=relation_parent_real_id, remote_ip=remote_ip, shipping_address=shipping_address, shipping_address_id=shipping_address_id, shipping_amount=shipping_amount, shipping_canceled=shipping_canceled, shipping_description=shipping_description, shipping_discount_amount=shipping_discount_amount, shipping_hidden_tax_amount=shipping_hidden_tax_amount, shipping_incl_tax=shipping_incl_tax, shipping_invoiced=shipping_invoiced, shipping_method=shipping_method, shipping_refunded=shipping_refunded, shipping_tax_amount=shipping_tax_amount, shipping_tax_refunded=shipping_tax_refunded, state=state, status=status, status_history=status_history, store_currency_code=store_currency_code, store_id=store_id, store_name=store_name, store_to_base_rate=store_to_base_rate, store_to_order_rate=store_to_order_rate, subtotal=subtotal, subtotal_canceled=subtotal_canceled, subtotal_incl_tax=subtotal_incl_tax, subtotal_invoiced=subtotal_invoiced, subtotal_refunded=subtotal_refunded, tax_amount=tax_amount, tax_canceled=tax_canceled, tax_invoiced=tax_invoiced, tax_percent=tax_percent, tax_refunded=tax_refunded, total_canceled=total_canceled, total_due=total_due, total_invoiced=total_invoiced, total_item_count=total_item_count, total_offline_refunded=total_offline_refunded, total_online_refunded=total_online_refunded, total_paid=total_paid, total_qty_ordered=total_qty_ordered, total_refunded=total_refunded, tracking_numbers=tracking_numbers, updated_at=updated_at, weight=weight, x_forwarded_for=x_forwarded_for)

    @property
    def shipping_address(self):
        return self.__shipping_address

    @property
    def shipping_address_id(self):
        return self.__shipping_address_id

    @property
    def shipping_amount(self):
        return self.__shipping_amount

    @property
    def shipping_canceled(self):
        return self.__shipping_canceled

    @property
    def shipping_description(self):
        return self.__shipping_description

    @property
    def shipping_discount_amount(self):
        return self.__shipping_discount_amount

    @property
    def shipping_hidden_tax_amount(self):
        return self.__shipping_hidden_tax_amount

    @property
    def shipping_incl_tax(self):
        return self.__shipping_incl_tax

    @property
    def shipping_invoiced(self):
        return self.__shipping_invoiced

    @property
    def shipping_method(self):
        return self.__shipping_method

    @property
    def shipping_refunded(self):
        return self.__shipping_refunded

    @property
    def shipping_tax_amount(self):
        return self.__shipping_tax_amount

    @property
    def shipping_tax_refunded(self):
        return self.__shipping_tax_refunded

    @property
    def state(self):
        return self.__state

    @property
    def status(self):
        return self.__status

    @property
    def status_history(self):
        return self.__status_history

    @property
    def store_currency_code(self):
        return self.__store_currency_code

    @property
    def store_id(self):
        return self.__store_id

    @property
    def store_name(self):
        return self.__store_name

    @property
    def store_to_base_rate(self):
        return self.__store_to_base_rate

    @property
    def store_to_order_rate(self):
        return self.__store_to_order_rate

    @property
    def subtotal(self):
        return self.__subtotal

    @property
    def subtotal_canceled(self):
        return self.__subtotal_canceled

    @property
    def subtotal_incl_tax(self):
        return self.__subtotal_incl_tax

    @property
    def subtotal_invoiced(self):
        return self.__subtotal_invoiced

    @property
    def subtotal_refunded(self):
        return self.__subtotal_refunded

    @property
    def tax_amount(self):
        return self.__tax_amount

    @property
    def tax_canceled(self):
        return self.__tax_canceled

    @property
    def tax_invoiced(self):
        return self.__tax_invoiced

    @property
    def tax_percent(self):
        return self.__tax_percent

    @property
    def tax_refunded(self):
        return self.__tax_refunded

    @property
    def total_canceled(self):
        return self.__total_canceled

    @property
    def total_due(self):
        return self.__total_due

    @property
    def total_invoiced(self):
        return self.__total_invoiced

    @property
    def total_item_count(self):
        return self.__total_item_count

    @property
    def total_offline_refunded(self):
        return self.__total_offline_refunded

    @property
    def total_online_refunded(self):
        return self.__total_online_refunded

    @property
    def total_paid(self):
        return self.__total_paid

    @property
    def total_qty_ordered(self):
        return self.__total_qty_ordered

    @property
    def total_refunded(self):
        return self.__total_refunded

    @property
    def tracking_numbers(self):
        return self.__tracking_numbers

    @property
    def updated_at(self):
        return self.__updated_at

    @property
    def weight(self):
        return self.__weight

    def write(self, oprot):
        oprot.writeStructBegin('MagentoOrder')

        if self.adjustment_negative is not None:
            oprot.writeFieldBegin('adjustment_negative', 12, -1)
            oprot.writeDecimal(self.adjustment_negative) if hasattr(oprot, 'writeDecimal') else oprot.writeString(str(self.adjustment_negative))
            oprot.writeFieldEnd()

        if self.adjustment_positive is not None:
            oprot.writeFieldBegin('adjustment_positive', 12, -1)
            oprot.writeDecimal(self.adjustment_positive) if hasattr(oprot, 'writeDecimal') else oprot.writeString(str(self.adjustment_positive))
            oprot.writeFieldEnd()

        if self.base_adjustment_negative is not None:
            oprot.writeFieldBegin('base_adjustment_negative', 12, -1)
            oprot.writeDecimal(self.base_adjustment_negative) if hasattr(oprot, 'writeDecimal') else oprot.writeString(str(self.base_adjustment_negative))
            oprot.writeFieldEnd()

        if self.base_adjustment_positive is not None:
            oprot.writeFieldBegin('base_adjustment_positive', 12, -1)
            oprot.writeDecimal(self.base_adjustment_positive) if hasattr(oprot, 'writeDecimal') else oprot.writeString(str(self.base_adjustment_positive))
            oprot.writeFieldEnd()

        if self.base_currency_code is not None:
            oprot.writeFieldBegin('base_currency_code', 11, -1)
            oprot.writeString(self.base_currency_code)
            oprot.writeFieldEnd()

        if self.base_custbalance_amount is not None:
            oprot.writeFieldBegin('base_custbalance_amount', 12, -1)
            oprot.writeDecimal(self.base_custbalance_amount) if hasattr(oprot, 'writeDecimal') else oprot.writeString(str(self.base_custbalance_amount))
            oprot.writeFieldEnd()

        if self.base_discount_amount is not None:
            oprot.writeFieldBegin('base_discount_amount', 12, -1)
            oprot.writeDecimal(self.base_discount_amount) if hasattr(oprot, 'writeDecimal') else oprot.writeString(str(self.base_discount_amount))
            oprot.writeFieldEnd()

        if self.base_discount_canceled is not None:
            oprot.writeFieldBegin('base_discount_canceled', 12, -1)
            oprot.writeDecimal(self.base_discount_canceled) if hasattr(oprot, 'writeDecimal') else oprot.writeString(str(self.base_discount_canceled))
            oprot.writeFieldEnd()

        if self.base_discount_invoiced is not None:
            oprot.writeFieldBegin('base_discount_invoiced', 12, -1)
            oprot.writeDecimal(self.base_discount_invoiced) if hasattr(oprot, 'writeDecimal') else oprot.writeString(str(self.base_discount_invoiced))
            oprot.writeFieldEnd()

        if self.base_discount_refunded is not None:
            oprot.writeFieldBegin('base_discount_refunded', 12, -1)
            oprot.writeDecimal(self.base_discount_refunded) if hasattr(oprot, 'writeDecimal') else oprot.writeString(str(self.base_discount_refunded))
            oprot.writeFieldEnd()

        if self.base_grand_total is not None:
            oprot.writeFieldBegin('base_grand_total', 12, -1)
            oprot.writeDecimal(self.base_grand_total) if hasattr(oprot, 'writeDecimal') else oprot.writeString(str(self.base_grand_total))
            oprot.writeFieldEnd()

        if self.base_hidden_tax_amount is not None:
            oprot.writeFieldBegin('base_hidden_tax_amount', 12, -1)
            oprot.writeDecimal(self.base_hidden_tax_amount) if hasattr(oprot, 'writeDecimal') else oprot.writeString(str(self.base_hidden_tax_amount))
            oprot.writeFieldEnd()

        if self.base_hidden_tax_invoiced is not None:
            oprot.writeFieldBegin('base_hidden_tax_invoiced', 12, -1)
            oprot.writeDecimal(self.base_hidden_tax_invoiced) if hasattr(oprot, 'writeDecimal') else oprot.writeString(str(self.base_hidden_tax_invoiced))
            oprot.writeFieldEnd()

        if self.base_hidden_tax_refunded is not None:
            oprot.writeFieldBegin('base_hidden_tax_refunded', 12, -1)
            oprot.writeDecimal(self.base_hidden_tax_refunded) if hasattr(oprot, 'writeDecimal') else oprot.writeString(str(self.base_hidden_tax_refunded))
            oprot.writeFieldEnd()

        if self.base_shipping_amount is not None:
            oprot.writeFieldBegin('base_shipping_amount', 12, -1)
            oprot.writeDecimal(self.base_shipping_amount) if hasattr(oprot, 'writeDecimal') else oprot.writeString(str(self.base_shipping_amount))
            oprot.writeFieldEnd()

        if self.base_shipping_canceled is not None:
            oprot.writeFieldBegin('base_shipping_canceled', 12, -1)
            oprot.writeDecimal(self.base_shipping_canceled) if hasattr(oprot, 'writeDecimal') else oprot.writeString(str(self.base_shipping_canceled))
            oprot.writeFieldEnd()

        if self.base_shipping_discount_amount is not None:
            oprot.writeFieldBegin('base_shipping_discount_amount', 12, -1)
            oprot.writeDecimal(self.base_shipping_discount_amount) if hasattr(oprot, 'writeDecimal') else oprot.writeString(str(self.base_shipping_discount_amount))
            oprot.writeFieldEnd()

        if self.base_shipping_hidden_tax_amnt is not None:
            oprot.writeFieldBegin('base_shipping_hidden_tax_amnt', 12, -1)
            oprot.writeDecimal(self.base_shipping_hidden_tax_amnt) if hasattr(oprot, 'writeDecimal') else oprot.writeString(str(self.base_shipping_hidden_tax_amnt))
            oprot.writeFieldEnd()

        if self.base_shipping_hidden_tax_amount is not None:
            oprot.writeFieldBegin('base_shipping_hidden_tax_amount', 12, -1)
            oprot.writeDecimal(self.base_shipping_hidden_tax_amount) if hasattr(oprot, 'writeDecimal') else oprot.writeString(str(self.base_shipping_hidden_tax_amount))
            oprot.writeFieldEnd()

        if self.base_shipping_incl_tax is not None:
            oprot.writeFieldBegin('base_shipping_incl_tax', 12, -1)
            oprot.writeDecimal(self.base_shipping_incl_tax) if hasattr(oprot, 'writeDecimal') else oprot.writeString(str(self.base_shipping_incl_tax))
            oprot.writeFieldEnd()

        if self.base_shipping_invoiced is not None:
            oprot.writeFieldBegin('base_shipping_invoiced', 12, -1)
            oprot.writeDecimal(self.base_shipping_invoiced) if hasattr(oprot, 'writeDecimal') else oprot.writeString(str(self.base_shipping_invoiced))
            oprot.writeFieldEnd()

        if self.base_shipping_refunded is not None:
            oprot.writeFieldBegin('base_shipping_refunded', 12, -1)
            oprot.writeDecimal(self.base_shipping_refunded) if hasattr(oprot, 'writeDecimal') else oprot.writeString(str(self.base_shipping_refunded))
            oprot.writeFieldEnd()

        if self.base_shipping_tax_amount is not None:
            oprot.writeFieldBegin('base_shipping_tax_amount', 12, -1)
            oprot.writeDecimal(self.base_shipping_tax_amount) if hasattr(oprot, 'writeDecimal') else oprot.writeString(str(self.base_shipping_tax_amount))
            oprot.writeFieldEnd()

        if self.base_shipping_tax_refunded is not None:
            oprot.writeFieldBegin('base_shipping_tax_refunded', 12, -1)
            oprot.writeDecimal(self.base_shipping_tax_refunded) if hasattr(oprot, 'writeDecimal') else oprot.writeString(str(self.base_shipping_tax_refunded))
            oprot.writeFieldEnd()

        if self.base_subtotal is not None:
            oprot.writeFieldBegin('base_subtotal', 12, -1)
            oprot.writeDecimal(self.base_subtotal) if hasattr(oprot, 'writeDecimal') else oprot.writeString(str(self.base_subtotal))
            oprot.writeFieldEnd()

        if self.base_subtotal_canceled is not None:
            oprot.writeFieldBegin('base_subtotal_canceled', 12, -1)
            oprot.writeDecimal(self.base_subtotal_canceled) if hasattr(oprot, 'writeDecimal') else oprot.writeString(str(self.base_subtotal_canceled))
            oprot.writeFieldEnd()

        if self.base_subtotal_incl_tax is not None:
            oprot.writeFieldBegin('base_subtotal_incl_tax', 12, -1)
            oprot.writeDecimal(self.base_subtotal_incl_tax) if hasattr(oprot, 'writeDecimal') else oprot.writeString(str(self.base_subtotal_incl_tax))
            oprot.writeFieldEnd()

        if self.base_subtotal_invoiced is not None:
            oprot.writeFieldBegin('base_subtotal_invoiced', 12, -1)
            oprot.writeDecimal(self.base_subtotal_invoiced) if hasattr(oprot, 'writeDecimal') else oprot.writeString(str(self.base_subtotal_invoiced))
            oprot.writeFieldEnd()

        if self.base_subtotal_refunded is not None:
            oprot.writeFieldBegin('base_subtotal_refunded', 12, -1)
            oprot.writeDecimal(self.base_subtotal_refunded) if hasattr(oprot, 'writeDecimal') else oprot.writeString(str(self.base_subtotal_refunded))
            oprot.writeFieldEnd()

        if self.base_tax_amount is not None:
            oprot.writeFieldBegin('base_tax_amount', 12, -1)
            oprot.writeDecimal(self.base_tax_amount) if hasattr(oprot, 'writeDecimal') else oprot.writeString(str(self.base_tax_amount))
            oprot.writeFieldEnd()

        if self.base_tax_canceled is not None:
            oprot.writeFieldBegin('base_tax_canceled', 12, -1)
            oprot.writeDecimal(self.base_tax_canceled) if hasattr(oprot, 'writeDecimal') else oprot.writeString(str(self.base_tax_canceled))
            oprot.writeFieldEnd()

        if self.base_tax_invoiced is not None:
            oprot.writeFieldBegin('base_tax_invoiced', 12, -1)
            oprot.writeDecimal(self.base_tax_invoiced) if hasattr(oprot, 'writeDecimal') else oprot.writeString(str(self.base_tax_invoiced))
            oprot.writeFieldEnd()

        if self.base_tax_refunded is not None:
            oprot.writeFieldBegin('base_tax_refunded', 12, -1)
            oprot.writeDecimal(self.base_tax_refunded) if hasattr(oprot, 'writeDecimal') else oprot.writeString(str(self.base_tax_refunded))
            oprot.writeFieldEnd()

        if self.base_to_global_rate is not None:
            oprot.writeFieldBegin('base_to_global_rate', 12, -1)
            oprot.writeDecimal(self.base_to_global_rate) if hasattr(oprot, 'writeDecimal') else oprot.writeString(str(self.base_to_global_rate))
            oprot.writeFieldEnd()

        if self.base_to_order_rate is not None:
            oprot.writeFieldBegin('base_to_order_rate', 12, -1)
            oprot.writeDecimal(self.base_to_order_rate) if hasattr(oprot, 'writeDecimal') else oprot.writeString(str(self.base_to_order_rate))
            oprot.writeFieldEnd()

        if self.base_total_canceled is not None:
            oprot.writeFieldBegin('base_total_canceled', 12, -1)
            oprot.writeDecimal(self.base_total_canceled) if hasattr(oprot, 'writeDecimal') else oprot.writeString(str(self.base_total_canceled))
            oprot.writeFieldEnd()

        if self.base_total_due is not None:
            oprot.writeFieldBegin('base_total_due', 12, -1)
            oprot.writeDecimal(self.base_total_due) if hasattr(oprot, 'writeDecimal') else oprot.writeString(str(self.base_total_due))
            oprot.writeFieldEnd()

        if self.base_total_invoiced is not None:
            oprot.writeFieldBegin('base_total_invoiced', 12, -1)
            oprot.writeDecimal(self.base_total_invoiced) if hasattr(oprot, 'writeDecimal') else oprot.writeString(str(self.base_total_invoiced))
            oprot.writeFieldEnd()

        if self.base_total_invoiced_cost is not None:
            oprot.writeFieldBegin('base_total_invoiced_cost', 12, -1)
            oprot.writeDecimal(self.base_total_invoiced_cost) if hasattr(oprot, 'writeDecimal') else oprot.writeString(str(self.base_total_invoiced_cost))
            oprot.writeFieldEnd()

        if self.base_total_offline_refunded is not None:
            oprot.writeFieldBegin('base_total_offline_refunded', 12, -1)
            oprot.writeDecimal(self.base_total_offline_refunded) if hasattr(oprot, 'writeDecimal') else oprot.writeString(str(self.base_total_offline_refunded))
            oprot.writeFieldEnd()

        if self.base_total_online_refunded is not None:
            oprot.writeFieldBegin('base_total_online_refunded', 12, -1)
            oprot.writeDecimal(self.base_total_online_refunded) if hasattr(oprot, 'writeDecimal') else oprot.writeString(str(self.base_total_online_refunded))
            oprot.writeFieldEnd()

        if self.base_total_paid is not None:
            oprot.writeFieldBegin('base_total_paid', 12, -1)
            oprot.writeDecimal(self.base_total_paid) if hasattr(oprot, 'writeDecimal') else oprot.writeString(str(self.base_total_paid))
            oprot.writeFieldEnd()

        if self.base_total_qty_ordered is not None:
            oprot.writeFieldBegin('base_total_qty_ordered', 12, -1)
            oprot.writeDecimal(self.base_total_qty_ordered) if hasattr(oprot, 'writeDecimal') else oprot.writeString(str(self.base_total_qty_ordered))
            oprot.writeFieldEnd()

        if self.base_total_refunded is not None:
            oprot.writeFieldBegin('base_total_refunded', 12, -1)
            oprot.writeDecimal(self.base_total_refunded) if hasattr(oprot, 'writeDecimal') else oprot.writeString(str(self.base_total_refunded))
            oprot.writeFieldEnd()

        if self.billing_address is not None:
            oprot.writeFieldBegin('billing_address', 12, -1)
            self.billing_address.write(oprot)
            oprot.writeFieldEnd()

        if self.billing_address_id is not None:
            oprot.writeFieldBegin('billing_address_id', 8, -1)
            oprot.writeI32(self.billing_address_id)
            oprot.writeFieldEnd()

        if self.can_ship_partially is not None:
            oprot.writeFieldBegin('can_ship_partially', 2, -1)
            oprot.writeBool(self.can_ship_partially)
            oprot.writeFieldEnd()

        if self.can_ship_partially_item is not None:
            oprot.writeFieldBegin('can_ship_partially_item', 2, -1)
            oprot.writeBool(self.can_ship_partially_item)
            oprot.writeFieldEnd()

        if self.coupon_code is not None:
            oprot.writeFieldBegin('coupon_code', 11, -1)
            oprot.writeString(self.coupon_code)
            oprot.writeFieldEnd()

        if self.coupon_rule_name is not None:
            oprot.writeFieldBegin('coupon_rule_name', 11, -1)
            oprot.writeString(self.coupon_rule_name)
            oprot.writeFieldEnd()

        oprot.writeFieldBegin('created_at', 12, -1)
        oprot.writeDateTime(self.created_at) if hasattr(oprot, 'writeDateTime') else oprot.writeI64(long(mktime(self.created_at.timetuple())) * 1000l)
        oprot.writeFieldEnd()

        if self.currency_code is not None:
            oprot.writeFieldBegin('currency_code', 11, -1)
            oprot.writeString(self.currency_code)
            oprot.writeFieldEnd()

        if self.currency_rate is not None:
            oprot.writeFieldBegin('currency_rate', 11, -1)
            oprot.writeString(self.currency_rate)
            oprot.writeFieldEnd()

        if self.custbalance_amount is not None:
            oprot.writeFieldBegin('custbalance_amount', 11, -1)
            oprot.writeString(self.custbalance_amount)
            oprot.writeFieldEnd()

        if self.customer_dob is not None:
            oprot.writeFieldBegin('customer_dob', 11, -1)
            oprot.writeString(self.customer_dob)
            oprot.writeFieldEnd()

        if self.customer_email is not None:
            oprot.writeFieldBegin('customer_email', 11, -1)
            oprot.writeString(self.customer_email)
            oprot.writeFieldEnd()

        if self.customer_firstname is not None:
            oprot.writeFieldBegin('customer_firstname', 11, -1)
            oprot.writeString(self.customer_firstname)
            oprot.writeFieldEnd()

        if self.customer_gender is not None:
            oprot.writeFieldBegin('customer_gender', 11, -1)
            oprot.writeString(self.customer_gender)
            oprot.writeFieldEnd()

        if self.customer_group_id is not None:
            oprot.writeFieldBegin('customer_group_id', 8, -1)
            oprot.writeI32(self.customer_group_id)
            oprot.writeFieldEnd()

        if self.customer_id is not None:
            oprot.writeFieldBegin('customer_id', 8, -1)
            oprot.writeI32(self.customer_id)
            oprot.writeFieldEnd()

        if self.customer_is_guest is not None:
            oprot.writeFieldBegin('customer_is_guest', 2, -1)
            oprot.writeBool(self.customer_is_guest)
            oprot.writeFieldEnd()

        if self.customer_lastname is not None:
            oprot.writeFieldBegin('customer_lastname', 11, -1)
            oprot.writeString(self.customer_lastname)
            oprot.writeFieldEnd()

        if self.customer_middlename is not None:
            oprot.writeFieldBegin('customer_middlename', 11, -1)
            oprot.writeString(self.customer_middlename)
            oprot.writeFieldEnd()

        if self.customer_note is not None:
            oprot.writeFieldBegin('customer_note', 11, -1)
            oprot.writeString(self.customer_note)
            oprot.writeFieldEnd()

        if self.customer_note_notify is not None:
            oprot.writeFieldBegin('customer_note_notify', 2, -1)
            oprot.writeBool(self.customer_note_notify)
            oprot.writeFieldEnd()

        if self.customer_prefix is not None:
            oprot.writeFieldBegin('customer_prefix', 11, -1)
            oprot.writeString(self.customer_prefix)
            oprot.writeFieldEnd()

        if self.customer_suffix is not None:
            oprot.writeFieldBegin('customer_suffix', 11, -1)
            oprot.writeString(self.customer_suffix)
            oprot.writeFieldEnd()

        if self.customer_taxvat is not None:
            oprot.writeFieldBegin('customer_taxvat', 11, -1)
            oprot.writeString(self.customer_taxvat)
            oprot.writeFieldEnd()

        if self.discount_amount is not None:
            oprot.writeFieldBegin('discount_amount', 12, -1)
            oprot.writeDecimal(self.discount_amount) if hasattr(oprot, 'writeDecimal') else oprot.writeString(str(self.discount_amount))
            oprot.writeFieldEnd()

        if self.discount_canceled is not None:
            oprot.writeFieldBegin('discount_canceled', 12, -1)
            oprot.writeDecimal(self.discount_canceled) if hasattr(oprot, 'writeDecimal') else oprot.writeString(str(self.discount_canceled))
            oprot.writeFieldEnd()

        if self.discount_description is not None:
            oprot.writeFieldBegin('discount_description', 12, -1)
            oprot.writeDecimal(self.discount_description) if hasattr(oprot, 'writeDecimal') else oprot.writeString(str(self.discount_description))
            oprot.writeFieldEnd()

        if self.discount_invoiced is not None:
            oprot.writeFieldBegin('discount_invoiced', 12, -1)
            oprot.writeDecimal(self.discount_invoiced) if hasattr(oprot, 'writeDecimal') else oprot.writeString(str(self.discount_invoiced))
            oprot.writeFieldEnd()

        if self.discount_refunded is not None:
            oprot.writeFieldBegin('discount_refunded', 12, -1)
            oprot.writeDecimal(self.discount_refunded) if hasattr(oprot, 'writeDecimal') else oprot.writeString(str(self.discount_refunded))
            oprot.writeFieldEnd()

        if self.edit_increment is not None:
            oprot.writeFieldBegin('edit_increment', 11, -1)
            oprot.writeString(self.edit_increment)
            oprot.writeFieldEnd()

        if self.email_sent is not None:
            oprot.writeFieldBegin('email_sent', 2, -1)
            oprot.writeBool(self.email_sent)
            oprot.writeFieldEnd()

        if self.forced_do_shipment_with_invoice is not None:
            oprot.writeFieldBegin('forced_do_shipment_with_invoice', 2, -1)
            oprot.writeBool(self.forced_do_shipment_with_invoice)
            oprot.writeFieldEnd()

        if self.forced_shipment_with_invoice is not None:
            oprot.writeFieldBegin('forced_shipment_with_invoice', 2, -1)
            oprot.writeBool(self.forced_shipment_with_invoice)
            oprot.writeFieldEnd()

        if self.gift_message_id is not None:
            oprot.writeFieldBegin('gift_message_id', 8, -1)
            oprot.writeI32(self.gift_message_id)
            oprot.writeFieldEnd()

        if self.global_currency_code is not None:
            oprot.writeFieldBegin('global_currency_code', 11, -1)
            oprot.writeString(self.global_currency_code)
            oprot.writeFieldEnd()

        oprot.writeFieldBegin('grand_total', 12, -1)
        oprot.writeDecimal(self.grand_total) if hasattr(oprot, 'writeDecimal') else oprot.writeString(str(self.grand_total))
        oprot.writeFieldEnd()

        if self.hidden_tax_amount is not None:
            oprot.writeFieldBegin('hidden_tax_amount', 12, -1)
            oprot.writeDecimal(self.hidden_tax_amount) if hasattr(oprot, 'writeDecimal') else oprot.writeString(str(self.hidden_tax_amount))
            oprot.writeFieldEnd()

        if self.hidden_tax_invoiced is not None:
            oprot.writeFieldBegin('hidden_tax_invoiced', 12, -1)
            oprot.writeDecimal(self.hidden_tax_invoiced) if hasattr(oprot, 'writeDecimal') else oprot.writeString(str(self.hidden_tax_invoiced))
            oprot.writeFieldEnd()

        if self.hidden_tax_refunded is not None:
            oprot.writeFieldBegin('hidden_tax_refunded', 12, -1)
            oprot.writeDecimal(self.hidden_tax_refunded) if hasattr(oprot, 'writeDecimal') else oprot.writeString(str(self.hidden_tax_refunded))
            oprot.writeFieldEnd()

        oprot.writeFieldBegin('increment_id', 11, -1)
        oprot.writeString(self.increment_id)
        oprot.writeFieldEnd()

        if self.is_hold is not None:
            oprot.writeFieldBegin('is_hold', 2, -1)
            oprot.writeBool(self.is_hold)
            oprot.writeFieldEnd()

        if self.is_multi_payment is not None:
            oprot.writeFieldBegin('is_multi_payment', 2, -1)
            oprot.writeBool(self.is_multi_payment)
            oprot.writeFieldEnd()

        oprot.writeFieldBegin('is_virtual', 2, -1)
        oprot.writeBool(self.is_virtual)
        oprot.writeFieldEnd()

        if self.items is not None:
            oprot.writeFieldBegin('items', 14, -1)
            oprot.writeSetBegin(12, len(self.items))
            for _0 in self.items:
                _0.write(oprot)
            oprot.writeSetEnd()
            oprot.writeFieldEnd()

        oprot.writeFieldBegin('order_currency_code', 11, -1)
        oprot.writeString(self.order_currency_code)
        oprot.writeFieldEnd()

        if self.order_id is not None:
            oprot.writeFieldBegin('order_id', 8, -1)
            oprot.writeI32(self.order_id)
            oprot.writeFieldEnd()

        if self.original_increment_id is not None:
            oprot.writeFieldBegin('original_increment_id', 11, -1)
            oprot.writeString(self.original_increment_id)
            oprot.writeFieldEnd()

        if self.quote_id is not None:
            oprot.writeFieldBegin('quote_id', 8, -1)
            oprot.writeI32(self.quote_id)
            oprot.writeFieldEnd()

        if self.relation_child_id is not None:
            oprot.writeFieldBegin('relation_child_id', 8, -1)
            oprot.writeI32(self.relation_child_id)
            oprot.writeFieldEnd()

        if self.relation_child_real_id is not None:
            oprot.writeFieldBegin('relation_child_real_id', 8, -1)
            oprot.writeI32(self.relation_child_real_id)
            oprot.writeFieldEnd()

        if self.relation_parent_id is not None:
            oprot.writeFieldBegin('relation_parent_id', 8, -1)
            oprot.writeI32(self.relation_parent_id)
            oprot.writeFieldEnd()

        if self.relation_parent_real_id is not None:
            oprot.writeFieldBegin('relation_parent_real_id', 8, -1)
            oprot.writeI32(self.relation_parent_real_id)
            oprot.writeFieldEnd()

        if self.remote_ip is not None:
            oprot.writeFieldBegin('remote_ip', 11, -1)
            oprot.writeString(self.remote_ip)
            oprot.writeFieldEnd()

        if self.shipping_address is not None:
            oprot.writeFieldBegin('shipping_address', 12, -1)
            self.shipping_address.write(oprot)
            oprot.writeFieldEnd()

        if self.shipping_address_id is not None:
            oprot.writeFieldBegin('shipping_address_id', 8, -1)
            oprot.writeI32(self.shipping_address_id)
            oprot.writeFieldEnd()

        if self.shipping_amount is not None:
            oprot.writeFieldBegin('shipping_amount', 12, -1)
            oprot.writeDecimal(self.shipping_amount) if hasattr(oprot, 'writeDecimal') else oprot.writeString(str(self.shipping_amount))
            oprot.writeFieldEnd()

        if self.shipping_canceled is not None:
            oprot.writeFieldBegin('shipping_canceled', 12, -1)
            oprot.writeDecimal(self.shipping_canceled) if hasattr(oprot, 'writeDecimal') else oprot.writeString(str(self.shipping_canceled))
            oprot.writeFieldEnd()

        if self.shipping_description is not None:
            oprot.writeFieldBegin('shipping_description', 11, -1)
            oprot.writeString(self.shipping_description)
            oprot.writeFieldEnd()

        if self.shipping_discount_amount is not None:
            oprot.writeFieldBegin('shipping_discount_amount', 12, -1)
            oprot.writeDecimal(self.shipping_discount_amount) if hasattr(oprot, 'writeDecimal') else oprot.writeString(str(self.shipping_discount_amount))
            oprot.writeFieldEnd()

        if self.shipping_hidden_tax_amount is not None:
            oprot.writeFieldBegin('shipping_hidden_tax_amount', 12, -1)
            oprot.writeDecimal(self.shipping_hidden_tax_amount) if hasattr(oprot, 'writeDecimal') else oprot.writeString(str(self.shipping_hidden_tax_amount))
            oprot.writeFieldEnd()

        if self.shipping_incl_tax is not None:
            oprot.writeFieldBegin('shipping_incl_tax', 12, -1)
            oprot.writeDecimal(self.shipping_incl_tax) if hasattr(oprot, 'writeDecimal') else oprot.writeString(str(self.shipping_incl_tax))
            oprot.writeFieldEnd()

        if self.shipping_invoiced is not None:
            oprot.writeFieldBegin('shipping_invoiced', 12, -1)
            oprot.writeDecimal(self.shipping_invoiced) if hasattr(oprot, 'writeDecimal') else oprot.writeString(str(self.shipping_invoiced))
            oprot.writeFieldEnd()

        if self.shipping_method is not None:
            oprot.writeFieldBegin('shipping_method', 11, -1)
            oprot.writeString(self.shipping_method)
            oprot.writeFieldEnd()

        if self.shipping_refunded is not None:
            oprot.writeFieldBegin('shipping_refunded', 12, -1)
            oprot.writeDecimal(self.shipping_refunded) if hasattr(oprot, 'writeDecimal') else oprot.writeString(str(self.shipping_refunded))
            oprot.writeFieldEnd()

        if self.shipping_tax_amount is not None:
            oprot.writeFieldBegin('shipping_tax_amount', 12, -1)
            oprot.writeDecimal(self.shipping_tax_amount) if hasattr(oprot, 'writeDecimal') else oprot.writeString(str(self.shipping_tax_amount))
            oprot.writeFieldEnd()

        if self.shipping_tax_refunded is not None:
            oprot.writeFieldBegin('shipping_tax_refunded', 12, -1)
            oprot.writeDecimal(self.shipping_tax_refunded) if hasattr(oprot, 'writeDecimal') else oprot.writeString(str(self.shipping_tax_refunded))
            oprot.writeFieldEnd()

        if self.state is not None:
            oprot.writeFieldBegin('state', 11, -1)
            oprot.writeString(self.state)
            oprot.writeFieldEnd()

        if self.status is not None:
            oprot.writeFieldBegin('status', 11, -1)
            oprot.writeString([attr for attr in dir(yogento.api.models.sales.order.magento.magento_order_status.MagentoOrderStatus) if getattr(yogento.api.models.sales.order.magento.magento_order_status.MagentoOrderStatus, attr) == self.status][0])
            oprot.writeFieldEnd()

        if self.status_history is not None:
            oprot.writeFieldBegin('status_history', 15, -1)
            oprot.writeListBegin(12, len(self.status_history))
            for _0 in self.status_history:
                _0.write(oprot)
            oprot.writeListEnd()
            oprot.writeFieldEnd()

        if self.store_currency_code is not None:
            oprot.writeFieldBegin('store_currency_code', 11, -1)
            oprot.writeString(self.store_currency_code)
            oprot.writeFieldEnd()

        if self.store_id is not None:
            oprot.writeFieldBegin('store_id', 8, -1)
            oprot.writeI32(self.store_id)
            oprot.writeFieldEnd()

        if self.store_name is not None:
            oprot.writeFieldBegin('store_name', 11, -1)
            oprot.writeString(self.store_name)
            oprot.writeFieldEnd()

        if self.store_to_base_rate is not None:
            oprot.writeFieldBegin('store_to_base_rate', 12, -1)
            oprot.writeDecimal(self.store_to_base_rate) if hasattr(oprot, 'writeDecimal') else oprot.writeString(str(self.store_to_base_rate))
            oprot.writeFieldEnd()

        if self.store_to_order_rate is not None:
            oprot.writeFieldBegin('store_to_order_rate', 12, -1)
            oprot.writeDecimal(self.store_to_order_rate) if hasattr(oprot, 'writeDecimal') else oprot.writeString(str(self.store_to_order_rate))
            oprot.writeFieldEnd()

        if self.subtotal is not None:
            oprot.writeFieldBegin('subtotal', 12, -1)
            oprot.writeDecimal(self.subtotal) if hasattr(oprot, 'writeDecimal') else oprot.writeString(str(self.subtotal))
            oprot.writeFieldEnd()

        if self.subtotal_canceled is not None:
            oprot.writeFieldBegin('subtotal_canceled', 12, -1)
            oprot.writeDecimal(self.subtotal_canceled) if hasattr(oprot, 'writeDecimal') else oprot.writeString(str(self.subtotal_canceled))
            oprot.writeFieldEnd()

        if self.subtotal_incl_tax is not None:
            oprot.writeFieldBegin('subtotal_incl_tax', 12, -1)
            oprot.writeDecimal(self.subtotal_incl_tax) if hasattr(oprot, 'writeDecimal') else oprot.writeString(str(self.subtotal_incl_tax))
            oprot.writeFieldEnd()

        if self.subtotal_invoiced is not None:
            oprot.writeFieldBegin('subtotal_invoiced', 12, -1)
            oprot.writeDecimal(self.subtotal_invoiced) if hasattr(oprot, 'writeDecimal') else oprot.writeString(str(self.subtotal_invoiced))
            oprot.writeFieldEnd()

        if self.subtotal_refunded is not None:
            oprot.writeFieldBegin('subtotal_refunded', 12, -1)
            oprot.writeDecimal(self.subtotal_refunded) if hasattr(oprot, 'writeDecimal') else oprot.writeString(str(self.subtotal_refunded))
            oprot.writeFieldEnd()

        if self.tax_amount is not None:
            oprot.writeFieldBegin('tax_amount', 12, -1)
            oprot.writeDecimal(self.tax_amount) if hasattr(oprot, 'writeDecimal') else oprot.writeString(str(self.tax_amount))
            oprot.writeFieldEnd()

        if self.tax_canceled is not None:
            oprot.writeFieldBegin('tax_canceled', 12, -1)
            oprot.writeDecimal(self.tax_canceled) if hasattr(oprot, 'writeDecimal') else oprot.writeString(str(self.tax_canceled))
            oprot.writeFieldEnd()

        if self.tax_invoiced is not None:
            oprot.writeFieldBegin('tax_invoiced', 12, -1)
            oprot.writeDecimal(self.tax_invoiced) if hasattr(oprot, 'writeDecimal') else oprot.writeString(str(self.tax_invoiced))
            oprot.writeFieldEnd()

        if self.tax_percent is not None:
            oprot.writeFieldBegin('tax_percent', 12, -1)
            oprot.writeDecimal(self.tax_percent) if hasattr(oprot, 'writeDecimal') else oprot.writeString(str(self.tax_percent))
            oprot.writeFieldEnd()

        if self.tax_refunded is not None:
            oprot.writeFieldBegin('tax_refunded', 12, -1)
            oprot.writeDecimal(self.tax_refunded) if hasattr(oprot, 'writeDecimal') else oprot.writeString(str(self.tax_refunded))
            oprot.writeFieldEnd()

        if self.total_canceled is not None:
            oprot.writeFieldBegin('total_canceled', 12, -1)
            oprot.writeDecimal(self.total_canceled) if hasattr(oprot, 'writeDecimal') else oprot.writeString(str(self.total_canceled))
            oprot.writeFieldEnd()

        if self.total_due is not None:
            oprot.writeFieldBegin('total_due', 12, -1)
            oprot.writeDecimal(self.total_due) if hasattr(oprot, 'writeDecimal') else oprot.writeString(str(self.total_due))
            oprot.writeFieldEnd()

        if self.total_invoiced is not None:
            oprot.writeFieldBegin('total_invoiced', 12, -1)
            oprot.writeDecimal(self.total_invoiced) if hasattr(oprot, 'writeDecimal') else oprot.writeString(str(self.total_invoiced))
            oprot.writeFieldEnd()

        if self.total_item_count is not None:
            oprot.writeFieldBegin('total_item_count', 12, -1)
            oprot.writeDecimal(self.total_item_count) if hasattr(oprot, 'writeDecimal') else oprot.writeString(str(self.total_item_count))
            oprot.writeFieldEnd()

        if self.total_offline_refunded is not None:
            oprot.writeFieldBegin('total_offline_refunded', 12, -1)
            oprot.writeDecimal(self.total_offline_refunded) if hasattr(oprot, 'writeDecimal') else oprot.writeString(str(self.total_offline_refunded))
            oprot.writeFieldEnd()

        if self.total_online_refunded is not None:
            oprot.writeFieldBegin('total_online_refunded', 12, -1)
            oprot.writeDecimal(self.total_online_refunded) if hasattr(oprot, 'writeDecimal') else oprot.writeString(str(self.total_online_refunded))
            oprot.writeFieldEnd()

        if self.total_paid is not None:
            oprot.writeFieldBegin('total_paid', 12, -1)
            oprot.writeDecimal(self.total_paid) if hasattr(oprot, 'writeDecimal') else oprot.writeString(str(self.total_paid))
            oprot.writeFieldEnd()

        if self.total_qty_ordered is not None:
            oprot.writeFieldBegin('total_qty_ordered', 12, -1)
            oprot.writeDecimal(self.total_qty_ordered) if hasattr(oprot, 'writeDecimal') else oprot.writeString(str(self.total_qty_ordered))
            oprot.writeFieldEnd()

        if self.total_refunded is not None:
            oprot.writeFieldBegin('total_refunded', 12, -1)
            oprot.writeDecimal(self.total_refunded) if hasattr(oprot, 'writeDecimal') else oprot.writeString(str(self.total_refunded))
            oprot.writeFieldEnd()

        if self.tracking_numbers is not None:
            oprot.writeFieldBegin('tracking_numbers', 15, -1)
            oprot.writeListBegin(11, len(self.tracking_numbers))
            for _0 in self.tracking_numbers:
                oprot.writeString(_0)
            oprot.writeListEnd()
            oprot.writeFieldEnd()

        oprot.writeFieldBegin('updated_at', 12, -1)
        oprot.writeDateTime(self.updated_at) if hasattr(oprot, 'writeDateTime') else oprot.writeI64(long(mktime(self.updated_at.timetuple())) * 1000l)
        oprot.writeFieldEnd()

        if self.weight is not None:
            oprot.writeFieldBegin('weight', 12, -1)
            oprot.writeDecimal(self.weight) if hasattr(oprot, 'writeDecimal') else oprot.writeString(str(self.weight))
            oprot.writeFieldEnd()

        if self.x_forwarded_for is not None:
            oprot.writeFieldBegin('x_forwarded_for', 11, -1)
            oprot.writeString(self.x_forwarded_for)
            oprot.writeFieldEnd()

        oprot.writeFieldStop()

        oprot.writeStructEnd()

    @property
    def x_forwarded_for(self):
        return self.__x_forwarded_for
