from thryft.protocol.json_protocol import JsonProtocol
from yochimp.models.template.template_type import TemplateType
from yogento.api.models.mail.campaign.mail_campaign import MailCampaign
from yogento.api.models.mail.campaign.mail_campaign_content import \
    MailCampaignContent
from yogento.api.models.mail.campaign.mail_campaign_stats import \
    MailCampaignStats
from yogento.api.models.mail.list.mail_list import MailList
from yogento.api.models.mail.template.mail_template import MailTemplate
from yogento.api.models.mail.template.mail_template_info import MailTemplateInfo
from yogento.api.models.mail.template.mail_template_type import MailTemplateType
from yogento.api.services.mail.mail_service import MailService
from yogento.api.services.mail.mail_service_hack import MailServiceHack
from yogento.client.services._yogento_rest_service import _YogentoRestService


class YogentoRestMailService(_YogentoRestService, MailService):
    def _delete_mail_campaign(self, cid, write_through):
        if write_through is not None:
            query = {'write_through': str(write_through).lower()}
        else:
            query = None
        return self._delete_model('/mail/campaigns/' + self.__quote_cid(cid), query=query)

    def _get_mail_campaign(self, cid):
        return self._get_model(
                   MailCampaign,
                   '/mail/campaigns/' + self.__quote_cid(cid)
               )

    def _get_mail_campaign_content(self, cid):
        return self._get_model(
                   MailCampaignContent,
                   '/mail/campaigns/' + self.__quote_cid(cid) + '/content'
               )

    def _get_mail_campaigns(self, filters=None, start=None, limit=None):
        return self._get_model_set(MailCampaign, '/mail/campaigns')

    def _get_mail_campaign_stats(self, cid):
        return self._get_model(
                   MailCampaignStats,
                   '/mail/campaigns/' + self.__quote_cid(cid) + '/stats'
               )

    def _get_mail_lists(self):
        return self._get_model_set(MailList, '/mail/lists')

    def _get_mail_templates(self, types):
        if types is not None:
            query = {'type': [str(type_.mail_chimp_template_type) for type_ in types]}
        else:
            query = None
        return self._get_model_set(MailTemplate, '/mail/templates', query=query)

    def _get_mail_template_info(self, tid, type=None):  # @ReservedAssignment
        return self._get_model(
                   MailTemplateInfo,
                   '/mail/templates/' + str(tid)
               )

    def _post_mail_campaign(self, campaign, content, schedule_time=None, schedule_time_b=None, test_emails=None):
        return \
            self._post_model(
                MailServiceHack(campaign=campaign, content=content, schedule_time=schedule_time, schedule_time_b=schedule_time_b, test_emails=test_emails),
                '/mail/campaigns/' + self.__quote_cid(campaign.id),
                out_model_class=MailCampaign
            )

    def _put_mail_campaign(self, campaign, write_through):
        if write_through is not None:
            query = {'write_through': str(write_through).lower()}
        else:
            query = None
        return \
            self._put_model(
                campaign,
                '/mail/campaigns/' + self.__quote_cid(campaign.id),
                out_model_class=MailCampaign,
                query=query
            )

    def _put_mail_campaign_content(self, cid, content, write_through):
        if write_through is not None:
            query = {'write_through': str(write_through).lower()}
        else:
            query = None
        return \
            self._put_model(
                content,
                '/mail/campaigns/' + self.__quote_cid(cid) + '/content',
                query=query
            )

    @staticmethod
    def __quote_cid(cid):
        if cid is None:
            return 'new'
        return cid
