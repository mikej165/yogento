package com.yogento.api.models.mail.template;

@SuppressWarnings({"serial"})
public class MailTemplateType implements org.thryft.TBase<MailTemplateType> {
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

    public MailTemplateType(final org.thryft.protocol.TProtocol iprot) throws java.io.IOException {
        this(iprot, org.thryft.protocol.TType.STRUCT);
    }

    public MailTemplateType(final org.thryft.protocol.TProtocol iprot, final byte readAsTType) throws java.io.IOException {
        com.yochimp.models.template.TemplateType mailChimpTemplateType = null;

        switch (readAsTType) {
            case org.thryft.protocol.TType.LIST:
                iprot.readListBegin();
                mailChimpTemplateType = iprot.readEnum(com.yochimp.models.template.TemplateType.class);
                iprot.readListEnd();
                break;

            case org.thryft.protocol.TType.STRUCT:
            default:
                iprot.readStructBegin();
                while (true) {
                    final org.thryft.protocol.TField ifield = iprot.readFieldBegin();
                    if (ifield.type == org.thryft.protocol.TType.STOP) {
                        break;
                    } else if (ifield.name.equals("mail_chimp_template_type")) {
                        mailChimpTemplateType = iprot.readEnum(com.yochimp.models.template.TemplateType.class);
                    }
                    iprot.readFieldEnd();
                }
                iprot.readStructEnd();
                break;
        }

        this.mailChimpTemplateType = com.google.common.base.Preconditions.checkNotNull(mailChimpTemplateType, "com.yogento.api.models.mail.template.MailTemplateType: missing mailChimpTemplateType");
    }

    public MailTemplateType(final com.yochimp.models.template.TemplateType mailChimpTemplateType) {
        this.mailChimpTemplateType = com.google.common.base.Preconditions.checkNotNull(mailChimpTemplateType, "com.yogento.api.models.mail.template.MailTemplateType: missing mailChimpTemplateType");
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public int compareTo(final MailTemplateType other) {
        if (other == null) {
            throw new NullPointerException();
        }

        int result;
        result = this.mailChimpTemplateType.compareTo(other.mailChimpTemplateType);
        if (result != 0) {
            return result;
        }

        return 0;
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

    public static MailTemplateType fake() {
        return fakeBuilder().build();
    }

    public static Builder fakeBuilder() {
        Builder builder = new Builder();
        builder.setMailChimpTemplateType(org.thryft.Faker.randomEnum(com.google.common.collect.ImmutableList.of(com.yochimp.models.template.TemplateType.USER, com.yochimp.models.template.TemplateType.GALLERY, com.yochimp.models.template.TemplateType.BASE)));
        return builder;
    }

    public Object get(final String fieldName) {
        if (fieldName.equals("mail_chimp_template_type")) {
            return getMailChimpTemplateType();
        }
        throw new IllegalArgumentException(fieldName);
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

    public MailTemplateType replaceMailChimpTemplateType(final com.yochimp.models.template.TemplateType mailChimpTemplateType) {
        return new MailTemplateType(mailChimpTemplateType);
    }

    @Override
    public String toString() {
        final com.google.common.base.Objects.ToStringHelper helper = com.google.common.base.Objects.toStringHelper(this);
        helper.add("mail_chimp_template_type", getMailChimpTemplateType());
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
                oprot.writeListBegin(new org.thryft.protocol.TList(org.thryft.protocol.TType.VOID, 1));

                oprot.writeEnum(getMailChimpTemplateType());

                oprot.writeListEnd();
                break;

            case org.thryft.protocol.TType.STRUCT:
            default:
                oprot.writeStructBegin(new org.thryft.protocol.TStruct("MailTemplateType"));

                oprot.writeFieldBegin(new org.thryft.protocol.TField("mail_chimp_template_type", org.thryft.protocol.TType.STRING, (short)-1));
                oprot.writeEnum(getMailChimpTemplateType());
                oprot.writeFieldEnd();

                oprot.writeFieldStop();

                oprot.writeStructEnd();
                break;
        }
    }

    private final com.yochimp.models.template.TemplateType mailChimpTemplateType;
}
