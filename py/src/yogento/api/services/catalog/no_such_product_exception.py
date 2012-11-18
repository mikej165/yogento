import __builtin__


class NoSuchProductException(Exception):
    class Builder:
        def __init__(
            self,
            sku
        ):
            self.__sku = sku

        def build(self):
            return NoSuchProductException(sku=self.__sku)

        def set_sku(self, sku):
            self.__sku = sku
            return self

        def update(self, no_such_product_exception):
            if isinstance(no_such_product_exception, NoSuchProductException):
                self.set_sku(no_such_product_exception.sku)
            elif isinstance(no_such_product_exception, dict):
                for key, value in no_such_product_exception.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(no_such_product_exception)
            return self

    def __init__(
        self,
        sku
    ):
        if sku is None:
            raise ValueError('sku is required')
        if not isinstance(sku, basestring):
            raise TypeError(getattr(__builtin__, 'type')(sku))
        self.__sku = sku

    def __eq__(self, other):
        if self.sku != other.sku:
            return False
        return True

    def __hash__(self):
        return hash(self.sku)

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        field_reprs.append('sku=' + "'" + self.sku.encode('ascii', 'replace') + "'")
        return 'NoSuchProductException(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        field_reprs.append('sku=' + "'" + self.sku.encode('ascii', 'replace') + "'")
        return 'NoSuchProductException(' + ', '.join(field_reprs) + ')'

    def as_dict(self):
        return {'sku': self.sku}

    @classmethod
    def read(cls, iprot):
        init_kwds = {}

        iprot.readStructBegin()
        while True:
            ifield_name, ifield_type, _ifield_id = iprot.readFieldBegin()
            if ifield_type == 0: # STOP
                break
            elif ifield_name == 'sku':
                init_kwds['sku'] = iprot.readString()
            iprot.readFieldEnd()
        iprot.readStructEnd()

        return cls(**init_kwds)

    def replace(self, sku=None):
        if sku is None:
            sku = self.sku
        return self.__class__(sku=sku)

    @property
    def sku(self):
        return self.__sku

    def write(self, oprot):
        oprot.writeStructBegin('NoSuchProductException')

        oprot.writeFieldBegin('sku', 11, -1)
        oprot.writeString(self.sku)
        oprot.writeFieldEnd()

        oprot.writeFieldStop()

        oprot.writeStructEnd()
