class MailCampaignStatus(object):
    DRAFT = None
    SAVED_MSP = None
    SENT_MSP = None

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
        if name == 'DRAFT' or name == '0':
            return getattr(MailCampaignStatus, 'DRAFT')
        elif name == 'SAVED_MSP' or name == '1':
            return getattr(MailCampaignStatus, 'SAVED_MSP')
        elif name == 'SENT_MSP' or name == '2':
            return getattr(MailCampaignStatus, 'SENT_MSP')
        raise ValueError(name)

MailCampaignStatus.DRAFT = MailCampaignStatus('DRAFT', 0)
MailCampaignStatus.SAVED_MSP = MailCampaignStatus('SAVED_MSP', 1)
MailCampaignStatus.SENT_MSP = MailCampaignStatus('SENT_MSP', 2)
