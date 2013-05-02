package com.yogento.api.models.mail.campaign;

@SuppressWarnings({"serial"})
public class MailCampaignStats implements org.thryft.TBase<MailCampaignStats> {
    public static class Builder {
        public Builder() {
        }

        public Builder(final MailCampaignStats other) {
            this.mailChimpCampaignStats = other.getMailChimpCampaignStats();
        }

        protected MailCampaignStats _build(final com.yochimp.models.campaign.CampaignStats mailChimpCampaignStats) {
            return new MailCampaignStats(mailChimpCampaignStats);
        }

        public MailCampaignStats build() {
            return _build(mailChimpCampaignStats);
        }

        public Builder setMailChimpCampaignStats(final com.yochimp.models.campaign.CampaignStats mailChimpCampaignStats) {
            this.mailChimpCampaignStats = mailChimpCampaignStats;
            return this;
        }

        private com.yochimp.models.campaign.CampaignStats mailChimpCampaignStats;
    }

    public MailCampaignStats(final MailCampaignStats other) {
        this(other.getMailChimpCampaignStats());
    }

    public MailCampaignStats(final org.thryft.protocol.TProtocol iprot) throws java.io.IOException {
        this(iprot, org.thryft.protocol.TType.STRUCT);
    }

    public MailCampaignStats(final org.thryft.protocol.TProtocol iprot, final byte readAsTType) throws java.io.IOException {
        com.yochimp.models.campaign.CampaignStats mailChimpCampaignStats = null;

        switch (readAsTType) {
            case org.thryft.protocol.TType.LIST:
                iprot.readListBegin();
                mailChimpCampaignStats = new com.yochimp.models.campaign.CampaignStats(iprot);
                iprot.readListEnd();
                break;

            case org.thryft.protocol.TType.STRUCT:
            default:
                iprot.readStructBegin();
                while (true) {
                    final org.thryft.protocol.TField ifield = iprot.readFieldBegin();
                    if (ifield.type == org.thryft.protocol.TType.STOP) {
                        break;
                    } else if (ifield.name.equals("mail_chimp_campaign_stats")) {
                        mailChimpCampaignStats = new com.yochimp.models.campaign.CampaignStats(iprot);
                    }
                    iprot.readFieldEnd();
                }
                iprot.readStructEnd();
                break;
        }

        this.mailChimpCampaignStats = com.google.common.base.Preconditions.checkNotNull(mailChimpCampaignStats, "com.yogento.api.models.mail.campaign.MailCampaignStats: missing mailChimpCampaignStats");
    }

    public MailCampaignStats(final com.yochimp.models.campaign.CampaignStats mailChimpCampaignStats) {
        this.mailChimpCampaignStats = com.google.common.base.Preconditions.checkNotNull(mailChimpCampaignStats, "com.yogento.api.models.mail.campaign.MailCampaignStats: missing mailChimpCampaignStats");
    }

    @Override
    public int compareTo(final MailCampaignStats other) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean equals(final Object otherObject) {
        if (otherObject == this) {
            return true;
        } else if (!(otherObject instanceof MailCampaignStats)) {
            return false;
        }

        final MailCampaignStats other = (MailCampaignStats)otherObject;
        return
            getMailChimpCampaignStats().equals(other.getMailChimpCampaignStats());
    }

    public Object get(final String fieldName) {
        if (fieldName.equals("mail_chimp_campaign_stats")) {
            return getMailChimpCampaignStats();
        }
        throw new IllegalArgumentException(fieldName);
    }

    public final com.yochimp.models.campaign.CampaignStats getMailChimpCampaignStats() {
        return mailChimpCampaignStats;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getMailChimpCampaignStats().hashCode();
        return hashCode;
    }

    @Override
    public String toString() {
        final com.google.common.base.Objects.ToStringHelper helper = com.google.common.base.Objects.toStringHelper(this);
        helper.add("mail_chimp_campaign_stats", getMailChimpCampaignStats());
        return helper.toString();
    }

    @Override
    public void write(final org.thryft.protocol.TProtocol oprot) throws java.io.IOException {
        write(oprot, org.thryft.protocol.TType.STRUCT);
    }

    public void write(final org.thryft.protocol.TProtocol oprot, final byte writeAsTType) throws java.io.IOException {
        switch (writeAsTType) {
            case org.thryft.protocol.TType.VOID: {
                getMailChimpCampaignStats().write(oprot);
                break;
            }

            case org.thryft.protocol.TType.LIST:
                oprot.writeListBegin(new org.thryft.protocol.TList(org.thryft.protocol.TType.VOID, 1));

                getMailChimpCampaignStats().write(oprot);

                oprot.writeListEnd();
                break;

            case org.thryft.protocol.TType.STRUCT:
            default:
                oprot.writeStructBegin(new org.thryft.protocol.TStruct("MailCampaignStats"));

                oprot.writeFieldBegin(new org.thryft.protocol.TField("mail_chimp_campaign_stats", org.thryft.protocol.TType.STRUCT, (short)-1));
                getMailChimpCampaignStats().write(oprot);
                oprot.writeFieldEnd();

                oprot.writeFieldStop();

                oprot.writeStructEnd();
                break;
        }
    }

    private final com.yochimp.models.campaign.CampaignStats mailChimpCampaignStats;
}
