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
            this.useSampleData = other.getUseSampleData();
        }

        protected UserSettings _build(final com.google.common.base.Optional<String> displayName, final com.google.common.base.Optional<org.thryft.native_.EmailAddress> email, final com.google.common.base.Optional<org.thryft.native_.Url> logoImageUrl, final com.google.common.base.Optional<org.thryft.native_.Url> magentoStoreUrl, final com.google.common.base.Optional<org.joda.time.DateTime> productsMtime, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> productSearchQueries, final com.google.common.base.Optional<Boolean> useSampleData) {
            return new UserSettings(displayName, email, logoImageUrl, magentoStoreUrl, productsMtime, productSearchQueries, useSampleData);
        }

        public UserSettings build() {
            return _build(displayName, email, logoImageUrl, magentoStoreUrl, productsMtime, productSearchQueries, useSampleData);
        }

        public Builder setDisplayName(final com.google.common.base.Optional<String> displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setDisplayName(final String displayName) {
            this.displayName = com.google.common.base.Optional.fromNullable(displayName);
            return this;
        }

        public Builder setEmail(final com.google.common.base.Optional<org.thryft.native_.EmailAddress> email) {
            this.email = email;
            return this;
        }

        public Builder setEmail(final org.thryft.native_.EmailAddress email) {
            this.email = com.google.common.base.Optional.fromNullable(email);
            return this;
        }

        public Builder setLogoImageUrl(final com.google.common.base.Optional<org.thryft.native_.Url> logoImageUrl) {
            this.logoImageUrl = logoImageUrl;
            return this;
        }

        public Builder setLogoImageUrl(final org.thryft.native_.Url logoImageUrl) {
            this.logoImageUrl = com.google.common.base.Optional.fromNullable(logoImageUrl);
            return this;
        }

        public Builder setMagentoStoreUrl(final com.google.common.base.Optional<org.thryft.native_.Url> magentoStoreUrl) {
            this.magentoStoreUrl = magentoStoreUrl;
            return this;
        }

        public Builder setMagentoStoreUrl(final org.thryft.native_.Url magentoStoreUrl) {
            this.magentoStoreUrl = com.google.common.base.Optional.fromNullable(magentoStoreUrl);
            return this;
        }

        public Builder setProductSearchQueries(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> productSearchQueries) {
            this.productSearchQueries = productSearchQueries;
            return this;
        }

        public Builder setProductSearchQueries(final com.google.common.collect.ImmutableList<String> productSearchQueries) {
            this.productSearchQueries = com.google.common.base.Optional.fromNullable(productSearchQueries);
            return this;
        }

        public Builder setProductsMtime(final com.google.common.base.Optional<org.joda.time.DateTime> productsMtime) {
            this.productsMtime = productsMtime;
            return this;
        }

        public Builder setProductsMtime(final org.joda.time.DateTime productsMtime) {
            this.productsMtime = com.google.common.base.Optional.fromNullable(productsMtime);
            return this;
        }

        public Builder setUseSampleData(final com.google.common.base.Optional<Boolean> useSampleData) {
            this.useSampleData = useSampleData;
            return this;
        }

        public Builder setUseSampleData(final boolean useSampleData) {
            this.useSampleData = com.google.common.base.Optional.fromNullable(useSampleData);
            return this;
        }

        private com.google.common.base.Optional<String> displayName = com.google.common.base.Optional.absent();
        private com.google.common.base.Optional<org.thryft.native_.EmailAddress> email = com.google.common.base.Optional.absent();
        private com.google.common.base.Optional<org.thryft.native_.Url> logoImageUrl = com.google.common.base.Optional.absent();
        private com.google.common.base.Optional<org.thryft.native_.Url> magentoStoreUrl = com.google.common.base.Optional.absent();
        private com.google.common.base.Optional<org.joda.time.DateTime> productsMtime = com.google.common.base.Optional.absent();
        private com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> productSearchQueries = com.google.common.base.Optional.absent();
        private com.google.common.base.Optional<Boolean> useSampleData = com.google.common.base.Optional.absent();
    }

    public UserSettings() {
        displayName = com.google.common.base.Optional.absent();
        email = com.google.common.base.Optional.absent();
        logoImageUrl = com.google.common.base.Optional.absent();
        magentoStoreUrl = com.google.common.base.Optional.absent();
        productsMtime = com.google.common.base.Optional.absent();
        productSearchQueries = com.google.common.base.Optional.absent();
        useSampleData = com.google.common.base.Optional.absent();
    }

    public UserSettings(final UserSettings other) {
        this(other.getDisplayName(), other.getEmail(), other.getLogoImageUrl(), other.getMagentoStoreUrl(), other.getProductsMtime(), other.getProductSearchQueries(), other.getUseSampleData());
    }

    public UserSettings(final org.thryft.protocol.TProtocol iprot) throws java.io.IOException {
        this(iprot, org.thryft.protocol.TType.STRUCT);
    }

    public UserSettings(final org.thryft.protocol.TProtocol iprot, final byte readAsTType) throws java.io.IOException {
        com.google.common.base.Optional<String> displayName = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<org.thryft.native_.EmailAddress> email = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<org.thryft.native_.Url> logoImageUrl = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<org.thryft.native_.Url> magentoStoreUrl = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<org.joda.time.DateTime> productsMtime = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> productSearchQueries = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<Boolean> useSampleData = com.google.common.base.Optional.absent();

        switch (readAsTType) {
            case org.thryft.protocol.TType.LIST:
                final org.thryft.protocol.TList __list = iprot.readListBegin();
                if (__list.size > 0) {
                    displayName = com.google.common.base.Optional.of(iprot.readString());
                }
                if (__list.size > 1) {
                    email = com.google.common.base.Optional.of(iprot.readEmailAddress());
                }
                if (__list.size > 2) {
                    try {
                        logoImageUrl = com.google.common.base.Optional.of(iprot.readUrl());
                    } catch (java.net.MalformedURLException e) {
                    }
                }
                if (__list.size > 3) {
                    try {
                        magentoStoreUrl = com.google.common.base.Optional.of(iprot.readUrl());
                    } catch (java.net.MalformedURLException e) {
                    }
                }
                if (__list.size > 4) {
                    try {
                        productsMtime = com.google.common.base.Optional.of(iprot.readDateTime());
                    } catch (IllegalArgumentException e) {
                    }
                }
                if (__list.size > 5) {
                    productSearchQueries = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.TProtocol, com.google.common.collect.ImmutableList<String>>() {
                        @Override
                        public com.google.common.collect.ImmutableList<String> apply(final org.thryft.protocol.TProtocol iprot) {
                            try {
                                final org.thryft.protocol.TList sequenceBegin = iprot.readListBegin();
                                final com.google.common.collect.ImmutableList.Builder<String> sequence = com.google.common.collect.ImmutableList.builder();
                                for (int elementI = 0; elementI < sequenceBegin.size; elementI++) {
                                    sequence.add(iprot.readString());
                                }
                                iprot.readListEnd();
                                return sequence.build();
                            } catch (final java.io.IOException e) {
                                return com.google.common.collect.ImmutableList.of();
                            }
                        }
                    }).apply(iprot));
                }
                if (__list.size > 6) {
                    useSampleData = com.google.common.base.Optional.of(iprot.readBool());
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
                        displayName = com.google.common.base.Optional.of(iprot.readString());
                    } else if (ifield.name.equals("email")) {
                        email = com.google.common.base.Optional.of(iprot.readEmailAddress());
                    } else if (ifield.name.equals("logo_image_url")) {
                        try {
                            logoImageUrl = com.google.common.base.Optional.of(iprot.readUrl());
                        } catch (java.net.MalformedURLException e) {
                        }
                    } else if (ifield.name.equals("magento_store_url")) {
                        try {
                            magentoStoreUrl = com.google.common.base.Optional.of(iprot.readUrl());
                        } catch (java.net.MalformedURLException e) {
                        }
                    } else if (ifield.name.equals("products_mtime")) {
                        try {
                            productsMtime = com.google.common.base.Optional.of(iprot.readDateTime());
                        } catch (IllegalArgumentException e) {
                        }
                    } else if (ifield.name.equals("product_search_queries")) {
                        productSearchQueries = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.TProtocol, com.google.common.collect.ImmutableList<String>>() {
                            @Override
                            public com.google.common.collect.ImmutableList<String> apply(final org.thryft.protocol.TProtocol iprot) {
                                try {
                                    final org.thryft.protocol.TList sequenceBegin = iprot.readListBegin();
                                    final com.google.common.collect.ImmutableList.Builder<String> sequence = com.google.common.collect.ImmutableList.builder();
                                    for (int elementI = 0; elementI < sequenceBegin.size; elementI++) {
                                        sequence.add(iprot.readString());
                                    }
                                    iprot.readListEnd();
                                    return sequence.build();
                                } catch (final java.io.IOException e) {
                                    return com.google.common.collect.ImmutableList.of();
                                }
                            }
                        }).apply(iprot));
                    } else if (ifield.name.equals("use_sample_data")) {
                        useSampleData = com.google.common.base.Optional.of(iprot.readBool());
                    }
                    iprot.readFieldEnd();
                }
                iprot.readStructEnd();
                break;
        }

        this.displayName = org.thryft.Preconditions.checkNotEmpty(displayName, String.class, "com.yogento.api.models.user_settings.UserSettings: displayName is empty");
        this.email = email;
        this.logoImageUrl = logoImageUrl;
        this.magentoStoreUrl = magentoStoreUrl;
        this.productsMtime = productsMtime;
        this.productSearchQueries = productSearchQueries;
        this.useSampleData = useSampleData;
    }

    public UserSettings(final com.google.common.base.Optional<String> displayName, final com.google.common.base.Optional<org.thryft.native_.EmailAddress> email, final com.google.common.base.Optional<org.thryft.native_.Url> logoImageUrl, final com.google.common.base.Optional<org.thryft.native_.Url> magentoStoreUrl, final com.google.common.base.Optional<org.joda.time.DateTime> productsMtime, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> productSearchQueries, final com.google.common.base.Optional<Boolean> useSampleData) {
        this.displayName = org.thryft.Preconditions.checkNotEmpty(com.google.common.base.Preconditions.checkNotNull(displayName, "com.yogento.api.models.user_settings.UserSettings: missing displayName"), String.class, "com.yogento.api.models.user_settings.UserSettings: displayName is empty");
        this.email = com.google.common.base.Preconditions.checkNotNull(email, "com.yogento.api.models.user_settings.UserSettings: missing email");
        this.logoImageUrl = com.google.common.base.Preconditions.checkNotNull(logoImageUrl, "com.yogento.api.models.user_settings.UserSettings: missing logoImageUrl");
        this.magentoStoreUrl = com.google.common.base.Preconditions.checkNotNull(magentoStoreUrl, "com.yogento.api.models.user_settings.UserSettings: missing magentoStoreUrl");
        this.productsMtime = com.google.common.base.Preconditions.checkNotNull(productsMtime, "com.yogento.api.models.user_settings.UserSettings: missing productsMtime");
        this.productSearchQueries = com.google.common.base.Preconditions.checkNotNull(productSearchQueries, "com.yogento.api.models.user_settings.UserSettings: missing productSearchQueries");
        this.useSampleData = useSampleData;
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public int compareTo(final UserSettings other) {
        if (other == null) {
            throw new NullPointerException();
        }

        int result;
        if (this.displayName.isPresent()) {
            if (other.displayName.isPresent()) {
                result = this.displayName.get().compareTo(other.displayName.get());
                if (result != 0) {
                    return result;
                }
            } else {
                return 1;
            }
        } else if (other.displayName.isPresent()) {
            return -1;
        }

        if (this.email.isPresent()) {
            if (other.email.isPresent()) {
                result = this.email.get().compareTo(other.email.get());
                if (result != 0) {
                    return result;
                }
            } else {
                return 1;
            }
        } else if (other.email.isPresent()) {
            return -1;
        }

        if (this.logoImageUrl.isPresent()) {
            if (other.logoImageUrl.isPresent()) {
                result = this.logoImageUrl.get().compareTo(other.logoImageUrl.get());
                if (result != 0) {
                    return result;
                }
            } else {
                return 1;
            }
        } else if (other.logoImageUrl.isPresent()) {
            return -1;
        }

        if (this.magentoStoreUrl.isPresent()) {
            if (other.magentoStoreUrl.isPresent()) {
                result = this.magentoStoreUrl.get().compareTo(other.magentoStoreUrl.get());
                if (result != 0) {
                    return result;
                }
            } else {
                return 1;
            }
        } else if (other.magentoStoreUrl.isPresent()) {
            return -1;
        }

        if (this.productsMtime.isPresent()) {
            if (other.productsMtime.isPresent()) {
                result = this.productsMtime.get().compareTo(other.productsMtime.get());
                if (result != 0) {
                    return result;
                }
            } else {
                return 1;
            }
        } else if (other.productsMtime.isPresent()) {
            return -1;
        }

        if (this.productSearchQueries.isPresent()) {
            if (other.productSearchQueries.isPresent()) {
                result = org.thryft.Comparators.compare(this.productSearchQueries.get(), other.productSearchQueries.get());
                if (result != 0) {
                    return result;
                }
            } else {
                return 1;
            }
        } else if (other.productSearchQueries.isPresent()) {
            return -1;
        }

        if (this.useSampleData.isPresent()) {
            if (other.useSampleData.isPresent()) {
                result = ((Boolean)this.useSampleData.get()).compareTo(other.useSampleData.get());
                if (result != 0) {
                    return result;
                }
            } else {
                return 1;
            }
        } else if (other.useSampleData.isPresent()) {
            return -1;
        }

        return 0;
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
            getDisplayName().equals(other.getDisplayName()) &&
            getEmail().equals(other.getEmail()) &&
            getLogoImageUrl().equals(other.getLogoImageUrl()) &&
            getMagentoStoreUrl().equals(other.getMagentoStoreUrl()) &&
            getProductsMtime().equals(other.getProductsMtime()) &&
            getProductSearchQueries().equals(other.getProductSearchQueries()) &&
            getUseSampleData().equals(other.getUseSampleData());
    }

    public static UserSettings fake() {
        return fakeBuilder().build();
    }

    public static Builder fakeBuilder() {
        Builder builder = new Builder();
        builder.setDisplayName(org.thryft.Faker.Lorem.word());
        builder.setEmail(org.thryft.Faker.Internet.email());
        builder.setLogoImageUrl(org.thryft.Faker.Internet.url());
        builder.setMagentoStoreUrl(org.thryft.Faker.Internet.url());
        builder.setProductsMtime(org.joda.time.DateTime.now());
        builder.setProductSearchQueries(com.google.common.collect.ImmutableList.of(org.thryft.Faker.Lorem.word()));
        builder.setUseSampleData(org.thryft.Faker.randomBool());
        return builder;
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
            return getUseSampleData();
        }
        throw new IllegalArgumentException(fieldName);
    }

    public final com.google.common.base.Optional<String> getDisplayName() {
        return displayName;
    }

    public final com.google.common.base.Optional<org.thryft.native_.EmailAddress> getEmail() {
        return email;
    }

    public final com.google.common.base.Optional<org.thryft.native_.Url> getLogoImageUrl() {
        return logoImageUrl;
    }

    public final com.google.common.base.Optional<org.thryft.native_.Url> getMagentoStoreUrl() {
        return magentoStoreUrl;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> getProductSearchQueries() {
        return productSearchQueries;
    }

    public final com.google.common.base.Optional<org.joda.time.DateTime> getProductsMtime() {
        return productsMtime;
    }

    public final com.google.common.base.Optional<Boolean> getUseSampleData() {
        return useSampleData;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        if (getDisplayName().isPresent()) {
            hashCode = 31 * hashCode + getDisplayName().get().hashCode();
        }
        if (getEmail().isPresent()) {
            hashCode = 31 * hashCode + getEmail().get().hashCode();
        }
        if (getLogoImageUrl().isPresent()) {
            hashCode = 31 * hashCode + getLogoImageUrl().get().hashCode();
        }
        if (getMagentoStoreUrl().isPresent()) {
            hashCode = 31 * hashCode + getMagentoStoreUrl().get().hashCode();
        }
        if (getProductsMtime().isPresent()) {
            hashCode = 31 * hashCode + getProductsMtime().get().hashCode();
        }
        if (getProductSearchQueries().isPresent()) {
            hashCode = 31 * hashCode + getProductSearchQueries().get().hashCode();
        }
        if (getUseSampleData().isPresent()) {
            hashCode = 31 * hashCode + (getUseSampleData().get() ? 1 : 0);
        }
        return hashCode;
    }

    public UserSettings replaceDisplayName(final com.google.common.base.Optional<String> displayName) {
        return new UserSettings(displayName, this.email, this.logoImageUrl, this.magentoStoreUrl, this.productsMtime, this.productSearchQueries, this.useSampleData);
    }

    public UserSettings replaceDisplayName(final String displayName) {
        return replaceDisplayName(com.google.common.base.Optional.fromNullable(displayName));
    }

    public UserSettings replaceEmail(final com.google.common.base.Optional<org.thryft.native_.EmailAddress> email) {
        return new UserSettings(this.displayName, email, this.logoImageUrl, this.magentoStoreUrl, this.productsMtime, this.productSearchQueries, this.useSampleData);
    }

    public UserSettings replaceEmail(final org.thryft.native_.EmailAddress email) {
        return replaceEmail(com.google.common.base.Optional.fromNullable(email));
    }

    public UserSettings replaceLogoImageUrl(final com.google.common.base.Optional<org.thryft.native_.Url> logoImageUrl) {
        return new UserSettings(this.displayName, this.email, logoImageUrl, this.magentoStoreUrl, this.productsMtime, this.productSearchQueries, this.useSampleData);
    }

    public UserSettings replaceLogoImageUrl(final org.thryft.native_.Url logoImageUrl) {
        return replaceLogoImageUrl(com.google.common.base.Optional.fromNullable(logoImageUrl));
    }

    public UserSettings replaceMagentoStoreUrl(final com.google.common.base.Optional<org.thryft.native_.Url> magentoStoreUrl) {
        return new UserSettings(this.displayName, this.email, this.logoImageUrl, magentoStoreUrl, this.productsMtime, this.productSearchQueries, this.useSampleData);
    }

    public UserSettings replaceMagentoStoreUrl(final org.thryft.native_.Url magentoStoreUrl) {
        return replaceMagentoStoreUrl(com.google.common.base.Optional.fromNullable(magentoStoreUrl));
    }

    public UserSettings replaceProductSearchQueries(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> productSearchQueries) {
        return new UserSettings(this.displayName, this.email, this.logoImageUrl, this.magentoStoreUrl, this.productsMtime, productSearchQueries, this.useSampleData);
    }

    public UserSettings replaceProductSearchQueries(final com.google.common.collect.ImmutableList<String> productSearchQueries) {
        return replaceProductSearchQueries(com.google.common.base.Optional.fromNullable(productSearchQueries));
    }

    public UserSettings replaceProductsMtime(final com.google.common.base.Optional<org.joda.time.DateTime> productsMtime) {
        return new UserSettings(this.displayName, this.email, this.logoImageUrl, this.magentoStoreUrl, productsMtime, this.productSearchQueries, this.useSampleData);
    }

    public UserSettings replaceProductsMtime(final org.joda.time.DateTime productsMtime) {
        return replaceProductsMtime(com.google.common.base.Optional.fromNullable(productsMtime));
    }

    public UserSettings replaceUseSampleData(final com.google.common.base.Optional<Boolean> useSampleData) {
        return new UserSettings(this.displayName, this.email, this.logoImageUrl, this.magentoStoreUrl, this.productsMtime, this.productSearchQueries, useSampleData);
    }

    public UserSettings replaceUseSampleData(final boolean useSampleData) {
        return replaceUseSampleData(com.google.common.base.Optional.fromNullable(useSampleData));
    }

    @Override
    public String toString() {
        final com.google.common.base.Objects.ToStringHelper helper = com.google.common.base.Objects.toStringHelper(this);
        if (getDisplayName().isPresent()) {
            helper.add("display_name", getDisplayName());
        }
        if (getEmail().isPresent()) {
            helper.add("email", getEmail());
        }
        if (getLogoImageUrl().isPresent()) {
            helper.add("logo_image_url", getLogoImageUrl());
        }
        if (getMagentoStoreUrl().isPresent()) {
            helper.add("magento_store_url", getMagentoStoreUrl());
        }
        if (getProductsMtime().isPresent()) {
            helper.add("products_mtime", getProductsMtime());
        }
        if (getProductSearchQueries().isPresent()) {
            helper.add("product_search_queries", getProductSearchQueries());
        }
        if (getUseSampleData().isPresent()) {
            helper.add("use_sample_data", getUseSampleData());
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

                if (getDisplayName().isPresent()) {
                    oprot.writeString(getDisplayName().get());
                } else {
                    oprot.writeNull();
                }

                if (getEmail().isPresent()) {
                    oprot.writeEmailAddress(getEmail().get());
                } else {
                    oprot.writeNull();
                }

                if (getLogoImageUrl().isPresent()) {
                    oprot.writeUrl(getLogoImageUrl().get());
                } else {
                    oprot.writeNull();
                }

                if (getMagentoStoreUrl().isPresent()) {
                    oprot.writeUrl(getMagentoStoreUrl().get());
                } else {
                    oprot.writeNull();
                }

                if (getProductsMtime().isPresent()) {
                    oprot.writeDateTime(getProductsMtime().get());
                } else {
                    oprot.writeNull();
                }

                if (getProductSearchQueries().isPresent()) {
                    oprot.writeListBegin(new org.thryft.protocol.TList(org.thryft.protocol.TType.STRING, getProductSearchQueries().get().size()));
                    for (final String _iter0 : getProductSearchQueries().get()) {
                        oprot.writeString(_iter0);
                    }
                    oprot.writeListEnd();
                } else {
                    oprot.writeNull();
                }

                if (getUseSampleData().isPresent()) {
                    oprot.writeBool(getUseSampleData().get());
                } else {
                    oprot.writeNull();
                }

                oprot.writeListEnd();
                break;

            case org.thryft.protocol.TType.STRUCT:
            default:
                oprot.writeStructBegin(new org.thryft.protocol.TStruct("UserSettings"));

                if (getDisplayName().isPresent()) {
                    oprot.writeFieldBegin(new org.thryft.protocol.TField("display_name", org.thryft.protocol.TType.STRING, (short)-1));
                    oprot.writeString(getDisplayName().get());
                    oprot.writeFieldEnd();
                }

                if (getEmail().isPresent()) {
                    oprot.writeFieldBegin(new org.thryft.protocol.TField("email", org.thryft.protocol.TType.STRUCT, (short)-1));
                    oprot.writeEmailAddress(getEmail().get());
                    oprot.writeFieldEnd();
                }

                if (getLogoImageUrl().isPresent()) {
                    oprot.writeFieldBegin(new org.thryft.protocol.TField("logo_image_url", org.thryft.protocol.TType.STRUCT, (short)-1));
                    oprot.writeUrl(getLogoImageUrl().get());
                    oprot.writeFieldEnd();
                }

                if (getMagentoStoreUrl().isPresent()) {
                    oprot.writeFieldBegin(new org.thryft.protocol.TField("magento_store_url", org.thryft.protocol.TType.STRUCT, (short)-1));
                    oprot.writeUrl(getMagentoStoreUrl().get());
                    oprot.writeFieldEnd();
                }

                if (getProductsMtime().isPresent()) {
                    oprot.writeFieldBegin(new org.thryft.protocol.TField("products_mtime", org.thryft.protocol.TType.STRUCT, (short)-1));
                    oprot.writeDateTime(getProductsMtime().get());
                    oprot.writeFieldEnd();
                }

                if (getProductSearchQueries().isPresent()) {
                    oprot.writeFieldBegin(new org.thryft.protocol.TField("product_search_queries", org.thryft.protocol.TType.LIST, (short)-1));
                    oprot.writeListBegin(new org.thryft.protocol.TList(org.thryft.protocol.TType.STRING, getProductSearchQueries().get().size()));
                    for (final String _iter0 : getProductSearchQueries().get()) {
                        oprot.writeString(_iter0);
                    }
                    oprot.writeListEnd();
                    oprot.writeFieldEnd();
                }

                if (getUseSampleData().isPresent()) {
                    oprot.writeFieldBegin(new org.thryft.protocol.TField("use_sample_data", org.thryft.protocol.TType.BOOL, (short)-1));
                    oprot.writeBool(getUseSampleData().get());
                    oprot.writeFieldEnd();
                }

                oprot.writeFieldStop();

                oprot.writeStructEnd();
                break;
        }
    }

    private final com.google.common.base.Optional<String> displayName;

    private final com.google.common.base.Optional<org.thryft.native_.EmailAddress> email;

    private final com.google.common.base.Optional<org.thryft.native_.Url> logoImageUrl;

    private final com.google.common.base.Optional<org.thryft.native_.Url> magentoStoreUrl;

    private final com.google.common.base.Optional<org.joda.time.DateTime> productsMtime;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableList<String>> productSearchQueries;

    private final com.google.common.base.Optional<Boolean> useSampleData;
}
