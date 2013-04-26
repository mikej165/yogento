import __builtin__


class AccountContactDetails(object):
    class Builder:
        def __init__(
            self,
            fname=None,
            lname=None,
            email=None,
            company=None,
            address1=None,
            address2=None,
            city=None,
            state=None,
            zip=None,
            country=None,
            url=None,
            phone=None,
            fax=None
        ):
            self.__fname = fname
            self.__lname = lname
            self.__email = email
            self.__company = company
            self.__address1 = address1
            self.__address2 = address2
            self.__city = city
            self.__state = state
            self.__zip = zip
            self.__country = country
            self.__url = url
            self.__phone = phone
            self.__fax = fax

        def build(self):
            return AccountContactDetails(fname=self.__fname, lname=self.__lname, email=self.__email, company=self.__company, address1=self.__address1, address2=self.__address2, city=self.__city, state=self.__state, zip=self.__zip, country=self.__country, url=self.__url, phone=self.__phone, fax=self.__fax)

        def set_address1(self, address1):
            self.__address1 = address1
            return self

        def set_address2(self, address2):
            self.__address2 = address2
            return self

        def set_city(self, city):
            self.__city = city
            return self

        def set_company(self, company):
            self.__company = company
            return self

        def set_country(self, country):
            self.__country = country
            return self

        def set_email(self, email):
            self.__email = email
            return self

        def set_fax(self, fax):
            self.__fax = fax
            return self

        def set_fname(self, fname):
            self.__fname = fname
            return self

        def set_lname(self, lname):
            self.__lname = lname
            return self

        def set_phone(self, phone):
            self.__phone = phone
            return self

        def set_state(self, state):
            self.__state = state
            return self

        def set_url(self, url):
            self.__url = url
            return self

        def set_zip(self, zip):
            self.__zip = zip
            return self

        def update(self, account_contact_details):
            if isinstance(account_contact_details, AccountContactDetails):
                self.set_fname(account_contact_details.fname)
                self.set_lname(account_contact_details.lname)
                self.set_email(account_contact_details.email)
                self.set_company(account_contact_details.company)
                self.set_address1(account_contact_details.address1)
                self.set_address2(account_contact_details.address2)
                self.set_city(account_contact_details.city)
                self.set_state(account_contact_details.state)
                self.set_zip(account_contact_details.zip)
                self.set_country(account_contact_details.country)
                self.set_url(account_contact_details.url)
                self.set_phone(account_contact_details.phone)
                self.set_fax(account_contact_details.fax)
            elif isinstance(account_contact_details, dict):
                for key, value in account_contact_details.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(account_contact_details)
            return self

    def __init__(
        self,
        fname=None,
        lname=None,
        email=None,
        company=None,
        address1=None,
        address2=None,
        city=None,
        state=None,
        zip=None,
        country=None,
        url=None,
        phone=None,
        fax=None
    ):
        if fname is not None:
            if not isinstance(fname, basestring):
                raise TypeError(getattr(__builtin__, 'type')(fname))
        self.__fname = fname

        if lname is not None:
            if not isinstance(lname, basestring):
                raise TypeError(getattr(__builtin__, 'type')(lname))
        self.__lname = lname

        if email is not None:
            if not isinstance(email, str):
                raise TypeError(getattr(__builtin__, 'type')(email))
        self.__email = email

        if company is not None:
            if not isinstance(company, basestring):
                raise TypeError(getattr(__builtin__, 'type')(company))
        self.__company = company

        if address1 is not None:
            if not isinstance(address1, basestring):
                raise TypeError(getattr(__builtin__, 'type')(address1))
        self.__address1 = address1

        if address2 is not None:
            if not isinstance(address2, basestring):
                raise TypeError(getattr(__builtin__, 'type')(address2))
        self.__address2 = address2

        if city is not None:
            if not isinstance(city, basestring):
                raise TypeError(getattr(__builtin__, 'type')(city))
        self.__city = city

        if state is not None:
            if not isinstance(state, basestring):
                raise TypeError(getattr(__builtin__, 'type')(state))
        self.__state = state

        if zip is not None:
            if not isinstance(zip, basestring):
                raise TypeError(getattr(__builtin__, 'type')(zip))
        self.__zip = zip

        if country is not None:
            if not isinstance(country, basestring):
                raise TypeError(getattr(__builtin__, 'type')(country))
        self.__country = country

        if url is not None:
            if not isinstance(url, str):
                raise TypeError(getattr(__builtin__, 'type')(url))
        self.__url = url

        if phone is not None:
            if not isinstance(phone, basestring):
                raise TypeError(getattr(__builtin__, 'type')(phone))
        self.__phone = phone

        if fax is not None:
            if not isinstance(fax, basestring):
                raise TypeError(getattr(__builtin__, 'type')(fax))
        self.__fax = fax

    def __eq__(self, other):
        if self.fname != other.fname:
            return False
        if self.lname != other.lname:
            return False
        if self.email != other.email:
            return False
        if self.company != other.company:
            return False
        if self.address1 != other.address1:
            return False
        if self.address2 != other.address2:
            return False
        if self.city != other.city:
            return False
        if self.state != other.state:
            return False
        if self.zip != other.zip:
            return False
        if self.country != other.country:
            return False
        if self.url != other.url:
            return False
        if self.phone != other.phone:
            return False
        if self.fax != other.fax:
            return False
        return True

    def __hash__(self):
        return hash((self.fname,self.lname,self.email,self.company,self.address1,self.address2,self.city,self.state,self.zip,self.country,self.url,self.phone,self.fax,))

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        if self.fname is not None:
            field_reprs.append('fname=' + "'" + self.fname.encode('ascii', 'replace') + "'")
        if self.lname is not None:
            field_reprs.append('lname=' + "'" + self.lname.encode('ascii', 'replace') + "'")
        if self.email is not None:
            field_reprs.append('email=' + repr(self.email))
        if self.company is not None:
            field_reprs.append('company=' + "'" + self.company.encode('ascii', 'replace') + "'")
        if self.address1 is not None:
            field_reprs.append('address1=' + "'" + self.address1.encode('ascii', 'replace') + "'")
        if self.address2 is not None:
            field_reprs.append('address2=' + "'" + self.address2.encode('ascii', 'replace') + "'")
        if self.city is not None:
            field_reprs.append('city=' + "'" + self.city.encode('ascii', 'replace') + "'")
        if self.state is not None:
            field_reprs.append('state=' + "'" + self.state.encode('ascii', 'replace') + "'")
        if self.zip is not None:
            field_reprs.append('zip=' + "'" + self.zip.encode('ascii', 'replace') + "'")
        if self.country is not None:
            field_reprs.append('country=' + "'" + self.country.encode('ascii', 'replace') + "'")
        if self.url is not None:
            field_reprs.append('url=' + repr(self.url))
        if self.phone is not None:
            field_reprs.append('phone=' + "'" + self.phone.encode('ascii', 'replace') + "'")
        if self.fax is not None:
            field_reprs.append('fax=' + "'" + self.fax.encode('ascii', 'replace') + "'")
        return 'AccountContactDetails(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        if self.fname is not None:
            field_reprs.append('fname=' + "'" + self.fname.encode('ascii', 'replace') + "'")
        if self.lname is not None:
            field_reprs.append('lname=' + "'" + self.lname.encode('ascii', 'replace') + "'")
        if self.email is not None:
            field_reprs.append('email=' + repr(self.email))
        if self.company is not None:
            field_reprs.append('company=' + "'" + self.company.encode('ascii', 'replace') + "'")
        if self.address1 is not None:
            field_reprs.append('address1=' + "'" + self.address1.encode('ascii', 'replace') + "'")
        if self.address2 is not None:
            field_reprs.append('address2=' + "'" + self.address2.encode('ascii', 'replace') + "'")
        if self.city is not None:
            field_reprs.append('city=' + "'" + self.city.encode('ascii', 'replace') + "'")
        if self.state is not None:
            field_reprs.append('state=' + "'" + self.state.encode('ascii', 'replace') + "'")
        if self.zip is not None:
            field_reprs.append('zip=' + "'" + self.zip.encode('ascii', 'replace') + "'")
        if self.country is not None:
            field_reprs.append('country=' + "'" + self.country.encode('ascii', 'replace') + "'")
        if self.url is not None:
            field_reprs.append('url=' + repr(self.url))
        if self.phone is not None:
            field_reprs.append('phone=' + "'" + self.phone.encode('ascii', 'replace') + "'")
        if self.fax is not None:
            field_reprs.append('fax=' + "'" + self.fax.encode('ascii', 'replace') + "'")
        return 'AccountContactDetails(' + ', '.join(field_reprs) + ')'

    @property
    def address1(self):
        return self.__address1

    @property
    def address2(self):
        return self.__address2

    def as_dict(self):
        return {'fname': self.fname, 'lname': self.lname, 'email': self.email, 'company': self.company, 'address1': self.address1, 'address2': self.address2, 'city': self.city, 'state': self.state, 'zip': self.zip, 'country': self.country, 'url': self.url, 'phone': self.phone, 'fax': self.fax}

    @property
    def city(self):
        return self.__city

    @property
    def company(self):
        return self.__company

    @property
    def country(self):
        return self.__country

    @property
    def email(self):
        return self.__email

    @property
    def fax(self):
        return self.__fax

    @property
    def fname(self):
        return self.__fname

    @property
    def lname(self):
        return self.__lname

    @property
    def phone(self):
        return self.__phone

    @classmethod
    def read(cls, iprot):
        init_kwds = {}

        iprot.readStructBegin()
        while True:
            ifield_name, ifield_type, _ifield_id = iprot.readFieldBegin()
            if ifield_type == 0: # STOP
                break
            elif ifield_name == 'fname':
                try:
                    init_kwds['fname'] = iprot.readString()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'lname':
                try:
                    init_kwds['lname'] = iprot.readString()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'email':
                init_kwds['email'] = iprot.readString()
            elif ifield_name == 'company':
                try:
                    init_kwds['company'] = iprot.readString()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'address1':
                try:
                    init_kwds['address1'] = iprot.readString()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'address2':
                try:
                    init_kwds['address2'] = iprot.readString()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'city':
                try:
                    init_kwds['city'] = iprot.readString()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'state':
                try:
                    init_kwds['state'] = iprot.readString()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'zip':
                try:
                    init_kwds['zip'] = iprot.readString()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'country':
                try:
                    init_kwds['country'] = iprot.readString()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'url':
                init_kwds['url'] = iprot.readString()
            elif ifield_name == 'phone':
                try:
                    init_kwds['phone'] = iprot.readString()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'fax':
                try:
                    init_kwds['fax'] = iprot.readString()
                except (TypeError, ValueError,):
                    pass
            iprot.readFieldEnd()
        iprot.readStructEnd()

        return cls(**init_kwds)

    def replace(self, fname=None, lname=None, email=None, company=None, address1=None, address2=None, city=None, state=None, zip=None, country=None, url=None, phone=None, fax=None):
        if fname is None:
            fname = self.fname
        if lname is None:
            lname = self.lname
        if email is None:
            email = self.email
        if company is None:
            company = self.company
        if address1 is None:
            address1 = self.address1
        if address2 is None:
            address2 = self.address2
        if city is None:
            city = self.city
        if state is None:
            state = self.state
        if zip is None:
            zip = self.zip
        if country is None:
            country = self.country
        if url is None:
            url = self.url
        if phone is None:
            phone = self.phone
        if fax is None:
            fax = self.fax
        return self.__class__(fname=fname, lname=lname, email=email, company=company, address1=address1, address2=address2, city=city, state=state, zip=zip, country=country, url=url, phone=phone, fax=fax)

    @property
    def state(self):
        return self.__state

    @property
    def url(self):
        return self.__url

    def write(self, oprot):
        oprot.writeStructBegin('AccountContactDetails')

        if self.fname is not None:
            oprot.writeFieldBegin('fname', 11, -1)
            oprot.writeString(self.fname)
            oprot.writeFieldEnd()

        if self.lname is not None:
            oprot.writeFieldBegin('lname', 11, -1)
            oprot.writeString(self.lname)
            oprot.writeFieldEnd()

        if self.email is not None:
            oprot.writeFieldBegin('email', 12, -1)
            oprot.writeEmailAddress(self.email) if hasattr(oprot, 'writeEmailAddress') else oprot.writeString(str(self.email))
            oprot.writeFieldEnd()

        if self.company is not None:
            oprot.writeFieldBegin('company', 11, -1)
            oprot.writeString(self.company)
            oprot.writeFieldEnd()

        if self.address1 is not None:
            oprot.writeFieldBegin('address1', 11, -1)
            oprot.writeString(self.address1)
            oprot.writeFieldEnd()

        if self.address2 is not None:
            oprot.writeFieldBegin('address2', 11, -1)
            oprot.writeString(self.address2)
            oprot.writeFieldEnd()

        if self.city is not None:
            oprot.writeFieldBegin('city', 11, -1)
            oprot.writeString(self.city)
            oprot.writeFieldEnd()

        if self.state is not None:
            oprot.writeFieldBegin('state', 11, -1)
            oprot.writeString(self.state)
            oprot.writeFieldEnd()

        if self.zip is not None:
            oprot.writeFieldBegin('zip', 11, -1)
            oprot.writeString(self.zip)
            oprot.writeFieldEnd()

        if self.country is not None:
            oprot.writeFieldBegin('country', 11, -1)
            oprot.writeString(self.country)
            oprot.writeFieldEnd()

        if self.url is not None:
            oprot.writeFieldBegin('url', 12, -1)
            oprot.writeUrl(self.url) if hasattr(oprot, 'writeUrl') else oprot.writeString(str(self.url))
            oprot.writeFieldEnd()

        if self.phone is not None:
            oprot.writeFieldBegin('phone', 11, -1)
            oprot.writeString(self.phone)
            oprot.writeFieldEnd()

        if self.fax is not None:
            oprot.writeFieldBegin('fax', 11, -1)
            oprot.writeString(self.fax)
            oprot.writeFieldEnd()

        oprot.writeFieldStop()

        oprot.writeStructEnd()

        return self

    @property
    def zip(self):
        return self.__zip
