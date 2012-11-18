from datetime import datetime
from time import mktime
import __builtin__


class List(object):
    class Builder:
        def __init__(
            self,
            id=None,
            web_id=None,
            name=None,
            date_created=None,
            email_type_option=None,
            use_awesomebar=None,
            default_from_name=None,
            default_from_email=None,
            default_subject=None,
            default_language=None,
            list_rating=None,
            subscribe_url_short=None,
            subscribe_url_long=None,
            beamer_address=None,
            visibility=None
        ):
            self.__id = id
            self.__web_id = web_id
            self.__name = name
            self.__date_created = date_created
            self.__email_type_option = email_type_option
            self.__use_awesomebar = use_awesomebar
            self.__default_from_name = default_from_name
            self.__default_from_email = default_from_email
            self.__default_subject = default_subject
            self.__default_language = default_language
            self.__list_rating = list_rating
            self.__subscribe_url_short = subscribe_url_short
            self.__subscribe_url_long = subscribe_url_long
            self.__beamer_address = beamer_address
            self.__visibility = visibility

        def build(self):
            return List(id=self.__id, web_id=self.__web_id, name=self.__name, date_created=self.__date_created, email_type_option=self.__email_type_option, use_awesomebar=self.__use_awesomebar, default_from_name=self.__default_from_name, default_from_email=self.__default_from_email, default_subject=self.__default_subject, default_language=self.__default_language, list_rating=self.__list_rating, subscribe_url_short=self.__subscribe_url_short, subscribe_url_long=self.__subscribe_url_long, beamer_address=self.__beamer_address, visibility=self.__visibility)

        def set_beamer_address(self, beamer_address):
            self.__beamer_address = beamer_address
            return self

        def set_date_created(self, date_created):
            self.__date_created = date_created
            return self

        def set_default_from_email(self, default_from_email):
            self.__default_from_email = default_from_email
            return self

        def set_default_from_name(self, default_from_name):
            self.__default_from_name = default_from_name
            return self

        def set_default_language(self, default_language):
            self.__default_language = default_language
            return self

        def set_default_subject(self, default_subject):
            self.__default_subject = default_subject
            return self

        def set_email_type_option(self, email_type_option):
            self.__email_type_option = email_type_option
            return self

        def set_id(self, id):
            self.__id = id
            return self

        def set_list_rating(self, list_rating):
            self.__list_rating = list_rating
            return self

        def set_name(self, name):
            self.__name = name
            return self

        def set_subscribe_url_long(self, subscribe_url_long):
            self.__subscribe_url_long = subscribe_url_long
            return self

        def set_subscribe_url_short(self, subscribe_url_short):
            self.__subscribe_url_short = subscribe_url_short
            return self

        def set_use_awesomebar(self, use_awesomebar):
            self.__use_awesomebar = use_awesomebar
            return self

        def set_visibility(self, visibility):
            self.__visibility = visibility
            return self

        def set_web_id(self, web_id):
            self.__web_id = web_id
            return self

        def update(self, list):
            if isinstance(list, List):
                self.set_id(list.id)
                self.set_web_id(list.web_id)
                self.set_name(list.name)
                self.set_date_created(list.date_created)
                self.set_email_type_option(list.email_type_option)
                self.set_use_awesomebar(list.use_awesomebar)
                self.set_default_from_name(list.default_from_name)
                self.set_default_from_email(list.default_from_email)
                self.set_default_subject(list.default_subject)
                self.set_default_language(list.default_language)
                self.set_list_rating(list.list_rating)
                self.set_subscribe_url_short(list.subscribe_url_short)
                self.set_subscribe_url_long(list.subscribe_url_long)
                self.set_beamer_address(list.beamer_address)
                self.set_visibility(list.visibility)
            elif isinstance(list, dict):
                for key, value in list.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(list)
            return self

    def __init__(
        self,
        id=None,
        web_id=None,
        name=None,
        date_created=None,
        email_type_option=None,
        use_awesomebar=None,
        default_from_name=None,
        default_from_email=None,
        default_subject=None,
        default_language=None,
        list_rating=None,
        subscribe_url_short=None,
        subscribe_url_long=None,
        beamer_address=None,
        visibility=None
    ):
        if id is not None:
            if not isinstance(id, basestring):
                raise TypeError(getattr(__builtin__, 'type')(id))
        self.__id = id

        if web_id is not None:
            if not isinstance(web_id, int):
                raise TypeError(getattr(__builtin__, 'type')(web_id))
        self.__web_id = web_id

        if name is not None:
            if not isinstance(name, basestring):
                raise TypeError(getattr(__builtin__, 'type')(name))
        self.__name = name

        if date_created is not None:
            if not isinstance(date_created, datetime):
                raise TypeError(getattr(__builtin__, 'type')(date_created))
        self.__date_created = date_created

        if email_type_option is not None:
            if not isinstance(email_type_option, bool):
                raise TypeError(getattr(__builtin__, 'type')(email_type_option))
        self.__email_type_option = email_type_option

        if use_awesomebar is not None:
            if not isinstance(use_awesomebar, bool):
                raise TypeError(getattr(__builtin__, 'type')(use_awesomebar))
        self.__use_awesomebar = use_awesomebar

        if default_from_name is not None:
            if not isinstance(default_from_name, basestring):
                raise TypeError(getattr(__builtin__, 'type')(default_from_name))
        self.__default_from_name = default_from_name

        if default_from_email is not None:
            if not isinstance(default_from_email, basestring):
                raise TypeError(getattr(__builtin__, 'type')(default_from_email))
        self.__default_from_email = default_from_email

        if default_subject is not None:
            if not isinstance(default_subject, basestring):
                raise TypeError(getattr(__builtin__, 'type')(default_subject))
        self.__default_subject = default_subject

        if default_language is not None:
            if not isinstance(default_language, basestring):
                raise TypeError(getattr(__builtin__, 'type')(default_language))
        self.__default_language = default_language

        if list_rating is not None:
            if not isinstance(list_rating, int):
                raise TypeError(getattr(__builtin__, 'type')(list_rating))
        self.__list_rating = list_rating

        if subscribe_url_short is not None:
            if not isinstance(subscribe_url_short, basestring):
                raise TypeError(getattr(__builtin__, 'type')(subscribe_url_short))
        self.__subscribe_url_short = subscribe_url_short

        if subscribe_url_long is not None:
            if not isinstance(subscribe_url_long, basestring):
                raise TypeError(getattr(__builtin__, 'type')(subscribe_url_long))
        self.__subscribe_url_long = subscribe_url_long

        if beamer_address is not None:
            if not isinstance(beamer_address, basestring):
                raise TypeError(getattr(__builtin__, 'type')(beamer_address))
        self.__beamer_address = beamer_address

        if visibility is not None:
            if not isinstance(visibility, basestring):
                raise TypeError(getattr(__builtin__, 'type')(visibility))
        self.__visibility = visibility

    def __eq__(self, other):
        if self.id != other.id:
            return False
        if self.web_id != other.web_id:
            return False
        if self.name != other.name:
            return False
        if self.date_created != other.date_created:
            return False
        if self.email_type_option != other.email_type_option:
            return False
        if self.use_awesomebar != other.use_awesomebar:
            return False
        if self.default_from_name != other.default_from_name:
            return False
        if self.default_from_email != other.default_from_email:
            return False
        if self.default_subject != other.default_subject:
            return False
        if self.default_language != other.default_language:
            return False
        if self.list_rating != other.list_rating:
            return False
        if self.subscribe_url_short != other.subscribe_url_short:
            return False
        if self.subscribe_url_long != other.subscribe_url_long:
            return False
        if self.beamer_address != other.beamer_address:
            return False
        if self.visibility != other.visibility:
            return False
        return True

    def __hash__(self):
        return hash((self.id,self.web_id,self.name,self.date_created,self.email_type_option,self.use_awesomebar,self.default_from_name,self.default_from_email,self.default_subject,self.default_language,self.list_rating,self.subscribe_url_short,self.subscribe_url_long,self.beamer_address,self.visibility,))

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        if self.id is not None:
            field_reprs.append('id=' + "'" + self.id.encode('ascii', 'replace') + "'")
        if self.web_id is not None:
            field_reprs.append('web_id=' + repr(self.web_id))
        if self.name is not None:
            field_reprs.append('name=' + "'" + self.name.encode('ascii', 'replace') + "'")
        if self.date_created is not None:
            field_reprs.append('date_created=' + repr(self.date_created))
        if self.email_type_option is not None:
            field_reprs.append('email_type_option=' + repr(self.email_type_option))
        if self.use_awesomebar is not None:
            field_reprs.append('use_awesomebar=' + repr(self.use_awesomebar))
        if self.default_from_name is not None:
            field_reprs.append('default_from_name=' + "'" + self.default_from_name.encode('ascii', 'replace') + "'")
        if self.default_from_email is not None:
            field_reprs.append('default_from_email=' + "'" + self.default_from_email.encode('ascii', 'replace') + "'")
        if self.default_subject is not None:
            field_reprs.append('default_subject=' + "'" + self.default_subject.encode('ascii', 'replace') + "'")
        if self.default_language is not None:
            field_reprs.append('default_language=' + "'" + self.default_language.encode('ascii', 'replace') + "'")
        if self.list_rating is not None:
            field_reprs.append('list_rating=' + repr(self.list_rating))
        if self.subscribe_url_short is not None:
            field_reprs.append('subscribe_url_short=' + "'" + self.subscribe_url_short.encode('ascii', 'replace') + "'")
        if self.subscribe_url_long is not None:
            field_reprs.append('subscribe_url_long=' + "'" + self.subscribe_url_long.encode('ascii', 'replace') + "'")
        if self.beamer_address is not None:
            field_reprs.append('beamer_address=' + "'" + self.beamer_address.encode('ascii', 'replace') + "'")
        if self.visibility is not None:
            field_reprs.append('visibility=' + "'" + self.visibility.encode('ascii', 'replace') + "'")
        return 'List(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        if self.id is not None:
            field_reprs.append('id=' + "'" + self.id.encode('ascii', 'replace') + "'")
        if self.web_id is not None:
            field_reprs.append('web_id=' + repr(self.web_id))
        if self.name is not None:
            field_reprs.append('name=' + "'" + self.name.encode('ascii', 'replace') + "'")
        if self.date_created is not None:
            field_reprs.append('date_created=' + repr(self.date_created))
        if self.email_type_option is not None:
            field_reprs.append('email_type_option=' + repr(self.email_type_option))
        if self.use_awesomebar is not None:
            field_reprs.append('use_awesomebar=' + repr(self.use_awesomebar))
        if self.default_from_name is not None:
            field_reprs.append('default_from_name=' + "'" + self.default_from_name.encode('ascii', 'replace') + "'")
        if self.default_from_email is not None:
            field_reprs.append('default_from_email=' + "'" + self.default_from_email.encode('ascii', 'replace') + "'")
        if self.default_subject is not None:
            field_reprs.append('default_subject=' + "'" + self.default_subject.encode('ascii', 'replace') + "'")
        if self.default_language is not None:
            field_reprs.append('default_language=' + "'" + self.default_language.encode('ascii', 'replace') + "'")
        if self.list_rating is not None:
            field_reprs.append('list_rating=' + repr(self.list_rating))
        if self.subscribe_url_short is not None:
            field_reprs.append('subscribe_url_short=' + "'" + self.subscribe_url_short.encode('ascii', 'replace') + "'")
        if self.subscribe_url_long is not None:
            field_reprs.append('subscribe_url_long=' + "'" + self.subscribe_url_long.encode('ascii', 'replace') + "'")
        if self.beamer_address is not None:
            field_reprs.append('beamer_address=' + "'" + self.beamer_address.encode('ascii', 'replace') + "'")
        if self.visibility is not None:
            field_reprs.append('visibility=' + "'" + self.visibility.encode('ascii', 'replace') + "'")
        return 'List(' + ', '.join(field_reprs) + ')'

    def as_dict(self):
        return {'id': self.id, 'web_id': self.web_id, 'name': self.name, 'date_created': self.date_created, 'email_type_option': self.email_type_option, 'use_awesomebar': self.use_awesomebar, 'default_from_name': self.default_from_name, 'default_from_email': self.default_from_email, 'default_subject': self.default_subject, 'default_language': self.default_language, 'list_rating': self.list_rating, 'subscribe_url_short': self.subscribe_url_short, 'subscribe_url_long': self.subscribe_url_long, 'beamer_address': self.beamer_address, 'visibility': self.visibility}

    @property
    def beamer_address(self):
        return self.__beamer_address

    @property
    def date_created(self):
        return self.__date_created

    @property
    def default_from_email(self):
        return self.__default_from_email

    @property
    def default_from_name(self):
        return self.__default_from_name

    @property
    def default_language(self):
        return self.__default_language

    @property
    def default_subject(self):
        return self.__default_subject

    @property
    def email_type_option(self):
        return self.__email_type_option

    @property
    def id(self):
        return self.__id

    @property
    def list_rating(self):
        return self.__list_rating

    @property
    def name(self):
        return self.__name

    @classmethod
    def read(cls, iprot):
        init_kwds = {}

        iprot.readStructBegin()
        while True:
            ifield_name, ifield_type, _ifield_id = iprot.readFieldBegin()
            if ifield_type == 0: # STOP
                break
            elif ifield_name == 'id':
                try:
                    init_kwds['id'] = iprot.readString()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'web_id':
                try:
                    init_kwds['web_id'] = iprot.readI32()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'name':
                try:
                    init_kwds['name'] = iprot.readString()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'date_created':
                try:
                    init_kwds['date_created'] = iprot.readDateTime() if hasattr(iprot, 'readDateTime') else datetime.fromtimestamp(iprot.readI64() / 1000.0)
                except (TypeError,):
                    pass
            elif ifield_name == 'email_type_option':
                try:
                    init_kwds['email_type_option'] = iprot.readBool()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'use_awesomebar':
                try:
                    init_kwds['use_awesomebar'] = iprot.readBool()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'default_from_name':
                try:
                    init_kwds['default_from_name'] = iprot.readString()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'default_from_email':
                try:
                    init_kwds['default_from_email'] = iprot.readString()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'default_subject':
                try:
                    init_kwds['default_subject'] = iprot.readString()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'default_language':
                try:
                    init_kwds['default_language'] = iprot.readString()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'list_rating':
                try:
                    init_kwds['list_rating'] = iprot.readI32()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'subscribe_url_short':
                try:
                    init_kwds['subscribe_url_short'] = iprot.readString()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'subscribe_url_long':
                try:
                    init_kwds['subscribe_url_long'] = iprot.readString()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'beamer_address':
                try:
                    init_kwds['beamer_address'] = iprot.readString()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'visibility':
                try:
                    init_kwds['visibility'] = iprot.readString()
                except (TypeError, ValueError,):
                    pass
            iprot.readFieldEnd()
        iprot.readStructEnd()

        return cls(**init_kwds)

    def replace(self, id=None, web_id=None, name=None, date_created=None, email_type_option=None, use_awesomebar=None, default_from_name=None, default_from_email=None, default_subject=None, default_language=None, list_rating=None, subscribe_url_short=None, subscribe_url_long=None, beamer_address=None, visibility=None):
        if id is None:
            id = self.id
        if web_id is None:
            web_id = self.web_id
        if name is None:
            name = self.name
        if date_created is None:
            date_created = self.date_created
        if email_type_option is None:
            email_type_option = self.email_type_option
        if use_awesomebar is None:
            use_awesomebar = self.use_awesomebar
        if default_from_name is None:
            default_from_name = self.default_from_name
        if default_from_email is None:
            default_from_email = self.default_from_email
        if default_subject is None:
            default_subject = self.default_subject
        if default_language is None:
            default_language = self.default_language
        if list_rating is None:
            list_rating = self.list_rating
        if subscribe_url_short is None:
            subscribe_url_short = self.subscribe_url_short
        if subscribe_url_long is None:
            subscribe_url_long = self.subscribe_url_long
        if beamer_address is None:
            beamer_address = self.beamer_address
        if visibility is None:
            visibility = self.visibility
        return self.__class__(id=id, web_id=web_id, name=name, date_created=date_created, email_type_option=email_type_option, use_awesomebar=use_awesomebar, default_from_name=default_from_name, default_from_email=default_from_email, default_subject=default_subject, default_language=default_language, list_rating=list_rating, subscribe_url_short=subscribe_url_short, subscribe_url_long=subscribe_url_long, beamer_address=beamer_address, visibility=visibility)

    @property
    def subscribe_url_long(self):
        return self.__subscribe_url_long

    @property
    def subscribe_url_short(self):
        return self.__subscribe_url_short

    @property
    def use_awesomebar(self):
        return self.__use_awesomebar

    @property
    def visibility(self):
        return self.__visibility

    @property
    def web_id(self):
        return self.__web_id

    def write(self, oprot):
        oprot.writeStructBegin('List')

        if self.id is not None:
            oprot.writeFieldBegin('id', 11, -1)
            oprot.writeString(self.id)
            oprot.writeFieldEnd()

        if self.web_id is not None:
            oprot.writeFieldBegin('web_id', 8, -1)
            oprot.writeI32(self.web_id)
            oprot.writeFieldEnd()

        if self.name is not None:
            oprot.writeFieldBegin('name', 11, -1)
            oprot.writeString(self.name)
            oprot.writeFieldEnd()

        if self.date_created is not None:
            oprot.writeFieldBegin('date_created', 12, -1)
            oprot.writeDateTime(self.date_created) if hasattr(oprot, 'writeDateTime') else oprot.writeI64(long(mktime(self.date_created.timetuple())) * 1000l)
            oprot.writeFieldEnd()

        if self.email_type_option is not None:
            oprot.writeFieldBegin('email_type_option', 2, -1)
            oprot.writeBool(self.email_type_option)
            oprot.writeFieldEnd()

        if self.use_awesomebar is not None:
            oprot.writeFieldBegin('use_awesomebar', 2, -1)
            oprot.writeBool(self.use_awesomebar)
            oprot.writeFieldEnd()

        if self.default_from_name is not None:
            oprot.writeFieldBegin('default_from_name', 11, -1)
            oprot.writeString(self.default_from_name)
            oprot.writeFieldEnd()

        if self.default_from_email is not None:
            oprot.writeFieldBegin('default_from_email', 11, -1)
            oprot.writeString(self.default_from_email)
            oprot.writeFieldEnd()

        if self.default_subject is not None:
            oprot.writeFieldBegin('default_subject', 11, -1)
            oprot.writeString(self.default_subject)
            oprot.writeFieldEnd()

        if self.default_language is not None:
            oprot.writeFieldBegin('default_language', 11, -1)
            oprot.writeString(self.default_language)
            oprot.writeFieldEnd()

        if self.list_rating is not None:
            oprot.writeFieldBegin('list_rating', 8, -1)
            oprot.writeI32(self.list_rating)
            oprot.writeFieldEnd()

        if self.subscribe_url_short is not None:
            oprot.writeFieldBegin('subscribe_url_short', 11, -1)
            oprot.writeString(self.subscribe_url_short)
            oprot.writeFieldEnd()

        if self.subscribe_url_long is not None:
            oprot.writeFieldBegin('subscribe_url_long', 11, -1)
            oprot.writeString(self.subscribe_url_long)
            oprot.writeFieldEnd()

        if self.beamer_address is not None:
            oprot.writeFieldBegin('beamer_address', 11, -1)
            oprot.writeString(self.beamer_address)
            oprot.writeFieldEnd()

        if self.visibility is not None:
            oprot.writeFieldBegin('visibility', 11, -1)
            oprot.writeString(self.visibility)
            oprot.writeFieldEnd()

        oprot.writeFieldStop()

        oprot.writeStructEnd()
