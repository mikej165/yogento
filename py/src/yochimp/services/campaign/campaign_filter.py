from datetime import datetime
from itertools import ifilterfalse
from time import mktime
import __builtin__
import yochimp.models.campaign.campaign_status
import yochimp.models.campaign.campaign_type


class CampaignFilter(object):
    class Builder:
        def __init__(
            self,
            campaign_id=None,
            list_id=None,
            folder_id=None,
            template_id=None,
            status=None,
            type=None,
            from_name=None,
            from_email=None,
            title=None,
            subject=None,
            sendtime_start=None,
            sendtime_end=None,
            uses_segment=None,
            exact=None
        ):
            self.__campaign_id = campaign_id
            self.__list_id = list_id
            self.__folder_id = folder_id
            self.__template_id = template_id
            self.__status = status
            self.__type = type
            self.__from_name = from_name
            self.__from_email = from_email
            self.__title = title
            self.__subject = subject
            self.__sendtime_start = sendtime_start
            self.__sendtime_end = sendtime_end
            self.__uses_segment = uses_segment
            self.__exact = exact

        def build(self):
            return CampaignFilter(campaign_id=self.__campaign_id, list_id=self.__list_id, folder_id=self.__folder_id, template_id=self.__template_id, status=self.__status, type=self.__type, from_name=self.__from_name, from_email=self.__from_email, title=self.__title, subject=self.__subject, sendtime_start=self.__sendtime_start, sendtime_end=self.__sendtime_end, uses_segment=self.__uses_segment, exact=self.__exact)

        def set_campaign_id(self, campaign_id):
            self.__campaign_id = campaign_id
            return self

        def set_exact(self, exact):
            self.__exact = exact
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

        def set_list_id(self, list_id):
            self.__list_id = list_id
            return self

        def set_sendtime_end(self, sendtime_end):
            self.__sendtime_end = sendtime_end
            return self

        def set_sendtime_start(self, sendtime_start):
            self.__sendtime_start = sendtime_start
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

        def set_title(self, title):
            self.__title = title
            return self

        def set_type(self, type):
            self.__type = type
            return self

        def set_uses_segment(self, uses_segment):
            self.__uses_segment = uses_segment
            return self

        def update(self, campaign_filter):
            if isinstance(campaign_filter, CampaignFilter):
                self.set_campaign_id(campaign_filter.campaign_id)
                self.set_list_id(campaign_filter.list_id)
                self.set_folder_id(campaign_filter.folder_id)
                self.set_template_id(campaign_filter.template_id)
                self.set_status(campaign_filter.status)
                self.set_type(campaign_filter.type)
                self.set_from_name(campaign_filter.from_name)
                self.set_from_email(campaign_filter.from_email)
                self.set_title(campaign_filter.title)
                self.set_subject(campaign_filter.subject)
                self.set_sendtime_start(campaign_filter.sendtime_start)
                self.set_sendtime_end(campaign_filter.sendtime_end)
                self.set_uses_segment(campaign_filter.uses_segment)
                self.set_exact(campaign_filter.exact)
            elif isinstance(campaign_filter, dict):
                for key, value in campaign_filter.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(campaign_filter)
            return self

    def __init__(
        self,
        campaign_id=None,
        list_id=None,
        folder_id=None,
        template_id=None,
        status=None,
        type=None,
        from_name=None,
        from_email=None,
        title=None,
        subject=None,
        sendtime_start=None,
        sendtime_end=None,
        uses_segment=None,
        exact=None
    ):
        if campaign_id is not None:
            if not (isinstance(campaign_id, frozenset) and len(list(ifilterfalse(lambda _: isinstance(_, basestring), campaign_id))) == 0):
                raise TypeError(getattr(__builtin__, 'type')(campaign_id))
        self.__campaign_id = campaign_id

        if list_id is not None:
            if not (isinstance(list_id, frozenset) and len(list(ifilterfalse(lambda _: isinstance(_, basestring), list_id))) == 0):
                raise TypeError(getattr(__builtin__, 'type')(list_id))
        self.__list_id = list_id

        if folder_id is not None:
            if not (isinstance(folder_id, frozenset) and len(list(ifilterfalse(lambda _: isinstance(_, int), folder_id))) == 0):
                raise TypeError(getattr(__builtin__, 'type')(folder_id))
        self.__folder_id = folder_id

        if template_id is not None:
            if not (isinstance(template_id, frozenset) and len(list(ifilterfalse(lambda _: isinstance(_, int), template_id))) == 0):
                raise TypeError(getattr(__builtin__, 'type')(template_id))
        self.__template_id = template_id

        if status is not None:
            if not (isinstance(status, frozenset) and len(list(ifilterfalse(lambda _: isinstance(_, yochimp.models.campaign.campaign_status.CampaignStatus), status))) == 0):
                raise TypeError(getattr(__builtin__, 'type')(status))
        self.__status = status

        if type is not None:
            if not (isinstance(type, frozenset) and len(list(ifilterfalse(lambda _: isinstance(_, yochimp.models.campaign.campaign_type.CampaignType), type))) == 0):
                raise TypeError(getattr(__builtin__, 'type')(type))
        self.__type = type

        if from_name is not None:
            if not isinstance(from_name, basestring):
                raise TypeError(getattr(__builtin__, 'type')(from_name))
        self.__from_name = from_name

        if from_email is not None:
            if not isinstance(from_email, basestring):
                raise TypeError(getattr(__builtin__, 'type')(from_email))
        self.__from_email = from_email

        if title is not None:
            if not isinstance(title, basestring):
                raise TypeError(getattr(__builtin__, 'type')(title))
        self.__title = title

        if subject is not None:
            if not isinstance(subject, basestring):
                raise TypeError(getattr(__builtin__, 'type')(subject))
        self.__subject = subject

        if sendtime_start is not None:
            if not isinstance(sendtime_start, datetime):
                raise TypeError(getattr(__builtin__, 'type')(sendtime_start))
        self.__sendtime_start = sendtime_start

        if sendtime_end is not None:
            if not isinstance(sendtime_end, datetime):
                raise TypeError(getattr(__builtin__, 'type')(sendtime_end))
        self.__sendtime_end = sendtime_end

        if uses_segment is not None:
            if not isinstance(uses_segment, bool):
                raise TypeError(getattr(__builtin__, 'type')(uses_segment))
        self.__uses_segment = uses_segment

        if exact is not None:
            if not isinstance(exact, bool):
                raise TypeError(getattr(__builtin__, 'type')(exact))
        self.__exact = exact

    def __eq__(self, other):
        if self.campaign_id != other.campaign_id:
            return False
        if self.list_id != other.list_id:
            return False
        if self.folder_id != other.folder_id:
            return False
        if self.template_id != other.template_id:
            return False
        if self.status != other.status:
            return False
        if self.type != other.type:
            return False
        if self.from_name != other.from_name:
            return False
        if self.from_email != other.from_email:
            return False
        if self.title != other.title:
            return False
        if self.subject != other.subject:
            return False
        if self.sendtime_start != other.sendtime_start:
            return False
        if self.sendtime_end != other.sendtime_end:
            return False
        if self.uses_segment != other.uses_segment:
            return False
        if self.exact != other.exact:
            return False
        return True

    def __hash__(self):
        return hash((self.campaign_id,self.list_id,self.folder_id,self.template_id,self.status,self.type,self.from_name,self.from_email,self.title,self.subject,self.sendtime_start,self.sendtime_end,self.uses_segment,self.exact,))

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        if self.campaign_id is not None:
            field_reprs.append('campaign_id=' + repr(self.campaign_id))
        if self.list_id is not None:
            field_reprs.append('list_id=' + repr(self.list_id))
        if self.folder_id is not None:
            field_reprs.append('folder_id=' + repr(self.folder_id))
        if self.template_id is not None:
            field_reprs.append('template_id=' + repr(self.template_id))
        if self.status is not None:
            field_reprs.append('status=' + repr(self.status))
        if self.type is not None:
            field_reprs.append('type=' + repr(self.type))
        if self.from_name is not None:
            field_reprs.append('from_name=' + "'" + self.from_name.encode('ascii', 'replace') + "'")
        if self.from_email is not None:
            field_reprs.append('from_email=' + "'" + self.from_email.encode('ascii', 'replace') + "'")
        if self.title is not None:
            field_reprs.append('title=' + "'" + self.title.encode('ascii', 'replace') + "'")
        if self.subject is not None:
            field_reprs.append('subject=' + "'" + self.subject.encode('ascii', 'replace') + "'")
        if self.sendtime_start is not None:
            field_reprs.append('sendtime_start=' + repr(self.sendtime_start))
        if self.sendtime_end is not None:
            field_reprs.append('sendtime_end=' + repr(self.sendtime_end))
        if self.uses_segment is not None:
            field_reprs.append('uses_segment=' + repr(self.uses_segment))
        if self.exact is not None:
            field_reprs.append('exact=' + repr(self.exact))
        return 'CampaignFilter(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        if self.campaign_id is not None:
            field_reprs.append('campaign_id=' + repr(self.campaign_id))
        if self.list_id is not None:
            field_reprs.append('list_id=' + repr(self.list_id))
        if self.folder_id is not None:
            field_reprs.append('folder_id=' + repr(self.folder_id))
        if self.template_id is not None:
            field_reprs.append('template_id=' + repr(self.template_id))
        if self.status is not None:
            field_reprs.append('status=' + repr(self.status))
        if self.type is not None:
            field_reprs.append('type=' + repr(self.type))
        if self.from_name is not None:
            field_reprs.append('from_name=' + "'" + self.from_name.encode('ascii', 'replace') + "'")
        if self.from_email is not None:
            field_reprs.append('from_email=' + "'" + self.from_email.encode('ascii', 'replace') + "'")
        if self.title is not None:
            field_reprs.append('title=' + "'" + self.title.encode('ascii', 'replace') + "'")
        if self.subject is not None:
            field_reprs.append('subject=' + "'" + self.subject.encode('ascii', 'replace') + "'")
        if self.sendtime_start is not None:
            field_reprs.append('sendtime_start=' + repr(self.sendtime_start))
        if self.sendtime_end is not None:
            field_reprs.append('sendtime_end=' + repr(self.sendtime_end))
        if self.uses_segment is not None:
            field_reprs.append('uses_segment=' + repr(self.uses_segment))
        if self.exact is not None:
            field_reprs.append('exact=' + repr(self.exact))
        return 'CampaignFilter(' + ', '.join(field_reprs) + ')'

    def as_dict(self):
        return {'campaign_id': self.campaign_id, 'list_id': self.list_id, 'folder_id': self.folder_id, 'template_id': self.template_id, 'status': self.status, 'type': self.type, 'from_name': self.from_name, 'from_email': self.from_email, 'title': self.title, 'subject': self.subject, 'sendtime_start': self.sendtime_start, 'sendtime_end': self.sendtime_end, 'uses_segment': self.uses_segment, 'exact': self.exact}

    @property
    def campaign_id(self):
        return self.__campaign_id

    @property
    def exact(self):
        return self.__exact

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
            elif ifield_name == 'campaign_id':
                init_kwds['campaign_id'] = frozenset([iprot.readString() for _ in xrange(iprot.readSetBegin()[1])] + (iprot.readSetEnd() is None and []))
            elif ifield_name == 'list_id':
                init_kwds['list_id'] = frozenset([iprot.readString() for _ in xrange(iprot.readSetBegin()[1])] + (iprot.readSetEnd() is None and []))
            elif ifield_name == 'folder_id':
                init_kwds['folder_id'] = frozenset([iprot.readI32() for _ in xrange(iprot.readSetBegin()[1])] + (iprot.readSetEnd() is None and []))
            elif ifield_name == 'template_id':
                init_kwds['template_id'] = frozenset([iprot.readI32() for _ in xrange(iprot.readSetBegin()[1])] + (iprot.readSetEnd() is None and []))
            elif ifield_name == 'status':
                init_kwds['status'] = frozenset([yochimp.models.campaign.campaign_status.CampaignStatus.value_of(iprot.readString().strip().upper()) for _ in xrange(iprot.readSetBegin()[1])] + (iprot.readSetEnd() is None and []))
            elif ifield_name == 'type':
                init_kwds['type'] = frozenset([yochimp.models.campaign.campaign_type.CampaignType.value_of(iprot.readString().strip().upper()) for _ in xrange(iprot.readSetBegin()[1])] + (iprot.readSetEnd() is None and []))
            elif ifield_name == 'from_name':
                try:
                    init_kwds['from_name'] = iprot.readString()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'from_email':
                try:
                    init_kwds['from_email'] = iprot.readString()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'title':
                try:
                    init_kwds['title'] = iprot.readString()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'subject':
                try:
                    init_kwds['subject'] = iprot.readString()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'sendtime_start':
                try:
                    init_kwds['sendtime_start'] = iprot.readDateTime() if hasattr(iprot, 'readDateTime') else datetime.fromtimestamp(iprot.readI64() / 1000.0)
                except (TypeError,):
                    pass
            elif ifield_name == 'sendtime_end':
                try:
                    init_kwds['sendtime_end'] = iprot.readDateTime() if hasattr(iprot, 'readDateTime') else datetime.fromtimestamp(iprot.readI64() / 1000.0)
                except (TypeError,):
                    pass
            elif ifield_name == 'uses_segment':
                try:
                    init_kwds['uses_segment'] = iprot.readBool()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'exact':
                try:
                    init_kwds['exact'] = iprot.readBool()
                except (TypeError, ValueError,):
                    pass
            iprot.readFieldEnd()
        iprot.readStructEnd()

        return cls(**init_kwds)

    def replace(self, campaign_id=None, list_id=None, folder_id=None, template_id=None, status=None, type=None, from_name=None, from_email=None, title=None, subject=None, sendtime_start=None, sendtime_end=None, uses_segment=None, exact=None):
        if campaign_id is None:
            campaign_id = self.campaign_id
        if list_id is None:
            list_id = self.list_id
        if folder_id is None:
            folder_id = self.folder_id
        if template_id is None:
            template_id = self.template_id
        if status is None:
            status = self.status
        if type is None:
            type = self.type
        if from_name is None:
            from_name = self.from_name
        if from_email is None:
            from_email = self.from_email
        if title is None:
            title = self.title
        if subject is None:
            subject = self.subject
        if sendtime_start is None:
            sendtime_start = self.sendtime_start
        if sendtime_end is None:
            sendtime_end = self.sendtime_end
        if uses_segment is None:
            uses_segment = self.uses_segment
        if exact is None:
            exact = self.exact
        return self.__class__(campaign_id=campaign_id, list_id=list_id, folder_id=folder_id, template_id=template_id, status=status, type=type, from_name=from_name, from_email=from_email, title=title, subject=subject, sendtime_start=sendtime_start, sendtime_end=sendtime_end, uses_segment=uses_segment, exact=exact)

    @property
    def sendtime_end(self):
        return self.__sendtime_end

    @property
    def sendtime_start(self):
        return self.__sendtime_start

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
    def title(self):
        return self.__title

    @property
    def type(self):
        return self.__type

    @property
    def uses_segment(self):
        return self.__uses_segment

    def write(self, oprot):
        oprot.writeStructBegin('CampaignFilter')

        if self.campaign_id is not None:
            oprot.writeFieldBegin('campaign_id', 14, -1)
            oprot.writeSetBegin(11, len(self.campaign_id))
            for _0 in self.campaign_id:
                oprot.writeString(_0)
            oprot.writeSetEnd()
            oprot.writeFieldEnd()

        if self.list_id is not None:
            oprot.writeFieldBegin('list_id', 14, -1)
            oprot.writeSetBegin(11, len(self.list_id))
            for _0 in self.list_id:
                oprot.writeString(_0)
            oprot.writeSetEnd()
            oprot.writeFieldEnd()

        if self.folder_id is not None:
            oprot.writeFieldBegin('folder_id', 14, -1)
            oprot.writeSetBegin(8, len(self.folder_id))
            for _0 in self.folder_id:
                oprot.writeI32(_0)
            oprot.writeSetEnd()
            oprot.writeFieldEnd()

        if self.template_id is not None:
            oprot.writeFieldBegin('template_id', 14, -1)
            oprot.writeSetBegin(8, len(self.template_id))
            for _0 in self.template_id:
                oprot.writeI32(_0)
            oprot.writeSetEnd()
            oprot.writeFieldEnd()

        if self.status is not None:
            oprot.writeFieldBegin('status', 14, -1)
            oprot.writeSetBegin(11, len(self.status))
            for _0 in self.status:
                oprot.writeString([attr for attr in dir(yochimp.models.campaign.campaign_status.CampaignStatus) if getattr(yochimp.models.campaign.campaign_status.CampaignStatus, attr) == _0][0])
            oprot.writeSetEnd()
            oprot.writeFieldEnd()

        if self.type is not None:
            oprot.writeFieldBegin('type', 14, -1)
            oprot.writeSetBegin(11, len(self.type))
            for _0 in self.type:
                oprot.writeString([attr for attr in dir(yochimp.models.campaign.campaign_type.CampaignType) if getattr(yochimp.models.campaign.campaign_type.CampaignType, attr) == _0][0])
            oprot.writeSetEnd()
            oprot.writeFieldEnd()

        if self.from_name is not None:
            oprot.writeFieldBegin('from_name', 11, -1)
            oprot.writeString(self.from_name)
            oprot.writeFieldEnd()

        if self.from_email is not None:
            oprot.writeFieldBegin('from_email', 11, -1)
            oprot.writeString(self.from_email)
            oprot.writeFieldEnd()

        if self.title is not None:
            oprot.writeFieldBegin('title', 11, -1)
            oprot.writeString(self.title)
            oprot.writeFieldEnd()

        if self.subject is not None:
            oprot.writeFieldBegin('subject', 11, -1)
            oprot.writeString(self.subject)
            oprot.writeFieldEnd()

        if self.sendtime_start is not None:
            oprot.writeFieldBegin('sendtime_start', 12, -1)
            oprot.writeDateTime(self.sendtime_start) if hasattr(oprot, 'writeDateTime') else oprot.writeI64(long(mktime(self.sendtime_start.timetuple())) * 1000l)
            oprot.writeFieldEnd()

        if self.sendtime_end is not None:
            oprot.writeFieldBegin('sendtime_end', 12, -1)
            oprot.writeDateTime(self.sendtime_end) if hasattr(oprot, 'writeDateTime') else oprot.writeI64(long(mktime(self.sendtime_end.timetuple())) * 1000l)
            oprot.writeFieldEnd()

        if self.uses_segment is not None:
            oprot.writeFieldBegin('uses_segment', 2, -1)
            oprot.writeBool(self.uses_segment)
            oprot.writeFieldEnd()

        if self.exact is not None:
            oprot.writeFieldBegin('exact', 2, -1)
            oprot.writeBool(self.exact)
            oprot.writeFieldEnd()

        oprot.writeFieldStop()

        oprot.writeStructEnd()
