import __builtin__
import yochimp.models.template.template_type


class MailTemplateType(object):
    class Builder:
        def __init__(
            self,
            mail_chimp_template_type
        ):
            self.__mail_chimp_template_type = mail_chimp_template_type

        def build(self):
            return MailTemplateType(mail_chimp_template_type=self.__mail_chimp_template_type)

        def set_mail_chimp_template_type(self, mail_chimp_template_type):
            self.__mail_chimp_template_type = mail_chimp_template_type
            return self

        def update(self, mail_template_type):
            if isinstance(mail_template_type, MailTemplateType):
                self.set_mail_chimp_template_type(mail_template_type.mail_chimp_template_type)
            elif isinstance(mail_template_type, dict):
                for key, value in mail_template_type.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(mail_template_type)
            return self

    def __init__(
        self,
        mail_chimp_template_type
    ):
        if mail_chimp_template_type is None:
            raise ValueError('mail_chimp_template_type is required')
        if not isinstance(mail_chimp_template_type, yochimp.models.template.template_type.TemplateType):
            raise TypeError(getattr(__builtin__, 'type')(mail_chimp_template_type))
        self.__mail_chimp_template_type = mail_chimp_template_type

    def __eq__(self, other):
        if self.mail_chimp_template_type != other.mail_chimp_template_type:
            return False
        return True

    def __hash__(self):
        return hash(self.mail_chimp_template_type)

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        field_reprs.append('mail_chimp_template_type=' + repr(self.mail_chimp_template_type))
        return 'MailTemplateType(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        field_reprs.append('mail_chimp_template_type=' + repr(self.mail_chimp_template_type))
        return 'MailTemplateType(' + ', '.join(field_reprs) + ')'

    def as_dict(self):
        return {'mail_chimp_template_type': self.mail_chimp_template_type}

    @property
    def mail_chimp_template_type(self):
        return self.__mail_chimp_template_type

    @classmethod
    def read(cls, iprot):
        init_kwds = {}

        iprot.readStructBegin()
        while True:
            ifield_name, ifield_type, _ifield_id = iprot.readFieldBegin()
            if ifield_type == 0: # STOP
                break
            elif ifield_name == 'mail_chimp_template_type':
                init_kwds['mail_chimp_template_type'] = yochimp.models.template.template_type.TemplateType.value_of(iprot.readString().strip().upper())
            iprot.readFieldEnd()
        iprot.readStructEnd()

        return cls(**init_kwds)

    def replace(self, mail_chimp_template_type=None):
        if mail_chimp_template_type is None:
            mail_chimp_template_type = self.mail_chimp_template_type
        return self.__class__(mail_chimp_template_type=mail_chimp_template_type)

    def write(self, oprot):
        oprot.writeStructBegin('MailTemplateType')

        oprot.writeFieldBegin('mail_chimp_template_type', 11, -1)
        oprot.writeString([attr for attr in dir(yochimp.models.template.template_type.TemplateType) if getattr(yochimp.models.template.template_type.TemplateType, attr) == self.mail_chimp_template_type][0])
        oprot.writeFieldEnd()

        oprot.writeFieldStop()

        oprot.writeStructEnd()
