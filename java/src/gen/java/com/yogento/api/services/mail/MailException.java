package com.yogento.api.services.mail;

@SuppressWarnings({"serial"})
public class MailException extends java.lang.Exception implements org.apache.thrift.TBase<MailException, org.apache.thrift.TFieldIdEnum> {
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

    public MailException(final org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
        this(iprot, org.apache.thrift.protocol.TType.STRUCT);
    }

    public MailException(final org.apache.thrift.protocol.TProtocol iprot, final byte readAsTType) throws org.apache.thrift.TException {
        int code = 0;
        String error = null;

        switch (readAsTType) {
            case org.apache.thrift.protocol.TType.LIST:
                iprot.readListBegin();
                code = iprot.readI32();
                error = iprot.readString();
                iprot.readListEnd();
                break;

            case org.apache.thrift.protocol.TType.STRUCT:
            default:
                iprot.readStructBegin();
                while (true) {
                    final org.apache.thrift.protocol.TField ifield = iprot.readFieldBegin();
                    if (ifield.type == org.apache.thrift.protocol.TType.STOP) {
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

    @Override
    public void clear() {
        throw new UnsupportedOperationException();
    }

    @Override
    public int compareTo(final MailException other) {
        throw new UnsupportedOperationException();
    }

    @Override
    public org.apache.thrift.TBase<MailException, org.apache.thrift.TFieldIdEnum> deepCopy() {
        throw new UnsupportedOperationException();
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

    @Override
    public org.apache.thrift.TFieldIdEnum fieldForId(final int fieldId) {
        throw new UnsupportedOperationException();
    }

    public Object get(final String fieldName) {
        if (fieldName.equals("code")) {
            return getCode();
        } else if (fieldName.equals("error")) {
            return getError();
        }
        return null;
    }

    public final int getCode() {
        return code;
    }

    public final String getError() {
        return error;
    }

    @Override
    public Object getFieldValue(final org.apache.thrift.TFieldIdEnum field) {
        throw new UnsupportedOperationException();
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
        helper.add("code", getCode());
        helper.add("error", getError());
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

                oprot.writeI32(getCode());

                oprot.writeString(getError());

                oprot.writeListEnd();
                break;

            case org.apache.thrift.protocol.TType.STRUCT:
            default:
                oprot.writeStructBegin(new org.apache.thrift.protocol.TStruct("MailException"));

                oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("code", org.apache.thrift.protocol.TType.I32, (short)-1));
                oprot.writeI32(getCode());
                oprot.writeFieldEnd();

                oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("error", org.apache.thrift.protocol.TType.STRING, (short)-1));
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
