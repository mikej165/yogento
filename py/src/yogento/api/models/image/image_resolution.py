import __builtin__


class ImageResolution(object):
    class Builder:
        def __init__(
            self,
            height_px,
            width_px
        ):
            self.__height_px = height_px
            self.__width_px = width_px

        def build(self):
            return ImageResolution(height_px=self.__height_px, width_px=self.__width_px)

        def set_height_px(self, height_px):
            self.__height_px = height_px
            return self

        def set_width_px(self, width_px):
            self.__width_px = width_px
            return self

        def update(self, image_resolution):
            if isinstance(image_resolution, ImageResolution):
                self.set_height_px(image_resolution.height_px)
                self.set_width_px(image_resolution.width_px)
            elif isinstance(image_resolution, dict):
                for key, value in image_resolution.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(image_resolution)
            return self

    def __init__(
        self,
        height_px,
        width_px
    ):
        if height_px is None:
            raise ValueError('height_px is required')
        if not isinstance(height_px, int):
            raise TypeError(getattr(__builtin__, 'type')(height_px))
        self.__height_px = height_px

        if width_px is None:
            raise ValueError('width_px is required')
        if not isinstance(width_px, int):
            raise TypeError(getattr(__builtin__, 'type')(width_px))
        self.__width_px = width_px

    def __eq__(self, other):
        if self.height_px != other.height_px:
            return False
        if self.width_px != other.width_px:
            return False
        return True

    def __hash__(self):
        return hash((self.height_px,self.width_px,))

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        field_reprs.append('height_px=' + repr(self.height_px))
        field_reprs.append('width_px=' + repr(self.width_px))
        return 'ImageResolution(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        field_reprs.append('height_px=' + repr(self.height_px))
        field_reprs.append('width_px=' + repr(self.width_px))
        return 'ImageResolution(' + ', '.join(field_reprs) + ')'

    def as_dict(self):
        return {'height_px': self.height_px, 'width_px': self.width_px}

    @property
    def height_px(self):
        return self.__height_px

    @classmethod
    def read(cls, iprot):
        init_kwds = {}

        iprot.readStructBegin()
        while True:
            ifield_name, ifield_type, _ifield_id = iprot.readFieldBegin()
            if ifield_type == 0: # STOP
                break
            elif ifield_name == 'height_px':
                init_kwds['height_px'] = iprot.readI32()
            elif ifield_name == 'width_px':
                init_kwds['width_px'] = iprot.readI32()
            iprot.readFieldEnd()
        iprot.readStructEnd()

        return cls(**init_kwds)

    def replace(self, height_px=None, width_px=None):
        if height_px is None:
            height_px = self.height_px
        if width_px is None:
            width_px = self.width_px
        return self.__class__(height_px=height_px, width_px=width_px)

    @property
    def width_px(self):
        return self.__width_px

    def write(self, oprot):
        oprot.writeStructBegin('ImageResolution')

        oprot.writeFieldBegin('height_px', 8, -1)
        oprot.writeI32(self.height_px)
        oprot.writeFieldEnd()

        oprot.writeFieldBegin('width_px', 8, -1)
        oprot.writeI32(self.width_px)
        oprot.writeFieldEnd()

        oprot.writeFieldStop()

        oprot.writeStructEnd()

        return self
