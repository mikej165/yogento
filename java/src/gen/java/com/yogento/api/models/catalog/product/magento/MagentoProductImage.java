package com.yogento.api.models.catalog.product.magento;

@SuppressWarnings({"serial"})
public class MagentoProductImage implements org.apache.thrift.TBase<MagentoProductImage, org.apache.thrift.TFieldIdEnum> {
    public static class Builder {
        public Builder() {
        }

        public Builder(final MagentoProductImage other) {
            this.exclude = other.isExclude();
            this.file = other.getFile();
            this.label = other.getLabel();
            this.position = other.getPosition();
            this.types = other.getTypes();
            this.url = other.getUrl();
        }

        protected MagentoProductImage _build(final Boolean exclude, final String file, final String label, final Integer position, final com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.magento.MagentoProductImageType> types, final String url) {
            return new MagentoProductImage(exclude, file, label, position, types, url);
        }

        public MagentoProductImage build() {
            return _build(exclude, file, label, position, types, url);
        }

        public Builder setExclude(final Boolean exclude) {
            this.exclude = exclude;
            return this;
        }

        public Builder setFile(final String file) {
            this.file = file;
            return this;
        }

        public Builder setLabel(final String label) {
            this.label = label;
            return this;
        }

        public Builder setPosition(final Integer position) {
            this.position = position;
            return this;
        }

        public Builder setTypes(final com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.magento.MagentoProductImageType> types) {
            this.types = types;
            return this;
        }

        public Builder setUrl(final String url) {
            this.url = url;
            return this;
        }

        private Boolean exclude;
        private String file;
        private String label;
        private Integer position;
        private com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.magento.MagentoProductImageType> types;
        private String url;
    }

    public MagentoProductImage(final MagentoProductImage other) {
        this(other.isExclude(), other.getFile(), other.getLabel(), other.getPosition(), other.getTypes(), other.getUrl());
    }

    public MagentoProductImage(final org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
        this(iprot, org.apache.thrift.protocol.TType.STRUCT);
    }

    public MagentoProductImage(final org.apache.thrift.protocol.TProtocol iprot, final byte readAsTType) throws org.apache.thrift.TException {
        Boolean exclude = null;
        String file = null;
        String label = null;
        Integer position = null;
        com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.magento.MagentoProductImageType> types = null;
        String url = null;

        switch (readAsTType) {
            case org.apache.thrift.protocol.TType.LIST:
                final org.apache.thrift.protocol.TList __list = iprot.readListBegin();
                exclude = iprot.readBool();
                file = iprot.readString();
                if (__list.size > 2) {
                    label = iprot.readString();
                }
                if (__list.size > 3) {
                    try {
                        position = iprot.readI32();
                    } catch (NumberFormatException e) {
                    }
                }
                if (__list.size > 4) {
                    types = (new com.google.common.base.Function<org.apache.thrift.protocol.TProtocol, com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.magento.MagentoProductImageType>>() {
                        @Override
                        public com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.magento.MagentoProductImageType> apply(final org.apache.thrift.protocol.TProtocol iprot) {
                            try {
                                final org.apache.thrift.protocol.TSet sequenceBegin = iprot.readSetBegin();
                                final java.util.Set<com.yogento.api.models.catalog.product.magento.MagentoProductImageType> sequence = new java.util.LinkedHashSet<com.yogento.api.models.catalog.product.magento.MagentoProductImageType>();
                                for (int elementI = 0; elementI < sequenceBegin.size; elementI++) {
                                    sequence.add((iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readEnum(com.yogento.api.models.catalog.product.magento.MagentoProductImageType.class) : com.yogento.api.models.catalog.product.magento.MagentoProductImageType.valueOf(iprot.readString().trim().toUpperCase()));
                                }
                                iprot.readSetEnd();
                                return com.google.common.collect.ImmutableSet.copyOf(sequence);
                            } catch (final org.apache.thrift.TException e) {
                                return com.google.common.collect.ImmutableSet.of();
                            }
                        }
                    }).apply(iprot);
                }
                if (__list.size > 5) {
                    url = iprot.readString();
                }
                iprot.readListEnd();
                break;

            case org.apache.thrift.protocol.TType.STRUCT:
            default:
                iprot.readStructBegin();
                while (true) {
                    final org.apache.thrift.protocol.TField ifield = iprot.readFieldBegin();
                    if (ifield.type == org.apache.thrift.protocol.TType.STOP) {
                        break;
                    } else if (ifield.name.equals("exclude")) {
                        exclude = iprot.readBool();
                    } else if (ifield.name.equals("file")) {
                        file = iprot.readString();
                    } else if (ifield.name.equals("label")) {
                        label = iprot.readString();
                    } else if (ifield.name.equals("position")) {
                        try {
                            position = iprot.readI32();
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("types")) {
                        types = (new com.google.common.base.Function<org.apache.thrift.protocol.TProtocol, com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.magento.MagentoProductImageType>>() {
                            @Override
                            public com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.magento.MagentoProductImageType> apply(final org.apache.thrift.protocol.TProtocol iprot) {
                                try {
                                    final org.apache.thrift.protocol.TSet sequenceBegin = iprot.readSetBegin();
                                    final java.util.Set<com.yogento.api.models.catalog.product.magento.MagentoProductImageType> sequence = new java.util.LinkedHashSet<com.yogento.api.models.catalog.product.magento.MagentoProductImageType>();
                                    for (int elementI = 0; elementI < sequenceBegin.size; elementI++) {
                                        sequence.add((iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readEnum(com.yogento.api.models.catalog.product.magento.MagentoProductImageType.class) : com.yogento.api.models.catalog.product.magento.MagentoProductImageType.valueOf(iprot.readString().trim().toUpperCase()));
                                    }
                                    iprot.readSetEnd();
                                    return com.google.common.collect.ImmutableSet.copyOf(sequence);
                                } catch (final org.apache.thrift.TException e) {
                                    return com.google.common.collect.ImmutableSet.of();
                                }
                            }
                        }).apply(iprot);
                    } else if (ifield.name.equals("url")) {
                        url = iprot.readString();
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
        this.exclude = null;
        this.file = com.google.common.base.Preconditions.checkNotNull(file, "com.yogento.api.models.catalog.product.magento.MagentoProductImage: missing file");
        this.label = null;
        this.position = null;
        this.types = null;
        this.url = null;
    }

    public MagentoProductImage(final Boolean exclude, final String file, final String label, final Integer position, final com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.magento.MagentoProductImageType> types, final String url) {
        this.exclude = exclude;
        this.file = com.google.common.base.Preconditions.checkNotNull(file, "com.yogento.api.models.catalog.product.magento.MagentoProductImage: missing file");
        this.label = label;
        this.position = position;
        this.types = types;
        this.url = url;
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException();
    }

    @Override
    public int compareTo(final MagentoProductImage other) {
        throw new UnsupportedOperationException();
    }

    @Override
    public org.apache.thrift.TBase<MagentoProductImage, org.apache.thrift.TFieldIdEnum> deepCopy() {
        throw new UnsupportedOperationException();
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
            ((isExclude() == null && other.isExclude() == null) ||
            (isExclude() != null && other.isExclude() != null &&
            isExclude().equals(other.isExclude()))) &&
            getFile().equals(other.getFile()) &&
            ((getLabel() == null && other.getLabel() == null) ||
            (getLabel() != null && other.getLabel() != null &&
            getLabel().equals(other.getLabel()))) &&
            ((getPosition() == null && other.getPosition() == null) ||
            (getPosition() != null && other.getPosition() != null &&
            getPosition().equals(other.getPosition()))) &&
            ((getTypes() == null && other.getTypes() == null) ||
            (getTypes() != null && other.getTypes() != null &&
            getTypes().equals(other.getTypes()))) &&
            ((getUrl() == null && other.getUrl() == null) ||
            (getUrl() != null && other.getUrl() != null &&
            getUrl().equals(other.getUrl())));
    }

    @Override
    public org.apache.thrift.TFieldIdEnum fieldForId(final int fieldId) {
        throw new UnsupportedOperationException();
    }

    public Object get(final String fieldName) {
        if (fieldName.equals("exclude")) {
            return isExclude();
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
        return null;
    }

    @Override
    public Object getFieldValue(final org.apache.thrift.TFieldIdEnum field) {
        throw new UnsupportedOperationException();
    }

    public final String getFile() {
        return file;
    }

    public final String getLabel() {
        return label;
    }

    public final Integer getPosition() {
        return position;
    }

    public final com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.magento.MagentoProductImageType> getTypes() {
        return types;
    }

    public final String getUrl() {
        return url;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        if (isExclude() != null) {
            hashCode = 31 * hashCode + (isExclude() ? 1 : 0);
        }
        hashCode = 31 * hashCode + getFile().hashCode();
        if (getLabel() != null) {
            hashCode = 31 * hashCode + getLabel().hashCode();
        }
        if (getPosition() != null) {
            hashCode = 31 * hashCode + ((int)getPosition());
        }
        if (getTypes() != null) {
            hashCode = 31 * hashCode + getTypes().hashCode();
        }
        if (getUrl() != null) {
            hashCode = 31 * hashCode + getUrl().hashCode();
        }
        return hashCode;
    }

    public final Boolean isExclude() {
        return exclude;
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
    public void setFieldValue(final org.apache.thrift.TFieldIdEnum field, final Object value) {
        throw new UnsupportedOperationException();
    }

    @Override
    public String toString() {
        final com.google.common.base.Objects.ToStringHelper helper = com.google.common.base.Objects.toStringHelper(this);
        if (isExclude() != null) {
            helper.add("exclude", isExclude());
        }
        helper.add("file", getFile());
        if (getLabel() != null) {
            helper.add("label", getLabel());
        }
        if (getPosition() != null) {
            helper.add("position", getPosition());
        }
        if (getTypes() != null) {
            helper.add("types", getTypes());
        }
        if (getUrl() != null) {
            helper.add("url", getUrl());
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

                if (isExclude() != null) {
                    oprot.writeBool(isExclude());
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                oprot.writeString(getFile());

                if (getLabel() != null) {
                    oprot.writeString(getLabel());
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getPosition() != null) {
                    oprot.writeI32(getPosition());
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getTypes() != null) {
                    oprot.writeSetBegin(new org.apache.thrift.protocol.TSet(org.apache.thrift.protocol.TType.STRING, getTypes().size()));
                    for (final com.yogento.api.models.catalog.product.magento.MagentoProductImageType _iter0 : getTypes()) {
                        if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeEnum(_iter0); } else { oprot.writeString(_iter0.toString()); }
                    }
                    oprot.writeSetEnd();
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getUrl() != null) {
                    oprot.writeString(getUrl());
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                oprot.writeListEnd();
                break;

            case org.apache.thrift.protocol.TType.STRUCT:
            default:
                oprot.writeStructBegin(new org.apache.thrift.protocol.TStruct("MagentoProductImage"));

                if (isExclude() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("exclude", org.apache.thrift.protocol.TType.BOOL, (short)-1));
                    oprot.writeBool(isExclude());
                    oprot.writeFieldEnd();
                }

                oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("file", org.apache.thrift.protocol.TType.STRING, (short)-1));
                oprot.writeString(getFile());
                oprot.writeFieldEnd();

                if (getLabel() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("label", org.apache.thrift.protocol.TType.STRING, (short)-1));
                    oprot.writeString(getLabel());
                    oprot.writeFieldEnd();
                }

                if (getPosition() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("position", org.apache.thrift.protocol.TType.I32, (short)-1));
                    oprot.writeI32(getPosition());
                    oprot.writeFieldEnd();
                }

                if (getTypes() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("types", org.apache.thrift.protocol.TType.SET, (short)-1));
                    oprot.writeSetBegin(new org.apache.thrift.protocol.TSet(org.apache.thrift.protocol.TType.STRING, getTypes().size()));
                    for (final com.yogento.api.models.catalog.product.magento.MagentoProductImageType _iter0 : getTypes()) {
                        if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeEnum(_iter0); } else { oprot.writeString(_iter0.toString()); }
                    }
                    oprot.writeSetEnd();
                    oprot.writeFieldEnd();
                }

                if (getUrl() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("url", org.apache.thrift.protocol.TType.STRING, (short)-1));
                    oprot.writeString(getUrl());
                    oprot.writeFieldEnd();
                }

                oprot.writeFieldStop();

                oprot.writeStructEnd();
                break;
        }
    }

    private final Boolean exclude;

    private final String file;

    private final String label;

    private final Integer position;

    private final com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.magento.MagentoProductImageType> types;

    private final String url;
}
