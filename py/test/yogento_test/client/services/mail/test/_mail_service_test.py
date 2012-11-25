from datetime import datetime
from hamcrest.core import assert_that
from hamcrest.core.core.isequal import equal_to
from hamcrest.library.number.ordering_comparison import greater_than
from hamcrest.library.object.haslength import has_length
from yochimp.models.campaign import campaign
from yochimp.models.campaign.campaign_content_type import CampaignContentType
from yochimp.models.campaign.campaign_type import CampaignType
from yochimp.models.template.template_type import TemplateType
from yogento.api.models.mail.campaign.mail_campaign import MailCampaign
from yogento.api.models.mail.campaign.mail_campaign_content import \
    MailCampaignContent
from yogento.api.models.mail.template.mail_template_type import MailTemplateType
from yogento.api.services.mail.mail_exception import MailException
import unittest
import yochimp.models.campaign


class _MailServiceTest(unittest.TestCase):
    def __put_mail_campaign_content(self, campaign, write_through):
        content = MailCampaignContent(yochimp.models.campaign.campaign_content.CampaignContent(html='test', text='test'))
        self.__mail_service.put_mail_campaign_content(campaign.id, content)
        return content

    def __put_mail_campaigns(self, write_through):
        campaigns = []
        for campaign_i in xrange(2):
            campaign = \
                MailCampaign(
                    mail_chimp_campaign=yochimp.models.campaign.campaign.Campaign(
                        content_type=CampaignContentType.HTML,
                        create_time=datetime.utcnow().replace(microsecond=0),
                        from_email='beta@yogento.com',
                        from_name='Test user',
                        list_id=self.__mail_list.mail_chimp_list.id,
                        subject='Test subject',
                        title='Test campaign ' + str(campaign_i),
                        to_name='Test mailing list',
                        type=CampaignType.REGULAR
                    )
                )
            campaign = self.__mail_service.put_mail_campaign(campaign, write_through=write_through)
            campaigns.append(campaign)
        return frozenset(campaigns)

    def _setUp(self, mail_service):
        self.__mail_service = mail_service
        self.__mail_list = tuple(self.__mail_service.get_mail_lists())[0]

    def tearDown(self):
        for campaign in self.__mail_service.get_mail_campaigns():
            self.__mail_service.delete_mail_campaign(campaign.id)

    def test_delete_mail_campaign(self):
        for campaign in self.__put_mail_campaigns(write_through=False):
            self.__mail_service.delete_mail_campaign(campaign.id)

    def test_get_mail_campaign(self):
        expected_campaign = tuple(self.__put_mail_campaigns(write_through=False))[0]
        campaign = self.__mail_service.get_mail_campaign(expected_campaign.id)
        assert_that(campaign, equal_to(expected_campaign))

        try:
            campaign = self.__mail_service.get_mail_campaign(expected_campaign.id + 'x')
            self.fail()
        except MailException:
            pass

    def test_get_mail_campaign_content(self):
        for campaign in self.__put_mail_campaigns(write_through=False):
            expected_content = self.__put_mail_campaign_content(campaign, write_through=False)
            content = self.__mail_service.get_mail_campaign_content(campaign.id)
            assert_that(content, equal_to(expected_content))

    def test_get_mail_campaigns(self):
        expected_campaigns = self.__put_mail_campaigns(write_through=False)
        campaigns = self.__mail_service.get_mail_campaigns()
        for expected_campaign in expected_campaigns:
            assert expected_campaign in campaigns, expected_campaign

#    def test_get_mail_campaign_stats(self):
#        for campaign in self.__put_mail_campaigns(write_through=False):
#            self.__mail_service.get_mail_campaign_stats(campaign.id)

    def test_get_mail_lists(self):
        lists = self.__mail_service.get_mail_lists()
        assert_that(lists, has_length(greater_than(0)))

    def test_get_mail_templates(self):
        templates = self.__mail_service.get_mail_templates()
        assert_that(templates, has_length(greater_than(0)))

        templates = \
            self.__mail_service.get_mail_templates(
                types=frozenset((MailTemplateType(TemplateType.BASE),))
            )
        assert_that(templates, has_length(greater_than(0)))

    def test_get_mail_template_info(self):
        templates = self.__mail_service.get_mail_templates()
        assert_that(templates, has_length(greater_than(0)))
        for template in templates:
            self.__mail_service.get_mail_template_info(template.mail_chimp_template.id)

    def test_post_mail_campaign(self):
        for campaign in self.__put_mail_campaigns(write_through=False):
            content = self.__put_mail_campaign_content(campaign, write_through=False)
            self.__mail_service.post_mail_campaign(
                campaign=campaign,
                content=content,
                test_emails=('mailchimp@minorgordon.net',)
            )

    def test_put_mail_campaign_local(self):
        self.__put_mail_campaigns(write_through=False)

    def test_put_mail_campaign_remote(self):
        self.__put_mail_campaigns(write_through=True)

    def test_put_mail_campaign_content_local(self):
        for campaign in self.__put_mail_campaigns(write_through=False):
            self.__put_mail_campaign_content(campaign, write_through=False)

    def test_put_mail_campaign_content_remote(self):
        for campaign in self.__put_mail_campaigns(write_through=True):
            self.__put_mail_campaign_content(campaign, write_through=True)
