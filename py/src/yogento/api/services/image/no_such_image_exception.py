import __builtin__


class NoSuchImageException(Exception):
    class Builder:
        def __init__(
            self,
            cause_message,
            image_url
        ):
            self.__cause_message = cause_message
            self.__image_url = image_url

        def build(self):
            return NoSuchImageException(cause_message=self.__cause_message, image_url=self.__image_url)

        def set_cause_message(self, cause_message):
            self.__cause_message = cause_message
            return self

        def set_image_url(self, image_url):
            self.__image_url = image_url
            return self

        def update(self, no_such_image_exception):
            if isinstance(no_such_image_exception, NoSuchImageException):
                self.set_cause_message(no_such_image_exception.cause_message)
                self.set_image_url(no_such_image_exception.image_url)
            elif isinstance(no_such_image_exception, dict):
                for key, value in no_such_image_exception.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(no_such_image_exception)
            return self

    def __init__(
        self,
        cause_message,
        image_url
    ):
        if cause_message is None:
            raise ValueError('cause_message is required')
        if not isinstance(cause_message, basestring):
            raise TypeError(getattr(__builtin__, 'type')(cause_message))
        self.__cause_message = cause_message

        if image_url is None:
            raise ValueError('image_url is required')
        if not isinstance(image_url, basestring):
            raise TypeError(getattr(__builtin__, 'type')(image_url))
        self.__image_url = image_url

    def __eq__(self, other):
        if self.cause_message != other.cause_message:
            return False
        if self.image_url != other.image_url:
            return False
        return True

    def __hash__(self):
        return hash((self.cause_message,self.image_url,))

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        field_reprs.append('cause_message=' + "'" + self.cause_message.encode('ascii', 'replace') + "'")
        field_reprs.append('image_url=' + "'" + self.image_url.encode('ascii', 'replace') + "'")
        return 'NoSuchImageException(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        field_reprs.append('cause_message=' + "'" + self.cause_message.encode('ascii', 'replace') + "'")
        field_reprs.append('image_url=' + "'" + self.image_url.encode('ascii', 'replace') + "'")
        return 'NoSuchImageException(' + ', '.join(field_reprs) + ')'

    def as_dict(self):
        return {'cause_message': self.cause_message, 'image_url': self.image_url}

    @property
    def cause_message(self):
        return self.__cause_message

    @property
    def image_url(self):
        return self.__image_url

    @classmethod
    def read(cls, iprot):
        init_kwds = {}

        iprot.readStructBegin()
        while True:
            ifield_name, ifield_type, _ifield_id = iprot.readFieldBegin()
            if ifield_type == 0: # STOP
                break
            elif ifield_name == 'cause_message':
                init_kwds['cause_message'] = iprot.readString()
            elif ifield_name == 'image_url':
                init_kwds['image_url'] = iprot.readString()
            iprot.readFieldEnd()
        iprot.readStructEnd()

        return cls(**init_kwds)

    def replace(self, cause_message=None, image_url=None):
        if cause_message is None:
            cause_message = self.cause_message
        if image_url is None:
            image_url = self.image_url
        return self.__class__(cause_message=cause_message, image_url=image_url)

    def write(self, oprot):
        oprot.writeStructBegin('NoSuchImageException')

        oprot.writeFieldBegin('cause_message', 11, -1)
        oprot.writeString(self.cause_message)
        oprot.writeFieldEnd()

        oprot.writeFieldBegin('image_url', 11, -1)
        oprot.writeString(self.image_url)
        oprot.writeFieldEnd()

        oprot.writeFieldStop()

        oprot.writeStructEnd()

        return self
