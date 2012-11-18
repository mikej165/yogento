from itertools import ifilterfalse
import __builtin__
import yogento.api.models.catalog.product.magento.magento_product_image_type


class MagentoProductImage(object):
    class Builder:
        def __init__(
            self,
            file,
            exclude=None,
            label=None,
            position=None,
            types=None,
            url=None
        ):
            self.__exclude = exclude
            self.__file = file
            self.__label = label
            self.__position = position
            self.__types = types
            self.__url = url

        def build(self):
            return MagentoProductImage(exclude=self.__exclude, file=self.__file, label=self.__label, position=self.__position, types=self.__types, url=self.__url)

        def set_exclude(self, exclude):
            self.__exclude = exclude
            return self

        def set_file(self, file):
            self.__file = file
            return self

        def set_label(self, label):
            self.__label = label
            return self

        def set_position(self, position):
            self.__position = position
            return self

        def set_types(self, types):
            self.__types = types
            return self

        def set_url(self, url):
            self.__url = url
            return self

        def update(self, magento_product_image):
            if isinstance(magento_product_image, MagentoProductImage):
                self.set_exclude(magento_product_image.exclude)
                self.set_file(magento_product_image.file)
                self.set_label(magento_product_image.label)
                self.set_position(magento_product_image.position)
                self.set_types(magento_product_image.types)
                self.set_url(magento_product_image.url)
            elif isinstance(magento_product_image, dict):
                for key, value in magento_product_image.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(magento_product_image)
            return self

    def __init__(
        self,
        file,
        exclude=None,
        label=None,
        position=None,
        types=None,
        url=None
    ):
        if exclude is not None:
            if not isinstance(exclude, bool):
                raise TypeError(getattr(__builtin__, 'type')(exclude))
        self.__exclude = exclude

        if file is None:
            raise ValueError('file is required')
        if not isinstance(file, basestring):
            raise TypeError(getattr(__builtin__, 'type')(file))
        self.__file = file

        if label is not None:
            if not isinstance(label, basestring):
                raise TypeError(getattr(__builtin__, 'type')(label))
        self.__label = label

        if position is not None:
            if not isinstance(position, int):
                raise TypeError(getattr(__builtin__, 'type')(position))
        self.__position = position

        if types is not None:
            if not (isinstance(types, frozenset) and len(list(ifilterfalse(lambda _: isinstance(_, yogento.api.models.catalog.product.magento.magento_product_image_type.MagentoProductImageType), types))) == 0):
                raise TypeError(getattr(__builtin__, 'type')(types))
        self.__types = types

        if url is not None:
            if not isinstance(url, basestring):
                raise TypeError(getattr(__builtin__, 'type')(url))
        self.__url = url

    def __eq__(self, other):
        if self.exclude != other.exclude:
            return False
        if self.file != other.file:
            return False
        if self.label != other.label:
            return False
        if self.position != other.position:
            return False
        if self.types != other.types:
            return False
        if self.url != other.url:
            return False
        return True

    def __hash__(self):
        return hash((self.exclude,self.file,self.label,self.position,self.types,self.url,))

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        if self.exclude is not None:
            field_reprs.append('exclude=' + repr(self.exclude))
        field_reprs.append('file=' + "'" + self.file.encode('ascii', 'replace') + "'")
        if self.label is not None:
            field_reprs.append('label=' + "'" + self.label.encode('ascii', 'replace') + "'")
        if self.position is not None:
            field_reprs.append('position=' + repr(self.position))
        if self.types is not None:
            field_reprs.append('types=' + repr(self.types))
        if self.url is not None:
            field_reprs.append('url=' + "'" + self.url.encode('ascii', 'replace') + "'")
        return 'MagentoProductImage(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        if self.exclude is not None:
            field_reprs.append('exclude=' + repr(self.exclude))
        field_reprs.append('file=' + "'" + self.file.encode('ascii', 'replace') + "'")
        if self.label is not None:
            field_reprs.append('label=' + "'" + self.label.encode('ascii', 'replace') + "'")
        if self.position is not None:
            field_reprs.append('position=' + repr(self.position))
        if self.types is not None:
            field_reprs.append('types=' + repr(self.types))
        if self.url is not None:
            field_reprs.append('url=' + "'" + self.url.encode('ascii', 'replace') + "'")
        return 'MagentoProductImage(' + ', '.join(field_reprs) + ')'

    def as_dict(self):
        return {'exclude': self.exclude, 'file': self.file, 'label': self.label, 'position': self.position, 'types': self.types, 'url': self.url}

    @property
    def exclude(self):
        return self.__exclude

    @property
    def file(self):
        return self.__file

    @property
    def label(self):
        return self.__label

    @property
    def position(self):
        return self.__position

    @classmethod
    def read(cls, iprot):
        init_kwds = {}

        iprot.readStructBegin()
        while True:
            ifield_name, ifield_type, _ifield_id = iprot.readFieldBegin()
            if ifield_type == 0: # STOP
                break
            elif ifield_name == 'exclude':
                try:
                    init_kwds['exclude'] = iprot.readBool()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'file':
                init_kwds['file'] = iprot.readString()
            elif ifield_name == 'label':
                try:
                    init_kwds['label'] = iprot.readString()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'position':
                try:
                    init_kwds['position'] = iprot.readI32()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'types':
                init_kwds['types'] = frozenset([yogento.api.models.catalog.product.magento.magento_product_image_type.MagentoProductImageType.value_of(iprot.readString().strip().upper()) for _ in xrange(iprot.readSetBegin()[1])] + (iprot.readSetEnd() is None and []))
            elif ifield_name == 'url':
                try:
                    init_kwds['url'] = iprot.readString()
                except (TypeError, ValueError,):
                    pass
            iprot.readFieldEnd()
        iprot.readStructEnd()

        return cls(**init_kwds)

    def replace(self, exclude=None, file=None, label=None, position=None, types=None, url=None):
        if exclude is None:
            exclude = self.exclude
        if file is None:
            file = self.file
        if label is None:
            label = self.label
        if position is None:
            position = self.position
        if types is None:
            types = self.types
        if url is None:
            url = self.url
        return self.__class__(exclude=exclude, file=file, label=label, position=position, types=types, url=url)

    @property
    def types(self):
        return self.__types

    @property
    def url(self):
        return self.__url

    def write(self, oprot):
        oprot.writeStructBegin('MagentoProductImage')

        if self.exclude is not None:
            oprot.writeFieldBegin('exclude', 2, -1)
            oprot.writeBool(self.exclude)
            oprot.writeFieldEnd()

        oprot.writeFieldBegin('file', 11, -1)
        oprot.writeString(self.file)
        oprot.writeFieldEnd()

        if self.label is not None:
            oprot.writeFieldBegin('label', 11, -1)
            oprot.writeString(self.label)
            oprot.writeFieldEnd()

        if self.position is not None:
            oprot.writeFieldBegin('position', 8, -1)
            oprot.writeI32(self.position)
            oprot.writeFieldEnd()

        if self.types is not None:
            oprot.writeFieldBegin('types', 14, -1)
            oprot.writeSetBegin(11, len(self.types))
            for _0 in self.types:
                oprot.writeString([attr for attr in dir(yogento.api.models.catalog.product.magento.magento_product_image_type.MagentoProductImageType) if getattr(yogento.api.models.catalog.product.magento.magento_product_image_type.MagentoProductImageType, attr) == _0][0])
            oprot.writeSetEnd()
            oprot.writeFieldEnd()

        if self.url is not None:
            oprot.writeFieldBegin('url', 11, -1)
            oprot.writeString(self.url)
            oprot.writeFieldEnd()

        oprot.writeFieldStop()

        oprot.writeStructEnd()
