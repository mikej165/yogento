class CampaignType(object):
    ABSPLIT = None
    AUTO = None
    INSPECTION = None
    PLAINTEXT = None
    REGULAR = None
    RSS = None

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
        if name == 'ABSPLIT' or name == '0':
            return getattr(CampaignType, 'ABSPLIT')
        elif name == 'AUTO' or name == '1':
            return getattr(CampaignType, 'AUTO')
        elif name == 'INSPECTION' or name == '2':
            return getattr(CampaignType, 'INSPECTION')
        elif name == 'PLAINTEXT' or name == '3':
            return getattr(CampaignType, 'PLAINTEXT')
        elif name == 'REGULAR' or name == '4':
            return getattr(CampaignType, 'REGULAR')
        elif name == 'RSS' or name == '5':
            return getattr(CampaignType, 'RSS')
        raise ValueError(name)

CampaignType.ABSPLIT = CampaignType('ABSPLIT', 0)
CampaignType.AUTO = CampaignType('AUTO', 1)
CampaignType.INSPECTION = CampaignType('INSPECTION', 2)
CampaignType.PLAINTEXT = CampaignType('PLAINTEXT', 3)
CampaignType.REGULAR = CampaignType('REGULAR', 4)
CampaignType.RSS = CampaignType('RSS', 5)
