from datetime import datetime
from time import mktime
import __builtin__


class Template(object):
    class Builder:
        def __init__(
            self,
            id,
            name,
            layout,
            edit_source,
            preview_image=None,
            date_created=None
        ):
            self.__id = id
            self.__name = name
            self.__layout = layout
            self.__preview_image = preview_image
            self.__date_created = date_created
            self.__edit_source = edit_source

        def build(self):
            return Template(id=self.__id, name=self.__name, layout=self.__layout, preview_image=self.__preview_image, date_created=self.__date_created, edit_source=self.__edit_source)

        def set_date_created(self, date_created):
            self.__date_created = date_created
            return self

        def set_edit_source(self, edit_source):
            self.__edit_source = edit_source
            return self

        def set_id(self, id):
            self.__id = id
            return self

        def set_layout(self, layout):
            self.__layout = layout
            return self

        def set_name(self, name):
            self.__name = name
            return self

        def set_preview_image(self, preview_image):
            self.__preview_image = preview_image
            return self

        def update(self, template):
            if isinstance(template, Template):
                self.set_id(template.id)
                self.set_name(template.name)
                self.set_layout(template.layout)
                self.set_preview_image(template.preview_image)
                self.set_date_created(template.date_created)
                self.set_edit_source(template.edit_source)
            elif isinstance(template, dict):
                for key, value in template.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(template)
            return self

    def __init__(
        self,
        id,
        name,
        layout,
        edit_source,
        preview_image=None,
        date_created=None
    ):
        if id is None:
            raise ValueError('id is required')
        if not isinstance(id, int):
            raise TypeError(getattr(__builtin__, 'type')(id))
        self.__id = id

        if name is None:
            raise ValueError('name is required')
        if not isinstance(name, basestring):
            raise TypeError(getattr(__builtin__, 'type')(name))
        self.__name = name

        if layout is None:
            raise ValueError('layout is required')
        if not isinstance(layout, basestring):
            raise TypeError(getattr(__builtin__, 'type')(layout))
        self.__layout = layout

        if preview_image is not None:
            if not isinstance(preview_image, basestring):
                raise TypeError(getattr(__builtin__, 'type')(preview_image))
        self.__preview_image = preview_image

        if date_created is not None:
            if not isinstance(date_created, datetime):
                raise TypeError(getattr(__builtin__, 'type')(date_created))
        self.__date_created = date_created

        if edit_source is None:
            raise ValueError('edit_source is required')
        if not isinstance(edit_source, bool):
            raise TypeError(getattr(__builtin__, 'type')(edit_source))
        self.__edit_source = edit_source

    def __eq__(self, other):
        if self.id != other.id:
            return False
        if self.name != other.name:
            return False
        if self.layout != other.layout:
            return False
        if self.preview_image != other.preview_image:
            return False
        if self.date_created != other.date_created:
            return False
        if self.edit_source != other.edit_source:
            return False
        return True

    def __hash__(self):
        return hash((self.id,self.name,self.layout,self.preview_image,self.date_created,self.edit_source,))

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        field_reprs.append('id=' + repr(self.id))
        field_reprs.append('name=' + "'" + self.name.encode('ascii', 'replace') + "'")
        field_reprs.append('layout=' + "'" + self.layout.encode('ascii', 'replace') + "'")
        if self.preview_image is not None:
            field_reprs.append('preview_image=' + "'" + self.preview_image.encode('ascii', 'replace') + "'")
        if self.date_created is not None:
            field_reprs.append('date_created=' + repr(self.date_created))
        field_reprs.append('edit_source=' + repr(self.edit_source))
        return 'Template(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        field_reprs.append('id=' + repr(self.id))
        field_reprs.append('name=' + "'" + self.name.encode('ascii', 'replace') + "'")
        field_reprs.append('layout=' + "'" + self.layout.encode('ascii', 'replace') + "'")
        if self.preview_image is not None:
            field_reprs.append('preview_image=' + "'" + self.preview_image.encode('ascii', 'replace') + "'")
        if self.date_created is not None:
            field_reprs.append('date_created=' + repr(self.date_created))
        field_reprs.append('edit_source=' + repr(self.edit_source))
        return 'Template(' + ', '.join(field_reprs) + ')'

    def as_dict(self):
        return {'id': self.id, 'name': self.name, 'layout': self.layout, 'preview_image': self.preview_image, 'date_created': self.date_created, 'edit_source': self.edit_source}

    @property
    def date_created(self):
        return self.__date_created

    @property
    def edit_source(self):
        return self.__edit_source

    @property
    def id(self):
        return self.__id

    @property
    def layout(self):
        return self.__layout

    @property
    def name(self):
        return self.__name

    @property
    def preview_image(self):
        return self.__preview_image

    @classmethod
    def read(cls, iprot):
        init_kwds = {}

        iprot.readStructBegin()
        while True:
            ifield_name, ifield_type, _ifield_id = iprot.readFieldBegin()
            if ifield_type == 0: # STOP
                break
            elif ifield_name == 'id':
                init_kwds['id'] = iprot.readI32()
            elif ifield_name == 'name':
                init_kwds['name'] = iprot.readString()
            elif ifield_name == 'layout':
                init_kwds['layout'] = iprot.readString()
            elif ifield_name == 'preview_image':
                try:
                    init_kwds['preview_image'] = iprot.readString()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'date_created':
                try:
                    init_kwds['date_created'] = iprot.readDateTime() if hasattr(iprot, 'readDateTime') else datetime.fromtimestamp(iprot.readI64() / 1000.0)
                except (TypeError,):
                    pass
            elif ifield_name == 'edit_source':
                init_kwds['edit_source'] = iprot.readBool()
            iprot.readFieldEnd()
        iprot.readStructEnd()

        return cls(**init_kwds)

    def replace(self, id=None, name=None, layout=None, preview_image=None, date_created=None, edit_source=None):
        if id is None:
            id = self.id
        if name is None:
            name = self.name
        if layout is None:
            layout = self.layout
        if preview_image is None:
            preview_image = self.preview_image
        if date_created is None:
            date_created = self.date_created
        if edit_source is None:
            edit_source = self.edit_source
        return self.__class__(id=id, name=name, layout=layout, preview_image=preview_image, date_created=date_created, edit_source=edit_source)

    def write(self, oprot):
        oprot.writeStructBegin('Template')

        oprot.writeFieldBegin('id', 8, -1)
        oprot.writeI32(self.id)
        oprot.writeFieldEnd()

        oprot.writeFieldBegin('name', 11, -1)
        oprot.writeString(self.name)
        oprot.writeFieldEnd()

        oprot.writeFieldBegin('layout', 11, -1)
        oprot.writeString(self.layout)
        oprot.writeFieldEnd()

        if self.preview_image is not None:
            oprot.writeFieldBegin('preview_image', 11, -1)
            oprot.writeString(self.preview_image)
            oprot.writeFieldEnd()

        if self.date_created is not None:
            oprot.writeFieldBegin('date_created', 12, -1)
            oprot.writeDateTime(self.date_created) if hasattr(oprot, 'writeDateTime') else oprot.writeI64(long(mktime(self.date_created.timetuple())) * 1000l)
            oprot.writeFieldEnd()

        oprot.writeFieldBegin('edit_source', 2, -1)
        oprot.writeBool(self.edit_source)
        oprot.writeFieldEnd()

        oprot.writeFieldStop()

        oprot.writeStructEnd()

        return self
