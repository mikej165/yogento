package com.yogento.api.services.catalog;

@SuppressWarnings({"serial"})
public class NoSuchProductException extends java.lang.Exception implements org.thryft.TBase<NoSuchProductException> {
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

    public NoSuchProductException(final org.thryft.protocol.TProtocol iprot) throws java.io.IOException {
        this(iprot, org.thryft.protocol.TType.STRUCT);
    }

    public NoSuchProductException(final org.thryft.protocol.TProtocol iprot, final byte readAsTType) throws java.io.IOException {
        String sku = null;

        switch (readAsTType) {
            case org.thryft.protocol.TType.LIST:
                iprot.readListBegin();
                sku = iprot.readString();
                iprot.readListEnd();
                break;

            case org.thryft.protocol.TType.STRUCT:
            default:
                iprot.readStructBegin();
                while (true) {
                    final org.thryft.protocol.TField ifield = iprot.readFieldBegin();
                    if (ifield.type == org.thryft.protocol.TType.STOP) {
                        break;
                    } else if (ifield.name.equals("sku")) {
                        sku = iprot.readString();
                    }
                    iprot.readFieldEnd();
                }
                iprot.readStructEnd();
                break;
        }

        this.sku = com.google.common.base.Preconditions.checkNotNull(sku, "com.yogento.api.services.catalog.NoSuchProductException: missing sku");
    }

    public NoSuchProductException(final String sku) {
        this.sku = com.google.common.base.Preconditions.checkNotNull(sku, "com.yogento.api.services.catalog.NoSuchProductException: missing sku");
    }

    @Override
    public int compareTo(final NoSuchProductException other) {
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

    public Object get(final String fieldName) {
        if (fieldName.equals("sku")) {
            return getSku();
        }
        return null;
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
    public String toString() {
        final com.google.common.base.Objects.ToStringHelper helper = com.google.common.base.Objects.toStringHelper(this);
        helper.add("sku", getSku());
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

                oprot.writeString(getSku());

                oprot.writeListEnd();
                break;

            case org.thryft.protocol.TType.STRUCT:
            default:
                oprot.writeStructBegin(new org.thryft.protocol.TStruct("NoSuchProductException"));

                oprot.writeFieldBegin(new org.thryft.protocol.TField("sku", org.thryft.protocol.TType.STRING, (short)-1));
                oprot.writeString(getSku());
                oprot.writeFieldEnd();

                oprot.writeFieldStop();

                oprot.writeStructEnd();
                break;
        }
    }

    private final String sku;
}
