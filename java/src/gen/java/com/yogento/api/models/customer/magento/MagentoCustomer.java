package com.yogento.api.models.customer.magento;

@SuppressWarnings({"serial"})
public class MagentoCustomer implements org.apache.thrift.TBase<MagentoCustomer, org.apache.thrift.TFieldIdEnum> {
    public static class Builder {
        public Builder() {
        }

        public Builder(final MagentoCustomer other) {
            this.addresses = other.getAddresses();
            this.createdAt = other.getCreatedAt();
            this.confirmation = other.isConfirmation();
            this.customerId = other.getCustomerId();
            this.dob = other.getDob();
            this.email = other.getEmail();
            this.firstname = other.getFirstname();
            this.groupId = other.getGroupId();
            this.incrementId = other.getIncrementId();
            this.lastname = other.getLastname();
            this.middlename = other.getMiddlename();
            this.prefix = other.getPrefix();
            this.suffix = other.getSuffix();
            this.storeId = other.getStoreId();
            this.taxvat = other.getTaxvat();
            this.updatedAt = other.getUpdatedAt();
            this.websiteId = other.getWebsiteId();
        }

        protected MagentoCustomer _build(final com.google.common.collect.ImmutableSet<com.yogento.api.models.customer.magento.MagentoCustomerAddress> addresses, final org.joda.time.DateTime createdAt, final Boolean confirmation, final Integer customerId, final String dob, final String email, final String firstname, final Integer groupId, final String incrementId, final String lastname, final String middlename, final String prefix, final String suffix, final Integer storeId, final String taxvat, final org.joda.time.DateTime updatedAt, final Integer websiteId) {
            return new MagentoCustomer(addresses, createdAt, confirmation, customerId, dob, email, firstname, groupId, incrementId, lastname, middlename, prefix, suffix, storeId, taxvat, updatedAt, websiteId);
        }

        public MagentoCustomer build() {
            return _build(addresses, createdAt, confirmation, customerId, dob, email, firstname, groupId, incrementId, lastname, middlename, prefix, suffix, storeId, taxvat, updatedAt, websiteId);
        }

        public Builder setAddresses(final com.google.common.collect.ImmutableSet<com.yogento.api.models.customer.magento.MagentoCustomerAddress> addresses) {
            this.addresses = addresses;
            return this;
        }

        public Builder setConfirmation(final Boolean confirmation) {
            this.confirmation = confirmation;
            return this;
        }

        public Builder setCreatedAt(final org.joda.time.DateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Builder setCustomerId(final Integer customerId) {
            this.customerId = customerId;
            return this;
        }

        public Builder setDob(final String dob) {
            this.dob = dob;
            return this;
        }

        public Builder setEmail(final String email) {
            this.email = email;
            return this;
        }

        public Builder setFirstname(final String firstname) {
            this.firstname = firstname;
            return this;
        }

        public Builder setGroupId(final Integer groupId) {
            this.groupId = groupId;
            return this;
        }

        public Builder setIncrementId(final String incrementId) {
            this.incrementId = incrementId;
            return this;
        }

        public Builder setLastname(final String lastname) {
            this.lastname = lastname;
            return this;
        }

        public Builder setMiddlename(final String middlename) {
            this.middlename = middlename;
            return this;
        }

        public Builder setPrefix(final String prefix) {
            this.prefix = prefix;
            return this;
        }

        public Builder setStoreId(final Integer storeId) {
            this.storeId = storeId;
            return this;
        }

        public Builder setSuffix(final String suffix) {
            this.suffix = suffix;
            return this;
        }

        public Builder setTaxvat(final String taxvat) {
            this.taxvat = taxvat;
            return this;
        }

        public Builder setUpdatedAt(final org.joda.time.DateTime updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        public Builder setWebsiteId(final Integer websiteId) {
            this.websiteId = websiteId;
            return this;
        }

        private com.google.common.collect.ImmutableSet<com.yogento.api.models.customer.magento.MagentoCustomerAddress> addresses;
        private org.joda.time.DateTime createdAt;
        private Boolean confirmation;
        private Integer customerId;
        private String dob;
        private String email;
        private String firstname;
        private Integer groupId;
        private String incrementId;
        private String lastname;
        private String middlename;
        private String prefix;
        private String suffix;
        private Integer storeId;
        private String taxvat;
        private org.joda.time.DateTime updatedAt;
        private Integer websiteId;
    }

    public MagentoCustomer(final MagentoCustomer other) {
        this(other.getAddresses(), other.getCreatedAt(), other.isConfirmation(), other.getCustomerId(), other.getDob(), other.getEmail(), other.getFirstname(), other.getGroupId(), other.getIncrementId(), other.getLastname(), other.getMiddlename(), other.getPrefix(), other.getSuffix(), other.getStoreId(), other.getTaxvat(), other.getUpdatedAt(), other.getWebsiteId());
    }

    public MagentoCustomer(final org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
        this(iprot, org.apache.thrift.protocol.TType.STRUCT);
    }

    public MagentoCustomer(final org.apache.thrift.protocol.TProtocol iprot, final byte readAsTType) throws org.apache.thrift.TException {
        com.google.common.collect.ImmutableSet<com.yogento.api.models.customer.magento.MagentoCustomerAddress> addresses = null;
        org.joda.time.DateTime createdAt = null;
        Boolean confirmation = null;
        Integer customerId = null;
        String dob = null;
        String email = null;
        String firstname = null;
        Integer groupId = null;
        String incrementId = null;
        String lastname = null;
        String middlename = null;
        String prefix = null;
        String suffix = null;
        Integer storeId = null;
        String taxvat = null;
        org.joda.time.DateTime updatedAt = null;
        Integer websiteId = null;

        switch (readAsTType) {
            case org.apache.thrift.protocol.TType.LIST:
                iprot.readListBegin();
                addresses = (new com.google.common.base.Function<org.apache.thrift.protocol.TProtocol, com.google.common.collect.ImmutableSet<com.yogento.api.models.customer.magento.MagentoCustomerAddress>>() {
                    @Override
                    public com.google.common.collect.ImmutableSet<com.yogento.api.models.customer.magento.MagentoCustomerAddress> apply(org.apache.thrift.protocol.TProtocol iprot) {
                        try {
                            org.apache.thrift.protocol.TSet sequenceBegin = iprot.readSetBegin();
                            java.util.Set<com.yogento.api.models.customer.magento.MagentoCustomerAddress> sequence = new java.util.LinkedHashSet<com.yogento.api.models.customer.magento.MagentoCustomerAddress>();
                            for (int elementI = 0; elementI < sequenceBegin.size; elementI++) {
                                sequence.add(new com.yogento.api.models.customer.magento.MagentoCustomerAddress(iprot));
                            }
                            iprot.readSetEnd();
                            return com.google.common.collect.ImmutableSet.copyOf(sequence);
                        } catch (org.apache.thrift.TException e) {
                            return com.google.common.collect.ImmutableSet.of();
                        }
                    }
                }).apply(iprot);
                createdAt = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDateTime() : new org.joda.time.DateTime(iprot.readI64());
                confirmation = iprot.readBool();
                try {
                    customerId = iprot.readI32();
                } catch (NumberFormatException e) {
                }
                dob = iprot.readString();
                email = iprot.readString();
                firstname = iprot.readString();
                try {
                    groupId = iprot.readI32();
                } catch (NumberFormatException e) {
                }
                incrementId = iprot.readString();
                lastname = iprot.readString();
                middlename = iprot.readString();
                prefix = iprot.readString();
                suffix = iprot.readString();
                try {
                    storeId = iprot.readI32();
                } catch (NumberFormatException e) {
                }
                taxvat = iprot.readString();
                updatedAt = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDateTime() : new org.joda.time.DateTime(iprot.readI64());
                try {
                    websiteId = iprot.readI32();
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
                    } else                 if (ifield.name.equals("addresses")) {
                        addresses = (new com.google.common.base.Function<org.apache.thrift.protocol.TProtocol, com.google.common.collect.ImmutableSet<com.yogento.api.models.customer.magento.MagentoCustomerAddress>>() {
                            @Override
                            public com.google.common.collect.ImmutableSet<com.yogento.api.models.customer.magento.MagentoCustomerAddress> apply(org.apache.thrift.protocol.TProtocol iprot) {
                                try {
                                    org.apache.thrift.protocol.TSet sequenceBegin = iprot.readSetBegin();
                                    java.util.Set<com.yogento.api.models.customer.magento.MagentoCustomerAddress> sequence = new java.util.LinkedHashSet<com.yogento.api.models.customer.magento.MagentoCustomerAddress>();
                                    for (int elementI = 0; elementI < sequenceBegin.size; elementI++) {
                                        sequence.add(new com.yogento.api.models.customer.magento.MagentoCustomerAddress(iprot));
                                    }
                                    iprot.readSetEnd();
                                    return com.google.common.collect.ImmutableSet.copyOf(sequence);
                                } catch (org.apache.thrift.TException e) {
                                    return com.google.common.collect.ImmutableSet.of();
                                }
                            }
                        }).apply(iprot);
                    } else if (ifield.name.equals("created_at")) {
                        createdAt = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDateTime() : new org.joda.time.DateTime(iprot.readI64());
                    } else if (ifield.name.equals("confirmation")) {
                        confirmation = iprot.readBool();
                    } else if (ifield.name.equals("customer_id")) {
                        try {
                            customerId = iprot.readI32();
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("dob")) {
                        dob = iprot.readString();
                    } else if (ifield.name.equals("email")) {
                        email = iprot.readString();
                    } else if (ifield.name.equals("firstname")) {
                        firstname = iprot.readString();
                    } else if (ifield.name.equals("group_id")) {
                        try {
                            groupId = iprot.readI32();
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("increment_id")) {
                        incrementId = iprot.readString();
                    } else if (ifield.name.equals("lastname")) {
                        lastname = iprot.readString();
                    } else if (ifield.name.equals("middlename")) {
                        middlename = iprot.readString();
                    } else if (ifield.name.equals("prefix")) {
                        prefix = iprot.readString();
                    } else if (ifield.name.equals("suffix")) {
                        suffix = iprot.readString();
                    } else if (ifield.name.equals("store_id")) {
                        try {
                            storeId = iprot.readI32();
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("taxvat")) {
                        taxvat = iprot.readString();
                    } else if (ifield.name.equals("updated_at")) {
                        updatedAt = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDateTime() : new org.joda.time.DateTime(iprot.readI64());
                    } else if (ifield.name.equals("website_id")) {
                        try {
                            websiteId = iprot.readI32();
                        } catch (NumberFormatException e) {
                        }
                    }
                    iprot.readFieldEnd();
                }
                iprot.readStructEnd();
                break;
        }

        this.addresses = addresses;
        this.createdAt = com.google.common.base.Preconditions.checkNotNull(createdAt);
        this.confirmation = confirmation;
        this.customerId = customerId;
        this.dob = dob;
        this.email = email;
        this.firstname = firstname;
        this.groupId = groupId;
        this.incrementId = com.google.common.base.Preconditions.checkNotNull(incrementId);
        this.lastname = lastname;
        this.middlename = middlename;
        this.prefix = prefix;
        this.suffix = suffix;
        this.storeId = storeId;
        this.taxvat = taxvat;
        this.updatedAt = com.google.common.base.Preconditions.checkNotNull(updatedAt);
        this.websiteId = websiteId;
    }

    public MagentoCustomer(final org.joda.time.DateTime createdAt, final String incrementId, final org.joda.time.DateTime updatedAt) {
        this.addresses = null;
        this.createdAt = com.google.common.base.Preconditions.checkNotNull(createdAt);
        this.confirmation = null;
        this.customerId = null;
        this.dob = null;
        this.email = null;
        this.firstname = null;
        this.groupId = null;
        this.incrementId = com.google.common.base.Preconditions.checkNotNull(incrementId);
        this.lastname = null;
        this.middlename = null;
        this.prefix = null;
        this.suffix = null;
        this.storeId = null;
        this.taxvat = null;
        this.updatedAt = com.google.common.base.Preconditions.checkNotNull(updatedAt);
        this.websiteId = null;
    }

    public MagentoCustomer(final com.google.common.collect.ImmutableSet<com.yogento.api.models.customer.magento.MagentoCustomerAddress> addresses, final org.joda.time.DateTime createdAt, final Boolean confirmation, final Integer customerId, final String dob, final String email, final String firstname, final Integer groupId, final String incrementId, final String lastname, final String middlename, final String prefix, final String suffix, final Integer storeId, final String taxvat, final org.joda.time.DateTime updatedAt, final Integer websiteId) {
        this.addresses = addresses;
        this.createdAt = com.google.common.base.Preconditions.checkNotNull(createdAt);
        this.confirmation = confirmation;
        this.customerId = customerId;
        this.dob = dob;
        this.email = email;
        this.firstname = firstname;
        this.groupId = groupId;
        this.incrementId = com.google.common.base.Preconditions.checkNotNull(incrementId);
        this.lastname = lastname;
        this.middlename = middlename;
        this.prefix = prefix;
        this.suffix = suffix;
        this.storeId = storeId;
        this.taxvat = taxvat;
        this.updatedAt = com.google.common.base.Preconditions.checkNotNull(updatedAt);
        this.websiteId = websiteId;
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException();
    }

    @Override
    public int compareTo(final MagentoCustomer other) {
        throw new UnsupportedOperationException();
    }

    @Override
    public org.apache.thrift.TBase<MagentoCustomer, org.apache.thrift.TFieldIdEnum> deepCopy() {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean equals(final Object otherObject) {
        if (otherObject == this) {
            return true;
        } else if (!(otherObject instanceof MagentoCustomer)) {
            return false;
        }

        final MagentoCustomer other = (MagentoCustomer)otherObject;
        return
            ((getAddresses() == null && other.getAddresses() == null) ||
            (getAddresses() != null && other.getAddresses() != null &&
            getAddresses().equals(other.getAddresses()))) &&
            getCreatedAt().equals(other.getCreatedAt()) &&
            ((isConfirmation() == null && other.isConfirmation() == null) ||
            (isConfirmation() != null && other.isConfirmation() != null &&
            isConfirmation().equals(other.isConfirmation()))) &&
            ((getCustomerId() == null && other.getCustomerId() == null) ||
            (getCustomerId() != null && other.getCustomerId() != null &&
            getCustomerId().equals(other.getCustomerId()))) &&
            ((getDob() == null && other.getDob() == null) ||
            (getDob() != null && other.getDob() != null &&
            getDob().equals(other.getDob()))) &&
            ((getEmail() == null && other.getEmail() == null) ||
            (getEmail() != null && other.getEmail() != null &&
            getEmail().equals(other.getEmail()))) &&
            ((getFirstname() == null && other.getFirstname() == null) ||
            (getFirstname() != null && other.getFirstname() != null &&
            getFirstname().equals(other.getFirstname()))) &&
            ((getGroupId() == null && other.getGroupId() == null) ||
            (getGroupId() != null && other.getGroupId() != null &&
            getGroupId().equals(other.getGroupId()))) &&
            getIncrementId().equals(other.getIncrementId()) &&
            ((getLastname() == null && other.getLastname() == null) ||
            (getLastname() != null && other.getLastname() != null &&
            getLastname().equals(other.getLastname()))) &&
            ((getMiddlename() == null && other.getMiddlename() == null) ||
            (getMiddlename() != null && other.getMiddlename() != null &&
            getMiddlename().equals(other.getMiddlename()))) &&
            ((getPrefix() == null && other.getPrefix() == null) ||
            (getPrefix() != null && other.getPrefix() != null &&
            getPrefix().equals(other.getPrefix()))) &&
            ((getSuffix() == null && other.getSuffix() == null) ||
            (getSuffix() != null && other.getSuffix() != null &&
            getSuffix().equals(other.getSuffix()))) &&
            ((getStoreId() == null && other.getStoreId() == null) ||
            (getStoreId() != null && other.getStoreId() != null &&
            getStoreId().equals(other.getStoreId()))) &&
            ((getTaxvat() == null && other.getTaxvat() == null) ||
            (getTaxvat() != null && other.getTaxvat() != null &&
            getTaxvat().equals(other.getTaxvat()))) &&
            getUpdatedAt().equals(other.getUpdatedAt()) &&
            ((getWebsiteId() == null && other.getWebsiteId() == null) ||
            (getWebsiteId() != null && other.getWebsiteId() != null &&
            getWebsiteId().equals(other.getWebsiteId())));
    }

    @Override
    public org.apache.thrift.TFieldIdEnum fieldForId(final int fieldId) {
        throw new UnsupportedOperationException();
    }

    public Object get(final String fieldName) {
        if (fieldName.equals("addresses")) {
            return getAddresses();
        } else if (fieldName.equals("created_at")) {
            return getCreatedAt();
        } else if (fieldName.equals("confirmation")) {
            return isConfirmation();
        } else if (fieldName.equals("customer_id")) {
            return getCustomerId();
        } else if (fieldName.equals("dob")) {
            return getDob();
        } else if (fieldName.equals("email")) {
            return getEmail();
        } else if (fieldName.equals("firstname")) {
            return getFirstname();
        } else if (fieldName.equals("group_id")) {
            return getGroupId();
        } else if (fieldName.equals("increment_id")) {
            return getIncrementId();
        } else if (fieldName.equals("lastname")) {
            return getLastname();
        } else if (fieldName.equals("middlename")) {
            return getMiddlename();
        } else if (fieldName.equals("prefix")) {
            return getPrefix();
        } else if (fieldName.equals("suffix")) {
            return getSuffix();
        } else if (fieldName.equals("store_id")) {
            return getStoreId();
        } else if (fieldName.equals("taxvat")) {
            return getTaxvat();
        } else if (fieldName.equals("updated_at")) {
            return getUpdatedAt();
        } else if (fieldName.equals("website_id")) {
            return getWebsiteId();
        }
        return null;
    }

    public final com.google.common.collect.ImmutableSet<com.yogento.api.models.customer.magento.MagentoCustomerAddress> getAddresses() {
        return addresses;
    }

    public final org.joda.time.DateTime getCreatedAt() {
        return createdAt;
    }

    public final Integer getCustomerId() {
        return customerId;
    }

    public final String getDob() {
        return dob;
    }

    public final String getEmail() {
        return email;
    }

    @Override
    public Object getFieldValue(final org.apache.thrift.TFieldIdEnum field) {
        throw new UnsupportedOperationException();
    }

    public final String getFirstname() {
        return firstname;
    }

    public final Integer getGroupId() {
        return groupId;
    }

    public final String getIncrementId() {
        return incrementId;
    }

    public final String getLastname() {
        return lastname;
    }

    public final String getMiddlename() {
        return middlename;
    }

    public final String getPrefix() {
        return prefix;
    }

    public final Integer getStoreId() {
        return storeId;
    }

    public final String getSuffix() {
        return suffix;
    }

    public final String getTaxvat() {
        return taxvat;
    }

    public final org.joda.time.DateTime getUpdatedAt() {
        return updatedAt;
    }

    public final Integer getWebsiteId() {
        return websiteId;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        if (getAddresses() != null) {
            hashCode = 31 * hashCode + getAddresses().hashCode();
        }
        hashCode = 31 * hashCode + getCreatedAt().hashCode();
        if (isConfirmation() != null) {
            hashCode = 31 * hashCode + (isConfirmation() ? 1 : 0);
        }
        if (getCustomerId() != null) {
            hashCode = 31 * hashCode + ((int)getCustomerId());
        }
        if (getDob() != null) {
            hashCode = 31 * hashCode + getDob().hashCode();
        }
        if (getEmail() != null) {
            hashCode = 31 * hashCode + getEmail().hashCode();
        }
        if (getFirstname() != null) {
            hashCode = 31 * hashCode + getFirstname().hashCode();
        }
        if (getGroupId() != null) {
            hashCode = 31 * hashCode + ((int)getGroupId());
        }
        hashCode = 31 * hashCode + getIncrementId().hashCode();
        if (getLastname() != null) {
            hashCode = 31 * hashCode + getLastname().hashCode();
        }
        if (getMiddlename() != null) {
            hashCode = 31 * hashCode + getMiddlename().hashCode();
        }
        if (getPrefix() != null) {
            hashCode = 31 * hashCode + getPrefix().hashCode();
        }
        if (getSuffix() != null) {
            hashCode = 31 * hashCode + getSuffix().hashCode();
        }
        if (getStoreId() != null) {
            hashCode = 31 * hashCode + ((int)getStoreId());
        }
        if (getTaxvat() != null) {
            hashCode = 31 * hashCode + getTaxvat().hashCode();
        }
        hashCode = 31 * hashCode + getUpdatedAt().hashCode();
        if (getWebsiteId() != null) {
            hashCode = 31 * hashCode + ((int)getWebsiteId());
        }
        return hashCode;
    }

    public final Boolean isConfirmation() {
        return confirmation;
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
        if (getAddresses() != null) {
            helper.add("addresses", getAddresses());
        }
        helper.add("created_at", getCreatedAt());
        if (isConfirmation() != null) {
            helper.add("confirmation", isConfirmation());
        }
        if (getCustomerId() != null) {
            helper.add("customer_id", getCustomerId());
        }
        if (getDob() != null) {
            helper.add("dob", getDob());
        }
        if (getEmail() != null) {
            helper.add("email", getEmail());
        }
        if (getFirstname() != null) {
            helper.add("firstname", getFirstname());
        }
        if (getGroupId() != null) {
            helper.add("group_id", getGroupId());
        }
        helper.add("increment_id", getIncrementId());
        if (getLastname() != null) {
            helper.add("lastname", getLastname());
        }
        if (getMiddlename() != null) {
            helper.add("middlename", getMiddlename());
        }
        if (getPrefix() != null) {
            helper.add("prefix", getPrefix());
        }
        if (getSuffix() != null) {
            helper.add("suffix", getSuffix());
        }
        if (getStoreId() != null) {
            helper.add("store_id", getStoreId());
        }
        if (getTaxvat() != null) {
            helper.add("taxvat", getTaxvat());
        }
        helper.add("updated_at", getUpdatedAt());
        if (getWebsiteId() != null) {
            helper.add("website_id", getWebsiteId());
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
                oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.VOID, 17));

                if (getAddresses() != null) {
                    oprot.writeSetBegin(new org.apache.thrift.protocol.TSet(org.apache.thrift.protocol.TType.STRUCT, getAddresses().size()));
                    for (com.yogento.api.models.customer.magento.MagentoCustomerAddress _iter0 : getAddresses()) {
                        _iter0.write(oprot);
                    }
                    oprot.writeSetEnd();
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDateTime(getCreatedAt()); } else { oprot.writeI64(getCreatedAt().getMillis()); }

                if (isConfirmation() != null) {
                    oprot.writeBool(isConfirmation());
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getCustomerId() != null) {
                    oprot.writeI32(getCustomerId());
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getDob() != null) {
                    oprot.writeString(getDob());
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getEmail() != null) {
                    oprot.writeString(getEmail());
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getFirstname() != null) {
                    oprot.writeString(getFirstname());
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getGroupId() != null) {
                    oprot.writeI32(getGroupId());
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                oprot.writeString(getIncrementId());

                if (getLastname() != null) {
                    oprot.writeString(getLastname());
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getMiddlename() != null) {
                    oprot.writeString(getMiddlename());
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getPrefix() != null) {
                    oprot.writeString(getPrefix());
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getSuffix() != null) {
                    oprot.writeString(getSuffix());
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getStoreId() != null) {
                    oprot.writeI32(getStoreId());
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getTaxvat() != null) {
                    oprot.writeString(getTaxvat());
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDateTime(getUpdatedAt()); } else { oprot.writeI64(getUpdatedAt().getMillis()); }

                if (getWebsiteId() != null) {
                    oprot.writeI32(getWebsiteId());
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                oprot.writeListEnd();
                break;

            case org.apache.thrift.protocol.TType.STRUCT:
            default:
                oprot.writeStructBegin(new org.apache.thrift.protocol.TStruct("MagentoCustomer"));

                if (getAddresses() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("addresses", org.apache.thrift.protocol.TType.SET, (short)-1));
                    oprot.writeSetBegin(new org.apache.thrift.protocol.TSet(org.apache.thrift.protocol.TType.STRUCT, getAddresses().size()));
                    for (com.yogento.api.models.customer.magento.MagentoCustomerAddress _iter0 : getAddresses()) {
                        _iter0.write(oprot);
                    }
                    oprot.writeSetEnd();
                    oprot.writeFieldEnd();
                }

                oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("created_at", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDateTime(getCreatedAt()); } else { oprot.writeI64(getCreatedAt().getMillis()); }
                oprot.writeFieldEnd();

                if (isConfirmation() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("confirmation", org.apache.thrift.protocol.TType.BOOL, (short)-1));
                    oprot.writeBool(isConfirmation());
                    oprot.writeFieldEnd();
                }

                if (getCustomerId() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("customer_id", org.apache.thrift.protocol.TType.I32, (short)-1));
                    oprot.writeI32(getCustomerId());
                    oprot.writeFieldEnd();
                }

                if (getDob() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("dob", org.apache.thrift.protocol.TType.STRING, (short)-1));
                    oprot.writeString(getDob());
                    oprot.writeFieldEnd();
                }

                if (getEmail() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("email", org.apache.thrift.protocol.TType.STRING, (short)-1));
                    oprot.writeString(getEmail());
                    oprot.writeFieldEnd();
                }

                if (getFirstname() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("firstname", org.apache.thrift.protocol.TType.STRING, (short)-1));
                    oprot.writeString(getFirstname());
                    oprot.writeFieldEnd();
                }

                if (getGroupId() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("group_id", org.apache.thrift.protocol.TType.I32, (short)-1));
                    oprot.writeI32(getGroupId());
                    oprot.writeFieldEnd();
                }

                oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("increment_id", org.apache.thrift.protocol.TType.STRING, (short)-1));
                oprot.writeString(getIncrementId());
                oprot.writeFieldEnd();

                if (getLastname() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("lastname", org.apache.thrift.protocol.TType.STRING, (short)-1));
                    oprot.writeString(getLastname());
                    oprot.writeFieldEnd();
                }

                if (getMiddlename() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("middlename", org.apache.thrift.protocol.TType.STRING, (short)-1));
                    oprot.writeString(getMiddlename());
                    oprot.writeFieldEnd();
                }

                if (getPrefix() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("prefix", org.apache.thrift.protocol.TType.STRING, (short)-1));
                    oprot.writeString(getPrefix());
                    oprot.writeFieldEnd();
                }

                if (getSuffix() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("suffix", org.apache.thrift.protocol.TType.STRING, (short)-1));
                    oprot.writeString(getSuffix());
                    oprot.writeFieldEnd();
                }

                if (getStoreId() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("store_id", org.apache.thrift.protocol.TType.I32, (short)-1));
                    oprot.writeI32(getStoreId());
                    oprot.writeFieldEnd();
                }

                if (getTaxvat() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("taxvat", org.apache.thrift.protocol.TType.STRING, (short)-1));
                    oprot.writeString(getTaxvat());
                    oprot.writeFieldEnd();
                }

                oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("updated_at", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDateTime(getUpdatedAt()); } else { oprot.writeI64(getUpdatedAt().getMillis()); }
                oprot.writeFieldEnd();

                if (getWebsiteId() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("website_id", org.apache.thrift.protocol.TType.I32, (short)-1));
                    oprot.writeI32(getWebsiteId());
                    oprot.writeFieldEnd();
                }

                oprot.writeFieldStop();

                oprot.writeStructEnd();
                break;
        }
    }

    private final com.google.common.collect.ImmutableSet<com.yogento.api.models.customer.magento.MagentoCustomerAddress> addresses;
    private final org.joda.time.DateTime createdAt;
    private final Boolean confirmation;
    private final Integer customerId;
    private final String dob;
    private final String email;
    private final String firstname;
    private final Integer groupId;
    private final String incrementId;
    private final String lastname;
    private final String middlename;
    private final String prefix;
    private final String suffix;
    private final Integer storeId;
    private final String taxvat;
    private final org.joda.time.DateTime updatedAt;
    private final Integer websiteId;
}
