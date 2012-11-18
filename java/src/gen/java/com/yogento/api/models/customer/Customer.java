package com.yogento.api.models.customer;

@SuppressWarnings({"serial"})
public class Customer implements org.apache.thrift.TBase<Customer, org.apache.thrift.TFieldIdEnum> {
    public static class Builder {
        public Builder() {
        }

        public Builder(final Customer other) {
            this.magentoCustomer = other.getMagentoCustomer();
        }

        protected Customer _build(final com.yogento.api.models.customer.magento.MagentoCustomer magentoCustomer) {
            return new Customer(magentoCustomer);
        }

        public Customer build() {
            return _build(magentoCustomer);
        }

        public Builder setMagentoCustomer(final com.yogento.api.models.customer.magento.MagentoCustomer magentoCustomer) {
            this.magentoCustomer = magentoCustomer;
            return this;
        }

        private com.yogento.api.models.customer.magento.MagentoCustomer magentoCustomer;
    }

    public Customer(final Customer other) {
        this(other.getMagentoCustomer());
    }

    public Customer(final org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
        this(iprot, org.apache.thrift.protocol.TType.STRUCT);
    }

    public Customer(final org.apache.thrift.protocol.TProtocol iprot, final byte readAsTType) throws org.apache.thrift.TException {
        com.yogento.api.models.customer.magento.MagentoCustomer magentoCustomer = null;

        switch (readAsTType) {
            case org.apache.thrift.protocol.TType.LIST:
                iprot.readListBegin();
                magentoCustomer = new com.yogento.api.models.customer.magento.MagentoCustomer(iprot);
                iprot.readListEnd();
                break;

            case org.apache.thrift.protocol.TType.STRUCT:
            default:
                iprot.readStructBegin();
                while (true) {
                    org.apache.thrift.protocol.TField ifield = iprot.readFieldBegin();
                    if (ifield.type == org.apache.thrift.protocol.TType.STOP) {
                        break;
                    } else                 if (ifield.name.equals("magento_customer")) {
                        magentoCustomer = new com.yogento.api.models.customer.magento.MagentoCustomer(iprot);
                    }
                    iprot.readFieldEnd();
                }
                iprot.readStructEnd();
                break;
        }

        this.magentoCustomer = com.google.common.base.Preconditions.checkNotNull(magentoCustomer);
    }

    public Customer(final com.yogento.api.models.customer.magento.MagentoCustomer magentoCustomer) {
        this.magentoCustomer = com.google.common.base.Preconditions.checkNotNull(magentoCustomer);
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException();
    }

    @Override
    public int compareTo(final Customer other) {
        throw new UnsupportedOperationException();
    }

    @Override
    public org.apache.thrift.TBase<Customer, org.apache.thrift.TFieldIdEnum> deepCopy() {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean equals(final Object otherObject) {
        if (otherObject == this) {
            return true;
        } else if (!(otherObject instanceof Customer)) {
            return false;
        }

        final Customer other = (Customer)otherObject;
        return
            getMagentoCustomer().equals(other.getMagentoCustomer());
    }

    @Override
    public org.apache.thrift.TFieldIdEnum fieldForId(final int fieldId) {
        throw new UnsupportedOperationException();
    }

    public Object get(final String fieldName) {
        if (fieldName.equals("magento_customer")) {
            return getMagentoCustomer();
        }
        return null;
    }

    @Override
    public Object getFieldValue(final org.apache.thrift.TFieldIdEnum field) {
        throw new UnsupportedOperationException();
    }

    public final com.yogento.api.models.customer.magento.MagentoCustomer getMagentoCustomer() {
        return magentoCustomer;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getMagentoCustomer().hashCode();
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
        helper.add("magento_customer", getMagentoCustomer());
        return helper.toString();
    }

    @Override
    public void write(final org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
        write(oprot, org.apache.thrift.protocol.TType.STRUCT);
    }

    public void write(final org.apache.thrift.protocol.TProtocol oprot, final byte writeAsTType) throws org.apache.thrift.TException {
        switch (writeAsTType) {
            case org.apache.thrift.protocol.TType.VOID: {
                getMagentoCustomer().write(oprot);
                break;
            }

            case org.apache.thrift.protocol.TType.LIST:
                oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.VOID, 1));

                getMagentoCustomer().write(oprot);

                oprot.writeListEnd();
                break;

            case org.apache.thrift.protocol.TType.STRUCT:
            default:
                oprot.writeStructBegin(new org.apache.thrift.protocol.TStruct("Customer"));

                oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("magento_customer", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                getMagentoCustomer().write(oprot);
                oprot.writeFieldEnd();

                oprot.writeFieldStop();

                oprot.writeStructEnd();
                break;
        }
    }

    private final com.yogento.api.models.customer.magento.MagentoCustomer magentoCustomer;
}
