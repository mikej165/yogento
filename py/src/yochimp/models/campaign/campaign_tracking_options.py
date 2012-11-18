import __builtin__


class CampaignTrackingOptions(object):
    class Builder:
        def __init__(
            self,
            html_clicks,
            text_clicks,
            opens
        ):
            self.__html_clicks = html_clicks
            self.__text_clicks = text_clicks
            self.__opens = opens

        def build(self):
            return CampaignTrackingOptions(html_clicks=self.__html_clicks, text_clicks=self.__text_clicks, opens=self.__opens)

        def set_html_clicks(self, html_clicks):
            self.__html_clicks = html_clicks
            return self

        def set_opens(self, opens):
            self.__opens = opens
            return self

        def set_text_clicks(self, text_clicks):
            self.__text_clicks = text_clicks
            return self

        def update(self, campaign_tracking_options):
            if isinstance(campaign_tracking_options, CampaignTrackingOptions):
                self.set_html_clicks(campaign_tracking_options.html_clicks)
                self.set_text_clicks(campaign_tracking_options.text_clicks)
                self.set_opens(campaign_tracking_options.opens)
            elif isinstance(campaign_tracking_options, dict):
                for key, value in campaign_tracking_options.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(campaign_tracking_options)
            return self

    def __init__(
        self,
        html_clicks,
        text_clicks,
        opens
    ):
        if html_clicks is None:
            raise ValueError('html_clicks is required')
        if not isinstance(html_clicks, bool):
            raise TypeError(getattr(__builtin__, 'type')(html_clicks))
        self.__html_clicks = html_clicks

        if text_clicks is None:
            raise ValueError('text_clicks is required')
        if not isinstance(text_clicks, bool):
            raise TypeError(getattr(__builtin__, 'type')(text_clicks))
        self.__text_clicks = text_clicks

        if opens is None:
            raise ValueError('opens is required')
        if not isinstance(opens, bool):
            raise TypeError(getattr(__builtin__, 'type')(opens))
        self.__opens = opens

    def __eq__(self, other):
        if self.html_clicks != other.html_clicks:
            return False
        if self.text_clicks != other.text_clicks:
            return False
        if self.opens != other.opens:
            return False
        return True

    def __hash__(self):
        return hash((self.html_clicks,self.text_clicks,self.opens,))

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        field_reprs.append('html_clicks=' + repr(self.html_clicks))
        field_reprs.append('text_clicks=' + repr(self.text_clicks))
        field_reprs.append('opens=' + repr(self.opens))
        return 'CampaignTrackingOptions(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        field_reprs.append('html_clicks=' + repr(self.html_clicks))
        field_reprs.append('text_clicks=' + repr(self.text_clicks))
        field_reprs.append('opens=' + repr(self.opens))
        return 'CampaignTrackingOptions(' + ', '.join(field_reprs) + ')'

    def as_dict(self):
        return {'html_clicks': self.html_clicks, 'text_clicks': self.text_clicks, 'opens': self.opens}

    @property
    def html_clicks(self):
        return self.__html_clicks

    @property
    def opens(self):
        return self.__opens

    @classmethod
    def read(cls, iprot):
        init_kwds = {}

        iprot.readStructBegin()
        while True:
            ifield_name, ifield_type, _ifield_id = iprot.readFieldBegin()
            if ifield_type == 0: # STOP
                break
            elif ifield_name == 'html_clicks':
                init_kwds['html_clicks'] = iprot.readBool()
            elif ifield_name == 'text_clicks':
                init_kwds['text_clicks'] = iprot.readBool()
            elif ifield_name == 'opens':
                init_kwds['opens'] = iprot.readBool()
            iprot.readFieldEnd()
        iprot.readStructEnd()

        return cls(**init_kwds)

    def replace(self, html_clicks=None, text_clicks=None, opens=None):
        if html_clicks is None:
            html_clicks = self.html_clicks
        if text_clicks is None:
            text_clicks = self.text_clicks
        if opens is None:
            opens = self.opens
        return self.__class__(html_clicks=html_clicks, text_clicks=text_clicks, opens=opens)

    @property
    def text_clicks(self):
        return self.__text_clicks

    def write(self, oprot):
        oprot.writeStructBegin('CampaignTrackingOptions')

        oprot.writeFieldBegin('html_clicks', 2, -1)
        oprot.writeBool(self.html_clicks)
        oprot.writeFieldEnd()

        oprot.writeFieldBegin('text_clicks', 2, -1)
        oprot.writeBool(self.text_clicks)
        oprot.writeFieldEnd()

        oprot.writeFieldBegin('opens', 2, -1)
        oprot.writeBool(self.opens)
        oprot.writeFieldEnd()

        oprot.writeFieldStop()

        oprot.writeStructEnd()
