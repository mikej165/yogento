class DateTime(object):
    class Builder:
        def __init__(
            self,
            timestamp_ms
        ):
            self.__timestamp_ms = timestamp_ms

        def build(self):
            return DateTime(timestamp_ms=self.__timestamp_ms)

        def set_timestamp_ms(self, timestamp_ms):
            self.__timestamp_ms = timestamp_ms
            return self

        def update(self, date_time):
            if isinstance(date_time, DateTime):
                self.set_timestamp_ms(date_time.timestamp_ms)
            elif isinstance(date_time, dict):
                for key, value in date_time.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(date_time)
            return self

    def __init__(
        self,
        timestamp_ms
    ):
        if timestamp_ms is None:
            raise ValueError('timestamp_ms is required')
        if not isinstance(timestamp_ms, (int, long)):
            raise TypeError(getattr(__builtin__, 'type')(timestamp_ms))
        self.__timestamp_ms = timestamp_ms

    def __eq__(self, other):
        if self.timestamp_ms != other.timestamp_ms:
            return False
        return True

    def __hash__(self):
        return hash(self.timestamp_ms)

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        field_reprs.append('timestamp_ms=' + repr(self.timestamp_ms))
        return 'DateTime(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        field_reprs.append('timestamp_ms=' + repr(self.timestamp_ms))
        return 'DateTime(' + ', '.join(field_reprs) + ')'

    def as_dict(self):
        return {'timestamp_ms': self.timestamp_ms}

    @classmethod
    def read(cls, iprot):
        init_kwds = {}

        iprot.readStructBegin()
        while True:
            ifield_name, ifield_type, _ifield_id = iprot.readFieldBegin()
            if ifield_type == 0: # STOP
                break
            elif ifield_name == 'timestamp_ms':
                init_kwds['timestamp_ms'] = iprot.readI64()
            iprot.readFieldEnd()
        iprot.readStructEnd()

        return cls(**init_kwds)

    def replace(self, timestamp_ms=None):
        if timestamp_ms is None:
            timestamp_ms = self.timestamp_ms
        return self.__class__(timestamp_ms=timestamp_ms)

    @property
    def timestamp_ms(self):
        return self.__timestamp_ms

    def write(self, oprot):
        oprot.writeStructBegin('DateTime')

        oprot.writeFieldBegin('timestamp_ms', 10, -1)
        oprot.writeI64(self.timestamp_ms)
        oprot.writeFieldEnd()

        oprot.writeFieldStop()

        oprot.writeStructEnd()
