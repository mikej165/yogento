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

from collections import Counter
from inspect import ismethod
from yogento.api.services.catalog.no_such_product_exception import \
    NoSuchProductException
from yogento.cli._command import _Command
from yogento.cli.commands.commands import Commands


class AnalyzeCatalog(_Command):
    def add_arguments(self, argument_parser):
        self._add_magento_api_arguments(
            argument_parser,
            positional=True,
            required=True
        )

    def __call__(self, **kwds):
        catalog_service = self._create_magento_catalog_service(**kwds)
        product_skus = catalog_service.get_product_skus()

        product_field_counts = Counter()
        product_i = 0
        for product_sku in product_skus:
            try:
                product = catalog_service.get_product_by_sku(product_sku)
            except KeyboardInterrupt:
                break
            except NoSuchProductException:
                continue
            for attr in dir(product):
                if attr[0] == '_':
                    continue
                value = getattr(product, attr)
                if ismethod(value):
                    continue
                product_field_counts[attr] += 1
            product_i += 1
            print "(%u/%u) %s" % (product_i, len(product_skus), product_sku)

        print product_i
        for field_name in sorted(product_field_counts.iterkeys()):
            count = product_field_counts[field_name]
            if count == product_i:
                print 'required', field_name

Commands.register(AnalyzeCatalog)
