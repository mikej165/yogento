class MagentoProductImageType(object):
    IMAGE = None
    SMALL_IMAGE = None
    THUMBNAIL = None

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
        if name == 'IMAGE' or name == '0':
            return getattr(MagentoProductImageType, 'IMAGE')
        elif name == 'SMALL_IMAGE' or name == '1':
            return getattr(MagentoProductImageType, 'SMALL_IMAGE')
        elif name == 'THUMBNAIL' or name == '2':
            return getattr(MagentoProductImageType, 'THUMBNAIL')
        raise ValueError(name)

MagentoProductImageType.IMAGE = MagentoProductImageType('IMAGE', 0)
MagentoProductImageType.SMALL_IMAGE = MagentoProductImageType('SMALL_IMAGE', 1)
MagentoProductImageType.THUMBNAIL = MagentoProductImageType('THUMBNAIL', 2)
