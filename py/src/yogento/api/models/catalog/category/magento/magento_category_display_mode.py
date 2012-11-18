class MagentoCategoryDisplayMode(object):
    PAGE = None
    PRODUCTS = None
    PRODUCTS_AND_PAGE = None

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
        if name == 'PAGE' or name == '0':
            return getattr(MagentoCategoryDisplayMode, 'PAGE')
        elif name == 'PRODUCTS' or name == '1':
            return getattr(MagentoCategoryDisplayMode, 'PRODUCTS')
        elif name == 'PRODUCTS_AND_PAGE' or name == '2':
            return getattr(MagentoCategoryDisplayMode, 'PRODUCTS_AND_PAGE')
        raise ValueError(name)

MagentoCategoryDisplayMode.PAGE = MagentoCategoryDisplayMode('PAGE', 0)
MagentoCategoryDisplayMode.PRODUCTS = MagentoCategoryDisplayMode('PRODUCTS', 1)
MagentoCategoryDisplayMode.PRODUCTS_AND_PAGE = MagentoCategoryDisplayMode('PRODUCTS_AND_PAGE', 2)
