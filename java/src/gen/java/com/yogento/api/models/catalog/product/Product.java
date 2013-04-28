package com.yogento.api.models.catalog.product;

@SuppressWarnings({"serial"})
public class Product implements org.thryft.TBase<Product> {
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

    public Product(final org.thryft.protocol.TProtocol iprot) throws java.io.IOException {
        this(iprot, org.thryft.protocol.TType.STRUCT);
    }

    public Product(final org.thryft.protocol.TProtocol iprot, final byte readAsTType) throws java.io.IOException {
        com.yogento.api.models.catalog.product.magento.MagentoProduct magentoProduct = null;

        switch (readAsTType) {
            case org.thryft.protocol.TType.LIST:
                iprot.readListBegin();
                magentoProduct = new com.yogento.api.models.catalog.product.magento.MagentoProduct(iprot);
                iprot.readListEnd();
                break;

            case org.thryft.protocol.TType.STRUCT:
            default:
                iprot.readStructBegin();
                while (true) {
                    final org.thryft.protocol.TField ifield = iprot.readFieldBegin();
                    if (ifield.type == org.thryft.protocol.TType.STOP) {
                        break;
                    } else if (ifield.name.equals("magento_product")) {
                        magentoProduct = new com.yogento.api.models.catalog.product.magento.MagentoProduct(iprot);
                    }
                    iprot.readFieldEnd();
                }
                iprot.readStructEnd();
                break;
        }

        this.magentoProduct = com.google.common.base.Preconditions.checkNotNull(magentoProduct, "com.yogento.api.models.catalog.product.Product: missing magentoProduct");
    }

    public Product(final com.yogento.api.models.catalog.product.magento.MagentoProduct magentoProduct) {
        this.magentoProduct = com.google.common.base.Preconditions.checkNotNull(magentoProduct, "com.yogento.api.models.catalog.product.Product: missing magentoProduct");
    }

    @Override
    public int compareTo(final Product other) {
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

    public Object get(final String fieldName) {
        if (fieldName.equals("magento_product")) {
            return getMagentoProduct();
        }
        return null;
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
    public String toString() {
        final com.google.common.base.Objects.ToStringHelper helper = com.google.common.base.Objects.toStringHelper(this);
        helper.add("magento_product", getMagentoProduct());
        return helper.toString();
    }

    @Override
    public void write(final org.thryft.protocol.TProtocol oprot) throws java.io.IOException {
        write(oprot, org.thryft.protocol.TType.STRUCT);
    }

    public void write(final org.thryft.protocol.TProtocol oprot, final byte writeAsTType) throws java.io.IOException {
        switch (writeAsTType) {
            case org.thryft.protocol.TType.VOID: {
                getMagentoProduct().write(oprot);
                break;
            }

            case org.thryft.protocol.TType.LIST:
                oprot.writeListBegin(new org.thryft.protocol.TList(org.thryft.protocol.TType.VOID, 1));

                getMagentoProduct().write(oprot);

                oprot.writeListEnd();
                break;

            case org.thryft.protocol.TType.STRUCT:
            default:
                oprot.writeStructBegin(new org.thryft.protocol.TStruct("Product"));

                oprot.writeFieldBegin(new org.thryft.protocol.TField("magento_product", org.thryft.protocol.TType.STRUCT, (short)-1));
                getMagentoProduct().write(oprot);
                oprot.writeFieldEnd();

                oprot.writeFieldStop();

                oprot.writeStructEnd();
                break;
        }
    }

    private final com.yogento.api.models.catalog.product.magento.MagentoProduct magentoProduct;
}
