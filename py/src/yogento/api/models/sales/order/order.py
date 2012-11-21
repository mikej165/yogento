import __builtin__
import yogento.api.models.sales.order.magento.magento_order


class Order(object):
    class Builder:
        def __init__(
            self,
            magento_order
        ):
            self.__magento_order = magento_order

        def build(self):
            return Order(magento_order=self.__magento_order)

        def set_magento_order(self, magento_order):
            self.__magento_order = magento_order
            return self

        def update(self, order):
            if isinstance(order, Order):
                self.set_magento_order(order.magento_order)
            elif isinstance(order, dict):
                for key, value in order.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(order)
            return self

    def __init__(
        self,
        magento_order
    ):
        if magento_order is None:
            raise ValueError('magento_order is required')
        if not isinstance(magento_order, yogento.api.models.sales.order.magento.magento_order.MagentoOrder):
            raise TypeError(getattr(__builtin__, 'type')(magento_order))
        self.__magento_order = magento_order

    def __eq__(self, other):
        if self.magento_order != other.magento_order:
            return False
        return True

    def __hash__(self):
        return hash(self.magento_order)

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        field_reprs.append('magento_order=' + repr(self.magento_order))
        return 'Order(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        field_reprs.append('magento_order=' + repr(self.magento_order))
        return 'Order(' + ', '.join(field_reprs) + ')'

    def as_dict(self):
        return {'magento_order': self.magento_order}

    @property
    def magento_order(self):
        return self.__magento_order

    @classmethod
    def read(cls, iprot):
        init_kwds = {}

        iprot.readStructBegin()
        while True:
            ifield_name, ifield_type, _ifield_id = iprot.readFieldBegin()
            if ifield_type == 0: # STOP
                break
            elif ifield_name == 'magento_order':
                init_kwds['magento_order'] = yogento.api.models.sales.order.magento.magento_order.MagentoOrder.read(iprot)
            iprot.readFieldEnd()
        iprot.readStructEnd()

        return cls(**init_kwds)

    def replace(self, magento_order=None):
        if magento_order is None:
            magento_order = self.magento_order
        return self.__class__(magento_order=magento_order)

    def write(self, oprot):
        oprot.writeStructBegin('Order')

        oprot.writeFieldBegin('magento_order', 12, -1)
        self.magento_order.write(oprot)
        oprot.writeFieldEnd()

        oprot.writeFieldStop()

        oprot.writeStructEnd()

        return self
