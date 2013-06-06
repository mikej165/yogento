package com.yogento.api.services.catalog;

@SuppressWarnings({"serial"})
public class ProductIoException extends java.lang.Exception implements org.thryft.TBase<ProductIoException> {
    public static class Builder {
        public Builder() {
        }

        public Builder(final ProductIoException other) {
            this.causeMessage = other.getCauseMessage();
            this.sku = other.getSku();
        }

        protected ProductIoException _build(final String causeMessage, final com.google.common.base.Optional<String> sku) {
            return new ProductIoException(causeMessage, sku);
        }

        public ProductIoException build() {
            return _build(causeMessage, sku);
        }

        public Builder setCauseMessage(final String causeMessage) {
            this.causeMessage = causeMessage;
            return this;
        }

        public Builder setSku(final com.google.common.base.Optional<String> sku) {
            this.sku = sku;
            return this;
        }

        public Builder setSku(final String sku) {
            this.sku = com.google.common.base.Optional.of(sku);
            return this;
        }

        private String causeMessage;
        private com.google.common.base.Optional<String> sku = com.google.common.base.Optional.absent();
    }

    public ProductIoException(final ProductIoException other) {
        this(other.getCauseMessage(), other.getSku());
    }

    public ProductIoException(final org.thryft.protocol.TProtocol iprot) throws java.io.IOException {
        this(iprot, org.thryft.protocol.TType.STRUCT);
    }

    public ProductIoException(final org.thryft.protocol.TProtocol iprot, final byte readAsTType) throws java.io.IOException {
        String causeMessage = null;
        com.google.common.base.Optional<String> sku = com.google.common.base.Optional.absent();

        switch (readAsTType) {
            case org.thryft.protocol.TType.LIST:
                final org.thryft.protocol.TList __list = iprot.readListBegin();
                causeMessage = iprot.readString();
                if (__list.size > 1) {
                    sku = com.google.common.base.Optional.of(iprot.readString());
                }
                iprot.readListEnd();
                break;

            case org.thryft.protocol.TType.STRUCT:
            default:
                iprot.readStructBegin();
                while (true) {
                    final org.thryft.protocol.TField ifield = iprot.readFieldBegin();
                    if (ifield.type == org.thryft.protocol.TType.STOP) {
                        break;
                    } else if (ifield.name.equals("cause_message")) {
                        causeMessage = iprot.readString();
                    } else if (ifield.name.equals("sku")) {
                        sku = com.google.common.base.Optional.of(iprot.readString());
                    }
                    iprot.readFieldEnd();
                }
                iprot.readStructEnd();
                break;
        }

        this.causeMessage = com.google.common.base.Preconditions.checkNotNull(causeMessage, "com.yogento.api.services.catalog.ProductIoException: missing causeMessage");
        this.sku = sku;
    }

    public ProductIoException(final String causeMessage) {
        this.causeMessage = com.google.common.base.Preconditions.checkNotNull(causeMessage, "com.yogento.api.services.catalog.ProductIoException: missing causeMessage");
        this.sku = com.google.common.base.Optional.absent();
    }

    public ProductIoException(final String causeMessage, final com.google.common.base.Optional<String> sku) {
        this.causeMessage = com.google.common.base.Preconditions.checkNotNull(causeMessage, "com.yogento.api.services.catalog.ProductIoException: missing causeMessage");
        this.sku = com.google.common.base.Preconditions.checkNotNull(sku, "com.yogento.api.services.catalog.ProductIoException: missing sku");
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public int compareTo(final ProductIoException other) {
        if (other == null) {
            throw new NullPointerException();
        }

        int result;
        result = this.causeMessage.compareTo(other.causeMessage);
        if (result != 0) {
            return result;
        }

        if (this.sku.isPresent()) {
            if (other.sku.isPresent()) {
                result = this.sku.get().compareTo(other.sku.get());
                if (result != 0) {
                    return result;
                }
            } else {
                return 1;
            }
        } else if (other.sku.isPresent()) {
            return -1;
        }

        return 0;
    }

    @Override
    public boolean equals(final Object otherObject) {
        if (otherObject == this) {
            return true;
        } else if (!(otherObject instanceof ProductIoException)) {
            return false;
        }

        final ProductIoException other = (ProductIoException)otherObject;
        return
            getCauseMessage().equals(other.getCauseMessage()) &&
            getSku().equals(other.getSku());
    }

    public static ProductIoException fake() {
        return fakeBuilder().build();
    }

    public static Builder fakeBuilder() {
        Builder builder = new Builder();
        builder.setCauseMessage(org.thryft.Faker.Lorem.word());
        builder.setSku(org.thryft.Faker.Lorem.word());
        return builder;
    }

    public Object get(final String fieldName) {
        if (fieldName.equals("cause_message")) {
            return getCauseMessage();
        } else if (fieldName.equals("sku")) {
            return getSku();
        }
        throw new IllegalArgumentException(fieldName);
    }

    public final String getCauseMessage() {
        return causeMessage;
    }

    @Override
    public String getMessage() {
        return toString();
    }

    public final com.google.common.base.Optional<String> getSku() {
        return sku;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getCauseMessage().hashCode();
        if (getSku().isPresent()) {
            hashCode = 31 * hashCode + getSku().get().hashCode();
        }
        return hashCode;
    }

    public ProductIoException replaceCauseMessage(final String causeMessage) {
        return new ProductIoException(causeMessage, this.sku);
    }

    public ProductIoException replaceSku(final com.google.common.base.Optional<String> sku) {
        return new ProductIoException(this.causeMessage, sku);
    }

    public ProductIoException replaceSku(final String sku) {
        return replaceSku(com.google.common.base.Optional.fromNullable(sku));
    }

    @Override
    public String toString() {
        final com.google.common.base.Objects.ToStringHelper helper = com.google.common.base.Objects.toStringHelper(this);
        helper.add("cause_message", getCauseMessage());
        if (getSku().isPresent()) {
            helper.add("sku", getSku());
        }
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

                oprot.writeString(getCauseMessage());

                if (getSku().isPresent()) {
                    oprot.writeString(getSku().get());
                } else {
                    oprot.writeNull();
                }

                oprot.writeListEnd();
                break;

            case org.thryft.protocol.TType.STRUCT:
            default:
                oprot.writeStructBegin(new org.thryft.protocol.TStruct("ProductIoException"));

                oprot.writeFieldBegin(new org.thryft.protocol.TField("cause_message", org.thryft.protocol.TType.STRING, (short)-1));
                oprot.writeString(getCauseMessage());
                oprot.writeFieldEnd();

                if (getSku().isPresent()) {
                    oprot.writeFieldBegin(new org.thryft.protocol.TField("sku", org.thryft.protocol.TType.STRING, (short)-1));
                    oprot.writeString(getSku().get());
                    oprot.writeFieldEnd();
                }

                oprot.writeFieldStop();

                oprot.writeStructEnd();
                break;
        }
    }

    private final String causeMessage;

    private final com.google.common.base.Optional<String> sku;
}
