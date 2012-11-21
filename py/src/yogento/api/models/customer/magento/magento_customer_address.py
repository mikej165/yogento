from datetime import datetime
from time import mktime
import __builtin__


class MagentoCustomerAddress(object):
    class Builder:
        def __init__(
            self,
            city,
            country_id,
            created_at,
            firstname,
            lastname,
            postcode,
            region,
            street,
            telephone,
            customer_address_id=None,
            is_default_billing=None,
            is_default_shipping=None,
            region_id=None,
            updated_at=None
        ):
            self.__city = city
            self.__country_id = country_id
            self.__created_at = created_at
            self.__customer_address_id = customer_address_id
            self.__firstname = firstname
            self.__is_default_billing = is_default_billing
            self.__is_default_shipping = is_default_shipping
            self.__lastname = lastname
            self.__postcode = postcode
            self.__region = region
            self.__region_id = region_id
            self.__street = street
            self.__telephone = telephone
            self.__updated_at = updated_at

        def build(self):
            return MagentoCustomerAddress(city=self.__city, country_id=self.__country_id, created_at=self.__created_at, customer_address_id=self.__customer_address_id, firstname=self.__firstname, is_default_billing=self.__is_default_billing, is_default_shipping=self.__is_default_shipping, lastname=self.__lastname, postcode=self.__postcode, region=self.__region, region_id=self.__region_id, street=self.__street, telephone=self.__telephone, updated_at=self.__updated_at)

        def set_city(self, city):
            self.__city = city
            return self

        def set_country_id(self, country_id):
            self.__country_id = country_id
            return self

        def set_created_at(self, created_at):
            self.__created_at = created_at
            return self

        def set_customer_address_id(self, customer_address_id):
            self.__customer_address_id = customer_address_id
            return self

        def set_firstname(self, firstname):
            self.__firstname = firstname
            return self

        def set_is_default_billing(self, is_default_billing):
            self.__is_default_billing = is_default_billing
            return self

        def set_is_default_shipping(self, is_default_shipping):
            self.__is_default_shipping = is_default_shipping
            return self

        def set_lastname(self, lastname):
            self.__lastname = lastname
            return self

        def set_postcode(self, postcode):
            self.__postcode = postcode
            return self

        def set_region(self, region):
            self.__region = region
            return self

        def set_region_id(self, region_id):
            self.__region_id = region_id
            return self

        def set_street(self, street):
            self.__street = street
            return self

        def set_telephone(self, telephone):
            self.__telephone = telephone
            return self

        def set_updated_at(self, updated_at):
            self.__updated_at = updated_at
            return self

        def update(self, magento_customer_address):
            if isinstance(magento_customer_address, MagentoCustomerAddress):
                self.set_city(magento_customer_address.city)
                self.set_country_id(magento_customer_address.country_id)
                self.set_created_at(magento_customer_address.created_at)
                self.set_customer_address_id(magento_customer_address.customer_address_id)
                self.set_firstname(magento_customer_address.firstname)
                self.set_is_default_billing(magento_customer_address.is_default_billing)
                self.set_is_default_shipping(magento_customer_address.is_default_shipping)
                self.set_lastname(magento_customer_address.lastname)
                self.set_postcode(magento_customer_address.postcode)
                self.set_region(magento_customer_address.region)
                self.set_region_id(magento_customer_address.region_id)
                self.set_street(magento_customer_address.street)
                self.set_telephone(magento_customer_address.telephone)
                self.set_updated_at(magento_customer_address.updated_at)
            elif isinstance(magento_customer_address, dict):
                for key, value in magento_customer_address.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(magento_customer_address)
            return self

    def __init__(
        self,
        city,
        country_id,
        created_at,
        firstname,
        lastname,
        postcode,
        region,
        street,
        telephone,
        customer_address_id=None,
        is_default_billing=None,
        is_default_shipping=None,
        region_id=None,
        updated_at=None
    ):
        if city is None:
            raise ValueError('city is required')
        if not isinstance(city, basestring):
            raise TypeError(getattr(__builtin__, 'type')(city))
        self.__city = city

        if country_id is None:
            raise ValueError('country_id is required')
        if not isinstance(country_id, basestring):
            raise TypeError(getattr(__builtin__, 'type')(country_id))
        self.__country_id = country_id

        if created_at is None:
            raise ValueError('created_at is required')
        if not isinstance(created_at, datetime):
            raise TypeError(getattr(__builtin__, 'type')(created_at))
        self.__created_at = created_at

        if customer_address_id is not None:
            if not isinstance(customer_address_id, int):
                raise TypeError(getattr(__builtin__, 'type')(customer_address_id))
        self.__customer_address_id = customer_address_id

        if firstname is None:
            raise ValueError('firstname is required')
        if not isinstance(firstname, basestring):
            raise TypeError(getattr(__builtin__, 'type')(firstname))
        self.__firstname = firstname

        if is_default_billing is not None:
            if not isinstance(is_default_billing, bool):
                raise TypeError(getattr(__builtin__, 'type')(is_default_billing))
        self.__is_default_billing = is_default_billing

        if is_default_shipping is not None:
            if not isinstance(is_default_shipping, bool):
                raise TypeError(getattr(__builtin__, 'type')(is_default_shipping))
        self.__is_default_shipping = is_default_shipping

        if lastname is None:
            raise ValueError('lastname is required')
        if not isinstance(lastname, basestring):
            raise TypeError(getattr(__builtin__, 'type')(lastname))
        self.__lastname = lastname

        if postcode is None:
            raise ValueError('postcode is required')
        if not isinstance(postcode, basestring):
            raise TypeError(getattr(__builtin__, 'type')(postcode))
        self.__postcode = postcode

        if region is None:
            raise ValueError('region is required')
        if not isinstance(region, basestring):
            raise TypeError(getattr(__builtin__, 'type')(region))
        self.__region = region

        if region_id is not None:
            if not isinstance(region_id, int):
                raise TypeError(getattr(__builtin__, 'type')(region_id))
        self.__region_id = region_id

        if street is None:
            raise ValueError('street is required')
        if not isinstance(street, basestring):
            raise TypeError(getattr(__builtin__, 'type')(street))
        self.__street = street

        if telephone is None:
            raise ValueError('telephone is required')
        if not isinstance(telephone, basestring):
            raise TypeError(getattr(__builtin__, 'type')(telephone))
        self.__telephone = telephone

        if updated_at is not None:
            if not isinstance(updated_at, datetime):
                raise TypeError(getattr(__builtin__, 'type')(updated_at))
        self.__updated_at = updated_at

    def __eq__(self, other):
        if self.city != other.city:
            return False
        if self.country_id != other.country_id:
            return False
        if self.created_at != other.created_at:
            return False
        if self.customer_address_id != other.customer_address_id:
            return False
        if self.firstname != other.firstname:
            return False
        if self.is_default_billing != other.is_default_billing:
            return False
        if self.is_default_shipping != other.is_default_shipping:
            return False
        if self.lastname != other.lastname:
            return False
        if self.postcode != other.postcode:
            return False
        if self.region != other.region:
            return False
        if self.region_id != other.region_id:
            return False
        if self.street != other.street:
            return False
        if self.telephone != other.telephone:
            return False
        if self.updated_at != other.updated_at:
            return False
        return True

    def __hash__(self):
        return hash((self.city,self.country_id,self.created_at,self.customer_address_id,self.firstname,self.is_default_billing,self.is_default_shipping,self.lastname,self.postcode,self.region,self.region_id,self.street,self.telephone,self.updated_at,))

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        field_reprs.append('city=' + "'" + self.city.encode('ascii', 'replace') + "'")
        field_reprs.append('country_id=' + "'" + self.country_id.encode('ascii', 'replace') + "'")
        field_reprs.append('created_at=' + repr(self.created_at))
        if self.customer_address_id is not None:
            field_reprs.append('customer_address_id=' + repr(self.customer_address_id))
        field_reprs.append('firstname=' + "'" + self.firstname.encode('ascii', 'replace') + "'")
        if self.is_default_billing is not None:
            field_reprs.append('is_default_billing=' + repr(self.is_default_billing))
        if self.is_default_shipping is not None:
            field_reprs.append('is_default_shipping=' + repr(self.is_default_shipping))
        field_reprs.append('lastname=' + "'" + self.lastname.encode('ascii', 'replace') + "'")
        field_reprs.append('postcode=' + "'" + self.postcode.encode('ascii', 'replace') + "'")
        field_reprs.append('region=' + "'" + self.region.encode('ascii', 'replace') + "'")
        if self.region_id is not None:
            field_reprs.append('region_id=' + repr(self.region_id))
        field_reprs.append('street=' + "'" + self.street.encode('ascii', 'replace') + "'")
        field_reprs.append('telephone=' + "'" + self.telephone.encode('ascii', 'replace') + "'")
        if self.updated_at is not None:
            field_reprs.append('updated_at=' + repr(self.updated_at))
        return 'MagentoCustomerAddress(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        field_reprs.append('city=' + "'" + self.city.encode('ascii', 'replace') + "'")
        field_reprs.append('country_id=' + "'" + self.country_id.encode('ascii', 'replace') + "'")
        field_reprs.append('created_at=' + repr(self.created_at))
        if self.customer_address_id is not None:
            field_reprs.append('customer_address_id=' + repr(self.customer_address_id))
        field_reprs.append('firstname=' + "'" + self.firstname.encode('ascii', 'replace') + "'")
        if self.is_default_billing is not None:
            field_reprs.append('is_default_billing=' + repr(self.is_default_billing))
        if self.is_default_shipping is not None:
            field_reprs.append('is_default_shipping=' + repr(self.is_default_shipping))
        field_reprs.append('lastname=' + "'" + self.lastname.encode('ascii', 'replace') + "'")
        field_reprs.append('postcode=' + "'" + self.postcode.encode('ascii', 'replace') + "'")
        field_reprs.append('region=' + "'" + self.region.encode('ascii', 'replace') + "'")
        if self.region_id is not None:
            field_reprs.append('region_id=' + repr(self.region_id))
        field_reprs.append('street=' + "'" + self.street.encode('ascii', 'replace') + "'")
        field_reprs.append('telephone=' + "'" + self.telephone.encode('ascii', 'replace') + "'")
        if self.updated_at is not None:
            field_reprs.append('updated_at=' + repr(self.updated_at))
        return 'MagentoCustomerAddress(' + ', '.join(field_reprs) + ')'

    def as_dict(self):
        return {'city': self.city, 'country_id': self.country_id, 'created_at': self.created_at, 'customer_address_id': self.customer_address_id, 'firstname': self.firstname, 'is_default_billing': self.is_default_billing, 'is_default_shipping': self.is_default_shipping, 'lastname': self.lastname, 'postcode': self.postcode, 'region': self.region, 'region_id': self.region_id, 'street': self.street, 'telephone': self.telephone, 'updated_at': self.updated_at}

    @property
    def city(self):
        return self.__city

    @property
    def country_id(self):
        return self.__country_id

    @property
    def created_at(self):
        return self.__created_at

    @property
    def customer_address_id(self):
        return self.__customer_address_id

    @property
    def firstname(self):
        return self.__firstname

    @property
    def is_default_billing(self):
        return self.__is_default_billing

    @property
    def is_default_shipping(self):
        return self.__is_default_shipping

    @property
    def lastname(self):
        return self.__lastname

    @property
    def postcode(self):
        return self.__postcode

    @classmethod
    def read(cls, iprot):
        init_kwds = {}

        iprot.readStructBegin()
        while True:
            ifield_name, ifield_type, _ifield_id = iprot.readFieldBegin()
            if ifield_type == 0: # STOP
                break
            elif ifield_name == 'city':
                init_kwds['city'] = iprot.readString()
            elif ifield_name == 'country_id':
                init_kwds['country_id'] = iprot.readString()
            elif ifield_name == 'created_at':
                init_kwds['created_at'] = iprot.readDateTime() if hasattr(iprot, 'readDateTime') else datetime.fromtimestamp(iprot.readI64() / 1000.0)
            elif ifield_name == 'customer_address_id':
                try:
                    init_kwds['customer_address_id'] = iprot.readI32()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'firstname':
                init_kwds['firstname'] = iprot.readString()
            elif ifield_name == 'is_default_billing':
                try:
                    init_kwds['is_default_billing'] = iprot.readBool()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'is_default_shipping':
                try:
                    init_kwds['is_default_shipping'] = iprot.readBool()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'lastname':
                init_kwds['lastname'] = iprot.readString()
            elif ifield_name == 'postcode':
                init_kwds['postcode'] = iprot.readString()
            elif ifield_name == 'region':
                init_kwds['region'] = iprot.readString()
            elif ifield_name == 'region_id':
                try:
                    init_kwds['region_id'] = iprot.readI32()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'street':
                init_kwds['street'] = iprot.readString()
            elif ifield_name == 'telephone':
                init_kwds['telephone'] = iprot.readString()
            elif ifield_name == 'updated_at':
                try:
                    init_kwds['updated_at'] = iprot.readDateTime() if hasattr(iprot, 'readDateTime') else datetime.fromtimestamp(iprot.readI64() / 1000.0)
                except (TypeError,):
                    pass
            iprot.readFieldEnd()
        iprot.readStructEnd()

        return cls(**init_kwds)

    @property
    def region(self):
        return self.__region

    @property
    def region_id(self):
        return self.__region_id

    def replace(self, city=None, country_id=None, created_at=None, customer_address_id=None, firstname=None, is_default_billing=None, is_default_shipping=None, lastname=None, postcode=None, region=None, region_id=None, street=None, telephone=None, updated_at=None):
        if city is None:
            city = self.city
        if country_id is None:
            country_id = self.country_id
        if created_at is None:
            created_at = self.created_at
        if customer_address_id is None:
            customer_address_id = self.customer_address_id
        if firstname is None:
            firstname = self.firstname
        if is_default_billing is None:
            is_default_billing = self.is_default_billing
        if is_default_shipping is None:
            is_default_shipping = self.is_default_shipping
        if lastname is None:
            lastname = self.lastname
        if postcode is None:
            postcode = self.postcode
        if region is None:
            region = self.region
        if region_id is None:
            region_id = self.region_id
        if street is None:
            street = self.street
        if telephone is None:
            telephone = self.telephone
        if updated_at is None:
            updated_at = self.updated_at
        return self.__class__(city=city, country_id=country_id, created_at=created_at, customer_address_id=customer_address_id, firstname=firstname, is_default_billing=is_default_billing, is_default_shipping=is_default_shipping, lastname=lastname, postcode=postcode, region=region, region_id=region_id, street=street, telephone=telephone, updated_at=updated_at)

    @property
    def street(self):
        return self.__street

    @property
    def telephone(self):
        return self.__telephone

    @property
    def updated_at(self):
        return self.__updated_at

    def write(self, oprot):
        oprot.writeStructBegin('MagentoCustomerAddress')

        oprot.writeFieldBegin('city', 11, -1)
        oprot.writeString(self.city)
        oprot.writeFieldEnd()

        oprot.writeFieldBegin('country_id', 11, -1)
        oprot.writeString(self.country_id)
        oprot.writeFieldEnd()

        oprot.writeFieldBegin('created_at', 12, -1)
        oprot.writeDateTime(self.created_at) if hasattr(oprot, 'writeDateTime') else oprot.writeI64(long(mktime(self.created_at.timetuple())) * 1000l)
        oprot.writeFieldEnd()

        if self.customer_address_id is not None:
            oprot.writeFieldBegin('customer_address_id', 8, -1)
            oprot.writeI32(self.customer_address_id)
            oprot.writeFieldEnd()

        oprot.writeFieldBegin('firstname', 11, -1)
        oprot.writeString(self.firstname)
        oprot.writeFieldEnd()

        if self.is_default_billing is not None:
            oprot.writeFieldBegin('is_default_billing', 2, -1)
            oprot.writeBool(self.is_default_billing)
            oprot.writeFieldEnd()

        if self.is_default_shipping is not None:
            oprot.writeFieldBegin('is_default_shipping', 2, -1)
            oprot.writeBool(self.is_default_shipping)
            oprot.writeFieldEnd()

        oprot.writeFieldBegin('lastname', 11, -1)
        oprot.writeString(self.lastname)
        oprot.writeFieldEnd()

        oprot.writeFieldBegin('postcode', 11, -1)
        oprot.writeString(self.postcode)
        oprot.writeFieldEnd()

        oprot.writeFieldBegin('region', 11, -1)
        oprot.writeString(self.region)
        oprot.writeFieldEnd()

        if self.region_id is not None:
            oprot.writeFieldBegin('region_id', 8, -1)
            oprot.writeI32(self.region_id)
            oprot.writeFieldEnd()

        oprot.writeFieldBegin('street', 11, -1)
        oprot.writeString(self.street)
        oprot.writeFieldEnd()

        oprot.writeFieldBegin('telephone', 11, -1)
        oprot.writeString(self.telephone)
        oprot.writeFieldEnd()

        if self.updated_at is not None:
            oprot.writeFieldBegin('updated_at', 12, -1)
            oprot.writeDateTime(self.updated_at) if hasattr(oprot, 'writeDateTime') else oprot.writeI64(long(mktime(self.updated_at.timetuple())) * 1000l)
            oprot.writeFieldEnd()

        oprot.writeFieldStop()

        oprot.writeStructEnd()

        return self
