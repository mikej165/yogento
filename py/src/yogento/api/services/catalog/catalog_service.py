from itertools import ifilterfalse
import __builtin__
import yogento.api.models.catalog.product.product


class CatalogService(object):
    def delete_product_by_sku(self, sku):
        if sku is None:
            raise ValueError('sku is required')
        if not isinstance(sku, basestring):
            raise TypeError(getattr(__builtin__, 'type')(sku))

        delete_product_by_sku_return_value = self._delete_product_by_sku(sku=sku)

        if not isinstance(delete_product_by_sku_return_value, bool):
            raise TypeError(getattr(__builtin__, 'type')(delete_product_by_sku_return_value))

        return delete_product_by_sku_return_value

    def _delete_product_by_sku(self, sku):
        raise NotImplementedError(self.__class__.__module__ + '.' + self.__class__.__name__ + '._delete_product_by_sku')

    def delete_products(self):
        self._delete_products()

    def _delete_products(self):
        raise NotImplementedError(self.__class__.__module__ + '.' + self.__class__.__name__ + '._delete_products')

    def get_product_count(self):
        get_product_count_return_value = self._get_product_count()

        if not isinstance(get_product_count_return_value, int):
            raise TypeError(getattr(__builtin__, 'type')(get_product_count_return_value))

        return get_product_count_return_value

    def _get_product_count(self):
        raise NotImplementedError(self.__class__.__module__ + '.' + self.__class__.__name__ + '._get_product_count')

    def get_product_by_sku(self, sku):
        if sku is None:
            raise ValueError('sku is required')
        if not isinstance(sku, basestring):
            raise TypeError(getattr(__builtin__, 'type')(sku))

        get_product_by_sku_return_value = self._get_product_by_sku(sku=sku)

        if not isinstance(get_product_by_sku_return_value, yogento.api.models.catalog.product.product.Product):
            raise TypeError(getattr(__builtin__, 'type')(get_product_by_sku_return_value))

        return get_product_by_sku_return_value

    def _get_product_by_sku(self, sku):
        raise NotImplementedError(self.__class__.__module__ + '.' + self.__class__.__name__ + '._get_product_by_sku')

    def get_products(self, include_disabled=None, query=None):
        if include_disabled is not None:
            if not isinstance(include_disabled, bool):
                raise TypeError(getattr(__builtin__, 'type')(include_disabled))
        if query is not None:
            if not isinstance(query, basestring):
                raise TypeError(getattr(__builtin__, 'type')(query))

        get_products_return_value = self._get_products(include_disabled=include_disabled, query=query)

        if not (isinstance(get_products_return_value, frozenset) and len(list(ifilterfalse(lambda _: isinstance(_, yogento.api.models.catalog.product.product.Product), get_products_return_value))) == 0):
            raise TypeError(getattr(__builtin__, 'type')(get_products_return_value))

        return get_products_return_value

    def _get_products(self, include_disabled=None, query=None):
        raise NotImplementedError(self.__class__.__module__ + '.' + self.__class__.__name__ + '._get_products')

    def get_product_skus(self):
        get_product_skus_return_value = self._get_product_skus()

        if not (isinstance(get_product_skus_return_value, frozenset) and len(list(ifilterfalse(lambda _: isinstance(_, basestring), get_product_skus_return_value))) == 0):
            raise TypeError(getattr(__builtin__, 'type')(get_product_skus_return_value))

        return get_product_skus_return_value

    def _get_product_skus(self):
        raise NotImplementedError(self.__class__.__module__ + '.' + self.__class__.__name__ + '._get_product_skus')

    def get_products_by_skus(self, skus):
        if skus is None:
            raise ValueError('skus is required')
        if not (isinstance(skus, frozenset) and len(list(ifilterfalse(lambda _: isinstance(_, basestring), skus))) == 0):
            raise TypeError(getattr(__builtin__, 'type')(skus))

        get_products_by_skus_return_value = self._get_products_by_skus(skus=skus)

        if not (isinstance(get_products_by_skus_return_value, frozenset) and len(list(ifilterfalse(lambda _: isinstance(_, yogento.api.models.catalog.product.product.Product), get_products_by_skus_return_value))) == 0):
            raise TypeError(getattr(__builtin__, 'type')(get_products_by_skus_return_value))

        return get_products_by_skus_return_value

    def _get_products_by_skus(self, skus):
        raise NotImplementedError(self.__class__.__module__ + '.' + self.__class__.__name__ + '._get_products_by_skus')

    def get_product_thumbnail_url(self, sku, thumbnail_height_px, thumbnail_width_px):
        if sku is None:
            raise ValueError('sku is required')
        if not isinstance(sku, basestring):
            raise TypeError(getattr(__builtin__, 'type')(sku))
        if thumbnail_height_px is None:
            raise ValueError('thumbnail_height_px is required')
        if not isinstance(thumbnail_height_px, int):
            raise TypeError(getattr(__builtin__, 'type')(thumbnail_height_px))
        if thumbnail_width_px is None:
            raise ValueError('thumbnail_width_px is required')
        if not isinstance(thumbnail_width_px, int):
            raise TypeError(getattr(__builtin__, 'type')(thumbnail_width_px))

        get_product_thumbnail_url_return_value = self._get_product_thumbnail_url(sku=sku, thumbnail_height_px=thumbnail_height_px, thumbnail_width_px=thumbnail_width_px)

        if not isinstance(get_product_thumbnail_url_return_value, str):
            raise TypeError(getattr(__builtin__, 'type')(get_product_thumbnail_url_return_value))

        return get_product_thumbnail_url_return_value

    def _get_product_thumbnail_url(self, sku, thumbnail_height_px, thumbnail_width_px):
        raise NotImplementedError(self.__class__.__module__ + '.' + self.__class__.__name__ + '._get_product_thumbnail_url')

    def get_sample_product_thumbnail_url(self, sku, thumbnail_height_px, thumbnail_width_px):
        if sku is None:
            raise ValueError('sku is required')
        if not isinstance(sku, basestring):
            raise TypeError(getattr(__builtin__, 'type')(sku))
        if thumbnail_height_px is None:
            raise ValueError('thumbnail_height_px is required')
        if not isinstance(thumbnail_height_px, int):
            raise TypeError(getattr(__builtin__, 'type')(thumbnail_height_px))
        if thumbnail_width_px is None:
            raise ValueError('thumbnail_width_px is required')
        if not isinstance(thumbnail_width_px, int):
            raise TypeError(getattr(__builtin__, 'type')(thumbnail_width_px))

        get_sample_product_thumbnail_url_return_value = self._get_sample_product_thumbnail_url(sku=sku, thumbnail_height_px=thumbnail_height_px, thumbnail_width_px=thumbnail_width_px)

        if not isinstance(get_sample_product_thumbnail_url_return_value, str):
            raise TypeError(getattr(__builtin__, 'type')(get_sample_product_thumbnail_url_return_value))

        return get_sample_product_thumbnail_url_return_value

    def _get_sample_product_thumbnail_url(self, sku, thumbnail_height_px, thumbnail_width_px):
        raise NotImplementedError(self.__class__.__module__ + '.' + self.__class__.__name__ + '._get_sample_product_thumbnail_url')

    def get_sample_product_by_sku(self, sku):
        if sku is None:
            raise ValueError('sku is required')
        if not isinstance(sku, basestring):
            raise TypeError(getattr(__builtin__, 'type')(sku))

        get_sample_product_by_sku_return_value = self._get_sample_product_by_sku(sku=sku)

        if not isinstance(get_sample_product_by_sku_return_value, yogento.api.models.catalog.product.product.Product):
            raise TypeError(getattr(__builtin__, 'type')(get_sample_product_by_sku_return_value))

        return get_sample_product_by_sku_return_value

    def _get_sample_product_by_sku(self, sku):
        raise NotImplementedError(self.__class__.__module__ + '.' + self.__class__.__name__ + '._get_sample_product_by_sku')

    def get_sample_products(self):
        get_sample_products_return_value = self._get_sample_products()

        if not (isinstance(get_sample_products_return_value, frozenset) and len(list(ifilterfalse(lambda _: isinstance(_, yogento.api.models.catalog.product.product.Product), get_sample_products_return_value))) == 0):
            raise TypeError(getattr(__builtin__, 'type')(get_sample_products_return_value))

        return get_sample_products_return_value

    def _get_sample_products(self):
        raise NotImplementedError(self.__class__.__module__ + '.' + self.__class__.__name__ + '._get_sample_products')

    def head_product_by_sku(self, sku):
        if sku is None:
            raise ValueError('sku is required')
        if not isinstance(sku, basestring):
            raise TypeError(getattr(__builtin__, 'type')(sku))

        head_product_by_sku_return_value = self._head_product_by_sku(sku=sku)

        if not isinstance(head_product_by_sku_return_value, bool):
            raise TypeError(getattr(__builtin__, 'type')(head_product_by_sku_return_value))

        return head_product_by_sku_return_value

    def _head_product_by_sku(self, sku):
        raise NotImplementedError(self.__class__.__module__ + '.' + self.__class__.__name__ + '._head_product_by_sku')

    def put_product(self, product):
        if product is None:
            raise ValueError('product is required')
        if not isinstance(product, yogento.api.models.catalog.product.product.Product):
            raise TypeError(getattr(__builtin__, 'type')(product))

        self._put_product(product=product)

    def _put_product(self, product):
        raise NotImplementedError(self.__class__.__module__ + '.' + self.__class__.__name__ + '._put_product')

    def put_products(self, products):
        if products is None:
            raise ValueError('products is required')
        if not (isinstance(products, frozenset) and len(list(ifilterfalse(lambda _: isinstance(_, yogento.api.models.catalog.product.product.Product), products))) == 0):
            raise TypeError(getattr(__builtin__, 'type')(products))

        self._put_products(products=products)

    def _put_products(self, products):
        raise NotImplementedError(self.__class__.__module__ + '.' + self.__class__.__name__ + '._put_products')
