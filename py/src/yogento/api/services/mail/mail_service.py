from datetime import datetime
from itertools import ifilterfalse
from time import mktime
import __builtin__
import yogento.api.models.mail.campaign.mail_campaign
import yogento.api.models.mail.campaign.mail_campaign_stats
import yogento.api.models.mail.list.mail_list
import yogento.api.models.mail.template.mail_template
import yogento.api.models.mail.template.mail_template_info
import yogento.api.models.mail.template.mail_template_type


class MailService(object):
    def delete_mail_campaign(self, cid, write_through=None):
        if cid is None:
            raise ValueError('cid is required')
        if not isinstance(cid, basestring):
            raise TypeError(getattr(__builtin__, 'type')(cid))
        if write_through is not None:
            if not isinstance(write_through, bool):
                raise TypeError(getattr(__builtin__, 'type')(write_through))

        delete_mail_campaign_return_value = self._delete_mail_campaign(cid=cid, write_through=write_through)

        if not isinstance(delete_mail_campaign_return_value, bool):
            raise TypeError(getattr(__builtin__, 'type')(delete_mail_campaign_return_value))

        return delete_mail_campaign_return_value

    def _delete_mail_campaign(self, cid, write_through=None):
        raise NotImplementedError(self.__class__.__module__ + '.' + self.__class__.__name__ + '._delete_mail_campaign')

    def get_mail_campaign(self, cid, include_content=None):
        if cid is None:
            raise ValueError('cid is required')
        if not isinstance(cid, basestring):
            raise TypeError(getattr(__builtin__, 'type')(cid))
        if include_content is not None:
            if not isinstance(include_content, bool):
                raise TypeError(getattr(__builtin__, 'type')(include_content))

        get_mail_campaign_return_value = self._get_mail_campaign(cid=cid, include_content=include_content)

        if not isinstance(get_mail_campaign_return_value, yogento.api.models.mail.campaign.mail_campaign.MailCampaign):
            raise TypeError(getattr(__builtin__, 'type')(get_mail_campaign_return_value))

        return get_mail_campaign_return_value

    def _get_mail_campaign(self, cid, include_content=None):
        raise NotImplementedError(self.__class__.__module__ + '.' + self.__class__.__name__ + '._get_mail_campaign')

    def get_mail_campaigns(self, include_content=None):
        if include_content is not None:
            if not isinstance(include_content, bool):
                raise TypeError(getattr(__builtin__, 'type')(include_content))

        get_mail_campaigns_return_value = self._get_mail_campaigns(include_content=include_content)

        if not (isinstance(get_mail_campaigns_return_value, frozenset) and len(list(ifilterfalse(lambda _: isinstance(_, yogento.api.models.mail.campaign.mail_campaign.MailCampaign), get_mail_campaigns_return_value))) == 0):
            raise TypeError(getattr(__builtin__, 'type')(get_mail_campaigns_return_value))

        return get_mail_campaigns_return_value

    def _get_mail_campaigns(self, include_content=None):
        raise NotImplementedError(self.__class__.__module__ + '.' + self.__class__.__name__ + '._get_mail_campaigns')

    def get_mail_campaign_stats(self, cid):
        if cid is None:
            raise ValueError('cid is required')
        if not isinstance(cid, basestring):
            raise TypeError(getattr(__builtin__, 'type')(cid))

        get_mail_campaign_stats_return_value = self._get_mail_campaign_stats(cid=cid)

        if not isinstance(get_mail_campaign_stats_return_value, yogento.api.models.mail.campaign.mail_campaign_stats.MailCampaignStats):
            raise TypeError(getattr(__builtin__, 'type')(get_mail_campaign_stats_return_value))

        return get_mail_campaign_stats_return_value

    def _get_mail_campaign_stats(self, cid):
        raise NotImplementedError(self.__class__.__module__ + '.' + self.__class__.__name__ + '._get_mail_campaign_stats')

    def get_mail_lists(self):
        get_mail_lists_return_value = self._get_mail_lists()

        if not (isinstance(get_mail_lists_return_value, frozenset) and len(list(ifilterfalse(lambda _: isinstance(_, yogento.api.models.mail.list.mail_list.MailList), get_mail_lists_return_value))) == 0):
            raise TypeError(getattr(__builtin__, 'type')(get_mail_lists_return_value))

        return get_mail_lists_return_value

    def _get_mail_lists(self):
        raise NotImplementedError(self.__class__.__module__ + '.' + self.__class__.__name__ + '._get_mail_lists')

    def get_mail_templates(self, types=None):
        if types is not None:
            if not (isinstance(types, frozenset) and len(list(ifilterfalse(lambda _: isinstance(_, yogento.api.models.mail.template.mail_template_type.MailTemplateType), types))) == 0):
                raise TypeError(getattr(__builtin__, 'type')(types))

        get_mail_templates_return_value = self._get_mail_templates(types=types)

        if not (isinstance(get_mail_templates_return_value, frozenset) and len(list(ifilterfalse(lambda _: isinstance(_, yogento.api.models.mail.template.mail_template.MailTemplate), get_mail_templates_return_value))) == 0):
            raise TypeError(getattr(__builtin__, 'type')(get_mail_templates_return_value))

        return get_mail_templates_return_value

    def _get_mail_templates(self, types=None):
        raise NotImplementedError(self.__class__.__module__ + '.' + self.__class__.__name__ + '._get_mail_templates')

    def get_mail_template_info(self, tid, type=None):
        if tid is None:
            raise ValueError('tid is required')
        if not isinstance(tid, int):
            raise TypeError(getattr(__builtin__, 'type')(tid))
        if type is not None:
            if not isinstance(type, yogento.api.models.mail.template.mail_template_type.MailTemplateType):
                raise TypeError(getattr(__builtin__, 'type')(type))

        get_mail_template_info_return_value = self._get_mail_template_info(tid=tid, type=type)

        if not isinstance(get_mail_template_info_return_value, yogento.api.models.mail.template.mail_template_info.MailTemplateInfo):
            raise TypeError(getattr(__builtin__, 'type')(get_mail_template_info_return_value))

        return get_mail_template_info_return_value

    def _get_mail_template_info(self, tid, type=None):
        raise NotImplementedError(self.__class__.__module__ + '.' + self.__class__.__name__ + '._get_mail_template_info')

    def post_mail_campaign(self, campaign, schedule_time=None, schedule_time_b=None, test_emails=None):
        if campaign is None:
            raise ValueError('campaign is required')
        if not isinstance(campaign, yogento.api.models.mail.campaign.mail_campaign.MailCampaign):
            raise TypeError(getattr(__builtin__, 'type')(campaign))
        if schedule_time is not None:
            if not isinstance(schedule_time, datetime):
                raise TypeError(getattr(__builtin__, 'type')(schedule_time))
        if schedule_time_b is not None:
            if not isinstance(schedule_time_b, datetime):
                raise TypeError(getattr(__builtin__, 'type')(schedule_time_b))
        if test_emails is not None:
            if not (isinstance(test_emails, tuple) and len(list(ifilterfalse(lambda _: isinstance(_, basestring), test_emails))) == 0):
                raise TypeError(getattr(__builtin__, 'type')(test_emails))

        post_mail_campaign_return_value = self._post_mail_campaign(campaign=campaign, schedule_time=schedule_time, schedule_time_b=schedule_time_b, test_emails=test_emails)

        if not isinstance(post_mail_campaign_return_value, yogento.api.models.mail.campaign.mail_campaign.MailCampaign):
            raise TypeError(getattr(__builtin__, 'type')(post_mail_campaign_return_value))

        return post_mail_campaign_return_value

    def _post_mail_campaign(self, campaign, schedule_time=None, schedule_time_b=None, test_emails=None):
        raise NotImplementedError(self.__class__.__module__ + '.' + self.__class__.__name__ + '._post_mail_campaign')

    def put_mail_campaign(self, campaign, write_through=None):
        if campaign is None:
            raise ValueError('campaign is required')
        if not isinstance(campaign, yogento.api.models.mail.campaign.mail_campaign.MailCampaign):
            raise TypeError(getattr(__builtin__, 'type')(campaign))
        if write_through is not None:
            if not isinstance(write_through, bool):
                raise TypeError(getattr(__builtin__, 'type')(write_through))

        put_mail_campaign_return_value = self._put_mail_campaign(campaign=campaign, write_through=write_through)

        if not isinstance(put_mail_campaign_return_value, yogento.api.models.mail.campaign.mail_campaign.MailCampaign):
            raise TypeError(getattr(__builtin__, 'type')(put_mail_campaign_return_value))

        return put_mail_campaign_return_value

    def _put_mail_campaign(self, campaign, write_through=None):
        raise NotImplementedError(self.__class__.__module__ + '.' + self.__class__.__name__ + '._put_mail_campaign')
