from yogento.api.services.catalog.no_such_product_exception import \
    NoSuchProductException
from yogento.client.utils import get_logger
from yogento.cli._command import _Command
from yogento.cli.commands.commands import Commands


class SyncProducts(_Command):
    def add_arguments(self, argument_parser):
        self._add_magento_api_arguments(argument_parser, positional=True, required=True)
        self._add_yogento_api_arguments(argument_parser, positional=True, required=True)

    def __call__(self, **kwds):
        logger = get_logger(self)

        magento_catalog_service = self._create_magento_catalog_service(**kwds)
        yogento_catalog_service = self._create_yogento_catalog_service(**kwds)

        magento_skus = set(magento_catalog_service.get_product_skus())
        yogento_skus = set(yogento_catalog_service.get_product_skus())

        yogento_extra_skus = yogento_skus - magento_skus
        if len(yogento_extra_skus) > 0:
            logger.info(
                "deleting products [%s] not present in Magento from Yogento",
                ', '.join(tuple(yogento_extra_skus))
            )
            for sku in yogento_extra_skus:
                yogento_catalog_service.delete_product_by_sku(sku)

        # Process one SKU at a time, to avoid overloading Magento
        for magento_sku in magento_skus:
            logger.info("getting product '%s' from Magento", magento_sku)
            try:
                magento_product = \
                    magento_catalog_service.get_product_by_sku(magento_sku)
            except NoSuchProductException:
                logger.warning("no such Magento product '%s'", magento_sku)
                continue

            logger.info(
                "putting product '%s' from Magento to Yogento",
                magento_sku
            )
            yogento_catalog_service.put_product(magento_product)

Commands.register(SyncProducts)
