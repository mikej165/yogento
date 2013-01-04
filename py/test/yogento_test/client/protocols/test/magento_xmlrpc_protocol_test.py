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

from hamcrest.core import assert_that
from hamcrest.library.object.haslength import has_length
from yogento.api.models.catalog.product.magento.magento_product import \
    MagentoProduct
from yogento.client.protocols.magento_xmlrpc_protocol import \
    MagentoXmlrpcProtocol
import unittest


class MagentoXmlrpcProtocolTest(unittest.TestCase):
    PRODUCTS_XMLRPC = [{'set': '38', 'msrp_enabled': None, 'weight': '3.2000', 'type_id': 'simple', 'color': '24', 'options_container': 'container2', 'small_image_label': None, 'cost': '20.0000', 'thumbnail_label': None, 'minimal_price': '149.9900', 'url_key': 'nokia-2610-phone', 'in_depth': '<ul>\r\n<ul class"disc">\r\n<li>Integrated camera with video recorder to capture those special moments<br></li>\r\n<li>Enriched data connections for complete mobile access via Email, MMS, and MEdia Net<br></li>\r\n<li> Personalize with downloadable MP3 and polyphonic Ring tones, Games, and Graphics<br></li>\r\n<li>Use AIM, Yahoo! and MSN Messenger to stay in touch on the go<br></li>\r\n<li>Mobile Internet browser and email</li>\r\n</ul>', 'sku': 'n2610', 'country_of_manufacture': None, 'custom_layout_update': '', 'msrp_display_actual_price_type': None, 'page_layout': None, 'tax_class_id': '2', 'name': 'Nokia 2610 Phone', 'meta_keyword': 'Nokia 2610, cell, phone, ', 'gift_message_available': '', 'custom_design_to': None, 'tier_price': [], 'activation_information': 'Conditional $250 Equipment Discount Included: Your price paid includes an equipment discount of $250 that has been provided to you in exchange for either activating a new, non-substitute line of service or renewing an existing line of service with AT&T and your agreement that for the 181-day period following such activation or renewal you will: (1) pay your balance due to AT&T each month and otherwise maintain your account in good standing; (2) not disconnect this AT&T line of service; (3) not transfer this equipment to another AT&T line of service; (4) not change your AT&T service rate plan to a lower monthly service rate--this includes canceling or removing required PDA, BlackBerry, or smartphone features after your product has shipped; (5) not use this line of service to replace an existing account with AT&T. If these conditions are not met, you hereby authorize Magento to charge your credit card $250 as reimbursement of this equipment discount without need for further approval.', 'meta_description': 'Offering advanced media and calling features without breaking the bank, The Nokia 2610 is an easy to use', 'type': 'simple', 'status': '1', 'group_price': [], 'meta_title': 'Nokia 2610', 'description': 'The Nokia 2610 is an easy to use device that combines multiple messaging options including email, instant messaging, and more. You can even download MP3 ringtones, graphics, and games straight to the phone, or surf the Internet with Cingular\'s MEdia Net service. It\'s the perfect complement to Cingular service for those even remotely interested in mobile Web capabilities in an affordable handset.<br><br>\r\n\r\n<b>Design</b><br>\r\nCompact and stylish, the 2610 features a candybar design sporting a bright 128 x 128 pixel display capable of displaying over 65,000 colors. Most of the phone\'s features and on-screen menus are controlled by a center toggle on the control pad. A standard hands-free headphone jack is provided, as are volume control keys, and there\'s even a "Go-To" button that can be assigned by the user for quick access to favorite applications. Lastly, the included speakerphone allows you to talk handsfree, and because the phone sports an internal antenna, there\'s nothing to snag or break off.\r\n\r\n', 'news_to_date': None, 'old_id': None, 'price': '149.9900', 'enable_googlecheckout': None, 'news_from_date': None, 'visibility': '4', 'updated_at': '2008-08-08 14:50:04', 'short_description': 'The words "entry level" no longer mean "low-end," especially when it comes to the Nokia 2610. Offering advanced media and calling features without breaking the bank', 'special_price': None, 'recurring_profile': None, 'is_recurring': None, 'url_path': 'nokia-2610-phone.html', 'categories': ['8'], 'manufacturer': '20', 'custom_design_from': None, 'required_options': '0', 'product_id': '16', 'created_at': '2007-08-23 13:03:05', 'websites': ['1'], 'special_to_date': None, 'special_from_date': None, 'model': '2610', 'custom_design': '', 'has_options': '0', 'dimension': '4.1 x 1.7 x 0.7 inches ', 'msrp': None, 'image_label': None}]

    def runTest(self):
        iprot = MagentoXmlrpcProtocol(self.PRODUCTS_XMLRPC)
        products = []
        for _ in xrange(iprot.readListBegin()[1]):
            product = MagentoProduct.read(iprot)
            assert product is not None
            products.append(product)
        iprot.readListEnd()
        assert_that(products, has_length(1))
