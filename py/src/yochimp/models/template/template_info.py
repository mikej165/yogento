from itertools import ifilterfalse
import __builtin__


class TemplateInfo(object):
    class Builder:
        def __init__(
            self,
            default_content,
            sections,
            source,
            preview
        ):
            self.__default_content = default_content
            self.__sections = sections
            self.__source = source
            self.__preview = preview

        def build(self):
            return TemplateInfo(default_content=self.__default_content, sections=self.__sections, source=self.__source, preview=self.__preview)

        def set_default_content(self, default_content):
            self.__default_content = default_content
            return self

        def set_preview(self, preview):
            self.__preview = preview
            return self

        def set_sections(self, sections):
            self.__sections = sections
            return self

        def set_source(self, source):
            self.__source = source
            return self

        def update(self, template_info):
            if isinstance(template_info, TemplateInfo):
                self.set_default_content(template_info.default_content)
                self.set_sections(template_info.sections)
                self.set_source(template_info.source)
                self.set_preview(template_info.preview)
            elif isinstance(template_info, dict):
                for key, value in template_info.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(template_info)
            return self

    def __init__(
        self,
        default_content,
        sections,
        source,
        preview
    ):
        if default_content is None:
            raise ValueError('default_content is required')
        if not (isinstance(default_content, dict) and len(list(ifilterfalse(lambda __item: isinstance(__item[0], basestring) and isinstance(__item[1], basestring), default_content.iteritems()))) == 0):
            raise TypeError(getattr(__builtin__, 'type')(default_content))
        self.__default_content = default_content.copy() if default_content is not None else None

        if sections is None:
            raise ValueError('sections is required')
        if not (isinstance(sections, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, basestring), sections))) == 0):
            raise TypeError(getattr(__builtin__, 'type')(sections))
        self.__sections = sections

        if source is None:
            raise ValueError('source is required')
        if not isinstance(source, basestring):
            raise TypeError(getattr(__builtin__, 'type')(source))
        self.__source = source

        if preview is None:
            raise ValueError('preview is required')
        if not isinstance(preview, basestring):
            raise TypeError(getattr(__builtin__, 'type')(preview))
        self.__preview = preview

    def __eq__(self, other):
        if self.default_content != other.default_content:
            return False
        if self.sections != other.sections:
            return False
        if self.source != other.source:
            return False
        if self.preview != other.preview:
            return False
        return True

    def __hash__(self):
        return hash((self.default_content,self.sections,self.source,self.preview,))

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        field_reprs.append('default_content=' + repr(self.default_content))
        field_reprs.append('sections=' + repr(self.sections))
        field_reprs.append('source=' + "'" + self.source.encode('ascii', 'replace') + "'")
        field_reprs.append('preview=' + "'" + self.preview.encode('ascii', 'replace') + "'")
        return 'TemplateInfo(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        field_reprs.append('default_content=' + repr(self.default_content))
        field_reprs.append('sections=' + repr(self.sections))
        field_reprs.append('source=' + "'" + self.source.encode('ascii', 'replace') + "'")
        field_reprs.append('preview=' + "'" + self.preview.encode('ascii', 'replace') + "'")
        return 'TemplateInfo(' + ', '.join(field_reprs) + ')'

    def as_dict(self):
        return {'default_content': self.default_content, 'sections': self.sections, 'source': self.source, 'preview': self.preview}

    @property
    def default_content(self):
        return self.__default_content.copy() if self.__default_content is not None else None

    @property
    def preview(self):
        return self.__preview

    @classmethod
    def read(cls, iprot):
        init_kwds = {}

        iprot.readStructBegin()
        while True:
            ifield_name, ifield_type, _ifield_id = iprot.readFieldBegin()
            if ifield_type == 0: # STOP
                break
            elif ifield_name == 'default_content':
                init_kwds['default_content'] = dict([(iprot.readString(), iprot.readString()) for _ in xrange(iprot.readMapBegin()[2])] + (iprot.readMapEnd() is None and []))
            elif ifield_name == 'sections':
                init_kwds['sections'] = tuple([iprot.readString() for _ in xrange(iprot.readListBegin()[1])] + (iprot.readListEnd() is None and []))
            elif ifield_name == 'source':
                init_kwds['source'] = iprot.readString()
            elif ifield_name == 'preview':
                init_kwds['preview'] = iprot.readString()
            iprot.readFieldEnd()
        iprot.readStructEnd()

        return cls(**init_kwds)

    def replace(self, default_content=None, sections=None, source=None, preview=None):
        if default_content is None:
            default_content = self.default_content
        if sections is None:
            sections = self.sections
        if source is None:
            source = self.source
        if preview is None:
            preview = self.preview
        return self.__class__(default_content=default_content, sections=sections, source=source, preview=preview)

    @property
    def sections(self):
        return self.__sections

    @property
    def source(self):
        return self.__source

    def write(self, oprot):
        oprot.writeStructBegin('TemplateInfo')

        oprot.writeFieldBegin('default_content', 13, -1)
        oprot.writeMapBegin(11, len(self.default_content), 11)
        for __key0, __value0 in self.default_content.iteritems():
            oprot.writeString(__key0)
            oprot.writeString(__value0)
        oprot.writeMapEnd()
        oprot.writeFieldEnd()

        oprot.writeFieldBegin('sections', 15, -1)
        oprot.writeListBegin(11, len(self.sections))
        for _0 in self.sections:
            oprot.writeString(_0)
        oprot.writeListEnd()
        oprot.writeFieldEnd()

        oprot.writeFieldBegin('source', 11, -1)
        oprot.writeString(self.source)
        oprot.writeFieldEnd()

        oprot.writeFieldBegin('preview', 11, -1)
        oprot.writeString(self.preview)
        oprot.writeFieldEnd()

        oprot.writeFieldStop()

        oprot.writeStructEnd()
