package com.yogento.api.models.mail.campaign;

@SuppressWarnings({"serial"})
public class MailCampaignContent implements org.apache.thrift.TBase<MailCampaignContent, org.apache.thrift.TFieldIdEnum> {
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

    public MailCampaignContent(final org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
        this(iprot, org.apache.thrift.protocol.TType.STRUCT);
    }

    public MailCampaignContent(final org.apache.thrift.protocol.TProtocol iprot, final byte readAsTType) throws org.apache.thrift.TException {
        com.yochimp.models.campaign.CampaignContent mailChimpCampaignContent = null;

        switch (readAsTType) {
            case org.apache.thrift.protocol.TType.LIST:
                iprot.readListBegin();
                mailChimpCampaignContent = new com.yochimp.models.campaign.CampaignContent(iprot);
                iprot.readListEnd();
                break;

            case org.apache.thrift.protocol.TType.STRUCT:
            default:
                iprot.readStructBegin();
                while (true) {
                    final org.apache.thrift.protocol.TField ifield = iprot.readFieldBegin();
                    if (ifield.type == org.apache.thrift.protocol.TType.STOP) {
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
    public void clear() {
        throw new UnsupportedOperationException();
    }

    @Override
    public int compareTo(final MailCampaignContent other) {
        throw new UnsupportedOperationException();
    }

    @Override
    public org.apache.thrift.TBase<MailCampaignContent, org.apache.thrift.TFieldIdEnum> deepCopy() {
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

    @Override
    public org.apache.thrift.TFieldIdEnum fieldForId(final int fieldId) {
        throw new UnsupportedOperationException();
    }

    public Object get(final String fieldName) {
        if (fieldName.equals("mail_chimp_campaign_content")) {
            return getMailChimpCampaignContent();
        }
        return null;
    }

    @Override
    public Object getFieldValue(final org.apache.thrift.TFieldIdEnum field) {
        throw new UnsupportedOperationException();
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
    public boolean isSet(final org.apache.thrift.TFieldIdEnum field) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void read(final org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
        throw new UnsupportedOperationException();
    }

    @Override
    public void setFieldValue(final org.apache.thrift.TFieldIdEnum field, final Object value) {
        throw new UnsupportedOperationException();
    }

    @Override
    public String toString() {
        final com.google.common.base.Objects.ToStringHelper helper = com.google.common.base.Objects.toStringHelper(this);
        helper.add("mail_chimp_campaign_content", getMailChimpCampaignContent());
        return helper.toString();
    }

    @Override
    public void write(final org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
        write(oprot, org.apache.thrift.protocol.TType.STRUCT);
    }

    public void write(final org.apache.thrift.protocol.TProtocol oprot, final byte writeAsTType) throws org.apache.thrift.TException {
        switch (writeAsTType) {
            case org.apache.thrift.protocol.TType.VOID: {
                getMailChimpCampaignContent().write(oprot);
                break;
            }

            case org.apache.thrift.protocol.TType.LIST:
                oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.VOID, 1));

                getMailChimpCampaignContent().write(oprot);

                oprot.writeListEnd();
                break;

            case org.apache.thrift.protocol.TType.STRUCT:
            default:
                oprot.writeStructBegin(new org.apache.thrift.protocol.TStruct("MailCampaignContent"));

                oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("mail_chimp_campaign_content", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                getMailChimpCampaignContent().write(oprot);
                oprot.writeFieldEnd();

                oprot.writeFieldStop();

                oprot.writeStructEnd();
                break;
        }
    }

    private final com.yochimp.models.campaign.CampaignContent mailChimpCampaignContent;
}
