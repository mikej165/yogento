import __builtin__


class OAuth2Metadata(object):
    class Builder:
        def __init__(
            self,
            api_endpoint,
            dc,
            login_url
        ):
            self.__api_endpoint = api_endpoint
            self.__dc = dc
            self.__login_url = login_url

        def build(self):
            return OAuth2Metadata(api_endpoint=self.__api_endpoint, dc=self.__dc, login_url=self.__login_url)

        def set_api_endpoint(self, api_endpoint):
            self.__api_endpoint = api_endpoint
            return self

        def set_dc(self, dc):
            self.__dc = dc
            return self

        def set_login_url(self, login_url):
            self.__login_url = login_url
            return self

        def update(self, o_auth2_metadata):
            if isinstance(o_auth2_metadata, OAuth2Metadata):
                self.set_api_endpoint(o_auth2_metadata.api_endpoint)
                self.set_dc(o_auth2_metadata.dc)
                self.set_login_url(o_auth2_metadata.login_url)
            elif isinstance(o_auth2_metadata, dict):
                for key, value in o_auth2_metadata.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(o_auth2_metadata)
            return self

    def __init__(
        self,
        api_endpoint,
        dc,
        login_url
    ):
        if api_endpoint is None:
            raise ValueError('api_endpoint is required')
        if not isinstance(api_endpoint, str):
            raise TypeError(getattr(__builtin__, 'type')(api_endpoint))
        self.__api_endpoint = api_endpoint

        if dc is None:
            raise ValueError('dc is required')
        if not isinstance(dc, basestring):
            raise TypeError(getattr(__builtin__, 'type')(dc))
        self.__dc = dc

        if login_url is None:
            raise ValueError('login_url is required')
        if not isinstance(login_url, str):
            raise TypeError(getattr(__builtin__, 'type')(login_url))
        self.__login_url = login_url

    def __eq__(self, other):
        if self.api_endpoint != other.api_endpoint:
            return False
        if self.dc != other.dc:
            return False
        if self.login_url != other.login_url:
            return False
        return True

    def __hash__(self):
        return hash((self.api_endpoint,self.dc,self.login_url,))

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        field_reprs.append('api_endpoint=' + repr(self.api_endpoint))
        field_reprs.append('dc=' + "'" + self.dc.encode('ascii', 'replace') + "'")
        field_reprs.append('login_url=' + repr(self.login_url))
        return 'OAuth2Metadata(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        field_reprs.append('api_endpoint=' + repr(self.api_endpoint))
        field_reprs.append('dc=' + "'" + self.dc.encode('ascii', 'replace') + "'")
        field_reprs.append('login_url=' + repr(self.login_url))
        return 'OAuth2Metadata(' + ', '.join(field_reprs) + ')'

    @property
    def api_endpoint(self):
        return self.__api_endpoint

    def as_dict(self):
        return {'api_endpoint': self.api_endpoint, 'dc': self.dc, 'login_url': self.login_url}

    @property
    def dc(self):
        return self.__dc

    @property
    def login_url(self):
        return self.__login_url

    @classmethod
    def read(cls, iprot):
        init_kwds = {}

        iprot.readStructBegin()
        while True:
            ifield_name, ifield_type, _ifield_id = iprot.readFieldBegin()
            if ifield_type == 0: # STOP
                break
            elif ifield_name == 'api_endpoint':
                init_kwds['api_endpoint'] = iprot.readString()
            elif ifield_name == 'dc':
                init_kwds['dc'] = iprot.readString()
            elif ifield_name == 'login_url':
                init_kwds['login_url'] = iprot.readString()
            iprot.readFieldEnd()
        iprot.readStructEnd()

        return cls(**init_kwds)

    def replace(self, api_endpoint=None, dc=None, login_url=None):
        if api_endpoint is None:
            api_endpoint = self.api_endpoint
        if dc is None:
            dc = self.dc
        if login_url is None:
            login_url = self.login_url
        return self.__class__(api_endpoint=api_endpoint, dc=dc, login_url=login_url)

    def write(self, oprot):
        oprot.writeStructBegin('OAuth2Metadata')

        oprot.writeFieldBegin('api_endpoint', 12, -1)
        oprot.writeUrl(self.api_endpoint)
        oprot.writeFieldEnd()

        oprot.writeFieldBegin('dc', 11, -1)
        oprot.writeString(self.dc)
        oprot.writeFieldEnd()

        oprot.writeFieldBegin('login_url', 12, -1)
        oprot.writeUrl(self.login_url)
        oprot.writeFieldEnd()

        oprot.writeFieldStop()

        oprot.writeStructEnd()

        return self
