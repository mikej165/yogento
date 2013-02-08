from itertools import ifilterfalse
import __builtin__
import yochimp.models.campaign.campaign_tracking_options


class CampaignCreateOptions(object):
    class Builder:
        def __init__(
            self,
            list_id,
            subject,
            from_email,
            from_name,
            to_name,
            template_id=None,
            gallery_template_id=None,
            base_template_id=None,
            folder_id=None,
            tracking=None,
            title=None,
            authenticate=None,
            auto_footer=None,
            inline_css=None,
            generate_text=None,
            auto_tweet=None,
            auto_fb_post=None,
            fb_comments=None,
            timewarp=None,
            ecomm360=None
        ):
            self.__list_id = list_id
            self.__subject = subject
            self.__from_email = from_email
            self.__from_name = from_name
            self.__to_name = to_name
            self.__template_id = template_id
            self.__gallery_template_id = gallery_template_id
            self.__base_template_id = base_template_id
            self.__folder_id = folder_id
            self.__tracking = tracking
            self.__title = title
            self.__authenticate = authenticate
            self.__auto_footer = auto_footer
            self.__inline_css = inline_css
            self.__generate_text = generate_text
            self.__auto_tweet = auto_tweet
            self.__auto_fb_post = auto_fb_post
            self.__fb_comments = fb_comments
            self.__timewarp = timewarp
            self.__ecomm360 = ecomm360

        def build(self):
            return CampaignCreateOptions(list_id=self.__list_id, subject=self.__subject, from_email=self.__from_email, from_name=self.__from_name, to_name=self.__to_name, template_id=self.__template_id, gallery_template_id=self.__gallery_template_id, base_template_id=self.__base_template_id, folder_id=self.__folder_id, tracking=self.__tracking, title=self.__title, authenticate=self.__authenticate, auto_footer=self.__auto_footer, inline_css=self.__inline_css, generate_text=self.__generate_text, auto_tweet=self.__auto_tweet, auto_fb_post=self.__auto_fb_post, fb_comments=self.__fb_comments, timewarp=self.__timewarp, ecomm360=self.__ecomm360)

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

        def set_base_template_id(self, base_template_id):
            self.__base_template_id = base_template_id
            return self

        def set_ecomm360(self, ecomm360):
            self.__ecomm360 = ecomm360
            return self

        def set_fb_comments(self, fb_comments):
            self.__fb_comments = fb_comments
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

        def set_gallery_template_id(self, gallery_template_id):
            self.__gallery_template_id = gallery_template_id
            return self

        def set_generate_text(self, generate_text):
            self.__generate_text = generate_text
            return self

        def set_inline_css(self, inline_css):
            self.__inline_css = inline_css
            return self

        def set_list_id(self, list_id):
            self.__list_id = list_id
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

        def set_title(self, title):
            self.__title = title
            return self

        def set_to_name(self, to_name):
            self.__to_name = to_name
            return self

        def set_tracking(self, tracking):
            self.__tracking = tracking
            return self

        def update(self, campaign_create_options):
            if isinstance(campaign_create_options, CampaignCreateOptions):
                self.set_list_id(campaign_create_options.list_id)
                self.set_subject(campaign_create_options.subject)
                self.set_from_email(campaign_create_options.from_email)
                self.set_from_name(campaign_create_options.from_name)
                self.set_to_name(campaign_create_options.to_name)
                self.set_template_id(campaign_create_options.template_id)
                self.set_gallery_template_id(campaign_create_options.gallery_template_id)
                self.set_base_template_id(campaign_create_options.base_template_id)
                self.set_folder_id(campaign_create_options.folder_id)
                self.set_tracking(campaign_create_options.tracking)
                self.set_title(campaign_create_options.title)
                self.set_authenticate(campaign_create_options.authenticate)
                self.set_auto_footer(campaign_create_options.auto_footer)
                self.set_inline_css(campaign_create_options.inline_css)
                self.set_generate_text(campaign_create_options.generate_text)
                self.set_auto_tweet(campaign_create_options.auto_tweet)
                self.set_auto_fb_post(campaign_create_options.auto_fb_post)
                self.set_fb_comments(campaign_create_options.fb_comments)
                self.set_timewarp(campaign_create_options.timewarp)
                self.set_ecomm360(campaign_create_options.ecomm360)
            elif isinstance(campaign_create_options, dict):
                for key, value in campaign_create_options.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(campaign_create_options)
            return self

    def __init__(
        self,
        list_id,
        subject,
        from_email,
        from_name,
        to_name,
        template_id=None,
        gallery_template_id=None,
        base_template_id=None,
        folder_id=None,
        tracking=None,
        title=None,
        authenticate=None,
        auto_footer=None,
        inline_css=None,
        generate_text=None,
        auto_tweet=None,
        auto_fb_post=None,
        fb_comments=None,
        timewarp=None,
        ecomm360=None
    ):
        if list_id is None:
            raise ValueError('list_id is required')
        if not isinstance(list_id, basestring):
            raise TypeError(getattr(__builtin__, 'type')(list_id))
        self.__list_id = list_id

        if subject is None:
            raise ValueError('subject is required')
        if not isinstance(subject, basestring):
            raise TypeError(getattr(__builtin__, 'type')(subject))
        self.__subject = subject

        if from_email is None:
            raise ValueError('from_email is required')
        if not isinstance(from_email, basestring):
            raise TypeError(getattr(__builtin__, 'type')(from_email))
        self.__from_email = from_email

        if from_name is None:
            raise ValueError('from_name is required')
        if not isinstance(from_name, basestring):
            raise TypeError(getattr(__builtin__, 'type')(from_name))
        self.__from_name = from_name

        if to_name is None:
            raise ValueError('to_name is required')
        if not isinstance(to_name, basestring):
            raise TypeError(getattr(__builtin__, 'type')(to_name))
        self.__to_name = to_name

        if template_id is not None:
            if not isinstance(template_id, int):
                raise TypeError(getattr(__builtin__, 'type')(template_id))
        self.__template_id = template_id

        if gallery_template_id is not None:
            if not isinstance(gallery_template_id, int):
                raise TypeError(getattr(__builtin__, 'type')(gallery_template_id))
        self.__gallery_template_id = gallery_template_id

        if base_template_id is not None:
            if not isinstance(base_template_id, int):
                raise TypeError(getattr(__builtin__, 'type')(base_template_id))
        self.__base_template_id = base_template_id

        if folder_id is not None:
            if not isinstance(folder_id, int):
                raise TypeError(getattr(__builtin__, 'type')(folder_id))
        self.__folder_id = folder_id

        if tracking is not None:
            if not isinstance(tracking, yochimp.models.campaign.campaign_tracking_options.CampaignTrackingOptions):
                raise TypeError(getattr(__builtin__, 'type')(tracking))
        self.__tracking = tracking

        if title is not None:
            if not isinstance(title, basestring):
                raise TypeError(getattr(__builtin__, 'type')(title))
        self.__title = title

        if authenticate is not None:
            if not isinstance(authenticate, bool):
                raise TypeError(getattr(__builtin__, 'type')(authenticate))
        self.__authenticate = authenticate

        if auto_footer is not None:
            if not isinstance(auto_footer, bool):
                raise TypeError(getattr(__builtin__, 'type')(auto_footer))
        self.__auto_footer = auto_footer

        if inline_css is not None:
            if not isinstance(inline_css, bool):
                raise TypeError(getattr(__builtin__, 'type')(inline_css))
        self.__inline_css = inline_css

        if generate_text is not None:
            if not isinstance(generate_text, bool):
                raise TypeError(getattr(__builtin__, 'type')(generate_text))
        self.__generate_text = generate_text

        if auto_tweet is not None:
            if not isinstance(auto_tweet, bool):
                raise TypeError(getattr(__builtin__, 'type')(auto_tweet))
        self.__auto_tweet = auto_tweet

        if auto_fb_post is not None:
            if not (isinstance(auto_fb_post, frozenset) and len(list(ifilterfalse(lambda _: isinstance(_, basestring), auto_fb_post))) == 0):
                raise TypeError(getattr(__builtin__, 'type')(auto_fb_post))
        self.__auto_fb_post = auto_fb_post

        if fb_comments is not None:
            if not isinstance(fb_comments, bool):
                raise TypeError(getattr(__builtin__, 'type')(fb_comments))
        self.__fb_comments = fb_comments

        if timewarp is not None:
            if not isinstance(timewarp, bool):
                raise TypeError(getattr(__builtin__, 'type')(timewarp))
        self.__timewarp = timewarp

        if ecomm360 is not None:
            if not isinstance(ecomm360, bool):
                raise TypeError(getattr(__builtin__, 'type')(ecomm360))
        self.__ecomm360 = ecomm360

    def __eq__(self, other):
        if self.list_id != other.list_id:
            return False
        if self.subject != other.subject:
            return False
        if self.from_email != other.from_email:
            return False
        if self.from_name != other.from_name:
            return False
        if self.to_name != other.to_name:
            return False
        if self.template_id != other.template_id:
            return False
        if self.gallery_template_id != other.gallery_template_id:
            return False
        if self.base_template_id != other.base_template_id:
            return False
        if self.folder_id != other.folder_id:
            return False
        if self.tracking != other.tracking:
            return False
        if self.title != other.title:
            return False
        if self.authenticate != other.authenticate:
            return False
        if self.auto_footer != other.auto_footer:
            return False
        if self.inline_css != other.inline_css:
            return False
        if self.generate_text != other.generate_text:
            return False
        if self.auto_tweet != other.auto_tweet:
            return False
        if self.auto_fb_post != other.auto_fb_post:
            return False
        if self.fb_comments != other.fb_comments:
            return False
        if self.timewarp != other.timewarp:
            return False
        if self.ecomm360 != other.ecomm360:
            return False
        return True

    def __hash__(self):
        return hash((self.list_id,self.subject,self.from_email,self.from_name,self.to_name,self.template_id,self.gallery_template_id,self.base_template_id,self.folder_id,self.tracking,self.title,self.authenticate,self.auto_footer,self.inline_css,self.generate_text,self.auto_tweet,self.auto_fb_post,self.fb_comments,self.timewarp,self.ecomm360,))

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        field_reprs.append('list_id=' + "'" + self.list_id.encode('ascii', 'replace') + "'")
        field_reprs.append('subject=' + "'" + self.subject.encode('ascii', 'replace') + "'")
        field_reprs.append('from_email=' + "'" + self.from_email.encode('ascii', 'replace') + "'")
        field_reprs.append('from_name=' + "'" + self.from_name.encode('ascii', 'replace') + "'")
        field_reprs.append('to_name=' + "'" + self.to_name.encode('ascii', 'replace') + "'")
        if self.template_id is not None:
            field_reprs.append('template_id=' + repr(self.template_id))
        if self.gallery_template_id is not None:
            field_reprs.append('gallery_template_id=' + repr(self.gallery_template_id))
        if self.base_template_id is not None:
            field_reprs.append('base_template_id=' + repr(self.base_template_id))
        if self.folder_id is not None:
            field_reprs.append('folder_id=' + repr(self.folder_id))
        if self.tracking is not None:
            field_reprs.append('tracking=' + repr(self.tracking))
        if self.title is not None:
            field_reprs.append('title=' + "'" + self.title.encode('ascii', 'replace') + "'")
        if self.authenticate is not None:
            field_reprs.append('authenticate=' + repr(self.authenticate))
        if self.auto_footer is not None:
            field_reprs.append('auto_footer=' + repr(self.auto_footer))
        if self.inline_css is not None:
            field_reprs.append('inline_css=' + repr(self.inline_css))
        if self.generate_text is not None:
            field_reprs.append('generate_text=' + repr(self.generate_text))
        if self.auto_tweet is not None:
            field_reprs.append('auto_tweet=' + repr(self.auto_tweet))
        if self.auto_fb_post is not None:
            field_reprs.append('auto_fb_post=' + repr(self.auto_fb_post))
        if self.fb_comments is not None:
            field_reprs.append('fb_comments=' + repr(self.fb_comments))
        if self.timewarp is not None:
            field_reprs.append('timewarp=' + repr(self.timewarp))
        if self.ecomm360 is not None:
            field_reprs.append('ecomm360=' + repr(self.ecomm360))
        return 'CampaignCreateOptions(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        field_reprs.append('list_id=' + "'" + self.list_id.encode('ascii', 'replace') + "'")
        field_reprs.append('subject=' + "'" + self.subject.encode('ascii', 'replace') + "'")
        field_reprs.append('from_email=' + "'" + self.from_email.encode('ascii', 'replace') + "'")
        field_reprs.append('from_name=' + "'" + self.from_name.encode('ascii', 'replace') + "'")
        field_reprs.append('to_name=' + "'" + self.to_name.encode('ascii', 'replace') + "'")
        if self.template_id is not None:
            field_reprs.append('template_id=' + repr(self.template_id))
        if self.gallery_template_id is not None:
            field_reprs.append('gallery_template_id=' + repr(self.gallery_template_id))
        if self.base_template_id is not None:
            field_reprs.append('base_template_id=' + repr(self.base_template_id))
        if self.folder_id is not None:
            field_reprs.append('folder_id=' + repr(self.folder_id))
        if self.tracking is not None:
            field_reprs.append('tracking=' + repr(self.tracking))
        if self.title is not None:
            field_reprs.append('title=' + "'" + self.title.encode('ascii', 'replace') + "'")
        if self.authenticate is not None:
            field_reprs.append('authenticate=' + repr(self.authenticate))
        if self.auto_footer is not None:
            field_reprs.append('auto_footer=' + repr(self.auto_footer))
        if self.inline_css is not None:
            field_reprs.append('inline_css=' + repr(self.inline_css))
        if self.generate_text is not None:
            field_reprs.append('generate_text=' + repr(self.generate_text))
        if self.auto_tweet is not None:
            field_reprs.append('auto_tweet=' + repr(self.auto_tweet))
        if self.auto_fb_post is not None:
            field_reprs.append('auto_fb_post=' + repr(self.auto_fb_post))
        if self.fb_comments is not None:
            field_reprs.append('fb_comments=' + repr(self.fb_comments))
        if self.timewarp is not None:
            field_reprs.append('timewarp=' + repr(self.timewarp))
        if self.ecomm360 is not None:
            field_reprs.append('ecomm360=' + repr(self.ecomm360))
        return 'CampaignCreateOptions(' + ', '.join(field_reprs) + ')'

    def as_dict(self):
        return {'list_id': self.list_id, 'subject': self.subject, 'from_email': self.from_email, 'from_name': self.from_name, 'to_name': self.to_name, 'template_id': self.template_id, 'gallery_template_id': self.gallery_template_id, 'base_template_id': self.base_template_id, 'folder_id': self.folder_id, 'tracking': self.tracking, 'title': self.title, 'authenticate': self.authenticate, 'auto_footer': self.auto_footer, 'inline_css': self.inline_css, 'generate_text': self.generate_text, 'auto_tweet': self.auto_tweet, 'auto_fb_post': self.auto_fb_post, 'fb_comments': self.fb_comments, 'timewarp': self.timewarp, 'ecomm360': self.ecomm360}

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
    def base_template_id(self):
        return self.__base_template_id

    @property
    def ecomm360(self):
        return self.__ecomm360

    @property
    def fb_comments(self):
        return self.__fb_comments

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
    def gallery_template_id(self):
        return self.__gallery_template_id

    @property
    def generate_text(self):
        return self.__generate_text

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
            elif ifield_name == 'list_id':
                init_kwds['list_id'] = iprot.readString()
            elif ifield_name == 'subject':
                init_kwds['subject'] = iprot.readString()
            elif ifield_name == 'from_email':
                init_kwds['from_email'] = iprot.readString()
            elif ifield_name == 'from_name':
                init_kwds['from_name'] = iprot.readString()
            elif ifield_name == 'to_name':
                init_kwds['to_name'] = iprot.readString()
            elif ifield_name == 'template_id':
                try:
                    init_kwds['template_id'] = iprot.readI32()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'gallery_template_id':
                try:
                    init_kwds['gallery_template_id'] = iprot.readI32()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'base_template_id':
                try:
                    init_kwds['base_template_id'] = iprot.readI32()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'folder_id':
                try:
                    init_kwds['folder_id'] = iprot.readI32()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'tracking':
                init_kwds['tracking'] = yochimp.models.campaign.campaign_tracking_options.CampaignTrackingOptions.read(iprot)
            elif ifield_name == 'title':
                try:
                    init_kwds['title'] = iprot.readString()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'authenticate':
                try:
                    init_kwds['authenticate'] = iprot.readBool()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'auto_footer':
                try:
                    init_kwds['auto_footer'] = iprot.readBool()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'inline_css':
                try:
                    init_kwds['inline_css'] = iprot.readBool()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'generate_text':
                try:
                    init_kwds['generate_text'] = iprot.readBool()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'auto_tweet':
                try:
                    init_kwds['auto_tweet'] = iprot.readBool()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'auto_fb_post':
                init_kwds['auto_fb_post'] = frozenset([iprot.readString() for _ in xrange(iprot.readSetBegin()[1])] + (iprot.readSetEnd() is None and []))
            elif ifield_name == 'fb_comments':
                try:
                    init_kwds['fb_comments'] = iprot.readBool()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'timewarp':
                try:
                    init_kwds['timewarp'] = iprot.readBool()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'ecomm360':
                try:
                    init_kwds['ecomm360'] = iprot.readBool()
                except (TypeError, ValueError,):
                    pass
            iprot.readFieldEnd()
        iprot.readStructEnd()

        return cls(**init_kwds)

    def replace(self, list_id=None, subject=None, from_email=None, from_name=None, to_name=None, template_id=None, gallery_template_id=None, base_template_id=None, folder_id=None, tracking=None, title=None, authenticate=None, auto_footer=None, inline_css=None, generate_text=None, auto_tweet=None, auto_fb_post=None, fb_comments=None, timewarp=None, ecomm360=None):
        if list_id is None:
            list_id = self.list_id
        if subject is None:
            subject = self.subject
        if from_email is None:
            from_email = self.from_email
        if from_name is None:
            from_name = self.from_name
        if to_name is None:
            to_name = self.to_name
        if template_id is None:
            template_id = self.template_id
        if gallery_template_id is None:
            gallery_template_id = self.gallery_template_id
        if base_template_id is None:
            base_template_id = self.base_template_id
        if folder_id is None:
            folder_id = self.folder_id
        if tracking is None:
            tracking = self.tracking
        if title is None:
            title = self.title
        if authenticate is None:
            authenticate = self.authenticate
        if auto_footer is None:
            auto_footer = self.auto_footer
        if inline_css is None:
            inline_css = self.inline_css
        if generate_text is None:
            generate_text = self.generate_text
        if auto_tweet is None:
            auto_tweet = self.auto_tweet
        if auto_fb_post is None:
            auto_fb_post = self.auto_fb_post
        if fb_comments is None:
            fb_comments = self.fb_comments
        if timewarp is None:
            timewarp = self.timewarp
        if ecomm360 is None:
            ecomm360 = self.ecomm360
        return self.__class__(list_id=list_id, subject=subject, from_email=from_email, from_name=from_name, to_name=to_name, template_id=template_id, gallery_template_id=gallery_template_id, base_template_id=base_template_id, folder_id=folder_id, tracking=tracking, title=title, authenticate=authenticate, auto_footer=auto_footer, inline_css=inline_css, generate_text=generate_text, auto_tweet=auto_tweet, auto_fb_post=auto_fb_post, fb_comments=fb_comments, timewarp=timewarp, ecomm360=ecomm360)

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
    def title(self):
        return self.__title

    @property
    def to_name(self):
        return self.__to_name

    @property
    def tracking(self):
        return self.__tracking

    def write(self, oprot):
        oprot.writeStructBegin('CampaignCreateOptions')

        oprot.writeFieldBegin('list_id', 11, -1)
        oprot.writeString(self.list_id)
        oprot.writeFieldEnd()

        oprot.writeFieldBegin('subject', 11, -1)
        oprot.writeString(self.subject)
        oprot.writeFieldEnd()

        oprot.writeFieldBegin('from_email', 11, -1)
        oprot.writeString(self.from_email)
        oprot.writeFieldEnd()

        oprot.writeFieldBegin('from_name', 11, -1)
        oprot.writeString(self.from_name)
        oprot.writeFieldEnd()

        oprot.writeFieldBegin('to_name', 11, -1)
        oprot.writeString(self.to_name)
        oprot.writeFieldEnd()

        if self.template_id is not None:
            oprot.writeFieldBegin('template_id', 8, -1)
            oprot.writeI32(self.template_id)
            oprot.writeFieldEnd()

        if self.gallery_template_id is not None:
            oprot.writeFieldBegin('gallery_template_id', 8, -1)
            oprot.writeI32(self.gallery_template_id)
            oprot.writeFieldEnd()

        if self.base_template_id is not None:
            oprot.writeFieldBegin('base_template_id', 8, -1)
            oprot.writeI32(self.base_template_id)
            oprot.writeFieldEnd()

        if self.folder_id is not None:
            oprot.writeFieldBegin('folder_id', 8, -1)
            oprot.writeI32(self.folder_id)
            oprot.writeFieldEnd()

        if self.tracking is not None:
            oprot.writeFieldBegin('tracking', 12, -1)
            self.tracking.write(oprot)
            oprot.writeFieldEnd()

        if self.title is not None:
            oprot.writeFieldBegin('title', 11, -1)
            oprot.writeString(self.title)
            oprot.writeFieldEnd()

        if self.authenticate is not None:
            oprot.writeFieldBegin('authenticate', 2, -1)
            oprot.writeBool(self.authenticate)
            oprot.writeFieldEnd()

        if self.auto_footer is not None:
            oprot.writeFieldBegin('auto_footer', 2, -1)
            oprot.writeBool(self.auto_footer)
            oprot.writeFieldEnd()

        if self.inline_css is not None:
            oprot.writeFieldBegin('inline_css', 2, -1)
            oprot.writeBool(self.inline_css)
            oprot.writeFieldEnd()

        if self.generate_text is not None:
            oprot.writeFieldBegin('generate_text', 2, -1)
            oprot.writeBool(self.generate_text)
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

        if self.fb_comments is not None:
            oprot.writeFieldBegin('fb_comments', 2, -1)
            oprot.writeBool(self.fb_comments)
            oprot.writeFieldEnd()

        if self.timewarp is not None:
            oprot.writeFieldBegin('timewarp', 2, -1)
            oprot.writeBool(self.timewarp)
            oprot.writeFieldEnd()

        if self.ecomm360 is not None:
            oprot.writeFieldBegin('ecomm360', 2, -1)
            oprot.writeBool(self.ecomm360)
            oprot.writeFieldEnd()

        oprot.writeFieldStop()

        oprot.writeStructEnd()

        return self
