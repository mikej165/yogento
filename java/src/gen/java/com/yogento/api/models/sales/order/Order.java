package com.yogento.api.models.sales.order;

@SuppressWarnings({"serial"})
public class Order implements org.apache.thrift.TBase<Order, org.apache.thrift.TFieldIdEnum> {
    public static class Builder {
        public Builder() {
        }

        public Builder(final Order other) {
            this.magentoOrder = other.getMagentoOrder();
        }

        protected Order _build(final com.yogento.api.models.sales.order.magento.MagentoOrder magentoOrder) {
            return new Order(magentoOrder);
        }

        public Order build() {
            return _build(magentoOrder);
        }

        public Builder setMagentoOrder(final com.yogento.api.models.sales.order.magento.MagentoOrder magentoOrder) {
            this.magentoOrder = magentoOrder;
            return this;
        }

        private com.yogento.api.models.sales.order.magento.MagentoOrder magentoOrder;
    }

    public Order(final Order other) {
        this(other.getMagentoOrder());
    }

    public Order(final org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
        this(iprot, org.apache.thrift.protocol.TType.STRUCT);
    }

    public Order(final org.apache.thrift.protocol.TProtocol iprot, final byte readAsTType) throws org.apache.thrift.TException {
        com.yogento.api.models.sales.order.magento.MagentoOrder magentoOrder = null;

        switch (readAsTType) {
            case org.apache.thrift.protocol.TType.LIST:
                iprot.readListBegin();
                magentoOrder = new com.yogento.api.models.sales.order.magento.MagentoOrder(iprot);
                iprot.readListEnd();
                break;

            case org.apache.thrift.protocol.TType.STRUCT:
            default:
                iprot.readStructBegin();
                while (true) {
                    org.apache.thrift.protocol.TField ifield = iprot.readFieldBegin();
                    if (ifield.type == org.apache.thrift.protocol.TType.STOP) {
                        break;
                    } else                 if (ifield.name.equals("magento_order")) {
                        magentoOrder = new com.yogento.api.models.sales.order.magento.MagentoOrder(iprot);
                    }
                    iprot.readFieldEnd();
                }
                iprot.readStructEnd();
                break;
        }

        this.magentoOrder = com.google.common.base.Preconditions.checkNotNull(magentoOrder);
    }

    public Order(final com.yogento.api.models.sales.order.magento.MagentoOrder magentoOrder) {
        this.magentoOrder = com.google.common.base.Preconditions.checkNotNull(magentoOrder);
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException();
    }

    @Override
    public int compareTo(final Order other) {
        throw new UnsupportedOperationException();
    }

    @Override
    public org.apache.thrift.TBase<Order, org.apache.thrift.TFieldIdEnum> deepCopy() {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean equals(final Object otherObject) {
        if (otherObject == this) {
            return true;
        } else if (!(otherObject instanceof Order)) {
            return false;
        }

        final Order other = (Order)otherObject;
        return
            getMagentoOrder().equals(other.getMagentoOrder());
    }

    @Override
    public org.apache.thrift.TFieldIdEnum fieldForId(final int fieldId) {
        throw new UnsupportedOperationException();
    }

    public Object get(final String fieldName) {
        if (fieldName.equals("magento_order")) {
            return getMagentoOrder();
        }
        return null;
    }

    @Override
    public Object getFieldValue(final org.apache.thrift.TFieldIdEnum field) {
        throw new UnsupportedOperationException();
    }

    public final com.yogento.api.models.sales.order.magento.MagentoOrder getMagentoOrder() {
        return magentoOrder;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getMagentoOrder().hashCode();
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
        helper.add("magento_order", getMagentoOrder());
        return helper.toString();
    }

    @Override
    public void write(final org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
        write(oprot, org.apache.thrift.protocol.TType.STRUCT);
    }

    public void write(final org.apache.thrift.protocol.TProtocol oprot, final byte writeAsTType) throws org.apache.thrift.TException {
        switch (writeAsTType) {
            case org.apache.thrift.protocol.TType.VOID: {
                getMagentoOrder().write(oprot);
                break;
            }

            case org.apache.thrift.protocol.TType.LIST:
                oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.VOID, 1));

                getMagentoOrder().write(oprot);

                oprot.writeListEnd();
                break;

            case org.apache.thrift.protocol.TType.STRUCT:
            default:
                oprot.writeStructBegin(new org.apache.thrift.protocol.TStruct("Order"));

                oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("magento_order", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                getMagentoOrder().write(oprot);
                oprot.writeFieldEnd();

                oprot.writeFieldStop();

                oprot.writeStructEnd();
                break;
        }
    }

    private final com.yogento.api.models.sales.order.magento.MagentoOrder magentoOrder;
}
