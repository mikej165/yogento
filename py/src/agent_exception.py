import __builtin__


class AgentException(Exception):
    class Builder:
        def __init__(
            self,
            cause_message,
            url=None
        ):
            self.__cause_message = cause_message
            self.__url = url

        def build(self):
            return AgentException(cause_message=self.__cause_message, url=self.__url)

        def set_cause_message(self, cause_message):
            self.__cause_message = cause_message
            return self

        def set_url(self, url):
            self.__url = url
            return self

        def update(self, agent_exception):
            if isinstance(agent_exception, AgentException):
                self.set_cause_message(agent_exception.cause_message)
                self.set_url(agent_exception.url)
            elif isinstance(agent_exception, dict):
                for key, value in agent_exception.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(agent_exception)
            return self

    def __init__(
        self,
        cause_message,
        url=None
    ):
        if cause_message is None:
            raise ValueError('cause_message is required')
        if not isinstance(cause_message, basestring):
            raise TypeError(getattr(__builtin__, 'type')(cause_message))
        self.__cause_message = cause_message

        if url is not None:
            if not isinstance(url, basestring):
                raise TypeError(getattr(__builtin__, 'type')(url))
        self.__url = url

    def __eq__(self, other):
        if self.cause_message != other.cause_message:
            return False
        if self.url != other.url:
            return False
        return True

    def __hash__(self):
        return hash((self.cause_message,self.url,))

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        field_reprs.append('cause_message=' + "'" + self.cause_message.encode('ascii', 'replace') + "'")
        if self.url is not None:
            field_reprs.append('url=' + "'" + self.url.encode('ascii', 'replace') + "'")
        return 'AgentException(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        field_reprs.append('cause_message=' + "'" + self.cause_message.encode('ascii', 'replace') + "'")
        if self.url is not None:
            field_reprs.append('url=' + "'" + self.url.encode('ascii', 'replace') + "'")
        return 'AgentException(' + ', '.join(field_reprs) + ')'

    def as_dict(self):
        return {'cause_message': self.cause_message, 'url': self.url}

    @property
    def cause_message(self):
        return self.__cause_message

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
            elif ifield_name == 'url':
                try:
                    init_kwds['url'] = iprot.readString()
                except (TypeError, ValueError,):
                    pass
            iprot.readFieldEnd()
        iprot.readStructEnd()

        return cls(**init_kwds)

    def replace(self, cause_message=None, url=None):
        if cause_message is None:
            cause_message = self.cause_message
        if url is None:
            url = self.url
        return self.__class__(cause_message=cause_message, url=url)

    @property
    def url(self):
        return self.__url

    def write(self, oprot):
        oprot.writeStructBegin('AgentException')

        oprot.writeFieldBegin('cause_message', 11, -1)
        oprot.writeString(self.cause_message)
        oprot.writeFieldEnd()

        if self.url is not None:
            oprot.writeFieldBegin('url', 11, -1)
            oprot.writeString(self.url)
            oprot.writeFieldEnd()

        oprot.writeFieldStop()

        oprot.writeStructEnd()

        return self
