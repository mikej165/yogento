import __builtin__


class ProductIoException(Exception):
    class Builder:
        def __init__(
            self,
            cause_message,
            sku
        ):
            self.__cause_message = cause_message
            self.__sku = sku

        def build(self):
            return ProductIoException(cause_message=self.__cause_message, sku=self.__sku)

        def set_cause_message(self, cause_message):
            self.__cause_message = cause_message
            return self

        def set_sku(self, sku):
            self.__sku = sku
            return self

        def update(self, product_io_exception):
            if isinstance(product_io_exception, ProductIoException):
                self.set_cause_message(product_io_exception.cause_message)
                self.set_sku(product_io_exception.sku)
            elif isinstance(product_io_exception, dict):
                for key, value in product_io_exception.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(product_io_exception)
            return self

    def __init__(
        self,
        cause_message,
        sku
    ):
        if cause_message is None:
            raise ValueError('cause_message is required')
        if not isinstance(cause_message, basestring):
            raise TypeError(getattr(__builtin__, 'type')(cause_message))
        self.__cause_message = cause_message

        if sku is None:
            raise ValueError('sku is required')
        if not isinstance(sku, basestring):
            raise TypeError(getattr(__builtin__, 'type')(sku))
        self.__sku = sku

    def __eq__(self, other):
        if self.cause_message != other.cause_message:
            return False
        if self.sku != other.sku:
            return False
        return True

    def __hash__(self):
        return hash((self.cause_message,self.sku,))

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        field_reprs.append('cause_message=' + "'" + self.cause_message.encode('ascii', 'replace') + "'")
        field_reprs.append('sku=' + "'" + self.sku.encode('ascii', 'replace') + "'")
        return 'ProductIoException(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        field_reprs.append('cause_message=' + "'" + self.cause_message.encode('ascii', 'replace') + "'")
        field_reprs.append('sku=' + "'" + self.sku.encode('ascii', 'replace') + "'")
        return 'ProductIoException(' + ', '.join(field_reprs) + ')'

    def as_dict(self):
        return {'cause_message': self.cause_message, 'sku': self.sku}

    @property
    def cause_message(self):
        return self.__cause_message

    @classmethod
    def read(cls, iprot):
        init_kwds = {}

        iprot.readStructBegin()
        while True:
            ifield_name, ifield_type, _ifield_id = iprot.readFieldBegin()
            if ifield_type == 0: # STOP
                break
            elif ifield_name == 'cause_message':
                init_kwds['cause_message'] = iprot.readString()
            elif ifield_name == 'sku':
                init_kwds['sku'] = iprot.readString()
            iprot.readFieldEnd()
        iprot.readStructEnd()

        return cls(**init_kwds)

    def replace(self, cause_message=None, sku=None):
        if cause_message is None:
            cause_message = self.cause_message
        if sku is None:
            sku = self.sku
        return self.__class__(cause_message=cause_message, sku=sku)

    @property
    def sku(self):
        return self.__sku

    def write(self, oprot):
        oprot.writeStructBegin('ProductIoException')

        oprot.writeFieldBegin('cause_message', 11, -1)
        oprot.writeString(self.cause_message)
        oprot.writeFieldEnd()

        oprot.writeFieldBegin('sku', 11, -1)
        oprot.writeString(self.sku)
        oprot.writeFieldEnd()

        oprot.writeFieldStop()

        oprot.writeStructEnd()

        return self
