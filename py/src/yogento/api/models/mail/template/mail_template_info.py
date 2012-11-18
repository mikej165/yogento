import __builtin__
import yochimp.models.template.template_info


class MailTemplateInfo(object):
    class Builder:
        def __init__(
            self,
            mail_chimp_template_info
        ):
            self.__mail_chimp_template_info = mail_chimp_template_info

        def build(self):
            return MailTemplateInfo(mail_chimp_template_info=self.__mail_chimp_template_info)

        def set_mail_chimp_template_info(self, mail_chimp_template_info):
            self.__mail_chimp_template_info = mail_chimp_template_info
            return self

        def update(self, mail_template_info):
            if isinstance(mail_template_info, MailTemplateInfo):
                self.set_mail_chimp_template_info(mail_template_info.mail_chimp_template_info)
            elif isinstance(mail_template_info, dict):
                for key, value in mail_template_info.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(mail_template_info)
            return self

    def __init__(
        self,
        mail_chimp_template_info
    ):
        if mail_chimp_template_info is None:
            raise ValueError('mail_chimp_template_info is required')
        if not isinstance(mail_chimp_template_info, yochimp.models.template.template_info.TemplateInfo):
            raise TypeError(getattr(__builtin__, 'type')(mail_chimp_template_info))
        self.__mail_chimp_template_info = mail_chimp_template_info

    def __eq__(self, other):
        if self.mail_chimp_template_info != other.mail_chimp_template_info:
            return False
        return True

    def __hash__(self):
        return hash(self.mail_chimp_template_info)

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        field_reprs.append('mail_chimp_template_info=' + repr(self.mail_chimp_template_info))
        return 'MailTemplateInfo(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        field_reprs.append('mail_chimp_template_info=' + repr(self.mail_chimp_template_info))
        return 'MailTemplateInfo(' + ', '.join(field_reprs) + ')'

    def as_dict(self):
        return {'mail_chimp_template_info': self.mail_chimp_template_info}

    @property
    def mail_chimp_template_info(self):
        return self.__mail_chimp_template_info

    @classmethod
    def read(cls, iprot):
        init_kwds = {}

        iprot.readStructBegin()
        while True:
            ifield_name, ifield_type, _ifield_id = iprot.readFieldBegin()
            if ifield_type == 0: # STOP
                break
            elif ifield_name == 'mail_chimp_template_info':
                init_kwds['mail_chimp_template_info'] = yochimp.models.template.template_info.TemplateInfo.read(iprot)
            iprot.readFieldEnd()
        iprot.readStructEnd()

        return cls(**init_kwds)

    def replace(self, mail_chimp_template_info=None):
        if mail_chimp_template_info is None:
            mail_chimp_template_info = self.mail_chimp_template_info
        return self.__class__(mail_chimp_template_info=mail_chimp_template_info)

    def write(self, oprot):
        oprot.writeStructBegin('MailTemplateInfo')

        oprot.writeFieldBegin('mail_chimp_template_info', 12, -1)
        self.mail_chimp_template_info.write(oprot)
        oprot.writeFieldEnd()

        oprot.writeFieldStop()

        oprot.writeStructEnd()
