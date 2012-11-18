import __builtin__
import yochimp.models.campaign.campaign_content


class MailCampaignContent(object):
    class Builder:
        def __init__(
            self,
            mail_chimp_campaign_content
        ):
            self.__mail_chimp_campaign_content = mail_chimp_campaign_content

        def build(self):
            return MailCampaignContent(mail_chimp_campaign_content=self.__mail_chimp_campaign_content)

        def set_mail_chimp_campaign_content(self, mail_chimp_campaign_content):
            self.__mail_chimp_campaign_content = mail_chimp_campaign_content
            return self

        def update(self, mail_campaign_content):
            if isinstance(mail_campaign_content, MailCampaignContent):
                self.set_mail_chimp_campaign_content(mail_campaign_content.mail_chimp_campaign_content)
            elif isinstance(mail_campaign_content, dict):
                for key, value in mail_campaign_content.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(mail_campaign_content)
            return self

    def __init__(
        self,
        mail_chimp_campaign_content
    ):
        if mail_chimp_campaign_content is None:
            raise ValueError('mail_chimp_campaign_content is required')
        if not isinstance(mail_chimp_campaign_content, yochimp.models.campaign.campaign_content.CampaignContent):
            raise TypeError(getattr(__builtin__, 'type')(mail_chimp_campaign_content))
        self.__mail_chimp_campaign_content = mail_chimp_campaign_content

    def __eq__(self, other):
        if self.mail_chimp_campaign_content != other.mail_chimp_campaign_content:
            return False
        return True

    def __hash__(self):
        return hash(self.mail_chimp_campaign_content)

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        field_reprs.append('mail_chimp_campaign_content=' + repr(self.mail_chimp_campaign_content))
        return 'MailCampaignContent(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        field_reprs.append('mail_chimp_campaign_content=' + repr(self.mail_chimp_campaign_content))
        return 'MailCampaignContent(' + ', '.join(field_reprs) + ')'

    def as_dict(self):
        return {'mail_chimp_campaign_content': self.mail_chimp_campaign_content}

    @property
    def mail_chimp_campaign_content(self):
        return self.__mail_chimp_campaign_content

    @classmethod
    def read(cls, iprot):
        init_kwds = {}

        iprot.readStructBegin()
        while True:
            ifield_name, ifield_type, _ifield_id = iprot.readFieldBegin()
            if ifield_type == 0: # STOP
                break
            elif ifield_name == 'mail_chimp_campaign_content':
                init_kwds['mail_chimp_campaign_content'] = yochimp.models.campaign.campaign_content.CampaignContent.read(iprot)
            iprot.readFieldEnd()
        iprot.readStructEnd()

        return cls(**init_kwds)

    def replace(self, mail_chimp_campaign_content=None):
        if mail_chimp_campaign_content is None:
            mail_chimp_campaign_content = self.mail_chimp_campaign_content
        return self.__class__(mail_chimp_campaign_content=mail_chimp_campaign_content)

    def write(self, oprot):
        oprot.writeStructBegin('MailCampaignContent')

        oprot.writeFieldBegin('mail_chimp_campaign_content', 12, -1)
        self.mail_chimp_campaign_content.write(oprot)
        oprot.writeFieldEnd()

        oprot.writeFieldStop()

        oprot.writeStructEnd()
