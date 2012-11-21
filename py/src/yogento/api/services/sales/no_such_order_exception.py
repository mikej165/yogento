import __builtin__


class NoSuchOrderException(Exception):
    class Builder:
        def __init__(
            self,
            increment_id
        ):
            self.__increment_id = increment_id

        def build(self):
            return NoSuchOrderException(increment_id=self.__increment_id)

        def set_increment_id(self, increment_id):
            self.__increment_id = increment_id
            return self

        def update(self, no_such_order_exception):
            if isinstance(no_such_order_exception, NoSuchOrderException):
                self.set_increment_id(no_such_order_exception.increment_id)
            elif isinstance(no_such_order_exception, dict):
                for key, value in no_such_order_exception.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(no_such_order_exception)
            return self

    def __init__(
        self,
        increment_id
    ):
        if increment_id is None:
            raise ValueError('increment_id is required')
        if not isinstance(increment_id, basestring):
            raise TypeError(getattr(__builtin__, 'type')(increment_id))
        self.__increment_id = increment_id

    def __eq__(self, other):
        if self.increment_id != other.increment_id:
            return False
        return True

    def __hash__(self):
        return hash(self.increment_id)

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        field_reprs.append('increment_id=' + "'" + self.increment_id.encode('ascii', 'replace') + "'")
        return 'NoSuchOrderException(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        field_reprs.append('increment_id=' + "'" + self.increment_id.encode('ascii', 'replace') + "'")
        return 'NoSuchOrderException(' + ', '.join(field_reprs) + ')'

    def as_dict(self):
        return {'increment_id': self.increment_id}

    @property
    def increment_id(self):
        return self.__increment_id

    @classmethod
    def read(cls, iprot):
        init_kwds = {}

        iprot.readStructBegin()
        while True:
            ifield_name, ifield_type, _ifield_id = iprot.readFieldBegin()
            if ifield_type == 0: # STOP
                break
            elif ifield_name == 'increment_id':
                init_kwds['increment_id'] = iprot.readString()
            iprot.readFieldEnd()
        iprot.readStructEnd()

        return cls(**init_kwds)

    def replace(self, increment_id=None):
        if increment_id is None:
            increment_id = self.increment_id
        return self.__class__(increment_id=increment_id)

    def write(self, oprot):
        oprot.writeStructBegin('NoSuchOrderException')

        oprot.writeFieldBegin('increment_id', 11, -1)
        oprot.writeString(self.increment_id)
        oprot.writeFieldEnd()

        oprot.writeFieldStop()

        oprot.writeStructEnd()

        return self
