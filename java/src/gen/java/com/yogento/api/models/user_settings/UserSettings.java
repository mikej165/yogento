package com.yogento.api.models.user_settings;

@SuppressWarnings({"serial"})
public class UserSettings implements org.thryft.TBase<UserSettings> {
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
            this.useSampleData = other.isUseSampleData();
        }

        protected UserSettings _build(final String displayName, final org.thryft.native_.EmailAddress email, final org.thryft.native_.Url logoImageUrl, final org.thryft.native_.Url magentoStoreUrl, final org.joda.time.DateTime productsMtime, final com.google.common.collect.ImmutableList<String> productSearchQueries, final Boolean useSampleData) {
            return new UserSettings(displayName, email, logoImageUrl, magentoStoreUrl, productsMtime, productSearchQueries, useSampleData);
        }

        public UserSettings build() {
            return _build(displayName, email, logoImageUrl, magentoStoreUrl, productsMtime, productSearchQueries, useSampleData);
        }

        public Builder setDisplayName(final String displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setEmail(final org.thryft.native_.EmailAddress email) {
            this.email = email;
            return this;
        }

        public Builder setLogoImageUrl(final org.thryft.native_.Url logoImageUrl) {
            this.logoImageUrl = logoImageUrl;
            return this;
        }

        public Builder setMagentoStoreUrl(final org.thryft.native_.Url magentoStoreUrl) {
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

        public Builder setUseSampleData(final Boolean useSampleData) {
            this.useSampleData = useSampleData;
            return this;
        }

        /**

         */
        private String displayName;
        /**

         */
        private org.thryft.native_.EmailAddress email;
        /**

         */
        private org.thryft.native_.Url logoImageUrl;
        /**

         */
        private org.thryft.native_.Url magentoStoreUrl;
        private org.joda.time.DateTime productsMtime;
        private com.google.common.collect.ImmutableList<String> productSearchQueries;
        private Boolean useSampleData;
    }

    public UserSettings() {
        displayName = null;
        email = null;
        logoImageUrl = null;
        magentoStoreUrl = null;
        productsMtime = null;
        productSearchQueries = null;
        useSampleData = null;
    }

    public UserSettings(final UserSettings other) {
        this(other.getDisplayName(), other.getEmail(), other.getLogoImageUrl(), other.getMagentoStoreUrl(), other.getProductsMtime(), other.getProductSearchQueries(), other.isUseSampleData());
    }

    public UserSettings(final org.thryft.protocol.TProtocol iprot) throws java.io.IOException {
        this(iprot, org.thryft.protocol.TType.STRUCT);
    }

    public UserSettings(final org.thryft.protocol.TProtocol iprot, final byte readAsTType) throws java.io.IOException {
        String displayName = null;
        org.thryft.native_.EmailAddress email = null;
        org.thryft.native_.Url logoImageUrl = null;
        org.thryft.native_.Url magentoStoreUrl = null;
        org.joda.time.DateTime productsMtime = null;
        com.google.common.collect.ImmutableList<String> productSearchQueries = null;
        Boolean useSampleData = null;

        switch (readAsTType) {
            case org.thryft.protocol.TType.LIST:
                final org.thryft.protocol.TList __list = iprot.readListBegin();
                if (__list.size > 0) {
                    displayName = iprot.readString();
                }
                if (__list.size > 1) {
                    email = iprot.readEmailAddress();
                }
                if (__list.size > 2) {
                    try {
                        logoImageUrl = iprot.readUrl();
                    } catch (java.net.MalformedURLException e) {
                    }
                }
                if (__list.size > 3) {
                    try {
                        magentoStoreUrl = iprot.readUrl();
                    } catch (java.net.MalformedURLException e) {
                    }
                }
                if (__list.size > 4) {
                    try {
                        productsMtime = iprot.readDateTime();
                    } catch (IllegalArgumentException e) {
                    }
                }
                if (__list.size > 5) {
                    productSearchQueries = (new com.google.common.base.Function<org.thryft.protocol.TProtocol, com.google.common.collect.ImmutableList<String>>() {
                        @Override
                        public com.google.common.collect.ImmutableList<String> apply(final org.thryft.protocol.TProtocol iprot) {
                            try {
                                final org.thryft.protocol.TList sequenceBegin = iprot.readListBegin();
                                final java.util.List<String> sequence = new java.util.ArrayList<String>();
                                for (int elementI = 0; elementI < sequenceBegin.size; elementI++) {
                                    sequence.add(iprot.readString());
                                }
                                iprot.readListEnd();
                                return com.google.common.collect.ImmutableList.copyOf(sequence);
                            } catch (final java.io.IOException e) {
                                return com.google.common.collect.ImmutableList.of();
                            }
                        }
                    }).apply(iprot);
                }
                if (__list.size > 6) {
                    useSampleData = iprot.readBool();
                }
                iprot.readListEnd();
                break;

            case org.thryft.protocol.TType.STRUCT:
            default:
                iprot.readStructBegin();
                while (true) {
                    final org.thryft.protocol.TField ifield = iprot.readFieldBegin();
                    if (ifield.type == org.thryft.protocol.TType.STOP) {
                        break;
                    } else if (ifield.name.equals("display_name")) {
                        displayName = iprot.readString();
                    } else if (ifield.name.equals("email")) {
                        email = iprot.readEmailAddress();
                    } else if (ifield.name.equals("logo_image_url")) {
                        try {
                            logoImageUrl = iprot.readUrl();
                        } catch (java.net.MalformedURLException e) {
                        }
                    } else if (ifield.name.equals("magento_store_url")) {
                        try {
                            magentoStoreUrl = iprot.readUrl();
                        } catch (java.net.MalformedURLException e) {
                        }
                    } else if (ifield.name.equals("products_mtime")) {
                        try {
                            productsMtime = iprot.readDateTime();
                        } catch (IllegalArgumentException e) {
                        }
                    } else if (ifield.name.equals("product_search_queries")) {
                        productSearchQueries = (new com.google.common.base.Function<org.thryft.protocol.TProtocol, com.google.common.collect.ImmutableList<String>>() {
                            @Override
                            public com.google.common.collect.ImmutableList<String> apply(final org.thryft.protocol.TProtocol iprot) {
                                try {
                                    final org.thryft.protocol.TList sequenceBegin = iprot.readListBegin();
                                    final java.util.List<String> sequence = new java.util.ArrayList<String>();
                                    for (int elementI = 0; elementI < sequenceBegin.size; elementI++) {
                                        sequence.add(iprot.readString());
                                    }
                                    iprot.readListEnd();
                                    return com.google.common.collect.ImmutableList.copyOf(sequence);
                                } catch (final java.io.IOException e) {
                                    return com.google.common.collect.ImmutableList.of();
                                }
                            }
                        }).apply(iprot);
                    } else if (ifield.name.equals("use_sample_data")) {
                        useSampleData = iprot.readBool();
                    }
                    iprot.readFieldEnd();
                }
                iprot.readStructEnd();
                break;
        }

        this.displayName = displayName != null ? org.thryft.Preconditions.checkNotEmpty(displayName, "com.yogento.api.models.user_settings.UserSettings: displayName is empty") : null;
        this.email = email;
        this.logoImageUrl = logoImageUrl;
        this.magentoStoreUrl = magentoStoreUrl;
        this.productsMtime = productsMtime;
        this.productSearchQueries = productSearchQueries;
        this.useSampleData = useSampleData;
    }

    public UserSettings(final String displayName, final org.thryft.native_.EmailAddress email, final org.thryft.native_.Url logoImageUrl, final org.thryft.native_.Url magentoStoreUrl, final org.joda.time.DateTime productsMtime, final com.google.common.collect.ImmutableList<String> productSearchQueries, final Boolean useSampleData) {
        this.displayName = displayName != null ? org.thryft.Preconditions.checkNotEmpty(displayName, "com.yogento.api.models.user_settings.UserSettings: displayName is empty") : null;
        this.email = email;
        this.logoImageUrl = logoImageUrl;
        this.magentoStoreUrl = magentoStoreUrl;
        this.productsMtime = productsMtime;
        this.productSearchQueries = productSearchQueries;
        this.useSampleData = useSampleData;
    }

    @Override
    public int compareTo(final UserSettings other) {
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
            getProductSearchQueries().equals(other.getProductSearchQueries()))) &&
            ((isUseSampleData() == null && other.isUseSampleData() == null) ||
            (isUseSampleData() != null && other.isUseSampleData() != null &&
            isUseSampleData().equals(other.isUseSampleData())));
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
        } else if (fieldName.equals("use_sample_data")) {
            return isUseSampleData();
        }
        return null;
    }

    /**

     */
    public final String getDisplayName() {
        return displayName;
    }

    /**

     */
    public final org.thryft.native_.EmailAddress getEmail() {
        return email;
    }

    /**

     */
    public final org.thryft.native_.Url getLogoImageUrl() {
        return logoImageUrl;
    }

    /**

     */
    public final org.thryft.native_.Url getMagentoStoreUrl() {
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
        if (isUseSampleData() != null) {
            hashCode = 31 * hashCode + (isUseSampleData() ? 1 : 0);
        }
        return hashCode;
    }

    public final Boolean isUseSampleData() {
        return useSampleData;
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
        if (isUseSampleData() != null) {
            helper.add("use_sample_data", isUseSampleData());
        }
        return helper.toString();
    }

    @Override
    public void write(final org.thryft.protocol.TProtocol oprot) throws java.io.IOException {
        write(oprot, org.thryft.protocol.TType.STRUCT);
    }

    public void write(final org.thryft.protocol.TProtocol oprot, final byte writeAsTType) throws java.io.IOException {
        switch (writeAsTType) {
            case org.thryft.protocol.TType.VOID:
            case org.thryft.protocol.TType.LIST:
                oprot.writeListBegin(new org.thryft.protocol.TList(org.thryft.protocol.TType.VOID, 7));

                if (getDisplayName() != null) {
                    oprot.writeString(getDisplayName());
                } else {
                    ((org.thryft.protocol.TProtocol)oprot).writeNull();
                }

                if (getEmail() != null) {
                    oprot.writeEmailAddress(getEmail());
                } else {
                    ((org.thryft.protocol.TProtocol)oprot).writeNull();
                }

                if (getLogoImageUrl() != null) {
                    oprot.writeUrl(getLogoImageUrl());
                } else {
                    ((org.thryft.protocol.TProtocol)oprot).writeNull();
                }

                if (getMagentoStoreUrl() != null) {
                    oprot.writeUrl(getMagentoStoreUrl());
                } else {
                    ((org.thryft.protocol.TProtocol)oprot).writeNull();
                }

                if (getProductsMtime() != null) {
                    oprot.writeDateTime(getProductsMtime());
                } else {
                    ((org.thryft.protocol.TProtocol)oprot).writeNull();
                }

                if (getProductSearchQueries() != null) {
                    oprot.writeListBegin(new org.thryft.protocol.TList(org.thryft.protocol.TType.STRING, getProductSearchQueries().size()));
                    for (final String _iter0 : getProductSearchQueries()) {
                        oprot.writeString(_iter0);
                    }
                    oprot.writeListEnd();
                } else {
                    ((org.thryft.protocol.TProtocol)oprot).writeNull();
                }

                if (isUseSampleData() != null) {
                    oprot.writeBool(isUseSampleData());
                } else {
                    ((org.thryft.protocol.TProtocol)oprot).writeNull();
                }

                oprot.writeListEnd();
                break;

            case org.thryft.protocol.TType.STRUCT:
            default:
                oprot.writeStructBegin(new org.thryft.protocol.TStruct("UserSettings"));

                if (getDisplayName() != null) {
                    oprot.writeFieldBegin(new org.thryft.protocol.TField("display_name", org.thryft.protocol.TType.STRING, (short)-1));
                    oprot.writeString(getDisplayName());
                    oprot.writeFieldEnd();
                }

                if (getEmail() != null) {
                    oprot.writeFieldBegin(new org.thryft.protocol.TField("email", org.thryft.protocol.TType.STRUCT, (short)-1));
                    oprot.writeEmailAddress(getEmail());
                    oprot.writeFieldEnd();
                }

                if (getLogoImageUrl() != null) {
                    oprot.writeFieldBegin(new org.thryft.protocol.TField("logo_image_url", org.thryft.protocol.TType.STRUCT, (short)-1));
                    oprot.writeUrl(getLogoImageUrl());
                    oprot.writeFieldEnd();
                }

                if (getMagentoStoreUrl() != null) {
                    oprot.writeFieldBegin(new org.thryft.protocol.TField("magento_store_url", org.thryft.protocol.TType.STRUCT, (short)-1));
                    oprot.writeUrl(getMagentoStoreUrl());
                    oprot.writeFieldEnd();
                }

                if (getProductsMtime() != null) {
                    oprot.writeFieldBegin(new org.thryft.protocol.TField("products_mtime", org.thryft.protocol.TType.STRUCT, (short)-1));
                    oprot.writeDateTime(getProductsMtime());
                    oprot.writeFieldEnd();
                }

                if (getProductSearchQueries() != null) {
                    oprot.writeFieldBegin(new org.thryft.protocol.TField("product_search_queries", org.thryft.protocol.TType.LIST, (short)-1));
                    oprot.writeListBegin(new org.thryft.protocol.TList(org.thryft.protocol.TType.STRING, getProductSearchQueries().size()));
                    for (final String _iter0 : getProductSearchQueries()) {
                        oprot.writeString(_iter0);
                    }
                    oprot.writeListEnd();
                    oprot.writeFieldEnd();
                }

                if (isUseSampleData() != null) {
                    oprot.writeFieldBegin(new org.thryft.protocol.TField("use_sample_data", org.thryft.protocol.TType.BOOL, (short)-1));
                    oprot.writeBool(isUseSampleData());
                    oprot.writeFieldEnd();
                }

                oprot.writeFieldStop();

                oprot.writeStructEnd();
                break;
        }
    }

    /**

     */
    private final String displayName;

    /**

     */
    private final org.thryft.native_.EmailAddress email;

    /**

     */
    private final org.thryft.native_.Url logoImageUrl;

    /**

     */
    private final org.thryft.native_.Url magentoStoreUrl;

    private final org.joda.time.DateTime productsMtime;

    private final com.google.common.collect.ImmutableList<String> productSearchQueries;

    private final Boolean useSampleData;
}
