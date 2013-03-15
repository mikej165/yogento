from __future__ import absolute_import; import decimal
from datetime import datetime
from itertools import ifilterfalse
from time import mktime
import __builtin__
import yogento.api.models.catalog.product.magento.magento_product_image
import yogento.api.models.catalog.product.magento.magento_product_status
import yogento.api.models.catalog.product.magento.magento_product_type


class MagentoProduct(object):
    class Builder:
        def __init__(
            self,
            name,
            short_description,
            sku,
            store,
            url_key,
            visibility,
            activation_information=None,
            backorders=None,
            cost=None,
            created_at=None,
            description=None,
            images=None,
            is_in_stock=None,
            is_qty_decimal=None,
            is_recurring=None,
            low_stock_date=None,
            max_sale_qty=None,
            meta_description=None,
            meta_keyword=None,
            meta_title=None,
            minimal_price=None,
            min_qty=None,
            min_sale_qty=None,
            model=None,
            news_from_date=None,
            news_to_date=None,
            notify_stock_qty=None,
            price=None,
            qty=None,
            shipping_policy=None,
            special_from_date=None,
            special_price=None,
            special_to_date=None,
            status=None,
            tags=None,
            type=None,
            updated_at=None,
            url_path=None,
            weight=None
        ):
            self.__activation_information = activation_information
            self.__backorders = backorders
            self.__cost = cost
            self.__created_at = created_at
            self.__description = description
            self.__images = images
            self.__is_in_stock = is_in_stock
            self.__is_qty_decimal = is_qty_decimal
            self.__is_recurring = is_recurring
            self.__low_stock_date = low_stock_date
            self.__max_sale_qty = max_sale_qty
            self.__meta_description = meta_description
            self.__meta_keyword = meta_keyword
            self.__meta_title = meta_title
            self.__minimal_price = minimal_price
            self.__min_qty = min_qty
            self.__min_sale_qty = min_sale_qty
            self.__model = model
            self.__name = name
            self.__news_from_date = news_from_date
            self.__news_to_date = news_to_date
            self.__notify_stock_qty = notify_stock_qty
            self.__price = price
            self.__qty = qty
            self.__shipping_policy = shipping_policy
            self.__short_description = short_description
            self.__sku = sku
            self.__special_from_date = special_from_date
            self.__special_price = special_price
            self.__special_to_date = special_to_date
            self.__store = store
            self.__status = status
            self.__tags = tags
            self.__type = type
            self.__updated_at = updated_at
            self.__url_key = url_key
            self.__url_path = url_path
            self.__visibility = visibility
            self.__weight = weight

        def build(self):
            return MagentoProduct(activation_information=self.__activation_information, backorders=self.__backorders, cost=self.__cost, created_at=self.__created_at, description=self.__description, images=self.__images, is_in_stock=self.__is_in_stock, is_qty_decimal=self.__is_qty_decimal, is_recurring=self.__is_recurring, low_stock_date=self.__low_stock_date, max_sale_qty=self.__max_sale_qty, meta_description=self.__meta_description, meta_keyword=self.__meta_keyword, meta_title=self.__meta_title, minimal_price=self.__minimal_price, min_qty=self.__min_qty, min_sale_qty=self.__min_sale_qty, model=self.__model, name=self.__name, news_from_date=self.__news_from_date, news_to_date=self.__news_to_date, notify_stock_qty=self.__notify_stock_qty, price=self.__price, qty=self.__qty, shipping_policy=self.__shipping_policy, short_description=self.__short_description, sku=self.__sku, special_from_date=self.__special_from_date, special_price=self.__special_price, special_to_date=self.__special_to_date, store=self.__store, status=self.__status, tags=self.__tags, type=self.__type, updated_at=self.__updated_at, url_key=self.__url_key, url_path=self.__url_path, visibility=self.__visibility, weight=self.__weight)

        def set_activation_information(self, activation_information):
            self.__activation_information = activation_information
            return self

        def set_backorders(self, backorders):
            self.__backorders = backorders
            return self

        def set_cost(self, cost):
            self.__cost = cost
            return self

        def set_created_at(self, created_at):
            self.__created_at = created_at
            return self

        def set_description(self, description):
            self.__description = description
            return self

        def set_images(self, images):
            self.__images = images
            return self

        def set_is_in_stock(self, is_in_stock):
            self.__is_in_stock = is_in_stock
            return self

        def set_is_qty_decimal(self, is_qty_decimal):
            self.__is_qty_decimal = is_qty_decimal
            return self

        def set_is_recurring(self, is_recurring):
            self.__is_recurring = is_recurring
            return self

        def set_low_stock_date(self, low_stock_date):
            self.__low_stock_date = low_stock_date
            return self

        def set_max_sale_qty(self, max_sale_qty):
            self.__max_sale_qty = max_sale_qty
            return self

        def set_meta_description(self, meta_description):
            self.__meta_description = meta_description
            return self

        def set_meta_keyword(self, meta_keyword):
            self.__meta_keyword = meta_keyword
            return self

        def set_meta_title(self, meta_title):
            self.__meta_title = meta_title
            return self

        def set_min_qty(self, min_qty):
            self.__min_qty = min_qty
            return self

        def set_min_sale_qty(self, min_sale_qty):
            self.__min_sale_qty = min_sale_qty
            return self

        def set_minimal_price(self, minimal_price):
            self.__minimal_price = minimal_price
            return self

        def set_model(self, model):
            self.__model = model
            return self

        def set_name(self, name):
            self.__name = name
            return self

        def set_news_from_date(self, news_from_date):
            self.__news_from_date = news_from_date
            return self

        def set_news_to_date(self, news_to_date):
            self.__news_to_date = news_to_date
            return self

        def set_notify_stock_qty(self, notify_stock_qty):
            self.__notify_stock_qty = notify_stock_qty
            return self

        def set_price(self, price):
            self.__price = price
            return self

        def set_qty(self, qty):
            self.__qty = qty
            return self

        def set_shipping_policy(self, shipping_policy):
            self.__shipping_policy = shipping_policy
            return self

        def set_short_description(self, short_description):
            self.__short_description = short_description
            return self

        def set_sku(self, sku):
            self.__sku = sku
            return self

        def set_special_from_date(self, special_from_date):
            self.__special_from_date = special_from_date
            return self

        def set_special_price(self, special_price):
            self.__special_price = special_price
            return self

        def set_special_to_date(self, special_to_date):
            self.__special_to_date = special_to_date
            return self

        def set_status(self, status):
            self.__status = status
            return self

        def set_store(self, store):
            self.__store = store
            return self

        def set_tags(self, tags):
            self.__tags = tags
            return self

        def set_type(self, type):
            self.__type = type
            return self

        def set_updated_at(self, updated_at):
            self.__updated_at = updated_at
            return self

        def set_url_key(self, url_key):
            self.__url_key = url_key
            return self

        def set_url_path(self, url_path):
            self.__url_path = url_path
            return self

        def set_visibility(self, visibility):
            self.__visibility = visibility
            return self

        def set_weight(self, weight):
            self.__weight = weight
            return self

        def update(self, magento_product):
            if isinstance(magento_product, MagentoProduct):
                self.set_activation_information(magento_product.activation_information)
                self.set_backorders(magento_product.backorders)
                self.set_cost(magento_product.cost)
                self.set_created_at(magento_product.created_at)
                self.set_description(magento_product.description)
                self.set_images(magento_product.images)
                self.set_is_in_stock(magento_product.is_in_stock)
                self.set_is_qty_decimal(magento_product.is_qty_decimal)
                self.set_is_recurring(magento_product.is_recurring)
                self.set_low_stock_date(magento_product.low_stock_date)
                self.set_max_sale_qty(magento_product.max_sale_qty)
                self.set_meta_description(magento_product.meta_description)
                self.set_meta_keyword(magento_product.meta_keyword)
                self.set_meta_title(magento_product.meta_title)
                self.set_minimal_price(magento_product.minimal_price)
                self.set_min_qty(magento_product.min_qty)
                self.set_min_sale_qty(magento_product.min_sale_qty)
                self.set_model(magento_product.model)
                self.set_name(magento_product.name)
                self.set_news_from_date(magento_product.news_from_date)
                self.set_news_to_date(magento_product.news_to_date)
                self.set_notify_stock_qty(magento_product.notify_stock_qty)
                self.set_price(magento_product.price)
                self.set_qty(magento_product.qty)
                self.set_shipping_policy(magento_product.shipping_policy)
                self.set_short_description(magento_product.short_description)
                self.set_sku(magento_product.sku)
                self.set_special_from_date(magento_product.special_from_date)
                self.set_special_price(magento_product.special_price)
                self.set_special_to_date(magento_product.special_to_date)
                self.set_store(magento_product.store)
                self.set_status(magento_product.status)
                self.set_tags(magento_product.tags)
                self.set_type(magento_product.type)
                self.set_updated_at(magento_product.updated_at)
                self.set_url_key(magento_product.url_key)
                self.set_url_path(magento_product.url_path)
                self.set_visibility(magento_product.visibility)
                self.set_weight(magento_product.weight)
            elif isinstance(magento_product, dict):
                for key, value in magento_product.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(magento_product)
            return self

    def __init__(
        self,
        name,
        short_description,
        sku,
        store,
        url_key,
        visibility,
        activation_information=None,
        backorders=None,
        cost=None,
        created_at=None,
        description=None,
        images=None,
        is_in_stock=None,
        is_qty_decimal=None,
        is_recurring=None,
        low_stock_date=None,
        max_sale_qty=None,
        meta_description=None,
        meta_keyword=None,
        meta_title=None,
        minimal_price=None,
        min_qty=None,
        min_sale_qty=None,
        model=None,
        news_from_date=None,
        news_to_date=None,
        notify_stock_qty=None,
        price=None,
        qty=None,
        shipping_policy=None,
        special_from_date=None,
        special_price=None,
        special_to_date=None,
        status=None,
        tags=None,
        type=None,
        updated_at=None,
        url_path=None,
        weight=None
    ):
        if activation_information is not None:
            if not isinstance(activation_information, basestring):
                raise TypeError(getattr(__builtin__, 'type')(activation_information))
        self.__activation_information = activation_information

        if backorders is not None:
            if not isinstance(backorders, int):
                raise TypeError(getattr(__builtin__, 'type')(backorders))
        self.__backorders = backorders

        if cost is not None:
            if not isinstance(cost, decimal.Decimal):
                raise TypeError(getattr(__builtin__, 'type')(cost))
        self.__cost = cost

        if created_at is not None:
            if not isinstance(created_at, datetime):
                raise TypeError(getattr(__builtin__, 'type')(created_at))
        self.__created_at = created_at

        if description is not None:
            if not isinstance(description, basestring):
                raise TypeError(getattr(__builtin__, 'type')(description))
        self.__description = description

        if images is not None:
            if not (isinstance(images, frozenset) and len(list(ifilterfalse(lambda _: isinstance(_, yogento.api.models.catalog.product.magento.magento_product_image.MagentoProductImage), images))) == 0):
                raise TypeError(getattr(__builtin__, 'type')(images))
        self.__images = images

        if is_in_stock is not None:
            if not isinstance(is_in_stock, bool):
                raise TypeError(getattr(__builtin__, 'type')(is_in_stock))
        self.__is_in_stock = is_in_stock

        if is_qty_decimal is not None:
            if not isinstance(is_qty_decimal, bool):
                raise TypeError(getattr(__builtin__, 'type')(is_qty_decimal))
        self.__is_qty_decimal = is_qty_decimal

        if is_recurring is not None:
            if not isinstance(is_recurring, bool):
                raise TypeError(getattr(__builtin__, 'type')(is_recurring))
        self.__is_recurring = is_recurring

        if low_stock_date is not None:
            if not isinstance(low_stock_date, datetime):
                raise TypeError(getattr(__builtin__, 'type')(low_stock_date))
        self.__low_stock_date = low_stock_date

        if max_sale_qty is not None:
            if not isinstance(max_sale_qty, decimal.Decimal):
                raise TypeError(getattr(__builtin__, 'type')(max_sale_qty))
        self.__max_sale_qty = max_sale_qty

        if meta_description is not None:
            if not isinstance(meta_description, basestring):
                raise TypeError(getattr(__builtin__, 'type')(meta_description))
        self.__meta_description = meta_description

        if meta_keyword is not None:
            if not isinstance(meta_keyword, basestring):
                raise TypeError(getattr(__builtin__, 'type')(meta_keyword))
        self.__meta_keyword = meta_keyword

        if meta_title is not None:
            if not isinstance(meta_title, basestring):
                raise TypeError(getattr(__builtin__, 'type')(meta_title))
        self.__meta_title = meta_title

        if minimal_price is not None:
            if not isinstance(minimal_price, decimal.Decimal):
                raise TypeError(getattr(__builtin__, 'type')(minimal_price))
        self.__minimal_price = minimal_price

        if min_qty is not None:
            if not isinstance(min_qty, decimal.Decimal):
                raise TypeError(getattr(__builtin__, 'type')(min_qty))
        self.__min_qty = min_qty

        if min_sale_qty is not None:
            if not isinstance(min_sale_qty, decimal.Decimal):
                raise TypeError(getattr(__builtin__, 'type')(min_sale_qty))
        self.__min_sale_qty = min_sale_qty

        if model is not None:
            if not isinstance(model, basestring):
                raise TypeError(getattr(__builtin__, 'type')(model))
        self.__model = model

        if name is None:
            raise ValueError('name is required')
        if not isinstance(name, basestring):
            raise TypeError(getattr(__builtin__, 'type')(name))
        self.__name = name

        if news_from_date is not None:
            if not isinstance(news_from_date, datetime):
                raise TypeError(getattr(__builtin__, 'type')(news_from_date))
        self.__news_from_date = news_from_date

        if news_to_date is not None:
            if not isinstance(news_to_date, datetime):
                raise TypeError(getattr(__builtin__, 'type')(news_to_date))
        self.__news_to_date = news_to_date

        if notify_stock_qty is not None:
            if not isinstance(notify_stock_qty, decimal.Decimal):
                raise TypeError(getattr(__builtin__, 'type')(notify_stock_qty))
        self.__notify_stock_qty = notify_stock_qty

        if price is not None:
            if not isinstance(price, decimal.Decimal):
                raise TypeError(getattr(__builtin__, 'type')(price))
        self.__price = price

        if qty is not None:
            if not isinstance(qty, decimal.Decimal):
                raise TypeError(getattr(__builtin__, 'type')(qty))
        self.__qty = qty

        if shipping_policy is not None:
            if not isinstance(shipping_policy, basestring):
                raise TypeError(getattr(__builtin__, 'type')(shipping_policy))
        self.__shipping_policy = shipping_policy

        if short_description is None:
            raise ValueError('short_description is required')
        if not isinstance(short_description, basestring):
            raise TypeError(getattr(__builtin__, 'type')(short_description))
        self.__short_description = short_description

        if sku is None:
            raise ValueError('sku is required')
        if not isinstance(sku, basestring):
            raise TypeError(getattr(__builtin__, 'type')(sku))
        self.__sku = sku

        if special_from_date is not None:
            if not isinstance(special_from_date, datetime):
                raise TypeError(getattr(__builtin__, 'type')(special_from_date))
        self.__special_from_date = special_from_date

        if special_price is not None:
            if not isinstance(special_price, decimal.Decimal):
                raise TypeError(getattr(__builtin__, 'type')(special_price))
        self.__special_price = special_price

        if special_to_date is not None:
            if not isinstance(special_to_date, datetime):
                raise TypeError(getattr(__builtin__, 'type')(special_to_date))
        self.__special_to_date = special_to_date

        if store is None:
            raise ValueError('store is required')
        if not isinstance(store, basestring):
            raise TypeError(getattr(__builtin__, 'type')(store))
        self.__store = store

        if status is not None:
            if not isinstance(status, yogento.api.models.catalog.product.magento.magento_product_status.MagentoProductStatus):
                raise TypeError(getattr(__builtin__, 'type')(status))
        self.__status = status

        if tags is not None:
            if not (isinstance(tags, frozenset) and len(list(ifilterfalse(lambda _: isinstance(_, basestring), tags))) == 0):
                raise TypeError(getattr(__builtin__, 'type')(tags))
        self.__tags = tags

        if type is not None:
            if not isinstance(type, yogento.api.models.catalog.product.magento.magento_product_type.MagentoProductType):
                raise TypeError(getattr(__builtin__, 'type')(type))
        self.__type = type

        if updated_at is not None:
            if not isinstance(updated_at, datetime):
                raise TypeError(getattr(__builtin__, 'type')(updated_at))
        self.__updated_at = updated_at

        if url_key is None:
            raise ValueError('url_key is required')
        if not isinstance(url_key, basestring):
            raise TypeError(getattr(__builtin__, 'type')(url_key))
        self.__url_key = url_key

        if url_path is not None:
            if not isinstance(url_path, basestring):
                raise TypeError(getattr(__builtin__, 'type')(url_path))
        self.__url_path = url_path

        if visibility is None:
            raise ValueError('visibility is required')
        if not (isinstance(visibility, frozenset) and len(list(ifilterfalse(lambda _: isinstance(_, basestring), visibility))) == 0):
            raise TypeError(getattr(__builtin__, 'type')(visibility))
        self.__visibility = visibility

        if weight is not None:
            if not isinstance(weight, decimal.Decimal):
                raise TypeError(getattr(__builtin__, 'type')(weight))
        self.__weight = weight

    def __eq__(self, other):
        if self.activation_information != other.activation_information:
            return False
        if self.backorders != other.backorders:
            return False
        if self.cost != other.cost:
            return False
        if self.created_at != other.created_at:
            return False
        if self.description != other.description:
            return False
        if self.images != other.images:
            return False
        if self.is_in_stock != other.is_in_stock:
            return False
        if self.is_qty_decimal != other.is_qty_decimal:
            return False
        if self.is_recurring != other.is_recurring:
            return False
        if self.low_stock_date != other.low_stock_date:
            return False
        if self.max_sale_qty != other.max_sale_qty:
            return False
        if self.meta_description != other.meta_description:
            return False
        if self.meta_keyword != other.meta_keyword:
            return False
        if self.meta_title != other.meta_title:
            return False
        if self.minimal_price != other.minimal_price:
            return False
        if self.min_qty != other.min_qty:
            return False
        if self.min_sale_qty != other.min_sale_qty:
            return False
        if self.model != other.model:
            return False
        if self.name != other.name:
            return False
        if self.news_from_date != other.news_from_date:
            return False
        if self.news_to_date != other.news_to_date:
            return False
        if self.notify_stock_qty != other.notify_stock_qty:
            return False
        if self.price != other.price:
            return False
        if self.qty != other.qty:
            return False
        if self.shipping_policy != other.shipping_policy:
            return False
        if self.short_description != other.short_description:
            return False
        if self.sku != other.sku:
            return False
        if self.special_from_date != other.special_from_date:
            return False
        if self.special_price != other.special_price:
            return False
        if self.special_to_date != other.special_to_date:
            return False
        if self.store != other.store:
            return False
        if self.status != other.status:
            return False
        if self.tags != other.tags:
            return False
        if self.type != other.type:
            return False
        if self.updated_at != other.updated_at:
            return False
        if self.url_key != other.url_key:
            return False
        if self.url_path != other.url_path:
            return False
        if self.visibility != other.visibility:
            return False
        if self.weight != other.weight:
            return False
        return True

    def __hash__(self):
        return hash((self.activation_information,self.backorders,self.cost,self.created_at,self.description,self.images,self.is_in_stock,self.is_qty_decimal,self.is_recurring,self.low_stock_date,self.max_sale_qty,self.meta_description,self.meta_keyword,self.meta_title,self.minimal_price,self.min_qty,self.min_sale_qty,self.model,self.name,self.news_from_date,self.news_to_date,self.notify_stock_qty,self.price,self.qty,self.shipping_policy,self.short_description,self.sku,self.special_from_date,self.special_price,self.special_to_date,self.store,self.status,self.tags,self.type,self.updated_at,self.url_key,self.url_path,self.visibility,self.weight,))

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        if self.activation_information is not None:
            field_reprs.append('activation_information=' + "'" + self.activation_information.encode('ascii', 'replace') + "'")
        if self.backorders is not None:
            field_reprs.append('backorders=' + repr(self.backorders))
        if self.cost is not None:
            field_reprs.append('cost=' + repr(self.cost))
        if self.created_at is not None:
            field_reprs.append('created_at=' + repr(self.created_at))
        if self.description is not None:
            field_reprs.append('description=' + "'" + self.description.encode('ascii', 'replace') + "'")
        if self.images is not None:
            field_reprs.append('images=' + repr(self.images))
        if self.is_in_stock is not None:
            field_reprs.append('is_in_stock=' + repr(self.is_in_stock))
        if self.is_qty_decimal is not None:
            field_reprs.append('is_qty_decimal=' + repr(self.is_qty_decimal))
        if self.is_recurring is not None:
            field_reprs.append('is_recurring=' + repr(self.is_recurring))
        if self.low_stock_date is not None:
            field_reprs.append('low_stock_date=' + repr(self.low_stock_date))
        if self.max_sale_qty is not None:
            field_reprs.append('max_sale_qty=' + repr(self.max_sale_qty))
        if self.meta_description is not None:
            field_reprs.append('meta_description=' + "'" + self.meta_description.encode('ascii', 'replace') + "'")
        if self.meta_keyword is not None:
            field_reprs.append('meta_keyword=' + "'" + self.meta_keyword.encode('ascii', 'replace') + "'")
        if self.meta_title is not None:
            field_reprs.append('meta_title=' + "'" + self.meta_title.encode('ascii', 'replace') + "'")
        if self.minimal_price is not None:
            field_reprs.append('minimal_price=' + repr(self.minimal_price))
        if self.min_qty is not None:
            field_reprs.append('min_qty=' + repr(self.min_qty))
        if self.min_sale_qty is not None:
            field_reprs.append('min_sale_qty=' + repr(self.min_sale_qty))
        if self.model is not None:
            field_reprs.append('model=' + "'" + self.model.encode('ascii', 'replace') + "'")
        field_reprs.append('name=' + "'" + self.name.encode('ascii', 'replace') + "'")
        if self.news_from_date is not None:
            field_reprs.append('news_from_date=' + repr(self.news_from_date))
        if self.news_to_date is not None:
            field_reprs.append('news_to_date=' + repr(self.news_to_date))
        if self.notify_stock_qty is not None:
            field_reprs.append('notify_stock_qty=' + repr(self.notify_stock_qty))
        if self.price is not None:
            field_reprs.append('price=' + repr(self.price))
        if self.qty is not None:
            field_reprs.append('qty=' + repr(self.qty))
        if self.shipping_policy is not None:
            field_reprs.append('shipping_policy=' + "'" + self.shipping_policy.encode('ascii', 'replace') + "'")
        field_reprs.append('short_description=' + "'" + self.short_description.encode('ascii', 'replace') + "'")
        field_reprs.append('sku=' + "'" + self.sku.encode('ascii', 'replace') + "'")
        if self.special_from_date is not None:
            field_reprs.append('special_from_date=' + repr(self.special_from_date))
        if self.special_price is not None:
            field_reprs.append('special_price=' + repr(self.special_price))
        if self.special_to_date is not None:
            field_reprs.append('special_to_date=' + repr(self.special_to_date))
        field_reprs.append('store=' + "'" + self.store.encode('ascii', 'replace') + "'")
        if self.status is not None:
            field_reprs.append('status=' + repr(self.status))
        if self.tags is not None:
            field_reprs.append('tags=' + repr(self.tags))
        if self.type is not None:
            field_reprs.append('type=' + repr(self.type))
        if self.updated_at is not None:
            field_reprs.append('updated_at=' + repr(self.updated_at))
        field_reprs.append('url_key=' + "'" + self.url_key.encode('ascii', 'replace') + "'")
        if self.url_path is not None:
            field_reprs.append('url_path=' + "'" + self.url_path.encode('ascii', 'replace') + "'")
        field_reprs.append('visibility=' + repr(self.visibility))
        if self.weight is not None:
            field_reprs.append('weight=' + repr(self.weight))
        return 'MagentoProduct(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        if self.activation_information is not None:
            field_reprs.append('activation_information=' + "'" + self.activation_information.encode('ascii', 'replace') + "'")
        if self.backorders is not None:
            field_reprs.append('backorders=' + repr(self.backorders))
        if self.cost is not None:
            field_reprs.append('cost=' + repr(self.cost))
        if self.created_at is not None:
            field_reprs.append('created_at=' + repr(self.created_at))
        if self.description is not None:
            field_reprs.append('description=' + "'" + self.description.encode('ascii', 'replace') + "'")
        if self.images is not None:
            field_reprs.append('images=' + repr(self.images))
        if self.is_in_stock is not None:
            field_reprs.append('is_in_stock=' + repr(self.is_in_stock))
        if self.is_qty_decimal is not None:
            field_reprs.append('is_qty_decimal=' + repr(self.is_qty_decimal))
        if self.is_recurring is not None:
            field_reprs.append('is_recurring=' + repr(self.is_recurring))
        if self.low_stock_date is not None:
            field_reprs.append('low_stock_date=' + repr(self.low_stock_date))
        if self.max_sale_qty is not None:
            field_reprs.append('max_sale_qty=' + repr(self.max_sale_qty))
        if self.meta_description is not None:
            field_reprs.append('meta_description=' + "'" + self.meta_description.encode('ascii', 'replace') + "'")
        if self.meta_keyword is not None:
            field_reprs.append('meta_keyword=' + "'" + self.meta_keyword.encode('ascii', 'replace') + "'")
        if self.meta_title is not None:
            field_reprs.append('meta_title=' + "'" + self.meta_title.encode('ascii', 'replace') + "'")
        if self.minimal_price is not None:
            field_reprs.append('minimal_price=' + repr(self.minimal_price))
        if self.min_qty is not None:
            field_reprs.append('min_qty=' + repr(self.min_qty))
        if self.min_sale_qty is not None:
            field_reprs.append('min_sale_qty=' + repr(self.min_sale_qty))
        if self.model is not None:
            field_reprs.append('model=' + "'" + self.model.encode('ascii', 'replace') + "'")
        field_reprs.append('name=' + "'" + self.name.encode('ascii', 'replace') + "'")
        if self.news_from_date is not None:
            field_reprs.append('news_from_date=' + repr(self.news_from_date))
        if self.news_to_date is not None:
            field_reprs.append('news_to_date=' + repr(self.news_to_date))
        if self.notify_stock_qty is not None:
            field_reprs.append('notify_stock_qty=' + repr(self.notify_stock_qty))
        if self.price is not None:
            field_reprs.append('price=' + repr(self.price))
        if self.qty is not None:
            field_reprs.append('qty=' + repr(self.qty))
        if self.shipping_policy is not None:
            field_reprs.append('shipping_policy=' + "'" + self.shipping_policy.encode('ascii', 'replace') + "'")
        field_reprs.append('short_description=' + "'" + self.short_description.encode('ascii', 'replace') + "'")
        field_reprs.append('sku=' + "'" + self.sku.encode('ascii', 'replace') + "'")
        if self.special_from_date is not None:
            field_reprs.append('special_from_date=' + repr(self.special_from_date))
        if self.special_price is not None:
            field_reprs.append('special_price=' + repr(self.special_price))
        if self.special_to_date is not None:
            field_reprs.append('special_to_date=' + repr(self.special_to_date))
        field_reprs.append('store=' + "'" + self.store.encode('ascii', 'replace') + "'")
        if self.status is not None:
            field_reprs.append('status=' + repr(self.status))
        if self.tags is not None:
            field_reprs.append('tags=' + repr(self.tags))
        if self.type is not None:
            field_reprs.append('type=' + repr(self.type))
        if self.updated_at is not None:
            field_reprs.append('updated_at=' + repr(self.updated_at))
        field_reprs.append('url_key=' + "'" + self.url_key.encode('ascii', 'replace') + "'")
        if self.url_path is not None:
            field_reprs.append('url_path=' + "'" + self.url_path.encode('ascii', 'replace') + "'")
        field_reprs.append('visibility=' + repr(self.visibility))
        if self.weight is not None:
            field_reprs.append('weight=' + repr(self.weight))
        return 'MagentoProduct(' + ', '.join(field_reprs) + ')'

    @property
    def activation_information(self):
        return self.__activation_information

    def as_dict(self):
        return {'activation_information': self.activation_information, 'backorders': self.backorders, 'cost': self.cost, 'created_at': self.created_at, 'description': self.description, 'images': self.images, 'is_in_stock': self.is_in_stock, 'is_qty_decimal': self.is_qty_decimal, 'is_recurring': self.is_recurring, 'low_stock_date': self.low_stock_date, 'max_sale_qty': self.max_sale_qty, 'meta_description': self.meta_description, 'meta_keyword': self.meta_keyword, 'meta_title': self.meta_title, 'minimal_price': self.minimal_price, 'min_qty': self.min_qty, 'min_sale_qty': self.min_sale_qty, 'model': self.model, 'name': self.name, 'news_from_date': self.news_from_date, 'news_to_date': self.news_to_date, 'notify_stock_qty': self.notify_stock_qty, 'price': self.price, 'qty': self.qty, 'shipping_policy': self.shipping_policy, 'short_description': self.short_description, 'sku': self.sku, 'special_from_date': self.special_from_date, 'special_price': self.special_price, 'special_to_date': self.special_to_date, 'store': self.store, 'status': self.status, 'tags': self.tags, 'type': self.type, 'updated_at': self.updated_at, 'url_key': self.url_key, 'url_path': self.url_path, 'visibility': self.visibility, 'weight': self.weight}

    @property
    def backorders(self):
        return self.__backorders

    @property
    def cost(self):
        return self.__cost

    @property
    def created_at(self):
        return self.__created_at

    @property
    def description(self):
        return self.__description

    @property
    def images(self):
        return self.__images

    @property
    def is_in_stock(self):
        return self.__is_in_stock

    @property
    def is_qty_decimal(self):
        return self.__is_qty_decimal

    @property
    def is_recurring(self):
        return self.__is_recurring

    @property
    def low_stock_date(self):
        return self.__low_stock_date

    @property
    def max_sale_qty(self):
        return self.__max_sale_qty

    @property
    def meta_description(self):
        return self.__meta_description

    @property
    def meta_keyword(self):
        return self.__meta_keyword

    @property
    def meta_title(self):
        return self.__meta_title

    @property
    def min_qty(self):
        return self.__min_qty

    @property
    def min_sale_qty(self):
        return self.__min_sale_qty

    @property
    def minimal_price(self):
        return self.__minimal_price

    @property
    def model(self):
        return self.__model

    @property
    def name(self):
        return self.__name

    @property
    def news_from_date(self):
        return self.__news_from_date

    @property
    def news_to_date(self):
        return self.__news_to_date

    @property
    def notify_stock_qty(self):
        return self.__notify_stock_qty

    @property
    def price(self):
        return self.__price

    @property
    def qty(self):
        return self.__qty

    @classmethod
    def read(cls, iprot):
        init_kwds = {}

        iprot.readStructBegin()
        while True:
            ifield_name, ifield_type, _ifield_id = iprot.readFieldBegin()
            if ifield_type == 0: # STOP
                break
            elif ifield_name == 'activation_information':
                try:
                    init_kwds['activation_information'] = iprot.readString()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'backorders':
                try:
                    init_kwds['backorders'] = iprot.readI32()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'cost':
                try:
                    init_kwds['cost'] = iprot.readDecimal() if hasattr(iprot, 'readDecimal') else decimal.Decimal(iprot.readString())
                except (decimal.InvalidOperation, TypeError,):
                    pass
            elif ifield_name == 'created_at':
                try:
                    init_kwds['created_at'] = iprot.readDateTime() if hasattr(iprot, 'readDateTime') else datetime.fromtimestamp(iprot.readI64() / 1000.0)
                except (TypeError,):
                    pass
            elif ifield_name == 'description':
                try:
                    init_kwds['description'] = iprot.readString()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'images':
                init_kwds['images'] = frozenset([yogento.api.models.catalog.product.magento.magento_product_image.MagentoProductImage.read(iprot) for _ in xrange(iprot.readSetBegin()[1])] + (iprot.readSetEnd() is None and []))
            elif ifield_name == 'is_in_stock':
                try:
                    init_kwds['is_in_stock'] = iprot.readBool()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'is_qty_decimal':
                try:
                    init_kwds['is_qty_decimal'] = iprot.readBool()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'is_recurring':
                try:
                    init_kwds['is_recurring'] = iprot.readBool()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'low_stock_date':
                try:
                    init_kwds['low_stock_date'] = iprot.readDateTime() if hasattr(iprot, 'readDateTime') else datetime.fromtimestamp(iprot.readI64() / 1000.0)
                except (TypeError,):
                    pass
            elif ifield_name == 'max_sale_qty':
                try:
                    init_kwds['max_sale_qty'] = iprot.readDecimal() if hasattr(iprot, 'readDecimal') else decimal.Decimal(iprot.readString())
                except (decimal.InvalidOperation, TypeError,):
                    pass
            elif ifield_name == 'meta_description':
                try:
                    init_kwds['meta_description'] = iprot.readString()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'meta_keyword':
                try:
                    init_kwds['meta_keyword'] = iprot.readString()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'meta_title':
                try:
                    init_kwds['meta_title'] = iprot.readString()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'minimal_price':
                try:
                    init_kwds['minimal_price'] = iprot.readDecimal() if hasattr(iprot, 'readDecimal') else decimal.Decimal(iprot.readString())
                except (decimal.InvalidOperation, TypeError,):
                    pass
            elif ifield_name == 'min_qty':
                try:
                    init_kwds['min_qty'] = iprot.readDecimal() if hasattr(iprot, 'readDecimal') else decimal.Decimal(iprot.readString())
                except (decimal.InvalidOperation, TypeError,):
                    pass
            elif ifield_name == 'min_sale_qty':
                try:
                    init_kwds['min_sale_qty'] = iprot.readDecimal() if hasattr(iprot, 'readDecimal') else decimal.Decimal(iprot.readString())
                except (decimal.InvalidOperation, TypeError,):
                    pass
            elif ifield_name == 'model':
                try:
                    init_kwds['model'] = iprot.readString()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'name':
                init_kwds['name'] = iprot.readString()
            elif ifield_name == 'news_from_date':
                try:
                    init_kwds['news_from_date'] = iprot.readDateTime() if hasattr(iprot, 'readDateTime') else datetime.fromtimestamp(iprot.readI64() / 1000.0)
                except (TypeError,):
                    pass
            elif ifield_name == 'news_to_date':
                try:
                    init_kwds['news_to_date'] = iprot.readDateTime() if hasattr(iprot, 'readDateTime') else datetime.fromtimestamp(iprot.readI64() / 1000.0)
                except (TypeError,):
                    pass
            elif ifield_name == 'notify_stock_qty':
                try:
                    init_kwds['notify_stock_qty'] = iprot.readDecimal() if hasattr(iprot, 'readDecimal') else decimal.Decimal(iprot.readString())
                except (decimal.InvalidOperation, TypeError,):
                    pass
            elif ifield_name == 'price':
                try:
                    init_kwds['price'] = iprot.readDecimal() if hasattr(iprot, 'readDecimal') else decimal.Decimal(iprot.readString())
                except (decimal.InvalidOperation, TypeError,):
                    pass
            elif ifield_name == 'qty':
                try:
                    init_kwds['qty'] = iprot.readDecimal() if hasattr(iprot, 'readDecimal') else decimal.Decimal(iprot.readString())
                except (decimal.InvalidOperation, TypeError,):
                    pass
            elif ifield_name == 'shipping_policy':
                try:
                    init_kwds['shipping_policy'] = iprot.readString()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'short_description':
                init_kwds['short_description'] = iprot.readString()
            elif ifield_name == 'sku':
                init_kwds['sku'] = iprot.readString()
            elif ifield_name == 'special_from_date':
                try:
                    init_kwds['special_from_date'] = iprot.readDateTime() if hasattr(iprot, 'readDateTime') else datetime.fromtimestamp(iprot.readI64() / 1000.0)
                except (TypeError,):
                    pass
            elif ifield_name == 'special_price':
                try:
                    init_kwds['special_price'] = iprot.readDecimal() if hasattr(iprot, 'readDecimal') else decimal.Decimal(iprot.readString())
                except (decimal.InvalidOperation, TypeError,):
                    pass
            elif ifield_name == 'special_to_date':
                try:
                    init_kwds['special_to_date'] = iprot.readDateTime() if hasattr(iprot, 'readDateTime') else datetime.fromtimestamp(iprot.readI64() / 1000.0)
                except (TypeError,):
                    pass
            elif ifield_name == 'store':
                init_kwds['store'] = iprot.readString()
            elif ifield_name == 'status':
                try:
                    init_kwds['status'] = yogento.api.models.catalog.product.magento.magento_product_status.MagentoProductStatus.value_of(iprot.readString().strip().upper())
                except (TypeError,):
                    pass
            elif ifield_name == 'tags':
                init_kwds['tags'] = frozenset([iprot.readString() for _ in xrange(iprot.readSetBegin()[1])] + (iprot.readSetEnd() is None and []))
            elif ifield_name == 'type':
                try:
                    init_kwds['type'] = yogento.api.models.catalog.product.magento.magento_product_type.MagentoProductType.value_of(iprot.readString().strip().upper())
                except (TypeError,):
                    pass
            elif ifield_name == 'updated_at':
                try:
                    init_kwds['updated_at'] = iprot.readDateTime() if hasattr(iprot, 'readDateTime') else datetime.fromtimestamp(iprot.readI64() / 1000.0)
                except (TypeError,):
                    pass
            elif ifield_name == 'url_key':
                init_kwds['url_key'] = iprot.readString()
            elif ifield_name == 'url_path':
                try:
                    init_kwds['url_path'] = iprot.readString()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'visibility':
                init_kwds['visibility'] = frozenset([iprot.readString() for _ in xrange(iprot.readSetBegin()[1])] + (iprot.readSetEnd() is None and []))
            elif ifield_name == 'weight':
                try:
                    init_kwds['weight'] = iprot.readDecimal() if hasattr(iprot, 'readDecimal') else decimal.Decimal(iprot.readString())
                except (decimal.InvalidOperation, TypeError,):
                    pass
            iprot.readFieldEnd()
        iprot.readStructEnd()

        return cls(**init_kwds)

    def replace(self, activation_information=None, backorders=None, cost=None, created_at=None, description=None, images=None, is_in_stock=None, is_qty_decimal=None, is_recurring=None, low_stock_date=None, max_sale_qty=None, meta_description=None, meta_keyword=None, meta_title=None, minimal_price=None, min_qty=None, min_sale_qty=None, model=None, name=None, news_from_date=None, news_to_date=None, notify_stock_qty=None, price=None, qty=None, shipping_policy=None, short_description=None, sku=None, special_from_date=None, special_price=None, special_to_date=None, store=None, status=None, tags=None, type=None, updated_at=None, url_key=None, url_path=None, visibility=None, weight=None):
        if activation_information is None:
            activation_information = self.activation_information
        if backorders is None:
            backorders = self.backorders
        if cost is None:
            cost = self.cost
        if created_at is None:
            created_at = self.created_at
        if description is None:
            description = self.description
        if images is None:
            images = self.images
        if is_in_stock is None:
            is_in_stock = self.is_in_stock
        if is_qty_decimal is None:
            is_qty_decimal = self.is_qty_decimal
        if is_recurring is None:
            is_recurring = self.is_recurring
        if low_stock_date is None:
            low_stock_date = self.low_stock_date
        if max_sale_qty is None:
            max_sale_qty = self.max_sale_qty
        if meta_description is None:
            meta_description = self.meta_description
        if meta_keyword is None:
            meta_keyword = self.meta_keyword
        if meta_title is None:
            meta_title = self.meta_title
        if minimal_price is None:
            minimal_price = self.minimal_price
        if min_qty is None:
            min_qty = self.min_qty
        if min_sale_qty is None:
            min_sale_qty = self.min_sale_qty
        if model is None:
            model = self.model
        if name is None:
            name = self.name
        if news_from_date is None:
            news_from_date = self.news_from_date
        if news_to_date is None:
            news_to_date = self.news_to_date
        if notify_stock_qty is None:
            notify_stock_qty = self.notify_stock_qty
        if price is None:
            price = self.price
        if qty is None:
            qty = self.qty
        if shipping_policy is None:
            shipping_policy = self.shipping_policy
        if short_description is None:
            short_description = self.short_description
        if sku is None:
            sku = self.sku
        if special_from_date is None:
            special_from_date = self.special_from_date
        if special_price is None:
            special_price = self.special_price
        if special_to_date is None:
            special_to_date = self.special_to_date
        if store is None:
            store = self.store
        if status is None:
            status = self.status
        if tags is None:
            tags = self.tags
        if type is None:
            type = self.type
        if updated_at is None:
            updated_at = self.updated_at
        if url_key is None:
            url_key = self.url_key
        if url_path is None:
            url_path = self.url_path
        if visibility is None:
            visibility = self.visibility
        if weight is None:
            weight = self.weight
        return self.__class__(activation_information=activation_information, backorders=backorders, cost=cost, created_at=created_at, description=description, images=images, is_in_stock=is_in_stock, is_qty_decimal=is_qty_decimal, is_recurring=is_recurring, low_stock_date=low_stock_date, max_sale_qty=max_sale_qty, meta_description=meta_description, meta_keyword=meta_keyword, meta_title=meta_title, minimal_price=minimal_price, min_qty=min_qty, min_sale_qty=min_sale_qty, model=model, name=name, news_from_date=news_from_date, news_to_date=news_to_date, notify_stock_qty=notify_stock_qty, price=price, qty=qty, shipping_policy=shipping_policy, short_description=short_description, sku=sku, special_from_date=special_from_date, special_price=special_price, special_to_date=special_to_date, store=store, status=status, tags=tags, type=type, updated_at=updated_at, url_key=url_key, url_path=url_path, visibility=visibility, weight=weight)

    @property
    def shipping_policy(self):
        return self.__shipping_policy

    @property
    def short_description(self):
        return self.__short_description

    @property
    def sku(self):
        return self.__sku

    @property
    def special_from_date(self):
        return self.__special_from_date

    @property
    def special_price(self):
        return self.__special_price

    @property
    def special_to_date(self):
        return self.__special_to_date

    @property
    def status(self):
        return self.__status

    @property
    def store(self):
        return self.__store

    @property
    def tags(self):
        return self.__tags

    @property
    def type(self):
        return self.__type

    @property
    def updated_at(self):
        return self.__updated_at

    @property
    def url_key(self):
        return self.__url_key

    @property
    def url_path(self):
        return self.__url_path

    @property
    def visibility(self):
        return self.__visibility

    @property
    def weight(self):
        return self.__weight

    def write(self, oprot):
        oprot.writeStructBegin('MagentoProduct')

        if self.activation_information is not None:
            oprot.writeFieldBegin('activation_information', 11, -1)
            oprot.writeString(self.activation_information)
            oprot.writeFieldEnd()

        if self.backorders is not None:
            oprot.writeFieldBegin('backorders', 8, -1)
            oprot.writeI32(self.backorders)
            oprot.writeFieldEnd()

        if self.cost is not None:
            oprot.writeFieldBegin('cost', 12, -1)
            oprot.writeDecimal(self.cost) if hasattr(oprot, 'writeDecimal') else oprot.writeString(str(self.cost))
            oprot.writeFieldEnd()

        if self.created_at is not None:
            oprot.writeFieldBegin('created_at', 12, -1)
            oprot.writeDateTime(self.created_at) if hasattr(oprot, 'writeDateTime') else oprot.writeI64(long(mktime(self.created_at.timetuple())) * 1000l)
            oprot.writeFieldEnd()

        if self.description is not None:
            oprot.writeFieldBegin('description', 11, -1)
            oprot.writeString(self.description)
            oprot.writeFieldEnd()

        if self.images is not None:
            oprot.writeFieldBegin('images', 14, -1)
            oprot.writeSetBegin(12, len(self.images))
            for _0 in self.images:
                _0.write(oprot)
            oprot.writeSetEnd()
            oprot.writeFieldEnd()

        if self.is_in_stock is not None:
            oprot.writeFieldBegin('is_in_stock', 2, -1)
            oprot.writeBool(self.is_in_stock)
            oprot.writeFieldEnd()

        if self.is_qty_decimal is not None:
            oprot.writeFieldBegin('is_qty_decimal', 2, -1)
            oprot.writeBool(self.is_qty_decimal)
            oprot.writeFieldEnd()

        if self.is_recurring is not None:
            oprot.writeFieldBegin('is_recurring', 2, -1)
            oprot.writeBool(self.is_recurring)
            oprot.writeFieldEnd()

        if self.low_stock_date is not None:
            oprot.writeFieldBegin('low_stock_date', 12, -1)
            oprot.writeDateTime(self.low_stock_date) if hasattr(oprot, 'writeDateTime') else oprot.writeI64(long(mktime(self.low_stock_date.timetuple())) * 1000l)
            oprot.writeFieldEnd()

        if self.max_sale_qty is not None:
            oprot.writeFieldBegin('max_sale_qty', 12, -1)
            oprot.writeDecimal(self.max_sale_qty) if hasattr(oprot, 'writeDecimal') else oprot.writeString(str(self.max_sale_qty))
            oprot.writeFieldEnd()

        if self.meta_description is not None:
            oprot.writeFieldBegin('meta_description', 11, -1)
            oprot.writeString(self.meta_description)
            oprot.writeFieldEnd()

        if self.meta_keyword is not None:
            oprot.writeFieldBegin('meta_keyword', 11, -1)
            oprot.writeString(self.meta_keyword)
            oprot.writeFieldEnd()

        if self.meta_title is not None:
            oprot.writeFieldBegin('meta_title', 11, -1)
            oprot.writeString(self.meta_title)
            oprot.writeFieldEnd()

        if self.minimal_price is not None:
            oprot.writeFieldBegin('minimal_price', 12, -1)
            oprot.writeDecimal(self.minimal_price) if hasattr(oprot, 'writeDecimal') else oprot.writeString(str(self.minimal_price))
            oprot.writeFieldEnd()

        if self.min_qty is not None:
            oprot.writeFieldBegin('min_qty', 12, -1)
            oprot.writeDecimal(self.min_qty) if hasattr(oprot, 'writeDecimal') else oprot.writeString(str(self.min_qty))
            oprot.writeFieldEnd()

        if self.min_sale_qty is not None:
            oprot.writeFieldBegin('min_sale_qty', 12, -1)
            oprot.writeDecimal(self.min_sale_qty) if hasattr(oprot, 'writeDecimal') else oprot.writeString(str(self.min_sale_qty))
            oprot.writeFieldEnd()

        if self.model is not None:
            oprot.writeFieldBegin('model', 11, -1)
            oprot.writeString(self.model)
            oprot.writeFieldEnd()

        oprot.writeFieldBegin('name', 11, -1)
        oprot.writeString(self.name)
        oprot.writeFieldEnd()

        if self.news_from_date is not None:
            oprot.writeFieldBegin('news_from_date', 12, -1)
            oprot.writeDateTime(self.news_from_date) if hasattr(oprot, 'writeDateTime') else oprot.writeI64(long(mktime(self.news_from_date.timetuple())) * 1000l)
            oprot.writeFieldEnd()

        if self.news_to_date is not None:
            oprot.writeFieldBegin('news_to_date', 12, -1)
            oprot.writeDateTime(self.news_to_date) if hasattr(oprot, 'writeDateTime') else oprot.writeI64(long(mktime(self.news_to_date.timetuple())) * 1000l)
            oprot.writeFieldEnd()

        if self.notify_stock_qty is not None:
            oprot.writeFieldBegin('notify_stock_qty', 12, -1)
            oprot.writeDecimal(self.notify_stock_qty) if hasattr(oprot, 'writeDecimal') else oprot.writeString(str(self.notify_stock_qty))
            oprot.writeFieldEnd()

        if self.price is not None:
            oprot.writeFieldBegin('price', 12, -1)
            oprot.writeDecimal(self.price) if hasattr(oprot, 'writeDecimal') else oprot.writeString(str(self.price))
            oprot.writeFieldEnd()

        if self.qty is not None:
            oprot.writeFieldBegin('qty', 12, -1)
            oprot.writeDecimal(self.qty) if hasattr(oprot, 'writeDecimal') else oprot.writeString(str(self.qty))
            oprot.writeFieldEnd()

        if self.shipping_policy is not None:
            oprot.writeFieldBegin('shipping_policy', 11, -1)
            oprot.writeString(self.shipping_policy)
            oprot.writeFieldEnd()

        oprot.writeFieldBegin('short_description', 11, -1)
        oprot.writeString(self.short_description)
        oprot.writeFieldEnd()

        oprot.writeFieldBegin('sku', 11, -1)
        oprot.writeString(self.sku)
        oprot.writeFieldEnd()

        if self.special_from_date is not None:
            oprot.writeFieldBegin('special_from_date', 12, -1)
            oprot.writeDateTime(self.special_from_date) if hasattr(oprot, 'writeDateTime') else oprot.writeI64(long(mktime(self.special_from_date.timetuple())) * 1000l)
            oprot.writeFieldEnd()

        if self.special_price is not None:
            oprot.writeFieldBegin('special_price', 12, -1)
            oprot.writeDecimal(self.special_price) if hasattr(oprot, 'writeDecimal') else oprot.writeString(str(self.special_price))
            oprot.writeFieldEnd()

        if self.special_to_date is not None:
            oprot.writeFieldBegin('special_to_date', 12, -1)
            oprot.writeDateTime(self.special_to_date) if hasattr(oprot, 'writeDateTime') else oprot.writeI64(long(mktime(self.special_to_date.timetuple())) * 1000l)
            oprot.writeFieldEnd()

        oprot.writeFieldBegin('store', 11, -1)
        oprot.writeString(self.store)
        oprot.writeFieldEnd()

        if self.status is not None:
            oprot.writeFieldBegin('status', 11, -1)
            oprot.writeString([attr for attr in dir(yogento.api.models.catalog.product.magento.magento_product_status.MagentoProductStatus) if getattr(yogento.api.models.catalog.product.magento.magento_product_status.MagentoProductStatus, attr) == self.status][0])
            oprot.writeFieldEnd()

        if self.tags is not None:
            oprot.writeFieldBegin('tags', 14, -1)
            oprot.writeSetBegin(11, len(self.tags))
            for _0 in self.tags:
                oprot.writeString(_0)
            oprot.writeSetEnd()
            oprot.writeFieldEnd()

        if self.type is not None:
            oprot.writeFieldBegin('type', 11, -1)
            oprot.writeString([attr for attr in dir(yogento.api.models.catalog.product.magento.magento_product_type.MagentoProductType) if getattr(yogento.api.models.catalog.product.magento.magento_product_type.MagentoProductType, attr) == self.type][0])
            oprot.writeFieldEnd()

        if self.updated_at is not None:
            oprot.writeFieldBegin('updated_at', 12, -1)
            oprot.writeDateTime(self.updated_at) if hasattr(oprot, 'writeDateTime') else oprot.writeI64(long(mktime(self.updated_at.timetuple())) * 1000l)
            oprot.writeFieldEnd()

        oprot.writeFieldBegin('url_key', 11, -1)
        oprot.writeString(self.url_key)
        oprot.writeFieldEnd()

        if self.url_path is not None:
            oprot.writeFieldBegin('url_path', 11, -1)
            oprot.writeString(self.url_path)
            oprot.writeFieldEnd()

        oprot.writeFieldBegin('visibility', 14, -1)
        oprot.writeSetBegin(11, len(self.visibility))
        for _0 in self.visibility:
            oprot.writeString(_0)
        oprot.writeSetEnd()
        oprot.writeFieldEnd()

        if self.weight is not None:
            oprot.writeFieldBegin('weight', 12, -1)
            oprot.writeDecimal(self.weight) if hasattr(oprot, 'writeDecimal') else oprot.writeString(str(self.weight))
            oprot.writeFieldEnd()

        oprot.writeFieldStop()

        oprot.writeStructEnd()

        return self
