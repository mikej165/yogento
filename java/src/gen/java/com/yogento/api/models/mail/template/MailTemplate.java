package com.yogento.api.models.mail.template;

@SuppressWarnings({"serial"})
public class MailTemplate implements org.apache.thrift.TBase<MailTemplate, org.apache.thrift.TFieldIdEnum> {
    public static class Builder {
        public Builder() {
        }

        public Builder(final MailTemplate other) {
            this.mailChimpTemplate = other.getMailChimpTemplate();
            this.type = other.getType();
        }

        protected MailTemplate _build(final com.yochimp.models.template.Template mailChimpTemplate, final com.yogento.api.models.mail.template.MailTemplateType type) {
            return new MailTemplate(mailChimpTemplate, type);
        }

        public MailTemplate build() {
            return _build(mailChimpTemplate, type);
        }

        public Builder setMailChimpTemplate(final com.yochimp.models.template.Template mailChimpTemplate) {
            this.mailChimpTemplate = mailChimpTemplate;
            return this;
        }

        public Builder setType(final com.yogento.api.models.mail.template.MailTemplateType type) {
            this.type = type;
            return this;
        }

        private com.yochimp.models.template.Template mailChimpTemplate;
        private com.yogento.api.models.mail.template.MailTemplateType type;
    }

    public MailTemplate(final MailTemplate other) {
        this(other.getMailChimpTemplate(), other.getType());
    }

    public MailTemplate(final org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
        this(iprot, org.apache.thrift.protocol.TType.STRUCT);
    }

    public MailTemplate(final org.apache.thrift.protocol.TProtocol iprot, final byte readAsTType) throws org.apache.thrift.TException {
        com.yochimp.models.template.Template mailChimpTemplate = null;
        com.yogento.api.models.mail.template.MailTemplateType type = null;

        switch (readAsTType) {
            case org.apache.thrift.protocol.TType.LIST:
                org.apache.thrift.protocol.TList __list = iprot.readListBegin();
                mailChimpTemplate = new com.yochimp.models.template.Template(iprot);
                type = new com.yogento.api.models.mail.template.MailTemplateType(iprot);
                iprot.readListEnd();
                break;

            case org.apache.thrift.protocol.TType.STRUCT:
            default:
                iprot.readStructBegin();
                while (true) {
                    org.apache.thrift.protocol.TField ifield = iprot.readFieldBegin();
                    if (ifield.type == org.apache.thrift.protocol.TType.STOP) {
                        break;
                    } else                 if (ifield.name.equals("mail_chimp_template")) {
                        mailChimpTemplate = new com.yochimp.models.template.Template(iprot);
                    } else if (ifield.name.equals("type")) {
                        type = new com.yogento.api.models.mail.template.MailTemplateType(iprot);
                    }
                    iprot.readFieldEnd();
                }
                iprot.readStructEnd();
                break;
        }

        this.mailChimpTemplate = com.google.common.base.Preconditions.checkNotNull(mailChimpTemplate);
        this.type = com.google.common.base.Preconditions.checkNotNull(type);
    }

    public MailTemplate(final com.yochimp.models.template.Template mailChimpTemplate, final com.yogento.api.models.mail.template.MailTemplateType type) {
        this.mailChimpTemplate = com.google.common.base.Preconditions.checkNotNull(mailChimpTemplate);
        this.type = com.google.common.base.Preconditions.checkNotNull(type);
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException();
    }

    @Override
    public int compareTo(final MailTemplate other) {
        throw new UnsupportedOperationException();
    }

    @Override
    public org.apache.thrift.TBase<MailTemplate, org.apache.thrift.TFieldIdEnum> deepCopy() {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean equals(final Object otherObject) {
        if (otherObject == this) {
            return true;
        } else if (!(otherObject instanceof MailTemplate)) {
            return false;
        }

        final MailTemplate other = (MailTemplate)otherObject;
        return
            getMailChimpTemplate().equals(other.getMailChimpTemplate()) &&
            getType().equals(other.getType());
    }

    @Override
    public org.apache.thrift.TFieldIdEnum fieldForId(final int fieldId) {
        throw new UnsupportedOperationException();
    }

    public Object get(final String fieldName) {
        if (fieldName.equals("mail_chimp_template")) {
            return getMailChimpTemplate();
        } else if (fieldName.equals("type")) {
            return getType();
        }
        return null;
    }

    @Override
    public Object getFieldValue(final org.apache.thrift.TFieldIdEnum field) {
        throw new UnsupportedOperationException();
    }

    public final com.yochimp.models.template.Template getMailChimpTemplate() {
        return mailChimpTemplate;
    }

    public final com.yogento.api.models.mail.template.MailTemplateType getType() {
        return type;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getMailChimpTemplate().hashCode();
        hashCode = 31 * hashCode + getType().hashCode();
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
        helper.add("mail_chimp_template", getMailChimpTemplate());
        helper.add("type", getType());
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
                oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.VOID, 2));

                getMailChimpTemplate().write(oprot);

                getType().write(oprot);

                oprot.writeListEnd();
                break;

            case org.apache.thrift.protocol.TType.STRUCT:
            default:
                oprot.writeStructBegin(new org.apache.thrift.protocol.TStruct("MailTemplate"));

                oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("mail_chimp_template", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                getMailChimpTemplate().write(oprot);
                oprot.writeFieldEnd();

                oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("type", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                getType().write(oprot);
                oprot.writeFieldEnd();

                oprot.writeFieldStop();

                oprot.writeStructEnd();
                break;
        }
    }

    private final com.yochimp.models.template.Template mailChimpTemplate;
    private final com.yogento.api.models.mail.template.MailTemplateType type;
}
