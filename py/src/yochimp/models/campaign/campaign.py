from datetime import datetime
from itertools import ifilterfalse
from time import mktime
import __builtin__
import yochimp.models.campaign.campaign_content_type
import yochimp.models.campaign.campaign_status
import yochimp.models.campaign.campaign_tracking_options
import yochimp.models.campaign.campaign_type


class Campaign(object):
    class Builder:
        def __init__(
            self,
            content_type,
            title,
            type,
            create_time,
            id=None,
            web_id=None,
            list_id=None,
            folder_id=None,
            template_id=None,
            send_time=None,
            emails_sent=None,
            status=None,
            from_name=None,
            from_email=None,
            subject=None,
            to_name=None,
            archive_url=None,
            inline_css=None,
            analytics=None,
            analytics_tag=None,
            authenticate=None,
            ecomm360=None,
            auto_tweet=None,
            auto_fb_post=None,
            auto_footer=None,
            timewarp=None,
            timewarp_schedule=None,
            tracking=None,
            segment_text=None
        ):
            self.__id = id
            self.__web_id = web_id
            self.__list_id = list_id
            self.__folder_id = folder_id
            self.__template_id = template_id
            self.__content_type = content_type
            self.__title = title
            self.__type = type
            self.__create_time = create_time
            self.__send_time = send_time
            self.__emails_sent = emails_sent
            self.__status = status
            self.__from_name = from_name
            self.__from_email = from_email
            self.__subject = subject
            self.__to_name = to_name
            self.__archive_url = archive_url
            self.__inline_css = inline_css
            self.__analytics = analytics
            self.__analytics_tag = analytics_tag
            self.__authenticate = authenticate
            self.__ecomm360 = ecomm360
            self.__auto_tweet = auto_tweet
            self.__auto_fb_post = auto_fb_post
            self.__auto_footer = auto_footer
            self.__timewarp = timewarp
            self.__timewarp_schedule = timewarp_schedule
            self.__tracking = tracking
            self.__segment_text = segment_text

        def build(self):
            return Campaign(id=self.__id, web_id=self.__web_id, list_id=self.__list_id, folder_id=self.__folder_id, template_id=self.__template_id, content_type=self.__content_type, title=self.__title, type=self.__type, create_time=self.__create_time, send_time=self.__send_time, emails_sent=self.__emails_sent, status=self.__status, from_name=self.__from_name, from_email=self.__from_email, subject=self.__subject, to_name=self.__to_name, archive_url=self.__archive_url, inline_css=self.__inline_css, analytics=self.__analytics, analytics_tag=self.__analytics_tag, authenticate=self.__authenticate, ecomm360=self.__ecomm360, auto_tweet=self.__auto_tweet, auto_fb_post=self.__auto_fb_post, auto_footer=self.__auto_footer, timewarp=self.__timewarp, timewarp_schedule=self.__timewarp_schedule, tracking=self.__tracking, segment_text=self.__segment_text)

        def set_analytics(self, analytics):
            self.__analytics = analytics
            return self

        def set_analytics_tag(self, analytics_tag):
            self.__analytics_tag = analytics_tag
            return self

        def set_archive_url(self, archive_url):
            self.__archive_url = archive_url
            return self

        def set_authenticate(self, authenticate):
            self.__authenticate = authenticate
            return self

        def set_auto_fb_post(self, auto_fb_post):
            self.__auto_fb_post = auto_fb_post
            return self

        def set_auto_footer(self, auto_footer):
            self.__auto_footer = auto_footer
            return self

        def set_auto_tweet(self, auto_tweet):
            self.__auto_tweet = auto_tweet
            return self

        def set_content_type(self, content_type):
            self.__content_type = content_type
            return self

        def set_create_time(self, create_time):
            self.__create_time = create_time
            return self

        def set_ecomm360(self, ecomm360):
            self.__ecomm360 = ecomm360
            return self

        def set_emails_sent(self, emails_sent):
            self.__emails_sent = emails_sent
            return self

        def set_folder_id(self, folder_id):
            self.__folder_id = folder_id
            return self

        def set_from_email(self, from_email):
            self.__from_email = from_email
            return self

        def set_from_name(self, from_name):
            self.__from_name = from_name
            return self

        def set_id(self, id):
            self.__id = id
            return self

        def set_inline_css(self, inline_css):
            self.__inline_css = inline_css
            return self

        def set_list_id(self, list_id):
            self.__list_id = list_id
            return self

        def set_segment_text(self, segment_text):
            self.__segment_text = segment_text
            return self

        def set_send_time(self, send_time):
            self.__send_time = send_time
            return self

        def set_status(self, status):
            self.__status = status
            return self

        def set_subject(self, subject):
            self.__subject = subject
            return self

        def set_template_id(self, template_id):
            self.__template_id = template_id
            return self

        def set_timewarp(self, timewarp):
            self.__timewarp = timewarp
            return self

        def set_timewarp_schedule(self, timewarp_schedule):
            self.__timewarp_schedule = timewarp_schedule
            return self

        def set_title(self, title):
            self.__title = title
            return self

        def set_to_name(self, to_name):
            self.__to_name = to_name
            return self

        def set_tracking(self, tracking):
            self.__tracking = tracking
            return self

        def set_type(self, type):
            self.__type = type
            return self

        def set_web_id(self, web_id):
            self.__web_id = web_id
            return self

        def update(self, campaign):
            if isinstance(campaign, Campaign):
                self.set_id(campaign.id)
                self.set_web_id(campaign.web_id)
                self.set_list_id(campaign.list_id)
                self.set_folder_id(campaign.folder_id)
                self.set_template_id(campaign.template_id)
                self.set_content_type(campaign.content_type)
                self.set_title(campaign.title)
                self.set_type(campaign.type)
                self.set_create_time(campaign.create_time)
                self.set_send_time(campaign.send_time)
                self.set_emails_sent(campaign.emails_sent)
                self.set_status(campaign.status)
                self.set_from_name(campaign.from_name)
                self.set_from_email(campaign.from_email)
                self.set_subject(campaign.subject)
                self.set_to_name(campaign.to_name)
                self.set_archive_url(campaign.archive_url)
                self.set_inline_css(campaign.inline_css)
                self.set_analytics(campaign.analytics)
                self.set_analytics_tag(campaign.analytics_tag)
                self.set_authenticate(campaign.authenticate)
                self.set_ecomm360(campaign.ecomm360)
                self.set_auto_tweet(campaign.auto_tweet)
                self.set_auto_fb_post(campaign.auto_fb_post)
                self.set_auto_footer(campaign.auto_footer)
                self.set_timewarp(campaign.timewarp)
                self.set_timewarp_schedule(campaign.timewarp_schedule)
                self.set_tracking(campaign.tracking)
                self.set_segment_text(campaign.segment_text)
            elif isinstance(campaign, dict):
                for key, value in campaign.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(campaign)
            return self

    def __init__(
        self,
        content_type,
        title,
        type,
        create_time,
        id=None,
        web_id=None,
        list_id=None,
        folder_id=None,
        template_id=None,
        send_time=None,
        emails_sent=None,
        status=None,
        from_name=None,
        from_email=None,
        subject=None,
        to_name=None,
        archive_url=None,
        inline_css=None,
        analytics=None,
        analytics_tag=None,
        authenticate=None,
        ecomm360=None,
        auto_tweet=None,
        auto_fb_post=None,
        auto_footer=None,
        timewarp=None,
        timewarp_schedule=None,
        tracking=None,
        segment_text=None
    ):
        if id is not None:
            if not isinstance(id, basestring):
                raise TypeError(getattr(__builtin__, 'type')(id))
        self.__id = id

        if web_id is not None:
            if not isinstance(web_id, int):
                raise TypeError(getattr(__builtin__, 'type')(web_id))
        self.__web_id = web_id

        if list_id is not None:
            if not isinstance(list_id, basestring):
                raise TypeError(getattr(__builtin__, 'type')(list_id))
        self.__list_id = list_id

        if folder_id is not None:
            if not isinstance(folder_id, int):
                raise TypeError(getattr(__builtin__, 'type')(folder_id))
        self.__folder_id = folder_id

        if template_id is not None:
            if not isinstance(template_id, int):
                raise TypeError(getattr(__builtin__, 'type')(template_id))
        self.__template_id = template_id

        if content_type is None:
            raise ValueError('content_type is required')
        if not isinstance(content_type, yochimp.models.campaign.campaign_content_type.CampaignContentType):
            raise TypeError(getattr(__builtin__, 'type')(content_type))
        self.__content_type = content_type

        if title is None:
            raise ValueError('title is required')
        if not isinstance(title, basestring):
            raise TypeError(getattr(__builtin__, 'type')(title))
        self.__title = title

        if type is None:
            raise ValueError('type is required')
        if not isinstance(type, yochimp.models.campaign.campaign_type.CampaignType):
            raise TypeError(getattr(__builtin__, 'type')(type))
        self.__type = type

        if create_time is None:
            raise ValueError('create_time is required')
        if not isinstance(create_time, datetime):
            raise TypeError(getattr(__builtin__, 'type')(create_time))
        self.__create_time = create_time

        if send_time is not None:
            if not isinstance(send_time, datetime):
                raise TypeError(getattr(__builtin__, 'type')(send_time))
        self.__send_time = send_time

        if emails_sent is not None:
            if not isinstance(emails_sent, int):
                raise TypeError(getattr(__builtin__, 'type')(emails_sent))
        self.__emails_sent = emails_sent

        if status is not None:
            if not isinstance(status, yochimp.models.campaign.campaign_status.CampaignStatus):
                raise TypeError(getattr(__builtin__, 'type')(status))
        self.__status = status

        if from_name is not None:
            if not isinstance(from_name, basestring):
                raise TypeError(getattr(__builtin__, 'type')(from_name))
        self.__from_name = from_name

        if from_email is not None:
            if not isinstance(from_email, str):
                raise TypeError(getattr(__builtin__, 'type')(from_email))
        self.__from_email = from_email

        if subject is not None:
            if not isinstance(subject, basestring):
                raise TypeError(getattr(__builtin__, 'type')(subject))
        self.__subject = subject

        if to_name is not None:
            if not isinstance(to_name, basestring):
                raise TypeError(getattr(__builtin__, 'type')(to_name))
        self.__to_name = to_name

        if archive_url is not None:
            if not isinstance(archive_url, str):
                raise TypeError(getattr(__builtin__, 'type')(archive_url))
        self.__archive_url = archive_url

        if inline_css is not None:
            if not isinstance(inline_css, bool):
                raise TypeError(getattr(__builtin__, 'type')(inline_css))
        self.__inline_css = inline_css

        if analytics is not None:
            if not isinstance(analytics, basestring):
                raise TypeError(getattr(__builtin__, 'type')(analytics))
        self.__analytics = analytics

        if analytics_tag is not None:
            if not isinstance(analytics_tag, basestring):
                raise TypeError(getattr(__builtin__, 'type')(analytics_tag))
        self.__analytics_tag = analytics_tag

        if authenticate is not None:
            if not isinstance(authenticate, bool):
                raise TypeError(getattr(__builtin__, 'type')(authenticate))
        self.__authenticate = authenticate

        if ecomm360 is not None:
            if not isinstance(ecomm360, bool):
                raise TypeError(getattr(__builtin__, 'type')(ecomm360))
        self.__ecomm360 = ecomm360

        if auto_tweet is not None:
            if not isinstance(auto_tweet, bool):
                raise TypeError(getattr(__builtin__, 'type')(auto_tweet))
        self.__auto_tweet = auto_tweet

        if auto_fb_post is not None:
            if not (isinstance(auto_fb_post, frozenset) and len(list(ifilterfalse(lambda _: isinstance(_, basestring), auto_fb_post))) == 0):
                raise TypeError(getattr(__builtin__, 'type')(auto_fb_post))
        self.__auto_fb_post = auto_fb_post

        if auto_footer is not None:
            if not isinstance(auto_footer, bool):
                raise TypeError(getattr(__builtin__, 'type')(auto_footer))
        self.__auto_footer = auto_footer

        if timewarp is not None:
            if not isinstance(timewarp, bool):
                raise TypeError(getattr(__builtin__, 'type')(timewarp))
        self.__timewarp = timewarp

        if timewarp_schedule is not None:
            if not isinstance(timewarp_schedule, datetime):
                raise TypeError(getattr(__builtin__, 'type')(timewarp_schedule))
        self.__timewarp_schedule = timewarp_schedule

        if tracking is not None:
            if not isinstance(tracking, yochimp.models.campaign.campaign_tracking_options.CampaignTrackingOptions):
                raise TypeError(getattr(__builtin__, 'type')(tracking))
        self.__tracking = tracking

        if segment_text is not None:
            if not isinstance(segment_text, basestring):
                raise TypeError(getattr(__builtin__, 'type')(segment_text))
        self.__segment_text = segment_text

    def __eq__(self, other):
        if self.id != other.id:
            return False
        if self.web_id != other.web_id:
            return False
        if self.list_id != other.list_id:
            return False
        if self.folder_id != other.folder_id:
            return False
        if self.template_id != other.template_id:
            return False
        if self.content_type != other.content_type:
            return False
        if self.title != other.title:
            return False
        if self.type != other.type:
            return False
        if self.create_time != other.create_time:
            return False
        if self.send_time != other.send_time:
            return False
        if self.emails_sent != other.emails_sent:
            return False
        if self.status != other.status:
            return False
        if self.from_name != other.from_name:
            return False
        if self.from_email != other.from_email:
            return False
        if self.subject != other.subject:
            return False
        if self.to_name != other.to_name:
            return False
        if self.archive_url != other.archive_url:
            return False
        if self.inline_css != other.inline_css:
            return False
        if self.analytics != other.analytics:
            return False
        if self.analytics_tag != other.analytics_tag:
            return False
        if self.authenticate != other.authenticate:
            return False
        if self.ecomm360 != other.ecomm360:
            return False
        if self.auto_tweet != other.auto_tweet:
            return False
        if self.auto_fb_post != other.auto_fb_post:
            return False
        if self.auto_footer != other.auto_footer:
            return False
        if self.timewarp != other.timewarp:
            return False
        if self.timewarp_schedule != other.timewarp_schedule:
            return False
        if self.tracking != other.tracking:
            return False
        if self.segment_text != other.segment_text:
            return False
        return True

    def __hash__(self):
        return hash((self.id,self.web_id,self.list_id,self.folder_id,self.template_id,self.content_type,self.title,self.type,self.create_time,self.send_time,self.emails_sent,self.status,self.from_name,self.from_email,self.subject,self.to_name,self.archive_url,self.inline_css,self.analytics,self.analytics_tag,self.authenticate,self.ecomm360,self.auto_tweet,self.auto_fb_post,self.auto_footer,self.timewarp,self.timewarp_schedule,self.tracking,self.segment_text,))

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        if self.id is not None:
            field_reprs.append('id=' + "'" + self.id.encode('ascii', 'replace') + "'")
        if self.web_id is not None:
            field_reprs.append('web_id=' + repr(self.web_id))
        if self.list_id is not None:
            field_reprs.append('list_id=' + "'" + self.list_id.encode('ascii', 'replace') + "'")
        if self.folder_id is not None:
            field_reprs.append('folder_id=' + repr(self.folder_id))
        if self.template_id is not None:
            field_reprs.append('template_id=' + repr(self.template_id))
        field_reprs.append('content_type=' + repr(self.content_type))
        field_reprs.append('title=' + "'" + self.title.encode('ascii', 'replace') + "'")
        field_reprs.append('type=' + repr(self.type))
        field_reprs.append('create_time=' + repr(self.create_time))
        if self.send_time is not None:
            field_reprs.append('send_time=' + repr(self.send_time))
        if self.emails_sent is not None:
            field_reprs.append('emails_sent=' + repr(self.emails_sent))
        if self.status is not None:
            field_reprs.append('status=' + repr(self.status))
        if self.from_name is not None:
            field_reprs.append('from_name=' + "'" + self.from_name.encode('ascii', 'replace') + "'")
        if self.from_email is not None:
            field_reprs.append('from_email=' + repr(self.from_email))
        if self.subject is not None:
            field_reprs.append('subject=' + "'" + self.subject.encode('ascii', 'replace') + "'")
        if self.to_name is not None:
            field_reprs.append('to_name=' + "'" + self.to_name.encode('ascii', 'replace') + "'")
        if self.archive_url is not None:
            field_reprs.append('archive_url=' + repr(self.archive_url))
        if self.inline_css is not None:
            field_reprs.append('inline_css=' + repr(self.inline_css))
        if self.analytics is not None:
            field_reprs.append('analytics=' + "'" + self.analytics.encode('ascii', 'replace') + "'")
        if self.analytics_tag is not None:
            field_reprs.append('analytics_tag=' + "'" + self.analytics_tag.encode('ascii', 'replace') + "'")
        if self.authenticate is not None:
            field_reprs.append('authenticate=' + repr(self.authenticate))
        if self.ecomm360 is not None:
            field_reprs.append('ecomm360=' + repr(self.ecomm360))
        if self.auto_tweet is not None:
            field_reprs.append('auto_tweet=' + repr(self.auto_tweet))
        if self.auto_fb_post is not None:
            field_reprs.append('auto_fb_post=' + repr(self.auto_fb_post))
        if self.auto_footer is not None:
            field_reprs.append('auto_footer=' + repr(self.auto_footer))
        if self.timewarp is not None:
            field_reprs.append('timewarp=' + repr(self.timewarp))
        if self.timewarp_schedule is not None:
            field_reprs.append('timewarp_schedule=' + repr(self.timewarp_schedule))
        if self.tracking is not None:
            field_reprs.append('tracking=' + repr(self.tracking))
        if self.segment_text is not None:
            field_reprs.append('segment_text=' + "'" + self.segment_text.encode('ascii', 'replace') + "'")
        return 'Campaign(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        if self.id is not None:
            field_reprs.append('id=' + "'" + self.id.encode('ascii', 'replace') + "'")
        if self.web_id is not None:
            field_reprs.append('web_id=' + repr(self.web_id))
        if self.list_id is not None:
            field_reprs.append('list_id=' + "'" + self.list_id.encode('ascii', 'replace') + "'")
        if self.folder_id is not None:
            field_reprs.append('folder_id=' + repr(self.folder_id))
        if self.template_id is not None:
            field_reprs.append('template_id=' + repr(self.template_id))
        field_reprs.append('content_type=' + repr(self.content_type))
        field_reprs.append('title=' + "'" + self.title.encode('ascii', 'replace') + "'")
        field_reprs.append('type=' + repr(self.type))
        field_reprs.append('create_time=' + repr(self.create_time))
        if self.send_time is not None:
            field_reprs.append('send_time=' + repr(self.send_time))
        if self.emails_sent is not None:
            field_reprs.append('emails_sent=' + repr(self.emails_sent))
        if self.status is not None:
            field_reprs.append('status=' + repr(self.status))
        if self.from_name is not None:
            field_reprs.append('from_name=' + "'" + self.from_name.encode('ascii', 'replace') + "'")
        if self.from_email is not None:
            field_reprs.append('from_email=' + repr(self.from_email))
        if self.subject is not None:
            field_reprs.append('subject=' + "'" + self.subject.encode('ascii', 'replace') + "'")
        if self.to_name is not None:
            field_reprs.append('to_name=' + "'" + self.to_name.encode('ascii', 'replace') + "'")
        if self.archive_url is not None:
            field_reprs.append('archive_url=' + repr(self.archive_url))
        if self.inline_css is not None:
            field_reprs.append('inline_css=' + repr(self.inline_css))
        if self.analytics is not None:
            field_reprs.append('analytics=' + "'" + self.analytics.encode('ascii', 'replace') + "'")
        if self.analytics_tag is not None:
            field_reprs.append('analytics_tag=' + "'" + self.analytics_tag.encode('ascii', 'replace') + "'")
        if self.authenticate is not None:
            field_reprs.append('authenticate=' + repr(self.authenticate))
        if self.ecomm360 is not None:
            field_reprs.append('ecomm360=' + repr(self.ecomm360))
        if self.auto_tweet is not None:
            field_reprs.append('auto_tweet=' + repr(self.auto_tweet))
        if self.auto_fb_post is not None:
            field_reprs.append('auto_fb_post=' + repr(self.auto_fb_post))
        if self.auto_footer is not None:
            field_reprs.append('auto_footer=' + repr(self.auto_footer))
        if self.timewarp is not None:
            field_reprs.append('timewarp=' + repr(self.timewarp))
        if self.timewarp_schedule is not None:
            field_reprs.append('timewarp_schedule=' + repr(self.timewarp_schedule))
        if self.tracking is not None:
            field_reprs.append('tracking=' + repr(self.tracking))
        if self.segment_text is not None:
            field_reprs.append('segment_text=' + "'" + self.segment_text.encode('ascii', 'replace') + "'")
        return 'Campaign(' + ', '.join(field_reprs) + ')'

    @property
    def analytics(self):
        return self.__analytics

    @property
    def analytics_tag(self):
        return self.__analytics_tag

    @property
    def archive_url(self):
        return self.__archive_url

    def as_dict(self):
        return {'id': self.id, 'web_id': self.web_id, 'list_id': self.list_id, 'folder_id': self.folder_id, 'template_id': self.template_id, 'content_type': self.content_type, 'title': self.title, 'type': self.type, 'create_time': self.create_time, 'send_time': self.send_time, 'emails_sent': self.emails_sent, 'status': self.status, 'from_name': self.from_name, 'from_email': self.from_email, 'subject': self.subject, 'to_name': self.to_name, 'archive_url': self.archive_url, 'inline_css': self.inline_css, 'analytics': self.analytics, 'analytics_tag': self.analytics_tag, 'authenticate': self.authenticate, 'ecomm360': self.ecomm360, 'auto_tweet': self.auto_tweet, 'auto_fb_post': self.auto_fb_post, 'auto_footer': self.auto_footer, 'timewarp': self.timewarp, 'timewarp_schedule': self.timewarp_schedule, 'tracking': self.tracking, 'segment_text': self.segment_text}

    @property
    def authenticate(self):
        return self.__authenticate

    @property
    def auto_fb_post(self):
        return self.__auto_fb_post

    @property
    def auto_footer(self):
        return self.__auto_footer

    @property
    def auto_tweet(self):
        return self.__auto_tweet

    @property
    def content_type(self):
        return self.__content_type

    @property
    def create_time(self):
        return self.__create_time

    @property
    def ecomm360(self):
        return self.__ecomm360

    @property
    def emails_sent(self):
        return self.__emails_sent

    @property
    def folder_id(self):
        return self.__folder_id

    @property
    def from_email(self):
        return self.__from_email

    @property
    def from_name(self):
        return self.__from_name

    @property
    def id(self):
        return self.__id

    @property
    def inline_css(self):
        return self.__inline_css

    @property
    def list_id(self):
        return self.__list_id

    @classmethod
    def read(cls, iprot):
        init_kwds = {}

        iprot.readStructBegin()
        while True:
            ifield_name, ifield_type, _ifield_id = iprot.readFieldBegin()
            if ifield_type == 0: # STOP
                break
            elif ifield_name == 'id':
                try:
                    init_kwds['id'] = iprot.readString()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'web_id':
                try:
                    init_kwds['web_id'] = iprot.readI32()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'list_id':
                try:
                    init_kwds['list_id'] = iprot.readString()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'folder_id':
                try:
                    init_kwds['folder_id'] = iprot.readI32()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'template_id':
                try:
                    init_kwds['template_id'] = iprot.readI32()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'content_type':
                init_kwds['content_type'] = yochimp.models.campaign.campaign_content_type.CampaignContentType.value_of(iprot.readString().strip().upper())
            elif ifield_name == 'title':
                init_kwds['title'] = iprot.readString()
            elif ifield_name == 'type':
                init_kwds['type'] = yochimp.models.campaign.campaign_type.CampaignType.value_of(iprot.readString().strip().upper())
            elif ifield_name == 'create_time':
                init_kwds['create_time'] = iprot.readDateTime() if hasattr(iprot, 'readDateTime') else datetime.fromtimestamp(iprot.readI64() / 1000.0)
            elif ifield_name == 'send_time':
                try:
                    init_kwds['send_time'] = iprot.readDateTime() if hasattr(iprot, 'readDateTime') else datetime.fromtimestamp(iprot.readI64() / 1000.0)
                except (TypeError,):
                    pass
            elif ifield_name == 'emails_sent':
                try:
                    init_kwds['emails_sent'] = iprot.readI32()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'status':
                try:
                    init_kwds['status'] = yochimp.models.campaign.campaign_status.CampaignStatus.value_of(iprot.readString().strip().upper())
                except (TypeError,):
                    pass
            elif ifield_name == 'from_name':
                try:
                    init_kwds['from_name'] = iprot.readString()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'from_email':
                init_kwds['from_email'] = iprot.readString()
            elif ifield_name == 'subject':
                try:
                    init_kwds['subject'] = iprot.readString()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'to_name':
                try:
                    init_kwds['to_name'] = iprot.readString()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'archive_url':
                init_kwds['archive_url'] = iprot.readString()
            elif ifield_name == 'inline_css':
                try:
                    init_kwds['inline_css'] = iprot.readBool()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'analytics':
                try:
                    init_kwds['analytics'] = iprot.readString()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'analytics_tag':
                try:
                    init_kwds['analytics_tag'] = iprot.readString()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'authenticate':
                try:
                    init_kwds['authenticate'] = iprot.readBool()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'ecomm360':
                try:
                    init_kwds['ecomm360'] = iprot.readBool()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'auto_tweet':
                try:
                    init_kwds['auto_tweet'] = iprot.readBool()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'auto_fb_post':
                init_kwds['auto_fb_post'] = frozenset([iprot.readString() for _ in xrange(iprot.readSetBegin()[1])] + (iprot.readSetEnd() is None and []))
            elif ifield_name == 'auto_footer':
                try:
                    init_kwds['auto_footer'] = iprot.readBool()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'timewarp':
                try:
                    init_kwds['timewarp'] = iprot.readBool()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'timewarp_schedule':
                try:
                    init_kwds['timewarp_schedule'] = iprot.readDateTime() if hasattr(iprot, 'readDateTime') else datetime.fromtimestamp(iprot.readI64() / 1000.0)
                except (TypeError,):
                    pass
            elif ifield_name == 'tracking':
                init_kwds['tracking'] = yochimp.models.campaign.campaign_tracking_options.CampaignTrackingOptions.read(iprot)
            elif ifield_name == 'segment_text':
                try:
                    init_kwds['segment_text'] = iprot.readString()
                except (TypeError, ValueError,):
                    pass
            iprot.readFieldEnd()
        iprot.readStructEnd()

        return cls(**init_kwds)

    def replace(self, id=None, web_id=None, list_id=None, folder_id=None, template_id=None, content_type=None, title=None, type=None, create_time=None, send_time=None, emails_sent=None, status=None, from_name=None, from_email=None, subject=None, to_name=None, archive_url=None, inline_css=None, analytics=None, analytics_tag=None, authenticate=None, ecomm360=None, auto_tweet=None, auto_fb_post=None, auto_footer=None, timewarp=None, timewarp_schedule=None, tracking=None, segment_text=None):
        if id is None:
            id = self.id
        if web_id is None:
            web_id = self.web_id
        if list_id is None:
            list_id = self.list_id
        if folder_id is None:
            folder_id = self.folder_id
        if template_id is None:
            template_id = self.template_id
        if content_type is None:
            content_type = self.content_type
        if title is None:
            title = self.title
        if type is None:
            type = self.type
        if create_time is None:
            create_time = self.create_time
        if send_time is None:
            send_time = self.send_time
        if emails_sent is None:
            emails_sent = self.emails_sent
        if status is None:
            status = self.status
        if from_name is None:
            from_name = self.from_name
        if from_email is None:
            from_email = self.from_email
        if subject is None:
            subject = self.subject
        if to_name is None:
            to_name = self.to_name
        if archive_url is None:
            archive_url = self.archive_url
        if inline_css is None:
            inline_css = self.inline_css
        if analytics is None:
            analytics = self.analytics
        if analytics_tag is None:
            analytics_tag = self.analytics_tag
        if authenticate is None:
            authenticate = self.authenticate
        if ecomm360 is None:
            ecomm360 = self.ecomm360
        if auto_tweet is None:
            auto_tweet = self.auto_tweet
        if auto_fb_post is None:
            auto_fb_post = self.auto_fb_post
        if auto_footer is None:
            auto_footer = self.auto_footer
        if timewarp is None:
            timewarp = self.timewarp
        if timewarp_schedule is None:
            timewarp_schedule = self.timewarp_schedule
        if tracking is None:
            tracking = self.tracking
        if segment_text is None:
            segment_text = self.segment_text
        return self.__class__(id=id, web_id=web_id, list_id=list_id, folder_id=folder_id, template_id=template_id, content_type=content_type, title=title, type=type, create_time=create_time, send_time=send_time, emails_sent=emails_sent, status=status, from_name=from_name, from_email=from_email, subject=subject, to_name=to_name, archive_url=archive_url, inline_css=inline_css, analytics=analytics, analytics_tag=analytics_tag, authenticate=authenticate, ecomm360=ecomm360, auto_tweet=auto_tweet, auto_fb_post=auto_fb_post, auto_footer=auto_footer, timewarp=timewarp, timewarp_schedule=timewarp_schedule, tracking=tracking, segment_text=segment_text)

    @property
    def segment_text(self):
        return self.__segment_text

    @property
    def send_time(self):
        return self.__send_time

    @property
    def status(self):
        return self.__status

    @property
    def subject(self):
        return self.__subject

    @property
    def template_id(self):
        return self.__template_id

    @property
    def timewarp(self):
        return self.__timewarp

    @property
    def timewarp_schedule(self):
        return self.__timewarp_schedule

    @property
    def title(self):
        return self.__title

    @property
    def to_name(self):
        return self.__to_name

    @property
    def tracking(self):
        return self.__tracking

    @property
    def type(self):
        return self.__type

    @property
    def web_id(self):
        return self.__web_id

    def write(self, oprot):
        oprot.writeStructBegin('Campaign')

        if self.id is not None:
            oprot.writeFieldBegin('id', 11, -1)
            oprot.writeString(self.id)
            oprot.writeFieldEnd()

        if self.web_id is not None:
            oprot.writeFieldBegin('web_id', 8, -1)
            oprot.writeI32(self.web_id)
            oprot.writeFieldEnd()

        if self.list_id is not None:
            oprot.writeFieldBegin('list_id', 11, -1)
            oprot.writeString(self.list_id)
            oprot.writeFieldEnd()

        if self.folder_id is not None:
            oprot.writeFieldBegin('folder_id', 8, -1)
            oprot.writeI32(self.folder_id)
            oprot.writeFieldEnd()

        if self.template_id is not None:
            oprot.writeFieldBegin('template_id', 8, -1)
            oprot.writeI32(self.template_id)
            oprot.writeFieldEnd()

        oprot.writeFieldBegin('content_type', 11, -1)
        oprot.writeString([attr for attr in dir(yochimp.models.campaign.campaign_content_type.CampaignContentType) if getattr(yochimp.models.campaign.campaign_content_type.CampaignContentType, attr) == self.content_type][0])
        oprot.writeFieldEnd()

        oprot.writeFieldBegin('title', 11, -1)
        oprot.writeString(self.title)
        oprot.writeFieldEnd()

        oprot.writeFieldBegin('type', 11, -1)
        oprot.writeString([attr for attr in dir(yochimp.models.campaign.campaign_type.CampaignType) if getattr(yochimp.models.campaign.campaign_type.CampaignType, attr) == self.type][0])
        oprot.writeFieldEnd()

        oprot.writeFieldBegin('create_time', 12, -1)
        oprot.writeDateTime(self.create_time) if hasattr(oprot, 'writeDateTime') else oprot.writeI64(long(mktime(self.create_time.timetuple())) * 1000l)
        oprot.writeFieldEnd()

        if self.send_time is not None:
            oprot.writeFieldBegin('send_time', 12, -1)
            oprot.writeDateTime(self.send_time) if hasattr(oprot, 'writeDateTime') else oprot.writeI64(long(mktime(self.send_time.timetuple())) * 1000l)
            oprot.writeFieldEnd()

        if self.emails_sent is not None:
            oprot.writeFieldBegin('emails_sent', 8, -1)
            oprot.writeI32(self.emails_sent)
            oprot.writeFieldEnd()

        if self.status is not None:
            oprot.writeFieldBegin('status', 11, -1)
            oprot.writeString([attr for attr in dir(yochimp.models.campaign.campaign_status.CampaignStatus) if getattr(yochimp.models.campaign.campaign_status.CampaignStatus, attr) == self.status][0])
            oprot.writeFieldEnd()

        if self.from_name is not None:
            oprot.writeFieldBegin('from_name', 11, -1)
            oprot.writeString(self.from_name)
            oprot.writeFieldEnd()

        if self.from_email is not None:
            oprot.writeFieldBegin('from_email', 12, -1)
            oprot.writeEmailAddress(self.from_email) if hasattr(oprot, 'writeEmailAddress') else oprot.writeString(str(self.from_email))
            oprot.writeFieldEnd()

        if self.subject is not None:
            oprot.writeFieldBegin('subject', 11, -1)
            oprot.writeString(self.subject)
            oprot.writeFieldEnd()

        if self.to_name is not None:
            oprot.writeFieldBegin('to_name', 11, -1)
            oprot.writeString(self.to_name)
            oprot.writeFieldEnd()

        if self.archive_url is not None:
            oprot.writeFieldBegin('archive_url', 12, -1)
            oprot.writeUrl(self.archive_url) if hasattr(oprot, 'writeUrl') else oprot.writeString(str(self.archive_url))
            oprot.writeFieldEnd()

        if self.inline_css is not None:
            oprot.writeFieldBegin('inline_css', 2, -1)
            oprot.writeBool(self.inline_css)
            oprot.writeFieldEnd()

        if self.analytics is not None:
            oprot.writeFieldBegin('analytics', 11, -1)
            oprot.writeString(self.analytics)
            oprot.writeFieldEnd()

        if self.analytics_tag is not None:
            oprot.writeFieldBegin('analytics_tag', 11, -1)
            oprot.writeString(self.analytics_tag)
            oprot.writeFieldEnd()

        if self.authenticate is not None:
            oprot.writeFieldBegin('authenticate', 2, -1)
            oprot.writeBool(self.authenticate)
            oprot.writeFieldEnd()

        if self.ecomm360 is not None:
            oprot.writeFieldBegin('ecomm360', 2, -1)
            oprot.writeBool(self.ecomm360)
            oprot.writeFieldEnd()

        if self.auto_tweet is not None:
            oprot.writeFieldBegin('auto_tweet', 2, -1)
            oprot.writeBool(self.auto_tweet)
            oprot.writeFieldEnd()

        if self.auto_fb_post is not None:
            oprot.writeFieldBegin('auto_fb_post', 14, -1)
            oprot.writeSetBegin(11, len(self.auto_fb_post))
            for _0 in self.auto_fb_post:
                oprot.writeString(_0)
            oprot.writeSetEnd()
            oprot.writeFieldEnd()

        if self.auto_footer is not None:
            oprot.writeFieldBegin('auto_footer', 2, -1)
            oprot.writeBool(self.auto_footer)
            oprot.writeFieldEnd()

        if self.timewarp is not None:
            oprot.writeFieldBegin('timewarp', 2, -1)
            oprot.writeBool(self.timewarp)
            oprot.writeFieldEnd()

        if self.timewarp_schedule is not None:
            oprot.writeFieldBegin('timewarp_schedule', 12, -1)
            oprot.writeDateTime(self.timewarp_schedule) if hasattr(oprot, 'writeDateTime') else oprot.writeI64(long(mktime(self.timewarp_schedule.timetuple())) * 1000l)
            oprot.writeFieldEnd()

        if self.tracking is not None:
            oprot.writeFieldBegin('tracking', 12, -1)
            self.tracking.write(oprot)
            oprot.writeFieldEnd()

        if self.segment_text is not None:
            oprot.writeFieldBegin('segment_text', 11, -1)
            oprot.writeString(self.segment_text)
            oprot.writeFieldEnd()

        oprot.writeFieldStop()

        oprot.writeStructEnd()

        return self
