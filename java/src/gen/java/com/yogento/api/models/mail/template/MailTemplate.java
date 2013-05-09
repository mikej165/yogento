package com.yogento.api.models.mail.template;

@SuppressWarnings({"serial"})
public class MailTemplate implements org.thryft.TBase<MailTemplate> {
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

    public MailTemplate(final org.thryft.protocol.TProtocol iprot) throws java.io.IOException {
        this(iprot, org.thryft.protocol.TType.STRUCT);
    }

    public MailTemplate(final org.thryft.protocol.TProtocol iprot, final byte readAsTType) throws java.io.IOException {
        com.yochimp.models.template.Template mailChimpTemplate = null;
        com.yogento.api.models.mail.template.MailTemplateType type = null;

        switch (readAsTType) {
            case org.thryft.protocol.TType.LIST:
                iprot.readListBegin();
                mailChimpTemplate = new com.yochimp.models.template.Template(iprot);
                type = new com.yogento.api.models.mail.template.MailTemplateType(iprot);
                iprot.readListEnd();
                break;

            case org.thryft.protocol.TType.STRUCT:
            default:
                iprot.readStructBegin();
                while (true) {
                    final org.thryft.protocol.TField ifield = iprot.readFieldBegin();
                    if (ifield.type == org.thryft.protocol.TType.STOP) {
                        break;
                    } else if (ifield.name.equals("mail_chimp_template")) {
                        mailChimpTemplate = new com.yochimp.models.template.Template(iprot);
                    } else if (ifield.name.equals("type")) {
                        type = new com.yogento.api.models.mail.template.MailTemplateType(iprot);
                    }
                    iprot.readFieldEnd();
                }
                iprot.readStructEnd();
                break;
        }

        this.mailChimpTemplate = com.google.common.base.Preconditions.checkNotNull(mailChimpTemplate, "com.yogento.api.models.mail.template.MailTemplate: missing mailChimpTemplate");
        this.type = com.google.common.base.Preconditions.checkNotNull(type, "com.yogento.api.models.mail.template.MailTemplate: missing type");
    }

    public MailTemplate(final com.yochimp.models.template.Template mailChimpTemplate, final com.yogento.api.models.mail.template.MailTemplateType type) {
        this.mailChimpTemplate = com.google.common.base.Preconditions.checkNotNull(mailChimpTemplate, "com.yogento.api.models.mail.template.MailTemplate: missing mailChimpTemplate");
        this.type = com.google.common.base.Preconditions.checkNotNull(type, "com.yogento.api.models.mail.template.MailTemplate: missing type");
    }

    @Override
    public int compareTo(final MailTemplate other) {
        if (other == null) {
            throw new NullPointerException();
        }

        int result;
        result = this.mailChimpTemplate.compareTo(other.mailChimpTemplate);
        if (result != 0) {
            return result;
        }

        result = this.type.compareTo(other.type);
        if (result != 0) {
            return result;
        }

        return 0;
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

    public Object get(final String fieldName) {
        if (fieldName.equals("mail_chimp_template")) {
            return getMailChimpTemplate();
        } else if (fieldName.equals("type")) {
            return getType();
        }
        throw new IllegalArgumentException(fieldName);
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
    public String toString() {
        final com.google.common.base.Objects.ToStringHelper helper = com.google.common.base.Objects.toStringHelper(this);
        helper.add("mail_chimp_template", getMailChimpTemplate());
        helper.add("type", getType());
        return helper.toString();
    }

    @Override
    public void write(final org.thryft.protocol.TProtocol oprot) throws java.io.IOException {
        write(oprot, org.thryft.protocol.TType.STRUCT);
    }

    public void write(final org.thryft.protocol.TProtocol oprot, final byte writeAsTType) throws java.io.IOException {
        switch (writeAsTType) {
            case org.thryft.protocol.TType.VOID:
            case org.thryft.protocol.TType.LIST:
                oprot.writeListBegin(new org.thryft.protocol.TList(org.thryft.protocol.TType.VOID, 2));

                getMailChimpTemplate().write(oprot);

                getType().write(oprot);

                oprot.writeListEnd();
                break;

            case org.thryft.protocol.TType.STRUCT:
            default:
                oprot.writeStructBegin(new org.thryft.protocol.TStruct("MailTemplate"));

                oprot.writeFieldBegin(new org.thryft.protocol.TField("mail_chimp_template", org.thryft.protocol.TType.STRUCT, (short)-1));
                getMailChimpTemplate().write(oprot);
                oprot.writeFieldEnd();

                oprot.writeFieldBegin(new org.thryft.protocol.TField("type", org.thryft.protocol.TType.STRUCT, (short)-1));
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
