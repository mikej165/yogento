import __builtin__
import yochimp.models.account.account_contact_details


class AccountDetails(object):
    class Builder:
        def __init__(
            self,
            username,
            user_id,
            is_trial,
            has_activated,
            pending_monthly,
            times_logged_in,
            last_login,
            affiliate_link,
            contact,
            timezone=None,
            plan_type=None,
            plan_low=None,
            plan_high=None,
            plan_start_date=None,
            emails_left=None,
            first_payment=None,
            last_payment=None
        ):
            self.__username = username
            self.__user_id = user_id
            self.__is_trial = is_trial
            self.__has_activated = has_activated
            self.__timezone = timezone
            self.__plan_type = plan_type
            self.__plan_low = plan_low
            self.__plan_high = plan_high
            self.__plan_start_date = plan_start_date
            self.__emails_left = emails_left
            self.__pending_monthly = pending_monthly
            self.__first_payment = first_payment
            self.__last_payment = last_payment
            self.__times_logged_in = times_logged_in
            self.__last_login = last_login
            self.__affiliate_link = affiliate_link
            self.__contact = contact

        def build(self):
            return AccountDetails(username=self.__username, user_id=self.__user_id, is_trial=self.__is_trial, has_activated=self.__has_activated, timezone=self.__timezone, plan_type=self.__plan_type, plan_low=self.__plan_low, plan_high=self.__plan_high, plan_start_date=self.__plan_start_date, emails_left=self.__emails_left, pending_monthly=self.__pending_monthly, first_payment=self.__first_payment, last_payment=self.__last_payment, times_logged_in=self.__times_logged_in, last_login=self.__last_login, affiliate_link=self.__affiliate_link, contact=self.__contact)

        def set_affiliate_link(self, affiliate_link):
            self.__affiliate_link = affiliate_link
            return self

        def set_contact(self, contact):
            self.__contact = contact
            return self

        def set_emails_left(self, emails_left):
            self.__emails_left = emails_left
            return self

        def set_first_payment(self, first_payment):
            self.__first_payment = first_payment
            return self

        def set_has_activated(self, has_activated):
            self.__has_activated = has_activated
            return self

        def set_is_trial(self, is_trial):
            self.__is_trial = is_trial
            return self

        def set_last_login(self, last_login):
            self.__last_login = last_login
            return self

        def set_last_payment(self, last_payment):
            self.__last_payment = last_payment
            return self

        def set_pending_monthly(self, pending_monthly):
            self.__pending_monthly = pending_monthly
            return self

        def set_plan_high(self, plan_high):
            self.__plan_high = plan_high
            return self

        def set_plan_low(self, plan_low):
            self.__plan_low = plan_low
            return self

        def set_plan_start_date(self, plan_start_date):
            self.__plan_start_date = plan_start_date
            return self

        def set_plan_type(self, plan_type):
            self.__plan_type = plan_type
            return self

        def set_times_logged_in(self, times_logged_in):
            self.__times_logged_in = times_logged_in
            return self

        def set_timezone(self, timezone):
            self.__timezone = timezone
            return self

        def set_user_id(self, user_id):
            self.__user_id = user_id
            return self

        def set_username(self, username):
            self.__username = username
            return self

        def update(self, account_details):
            if isinstance(account_details, AccountDetails):
                self.set_username(account_details.username)
                self.set_user_id(account_details.user_id)
                self.set_is_trial(account_details.is_trial)
                self.set_has_activated(account_details.has_activated)
                self.set_timezone(account_details.timezone)
                self.set_plan_type(account_details.plan_type)
                self.set_plan_low(account_details.plan_low)
                self.set_plan_high(account_details.plan_high)
                self.set_plan_start_date(account_details.plan_start_date)
                self.set_emails_left(account_details.emails_left)
                self.set_pending_monthly(account_details.pending_monthly)
                self.set_first_payment(account_details.first_payment)
                self.set_last_payment(account_details.last_payment)
                self.set_times_logged_in(account_details.times_logged_in)
                self.set_last_login(account_details.last_login)
                self.set_affiliate_link(account_details.affiliate_link)
                self.set_contact(account_details.contact)
            elif isinstance(account_details, dict):
                for key, value in account_details.iteritems():
                    getattr(self, 'set_' + key)(value)
            else:
                raise TypeError(account_details)
            return self

    def __init__(
        self,
        username,
        user_id,
        is_trial,
        has_activated,
        pending_monthly,
        times_logged_in,
        last_login,
        affiliate_link,
        contact,
        timezone=None,
        plan_type=None,
        plan_low=None,
        plan_high=None,
        plan_start_date=None,
        emails_left=None,
        first_payment=None,
        last_payment=None
    ):
        if username is None:
            raise ValueError('username is required')
        if not isinstance(username, basestring):
            raise TypeError(getattr(__builtin__, 'type')(username))
        self.__username = username

        if user_id is None:
            raise ValueError('user_id is required')
        if not isinstance(user_id, basestring):
            raise TypeError(getattr(__builtin__, 'type')(user_id))
        self.__user_id = user_id

        if is_trial is None:
            raise ValueError('is_trial is required')
        if not isinstance(is_trial, bool):
            raise TypeError(getattr(__builtin__, 'type')(is_trial))
        self.__is_trial = is_trial

        if has_activated is None:
            raise ValueError('has_activated is required')
        if not isinstance(has_activated, bool):
            raise TypeError(getattr(__builtin__, 'type')(has_activated))
        self.__has_activated = has_activated

        if timezone is not None:
            if not isinstance(timezone, basestring):
                raise TypeError(getattr(__builtin__, 'type')(timezone))
        self.__timezone = timezone

        if plan_type is not None:
            if not isinstance(plan_type, basestring):
                raise TypeError(getattr(__builtin__, 'type')(plan_type))
        self.__plan_type = plan_type

        if plan_low is not None:
            if not isinstance(plan_low, int):
                raise TypeError(getattr(__builtin__, 'type')(plan_low))
        self.__plan_low = plan_low

        if plan_high is not None:
            if not isinstance(plan_high, int):
                raise TypeError(getattr(__builtin__, 'type')(plan_high))
        self.__plan_high = plan_high

        if plan_start_date is not None:
            if not isinstance(plan_start_date, basestring):
                raise TypeError(getattr(__builtin__, 'type')(plan_start_date))
        self.__plan_start_date = plan_start_date

        if emails_left is not None:
            if not isinstance(emails_left, int):
                raise TypeError(getattr(__builtin__, 'type')(emails_left))
        self.__emails_left = emails_left

        if pending_monthly is None:
            raise ValueError('pending_monthly is required')
        if not isinstance(pending_monthly, bool):
            raise TypeError(getattr(__builtin__, 'type')(pending_monthly))
        self.__pending_monthly = pending_monthly

        if first_payment is not None:
            if not isinstance(first_payment, basestring):
                raise TypeError(getattr(__builtin__, 'type')(first_payment))
        self.__first_payment = first_payment

        if last_payment is not None:
            if not isinstance(last_payment, basestring):
                raise TypeError(getattr(__builtin__, 'type')(last_payment))
        self.__last_payment = last_payment

        if times_logged_in is None:
            raise ValueError('times_logged_in is required')
        if not isinstance(times_logged_in, int):
            raise TypeError(getattr(__builtin__, 'type')(times_logged_in))
        self.__times_logged_in = times_logged_in

        if last_login is None:
            raise ValueError('last_login is required')
        if not isinstance(last_login, basestring):
            raise TypeError(getattr(__builtin__, 'type')(last_login))
        self.__last_login = last_login

        if affiliate_link is None:
            raise ValueError('affiliate_link is required')
        if not isinstance(affiliate_link, basestring):
            raise TypeError(getattr(__builtin__, 'type')(affiliate_link))
        self.__affiliate_link = affiliate_link

        if contact is None:
            raise ValueError('contact is required')
        if not isinstance(contact, yochimp.models.account.account_contact_details.AccountContactDetails):
            raise TypeError(getattr(__builtin__, 'type')(contact))
        self.__contact = contact

    def __eq__(self, other):
        if self.username != other.username:
            return False
        if self.user_id != other.user_id:
            return False
        if self.is_trial != other.is_trial:
            return False
        if self.has_activated != other.has_activated:
            return False
        if self.timezone != other.timezone:
            return False
        if self.plan_type != other.plan_type:
            return False
        if self.plan_low != other.plan_low:
            return False
        if self.plan_high != other.plan_high:
            return False
        if self.plan_start_date != other.plan_start_date:
            return False
        if self.emails_left != other.emails_left:
            return False
        if self.pending_monthly != other.pending_monthly:
            return False
        if self.first_payment != other.first_payment:
            return False
        if self.last_payment != other.last_payment:
            return False
        if self.times_logged_in != other.times_logged_in:
            return False
        if self.last_login != other.last_login:
            return False
        if self.affiliate_link != other.affiliate_link:
            return False
        if self.contact != other.contact:
            return False
        return True

    def __hash__(self):
        return hash((self.username,self.user_id,self.is_trial,self.has_activated,self.timezone,self.plan_type,self.plan_low,self.plan_high,self.plan_start_date,self.emails_left,self.pending_monthly,self.first_payment,self.last_payment,self.times_logged_in,self.last_login,self.affiliate_link,self.contact,))

    def __ne__(self, other):
        return not self.__eq__(other)

    def __repr__(self):
        field_reprs = []
        field_reprs.append('username=' + "'" + self.username.encode('ascii', 'replace') + "'")
        field_reprs.append('user_id=' + "'" + self.user_id.encode('ascii', 'replace') + "'")
        field_reprs.append('is_trial=' + repr(self.is_trial))
        field_reprs.append('has_activated=' + repr(self.has_activated))
        if self.timezone is not None:
            field_reprs.append('timezone=' + "'" + self.timezone.encode('ascii', 'replace') + "'")
        if self.plan_type is not None:
            field_reprs.append('plan_type=' + "'" + self.plan_type.encode('ascii', 'replace') + "'")
        if self.plan_low is not None:
            field_reprs.append('plan_low=' + repr(self.plan_low))
        if self.plan_high is not None:
            field_reprs.append('plan_high=' + repr(self.plan_high))
        if self.plan_start_date is not None:
            field_reprs.append('plan_start_date=' + "'" + self.plan_start_date.encode('ascii', 'replace') + "'")
        if self.emails_left is not None:
            field_reprs.append('emails_left=' + repr(self.emails_left))
        field_reprs.append('pending_monthly=' + repr(self.pending_monthly))
        if self.first_payment is not None:
            field_reprs.append('first_payment=' + "'" + self.first_payment.encode('ascii', 'replace') + "'")
        if self.last_payment is not None:
            field_reprs.append('last_payment=' + "'" + self.last_payment.encode('ascii', 'replace') + "'")
        field_reprs.append('times_logged_in=' + repr(self.times_logged_in))
        field_reprs.append('last_login=' + "'" + self.last_login.encode('ascii', 'replace') + "'")
        field_reprs.append('affiliate_link=' + "'" + self.affiliate_link.encode('ascii', 'replace') + "'")
        field_reprs.append('contact=' + repr(self.contact))
        return 'AccountDetails(' + ', '.join(field_reprs) + ')'

    def __str__(self):
        field_reprs = []
        field_reprs.append('username=' + "'" + self.username.encode('ascii', 'replace') + "'")
        field_reprs.append('user_id=' + "'" + self.user_id.encode('ascii', 'replace') + "'")
        field_reprs.append('is_trial=' + repr(self.is_trial))
        field_reprs.append('has_activated=' + repr(self.has_activated))
        if self.timezone is not None:
            field_reprs.append('timezone=' + "'" + self.timezone.encode('ascii', 'replace') + "'")
        if self.plan_type is not None:
            field_reprs.append('plan_type=' + "'" + self.plan_type.encode('ascii', 'replace') + "'")
        if self.plan_low is not None:
            field_reprs.append('plan_low=' + repr(self.plan_low))
        if self.plan_high is not None:
            field_reprs.append('plan_high=' + repr(self.plan_high))
        if self.plan_start_date is not None:
            field_reprs.append('plan_start_date=' + "'" + self.plan_start_date.encode('ascii', 'replace') + "'")
        if self.emails_left is not None:
            field_reprs.append('emails_left=' + repr(self.emails_left))
        field_reprs.append('pending_monthly=' + repr(self.pending_monthly))
        if self.first_payment is not None:
            field_reprs.append('first_payment=' + "'" + self.first_payment.encode('ascii', 'replace') + "'")
        if self.last_payment is not None:
            field_reprs.append('last_payment=' + "'" + self.last_payment.encode('ascii', 'replace') + "'")
        field_reprs.append('times_logged_in=' + repr(self.times_logged_in))
        field_reprs.append('last_login=' + "'" + self.last_login.encode('ascii', 'replace') + "'")
        field_reprs.append('affiliate_link=' + "'" + self.affiliate_link.encode('ascii', 'replace') + "'")
        field_reprs.append('contact=' + repr(self.contact))
        return 'AccountDetails(' + ', '.join(field_reprs) + ')'

    @property
    def affiliate_link(self):
        return self.__affiliate_link

    def as_dict(self):
        return {'username': self.username, 'user_id': self.user_id, 'is_trial': self.is_trial, 'has_activated': self.has_activated, 'timezone': self.timezone, 'plan_type': self.plan_type, 'plan_low': self.plan_low, 'plan_high': self.plan_high, 'plan_start_date': self.plan_start_date, 'emails_left': self.emails_left, 'pending_monthly': self.pending_monthly, 'first_payment': self.first_payment, 'last_payment': self.last_payment, 'times_logged_in': self.times_logged_in, 'last_login': self.last_login, 'affiliate_link': self.affiliate_link, 'contact': self.contact}

    @property
    def contact(self):
        return self.__contact

    @property
    def emails_left(self):
        return self.__emails_left

    @property
    def first_payment(self):
        return self.__first_payment

    @property
    def has_activated(self):
        return self.__has_activated

    @property
    def is_trial(self):
        return self.__is_trial

    @property
    def last_login(self):
        return self.__last_login

    @property
    def last_payment(self):
        return self.__last_payment

    @property
    def pending_monthly(self):
        return self.__pending_monthly

    @property
    def plan_high(self):
        return self.__plan_high

    @property
    def plan_low(self):
        return self.__plan_low

    @property
    def plan_start_date(self):
        return self.__plan_start_date

    @property
    def plan_type(self):
        return self.__plan_type

    @classmethod
    def read(cls, iprot):
        init_kwds = {}

        iprot.readStructBegin()
        while True:
            ifield_name, ifield_type, _ifield_id = iprot.readFieldBegin()
            if ifield_type == 0: # STOP
                break
            elif ifield_name == 'username':
                init_kwds['username'] = iprot.readString()
            elif ifield_name == 'user_id':
                init_kwds['user_id'] = iprot.readString()
            elif ifield_name == 'is_trial':
                init_kwds['is_trial'] = iprot.readBool()
            elif ifield_name == 'has_activated':
                init_kwds['has_activated'] = iprot.readBool()
            elif ifield_name == 'timezone':
                try:
                    init_kwds['timezone'] = iprot.readString()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'plan_type':
                try:
                    init_kwds['plan_type'] = iprot.readString()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'plan_low':
                try:
                    init_kwds['plan_low'] = iprot.readI32()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'plan_high':
                try:
                    init_kwds['plan_high'] = iprot.readI32()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'plan_start_date':
                try:
                    init_kwds['plan_start_date'] = iprot.readString()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'emails_left':
                try:
                    init_kwds['emails_left'] = iprot.readI32()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'pending_monthly':
                init_kwds['pending_monthly'] = iprot.readBool()
            elif ifield_name == 'first_payment':
                try:
                    init_kwds['first_payment'] = iprot.readString()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'last_payment':
                try:
                    init_kwds['last_payment'] = iprot.readString()
                except (TypeError, ValueError,):
                    pass
            elif ifield_name == 'times_logged_in':
                init_kwds['times_logged_in'] = iprot.readI32()
            elif ifield_name == 'last_login':
                init_kwds['last_login'] = iprot.readString()
            elif ifield_name == 'affiliate_link':
                init_kwds['affiliate_link'] = iprot.readString()
            elif ifield_name == 'contact':
                init_kwds['contact'] = yochimp.models.account.account_contact_details.AccountContactDetails.read(iprot)
            iprot.readFieldEnd()
        iprot.readStructEnd()

        return cls(**init_kwds)

    def replace(self, username=None, user_id=None, is_trial=None, has_activated=None, timezone=None, plan_type=None, plan_low=None, plan_high=None, plan_start_date=None, emails_left=None, pending_monthly=None, first_payment=None, last_payment=None, times_logged_in=None, last_login=None, affiliate_link=None, contact=None):
        if username is None:
            username = self.username
        if user_id is None:
            user_id = self.user_id
        if is_trial is None:
            is_trial = self.is_trial
        if has_activated is None:
            has_activated = self.has_activated
        if timezone is None:
            timezone = self.timezone
        if plan_type is None:
            plan_type = self.plan_type
        if plan_low is None:
            plan_low = self.plan_low
        if plan_high is None:
            plan_high = self.plan_high
        if plan_start_date is None:
            plan_start_date = self.plan_start_date
        if emails_left is None:
            emails_left = self.emails_left
        if pending_monthly is None:
            pending_monthly = self.pending_monthly
        if first_payment is None:
            first_payment = self.first_payment
        if last_payment is None:
            last_payment = self.last_payment
        if times_logged_in is None:
            times_logged_in = self.times_logged_in
        if last_login is None:
            last_login = self.last_login
        if affiliate_link is None:
            affiliate_link = self.affiliate_link
        if contact is None:
            contact = self.contact
        return self.__class__(username=username, user_id=user_id, is_trial=is_trial, has_activated=has_activated, timezone=timezone, plan_type=plan_type, plan_low=plan_low, plan_high=plan_high, plan_start_date=plan_start_date, emails_left=emails_left, pending_monthly=pending_monthly, first_payment=first_payment, last_payment=last_payment, times_logged_in=times_logged_in, last_login=last_login, affiliate_link=affiliate_link, contact=contact)

    @property
    def times_logged_in(self):
        return self.__times_logged_in

    @property
    def timezone(self):
        return self.__timezone

    @property
    def user_id(self):
        return self.__user_id

    @property
    def username(self):
        return self.__username

    def write(self, oprot):
        oprot.writeStructBegin('AccountDetails')

        oprot.writeFieldBegin('username', 11, -1)
        oprot.writeString(self.username)
        oprot.writeFieldEnd()

        oprot.writeFieldBegin('user_id', 11, -1)
        oprot.writeString(self.user_id)
        oprot.writeFieldEnd()

        oprot.writeFieldBegin('is_trial', 2, -1)
        oprot.writeBool(self.is_trial)
        oprot.writeFieldEnd()

        oprot.writeFieldBegin('has_activated', 2, -1)
        oprot.writeBool(self.has_activated)
        oprot.writeFieldEnd()

        if self.timezone is not None:
            oprot.writeFieldBegin('timezone', 11, -1)
            oprot.writeString(self.timezone)
            oprot.writeFieldEnd()

        if self.plan_type is not None:
            oprot.writeFieldBegin('plan_type', 11, -1)
            oprot.writeString(self.plan_type)
            oprot.writeFieldEnd()

        if self.plan_low is not None:
            oprot.writeFieldBegin('plan_low', 8, -1)
            oprot.writeI32(self.plan_low)
            oprot.writeFieldEnd()

        if self.plan_high is not None:
            oprot.writeFieldBegin('plan_high', 8, -1)
            oprot.writeI32(self.plan_high)
            oprot.writeFieldEnd()

        if self.plan_start_date is not None:
            oprot.writeFieldBegin('plan_start_date', 11, -1)
            oprot.writeString(self.plan_start_date)
            oprot.writeFieldEnd()

        if self.emails_left is not None:
            oprot.writeFieldBegin('emails_left', 8, -1)
            oprot.writeI32(self.emails_left)
            oprot.writeFieldEnd()

        oprot.writeFieldBegin('pending_monthly', 2, -1)
        oprot.writeBool(self.pending_monthly)
        oprot.writeFieldEnd()

        if self.first_payment is not None:
            oprot.writeFieldBegin('first_payment', 11, -1)
            oprot.writeString(self.first_payment)
            oprot.writeFieldEnd()

        if self.last_payment is not None:
            oprot.writeFieldBegin('last_payment', 11, -1)
            oprot.writeString(self.last_payment)
            oprot.writeFieldEnd()

        oprot.writeFieldBegin('times_logged_in', 8, -1)
        oprot.writeI32(self.times_logged_in)
        oprot.writeFieldEnd()

        oprot.writeFieldBegin('last_login', 11, -1)
        oprot.writeString(self.last_login)
        oprot.writeFieldEnd()

        oprot.writeFieldBegin('affiliate_link', 11, -1)
        oprot.writeString(self.affiliate_link)
        oprot.writeFieldEnd()

        oprot.writeFieldBegin('contact', 12, -1)
        self.contact.write(oprot)
        oprot.writeFieldEnd()

        oprot.writeFieldStop()

        oprot.writeStructEnd()
