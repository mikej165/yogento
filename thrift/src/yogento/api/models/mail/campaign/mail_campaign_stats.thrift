namespace java com.yogento.api.models.mail.campaign
namespace py yogento.api.models.mail.campaign

include "yochimp/models/campaign/campaign_stats.thrift"

struct MailCampaignStats {
    required campaign_stats.CampaignStats mail_chimp_campaign_stats;
}
