class CampaignStatus(object):
    PAUSED = None
    SCHEDULE = None
    SAVE = None
    SENDING = None
    SENT = None

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
        if name == 'PAUSED' or name == '0':
            return getattr(CampaignStatus, 'PAUSED')
        elif name == 'SCHEDULE' or name == '1':
            return getattr(CampaignStatus, 'SCHEDULE')
        elif name == 'SAVE' or name == '2':
            return getattr(CampaignStatus, 'SAVE')
        elif name == 'SENDING' or name == '3':
            return getattr(CampaignStatus, 'SENDING')
        elif name == 'SENT' or name == '4':
            return getattr(CampaignStatus, 'SENT')
        raise ValueError(name)

CampaignStatus.PAUSED = CampaignStatus('PAUSED', 0)
CampaignStatus.SCHEDULE = CampaignStatus('SCHEDULE', 1)
CampaignStatus.SAVE = CampaignStatus('SAVE', 2)
CampaignStatus.SENDING = CampaignStatus('SENDING', 3)
CampaignStatus.SENT = CampaignStatus('SENT', 4)
