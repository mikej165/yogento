package com.yogento.api.models.user_settings;

@SuppressWarnings({"serial"})
public class UserSettings implements org.apache.thrift.TBase<UserSettings, org.apache.thrift.TFieldIdEnum> {
    public static class Builder {
        public Builder() {
        }

        public Builder(final UserSettings other) {
            this.displayName = other.getDisplayName();
            this.email = other.getEmail();
            this.logoImageUrl = other.getLogoImageUrl();
            this.magentoStoreUrl = other.getMagentoStoreUrl();
            this.productsMtime = other.getProductsMtime();
            this.productSearchQueries = other.getProductSearchQueries();
        }

        protected UserSettings _build(final String displayName, final String email, final String logoImageUrl, final String magentoStoreUrl, final org.joda.time.DateTime productsMtime, final com.google.common.collect.ImmutableList<String> productSearchQueries) {
            return new UserSettings(displayName, email, logoImageUrl, magentoStoreUrl, productsMtime, productSearchQueries);
        }

        public UserSettings build() {
            return _build(displayName, email, logoImageUrl, magentoStoreUrl, productsMtime, productSearchQueries);
        }

        public Builder setDisplayName(final String displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setEmail(final String email) {
            this.email = email;
            return this;
        }

        public Builder setLogoImageUrl(final String logoImageUrl) {
            this.logoImageUrl = logoImageUrl;
            return this;
        }

        public Builder setMagentoStoreUrl(final String magentoStoreUrl) {
            this.magentoStoreUrl = magentoStoreUrl;
            return this;
        }

        public Builder setProductSearchQueries(final com.google.common.collect.ImmutableList<String> productSearchQueries) {
            this.productSearchQueries = productSearchQueries;
            return this;
        }

        public Builder setProductsMtime(final org.joda.time.DateTime productsMtime) {
            this.productsMtime = productsMtime;
            return this;
        }

        private String displayName;
        private String email;
        private String logoImageUrl;
        private String magentoStoreUrl;
        private org.joda.time.DateTime productsMtime;
        private com.google.common.collect.ImmutableList<String> productSearchQueries;
    }

    public UserSettings() {
        displayName = null;
        email = null;
        logoImageUrl = null;
        magentoStoreUrl = null;
        productsMtime = null;
        productSearchQueries = null;
    }

    public UserSettings(final UserSettings other) {
        this(other.getDisplayName(), other.getEmail(), other.getLogoImageUrl(), other.getMagentoStoreUrl(), other.getProductsMtime(), other.getProductSearchQueries());
    }

    public UserSettings(final org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
        this(iprot, org.apache.thrift.protocol.TType.STRUCT);
    }

    public UserSettings(final org.apache.thrift.protocol.TProtocol iprot, final byte readAsTType) throws org.apache.thrift.TException {
        String displayName = null;
        String email = null;
        String logoImageUrl = null;
        String magentoStoreUrl = null;
        org.joda.time.DateTime productsMtime = null;
        com.google.common.collect.ImmutableList<String> productSearchQueries = null;

        switch (readAsTType) {
            case org.apache.thrift.protocol.TType.LIST:
                org.apache.thrift.protocol.TList __list = iprot.readListBegin();
                if (__list.size > 0) {
                    displayName = iprot.readString();
                }
                if (__list.size > 1) {
                    email = iprot.readString();
                }
                if (__list.size > 2) {
                    logoImageUrl = iprot.readString();
                }
                if (__list.size > 3) {
                    magentoStoreUrl = iprot.readString();
                }
                if (__list.size > 4) {
                    try {
                        productsMtime = (iprot instanceof org.thryft.core.protocol.Protocol) ? ((org.thryft.core.protocol.Protocol)iprot).readDateTime() : new org.joda.time.DateTime(iprot.readI64());
                    } catch (IllegalArgumentException e) {
                    }
                }
                if (__list.size > 5) {
                    productSearchQueries = (new com.google.common.base.Function<org.apache.thrift.protocol.TProtocol, com.google.common.collect.ImmutableList<String>>() {
                        @Override
                        public com.google.common.collect.ImmutableList<String> apply(org.apache.thrift.protocol.TProtocol iprot) {
                            try {
                                org.apache.thrift.protocol.TList sequenceBegin = iprot.readListBegin();
                                java.util.List<String> sequence = new java.util.ArrayList<String>();
                                for (int elementI = 0; elementI < sequenceBegin.size; elementI++) {
                                    sequence.add(iprot.readString());
                                }
                                iprot.readListEnd();
                                return com.google.common.collect.ImmutableList.copyOf(sequence);
                            } catch (org.apache.thrift.TException e) {
                                return com.google.common.collect.ImmutableList.of();
                            }
                        }
                    }).apply(iprot);
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
                    } else                 if (ifield.name.equals("display_name")) {
                        displayName = iprot.readString();
                    } else if (ifield.name.equals("email")) {
                        email = iprot.readString();
                    } else if (ifield.name.equals("logo_image_url")) {
                        logoImageUrl = iprot.readString();
                    } else if (ifield.name.equals("magento_store_url")) {
                        magentoStoreUrl = iprot.readString();
                    } else if (ifield.name.equals("products_mtime")) {
                        try {
                            productsMtime = (iprot instanceof org.thryft.core.protocol.Protocol) ? ((org.thryft.core.protocol.Protocol)iprot).readDateTime() : new org.joda.time.DateTime(iprot.readI64());
                        } catch (IllegalArgumentException e) {
                        }
                    } else if (ifield.name.equals("product_search_queries")) {
                        productSearchQueries = (new com.google.common.base.Function<org.apache.thrift.protocol.TProtocol, com.google.common.collect.ImmutableList<String>>() {
                            @Override
                            public com.google.common.collect.ImmutableList<String> apply(org.apache.thrift.protocol.TProtocol iprot) {
                                try {
                                    org.apache.thrift.protocol.TList sequenceBegin = iprot.readListBegin();
                                    java.util.List<String> sequence = new java.util.ArrayList<String>();
                                    for (int elementI = 0; elementI < sequenceBegin.size; elementI++) {
                                        sequence.add(iprot.readString());
                                    }
                                    iprot.readListEnd();
                                    return com.google.common.collect.ImmutableList.copyOf(sequence);
                                } catch (org.apache.thrift.TException e) {
                                    return com.google.common.collect.ImmutableList.of();
                                }
                            }
                        }).apply(iprot);
                    }
                    iprot.readFieldEnd();
                }
                iprot.readStructEnd();
                break;
        }

        this.displayName = displayName;
        this.email = email;
        this.logoImageUrl = logoImageUrl;
        this.magentoStoreUrl = magentoStoreUrl;
        this.productsMtime = productsMtime;
        this.productSearchQueries = productSearchQueries;
    }

    public UserSettings(final String displayName, final String email, final String logoImageUrl, final String magentoStoreUrl, final org.joda.time.DateTime productsMtime, final com.google.common.collect.ImmutableList<String> productSearchQueries) {
        this.displayName = displayName;
        this.email = email;
        this.logoImageUrl = logoImageUrl;
        this.magentoStoreUrl = magentoStoreUrl;
        this.productsMtime = productsMtime;
        this.productSearchQueries = productSearchQueries;
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException();
    }

    @Override
    public int compareTo(final UserSettings other) {
        throw new UnsupportedOperationException();
    }

    @Override
    public org.apache.thrift.TBase<UserSettings, org.apache.thrift.TFieldIdEnum> deepCopy() {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean equals(final Object otherObject) {
        if (otherObject == this) {
            return true;
        } else if (!(otherObject instanceof UserSettings)) {
            return false;
        }

        final UserSettings other = (UserSettings)otherObject;
        return
            ((getDisplayName() == null && other.getDisplayName() == null) ||
            (getDisplayName() != null && other.getDisplayName() != null &&
            getDisplayName().equals(other.getDisplayName()))) &&
            ((getEmail() == null && other.getEmail() == null) ||
            (getEmail() != null && other.getEmail() != null &&
            getEmail().equals(other.getEmail()))) &&
            ((getLogoImageUrl() == null && other.getLogoImageUrl() == null) ||
            (getLogoImageUrl() != null && other.getLogoImageUrl() != null &&
            getLogoImageUrl().equals(other.getLogoImageUrl()))) &&
            ((getMagentoStoreUrl() == null && other.getMagentoStoreUrl() == null) ||
            (getMagentoStoreUrl() != null && other.getMagentoStoreUrl() != null &&
            getMagentoStoreUrl().equals(other.getMagentoStoreUrl()))) &&
            ((getProductsMtime() == null && other.getProductsMtime() == null) ||
            (getProductsMtime() != null && other.getProductsMtime() != null &&
            getProductsMtime().equals(other.getProductsMtime()))) &&
            ((getProductSearchQueries() == null && other.getProductSearchQueries() == null) ||
            (getProductSearchQueries() != null && other.getProductSearchQueries() != null &&
            getProductSearchQueries().equals(other.getProductSearchQueries())));
    }

    @Override
    public org.apache.thrift.TFieldIdEnum fieldForId(final int fieldId) {
        throw new UnsupportedOperationException();
    }

    public Object get(final String fieldName) {
        if (fieldName.equals("display_name")) {
            return getDisplayName();
        } else if (fieldName.equals("email")) {
            return getEmail();
        } else if (fieldName.equals("logo_image_url")) {
            return getLogoImageUrl();
        } else if (fieldName.equals("magento_store_url")) {
            return getMagentoStoreUrl();
        } else if (fieldName.equals("products_mtime")) {
            return getProductsMtime();
        } else if (fieldName.equals("product_search_queries")) {
            return getProductSearchQueries();
        }
        return null;
    }

    public final String getDisplayName() {
        return displayName;
    }

    public final String getEmail() {
        return email;
    }

    @Override
    public Object getFieldValue(final org.apache.thrift.TFieldIdEnum field) {
        throw new UnsupportedOperationException();
    }

    public final String getLogoImageUrl() {
        return logoImageUrl;
    }

    public final String getMagentoStoreUrl() {
        return magentoStoreUrl;
    }

    public final com.google.common.collect.ImmutableList<String> getProductSearchQueries() {
        return productSearchQueries;
    }

    public final org.joda.time.DateTime getProductsMtime() {
        return productsMtime;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        if (getDisplayName() != null) {
            hashCode = 31 * hashCode + getDisplayName().hashCode();
        }
        if (getEmail() != null) {
            hashCode = 31 * hashCode + getEmail().hashCode();
        }
        if (getLogoImageUrl() != null) {
            hashCode = 31 * hashCode + getLogoImageUrl().hashCode();
        }
        if (getMagentoStoreUrl() != null) {
            hashCode = 31 * hashCode + getMagentoStoreUrl().hashCode();
        }
        if (getProductsMtime() != null) {
            hashCode = 31 * hashCode + getProductsMtime().hashCode();
        }
        if (getProductSearchQueries() != null) {
            hashCode = 31 * hashCode + getProductSearchQueries().hashCode();
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
        if (getDisplayName() != null) {
            helper.add("display_name", getDisplayName());
        }
        if (getEmail() != null) {
            helper.add("email", getEmail());
        }
        if (getLogoImageUrl() != null) {
            helper.add("logo_image_url", getLogoImageUrl());
        }
        if (getMagentoStoreUrl() != null) {
            helper.add("magento_store_url", getMagentoStoreUrl());
        }
        if (getProductsMtime() != null) {
            helper.add("products_mtime", getProductsMtime());
        }
        if (getProductSearchQueries() != null) {
            helper.add("product_search_queries", getProductSearchQueries());
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
                oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.VOID, 6));

                if (getDisplayName() != null) {
                    oprot.writeString(getDisplayName());
                } else {
                    ((org.thryft.core.protocol.Protocol)oprot).writeNull();
                }

                if (getEmail() != null) {
                    oprot.writeString(getEmail());
                } else {
                    ((org.thryft.core.protocol.Protocol)oprot).writeNull();
                }

                if (getLogoImageUrl() != null) {
                    oprot.writeString(getLogoImageUrl());
                } else {
                    ((org.thryft.core.protocol.Protocol)oprot).writeNull();
                }

                if (getMagentoStoreUrl() != null) {
                    oprot.writeString(getMagentoStoreUrl());
                } else {
                    ((org.thryft.core.protocol.Protocol)oprot).writeNull();
                }

                if (getProductsMtime() != null) {
                    if (oprot instanceof org.thryft.core.protocol.Protocol) { ((org.thryft.core.protocol.Protocol)oprot).writeDateTime(getProductsMtime()); } else { oprot.writeI64(getProductsMtime().getMillis()); }
                } else {
                    ((org.thryft.core.protocol.Protocol)oprot).writeNull();
                }

                if (getProductSearchQueries() != null) {
                    oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, getProductSearchQueries().size()));
                    for (String _iter0 : getProductSearchQueries()) {
                        oprot.writeString(_iter0);
                    }
                    oprot.writeListEnd();
                } else {
                    ((org.thryft.core.protocol.Protocol)oprot).writeNull();
                }

                oprot.writeListEnd();
                break;

            case org.apache.thrift.protocol.TType.STRUCT:
            default:
                oprot.writeStructBegin(new org.apache.thrift.protocol.TStruct("UserSettings"));

                if (getDisplayName() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("display_name", org.apache.thrift.protocol.TType.STRING, (short)-1));
                    oprot.writeString(getDisplayName());
                    oprot.writeFieldEnd();
                }

                if (getEmail() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("email", org.apache.thrift.protocol.TType.STRING, (short)-1));
                    oprot.writeString(getEmail());
                    oprot.writeFieldEnd();
                }

                if (getLogoImageUrl() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("logo_image_url", org.apache.thrift.protocol.TType.STRING, (short)-1));
                    oprot.writeString(getLogoImageUrl());
                    oprot.writeFieldEnd();
                }

                if (getMagentoStoreUrl() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("magento_store_url", org.apache.thrift.protocol.TType.STRING, (short)-1));
                    oprot.writeString(getMagentoStoreUrl());
                    oprot.writeFieldEnd();
                }

                if (getProductsMtime() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("products_mtime", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                    if (oprot instanceof org.thryft.core.protocol.Protocol) { ((org.thryft.core.protocol.Protocol)oprot).writeDateTime(getProductsMtime()); } else { oprot.writeI64(getProductsMtime().getMillis()); }
                    oprot.writeFieldEnd();
                }

                if (getProductSearchQueries() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("product_search_queries", org.apache.thrift.protocol.TType.LIST, (short)-1));
                    oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, getProductSearchQueries().size()));
                    for (String _iter0 : getProductSearchQueries()) {
                        oprot.writeString(_iter0);
                    }
                    oprot.writeListEnd();
                    oprot.writeFieldEnd();
                }

                oprot.writeFieldStop();

                oprot.writeStructEnd();
                break;
        }
    }

    private final String displayName;
    private final String email;
    private final String logoImageUrl;
    private final String magentoStoreUrl;
    private final org.joda.time.DateTime productsMtime;
    private final com.google.common.collect.ImmutableList<String> productSearchQueries;
}
