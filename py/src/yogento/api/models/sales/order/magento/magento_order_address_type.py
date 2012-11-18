class MagentoOrderAddressType(object):
    BILLING = None
    SHIPPING = None

    def __init__(self, name, value):
        object.__init__(self)
        self.__name = name
        self.__value = value

    def __int__(self):
        return self.__value

    def __repr__(self):
        return self.__name

    def __str__(self):
        return self.__name

    @classmethod
    def value_of(cls, name):
        if name == 'BILLING' or name == '0':
            return getattr(MagentoOrderAddressType, 'BILLING')
        elif name == 'SHIPPING' or name == '1':
            return getattr(MagentoOrderAddressType, 'SHIPPING')
        raise ValueError(name)

MagentoOrderAddressType.BILLING = MagentoOrderAddressType('BILLING', 0)
MagentoOrderAddressType.SHIPPING = MagentoOrderAddressType('SHIPPING', 1)
