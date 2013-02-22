package com.yogento.api.models.catalog.product;

@SuppressWarnings({"serial"})
public class Product implements org.apache.thrift.TBase<Product, org.apache.thrift.TFieldIdEnum> {
    public static class Builder {
        public Builder() {
        }

        public Builder(final Product other) {
            this.magentoProduct = other.getMagentoProduct();
        }

        protected Product _build(final com.yogento.api.models.catalog.product.magento.MagentoProduct magentoProduct) {
            return new Product(magentoProduct);
        }

        public Product build() {
            return _build(magentoProduct);
        }

        public Builder setMagentoProduct(final com.yogento.api.models.catalog.product.magento.MagentoProduct magentoProduct) {
            this.magentoProduct = magentoProduct;
            return this;
        }

        private com.yogento.api.models.catalog.product.magento.MagentoProduct magentoProduct;
    }

    public Product(final Product other) {
        this(other.getMagentoProduct());
    }

    public Product(final org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
        this(iprot, org.apache.thrift.protocol.TType.STRUCT);
    }

    public Product(final org.apache.thrift.protocol.TProtocol iprot, final byte readAsTType) throws org.apache.thrift.TException {
        com.yogento.api.models.catalog.product.magento.MagentoProduct magentoProduct = null;

        switch (readAsTType) {
            case org.apache.thrift.protocol.TType.LIST:
                iprot.readListBegin();
                magentoProduct = new com.yogento.api.models.catalog.product.magento.MagentoProduct(iprot);
                iprot.readListEnd();
                break;

            case org.apache.thrift.protocol.TType.STRUCT:
            default:
                iprot.readStructBegin();
                while (true) {
                    final org.apache.thrift.protocol.TField ifield = iprot.readFieldBegin();
                    if (ifield.type == org.apache.thrift.protocol.TType.STOP) {
                        break;
                    } else if (ifield.name.equals("magento_product")) {
                        magentoProduct = new com.yogento.api.models.catalog.product.magento.MagentoProduct(iprot);
                    }
                    iprot.readFieldEnd();
                }
                iprot.readStructEnd();
                break;
        }

        this.magentoProduct = com.google.common.base.Preconditions.checkNotNull(magentoProduct);
    }

    public Product(final com.yogento.api.models.catalog.product.magento.MagentoProduct magentoProduct) {
        this.magentoProduct = com.google.common.base.Preconditions.checkNotNull(magentoProduct);
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException();
    }

    @Override
    public int compareTo(final Product other) {
        throw new UnsupportedOperationException();
    }

    @Override
    public org.apache.thrift.TBase<Product, org.apache.thrift.TFieldIdEnum> deepCopy() {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean equals(final Object otherObject) {
        if (otherObject == this) {
            return true;
        } else if (!(otherObject instanceof Product)) {
            return false;
        }

        final Product other = (Product)otherObject;
        return
            getMagentoProduct().equals(other.getMagentoProduct());
    }

    @Override
    public org.apache.thrift.TFieldIdEnum fieldForId(final int fieldId) {
        throw new UnsupportedOperationException();
    }

    public Object get(final String fieldName) {
        if (fieldName.equals("magento_product")) {
            return getMagentoProduct();
        }
        return null;
    }

    @Override
    public Object getFieldValue(final org.apache.thrift.TFieldIdEnum field) {
        throw new UnsupportedOperationException();
    }

    public final com.yogento.api.models.catalog.product.magento.MagentoProduct getMagentoProduct() {
        return magentoProduct;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getMagentoProduct().hashCode();
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
        helper.add("magento_product", getMagentoProduct());
        return helper.toString();
    }

    @Override
    public void write(final org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
        write(oprot, org.apache.thrift.protocol.TType.STRUCT);
    }

    public void write(final org.apache.thrift.protocol.TProtocol oprot, final byte writeAsTType) throws org.apache.thrift.TException {
        switch (writeAsTType) {
            case org.apache.thrift.protocol.TType.VOID: {
                getMagentoProduct().write(oprot);
                break;
            }

            case org.apache.thrift.protocol.TType.LIST:
                oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.VOID, 1));

                getMagentoProduct().write(oprot);

                oprot.writeListEnd();
                break;

            case org.apache.thrift.protocol.TType.STRUCT:
            default:
                oprot.writeStructBegin(new org.apache.thrift.protocol.TStruct("Product"));

                oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("magento_product", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                getMagentoProduct().write(oprot);
                oprot.writeFieldEnd();

                oprot.writeFieldStop();

                oprot.writeStructEnd();
                break;
        }
    }

    private final com.yogento.api.models.catalog.product.magento.MagentoProduct magentoProduct;
}
