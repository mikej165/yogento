from __future__ import absolute_import; import decimal
from datetime import datetime
from time import mktime
import __builtin__
import yogento.api.models.catalog.product.magento.magento_product_type


class MagentoOrderItem(object):
    class Builder:
        def __init__(
            self,
            created_at,
            name,
            product_type,
            sku,
            updated_at,
            additional_data=None,
            amount_refunded=None,
            base_amount_refunded=None,
            base_cost=None,
            base_discount_amount=None,
            base_discount_invoiced=None,
            base_discount_refunded=None,
            base_hidden_tax_amount=None,
            base_hidden_tax_invoiced=None,
            base_hidden_tax_refunded=None,
            base_original_price=None,
            base_price=None,
            base_price_incl_tax=None,
            base_row_invoiced=None,
            base_row_total=None,
            base_row_total_incl_tax=None,
            base_tax_amount=None,
            base_tax_before_discount=None,
            base_tax_invoiced=None,
            base_tax_refunded=None,
            base_weee_tax_applied_amount=None,
            base_weee_tax_applied_row_amnt=None,
            base_weee_tax_applied_row_amount=None,
            base_weee_tax_disposition=None,
            base_weee_tax_row_disposition=None,
            description=None,
            discount_amount=None,
            discount_invoiced=None,
            discount_percent=None,
            discount_refunded=None,
            free_shipping=None,
            gift_message_available=None,
            gift_message_id=None,
            has_children=None,
            hidden_tax_amount=None,
            hidden_tax_canceled=None,
            hidden_tax_invoiced=None,
            hidden_tax_refunded=None,
            is_nominal=None,
            is_qty_decimal=None,
            is_virtual=None,
            item_id=None,
            locked_do_invoice=None,
            locked_do_ship=None,
            no_discount=None,
            order_id=None,
            original_price=None,
            parent_item_id=None,
            price=None,
            price_incl_tax=None,
            product_id=None,
            qty_backordered=None,
            qty_canceled=None,
            qty_invoiced=None,
            qty_ordered=None,
            qty_refunded=None,
            qty_shipped=None,
            quote_item_id=None,
            row_invoiced=None,
            row_total=None,
            row_total_incl_tax=None,
            row_weight=None,
            store_id=None,
            tax_amount=None,
            tax_before_discount=None,
            tax_canceled=None,
            tax_invoiced=None,
            tax_percent=None,
            tax_refunded=None,
            weee_tax_applied_amount=None,
            weee_tax_applied_row_amount=None,
            weee_tax_disposition=None,
            weee_tax_row_disposition=None,
            weight=None
        ):
            self.__additional_data = additional_data
            self.__amount_refunded = amount_refunded
            self.__base_amount_refunded = base_amount_refunded
            self.__base_cost = base_cost
            self.__base_discount_amount = base_discount_amount
            self.__base_discount_invoiced = base_discount_invoiced
            self.__base_discount_refunded = base_discount_refunded
            self.__base_hidden_tax_amount = base_hidden_tax_amount
            self.__base_hidden_tax_invoiced = base_hidden_tax_invoiced
            self.__base_hidden_tax_refunded = base_hidden_tax_refunded
            self.__base_original_price = base_original_price
            self.__base_price = base_price
            self.__base_price_incl_tax = base_price_incl_tax
            self.__base_row_invoiced = base_row_invoiced
            self.__base_row_total = base_row_total
            self.__base_row_total_incl_tax = base_row_total_incl_tax
            self.__base_tax_amount = base_tax_amount
            self.__base_tax_before_discount = base_tax_before_discount
            self.__base_tax_invoiced = base_tax_invoiced
            self.__base_tax_refunded = base_tax_refunded
            self.__base_weee_tax_applied_amount = base_weee_tax_applied_amount
            self.__base_weee_tax_applied_row_amnt = base_weee_tax_applied_row_amnt
            self.__base_weee_tax_applied_row_amount = base_weee_tax_applied_row_amount
            self.__base_weee_tax_disposition = base_weee_tax_disposition
            self.__base_weee_tax_row_disposition = base_weee_tax_row_disposition
            self.__created_at = created_at
            self.__description = description
            self.__discount_amount = discount_amount
            self.__discount_invoiced = discount_invoiced
            self.__discount_percent = discount_percent
            self.__discount_refunded = discount_refunded
            self.__free_shipping = free_shipping
            self.__gift_message_available = gift_message_available
            self.__gift_message_id = gift_message_id
            self.__has_children = has_children
            self.__hidden_tax_amount = hidden_tax_amount
            self.__hidden_tax_canceled = hidden_tax_canceled
            self.__hidden_tax_invoiced = hidden_tax_invoiced
            self.__hidden_tax_refunded = hidden_tax_refunded
            self.__is_nominal = is_nominal
            self.__is_qty_decimal = is_qty_decimal
            self.__is_virtual = is_virtual
            self.__item_id = item_id
            self.__locked_do_invoice = locked_do_invoice
            self.__locked_do_ship = locked_do_ship
            self.__name = name
            self.__no_discount = no_discount
            self.__order_id = order_id
            self.__original_price = original_price
            self.__parent_item_id = parent_item_id
            self.__price = price
            self.__price_incl_tax = price_incl_tax
            self.__product_id = product_id
            self.__product_type = product_type
            self.__qty_backordered = qty_backordered
            self.__qty_canceled = qty_canceled
            self.__qty_invoiced = qty_invoiced
            self.__qty_ordered = qty_ordered
            self.__qty_refunded = qty_refunded
            self.__qty_shipped = qty_shipped
            self.__quote_item_id = quote_item_id
            self.__row_invoiced = row_invoiced
            self.__row_total = row_total
            self.__row_total_incl_tax = row_total_incl_tax
            self.__row_weight = row_weight
            self.__sku = sku
            self.__store_id = store_id
            self.__tax_amount = tax_amount
            self.__tax_before_discount = tax_before_discount
            self.__tax_canceled = tax_canceled
            self.__tax_invoiced = tax_invoiced
            self.__tax_percent = tax_percent
            self.__tax_refunded = tax_refunded
            self.__updated_at = updated_at
            self.__weee_tax_applied_amount = weee_tax_applied_amount
            self.__weee_tax_applied_row_amount = weee_tax_applied_row_amount
            self.__weee_tax_disposition = weee_tax_disposition
            self.__weee_tax_row_disposition = weee_tax_row_disposition
            self.__weight = weight

        def build(self):
            return MagentoOrderItem(additional_data=self.__additional_data, amount_refunded=self.__amount_refunded, base_amount_refunded=self.__base_amount_refunded, base_cost=self.__base_cost, base_discount_amount=self.__base_discount_amount, base_discount_invoiced=self.__base_discount_invoiced, base_discount_refunded=self.__base_discount_refunded, base_hidden_tax_amount=self.__base_hidden_tax_amount, base_hidden_tax_invoiced=self.__base_hidden_tax_invoiced, base_hidden_tax_refunded=self.__base_hidden_tax_refunded, base_original_price=self.__base_original_price, base_price=self.__base_price, base_price_incl_tax=self.__base_price_incl_tax, base_row_invoiced=self.__base_row_invoiced, base_row_total=self.__base_row_total, base_row_total_incl_tax=self.__base_row_total_incl_tax, base_tax_amount=self.__base_tax_amount, base_tax_before_discount=self.__base_tax_before_discount, base_tax_invoiced=self.__base_tax_invoiced, base_tax_refunded=self.__base_tax_refunded, base_weee_tax_applied_amount=self.__base_weee_tax_applied_amount, base_weee_tax_applied_row_amnt=self.__base_weee_tax_applied_row_amnt, base_weee_tax_applied_row_amount=self.__base_weee_tax_applied_row_amount, base_weee_tax_disposition=self.__base_weee_tax_disposition, base_weee_tax_row_disposition=self.__base_weee_tax_row_disposition, created_at=self.__created_at, description=self.__description, discount_amount=self.__discount_amount, discount_invoiced=self.__discount_invoiced, discount_percent=self.__discount_percent, discount_refunded=self.__discount_refunded, free_shipping=self.__free_shipping, gift_message_available=self.__gift_message_available, gift_message_id=self.__gift_message_id, has_children=self.__has_children, hidden_tax_amount=self.__hidden_tax_amount, hidden_tax_canceled=self.__hidden_tax_canceled, hidden_tax_invoiced=self.__hidden_tax_invoiced, hidden_tax_refunded=self.__hidden_tax_refunded, is_nominal=self.__is_nominal, is_qty_decimal=self.__is_qty_decimal, is_virtual=self.__is_virtual, item_id=self.__item_id, locked_do_invoice=self.__locked_do_invoice, locked_do_ship=self.__locked_do_ship, name=self.__name, no_discount=self.__no_discount, order_id=self.__order_id, original_price=self.__original_price, parent_item_id=self.__parent_item_id, price=self.__price, price_incl_tax=self.__price_incl_tax, product_id=self.__product_id, product_type=self.__product_type, qty_backordered=self.__qty_backordered, qty_canceled=self.__qty_canceled, qty_invoiced=self.__qty_invoiced, qty_ordered=self.__qty_ordered, qty_refunded=self.__qty_refunded, qty_shipped=self.__qty_shipped, quote_item_id=self.__quote_item_id, row_invoiced=self.__row_invoiced, row_total=self.__row_total, row_total_incl_tax=self.__row_total_incl_tax, row_weight=self.__row_weight, sku=self.__sku, store_id=self.__store_id, tax_amount=self.__tax_amount, tax_before_discount=self.__tax_before_discount, tax_canceled=self.__tax_canceled, tax_invoiced=self.__tax_invoiced, tax_percent=self.__tax_percent, tax_refunded=self.__tax_refunded, updated_at=self.__updated_at, weee_tax_applied_amount=self.__weee_tax_applied_amount, weee_tax_applied_row_amount=self.__weee_tax_applied_row_amount, weee_tax_disposition=self.__weee_tax_disposition, weee_tax_row_disposition=self.__weee_tax_row_disposition, weight=self.__weight)

        def set_additional_data(self, additional_data):
            self.__additional_data = additional_data
            return self

        def set_amount_refunded(self, amount_refunded):
            self.__amount_refunded = amount_refunded
            return self

        def set_base_amount_refunded(self, base_amount_refunded):
            self.__base_amount_refunded = base_amount_refunded
            return self

        def set_base_cost(self, base_cost):
            self.__base_cost = base_cost
            return self

        def set_base_discount_amount(self, base_discount_amount):
            self.__base_discount_amount = base_discount_amount
            return self

        def set_base_discount_invoiced(self, base_discount_invoiced):
            self.__base_discount_invoiced = base_discount_invoiced
            return self

        def set_base_discount_refunded(self, base_discount_refunded):
            self.__base_discount_refunded = base_discount_refunded
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

        def set_base_original_price(self, base_original_price):
            self.__base_original_price = base_original_price
            return self

        def set_base_price(self, base_price):
            self.__base_price = base_price
            return self

        def set_base_price_incl_tax(self, base_price_incl_tax):
            self.__base_price_incl_tax = base_price_incl_tax
            return self

        def set_base_row_invoiced(self, base_row_invoiced):
            self.__base_row_invoiced = base_row_invoiced
            return self

        def set_base_row_total(self, base_row_total):
            self.__base_row_total = base_row_total
            return self

        def set_base_row_total_incl_tax(self, base_row_total_incl_tax):
            self.__base_row_total_incl_tax = base_row_total_incl_tax
            return self

        def set_base_tax_amount(self, base_tax_amount):
            self.__base_tax_amount = base_tax_amount
            return self

        def set_base_tax_before_discount(self, base_tax_before_discount):
            self.__base_tax_before_discount = base_tax_before_discount
            return self

        def set_base_tax_invoiced(self, base_tax_invoiced):
            self.__base_tax_invoiced = base_tax_invoiced
            return self

        def set_base_tax_refunded(self, base_tax_refunded):
            self.__base_tax_refunded = base_tax_refunded
            return self

        def set_base_weee_tax_applied_amount(self, base_weee_tax_applied_amount):
            self.__base_weee_tax_applied_amount = base_weee_tax_applied_amount
            return self

        def set_base_weee_tax_applied_row_amnt(self, base_weee_tax_applied_row_amnt):
            self.__base_weee_tax_applied_row_amnt = base_weee_tax_applied_row_amnt
            return self

        def set_base_weee_tax_applied_row_amount(self, base_weee_tax_applied_row_amount):
            self.__base_weee_tax_applied_row_amount = base_weee_tax_applied_row_amount
            return self

        def set_base_weee_tax_disposition(self, base_weee_tax_disposition):
            self.__base_weee_tax_disposition = base_weee_tax_disposition
            return self

        def set_base_weee_tax_row_disposition(self, base_weee_tax_row_disposition):
            self.__base_weee_tax_row_disposition = base_weee_tax_row_disposition
            return self

        def set_created_at(self, created_at):
            self.__created_at = created_at
            return self

        def set_description(self, description):
            self.__description = description
            return self

        def set_discount_amount(self, discount_amount):
            self.__discount_amount = discount_amount
            return self

        def set_discount_invoiced(self, discount_invoiced):
            self.__discount_invoiced = discount_invoiced
            return self

        def set_discount_percent(self, discount_percent):
            self.__discount_percent = discount_percent
            return self

        def set_discount_refunded(self, discount_refunded):
            self.__discount_refunded = discount_refunded
            return self

        def set_free_shipping(self, free_shipping):
            self.__free_shipping = free_shipping
            return self

        def set_gift_message_available(self, gift_message_available):
            self.__gift_message_available = gift_message_available
            return self

        def set_gift_message_id(self, gift_message_id):
            self.__gift_message_id = gift_message_id
            return self

        def set_has_children(self, has_children):
            self.__has_children = has_children
            return self

        def set_hidden_tax_amount(self, hidden_tax_amount):
            self.__hidden_tax_amount = hidden_tax_amount
            return self

        def set_hidden_tax_canceled(self, hidden_tax_canceled):
            self.__hidden_tax_canceled = hidden_tax_canceled
            return self

        def set_hidden_tax_invoiced(self, hidden_tax_invoiced):
            self.__hidden_tax_invoiced = hidden_tax_invoiced
            return self

        def set_hidden_tax_refunded(self, hidden_tax_refunded):
            self.__hidden_tax_refunded = hidden_tax_refunded
            return self

        def set_is_nominal(self, is_nominal):
            self.__is_nominal = is_nominal
            return self

        def set_is_qty_decimal(self, is_qty_decimal):
            self.__is_qty_decimal = is_qty_decimal
            return self

        def set_is_virtual(self, is_virtual):
            self.__is_virtual = is_virtual
            return self

        def set_item_id(self, item_id):
            self.__item_id = item_id
            return self

        def set_locked_do_invoice(self, locked_do_invoice):
            self.__locked_do_invoice = locked_do_invoice
            return self

        def set_locked_do_ship(self, locked_do_ship):
            self.__locked_do_ship = locked_do_ship
            return self

        def set_name(self, name):
            self.__name = name
            return self

        def set_no_discount(self, no_discount):
            self.__no_discount = no_discount
            return self

        def set_order_id(self, order_id):
            self.__order_id = order_id
            return self

        def set_original_price(self, original_price):
            self.__original_price = original_price
            return self

        def set_parent_item_id(self, parent_item_id):
            self.__parent_item_id = parent_item_id
            return self

        def set_price(self, price):
            self.__price = price
            return self

        def set_price_incl_tax(self, price_incl_tax):
            self.__price_incl_tax = price_incl_tax
            return self

        def set_product_id(self, product_id):
            self.__product_id = product_id
            return self

        def set_product_type(self, product_type):
            self.__product_type = product_type
            return self

        def set_qty_backordered(self, qty_backordered):
            self.__qty_backordered = qty_backordered
            return self

        def set_qty_canceled(self, qty_canceled):
            self.__qty_canceled = qty_canceled
            return self

        def set_qty_invoiced(self, qty_invoiced):
            self.__qty_invoiced = qty_invoiced
            return self

        def set_qty_ordered(self, qty_ordered):
            self.__qty_ordered = qty_ordered
            return self

        def set_qty_refunded(self, qty_refunded):
            self.__qty_refunded = qty_refunded
            return self

        def set_qty_shipped(self, qty_shipped):
            self.__qty_shipped = qty_shipped
            return self

        def set_quote_item_id(self, quote_item_id):
            self.__quote_item_id = quote_item_id
            return self

        def set_row_invoiced(self, row_invoiced):
            self.__row_invoiced = row_invoiced
            return self

        def set_row_total(self, row_total):
            self.__row_total = row_total
            return self

        def set_row_total_incl_tax(self, row_total_incl_tax):
            self.__row_total_incl_tax = row_total_incl_tax
            return self

        def set_row_weight(self, row_weight):
            self.__row_weight = row_weight
            return self

        def set_sku(self, sku):
            self.__sku = sku
            return self

        def set_store_id(self, store_id):
            self.__store_id = store_id
            return self

        def set_tax_amount(self, tax_amount):
            self.__tax_amount = tax_amount
            return self

        def set_tax_before_discount(self, tax_before_discount):
            self.__tax_before_discount = tax_before_discount
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

        def set_updated_at(self, updated_at):
            self.__updated_at = updated_at
            return self

        def set_weee_tax_applied_amount(self, weee_tax_applied_amount):
            self.__weee_tax_applied_amount = weee_tax_applied_amount
            return self

        def set_weee_tax_applied_row_amount(self, weee_tax_applied_row_amount):
            self.__weee_tax_applied_row_amount = weee_tax_applied_row_amount
            return self

        def set_weee_tax_disposition(self, weee_tax_disposition):
            self.__weee_tax_disposition = weee_tax_disposition
            return self

        def set_weee_tax_row_disposition(self, weee_tax_row_disposition):
            self.__weee_tax_row_disposition = weee_tax_row_disposition
            return self

        def set_weight(self, weight):
            self.__weight = weight
            return self

        def update(self, magento_order_item):
            if isinstance(magento_order_item, MagentoOrderItem):
                self.set_additional_data(magento_order_item.additional_data)
                self.set_amount_refunded(magento_order_item.amount_refunded)
                self.set_base_amount_refunded(magento_order_item.base_amount_refunded)
                self.set_base_cost(magento_order_item.base_cost)
                self.set_base_discount_amount(magento_order_item.base_discount_amount)
                self.set_base_discount_invoiced(magento_order_item.base_discount_invoiced)
                self.set_base_discount_refunded(magento_order_item.base_discount_refunded)
                self.set_base_hidden_tax_amount(magento_order_item.base_hidden_tax_amount)
                self.set_base_hidden_tax_invoiced(magento_order_item.base_hidden_tax_invoiced)
                self.set_base_hidden_tax_refunded(magento_order_item.base_hidden_tax_refunded)
                self.set_base_original_price(magento_order_item.base_original_price)
                self.set_base_price(magento_order_item.base_price)
                self.set_base_price_incl_tax(magento_order_item.base_price_incl_tax)
                self.set_base_row_invoiced(magento_order_item.base_row_invoiced)
                self.set_base_row_total(magento_order_item.base_row_total)
                self.set_base_row_total_incl_tax(magento_order_item.base_row_total_incl_tax)
                self.set_base_tax_amount(magento_order_item.base_tax_amount)
                self.set_base_tax_before_discount(magento_order_item.base_tax_before_discount)
                self.set_base_tax_invoiced(magento_order_item.base_tax_invoiced)
                self.set_base_tax_refunded(magento_order_item.base_tax_refunded)
                self.set_base_weee_tax_applied_amount(magento_order_item.base_weee_tax_applied_amount)
                self.set_base_weee_tax_applied_row_amnt(magento_order_item.base_weee_tax_applied_row_amnt)
                self.set_base_weee_tax_applied_row_amount(magento_order_item.base_weee_tax_applied_row_amount)
                self.set_base_weee_tax_disposition(magento_order_item.base_weee_tax_disposition)
                self.set_base_weee_tax_row_disposition(magento_order_item.base_weee_tax_row_disposition)
                self.set_created_at(magento_order_item.created_at)
                self.set_description(magento_order_item.description)
                self.set_discount_amount(magento_order_item.discount_amount)
                self.set_discount_invoiced(magento_order_item.discount_invoiced)
                self.set_discount_percent(magento_order_item.discount_percent)
                self.set_discount_refunded(magento_order_item.discount_refunded)
                self.set_free_shipping(magento_order_item.free_shipping)
                self.set_gift_message_available(magento_order_item.gift_message_available)
                self.set_gift_message_id(magento_order_item.gift_message_id)
                self.set_has_children(magento_order_item.has_children)
                self.set_hidden_tax_amount(magento_order_item.hidden_tax_amount)
                self.set_hidden_tax_canceled(magento_order_item.hidden_tax_canceled)
                self.set_hidden_tax_invoiced(magento_order_item.hidden_tax_invoiced)
                self.set_hidden_tax_refunded(magento_order_item.hidden_tax_refunded)
                self.set_is_nominal(magento_order_item.is_nominal)
                self.set_is_qty_decimal(magento_order_item.is_qty_decimal)
                self.set_is_virtual(magento_order_item.is_virtual)
                self.set_item_id(magento_order_item.item_id)
                self.set_locked_do_invoice(magento_order_item.locked_do_invoice)
                self.set_locked_do_ship(magento_order_item.locked_do_ship)
                self.set_name(magento_order_item.name)
                self.set_no_discount(magento_order_item.no_discount)
                self.set_order_id(magento_order_item.order_id)
                self.set_original_price(magento_order_item.original_price)
                self.set_parent_item_id(magento_order_item.parent_item_id)
                self.set_price(magento_order_item.price)
                self.set_price_incl_tax(magento_order_item.price_incl_tax)
                self.set_product_id(magento_order_item.product_id)
                self.set_product_type(magento_order_item.product_type)
                self.set_qty_backordered(magento_order_item.qty_backordered)
                self.set_qty_canceled(magento_order_item.qty_canceled)
                self.set_qty_invoiced(magento_order_item.qty_invoiced)
                self.set_qty_ordered(magento_order_item.qty_ordered)
                self.set_qty_refunded(magento_order_item.qty_refunded)
                self.set_qty_shipped(magento_order_item.qty_shipped)
                self.set_quote_item_id(magento_order_item.quote_item_id)
                self.set_row_invoiced(magento_order_item.row_invoiced)
                self.set_row_total(magento_order_item.row_total)
                self.set_row_total_incl_tax(magento_order_item.row_total_incl_tax)
                self.set_row_weight(magento_order_item.row_weight)
                self.set_sku(magento_order_item.sku)
                self.set_store_id(magento_order_item.store_id)
                self.set_tax_amount(magento_order_item.tax_amount)
                self.set_tax_before_discount(magento_order_item.tax_before_discount)
                self.set_tax_canceled(magento_order_item.tax_canceled)
                self.set_tax_invoiced(magento_order_item.tax_invoiced)
                self.set_tax_percent(magento_order_item.tax_percent)
                self.set_tax_refunded(magento_order_item.tax_refunded)
                self.set_updated_at(magento_order_item.updated_at)
                self.set_weee_tax_applied_amount(magento_order_item.weee_tax_applied_amount)
                self.set_weee_tax_applied_row_amount(magento_order_item.weee_tax_applied_row_amount)
                self.set_weee_tax_disposition(magento_order_item.weee_tax_disposition)
                self.set_weee_tax_row_disposition(magento_order_item.weee_tax_row_disposition)
                self.set_weight(magento_order_item.weight)
            elif isinstance(magento_order_item, dict):
                for key, value in magento_order_item.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(magento_order_item)
            return self

    def __init__(
        self,
        created_at,
        name,
        product_type,
        sku,
        updated_at,
        additional_data=None,
        amount_refunded=None,
        base_amount_refunded=None,
        base_cost=None,
        base_discount_amount=None,
        base_discount_invoiced=None,
        base_discount_refunded=None,
        base_hidden_tax_amount=None,
        base_hidden_tax_invoiced=None,
        base_hidden_tax_refunded=None,
        base_original_price=None,
        base_price=None,
        base_price_incl_tax=None,
        base_row_invoiced=None,
        base_row_total=None,
        base_row_total_incl_tax=None,
        base_tax_amount=None,
        base_tax_before_discount=None,
        base_tax_invoiced=None,
        base_tax_refunded=None,
        base_weee_tax_applied_amount=None,
        base_weee_tax_applied_row_amnt=None,
        base_weee_tax_applied_row_amount=None,
        base_weee_tax_disposition=None,
        base_weee_tax_row_disposition=None,
        description=None,
        discount_amount=None,
        discount_invoiced=None,
        discount_percent=None,
        discount_refunded=None,
        free_shipping=None,
        gift_message_available=None,
        gift_message_id=None,
        has_children=None,
        hidden_tax_amount=None,
        hidden_tax_canceled=None,
        hidden_tax_invoiced=None,
        hidden_tax_refunded=None,
        is_nominal=None,
        is_qty_decimal=None,
        is_virtual=None,
        item_id=None,
        locked_do_invoice=None,
        locked_do_ship=None,
        no_discount=None,
        order_id=None,
        original_price=None,
        parent_item_id=None,
        price=None,
        price_incl_tax=None,
        product_id=None,
        qty_backordered=None,
        qty_canceled=None,
        qty_invoiced=None,
        qty_ordered=None,
        qty_refunded=None,
        qty_shipped=None,
        quote_item_id=None,
        row_invoiced=None,
        row_total=None,
        row_total_incl_tax=None,
        row_weight=None,
        store_id=None,
        tax_amount=None,
        tax_before_discount=None,
        tax_canceled=None,
        tax_invoiced=None,
        tax_percent=None,
        tax_refunded=None,
        weee_tax_applied_amount=None,
        weee_tax_applied_row_amount=None,
        weee_tax_disposition=None,
        weee_tax_row_disposition=None,
        weight=None
    ):
        if additional_data is not None:
            if not isinstance(additional_data, basestring):
                raise TypeError(getattr(__builtin__, 'type')(additional_data))
        self.__additional_data = additional_data

        if amount_refunded is not None:
            if not isinstance(amount_refunded, decimal.Decimal):
                raise TypeError(getattr(__builtin__, 'type')(amount_refunded))
        self.__amount_refunded = amount_refunded

        if base_amount_refunded is not None:
            if not isinstance(base_amount_refunded, decimal.Decimal):
                raise TypeError(getattr(__builtin__, 'type')(base_amount_refunded))
        self.__base_amount_refunded = base_amount_refunded

        if base_cost is not None:
            if not isinstance(base_cost, decimal.Decimal):
                raise TypeError(getattr(__builtin__, 'type')(base_cost))
        self.__base_cost = base_cost

        if base_discount_amount is not None:
            if not isinstance(base_discount_amount, decimal.Decimal):
                raise TypeError(getattr(__builtin__, 'type')(base_discount_amount))
        self.__base_discount_amount = base_discount_amount

        if base_discount_invoiced is not None:
            if not isinstance(base_discount_invoiced, decimal.Decimal):
                raise TypeError(getattr(__builtin__, 'type')(base_discount_invoiced))
        self.__base_discount_invoiced = base_discount_invoiced

        if base_discount_refunded is not None:
            if not isinstance(base_discount_refunded, decimal.Decimal):
                raise TypeError(getattr(__builtin__, 'type')(base_discount_refunded))
        self.__base_discount_refunded = base_discount_refunded

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

        if base_original_price is not None:
            if not isinstance(base_original_price, decimal.Decimal):
                raise TypeError(getattr(__builtin__, 'type')(base_original_price))
        self.__base_original_price = base_original_price

        if base_price is not None:
            if not isinstance(base_price, decimal.Decimal):
                raise TypeError(getattr(__builtin__, 'type')(base_price))
        self.__base_price = base_price

        if base_price_incl_tax is not None:
            if not isinstance(base_price_incl_tax, decimal.Decimal):
                raise TypeError(getattr(__builtin__, 'type')(base_price_incl_tax))
        self.__base_price_incl_tax = base_price_incl_tax

        if base_row_invoiced is not None:
            if not isinstance(base_row_invoiced, decimal.Decimal):
                raise TypeError(getattr(__builtin__, 'type')(base_row_invoiced))
        self.__base_row_invoiced = base_row_invoiced

        if base_row_total is not None:
            if not isinstance(base_row_total, decimal.Decimal):
                raise TypeError(getattr(__builtin__, 'type')(base_row_total))
        self.__base_row_total = base_row_total

        if base_row_total_incl_tax is not None:
            if not isinstance(base_row_total_incl_tax, decimal.Decimal):
                raise TypeError(getattr(__builtin__, 'type')(base_row_total_incl_tax))
        self.__base_row_total_incl_tax = base_row_total_incl_tax

        if base_tax_amount is not None:
            if not isinstance(base_tax_amount, decimal.Decimal):
                raise TypeError(getattr(__builtin__, 'type')(base_tax_amount))
        self.__base_tax_amount = base_tax_amount

        if base_tax_before_discount is not None:
            if not isinstance(base_tax_before_discount, decimal.Decimal):
                raise TypeError(getattr(__builtin__, 'type')(base_tax_before_discount))
        self.__base_tax_before_discount = base_tax_before_discount

        if base_tax_invoiced is not None:
            if not isinstance(base_tax_invoiced, decimal.Decimal):
                raise TypeError(getattr(__builtin__, 'type')(base_tax_invoiced))
        self.__base_tax_invoiced = base_tax_invoiced

        if base_tax_refunded is not None:
            if not isinstance(base_tax_refunded, decimal.Decimal):
                raise TypeError(getattr(__builtin__, 'type')(base_tax_refunded))
        self.__base_tax_refunded = base_tax_refunded

        if base_weee_tax_applied_amount is not None:
            if not isinstance(base_weee_tax_applied_amount, decimal.Decimal):
                raise TypeError(getattr(__builtin__, 'type')(base_weee_tax_applied_amount))
        self.__base_weee_tax_applied_amount = base_weee_tax_applied_amount

        if base_weee_tax_applied_row_amnt is not None:
            if not isinstance(base_weee_tax_applied_row_amnt, decimal.Decimal):
                raise TypeError(getattr(__builtin__, 'type')(base_weee_tax_applied_row_amnt))
        self.__base_weee_tax_applied_row_amnt = base_weee_tax_applied_row_amnt

        if base_weee_tax_applied_row_amount is not None:
            if not isinstance(base_weee_tax_applied_row_amount, decimal.Decimal):
                raise TypeError(getattr(__builtin__, 'type')(base_weee_tax_applied_row_amount))
        self.__base_weee_tax_applied_row_amount = base_weee_tax_applied_row_amount

        if base_weee_tax_disposition is not None:
            if not isinstance(base_weee_tax_disposition, decimal.Decimal):
                raise TypeError(getattr(__builtin__, 'type')(base_weee_tax_disposition))
        self.__base_weee_tax_disposition = base_weee_tax_disposition

        if base_weee_tax_row_disposition is not None:
            if not isinstance(base_weee_tax_row_disposition, decimal.Decimal):
                raise TypeError(getattr(__builtin__, 'type')(base_weee_tax_row_disposition))
        self.__base_weee_tax_row_disposition = base_weee_tax_row_disposition

        if created_at is None:
            raise ValueError('created_at is required')
        if not isinstance(created_at, datetime):
            raise TypeError(getattr(__builtin__, 'type')(created_at))
        self.__created_at = created_at

        if description is not None:
            if not isinstance(description, basestring):
                raise TypeError(getattr(__builtin__, 'type')(description))
        self.__description = description

        if discount_amount is not None:
            if not isinstance(discount_amount, decimal.Decimal):
                raise TypeError(getattr(__builtin__, 'type')(discount_amount))
        self.__discount_amount = discount_amount

        if discount_invoiced is not None:
            if not isinstance(discount_invoiced, decimal.Decimal):
                raise TypeError(getattr(__builtin__, 'type')(discount_invoiced))
        self.__discount_invoiced = discount_invoiced

        if discount_percent is not None:
            if not isinstance(discount_percent, decimal.Decimal):
                raise TypeError(getattr(__builtin__, 'type')(discount_percent))
        self.__discount_percent = discount_percent

        if discount_refunded is not None:
            if not isinstance(discount_refunded, decimal.Decimal):
                raise TypeError(getattr(__builtin__, 'type')(discount_refunded))
        self.__discount_refunded = discount_refunded

        if free_shipping is not None:
            if not isinstance(free_shipping, bool):
                raise TypeError(getattr(__builtin__, 'type')(free_shipping))
        self.__free_shipping = free_shipping

        if gift_message_available is not None:
            if not isinstance(gift_message_available, basestring):
                raise TypeError(getattr(__builtin__, 'type')(gift_message_available))
        self.__gift_message_available = gift_message_available

        if gift_message_id is not None:
            if not isinstance(gift_message_id, int):
                raise TypeError(getattr(__builtin__, 'type')(gift_message_id))
        self.__gift_message_id = gift_message_id

        if has_children is not None:
            if not isinstance(has_children, bool):
                raise TypeError(getattr(__builtin__, 'type')(has_children))
        self.__has_children = has_children

        if hidden_tax_amount is not None:
            if not isinstance(hidden_tax_amount, decimal.Decimal):
                raise TypeError(getattr(__builtin__, 'type')(hidden_tax_amount))
        self.__hidden_tax_amount = hidden_tax_amount

        if hidden_tax_canceled is not None:
            if not isinstance(hidden_tax_canceled, decimal.Decimal):
                raise TypeError(getattr(__builtin__, 'type')(hidden_tax_canceled))
        self.__hidden_tax_canceled = hidden_tax_canceled

        if hidden_tax_invoiced is not None:
            if not isinstance(hidden_tax_invoiced, decimal.Decimal):
                raise TypeError(getattr(__builtin__, 'type')(hidden_tax_invoiced))
        self.__hidden_tax_invoiced = hidden_tax_invoiced

        if hidden_tax_refunded is not None:
            if not isinstance(hidden_tax_refunded, decimal.Decimal):
                raise TypeError(getattr(__builtin__, 'type')(hidden_tax_refunded))
        self.__hidden_tax_refunded = hidden_tax_refunded

        if is_nominal is not None:
            if not isinstance(is_nominal, bool):
                raise TypeError(getattr(__builtin__, 'type')(is_nominal))
        self.__is_nominal = is_nominal

        if is_qty_decimal is not None:
            if not isinstance(is_qty_decimal, bool):
                raise TypeError(getattr(__builtin__, 'type')(is_qty_decimal))
        self.__is_qty_decimal = is_qty_decimal

        if is_virtual is not None:
            if not isinstance(is_virtual, bool):
                raise TypeError(getattr(__builtin__, 'type')(is_virtual))
        self.__is_virtual = is_virtual

        if item_id is not None:
            if not isinstance(item_id, int):
                raise TypeError(getattr(__builtin__, 'type')(item_id))
        self.__item_id = item_id

        if locked_do_invoice is not None:
            if not isinstance(locked_do_invoice, bool):
                raise TypeError(getattr(__builtin__, 'type')(locked_do_invoice))
        self.__locked_do_invoice = locked_do_invoice

        if locked_do_ship is not None:
            if not isinstance(locked_do_ship, bool):
                raise TypeError(getattr(__builtin__, 'type')(locked_do_ship))
        self.__locked_do_ship = locked_do_ship

        if name is None:
            raise ValueError('name is required')
        if not isinstance(name, basestring):
            raise TypeError(getattr(__builtin__, 'type')(name))
        self.__name = name

        if no_discount is not None:
            if not isinstance(no_discount, bool):
                raise TypeError(getattr(__builtin__, 'type')(no_discount))
        self.__no_discount = no_discount

        if order_id is not None:
            if not isinstance(order_id, int):
                raise TypeError(getattr(__builtin__, 'type')(order_id))
        self.__order_id = order_id

        if original_price is not None:
            if not isinstance(original_price, decimal.Decimal):
                raise TypeError(getattr(__builtin__, 'type')(original_price))
        self.__original_price = original_price

        if parent_item_id is not None:
            if not isinstance(parent_item_id, int):
                raise TypeError(getattr(__builtin__, 'type')(parent_item_id))
        self.__parent_item_id = parent_item_id

        if price is not None:
            if not isinstance(price, decimal.Decimal):
                raise TypeError(getattr(__builtin__, 'type')(price))
        self.__price = price

        if price_incl_tax is not None:
            if not isinstance(price_incl_tax, decimal.Decimal):
                raise TypeError(getattr(__builtin__, 'type')(price_incl_tax))
        self.__price_incl_tax = price_incl_tax

        if product_id is not None:
            if not isinstance(product_id, int):
                raise TypeError(getattr(__builtin__, 'type')(product_id))
        self.__product_id = product_id

        if product_type is None:
            raise ValueError('product_type is required')
        if not isinstance(product_type, yogento.api.models.catalog.product.magento.magento_product_type.MagentoProductType):
            raise TypeError(getattr(__builtin__, 'type')(product_type))
        self.__product_type = product_type

        if qty_backordered is not None:
            if not isinstance(qty_backordered, decimal.Decimal):
                raise TypeError(getattr(__builtin__, 'type')(qty_backordered))
        self.__qty_backordered = qty_backordered

        if qty_canceled is not None:
            if not isinstance(qty_canceled, decimal.Decimal):
                raise TypeError(getattr(__builtin__, 'type')(qty_canceled))
        self.__qty_canceled = qty_canceled

        if qty_invoiced is not None:
            if not isinstance(qty_invoiced, decimal.Decimal):
                raise TypeError(getattr(__builtin__, 'type')(qty_invoiced))
        self.__qty_invoiced = qty_invoiced

        if qty_ordered is not None:
            if not isinstance(qty_ordered, decimal.Decimal):
                raise TypeError(getattr(__builtin__, 'type')(qty_ordered))
        self.__qty_ordered = qty_ordered

        if qty_refunded is not None:
            if not isinstance(qty_refunded, decimal.Decimal):
                raise TypeError(getattr(__builtin__, 'type')(qty_refunded))
        self.__qty_refunded = qty_refunded

        if qty_shipped is not None:
            if not isinstance(qty_shipped, decimal.Decimal):
                raise TypeError(getattr(__builtin__, 'type')(qty_shipped))
        self.__qty_shipped = qty_shipped

        if quote_item_id is not None:
            if not isinstance(quote_item_id, int):
                raise TypeError(getattr(__builtin__, 'type')(quote_item_id))
        self.__quote_item_id = quote_item_id

        if row_invoiced is not None:
            if not isinstance(row_invoiced, decimal.Decimal):
                raise TypeError(getattr(__builtin__, 'type')(row_invoiced))
        self.__row_invoiced = row_invoiced

        if row_total is not None:
            if not isinstance(row_total, decimal.Decimal):
                raise TypeError(getattr(__builtin__, 'type')(row_total))
        self.__row_total = row_total

        if row_total_incl_tax is not None:
            if not isinstance(row_total_incl_tax, decimal.Decimal):
                raise TypeError(getattr(__builtin__, 'type')(row_total_incl_tax))
        self.__row_total_incl_tax = row_total_incl_tax

        if row_weight is not None:
            if not isinstance(row_weight, decimal.Decimal):
                raise TypeError(getattr(__builtin__, 'type')(row_weight))
        self.__row_weight = row_weight

        if sku is None:
            raise ValueError('sku is required')
        if not isinstance(sku, basestring):
            raise TypeError(getattr(__builtin__, 'type')(sku))
        self.__sku = sku

        if store_id is not None:
            if not isinstance(store_id, int):
                raise TypeError(getattr(__builtin__, 'type')(store_id))
        self.__store_id = store_id

        if tax_amount is not None:
            if not isinstance(tax_amount, decimal.Decimal):
                raise TypeError(getattr(__builtin__, 'type')(tax_amount))
        self.__tax_amount = tax_amount

        if tax_before_discount is not None:
            if not isinstance(tax_before_discount, decimal.Decimal):
                raise TypeError(getattr(__builtin__, 'type')(tax_before_discount))
        self.__tax_before_discount = tax_before_discount

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

        if updated_at is None:
            raise ValueError('updated_at is required')
        if not isinstance(updated_at, datetime):
            raise TypeError(getattr(__builtin__, 'type')(updated_at))
        self.__updated_at = updated_at

        if weee_tax_applied_amount is not None:
            if not isinstance(weee_tax_applied_amount, decimal.Decimal):
                raise TypeError(getattr(__builtin__, 'type')(weee_tax_applied_amount))
        self.__weee_tax_applied_amount = weee_tax_applied_amount

        if weee_tax_applied_row_amount is not None:
            if not isinstance(weee_tax_applied_row_amount, decimal.Decimal):
                raise TypeError(getattr(__builtin__, 'type')(weee_tax_applied_row_amount))
        self.__weee_tax_applied_row_amount = weee_tax_applied_row_amount

        if weee_tax_disposition is not None:
            if not isinstance(weee_tax_disposition, decimal.Decimal):
                raise TypeError(getattr(__builtin__, 'type')(weee_tax_disposition))
        self.__weee_tax_disposition = weee_tax_disposition

        if weee_tax_row_disposition is not None:
            if not isinstance(weee_tax_row_disposition, decimal.Decimal):
                raise TypeError(getattr(__builtin__, 'type')(weee_tax_row_disposition))
        self.__weee_tax_row_disposition = weee_tax_row_disposition

        if weight is not None:
            if not isinstance(weight, decimal.Decimal):
                raise TypeError(getattr(__builtin__, 'type')(weight))
        self.__weight = weight

    def __eq__(self, other):
        if self.additional_data != other.additional_data:
            return False
        if self.amount_refunded != other.amount_refunded:
            return False
        if self.base_amount_refunded != other.base_amount_refunded:
            return False
        if self.base_cost != other.base_cost:
            return False
        if self.base_discount_amount != other.base_discount_amount:
            return False
        if self.base_discount_invoiced != other.base_discount_invoiced:
            return False
        if self.base_discount_refunded != other.base_discount_refunded:
            return False
        if self.base_hidden_tax_amount != other.base_hidden_tax_amount:
            return False
        if self.base_hidden_tax_invoiced != other.base_hidden_tax_invoiced:
            return False
        if self.base_hidden_tax_refunded != other.base_hidden_tax_refunded:
            return False
        if self.base_original_price != other.base_original_price:
            return False
        if self.base_price != other.base_price:
            return False
        if self.base_price_incl_tax != other.base_price_incl_tax:
            return False
        if self.base_row_invoiced != other.base_row_invoiced:
            return False
        if self.base_row_total != other.base_row_total:
            return False
        if self.base_row_total_incl_tax != other.base_row_total_incl_tax:
            return False
        if self.base_tax_amount != other.base_tax_amount:
            return False
        if self.base_tax_before_discount != other.base_tax_before_discount:
            return False
        if self.base_tax_invoiced != other.base_tax_invoiced:
            return False
        if self.base_tax_refunded != other.base_tax_refunded:
            return False
        if self.base_weee_tax_applied_amount != other.base_weee_tax_applied_amount:
            return False
        if self.base_weee_tax_applied_row_amnt != other.base_weee_tax_applied_row_amnt:
            return False
        if self.base_weee_tax_applied_row_amount != other.base_weee_tax_applied_row_amount:
            return False
        if self.base_weee_tax_disposition != other.base_weee_tax_disposition:
            return False
        if self.base_weee_tax_row_disposition != other.base_weee_tax_row_disposition:
            return False
        if self.created_at != other.created_at:
            return False
        if self.description != other.description:
            return False
        if self.discount_amount != other.discount_amount:
            return False
        if self.discount_invoiced != other.discount_invoiced:
            return False
        if self.discount_percent != other.discount_percent:
            return False
        if self.discount_refunded != other.discount_refunded:
            return False
        if self.free_shipping != other.free_shipping:
            return False
        if self.gift_message_available != other.gift_message_available:
            return False
        if self.gift_message_id != other.gift_message_id:
            return False
        if self.has_children != other.has_children:
            return False
        if self.hidden_tax_amount != other.hidden_tax_amount:
            return False
        if self.hidden_tax_canceled != other.hidden_tax_canceled:
            return False
        if self.hidden_tax_invoiced != other.hidden_tax_invoiced:
            return False
        if self.hidden_tax_refunded != other.hidden_tax_refunded:
            return False
        if self.is_nominal != other.is_nominal:
            return False
        if self.is_qty_decimal != other.is_qty_decimal:
            return False
        if self.is_virtual != other.is_virtual:
            return False
        if self.item_id != other.item_id:
            return False
        if self.locked_do_invoice != other.locked_do_invoice:
            return False
        if self.locked_do_ship != other.locked_do_ship:
            return False
        if self.name != other.name:
            return False
        if self.no_discount != other.no_discount:
            return False
        if self.order_id != other.order_id:
            return False
        if self.original_price != other.original_price:
            return False
        if self.parent_item_id != other.parent_item_id:
            return False
        if self.price != other.price:
            return False
        if self.price_incl_tax != other.price_incl_tax:
            return False
        if self.product_id != other.product_id:
            return False
        if self.product_type != other.product_type:
            return False
        if self.qty_backordered != other.qty_backordered:
            return False
        if self.qty_canceled != other.qty_canceled:
            return False
        if self.qty_invoiced != other.qty_invoiced:
            return False
        if self.qty_ordered != other.qty_ordered:
            return False
        if self.qty_refunded != other.qty_refunded:
            return False
        if self.qty_shipped != other.qty_shipped:
            return False
        if self.quote_item_id != other.quote_item_id:
            return False
        if self.row_invoiced != other.row_invoiced:
            return False
        if self.row_total != other.row_total:
            return False
        if self.row_total_incl_tax != other.row_total_incl_tax:
            return False
        if self.row_weight != other.row_weight:
            return False
        if self.sku != other.sku:
            return False
        if self.store_id != other.store_id:
            return False
        if self.tax_amount != other.tax_amount:
            return False
        if self.tax_before_discount != other.tax_before_discount:
            return False
        if self.tax_canceled != other.tax_canceled:
            return False
        if self.tax_invoiced != other.tax_invoiced:
            return False
        if self.tax_percent != other.tax_percent:
            return False
        if self.tax_refunded != other.tax_refunded:
            return False
        if self.updated_at != other.updated_at:
            return False
        if self.weee_tax_applied_amount != other.weee_tax_applied_amount:
            return False
        if self.weee_tax_applied_row_amount != other.weee_tax_applied_row_amount:
            return False
        if self.weee_tax_disposition != other.weee_tax_disposition:
            return False
        if self.weee_tax_row_disposition != other.weee_tax_row_disposition:
            return False
        if self.weight != other.weight:
            return False
        return True

    def __hash__(self):
        return hash((self.additional_data,self.amount_refunded,self.base_amount_refunded,self.base_cost,self.base_discount_amount,self.base_discount_invoiced,self.base_discount_refunded,self.base_hidden_tax_amount,self.base_hidden_tax_invoiced,self.base_hidden_tax_refunded,self.base_original_price,self.base_price,self.base_price_incl_tax,self.base_row_invoiced,self.base_row_total,self.base_row_total_incl_tax,self.base_tax_amount,self.base_tax_before_discount,self.base_tax_invoiced,self.base_tax_refunded,self.base_weee_tax_applied_amount,self.base_weee_tax_applied_row_amnt,self.base_weee_tax_applied_row_amount,self.base_weee_tax_disposition,self.base_weee_tax_row_disposition,self.created_at,self.description,self.discount_amount,self.discount_invoiced,self.discount_percent,self.discount_refunded,self.free_shipping,self.gift_message_available,self.gift_message_id,self.has_children,self.hidden_tax_amount,self.hidden_tax_canceled,self.hidden_tax_invoiced,self.hidden_tax_refunded,self.is_nominal,self.is_qty_decimal,self.is_virtual,self.item_id,self.locked_do_invoice,self.locked_do_ship,self.name,self.no_discount,self.order_id,self.original_price,self.parent_item_id,self.price,self.price_incl_tax,self.product_id,self.product_type,self.qty_backordered,self.qty_canceled,self.qty_invoiced,self.qty_ordered,self.qty_refunded,self.qty_shipped,self.quote_item_id,self.row_invoiced,self.row_total,self.row_total_incl_tax,self.row_weight,self.sku,self.store_id,self.tax_amount,self.tax_before_discount,self.tax_canceled,self.tax_invoiced,self.tax_percent,self.tax_refunded,self.updated_at,self.weee_tax_applied_amount,self.weee_tax_applied_row_amount,self.weee_tax_disposition,self.weee_tax_row_disposition,self.weight,))

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        if self.additional_data is not None:
            field_reprs.append('additional_data=' + "'" + self.additional_data.encode('ascii', 'replace') + "'")
        if self.amount_refunded is not None:
            field_reprs.append('amount_refunded=' + repr(self.amount_refunded))
        if self.base_amount_refunded is not None:
            field_reprs.append('base_amount_refunded=' + repr(self.base_amount_refunded))
        if self.base_cost is not None:
            field_reprs.append('base_cost=' + repr(self.base_cost))
        if self.base_discount_amount is not None:
            field_reprs.append('base_discount_amount=' + repr(self.base_discount_amount))
        if self.base_discount_invoiced is not None:
            field_reprs.append('base_discount_invoiced=' + repr(self.base_discount_invoiced))
        if self.base_discount_refunded is not None:
            field_reprs.append('base_discount_refunded=' + repr(self.base_discount_refunded))
        if self.base_hidden_tax_amount is not None:
            field_reprs.append('base_hidden_tax_amount=' + repr(self.base_hidden_tax_amount))
        if self.base_hidden_tax_invoiced is not None:
            field_reprs.append('base_hidden_tax_invoiced=' + repr(self.base_hidden_tax_invoiced))
        if self.base_hidden_tax_refunded is not None:
            field_reprs.append('base_hidden_tax_refunded=' + repr(self.base_hidden_tax_refunded))
        if self.base_original_price is not None:
            field_reprs.append('base_original_price=' + repr(self.base_original_price))
        if self.base_price is not None:
            field_reprs.append('base_price=' + repr(self.base_price))
        if self.base_price_incl_tax is not None:
            field_reprs.append('base_price_incl_tax=' + repr(self.base_price_incl_tax))
        if self.base_row_invoiced is not None:
            field_reprs.append('base_row_invoiced=' + repr(self.base_row_invoiced))
        if self.base_row_total is not None:
            field_reprs.append('base_row_total=' + repr(self.base_row_total))
        if self.base_row_total_incl_tax is not None:
            field_reprs.append('base_row_total_incl_tax=' + repr(self.base_row_total_incl_tax))
        if self.base_tax_amount is not None:
            field_reprs.append('base_tax_amount=' + repr(self.base_tax_amount))
        if self.base_tax_before_discount is not None:
            field_reprs.append('base_tax_before_discount=' + repr(self.base_tax_before_discount))
        if self.base_tax_invoiced is not None:
            field_reprs.append('base_tax_invoiced=' + repr(self.base_tax_invoiced))
        if self.base_tax_refunded is not None:
            field_reprs.append('base_tax_refunded=' + repr(self.base_tax_refunded))
        if self.base_weee_tax_applied_amount is not None:
            field_reprs.append('base_weee_tax_applied_amount=' + repr(self.base_weee_tax_applied_amount))
        if self.base_weee_tax_applied_row_amnt is not None:
            field_reprs.append('base_weee_tax_applied_row_amnt=' + repr(self.base_weee_tax_applied_row_amnt))
        if self.base_weee_tax_applied_row_amount is not None:
            field_reprs.append('base_weee_tax_applied_row_amount=' + repr(self.base_weee_tax_applied_row_amount))
        if self.base_weee_tax_disposition is not None:
            field_reprs.append('base_weee_tax_disposition=' + repr(self.base_weee_tax_disposition))
        if self.base_weee_tax_row_disposition is not None:
            field_reprs.append('base_weee_tax_row_disposition=' + repr(self.base_weee_tax_row_disposition))
        field_reprs.append('created_at=' + repr(self.created_at))
        if self.description is not None:
            field_reprs.append('description=' + "'" + self.description.encode('ascii', 'replace') + "'")
        if self.discount_amount is not None:
            field_reprs.append('discount_amount=' + repr(self.discount_amount))
        if self.discount_invoiced is not None:
            field_reprs.append('discount_invoiced=' + repr(self.discount_invoiced))
        if self.discount_percent is not None:
            field_reprs.append('discount_percent=' + repr(self.discount_percent))
        if self.discount_refunded is not None:
            field_reprs.append('discount_refunded=' + repr(self.discount_refunded))
        if self.free_shipping is not None:
            field_reprs.append('free_shipping=' + repr(self.free_shipping))
        if self.gift_message_available is not None:
            field_reprs.append('gift_message_available=' + "'" + self.gift_message_available.encode('ascii', 'replace') + "'")
        if self.gift_message_id is not None:
            field_reprs.append('gift_message_id=' + repr(self.gift_message_id))
        if self.has_children is not None:
            field_reprs.append('has_children=' + repr(self.has_children))
        if self.hidden_tax_amount is not None:
            field_reprs.append('hidden_tax_amount=' + repr(self.hidden_tax_amount))
        if self.hidden_tax_canceled is not None:
            field_reprs.append('hidden_tax_canceled=' + repr(self.hidden_tax_canceled))
        if self.hidden_tax_invoiced is not None:
            field_reprs.append('hidden_tax_invoiced=' + repr(self.hidden_tax_invoiced))
        if self.hidden_tax_refunded is not None:
            field_reprs.append('hidden_tax_refunded=' + repr(self.hidden_tax_refunded))
        if self.is_nominal is not None:
            field_reprs.append('is_nominal=' + repr(self.is_nominal))
        if self.is_qty_decimal is not None:
            field_reprs.append('is_qty_decimal=' + repr(self.is_qty_decimal))
        if self.is_virtual is not None:
            field_reprs.append('is_virtual=' + repr(self.is_virtual))
        if self.item_id is not None:
            field_reprs.append('item_id=' + repr(self.item_id))
        if self.locked_do_invoice is not None:
            field_reprs.append('locked_do_invoice=' + repr(self.locked_do_invoice))
        if self.locked_do_ship is not None:
            field_reprs.append('locked_do_ship=' + repr(self.locked_do_ship))
        field_reprs.append('name=' + "'" + self.name.encode('ascii', 'replace') + "'")
        if self.no_discount is not None:
            field_reprs.append('no_discount=' + repr(self.no_discount))
        if self.order_id is not None:
            field_reprs.append('order_id=' + repr(self.order_id))
        if self.original_price is not None:
            field_reprs.append('original_price=' + repr(self.original_price))
        if self.parent_item_id is not None:
            field_reprs.append('parent_item_id=' + repr(self.parent_item_id))
        if self.price is not None:
            field_reprs.append('price=' + repr(self.price))
        if self.price_incl_tax is not None:
            field_reprs.append('price_incl_tax=' + repr(self.price_incl_tax))
        if self.product_id is not None:
            field_reprs.append('product_id=' + repr(self.product_id))
        field_reprs.append('product_type=' + repr(self.product_type))
        if self.qty_backordered is not None:
            field_reprs.append('qty_backordered=' + repr(self.qty_backordered))
        if self.qty_canceled is not None:
            field_reprs.append('qty_canceled=' + repr(self.qty_canceled))
        if self.qty_invoiced is not None:
            field_reprs.append('qty_invoiced=' + repr(self.qty_invoiced))
        if self.qty_ordered is not None:
            field_reprs.append('qty_ordered=' + repr(self.qty_ordered))
        if self.qty_refunded is not None:
            field_reprs.append('qty_refunded=' + repr(self.qty_refunded))
        if self.qty_shipped is not None:
            field_reprs.append('qty_shipped=' + repr(self.qty_shipped))
        if self.quote_item_id is not None:
            field_reprs.append('quote_item_id=' + repr(self.quote_item_id))
        if self.row_invoiced is not None:
            field_reprs.append('row_invoiced=' + repr(self.row_invoiced))
        if self.row_total is not None:
            field_reprs.append('row_total=' + repr(self.row_total))
        if self.row_total_incl_tax is not None:
            field_reprs.append('row_total_incl_tax=' + repr(self.row_total_incl_tax))
        if self.row_weight is not None:
            field_reprs.append('row_weight=' + repr(self.row_weight))
        field_reprs.append('sku=' + "'" + self.sku.encode('ascii', 'replace') + "'")
        if self.store_id is not None:
            field_reprs.append('store_id=' + repr(self.store_id))
        if self.tax_amount is not None:
            field_reprs.append('tax_amount=' + repr(self.tax_amount))
        if self.tax_before_discount is not None:
            field_reprs.append('tax_before_discount=' + repr(self.tax_before_discount))
        if self.tax_canceled is not None:
            field_reprs.append('tax_canceled=' + repr(self.tax_canceled))
        if self.tax_invoiced is not None:
            field_reprs.append('tax_invoiced=' + repr(self.tax_invoiced))
        if self.tax_percent is not None:
            field_reprs.append('tax_percent=' + repr(self.tax_percent))
        if self.tax_refunded is not None:
            field_reprs.append('tax_refunded=' + repr(self.tax_refunded))
        field_reprs.append('updated_at=' + repr(self.updated_at))
        if self.weee_tax_applied_amount is not None:
            field_reprs.append('weee_tax_applied_amount=' + repr(self.weee_tax_applied_amount))
        if self.weee_tax_applied_row_amount is not None:
            field_reprs.append('weee_tax_applied_row_amount=' + repr(self.weee_tax_applied_row_amount))
        if self.weee_tax_disposition is not None:
            field_reprs.append('weee_tax_disposition=' + repr(self.weee_tax_disposition))
        if self.weee_tax_row_disposition is not None:
            field_reprs.append('weee_tax_row_disposition=' + repr(self.weee_tax_row_disposition))
        if self.weight is not None:
            field_reprs.append('weight=' + repr(self.weight))
        return 'MagentoOrderItem(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        if self.additional_data is not None:
            field_reprs.append('additional_data=' + "'" + self.additional_data.encode('ascii', 'replace') + "'")
        if self.amount_refunded is not None:
            field_reprs.append('amount_refunded=' + repr(self.amount_refunded))
        if self.base_amount_refunded is not None:
            field_reprs.append('base_amount_refunded=' + repr(self.base_amount_refunded))
        if self.base_cost is not None:
            field_reprs.append('base_cost=' + repr(self.base_cost))
        if self.base_discount_amount is not None:
            field_reprs.append('base_discount_amount=' + repr(self.base_discount_amount))
        if self.base_discount_invoiced is not None:
            field_reprs.append('base_discount_invoiced=' + repr(self.base_discount_invoiced))
        if self.base_discount_refunded is not None:
            field_reprs.append('base_discount_refunded=' + repr(self.base_discount_refunded))
        if self.base_hidden_tax_amount is not None:
            field_reprs.append('base_hidden_tax_amount=' + repr(self.base_hidden_tax_amount))
        if self.base_hidden_tax_invoiced is not None:
            field_reprs.append('base_hidden_tax_invoiced=' + repr(self.base_hidden_tax_invoiced))
        if self.base_hidden_tax_refunded is not None:
            field_reprs.append('base_hidden_tax_refunded=' + repr(self.base_hidden_tax_refunded))
        if self.base_original_price is not None:
            field_reprs.append('base_original_price=' + repr(self.base_original_price))
        if self.base_price is not None:
            field_reprs.append('base_price=' + repr(self.base_price))
        if self.base_price_incl_tax is not None:
            field_reprs.append('base_price_incl_tax=' + repr(self.base_price_incl_tax))
        if self.base_row_invoiced is not None:
            field_reprs.append('base_row_invoiced=' + repr(self.base_row_invoiced))
        if self.base_row_total is not None:
            field_reprs.append('base_row_total=' + repr(self.base_row_total))
        if self.base_row_total_incl_tax is not None:
            field_reprs.append('base_row_total_incl_tax=' + repr(self.base_row_total_incl_tax))
        if self.base_tax_amount is not None:
            field_reprs.append('base_tax_amount=' + repr(self.base_tax_amount))
        if self.base_tax_before_discount is not None:
            field_reprs.append('base_tax_before_discount=' + repr(self.base_tax_before_discount))
        if self.base_tax_invoiced is not None:
            field_reprs.append('base_tax_invoiced=' + repr(self.base_tax_invoiced))
        if self.base_tax_refunded is not None:
            field_reprs.append('base_tax_refunded=' + repr(self.base_tax_refunded))
        if self.base_weee_tax_applied_amount is not None:
            field_reprs.append('base_weee_tax_applied_amount=' + repr(self.base_weee_tax_applied_amount))
        if self.base_weee_tax_applied_row_amnt is not None:
            field_reprs.append('base_weee_tax_applied_row_amnt=' + repr(self.base_weee_tax_applied_row_amnt))
        if self.base_weee_tax_applied_row_amount is not None:
            field_reprs.append('base_weee_tax_applied_row_amount=' + repr(self.base_weee_tax_applied_row_amount))
        if self.base_weee_tax_disposition is not None:
            field_reprs.append('base_weee_tax_disposition=' + repr(self.base_weee_tax_disposition))
        if self.base_weee_tax_row_disposition is not None:
            field_reprs.append('base_weee_tax_row_disposition=' + repr(self.base_weee_tax_row_disposition))
        field_reprs.append('created_at=' + repr(self.created_at))
        if self.description is not None:
            field_reprs.append('description=' + "'" + self.description.encode('ascii', 'replace') + "'")
        if self.discount_amount is not None:
            field_reprs.append('discount_amount=' + repr(self.discount_amount))
        if self.discount_invoiced is not None:
            field_reprs.append('discount_invoiced=' + repr(self.discount_invoiced))
        if self.discount_percent is not None:
            field_reprs.append('discount_percent=' + repr(self.discount_percent))
        if self.discount_refunded is not None:
            field_reprs.append('discount_refunded=' + repr(self.discount_refunded))
        if self.free_shipping is not None:
            field_reprs.append('free_shipping=' + repr(self.free_shipping))
        if self.gift_message_available is not None:
            field_reprs.append('gift_message_available=' + "'" + self.gift_message_available.encode('ascii', 'replace') + "'")
        if self.gift_message_id is not None:
            field_reprs.append('gift_message_id=' + repr(self.gift_message_id))
        if self.has_children is not None:
            field_reprs.append('has_children=' + repr(self.has_children))
        if self.hidden_tax_amount is not None:
            field_reprs.append('hidden_tax_amount=' + repr(self.hidden_tax_amount))
        if self.hidden_tax_canceled is not None:
            field_reprs.append('hidden_tax_canceled=' + repr(self.hidden_tax_canceled))
        if self.hidden_tax_invoiced is not None:
            field_reprs.append('hidden_tax_invoiced=' + repr(self.hidden_tax_invoiced))
        if self.hidden_tax_refunded is not None:
            field_reprs.append('hidden_tax_refunded=' + repr(self.hidden_tax_refunded))
        if self.is_nominal is not None:
            field_reprs.append('is_nominal=' + repr(self.is_nominal))
        if self.is_qty_decimal is not None:
            field_reprs.append('is_qty_decimal=' + repr(self.is_qty_decimal))
        if self.is_virtual is not None:
            field_reprs.append('is_virtual=' + repr(self.is_virtual))
        if self.item_id is not None:
            field_reprs.append('item_id=' + repr(self.item_id))
        if self.locked_do_invoice is not None:
            field_reprs.append('locked_do_invoice=' + repr(self.locked_do_invoice))
        if self.locked_do_ship is not None:
            field_reprs.append('locked_do_ship=' + repr(self.locked_do_ship))
        field_reprs.append('name=' + "'" + self.name.encode('ascii', 'replace') + "'")
        if self.no_discount is not None:
            field_reprs.append('no_discount=' + repr(self.no_discount))
        if self.order_id is not None:
            field_reprs.append('order_id=' + repr(self.order_id))
        if self.original_price is not None:
            field_reprs.append('original_price=' + repr(self.original_price))
        if self.parent_item_id is not None:
            field_reprs.append('parent_item_id=' + repr(self.parent_item_id))
        if self.price is not None:
            field_reprs.append('price=' + repr(self.price))
        if self.price_incl_tax is not None:
            field_reprs.append('price_incl_tax=' + repr(self.price_incl_tax))
        if self.product_id is not None:
            field_reprs.append('product_id=' + repr(self.product_id))
        field_reprs.append('product_type=' + repr(self.product_type))
        if self.qty_backordered is not None:
            field_reprs.append('qty_backordered=' + repr(self.qty_backordered))
        if self.qty_canceled is not None:
            field_reprs.append('qty_canceled=' + repr(self.qty_canceled))
        if self.qty_invoiced is not None:
            field_reprs.append('qty_invoiced=' + repr(self.qty_invoiced))
        if self.qty_ordered is not None:
            field_reprs.append('qty_ordered=' + repr(self.qty_ordered))
        if self.qty_refunded is not None:
            field_reprs.append('qty_refunded=' + repr(self.qty_refunded))
        if self.qty_shipped is not None:
            field_reprs.append('qty_shipped=' + repr(self.qty_shipped))
        if self.quote_item_id is not None:
            field_reprs.append('quote_item_id=' + repr(self.quote_item_id))
        if self.row_invoiced is not None:
            field_reprs.append('row_invoiced=' + repr(self.row_invoiced))
        if self.row_total is not None:
            field_reprs.append('row_total=' + repr(self.row_total))
        if self.row_total_incl_tax is not None:
            field_reprs.append('row_total_incl_tax=' + repr(self.row_total_incl_tax))
        if self.row_weight is not None:
            field_reprs.append('row_weight=' + repr(self.row_weight))
        field_reprs.append('sku=' + "'" + self.sku.encode('ascii', 'replace') + "'")
        if self.store_id is not None:
            field_reprs.append('store_id=' + repr(self.store_id))
        if self.tax_amount is not None:
            field_reprs.append('tax_amount=' + repr(self.tax_amount))
        if self.tax_before_discount is not None:
            field_reprs.append('tax_before_discount=' + repr(self.tax_before_discount))
        if self.tax_canceled is not None:
            field_reprs.append('tax_canceled=' + repr(self.tax_canceled))
        if self.tax_invoiced is not None:
            field_reprs.append('tax_invoiced=' + repr(self.tax_invoiced))
        if self.tax_percent is not None:
            field_reprs.append('tax_percent=' + repr(self.tax_percent))
        if self.tax_refunded is not None:
            field_reprs.append('tax_refunded=' + repr(self.tax_refunded))
        field_reprs.append('updated_at=' + repr(self.updated_at))
        if self.weee_tax_applied_amount is not None:
            field_reprs.append('weee_tax_applied_amount=' + repr(self.weee_tax_applied_amount))
        if self.weee_tax_applied_row_amount is not None:
            field_reprs.append('weee_tax_applied_row_amount=' + repr(self.weee_tax_applied_row_amount))
        if self.weee_tax_disposition is not None:
            field_reprs.append('weee_tax_disposition=' + repr(self.weee_tax_disposition))
        if self.weee_tax_row_disposition is not None:
            field_reprs.append('weee_tax_row_disposition=' + repr(self.weee_tax_row_disposition))
        if self.weight is not None:
            field_reprs.append('weight=' + repr(self.weight))
        return 'MagentoOrderItem(' + ', '.join(field_reprs) + ')'

    @property
    def additional_data(self):
        return self.__additional_data

    @property
    def amount_refunded(self):
        return self.__amount_refunded

    def as_dict(self):
        return {'additional_data': self.additional_data, 'amount_refunded': self.amount_refunded, 'base_amount_refunded': self.base_amount_refunded, 'base_cost': self.base_cost, 'base_discount_amount': self.base_discount_amount, 'base_discount_invoiced': self.base_discount_invoiced, 'base_discount_refunded': self.base_discount_refunded, 'base_hidden_tax_amount': self.base_hidden_tax_amount, 'base_hidden_tax_invoiced': self.base_hidden_tax_invoiced, 'base_hidden_tax_refunded': self.base_hidden_tax_refunded, 'base_original_price': self.base_original_price, 'base_price': self.base_price, 'base_price_incl_tax': self.base_price_incl_tax, 'base_row_invoiced': self.base_row_invoiced, 'base_row_total': self.base_row_total, 'base_row_total_incl_tax': self.base_row_total_incl_tax, 'base_tax_amount': self.base_tax_amount, 'base_tax_before_discount': self.base_tax_before_discount, 'base_tax_invoiced': self.base_tax_invoiced, 'base_tax_refunded': self.base_tax_refunded, 'base_weee_tax_applied_amount': self.base_weee_tax_applied_amount, 'base_weee_tax_applied_row_amnt': self.base_weee_tax_applied_row_amnt, 'base_weee_tax_applied_row_amount': self.base_weee_tax_applied_row_amount, 'base_weee_tax_disposition': self.base_weee_tax_disposition, 'base_weee_tax_row_disposition': self.base_weee_tax_row_disposition, 'created_at': self.created_at, 'description': self.description, 'discount_amount': self.discount_amount, 'discount_invoiced': self.discount_invoiced, 'discount_percent': self.discount_percent, 'discount_refunded': self.discount_refunded, 'free_shipping': self.free_shipping, 'gift_message_available': self.gift_message_available, 'gift_message_id': self.gift_message_id, 'has_children': self.has_children, 'hidden_tax_amount': self.hidden_tax_amount, 'hidden_tax_canceled': self.hidden_tax_canceled, 'hidden_tax_invoiced': self.hidden_tax_invoiced, 'hidden_tax_refunded': self.hidden_tax_refunded, 'is_nominal': self.is_nominal, 'is_qty_decimal': self.is_qty_decimal, 'is_virtual': self.is_virtual, 'item_id': self.item_id, 'locked_do_invoice': self.locked_do_invoice, 'locked_do_ship': self.locked_do_ship, 'name': self.name, 'no_discount': self.no_discount, 'order_id': self.order_id, 'original_price': self.original_price, 'parent_item_id': self.parent_item_id, 'price': self.price, 'price_incl_tax': self.price_incl_tax, 'product_id': self.product_id, 'product_type': self.product_type, 'qty_backordered': self.qty_backordered, 'qty_canceled': self.qty_canceled, 'qty_invoiced': self.qty_invoiced, 'qty_ordered': self.qty_ordered, 'qty_refunded': self.qty_refunded, 'qty_shipped': self.qty_shipped, 'quote_item_id': self.quote_item_id, 'row_invoiced': self.row_invoiced, 'row_total': self.row_total, 'row_total_incl_tax': self.row_total_incl_tax, 'row_weight': self.row_weight, 'sku': self.sku, 'store_id': self.store_id, 'tax_amount': self.tax_amount, 'tax_before_discount': self.tax_before_discount, 'tax_canceled': self.tax_canceled, 'tax_invoiced': self.tax_invoiced, 'tax_percent': self.tax_percent, 'tax_refunded': self.tax_refunded, 'updated_at': self.updated_at, 'weee_tax_applied_amount': self.weee_tax_applied_amount, 'weee_tax_applied_row_amount': self.weee_tax_applied_row_amount, 'weee_tax_disposition': self.weee_tax_disposition, 'weee_tax_row_disposition': self.weee_tax_row_disposition, 'weight': self.weight}

    @property
    def base_amount_refunded(self):
        return self.__base_amount_refunded

    @property
    def base_cost(self):
        return self.__base_cost

    @property
    def base_discount_amount(self):
        return self.__base_discount_amount

    @property
    def base_discount_invoiced(self):
        return self.__base_discount_invoiced

    @property
    def base_discount_refunded(self):
        return self.__base_discount_refunded

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
    def base_original_price(self):
        return self.__base_original_price

    @property
    def base_price(self):
        return self.__base_price

    @property
    def base_price_incl_tax(self):
        return self.__base_price_incl_tax

    @property
    def base_row_invoiced(self):
        return self.__base_row_invoiced

    @property
    def base_row_total(self):
        return self.__base_row_total

    @property
    def base_row_total_incl_tax(self):
        return self.__base_row_total_incl_tax

    @property
    def base_tax_amount(self):
        return self.__base_tax_amount

    @property
    def base_tax_before_discount(self):
        return self.__base_tax_before_discount

    @property
    def base_tax_invoiced(self):
        return self.__base_tax_invoiced

    @property
    def base_tax_refunded(self):
        return self.__base_tax_refunded

    @property
    def base_weee_tax_applied_amount(self):
        return self.__base_weee_tax_applied_amount

    @property
    def base_weee_tax_applied_row_amnt(self):
        return self.__base_weee_tax_applied_row_amnt

    @property
    def base_weee_tax_applied_row_amount(self):
        return self.__base_weee_tax_applied_row_amount

    @property
    def base_weee_tax_disposition(self):
        return self.__base_weee_tax_disposition

    @property
    def base_weee_tax_row_disposition(self):
        return self.__base_weee_tax_row_disposition

    @property
    def created_at(self):
        return self.__created_at

    @property
    def description(self):
        return self.__description

    @property
    def discount_amount(self):
        return self.__discount_amount

    @property
    def discount_invoiced(self):
        return self.__discount_invoiced

    @property
    def discount_percent(self):
        return self.__discount_percent

    @property
    def discount_refunded(self):
        return self.__discount_refunded

    @property
    def free_shipping(self):
        return self.__free_shipping

    @property
    def gift_message_available(self):
        return self.__gift_message_available

    @property
    def gift_message_id(self):
        return self.__gift_message_id

    @property
    def has_children(self):
        return self.__has_children

    @property
    def hidden_tax_amount(self):
        return self.__hidden_tax_amount

    @property
    def hidden_tax_canceled(self):
        return self.__hidden_tax_canceled

    @property
    def hidden_tax_invoiced(self):
        return self.__hidden_tax_invoiced

    @property
    def hidden_tax_refunded(self):
        return self.__hidden_tax_refunded

    @property
    def is_nominal(self):
        return self.__is_nominal

    @property
    def is_qty_decimal(self):
        return self.__is_qty_decimal

    @property
    def is_virtual(self):
        return self.__is_virtual

    @property
    def item_id(self):
        return self.__item_id

    @property
    def locked_do_invoice(self):
        return self.__locked_do_invoice

    @property
    def locked_do_ship(self):
        return self.__locked_do_ship

    @property
    def name(self):
        return self.__name

    @property
    def no_discount(self):
        return self.__no_discount

    @property
    def order_id(self):
        return self.__order_id

    @property
    def original_price(self):
        return self.__original_price

    @property
    def parent_item_id(self):
        return self.__parent_item_id

    @property
    def price(self):
        return self.__price

    @property
    def price_incl_tax(self):
        return self.__price_incl_tax

    @property
    def product_id(self):
        return self.__product_id

    @property
    def product_type(self):
        return self.__product_type

    @property
    def qty_backordered(self):
        return self.__qty_backordered

    @property
    def qty_canceled(self):
        return self.__qty_canceled

    @property
    def qty_invoiced(self):
        return self.__qty_invoiced

    @property
    def qty_ordered(self):
        return self.__qty_ordered

    @property
    def qty_refunded(self):
        return self.__qty_refunded

    @property
    def qty_shipped(self):
        return self.__qty_shipped

    @property
    def quote_item_id(self):
        return self.__quote_item_id

    @classmethod
    def read(cls, iprot):
        init_kwds = {}

        iprot.readStructBegin()
        while True:
            ifield_name, ifield_type, _ifield_id = iprot.readFieldBegin()
            if ifield_type == 0: # STOP
                break
            elif ifield_name == 'additional_data':
                try:
                    init_kwds['additional_data'] = iprot.readString()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'amount_refunded':
                try:
                    init_kwds['amount_refunded'] = iprot.readDecimal() if hasattr(iprot, 'readDecimal') else decimal.Decimal(iprot.readString())
                except (decimal.InvalidOperation, TypeError,):
                    pass
            elif ifield_name == 'base_amount_refunded':
                try:
                    init_kwds['base_amount_refunded'] = iprot.readDecimal() if hasattr(iprot, 'readDecimal') else decimal.Decimal(iprot.readString())
                except (decimal.InvalidOperation, TypeError,):
                    pass
            elif ifield_name == 'base_cost':
                try:
                    init_kwds['base_cost'] = iprot.readDecimal() if hasattr(iprot, 'readDecimal') else decimal.Decimal(iprot.readString())
                except (decimal.InvalidOperation, TypeError,):
                    pass
            elif ifield_name == 'base_discount_amount':
                try:
                    init_kwds['base_discount_amount'] = iprot.readDecimal() if hasattr(iprot, 'readDecimal') else decimal.Decimal(iprot.readString())
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
            elif ifield_name == 'base_original_price':
                try:
                    init_kwds['base_original_price'] = iprot.readDecimal() if hasattr(iprot, 'readDecimal') else decimal.Decimal(iprot.readString())
                except (decimal.InvalidOperation, TypeError,):
                    pass
            elif ifield_name == 'base_price':
                try:
                    init_kwds['base_price'] = iprot.readDecimal() if hasattr(iprot, 'readDecimal') else decimal.Decimal(iprot.readString())
                except (decimal.InvalidOperation, TypeError,):
                    pass
            elif ifield_name == 'base_price_incl_tax':
                try:
                    init_kwds['base_price_incl_tax'] = iprot.readDecimal() if hasattr(iprot, 'readDecimal') else decimal.Decimal(iprot.readString())
                except (decimal.InvalidOperation, TypeError,):
                    pass
            elif ifield_name == 'base_row_invoiced':
                try:
                    init_kwds['base_row_invoiced'] = iprot.readDecimal() if hasattr(iprot, 'readDecimal') else decimal.Decimal(iprot.readString())
                except (decimal.InvalidOperation, TypeError,):
                    pass
            elif ifield_name == 'base_row_total':
                try:
                    init_kwds['base_row_total'] = iprot.readDecimal() if hasattr(iprot, 'readDecimal') else decimal.Decimal(iprot.readString())
                except (decimal.InvalidOperation, TypeError,):
                    pass
            elif ifield_name == 'base_row_total_incl_tax':
                try:
                    init_kwds['base_row_total_incl_tax'] = iprot.readDecimal() if hasattr(iprot, 'readDecimal') else decimal.Decimal(iprot.readString())
                except (decimal.InvalidOperation, TypeError,):
                    pass
            elif ifield_name == 'base_tax_amount':
                try:
                    init_kwds['base_tax_amount'] = iprot.readDecimal() if hasattr(iprot, 'readDecimal') else decimal.Decimal(iprot.readString())
                except (decimal.InvalidOperation, TypeError,):
                    pass
            elif ifield_name == 'base_tax_before_discount':
                try:
                    init_kwds['base_tax_before_discount'] = iprot.readDecimal() if hasattr(iprot, 'readDecimal') else decimal.Decimal(iprot.readString())
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
            elif ifield_name == 'base_weee_tax_applied_amount':
                try:
                    init_kwds['base_weee_tax_applied_amount'] = iprot.readDecimal() if hasattr(iprot, 'readDecimal') else decimal.Decimal(iprot.readString())
                except (decimal.InvalidOperation, TypeError,):
                    pass
            elif ifield_name == 'base_weee_tax_applied_row_amnt':
                try:
                    init_kwds['base_weee_tax_applied_row_amnt'] = iprot.readDecimal() if hasattr(iprot, 'readDecimal') else decimal.Decimal(iprot.readString())
                except (decimal.InvalidOperation, TypeError,):
                    pass
            elif ifield_name == 'base_weee_tax_applied_row_amount':
                try:
                    init_kwds['base_weee_tax_applied_row_amount'] = iprot.readDecimal() if hasattr(iprot, 'readDecimal') else decimal.Decimal(iprot.readString())
                except (decimal.InvalidOperation, TypeError,):
                    pass
            elif ifield_name == 'base_weee_tax_disposition':
                try:
                    init_kwds['base_weee_tax_disposition'] = iprot.readDecimal() if hasattr(iprot, 'readDecimal') else decimal.Decimal(iprot.readString())
                except (decimal.InvalidOperation, TypeError,):
                    pass
            elif ifield_name == 'base_weee_tax_row_disposition':
                try:
                    init_kwds['base_weee_tax_row_disposition'] = iprot.readDecimal() if hasattr(iprot, 'readDecimal') else decimal.Decimal(iprot.readString())
                except (decimal.InvalidOperation, TypeError,):
                    pass
            elif ifield_name == 'created_at':
                init_kwds['created_at'] = iprot.readDateTime() if hasattr(iprot, 'readDateTime') else datetime.fromtimestamp(iprot.readI64() / 1000.0)
            elif ifield_name == 'description':
                try:
                    init_kwds['description'] = iprot.readString()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'discount_amount':
                try:
                    init_kwds['discount_amount'] = iprot.readDecimal() if hasattr(iprot, 'readDecimal') else decimal.Decimal(iprot.readString())
                except (decimal.InvalidOperation, TypeError,):
                    pass
            elif ifield_name == 'discount_invoiced':
                try:
                    init_kwds['discount_invoiced'] = iprot.readDecimal() if hasattr(iprot, 'readDecimal') else decimal.Decimal(iprot.readString())
                except (decimal.InvalidOperation, TypeError,):
                    pass
            elif ifield_name == 'discount_percent':
                try:
                    init_kwds['discount_percent'] = iprot.readDecimal() if hasattr(iprot, 'readDecimal') else decimal.Decimal(iprot.readString())
                except (decimal.InvalidOperation, TypeError,):
                    pass
            elif ifield_name == 'discount_refunded':
                try:
                    init_kwds['discount_refunded'] = iprot.readDecimal() if hasattr(iprot, 'readDecimal') else decimal.Decimal(iprot.readString())
                except (decimal.InvalidOperation, TypeError,):
                    pass
            elif ifield_name == 'free_shipping':
                try:
                    init_kwds['free_shipping'] = iprot.readBool()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'gift_message_available':
                try:
                    init_kwds['gift_message_available'] = iprot.readString()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'gift_message_id':
                try:
                    init_kwds['gift_message_id'] = iprot.readI32()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'has_children':
                try:
                    init_kwds['has_children'] = iprot.readBool()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'hidden_tax_amount':
                try:
                    init_kwds['hidden_tax_amount'] = iprot.readDecimal() if hasattr(iprot, 'readDecimal') else decimal.Decimal(iprot.readString())
                except (decimal.InvalidOperation, TypeError,):
                    pass
            elif ifield_name == 'hidden_tax_canceled':
                try:
                    init_kwds['hidden_tax_canceled'] = iprot.readDecimal() if hasattr(iprot, 'readDecimal') else decimal.Decimal(iprot.readString())
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
            elif ifield_name == 'is_nominal':
                try:
                    init_kwds['is_nominal'] = iprot.readBool()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'is_qty_decimal':
                try:
                    init_kwds['is_qty_decimal'] = iprot.readBool()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'is_virtual':
                try:
                    init_kwds['is_virtual'] = iprot.readBool()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'item_id':
                try:
                    init_kwds['item_id'] = iprot.readI32()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'locked_do_invoice':
                try:
                    init_kwds['locked_do_invoice'] = iprot.readBool()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'locked_do_ship':
                try:
                    init_kwds['locked_do_ship'] = iprot.readBool()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'name':
                init_kwds['name'] = iprot.readString()
            elif ifield_name == 'no_discount':
                try:
                    init_kwds['no_discount'] = iprot.readBool()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'order_id':
                try:
                    init_kwds['order_id'] = iprot.readI32()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'original_price':
                try:
                    init_kwds['original_price'] = iprot.readDecimal() if hasattr(iprot, 'readDecimal') else decimal.Decimal(iprot.readString())
                except (decimal.InvalidOperation, TypeError,):
                    pass
            elif ifield_name == 'parent_item_id':
                try:
                    init_kwds['parent_item_id'] = iprot.readI32()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'price':
                try:
                    init_kwds['price'] = iprot.readDecimal() if hasattr(iprot, 'readDecimal') else decimal.Decimal(iprot.readString())
                except (decimal.InvalidOperation, TypeError,):
                    pass
            elif ifield_name == 'price_incl_tax':
                try:
                    init_kwds['price_incl_tax'] = iprot.readDecimal() if hasattr(iprot, 'readDecimal') else decimal.Decimal(iprot.readString())
                except (decimal.InvalidOperation, TypeError,):
                    pass
            elif ifield_name == 'product_id':
                try:
                    init_kwds['product_id'] = iprot.readI32()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'product_type':
                init_kwds['product_type'] = yogento.api.models.catalog.product.magento.magento_product_type.MagentoProductType.value_of(iprot.readString().strip().upper())
            elif ifield_name == 'qty_backordered':
                try:
                    init_kwds['qty_backordered'] = iprot.readDecimal() if hasattr(iprot, 'readDecimal') else decimal.Decimal(iprot.readString())
                except (decimal.InvalidOperation, TypeError,):
                    pass
            elif ifield_name == 'qty_canceled':
                try:
                    init_kwds['qty_canceled'] = iprot.readDecimal() if hasattr(iprot, 'readDecimal') else decimal.Decimal(iprot.readString())
                except (decimal.InvalidOperation, TypeError,):
                    pass
            elif ifield_name == 'qty_invoiced':
                try:
                    init_kwds['qty_invoiced'] = iprot.readDecimal() if hasattr(iprot, 'readDecimal') else decimal.Decimal(iprot.readString())
                except (decimal.InvalidOperation, TypeError,):
                    pass
            elif ifield_name == 'qty_ordered':
                try:
                    init_kwds['qty_ordered'] = iprot.readDecimal() if hasattr(iprot, 'readDecimal') else decimal.Decimal(iprot.readString())
                except (decimal.InvalidOperation, TypeError,):
                    pass
            elif ifield_name == 'qty_refunded':
                try:
                    init_kwds['qty_refunded'] = iprot.readDecimal() if hasattr(iprot, 'readDecimal') else decimal.Decimal(iprot.readString())
                except (decimal.InvalidOperation, TypeError,):
                    pass
            elif ifield_name == 'qty_shipped':
                try:
                    init_kwds['qty_shipped'] = iprot.readDecimal() if hasattr(iprot, 'readDecimal') else decimal.Decimal(iprot.readString())
                except (decimal.InvalidOperation, TypeError,):
                    pass
            elif ifield_name == 'quote_item_id':
                try:
                    init_kwds['quote_item_id'] = iprot.readI32()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'row_invoiced':
                try:
                    init_kwds['row_invoiced'] = iprot.readDecimal() if hasattr(iprot, 'readDecimal') else decimal.Decimal(iprot.readString())
                except (decimal.InvalidOperation, TypeError,):
                    pass
            elif ifield_name == 'row_total':
                try:
                    init_kwds['row_total'] = iprot.readDecimal() if hasattr(iprot, 'readDecimal') else decimal.Decimal(iprot.readString())
                except (decimal.InvalidOperation, TypeError,):
                    pass
            elif ifield_name == 'row_total_incl_tax':
                try:
                    init_kwds['row_total_incl_tax'] = iprot.readDecimal() if hasattr(iprot, 'readDecimal') else decimal.Decimal(iprot.readString())
                except (decimal.InvalidOperation, TypeError,):
                    pass
            elif ifield_name == 'row_weight':
                try:
                    init_kwds['row_weight'] = iprot.readDecimal() if hasattr(iprot, 'readDecimal') else decimal.Decimal(iprot.readString())
                except (decimal.InvalidOperation, TypeError,):
                    pass
            elif ifield_name == 'sku':
                init_kwds['sku'] = iprot.readString()
            elif ifield_name == 'store_id':
                try:
                    init_kwds['store_id'] = iprot.readI32()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'tax_amount':
                try:
                    init_kwds['tax_amount'] = iprot.readDecimal() if hasattr(iprot, 'readDecimal') else decimal.Decimal(iprot.readString())
                except (decimal.InvalidOperation, TypeError,):
                    pass
            elif ifield_name == 'tax_before_discount':
                try:
                    init_kwds['tax_before_discount'] = iprot.readDecimal() if hasattr(iprot, 'readDecimal') else decimal.Decimal(iprot.readString())
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
            elif ifield_name == 'updated_at':
                init_kwds['updated_at'] = iprot.readDateTime() if hasattr(iprot, 'readDateTime') else datetime.fromtimestamp(iprot.readI64() / 1000.0)
            elif ifield_name == 'weee_tax_applied_amount':
                try:
                    init_kwds['weee_tax_applied_amount'] = iprot.readDecimal() if hasattr(iprot, 'readDecimal') else decimal.Decimal(iprot.readString())
                except (decimal.InvalidOperation, TypeError,):
                    pass
            elif ifield_name == 'weee_tax_applied_row_amount':
                try:
                    init_kwds['weee_tax_applied_row_amount'] = iprot.readDecimal() if hasattr(iprot, 'readDecimal') else decimal.Decimal(iprot.readString())
                except (decimal.InvalidOperation, TypeError,):
                    pass
            elif ifield_name == 'weee_tax_disposition':
                try:
                    init_kwds['weee_tax_disposition'] = iprot.readDecimal() if hasattr(iprot, 'readDecimal') else decimal.Decimal(iprot.readString())
                except (decimal.InvalidOperation, TypeError,):
                    pass
            elif ifield_name == 'weee_tax_row_disposition':
                try:
                    init_kwds['weee_tax_row_disposition'] = iprot.readDecimal() if hasattr(iprot, 'readDecimal') else decimal.Decimal(iprot.readString())
                except (decimal.InvalidOperation, TypeError,):
                    pass
            elif ifield_name == 'weight':
                try:
                    init_kwds['weight'] = iprot.readDecimal() if hasattr(iprot, 'readDecimal') else decimal.Decimal(iprot.readString())
                except (decimal.InvalidOperation, TypeError,):
                    pass
            iprot.readFieldEnd()
        iprot.readStructEnd()

        return cls(**init_kwds)

    def replace(self, additional_data=None, amount_refunded=None, base_amount_refunded=None, base_cost=None, base_discount_amount=None, base_discount_invoiced=None, base_discount_refunded=None, base_hidden_tax_amount=None, base_hidden_tax_invoiced=None, base_hidden_tax_refunded=None, base_original_price=None, base_price=None, base_price_incl_tax=None, base_row_invoiced=None, base_row_total=None, base_row_total_incl_tax=None, base_tax_amount=None, base_tax_before_discount=None, base_tax_invoiced=None, base_tax_refunded=None, base_weee_tax_applied_amount=None, base_weee_tax_applied_row_amnt=None, base_weee_tax_applied_row_amount=None, base_weee_tax_disposition=None, base_weee_tax_row_disposition=None, created_at=None, description=None, discount_amount=None, discount_invoiced=None, discount_percent=None, discount_refunded=None, free_shipping=None, gift_message_available=None, gift_message_id=None, has_children=None, hidden_tax_amount=None, hidden_tax_canceled=None, hidden_tax_invoiced=None, hidden_tax_refunded=None, is_nominal=None, is_qty_decimal=None, is_virtual=None, item_id=None, locked_do_invoice=None, locked_do_ship=None, name=None, no_discount=None, order_id=None, original_price=None, parent_item_id=None, price=None, price_incl_tax=None, product_id=None, product_type=None, qty_backordered=None, qty_canceled=None, qty_invoiced=None, qty_ordered=None, qty_refunded=None, qty_shipped=None, quote_item_id=None, row_invoiced=None, row_total=None, row_total_incl_tax=None, row_weight=None, sku=None, store_id=None, tax_amount=None, tax_before_discount=None, tax_canceled=None, tax_invoiced=None, tax_percent=None, tax_refunded=None, updated_at=None, weee_tax_applied_amount=None, weee_tax_applied_row_amount=None, weee_tax_disposition=None, weee_tax_row_disposition=None, weight=None):
        if additional_data is None:
            additional_data = self.additional_data
        if amount_refunded is None:
            amount_refunded = self.amount_refunded
        if base_amount_refunded is None:
            base_amount_refunded = self.base_amount_refunded
        if base_cost is None:
            base_cost = self.base_cost
        if base_discount_amount is None:
            base_discount_amount = self.base_discount_amount
        if base_discount_invoiced is None:
            base_discount_invoiced = self.base_discount_invoiced
        if base_discount_refunded is None:
            base_discount_refunded = self.base_discount_refunded
        if base_hidden_tax_amount is None:
            base_hidden_tax_amount = self.base_hidden_tax_amount
        if base_hidden_tax_invoiced is None:
            base_hidden_tax_invoiced = self.base_hidden_tax_invoiced
        if base_hidden_tax_refunded is None:
            base_hidden_tax_refunded = self.base_hidden_tax_refunded
        if base_original_price is None:
            base_original_price = self.base_original_price
        if base_price is None:
            base_price = self.base_price
        if base_price_incl_tax is None:
            base_price_incl_tax = self.base_price_incl_tax
        if base_row_invoiced is None:
            base_row_invoiced = self.base_row_invoiced
        if base_row_total is None:
            base_row_total = self.base_row_total
        if base_row_total_incl_tax is None:
            base_row_total_incl_tax = self.base_row_total_incl_tax
        if base_tax_amount is None:
            base_tax_amount = self.base_tax_amount
        if base_tax_before_discount is None:
            base_tax_before_discount = self.base_tax_before_discount
        if base_tax_invoiced is None:
            base_tax_invoiced = self.base_tax_invoiced
        if base_tax_refunded is None:
            base_tax_refunded = self.base_tax_refunded
        if base_weee_tax_applied_amount is None:
            base_weee_tax_applied_amount = self.base_weee_tax_applied_amount
        if base_weee_tax_applied_row_amnt is None:
            base_weee_tax_applied_row_amnt = self.base_weee_tax_applied_row_amnt
        if base_weee_tax_applied_row_amount is None:
            base_weee_tax_applied_row_amount = self.base_weee_tax_applied_row_amount
        if base_weee_tax_disposition is None:
            base_weee_tax_disposition = self.base_weee_tax_disposition
        if base_weee_tax_row_disposition is None:
            base_weee_tax_row_disposition = self.base_weee_tax_row_disposition
        if created_at is None:
            created_at = self.created_at
        if description is None:
            description = self.description
        if discount_amount is None:
            discount_amount = self.discount_amount
        if discount_invoiced is None:
            discount_invoiced = self.discount_invoiced
        if discount_percent is None:
            discount_percent = self.discount_percent
        if discount_refunded is None:
            discount_refunded = self.discount_refunded
        if free_shipping is None:
            free_shipping = self.free_shipping
        if gift_message_available is None:
            gift_message_available = self.gift_message_available
        if gift_message_id is None:
            gift_message_id = self.gift_message_id
        if has_children is None:
            has_children = self.has_children
        if hidden_tax_amount is None:
            hidden_tax_amount = self.hidden_tax_amount
        if hidden_tax_canceled is None:
            hidden_tax_canceled = self.hidden_tax_canceled
        if hidden_tax_invoiced is None:
            hidden_tax_invoiced = self.hidden_tax_invoiced
        if hidden_tax_refunded is None:
            hidden_tax_refunded = self.hidden_tax_refunded
        if is_nominal is None:
            is_nominal = self.is_nominal
        if is_qty_decimal is None:
            is_qty_decimal = self.is_qty_decimal
        if is_virtual is None:
            is_virtual = self.is_virtual
        if item_id is None:
            item_id = self.item_id
        if locked_do_invoice is None:
            locked_do_invoice = self.locked_do_invoice
        if locked_do_ship is None:
            locked_do_ship = self.locked_do_ship
        if name is None:
            name = self.name
        if no_discount is None:
            no_discount = self.no_discount
        if order_id is None:
            order_id = self.order_id
        if original_price is None:
            original_price = self.original_price
        if parent_item_id is None:
            parent_item_id = self.parent_item_id
        if price is None:
            price = self.price
        if price_incl_tax is None:
            price_incl_tax = self.price_incl_tax
        if product_id is None:
            product_id = self.product_id
        if product_type is None:
            product_type = self.product_type
        if qty_backordered is None:
            qty_backordered = self.qty_backordered
        if qty_canceled is None:
            qty_canceled = self.qty_canceled
        if qty_invoiced is None:
            qty_invoiced = self.qty_invoiced
        if qty_ordered is None:
            qty_ordered = self.qty_ordered
        if qty_refunded is None:
            qty_refunded = self.qty_refunded
        if qty_shipped is None:
            qty_shipped = self.qty_shipped
        if quote_item_id is None:
            quote_item_id = self.quote_item_id
        if row_invoiced is None:
            row_invoiced = self.row_invoiced
        if row_total is None:
            row_total = self.row_total
        if row_total_incl_tax is None:
            row_total_incl_tax = self.row_total_incl_tax
        if row_weight is None:
            row_weight = self.row_weight
        if sku is None:
            sku = self.sku
        if store_id is None:
            store_id = self.store_id
        if tax_amount is None:
            tax_amount = self.tax_amount
        if tax_before_discount is None:
            tax_before_discount = self.tax_before_discount
        if tax_canceled is None:
            tax_canceled = self.tax_canceled
        if tax_invoiced is None:
            tax_invoiced = self.tax_invoiced
        if tax_percent is None:
            tax_percent = self.tax_percent
        if tax_refunded is None:
            tax_refunded = self.tax_refunded
        if updated_at is None:
            updated_at = self.updated_at
        if weee_tax_applied_amount is None:
            weee_tax_applied_amount = self.weee_tax_applied_amount
        if weee_tax_applied_row_amount is None:
            weee_tax_applied_row_amount = self.weee_tax_applied_row_amount
        if weee_tax_disposition is None:
            weee_tax_disposition = self.weee_tax_disposition
        if weee_tax_row_disposition is None:
            weee_tax_row_disposition = self.weee_tax_row_disposition
        if weight is None:
            weight = self.weight
        return self.__class__(additional_data=additional_data, amount_refunded=amount_refunded, base_amount_refunded=base_amount_refunded, base_cost=base_cost, base_discount_amount=base_discount_amount, base_discount_invoiced=base_discount_invoiced, base_discount_refunded=base_discount_refunded, base_hidden_tax_amount=base_hidden_tax_amount, base_hidden_tax_invoiced=base_hidden_tax_invoiced, base_hidden_tax_refunded=base_hidden_tax_refunded, base_original_price=base_original_price, base_price=base_price, base_price_incl_tax=base_price_incl_tax, base_row_invoiced=base_row_invoiced, base_row_total=base_row_total, base_row_total_incl_tax=base_row_total_incl_tax, base_tax_amount=base_tax_amount, base_tax_before_discount=base_tax_before_discount, base_tax_invoiced=base_tax_invoiced, base_tax_refunded=base_tax_refunded, base_weee_tax_applied_amount=base_weee_tax_applied_amount, base_weee_tax_applied_row_amnt=base_weee_tax_applied_row_amnt, base_weee_tax_applied_row_amount=base_weee_tax_applied_row_amount, base_weee_tax_disposition=base_weee_tax_disposition, base_weee_tax_row_disposition=base_weee_tax_row_disposition, created_at=created_at, description=description, discount_amount=discount_amount, discount_invoiced=discount_invoiced, discount_percent=discount_percent, discount_refunded=discount_refunded, free_shipping=free_shipping, gift_message_available=gift_message_available, gift_message_id=gift_message_id, has_children=has_children, hidden_tax_amount=hidden_tax_amount, hidden_tax_canceled=hidden_tax_canceled, hidden_tax_invoiced=hidden_tax_invoiced, hidden_tax_refunded=hidden_tax_refunded, is_nominal=is_nominal, is_qty_decimal=is_qty_decimal, is_virtual=is_virtual, item_id=item_id, locked_do_invoice=locked_do_invoice, locked_do_ship=locked_do_ship, name=name, no_discount=no_discount, order_id=order_id, original_price=original_price, parent_item_id=parent_item_id, price=price, price_incl_tax=price_incl_tax, product_id=product_id, product_type=product_type, qty_backordered=qty_backordered, qty_canceled=qty_canceled, qty_invoiced=qty_invoiced, qty_ordered=qty_ordered, qty_refunded=qty_refunded, qty_shipped=qty_shipped, quote_item_id=quote_item_id, row_invoiced=row_invoiced, row_total=row_total, row_total_incl_tax=row_total_incl_tax, row_weight=row_weight, sku=sku, store_id=store_id, tax_amount=tax_amount, tax_before_discount=tax_before_discount, tax_canceled=tax_canceled, tax_invoiced=tax_invoiced, tax_percent=tax_percent, tax_refunded=tax_refunded, updated_at=updated_at, weee_tax_applied_amount=weee_tax_applied_amount, weee_tax_applied_row_amount=weee_tax_applied_row_amount, weee_tax_disposition=weee_tax_disposition, weee_tax_row_disposition=weee_tax_row_disposition, weight=weight)

    @property
    def row_invoiced(self):
        return self.__row_invoiced

    @property
    def row_total(self):
        return self.__row_total

    @property
    def row_total_incl_tax(self):
        return self.__row_total_incl_tax

    @property
    def row_weight(self):
        return self.__row_weight

    @property
    def sku(self):
        return self.__sku

    @property
    def store_id(self):
        return self.__store_id

    @property
    def tax_amount(self):
        return self.__tax_amount

    @property
    def tax_before_discount(self):
        return self.__tax_before_discount

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
    def updated_at(self):
        return self.__updated_at

    @property
    def weee_tax_applied_amount(self):
        return self.__weee_tax_applied_amount

    @property
    def weee_tax_applied_row_amount(self):
        return self.__weee_tax_applied_row_amount

    @property
    def weee_tax_disposition(self):
        return self.__weee_tax_disposition

    @property
    def weee_tax_row_disposition(self):
        return self.__weee_tax_row_disposition

    @property
    def weight(self):
        return self.__weight

    def write(self, oprot):
        oprot.writeStructBegin('MagentoOrderItem')

        if self.additional_data is not None:
            oprot.writeFieldBegin('additional_data', 11, -1)
            oprot.writeString(self.additional_data)
            oprot.writeFieldEnd()

        if self.amount_refunded is not None:
            oprot.writeFieldBegin('amount_refunded', 12, -1)
            oprot.writeDecimal(self.amount_refunded) if hasattr(oprot, 'writeDecimal') else oprot.writeString(str(self.amount_refunded))
            oprot.writeFieldEnd()

        if self.base_amount_refunded is not None:
            oprot.writeFieldBegin('base_amount_refunded', 12, -1)
            oprot.writeDecimal(self.base_amount_refunded) if hasattr(oprot, 'writeDecimal') else oprot.writeString(str(self.base_amount_refunded))
            oprot.writeFieldEnd()

        if self.base_cost is not None:
            oprot.writeFieldBegin('base_cost', 12, -1)
            oprot.writeDecimal(self.base_cost) if hasattr(oprot, 'writeDecimal') else oprot.writeString(str(self.base_cost))
            oprot.writeFieldEnd()

        if self.base_discount_amount is not None:
            oprot.writeFieldBegin('base_discount_amount', 12, -1)
            oprot.writeDecimal(self.base_discount_amount) if hasattr(oprot, 'writeDecimal') else oprot.writeString(str(self.base_discount_amount))
            oprot.writeFieldEnd()

        if self.base_discount_invoiced is not None:
            oprot.writeFieldBegin('base_discount_invoiced', 12, -1)
            oprot.writeDecimal(self.base_discount_invoiced) if hasattr(oprot, 'writeDecimal') else oprot.writeString(str(self.base_discount_invoiced))
            oprot.writeFieldEnd()

        if self.base_discount_refunded is not None:
            oprot.writeFieldBegin('base_discount_refunded', 12, -1)
            oprot.writeDecimal(self.base_discount_refunded) if hasattr(oprot, 'writeDecimal') else oprot.writeString(str(self.base_discount_refunded))
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

        if self.base_original_price is not None:
            oprot.writeFieldBegin('base_original_price', 12, -1)
            oprot.writeDecimal(self.base_original_price) if hasattr(oprot, 'writeDecimal') else oprot.writeString(str(self.base_original_price))
            oprot.writeFieldEnd()

        if self.base_price is not None:
            oprot.writeFieldBegin('base_price', 12, -1)
            oprot.writeDecimal(self.base_price) if hasattr(oprot, 'writeDecimal') else oprot.writeString(str(self.base_price))
            oprot.writeFieldEnd()

        if self.base_price_incl_tax is not None:
            oprot.writeFieldBegin('base_price_incl_tax', 12, -1)
            oprot.writeDecimal(self.base_price_incl_tax) if hasattr(oprot, 'writeDecimal') else oprot.writeString(str(self.base_price_incl_tax))
            oprot.writeFieldEnd()

        if self.base_row_invoiced is not None:
            oprot.writeFieldBegin('base_row_invoiced', 12, -1)
            oprot.writeDecimal(self.base_row_invoiced) if hasattr(oprot, 'writeDecimal') else oprot.writeString(str(self.base_row_invoiced))
            oprot.writeFieldEnd()

        if self.base_row_total is not None:
            oprot.writeFieldBegin('base_row_total', 12, -1)
            oprot.writeDecimal(self.base_row_total) if hasattr(oprot, 'writeDecimal') else oprot.writeString(str(self.base_row_total))
            oprot.writeFieldEnd()

        if self.base_row_total_incl_tax is not None:
            oprot.writeFieldBegin('base_row_total_incl_tax', 12, -1)
            oprot.writeDecimal(self.base_row_total_incl_tax) if hasattr(oprot, 'writeDecimal') else oprot.writeString(str(self.base_row_total_incl_tax))
            oprot.writeFieldEnd()

        if self.base_tax_amount is not None:
            oprot.writeFieldBegin('base_tax_amount', 12, -1)
            oprot.writeDecimal(self.base_tax_amount) if hasattr(oprot, 'writeDecimal') else oprot.writeString(str(self.base_tax_amount))
            oprot.writeFieldEnd()

        if self.base_tax_before_discount is not None:
            oprot.writeFieldBegin('base_tax_before_discount', 12, -1)
            oprot.writeDecimal(self.base_tax_before_discount) if hasattr(oprot, 'writeDecimal') else oprot.writeString(str(self.base_tax_before_discount))
            oprot.writeFieldEnd()

        if self.base_tax_invoiced is not None:
            oprot.writeFieldBegin('base_tax_invoiced', 12, -1)
            oprot.writeDecimal(self.base_tax_invoiced) if hasattr(oprot, 'writeDecimal') else oprot.writeString(str(self.base_tax_invoiced))
            oprot.writeFieldEnd()

        if self.base_tax_refunded is not None:
            oprot.writeFieldBegin('base_tax_refunded', 12, -1)
            oprot.writeDecimal(self.base_tax_refunded) if hasattr(oprot, 'writeDecimal') else oprot.writeString(str(self.base_tax_refunded))
            oprot.writeFieldEnd()

        if self.base_weee_tax_applied_amount is not None:
            oprot.writeFieldBegin('base_weee_tax_applied_amount', 12, -1)
            oprot.writeDecimal(self.base_weee_tax_applied_amount) if hasattr(oprot, 'writeDecimal') else oprot.writeString(str(self.base_weee_tax_applied_amount))
            oprot.writeFieldEnd()

        if self.base_weee_tax_applied_row_amnt is not None:
            oprot.writeFieldBegin('base_weee_tax_applied_row_amnt', 12, -1)
            oprot.writeDecimal(self.base_weee_tax_applied_row_amnt) if hasattr(oprot, 'writeDecimal') else oprot.writeString(str(self.base_weee_tax_applied_row_amnt))
            oprot.writeFieldEnd()

        if self.base_weee_tax_applied_row_amount is not None:
            oprot.writeFieldBegin('base_weee_tax_applied_row_amount', 12, -1)
            oprot.writeDecimal(self.base_weee_tax_applied_row_amount) if hasattr(oprot, 'writeDecimal') else oprot.writeString(str(self.base_weee_tax_applied_row_amount))
            oprot.writeFieldEnd()

        if self.base_weee_tax_disposition is not None:
            oprot.writeFieldBegin('base_weee_tax_disposition', 12, -1)
            oprot.writeDecimal(self.base_weee_tax_disposition) if hasattr(oprot, 'writeDecimal') else oprot.writeString(str(self.base_weee_tax_disposition))
            oprot.writeFieldEnd()

        if self.base_weee_tax_row_disposition is not None:
            oprot.writeFieldBegin('base_weee_tax_row_disposition', 12, -1)
            oprot.writeDecimal(self.base_weee_tax_row_disposition) if hasattr(oprot, 'writeDecimal') else oprot.writeString(str(self.base_weee_tax_row_disposition))
            oprot.writeFieldEnd()

        oprot.writeFieldBegin('created_at', 12, -1)
        oprot.writeDateTime(self.created_at) if hasattr(oprot, 'writeDateTime') else oprot.writeI64(long(mktime(self.created_at.timetuple())) * 1000l)
        oprot.writeFieldEnd()

        if self.description is not None:
            oprot.writeFieldBegin('description', 11, -1)
            oprot.writeString(self.description)
            oprot.writeFieldEnd()

        if self.discount_amount is not None:
            oprot.writeFieldBegin('discount_amount', 12, -1)
            oprot.writeDecimal(self.discount_amount) if hasattr(oprot, 'writeDecimal') else oprot.writeString(str(self.discount_amount))
            oprot.writeFieldEnd()

        if self.discount_invoiced is not None:
            oprot.writeFieldBegin('discount_invoiced', 12, -1)
            oprot.writeDecimal(self.discount_invoiced) if hasattr(oprot, 'writeDecimal') else oprot.writeString(str(self.discount_invoiced))
            oprot.writeFieldEnd()

        if self.discount_percent is not None:
            oprot.writeFieldBegin('discount_percent', 12, -1)
            oprot.writeDecimal(self.discount_percent) if hasattr(oprot, 'writeDecimal') else oprot.writeString(str(self.discount_percent))
            oprot.writeFieldEnd()

        if self.discount_refunded is not None:
            oprot.writeFieldBegin('discount_refunded', 12, -1)
            oprot.writeDecimal(self.discount_refunded) if hasattr(oprot, 'writeDecimal') else oprot.writeString(str(self.discount_refunded))
            oprot.writeFieldEnd()

        if self.free_shipping is not None:
            oprot.writeFieldBegin('free_shipping', 2, -1)
            oprot.writeBool(self.free_shipping)
            oprot.writeFieldEnd()

        if self.gift_message_available is not None:
            oprot.writeFieldBegin('gift_message_available', 11, -1)
            oprot.writeString(self.gift_message_available)
            oprot.writeFieldEnd()

        if self.gift_message_id is not None:
            oprot.writeFieldBegin('gift_message_id', 8, -1)
            oprot.writeI32(self.gift_message_id)
            oprot.writeFieldEnd()

        if self.has_children is not None:
            oprot.writeFieldBegin('has_children', 2, -1)
            oprot.writeBool(self.has_children)
            oprot.writeFieldEnd()

        if self.hidden_tax_amount is not None:
            oprot.writeFieldBegin('hidden_tax_amount', 12, -1)
            oprot.writeDecimal(self.hidden_tax_amount) if hasattr(oprot, 'writeDecimal') else oprot.writeString(str(self.hidden_tax_amount))
            oprot.writeFieldEnd()

        if self.hidden_tax_canceled is not None:
            oprot.writeFieldBegin('hidden_tax_canceled', 12, -1)
            oprot.writeDecimal(self.hidden_tax_canceled) if hasattr(oprot, 'writeDecimal') else oprot.writeString(str(self.hidden_tax_canceled))
            oprot.writeFieldEnd()

        if self.hidden_tax_invoiced is not None:
            oprot.writeFieldBegin('hidden_tax_invoiced', 12, -1)
            oprot.writeDecimal(self.hidden_tax_invoiced) if hasattr(oprot, 'writeDecimal') else oprot.writeString(str(self.hidden_tax_invoiced))
            oprot.writeFieldEnd()

        if self.hidden_tax_refunded is not None:
            oprot.writeFieldBegin('hidden_tax_refunded', 12, -1)
            oprot.writeDecimal(self.hidden_tax_refunded) if hasattr(oprot, 'writeDecimal') else oprot.writeString(str(self.hidden_tax_refunded))
            oprot.writeFieldEnd()

        if self.is_nominal is not None:
            oprot.writeFieldBegin('is_nominal', 2, -1)
            oprot.writeBool(self.is_nominal)
            oprot.writeFieldEnd()

        if self.is_qty_decimal is not None:
            oprot.writeFieldBegin('is_qty_decimal', 2, -1)
            oprot.writeBool(self.is_qty_decimal)
            oprot.writeFieldEnd()

        if self.is_virtual is not None:
            oprot.writeFieldBegin('is_virtual', 2, -1)
            oprot.writeBool(self.is_virtual)
            oprot.writeFieldEnd()

        if self.item_id is not None:
            oprot.writeFieldBegin('item_id', 8, -1)
            oprot.writeI32(self.item_id)
            oprot.writeFieldEnd()

        if self.locked_do_invoice is not None:
            oprot.writeFieldBegin('locked_do_invoice', 2, -1)
            oprot.writeBool(self.locked_do_invoice)
            oprot.writeFieldEnd()

        if self.locked_do_ship is not None:
            oprot.writeFieldBegin('locked_do_ship', 2, -1)
            oprot.writeBool(self.locked_do_ship)
            oprot.writeFieldEnd()

        oprot.writeFieldBegin('name', 11, -1)
        oprot.writeString(self.name)
        oprot.writeFieldEnd()

        if self.no_discount is not None:
            oprot.writeFieldBegin('no_discount', 2, -1)
            oprot.writeBool(self.no_discount)
            oprot.writeFieldEnd()

        if self.order_id is not None:
            oprot.writeFieldBegin('order_id', 8, -1)
            oprot.writeI32(self.order_id)
            oprot.writeFieldEnd()

        if self.original_price is not None:
            oprot.writeFieldBegin('original_price', 12, -1)
            oprot.writeDecimal(self.original_price) if hasattr(oprot, 'writeDecimal') else oprot.writeString(str(self.original_price))
            oprot.writeFieldEnd()

        if self.parent_item_id is not None:
            oprot.writeFieldBegin('parent_item_id', 8, -1)
            oprot.writeI32(self.parent_item_id)
            oprot.writeFieldEnd()

        if self.price is not None:
            oprot.writeFieldBegin('price', 12, -1)
            oprot.writeDecimal(self.price) if hasattr(oprot, 'writeDecimal') else oprot.writeString(str(self.price))
            oprot.writeFieldEnd()

        if self.price_incl_tax is not None:
            oprot.writeFieldBegin('price_incl_tax', 12, -1)
            oprot.writeDecimal(self.price_incl_tax) if hasattr(oprot, 'writeDecimal') else oprot.writeString(str(self.price_incl_tax))
            oprot.writeFieldEnd()

        if self.product_id is not None:
            oprot.writeFieldBegin('product_id', 8, -1)
            oprot.writeI32(self.product_id)
            oprot.writeFieldEnd()

        oprot.writeFieldBegin('product_type', 11, -1)
        oprot.writeString([attr for attr in dir(yogento.api.models.catalog.product.magento.magento_product_type.MagentoProductType) if getattr(yogento.api.models.catalog.product.magento.magento_product_type.MagentoProductType, attr) == self.product_type][0])
        oprot.writeFieldEnd()

        if self.qty_backordered is not None:
            oprot.writeFieldBegin('qty_backordered', 12, -1)
            oprot.writeDecimal(self.qty_backordered) if hasattr(oprot, 'writeDecimal') else oprot.writeString(str(self.qty_backordered))
            oprot.writeFieldEnd()

        if self.qty_canceled is not None:
            oprot.writeFieldBegin('qty_canceled', 12, -1)
            oprot.writeDecimal(self.qty_canceled) if hasattr(oprot, 'writeDecimal') else oprot.writeString(str(self.qty_canceled))
            oprot.writeFieldEnd()

        if self.qty_invoiced is not None:
            oprot.writeFieldBegin('qty_invoiced', 12, -1)
            oprot.writeDecimal(self.qty_invoiced) if hasattr(oprot, 'writeDecimal') else oprot.writeString(str(self.qty_invoiced))
            oprot.writeFieldEnd()

        if self.qty_ordered is not None:
            oprot.writeFieldBegin('qty_ordered', 12, -1)
            oprot.writeDecimal(self.qty_ordered) if hasattr(oprot, 'writeDecimal') else oprot.writeString(str(self.qty_ordered))
            oprot.writeFieldEnd()

        if self.qty_refunded is not None:
            oprot.writeFieldBegin('qty_refunded', 12, -1)
            oprot.writeDecimal(self.qty_refunded) if hasattr(oprot, 'writeDecimal') else oprot.writeString(str(self.qty_refunded))
            oprot.writeFieldEnd()

        if self.qty_shipped is not None:
            oprot.writeFieldBegin('qty_shipped', 12, -1)
            oprot.writeDecimal(self.qty_shipped) if hasattr(oprot, 'writeDecimal') else oprot.writeString(str(self.qty_shipped))
            oprot.writeFieldEnd()

        if self.quote_item_id is not None:
            oprot.writeFieldBegin('quote_item_id', 8, -1)
            oprot.writeI32(self.quote_item_id)
            oprot.writeFieldEnd()

        if self.row_invoiced is not None:
            oprot.writeFieldBegin('row_invoiced', 12, -1)
            oprot.writeDecimal(self.row_invoiced) if hasattr(oprot, 'writeDecimal') else oprot.writeString(str(self.row_invoiced))
            oprot.writeFieldEnd()

        if self.row_total is not None:
            oprot.writeFieldBegin('row_total', 12, -1)
            oprot.writeDecimal(self.row_total) if hasattr(oprot, 'writeDecimal') else oprot.writeString(str(self.row_total))
            oprot.writeFieldEnd()

        if self.row_total_incl_tax is not None:
            oprot.writeFieldBegin('row_total_incl_tax', 12, -1)
            oprot.writeDecimal(self.row_total_incl_tax) if hasattr(oprot, 'writeDecimal') else oprot.writeString(str(self.row_total_incl_tax))
            oprot.writeFieldEnd()

        if self.row_weight is not None:
            oprot.writeFieldBegin('row_weight', 12, -1)
            oprot.writeDecimal(self.row_weight) if hasattr(oprot, 'writeDecimal') else oprot.writeString(str(self.row_weight))
            oprot.writeFieldEnd()

        oprot.writeFieldBegin('sku', 11, -1)
        oprot.writeString(self.sku)
        oprot.writeFieldEnd()

        if self.store_id is not None:
            oprot.writeFieldBegin('store_id', 8, -1)
            oprot.writeI32(self.store_id)
            oprot.writeFieldEnd()

        if self.tax_amount is not None:
            oprot.writeFieldBegin('tax_amount', 12, -1)
            oprot.writeDecimal(self.tax_amount) if hasattr(oprot, 'writeDecimal') else oprot.writeString(str(self.tax_amount))
            oprot.writeFieldEnd()

        if self.tax_before_discount is not None:
            oprot.writeFieldBegin('tax_before_discount', 12, -1)
            oprot.writeDecimal(self.tax_before_discount) if hasattr(oprot, 'writeDecimal') else oprot.writeString(str(self.tax_before_discount))
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

        oprot.writeFieldBegin('updated_at', 12, -1)
        oprot.writeDateTime(self.updated_at) if hasattr(oprot, 'writeDateTime') else oprot.writeI64(long(mktime(self.updated_at.timetuple())) * 1000l)
        oprot.writeFieldEnd()

        if self.weee_tax_applied_amount is not None:
            oprot.writeFieldBegin('weee_tax_applied_amount', 12, -1)
            oprot.writeDecimal(self.weee_tax_applied_amount) if hasattr(oprot, 'writeDecimal') else oprot.writeString(str(self.weee_tax_applied_amount))
            oprot.writeFieldEnd()

        if self.weee_tax_applied_row_amount is not None:
            oprot.writeFieldBegin('weee_tax_applied_row_amount', 12, -1)
            oprot.writeDecimal(self.weee_tax_applied_row_amount) if hasattr(oprot, 'writeDecimal') else oprot.writeString(str(self.weee_tax_applied_row_amount))
            oprot.writeFieldEnd()

        if self.weee_tax_disposition is not None:
            oprot.writeFieldBegin('weee_tax_disposition', 12, -1)
            oprot.writeDecimal(self.weee_tax_disposition) if hasattr(oprot, 'writeDecimal') else oprot.writeString(str(self.weee_tax_disposition))
            oprot.writeFieldEnd()

        if self.weee_tax_row_disposition is not None:
            oprot.writeFieldBegin('weee_tax_row_disposition', 12, -1)
            oprot.writeDecimal(self.weee_tax_row_disposition) if hasattr(oprot, 'writeDecimal') else oprot.writeString(str(self.weee_tax_row_disposition))
            oprot.writeFieldEnd()

        if self.weight is not None:
            oprot.writeFieldBegin('weight', 12, -1)
            oprot.writeDecimal(self.weight) if hasattr(oprot, 'writeDecimal') else oprot.writeString(str(self.weight))
            oprot.writeFieldEnd()

        oprot.writeFieldStop()

        oprot.writeStructEnd()

        return self
