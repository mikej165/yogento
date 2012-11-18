class Decimal(object):
    class Builder:
        def __init__(
            self,
            value
        ):
            self.__value = value

        def build(self):
            return Decimal(value=self.__value)

        def set_value(self, value):
            self.__value = value
            return self

        def update(self, decimal):
            if isinstance(decimal, Decimal):
                self.set_value(decimal.value)
            elif isinstance(decimal, dict):
                for key, value in decimal.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(decimal)
            return self

    def __init__(
        self,
        value
    ):
        if value is None:
            raise ValueError('value is required')
        if not isinstance(value, basestring):
            raise TypeError(getattr(__builtin__, 'type')(value))
        self.__value = value

    def __eq__(self, other):
        if self.value != other.value:
            return False
        return True

    def __hash__(self):
        return hash(self.value)

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        field_reprs.append('value=' + "'" + self.value.encode('ascii', 'replace') + "'")
        return 'Decimal(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        field_reprs.append('value=' + "'" + self.value.encode('ascii', 'replace') + "'")
        return 'Decimal(' + ', '.join(field_reprs) + ')'

    def as_dict(self):
        return {'value': self.value}

    @classmethod
    def read(cls, iprot):
        init_kwds = {}

        iprot.readStructBegin()
        while True:
            ifield_name, ifield_type, _ifield_id = iprot.readFieldBegin()
            if ifield_type == 0: # STOP
                break
            elif ifield_name == 'value':
                init_kwds['value'] = iprot.readString()
            iprot.readFieldEnd()
        iprot.readStructEnd()

        return cls(**init_kwds)

    def replace(self, value=None):
        if value is None:
            value = self.value
        return self.__class__(value=value)

    @property
    def value(self):
        return self.__value

    def write(self, oprot):
        oprot.writeStructBegin('Decimal')

        oprot.writeFieldBegin('value', 11, -1)
        oprot.writeString(self.value)
        oprot.writeFieldEnd()

        oprot.writeFieldStop()

        oprot.writeStructEnd()
