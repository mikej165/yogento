package com.yogento.api.models.catalog.product.magento;

@SuppressWarnings({"serial"})
public class MagentoProductImage implements org.thryft.TBase<MagentoProductImage> {
    public static class Builder {
        public Builder() {
        }

        public Builder(final MagentoProductImage other) {
            this.exclude = other.getExclude();
            this.file = other.getFile();
            this.label = other.getLabel();
            this.position = other.getPosition();
            this.types = other.getTypes();
            this.url = other.getUrl();
        }

        protected MagentoProductImage _build(final com.google.common.base.Optional<Boolean> exclude, final String file, final com.google.common.base.Optional<String> label, final com.google.common.base.Optional<Integer> position, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.magento.MagentoProductImageType>> types, final com.google.common.base.Optional<String> url) {
            return new MagentoProductImage(exclude, file, label, position, types, url);
        }

        public MagentoProductImage build() {
            return _build(exclude, file, label, position, types, url);
        }

        public Builder setExclude(final com.google.common.base.Optional<Boolean> exclude) {
            this.exclude = exclude;
            return this;
        }

        public Builder setExclude(final boolean exclude) {
            this.exclude = com.google.common.base.Optional.fromNullable(exclude);
            return this;
        }

        public Builder setFile(final String file) {
            this.file = file;
            return this;
        }

        public Builder setLabel(final com.google.common.base.Optional<String> label) {
            this.label = label;
            return this;
        }

        public Builder setLabel(final String label) {
            this.label = com.google.common.base.Optional.fromNullable(label);
            return this;
        }

        public Builder setPosition(final com.google.common.base.Optional<Integer> position) {
            this.position = position;
            return this;
        }

        public Builder setPosition(final int position) {
            this.position = com.google.common.base.Optional.fromNullable(position);
            return this;
        }

        public Builder setTypes(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.magento.MagentoProductImageType>> types) {
            this.types = types;
            return this;
        }

        public Builder setTypes(final com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.magento.MagentoProductImageType> types) {
            this.types = com.google.common.base.Optional.fromNullable(types);
            return this;
        }

        public Builder setUrl(final com.google.common.base.Optional<String> url) {
            this.url = url;
            return this;
        }

        public Builder setUrl(final String url) {
            this.url = com.google.common.base.Optional.fromNullable(url);
            return this;
        }

        private com.google.common.base.Optional<Boolean> exclude = com.google.common.base.Optional.absent();
        private String file;
        private com.google.common.base.Optional<String> label = com.google.common.base.Optional.absent();
        private com.google.common.base.Optional<Integer> position = com.google.common.base.Optional.absent();
        private com.google.common.base.Optional<com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.magento.MagentoProductImageType>> types = com.google.common.base.Optional.absent();
        private com.google.common.base.Optional<String> url = com.google.common.base.Optional.absent();
    }

    public MagentoProductImage(final MagentoProductImage other) {
        this(other.getExclude(), other.getFile(), other.getLabel(), other.getPosition(), other.getTypes(), other.getUrl());
    }

    public MagentoProductImage(final org.thryft.protocol.TProtocol iprot) throws java.io.IOException {
        this(iprot, org.thryft.protocol.TType.STRUCT);
    }

    public MagentoProductImage(final org.thryft.protocol.TProtocol iprot, final byte readAsTType) throws java.io.IOException {
        com.google.common.base.Optional<Boolean> exclude = com.google.common.base.Optional.absent();
        String file = null;
        com.google.common.base.Optional<String> label = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<Integer> position = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.magento.MagentoProductImageType>> types = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<String> url = com.google.common.base.Optional.absent();

        switch (readAsTType) {
            case org.thryft.protocol.TType.LIST:
                final org.thryft.protocol.TList __list = iprot.readListBegin();
                exclude = com.google.common.base.Optional.of(iprot.readBool());
                file = iprot.readString();
                if (__list.size > 2) {
                    label = com.google.common.base.Optional.of(iprot.readString());
                }
                if (__list.size > 3) {
                    try {
                        position = com.google.common.base.Optional.of(iprot.readI32());
                    } catch (NumberFormatException e) {
                    }
                }
                if (__list.size > 4) {
                    types = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.TProtocol, com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.magento.MagentoProductImageType>>() {
                        @Override
                        public com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.magento.MagentoProductImageType> apply(final org.thryft.protocol.TProtocol iprot) {
                            try {
                                final org.thryft.protocol.TSet sequenceBegin = iprot.readSetBegin();
                                final com.google.common.collect.ImmutableSet.Builder<com.yogento.api.models.catalog.product.magento.MagentoProductImageType> sequence = com.google.common.collect.ImmutableSet.builder();
                                for (int elementI = 0; elementI < sequenceBegin.size; elementI++) {
                                    sequence.add(iprot.readEnum(com.yogento.api.models.catalog.product.magento.MagentoProductImageType.class));
                                }
                                iprot.readSetEnd();
                                return sequence.build();
                            } catch (final java.io.IOException e) {
                                return com.google.common.collect.ImmutableSet.of();
                            }
                        }
                    }).apply(iprot));
                }
                if (__list.size > 5) {
                    url = com.google.common.base.Optional.of(iprot.readString());
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
                    } else if (ifield.name.equals("exclude")) {
                        exclude = com.google.common.base.Optional.of(iprot.readBool());
                    } else if (ifield.name.equals("file")) {
                        file = iprot.readString();
                    } else if (ifield.name.equals("label")) {
                        label = com.google.common.base.Optional.of(iprot.readString());
                    } else if (ifield.name.equals("position")) {
                        try {
                            position = com.google.common.base.Optional.of(iprot.readI32());
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("types")) {
                        types = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.TProtocol, com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.magento.MagentoProductImageType>>() {
                            @Override
                            public com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.magento.MagentoProductImageType> apply(final org.thryft.protocol.TProtocol iprot) {
                                try {
                                    final org.thryft.protocol.TSet sequenceBegin = iprot.readSetBegin();
                                    final com.google.common.collect.ImmutableSet.Builder<com.yogento.api.models.catalog.product.magento.MagentoProductImageType> sequence = com.google.common.collect.ImmutableSet.builder();
                                    for (int elementI = 0; elementI < sequenceBegin.size; elementI++) {
                                        sequence.add(iprot.readEnum(com.yogento.api.models.catalog.product.magento.MagentoProductImageType.class));
                                    }
                                    iprot.readSetEnd();
                                    return sequence.build();
                                } catch (final java.io.IOException e) {
                                    return com.google.common.collect.ImmutableSet.of();
                                }
                            }
                        }).apply(iprot));
                    } else if (ifield.name.equals("url")) {
                        url = com.google.common.base.Optional.of(iprot.readString());
                    }
                    iprot.readFieldEnd();
                }
                iprot.readStructEnd();
                break;
        }

        this.exclude = exclude;
        this.file = com.google.common.base.Preconditions.checkNotNull(file, "com.yogento.api.models.catalog.product.magento.MagentoProductImage: missing file");
        this.label = label;
        this.position = position;
        this.types = types;
        this.url = url;
    }

    public MagentoProductImage(final String file) {
        this.exclude = com.google.common.base.Optional.absent();
        this.file = com.google.common.base.Preconditions.checkNotNull(file, "com.yogento.api.models.catalog.product.magento.MagentoProductImage: missing file");
        this.label = com.google.common.base.Optional.absent();
        this.position = com.google.common.base.Optional.absent();
        this.types = com.google.common.base.Optional.absent();
        this.url = com.google.common.base.Optional.absent();
    }

    public MagentoProductImage(final com.google.common.base.Optional<Boolean> exclude, final String file, final com.google.common.base.Optional<String> label, final com.google.common.base.Optional<Integer> position, final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.magento.MagentoProductImageType>> types, final com.google.common.base.Optional<String> url) {
        this.exclude = exclude;
        this.file = com.google.common.base.Preconditions.checkNotNull(file, "com.yogento.api.models.catalog.product.magento.MagentoProductImage: missing file");
        this.label = com.google.common.base.Preconditions.checkNotNull(label, "com.yogento.api.models.catalog.product.magento.MagentoProductImage: missing label");
        this.position = position;
        this.types = com.google.common.base.Preconditions.checkNotNull(types, "com.yogento.api.models.catalog.product.magento.MagentoProductImage: missing types");
        this.url = com.google.common.base.Preconditions.checkNotNull(url, "com.yogento.api.models.catalog.product.magento.MagentoProductImage: missing url");
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public int compareTo(final MagentoProductImage other) {
        if (other == null) {
            throw new NullPointerException();
        }

        int result;
        if (this.exclude.isPresent()) {
            if (other.exclude.isPresent()) {
                result = ((Boolean)this.exclude.get()).compareTo(other.exclude.get());
                if (result != 0) {
                    return result;
                }
            } else {
                return 1;
            }
        } else if (other.exclude.isPresent()) {
            return -1;
        }

        result = this.file.compareTo(other.file);
        if (result != 0) {
            return result;
        }

        if (this.label.isPresent()) {
            if (other.label.isPresent()) {
                result = this.label.get().compareTo(other.label.get());
                if (result != 0) {
                    return result;
                }
            } else {
                return 1;
            }
        } else if (other.label.isPresent()) {
            return -1;
        }

        if (this.position.isPresent()) {
            if (other.position.isPresent()) {
                result = ((Integer)this.position.get()).compareTo(other.position.get());
                if (result != 0) {
                    return result;
                }
            } else {
                return 1;
            }
        } else if (other.position.isPresent()) {
            return -1;
        }

        if (this.types.isPresent()) {
            if (other.types.isPresent()) {
                result = org.thryft.Comparators.compare(this.types.get(), other.types.get());
                if (result != 0) {
                    return result;
                }
            } else {
                return 1;
            }
        } else if (other.types.isPresent()) {
            return -1;
        }

        if (this.url.isPresent()) {
            if (other.url.isPresent()) {
                result = this.url.get().compareTo(other.url.get());
                if (result != 0) {
                    return result;
                }
            } else {
                return 1;
            }
        } else if (other.url.isPresent()) {
            return -1;
        }

        return 0;
    }

    @Override
    public boolean equals(final Object otherObject) {
        if (otherObject == this) {
            return true;
        } else if (!(otherObject instanceof MagentoProductImage)) {
            return false;
        }

        final MagentoProductImage other = (MagentoProductImage)otherObject;
        return
            getExclude().equals(other.getExclude()) &&
            getFile().equals(other.getFile()) &&
            getLabel().equals(other.getLabel()) &&
            getPosition().equals(other.getPosition()) &&
            getTypes().equals(other.getTypes()) &&
            getUrl().equals(other.getUrl());
    }

    public static MagentoProductImage fake() {
        return fakeBuilder().build();
    }

    public static Builder fakeBuilder() {
        Builder builder = new Builder();
        builder.setExclude(org.thryft.Faker.randomBool());
        builder.setFile(org.thryft.Faker.Lorem.word());
        builder.setLabel(org.thryft.Faker.Lorem.word());
        builder.setPosition(org.thryft.Faker.randomI32());
        builder.setTypes(com.google.common.collect.ImmutableSet.of(org.thryft.Faker.randomEnum(com.google.common.collect.ImmutableList.of(com.yogento.api.models.catalog.product.magento.MagentoProductImageType.IMAGE, com.yogento.api.models.catalog.product.magento.MagentoProductImageType.SMALL_IMAGE, com.yogento.api.models.catalog.product.magento.MagentoProductImageType.THUMBNAIL))));
        builder.setUrl(org.thryft.Faker.Lorem.word());
        return builder;
    }

    public Object get(final String fieldName) {
        if (fieldName.equals("exclude")) {
            return getExclude();
        } else if (fieldName.equals("file")) {
            return getFile();
        } else if (fieldName.equals("label")) {
            return getLabel();
        } else if (fieldName.equals("position")) {
            return getPosition();
        } else if (fieldName.equals("types")) {
            return getTypes();
        } else if (fieldName.equals("url")) {
            return getUrl();
        }
        throw new IllegalArgumentException(fieldName);
    }

    public final com.google.common.base.Optional<Boolean> getExclude() {
        return exclude;
    }

    public final String getFile() {
        return file;
    }

    public final com.google.common.base.Optional<String> getLabel() {
        return label;
    }

    public final com.google.common.base.Optional<Integer> getPosition() {
        return position;
    }

    public final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.magento.MagentoProductImageType>> getTypes() {
        return types;
    }

    public final com.google.common.base.Optional<String> getUrl() {
        return url;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        if (getExclude().isPresent()) {
            hashCode = 31 * hashCode + (getExclude().get() ? 1 : 0);
        }
        hashCode = 31 * hashCode + getFile().hashCode();
        if (getLabel().isPresent()) {
            hashCode = 31 * hashCode + getLabel().get().hashCode();
        }
        if (getPosition().isPresent()) {
            hashCode = 31 * hashCode + ((int)getPosition().get());
        }
        if (getTypes().isPresent()) {
            hashCode = 31 * hashCode + getTypes().get().hashCode();
        }
        if (getUrl().isPresent()) {
            hashCode = 31 * hashCode + getUrl().get().hashCode();
        }
        return hashCode;
    }

    public MagentoProductImage replaceExclude(final com.google.common.base.Optional<Boolean> exclude) {
        return new MagentoProductImage(exclude, this.file, this.label, this.position, this.types, this.url);
    }

    public MagentoProductImage replaceExclude(final boolean exclude) {
        return replaceExclude(com.google.common.base.Optional.fromNullable(exclude));
    }

    public MagentoProductImage replaceFile(final String file) {
        return new MagentoProductImage(this.exclude, file, this.label, this.position, this.types, this.url);
    }

    public MagentoProductImage replaceLabel(final com.google.common.base.Optional<String> label) {
        return new MagentoProductImage(this.exclude, this.file, label, this.position, this.types, this.url);
    }

    public MagentoProductImage replaceLabel(final String label) {
        return replaceLabel(com.google.common.base.Optional.fromNullable(label));
    }

    public MagentoProductImage replacePosition(final com.google.common.base.Optional<Integer> position) {
        return new MagentoProductImage(this.exclude, this.file, this.label, position, this.types, this.url);
    }

    public MagentoProductImage replacePosition(final int position) {
        return replacePosition(com.google.common.base.Optional.fromNullable(position));
    }

    public MagentoProductImage replaceTypes(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.magento.MagentoProductImageType>> types) {
        return new MagentoProductImage(this.exclude, this.file, this.label, this.position, types, this.url);
    }

    public MagentoProductImage replaceTypes(final com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.magento.MagentoProductImageType> types) {
        return replaceTypes(com.google.common.base.Optional.fromNullable(types));
    }

    public MagentoProductImage replaceUrl(final com.google.common.base.Optional<String> url) {
        return new MagentoProductImage(this.exclude, this.file, this.label, this.position, this.types, url);
    }

    public MagentoProductImage replaceUrl(final String url) {
        return replaceUrl(com.google.common.base.Optional.fromNullable(url));
    }

    @Override
    public String toString() {
        final com.google.common.base.Objects.ToStringHelper helper = com.google.common.base.Objects.toStringHelper(this);
        if (getExclude().isPresent()) {
            helper.add("exclude", getExclude());
        }
        helper.add("file", getFile());
        if (getLabel().isPresent()) {
            helper.add("label", getLabel());
        }
        if (getPosition().isPresent()) {
            helper.add("position", getPosition());
        }
        if (getTypes().isPresent()) {
            helper.add("types", getTypes());
        }
        if (getUrl().isPresent()) {
            helper.add("url", getUrl());
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
                oprot.writeListBegin(new org.thryft.protocol.TList(org.thryft.protocol.TType.VOID, 6));

                if (getExclude().isPresent()) {
                    oprot.writeBool(getExclude().get());
                } else {
                    oprot.writeNull();
                }

                oprot.writeString(getFile());

                if (getLabel().isPresent()) {
                    oprot.writeString(getLabel().get());
                } else {
                    oprot.writeNull();
                }

                if (getPosition().isPresent()) {
                    oprot.writeI32(getPosition().get());
                } else {
                    oprot.writeNull();
                }

                if (getTypes().isPresent()) {
                    oprot.writeSetBegin(new org.thryft.protocol.TSet(org.thryft.protocol.TType.STRING, getTypes().get().size()));
                    for (final com.yogento.api.models.catalog.product.magento.MagentoProductImageType _iter0 : getTypes().get()) {
                        oprot.writeEnum(_iter0);
                    }
                    oprot.writeSetEnd();
                } else {
                    oprot.writeNull();
                }

                if (getUrl().isPresent()) {
                    oprot.writeString(getUrl().get());
                } else {
                    oprot.writeNull();
                }

                oprot.writeListEnd();
                break;

            case org.thryft.protocol.TType.STRUCT:
            default:
                oprot.writeStructBegin(new org.thryft.protocol.TStruct("MagentoProductImage"));

                if (getExclude().isPresent()) {
                    oprot.writeFieldBegin(new org.thryft.protocol.TField("exclude", org.thryft.protocol.TType.BOOL, (short)-1));
                    oprot.writeBool(getExclude().get());
                    oprot.writeFieldEnd();
                }

                oprot.writeFieldBegin(new org.thryft.protocol.TField("file", org.thryft.protocol.TType.STRING, (short)-1));
                oprot.writeString(getFile());
                oprot.writeFieldEnd();

                if (getLabel().isPresent()) {
                    oprot.writeFieldBegin(new org.thryft.protocol.TField("label", org.thryft.protocol.TType.STRING, (short)-1));
                    oprot.writeString(getLabel().get());
                    oprot.writeFieldEnd();
                }

                if (getPosition().isPresent()) {
                    oprot.writeFieldBegin(new org.thryft.protocol.TField("position", org.thryft.protocol.TType.I32, (short)-1));
                    oprot.writeI32(getPosition().get());
                    oprot.writeFieldEnd();
                }

                if (getTypes().isPresent()) {
                    oprot.writeFieldBegin(new org.thryft.protocol.TField("types", org.thryft.protocol.TType.SET, (short)-1));
                    oprot.writeSetBegin(new org.thryft.protocol.TSet(org.thryft.protocol.TType.STRING, getTypes().get().size()));
                    for (final com.yogento.api.models.catalog.product.magento.MagentoProductImageType _iter0 : getTypes().get()) {
                        oprot.writeEnum(_iter0);
                    }
                    oprot.writeSetEnd();
                    oprot.writeFieldEnd();
                }

                if (getUrl().isPresent()) {
                    oprot.writeFieldBegin(new org.thryft.protocol.TField("url", org.thryft.protocol.TType.STRING, (short)-1));
                    oprot.writeString(getUrl().get());
                    oprot.writeFieldEnd();
                }

                oprot.writeFieldStop();

                oprot.writeStructEnd();
                break;
        }
    }

    private final com.google.common.base.Optional<Boolean> exclude;

    private final String file;

    private final com.google.common.base.Optional<String> label;

    private final com.google.common.base.Optional<Integer> position;

    private final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.magento.MagentoProductImageType>> types;

    private final com.google.common.base.Optional<String> url;
}
