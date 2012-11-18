package com.yogento.api.models.customer.magento;

@SuppressWarnings({"serial"})
public class MagentoCustomerAddress implements org.apache.thrift.TBase<MagentoCustomerAddress, org.apache.thrift.TFieldIdEnum> {
    public static class Builder {
        public Builder() {
        }

        public Builder(final MagentoCustomerAddress other) {
            this.city = other.getCity();
            this.countryId = other.getCountryId();
            this.createdAt = other.getCreatedAt();
            this.customerAddressId = other.getCustomerAddressId();
            this.firstname = other.getFirstname();
            this.isDefaultBilling = other.isDefaultBilling();
            this.isDefaultShipping = other.isDefaultShipping();
            this.lastname = other.getLastname();
            this.postcode = other.getPostcode();
            this.region = other.getRegion();
            this.regionId = other.getRegionId();
            this.street = other.getStreet();
            this.telephone = other.getTelephone();
            this.updatedAt = other.getUpdatedAt();
        }

        protected MagentoCustomerAddress _build(final String city, final String countryId, final org.joda.time.DateTime createdAt, final Integer customerAddressId, final String firstname, final Boolean isDefaultBilling, final Boolean isDefaultShipping, final String lastname, final String postcode, final String region, final Integer regionId, final String street, final String telephone, final org.joda.time.DateTime updatedAt) {
            return new MagentoCustomerAddress(city, countryId, createdAt, customerAddressId, firstname, isDefaultBilling, isDefaultShipping, lastname, postcode, region, regionId, street, telephone, updatedAt);
        }

        public MagentoCustomerAddress build() {
            return _build(city, countryId, createdAt, customerAddressId, firstname, isDefaultBilling, isDefaultShipping, lastname, postcode, region, regionId, street, telephone, updatedAt);
        }

        public Builder setCity(final String city) {
            this.city = city;
            return this;
        }

        public Builder setCountryId(final String countryId) {
            this.countryId = countryId;
            return this;
        }

        public Builder setCreatedAt(final org.joda.time.DateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Builder setCustomerAddressId(final Integer customerAddressId) {
            this.customerAddressId = customerAddressId;
            return this;
        }

        public Builder setFirstname(final String firstname) {
            this.firstname = firstname;
            return this;
        }

        public Builder setIsDefaultBilling(final Boolean isDefaultBilling) {
            this.isDefaultBilling = isDefaultBilling;
            return this;
        }

        public Builder setIsDefaultShipping(final Boolean isDefaultShipping) {
            this.isDefaultShipping = isDefaultShipping;
            return this;
        }

        public Builder setLastname(final String lastname) {
            this.lastname = lastname;
            return this;
        }

        public Builder setPostcode(final String postcode) {
            this.postcode = postcode;
            return this;
        }

        public Builder setRegion(final String region) {
            this.region = region;
            return this;
        }

        public Builder setRegionId(final Integer regionId) {
            this.regionId = regionId;
            return this;
        }

        public Builder setStreet(final String street) {
            this.street = street;
            return this;
        }

        public Builder setTelephone(final String telephone) {
            this.telephone = telephone;
            return this;
        }

        public Builder setUpdatedAt(final org.joda.time.DateTime updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        private String city;
        private String countryId;
        private org.joda.time.DateTime createdAt;
        private Integer customerAddressId;
        private String firstname;
        private Boolean isDefaultBilling;
        private Boolean isDefaultShipping;
        private String lastname;
        private String postcode;
        private String region;
        private Integer regionId;
        private String street;
        private String telephone;
        private org.joda.time.DateTime updatedAt;
    }

    public MagentoCustomerAddress(final MagentoCustomerAddress other) {
        this(other.getCity(), other.getCountryId(), other.getCreatedAt(), other.getCustomerAddressId(), other.getFirstname(), other.isDefaultBilling(), other.isDefaultShipping(), other.getLastname(), other.getPostcode(), other.getRegion(), other.getRegionId(), other.getStreet(), other.getTelephone(), other.getUpdatedAt());
    }

    public MagentoCustomerAddress(final org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
        this(iprot, org.apache.thrift.protocol.TType.STRUCT);
    }

    public MagentoCustomerAddress(final org.apache.thrift.protocol.TProtocol iprot, final byte readAsTType) throws org.apache.thrift.TException {
        String city = null;
        String countryId = null;
        org.joda.time.DateTime createdAt = null;
        Integer customerAddressId = null;
        String firstname = null;
        Boolean isDefaultBilling = null;
        Boolean isDefaultShipping = null;
        String lastname = null;
        String postcode = null;
        String region = null;
        Integer regionId = null;
        String street = null;
        String telephone = null;
        org.joda.time.DateTime updatedAt = null;

        switch (readAsTType) {
            case org.apache.thrift.protocol.TType.LIST:
                iprot.readListBegin();
                city = iprot.readString();
                countryId = iprot.readString();
                createdAt = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDateTime() : new org.joda.time.DateTime(iprot.readI64());
                try {
                    customerAddressId = iprot.readI32();
                } catch (NumberFormatException e) {
                }
                firstname = iprot.readString();
                isDefaultBilling = iprot.readBool();
                isDefaultShipping = iprot.readBool();
                lastname = iprot.readString();
                postcode = iprot.readString();
                region = iprot.readString();
                try {
                    regionId = iprot.readI32();
                } catch (NumberFormatException e) {
                }
                street = iprot.readString();
                telephone = iprot.readString();
                try {
                    updatedAt = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDateTime() : new org.joda.time.DateTime(iprot.readI64());
                } catch (IllegalArgumentException e) {
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
                    } else                 if (ifield.name.equals("city")) {
                        city = iprot.readString();
                    } else if (ifield.name.equals("country_id")) {
                        countryId = iprot.readString();
                    } else if (ifield.name.equals("created_at")) {
                        createdAt = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDateTime() : new org.joda.time.DateTime(iprot.readI64());
                    } else if (ifield.name.equals("customer_address_id")) {
                        try {
                            customerAddressId = iprot.readI32();
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("firstname")) {
                        firstname = iprot.readString();
                    } else if (ifield.name.equals("is_default_billing")) {
                        isDefaultBilling = iprot.readBool();
                    } else if (ifield.name.equals("is_default_shipping")) {
                        isDefaultShipping = iprot.readBool();
                    } else if (ifield.name.equals("lastname")) {
                        lastname = iprot.readString();
                    } else if (ifield.name.equals("postcode")) {
                        postcode = iprot.readString();
                    } else if (ifield.name.equals("region")) {
                        region = iprot.readString();
                    } else if (ifield.name.equals("region_id")) {
                        try {
                            regionId = iprot.readI32();
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("street")) {
                        street = iprot.readString();
                    } else if (ifield.name.equals("telephone")) {
                        telephone = iprot.readString();
                    } else if (ifield.name.equals("updated_at")) {
                        try {
                            updatedAt = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDateTime() : new org.joda.time.DateTime(iprot.readI64());
                        } catch (IllegalArgumentException e) {
                        }
                    }
                    iprot.readFieldEnd();
                }
                iprot.readStructEnd();
                break;
        }

        this.city = com.google.common.base.Preconditions.checkNotNull(city);
        this.countryId = com.google.common.base.Preconditions.checkNotNull(countryId);
        this.createdAt = com.google.common.base.Preconditions.checkNotNull(createdAt);
        this.customerAddressId = customerAddressId;
        this.firstname = com.google.common.base.Preconditions.checkNotNull(firstname);
        this.isDefaultBilling = isDefaultBilling;
        this.isDefaultShipping = isDefaultShipping;
        this.lastname = com.google.common.base.Preconditions.checkNotNull(lastname);
        this.postcode = com.google.common.base.Preconditions.checkNotNull(postcode);
        this.region = com.google.common.base.Preconditions.checkNotNull(region);
        this.regionId = regionId;
        this.street = com.google.common.base.Preconditions.checkNotNull(street);
        this.telephone = com.google.common.base.Preconditions.checkNotNull(telephone);
        this.updatedAt = updatedAt;
    }

    public MagentoCustomerAddress(final String city, final String countryId, final org.joda.time.DateTime createdAt, final String firstname, final String lastname, final String postcode, final String region, final String street, final String telephone) {
        this.city = com.google.common.base.Preconditions.checkNotNull(city);
        this.countryId = com.google.common.base.Preconditions.checkNotNull(countryId);
        this.createdAt = com.google.common.base.Preconditions.checkNotNull(createdAt);
        this.customerAddressId = null;
        this.firstname = com.google.common.base.Preconditions.checkNotNull(firstname);
        this.isDefaultBilling = null;
        this.isDefaultShipping = null;
        this.lastname = com.google.common.base.Preconditions.checkNotNull(lastname);
        this.postcode = com.google.common.base.Preconditions.checkNotNull(postcode);
        this.region = com.google.common.base.Preconditions.checkNotNull(region);
        this.regionId = null;
        this.street = com.google.common.base.Preconditions.checkNotNull(street);
        this.telephone = com.google.common.base.Preconditions.checkNotNull(telephone);
        this.updatedAt = null;
    }

    public MagentoCustomerAddress(final String city, final String countryId, final org.joda.time.DateTime createdAt, final Integer customerAddressId, final String firstname, final Boolean isDefaultBilling, final Boolean isDefaultShipping, final String lastname, final String postcode, final String region, final Integer regionId, final String street, final String telephone, final org.joda.time.DateTime updatedAt) {
        this.city = com.google.common.base.Preconditions.checkNotNull(city);
        this.countryId = com.google.common.base.Preconditions.checkNotNull(countryId);
        this.createdAt = com.google.common.base.Preconditions.checkNotNull(createdAt);
        this.customerAddressId = customerAddressId;
        this.firstname = com.google.common.base.Preconditions.checkNotNull(firstname);
        this.isDefaultBilling = isDefaultBilling;
        this.isDefaultShipping = isDefaultShipping;
        this.lastname = com.google.common.base.Preconditions.checkNotNull(lastname);
        this.postcode = com.google.common.base.Preconditions.checkNotNull(postcode);
        this.region = com.google.common.base.Preconditions.checkNotNull(region);
        this.regionId = regionId;
        this.street = com.google.common.base.Preconditions.checkNotNull(street);
        this.telephone = com.google.common.base.Preconditions.checkNotNull(telephone);
        this.updatedAt = updatedAt;
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException();
    }

    @Override
    public int compareTo(final MagentoCustomerAddress other) {
        throw new UnsupportedOperationException();
    }

    @Override
    public org.apache.thrift.TBase<MagentoCustomerAddress, org.apache.thrift.TFieldIdEnum> deepCopy() {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean equals(final Object otherObject) {
        if (otherObject == this) {
            return true;
        } else if (!(otherObject instanceof MagentoCustomerAddress)) {
            return false;
        }

        final MagentoCustomerAddress other = (MagentoCustomerAddress)otherObject;
        return
            getCity().equals(other.getCity()) &&
            getCountryId().equals(other.getCountryId()) &&
            getCreatedAt().equals(other.getCreatedAt()) &&
            ((getCustomerAddressId() == null && other.getCustomerAddressId() == null) ||
            (getCustomerAddressId() != null && other.getCustomerAddressId() != null &&
            getCustomerAddressId().equals(other.getCustomerAddressId()))) &&
            getFirstname().equals(other.getFirstname()) &&
            ((isDefaultBilling() == null && other.isDefaultBilling() == null) ||
            (isDefaultBilling() != null && other.isDefaultBilling() != null &&
            isDefaultBilling().equals(other.isDefaultBilling()))) &&
            ((isDefaultShipping() == null && other.isDefaultShipping() == null) ||
            (isDefaultShipping() != null && other.isDefaultShipping() != null &&
            isDefaultShipping().equals(other.isDefaultShipping()))) &&
            getLastname().equals(other.getLastname()) &&
            getPostcode().equals(other.getPostcode()) &&
            getRegion().equals(other.getRegion()) &&
            ((getRegionId() == null && other.getRegionId() == null) ||
            (getRegionId() != null && other.getRegionId() != null &&
            getRegionId().equals(other.getRegionId()))) &&
            getStreet().equals(other.getStreet()) &&
            getTelephone().equals(other.getTelephone()) &&
            ((getUpdatedAt() == null && other.getUpdatedAt() == null) ||
            (getUpdatedAt() != null && other.getUpdatedAt() != null &&
            getUpdatedAt().equals(other.getUpdatedAt())));
    }

    @Override
    public org.apache.thrift.TFieldIdEnum fieldForId(final int fieldId) {
        throw new UnsupportedOperationException();
    }

    public Object get(final String fieldName) {
        if (fieldName.equals("city")) {
            return getCity();
        } else if (fieldName.equals("country_id")) {
            return getCountryId();
        } else if (fieldName.equals("created_at")) {
            return getCreatedAt();
        } else if (fieldName.equals("customer_address_id")) {
            return getCustomerAddressId();
        } else if (fieldName.equals("firstname")) {
            return getFirstname();
        } else if (fieldName.equals("is_default_billing")) {
            return isDefaultBilling();
        } else if (fieldName.equals("is_default_shipping")) {
            return isDefaultShipping();
        } else if (fieldName.equals("lastname")) {
            return getLastname();
        } else if (fieldName.equals("postcode")) {
            return getPostcode();
        } else if (fieldName.equals("region")) {
            return getRegion();
        } else if (fieldName.equals("region_id")) {
            return getRegionId();
        } else if (fieldName.equals("street")) {
            return getStreet();
        } else if (fieldName.equals("telephone")) {
            return getTelephone();
        } else if (fieldName.equals("updated_at")) {
            return getUpdatedAt();
        }
        return null;
    }

    public final String getCity() {
        return city;
    }

    public final String getCountryId() {
        return countryId;
    }

    public final org.joda.time.DateTime getCreatedAt() {
        return createdAt;
    }

    public final Integer getCustomerAddressId() {
        return customerAddressId;
    }

    @Override
    public Object getFieldValue(final org.apache.thrift.TFieldIdEnum field) {
        throw new UnsupportedOperationException();
    }

    public final String getFirstname() {
        return firstname;
    }

    public final String getLastname() {
        return lastname;
    }

    public final String getPostcode() {
        return postcode;
    }

    public final String getRegion() {
        return region;
    }

    public final Integer getRegionId() {
        return regionId;
    }

    public final String getStreet() {
        return street;
    }

    public final String getTelephone() {
        return telephone;
    }

    public final org.joda.time.DateTime getUpdatedAt() {
        return updatedAt;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getCity().hashCode();
        hashCode = 31 * hashCode + getCountryId().hashCode();
        hashCode = 31 * hashCode + getCreatedAt().hashCode();
        if (getCustomerAddressId() != null) {
            hashCode = 31 * hashCode + ((int)getCustomerAddressId());
        }
        hashCode = 31 * hashCode + getFirstname().hashCode();
        if (isDefaultBilling() != null) {
            hashCode = 31 * hashCode + (isDefaultBilling() ? 1 : 0);
        }
        if (isDefaultShipping() != null) {
            hashCode = 31 * hashCode + (isDefaultShipping() ? 1 : 0);
        }
        hashCode = 31 * hashCode + getLastname().hashCode();
        hashCode = 31 * hashCode + getPostcode().hashCode();
        hashCode = 31 * hashCode + getRegion().hashCode();
        if (getRegionId() != null) {
            hashCode = 31 * hashCode + ((int)getRegionId());
        }
        hashCode = 31 * hashCode + getStreet().hashCode();
        hashCode = 31 * hashCode + getTelephone().hashCode();
        if (getUpdatedAt() != null) {
            hashCode = 31 * hashCode + getUpdatedAt().hashCode();
        }
        return hashCode;
    }

    public final Boolean isDefaultBilling() {
        return isDefaultBilling;
    }

    public final Boolean isDefaultShipping() {
        return isDefaultShipping;
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
        helper.add("city", getCity());
        helper.add("country_id", getCountryId());
        helper.add("created_at", getCreatedAt());
        if (getCustomerAddressId() != null) {
            helper.add("customer_address_id", getCustomerAddressId());
        }
        helper.add("firstname", getFirstname());
        if (isDefaultBilling() != null) {
            helper.add("is_default_billing", isDefaultBilling());
        }
        if (isDefaultShipping() != null) {
            helper.add("is_default_shipping", isDefaultShipping());
        }
        helper.add("lastname", getLastname());
        helper.add("postcode", getPostcode());
        helper.add("region", getRegion());
        if (getRegionId() != null) {
            helper.add("region_id", getRegionId());
        }
        helper.add("street", getStreet());
        helper.add("telephone", getTelephone());
        if (getUpdatedAt() != null) {
            helper.add("updated_at", getUpdatedAt());
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
                oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.VOID, 14));

                oprot.writeString(getCity());

                oprot.writeString(getCountryId());

                if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDateTime(getCreatedAt()); } else { oprot.writeI64(getCreatedAt().getMillis()); }

                if (getCustomerAddressId() != null) {
                    oprot.writeI32(getCustomerAddressId());
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                oprot.writeString(getFirstname());

                if (isDefaultBilling() != null) {
                    oprot.writeBool(isDefaultBilling());
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (isDefaultShipping() != null) {
                    oprot.writeBool(isDefaultShipping());
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                oprot.writeString(getLastname());

                oprot.writeString(getPostcode());

                oprot.writeString(getRegion());

                if (getRegionId() != null) {
                    oprot.writeI32(getRegionId());
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                oprot.writeString(getStreet());

                oprot.writeString(getTelephone());

                if (getUpdatedAt() != null) {
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDateTime(getUpdatedAt()); } else { oprot.writeI64(getUpdatedAt().getMillis()); }
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                oprot.writeListEnd();
                break;

            case org.apache.thrift.protocol.TType.STRUCT:
            default:
                oprot.writeStructBegin(new org.apache.thrift.protocol.TStruct("MagentoCustomerAddress"));

                oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("city", org.apache.thrift.protocol.TType.STRING, (short)-1));
                oprot.writeString(getCity());
                oprot.writeFieldEnd();

                oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("country_id", org.apache.thrift.protocol.TType.STRING, (short)-1));
                oprot.writeString(getCountryId());
                oprot.writeFieldEnd();

                oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("created_at", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDateTime(getCreatedAt()); } else { oprot.writeI64(getCreatedAt().getMillis()); }
                oprot.writeFieldEnd();

                if (getCustomerAddressId() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("customer_address_id", org.apache.thrift.protocol.TType.I32, (short)-1));
                    oprot.writeI32(getCustomerAddressId());
                    oprot.writeFieldEnd();
                }

                oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("firstname", org.apache.thrift.protocol.TType.STRING, (short)-1));
                oprot.writeString(getFirstname());
                oprot.writeFieldEnd();

                if (isDefaultBilling() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("is_default_billing", org.apache.thrift.protocol.TType.BOOL, (short)-1));
                    oprot.writeBool(isDefaultBilling());
                    oprot.writeFieldEnd();
                }

                if (isDefaultShipping() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("is_default_shipping", org.apache.thrift.protocol.TType.BOOL, (short)-1));
                    oprot.writeBool(isDefaultShipping());
                    oprot.writeFieldEnd();
                }

                oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("lastname", org.apache.thrift.protocol.TType.STRING, (short)-1));
                oprot.writeString(getLastname());
                oprot.writeFieldEnd();

                oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("postcode", org.apache.thrift.protocol.TType.STRING, (short)-1));
                oprot.writeString(getPostcode());
                oprot.writeFieldEnd();

                oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("region", org.apache.thrift.protocol.TType.STRING, (short)-1));
                oprot.writeString(getRegion());
                oprot.writeFieldEnd();

                if (getRegionId() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("region_id", org.apache.thrift.protocol.TType.I32, (short)-1));
                    oprot.writeI32(getRegionId());
                    oprot.writeFieldEnd();
                }

                oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("street", org.apache.thrift.protocol.TType.STRING, (short)-1));
                oprot.writeString(getStreet());
                oprot.writeFieldEnd();

                oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("telephone", org.apache.thrift.protocol.TType.STRING, (short)-1));
                oprot.writeString(getTelephone());
                oprot.writeFieldEnd();

                if (getUpdatedAt() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("updated_at", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDateTime(getUpdatedAt()); } else { oprot.writeI64(getUpdatedAt().getMillis()); }
                    oprot.writeFieldEnd();
                }

                oprot.writeFieldStop();

                oprot.writeStructEnd();
                break;
        }
    }

    private final String city;
    private final String countryId;
    private final org.joda.time.DateTime createdAt;
    private final Integer customerAddressId;
    private final String firstname;
    private final Boolean isDefaultBilling;
    private final Boolean isDefaultShipping;
    private final String lastname;
    private final String postcode;
    private final String region;
    private final Integer regionId;
    private final String street;
    private final String telephone;
    private final org.joda.time.DateTime updatedAt;
}
