from datetime import datetime
from time import mktime
import __builtin__


class CampaignStats(object):
    class Builder:
        def __init__(
            self,
            syntax_errors,
            hard_bounces,
            soft_bounces,
            unsubscribes,
            abuse_reports,
            forwards,
            forwards_opens,
            opens,
            unique_opens,
            clicks,
            unique_clicks,
            users_who_clicked,
            emails_sent,
            unique_likes,
            recipient_likes,
            facebook_likes,
            last_open=None,
            last_click=None
        ):
            self.__syntax_errors = syntax_errors
            self.__hard_bounces = hard_bounces
            self.__soft_bounces = soft_bounces
            self.__unsubscribes = unsubscribes
            self.__abuse_reports = abuse_reports
            self.__forwards = forwards
            self.__forwards_opens = forwards_opens
            self.__opens = opens
            self.__last_open = last_open
            self.__unique_opens = unique_opens
            self.__clicks = clicks
            self.__unique_clicks = unique_clicks
            self.__last_click = last_click
            self.__users_who_clicked = users_who_clicked
            self.__emails_sent = emails_sent
            self.__unique_likes = unique_likes
            self.__recipient_likes = recipient_likes
            self.__facebook_likes = facebook_likes

        def build(self):
            return CampaignStats(syntax_errors=self.__syntax_errors, hard_bounces=self.__hard_bounces, soft_bounces=self.__soft_bounces, unsubscribes=self.__unsubscribes, abuse_reports=self.__abuse_reports, forwards=self.__forwards, forwards_opens=self.__forwards_opens, opens=self.__opens, last_open=self.__last_open, unique_opens=self.__unique_opens, clicks=self.__clicks, unique_clicks=self.__unique_clicks, last_click=self.__last_click, users_who_clicked=self.__users_who_clicked, emails_sent=self.__emails_sent, unique_likes=self.__unique_likes, recipient_likes=self.__recipient_likes, facebook_likes=self.__facebook_likes)

        def set_abuse_reports(self, abuse_reports):
            self.__abuse_reports = abuse_reports
            return self

        def set_clicks(self, clicks):
            self.__clicks = clicks
            return self

        def set_emails_sent(self, emails_sent):
            self.__emails_sent = emails_sent
            return self

        def set_facebook_likes(self, facebook_likes):
            self.__facebook_likes = facebook_likes
            return self

        def set_forwards(self, forwards):
            self.__forwards = forwards
            return self

        def set_forwards_opens(self, forwards_opens):
            self.__forwards_opens = forwards_opens
            return self

        def set_hard_bounces(self, hard_bounces):
            self.__hard_bounces = hard_bounces
            return self

        def set_last_click(self, last_click):
            self.__last_click = last_click
            return self

        def set_last_open(self, last_open):
            self.__last_open = last_open
            return self

        def set_opens(self, opens):
            self.__opens = opens
            return self

        def set_recipient_likes(self, recipient_likes):
            self.__recipient_likes = recipient_likes
            return self

        def set_soft_bounces(self, soft_bounces):
            self.__soft_bounces = soft_bounces
            return self

        def set_syntax_errors(self, syntax_errors):
            self.__syntax_errors = syntax_errors
            return self

        def set_unique_clicks(self, unique_clicks):
            self.__unique_clicks = unique_clicks
            return self

        def set_unique_likes(self, unique_likes):
            self.__unique_likes = unique_likes
            return self

        def set_unique_opens(self, unique_opens):
            self.__unique_opens = unique_opens
            return self

        def set_unsubscribes(self, unsubscribes):
            self.__unsubscribes = unsubscribes
            return self

        def set_users_who_clicked(self, users_who_clicked):
            self.__users_who_clicked = users_who_clicked
            return self

        def update(self, campaign_stats):
            if isinstance(campaign_stats, CampaignStats):
                self.set_syntax_errors(campaign_stats.syntax_errors)
                self.set_hard_bounces(campaign_stats.hard_bounces)
                self.set_soft_bounces(campaign_stats.soft_bounces)
                self.set_unsubscribes(campaign_stats.unsubscribes)
                self.set_abuse_reports(campaign_stats.abuse_reports)
                self.set_forwards(campaign_stats.forwards)
                self.set_forwards_opens(campaign_stats.forwards_opens)
                self.set_opens(campaign_stats.opens)
                self.set_last_open(campaign_stats.last_open)
                self.set_unique_opens(campaign_stats.unique_opens)
                self.set_clicks(campaign_stats.clicks)
                self.set_unique_clicks(campaign_stats.unique_clicks)
                self.set_last_click(campaign_stats.last_click)
                self.set_users_who_clicked(campaign_stats.users_who_clicked)
                self.set_emails_sent(campaign_stats.emails_sent)
                self.set_unique_likes(campaign_stats.unique_likes)
                self.set_recipient_likes(campaign_stats.recipient_likes)
                self.set_facebook_likes(campaign_stats.facebook_likes)
            elif isinstance(campaign_stats, dict):
                for key, value in campaign_stats.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(campaign_stats)
            return self

    def __init__(
        self,
        syntax_errors,
        hard_bounces,
        soft_bounces,
        unsubscribes,
        abuse_reports,
        forwards,
        forwards_opens,
        opens,
        unique_opens,
        clicks,
        unique_clicks,
        users_who_clicked,
        emails_sent,
        unique_likes,
        recipient_likes,
        facebook_likes,
        last_open=None,
        last_click=None
    ):
        if syntax_errors is None:
            raise ValueError('syntax_errors is required')
        if not isinstance(syntax_errors, int):
            raise TypeError(getattr(__builtin__, 'type')(syntax_errors))
        self.__syntax_errors = syntax_errors

        if hard_bounces is None:
            raise ValueError('hard_bounces is required')
        if not isinstance(hard_bounces, int):
            raise TypeError(getattr(__builtin__, 'type')(hard_bounces))
        self.__hard_bounces = hard_bounces

        if soft_bounces is None:
            raise ValueError('soft_bounces is required')
        if not isinstance(soft_bounces, int):
            raise TypeError(getattr(__builtin__, 'type')(soft_bounces))
        self.__soft_bounces = soft_bounces

        if unsubscribes is None:
            raise ValueError('unsubscribes is required')
        if not isinstance(unsubscribes, int):
            raise TypeError(getattr(__builtin__, 'type')(unsubscribes))
        self.__unsubscribes = unsubscribes

        if abuse_reports is None:
            raise ValueError('abuse_reports is required')
        if not isinstance(abuse_reports, int):
            raise TypeError(getattr(__builtin__, 'type')(abuse_reports))
        self.__abuse_reports = abuse_reports

        if forwards is None:
            raise ValueError('forwards is required')
        if not isinstance(forwards, int):
            raise TypeError(getattr(__builtin__, 'type')(forwards))
        self.__forwards = forwards

        if forwards_opens is None:
            raise ValueError('forwards_opens is required')
        if not isinstance(forwards_opens, int):
            raise TypeError(getattr(__builtin__, 'type')(forwards_opens))
        self.__forwards_opens = forwards_opens

        if opens is None:
            raise ValueError('opens is required')
        if not isinstance(opens, int):
            raise TypeError(getattr(__builtin__, 'type')(opens))
        self.__opens = opens

        if last_open is not None:
            if not isinstance(last_open, datetime):
                raise TypeError(getattr(__builtin__, 'type')(last_open))
        self.__last_open = last_open

        if unique_opens is None:
            raise ValueError('unique_opens is required')
        if not isinstance(unique_opens, int):
            raise TypeError(getattr(__builtin__, 'type')(unique_opens))
        self.__unique_opens = unique_opens

        if clicks is None:
            raise ValueError('clicks is required')
        if not isinstance(clicks, int):
            raise TypeError(getattr(__builtin__, 'type')(clicks))
        self.__clicks = clicks

        if unique_clicks is None:
            raise ValueError('unique_clicks is required')
        if not isinstance(unique_clicks, int):
            raise TypeError(getattr(__builtin__, 'type')(unique_clicks))
        self.__unique_clicks = unique_clicks

        if last_click is not None:
            if not isinstance(last_click, datetime):
                raise TypeError(getattr(__builtin__, 'type')(last_click))
        self.__last_click = last_click

        if users_who_clicked is None:
            raise ValueError('users_who_clicked is required')
        if not isinstance(users_who_clicked, int):
            raise TypeError(getattr(__builtin__, 'type')(users_who_clicked))
        self.__users_who_clicked = users_who_clicked

        if emails_sent is None:
            raise ValueError('emails_sent is required')
        if not isinstance(emails_sent, int):
            raise TypeError(getattr(__builtin__, 'type')(emails_sent))
        self.__emails_sent = emails_sent

        if unique_likes is None:
            raise ValueError('unique_likes is required')
        if not isinstance(unique_likes, int):
            raise TypeError(getattr(__builtin__, 'type')(unique_likes))
        self.__unique_likes = unique_likes

        if recipient_likes is None:
            raise ValueError('recipient_likes is required')
        if not isinstance(recipient_likes, int):
            raise TypeError(getattr(__builtin__, 'type')(recipient_likes))
        self.__recipient_likes = recipient_likes

        if facebook_likes is None:
            raise ValueError('facebook_likes is required')
        if not isinstance(facebook_likes, int):
            raise TypeError(getattr(__builtin__, 'type')(facebook_likes))
        self.__facebook_likes = facebook_likes

    def __eq__(self, other):
        if self.syntax_errors != other.syntax_errors:
            return False
        if self.hard_bounces != other.hard_bounces:
            return False
        if self.soft_bounces != other.soft_bounces:
            return False
        if self.unsubscribes != other.unsubscribes:
            return False
        if self.abuse_reports != other.abuse_reports:
            return False
        if self.forwards != other.forwards:
            return False
        if self.forwards_opens != other.forwards_opens:
            return False
        if self.opens != other.opens:
            return False
        if self.last_open != other.last_open:
            return False
        if self.unique_opens != other.unique_opens:
            return False
        if self.clicks != other.clicks:
            return False
        if self.unique_clicks != other.unique_clicks:
            return False
        if self.last_click != other.last_click:
            return False
        if self.users_who_clicked != other.users_who_clicked:
            return False
        if self.emails_sent != other.emails_sent:
            return False
        if self.unique_likes != other.unique_likes:
            return False
        if self.recipient_likes != other.recipient_likes:
            return False
        if self.facebook_likes != other.facebook_likes:
            return False
        return True

    def __hash__(self):
        return hash((self.syntax_errors,self.hard_bounces,self.soft_bounces,self.unsubscribes,self.abuse_reports,self.forwards,self.forwards_opens,self.opens,self.last_open,self.unique_opens,self.clicks,self.unique_clicks,self.last_click,self.users_who_clicked,self.emails_sent,self.unique_likes,self.recipient_likes,self.facebook_likes,))

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        field_reprs.append('syntax_errors=' + repr(self.syntax_errors))
        field_reprs.append('hard_bounces=' + repr(self.hard_bounces))
        field_reprs.append('soft_bounces=' + repr(self.soft_bounces))
        field_reprs.append('unsubscribes=' + repr(self.unsubscribes))
        field_reprs.append('abuse_reports=' + repr(self.abuse_reports))
        field_reprs.append('forwards=' + repr(self.forwards))
        field_reprs.append('forwards_opens=' + repr(self.forwards_opens))
        field_reprs.append('opens=' + repr(self.opens))
        if self.last_open is not None:
            field_reprs.append('last_open=' + repr(self.last_open))
        field_reprs.append('unique_opens=' + repr(self.unique_opens))
        field_reprs.append('clicks=' + repr(self.clicks))
        field_reprs.append('unique_clicks=' + repr(self.unique_clicks))
        if self.last_click is not None:
            field_reprs.append('last_click=' + repr(self.last_click))
        field_reprs.append('users_who_clicked=' + repr(self.users_who_clicked))
        field_reprs.append('emails_sent=' + repr(self.emails_sent))
        field_reprs.append('unique_likes=' + repr(self.unique_likes))
        field_reprs.append('recipient_likes=' + repr(self.recipient_likes))
        field_reprs.append('facebook_likes=' + repr(self.facebook_likes))
        return 'CampaignStats(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        field_reprs.append('syntax_errors=' + repr(self.syntax_errors))
        field_reprs.append('hard_bounces=' + repr(self.hard_bounces))
        field_reprs.append('soft_bounces=' + repr(self.soft_bounces))
        field_reprs.append('unsubscribes=' + repr(self.unsubscribes))
        field_reprs.append('abuse_reports=' + repr(self.abuse_reports))
        field_reprs.append('forwards=' + repr(self.forwards))
        field_reprs.append('forwards_opens=' + repr(self.forwards_opens))
        field_reprs.append('opens=' + repr(self.opens))
        if self.last_open is not None:
            field_reprs.append('last_open=' + repr(self.last_open))
        field_reprs.append('unique_opens=' + repr(self.unique_opens))
        field_reprs.append('clicks=' + repr(self.clicks))
        field_reprs.append('unique_clicks=' + repr(self.unique_clicks))
        if self.last_click is not None:
            field_reprs.append('last_click=' + repr(self.last_click))
        field_reprs.append('users_who_clicked=' + repr(self.users_who_clicked))
        field_reprs.append('emails_sent=' + repr(self.emails_sent))
        field_reprs.append('unique_likes=' + repr(self.unique_likes))
        field_reprs.append('recipient_likes=' + repr(self.recipient_likes))
        field_reprs.append('facebook_likes=' + repr(self.facebook_likes))
        return 'CampaignStats(' + ', '.join(field_reprs) + ')'

    @property
    def abuse_reports(self):
        return self.__abuse_reports

    def as_dict(self):
        return {'syntax_errors': self.syntax_errors, 'hard_bounces': self.hard_bounces, 'soft_bounces': self.soft_bounces, 'unsubscribes': self.unsubscribes, 'abuse_reports': self.abuse_reports, 'forwards': self.forwards, 'forwards_opens': self.forwards_opens, 'opens': self.opens, 'last_open': self.last_open, 'unique_opens': self.unique_opens, 'clicks': self.clicks, 'unique_clicks': self.unique_clicks, 'last_click': self.last_click, 'users_who_clicked': self.users_who_clicked, 'emails_sent': self.emails_sent, 'unique_likes': self.unique_likes, 'recipient_likes': self.recipient_likes, 'facebook_likes': self.facebook_likes}

    @property
    def clicks(self):
        return self.__clicks

    @property
    def emails_sent(self):
        return self.__emails_sent

    @property
    def facebook_likes(self):
        return self.__facebook_likes

    @property
    def forwards(self):
        return self.__forwards

    @property
    def forwards_opens(self):
        return self.__forwards_opens

    @property
    def hard_bounces(self):
        return self.__hard_bounces

    @property
    def last_click(self):
        return self.__last_click

    @property
    def last_open(self):
        return self.__last_open

    @property
    def opens(self):
        return self.__opens

    @classmethod
    def read(cls, iprot):
        init_kwds = {}

        iprot.readStructBegin()
        while True:
            ifield_name, ifield_type, _ifield_id = iprot.readFieldBegin()
            if ifield_type == 0: # STOP
                break
            elif ifield_name == 'syntax_errors':
                init_kwds['syntax_errors'] = iprot.readI32()
            elif ifield_name == 'hard_bounces':
                init_kwds['hard_bounces'] = iprot.readI32()
            elif ifield_name == 'soft_bounces':
                init_kwds['soft_bounces'] = iprot.readI32()
            elif ifield_name == 'unsubscribes':
                init_kwds['unsubscribes'] = iprot.readI32()
            elif ifield_name == 'abuse_reports':
                init_kwds['abuse_reports'] = iprot.readI32()
            elif ifield_name == 'forwards':
                init_kwds['forwards'] = iprot.readI32()
            elif ifield_name == 'forwards_opens':
                init_kwds['forwards_opens'] = iprot.readI32()
            elif ifield_name == 'opens':
                init_kwds['opens'] = iprot.readI32()
            elif ifield_name == 'last_open':
                try:
                    init_kwds['last_open'] = iprot.readDateTime() if hasattr(iprot, 'readDateTime') else datetime.fromtimestamp(iprot.readI64() / 1000.0)
                except (TypeError,):
                    pass
            elif ifield_name == 'unique_opens':
                init_kwds['unique_opens'] = iprot.readI32()
            elif ifield_name == 'clicks':
                init_kwds['clicks'] = iprot.readI32()
            elif ifield_name == 'unique_clicks':
                init_kwds['unique_clicks'] = iprot.readI32()
            elif ifield_name == 'last_click':
                try:
                    init_kwds['last_click'] = iprot.readDateTime() if hasattr(iprot, 'readDateTime') else datetime.fromtimestamp(iprot.readI64() / 1000.0)
                except (TypeError,):
                    pass
            elif ifield_name == 'users_who_clicked':
                init_kwds['users_who_clicked'] = iprot.readI32()
            elif ifield_name == 'emails_sent':
                init_kwds['emails_sent'] = iprot.readI32()
            elif ifield_name == 'unique_likes':
                init_kwds['unique_likes'] = iprot.readI32()
            elif ifield_name == 'recipient_likes':
                init_kwds['recipient_likes'] = iprot.readI32()
            elif ifield_name == 'facebook_likes':
                init_kwds['facebook_likes'] = iprot.readI32()
            iprot.readFieldEnd()
        iprot.readStructEnd()

        return cls(**init_kwds)

    @property
    def recipient_likes(self):
        return self.__recipient_likes

    def replace(self, syntax_errors=None, hard_bounces=None, soft_bounces=None, unsubscribes=None, abuse_reports=None, forwards=None, forwards_opens=None, opens=None, last_open=None, unique_opens=None, clicks=None, unique_clicks=None, last_click=None, users_who_clicked=None, emails_sent=None, unique_likes=None, recipient_likes=None, facebook_likes=None):
        if syntax_errors is None:
            syntax_errors = self.syntax_errors
        if hard_bounces is None:
            hard_bounces = self.hard_bounces
        if soft_bounces is None:
            soft_bounces = self.soft_bounces
        if unsubscribes is None:
            unsubscribes = self.unsubscribes
        if abuse_reports is None:
            abuse_reports = self.abuse_reports
        if forwards is None:
            forwards = self.forwards
        if forwards_opens is None:
            forwards_opens = self.forwards_opens
        if opens is None:
            opens = self.opens
        if last_open is None:
            last_open = self.last_open
        if unique_opens is None:
            unique_opens = self.unique_opens
        if clicks is None:
            clicks = self.clicks
        if unique_clicks is None:
            unique_clicks = self.unique_clicks
        if last_click is None:
            last_click = self.last_click
        if users_who_clicked is None:
            users_who_clicked = self.users_who_clicked
        if emails_sent is None:
            emails_sent = self.emails_sent
        if unique_likes is None:
            unique_likes = self.unique_likes
        if recipient_likes is None:
            recipient_likes = self.recipient_likes
        if facebook_likes is None:
            facebook_likes = self.facebook_likes
        return self.__class__(syntax_errors=syntax_errors, hard_bounces=hard_bounces, soft_bounces=soft_bounces, unsubscribes=unsubscribes, abuse_reports=abuse_reports, forwards=forwards, forwards_opens=forwards_opens, opens=opens, last_open=last_open, unique_opens=unique_opens, clicks=clicks, unique_clicks=unique_clicks, last_click=last_click, users_who_clicked=users_who_clicked, emails_sent=emails_sent, unique_likes=unique_likes, recipient_likes=recipient_likes, facebook_likes=facebook_likes)

    @property
    def soft_bounces(self):
        return self.__soft_bounces

    @property
    def syntax_errors(self):
        return self.__syntax_errors

    @property
    def unique_clicks(self):
        return self.__unique_clicks

    @property
    def unique_likes(self):
        return self.__unique_likes

    @property
    def unique_opens(self):
        return self.__unique_opens

    @property
    def unsubscribes(self):
        return self.__unsubscribes

    @property
    def users_who_clicked(self):
        return self.__users_who_clicked

    def write(self, oprot):
        oprot.writeStructBegin('CampaignStats')

        oprot.writeFieldBegin('syntax_errors', 8, -1)
        oprot.writeI32(self.syntax_errors)
        oprot.writeFieldEnd()

        oprot.writeFieldBegin('hard_bounces', 8, -1)
        oprot.writeI32(self.hard_bounces)
        oprot.writeFieldEnd()

        oprot.writeFieldBegin('soft_bounces', 8, -1)
        oprot.writeI32(self.soft_bounces)
        oprot.writeFieldEnd()

        oprot.writeFieldBegin('unsubscribes', 8, -1)
        oprot.writeI32(self.unsubscribes)
        oprot.writeFieldEnd()

        oprot.writeFieldBegin('abuse_reports', 8, -1)
        oprot.writeI32(self.abuse_reports)
        oprot.writeFieldEnd()

        oprot.writeFieldBegin('forwards', 8, -1)
        oprot.writeI32(self.forwards)
        oprot.writeFieldEnd()

        oprot.writeFieldBegin('forwards_opens', 8, -1)
        oprot.writeI32(self.forwards_opens)
        oprot.writeFieldEnd()

        oprot.writeFieldBegin('opens', 8, -1)
        oprot.writeI32(self.opens)
        oprot.writeFieldEnd()

        if self.last_open is not None:
            oprot.writeFieldBegin('last_open', 12, -1)
            oprot.writeDateTime(self.last_open) if hasattr(oprot, 'writeDateTime') else oprot.writeI64(long(mktime(self.last_open.timetuple())) * 1000l)
            oprot.writeFieldEnd()

        oprot.writeFieldBegin('unique_opens', 8, -1)
        oprot.writeI32(self.unique_opens)
        oprot.writeFieldEnd()

        oprot.writeFieldBegin('clicks', 8, -1)
        oprot.writeI32(self.clicks)
        oprot.writeFieldEnd()

        oprot.writeFieldBegin('unique_clicks', 8, -1)
        oprot.writeI32(self.unique_clicks)
        oprot.writeFieldEnd()

        if self.last_click is not None:
            oprot.writeFieldBegin('last_click', 12, -1)
            oprot.writeDateTime(self.last_click) if hasattr(oprot, 'writeDateTime') else oprot.writeI64(long(mktime(self.last_click.timetuple())) * 1000l)
            oprot.writeFieldEnd()

        oprot.writeFieldBegin('users_who_clicked', 8, -1)
        oprot.writeI32(self.users_who_clicked)
        oprot.writeFieldEnd()

        oprot.writeFieldBegin('emails_sent', 8, -1)
        oprot.writeI32(self.emails_sent)
        oprot.writeFieldEnd()

        oprot.writeFieldBegin('unique_likes', 8, -1)
        oprot.writeI32(self.unique_likes)
        oprot.writeFieldEnd()

        oprot.writeFieldBegin('recipient_likes', 8, -1)
        oprot.writeI32(self.recipient_likes)
        oprot.writeFieldEnd()

        oprot.writeFieldBegin('facebook_likes', 8, -1)
        oprot.writeI32(self.facebook_likes)
        oprot.writeFieldEnd()

        oprot.writeFieldStop()

        oprot.writeStructEnd()

        return self
