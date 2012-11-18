from yogento.api.services.sales.no_such_order_exception import \
    NoSuchOrderException
from yogento.client.utils import get_logger
from yogento.cli._command import _Command
from yogento.cli.commands.commands import Commands


class SyncOrders(_Command):
    def add_arguments(self, argument_parser):
        self._add_magento_api_arguments(argument_parser, positional=True, required=True)
        self._add_yogento_api_arguments(argument_parser, positional=True, required=True)

    def __call__(self, **kwds):
        logger = get_logger(self)

        magento_sales_service = self._create_magento_sales_service(**kwds)
        yogento_sales_service = self._create_yogento_sales_service(**kwds)

        magento_order_increment_ids = set(magento_sales_service.get_order_increment_ids())
        yogento_order_increment_ids = set(yogento_sales_service.get_order_increment_ids())

        yogento_extra_order_increment_ids = \
            yogento_order_increment_ids - magento_order_increment_ids
        if len(yogento_extra_order_increment_ids) > 0:
            logger.info(
                "deleting orders [%s] not present in Magento from Yogento",
                ', '.join(tuple(yogento_extra_order_increment_ids))
            )
            for order_increment_id in yogento_extra_order_increment_ids:
                yogento_sales_service.delete_order_by_increment_id(order_increment_id)

        # Process one SKU at a time, to avoid overloading Magento
        for magento_order_increment_id in magento_order_increment_ids:
            logger.info("getting order '%s' from Magento", magento_order_increment_id)
            try:
                magento_order = \
                    magento_sales_service.get_order_by_increment_id(magento_order_increment_id)
            except NoSuchOrderException:
                logger.warning("no such Magento order '%s'", magento_order_increment_id)
                continue

            logger.info(
                "putting order '%s' from Magento to Yogento",
                magento_order_increment_id
            )
            yogento_sales_service.put_order(magento_order)

Commands.register(SyncOrders)
