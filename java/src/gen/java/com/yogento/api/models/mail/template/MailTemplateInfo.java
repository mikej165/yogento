package com.yogento.api.models.mail.template;

@SuppressWarnings({"serial"})
public class MailTemplateInfo implements org.thryft.TBase<MailTemplateInfo> {
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

    public MailTemplateInfo(final org.thryft.protocol.TProtocol iprot) throws java.io.IOException {
        this(iprot, org.thryft.protocol.TType.STRUCT);
    }

    public MailTemplateInfo(final org.thryft.protocol.TProtocol iprot, final byte readAsTType) throws java.io.IOException {
        com.yochimp.models.template.TemplateInfo mailChimpTemplateInfo = null;

        switch (readAsTType) {
            case org.thryft.protocol.TType.LIST:
                iprot.readListBegin();
                mailChimpTemplateInfo = new com.yochimp.models.template.TemplateInfo(iprot);
                iprot.readListEnd();
                break;

            case org.thryft.protocol.TType.STRUCT:
            default:
                iprot.readStructBegin();
                while (true) {
                    final org.thryft.protocol.TField ifield = iprot.readFieldBegin();
                    if (ifield.type == org.thryft.protocol.TType.STOP) {
                        break;
                    } else if (ifield.name.equals("mail_chimp_template_info")) {
                        mailChimpTemplateInfo = new com.yochimp.models.template.TemplateInfo(iprot);
                    }
                    iprot.readFieldEnd();
                }
                iprot.readStructEnd();
                break;
        }

        this.mailChimpTemplateInfo = com.google.common.base.Preconditions.checkNotNull(mailChimpTemplateInfo, "com.yogento.api.models.mail.template.MailTemplateInfo: missing mailChimpTemplateInfo");
    }

    public MailTemplateInfo(final com.yochimp.models.template.TemplateInfo mailChimpTemplateInfo) {
        this.mailChimpTemplateInfo = com.google.common.base.Preconditions.checkNotNull(mailChimpTemplateInfo, "com.yogento.api.models.mail.template.MailTemplateInfo: missing mailChimpTemplateInfo");
    }

    @Override
    public int compareTo(final MailTemplateInfo other) {
        if (other == null) {
            throw new NullPointerException();
        }

        int result;
        result = this.mailChimpTemplateInfo.compareTo(other.mailChimpTemplateInfo);
        if (result != 0) {
            return result;
        }

        return 0;
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

    public Object get(final String fieldName) {
        if (fieldName.equals("mail_chimp_template_info")) {
            return getMailChimpTemplateInfo();
        }
        throw new IllegalArgumentException(fieldName);
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
    public String toString() {
        final com.google.common.base.Objects.ToStringHelper helper = com.google.common.base.Objects.toStringHelper(this);
        helper.add("mail_chimp_template_info", getMailChimpTemplateInfo());
        return helper.toString();
    }

    @Override
    public void write(final org.thryft.protocol.TProtocol oprot) throws java.io.IOException {
        write(oprot, org.thryft.protocol.TType.STRUCT);
    }

    public void write(final org.thryft.protocol.TProtocol oprot, final byte writeAsTType) throws java.io.IOException {
        switch (writeAsTType) {
            case org.thryft.protocol.TType.VOID: {
                getMailChimpTemplateInfo().write(oprot);
                break;
            }

            case org.thryft.protocol.TType.LIST:
                oprot.writeListBegin(new org.thryft.protocol.TList(org.thryft.protocol.TType.VOID, 1));

                getMailChimpTemplateInfo().write(oprot);

                oprot.writeListEnd();
                break;

            case org.thryft.protocol.TType.STRUCT:
            default:
                oprot.writeStructBegin(new org.thryft.protocol.TStruct("MailTemplateInfo"));

                oprot.writeFieldBegin(new org.thryft.protocol.TField("mail_chimp_template_info", org.thryft.protocol.TType.STRUCT, (short)-1));
                getMailChimpTemplateInfo().write(oprot);
                oprot.writeFieldEnd();

                oprot.writeFieldStop();

                oprot.writeStructEnd();
                break;
        }
    }

    private final com.yochimp.models.template.TemplateInfo mailChimpTemplateInfo;
}
