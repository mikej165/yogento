namespace java com.yogento.api.services.mail
namespace py yogento.api.services.mail

include "yogento/api/models/mail/campaign/mail_campaign.thrift"
include "yogento/api/models/mail/campaign/mail_campaign_content.thrift"

struct MailServiceHack {
    required mail_campaign.MailCampaign campaign;
    required mail_campaign_content.MailCampaignContent content;
    optional date_time.DateTime schedule_time;
    optional date_time.DateTime schedule_time_b;
    optional list<string> test_emails;
}
