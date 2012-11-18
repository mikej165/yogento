class MagentoProductType(object):
    SIMPLE = None
    GROUPED = None
    CONFIGURABLE = None
    VIRTUAL = None
    BUNDLE = None
    DOWNLOADABLE = None

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
        if name == 'SIMPLE' or name == '0':
            return getattr(MagentoProductType, 'SIMPLE')
        elif name == 'GROUPED' or name == '1':
            return getattr(MagentoProductType, 'GROUPED')
        elif name == 'CONFIGURABLE' or name == '2':
            return getattr(MagentoProductType, 'CONFIGURABLE')
        elif name == 'VIRTUAL' or name == '3':
            return getattr(MagentoProductType, 'VIRTUAL')
        elif name == 'BUNDLE' or name == '4':
            return getattr(MagentoProductType, 'BUNDLE')
        elif name == 'DOWNLOADABLE' or name == '5':
            return getattr(MagentoProductType, 'DOWNLOADABLE')
        raise ValueError(name)

MagentoProductType.SIMPLE = MagentoProductType('SIMPLE', 0)
MagentoProductType.GROUPED = MagentoProductType('GROUPED', 1)
MagentoProductType.CONFIGURABLE = MagentoProductType('CONFIGURABLE', 2)
MagentoProductType.VIRTUAL = MagentoProductType('VIRTUAL', 3)
MagentoProductType.BUNDLE = MagentoProductType('BUNDLE', 4)
MagentoProductType.DOWNLOADABLE = MagentoProductType('DOWNLOADABLE', 5)
