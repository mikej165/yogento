package com.yogento.api.models.mail.campaign;

@SuppressWarnings({"serial"})
public class MailCampaignContent implements org.thryft.TBase<MailCampaignContent> {
    public static class Builder {
        public Builder() {
        }

        public Builder(final MailCampaignContent other) {
            this.mailChimpCampaignContent = other.getMailChimpCampaignContent();
        }

        protected MailCampaignContent _build(final com.yochimp.models.campaign.CampaignContent mailChimpCampaignContent) {
            return new MailCampaignContent(mailChimpCampaignContent);
        }

        public MailCampaignContent build() {
            return _build(mailChimpCampaignContent);
        }

        public Builder setMailChimpCampaignContent(final com.yochimp.models.campaign.CampaignContent mailChimpCampaignContent) {
            this.mailChimpCampaignContent = mailChimpCampaignContent;
            return this;
        }

        private com.yochimp.models.campaign.CampaignContent mailChimpCampaignContent;
    }

    public MailCampaignContent(final MailCampaignContent other) {
        this(other.getMailChimpCampaignContent());
    }

    public MailCampaignContent(final org.thryft.protocol.TProtocol iprot) throws java.io.IOException {
        this(iprot, org.thryft.protocol.TType.STRUCT);
    }

    public MailCampaignContent(final org.thryft.protocol.TProtocol iprot, final byte readAsTType) throws java.io.IOException {
        com.yochimp.models.campaign.CampaignContent mailChimpCampaignContent = null;

        switch (readAsTType) {
            case org.thryft.protocol.TType.LIST:
                iprot.readListBegin();
                mailChimpCampaignContent = new com.yochimp.models.campaign.CampaignContent(iprot);
                iprot.readListEnd();
                break;

            case org.thryft.protocol.TType.STRUCT:
            default:
                iprot.readStructBegin();
                while (true) {
                    final org.thryft.protocol.TField ifield = iprot.readFieldBegin();
                    if (ifield.type == org.thryft.protocol.TType.STOP) {
                        break;
                    } else if (ifield.name.equals("mail_chimp_campaign_content")) {
                        mailChimpCampaignContent = new com.yochimp.models.campaign.CampaignContent(iprot);
                    }
                    iprot.readFieldEnd();
                }
                iprot.readStructEnd();
                break;
        }

        this.mailChimpCampaignContent = com.google.common.base.Preconditions.checkNotNull(mailChimpCampaignContent, "com.yogento.api.models.mail.campaign.MailCampaignContent: missing mailChimpCampaignContent");
    }

    public MailCampaignContent(final com.yochimp.models.campaign.CampaignContent mailChimpCampaignContent) {
        this.mailChimpCampaignContent = com.google.common.base.Preconditions.checkNotNull(mailChimpCampaignContent, "com.yogento.api.models.mail.campaign.MailCampaignContent: missing mailChimpCampaignContent");
    }

    @Override
    public int compareTo(final MailCampaignContent other) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean equals(final Object otherObject) {
        if (otherObject == this) {
            return true;
        } else if (!(otherObject instanceof MailCampaignContent)) {
            return false;
        }

        final MailCampaignContent other = (MailCampaignContent)otherObject;
        return
            getMailChimpCampaignContent().equals(other.getMailChimpCampaignContent());
    }

    public Object get(final String fieldName) {
        if (fieldName.equals("mail_chimp_campaign_content")) {
            return getMailChimpCampaignContent();
        }
        throw new IllegalArgumentException(fieldName);
    }

    public final com.yochimp.models.campaign.CampaignContent getMailChimpCampaignContent() {
        return mailChimpCampaignContent;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getMailChimpCampaignContent().hashCode();
        return hashCode;
    }

    @Override
    public String toString() {
        final com.google.common.base.Objects.ToStringHelper helper = com.google.common.base.Objects.toStringHelper(this);
        helper.add("mail_chimp_campaign_content", getMailChimpCampaignContent());
        return helper.toString();
    }

    @Override
    public void write(final org.thryft.protocol.TProtocol oprot) throws java.io.IOException {
        write(oprot, org.thryft.protocol.TType.STRUCT);
    }

    public void write(final org.thryft.protocol.TProtocol oprot, final byte writeAsTType) throws java.io.IOException {
        switch (writeAsTType) {
            case org.thryft.protocol.TType.VOID: {
                getMailChimpCampaignContent().write(oprot);
                break;
            }

            case org.thryft.protocol.TType.LIST:
                oprot.writeListBegin(new org.thryft.protocol.TList(org.thryft.protocol.TType.VOID, 1));

                getMailChimpCampaignContent().write(oprot);

                oprot.writeListEnd();
                break;

            case org.thryft.protocol.TType.STRUCT:
            default:
                oprot.writeStructBegin(new org.thryft.protocol.TStruct("MailCampaignContent"));

                oprot.writeFieldBegin(new org.thryft.protocol.TField("mail_chimp_campaign_content", org.thryft.protocol.TType.STRUCT, (short)-1));
                getMailChimpCampaignContent().write(oprot);
                oprot.writeFieldEnd();

                oprot.writeFieldStop();

                oprot.writeStructEnd();
                break;
        }
    }

    private final com.yochimp.models.campaign.CampaignContent mailChimpCampaignContent;
}
