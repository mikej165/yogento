class MagentoProductStatus(object):
    DISABLED = None
    ENABLED = None

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
        if name == 'DISABLED' or name == '2':
            return getattr(MagentoProductStatus, 'DISABLED')
        elif name == 'ENABLED' or name == '1':
            return getattr(MagentoProductStatus, 'ENABLED')
        raise ValueError(name)

MagentoProductStatus.DISABLED = MagentoProductStatus('DISABLED', 2)
MagentoProductStatus.ENABLED = MagentoProductStatus('ENABLED', 1)
