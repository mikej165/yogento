from datetime import datetime
from itertools import ifilterfalse
from time import mktime
import __builtin__
import yogento.api.models.mail.campaign.mail_campaign
import yogento.api.models.mail.campaign.mail_campaign_content


class MailServiceHack(object):
    class Builder:
        def __init__(
            self,
            campaign,
            content,
            schedule_time=None,
            schedule_time_b=None,
            test_emails=None
        ):
            self.__campaign = campaign
            self.__content = content
            self.__schedule_time = schedule_time
            self.__schedule_time_b = schedule_time_b
            self.__test_emails = test_emails

        def build(self):
            return MailServiceHack(campaign=self.__campaign, content=self.__content, schedule_time=self.__schedule_time, schedule_time_b=self.__schedule_time_b, test_emails=self.__test_emails)

        def set_campaign(self, campaign):
            self.__campaign = campaign
            return self

        def set_content(self, content):
            self.__content = content
            return self

        def set_schedule_time(self, schedule_time):
            self.__schedule_time = schedule_time
            return self

        def set_schedule_time_b(self, schedule_time_b):
            self.__schedule_time_b = schedule_time_b
            return self

        def set_test_emails(self, test_emails):
            self.__test_emails = test_emails
            return self

        def update(self, mail_service_hack):
            if isinstance(mail_service_hack, MailServiceHack):
                self.set_campaign(mail_service_hack.campaign)
                self.set_content(mail_service_hack.content)
                self.set_schedule_time(mail_service_hack.schedule_time)
                self.set_schedule_time_b(mail_service_hack.schedule_time_b)
                self.set_test_emails(mail_service_hack.test_emails)
            elif isinstance(mail_service_hack, dict):
                for key, value in mail_service_hack.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(mail_service_hack)
            return self

    def __init__(
        self,
        campaign,
        content,
        schedule_time=None,
        schedule_time_b=None,
        test_emails=None
    ):
        if campaign is None:
            raise ValueError('campaign is required')
        if not isinstance(campaign, yogento.api.models.mail.campaign.mail_campaign.MailCampaign):
            raise TypeError(getattr(__builtin__, 'type')(campaign))
        self.__campaign = campaign

        if content is None:
            raise ValueError('content is required')
        if not isinstance(content, yogento.api.models.mail.campaign.mail_campaign_content.MailCampaignContent):
            raise TypeError(getattr(__builtin__, 'type')(content))
        self.__content = content

        if schedule_time is not None:
            if not isinstance(schedule_time, datetime):
                raise TypeError(getattr(__builtin__, 'type')(schedule_time))
        self.__schedule_time = schedule_time

        if schedule_time_b is not None:
            if not isinstance(schedule_time_b, datetime):
                raise TypeError(getattr(__builtin__, 'type')(schedule_time_b))
        self.__schedule_time_b = schedule_time_b

        if test_emails is not None:
            if not (isinstance(test_emails, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, basestring), test_emails))) == 0):
                raise TypeError(getattr(__builtin__, 'type')(test_emails))
        self.__test_emails = test_emails

    def __eq__(self, other):
        if self.campaign != other.campaign:
            return False
        if self.content != other.content:
            return False
        if self.schedule_time != other.schedule_time:
            return False
        if self.schedule_time_b != other.schedule_time_b:
            return False
        if self.test_emails != other.test_emails:
            return False
        return True

    def __hash__(self):
        return hash((self.campaign,self.content,self.schedule_time,self.schedule_time_b,self.test_emails,))

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        field_reprs.append('campaign=' + repr(self.campaign))
        field_reprs.append('content=' + repr(self.content))
        if self.schedule_time is not None:
            field_reprs.append('schedule_time=' + repr(self.schedule_time))
        if self.schedule_time_b is not None:
            field_reprs.append('schedule_time_b=' + repr(self.schedule_time_b))
        if self.test_emails is not None:
            field_reprs.append('test_emails=' + repr(self.test_emails))
        return 'MailServiceHack(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        field_reprs.append('campaign=' + repr(self.campaign))
        field_reprs.append('content=' + repr(self.content))
        if self.schedule_time is not None:
            field_reprs.append('schedule_time=' + repr(self.schedule_time))
        if self.schedule_time_b is not None:
            field_reprs.append('schedule_time_b=' + repr(self.schedule_time_b))
        if self.test_emails is not None:
            field_reprs.append('test_emails=' + repr(self.test_emails))
        return 'MailServiceHack(' + ', '.join(field_reprs) + ')'

    def as_dict(self):
        return {'campaign': self.campaign, 'content': self.content, 'schedule_time': self.schedule_time, 'schedule_time_b': self.schedule_time_b, 'test_emails': self.test_emails}

    @property
    def campaign(self):
        return self.__campaign

    @property
    def content(self):
        return self.__content

    @classmethod
    def read(cls, iprot):
        init_kwds = {}

        iprot.readStructBegin()
        while True:
            ifield_name, ifield_type, _ifield_id = iprot.readFieldBegin()
            if ifield_type == 0: # STOP
                break
            elif ifield_name == 'campaign':
                init_kwds['campaign'] = yogento.api.models.mail.campaign.mail_campaign.MailCampaign.read(iprot)
            elif ifield_name == 'content':
                init_kwds['content'] = yogento.api.models.mail.campaign.mail_campaign_content.MailCampaignContent.read(iprot)
            elif ifield_name == 'schedule_time':
                try:
                    init_kwds['schedule_time'] = iprot.readDateTime() if hasattr(iprot, 'readDateTime') else datetime.fromtimestamp(iprot.readI64() / 1000.0)
                except (TypeError,):
                    pass
            elif ifield_name == 'schedule_time_b':
                try:
                    init_kwds['schedule_time_b'] = iprot.readDateTime() if hasattr(iprot, 'readDateTime') else datetime.fromtimestamp(iprot.readI64() / 1000.0)
                except (TypeError,):
                    pass
            elif ifield_name == 'test_emails':
                init_kwds['test_emails'] = tuple([iprot.readString() for _ in xrange(iprot.readListBegin()[1])] + (iprot.readListEnd() is None and []))
            iprot.readFieldEnd()
        iprot.readStructEnd()

        return cls(**init_kwds)

    def replace(self, campaign=None, content=None, schedule_time=None, schedule_time_b=None, test_emails=None):
        if campaign is None:
            campaign = self.campaign
        if content is None:
            content = self.content
        if schedule_time is None:
            schedule_time = self.schedule_time
        if schedule_time_b is None:
            schedule_time_b = self.schedule_time_b
        if test_emails is None:
            test_emails = self.test_emails
        return self.__class__(campaign=campaign, content=content, schedule_time=schedule_time, schedule_time_b=schedule_time_b, test_emails=test_emails)

    @property
    def schedule_time(self):
        return self.__schedule_time

    @property
    def schedule_time_b(self):
        return self.__schedule_time_b

    @property
    def test_emails(self):
        return self.__test_emails

    def write(self, oprot):
        oprot.writeStructBegin('MailServiceHack')

        oprot.writeFieldBegin('campaign', 12, -1)
        self.campaign.write(oprot)
        oprot.writeFieldEnd()

        oprot.writeFieldBegin('content', 12, -1)
        self.content.write(oprot)
        oprot.writeFieldEnd()

        if self.schedule_time is not None:
            oprot.writeFieldBegin('schedule_time', 12, -1)
            oprot.writeDateTime(self.schedule_time) if hasattr(oprot, 'writeDateTime') else oprot.writeI64(long(mktime(self.schedule_time.timetuple())) * 1000l)
            oprot.writeFieldEnd()

        if self.schedule_time_b is not None:
            oprot.writeFieldBegin('schedule_time_b', 12, -1)
            oprot.writeDateTime(self.schedule_time_b) if hasattr(oprot, 'writeDateTime') else oprot.writeI64(long(mktime(self.schedule_time_b.timetuple())) * 1000l)
            oprot.writeFieldEnd()

        if self.test_emails is not None:
            oprot.writeFieldBegin('test_emails', 15, -1)
            oprot.writeListBegin(11, len(self.test_emails))
            for _0 in self.test_emails:
                oprot.writeString(_0)
            oprot.writeListEnd()
            oprot.writeFieldEnd()

        oprot.writeFieldStop()

        oprot.writeStructEnd()
