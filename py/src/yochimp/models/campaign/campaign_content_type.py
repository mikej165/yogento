class CampaignContentType(object):
    HTML = None
    TEMPLATE = None
    URL = None

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
        if name == 'HTML' or name == '0':
            return getattr(CampaignContentType, 'HTML')
        elif name == 'TEMPLATE' or name == '1':
            return getattr(CampaignContentType, 'TEMPLATE')
        elif name == 'URL' or name == '2':
            return getattr(CampaignContentType, 'URL')
        raise ValueError(name)

CampaignContentType.HTML = CampaignContentType('HTML', 0)
CampaignContentType.TEMPLATE = CampaignContentType('TEMPLATE', 1)
CampaignContentType.URL = CampaignContentType('URL', 2)
