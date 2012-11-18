package com.yogento.api.models.mail.campaign;

@SuppressWarnings({"serial"})
public class MailCampaign implements org.apache.thrift.TBase<MailCampaign, org.apache.thrift.TFieldIdEnum> {
    public static class Builder {
        public Builder() {
        }

        public Builder(final MailCampaign other) {
            this.id = other.getId();
            this.mailChimpCampaign = other.getMailChimpCampaign();
            this.status = other.getStatus();
        }

        protected MailCampaign _build(final String id, final com.yochimp.models.campaign.Campaign mailChimpCampaign, final com.yogento.api.models.mail.campaign.MailCampaignStatus status) {
            return new MailCampaign(id, mailChimpCampaign, status);
        }

        public MailCampaign build() {
            return _build(id, mailChimpCampaign, status);
        }

        public Builder setId(final String id) {
            this.id = id;
            return this;
        }

        public Builder setMailChimpCampaign(final com.yochimp.models.campaign.Campaign mailChimpCampaign) {
            this.mailChimpCampaign = mailChimpCampaign;
            return this;
        }

        public Builder setStatus(final com.yogento.api.models.mail.campaign.MailCampaignStatus status) {
            this.status = status;
            return this;
        }

        private String id;
        private com.yochimp.models.campaign.Campaign mailChimpCampaign;
        private com.yogento.api.models.mail.campaign.MailCampaignStatus status;
    }

    public MailCampaign() {
        id = null;
        mailChimpCampaign = null;
        status = null;
    }

    public MailCampaign(final MailCampaign other) {
        this(other.getId(), other.getMailChimpCampaign(), other.getStatus());
    }

    public MailCampaign(final org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
        this(iprot, org.apache.thrift.protocol.TType.STRUCT);
    }

    public MailCampaign(final org.apache.thrift.protocol.TProtocol iprot, final byte readAsTType) throws org.apache.thrift.TException {
        String id = null;
        com.yochimp.models.campaign.Campaign mailChimpCampaign = null;
        com.yogento.api.models.mail.campaign.MailCampaignStatus status = null;

        switch (readAsTType) {
            case org.apache.thrift.protocol.TType.LIST:
                iprot.readListBegin();
                id = iprot.readString();
                mailChimpCampaign = new com.yochimp.models.campaign.Campaign(iprot);
                try {
                    status = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readEnum(com.yogento.api.models.mail.campaign.MailCampaignStatus.class) : com.yogento.api.models.mail.campaign.MailCampaignStatus.valueOf(iprot.readString().trim().toUpperCase());
                } catch (IllegalArgumentException e) {
                }
                iprot.readListEnd();
                break;

            case org.apache.thrift.protocol.TType.STRUCT:
            default:
                iprot.readStructBegin();
                while (true) {
                    org.apache.thrift.protocol.TField ifield = iprot.readFieldBegin();
                    if (ifield.type == org.apache.thrift.protocol.TType.STOP) {
                        break;
                    } else                 if (ifield.name.equals("id")) {
                        id = iprot.readString();
                    } else if (ifield.name.equals("mail_chimp_campaign")) {
                        mailChimpCampaign = new com.yochimp.models.campaign.Campaign(iprot);
                    } else if (ifield.name.equals("status")) {
                        try {
                            status = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readEnum(com.yogento.api.models.mail.campaign.MailCampaignStatus.class) : com.yogento.api.models.mail.campaign.MailCampaignStatus.valueOf(iprot.readString().trim().toUpperCase());
                        } catch (IllegalArgumentException e) {
                        }
                    }
                    iprot.readFieldEnd();
                }
                iprot.readStructEnd();
                break;
        }

        this.id = id;
        this.mailChimpCampaign = mailChimpCampaign;
        this.status = status;
    }

    public MailCampaign(final String id, final com.yochimp.models.campaign.Campaign mailChimpCampaign, final com.yogento.api.models.mail.campaign.MailCampaignStatus status) {
        this.id = id;
        this.mailChimpCampaign = mailChimpCampaign;
        this.status = status;
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException();
    }

    @Override
    public int compareTo(final MailCampaign other) {
        throw new UnsupportedOperationException();
    }

    @Override
    public org.apache.thrift.TBase<MailCampaign, org.apache.thrift.TFieldIdEnum> deepCopy() {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean equals(final Object otherObject) {
        if (otherObject == this) {
            return true;
        } else if (!(otherObject instanceof MailCampaign)) {
            return false;
        }

        final MailCampaign other = (MailCampaign)otherObject;
        return
            ((getId() == null && other.getId() == null) ||
            (getId() != null && other.getId() != null &&
            getId().equals(other.getId()))) &&
            ((getMailChimpCampaign() == null && other.getMailChimpCampaign() == null) ||
            (getMailChimpCampaign() != null && other.getMailChimpCampaign() != null &&
            getMailChimpCampaign().equals(other.getMailChimpCampaign()))) &&
            ((getStatus() == null && other.getStatus() == null) ||
            (getStatus() != null && other.getStatus() != null &&
            getStatus().equals(other.getStatus())));
    }

    @Override
    public org.apache.thrift.TFieldIdEnum fieldForId(final int fieldId) {
        throw new UnsupportedOperationException();
    }

    public Object get(final String fieldName) {
        if (fieldName.equals("id")) {
            return getId();
        } else if (fieldName.equals("mail_chimp_campaign")) {
            return getMailChimpCampaign();
        } else if (fieldName.equals("status")) {
            return getStatus();
        }
        return null;
    }

    @Override
    public Object getFieldValue(final org.apache.thrift.TFieldIdEnum field) {
        throw new UnsupportedOperationException();
    }

    public final String getId() {
        return id;
    }

    public final com.yochimp.models.campaign.Campaign getMailChimpCampaign() {
        return mailChimpCampaign;
    }

    public final com.yogento.api.models.mail.campaign.MailCampaignStatus getStatus() {
        return status;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        if (getId() != null) {
            hashCode = 31 * hashCode + getId().hashCode();
        }
        if (getMailChimpCampaign() != null) {
            hashCode = 31 * hashCode + getMailChimpCampaign().hashCode();
        }
        if (getStatus() != null) {
            hashCode = 31 * hashCode + getStatus().ordinal();
        }
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
        if (getId() != null) {
            helper.add("id", getId());
        }
        if (getMailChimpCampaign() != null) {
            helper.add("mail_chimp_campaign", getMailChimpCampaign());
        }
        if (getStatus() != null) {
            helper.add("status", getStatus());
        }
        return helper.toString();
    }

    @Override
    public void write(final org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
        write(oprot, org.apache.thrift.protocol.TType.STRUCT);
    }

    public void write(final org.apache.thrift.protocol.TProtocol oprot, final byte writeAsTType) throws org.apache.thrift.TException {
        switch (writeAsTType) {
            case org.apache.thrift.protocol.TType.VOID:
            case org.apache.thrift.protocol.TType.LIST:
                oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.VOID, 3));

                if (getId() != null) {
                    oprot.writeString(getId());
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getMailChimpCampaign() != null) {
                    getMailChimpCampaign().write(oprot);
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getStatus() != null) {
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeEnum(getStatus()); } else { oprot.writeString(getStatus().toString()); }
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                oprot.writeListEnd();
                break;

            case org.apache.thrift.protocol.TType.STRUCT:
            default:
                oprot.writeStructBegin(new org.apache.thrift.protocol.TStruct("MailCampaign"));

                if (getId() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("id", org.apache.thrift.protocol.TType.STRING, (short)-1));
                    oprot.writeString(getId());
                    oprot.writeFieldEnd();
                }

                if (getMailChimpCampaign() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("mail_chimp_campaign", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                    getMailChimpCampaign().write(oprot);
                    oprot.writeFieldEnd();
                }

                if (getStatus() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("status", org.apache.thrift.protocol.TType.STRING, (short)-1));
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeEnum(getStatus()); } else { oprot.writeString(getStatus().toString()); }
                    oprot.writeFieldEnd();
                }

                oprot.writeFieldStop();

                oprot.writeStructEnd();
                break;
        }
    }

    private final String id;
    private final com.yochimp.models.campaign.Campaign mailChimpCampaign;
    private final com.yogento.api.models.mail.campaign.MailCampaignStatus status;
}
