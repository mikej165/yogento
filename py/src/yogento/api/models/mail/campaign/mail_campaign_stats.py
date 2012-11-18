import __builtin__
import yochimp.models.campaign.campaign_stats


class MailCampaignStats(object):
    class Builder:
        def __init__(
            self,
            mail_chimp_campaign_stats
        ):
            self.__mail_chimp_campaign_stats = mail_chimp_campaign_stats

        def build(self):
            return MailCampaignStats(mail_chimp_campaign_stats=self.__mail_chimp_campaign_stats)

        def set_mail_chimp_campaign_stats(self, mail_chimp_campaign_stats):
            self.__mail_chimp_campaign_stats = mail_chimp_campaign_stats
            return self

        def update(self, mail_campaign_stats):
            if isinstance(mail_campaign_stats, MailCampaignStats):
                self.set_mail_chimp_campaign_stats(mail_campaign_stats.mail_chimp_campaign_stats)
            elif isinstance(mail_campaign_stats, dict):
                for key, value in mail_campaign_stats.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(mail_campaign_stats)
            return self

    def __init__(
        self,
        mail_chimp_campaign_stats
    ):
        if mail_chimp_campaign_stats is None:
            raise ValueError('mail_chimp_campaign_stats is required')
        if not isinstance(mail_chimp_campaign_stats, yochimp.models.campaign.campaign_stats.CampaignStats):
            raise TypeError(getattr(__builtin__, 'type')(mail_chimp_campaign_stats))
        self.__mail_chimp_campaign_stats = mail_chimp_campaign_stats

    def __eq__(self, other):
        if self.mail_chimp_campaign_stats != other.mail_chimp_campaign_stats:
            return False
        return True

    def __hash__(self):
        return hash(self.mail_chimp_campaign_stats)

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        field_reprs.append('mail_chimp_campaign_stats=' + repr(self.mail_chimp_campaign_stats))
        return 'MailCampaignStats(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        field_reprs.append('mail_chimp_campaign_stats=' + repr(self.mail_chimp_campaign_stats))
        return 'MailCampaignStats(' + ', '.join(field_reprs) + ')'

    def as_dict(self):
        return {'mail_chimp_campaign_stats': self.mail_chimp_campaign_stats}

    @property
    def mail_chimp_campaign_stats(self):
        return self.__mail_chimp_campaign_stats

    @classmethod
    def read(cls, iprot):
        init_kwds = {}

        iprot.readStructBegin()
        while True:
            ifield_name, ifield_type, _ifield_id = iprot.readFieldBegin()
            if ifield_type == 0: # STOP
                break
            elif ifield_name == 'mail_chimp_campaign_stats':
                init_kwds['mail_chimp_campaign_stats'] = yochimp.models.campaign.campaign_stats.CampaignStats.read(iprot)
            iprot.readFieldEnd()
        iprot.readStructEnd()

        return cls(**init_kwds)

    def replace(self, mail_chimp_campaign_stats=None):
        if mail_chimp_campaign_stats is None:
            mail_chimp_campaign_stats = self.mail_chimp_campaign_stats
        return self.__class__(mail_chimp_campaign_stats=mail_chimp_campaign_stats)

    def write(self, oprot):
        oprot.writeStructBegin('MailCampaignStats')

        oprot.writeFieldBegin('mail_chimp_campaign_stats', 12, -1)
        self.mail_chimp_campaign_stats.write(oprot)
        oprot.writeFieldEnd()

        oprot.writeFieldStop()

        oprot.writeStructEnd()
