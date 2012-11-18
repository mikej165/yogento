from datetime import datetime
from itertools import ifilterfalse
from time import mktime
import __builtin__


class ListFilter(object):
    class Builder:
        def __init__(
            self,
            list_id=None,
            list_name=None,
            from_name=None,
            from_email=None,
            from_subject=None,
            created_before=None,
            created_after=None,
            exact=None
        ):
            self.__list_id = list_id
            self.__list_name = list_name
            self.__from_name = from_name
            self.__from_email = from_email
            self.__from_subject = from_subject
            self.__created_before = created_before
            self.__created_after = created_after
            self.__exact = exact

        def build(self):
            return ListFilter(list_id=self.__list_id, list_name=self.__list_name, from_name=self.__from_name, from_email=self.__from_email, from_subject=self.__from_subject, created_before=self.__created_before, created_after=self.__created_after, exact=self.__exact)

        def set_created_after(self, created_after):
            self.__created_after = created_after
            return self

        def set_created_before(self, created_before):
            self.__created_before = created_before
            return self

        def set_exact(self, exact):
            self.__exact = exact
            return self

        def set_from_email(self, from_email):
            self.__from_email = from_email
            return self

        def set_from_name(self, from_name):
            self.__from_name = from_name
            return self

        def set_from_subject(self, from_subject):
            self.__from_subject = from_subject
            return self

        def set_list_id(self, list_id):
            self.__list_id = list_id
            return self

        def set_list_name(self, list_name):
            self.__list_name = list_name
            return self

        def update(self, list_filter):
            if isinstance(list_filter, ListFilter):
                self.set_list_id(list_filter.list_id)
                self.set_list_name(list_filter.list_name)
                self.set_from_name(list_filter.from_name)
                self.set_from_email(list_filter.from_email)
                self.set_from_subject(list_filter.from_subject)
                self.set_created_before(list_filter.created_before)
                self.set_created_after(list_filter.created_after)
                self.set_exact(list_filter.exact)
            elif isinstance(list_filter, dict):
                for key, value in list_filter.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(list_filter)
            return self

    def __init__(
        self,
        list_id=None,
        list_name=None,
        from_name=None,
        from_email=None,
        from_subject=None,
        created_before=None,
        created_after=None,
        exact=None
    ):
        if list_id is not None:
            if not (isinstance(list_id, frozenset) and len(list(ifilterfalse(lambda _: isinstance(_, basestring), list_id))) == 0):
                raise TypeError(getattr(__builtin__, 'type')(list_id))
        self.__list_id = list_id

        if list_name is not None:
            if not isinstance(list_name, basestring):
                raise TypeError(getattr(__builtin__, 'type')(list_name))
        self.__list_name = list_name

        if from_name is not None:
            if not isinstance(from_name, basestring):
                raise TypeError(getattr(__builtin__, 'type')(from_name))
        self.__from_name = from_name

        if from_email is not None:
            if not isinstance(from_email, basestring):
                raise TypeError(getattr(__builtin__, 'type')(from_email))
        self.__from_email = from_email

        if from_subject is not None:
            if not isinstance(from_subject, basestring):
                raise TypeError(getattr(__builtin__, 'type')(from_subject))
        self.__from_subject = from_subject

        if created_before is not None:
            if not isinstance(created_before, datetime):
                raise TypeError(getattr(__builtin__, 'type')(created_before))
        self.__created_before = created_before

        if created_after is not None:
            if not isinstance(created_after, datetime):
                raise TypeError(getattr(__builtin__, 'type')(created_after))
        self.__created_after = created_after

        if exact is not None:
            if not isinstance(exact, bool):
                raise TypeError(getattr(__builtin__, 'type')(exact))
        self.__exact = exact

    def __eq__(self, other):
        if self.list_id != other.list_id:
            return False
        if self.list_name != other.list_name:
            return False
        if self.from_name != other.from_name:
            return False
        if self.from_email != other.from_email:
            return False
        if self.from_subject != other.from_subject:
            return False
        if self.created_before != other.created_before:
            return False
        if self.created_after != other.created_after:
            return False
        if self.exact != other.exact:
            return False
        return True

    def __hash__(self):
        return hash((self.list_id,self.list_name,self.from_name,self.from_email,self.from_subject,self.created_before,self.created_after,self.exact,))

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        if self.list_id is not None:
            field_reprs.append('list_id=' + repr(self.list_id))
        if self.list_name is not None:
            field_reprs.append('list_name=' + "'" + self.list_name.encode('ascii', 'replace') + "'")
        if self.from_name is not None:
            field_reprs.append('from_name=' + "'" + self.from_name.encode('ascii', 'replace') + "'")
        if self.from_email is not None:
            field_reprs.append('from_email=' + "'" + self.from_email.encode('ascii', 'replace') + "'")
        if self.from_subject is not None:
            field_reprs.append('from_subject=' + "'" + self.from_subject.encode('ascii', 'replace') + "'")
        if self.created_before is not None:
            field_reprs.append('created_before=' + repr(self.created_before))
        if self.created_after is not None:
            field_reprs.append('created_after=' + repr(self.created_after))
        if self.exact is not None:
            field_reprs.append('exact=' + repr(self.exact))
        return 'ListFilter(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        if self.list_id is not None:
            field_reprs.append('list_id=' + repr(self.list_id))
        if self.list_name is not None:
            field_reprs.append('list_name=' + "'" + self.list_name.encode('ascii', 'replace') + "'")
        if self.from_name is not None:
            field_reprs.append('from_name=' + "'" + self.from_name.encode('ascii', 'replace') + "'")
        if self.from_email is not None:
            field_reprs.append('from_email=' + "'" + self.from_email.encode('ascii', 'replace') + "'")
        if self.from_subject is not None:
            field_reprs.append('from_subject=' + "'" + self.from_subject.encode('ascii', 'replace') + "'")
        if self.created_before is not None:
            field_reprs.append('created_before=' + repr(self.created_before))
        if self.created_after is not None:
            field_reprs.append('created_after=' + repr(self.created_after))
        if self.exact is not None:
            field_reprs.append('exact=' + repr(self.exact))
        return 'ListFilter(' + ', '.join(field_reprs) + ')'

    def as_dict(self):
        return {'list_id': self.list_id, 'list_name': self.list_name, 'from_name': self.from_name, 'from_email': self.from_email, 'from_subject': self.from_subject, 'created_before': self.created_before, 'created_after': self.created_after, 'exact': self.exact}

    @property
    def created_after(self):
        return self.__created_after

    @property
    def created_before(self):
        return self.__created_before

    @property
    def exact(self):
        return self.__exact

    @property
    def from_email(self):
        return self.__from_email

    @property
    def from_name(self):
        return self.__from_name

    @property
    def from_subject(self):
        return self.__from_subject

    @property
    def list_id(self):
        return self.__list_id

    @property
    def list_name(self):
        return self.__list_name

    @classmethod
    def read(cls, iprot):
        init_kwds = {}

        iprot.readStructBegin()
        while True:
            ifield_name, ifield_type, _ifield_id = iprot.readFieldBegin()
            if ifield_type == 0: # STOP
                break
            elif ifield_name == 'list_id':
                init_kwds['list_id'] = frozenset([iprot.readString() for _ in xrange(iprot.readSetBegin()[1])] + (iprot.readSetEnd() is None and []))
            elif ifield_name == 'list_name':
                try:
                    init_kwds['list_name'] = iprot.readString()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'from_name':
                try:
                    init_kwds['from_name'] = iprot.readString()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'from_email':
                try:
                    init_kwds['from_email'] = iprot.readString()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'from_subject':
                try:
                    init_kwds['from_subject'] = iprot.readString()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'created_before':
                try:
                    init_kwds['created_before'] = iprot.readDateTime() if hasattr(iprot, 'readDateTime') else datetime.fromtimestamp(iprot.readI64() / 1000.0)
                except (TypeError,):
                    pass
            elif ifield_name == 'created_after':
                try:
                    init_kwds['created_after'] = iprot.readDateTime() if hasattr(iprot, 'readDateTime') else datetime.fromtimestamp(iprot.readI64() / 1000.0)
                except (TypeError,):
                    pass
            elif ifield_name == 'exact':
                try:
                    init_kwds['exact'] = iprot.readBool()
                except (TypeError, ValueError,):
                    pass
            iprot.readFieldEnd()
        iprot.readStructEnd()

        return cls(**init_kwds)

    def replace(self, list_id=None, list_name=None, from_name=None, from_email=None, from_subject=None, created_before=None, created_after=None, exact=None):
        if list_id is None:
            list_id = self.list_id
        if list_name is None:
            list_name = self.list_name
        if from_name is None:
            from_name = self.from_name
        if from_email is None:
            from_email = self.from_email
        if from_subject is None:
            from_subject = self.from_subject
        if created_before is None:
            created_before = self.created_before
        if created_after is None:
            created_after = self.created_after
        if exact is None:
            exact = self.exact
        return self.__class__(list_id=list_id, list_name=list_name, from_name=from_name, from_email=from_email, from_subject=from_subject, created_before=created_before, created_after=created_after, exact=exact)

    def write(self, oprot):
        oprot.writeStructBegin('ListFilter')

        if self.list_id is not None:
            oprot.writeFieldBegin('list_id', 14, -1)
            oprot.writeSetBegin(11, len(self.list_id))
            for _0 in self.list_id:
                oprot.writeString(_0)
            oprot.writeSetEnd()
            oprot.writeFieldEnd()

        if self.list_name is not None:
            oprot.writeFieldBegin('list_name', 11, -1)
            oprot.writeString(self.list_name)
            oprot.writeFieldEnd()

        if self.from_name is not None:
            oprot.writeFieldBegin('from_name', 11, -1)
            oprot.writeString(self.from_name)
            oprot.writeFieldEnd()

        if self.from_email is not None:
            oprot.writeFieldBegin('from_email', 11, -1)
            oprot.writeString(self.from_email)
            oprot.writeFieldEnd()

        if self.from_subject is not None:
            oprot.writeFieldBegin('from_subject', 11, -1)
            oprot.writeString(self.from_subject)
            oprot.writeFieldEnd()

        if self.created_before is not None:
            oprot.writeFieldBegin('created_before', 12, -1)
            oprot.writeDateTime(self.created_before) if hasattr(oprot, 'writeDateTime') else oprot.writeI64(long(mktime(self.created_before.timetuple())) * 1000l)
            oprot.writeFieldEnd()

        if self.created_after is not None:
            oprot.writeFieldBegin('created_after', 12, -1)
            oprot.writeDateTime(self.created_after) if hasattr(oprot, 'writeDateTime') else oprot.writeI64(long(mktime(self.created_after.timetuple())) * 1000l)
            oprot.writeFieldEnd()

        if self.exact is not None:
            oprot.writeFieldBegin('exact', 2, -1)
            oprot.writeBool(self.exact)
            oprot.writeFieldEnd()

        oprot.writeFieldStop()

        oprot.writeStructEnd()
