package com.yogento.api.services.catalog;

@SuppressWarnings({"serial"})
public class NoSuchProductException extends java.lang.Exception implements org.apache.thrift.TBase<NoSuchProductException, org.apache.thrift.TFieldIdEnum> {
    public static class Builder {
        public Builder() {
        }

        public Builder(final NoSuchProductException other) {
            this.sku = other.getSku();
        }

        protected NoSuchProductException _build(final String sku) {
            return new NoSuchProductException(sku);
        }

        public NoSuchProductException build() {
            return _build(sku);
        }

        public Builder setSku(final String sku) {
            this.sku = sku;
            return this;
        }

        private String sku;
    }

    public NoSuchProductException(final NoSuchProductException other) {
        this(other.getSku());
    }

    public NoSuchProductException(final org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
        this(iprot, org.apache.thrift.protocol.TType.STRUCT);
    }

    public NoSuchProductException(final org.apache.thrift.protocol.TProtocol iprot, final byte readAsTType) throws org.apache.thrift.TException {
        String sku = null;

        switch (readAsTType) {
            case org.apache.thrift.protocol.TType.LIST:
                iprot.readListBegin();
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
                    } else if (ifield.name.equals("sku")) {
                        sku = iprot.readString();
                    }
                    iprot.readFieldEnd();
                }
                iprot.readStructEnd();
                break;
        }

        this.sku = com.google.common.base.Preconditions.checkNotNull(sku);
    }

    public NoSuchProductException(final String sku) {
        this.sku = com.google.common.base.Preconditions.checkNotNull(sku);
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException();
    }

    @Override
    public int compareTo(final NoSuchProductException other) {
        throw new UnsupportedOperationException();
    }

    @Override
    public org.apache.thrift.TBase<NoSuchProductException, org.apache.thrift.TFieldIdEnum> deepCopy() {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean equals(final Object otherObject) {
        if (otherObject == this) {
            return true;
        } else if (!(otherObject instanceof NoSuchProductException)) {
            return false;
        }

        final NoSuchProductException other = (NoSuchProductException)otherObject;
        return
            getSku().equals(other.getSku());
    }

    @Override
    public org.apache.thrift.TFieldIdEnum fieldForId(final int fieldId) {
        throw new UnsupportedOperationException();
    }

    public Object get(final String fieldName) {
        if (fieldName.equals("sku")) {
            return getSku();
        }
        return null;
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
                oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.VOID, 1));

                oprot.writeString(getSku());

                oprot.writeListEnd();
                break;

            case org.apache.thrift.protocol.TType.STRUCT:
            default:
                oprot.writeStructBegin(new org.apache.thrift.protocol.TStruct("NoSuchProductException"));

                oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("sku", org.apache.thrift.protocol.TType.STRING, (short)-1));
                oprot.writeString(getSku());
                oprot.writeFieldEnd();

                oprot.writeFieldStop();

                oprot.writeStructEnd();
                break;
        }
    }

    private final String sku;
}
