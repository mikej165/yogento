import __builtin__
import yogento.api.models.sales.order.magento.magento_order_address_type


class MagentoOrderAddress(object):
    class Builder:
        def __init__(
            self,
            address_type=None,
            city=None,
            company=None,
            country_id=None,
            email=None,
            fax=None,
            firstname=None,
            lastname=None,
            middlename=None,
            postcode=None,
            prefix=None,
            region=None,
            street=None,
            suffix=None,
            telephone=None
        ):
            self.__address_type = address_type
            self.__city = city
            self.__company = company
            self.__country_id = country_id
            self.__email = email
            self.__fax = fax
            self.__firstname = firstname
            self.__lastname = lastname
            self.__middlename = middlename
            self.__postcode = postcode
            self.__prefix = prefix
            self.__region = region
            self.__street = street
            self.__suffix = suffix
            self.__telephone = telephone

        def build(self):
            return MagentoOrderAddress(address_type=self.__address_type, city=self.__city, company=self.__company, country_id=self.__country_id, email=self.__email, fax=self.__fax, firstname=self.__firstname, lastname=self.__lastname, middlename=self.__middlename, postcode=self.__postcode, prefix=self.__prefix, region=self.__region, street=self.__street, suffix=self.__suffix, telephone=self.__telephone)

        def set_address_type(self, address_type):
            self.__address_type = address_type
            return self

        def set_city(self, city):
            self.__city = city
            return self

        def set_company(self, company):
            self.__company = company
            return self

        def set_country_id(self, country_id):
            self.__country_id = country_id
            return self

        def set_email(self, email):
            self.__email = email
            return self

        def set_fax(self, fax):
            self.__fax = fax
            return self

        def set_firstname(self, firstname):
            self.__firstname = firstname
            return self

        def set_lastname(self, lastname):
            self.__lastname = lastname
            return self

        def set_middlename(self, middlename):
            self.__middlename = middlename
            return self

        def set_postcode(self, postcode):
            self.__postcode = postcode
            return self

        def set_prefix(self, prefix):
            self.__prefix = prefix
            return self

        def set_region(self, region):
            self.__region = region
            return self

        def set_street(self, street):
            self.__street = street
            return self

        def set_suffix(self, suffix):
            self.__suffix = suffix
            return self

        def set_telephone(self, telephone):
            self.__telephone = telephone
            return self

        def update(self, magento_order_address):
            if isinstance(magento_order_address, MagentoOrderAddress):
                self.set_address_type(magento_order_address.address_type)
                self.set_city(magento_order_address.city)
                self.set_company(magento_order_address.company)
                self.set_country_id(magento_order_address.country_id)
                self.set_email(magento_order_address.email)
                self.set_fax(magento_order_address.fax)
                self.set_firstname(magento_order_address.firstname)
                self.set_lastname(magento_order_address.lastname)
                self.set_middlename(magento_order_address.middlename)
                self.set_postcode(magento_order_address.postcode)
                self.set_prefix(magento_order_address.prefix)
                self.set_region(magento_order_address.region)
                self.set_street(magento_order_address.street)
                self.set_suffix(magento_order_address.suffix)
                self.set_telephone(magento_order_address.telephone)
            elif isinstance(magento_order_address, dict):
                for key, value in magento_order_address.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(magento_order_address)
            return self

    def __init__(
        self,
        address_type=None,
        city=None,
        company=None,
        country_id=None,
        email=None,
        fax=None,
        firstname=None,
        lastname=None,
        middlename=None,
        postcode=None,
        prefix=None,
        region=None,
        street=None,
        suffix=None,
        telephone=None
    ):
        if address_type is not None:
            if not isinstance(address_type, yogento.api.models.sales.order.magento.magento_order_address_type.MagentoOrderAddressType):
                raise TypeError(getattr(__builtin__, 'type')(address_type))
        self.__address_type = address_type

        if city is not None:
            if not isinstance(city, basestring):
                raise TypeError(getattr(__builtin__, 'type')(city))
        self.__city = city

        if company is not None:
            if not isinstance(company, basestring):
                raise TypeError(getattr(__builtin__, 'type')(company))
        self.__company = company

        if country_id is not None:
            if not isinstance(country_id, basestring):
                raise TypeError(getattr(__builtin__, 'type')(country_id))
        self.__country_id = country_id

        if email is not None:
            if not isinstance(email, basestring):
                raise TypeError(getattr(__builtin__, 'type')(email))
        self.__email = email

        if fax is not None:
            if not isinstance(fax, basestring):
                raise TypeError(getattr(__builtin__, 'type')(fax))
        self.__fax = fax

        if firstname is not None:
            if not isinstance(firstname, basestring):
                raise TypeError(getattr(__builtin__, 'type')(firstname))
        self.__firstname = firstname

        if lastname is not None:
            if not isinstance(lastname, basestring):
                raise TypeError(getattr(__builtin__, 'type')(lastname))
        self.__lastname = lastname

        if middlename is not None:
            if not isinstance(middlename, basestring):
                raise TypeError(getattr(__builtin__, 'type')(middlename))
        self.__middlename = middlename

        if postcode is not None:
            if not isinstance(postcode, basestring):
                raise TypeError(getattr(__builtin__, 'type')(postcode))
        self.__postcode = postcode

        if prefix is not None:
            if not isinstance(prefix, basestring):
                raise TypeError(getattr(__builtin__, 'type')(prefix))
        self.__prefix = prefix

        if region is not None:
            if not isinstance(region, basestring):
                raise TypeError(getattr(__builtin__, 'type')(region))
        self.__region = region

        if street is not None:
            if not isinstance(street, basestring):
                raise TypeError(getattr(__builtin__, 'type')(street))
        self.__street = street

        if suffix is not None:
            if not isinstance(suffix, basestring):
                raise TypeError(getattr(__builtin__, 'type')(suffix))
        self.__suffix = suffix

        if telephone is not None:
            if not isinstance(telephone, basestring):
                raise TypeError(getattr(__builtin__, 'type')(telephone))
        self.__telephone = telephone

    def __eq__(self, other):
        if self.address_type != other.address_type:
            return False
        if self.city != other.city:
            return False
        if self.company != other.company:
            return False
        if self.country_id != other.country_id:
            return False
        if self.email != other.email:
            return False
        if self.fax != other.fax:
            return False
        if self.firstname != other.firstname:
            return False
        if self.lastname != other.lastname:
            return False
        if self.middlename != other.middlename:
            return False
        if self.postcode != other.postcode:
            return False
        if self.prefix != other.prefix:
            return False
        if self.region != other.region:
            return False
        if self.street != other.street:
            return False
        if self.suffix != other.suffix:
            return False
        if self.telephone != other.telephone:
            return False
        return True

    def __hash__(self):
        return hash((self.address_type,self.city,self.company,self.country_id,self.email,self.fax,self.firstname,self.lastname,self.middlename,self.postcode,self.prefix,self.region,self.street,self.suffix,self.telephone,))

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        if self.address_type is not None:
            field_reprs.append('address_type=' + repr(self.address_type))
        if self.city is not None:
            field_reprs.append('city=' + "'" + self.city.encode('ascii', 'replace') + "'")
        if self.company is not None:
            field_reprs.append('company=' + "'" + self.company.encode('ascii', 'replace') + "'")
        if self.country_id is not None:
            field_reprs.append('country_id=' + "'" + self.country_id.encode('ascii', 'replace') + "'")
        if self.email is not None:
            field_reprs.append('email=' + "'" + self.email.encode('ascii', 'replace') + "'")
        if self.fax is not None:
            field_reprs.append('fax=' + "'" + self.fax.encode('ascii', 'replace') + "'")
        if self.firstname is not None:
            field_reprs.append('firstname=' + "'" + self.firstname.encode('ascii', 'replace') + "'")
        if self.lastname is not None:
            field_reprs.append('lastname=' + "'" + self.lastname.encode('ascii', 'replace') + "'")
        if self.middlename is not None:
            field_reprs.append('middlename=' + "'" + self.middlename.encode('ascii', 'replace') + "'")
        if self.postcode is not None:
            field_reprs.append('postcode=' + "'" + self.postcode.encode('ascii', 'replace') + "'")
        if self.prefix is not None:
            field_reprs.append('prefix=' + "'" + self.prefix.encode('ascii', 'replace') + "'")
        if self.region is not None:
            field_reprs.append('region=' + "'" + self.region.encode('ascii', 'replace') + "'")
        if self.street is not None:
            field_reprs.append('street=' + "'" + self.street.encode('ascii', 'replace') + "'")
        if self.suffix is not None:
            field_reprs.append('suffix=' + "'" + self.suffix.encode('ascii', 'replace') + "'")
        if self.telephone is not None:
            field_reprs.append('telephone=' + "'" + self.telephone.encode('ascii', 'replace') + "'")
        return 'MagentoOrderAddress(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        if self.address_type is not None:
            field_reprs.append('address_type=' + repr(self.address_type))
        if self.city is not None:
            field_reprs.append('city=' + "'" + self.city.encode('ascii', 'replace') + "'")
        if self.company is not None:
            field_reprs.append('company=' + "'" + self.company.encode('ascii', 'replace') + "'")
        if self.country_id is not None:
            field_reprs.append('country_id=' + "'" + self.country_id.encode('ascii', 'replace') + "'")
        if self.email is not None:
            field_reprs.append('email=' + "'" + self.email.encode('ascii', 'replace') + "'")
        if self.fax is not None:
            field_reprs.append('fax=' + "'" + self.fax.encode('ascii', 'replace') + "'")
        if self.firstname is not None:
            field_reprs.append('firstname=' + "'" + self.firstname.encode('ascii', 'replace') + "'")
        if self.lastname is not None:
            field_reprs.append('lastname=' + "'" + self.lastname.encode('ascii', 'replace') + "'")
        if self.middlename is not None:
            field_reprs.append('middlename=' + "'" + self.middlename.encode('ascii', 'replace') + "'")
        if self.postcode is not None:
            field_reprs.append('postcode=' + "'" + self.postcode.encode('ascii', 'replace') + "'")
        if self.prefix is not None:
            field_reprs.append('prefix=' + "'" + self.prefix.encode('ascii', 'replace') + "'")
        if self.region is not None:
            field_reprs.append('region=' + "'" + self.region.encode('ascii', 'replace') + "'")
        if self.street is not None:
            field_reprs.append('street=' + "'" + self.street.encode('ascii', 'replace') + "'")
        if self.suffix is not None:
            field_reprs.append('suffix=' + "'" + self.suffix.encode('ascii', 'replace') + "'")
        if self.telephone is not None:
            field_reprs.append('telephone=' + "'" + self.telephone.encode('ascii', 'replace') + "'")
        return 'MagentoOrderAddress(' + ', '.join(field_reprs) + ')'

    @property
    def address_type(self):
        return self.__address_type

    def as_dict(self):
        return {'address_type': self.address_type, 'city': self.city, 'company': self.company, 'country_id': self.country_id, 'email': self.email, 'fax': self.fax, 'firstname': self.firstname, 'lastname': self.lastname, 'middlename': self.middlename, 'postcode': self.postcode, 'prefix': self.prefix, 'region': self.region, 'street': self.street, 'suffix': self.suffix, 'telephone': self.telephone}

    @property
    def city(self):
        return self.__city

    @property
    def company(self):
        return self.__company

    @property
    def country_id(self):
        return self.__country_id

    @property
    def email(self):
        return self.__email

    @property
    def fax(self):
        return self.__fax

    @property
    def firstname(self):
        return self.__firstname

    @property
    def lastname(self):
        return self.__lastname

    @property
    def middlename(self):
        return self.__middlename

    @property
    def postcode(self):
        return self.__postcode

    @property
    def prefix(self):
        return self.__prefix

    @classmethod
    def read(cls, iprot):
        init_kwds = {}

        iprot.readStructBegin()
        while True:
            ifield_name, ifield_type, _ifield_id = iprot.readFieldBegin()
            if ifield_type == 0: # STOP
                break
            elif ifield_name == 'address_type':
                try:
                    init_kwds['address_type'] = yogento.api.models.sales.order.magento.magento_order_address_type.MagentoOrderAddressType.value_of(iprot.readString().strip().upper())
                except (TypeError,):
                    pass
            elif ifield_name == 'city':
                try:
                    init_kwds['city'] = iprot.readString()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'company':
                try:
                    init_kwds['company'] = iprot.readString()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'country_id':
                try:
                    init_kwds['country_id'] = iprot.readString()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'email':
                try:
                    init_kwds['email'] = iprot.readString()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'fax':
                try:
                    init_kwds['fax'] = iprot.readString()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'firstname':
                try:
                    init_kwds['firstname'] = iprot.readString()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'lastname':
                try:
                    init_kwds['lastname'] = iprot.readString()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'middlename':
                try:
                    init_kwds['middlename'] = iprot.readString()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'postcode':
                try:
                    init_kwds['postcode'] = iprot.readString()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'prefix':
                try:
                    init_kwds['prefix'] = iprot.readString()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'region':
                try:
                    init_kwds['region'] = iprot.readString()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'street':
                try:
                    init_kwds['street'] = iprot.readString()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'suffix':
                try:
                    init_kwds['suffix'] = iprot.readString()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'telephone':
                try:
                    init_kwds['telephone'] = iprot.readString()
                except (TypeError, ValueError,):
                    pass
            iprot.readFieldEnd()
        iprot.readStructEnd()

        return cls(**init_kwds)

    @property
    def region(self):
        return self.__region

    def replace(self, address_type=None, city=None, company=None, country_id=None, email=None, fax=None, firstname=None, lastname=None, middlename=None, postcode=None, prefix=None, region=None, street=None, suffix=None, telephone=None):
        if address_type is None:
            address_type = self.address_type
        if city is None:
            city = self.city
        if company is None:
            company = self.company
        if country_id is None:
            country_id = self.country_id
        if email is None:
            email = self.email
        if fax is None:
            fax = self.fax
        if firstname is None:
            firstname = self.firstname
        if lastname is None:
            lastname = self.lastname
        if middlename is None:
            middlename = self.middlename
        if postcode is None:
            postcode = self.postcode
        if prefix is None:
            prefix = self.prefix
        if region is None:
            region = self.region
        if street is None:
            street = self.street
        if suffix is None:
            suffix = self.suffix
        if telephone is None:
            telephone = self.telephone
        return self.__class__(address_type=address_type, city=city, company=company, country_id=country_id, email=email, fax=fax, firstname=firstname, lastname=lastname, middlename=middlename, postcode=postcode, prefix=prefix, region=region, street=street, suffix=suffix, telephone=telephone)

    @property
    def street(self):
        return self.__street

    @property
    def suffix(self):
        return self.__suffix

    @property
    def telephone(self):
        return self.__telephone

    def write(self, oprot):
        oprot.writeStructBegin('MagentoOrderAddress')

        if self.address_type is not None:
            oprot.writeFieldBegin('address_type', 11, -1)
            oprot.writeString([attr for attr in dir(yogento.api.models.sales.order.magento.magento_order_address_type.MagentoOrderAddressType) if getattr(yogento.api.models.sales.order.magento.magento_order_address_type.MagentoOrderAddressType, attr) == self.address_type][0])
            oprot.writeFieldEnd()

        if self.city is not None:
            oprot.writeFieldBegin('city', 11, -1)
            oprot.writeString(self.city)
            oprot.writeFieldEnd()

        if self.company is not None:
            oprot.writeFieldBegin('company', 11, -1)
            oprot.writeString(self.company)
            oprot.writeFieldEnd()

        if self.country_id is not None:
            oprot.writeFieldBegin('country_id', 11, -1)
            oprot.writeString(self.country_id)
            oprot.writeFieldEnd()

        if self.email is not None:
            oprot.writeFieldBegin('email', 11, -1)
            oprot.writeString(self.email)
            oprot.writeFieldEnd()

        if self.fax is not None:
            oprot.writeFieldBegin('fax', 11, -1)
            oprot.writeString(self.fax)
            oprot.writeFieldEnd()

        if self.firstname is not None:
            oprot.writeFieldBegin('firstname', 11, -1)
            oprot.writeString(self.firstname)
            oprot.writeFieldEnd()

        if self.lastname is not None:
            oprot.writeFieldBegin('lastname', 11, -1)
            oprot.writeString(self.lastname)
            oprot.writeFieldEnd()

        if self.middlename is not None:
            oprot.writeFieldBegin('middlename', 11, -1)
            oprot.writeString(self.middlename)
            oprot.writeFieldEnd()

        if self.postcode is not None:
            oprot.writeFieldBegin('postcode', 11, -1)
            oprot.writeString(self.postcode)
            oprot.writeFieldEnd()

        if self.prefix is not None:
            oprot.writeFieldBegin('prefix', 11, -1)
            oprot.writeString(self.prefix)
            oprot.writeFieldEnd()

        if self.region is not None:
            oprot.writeFieldBegin('region', 11, -1)
            oprot.writeString(self.region)
            oprot.writeFieldEnd()

        if self.street is not None:
            oprot.writeFieldBegin('street', 11, -1)
            oprot.writeString(self.street)
            oprot.writeFieldEnd()

        if self.suffix is not None:
            oprot.writeFieldBegin('suffix', 11, -1)
            oprot.writeString(self.suffix)
            oprot.writeFieldEnd()

        if self.telephone is not None:
            oprot.writeFieldBegin('telephone', 11, -1)
            oprot.writeString(self.telephone)
            oprot.writeFieldEnd()

        oprot.writeFieldStop()

        oprot.writeStructEnd()
