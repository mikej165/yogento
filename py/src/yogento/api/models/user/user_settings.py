from datetime import datetime
from itertools import ifilterfalse
from time import mktime
import __builtin__


class UserSettings(object):
    class Builder:
        def __init__(
            self,
            logo_image_file_path=None,
            magento_store_url=None,
            product_csv_file_path=None,
            product_csv_mtime=None,
            product_search_queries=None
        ):
            self.__logo_image_file_path = logo_image_file_path
            self.__magento_store_url = magento_store_url
            self.__product_csv_file_path = product_csv_file_path
            self.__product_csv_mtime = product_csv_mtime
            self.__product_search_queries = product_search_queries

        def build(self):
            return UserSettings(logo_image_file_path=self.__logo_image_file_path, magento_store_url=self.__magento_store_url, product_csv_file_path=self.__product_csv_file_path, product_csv_mtime=self.__product_csv_mtime, product_search_queries=self.__product_search_queries)

        def set_logo_image_file_path(self, logo_image_file_path):
            self.__logo_image_file_path = logo_image_file_path
            return self

        def set_magento_store_url(self, magento_store_url):
            self.__magento_store_url = magento_store_url
            return self

        def set_product_csv_file_path(self, product_csv_file_path):
            self.__product_csv_file_path = product_csv_file_path
            return self

        def set_product_csv_mtime(self, product_csv_mtime):
            self.__product_csv_mtime = product_csv_mtime
            return self

        def set_product_search_queries(self, product_search_queries):
            self.__product_search_queries = product_search_queries
            return self

        def update(self, user_settings):
            if isinstance(user_settings, UserSettings):
                self.set_logo_image_file_path(user_settings.logo_image_file_path)
                self.set_magento_store_url(user_settings.magento_store_url)
                self.set_product_csv_file_path(user_settings.product_csv_file_path)
                self.set_product_csv_mtime(user_settings.product_csv_mtime)
                self.set_product_search_queries(user_settings.product_search_queries)
            elif isinstance(user_settings, dict):
                for key, value in user_settings.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(user_settings)
            return self

    def __init__(
        self,
        logo_image_file_path=None,
        magento_store_url=None,
        product_csv_file_path=None,
        product_csv_mtime=None,
        product_search_queries=None
    ):
        if logo_image_file_path is not None:
            if not isinstance(logo_image_file_path, basestring):
                raise TypeError(getattr(__builtin__, 'type')(logo_image_file_path))
        self.__logo_image_file_path = logo_image_file_path

        if magento_store_url is not None:
            if not isinstance(magento_store_url, basestring):
                raise TypeError(getattr(__builtin__, 'type')(magento_store_url))
        self.__magento_store_url = magento_store_url

        if product_csv_file_path is not None:
            if not isinstance(product_csv_file_path, basestring):
                raise TypeError(getattr(__builtin__, 'type')(product_csv_file_path))
        self.__product_csv_file_path = product_csv_file_path

        if product_csv_mtime is not None:
            if not isinstance(product_csv_mtime, datetime):
                raise TypeError(getattr(__builtin__, 'type')(product_csv_mtime))
        self.__product_csv_mtime = product_csv_mtime

        if product_search_queries is not None:
            if not (isinstance(product_search_queries, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, basestring), product_search_queries))) == 0):
                raise TypeError(getattr(__builtin__, 'type')(product_search_queries))
        self.__product_search_queries = product_search_queries

    def __eq__(self, other):
        if self.logo_image_file_path != other.logo_image_file_path:
            return False
        if self.magento_store_url != other.magento_store_url:
            return False
        if self.product_csv_file_path != other.product_csv_file_path:
            return False
        if self.product_csv_mtime != other.product_csv_mtime:
            return False
        if self.product_search_queries != other.product_search_queries:
            return False
        return True

    def __hash__(self):
        return hash((self.logo_image_file_path,self.magento_store_url,self.product_csv_file_path,self.product_csv_mtime,self.product_search_queries,))

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        if self.logo_image_file_path is not None:
            field_reprs.append('logo_image_file_path=' + "'" + self.logo_image_file_path.encode('ascii', 'replace') + "'")
        if self.magento_store_url is not None:
            field_reprs.append('magento_store_url=' + "'" + self.magento_store_url.encode('ascii', 'replace') + "'")
        if self.product_csv_file_path is not None:
            field_reprs.append('product_csv_file_path=' + "'" + self.product_csv_file_path.encode('ascii', 'replace') + "'")
        if self.product_csv_mtime is not None:
            field_reprs.append('product_csv_mtime=' + repr(self.product_csv_mtime))
        if self.product_search_queries is not None:
            field_reprs.append('product_search_queries=' + repr(self.product_search_queries))
        return 'UserSettings(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        if self.logo_image_file_path is not None:
            field_reprs.append('logo_image_file_path=' + "'" + self.logo_image_file_path.encode('ascii', 'replace') + "'")
        if self.magento_store_url is not None:
            field_reprs.append('magento_store_url=' + "'" + self.magento_store_url.encode('ascii', 'replace') + "'")
        if self.product_csv_file_path is not None:
            field_reprs.append('product_csv_file_path=' + "'" + self.product_csv_file_path.encode('ascii', 'replace') + "'")
        if self.product_csv_mtime is not None:
            field_reprs.append('product_csv_mtime=' + repr(self.product_csv_mtime))
        if self.product_search_queries is not None:
            field_reprs.append('product_search_queries=' + repr(self.product_search_queries))
        return 'UserSettings(' + ', '.join(field_reprs) + ')'

    def as_dict(self):
        return {'logo_image_file_path': self.logo_image_file_path, 'magento_store_url': self.magento_store_url, 'product_csv_file_path': self.product_csv_file_path, 'product_csv_mtime': self.product_csv_mtime, 'product_search_queries': self.product_search_queries}

    @property
    def logo_image_file_path(self):
        return self.__logo_image_file_path

    @property
    def magento_store_url(self):
        return self.__magento_store_url

    @property
    def product_csv_file_path(self):
        return self.__product_csv_file_path

    @property
    def product_csv_mtime(self):
        return self.__product_csv_mtime

    @property
    def product_search_queries(self):
        return self.__product_search_queries

    @classmethod
    def read(cls, iprot):
        init_kwds = {}

        iprot.readStructBegin()
        while True:
            ifield_name, ifield_type, _ifield_id = iprot.readFieldBegin()
            if ifield_type == 0: # STOP
                break
            elif ifield_name == 'logo_image_file_path':
                try:
                    init_kwds['logo_image_file_path'] = iprot.readString()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'magento_store_url':
                try:
                    init_kwds['magento_store_url'] = iprot.readString()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'product_csv_file_path':
                try:
                    init_kwds['product_csv_file_path'] = iprot.readString()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'product_csv_mtime':
                try:
                    init_kwds['product_csv_mtime'] = iprot.readDateTime() if hasattr(iprot, 'readDateTime') else datetime.fromtimestamp(iprot.readI64() / 1000.0)
                except (TypeError,):
                    pass
            elif ifield_name == 'product_search_queries':
                init_kwds['product_search_queries'] = tuple([iprot.readString() for _ in xrange(iprot.readListBegin()[1])] + (iprot.readListEnd() is None and []))
            iprot.readFieldEnd()
        iprot.readStructEnd()

        return cls(**init_kwds)

    def replace(self, logo_image_file_path=None, magento_store_url=None, product_csv_file_path=None, product_csv_mtime=None, product_search_queries=None):
        if logo_image_file_path is None:
            logo_image_file_path = self.logo_image_file_path
        if magento_store_url is None:
            magento_store_url = self.magento_store_url
        if product_csv_file_path is None:
            product_csv_file_path = self.product_csv_file_path
        if product_csv_mtime is None:
            product_csv_mtime = self.product_csv_mtime
        if product_search_queries is None:
            product_search_queries = self.product_search_queries
        return self.__class__(logo_image_file_path=logo_image_file_path, magento_store_url=magento_store_url, product_csv_file_path=product_csv_file_path, product_csv_mtime=product_csv_mtime, product_search_queries=product_search_queries)

    def write(self, oprot):
        oprot.writeStructBegin('UserSettings')

        if self.logo_image_file_path is not None:
            oprot.writeFieldBegin('logo_image_file_path', 11, -1)
            oprot.writeString(self.logo_image_file_path)
            oprot.writeFieldEnd()

        if self.magento_store_url is not None:
            oprot.writeFieldBegin('magento_store_url', 11, -1)
            oprot.writeString(self.magento_store_url)
            oprot.writeFieldEnd()

        if self.product_csv_file_path is not None:
            oprot.writeFieldBegin('product_csv_file_path', 11, -1)
            oprot.writeString(self.product_csv_file_path)
            oprot.writeFieldEnd()

        if self.product_csv_mtime is not None:
            oprot.writeFieldBegin('product_csv_mtime', 12, -1)
            oprot.writeDateTime(self.product_csv_mtime) if hasattr(oprot, 'writeDateTime') else oprot.writeI64(long(mktime(self.product_csv_mtime.timetuple())) * 1000l)
            oprot.writeFieldEnd()

        if self.product_search_queries is not None:
            oprot.writeFieldBegin('product_search_queries', 15, -1)
            oprot.writeListBegin(11, len(self.product_search_queries))
            for _0 in self.product_search_queries:
                oprot.writeString(_0)
            oprot.writeListEnd()
            oprot.writeFieldEnd()

        oprot.writeFieldStop()

        oprot.writeStructEnd()

        return self
