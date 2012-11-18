import __builtin__
import yochimp.models.template.template
import yogento.api.models.mail.template.mail_template_type


class MailTemplate(object):
    class Builder:
        def __init__(
            self,
            mail_chimp_template,
            type
        ):
            self.__mail_chimp_template = mail_chimp_template
            self.__type = type

        def build(self):
            return MailTemplate(mail_chimp_template=self.__mail_chimp_template, type=self.__type)

        def set_mail_chimp_template(self, mail_chimp_template):
            self.__mail_chimp_template = mail_chimp_template
            return self

        def set_type(self, type):
            self.__type = type
            return self

        def update(self, mail_template):
            if isinstance(mail_template, MailTemplate):
                self.set_mail_chimp_template(mail_template.mail_chimp_template)
                self.set_type(mail_template.type)
            elif isinstance(mail_template, dict):
                for key, value in mail_template.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(mail_template)
            return self

    def __init__(
        self,
        mail_chimp_template,
        type
    ):
        if mail_chimp_template is None:
            raise ValueError('mail_chimp_template is required')
        if not isinstance(mail_chimp_template, yochimp.models.template.template.Template):
            raise TypeError(getattr(__builtin__, 'type')(mail_chimp_template))
        self.__mail_chimp_template = mail_chimp_template

        if type is None:
            raise ValueError('type is required')
        if not isinstance(type, yogento.api.models.mail.template.mail_template_type.MailTemplateType):
            raise TypeError(getattr(__builtin__, 'type')(type))
        self.__type = type

    def __eq__(self, other):
        if self.mail_chimp_template != other.mail_chimp_template:
            return False
        if self.type != other.type:
            return False
        return True

    def __hash__(self):
        return hash((self.mail_chimp_template,self.type,))

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        field_reprs.append('mail_chimp_template=' + repr(self.mail_chimp_template))
        field_reprs.append('type=' + repr(self.type))
        return 'MailTemplate(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        field_reprs.append('mail_chimp_template=' + repr(self.mail_chimp_template))
        field_reprs.append('type=' + repr(self.type))
        return 'MailTemplate(' + ', '.join(field_reprs) + ')'

    def as_dict(self):
        return {'mail_chimp_template': self.mail_chimp_template, 'type': self.type}

    @property
    def mail_chimp_template(self):
        return self.__mail_chimp_template

    @classmethod
    def read(cls, iprot):
        init_kwds = {}

        iprot.readStructBegin()
        while True:
            ifield_name, ifield_type, _ifield_id = iprot.readFieldBegin()
            if ifield_type == 0: # STOP
                break
            elif ifield_name == 'mail_chimp_template':
                init_kwds['mail_chimp_template'] = yochimp.models.template.template.Template.read(iprot)
            elif ifield_name == 'type':
                init_kwds['type'] = yogento.api.models.mail.template.mail_template_type.MailTemplateType.read(iprot)
            iprot.readFieldEnd()
        iprot.readStructEnd()

        return cls(**init_kwds)

    def replace(self, mail_chimp_template=None, type=None):
        if mail_chimp_template is None:
            mail_chimp_template = self.mail_chimp_template
        if type is None:
            type = self.type
        return self.__class__(mail_chimp_template=mail_chimp_template, type=type)

    @property
    def type(self):
        return self.__type

    def write(self, oprot):
        oprot.writeStructBegin('MailTemplate')

        oprot.writeFieldBegin('mail_chimp_template', 12, -1)
        self.mail_chimp_template.write(oprot)
        oprot.writeFieldEnd()

        oprot.writeFieldBegin('type', 12, -1)
        self.type.write(oprot)
        oprot.writeFieldEnd()

        oprot.writeFieldStop()

        oprot.writeStructEnd()
