from datetime import datetime
from itertools import ifilterfalse
from time import mktime
import __builtin__


class User(object):
    class Builder:
        def __init__(
            self,
            ctime,
            password,
            roles,
            username,
            display_name=None,
            email=None
        ):
            self.__ctime = ctime
            self.__display_name = display_name
            self.__email = email
            self.__password = password
            self.__roles = roles
            self.__username = username

        def build(self):
            return User(ctime=self.__ctime, display_name=self.__display_name, email=self.__email, password=self.__password, roles=self.__roles, username=self.__username)

        def set_ctime(self, ctime):
            self.__ctime = ctime
            return self

        def set_display_name(self, display_name):
            self.__display_name = display_name
            return self

        def set_email(self, email):
            self.__email = email
            return self

        def set_password(self, password):
            self.__password = password
            return self

        def set_roles(self, roles):
            self.__roles = roles
            return self

        def set_username(self, username):
            self.__username = username
            return self

        def update(self, user):
            if isinstance(user, User):
                self.set_ctime(user.ctime)
                self.set_display_name(user.display_name)
                self.set_email(user.email)
                self.set_password(user.password)
                self.set_roles(user.roles)
                self.set_username(user.username)
            elif isinstance(user, dict):
                for key, value in user.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(user)
            return self

    def __init__(
        self,
        ctime,
        password,
        roles,
        username,
        display_name=None,
        email=None
    ):
        if ctime is None:
            raise ValueError('ctime is required')
        if not isinstance(ctime, datetime):
            raise TypeError(getattr(__builtin__, 'type')(ctime))
        self.__ctime = ctime

        if display_name is not None:
            if not isinstance(display_name, basestring):
                raise TypeError(getattr(__builtin__, 'type')(display_name))
        self.__display_name = display_name

        if email is not None:
            if not isinstance(email, basestring):
                raise TypeError(getattr(__builtin__, 'type')(email))
        self.__email = email

        if password is None:
            raise ValueError('password is required')
        if not isinstance(password, basestring):
            raise TypeError(getattr(__builtin__, 'type')(password))
        self.__password = password

        if roles is None:
            raise ValueError('roles is required')
        if not (isinstance(roles, frozenset) and len(list(ifilterfalse(lambda _: isinstance(_, basestring), roles))) == 0):
            raise TypeError(getattr(__builtin__, 'type')(roles))
        self.__roles = roles

        if username is None:
            raise ValueError('username is required')
        if not isinstance(username, basestring):
            raise TypeError(getattr(__builtin__, 'type')(username))
        self.__username = username

    def __eq__(self, other):
        if self.ctime != other.ctime:
            return False
        if self.display_name != other.display_name:
            return False
        if self.email != other.email:
            return False
        if self.password != other.password:
            return False
        if self.roles != other.roles:
            return False
        if self.username != other.username:
            return False
        return True

    def __hash__(self):
        return hash((self.ctime,self.display_name,self.email,self.password,self.roles,self.username,))

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        field_reprs.append('ctime=' + repr(self.ctime))
        if self.display_name is not None:
            field_reprs.append('display_name=' + "'" + self.display_name.encode('ascii', 'replace') + "'")
        if self.email is not None:
            field_reprs.append('email=' + "'" + self.email.encode('ascii', 'replace') + "'")
        field_reprs.append('password=' + "'" + self.password.encode('ascii', 'replace') + "'")
        field_reprs.append('roles=' + repr(self.roles))
        field_reprs.append('username=' + "'" + self.username.encode('ascii', 'replace') + "'")
        return 'User(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        field_reprs.append('ctime=' + repr(self.ctime))
        if self.display_name is not None:
            field_reprs.append('display_name=' + "'" + self.display_name.encode('ascii', 'replace') + "'")
        if self.email is not None:
            field_reprs.append('email=' + "'" + self.email.encode('ascii', 'replace') + "'")
        field_reprs.append('password=' + "'" + self.password.encode('ascii', 'replace') + "'")
        field_reprs.append('roles=' + repr(self.roles))
        field_reprs.append('username=' + "'" + self.username.encode('ascii', 'replace') + "'")
        return 'User(' + ', '.join(field_reprs) + ')'

    def as_dict(self):
        return {'ctime': self.ctime, 'display_name': self.display_name, 'email': self.email, 'password': self.password, 'roles': self.roles, 'username': self.username}

    @property
    def ctime(self):
        return self.__ctime

    @property
    def display_name(self):
        return self.__display_name

    @property
    def email(self):
        return self.__email

    @property
    def password(self):
        return self.__password

    @classmethod
    def read(cls, iprot):
        init_kwds = {}

        iprot.readStructBegin()
        while True:
            ifield_name, ifield_type, _ifield_id = iprot.readFieldBegin()
            if ifield_type == 0: # STOP
                break
            elif ifield_name == 'ctime':
                init_kwds['ctime'] = iprot.readDateTime() if hasattr(iprot, 'readDateTime') else datetime.fromtimestamp(iprot.readI64() / 1000.0)
            elif ifield_name == 'display_name':
                try:
                    init_kwds['display_name'] = iprot.readString()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'email':
                try:
                    init_kwds['email'] = iprot.readString()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'password':
                init_kwds['password'] = iprot.readString()
            elif ifield_name == 'roles':
                init_kwds['roles'] = frozenset([iprot.readString() for _ in xrange(iprot.readSetBegin()[1])] + (iprot.readSetEnd() is None and []))
            elif ifield_name == 'username':
                init_kwds['username'] = iprot.readString()
            iprot.readFieldEnd()
        iprot.readStructEnd()

        return cls(**init_kwds)

    def replace(self, ctime=None, display_name=None, email=None, password=None, roles=None, username=None):
        if ctime is None:
            ctime = self.ctime
        if display_name is None:
            display_name = self.display_name
        if email is None:
            email = self.email
        if password is None:
            password = self.password
        if roles is None:
            roles = self.roles
        if username is None:
            username = self.username
        return self.__class__(ctime=ctime, display_name=display_name, email=email, password=password, roles=roles, username=username)

    @property
    def roles(self):
        return self.__roles

    @property
    def username(self):
        return self.__username

    def write(self, oprot):
        oprot.writeStructBegin('User')

        oprot.writeFieldBegin('ctime', 12, -1)
        oprot.writeDateTime(self.ctime) if hasattr(oprot, 'writeDateTime') else oprot.writeI64(long(mktime(self.ctime.timetuple())) * 1000l)
        oprot.writeFieldEnd()

        if self.display_name is not None:
            oprot.writeFieldBegin('display_name', 11, -1)
            oprot.writeString(self.display_name)
            oprot.writeFieldEnd()

        if self.email is not None:
            oprot.writeFieldBegin('email', 11, -1)
            oprot.writeString(self.email)
            oprot.writeFieldEnd()

        oprot.writeFieldBegin('password', 11, -1)
        oprot.writeString(self.password)
        oprot.writeFieldEnd()

        oprot.writeFieldBegin('roles', 14, -1)
        oprot.writeSetBegin(11, len(self.roles))
        for _0 in self.roles:
            oprot.writeString(_0)
        oprot.writeSetEnd()
        oprot.writeFieldEnd()

        oprot.writeFieldBegin('username', 11, -1)
        oprot.writeString(self.username)
        oprot.writeFieldEnd()

        oprot.writeFieldStop()

        oprot.writeStructEnd()
