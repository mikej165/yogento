package com.yogento.api.models.sales.order.magento;

@SuppressWarnings({"serial"})
public class MagentoOrderStatusHistory implements org.apache.thrift.TBase<MagentoOrderStatusHistory, org.apache.thrift.TFieldIdEnum> {
    public static class Builder {
        public Builder() {
        }

        public Builder(final MagentoOrderStatusHistory other) {
            this.comment = other.getComment();
            this.createdAt = other.getCreatedAt();
            this.entityName = other.getEntityName();
            this.isCustomerNotified = other.isCustomerNotified();
            this.isVisibleOnFront = other.isVisibleOnFront();
            this.parentId = other.getParentId();
            this.status = other.getStatus();
            this.storeId = other.getStoreId();
        }

        protected MagentoOrderStatusHistory _build(final String comment, final org.joda.time.DateTime createdAt, final String entityName, final Boolean isCustomerNotified, final Boolean isVisibleOnFront, final Integer parentId, final com.yogento.api.models.sales.order.magento.MagentoOrderStatus status, final Integer storeId) {
            return new MagentoOrderStatusHistory(comment, createdAt, entityName, isCustomerNotified, isVisibleOnFront, parentId, status, storeId);
        }

        public MagentoOrderStatusHistory build() {
            return _build(comment, createdAt, entityName, isCustomerNotified, isVisibleOnFront, parentId, status, storeId);
        }

        public Builder setComment(final String comment) {
            this.comment = comment;
            return this;
        }

        public Builder setCreatedAt(final org.joda.time.DateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Builder setEntityName(final String entityName) {
            this.entityName = entityName;
            return this;
        }

        public Builder setIsCustomerNotified(final Boolean isCustomerNotified) {
            this.isCustomerNotified = isCustomerNotified;
            return this;
        }

        public Builder setIsVisibleOnFront(final Boolean isVisibleOnFront) {
            this.isVisibleOnFront = isVisibleOnFront;
            return this;
        }

        public Builder setParentId(final Integer parentId) {
            this.parentId = parentId;
            return this;
        }

        public Builder setStatus(final com.yogento.api.models.sales.order.magento.MagentoOrderStatus status) {
            this.status = status;
            return this;
        }

        public Builder setStoreId(final Integer storeId) {
            this.storeId = storeId;
            return this;
        }

        private String comment;
        private org.joda.time.DateTime createdAt;
        private String entityName;
        private Boolean isCustomerNotified;
        private Boolean isVisibleOnFront;
        private Integer parentId;
        private com.yogento.api.models.sales.order.magento.MagentoOrderStatus status;
        private Integer storeId;
    }

    public MagentoOrderStatusHistory(final MagentoOrderStatusHistory other) {
        this(other.getComment(), other.getCreatedAt(), other.getEntityName(), other.isCustomerNotified(), other.isVisibleOnFront(), other.getParentId(), other.getStatus(), other.getStoreId());
    }

    public MagentoOrderStatusHistory(final org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
        this(iprot, org.apache.thrift.protocol.TType.STRUCT);
    }

    public MagentoOrderStatusHistory(final org.apache.thrift.protocol.TProtocol iprot, final byte readAsTType) throws org.apache.thrift.TException {
        String comment = null;
        org.joda.time.DateTime createdAt = null;
        String entityName = null;
        Boolean isCustomerNotified = null;
        Boolean isVisibleOnFront = null;
        Integer parentId = null;
        com.yogento.api.models.sales.order.magento.MagentoOrderStatus status = null;
        Integer storeId = null;

        switch (readAsTType) {
            case org.apache.thrift.protocol.TType.LIST:
                iprot.readListBegin();
                comment = iprot.readString();
                createdAt = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDateTime() : new org.joda.time.DateTime(iprot.readI64());
                entityName = iprot.readString();
                isCustomerNotified = iprot.readBool();
                isVisibleOnFront = iprot.readBool();
                try {
                    parentId = iprot.readI32();
                } catch (NumberFormatException e) {
                }
                status = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readEnum(com.yogento.api.models.sales.order.magento.MagentoOrderStatus.class) : com.yogento.api.models.sales.order.magento.MagentoOrderStatus.valueOf(iprot.readString().trim().toUpperCase());
                try {
                    storeId = iprot.readI32();
                } catch (NumberFormatException e) {
                }
                iprot.readListEnd();
                break;

            case org.apache.thrift.protocol.TType.STRUCT:
            default:
                iprot.readStructBegin();
                while (true) {
                    org.apache.thrift.protocol.TField ifield = iprot.readFieldBegin();
                    if (ifield.type == org.apache.thrift.protocol.TType.STOP) {
                        break;
                    } else                 if (ifield.name.equals("comment")) {
                        comment = iprot.readString();
                    } else if (ifield.name.equals("created_at")) {
                        createdAt = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDateTime() : new org.joda.time.DateTime(iprot.readI64());
                    } else if (ifield.name.equals("entity_name")) {
                        entityName = iprot.readString();
                    } else if (ifield.name.equals("is_customer_notified")) {
                        isCustomerNotified = iprot.readBool();
                    } else if (ifield.name.equals("is_visible_on_front")) {
                        isVisibleOnFront = iprot.readBool();
                    } else if (ifield.name.equals("parent_id")) {
                        try {
                            parentId = iprot.readI32();
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("status")) {
                        status = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readEnum(com.yogento.api.models.sales.order.magento.MagentoOrderStatus.class) : com.yogento.api.models.sales.order.magento.MagentoOrderStatus.valueOf(iprot.readString().trim().toUpperCase());
                    } else if (ifield.name.equals("store_id")) {
                        try {
                            storeId = iprot.readI32();
                        } catch (NumberFormatException e) {
                        }
                    }
                    iprot.readFieldEnd();
                }
                iprot.readStructEnd();
                break;
        }

        this.comment = comment;
        this.createdAt = com.google.common.base.Preconditions.checkNotNull(createdAt);
        this.entityName = entityName;
        this.isCustomerNotified = isCustomerNotified;
        this.isVisibleOnFront = isVisibleOnFront;
        this.parentId = parentId;
        this.status = com.google.common.base.Preconditions.checkNotNull(status);
        this.storeId = storeId;
    }

    public MagentoOrderStatusHistory(final org.joda.time.DateTime createdAt, final com.yogento.api.models.sales.order.magento.MagentoOrderStatus status) {
        this.comment = null;
        this.createdAt = com.google.common.base.Preconditions.checkNotNull(createdAt);
        this.entityName = null;
        this.isCustomerNotified = null;
        this.isVisibleOnFront = null;
        this.parentId = null;
        this.status = com.google.common.base.Preconditions.checkNotNull(status);
        this.storeId = null;
    }

    public MagentoOrderStatusHistory(final String comment, final org.joda.time.DateTime createdAt, final String entityName, final Boolean isCustomerNotified, final Boolean isVisibleOnFront, final Integer parentId, final com.yogento.api.models.sales.order.magento.MagentoOrderStatus status, final Integer storeId) {
        this.comment = comment;
        this.createdAt = com.google.common.base.Preconditions.checkNotNull(createdAt);
        this.entityName = entityName;
        this.isCustomerNotified = isCustomerNotified;
        this.isVisibleOnFront = isVisibleOnFront;
        this.parentId = parentId;
        this.status = com.google.common.base.Preconditions.checkNotNull(status);
        this.storeId = storeId;
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException();
    }

    @Override
    public int compareTo(final MagentoOrderStatusHistory other) {
        throw new UnsupportedOperationException();
    }

    @Override
    public org.apache.thrift.TBase<MagentoOrderStatusHistory, org.apache.thrift.TFieldIdEnum> deepCopy() {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean equals(final Object otherObject) {
        if (otherObject == this) {
            return true;
        } else if (!(otherObject instanceof MagentoOrderStatusHistory)) {
            return false;
        }

        final MagentoOrderStatusHistory other = (MagentoOrderStatusHistory)otherObject;
        return
            ((getComment() == null && other.getComment() == null) ||
            (getComment() != null && other.getComment() != null &&
            getComment().equals(other.getComment()))) &&
            getCreatedAt().equals(other.getCreatedAt()) &&
            ((getEntityName() == null && other.getEntityName() == null) ||
            (getEntityName() != null && other.getEntityName() != null &&
            getEntityName().equals(other.getEntityName()))) &&
            ((isCustomerNotified() == null && other.isCustomerNotified() == null) ||
            (isCustomerNotified() != null && other.isCustomerNotified() != null &&
            isCustomerNotified().equals(other.isCustomerNotified()))) &&
            ((isVisibleOnFront() == null && other.isVisibleOnFront() == null) ||
            (isVisibleOnFront() != null && other.isVisibleOnFront() != null &&
            isVisibleOnFront().equals(other.isVisibleOnFront()))) &&
            ((getParentId() == null && other.getParentId() == null) ||
            (getParentId() != null && other.getParentId() != null &&
            getParentId().equals(other.getParentId()))) &&
            getStatus().equals(other.getStatus()) &&
            ((getStoreId() == null && other.getStoreId() == null) ||
            (getStoreId() != null && other.getStoreId() != null &&
            getStoreId().equals(other.getStoreId())));
    }

    @Override
    public org.apache.thrift.TFieldIdEnum fieldForId(final int fieldId) {
        throw new UnsupportedOperationException();
    }

    public Object get(final String fieldName) {
        if (fieldName.equals("comment")) {
            return getComment();
        } else if (fieldName.equals("created_at")) {
            return getCreatedAt();
        } else if (fieldName.equals("entity_name")) {
            return getEntityName();
        } else if (fieldName.equals("is_customer_notified")) {
            return isCustomerNotified();
        } else if (fieldName.equals("is_visible_on_front")) {
            return isVisibleOnFront();
        } else if (fieldName.equals("parent_id")) {
            return getParentId();
        } else if (fieldName.equals("status")) {
            return getStatus();
        } else if (fieldName.equals("store_id")) {
            return getStoreId();
        }
        return null;
    }

    public final String getComment() {
        return comment;
    }

    public final org.joda.time.DateTime getCreatedAt() {
        return createdAt;
    }

    public final String getEntityName() {
        return entityName;
    }

    @Override
    public Object getFieldValue(final org.apache.thrift.TFieldIdEnum field) {
        throw new UnsupportedOperationException();
    }

    public final Integer getParentId() {
        return parentId;
    }

    public final com.yogento.api.models.sales.order.magento.MagentoOrderStatus getStatus() {
        return status;
    }

    public final Integer getStoreId() {
        return storeId;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        if (getComment() != null) {
            hashCode = 31 * hashCode + getComment().hashCode();
        }
        hashCode = 31 * hashCode + getCreatedAt().hashCode();
        if (getEntityName() != null) {
            hashCode = 31 * hashCode + getEntityName().hashCode();
        }
        if (isCustomerNotified() != null) {
            hashCode = 31 * hashCode + (isCustomerNotified() ? 1 : 0);
        }
        if (isVisibleOnFront() != null) {
            hashCode = 31 * hashCode + (isVisibleOnFront() ? 1 : 0);
        }
        if (getParentId() != null) {
            hashCode = 31 * hashCode + ((int)getParentId());
        }
        hashCode = 31 * hashCode + getStatus().ordinal();
        if (getStoreId() != null) {
            hashCode = 31 * hashCode + ((int)getStoreId());
        }
        return hashCode;
    }

    public final Boolean isCustomerNotified() {
        return isCustomerNotified;
    }

    @Override
    public boolean isSet(final org.apache.thrift.TFieldIdEnum field) {
        throw new UnsupportedOperationException();
    }

    public final Boolean isVisibleOnFront() {
        return isVisibleOnFront;
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
        if (getComment() != null) {
            helper.add("comment", getComment());
        }
        helper.add("created_at", getCreatedAt());
        if (getEntityName() != null) {
            helper.add("entity_name", getEntityName());
        }
        if (isCustomerNotified() != null) {
            helper.add("is_customer_notified", isCustomerNotified());
        }
        if (isVisibleOnFront() != null) {
            helper.add("is_visible_on_front", isVisibleOnFront());
        }
        if (getParentId() != null) {
            helper.add("parent_id", getParentId());
        }
        helper.add("status", getStatus());
        if (getStoreId() != null) {
            helper.add("store_id", getStoreId());
        }
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
                oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.VOID, 8));

                if (getComment() != null) {
                    oprot.writeString(getComment());
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDateTime(getCreatedAt()); } else { oprot.writeI64(getCreatedAt().getMillis()); }

                if (getEntityName() != null) {
                    oprot.writeString(getEntityName());
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (isCustomerNotified() != null) {
                    oprot.writeBool(isCustomerNotified());
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (isVisibleOnFront() != null) {
                    oprot.writeBool(isVisibleOnFront());
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getParentId() != null) {
                    oprot.writeI32(getParentId());
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeEnum(getStatus()); } else { oprot.writeString(getStatus().toString()); }

                if (getStoreId() != null) {
                    oprot.writeI32(getStoreId());
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                oprot.writeListEnd();
                break;

            case org.apache.thrift.protocol.TType.STRUCT:
            default:
                oprot.writeStructBegin(new org.apache.thrift.protocol.TStruct("MagentoOrderStatusHistory"));

                if (getComment() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("comment", org.apache.thrift.protocol.TType.STRING, (short)-1));
                    oprot.writeString(getComment());
                    oprot.writeFieldEnd();
                }

                oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("created_at", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDateTime(getCreatedAt()); } else { oprot.writeI64(getCreatedAt().getMillis()); }
                oprot.writeFieldEnd();

                if (getEntityName() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("entity_name", org.apache.thrift.protocol.TType.STRING, (short)-1));
                    oprot.writeString(getEntityName());
                    oprot.writeFieldEnd();
                }

                if (isCustomerNotified() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("is_customer_notified", org.apache.thrift.protocol.TType.BOOL, (short)-1));
                    oprot.writeBool(isCustomerNotified());
                    oprot.writeFieldEnd();
                }

                if (isVisibleOnFront() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("is_visible_on_front", org.apache.thrift.protocol.TType.BOOL, (short)-1));
                    oprot.writeBool(isVisibleOnFront());
                    oprot.writeFieldEnd();
                }

                if (getParentId() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("parent_id", org.apache.thrift.protocol.TType.I32, (short)-1));
                    oprot.writeI32(getParentId());
                    oprot.writeFieldEnd();
                }

                oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("status", org.apache.thrift.protocol.TType.STRING, (short)-1));
                if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeEnum(getStatus()); } else { oprot.writeString(getStatus().toString()); }
                oprot.writeFieldEnd();

                if (getStoreId() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("store_id", org.apache.thrift.protocol.TType.I32, (short)-1));
                    oprot.writeI32(getStoreId());
                    oprot.writeFieldEnd();
                }

                oprot.writeFieldStop();

                oprot.writeStructEnd();
                break;
        }
    }

    private final String comment;
    private final org.joda.time.DateTime createdAt;
    private final String entityName;
    private final Boolean isCustomerNotified;
    private final Boolean isVisibleOnFront;
    private final Integer parentId;
    private final com.yogento.api.models.sales.order.magento.MagentoOrderStatus status;
    private final Integer storeId;
}
