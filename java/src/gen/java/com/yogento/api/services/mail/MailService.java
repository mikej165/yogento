package com.yogento.api.services.mail;

public interface MailService {
    public boolean deleteMailCampaign(String cid, Boolean writeThrough) throws com.yogento.api.services.mail.MailException;
    public com.yogento.api.models.mail.campaign.MailCampaign getMailCampaign(String cid, Boolean includeContent) throws com.yogento.api.services.mail.MailException;
    public com.google.common.collect.ImmutableSet<com.yogento.api.models.mail.campaign.MailCampaign> getMailCampaigns(Boolean includeContent) throws com.yogento.api.services.mail.MailException;
    public com.yogento.api.models.mail.campaign.MailCampaignStats getMailCampaignStats(String cid) throws com.yogento.api.services.mail.MailException;
    public com.google.common.collect.ImmutableSet<com.yogento.api.models.mail.list.MailList> getMailLists() throws com.yogento.api.services.mail.MailException;
    public com.google.common.collect.ImmutableSet<com.yogento.api.models.mail.template.MailTemplate> getMailTemplates(com.google.common.collect.ImmutableSet<com.yogento.api.models.mail.template.MailTemplateType> types) throws com.yogento.api.services.mail.MailException;
    public com.yogento.api.models.mail.template.MailTemplateInfo getMailTemplateInfo(int tid, com.yogento.api.models.mail.template.MailTemplateType type) throws com.yogento.api.services.mail.MailException;
    public com.yogento.api.models.mail.campaign.MailCampaign postMailCampaign(com.yogento.api.models.mail.campaign.MailCampaign campaign, org.joda.time.DateTime scheduleTime, org.joda.time.DateTime scheduleTimeB, com.google.common.collect.ImmutableList<String> testEmails) throws com.yogento.api.services.mail.MailException;
    public com.yogento.api.models.mail.campaign.MailCampaign putMailCampaign(com.yogento.api.models.mail.campaign.MailCampaign campaign, Boolean writeThrough) throws com.yogento.api.services.mail.MailException;
}
