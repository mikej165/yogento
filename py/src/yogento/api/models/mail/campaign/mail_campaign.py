import __builtin__
import yochimp.models.campaign.campaign
import yogento.api.models.mail.campaign.mail_campaign_content
import yogento.api.models.mail.campaign.mail_campaign_status


class MailCampaign(object):
    class Builder:
        def __init__(
            self,
            content=None,
            id=None,
            mail_chimp_campaign=None,
            status=None
        ):
            self.__content = content
            self.__id = id
            self.__mail_chimp_campaign = mail_chimp_campaign
            self.__status = status

        def build(self):
            return MailCampaign(content=self.__content, id=self.__id, mail_chimp_campaign=self.__mail_chimp_campaign, status=self.__status)

        def set_content(self, content):
            self.__content = content
            return self

        def set_id(self, id):
            self.__id = id
            return self

        def set_mail_chimp_campaign(self, mail_chimp_campaign):
            self.__mail_chimp_campaign = mail_chimp_campaign
            return self

        def set_status(self, status):
            self.__status = status
            return self

        def update(self, mail_campaign):
            if isinstance(mail_campaign, MailCampaign):
                self.set_content(mail_campaign.content)
                self.set_id(mail_campaign.id)
                self.set_mail_chimp_campaign(mail_campaign.mail_chimp_campaign)
                self.set_status(mail_campaign.status)
            elif isinstance(mail_campaign, dict):
                for key, value in mail_campaign.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(mail_campaign)
            return self

    def __init__(
        self,
        content=None,
        id=None,
        mail_chimp_campaign=None,
        status=None
    ):
        if content is not None:
            if not isinstance(content, yogento.api.models.mail.campaign.mail_campaign_content.MailCampaignContent):
                raise TypeError(getattr(__builtin__, 'type')(content))
        self.__content = content

        if id is not None:
            if not isinstance(id, basestring):
                raise TypeError(getattr(__builtin__, 'type')(id))
        self.__id = id

        if mail_chimp_campaign is not None:
            if not isinstance(mail_chimp_campaign, yochimp.models.campaign.campaign.Campaign):
                raise TypeError(getattr(__builtin__, 'type')(mail_chimp_campaign))
        self.__mail_chimp_campaign = mail_chimp_campaign

        if status is not None:
            if not isinstance(status, yogento.api.models.mail.campaign.mail_campaign_status.MailCampaignStatus):
                raise TypeError(getattr(__builtin__, 'type')(status))
        self.__status = status

    def __eq__(self, other):
        if self.content != other.content:
            return False
        if self.id != other.id:
            return False
        if self.mail_chimp_campaign != other.mail_chimp_campaign:
            return False
        if self.status != other.status:
            return False
        return True

    def __hash__(self):
        return hash((self.content,self.id,self.mail_chimp_campaign,self.status,))

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        if self.content is not None:
            field_reprs.append('content=' + repr(self.content))
        if self.id is not None:
            field_reprs.append('id=' + "'" + self.id.encode('ascii', 'replace') + "'")
        if self.mail_chimp_campaign is not None:
            field_reprs.append('mail_chimp_campaign=' + repr(self.mail_chimp_campaign))
        if self.status is not None:
            field_reprs.append('status=' + repr(self.status))
        return 'MailCampaign(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        if self.content is not None:
            field_reprs.append('content=' + repr(self.content))
        if self.id is not None:
            field_reprs.append('id=' + "'" + self.id.encode('ascii', 'replace') + "'")
        if self.mail_chimp_campaign is not None:
            field_reprs.append('mail_chimp_campaign=' + repr(self.mail_chimp_campaign))
        if self.status is not None:
            field_reprs.append('status=' + repr(self.status))
        return 'MailCampaign(' + ', '.join(field_reprs) + ')'

    def as_dict(self):
        return {'content': self.content, 'id': self.id, 'mail_chimp_campaign': self.mail_chimp_campaign, 'status': self.status}

    @property
    def content(self):
        return self.__content

    @property
    def id(self):
        return self.__id

    @property
    def mail_chimp_campaign(self):
        return self.__mail_chimp_campaign

    @classmethod
    def read(cls, iprot):
        init_kwds = {}

        iprot.readStructBegin()
        while True:
            ifield_name, ifield_type, _ifield_id = iprot.readFieldBegin()
            if ifield_type == 0: # STOP
                break
            elif ifield_name == 'content':
                init_kwds['content'] = yogento.api.models.mail.campaign.mail_campaign_content.MailCampaignContent.read(iprot)
            elif ifield_name == 'id':
                try:
                    init_kwds['id'] = iprot.readString()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'mail_chimp_campaign':
                init_kwds['mail_chimp_campaign'] = yochimp.models.campaign.campaign.Campaign.read(iprot)
            elif ifield_name == 'status':
                try:
                    init_kwds['status'] = yogento.api.models.mail.campaign.mail_campaign_status.MailCampaignStatus.value_of(iprot.readString().strip().upper())
                except (TypeError,):
                    pass
            iprot.readFieldEnd()
        iprot.readStructEnd()

        return cls(**init_kwds)

    def replace(self, content=None, id=None, mail_chimp_campaign=None, status=None):
        if content is None:
            content = self.content
        if id is None:
            id = self.id
        if mail_chimp_campaign is None:
            mail_chimp_campaign = self.mail_chimp_campaign
        if status is None:
            status = self.status
        return self.__class__(content=content, id=id, mail_chimp_campaign=mail_chimp_campaign, status=status)

    @property
    def status(self):
        return self.__status

    def write(self, oprot):
        oprot.writeStructBegin('MailCampaign')

        if self.content is not None:
            oprot.writeFieldBegin('content', 12, -1)
            self.content.write(oprot)
            oprot.writeFieldEnd()

        if self.id is not None:
            oprot.writeFieldBegin('id', 11, -1)
            oprot.writeString(self.id)
            oprot.writeFieldEnd()

        if self.mail_chimp_campaign is not None:
            oprot.writeFieldBegin('mail_chimp_campaign', 12, -1)
            self.mail_chimp_campaign.write(oprot)
            oprot.writeFieldEnd()

        if self.status is not None:
            oprot.writeFieldBegin('status', 11, -1)
            oprot.writeString([attr for attr in dir(yogento.api.models.mail.campaign.mail_campaign_status.MailCampaignStatus) if getattr(yogento.api.models.mail.campaign.mail_campaign_status.MailCampaignStatus, attr) == self.status][0])
            oprot.writeFieldEnd()

        oprot.writeFieldStop()

        oprot.writeStructEnd()

        return self
