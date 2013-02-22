package com.yogento.api.models.mail.template;

@SuppressWarnings({"serial"})
public class MailTemplateInfo implements org.apache.thrift.TBase<MailTemplateInfo, org.apache.thrift.TFieldIdEnum> {
    public static class Builder {
        public Builder() {
        }

        public Builder(final MailTemplateInfo other) {
            this.mailChimpTemplateInfo = other.getMailChimpTemplateInfo();
        }

        protected MailTemplateInfo _build(final com.yochimp.models.template.TemplateInfo mailChimpTemplateInfo) {
            return new MailTemplateInfo(mailChimpTemplateInfo);
        }

        public MailTemplateInfo build() {
            return _build(mailChimpTemplateInfo);
        }

        public Builder setMailChimpTemplateInfo(final com.yochimp.models.template.TemplateInfo mailChimpTemplateInfo) {
            this.mailChimpTemplateInfo = mailChimpTemplateInfo;
            return this;
        }

        private com.yochimp.models.template.TemplateInfo mailChimpTemplateInfo;
    }

    public MailTemplateInfo(final MailTemplateInfo other) {
        this(other.getMailChimpTemplateInfo());
    }

    public MailTemplateInfo(final org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
        this(iprot, org.apache.thrift.protocol.TType.STRUCT);
    }

    public MailTemplateInfo(final org.apache.thrift.protocol.TProtocol iprot, final byte readAsTType) throws org.apache.thrift.TException {
        com.yochimp.models.template.TemplateInfo mailChimpTemplateInfo = null;

        switch (readAsTType) {
            case org.apache.thrift.protocol.TType.LIST:
                iprot.readListBegin();
                mailChimpTemplateInfo = new com.yochimp.models.template.TemplateInfo(iprot);
                iprot.readListEnd();
                break;

            case org.apache.thrift.protocol.TType.STRUCT:
            default:
                iprot.readStructBegin();
                while (true) {
                    final org.apache.thrift.protocol.TField ifield = iprot.readFieldBegin();
                    if (ifield.type == org.apache.thrift.protocol.TType.STOP) {
                        break;
                    } else if (ifield.name.equals("mail_chimp_template_info")) {
                        mailChimpTemplateInfo = new com.yochimp.models.template.TemplateInfo(iprot);
                    }
                    iprot.readFieldEnd();
                }
                iprot.readStructEnd();
                break;
        }

        this.mailChimpTemplateInfo = com.google.common.base.Preconditions.checkNotNull(mailChimpTemplateInfo);
    }

    public MailTemplateInfo(final com.yochimp.models.template.TemplateInfo mailChimpTemplateInfo) {
        this.mailChimpTemplateInfo = com.google.common.base.Preconditions.checkNotNull(mailChimpTemplateInfo);
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException();
    }

    @Override
    public int compareTo(final MailTemplateInfo other) {
        throw new UnsupportedOperationException();
    }

    @Override
    public org.apache.thrift.TBase<MailTemplateInfo, org.apache.thrift.TFieldIdEnum> deepCopy() {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean equals(final Object otherObject) {
        if (otherObject == this) {
            return true;
        } else if (!(otherObject instanceof MailTemplateInfo)) {
            return false;
        }

        final MailTemplateInfo other = (MailTemplateInfo)otherObject;
        return
            getMailChimpTemplateInfo().equals(other.getMailChimpTemplateInfo());
    }

    @Override
    public org.apache.thrift.TFieldIdEnum fieldForId(final int fieldId) {
        throw new UnsupportedOperationException();
    }

    public Object get(final String fieldName) {
        if (fieldName.equals("mail_chimp_template_info")) {
            return getMailChimpTemplateInfo();
        }
        return null;
    }

    @Override
    public Object getFieldValue(final org.apache.thrift.TFieldIdEnum field) {
        throw new UnsupportedOperationException();
    }

    public final com.yochimp.models.template.TemplateInfo getMailChimpTemplateInfo() {
        return mailChimpTemplateInfo;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getMailChimpTemplateInfo().hashCode();
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
        helper.add("mail_chimp_template_info", getMailChimpTemplateInfo());
        return helper.toString();
    }

    @Override
    public void write(final org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
        write(oprot, org.apache.thrift.protocol.TType.STRUCT);
    }

    public void write(final org.apache.thrift.protocol.TProtocol oprot, final byte writeAsTType) throws org.apache.thrift.TException {
        switch (writeAsTType) {
            case org.apache.thrift.protocol.TType.VOID: {
                getMailChimpTemplateInfo().write(oprot);
                break;
            }

            case org.apache.thrift.protocol.TType.LIST:
                oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.VOID, 1));

                getMailChimpTemplateInfo().write(oprot);

                oprot.writeListEnd();
                break;

            case org.apache.thrift.protocol.TType.STRUCT:
            default:
                oprot.writeStructBegin(new org.apache.thrift.protocol.TStruct("MailTemplateInfo"));

                oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("mail_chimp_template_info", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                getMailChimpTemplateInfo().write(oprot);
                oprot.writeFieldEnd();

                oprot.writeFieldStop();

                oprot.writeStructEnd();
                break;
        }
    }

    private final com.yochimp.models.template.TemplateInfo mailChimpTemplateInfo;
}
