#-------------------------------------------------------------------------------
# Copyright (c) 2013, Minor Gordon
# All rights reserved.
#
# Redistribution and use in source and binary forms, with or without
# modification, are permitted provided that the following conditions
# are met:
#
#     * Redistributions of source code must retain the above copyright
#       notice, this list of conditions and the following disclaimer.
#
#     * Redistributions in binary form must reproduce the above copyright
#       notice, this list of conditions and the following disclaimer in
#       the documentation and/or other materials provided with the
#       distribution.
#
# THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND
# CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES,
# INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF
# MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
# DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR
# CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
# SPECIAL, EXEMPLARY, OR CONSEQUENTIAL  DAMAGES (INCLUDING,
# BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
# SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
# INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
# LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
# (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT
# OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY
# OF SUCH DAMAGE.
#-------------------------------------------------------------------------------

from xmlrpclib import Fault
from yogento.api.models.catalog.product.magento.magento_product import \
    MagentoProduct
from yogento.api.models.catalog.product.product import Product
from yogento.api.services.catalog.catalog_service import CatalogService
from yogento.api.services.catalog.no_such_product_exception import \
    NoSuchProductException
from yogento.client.protocols.magento_xmlrpc_protocol import \
    MagentoXmlrpcProtocol
from yogento.client.services._magento_xmlrpc_service import \
    _MagentoXmlrpcService


class MagentoXmlrpcCatalogService(_MagentoXmlrpcService, CatalogService):
    def _get_product_by_sku(self, sku):
        with self._magento_xmlrpc_api_client.login() as magento_api:
            return self.__get_product(magento_api, sku)

    def _get_product_skus(self):
        with self._magento_xmlrpc_api_client.login() as magento_api:
            return tuple([product['sku'] for product in magento_api.catalog_product.list()])

    def _get_products(self):
        with self._magento_xmlrpc_api_client.login() as magento_api:
            products = []
            product_stub_dicts = magento_api.catalog_product.list()
            for product_stub_dict in product_stub_dicts:
                product = \
                    self.__get_product(
                        magento_api,
                        product_stub_dict['product_id']
                    )
                products.append(product)
            return tuple(products)

    def __get_product(self, magento_api, product_id_or_sku):
        try:
            product_dict = magento_api.catalog_product.info(product_id_or_sku)
        except Fault, fault:
            if fault.faultCode == 101:
                raise NoSuchProductException
            else:
                raise

        try:
            product_media_list = \
                magento_api.catalog_product_media.list(product_dict['product_id'])
            assert not 'images' in product_dict
            product_dict['images'] = product_media_list
        except Fault, fault:
            pass

        try:
            product_tags = \
                magento_api.catalog_product_tag.list(product_dict['product_id'])
            if isinstance(product_tags, dict):
                assert not 'tags' in product_dict
                product_dict['tags'] = [tag['name']
                                        for tag in product_tags.itervalues()]
        except Fault, fault:
            pass

        product = Product(MagentoProduct.read(MagentoXmlrpcProtocol(product_dict)))

        return product

    def _head_product_by_sku(self, sku):
        try:
            self._get_product_by_sku(sku)
            return True
        except NoSuchProductException:
            return False

    def _put_orders(self, orders):
        for order in orders:
            self._put_order(order)
