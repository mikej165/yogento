package com.yogento.api.models.mail.template;

@SuppressWarnings({"serial"})
public class MailTemplateType implements org.apache.thrift.TBase<MailTemplateType, org.apache.thrift.TFieldIdEnum> {
    public static class Builder {
        public Builder() {
        }

        public Builder(final MailTemplateType other) {
            this.mailChimpTemplateType = other.getMailChimpTemplateType();
        }

        protected MailTemplateType _build(final com.yochimp.models.template.TemplateType mailChimpTemplateType) {
            return new MailTemplateType(mailChimpTemplateType);
        }

        public MailTemplateType build() {
            return _build(mailChimpTemplateType);
        }

        public Builder setMailChimpTemplateType(final com.yochimp.models.template.TemplateType mailChimpTemplateType) {
            this.mailChimpTemplateType = mailChimpTemplateType;
            return this;
        }

        private com.yochimp.models.template.TemplateType mailChimpTemplateType;
    }

    public MailTemplateType(final MailTemplateType other) {
        this(other.getMailChimpTemplateType());
    }

    public MailTemplateType(final org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
        this(iprot, org.apache.thrift.protocol.TType.STRUCT);
    }

    public MailTemplateType(final org.apache.thrift.protocol.TProtocol iprot, final byte readAsTType) throws org.apache.thrift.TException {
        com.yochimp.models.template.TemplateType mailChimpTemplateType = null;

        switch (readAsTType) {
            case org.apache.thrift.protocol.TType.LIST:
                org.apache.thrift.protocol.TList __list = iprot.readListBegin();
                mailChimpTemplateType = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readEnum(com.yochimp.models.template.TemplateType.class) : com.yochimp.models.template.TemplateType.valueOf(iprot.readString().trim().toUpperCase());
                iprot.readListEnd();
                break;

            case org.apache.thrift.protocol.TType.STRUCT:
            default:
                iprot.readStructBegin();
                while (true) {
                    org.apache.thrift.protocol.TField ifield = iprot.readFieldBegin();
                    if (ifield.type == org.apache.thrift.protocol.TType.STOP) {
                        break;
                    } else                 if (ifield.name.equals("mail_chimp_template_type")) {
                        mailChimpTemplateType = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readEnum(com.yochimp.models.template.TemplateType.class) : com.yochimp.models.template.TemplateType.valueOf(iprot.readString().trim().toUpperCase());
                    }
                    iprot.readFieldEnd();
                }
                iprot.readStructEnd();
                break;
        }

        this.mailChimpTemplateType = com.google.common.base.Preconditions.checkNotNull(mailChimpTemplateType);
    }

    public MailTemplateType(final com.yochimp.models.template.TemplateType mailChimpTemplateType) {
        this.mailChimpTemplateType = com.google.common.base.Preconditions.checkNotNull(mailChimpTemplateType);
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException();
    }

    @Override
    public int compareTo(final MailTemplateType other) {
        throw new UnsupportedOperationException();
    }

    @Override
    public org.apache.thrift.TBase<MailTemplateType, org.apache.thrift.TFieldIdEnum> deepCopy() {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean equals(final Object otherObject) {
        if (otherObject == this) {
            return true;
        } else if (!(otherObject instanceof MailTemplateType)) {
            return false;
        }

        final MailTemplateType other = (MailTemplateType)otherObject;
        return
            getMailChimpTemplateType().equals(other.getMailChimpTemplateType());
    }

    @Override
    public org.apache.thrift.TFieldIdEnum fieldForId(final int fieldId) {
        throw new UnsupportedOperationException();
    }

    public Object get(final String fieldName) {
        if (fieldName.equals("mail_chimp_template_type")) {
            return getMailChimpTemplateType();
        }
        return null;
    }

    @Override
    public Object getFieldValue(final org.apache.thrift.TFieldIdEnum field) {
        throw new UnsupportedOperationException();
    }

    public final com.yochimp.models.template.TemplateType getMailChimpTemplateType() {
        return mailChimpTemplateType;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getMailChimpTemplateType().ordinal();
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
        helper.add("mail_chimp_template_type", getMailChimpTemplateType());
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
                oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.VOID, 1));

                if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeEnum(getMailChimpTemplateType()); } else { oprot.writeString(getMailChimpTemplateType().toString()); }

                oprot.writeListEnd();
                break;

            case org.apache.thrift.protocol.TType.STRUCT:
            default:
                oprot.writeStructBegin(new org.apache.thrift.protocol.TStruct("MailTemplateType"));

                oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("mail_chimp_template_type", org.apache.thrift.protocol.TType.STRING, (short)-1));
                if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeEnum(getMailChimpTemplateType()); } else { oprot.writeString(getMailChimpTemplateType().toString()); }
                oprot.writeFieldEnd();

                oprot.writeFieldStop();

                oprot.writeStructEnd();
                break;
        }
    }

    private final com.yochimp.models.template.TemplateType mailChimpTemplateType;
}
