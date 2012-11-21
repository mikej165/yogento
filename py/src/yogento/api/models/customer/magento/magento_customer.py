from datetime import datetime
from itertools import ifilterfalse
from time import mktime
import __builtin__
import yogento.api.models.customer.magento.magento_customer_address


class MagentoCustomer(object):
    class Builder:
        def __init__(
            self,
            created_at,
            increment_id,
            updated_at,
            addresses=None,
            confirmation=None,
            customer_id=None,
            dob=None,
            email=None,
            firstname=None,
            group_id=None,
            lastname=None,
            middlename=None,
            prefix=None,
            suffix=None,
            store_id=None,
            taxvat=None,
            website_id=None
        ):
            self.__addresses = addresses
            self.__created_at = created_at
            self.__confirmation = confirmation
            self.__customer_id = customer_id
            self.__dob = dob
            self.__email = email
            self.__firstname = firstname
            self.__group_id = group_id
            self.__increment_id = increment_id
            self.__lastname = lastname
            self.__middlename = middlename
            self.__prefix = prefix
            self.__suffix = suffix
            self.__store_id = store_id
            self.__taxvat = taxvat
            self.__updated_at = updated_at
            self.__website_id = website_id

        def build(self):
            return MagentoCustomer(addresses=self.__addresses, created_at=self.__created_at, confirmation=self.__confirmation, customer_id=self.__customer_id, dob=self.__dob, email=self.__email, firstname=self.__firstname, group_id=self.__group_id, increment_id=self.__increment_id, lastname=self.__lastname, middlename=self.__middlename, prefix=self.__prefix, suffix=self.__suffix, store_id=self.__store_id, taxvat=self.__taxvat, updated_at=self.__updated_at, website_id=self.__website_id)

        def set_addresses(self, addresses):
            self.__addresses = addresses
            return self

        def set_confirmation(self, confirmation):
            self.__confirmation = confirmation
            return self

        def set_created_at(self, created_at):
            self.__created_at = created_at
            return self

        def set_customer_id(self, customer_id):
            self.__customer_id = customer_id
            return self

        def set_dob(self, dob):
            self.__dob = dob
            return self

        def set_email(self, email):
            self.__email = email
            return self

        def set_firstname(self, firstname):
            self.__firstname = firstname
            return self

        def set_group_id(self, group_id):
            self.__group_id = group_id
            return self

        def set_increment_id(self, increment_id):
            self.__increment_id = increment_id
            return self

        def set_lastname(self, lastname):
            self.__lastname = lastname
            return self

        def set_middlename(self, middlename):
            self.__middlename = middlename
            return self

        def set_prefix(self, prefix):
            self.__prefix = prefix
            return self

        def set_store_id(self, store_id):
            self.__store_id = store_id
            return self

        def set_suffix(self, suffix):
            self.__suffix = suffix
            return self

        def set_taxvat(self, taxvat):
            self.__taxvat = taxvat
            return self

        def set_updated_at(self, updated_at):
            self.__updated_at = updated_at
            return self

        def set_website_id(self, website_id):
            self.__website_id = website_id
            return self

        def update(self, magento_customer):
            if isinstance(magento_customer, MagentoCustomer):
                self.set_addresses(magento_customer.addresses)
                self.set_created_at(magento_customer.created_at)
                self.set_confirmation(magento_customer.confirmation)
                self.set_customer_id(magento_customer.customer_id)
                self.set_dob(magento_customer.dob)
                self.set_email(magento_customer.email)
                self.set_firstname(magento_customer.firstname)
                self.set_group_id(magento_customer.group_id)
                self.set_increment_id(magento_customer.increment_id)
                self.set_lastname(magento_customer.lastname)
                self.set_middlename(magento_customer.middlename)
                self.set_prefix(magento_customer.prefix)
                self.set_suffix(magento_customer.suffix)
                self.set_store_id(magento_customer.store_id)
                self.set_taxvat(magento_customer.taxvat)
                self.set_updated_at(magento_customer.updated_at)
                self.set_website_id(magento_customer.website_id)
            elif isinstance(magento_customer, dict):
                for key, value in magento_customer.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(magento_customer)
            return self

    def __init__(
        self,
        created_at,
        increment_id,
        updated_at,
        addresses=None,
        confirmation=None,
        customer_id=None,
        dob=None,
        email=None,
        firstname=None,
        group_id=None,
        lastname=None,
        middlename=None,
        prefix=None,
        suffix=None,
        store_id=None,
        taxvat=None,
        website_id=None
    ):
        if addresses is not None:
            if not (isinstance(addresses, frozenset) and len(list(ifilterfalse(lambda _: isinstance(_, yogento.api.models.customer.magento.magento_customer_address.MagentoCustomerAddress), addresses))) == 0):
                raise TypeError(getattr(__builtin__, 'type')(addresses))
        self.__addresses = addresses

        if created_at is None:
            raise ValueError('created_at is required')
        if not isinstance(created_at, datetime):
            raise TypeError(getattr(__builtin__, 'type')(created_at))
        self.__created_at = created_at

        if confirmation is not None:
            if not isinstance(confirmation, bool):
                raise TypeError(getattr(__builtin__, 'type')(confirmation))
        self.__confirmation = confirmation

        if customer_id is not None:
            if not isinstance(customer_id, int):
                raise TypeError(getattr(__builtin__, 'type')(customer_id))
        self.__customer_id = customer_id

        if dob is not None:
            if not isinstance(dob, basestring):
                raise TypeError(getattr(__builtin__, 'type')(dob))
        self.__dob = dob

        if email is not None:
            if not isinstance(email, basestring):
                raise TypeError(getattr(__builtin__, 'type')(email))
        self.__email = email

        if firstname is not None:
            if not isinstance(firstname, basestring):
                raise TypeError(getattr(__builtin__, 'type')(firstname))
        self.__firstname = firstname

        if group_id is not None:
            if not isinstance(group_id, int):
                raise TypeError(getattr(__builtin__, 'type')(group_id))
        self.__group_id = group_id

        if increment_id is None:
            raise ValueError('increment_id is required')
        if not isinstance(increment_id, basestring):
            raise TypeError(getattr(__builtin__, 'type')(increment_id))
        self.__increment_id = increment_id

        if lastname is not None:
            if not isinstance(lastname, basestring):
                raise TypeError(getattr(__builtin__, 'type')(lastname))
        self.__lastname = lastname

        if middlename is not None:
            if not isinstance(middlename, basestring):
                raise TypeError(getattr(__builtin__, 'type')(middlename))
        self.__middlename = middlename

        if prefix is not None:
            if not isinstance(prefix, basestring):
                raise TypeError(getattr(__builtin__, 'type')(prefix))
        self.__prefix = prefix

        if suffix is not None:
            if not isinstance(suffix, basestring):
                raise TypeError(getattr(__builtin__, 'type')(suffix))
        self.__suffix = suffix

        if store_id is not None:
            if not isinstance(store_id, int):
                raise TypeError(getattr(__builtin__, 'type')(store_id))
        self.__store_id = store_id

        if taxvat is not None:
            if not isinstance(taxvat, basestring):
                raise TypeError(getattr(__builtin__, 'type')(taxvat))
        self.__taxvat = taxvat

        if updated_at is None:
            raise ValueError('updated_at is required')
        if not isinstance(updated_at, datetime):
            raise TypeError(getattr(__builtin__, 'type')(updated_at))
        self.__updated_at = updated_at

        if website_id is not None:
            if not isinstance(website_id, int):
                raise TypeError(getattr(__builtin__, 'type')(website_id))
        self.__website_id = website_id

    def __eq__(self, other):
        if self.addresses != other.addresses:
            return False
        if self.created_at != other.created_at:
            return False
        if self.confirmation != other.confirmation:
            return False
        if self.customer_id != other.customer_id:
            return False
        if self.dob != other.dob:
            return False
        if self.email != other.email:
            return False
        if self.firstname != other.firstname:
            return False
        if self.group_id != other.group_id:
            return False
        if self.increment_id != other.increment_id:
            return False
        if self.lastname != other.lastname:
            return False
        if self.middlename != other.middlename:
            return False
        if self.prefix != other.prefix:
            return False
        if self.suffix != other.suffix:
            return False
        if self.store_id != other.store_id:
            return False
        if self.taxvat != other.taxvat:
            return False
        if self.updated_at != other.updated_at:
            return False
        if self.website_id != other.website_id:
            return False
        return True

    def __hash__(self):
        return hash((self.addresses,self.created_at,self.confirmation,self.customer_id,self.dob,self.email,self.firstname,self.group_id,self.increment_id,self.lastname,self.middlename,self.prefix,self.suffix,self.store_id,self.taxvat,self.updated_at,self.website_id,))

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        if self.addresses is not None:
            field_reprs.append('addresses=' + repr(self.addresses))
        field_reprs.append('created_at=' + repr(self.created_at))
        if self.confirmation is not None:
            field_reprs.append('confirmation=' + repr(self.confirmation))
        if self.customer_id is not None:
            field_reprs.append('customer_id=' + repr(self.customer_id))
        if self.dob is not None:
            field_reprs.append('dob=' + "'" + self.dob.encode('ascii', 'replace') + "'")
        if self.email is not None:
            field_reprs.append('email=' + "'" + self.email.encode('ascii', 'replace') + "'")
        if self.firstname is not None:
            field_reprs.append('firstname=' + "'" + self.firstname.encode('ascii', 'replace') + "'")
        if self.group_id is not None:
            field_reprs.append('group_id=' + repr(self.group_id))
        field_reprs.append('increment_id=' + "'" + self.increment_id.encode('ascii', 'replace') + "'")
        if self.lastname is not None:
            field_reprs.append('lastname=' + "'" + self.lastname.encode('ascii', 'replace') + "'")
        if self.middlename is not None:
            field_reprs.append('middlename=' + "'" + self.middlename.encode('ascii', 'replace') + "'")
        if self.prefix is not None:
            field_reprs.append('prefix=' + "'" + self.prefix.encode('ascii', 'replace') + "'")
        if self.suffix is not None:
            field_reprs.append('suffix=' + "'" + self.suffix.encode('ascii', 'replace') + "'")
        if self.store_id is not None:
            field_reprs.append('store_id=' + repr(self.store_id))
        if self.taxvat is not None:
            field_reprs.append('taxvat=' + "'" + self.taxvat.encode('ascii', 'replace') + "'")
        field_reprs.append('updated_at=' + repr(self.updated_at))
        if self.website_id is not None:
            field_reprs.append('website_id=' + repr(self.website_id))
        return 'MagentoCustomer(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        if self.addresses is not None:
            field_reprs.append('addresses=' + repr(self.addresses))
        field_reprs.append('created_at=' + repr(self.created_at))
        if self.confirmation is not None:
            field_reprs.append('confirmation=' + repr(self.confirmation))
        if self.customer_id is not None:
            field_reprs.append('customer_id=' + repr(self.customer_id))
        if self.dob is not None:
            field_reprs.append('dob=' + "'" + self.dob.encode('ascii', 'replace') + "'")
        if self.email is not None:
            field_reprs.append('email=' + "'" + self.email.encode('ascii', 'replace') + "'")
        if self.firstname is not None:
            field_reprs.append('firstname=' + "'" + self.firstname.encode('ascii', 'replace') + "'")
        if self.group_id is not None:
            field_reprs.append('group_id=' + repr(self.group_id))
        field_reprs.append('increment_id=' + "'" + self.increment_id.encode('ascii', 'replace') + "'")
        if self.lastname is not None:
            field_reprs.append('lastname=' + "'" + self.lastname.encode('ascii', 'replace') + "'")
        if self.middlename is not None:
            field_reprs.append('middlename=' + "'" + self.middlename.encode('ascii', 'replace') + "'")
        if self.prefix is not None:
            field_reprs.append('prefix=' + "'" + self.prefix.encode('ascii', 'replace') + "'")
        if self.suffix is not None:
            field_reprs.append('suffix=' + "'" + self.suffix.encode('ascii', 'replace') + "'")
        if self.store_id is not None:
            field_reprs.append('store_id=' + repr(self.store_id))
        if self.taxvat is not None:
            field_reprs.append('taxvat=' + "'" + self.taxvat.encode('ascii', 'replace') + "'")
        field_reprs.append('updated_at=' + repr(self.updated_at))
        if self.website_id is not None:
            field_reprs.append('website_id=' + repr(self.website_id))
        return 'MagentoCustomer(' + ', '.join(field_reprs) + ')'

    @property
    def addresses(self):
        return self.__addresses

    def as_dict(self):
        return {'addresses': self.addresses, 'created_at': self.created_at, 'confirmation': self.confirmation, 'customer_id': self.customer_id, 'dob': self.dob, 'email': self.email, 'firstname': self.firstname, 'group_id': self.group_id, 'increment_id': self.increment_id, 'lastname': self.lastname, 'middlename': self.middlename, 'prefix': self.prefix, 'suffix': self.suffix, 'store_id': self.store_id, 'taxvat': self.taxvat, 'updated_at': self.updated_at, 'website_id': self.website_id}

    @property
    def confirmation(self):
        return self.__confirmation

    @property
    def created_at(self):
        return self.__created_at

    @property
    def customer_id(self):
        return self.__customer_id

    @property
    def dob(self):
        return self.__dob

    @property
    def email(self):
        return self.__email

    @property
    def firstname(self):
        return self.__firstname

    @property
    def group_id(self):
        return self.__group_id

    @property
    def increment_id(self):
        return self.__increment_id

    @property
    def lastname(self):
        return self.__lastname

    @property
    def middlename(self):
        return self.__middlename

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
            elif ifield_name == 'addresses':
                init_kwds['addresses'] = frozenset([yogento.api.models.customer.magento.magento_customer_address.MagentoCustomerAddress.read(iprot) for _ in xrange(iprot.readSetBegin()[1])] + (iprot.readSetEnd() is None and []))
            elif ifield_name == 'created_at':
                init_kwds['created_at'] = iprot.readDateTime() if hasattr(iprot, 'readDateTime') else datetime.fromtimestamp(iprot.readI64() / 1000.0)
            elif ifield_name == 'confirmation':
                try:
                    init_kwds['confirmation'] = iprot.readBool()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'customer_id':
                try:
                    init_kwds['customer_id'] = iprot.readI32()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'dob':
                try:
                    init_kwds['dob'] = iprot.readString()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'email':
                try:
                    init_kwds['email'] = iprot.readString()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'firstname':
                try:
                    init_kwds['firstname'] = iprot.readString()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'group_id':
                try:
                    init_kwds['group_id'] = iprot.readI32()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'increment_id':
                init_kwds['increment_id'] = iprot.readString()
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
            elif ifield_name == 'prefix':
                try:
                    init_kwds['prefix'] = iprot.readString()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'suffix':
                try:
                    init_kwds['suffix'] = iprot.readString()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'store_id':
                try:
                    init_kwds['store_id'] = iprot.readI32()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'taxvat':
                try:
                    init_kwds['taxvat'] = iprot.readString()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'updated_at':
                init_kwds['updated_at'] = iprot.readDateTime() if hasattr(iprot, 'readDateTime') else datetime.fromtimestamp(iprot.readI64() / 1000.0)
            elif ifield_name == 'website_id':
                try:
                    init_kwds['website_id'] = iprot.readI32()
                except (TypeError, ValueError,):
                    pass
            iprot.readFieldEnd()
        iprot.readStructEnd()

        return cls(**init_kwds)

    def replace(self, addresses=None, created_at=None, confirmation=None, customer_id=None, dob=None, email=None, firstname=None, group_id=None, increment_id=None, lastname=None, middlename=None, prefix=None, suffix=None, store_id=None, taxvat=None, updated_at=None, website_id=None):
        if addresses is None:
            addresses = self.addresses
        if created_at is None:
            created_at = self.created_at
        if confirmation is None:
            confirmation = self.confirmation
        if customer_id is None:
            customer_id = self.customer_id
        if dob is None:
            dob = self.dob
        if email is None:
            email = self.email
        if firstname is None:
            firstname = self.firstname
        if group_id is None:
            group_id = self.group_id
        if increment_id is None:
            increment_id = self.increment_id
        if lastname is None:
            lastname = self.lastname
        if middlename is None:
            middlename = self.middlename
        if prefix is None:
            prefix = self.prefix
        if suffix is None:
            suffix = self.suffix
        if store_id is None:
            store_id = self.store_id
        if taxvat is None:
            taxvat = self.taxvat
        if updated_at is None:
            updated_at = self.updated_at
        if website_id is None:
            website_id = self.website_id
        return self.__class__(addresses=addresses, created_at=created_at, confirmation=confirmation, customer_id=customer_id, dob=dob, email=email, firstname=firstname, group_id=group_id, increment_id=increment_id, lastname=lastname, middlename=middlename, prefix=prefix, suffix=suffix, store_id=store_id, taxvat=taxvat, updated_at=updated_at, website_id=website_id)

    @property
    def store_id(self):
        return self.__store_id

    @property
    def suffix(self):
        return self.__suffix

    @property
    def taxvat(self):
        return self.__taxvat

    @property
    def updated_at(self):
        return self.__updated_at

    @property
    def website_id(self):
        return self.__website_id

    def write(self, oprot):
        oprot.writeStructBegin('MagentoCustomer')

        if self.addresses is not None:
            oprot.writeFieldBegin('addresses', 14, -1)
            oprot.writeSetBegin(12, len(self.addresses))
            for _0 in self.addresses:
                _0.write(oprot)
            oprot.writeSetEnd()
            oprot.writeFieldEnd()

        oprot.writeFieldBegin('created_at', 12, -1)
        oprot.writeDateTime(self.created_at) if hasattr(oprot, 'writeDateTime') else oprot.writeI64(long(mktime(self.created_at.timetuple())) * 1000l)
        oprot.writeFieldEnd()

        if self.confirmation is not None:
            oprot.writeFieldBegin('confirmation', 2, -1)
            oprot.writeBool(self.confirmation)
            oprot.writeFieldEnd()

        if self.customer_id is not None:
            oprot.writeFieldBegin('customer_id', 8, -1)
            oprot.writeI32(self.customer_id)
            oprot.writeFieldEnd()

        if self.dob is not None:
            oprot.writeFieldBegin('dob', 11, -1)
            oprot.writeString(self.dob)
            oprot.writeFieldEnd()

        if self.email is not None:
            oprot.writeFieldBegin('email', 11, -1)
            oprot.writeString(self.email)
            oprot.writeFieldEnd()

        if self.firstname is not None:
            oprot.writeFieldBegin('firstname', 11, -1)
            oprot.writeString(self.firstname)
            oprot.writeFieldEnd()

        if self.group_id is not None:
            oprot.writeFieldBegin('group_id', 8, -1)
            oprot.writeI32(self.group_id)
            oprot.writeFieldEnd()

        oprot.writeFieldBegin('increment_id', 11, -1)
        oprot.writeString(self.increment_id)
        oprot.writeFieldEnd()

        if self.lastname is not None:
            oprot.writeFieldBegin('lastname', 11, -1)
            oprot.writeString(self.lastname)
            oprot.writeFieldEnd()

        if self.middlename is not None:
            oprot.writeFieldBegin('middlename', 11, -1)
            oprot.writeString(self.middlename)
            oprot.writeFieldEnd()

        if self.prefix is not None:
            oprot.writeFieldBegin('prefix', 11, -1)
            oprot.writeString(self.prefix)
            oprot.writeFieldEnd()

        if self.suffix is not None:
            oprot.writeFieldBegin('suffix', 11, -1)
            oprot.writeString(self.suffix)
            oprot.writeFieldEnd()

        if self.store_id is not None:
            oprot.writeFieldBegin('store_id', 8, -1)
            oprot.writeI32(self.store_id)
            oprot.writeFieldEnd()

        if self.taxvat is not None:
            oprot.writeFieldBegin('taxvat', 11, -1)
            oprot.writeString(self.taxvat)
            oprot.writeFieldEnd()

        oprot.writeFieldBegin('updated_at', 12, -1)
        oprot.writeDateTime(self.updated_at) if hasattr(oprot, 'writeDateTime') else oprot.writeI64(long(mktime(self.updated_at.timetuple())) * 1000l)
        oprot.writeFieldEnd()

        if self.website_id is not None:
            oprot.writeFieldBegin('website_id', 8, -1)
            oprot.writeI32(self.website_id)
            oprot.writeFieldEnd()

        oprot.writeFieldStop()

        oprot.writeStructEnd()

        return self
