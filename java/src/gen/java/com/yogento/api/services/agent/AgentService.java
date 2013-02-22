package com.yogento.api.services.agent;

public interface AgentService {
    public static class Messages {
        @SuppressWarnings({"serial"})
        public final static class getAgentMagentoProductsRequest implements org.apache.thrift.TBase<getAgentMagentoProductsRequest, org.apache.thrift.TFieldIdEnum> {
            public static class Builder {
                public Builder() {
                }

                public Builder(final getAgentMagentoProductsRequest other) {
                    this.sync = other.isSync();
                }

                protected getAgentMagentoProductsRequest _build(final Boolean sync) {
                    return new getAgentMagentoProductsRequest(sync);
                }

                public getAgentMagentoProductsRequest build() {
                    return _build(sync);
                }

                public Builder setSync(final Boolean sync) {
                    this.sync = sync;
                    return this;
                }

                private Boolean sync;
            }

            public getAgentMagentoProductsRequest() {
                sync = null;
            }

            public getAgentMagentoProductsRequest(final getAgentMagentoProductsRequest other) {
                this(other.isSync());
            }

            public getAgentMagentoProductsRequest(final org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
                this(iprot, org.apache.thrift.protocol.TType.STRUCT);
            }

            public getAgentMagentoProductsRequest(final org.apache.thrift.protocol.TProtocol iprot, final byte readAsTType) throws org.apache.thrift.TException {
                Boolean sync = null;

                switch (readAsTType) {
                    case org.apache.thrift.protocol.TType.LIST:
                        final org.apache.thrift.protocol.TList __list = iprot.readListBegin();
                        if (__list.size > 0) {
                            sync = iprot.readBool();
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
                            } else if (ifield.name.equals("sync")) {
                                sync = iprot.readBool();
                            }
                            iprot.readFieldEnd();
                        }
                        iprot.readStructEnd();
                        break;
                }

                this.sync = sync;
            }

            public getAgentMagentoProductsRequest(final Boolean sync) {
                this.sync = sync;
            }

            @Override
            public void clear() {
                throw new UnsupportedOperationException();
            }

            @Override
            public int compareTo(final getAgentMagentoProductsRequest other) {
                throw new UnsupportedOperationException();
            }

            @Override
            public org.apache.thrift.TBase<getAgentMagentoProductsRequest, org.apache.thrift.TFieldIdEnum> deepCopy() {
                throw new UnsupportedOperationException();
            }

            @Override
            public boolean equals(final Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof getAgentMagentoProductsRequest)) {
                    return false;
                }

                final getAgentMagentoProductsRequest other = (getAgentMagentoProductsRequest)otherObject;
                return
                    ((isSync() == null && other.isSync() == null) ||
                    (isSync() != null && other.isSync() != null &&
                    isSync().equals(other.isSync())));
            }

            @Override
            public org.apache.thrift.TFieldIdEnum fieldForId(final int fieldId) {
                throw new UnsupportedOperationException();
            }

            public Object get(final String fieldName) {
                if (fieldName.equals("sync")) {
                    return isSync();
                }
                return null;
            }

            @Override
            public Object getFieldValue(final org.apache.thrift.TFieldIdEnum field) {
                throw new UnsupportedOperationException();
            }

            @Override
            public int hashCode() {
                int hashCode = 17;
                if (isSync() != null) {
                    hashCode = 31 * hashCode + (isSync() ? 1 : 0);
                }
                return hashCode;
            }

            @Override
            public boolean isSet(final org.apache.thrift.TFieldIdEnum field) {
                throw new UnsupportedOperationException();
            }

            public final Boolean isSync() {
                return sync;
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
                if (isSync() != null) {
                    helper.add("sync", isSync());
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
                        oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.VOID, 1));

                        if (isSync() != null) {
                            oprot.writeBool(isSync());
                        } else {
                            ((org.thryft.core.protocol.Protocol)oprot).writeNull();
                        }

                        oprot.writeListEnd();
                        break;

                    case org.apache.thrift.protocol.TType.STRUCT:
                    default:
                        oprot.writeStructBegin(new org.apache.thrift.protocol.TStruct("getAgentMagentoProductsRequest"));

                        if (isSync() != null) {
                            oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("sync", org.apache.thrift.protocol.TType.BOOL, (short)-1));
                            oprot.writeBool(isSync());
                            oprot.writeFieldEnd();
                        }

                        oprot.writeFieldStop();

                        oprot.writeStructEnd();
                        break;
                }
            }

            private final Boolean sync;
        }

        @SuppressWarnings({"serial"})
        public final static class getAgentMagentoProductsResponse implements org.apache.thrift.TBase<getAgentMagentoProductsResponse, org.apache.thrift.TFieldIdEnum> {
            public static class Builder {
                public Builder() {
                }

                public Builder(final getAgentMagentoProductsResponse other) {
                    this.returnValue = other.getReturnValue();
                }

                protected getAgentMagentoProductsResponse _build(final com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.magento.MagentoProduct> returnValue) {
                    return new getAgentMagentoProductsResponse(returnValue);
                }

                public getAgentMagentoProductsResponse build() {
                    return _build(returnValue);
                }

                public Builder setReturnValue(final com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.magento.MagentoProduct> returnValue) {
                    this.returnValue = returnValue;
                    return this;
                }

                private com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.magento.MagentoProduct> returnValue;
            }

            public getAgentMagentoProductsResponse(final getAgentMagentoProductsResponse other) {
                this(other.getReturnValue());
            }

            public getAgentMagentoProductsResponse(final org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
                returnValue = (new com.google.common.base.Function<org.apache.thrift.protocol.TProtocol, com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.magento.MagentoProduct>>() {
                    @Override
                    public com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.magento.MagentoProduct> apply(final org.apache.thrift.protocol.TProtocol iprot) {
                        try {
                            final org.apache.thrift.protocol.TSet sequenceBegin = iprot.readSetBegin();
                            final java.util.Set<com.yogento.api.models.catalog.product.magento.MagentoProduct> sequence = new java.util.LinkedHashSet<com.yogento.api.models.catalog.product.magento.MagentoProduct>();
                            for (int elementI = 0; elementI < sequenceBegin.size; elementI++) {
                                sequence.add(new com.yogento.api.models.catalog.product.magento.MagentoProduct(iprot));
                            }
                            iprot.readSetEnd();
                            return com.google.common.collect.ImmutableSet.copyOf(sequence);
                        } catch (final org.apache.thrift.TException e) {
                            return com.google.common.collect.ImmutableSet.of();
                        }
                    }
                }).apply(iprot);
            }

            public getAgentMagentoProductsResponse(final com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.magento.MagentoProduct> returnValue) {
                this.returnValue = com.google.common.base.Preconditions.checkNotNull(returnValue);
            }

            @Override
            public void clear() {
                throw new UnsupportedOperationException();
            }

            @Override
            public int compareTo(final getAgentMagentoProductsResponse other) {
                throw new UnsupportedOperationException();
            }

            @Override
            public org.apache.thrift.TBase<getAgentMagentoProductsResponse, org.apache.thrift.TFieldIdEnum> deepCopy() {
                throw new UnsupportedOperationException();
            }

            @Override
            public boolean equals(final Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof getAgentMagentoProductsResponse)) {
                    return false;
                }

                final getAgentMagentoProductsResponse other = (getAgentMagentoProductsResponse)otherObject;
                return
                    getReturnValue().equals(other.getReturnValue());
            }

            @Override
            public org.apache.thrift.TFieldIdEnum fieldForId(final int fieldId) {
                throw new UnsupportedOperationException();
            }

            public Object get(final String fieldName) {
                if (fieldName.equals("return_value")) {
                    return getReturnValue();
                }
                return null;
            }

            @Override
            public Object getFieldValue(final org.apache.thrift.TFieldIdEnum field) {
                throw new UnsupportedOperationException();
            }

            public final com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.magento.MagentoProduct> getReturnValue() {
                return returnValue;
            }

            @Override
            public int hashCode() {
                int hashCode = 17;
                hashCode = 31 * hashCode + getReturnValue().hashCode();
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
            public void setFieldValue(final org.apache.thrift.TFieldIdEnum field, final Object value) {
                throw new UnsupportedOperationException();
            }

            @Override
            public String toString() {
                final com.google.common.base.Objects.ToStringHelper helper = com.google.common.base.Objects.toStringHelper(this);
                helper.add("return_value", getReturnValue());
                return helper.toString();
            }

            @Override
            public void write(final org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
                write(oprot, org.apache.thrift.protocol.TType.STRUCT);
            }

            public void write(final org.apache.thrift.protocol.TProtocol oprot, final byte writeAsTType) throws org.apache.thrift.TException {
                switch (writeAsTType) {
                    case org.apache.thrift.protocol.TType.VOID: {
                        oprot.writeSetBegin(new org.apache.thrift.protocol.TSet(org.apache.thrift.protocol.TType.STRUCT, getReturnValue().size()));
                        for (final com.yogento.api.models.catalog.product.magento.MagentoProduct _iter0 : getReturnValue()) {
                            _iter0.write(oprot);
                        }
                        oprot.writeSetEnd();
                        break;
                    }

                    case org.apache.thrift.protocol.TType.LIST:
                        oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.VOID, 1));

                        oprot.writeSetBegin(new org.apache.thrift.protocol.TSet(org.apache.thrift.protocol.TType.STRUCT, getReturnValue().size()));
                        for (final com.yogento.api.models.catalog.product.magento.MagentoProduct _iter0 : getReturnValue()) {
                            _iter0.write(oprot);
                        }
                        oprot.writeSetEnd();

                        oprot.writeListEnd();
                        break;

                    case org.apache.thrift.protocol.TType.STRUCT:
                    default:
                        oprot.writeStructBegin(new org.apache.thrift.protocol.TStruct("getAgentMagentoProductsResponse"));

                        oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("return_value", org.apache.thrift.protocol.TType.SET, (short)-1));
                        oprot.writeSetBegin(new org.apache.thrift.protocol.TSet(org.apache.thrift.protocol.TType.STRUCT, getReturnValue().size()));
                        for (final com.yogento.api.models.catalog.product.magento.MagentoProduct _iter0 : getReturnValue()) {
                            _iter0.write(oprot);
                        }
                        oprot.writeSetEnd();
                        oprot.writeFieldEnd();

                        oprot.writeFieldStop();

                        oprot.writeStructEnd();
                        break;
                }
            }

            private final com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.magento.MagentoProduct> returnValue;
        }

        @SuppressWarnings({"serial"})
        public final static class headMagentoStoreRequest implements org.apache.thrift.TBase<headMagentoStoreRequest, org.apache.thrift.TFieldIdEnum> {
            public static class Builder {
                public Builder() {
                }

                public Builder(final headMagentoStoreRequest other) {
                    this.magentoStoreUrl = other.getMagentoStoreUrl();
                }

                protected headMagentoStoreRequest _build(final String magentoStoreUrl) {
                    return new headMagentoStoreRequest(magentoStoreUrl);
                }

                public headMagentoStoreRequest build() {
                    return _build(magentoStoreUrl);
                }

                public Builder setMagentoStoreUrl(final String magentoStoreUrl) {
                    this.magentoStoreUrl = magentoStoreUrl;
                    return this;
                }

                private String magentoStoreUrl;
            }

            public headMagentoStoreRequest(final headMagentoStoreRequest other) {
                this(other.getMagentoStoreUrl());
            }

            public headMagentoStoreRequest(final org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
                this(iprot, org.apache.thrift.protocol.TType.STRUCT);
            }

            public headMagentoStoreRequest(final org.apache.thrift.protocol.TProtocol iprot, final byte readAsTType) throws org.apache.thrift.TException {
                String magentoStoreUrl = null;

                switch (readAsTType) {
                    case org.apache.thrift.protocol.TType.LIST:
                        iprot.readListBegin();
                        magentoStoreUrl = iprot.readString();
                        iprot.readListEnd();
                        break;

                    case org.apache.thrift.protocol.TType.STRUCT:
                    default:
                        iprot.readStructBegin();
                        while (true) {
                            final org.apache.thrift.protocol.TField ifield = iprot.readFieldBegin();
                            if (ifield.type == org.apache.thrift.protocol.TType.STOP) {
                                break;
                            } else if (ifield.name.equals("magento_store_url")) {
                                magentoStoreUrl = iprot.readString();
                            }
                            iprot.readFieldEnd();
                        }
                        iprot.readStructEnd();
                        break;
                }

                this.magentoStoreUrl = com.google.common.base.Preconditions.checkNotNull(magentoStoreUrl);
            }

            public headMagentoStoreRequest(final String magentoStoreUrl) {
                this.magentoStoreUrl = com.google.common.base.Preconditions.checkNotNull(magentoStoreUrl);
            }

            @Override
            public void clear() {
                throw new UnsupportedOperationException();
            }

            @Override
            public int compareTo(final headMagentoStoreRequest other) {
                throw new UnsupportedOperationException();
            }

            @Override
            public org.apache.thrift.TBase<headMagentoStoreRequest, org.apache.thrift.TFieldIdEnum> deepCopy() {
                throw new UnsupportedOperationException();
            }

            @Override
            public boolean equals(final Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof headMagentoStoreRequest)) {
                    return false;
                }

                final headMagentoStoreRequest other = (headMagentoStoreRequest)otherObject;
                return
                    getMagentoStoreUrl().equals(other.getMagentoStoreUrl());
            }

            @Override
            public org.apache.thrift.TFieldIdEnum fieldForId(final int fieldId) {
                throw new UnsupportedOperationException();
            }

            public Object get(final String fieldName) {
                if (fieldName.equals("magento_store_url")) {
                    return getMagentoStoreUrl();
                }
                return null;
            }

            @Override
            public Object getFieldValue(final org.apache.thrift.TFieldIdEnum field) {
                throw new UnsupportedOperationException();
            }

            public final String getMagentoStoreUrl() {
                return magentoStoreUrl;
            }

            @Override
            public int hashCode() {
                int hashCode = 17;
                hashCode = 31 * hashCode + getMagentoStoreUrl().hashCode();
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
            public void setFieldValue(final org.apache.thrift.TFieldIdEnum field, final Object value) {
                throw new UnsupportedOperationException();
            }

            @Override
            public String toString() {
                final com.google.common.base.Objects.ToStringHelper helper = com.google.common.base.Objects.toStringHelper(this);
                helper.add("magento_store_url", getMagentoStoreUrl());
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
                        oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.VOID, 1));

                        oprot.writeString(getMagentoStoreUrl());

                        oprot.writeListEnd();
                        break;

                    case org.apache.thrift.protocol.TType.STRUCT:
                    default:
                        oprot.writeStructBegin(new org.apache.thrift.protocol.TStruct("headMagentoStoreRequest"));

                        oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("magento_store_url", org.apache.thrift.protocol.TType.STRING, (short)-1));
                        oprot.writeString(getMagentoStoreUrl());
                        oprot.writeFieldEnd();

                        oprot.writeFieldStop();

                        oprot.writeStructEnd();
                        break;
                }
            }

            private final String magentoStoreUrl;
        }

        @SuppressWarnings({"serial"})
        public final static class headMagentoStoreResponse implements org.apache.thrift.TBase<headMagentoStoreResponse, org.apache.thrift.TFieldIdEnum> {
            public static class Builder {
                public Builder() {
                }

                public Builder(final headMagentoStoreResponse other) {
                    this.returnValue = other.isReturnValue();
                }

                protected headMagentoStoreResponse _build(final boolean returnValue) {
                    return new headMagentoStoreResponse(returnValue);
                }

                public headMagentoStoreResponse build() {
                    return _build(returnValue);
                }

                public Builder setReturnValue(final boolean returnValue) {
                    this.returnValue = returnValue;
                    return this;
                }

                private Boolean returnValue;
            }

            public headMagentoStoreResponse(final headMagentoStoreResponse other) {
                this(other.isReturnValue());
            }

            public headMagentoStoreResponse(final org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
                returnValue = iprot.readBool();
            }

            public headMagentoStoreResponse(final boolean returnValue) {
                this.returnValue = returnValue;
            }

            public headMagentoStoreResponse(final Boolean returnValue) {
                this.returnValue = returnValue;
            }

            @Override
            public void clear() {
                throw new UnsupportedOperationException();
            }

            @Override
            public int compareTo(final headMagentoStoreResponse other) {
                throw new UnsupportedOperationException();
            }

            @Override
            public org.apache.thrift.TBase<headMagentoStoreResponse, org.apache.thrift.TFieldIdEnum> deepCopy() {
                throw new UnsupportedOperationException();
            }

            @Override
            public boolean equals(final Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof headMagentoStoreResponse)) {
                    return false;
                }

                final headMagentoStoreResponse other = (headMagentoStoreResponse)otherObject;
                return
                    isReturnValue() == other.isReturnValue();
            }

            @Override
            public org.apache.thrift.TFieldIdEnum fieldForId(final int fieldId) {
                throw new UnsupportedOperationException();
            }

            public Object get(final String fieldName) {
                if (fieldName.equals("return_value")) {
                    return isReturnValue();
                }
                return null;
            }

            @Override
            public Object getFieldValue(final org.apache.thrift.TFieldIdEnum field) {
                throw new UnsupportedOperationException();
            }

            @Override
            public int hashCode() {
                int hashCode = 17;
                hashCode = 31 * hashCode + (isReturnValue() ? 1 : 0);
                return hashCode;
            }

            public final boolean isReturnValue() {
                return returnValue;
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
                helper.add("return_value", isReturnValue());
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
                        oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.VOID, 1));

                        oprot.writeBool(isReturnValue());

                        oprot.writeListEnd();
                        break;

                    case org.apache.thrift.protocol.TType.STRUCT:
                    default:
                        oprot.writeStructBegin(new org.apache.thrift.protocol.TStruct("headMagentoStoreResponse"));

                        oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("return_value", org.apache.thrift.protocol.TType.BOOL, (short)-1));
                        oprot.writeBool(isReturnValue());
                        oprot.writeFieldEnd();

                        oprot.writeFieldStop();

                        oprot.writeStructEnd();
                        break;
                }
            }

            private final boolean returnValue;
        }

        @SuppressWarnings({"serial"})
        public final static class putAgentMagentoProductsRequest implements org.apache.thrift.TBase<putAgentMagentoProductsRequest, org.apache.thrift.TFieldIdEnum> {
            public static class Builder {
                public Builder() {
                }

                public Builder(final putAgentMagentoProductsRequest other) {
                    this.magentoProductsJson = other.getMagentoProductsJson();
                    this.ticket = other.getTicket();
                    this.username = other.getUsername();
                }

                protected putAgentMagentoProductsRequest _build(final String magentoProductsJson, final String ticket, final String username) {
                    return new putAgentMagentoProductsRequest(magentoProductsJson, ticket, username);
                }

                public putAgentMagentoProductsRequest build() {
                    return _build(magentoProductsJson, ticket, username);
                }

                public Builder setMagentoProductsJson(final String magentoProductsJson) {
                    this.magentoProductsJson = magentoProductsJson;
                    return this;
                }

                public Builder setTicket(final String ticket) {
                    this.ticket = ticket;
                    return this;
                }

                public Builder setUsername(final String username) {
                    this.username = username;
                    return this;
                }

                private String magentoProductsJson;
                private String ticket;
                private String username;
            }

            public putAgentMagentoProductsRequest(final putAgentMagentoProductsRequest other) {
                this(other.getMagentoProductsJson(), other.getTicket(), other.getUsername());
            }

            public putAgentMagentoProductsRequest(final org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
                this(iprot, org.apache.thrift.protocol.TType.STRUCT);
            }

            public putAgentMagentoProductsRequest(final org.apache.thrift.protocol.TProtocol iprot, final byte readAsTType) throws org.apache.thrift.TException {
                String magentoProductsJson = null;
                String ticket = null;
                String username = null;

                switch (readAsTType) {
                    case org.apache.thrift.protocol.TType.LIST:
                        iprot.readListBegin();
                        magentoProductsJson = iprot.readString();
                        ticket = iprot.readString();
                        username = iprot.readString();
                        iprot.readListEnd();
                        break;

                    case org.apache.thrift.protocol.TType.STRUCT:
                    default:
                        iprot.readStructBegin();
                        while (true) {
                            final org.apache.thrift.protocol.TField ifield = iprot.readFieldBegin();
                            if (ifield.type == org.apache.thrift.protocol.TType.STOP) {
                                break;
                            } else if (ifield.name.equals("magento_products_json")) {
                                magentoProductsJson = iprot.readString();
                            } else if (ifield.name.equals("ticket")) {
                                ticket = iprot.readString();
                            } else if (ifield.name.equals("username")) {
                                username = iprot.readString();
                            }
                            iprot.readFieldEnd();
                        }
                        iprot.readStructEnd();
                        break;
                }

                this.magentoProductsJson = com.google.common.base.Preconditions.checkNotNull(magentoProductsJson);
                this.ticket = com.google.common.base.Preconditions.checkNotNull(ticket);
                this.username = com.google.common.base.Preconditions.checkNotNull(username);
            }

            public putAgentMagentoProductsRequest(final String magentoProductsJson, final String ticket, final String username) {
                this.magentoProductsJson = com.google.common.base.Preconditions.checkNotNull(magentoProductsJson);
                this.ticket = com.google.common.base.Preconditions.checkNotNull(ticket);
                this.username = com.google.common.base.Preconditions.checkNotNull(username);
            }

            @Override
            public void clear() {
                throw new UnsupportedOperationException();
            }

            @Override
            public int compareTo(final putAgentMagentoProductsRequest other) {
                throw new UnsupportedOperationException();
            }

            @Override
            public org.apache.thrift.TBase<putAgentMagentoProductsRequest, org.apache.thrift.TFieldIdEnum> deepCopy() {
                throw new UnsupportedOperationException();
            }

            @Override
            public boolean equals(final Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof putAgentMagentoProductsRequest)) {
                    return false;
                }

                final putAgentMagentoProductsRequest other = (putAgentMagentoProductsRequest)otherObject;
                return
                    getMagentoProductsJson().equals(other.getMagentoProductsJson()) &&
                    getTicket().equals(other.getTicket()) &&
                    getUsername().equals(other.getUsername());
            }

            @Override
            public org.apache.thrift.TFieldIdEnum fieldForId(final int fieldId) {
                throw new UnsupportedOperationException();
            }

            public Object get(final String fieldName) {
                if (fieldName.equals("magento_products_json")) {
                    return getMagentoProductsJson();
                } else if (fieldName.equals("ticket")) {
                    return getTicket();
                } else if (fieldName.equals("username")) {
                    return getUsername();
                }
                return null;
            }

            @Override
            public Object getFieldValue(final org.apache.thrift.TFieldIdEnum field) {
                throw new UnsupportedOperationException();
            }

            public final String getMagentoProductsJson() {
                return magentoProductsJson;
            }

            public final String getTicket() {
                return ticket;
            }

            public final String getUsername() {
                return username;
            }

            @Override
            public int hashCode() {
                int hashCode = 17;
                hashCode = 31 * hashCode + getMagentoProductsJson().hashCode();
                hashCode = 31 * hashCode + getTicket().hashCode();
                hashCode = 31 * hashCode + getUsername().hashCode();
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
            public void setFieldValue(final org.apache.thrift.TFieldIdEnum field, final Object value) {
                throw new UnsupportedOperationException();
            }

            @Override
            public String toString() {
                final com.google.common.base.Objects.ToStringHelper helper = com.google.common.base.Objects.toStringHelper(this);
                helper.add("magento_products_json", getMagentoProductsJson());
                helper.add("ticket", getTicket());
                helper.add("username", getUsername());
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
                        oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.VOID, 3));

                        oprot.writeString(getMagentoProductsJson());

                        oprot.writeString(getTicket());

                        oprot.writeString(getUsername());

                        oprot.writeListEnd();
                        break;

                    case org.apache.thrift.protocol.TType.STRUCT:
                    default:
                        oprot.writeStructBegin(new org.apache.thrift.protocol.TStruct("putAgentMagentoProductsRequest"));

                        oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("magento_products_json", org.apache.thrift.protocol.TType.STRING, (short)-1));
                        oprot.writeString(getMagentoProductsJson());
                        oprot.writeFieldEnd();

                        oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("ticket", org.apache.thrift.protocol.TType.STRING, (short)-1));
                        oprot.writeString(getTicket());
                        oprot.writeFieldEnd();

                        oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("username", org.apache.thrift.protocol.TType.STRING, (short)-1));
                        oprot.writeString(getUsername());
                        oprot.writeFieldEnd();

                        oprot.writeFieldStop();

                        oprot.writeStructEnd();
                        break;
                }
            }

            private final String magentoProductsJson;
            private final String ticket;
            private final String username;
        }

        @SuppressWarnings({"serial"})
        public final static class putAgentMagentoProductsResponse implements org.apache.thrift.TBase<putAgentMagentoProductsResponse, org.apache.thrift.TFieldIdEnum> {
            public static class Builder {
                public Builder() {
                }

                public Builder(final putAgentMagentoProductsResponse other) {
                }

                protected putAgentMagentoProductsResponse _build() {
                    return new putAgentMagentoProductsResponse();
                }

                public putAgentMagentoProductsResponse build() {
                    return _build();
                }


            }

            public putAgentMagentoProductsResponse() {
            }

            public putAgentMagentoProductsResponse(final putAgentMagentoProductsResponse other) {
            }

            public putAgentMagentoProductsResponse(final org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
            }

            @Override
            public void clear() {
                throw new UnsupportedOperationException();
            }

            @Override
            public int compareTo(final putAgentMagentoProductsResponse other) {
                throw new UnsupportedOperationException();
            }

            @Override
            public org.apache.thrift.TBase<putAgentMagentoProductsResponse, org.apache.thrift.TFieldIdEnum> deepCopy() {
                throw new UnsupportedOperationException();
            }

            @Override
            public boolean equals(final Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof putAgentMagentoProductsResponse)) {
                    return false;
                }

                return true;
            }

            @Override
            public org.apache.thrift.TFieldIdEnum fieldForId(final int fieldId) {
                throw new UnsupportedOperationException();
            }

            public Object get(final String fieldName) {
                return null;
            }

            @Override
            public Object getFieldValue(final org.apache.thrift.TFieldIdEnum field) {
                throw new UnsupportedOperationException();
            }

            @Override
            public int hashCode() {
                int hashCode = 17;
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
            public void setFieldValue(final org.apache.thrift.TFieldIdEnum field, final Object value) {
                throw new UnsupportedOperationException();
            }

            @Override
            public String toString() {
                final com.google.common.base.Objects.ToStringHelper helper = com.google.common.base.Objects.toStringHelper(this);
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
                        oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.VOID, 0));
                        oprot.writeListEnd();
                        break;

                    case org.apache.thrift.protocol.TType.STRUCT:
                    default:
                        oprot.writeStructBegin(new org.apache.thrift.protocol.TStruct("putAgentMagentoProductsResponse"));

                        oprot.writeFieldStop();

                        oprot.writeStructEnd();
                        break;
                }
            }


        }
    }

    public com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.magento.MagentoProduct> getAgentMagentoProducts(Boolean sync) throws com.yogento.api.services.agent.AgentException;
    public boolean headMagentoStore(String magentoStoreUrl);
    public void putAgentMagentoProducts(String magentoProductsJson, String ticket, String username);
}
