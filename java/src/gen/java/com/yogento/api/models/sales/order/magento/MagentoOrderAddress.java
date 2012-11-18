package com.yogento.api.models.sales.order.magento;

@SuppressWarnings({"serial"})
public class MagentoOrderAddress implements org.apache.thrift.TBase<MagentoOrderAddress, org.apache.thrift.TFieldIdEnum> {
    public static class Builder {
        public Builder() {
        }

        public Builder(final MagentoOrderAddress other) {
            this.addressType = other.getAddressType();
            this.city = other.getCity();
            this.company = other.getCompany();
            this.countryId = other.getCountryId();
            this.email = other.getEmail();
            this.fax = other.getFax();
            this.firstname = other.getFirstname();
            this.lastname = other.getLastname();
            this.middlename = other.getMiddlename();
            this.postcode = other.getPostcode();
            this.prefix = other.getPrefix();
            this.region = other.getRegion();
            this.street = other.getStreet();
            this.suffix = other.getSuffix();
            this.telephone = other.getTelephone();
        }

        protected MagentoOrderAddress _build(final com.yogento.api.models.sales.order.magento.MagentoOrderAddressType addressType, final String city, final String company, final String countryId, final String email, final String fax, final String firstname, final String lastname, final String middlename, final String postcode, final String prefix, final String region, final String street, final String suffix, final String telephone) {
            return new MagentoOrderAddress(addressType, city, company, countryId, email, fax, firstname, lastname, middlename, postcode, prefix, region, street, suffix, telephone);
        }

        public MagentoOrderAddress build() {
            return _build(addressType, city, company, countryId, email, fax, firstname, lastname, middlename, postcode, prefix, region, street, suffix, telephone);
        }

        public Builder setAddressType(final com.yogento.api.models.sales.order.magento.MagentoOrderAddressType addressType) {
            this.addressType = addressType;
            return this;
        }

        public Builder setCity(final String city) {
            this.city = city;
            return this;
        }

        public Builder setCompany(final String company) {
            this.company = company;
            return this;
        }

        public Builder setCountryId(final String countryId) {
            this.countryId = countryId;
            return this;
        }

        public Builder setEmail(final String email) {
            this.email = email;
            return this;
        }

        public Builder setFax(final String fax) {
            this.fax = fax;
            return this;
        }

        public Builder setFirstname(final String firstname) {
            this.firstname = firstname;
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

        public Builder setPostcode(final String postcode) {
            this.postcode = postcode;
            return this;
        }

        public Builder setPrefix(final String prefix) {
            this.prefix = prefix;
            return this;
        }

        public Builder setRegion(final String region) {
            this.region = region;
            return this;
        }

        public Builder setStreet(final String street) {
            this.street = street;
            return this;
        }

        public Builder setSuffix(final String suffix) {
            this.suffix = suffix;
            return this;
        }

        public Builder setTelephone(final String telephone) {
            this.telephone = telephone;
            return this;
        }

        private com.yogento.api.models.sales.order.magento.MagentoOrderAddressType addressType;
        private String city;
        private String company;
        private String countryId;
        private String email;
        private String fax;
        private String firstname;
        private String lastname;
        private String middlename;
        private String postcode;
        private String prefix;
        private String region;
        private String street;
        private String suffix;
        private String telephone;
    }

    public MagentoOrderAddress() {
        addressType = null;
        city = null;
        company = null;
        countryId = null;
        email = null;
        fax = null;
        firstname = null;
        lastname = null;
        middlename = null;
        postcode = null;
        prefix = null;
        region = null;
        street = null;
        suffix = null;
        telephone = null;
    }

    public MagentoOrderAddress(final MagentoOrderAddress other) {
        this(other.getAddressType(), other.getCity(), other.getCompany(), other.getCountryId(), other.getEmail(), other.getFax(), other.getFirstname(), other.getLastname(), other.getMiddlename(), other.getPostcode(), other.getPrefix(), other.getRegion(), other.getStreet(), other.getSuffix(), other.getTelephone());
    }

    public MagentoOrderAddress(final org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
        this(iprot, org.apache.thrift.protocol.TType.STRUCT);
    }

    public MagentoOrderAddress(final org.apache.thrift.protocol.TProtocol iprot, final byte readAsTType) throws org.apache.thrift.TException {
        com.yogento.api.models.sales.order.magento.MagentoOrderAddressType addressType = null;
        String city = null;
        String company = null;
        String countryId = null;
        String email = null;
        String fax = null;
        String firstname = null;
        String lastname = null;
        String middlename = null;
        String postcode = null;
        String prefix = null;
        String region = null;
        String street = null;
        String suffix = null;
        String telephone = null;

        switch (readAsTType) {
            case org.apache.thrift.protocol.TType.LIST:
                iprot.readListBegin();
                try {
                    addressType = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readEnum(com.yogento.api.models.sales.order.magento.MagentoOrderAddressType.class) : com.yogento.api.models.sales.order.magento.MagentoOrderAddressType.valueOf(iprot.readString().trim().toUpperCase());
                } catch (IllegalArgumentException e) {
                }
                city = iprot.readString();
                company = iprot.readString();
                countryId = iprot.readString();
                email = iprot.readString();
                fax = iprot.readString();
                firstname = iprot.readString();
                lastname = iprot.readString();
                middlename = iprot.readString();
                postcode = iprot.readString();
                prefix = iprot.readString();
                region = iprot.readString();
                street = iprot.readString();
                suffix = iprot.readString();
                telephone = iprot.readString();
                iprot.readListEnd();
                break;

            case org.apache.thrift.protocol.TType.STRUCT:
            default:
                iprot.readStructBegin();
                while (true) {
                    org.apache.thrift.protocol.TField ifield = iprot.readFieldBegin();
                    if (ifield.type == org.apache.thrift.protocol.TType.STOP) {
                        break;
                    } else                 if (ifield.name.equals("address_type")) {
                        try {
                            addressType = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readEnum(com.yogento.api.models.sales.order.magento.MagentoOrderAddressType.class) : com.yogento.api.models.sales.order.magento.MagentoOrderAddressType.valueOf(iprot.readString().trim().toUpperCase());
                        } catch (IllegalArgumentException e) {
                        }
                    } else if (ifield.name.equals("city")) {
                        city = iprot.readString();
                    } else if (ifield.name.equals("company")) {
                        company = iprot.readString();
                    } else if (ifield.name.equals("country_id")) {
                        countryId = iprot.readString();
                    } else if (ifield.name.equals("email")) {
                        email = iprot.readString();
                    } else if (ifield.name.equals("fax")) {
                        fax = iprot.readString();
                    } else if (ifield.name.equals("firstname")) {
                        firstname = iprot.readString();
                    } else if (ifield.name.equals("lastname")) {
                        lastname = iprot.readString();
                    } else if (ifield.name.equals("middlename")) {
                        middlename = iprot.readString();
                    } else if (ifield.name.equals("postcode")) {
                        postcode = iprot.readString();
                    } else if (ifield.name.equals("prefix")) {
                        prefix = iprot.readString();
                    } else if (ifield.name.equals("region")) {
                        region = iprot.readString();
                    } else if (ifield.name.equals("street")) {
                        street = iprot.readString();
                    } else if (ifield.name.equals("suffix")) {
                        suffix = iprot.readString();
                    } else if (ifield.name.equals("telephone")) {
                        telephone = iprot.readString();
                    }
                    iprot.readFieldEnd();
                }
                iprot.readStructEnd();
                break;
        }

        this.addressType = addressType;
        this.city = city;
        this.company = company;
        this.countryId = countryId;
        this.email = email;
        this.fax = fax;
        this.firstname = firstname;
        this.lastname = lastname;
        this.middlename = middlename;
        this.postcode = postcode;
        this.prefix = prefix;
        this.region = region;
        this.street = street;
        this.suffix = suffix;
        this.telephone = telephone;
    }

    public MagentoOrderAddress(final com.yogento.api.models.sales.order.magento.MagentoOrderAddressType addressType, final String city, final String company, final String countryId, final String email, final String fax, final String firstname, final String lastname, final String middlename, final String postcode, final String prefix, final String region, final String street, final String suffix, final String telephone) {
        this.addressType = addressType;
        this.city = city;
        this.company = company;
        this.countryId = countryId;
        this.email = email;
        this.fax = fax;
        this.firstname = firstname;
        this.lastname = lastname;
        this.middlename = middlename;
        this.postcode = postcode;
        this.prefix = prefix;
        this.region = region;
        this.street = street;
        this.suffix = suffix;
        this.telephone = telephone;
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException();
    }

    @Override
    public int compareTo(final MagentoOrderAddress other) {
        throw new UnsupportedOperationException();
    }

    @Override
    public org.apache.thrift.TBase<MagentoOrderAddress, org.apache.thrift.TFieldIdEnum> deepCopy() {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean equals(final Object otherObject) {
        if (otherObject == this) {
            return true;
        } else if (!(otherObject instanceof MagentoOrderAddress)) {
            return false;
        }

        final MagentoOrderAddress other = (MagentoOrderAddress)otherObject;
        return
            ((getAddressType() == null && other.getAddressType() == null) ||
            (getAddressType() != null && other.getAddressType() != null &&
            getAddressType().equals(other.getAddressType()))) &&
            ((getCity() == null && other.getCity() == null) ||
            (getCity() != null && other.getCity() != null &&
            getCity().equals(other.getCity()))) &&
            ((getCompany() == null && other.getCompany() == null) ||
            (getCompany() != null && other.getCompany() != null &&
            getCompany().equals(other.getCompany()))) &&
            ((getCountryId() == null && other.getCountryId() == null) ||
            (getCountryId() != null && other.getCountryId() != null &&
            getCountryId().equals(other.getCountryId()))) &&
            ((getEmail() == null && other.getEmail() == null) ||
            (getEmail() != null && other.getEmail() != null &&
            getEmail().equals(other.getEmail()))) &&
            ((getFax() == null && other.getFax() == null) ||
            (getFax() != null && other.getFax() != null &&
            getFax().equals(other.getFax()))) &&
            ((getFirstname() == null && other.getFirstname() == null) ||
            (getFirstname() != null && other.getFirstname() != null &&
            getFirstname().equals(other.getFirstname()))) &&
            ((getLastname() == null && other.getLastname() == null) ||
            (getLastname() != null && other.getLastname() != null &&
            getLastname().equals(other.getLastname()))) &&
            ((getMiddlename() == null && other.getMiddlename() == null) ||
            (getMiddlename() != null && other.getMiddlename() != null &&
            getMiddlename().equals(other.getMiddlename()))) &&
            ((getPostcode() == null && other.getPostcode() == null) ||
            (getPostcode() != null && other.getPostcode() != null &&
            getPostcode().equals(other.getPostcode()))) &&
            ((getPrefix() == null && other.getPrefix() == null) ||
            (getPrefix() != null && other.getPrefix() != null &&
            getPrefix().equals(other.getPrefix()))) &&
            ((getRegion() == null && other.getRegion() == null) ||
            (getRegion() != null && other.getRegion() != null &&
            getRegion().equals(other.getRegion()))) &&
            ((getStreet() == null && other.getStreet() == null) ||
            (getStreet() != null && other.getStreet() != null &&
            getStreet().equals(other.getStreet()))) &&
            ((getSuffix() == null && other.getSuffix() == null) ||
            (getSuffix() != null && other.getSuffix() != null &&
            getSuffix().equals(other.getSuffix()))) &&
            ((getTelephone() == null && other.getTelephone() == null) ||
            (getTelephone() != null && other.getTelephone() != null &&
            getTelephone().equals(other.getTelephone())));
    }

    @Override
    public org.apache.thrift.TFieldIdEnum fieldForId(final int fieldId) {
        throw new UnsupportedOperationException();
    }

    public Object get(final String fieldName) {
        if (fieldName.equals("address_type")) {
            return getAddressType();
        } else if (fieldName.equals("city")) {
            return getCity();
        } else if (fieldName.equals("company")) {
            return getCompany();
        } else if (fieldName.equals("country_id")) {
            return getCountryId();
        } else if (fieldName.equals("email")) {
            return getEmail();
        } else if (fieldName.equals("fax")) {
            return getFax();
        } else if (fieldName.equals("firstname")) {
            return getFirstname();
        } else if (fieldName.equals("lastname")) {
            return getLastname();
        } else if (fieldName.equals("middlename")) {
            return getMiddlename();
        } else if (fieldName.equals("postcode")) {
            return getPostcode();
        } else if (fieldName.equals("prefix")) {
            return getPrefix();
        } else if (fieldName.equals("region")) {
            return getRegion();
        } else if (fieldName.equals("street")) {
            return getStreet();
        } else if (fieldName.equals("suffix")) {
            return getSuffix();
        } else if (fieldName.equals("telephone")) {
            return getTelephone();
        }
        return null;
    }

    public final com.yogento.api.models.sales.order.magento.MagentoOrderAddressType getAddressType() {
        return addressType;
    }

    public final String getCity() {
        return city;
    }

    public final String getCompany() {
        return company;
    }

    public final String getCountryId() {
        return countryId;
    }

    public final String getEmail() {
        return email;
    }

    public final String getFax() {
        return fax;
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

    public final String getMiddlename() {
        return middlename;
    }

    public final String getPostcode() {
        return postcode;
    }

    public final String getPrefix() {
        return prefix;
    }

    public final String getRegion() {
        return region;
    }

    public final String getStreet() {
        return street;
    }

    public final String getSuffix() {
        return suffix;
    }

    public final String getTelephone() {
        return telephone;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        if (getAddressType() != null) {
            hashCode = 31 * hashCode + getAddressType().ordinal();
        }
        if (getCity() != null) {
            hashCode = 31 * hashCode + getCity().hashCode();
        }
        if (getCompany() != null) {
            hashCode = 31 * hashCode + getCompany().hashCode();
        }
        if (getCountryId() != null) {
            hashCode = 31 * hashCode + getCountryId().hashCode();
        }
        if (getEmail() != null) {
            hashCode = 31 * hashCode + getEmail().hashCode();
        }
        if (getFax() != null) {
            hashCode = 31 * hashCode + getFax().hashCode();
        }
        if (getFirstname() != null) {
            hashCode = 31 * hashCode + getFirstname().hashCode();
        }
        if (getLastname() != null) {
            hashCode = 31 * hashCode + getLastname().hashCode();
        }
        if (getMiddlename() != null) {
            hashCode = 31 * hashCode + getMiddlename().hashCode();
        }
        if (getPostcode() != null) {
            hashCode = 31 * hashCode + getPostcode().hashCode();
        }
        if (getPrefix() != null) {
            hashCode = 31 * hashCode + getPrefix().hashCode();
        }
        if (getRegion() != null) {
            hashCode = 31 * hashCode + getRegion().hashCode();
        }
        if (getStreet() != null) {
            hashCode = 31 * hashCode + getStreet().hashCode();
        }
        if (getSuffix() != null) {
            hashCode = 31 * hashCode + getSuffix().hashCode();
        }
        if (getTelephone() != null) {
            hashCode = 31 * hashCode + getTelephone().hashCode();
        }
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
        if (getAddressType() != null) {
            helper.add("address_type", getAddressType());
        }
        if (getCity() != null) {
            helper.add("city", getCity());
        }
        if (getCompany() != null) {
            helper.add("company", getCompany());
        }
        if (getCountryId() != null) {
            helper.add("country_id", getCountryId());
        }
        if (getEmail() != null) {
            helper.add("email", getEmail());
        }
        if (getFax() != null) {
            helper.add("fax", getFax());
        }
        if (getFirstname() != null) {
            helper.add("firstname", getFirstname());
        }
        if (getLastname() != null) {
            helper.add("lastname", getLastname());
        }
        if (getMiddlename() != null) {
            helper.add("middlename", getMiddlename());
        }
        if (getPostcode() != null) {
            helper.add("postcode", getPostcode());
        }
        if (getPrefix() != null) {
            helper.add("prefix", getPrefix());
        }
        if (getRegion() != null) {
            helper.add("region", getRegion());
        }
        if (getStreet() != null) {
            helper.add("street", getStreet());
        }
        if (getSuffix() != null) {
            helper.add("suffix", getSuffix());
        }
        if (getTelephone() != null) {
            helper.add("telephone", getTelephone());
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
                oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.VOID, 15));

                if (getAddressType() != null) {
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeEnum(getAddressType()); } else { oprot.writeString(getAddressType().toString()); }
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getCity() != null) {
                    oprot.writeString(getCity());
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getCompany() != null) {
                    oprot.writeString(getCompany());
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getCountryId() != null) {
                    oprot.writeString(getCountryId());
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getEmail() != null) {
                    oprot.writeString(getEmail());
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getFax() != null) {
                    oprot.writeString(getFax());
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getFirstname() != null) {
                    oprot.writeString(getFirstname());
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

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

                if (getPostcode() != null) {
                    oprot.writeString(getPostcode());
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getPrefix() != null) {
                    oprot.writeString(getPrefix());
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getRegion() != null) {
                    oprot.writeString(getRegion());
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getStreet() != null) {
                    oprot.writeString(getStreet());
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getSuffix() != null) {
                    oprot.writeString(getSuffix());
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getTelephone() != null) {
                    oprot.writeString(getTelephone());
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                oprot.writeListEnd();
                break;

            case org.apache.thrift.protocol.TType.STRUCT:
            default:
                oprot.writeStructBegin(new org.apache.thrift.protocol.TStruct("MagentoOrderAddress"));

                if (getAddressType() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("address_type", org.apache.thrift.protocol.TType.STRING, (short)-1));
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeEnum(getAddressType()); } else { oprot.writeString(getAddressType().toString()); }
                    oprot.writeFieldEnd();
                }

                if (getCity() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("city", org.apache.thrift.protocol.TType.STRING, (short)-1));
                    oprot.writeString(getCity());
                    oprot.writeFieldEnd();
                }

                if (getCompany() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("company", org.apache.thrift.protocol.TType.STRING, (short)-1));
                    oprot.writeString(getCompany());
                    oprot.writeFieldEnd();
                }

                if (getCountryId() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("country_id", org.apache.thrift.protocol.TType.STRING, (short)-1));
                    oprot.writeString(getCountryId());
                    oprot.writeFieldEnd();
                }

                if (getEmail() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("email", org.apache.thrift.protocol.TType.STRING, (short)-1));
                    oprot.writeString(getEmail());
                    oprot.writeFieldEnd();
                }

                if (getFax() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("fax", org.apache.thrift.protocol.TType.STRING, (short)-1));
                    oprot.writeString(getFax());
                    oprot.writeFieldEnd();
                }

                if (getFirstname() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("firstname", org.apache.thrift.protocol.TType.STRING, (short)-1));
                    oprot.writeString(getFirstname());
                    oprot.writeFieldEnd();
                }

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

                if (getPostcode() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("postcode", org.apache.thrift.protocol.TType.STRING, (short)-1));
                    oprot.writeString(getPostcode());
                    oprot.writeFieldEnd();
                }

                if (getPrefix() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("prefix", org.apache.thrift.protocol.TType.STRING, (short)-1));
                    oprot.writeString(getPrefix());
                    oprot.writeFieldEnd();
                }

                if (getRegion() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("region", org.apache.thrift.protocol.TType.STRING, (short)-1));
                    oprot.writeString(getRegion());
                    oprot.writeFieldEnd();
                }

                if (getStreet() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("street", org.apache.thrift.protocol.TType.STRING, (short)-1));
                    oprot.writeString(getStreet());
                    oprot.writeFieldEnd();
                }

                if (getSuffix() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("suffix", org.apache.thrift.protocol.TType.STRING, (short)-1));
                    oprot.writeString(getSuffix());
                    oprot.writeFieldEnd();
                }

                if (getTelephone() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("telephone", org.apache.thrift.protocol.TType.STRING, (short)-1));
                    oprot.writeString(getTelephone());
                    oprot.writeFieldEnd();
                }

                oprot.writeFieldStop();

                oprot.writeStructEnd();
                break;
        }
    }

    private final com.yogento.api.models.sales.order.magento.MagentoOrderAddressType addressType;
    private final String city;
    private final String company;
    private final String countryId;
    private final String email;
    private final String fax;
    private final String firstname;
    private final String lastname;
    private final String middlename;
    private final String postcode;
    private final String prefix;
    private final String region;
    private final String street;
    private final String suffix;
    private final String telephone;
}
