import __builtin__


class TemplateInactiveFilter(object):
    class Builder:
        def __init__(
            self,
            include=None,
            only=None
        ):
            self.__include = include
            self.__only = only

        def build(self):
            return TemplateInactiveFilter(include=self.__include, only=self.__only)

        def set_include(self, include):
            self.__include = include
            return self

        def set_only(self, only):
            self.__only = only
            return self

        def update(self, template_inactive_filter):
            if isinstance(template_inactive_filter, TemplateInactiveFilter):
                self.set_include(template_inactive_filter.include)
                self.set_only(template_inactive_filter.only)
            elif isinstance(template_inactive_filter, dict):
                for key, value in template_inactive_filter.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(template_inactive_filter)
            return self

    def __init__(
        self,
        include=None,
        only=None
    ):
        if include is not None:
            if not isinstance(include, bool):
                raise TypeError(getattr(__builtin__, 'type')(include))
        self.__include = include

        if only is not None:
            if not isinstance(only, bool):
                raise TypeError(getattr(__builtin__, 'type')(only))
        self.__only = only

    def __eq__(self, other):
        if self.include != other.include:
            return False
        if self.only != other.only:
            return False
        return True

    def __hash__(self):
        return hash((self.include,self.only,))

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        if self.include is not None:
            field_reprs.append('include=' + repr(self.include))
        if self.only is not None:
            field_reprs.append('only=' + repr(self.only))
        return 'TemplateInactiveFilter(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        if self.include is not None:
            field_reprs.append('include=' + repr(self.include))
        if self.only is not None:
            field_reprs.append('only=' + repr(self.only))
        return 'TemplateInactiveFilter(' + ', '.join(field_reprs) + ')'

    def as_dict(self):
        return {'include': self.include, 'only': self.only}

    @property
    def include(self):
        return self.__include

    @property
    def only(self):
        return self.__only

    @classmethod
    def read(cls, iprot):
        init_kwds = {}

        iprot.readStructBegin()
        while True:
            ifield_name, ifield_type, _ifield_id = iprot.readFieldBegin()
            if ifield_type == 0: # STOP
                break
            elif ifield_name == 'include':
                try:
                    init_kwds['include'] = iprot.readBool()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'only':
                try:
                    init_kwds['only'] = iprot.readBool()
                except (TypeError, ValueError,):
                    pass
            iprot.readFieldEnd()
        iprot.readStructEnd()

        return cls(**init_kwds)

    def replace(self, include=None, only=None):
        if include is None:
            include = self.include
        if only is None:
            only = self.only
        return self.__class__(include=include, only=only)

    def write(self, oprot):
        oprot.writeStructBegin('TemplateInactiveFilter')

        if self.include is not None:
            oprot.writeFieldBegin('include', 2, -1)
            oprot.writeBool(self.include)
            oprot.writeFieldEnd()

        if self.only is not None:
            oprot.writeFieldBegin('only', 2, -1)
            oprot.writeBool(self.only)
            oprot.writeFieldEnd()

        oprot.writeFieldStop()

        oprot.writeStructEnd()

        return self
