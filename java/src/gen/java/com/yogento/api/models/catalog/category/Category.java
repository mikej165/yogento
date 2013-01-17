package com.yogento.api.models.catalog.category;

@SuppressWarnings({"serial"})
public class Category implements org.apache.thrift.TBase<Category, org.apache.thrift.TFieldIdEnum> {
    public static class Builder {
        public Builder() {
        }

        public Builder(final Category other) {
            this.magentoCategory = other.getMagentoCategory();
        }

        protected Category _build(final com.yogento.api.models.catalog.category.magento.MagentoCategory magentoCategory) {
            return new Category(magentoCategory);
        }

        public Category build() {
            return _build(magentoCategory);
        }

        public Builder setMagentoCategory(final com.yogento.api.models.catalog.category.magento.MagentoCategory magentoCategory) {
            this.magentoCategory = magentoCategory;
            return this;
        }

        private com.yogento.api.models.catalog.category.magento.MagentoCategory magentoCategory;
    }

    public Category(final Category other) {
        this(other.getMagentoCategory());
    }

    public Category(final org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
        this(iprot, org.apache.thrift.protocol.TType.STRUCT);
    }

    public Category(final org.apache.thrift.protocol.TProtocol iprot, final byte readAsTType) throws org.apache.thrift.TException {
        com.yogento.api.models.catalog.category.magento.MagentoCategory magentoCategory = null;

        switch (readAsTType) {
            case org.apache.thrift.protocol.TType.LIST:
                org.apache.thrift.protocol.TList __list = iprot.readListBegin();
                magentoCategory = new com.yogento.api.models.catalog.category.magento.MagentoCategory(iprot);
                iprot.readListEnd();
                break;

            case org.apache.thrift.protocol.TType.STRUCT:
            default:
                iprot.readStructBegin();
                while (true) {
                    org.apache.thrift.protocol.TField ifield = iprot.readFieldBegin();
                    if (ifield.type == org.apache.thrift.protocol.TType.STOP) {
                        break;
                    } else                 if (ifield.name.equals("magento_category")) {
                        magentoCategory = new com.yogento.api.models.catalog.category.magento.MagentoCategory(iprot);
                    }
                    iprot.readFieldEnd();
                }
                iprot.readStructEnd();
                break;
        }

        this.magentoCategory = com.google.common.base.Preconditions.checkNotNull(magentoCategory);
    }

    public Category(final com.yogento.api.models.catalog.category.magento.MagentoCategory magentoCategory) {
        this.magentoCategory = com.google.common.base.Preconditions.checkNotNull(magentoCategory);
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException();
    }

    @Override
    public int compareTo(final Category other) {
        throw new UnsupportedOperationException();
    }

    @Override
    public org.apache.thrift.TBase<Category, org.apache.thrift.TFieldIdEnum> deepCopy() {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean equals(final Object otherObject) {
        if (otherObject == this) {
            return true;
        } else if (!(otherObject instanceof Category)) {
            return false;
        }

        final Category other = (Category)otherObject;
        return
            getMagentoCategory().equals(other.getMagentoCategory());
    }

    @Override
    public org.apache.thrift.TFieldIdEnum fieldForId(final int fieldId) {
        throw new UnsupportedOperationException();
    }

    public Object get(final String fieldName) {
        if (fieldName.equals("magento_category")) {
            return getMagentoCategory();
        }
        return null;
    }

    @Override
    public Object getFieldValue(final org.apache.thrift.TFieldIdEnum field) {
        throw new UnsupportedOperationException();
    }

    public final com.yogento.api.models.catalog.category.magento.MagentoCategory getMagentoCategory() {
        return magentoCategory;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getMagentoCategory().hashCode();
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
    public void setFieldValue(final org.apache.thrift.TFieldIdEnum field, Object value) {
        throw new UnsupportedOperationException();
    }

    @Override
    public String toString() {
        final com.google.common.base.Objects.ToStringHelper helper = com.google.common.base.Objects.toStringHelper(this);
        helper.add("magento_category", getMagentoCategory());
        return helper.toString();
    }

    @Override
    public void write(final org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
        write(oprot, org.apache.thrift.protocol.TType.STRUCT);
    }

    public void write(final org.apache.thrift.protocol.TProtocol oprot, final byte writeAsTType) throws org.apache.thrift.TException {
        switch (writeAsTType) {
            case org.apache.thrift.protocol.TType.VOID: {
                getMagentoCategory().write(oprot);
                break;
            }

            case org.apache.thrift.protocol.TType.LIST:
                oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.VOID, 1));

                getMagentoCategory().write(oprot);

                oprot.writeListEnd();
                break;

            case org.apache.thrift.protocol.TType.STRUCT:
            default:
                oprot.writeStructBegin(new org.apache.thrift.protocol.TStruct("Category"));

                oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("magento_category", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                getMagentoCategory().write(oprot);
                oprot.writeFieldEnd();

                oprot.writeFieldStop();

                oprot.writeStructEnd();
                break;
        }
    }

    private final com.yogento.api.models.catalog.category.magento.MagentoCategory magentoCategory;
}
