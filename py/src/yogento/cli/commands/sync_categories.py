from yogento.cli._command import _Command
from yogento.cli.commands.commands import Commands


class SyncCategories(_Command):
    def add_arguments(self, argument_parser):
        self._add_magento_api_arguments(argument_parser, positional=True, required=True)
        self._add_yogento_api_arguments(argument_parser, positional=True, required=True)

    def __call__(self, **kwds):
        magento_catalog_service = self._create_magento_catalog_service(**kwds)
        yogento_catalog_service = self._create_yogento_catalog_service(**kwds)

        category_tree = magento_catalog_service.get_category_tree()
        yogento_catalog_service.put_category_tree(category_tree)

Commands.register(SyncCategories)
