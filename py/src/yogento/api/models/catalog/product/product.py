import __builtin__
import yogento.api.models.catalog.product.magento.magento_product


class Product(object):
    class Builder:
        def __init__(
            self,
            magento_product
        ):
            self.__magento_product = magento_product

        def build(self):
            return Product(magento_product=self.__magento_product)

        def set_magento_product(self, magento_product):
            self.__magento_product = magento_product
            return self

        def update(self, product):
            if isinstance(product, Product):
                self.set_magento_product(product.magento_product)
            elif isinstance(product, dict):
                for key, value in product.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(product)
            return self

    def __init__(
        self,
        magento_product
    ):
        if magento_product is None:
            raise ValueError('magento_product is required')
        if not isinstance(magento_product, yogento.api.models.catalog.product.magento.magento_product.MagentoProduct):
            raise TypeError(getattr(__builtin__, 'type')(magento_product))
        self.__magento_product = magento_product

    def __eq__(self, other):
        if self.magento_product != other.magento_product:
            return False
        return True

    def __hash__(self):
        return hash(self.magento_product)

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        field_reprs.append('magento_product=' + repr(self.magento_product))
        return 'Product(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        field_reprs.append('magento_product=' + repr(self.magento_product))
        return 'Product(' + ', '.join(field_reprs) + ')'

    def as_dict(self):
        return {'magento_product': self.magento_product}

    @property
    def magento_product(self):
        return self.__magento_product

    @classmethod
    def read(cls, iprot):
        init_kwds = {}

        iprot.readStructBegin()
        while True:
            ifield_name, ifield_type, _ifield_id = iprot.readFieldBegin()
            if ifield_type == 0: # STOP
                break
            elif ifield_name == 'magento_product':
                init_kwds['magento_product'] = yogento.api.models.catalog.product.magento.magento_product.MagentoProduct.read(iprot)
            iprot.readFieldEnd()
        iprot.readStructEnd()

        return cls(**init_kwds)

    def replace(self, magento_product=None):
        if magento_product is None:
            magento_product = self.magento_product
        return self.__class__(magento_product=magento_product)

    def write(self, oprot):
        oprot.writeStructBegin('Product')

        oprot.writeFieldBegin('magento_product', 12, -1)
        self.magento_product.write(oprot)
        oprot.writeFieldEnd()

        oprot.writeFieldStop()

        oprot.writeStructEnd()
