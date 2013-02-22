package com.yogento.api.services.catalog;

@SuppressWarnings({"serial"})
public class NoSuchProductImageException extends java.lang.Exception implements org.apache.thrift.TBase<NoSuchProductImageException, org.apache.thrift.TFieldIdEnum> {
    public static class Builder {
        public Builder() {
        }

        public Builder(final NoSuchProductImageException other) {
            this.causeMessage = other.getCauseMessage();
            this.sku = other.getSku();
        }

        protected NoSuchProductImageException _build(final String causeMessage, final String sku) {
            return new NoSuchProductImageException(causeMessage, sku);
        }

        public NoSuchProductImageException build() {
            return _build(causeMessage, sku);
        }

        public Builder setCauseMessage(final String causeMessage) {
            this.causeMessage = causeMessage;
            return this;
        }

        public Builder setSku(final String sku) {
            this.sku = sku;
            return this;
        }

        private String causeMessage;
        private String sku;
    }

    public NoSuchProductImageException(final NoSuchProductImageException other) {
        this(other.getCauseMessage(), other.getSku());
    }

    public NoSuchProductImageException(final org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
        this(iprot, org.apache.thrift.protocol.TType.STRUCT);
    }

    public NoSuchProductImageException(final org.apache.thrift.protocol.TProtocol iprot, final byte readAsTType) throws org.apache.thrift.TException {
        String causeMessage = null;
        String sku = null;

        switch (readAsTType) {
            case org.apache.thrift.protocol.TType.LIST:
                iprot.readListBegin();
                causeMessage = iprot.readString();
                sku = iprot.readString();
                iprot.readListEnd();
                break;

            case org.apache.thrift.protocol.TType.STRUCT:
            default:
                iprot.readStructBegin();
                while (true) {
                    final org.apache.thrift.protocol.TField ifield = iprot.readFieldBegin();
                    if (ifield.type == org.apache.thrift.protocol.TType.STOP) {
                        break;
                    } else if (ifield.name.equals("cause_message")) {
                        causeMessage = iprot.readString();
                    } else if (ifield.name.equals("sku")) {
                        sku = iprot.readString();
                    }
                    iprot.readFieldEnd();
                }
                iprot.readStructEnd();
                break;
        }

        this.causeMessage = com.google.common.base.Preconditions.checkNotNull(causeMessage);
        this.sku = com.google.common.base.Preconditions.checkNotNull(sku);
    }

    public NoSuchProductImageException(final String causeMessage, final String sku) {
        this.causeMessage = com.google.common.base.Preconditions.checkNotNull(causeMessage);
        this.sku = com.google.common.base.Preconditions.checkNotNull(sku);
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException();
    }

    @Override
    public int compareTo(final NoSuchProductImageException other) {
        throw new UnsupportedOperationException();
    }

    @Override
    public org.apache.thrift.TBase<NoSuchProductImageException, org.apache.thrift.TFieldIdEnum> deepCopy() {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean equals(final Object otherObject) {
        if (otherObject == this) {
            return true;
        } else if (!(otherObject instanceof NoSuchProductImageException)) {
            return false;
        }

        final NoSuchProductImageException other = (NoSuchProductImageException)otherObject;
        return
            getCauseMessage().equals(other.getCauseMessage()) &&
            getSku().equals(other.getSku());
    }

    @Override
    public org.apache.thrift.TFieldIdEnum fieldForId(final int fieldId) {
        throw new UnsupportedOperationException();
    }

    public Object get(final String fieldName) {
        if (fieldName.equals("cause_message")) {
            return getCauseMessage();
        } else if (fieldName.equals("sku")) {
            return getSku();
        }
        return null;
    }

    public final String getCauseMessage() {
        return causeMessage;
    }

    @Override
    public Object getFieldValue(final org.apache.thrift.TFieldIdEnum field) {
        throw new UnsupportedOperationException();
    }

    @Override
    public String getMessage() {
        return toString();
    }

    public final String getSku() {
        return sku;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getCauseMessage().hashCode();
        hashCode = 31 * hashCode + getSku().hashCode();
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
        helper.add("cause_message", getCauseMessage());
        helper.add("sku", getSku());
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

                oprot.writeString(getCauseMessage());

                oprot.writeString(getSku());

                oprot.writeListEnd();
                break;

            case org.apache.thrift.protocol.TType.STRUCT:
            default:
                oprot.writeStructBegin(new org.apache.thrift.protocol.TStruct("NoSuchProductImageException"));

                oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("cause_message", org.apache.thrift.protocol.TType.STRING, (short)-1));
                oprot.writeString(getCauseMessage());
                oprot.writeFieldEnd();

                oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("sku", org.apache.thrift.protocol.TType.STRING, (short)-1));
                oprot.writeString(getSku());
                oprot.writeFieldEnd();

                oprot.writeFieldStop();

                oprot.writeStructEnd();
                break;
        }
    }

    private final String causeMessage;
    private final String sku;
}
