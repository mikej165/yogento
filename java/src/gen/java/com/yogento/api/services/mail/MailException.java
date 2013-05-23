package com.yogento.api.services.mail;

@SuppressWarnings({"serial"})
public class MailException extends java.lang.Exception implements org.thryft.TBase<MailException> {
    public static class Builder {
        public Builder() {
        }

        public Builder(final MailException other) {
            this.code = other.getCode();
            this.error = other.getError();
        }

        protected MailException _build(final int code, final String error) {
            return new MailException(code, error);
        }

        public MailException build() {
            return _build(code, error);
        }

        public Builder setCode(final int code) {
            this.code = code;
            return this;
        }

        public Builder setError(final String error) {
            this.error = error;
            return this;
        }

        private Integer code;
        private String error;
    }

    public MailException(final MailException other) {
        this(other.getCode(), other.getError());
    }

    public MailException(final org.thryft.protocol.TProtocol iprot) throws java.io.IOException {
        this(iprot, org.thryft.protocol.TType.STRUCT);
    }

    public MailException(final org.thryft.protocol.TProtocol iprot, final byte readAsTType) throws java.io.IOException {
        int code = 0;
        String error = null;

        switch (readAsTType) {
            case org.thryft.protocol.TType.LIST:
                iprot.readListBegin();
                code = iprot.readI32();
                error = iprot.readString();
                iprot.readListEnd();
                break;

            case org.thryft.protocol.TType.STRUCT:
            default:
                iprot.readStructBegin();
                while (true) {
                    final org.thryft.protocol.TField ifield = iprot.readFieldBegin();
                    if (ifield.type == org.thryft.protocol.TType.STOP) {
                        break;
                    } else if (ifield.name.equals("code")) {
                        code = iprot.readI32();
                    } else if (ifield.name.equals("error")) {
                        error = iprot.readString();
                    }
                    iprot.readFieldEnd();
                }
                iprot.readStructEnd();
                break;
        }

        this.code = code;
        this.error = com.google.common.base.Preconditions.checkNotNull(error, "com.yogento.api.services.mail.MailException: missing error");
    }

    public MailException(final int code, final String error) {
        this.code = code;
        this.error = com.google.common.base.Preconditions.checkNotNull(error, "com.yogento.api.services.mail.MailException: missing error");
    }

    public MailException(final Integer code, final String error) {
        this.code = code;
        this.error = com.google.common.base.Preconditions.checkNotNull(error, "com.yogento.api.services.mail.MailException: missing error");
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public int compareTo(final MailException other) {
        if (other == null) {
            throw new NullPointerException();
        }

        int result;
        result = ((Integer)this.code).compareTo(other.code);
        if (result != 0) {
            return result;
        }

        result = this.error.compareTo(other.error);
        if (result != 0) {
            return result;
        }

        return 0;
    }

    @Override
    public boolean equals(final Object otherObject) {
        if (otherObject == this) {
            return true;
        } else if (!(otherObject instanceof MailException)) {
            return false;
        }

        final MailException other = (MailException)otherObject;
        return
            getCode() == other.getCode() &&
            getError().equals(other.getError());
    }

    public static MailException fake() {
        return fakeBuilder().build();
    }

    public static Builder fakeBuilder() {
        Builder builder = new Builder();
        builder.setCode(org.thryft.Faker.randomI32());
        builder.setError(org.thryft.Faker.Lorem.word());
        return builder;
    }

    public Object get(final String fieldName) {
        if (fieldName.equals("code")) {
            return getCode();
        } else if (fieldName.equals("error")) {
            return getError();
        }
        throw new IllegalArgumentException(fieldName);
    }

    public final int getCode() {
        return code;
    }

    public final String getError() {
        return error;
    }

    @Override
    public String getMessage() {
        return toString();
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + ((int)getCode());
        hashCode = 31 * hashCode + getError().hashCode();
        return hashCode;
    }

    public MailException replaceCode(final int code) {
        return new MailException(code, this.error);
    }

    public MailException replaceError(final String error) {
        return new MailException(this.code, error);
    }

    @Override
    public String toString() {
        final com.google.common.base.Objects.ToStringHelper helper = com.google.common.base.Objects.toStringHelper(this);
        helper.add("code", getCode());
        helper.add("error", getError());
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

                oprot.writeI32(getCode());

                oprot.writeString(getError());

                oprot.writeListEnd();
                break;

            case org.thryft.protocol.TType.STRUCT:
            default:
                oprot.writeStructBegin(new org.thryft.protocol.TStruct("MailException"));

                oprot.writeFieldBegin(new org.thryft.protocol.TField("code", org.thryft.protocol.TType.I32, (short)-1));
                oprot.writeI32(getCode());
                oprot.writeFieldEnd();

                oprot.writeFieldBegin(new org.thryft.protocol.TField("error", org.thryft.protocol.TType.STRING, (short)-1));
                oprot.writeString(getError());
                oprot.writeFieldEnd();

                oprot.writeFieldStop();

                oprot.writeStructEnd();
                break;
        }
    }

    private final int code;

    private final String error;
}
