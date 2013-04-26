package com.yogento.api.models.mail.campaign;

@SuppressWarnings({"serial"})
public class MailCampaign implements org.apache.thrift.TBase<MailCampaign, org.apache.thrift.TFieldIdEnum> {
    public static class Builder {
        public Builder() {
        }

        public Builder(final MailCampaign other) {
            this.content = other.getContent();
            this.id = other.getId();
            this.mailChimpCampaign = other.getMailChimpCampaign();
            this.mailChimpTemplateId = other.getMailChimpTemplateId();
            this.status = other.getStatus();
        }

        protected MailCampaign _build(final com.yogento.api.models.mail.campaign.MailCampaignContent content, final String id, final com.yochimp.models.campaign.Campaign mailChimpCampaign, final String mailChimpTemplateId, final com.yogento.api.models.mail.campaign.MailCampaignStatus status) {
            return new MailCampaign(content, id, mailChimpCampaign, mailChimpTemplateId, status);
        }

        public MailCampaign build() {
            return _build(content, id, mailChimpCampaign, mailChimpTemplateId, status);
        }

        public Builder setContent(final com.yogento.api.models.mail.campaign.MailCampaignContent content) {
            this.content = content;
            return this;
        }

        public Builder setId(final String id) {
            this.id = id;
            return this;
        }

        public Builder setMailChimpCampaign(final com.yochimp.models.campaign.Campaign mailChimpCampaign) {
            this.mailChimpCampaign = mailChimpCampaign;
            return this;
        }

        public Builder setMailChimpTemplateId(final String mailChimpTemplateId) {
            this.mailChimpTemplateId = mailChimpTemplateId;
            return this;
        }

        public Builder setStatus(final com.yogento.api.models.mail.campaign.MailCampaignStatus status) {
            this.status = status;
            return this;
        }

        private com.yogento.api.models.mail.campaign.MailCampaignContent content;
        private String id;
        private com.yochimp.models.campaign.Campaign mailChimpCampaign;
        private String mailChimpTemplateId;
        private com.yogento.api.models.mail.campaign.MailCampaignStatus status;
    }

    public MailCampaign() {
        content = null;
        id = null;
        mailChimpCampaign = null;
        mailChimpTemplateId = null;
        status = null;
    }

    public MailCampaign(final MailCampaign other) {
        this(other.getContent(), other.getId(), other.getMailChimpCampaign(), other.getMailChimpTemplateId(), other.getStatus());
    }

    public MailCampaign(final org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
        this(iprot, org.apache.thrift.protocol.TType.STRUCT);
    }

    public MailCampaign(final org.apache.thrift.protocol.TProtocol iprot, final byte readAsTType) throws org.apache.thrift.TException {
        com.yogento.api.models.mail.campaign.MailCampaignContent content = null;
        String id = null;
        com.yochimp.models.campaign.Campaign mailChimpCampaign = null;
        String mailChimpTemplateId = null;
        com.yogento.api.models.mail.campaign.MailCampaignStatus status = null;

        switch (readAsTType) {
            case org.apache.thrift.protocol.TType.LIST:
                final org.apache.thrift.protocol.TList __list = iprot.readListBegin();
                if (__list.size > 0) {
                    content = new com.yogento.api.models.mail.campaign.MailCampaignContent(iprot);
                }
                if (__list.size > 1) {
                    id = iprot.readString();
                }
                if (__list.size > 2) {
                    mailChimpCampaign = new com.yochimp.models.campaign.Campaign(iprot);
                }
                if (__list.size > 3) {
                    mailChimpTemplateId = iprot.readString();
                }
                if (__list.size > 4) {
                    try {
                        status = (iprot instanceof org.thryft.core.protocol.Protocol) ? ((org.thryft.core.protocol.Protocol)iprot).readEnum(com.yogento.api.models.mail.campaign.MailCampaignStatus.class) : com.yogento.api.models.mail.campaign.MailCampaignStatus.valueOf(iprot.readString().trim().toUpperCase());
                    } catch (IllegalArgumentException e) {
                    }
                }
                iprot.readListEnd();
                break;

            case org.apache.thrift.protocol.TType.STRUCT:
            default:
                iprot.readStructBegin();
                while (true) {
                    final org.apache.thrift.protocol.TField ifield = iprot.readFieldBegin();
                    if (ifield.type == org.apache.thrift.protocol.TType.STOP) {
                        break;
                    } else if (ifield.name.equals("content")) {
                        content = new com.yogento.api.models.mail.campaign.MailCampaignContent(iprot);
                    } else if (ifield.name.equals("id")) {
                        id = iprot.readString();
                    } else if (ifield.name.equals("mail_chimp_campaign")) {
                        mailChimpCampaign = new com.yochimp.models.campaign.Campaign(iprot);
                    } else if (ifield.name.equals("mail_chimp_template_id")) {
                        mailChimpTemplateId = iprot.readString();
                    } else if (ifield.name.equals("status")) {
                        try {
                            status = (iprot instanceof org.thryft.core.protocol.Protocol) ? ((org.thryft.core.protocol.Protocol)iprot).readEnum(com.yogento.api.models.mail.campaign.MailCampaignStatus.class) : com.yogento.api.models.mail.campaign.MailCampaignStatus.valueOf(iprot.readString().trim().toUpperCase());
                        } catch (IllegalArgumentException e) {
                        }
                    }
                    iprot.readFieldEnd();
                }
                iprot.readStructEnd();
                break;
        }

        this.content = content;
        this.id = id;
        this.mailChimpCampaign = mailChimpCampaign;
        this.mailChimpTemplateId = mailChimpTemplateId;
        this.status = status;
    }

    public MailCampaign(final com.yogento.api.models.mail.campaign.MailCampaignContent content, final String id, final com.yochimp.models.campaign.Campaign mailChimpCampaign, final String mailChimpTemplateId, final com.yogento.api.models.mail.campaign.MailCampaignStatus status) {
        this.content = content;
        this.id = id;
        this.mailChimpCampaign = mailChimpCampaign;
        this.mailChimpTemplateId = mailChimpTemplateId;
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
            ((getContent() == null && other.getContent() == null) ||
            (getContent() != null && other.getContent() != null &&
            getContent().equals(other.getContent()))) &&
            ((getId() == null && other.getId() == null) ||
            (getId() != null && other.getId() != null &&
            getId().equals(other.getId()))) &&
            ((getMailChimpCampaign() == null && other.getMailChimpCampaign() == null) ||
            (getMailChimpCampaign() != null && other.getMailChimpCampaign() != null &&
            getMailChimpCampaign().equals(other.getMailChimpCampaign()))) &&
            ((getMailChimpTemplateId() == null && other.getMailChimpTemplateId() == null) ||
            (getMailChimpTemplateId() != null && other.getMailChimpTemplateId() != null &&
            getMailChimpTemplateId().equals(other.getMailChimpTemplateId()))) &&
            ((getStatus() == null && other.getStatus() == null) ||
            (getStatus() != null && other.getStatus() != null &&
            getStatus().equals(other.getStatus())));
    }

    @Override
    public org.apache.thrift.TFieldIdEnum fieldForId(final int fieldId) {
        throw new UnsupportedOperationException();
    }

    public Object get(final String fieldName) {
        if (fieldName.equals("content")) {
            return getContent();
        } else if (fieldName.equals("id")) {
            return getId();
        } else if (fieldName.equals("mail_chimp_campaign")) {
            return getMailChimpCampaign();
        } else if (fieldName.equals("mail_chimp_template_id")) {
            return getMailChimpTemplateId();
        } else if (fieldName.equals("status")) {
            return getStatus();
        }
        return null;
    }

    public final com.yogento.api.models.mail.campaign.MailCampaignContent getContent() {
        return content;
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

    public final String getMailChimpTemplateId() {
        return mailChimpTemplateId;
    }

    public final com.yogento.api.models.mail.campaign.MailCampaignStatus getStatus() {
        return status;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        if (getContent() != null) {
            hashCode = 31 * hashCode + getContent().hashCode();
        }
        if (getId() != null) {
            hashCode = 31 * hashCode + getId().hashCode();
        }
        if (getMailChimpCampaign() != null) {
            hashCode = 31 * hashCode + getMailChimpCampaign().hashCode();
        }
        if (getMailChimpTemplateId() != null) {
            hashCode = 31 * hashCode + getMailChimpTemplateId().hashCode();
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
    public void setFieldValue(final org.apache.thrift.TFieldIdEnum field, final Object value) {
        throw new UnsupportedOperationException();
    }

    @Override
    public String toString() {
        final com.google.common.base.Objects.ToStringHelper helper = com.google.common.base.Objects.toStringHelper(this);
        if (getContent() != null) {
            helper.add("content", getContent());
        }
        if (getId() != null) {
            helper.add("id", getId());
        }
        if (getMailChimpCampaign() != null) {
            helper.add("mail_chimp_campaign", getMailChimpCampaign());
        }
        if (getMailChimpTemplateId() != null) {
            helper.add("mail_chimp_template_id", getMailChimpTemplateId());
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
                oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.VOID, 5));

                if (getContent() != null) {
                    getContent().write(oprot);
                } else {
                    ((org.thryft.core.protocol.Protocol)oprot).writeNull();
                }

                if (getId() != null) {
                    oprot.writeString(getId());
                } else {
                    ((org.thryft.core.protocol.Protocol)oprot).writeNull();
                }

                if (getMailChimpCampaign() != null) {
                    getMailChimpCampaign().write(oprot);
                } else {
                    ((org.thryft.core.protocol.Protocol)oprot).writeNull();
                }

                if (getMailChimpTemplateId() != null) {
                    oprot.writeString(getMailChimpTemplateId());
                } else {
                    ((org.thryft.core.protocol.Protocol)oprot).writeNull();
                }

                if (getStatus() != null) {
                    if (oprot instanceof org.thryft.core.protocol.Protocol) { ((org.thryft.core.protocol.Protocol)oprot).writeEnum(getStatus()); } else { oprot.writeString(getStatus().toString()); }
                } else {
                    ((org.thryft.core.protocol.Protocol)oprot).writeNull();
                }

                oprot.writeListEnd();
                break;

            case org.apache.thrift.protocol.TType.STRUCT:
            default:
                oprot.writeStructBegin(new org.apache.thrift.protocol.TStruct("MailCampaign"));

                if (getContent() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("content", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                    getContent().write(oprot);
                    oprot.writeFieldEnd();
                }

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

                if (getMailChimpTemplateId() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("mail_chimp_template_id", org.apache.thrift.protocol.TType.STRING, (short)-1));
                    oprot.writeString(getMailChimpTemplateId());
                    oprot.writeFieldEnd();
                }

                if (getStatus() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("status", org.apache.thrift.protocol.TType.STRING, (short)-1));
                    if (oprot instanceof org.thryft.core.protocol.Protocol) { ((org.thryft.core.protocol.Protocol)oprot).writeEnum(getStatus()); } else { oprot.writeString(getStatus().toString()); }
                    oprot.writeFieldEnd();
                }

                oprot.writeFieldStop();

                oprot.writeStructEnd();
                break;
        }
    }

    private final com.yogento.api.models.mail.campaign.MailCampaignContent content;

    private final String id;

    private final com.yochimp.models.campaign.Campaign mailChimpCampaign;

    private final String mailChimpTemplateId;

    private final com.yogento.api.models.mail.campaign.MailCampaignStatus status;
}
