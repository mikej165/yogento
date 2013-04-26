import __builtin__


class CampaignContent(object):
    class Builder:
        def __init__(
            self,
            html=None,
            text=None,
            url=None,
            archive=None,
            archive_type=None
        ):
            self.__html = html
            self.__text = text
            self.__url = url
            self.__archive = archive
            self.__archive_type = archive_type

        def build(self):
            return CampaignContent(html=self.__html, text=self.__text, url=self.__url, archive=self.__archive, archive_type=self.__archive_type)

        def set_archive(self, archive):
            self.__archive = archive
            return self

        def set_archive_type(self, archive_type):
            self.__archive_type = archive_type
            return self

        def set_html(self, html):
            self.__html = html
            return self

        def set_text(self, text):
            self.__text = text
            return self

        def set_url(self, url):
            self.__url = url
            return self

        def update(self, campaign_content):
            if isinstance(campaign_content, CampaignContent):
                self.set_html(campaign_content.html)
                self.set_text(campaign_content.text)
                self.set_url(campaign_content.url)
                self.set_archive(campaign_content.archive)
                self.set_archive_type(campaign_content.archive_type)
            elif isinstance(campaign_content, dict):
                for key, value in campaign_content.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(campaign_content)
            return self

    def __init__(
        self,
        html=None,
        text=None,
        url=None,
        archive=None,
        archive_type=None
    ):
        if html is not None:
            if not isinstance(html, basestring):
                raise TypeError(getattr(__builtin__, 'type')(html))
        self.__html = html

        if text is not None:
            if not isinstance(text, basestring):
                raise TypeError(getattr(__builtin__, 'type')(text))
        self.__text = text

        if url is not None:
            if not isinstance(url, str):
                raise TypeError(getattr(__builtin__, 'type')(url))
        self.__url = url

        if archive is not None:
            if not isinstance(archive, basestring):
                raise TypeError(getattr(__builtin__, 'type')(archive))
        self.__archive = archive

        if archive_type is not None:
            if not isinstance(archive_type, basestring):
                raise TypeError(getattr(__builtin__, 'type')(archive_type))
        self.__archive_type = archive_type

    def __eq__(self, other):
        if self.html != other.html:
            return False
        if self.text != other.text:
            return False
        if self.url != other.url:
            return False
        if self.archive != other.archive:
            return False
        if self.archive_type != other.archive_type:
            return False
        return True

    def __hash__(self):
        return hash((self.html,self.text,self.url,self.archive,self.archive_type,))

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        if self.html is not None:
            field_reprs.append('html=' + "'" + self.html.encode('ascii', 'replace') + "'")
        if self.text is not None:
            field_reprs.append('text=' + "'" + self.text.encode('ascii', 'replace') + "'")
        if self.url is not None:
            field_reprs.append('url=' + repr(self.url))
        if self.archive is not None:
            field_reprs.append('archive=' + "'" + self.archive.encode('ascii', 'replace') + "'")
        if self.archive_type is not None:
            field_reprs.append('archive_type=' + "'" + self.archive_type.encode('ascii', 'replace') + "'")
        return 'CampaignContent(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        if self.html is not None:
            field_reprs.append('html=' + "'" + self.html.encode('ascii', 'replace') + "'")
        if self.text is not None:
            field_reprs.append('text=' + "'" + self.text.encode('ascii', 'replace') + "'")
        if self.url is not None:
            field_reprs.append('url=' + repr(self.url))
        if self.archive is not None:
            field_reprs.append('archive=' + "'" + self.archive.encode('ascii', 'replace') + "'")
        if self.archive_type is not None:
            field_reprs.append('archive_type=' + "'" + self.archive_type.encode('ascii', 'replace') + "'")
        return 'CampaignContent(' + ', '.join(field_reprs) + ')'

    @property
    def archive(self):
        return self.__archive

    @property
    def archive_type(self):
        return self.__archive_type

    def as_dict(self):
        return {'html': self.html, 'text': self.text, 'url': self.url, 'archive': self.archive, 'archive_type': self.archive_type}

    @property
    def html(self):
        return self.__html

    @classmethod
    def read(cls, iprot):
        init_kwds = {}

        iprot.readStructBegin()
        while True:
            ifield_name, ifield_type, _ifield_id = iprot.readFieldBegin()
            if ifield_type == 0: # STOP
                break
            elif ifield_name == 'html':
                try:
                    init_kwds['html'] = iprot.readString()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'text':
                try:
                    init_kwds['text'] = iprot.readString()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'url':
                init_kwds['url'] = iprot.readString()
            elif ifield_name == 'archive':
                try:
                    init_kwds['archive'] = iprot.readString()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'archive_type':
                try:
                    init_kwds['archive_type'] = iprot.readString()
                except (TypeError, ValueError,):
                    pass
            iprot.readFieldEnd()
        iprot.readStructEnd()

        return cls(**init_kwds)

    def replace(self, html=None, text=None, url=None, archive=None, archive_type=None):
        if html is None:
            html = self.html
        if text is None:
            text = self.text
        if url is None:
            url = self.url
        if archive is None:
            archive = self.archive
        if archive_type is None:
            archive_type = self.archive_type
        return self.__class__(html=html, text=text, url=url, archive=archive, archive_type=archive_type)

    @property
    def text(self):
        return self.__text

    @property
    def url(self):
        return self.__url

    def write(self, oprot):
        oprot.writeStructBegin('CampaignContent')

        if self.html is not None:
            oprot.writeFieldBegin('html', 11, -1)
            oprot.writeString(self.html)
            oprot.writeFieldEnd()

        if self.text is not None:
            oprot.writeFieldBegin('text', 11, -1)
            oprot.writeString(self.text)
            oprot.writeFieldEnd()

        if self.url is not None:
            oprot.writeFieldBegin('url', 12, -1)
            oprot.writeUrl(self.url) if hasattr(oprot, 'writeUrl') else oprot.writeString(str(self.url))
            oprot.writeFieldEnd()

        if self.archive is not None:
            oprot.writeFieldBegin('archive', 11, -1)
            oprot.writeString(self.archive)
            oprot.writeFieldEnd()

        if self.archive_type is not None:
            oprot.writeFieldBegin('archive_type', 11, -1)
            oprot.writeString(self.archive_type)
            oprot.writeFieldEnd()

        oprot.writeFieldStop()

        oprot.writeStructEnd()

        return self
