namespace java com.yogento.api.models.mail.campaign
namespace py yogento.api.models.mail.campaign

include "yogento/api/models/mail/campaign/mail_campaign_status.thrift"
include "yochimp/models/campaign/campaign.thrift"

struct MailCampaign {
    optional string id;
    optional campaign.Campaign mail_chimp_campaign;
    optional mail_campaign_status.MailCampaignStatus status;
}
