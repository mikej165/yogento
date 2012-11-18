from yogento.client.services.catalog.impl.magento_xmlrpc_catalog_service import \
    MagentoXmlrpcCatalogService
from yogento.client.services.catalog.impl.yogento_rest_catalog_service import \
    YogentoRestCatalogService
from yogento.client.services.customer.impl.magento_xmlrpc_customer_service import \
    MagentoXmlrpcCustomerService
from yogento.client.services.customer.impl.yogento_rest_customer_service import \
    YogentoRestCustomerService
from yogento.client.services.sales.impl.magento_xmlrpc_sales_service import \
    MagentoXmlrpcSalesService
from yogento.client.services.sales.impl.yogento_rest_sales_service import \
    YogentoRestSalesService
import yogento.client._command


class _Command(yogento.client._command._Command):
    def _add_magento_api_arguments(self, argument_parser, positional, required):
        help = 'base URL of Magento\'s APIs (e.g., http://example.com/magento/index.php/api/)'
        if positional:
            assert required
            argument_parser.add_argument(
                'magento_api_url',
                help=help,
                nargs=1
            )
        else:
            argument_parser.add_argument(
                '--magento-api-url',
                help=help,
                required=required
            )

    def _add_yogento_api_arguments(self, argument_parser, positional, required):
        help = \
            'base URL of Yogento\'s APIs (e.g., http://example.com/yogento/api/'
        if positional:
            assert required
            argument_parser.add_argument(
                'yogento_api_url',
                help=help,
                nargs=1
            )
        else:
            argument_parser.add_argument(
                '--yogento-api-url',
                help=help,
                required=required
            )

    def _create_catalog_service(self, **kwds):
        if 'magento_api_url' in kwds:
            return self._create_magento_catalog_service(**kwds)
        elif 'yogento_api_url' in kwds:
            return self._create_magento_catalog_service(**kwds)
        else:
            raise RuntimeError('must specify either magento_api_url or yogento_api_url')

    def _create_magento_catalog_service(self, magento_api_url, **kwds):
        if isinstance(magento_api_url, list):
            magento_api_url = magento_api_url[0]
        return MagentoXmlrpcCatalogService(magento_api_url)

    def _create_magento_customer_service(self, magento_api_url, **kwds):
        if isinstance(magento_api_url, list):
            magento_api_url = magento_api_url[0]
        return MagentoXmlrpcCustomerService(magento_api_url)

    def _create_magento_sales_service(self, magento_api_url, **kwds):
        if isinstance(magento_api_url, list):
            magento_api_url = magento_api_url[0]
        return MagentoXmlrpcSalesService(magento_api_url)

    def _create_sales_service(self, **kwds):
        if 'magento_api_url' in kwds:
            return self._create_magento_sales_service(**kwds)
        elif 'yogento_api_url' in kwds:
            return self._create_magento_sales_service(**kwds)
        else:
            raise RuntimeError('must specify either magento_api_url or yogento_api_url')

    def _create_yogento_catalog_service(self, yogento_api_url, **kwds):
        if isinstance(yogento_api_url, list):
            yogento_api_url = yogento_api_url[0]
        return YogentoRestCatalogService(yogento_api_url)

    def _create_yogento_customer_service(self, yogento_api_url, **kwds):
        if isinstance(yogento_api_url, list):
            yogento_api_url = yogento_api_url[0]
        return YogentoRestCustomerService(yogento_api_url)

    def _create_yogento_sales_service(self, yogento_api_url, **kwds):
        if isinstance(yogento_api_url, list):
            yogento_api_url = yogento_api_url[0]
        return YogentoRestSalesService(yogento_api_url)
