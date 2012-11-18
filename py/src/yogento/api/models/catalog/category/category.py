import __builtin__
import yogento.api.models.catalog.category.magento.magento_category


class Category(object):
    class Builder:
        def __init__(
            self,
            magento_category
        ):
            self.__magento_category = magento_category

        def build(self):
            return Category(magento_category=self.__magento_category)

        def set_magento_category(self, magento_category):
            self.__magento_category = magento_category
            return self

        def update(self, category):
            if isinstance(category, Category):
                self.set_magento_category(category.magento_category)
            elif isinstance(category, dict):
                for key, value in category.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(category)
            return self

    def __init__(
        self,
        magento_category
    ):
        if magento_category is None:
            raise ValueError('magento_category is required')
        if not isinstance(magento_category, yogento.api.models.catalog.category.magento.magento_category.MagentoCategory):
            raise TypeError(getattr(__builtin__, 'type')(magento_category))
        self.__magento_category = magento_category

    def __eq__(self, other):
        if self.magento_category != other.magento_category:
            return False
        return True

    def __hash__(self):
        return hash(self.magento_category)

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        field_reprs.append('magento_category=' + repr(self.magento_category))
        return 'Category(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        field_reprs.append('magento_category=' + repr(self.magento_category))
        return 'Category(' + ', '.join(field_reprs) + ')'

    def as_dict(self):
        return {'magento_category': self.magento_category}

    @property
    def magento_category(self):
        return self.__magento_category

    @classmethod
    def read(cls, iprot):
        init_kwds = {}

        iprot.readStructBegin()
        while True:
            ifield_name, ifield_type, _ifield_id = iprot.readFieldBegin()
            if ifield_type == 0: # STOP
                break
            elif ifield_name == 'magento_category':
                init_kwds['magento_category'] = yogento.api.models.catalog.category.magento.magento_category.MagentoCategory.read(iprot)
            iprot.readFieldEnd()
        iprot.readStructEnd()

        return cls(**init_kwds)

    def replace(self, magento_category=None):
        if magento_category is None:
            magento_category = self.magento_category
        return self.__class__(magento_category=magento_category)

    def write(self, oprot):
        oprot.writeStructBegin('Category')

        oprot.writeFieldBegin('magento_category', 12, -1)
        self.magento_category.write(oprot)
        oprot.writeFieldEnd()

        oprot.writeFieldStop()

        oprot.writeStructEnd()
