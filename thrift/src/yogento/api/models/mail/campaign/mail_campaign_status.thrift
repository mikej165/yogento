namespace java com.yogento.api.models.mail.campaign
namespace * yogento.api.models.mail.campaign

enum MailCampaignStatus {
    // Saved locally
    DRAFT,
    
    // Saved to the mail service provider
    SAVED_MSP,
    
    // Sent to the mail service provider
    SENT_MSP 
}
