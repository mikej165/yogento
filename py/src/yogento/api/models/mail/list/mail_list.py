import __builtin__
import yochimp.models.list.list


class MailList(object):
    class Builder:
        def __init__(
            self,
            mail_chimp_list
        ):
            self.__mail_chimp_list = mail_chimp_list

        def build(self):
            return MailList(mail_chimp_list=self.__mail_chimp_list)

        def set_mail_chimp_list(self, mail_chimp_list):
            self.__mail_chimp_list = mail_chimp_list
            return self

        def update(self, mail_list):
            if isinstance(mail_list, MailList):
                self.set_mail_chimp_list(mail_list.mail_chimp_list)
            elif isinstance(mail_list, dict):
                for key, value in mail_list.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(mail_list)
            return self

    def __init__(
        self,
        mail_chimp_list
    ):
        if mail_chimp_list is None:
            raise ValueError('mail_chimp_list is required')
        if not isinstance(mail_chimp_list, yochimp.models.list.list.List):
            raise TypeError(getattr(__builtin__, 'type')(mail_chimp_list))
        self.__mail_chimp_list = mail_chimp_list

    def __eq__(self, other):
        if self.mail_chimp_list != other.mail_chimp_list:
            return False
        return True

    def __hash__(self):
        return hash(self.mail_chimp_list)

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        field_reprs.append('mail_chimp_list=' + repr(self.mail_chimp_list))
        return 'MailList(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        field_reprs.append('mail_chimp_list=' + repr(self.mail_chimp_list))
        return 'MailList(' + ', '.join(field_reprs) + ')'

    def as_dict(self):
        return {'mail_chimp_list': self.mail_chimp_list}

    @property
    def mail_chimp_list(self):
        return self.__mail_chimp_list

    @classmethod
    def read(cls, iprot):
        init_kwds = {}

        iprot.readStructBegin()
        while True:
            ifield_name, ifield_type, _ifield_id = iprot.readFieldBegin()
            if ifield_type == 0: # STOP
                break
            elif ifield_name == 'mail_chimp_list':
                init_kwds['mail_chimp_list'] = yochimp.models.list.list.List.read(iprot)
            iprot.readFieldEnd()
        iprot.readStructEnd()

        return cls(**init_kwds)

    def replace(self, mail_chimp_list=None):
        if mail_chimp_list is None:
            mail_chimp_list = self.mail_chimp_list
        return self.__class__(mail_chimp_list=mail_chimp_list)

    def write(self, oprot):
        oprot.writeStructBegin('MailList')

        oprot.writeFieldBegin('mail_chimp_list', 12, -1)
        self.mail_chimp_list.write(oprot)
        oprot.writeFieldEnd()

        oprot.writeFieldStop()

        oprot.writeStructEnd()

        return self
