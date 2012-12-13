package com.yogento.api.models.user;

@SuppressWarnings({"serial"})
public class UserSettings implements org.apache.thrift.TBase<UserSettings, org.apache.thrift.TFieldIdEnum> {
    public static class Builder {
        public Builder() {
        }

        public Builder(final UserSettings other) {
            this.logoImageUrl = other.getLogoImageUrl();
            this.magentoStoreUrl = other.getMagentoStoreUrl();
            this.productCsvFilePath = other.getProductCsvFilePath();
            this.productCsvMtime = other.getProductCsvMtime();
            this.productSearchQueries = other.getProductSearchQueries();
        }

        protected UserSettings _build(final String logoImageUrl, final String magentoStoreUrl, final String productCsvFilePath, final org.joda.time.DateTime productCsvMtime, final com.google.common.collect.ImmutableList<String> productSearchQueries) {
            return new UserSettings(logoImageUrl, magentoStoreUrl, productCsvFilePath, productCsvMtime, productSearchQueries);
        }

        public UserSettings build() {
            return _build(logoImageUrl, magentoStoreUrl, productCsvFilePath, productCsvMtime, productSearchQueries);
        }

        public Builder setLogoImageUrl(final String logoImageUrl) {
            this.logoImageUrl = logoImageUrl;
            return this;
        }

        public Builder setMagentoStoreUrl(final String magentoStoreUrl) {
            this.magentoStoreUrl = magentoStoreUrl;
            return this;
        }

        public Builder setProductCsvFilePath(final String productCsvFilePath) {
            this.productCsvFilePath = productCsvFilePath;
            return this;
        }

        public Builder setProductCsvMtime(final org.joda.time.DateTime productCsvMtime) {
            this.productCsvMtime = productCsvMtime;
            return this;
        }

        public Builder setProductSearchQueries(final com.google.common.collect.ImmutableList<String> productSearchQueries) {
            this.productSearchQueries = productSearchQueries;
            return this;
        }

        private String logoImageUrl;
        private String magentoStoreUrl;
        private String productCsvFilePath;
        private org.joda.time.DateTime productCsvMtime;
        private com.google.common.collect.ImmutableList<String> productSearchQueries;
    }

    public UserSettings() {
        logoImageUrl = null;
        magentoStoreUrl = null;
        productCsvFilePath = null;
        productCsvMtime = null;
        productSearchQueries = null;
    }

    public UserSettings(final UserSettings other) {
        this(other.getLogoImageUrl(), other.getMagentoStoreUrl(), other.getProductCsvFilePath(), other.getProductCsvMtime(), other.getProductSearchQueries());
    }

    public UserSettings(final org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
        this(iprot, org.apache.thrift.protocol.TType.STRUCT);
    }

    public UserSettings(final org.apache.thrift.protocol.TProtocol iprot, final byte readAsTType) throws org.apache.thrift.TException {
        String logoImageUrl = null;
        String magentoStoreUrl = null;
        String productCsvFilePath = null;
        org.joda.time.DateTime productCsvMtime = null;
        com.google.common.collect.ImmutableList<String> productSearchQueries = null;

        switch (readAsTType) {
            case org.apache.thrift.protocol.TType.LIST:
                iprot.readListBegin();
                logoImageUrl = iprot.readString();
                magentoStoreUrl = iprot.readString();
                productCsvFilePath = iprot.readString();
                try {
                    productCsvMtime = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDateTime() : new org.joda.time.DateTime(iprot.readI64());
                } catch (IllegalArgumentException e) {
                }
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
                iprot.readListEnd();
                break;

            case org.apache.thrift.protocol.TType.STRUCT:
            default:
                iprot.readStructBegin();
                while (true) {
                    org.apache.thrift.protocol.TField ifield = iprot.readFieldBegin();
                    if (ifield.type == org.apache.thrift.protocol.TType.STOP) {
                        break;
                    } else                 if (ifield.name.equals("logo_image_url")) {
                        logoImageUrl = iprot.readString();
                    } else if (ifield.name.equals("magento_store_url")) {
                        magentoStoreUrl = iprot.readString();
                    } else if (ifield.name.equals("product_csv_file_path")) {
                        productCsvFilePath = iprot.readString();
                    } else if (ifield.name.equals("product_csv_mtime")) {
                        try {
                            productCsvMtime = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDateTime() : new org.joda.time.DateTime(iprot.readI64());
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

        this.logoImageUrl = logoImageUrl;
        this.magentoStoreUrl = magentoStoreUrl;
        this.productCsvFilePath = productCsvFilePath;
        this.productCsvMtime = productCsvMtime;
        this.productSearchQueries = productSearchQueries;
    }

    public UserSettings(final String logoImageUrl, final String magentoStoreUrl, final String productCsvFilePath, final org.joda.time.DateTime productCsvMtime, final com.google.common.collect.ImmutableList<String> productSearchQueries) {
        this.logoImageUrl = logoImageUrl;
        this.magentoStoreUrl = magentoStoreUrl;
        this.productCsvFilePath = productCsvFilePath;
        this.productCsvMtime = productCsvMtime;
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
            ((getLogoImageUrl() == null && other.getLogoImageUrl() == null) ||
            (getLogoImageUrl() != null && other.getLogoImageUrl() != null &&
            getLogoImageUrl().equals(other.getLogoImageUrl()))) &&
            ((getMagentoStoreUrl() == null && other.getMagentoStoreUrl() == null) ||
            (getMagentoStoreUrl() != null && other.getMagentoStoreUrl() != null &&
            getMagentoStoreUrl().equals(other.getMagentoStoreUrl()))) &&
            ((getProductCsvFilePath() == null && other.getProductCsvFilePath() == null) ||
            (getProductCsvFilePath() != null && other.getProductCsvFilePath() != null &&
            getProductCsvFilePath().equals(other.getProductCsvFilePath()))) &&
            ((getProductCsvMtime() == null && other.getProductCsvMtime() == null) ||
            (getProductCsvMtime() != null && other.getProductCsvMtime() != null &&
            getProductCsvMtime().equals(other.getProductCsvMtime()))) &&
            ((getProductSearchQueries() == null && other.getProductSearchQueries() == null) ||
            (getProductSearchQueries() != null && other.getProductSearchQueries() != null &&
            getProductSearchQueries().equals(other.getProductSearchQueries())));
    }

    @Override
    public org.apache.thrift.TFieldIdEnum fieldForId(final int fieldId) {
        throw new UnsupportedOperationException();
    }

    public Object get(final String fieldName) {
        if (fieldName.equals("logo_image_url")) {
            return getLogoImageUrl();
        } else if (fieldName.equals("magento_store_url")) {
            return getMagentoStoreUrl();
        } else if (fieldName.equals("product_csv_file_path")) {
            return getProductCsvFilePath();
        } else if (fieldName.equals("product_csv_mtime")) {
            return getProductCsvMtime();
        } else if (fieldName.equals("product_search_queries")) {
            return getProductSearchQueries();
        }
        return null;
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

    public final String getProductCsvFilePath() {
        return productCsvFilePath;
    }

    public final org.joda.time.DateTime getProductCsvMtime() {
        return productCsvMtime;
    }

    public final com.google.common.collect.ImmutableList<String> getProductSearchQueries() {
        return productSearchQueries;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        if (getLogoImageUrl() != null) {
            hashCode = 31 * hashCode + getLogoImageUrl().hashCode();
        }
        if (getMagentoStoreUrl() != null) {
            hashCode = 31 * hashCode + getMagentoStoreUrl().hashCode();
        }
        if (getProductCsvFilePath() != null) {
            hashCode = 31 * hashCode + getProductCsvFilePath().hashCode();
        }
        if (getProductCsvMtime() != null) {
            hashCode = 31 * hashCode + getProductCsvMtime().hashCode();
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
        if (getLogoImageUrl() != null) {
            helper.add("logo_image_url", getLogoImageUrl());
        }
        if (getMagentoStoreUrl() != null) {
            helper.add("magento_store_url", getMagentoStoreUrl());
        }
        if (getProductCsvFilePath() != null) {
            helper.add("product_csv_file_path", getProductCsvFilePath());
        }
        if (getProductCsvMtime() != null) {
            helper.add("product_csv_mtime", getProductCsvMtime());
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
                oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.VOID, 5));

                if (getLogoImageUrl() != null) {
                    oprot.writeString(getLogoImageUrl());
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getMagentoStoreUrl() != null) {
                    oprot.writeString(getMagentoStoreUrl());
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getProductCsvFilePath() != null) {
                    oprot.writeString(getProductCsvFilePath());
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getProductCsvMtime() != null) {
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDateTime(getProductCsvMtime()); } else { oprot.writeI64(getProductCsvMtime().getMillis()); }
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getProductSearchQueries() != null) {
                    oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, getProductSearchQueries().size()));
                    for (String _iter0 : getProductSearchQueries()) {
                        oprot.writeString(_iter0);
                    }
                    oprot.writeListEnd();
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                oprot.writeListEnd();
                break;

            case org.apache.thrift.protocol.TType.STRUCT:
            default:
                oprot.writeStructBegin(new org.apache.thrift.protocol.TStruct("UserSettings"));

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

                if (getProductCsvFilePath() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("product_csv_file_path", org.apache.thrift.protocol.TType.STRING, (short)-1));
                    oprot.writeString(getProductCsvFilePath());
                    oprot.writeFieldEnd();
                }

                if (getProductCsvMtime() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("product_csv_mtime", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDateTime(getProductCsvMtime()); } else { oprot.writeI64(getProductCsvMtime().getMillis()); }
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

    private final String logoImageUrl;
    private final String magentoStoreUrl;
    private final String productCsvFilePath;
    private final org.joda.time.DateTime productCsvMtime;
    private final com.google.common.collect.ImmutableList<String> productSearchQueries;
}
