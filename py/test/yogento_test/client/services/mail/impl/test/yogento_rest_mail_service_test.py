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
from yogento.client.services.mail.impl.yogento_rest_mail_service import \
    YogentoRestMailService
from yogento_test.client.services.test._yogento_rest_service_test import \
    _YogentoRestServiceTest
import unittest
import yochimp.models.campaign


class YogentoRestMailServiceTest(unittest.TestCase, _YogentoRestServiceTest):
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

    def setUp(self):
        self.__mail_service = \
            YogentoRestMailService(
                "http://%s%s" % (self.API_NETINFO, self.API_PATH),
                headers={'Cookie': 'JSESSIONID=580D4C2BC4AF3452D84EF698C39331E7; rememberMe=uWAQCw/giZ0B9bSmvb5gfw/fbr/Oa0BMxw9K98CGM1FKbguF6BFkip1bU1ctwqNtxjD/S2K6N6lJNMLRyddlMAI+2viQa4DEV0ndCkILR0U2lTPEtcWQBW+ZcMZbuyDGNVinXDXcIurkCy88uKU0VDydRmnkKAWZm/OF0zdkbT0qJNjnp3JJ6us9s+SvvFGtiHwnNXDBBufjbjszVzy+duZg2CHnztZre8Ka6OES9AXwRI1JdqjOWU7mZdBAC8rtA+0izEf8yKdtNJAA/itwToY3HPz6XBjye0w6yfZaj972rjhsdYYt+6lR8X4dFUxNvH/mEdJZrvExWPiMfOi35LXifxASVaqHc/sXv9B1EFaj10B2d2mTTKtuMMy2WrtOgiKUQboaheWaWB6dBHsfFlzoZS/CSYzwWUEGahFIjRyOGfN7csBbvlUIAvMAOwHEOOozXHgMxt/QOjRVQkUAzjBheojKzK7J9n+KLuD3uHKW+XfKRrKYa7eNxTQoesx/ArTig0tVCZwTui4naE7urQ=='}
            )
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
        for templates in templates.itervalues():
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
