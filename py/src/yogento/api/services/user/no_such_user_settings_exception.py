import __builtin__


class NoSuchUserSettingsException(Exception):
    class Builder:
        def __init__(
            self,
            username
        ):
            self.__username = username

        def build(self):
            return NoSuchUserSettingsException(username=self.__username)

        def set_username(self, username):
            self.__username = username
            return self

        def update(self, no_such_user_settings_exception):
            if isinstance(no_such_user_settings_exception, NoSuchUserSettingsException):
                self.set_username(no_such_user_settings_exception.username)
            elif isinstance(no_such_user_settings_exception, dict):
                for key, value in no_such_user_settings_exception.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(no_such_user_settings_exception)
            return self

    def __init__(
        self,
        username
    ):
        if username is None:
            raise ValueError('username is required')
        if not isinstance(username, basestring):
            raise TypeError(getattr(__builtin__, 'type')(username))
        self.__username = username

    def __eq__(self, other):
        if self.username != other.username:
            return False
        return True

    def __hash__(self):
        return hash(self.username)

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        field_reprs.append('username=' + "'" + self.username.encode('ascii', 'replace') + "'")
        return 'NoSuchUserSettingsException(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        field_reprs.append('username=' + "'" + self.username.encode('ascii', 'replace') + "'")
        return 'NoSuchUserSettingsException(' + ', '.join(field_reprs) + ')'

    def as_dict(self):
        return {'username': self.username}

    @classmethod
    def read(cls, iprot):
        init_kwds = {}

        iprot.readStructBegin()
        while True:
            ifield_name, ifield_type, _ifield_id = iprot.readFieldBegin()
            if ifield_type == 0: # STOP
                break
            elif ifield_name == 'username':
                init_kwds['username'] = iprot.readString()
            iprot.readFieldEnd()
        iprot.readStructEnd()

        return cls(**init_kwds)

    def replace(self, username=None):
        if username is None:
            username = self.username
        return self.__class__(username=username)

    @property
    def username(self):
        return self.__username

    def write(self, oprot):
        oprot.writeStructBegin('NoSuchUserSettingsException')

        oprot.writeFieldBegin('username', 11, -1)
        oprot.writeString(self.username)
        oprot.writeFieldEnd()

        oprot.writeFieldStop()

        oprot.writeStructEnd()
