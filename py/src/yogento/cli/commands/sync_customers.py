from yogento.api.services.customer.no_such_customer_exception import \
    NoSuchCustomerException
from yogento.client.utils import get_logger
from yogento.cli._command import _Command
from yogento.cli.commands.commands import Commands


class SyncCustomers(_Command):
    def add_arguments(self, argument_parser):
        self._add_magento_api_arguments(argument_parser, positional=True, required=True)
        self._add_yogento_api_arguments(argument_parser, positional=True, required=True)

    def __call__(self, **kwds):
        logger = get_logger(self)

        magento_customer_service = self._create_magento_customer_service(**kwds)
        yogento_customer_service = self._create_yogento_customer_service(**kwds)

        magento_increment_ids = set(magento_customer_service.get_customer_increment_ids())
        yogento_increment_ids = set(yogento_customer_service.get_customer_increment_ids())

        yogento_extra_increment_ids = yogento_increment_ids - magento_increment_ids
        if len(yogento_extra_increment_ids) > 0:
            logger.info(
                "deleting customers [%s] not present in Magento from Yogento",
                ', '.join(tuple(yogento_extra_increment_ids))
            )
            for increment_id in yogento_extra_increment_ids:
                yogento_customer_service.delete_customer_by_increment_id(increment_id)

        # Process one SKU at a time, to avoid overloading Magento
        for magento_increment_id in magento_increment_ids:
            logger.info("getting customer '%s' from Magento", magento_increment_id)
            try:
                magento_customer = \
                    magento_customer_service.get_customer_by_increment_id(magento_increment_id)
            except NoSuchCustomerException:
                logger.warning("no such Magento customer '%s'", magento_increment_id)
                continue

            logger.info(
                "putting customer '%s' from Magento to Yogento",
                magento_increment_id
            )
            yogento_customer_service.put_customer(magento_customer)

Commands.register(SyncCustomers)
