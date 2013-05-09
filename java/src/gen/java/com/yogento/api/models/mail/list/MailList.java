package com.yogento.api.models.mail.list;

@SuppressWarnings({"serial"})
public class MailList implements org.thryft.TBase<MailList> {
    public static class Builder {
        public Builder() {
        }

        public Builder(final MailList other) {
            this.mailChimpList = other.getMailChimpList();
        }

        protected MailList _build(final com.yochimp.models.list.List mailChimpList) {
            return new MailList(mailChimpList);
        }

        public MailList build() {
            return _build(mailChimpList);
        }

        public Builder setMailChimpList(final com.yochimp.models.list.List mailChimpList) {
            this.mailChimpList = mailChimpList;
            return this;
        }

        private com.yochimp.models.list.List mailChimpList;
    }

    public MailList(final MailList other) {
        this(other.getMailChimpList());
    }

    public MailList(final org.thryft.protocol.TProtocol iprot) throws java.io.IOException {
        this(iprot, org.thryft.protocol.TType.STRUCT);
    }

    public MailList(final org.thryft.protocol.TProtocol iprot, final byte readAsTType) throws java.io.IOException {
        com.yochimp.models.list.List mailChimpList = null;

        switch (readAsTType) {
            case org.thryft.protocol.TType.LIST:
                iprot.readListBegin();
                mailChimpList = new com.yochimp.models.list.List(iprot);
                iprot.readListEnd();
                break;

            case org.thryft.protocol.TType.STRUCT:
            default:
                iprot.readStructBegin();
                while (true) {
                    final org.thryft.protocol.TField ifield = iprot.readFieldBegin();
                    if (ifield.type == org.thryft.protocol.TType.STOP) {
                        break;
                    } else if (ifield.name.equals("mail_chimp_list")) {
                        mailChimpList = new com.yochimp.models.list.List(iprot);
                    }
                    iprot.readFieldEnd();
                }
                iprot.readStructEnd();
                break;
        }

        this.mailChimpList = com.google.common.base.Preconditions.checkNotNull(mailChimpList, "com.yogento.api.models.mail.list.MailList: missing mailChimpList");
    }

    public MailList(final com.yochimp.models.list.List mailChimpList) {
        this.mailChimpList = com.google.common.base.Preconditions.checkNotNull(mailChimpList, "com.yogento.api.models.mail.list.MailList: missing mailChimpList");
    }

    @Override
    public int compareTo(final MailList other) {
        if (other == null) {
            throw new NullPointerException();
        }

        int result;
        result = this.mailChimpList.compareTo(other.mailChimpList);
        if (result != 0) {
            return result;
        }

        return 0;
    }

    @Override
    public boolean equals(final Object otherObject) {
        if (otherObject == this) {
            return true;
        } else if (!(otherObject instanceof MailList)) {
            return false;
        }

        final MailList other = (MailList)otherObject;
        return
            getMailChimpList().equals(other.getMailChimpList());
    }

    public Object get(final String fieldName) {
        if (fieldName.equals("mail_chimp_list")) {
            return getMailChimpList();
        }
        throw new IllegalArgumentException(fieldName);
    }

    public final com.yochimp.models.list.List getMailChimpList() {
        return mailChimpList;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getMailChimpList().hashCode();
        return hashCode;
    }

    @Override
    public String toString() {
        final com.google.common.base.Objects.ToStringHelper helper = com.google.common.base.Objects.toStringHelper(this);
        helper.add("mail_chimp_list", getMailChimpList());
        return helper.toString();
    }

    @Override
    public void write(final org.thryft.protocol.TProtocol oprot) throws java.io.IOException {
        write(oprot, org.thryft.protocol.TType.STRUCT);
    }

    public void write(final org.thryft.protocol.TProtocol oprot, final byte writeAsTType) throws java.io.IOException {
        switch (writeAsTType) {
            case org.thryft.protocol.TType.VOID: {
                getMailChimpList().write(oprot);
                break;
            }

            case org.thryft.protocol.TType.LIST:
                oprot.writeListBegin(new org.thryft.protocol.TList(org.thryft.protocol.TType.VOID, 1));

                getMailChimpList().write(oprot);

                oprot.writeListEnd();
                break;

            case org.thryft.protocol.TType.STRUCT:
            default:
                oprot.writeStructBegin(new org.thryft.protocol.TStruct("MailList"));

                oprot.writeFieldBegin(new org.thryft.protocol.TField("mail_chimp_list", org.thryft.protocol.TType.STRUCT, (short)-1));
                getMailChimpList().write(oprot);
                oprot.writeFieldEnd();

                oprot.writeFieldStop();

                oprot.writeStructEnd();
                break;
        }
    }

    private final com.yochimp.models.list.List mailChimpList;
}
