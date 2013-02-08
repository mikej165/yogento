import __builtin__


class TemplateTypeFilter(object):
    class Builder:
        def __init__(
            self,
            user=None,
            gallery=None,
            base=None
        ):
            self.__user = user
            self.__gallery = gallery
            self.__base = base

        def build(self):
            return TemplateTypeFilter(user=self.__user, gallery=self.__gallery, base=self.__base)

        def set_base(self, base):
            self.__base = base
            return self

        def set_gallery(self, gallery):
            self.__gallery = gallery
            return self

        def set_user(self, user):
            self.__user = user
            return self

        def update(self, template_type_filter):
            if isinstance(template_type_filter, TemplateTypeFilter):
                self.set_user(template_type_filter.user)
                self.set_gallery(template_type_filter.gallery)
                self.set_base(template_type_filter.base)
            elif isinstance(template_type_filter, dict):
                for key, value in template_type_filter.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(template_type_filter)
            return self

    def __init__(
        self,
        user=None,
        gallery=None,
        base=None
    ):
        if user is not None:
            if not isinstance(user, bool):
                raise TypeError(getattr(__builtin__, 'type')(user))
        self.__user = user

        if gallery is not None:
            if not isinstance(gallery, bool):
                raise TypeError(getattr(__builtin__, 'type')(gallery))
        self.__gallery = gallery

        if base is not None:
            if not isinstance(base, bool):
                raise TypeError(getattr(__builtin__, 'type')(base))
        self.__base = base

    def __eq__(self, other):
        if self.user != other.user:
            return False
        if self.gallery != other.gallery:
            return False
        if self.base != other.base:
            return False
        return True

    def __hash__(self):
        return hash((self.user,self.gallery,self.base,))

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        if self.user is not None:
            field_reprs.append('user=' + repr(self.user))
        if self.gallery is not None:
            field_reprs.append('gallery=' + repr(self.gallery))
        if self.base is not None:
            field_reprs.append('base=' + repr(self.base))
        return 'TemplateTypeFilter(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        if self.user is not None:
            field_reprs.append('user=' + repr(self.user))
        if self.gallery is not None:
            field_reprs.append('gallery=' + repr(self.gallery))
        if self.base is not None:
            field_reprs.append('base=' + repr(self.base))
        return 'TemplateTypeFilter(' + ', '.join(field_reprs) + ')'

    def as_dict(self):
        return {'user': self.user, 'gallery': self.gallery, 'base': self.base}

    @property
    def base(self):
        return self.__base

    @property
    def gallery(self):
        return self.__gallery

    @classmethod
    def read(cls, iprot):
        init_kwds = {}

        iprot.readStructBegin()
        while True:
            ifield_name, ifield_type, _ifield_id = iprot.readFieldBegin()
            if ifield_type == 0: # STOP
                break
            elif ifield_name == 'user':
                try:
                    init_kwds['user'] = iprot.readBool()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'gallery':
                try:
                    init_kwds['gallery'] = iprot.readBool()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'base':
                try:
                    init_kwds['base'] = iprot.readBool()
                except (TypeError, ValueError,):
                    pass
            iprot.readFieldEnd()
        iprot.readStructEnd()

        return cls(**init_kwds)

    def replace(self, user=None, gallery=None, base=None):
        if user is None:
            user = self.user
        if gallery is None:
            gallery = self.gallery
        if base is None:
            base = self.base
        return self.__class__(user=user, gallery=gallery, base=base)

    @property
    def user(self):
        return self.__user

    def write(self, oprot):
        oprot.writeStructBegin('TemplateTypeFilter')

        if self.user is not None:
            oprot.writeFieldBegin('user', 2, -1)
            oprot.writeBool(self.user)
            oprot.writeFieldEnd()

        if self.gallery is not None:
            oprot.writeFieldBegin('gallery', 2, -1)
            oprot.writeBool(self.gallery)
            oprot.writeFieldEnd()

        if self.base is not None:
            oprot.writeFieldBegin('base', 2, -1)
            oprot.writeBool(self.base)
            oprot.writeFieldEnd()

        oprot.writeFieldStop()

        oprot.writeStructEnd()

        return self
