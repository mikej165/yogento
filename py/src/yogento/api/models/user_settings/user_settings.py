from datetime import datetime
from itertools import ifilterfalse
from time import mktime
import __builtin__


class UserSettings(object):
    class Builder:
        def __init__(
            self,
            display_name=None,
            email=None,
            logo_image_url=None,
            magento_store_url=None,
            products_mtime=None,
            product_search_queries=None,
            use_sample_data=None
        ):
            self.__display_name = display_name
            self.__email = email
            self.__logo_image_url = logo_image_url
            self.__magento_store_url = magento_store_url
            self.__products_mtime = products_mtime
            self.__product_search_queries = product_search_queries
            self.__use_sample_data = use_sample_data

        def build(self):
            return UserSettings(display_name=self.__display_name, email=self.__email, logo_image_url=self.__logo_image_url, magento_store_url=self.__magento_store_url, products_mtime=self.__products_mtime, product_search_queries=self.__product_search_queries, use_sample_data=self.__use_sample_data)

        def set_display_name(self, display_name):
            self.__display_name = display_name
            return self

        def set_email(self, email):
            self.__email = email
            return self

        def set_logo_image_url(self, logo_image_url):
            self.__logo_image_url = logo_image_url
            return self

        def set_magento_store_url(self, magento_store_url):
            self.__magento_store_url = magento_store_url
            return self

        def set_product_search_queries(self, product_search_queries):
            self.__product_search_queries = product_search_queries
            return self

        def set_products_mtime(self, products_mtime):
            self.__products_mtime = products_mtime
            return self

        def set_use_sample_data(self, use_sample_data):
            self.__use_sample_data = use_sample_data
            return self

        def update(self, user_settings):
            if isinstance(user_settings, UserSettings):
                self.set_display_name(user_settings.display_name)
                self.set_email(user_settings.email)
                self.set_logo_image_url(user_settings.logo_image_url)
                self.set_magento_store_url(user_settings.magento_store_url)
                self.set_products_mtime(user_settings.products_mtime)
                self.set_product_search_queries(user_settings.product_search_queries)
                self.set_use_sample_data(user_settings.use_sample_data)
            elif isinstance(user_settings, dict):
                for key, value in user_settings.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(user_settings)
            return self

    def __init__(
        self,
        display_name=None,
        email=None,
        logo_image_url=None,
        magento_store_url=None,
        products_mtime=None,
        product_search_queries=None,
        use_sample_data=None
    ):
        if display_name is not None:
            if not isinstance(display_name, basestring):
                raise TypeError(getattr(__builtin__, 'type')(display_name))
        self.__display_name = display_name

        if email is not None:
            if not isinstance(email, basestring):
                raise TypeError(getattr(__builtin__, 'type')(email))
        self.__email = email

        if logo_image_url is not None:
            if not isinstance(logo_image_url, basestring):
                raise TypeError(getattr(__builtin__, 'type')(logo_image_url))
        self.__logo_image_url = logo_image_url

        if magento_store_url is not None:
            if not isinstance(magento_store_url, basestring):
                raise TypeError(getattr(__builtin__, 'type')(magento_store_url))
        self.__magento_store_url = magento_store_url

        if products_mtime is not None:
            if not isinstance(products_mtime, datetime):
                raise TypeError(getattr(__builtin__, 'type')(products_mtime))
        self.__products_mtime = products_mtime

        if product_search_queries is not None:
            if not (isinstance(product_search_queries, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, basestring), product_search_queries))) == 0):
                raise TypeError(getattr(__builtin__, 'type')(product_search_queries))
        self.__product_search_queries = product_search_queries

        if use_sample_data is not None:
            if not isinstance(use_sample_data, bool):
                raise TypeError(getattr(__builtin__, 'type')(use_sample_data))
        self.__use_sample_data = use_sample_data

    def __eq__(self, other):
        if self.display_name != other.display_name:
            return False
        if self.email != other.email:
            return False
        if self.logo_image_url != other.logo_image_url:
            return False
        if self.magento_store_url != other.magento_store_url:
            return False
        if self.products_mtime != other.products_mtime:
            return False
        if self.product_search_queries != other.product_search_queries:
            return False
        if self.use_sample_data != other.use_sample_data:
            return False
        return True

    def __hash__(self):
        return hash((self.display_name,self.email,self.logo_image_url,self.magento_store_url,self.products_mtime,self.product_search_queries,self.use_sample_data,))

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        if self.display_name is not None:
            field_reprs.append('display_name=' + "'" + self.display_name.encode('ascii', 'replace') + "'")
        if self.email is not None:
            field_reprs.append('email=' + "'" + self.email.encode('ascii', 'replace') + "'")
        if self.logo_image_url is not None:
            field_reprs.append('logo_image_url=' + "'" + self.logo_image_url.encode('ascii', 'replace') + "'")
        if self.magento_store_url is not None:
            field_reprs.append('magento_store_url=' + "'" + self.magento_store_url.encode('ascii', 'replace') + "'")
        if self.products_mtime is not None:
            field_reprs.append('products_mtime=' + repr(self.products_mtime))
        if self.product_search_queries is not None:
            field_reprs.append('product_search_queries=' + repr(self.product_search_queries))
        if self.use_sample_data is not None:
            field_reprs.append('use_sample_data=' + repr(self.use_sample_data))
        return 'UserSettings(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        if self.display_name is not None:
            field_reprs.append('display_name=' + "'" + self.display_name.encode('ascii', 'replace') + "'")
        if self.email is not None:
            field_reprs.append('email=' + "'" + self.email.encode('ascii', 'replace') + "'")
        if self.logo_image_url is not None:
            field_reprs.append('logo_image_url=' + "'" + self.logo_image_url.encode('ascii', 'replace') + "'")
        if self.magento_store_url is not None:
            field_reprs.append('magento_store_url=' + "'" + self.magento_store_url.encode('ascii', 'replace') + "'")
        if self.products_mtime is not None:
            field_reprs.append('products_mtime=' + repr(self.products_mtime))
        if self.product_search_queries is not None:
            field_reprs.append('product_search_queries=' + repr(self.product_search_queries))
        if self.use_sample_data is not None:
            field_reprs.append('use_sample_data=' + repr(self.use_sample_data))
        return 'UserSettings(' + ', '.join(field_reprs) + ')'

    def as_dict(self):
        return {'display_name': self.display_name, 'email': self.email, 'logo_image_url': self.logo_image_url, 'magento_store_url': self.magento_store_url, 'products_mtime': self.products_mtime, 'product_search_queries': self.product_search_queries, 'use_sample_data': self.use_sample_data}

    @property
    def display_name(self):
        return self.__display_name

    @property
    def email(self):
        return self.__email

    @property
    def logo_image_url(self):
        return self.__logo_image_url

    @property
    def magento_store_url(self):
        return self.__magento_store_url

    @property
    def product_search_queries(self):
        return self.__product_search_queries

    @property
    def products_mtime(self):
        return self.__products_mtime

    @classmethod
    def read(cls, iprot):
        init_kwds = {}

        iprot.readStructBegin()
        while True:
            ifield_name, ifield_type, _ifield_id = iprot.readFieldBegin()
            if ifield_type == 0: # STOP
                break
            elif ifield_name == 'display_name':
                try:
                    init_kwds['display_name'] = iprot.readString()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'email':
                try:
                    init_kwds['email'] = iprot.readString()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'logo_image_url':
                try:
                    init_kwds['logo_image_url'] = iprot.readString()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'magento_store_url':
                try:
                    init_kwds['magento_store_url'] = iprot.readString()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'products_mtime':
                try:
                    init_kwds['products_mtime'] = iprot.readDateTime() if hasattr(iprot, 'readDateTime') else datetime.fromtimestamp(iprot.readI64() / 1000.0)
                except (TypeError,):
                    pass
            elif ifield_name == 'product_search_queries':
                init_kwds['product_search_queries'] = tuple([iprot.readString() for _ in xrange(iprot.readListBegin()[1])] + (iprot.readListEnd() is None and []))
            elif ifield_name == 'use_sample_data':
                try:
                    init_kwds['use_sample_data'] = iprot.readBool()
                except (TypeError, ValueError,):
                    pass
            iprot.readFieldEnd()
        iprot.readStructEnd()

        return cls(**init_kwds)

    def replace(self, display_name=None, email=None, logo_image_url=None, magento_store_url=None, products_mtime=None, product_search_queries=None, use_sample_data=None):
        if display_name is None:
            display_name = self.display_name
        if email is None:
            email = self.email
        if logo_image_url is None:
            logo_image_url = self.logo_image_url
        if magento_store_url is None:
            magento_store_url = self.magento_store_url
        if products_mtime is None:
            products_mtime = self.products_mtime
        if product_search_queries is None:
            product_search_queries = self.product_search_queries
        if use_sample_data is None:
            use_sample_data = self.use_sample_data
        return self.__class__(display_name=display_name, email=email, logo_image_url=logo_image_url, magento_store_url=magento_store_url, products_mtime=products_mtime, product_search_queries=product_search_queries, use_sample_data=use_sample_data)

    @property
    def use_sample_data(self):
        return self.__use_sample_data

    def write(self, oprot):
        oprot.writeStructBegin('UserSettings')

        if self.display_name is not None:
            oprot.writeFieldBegin('display_name', 11, -1)
            oprot.writeString(self.display_name)
            oprot.writeFieldEnd()

        if self.email is not None:
            oprot.writeFieldBegin('email', 11, -1)
            oprot.writeString(self.email)
            oprot.writeFieldEnd()

        if self.logo_image_url is not None:
            oprot.writeFieldBegin('logo_image_url', 11, -1)
            oprot.writeString(self.logo_image_url)
            oprot.writeFieldEnd()

        if self.magento_store_url is not None:
            oprot.writeFieldBegin('magento_store_url', 11, -1)
            oprot.writeString(self.magento_store_url)
            oprot.writeFieldEnd()

        if self.products_mtime is not None:
            oprot.writeFieldBegin('products_mtime', 12, -1)
            oprot.writeDateTime(self.products_mtime) if hasattr(oprot, 'writeDateTime') else oprot.writeI64(long(mktime(self.products_mtime.timetuple())) * 1000l)
            oprot.writeFieldEnd()

        if self.product_search_queries is not None:
            oprot.writeFieldBegin('product_search_queries', 15, -1)
            oprot.writeListBegin(11, len(self.product_search_queries))
            for _0 in self.product_search_queries:
                oprot.writeString(_0)
            oprot.writeListEnd()
            oprot.writeFieldEnd()

        if self.use_sample_data is not None:
            oprot.writeFieldBegin('use_sample_data', 2, -1)
            oprot.writeBool(self.use_sample_data)
            oprot.writeFieldEnd()

        oprot.writeFieldStop()

        oprot.writeStructEnd()

        return self
