import __builtin__


class MailException(Exception):
    class Builder:
        def __init__(
            self,
            code,
            error
        ):
            self.__code = code
            self.__error = error

        def build(self):
            return MailException(code=self.__code, error=self.__error)

        def set_code(self, code):
            self.__code = code
            return self

        def set_error(self, error):
            self.__error = error
            return self

        def update(self, mail_exception):
            if isinstance(mail_exception, MailException):
                self.set_code(mail_exception.code)
                self.set_error(mail_exception.error)
            elif isinstance(mail_exception, dict):
                for key, value in mail_exception.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(mail_exception)
            return self

    def __init__(
        self,
        code,
        error
    ):
        if code is None:
            raise ValueError('code is required')
        if not isinstance(code, int):
            raise TypeError(getattr(__builtin__, 'type')(code))
        self.__code = code

        if error is None:
            raise ValueError('error is required')
        if not isinstance(error, basestring):
            raise TypeError(getattr(__builtin__, 'type')(error))
        self.__error = error

    def __eq__(self, other):
        if self.code != other.code:
            return False
        if self.error != other.error:
            return False
        return True

    def __hash__(self):
        return hash((self.code,self.error,))

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        field_reprs.append('code=' + repr(self.code))
        field_reprs.append('error=' + "'" + self.error.encode('ascii', 'replace') + "'")
        return 'MailException(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        field_reprs.append('code=' + repr(self.code))
        field_reprs.append('error=' + "'" + self.error.encode('ascii', 'replace') + "'")
        return 'MailException(' + ', '.join(field_reprs) + ')'

    def as_dict(self):
        return {'code': self.code, 'error': self.error}

    @property
    def code(self):
        return self.__code

    @property
    def error(self):
        return self.__error

    @classmethod
    def read(cls, iprot):
        init_kwds = {}

        iprot.readStructBegin()
        while True:
            ifield_name, ifield_type, _ifield_id = iprot.readFieldBegin()
            if ifield_type == 0: # STOP
                break
            elif ifield_name == 'code':
                init_kwds['code'] = iprot.readI32()
            elif ifield_name == 'error':
                init_kwds['error'] = iprot.readString()
            iprot.readFieldEnd()
        iprot.readStructEnd()

        return cls(**init_kwds)

    def replace(self, code=None, error=None):
        if code is None:
            code = self.code
        if error is None:
            error = self.error
        return self.__class__(code=code, error=error)

    def write(self, oprot):
        oprot.writeStructBegin('MailException')

        oprot.writeFieldBegin('code', 8, -1)
        oprot.writeI32(self.code)
        oprot.writeFieldEnd()

        oprot.writeFieldBegin('error', 11, -1)
        oprot.writeString(self.error)
        oprot.writeFieldEnd()

        oprot.writeFieldStop()

        oprot.writeStructEnd()
