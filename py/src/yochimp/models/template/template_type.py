class TemplateType(object):
    USER = None
    GALLERY = None
    BASE = None

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
        if name == 'USER' or name == '0':
            return getattr(TemplateType, 'USER')
        elif name == 'GALLERY' or name == '1':
            return getattr(TemplateType, 'GALLERY')
        elif name == 'BASE' or name == '2':
            return getattr(TemplateType, 'BASE')
        raise ValueError(name)

TemplateType.USER = TemplateType('USER', 0)
TemplateType.GALLERY = TemplateType('GALLERY', 1)
TemplateType.BASE = TemplateType('BASE', 2)
