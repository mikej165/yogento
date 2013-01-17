namespace java com.yogento.api.services.mail
namespace py yogento.api.services.mail

include "yogento/api/models/mail/campaign/mail_campaign.thrift"
include "yogento/api/models/mail/campaign/mail_campaign_content.thrift"
include "yogento/api/models/mail/campaign/mail_campaign_stats.thrift"
include "yogento/api/models/mail/list/mail_list.thrift"
include "yogento/api/models/mail/template/mail_template.thrift"
include "yogento/api/models/mail/template/mail_template_info.thrift"
include "yogento/api/models/mail/template/mail_template_type.thrift"
include "yogento/api/services/mail/mail_exception.thrift"

service MailService {
    /**
        Delete a campaign.
        Never calls the mail service provider; will orphan a campaign on the
            mail service provider if the campaign has been sent.
     */
    bool
    delete_mail_campaign(
        required string cid,
        optional bool write_through
    ) throws (mail_exception.MailException e);

    /**
        Get a locally-stored campaign.
        Used as an intermediate "restore" before sending a campaign to the mail
            service provider.        
        Never calls the mail service provider.
     **/
    mail_campaign.MailCampaign
    get_mail_campaign(
        required string cid,
        optional bool include_content
    ) throws (mail_exception.MailException e);
    
    /**
        Get all locally-stored campaigns, sans content.
     */
    set<mail_campaign.MailCampaign>
    get_mail_campaigns(optional bool include_content)
    throws (mail_exception.MailException e);
    
    /**
        Get the campaign statistics kept by the mail service provider.
        Always calls the mail service provider, stores nothing locally.
     */
    mail_campaign_stats.MailCampaignStats
    get_mail_campaign_stats(
        required string cid
    ) throws (mail_exception.MailException e);

    /**
        Get the lists of subscribers kept by the mail service provider.
        Always calls the mail service provider, stores nothing locally.
     */
    set<mail_list.MailList>
    get_mail_lists()
    throws (mail_exception.MailException e);

    /**
        Get the templates kept by the mail service provider.
        Always calls the mail service provider, stores nothing locally.
     */        
    set<mail_template.MailTemplate>
    get_mail_templates(
        optional set<mail_template_type.MailTemplateType> types
    ) throws (mail_exception.MailException e);
    
    /**
        Get information about a template from the mail service provider.
        Always calls the mail service provider, stores nothing locally.
     */        
    mail_template_info.MailTemplateInfo
    get_mail_template_info(
        required i32 tid,
        optional mail_template_type.MailTemplateType type
    ) throws (mail_exception.MailException e);

    /**
        Send a mail campaign to the mail service provider.
        Always calls the mail service provider.
        Overwrites locally-stored campaign and campaign content.
        Returns an updated copy of the campaign with e.g., new IDs.
     */
    mail_campaign.MailCampaign
    post_mail_campaign(
        required mail_campaign.MailCampaign campaign,
        optional date_time.DateTime schedule_time,
        optional date_time.DateTime schedule_time_b,
        optional list<string> test_emails
    ) throws (mail_exception.MailException e);
            
    /**
        Overwrite the mail campaign.
        Used as an intermediate "save" before sending a campaign.
        Copies to the mail service provider if write_through is true.
        Returns an updated copy of the campaign with e.g., new IDs.
     */
    mail_campaign.MailCampaign
    put_mail_campaign(
        required mail_campaign.MailCampaign campaign,
        optional bool write_through
    ) throws (mail_exception.MailException e);
}
