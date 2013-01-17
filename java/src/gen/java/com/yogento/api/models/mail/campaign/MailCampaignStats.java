package com.yogento.api.models.mail.campaign;

@SuppressWarnings({"serial"})
public class MailCampaignStats implements org.apache.thrift.TBase<MailCampaignStats, org.apache.thrift.TFieldIdEnum> {
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

    public MailCampaignStats(final org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
        this(iprot, org.apache.thrift.protocol.TType.STRUCT);
    }

    public MailCampaignStats(final org.apache.thrift.protocol.TProtocol iprot, final byte readAsTType) throws org.apache.thrift.TException {
        com.yochimp.models.campaign.CampaignStats mailChimpCampaignStats = null;

        switch (readAsTType) {
            case org.apache.thrift.protocol.TType.LIST:
                org.apache.thrift.protocol.TList __list = iprot.readListBegin();
                mailChimpCampaignStats = new com.yochimp.models.campaign.CampaignStats(iprot);
                iprot.readListEnd();
                break;

            case org.apache.thrift.protocol.TType.STRUCT:
            default:
                iprot.readStructBegin();
                while (true) {
                    org.apache.thrift.protocol.TField ifield = iprot.readFieldBegin();
                    if (ifield.type == org.apache.thrift.protocol.TType.STOP) {
                        break;
                    } else                 if (ifield.name.equals("mail_chimp_campaign_stats")) {
                        mailChimpCampaignStats = new com.yochimp.models.campaign.CampaignStats(iprot);
                    }
                    iprot.readFieldEnd();
                }
                iprot.readStructEnd();
                break;
        }

        this.mailChimpCampaignStats = com.google.common.base.Preconditions.checkNotNull(mailChimpCampaignStats);
    }

    public MailCampaignStats(final com.yochimp.models.campaign.CampaignStats mailChimpCampaignStats) {
        this.mailChimpCampaignStats = com.google.common.base.Preconditions.checkNotNull(mailChimpCampaignStats);
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException();
    }

    @Override
    public int compareTo(final MailCampaignStats other) {
        throw new UnsupportedOperationException();
    }

    @Override
    public org.apache.thrift.TBase<MailCampaignStats, org.apache.thrift.TFieldIdEnum> deepCopy() {
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

    @Override
    public org.apache.thrift.TFieldIdEnum fieldForId(final int fieldId) {
        throw new UnsupportedOperationException();
    }

    public Object get(final String fieldName) {
        if (fieldName.equals("mail_chimp_campaign_stats")) {
            return getMailChimpCampaignStats();
        }
        return null;
    }

    @Override
    public Object getFieldValue(final org.apache.thrift.TFieldIdEnum field) {
        throw new UnsupportedOperationException();
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
    public boolean isSet(final org.apache.thrift.TFieldIdEnum field) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void read(final org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
        throw new UnsupportedOperationException();
    }

    @Override
    public void setFieldValue(final org.apache.thrift.TFieldIdEnum field, Object value) {
        throw new UnsupportedOperationException();
    }

    @Override
    public String toString() {
        final com.google.common.base.Objects.ToStringHelper helper = com.google.common.base.Objects.toStringHelper(this);
        helper.add("mail_chimp_campaign_stats", getMailChimpCampaignStats());
        return helper.toString();
    }

    @Override
    public void write(final org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
        write(oprot, org.apache.thrift.protocol.TType.STRUCT);
    }

    public void write(final org.apache.thrift.protocol.TProtocol oprot, final byte writeAsTType) throws org.apache.thrift.TException {
        switch (writeAsTType) {
            case org.apache.thrift.protocol.TType.VOID: {
                getMailChimpCampaignStats().write(oprot);
                break;
            }

            case org.apache.thrift.protocol.TType.LIST:
                oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.VOID, 1));

                getMailChimpCampaignStats().write(oprot);

                oprot.writeListEnd();
                break;

            case org.apache.thrift.protocol.TType.STRUCT:
            default:
                oprot.writeStructBegin(new org.apache.thrift.protocol.TStruct("MailCampaignStats"));

                oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("mail_chimp_campaign_stats", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                getMailChimpCampaignStats().write(oprot);
                oprot.writeFieldEnd();

                oprot.writeFieldStop();

                oprot.writeStructEnd();
                break;
        }
    }

    private final com.yochimp.models.campaign.CampaignStats mailChimpCampaignStats;
}
