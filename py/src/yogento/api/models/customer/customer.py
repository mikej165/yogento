import __builtin__
import yogento.api.models.customer.magento.magento_customer


class Customer(object):
    class Builder:
        def __init__(
            self,
            magento_customer
        ):
            self.__magento_customer = magento_customer

        def build(self):
            return Customer(magento_customer=self.__magento_customer)

        def set_magento_customer(self, magento_customer):
            self.__magento_customer = magento_customer
            return self

        def update(self, customer):
            if isinstance(customer, Customer):
                self.set_magento_customer(customer.magento_customer)
            elif isinstance(customer, dict):
                for key, value in customer.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(customer)
            return self

    def __init__(
        self,
        magento_customer
    ):
        if magento_customer is None:
            raise ValueError('magento_customer is required')
        if not isinstance(magento_customer, yogento.api.models.customer.magento.magento_customer.MagentoCustomer):
            raise TypeError(getattr(__builtin__, 'type')(magento_customer))
        self.__magento_customer = magento_customer

    def __eq__(self, other):
        if self.magento_customer != other.magento_customer:
            return False
        return True

    def __hash__(self):
        return hash(self.magento_customer)

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        field_reprs.append('magento_customer=' + repr(self.magento_customer))
        return 'Customer(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        field_reprs.append('magento_customer=' + repr(self.magento_customer))
        return 'Customer(' + ', '.join(field_reprs) + ')'

    def as_dict(self):
        return {'magento_customer': self.magento_customer}

    @property
    def magento_customer(self):
        return self.__magento_customer

    @classmethod
    def read(cls, iprot):
        init_kwds = {}

        iprot.readStructBegin()
        while True:
            ifield_name, ifield_type, _ifield_id = iprot.readFieldBegin()
            if ifield_type == 0: # STOP
                break
            elif ifield_name == 'magento_customer':
                init_kwds['magento_customer'] = yogento.api.models.customer.magento.magento_customer.MagentoCustomer.read(iprot)
            iprot.readFieldEnd()
        iprot.readStructEnd()

        return cls(**init_kwds)

    def replace(self, magento_customer=None):
        if magento_customer is None:
            magento_customer = self.magento_customer
        return self.__class__(magento_customer=magento_customer)

    def write(self, oprot):
        oprot.writeStructBegin('Customer')

        oprot.writeFieldBegin('magento_customer', 12, -1)
        self.magento_customer.write(oprot)
        oprot.writeFieldEnd()

        oprot.writeFieldStop()

        oprot.writeStructEnd()

        return self
