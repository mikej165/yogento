import __builtin__


class UserSettingsIoException(Exception):
    class Builder:
        def __init__(
            self,
            cause_message
        ):
            self.__cause_message = cause_message

        def build(self):
            return UserSettingsIoException(cause_message=self.__cause_message)

        def set_cause_message(self, cause_message):
            self.__cause_message = cause_message
            return self

        def update(self, user_settings_io_exception):
            if isinstance(user_settings_io_exception, UserSettingsIoException):
                self.set_cause_message(user_settings_io_exception.cause_message)
            elif isinstance(user_settings_io_exception, dict):
                for key, value in user_settings_io_exception.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(user_settings_io_exception)
            return self

    def __init__(
        self,
        cause_message
    ):
        if cause_message is None:
            raise ValueError('cause_message is required')
        if not isinstance(cause_message, basestring):
            raise TypeError(getattr(__builtin__, 'type')(cause_message))
        self.__cause_message = cause_message

    def __eq__(self, other):
        if self.cause_message != other.cause_message:
            return False
        return True

    def __hash__(self):
        return hash(self.cause_message)

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        field_reprs.append('cause_message=' + "'" + self.cause_message.encode('ascii', 'replace') + "'")
        return 'UserSettingsIoException(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        field_reprs.append('cause_message=' + "'" + self.cause_message.encode('ascii', 'replace') + "'")
        return 'UserSettingsIoException(' + ', '.join(field_reprs) + ')'

    def as_dict(self):
        return {'cause_message': self.cause_message}

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
            iprot.readFieldEnd()
        iprot.readStructEnd()

        return cls(**init_kwds)

    def replace(self, cause_message=None):
        if cause_message is None:
            cause_message = self.cause_message
        return self.__class__(cause_message=cause_message)

    def write(self, oprot):
        oprot.writeStructBegin('UserSettingsIoException')

        oprot.writeFieldBegin('cause_message', 11, -1)
        oprot.writeString(self.cause_message)
        oprot.writeFieldEnd()

        oprot.writeFieldStop()

        oprot.writeStructEnd()

        return self
