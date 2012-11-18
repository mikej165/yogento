namespace java com.yogento.api.models.mail.campaign
namespace py yogento.api.models.mail.campaign

include "yochimp/models/campaign/campaign_content.thrift"

struct MailCampaignContent {
    required campaign_content.CampaignContent mail_chimp_campaign_content;
}
