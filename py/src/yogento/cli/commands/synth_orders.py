from datetime import datetime
from decimal import Decimal
from yogento.api.models.catalog.product.magento.magento_product import \
    MagentoProduct
from yogento.api.models.sales.order.magento.magento_order import MagentoOrder
from yogento.api.models.sales.order.magento.magento_order_address import \
    MagentoOrderAddress
from yogento.api.models.sales.order.magento.magento_order_address_type import \
    MagentoOrderAddressType
from yogento.api.models.sales.order.magento.magento_order_item import \
    MagentoOrderItem
from yogento.api.models.sales.order.magento.magento_order_status import \
    MagentoOrderStatus
from yogento.api.models.sales.order.magento.magento_order_status_history import \
    MagentoOrderStatusHistory
from yogento.cli._command import _Command
from yogento.cli.commands.commands import Commands
from yogento.client.utils import get_logger


class SynthOrders(_Command):
    def add_arguments(self, argument_parser):
        self._add_magento_api_arguments(argument_parser, positional=False, required=False)
        self._add_yogento_api_arguments(argument_parser, positional=False, required=False)

    def __call__(self, **kwds):
        logger = get_logger(self)

        catalog_service = self._create_catalog_service(**kwds)
        sales_service = self._create_sales_service(**kwds)

        customer_email = 'john.doe@example.com'
        customer_firstname = 'John'
        customer_lastname = 'Doe'
        addresses = [
            MagentoOrderAddress(
                type_,
                city='New York',
                company='NA',
                country_id='US',
                firstname=customer_firstname,
                lastname=customer_lastname,
                postcode='10001',
                region='NY',
                street='Some street address',
                telephone='(000) 0000 - 0000'
            )
            for type_ in (MagentoOrderAddressType.BILLING, MagentoOrderAddressType.SHIPPING)
        ]
        billing_address, shipping_address = addresses
        decimal_0 = Decimal('0.0')
        decimal_1 = Decimal('1.0')
        decimal_15 = Decimal('15.0')

        order_i = 1
        for product_sku in catalog_service.get_product_skus():
            product = catalog_service.get_product_by_sku(product_sku)
            if product.price is None:
                continue
            assert isinstance(product, MagentoProduct)

            created_at_date = updated_at_date = datetime.now()

            order = \
                MagentoOrder(
                    base_currency_code='USD',
                    base_discount_amount=decimal_0,
                    base_grand_total=product.price,
                    base_hidden_tax_amount=decimal_0,
                    base_shipping_amount=decimal_15,
                    base_shipping_discount_amount=decimal_0,
                    base_shipping_hidden_tax_amnt=decimal_0,
                    base_shipping_hidden_tax_amount=decimal_0,
                    base_shipping_incl_tax=decimal_15,
                    base_shipping_tax_amount=decimal_15,
                    base_subtotal=product.price,
                    base_subtotal_incl_tax=product.price,
                    base_tax_amount=decimal_0,
                    base_to_global_rate=decimal_1,
                    base_to_order_rate=decimal_1,
                    billing_address=billing_address,
                    created_at=created_at_date,
                    customer_email=customer_email,
                    customer_firstname=customer_firstname,
                    customer_is_guest=False,
                    customer_lastname=customer_lastname,
                    customer_note_notify=False,
                    discount_amount=decimal_0,
                    grand_total=product.price,
                    hidden_tax_amount=decimal_0,
                    increment_id=str(100000000 + order_i),
                    is_virtual=False,
                    items=(
                        MagentoOrderItem(
                            amount_refunded=decimal_0,
                            base_amount_refunded=decimal_0,
                            base_discount_amount=decimal_0,
                            base_discount_invoiced=decimal_0,
                            base_original_price=product.price,
                            base_price=product.price,
                            base_price_incl_tax=product.price,
                            base_row_total=product.price,
                            base_row_total_incl_tax=product.price,
                            base_tax_amount=decimal_0,
                            base_tax_invoiced=decimal_0,
                            base_weee_tax_applied_amount=decimal_0,
                            base_weee_tax_applied_row_amnt=decimal_0,
                            base_weee_tax_applied_row_amount=decimal_0,
                            base_weee_tax_disposition=decimal_0,
                            base_weee_tax_row_disposition=decimal_0,
                            created_at=created_at_date,
                            discount_amount=decimal_0,
                            discount_invoiced=decimal_0,
                            discount_percent=decimal_0,
                            free_shipping=False,
                            has_children=True,
                            is_nominal=False,
                            is_qty_decimal=False,
                            is_virtual=False,
                            name=product.name,
                            no_discount=False,
                            original_price=product.price,
                            price=product.price,
                            price_incl_tax=product.price,
                            product_type=product.type,
                            qty_canceled=decimal_0,
                            qty_invoiced=decimal_0,
                            qty_ordered=decimal_1,
                            qty_refunded=decimal_0,
                            qty_shipped=decimal_0,
                            row_invoiced=decimal_0,
                            row_total=product.price,
                            row_total_incl_tax=product.price,
                            row_weight=product.weight,
                            sku=product.sku,
                            tax_amount=decimal_0,
                            tax_invoiced=decimal_0,
                            tax_percent=decimal_0,
                            updated_at=updated_at_date,
                            weee_tax_applied_amount=decimal_0,
                            weee_tax_applied_row_amount=decimal_0,
                            weee_tax_disposition=decimal_0,
                            weee_tax_row_disposition=decimal_0,
                            weight=product.weight
                        ),
                    ),
                    order_currency_code='USD',
                    shipping_address=shipping_address,
                    shipping_amount=decimal_15,
                    shipping_description='Flat Rate - Fixed',
                    shipping_discount_amount=decimal_0,
                    shipping_hidden_tax_amount=decimal_0,
                    shipping_incl_tax=decimal_15,
                    shipping_method='flatrate_flatrate',
                    shipping_tax_amount=decimal_0,
                    state='new',
                    status=MagentoOrderStatus.PENDING,
                    status_history=(
                        MagentoOrderStatusHistory(
                            comment='Some comments',
                            created_at=created_at_date,
                            status=MagentoOrderStatus.PENDING,
                        ),
                    ),
                    store_currency_code='USD',
                    store_to_base_rate=decimal_1,
                    store_to_order_rate=decimal_1,
                    subtotal=product.price,
                    subtotal_incl_tax=product.price,
                    tax_amount=decimal_0,
                    total_item_count=decimal_1,
                    total_qty_ordered=decimal_1,
                    updated_at=updated_at_date,
                    weight=product.weight
                )

            logger.info("putting order %s to Yogento", order.increment_id)

            sales_service.put_order(order)

            order_i += 1

Commands.register(SynthOrders)
