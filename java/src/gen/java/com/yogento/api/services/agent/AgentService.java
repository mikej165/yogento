package com.yogento.api.services.agent;

public interface AgentService {
    public static class Messages {
        @SuppressWarnings({"serial"})
        public final static class GetAgentMagentoProductsRequest implements org.thryft.TBase<GetAgentMagentoProductsRequest> {
            public static class Builder {
                public Builder() {
                }

                public Builder(final GetAgentMagentoProductsRequest other) {
                    this.sync = other.getSync();
                }

                protected GetAgentMagentoProductsRequest _build(final com.google.common.base.Optional<Boolean> sync) {
                    return new GetAgentMagentoProductsRequest(sync);
                }

                public GetAgentMagentoProductsRequest build() {
                    return _build(sync);
                }

                public Builder setSync(final com.google.common.base.Optional<Boolean> sync) {
                    this.sync = sync;
                    return this;
                }

                public Builder setSync(final boolean sync) {
                    this.sync = com.google.common.base.Optional.of(sync);
                    return this;
                }

                private com.google.common.base.Optional<Boolean> sync = com.google.common.base.Optional.absent();
            }

            public GetAgentMagentoProductsRequest() {
                sync = com.google.common.base.Optional.absent();
            }

            public GetAgentMagentoProductsRequest(final GetAgentMagentoProductsRequest other) {
                this(other.getSync());
            }

            public GetAgentMagentoProductsRequest(final org.thryft.protocol.TProtocol iprot) throws java.io.IOException {
                this(iprot, org.thryft.protocol.TType.STRUCT);
            }

            public GetAgentMagentoProductsRequest(final org.thryft.protocol.TProtocol iprot, final byte readAsTType) throws java.io.IOException {
                com.google.common.base.Optional<Boolean> sync = com.google.common.base.Optional.absent();

                switch (readAsTType) {
                    case org.thryft.protocol.TType.LIST:
                        final org.thryft.protocol.TList __list = iprot.readListBegin();
                        if (__list.size > 0) {
                            sync = com.google.common.base.Optional.of(iprot.readBool());
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
                            } else if (ifield.name.equals("sync")) {
                                sync = com.google.common.base.Optional.of(iprot.readBool());
                            }
                            iprot.readFieldEnd();
                        }
                        iprot.readStructEnd();
                        break;
                }

                this.sync = sync;
            }

            public GetAgentMagentoProductsRequest(final com.google.common.base.Optional<Boolean> sync) {
                this.sync = sync;
            }

            @Override
            public int compareTo(final GetAgentMagentoProductsRequest other) {
                throw new UnsupportedOperationException();
            }

            @Override
            public boolean equals(final Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof GetAgentMagentoProductsRequest)) {
                    return false;
                }

                final GetAgentMagentoProductsRequest other = (GetAgentMagentoProductsRequest)otherObject;
                return
                    getSync().equals(other.getSync());
            }

            public Object get(final String fieldName) {
                if (fieldName.equals("sync")) {
                    return getSync();
                }
                throw new IllegalArgumentException(fieldName);
            }

            public final com.google.common.base.Optional<Boolean> getSync() {
                return sync;
            }

            @Override
            public int hashCode() {
                int hashCode = 17;
                if (getSync().isPresent()) {
                    hashCode = 31 * hashCode + (getSync().get() ? 1 : 0);
                }
                return hashCode;
            }

            @Override
            public String toString() {
                final com.google.common.base.Objects.ToStringHelper helper = com.google.common.base.Objects.toStringHelper(this);
                if (getSync().isPresent()) {
                    helper.add("sync", getSync());
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
                        oprot.writeListBegin(new org.thryft.protocol.TList(org.thryft.protocol.TType.VOID, 1));

                        if (getSync().isPresent()) {
                            oprot.writeBool(getSync().get());
                        } else {
                            oprot.writeNull();
                        }

                        oprot.writeListEnd();
                        break;

                    case org.thryft.protocol.TType.STRUCT:
                    default:
                        oprot.writeStructBegin(new org.thryft.protocol.TStruct("GetAgentMagentoProductsRequest"));

                        if (getSync().isPresent()) {
                            oprot.writeFieldBegin(new org.thryft.protocol.TField("sync", org.thryft.protocol.TType.BOOL, (short)-1));
                            oprot.writeBool(getSync().get());
                            oprot.writeFieldEnd();
                        }

                        oprot.writeFieldStop();

                        oprot.writeStructEnd();
                        break;
                }
            }

            private final com.google.common.base.Optional<Boolean> sync;
        }

        @SuppressWarnings({"serial"})
        public final static class GetAgentMagentoProductsResponse implements org.thryft.TBase<GetAgentMagentoProductsResponse> {
            public static class Builder {
                public Builder() {
                }

                public Builder(final GetAgentMagentoProductsResponse other) {
                    this.returnValue = other.getReturnValue();
                }

                protected GetAgentMagentoProductsResponse _build(final com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.magento.MagentoProduct> returnValue) {
                    return new GetAgentMagentoProductsResponse(returnValue);
                }

                public GetAgentMagentoProductsResponse build() {
                    return _build(returnValue);
                }

                public Builder setReturnValue(final com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.magento.MagentoProduct> returnValue) {
                    this.returnValue = returnValue;
                    return this;
                }

                private com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.magento.MagentoProduct> returnValue;
            }

            public GetAgentMagentoProductsResponse(final GetAgentMagentoProductsResponse other) {
                this(other.getReturnValue());
            }

            public GetAgentMagentoProductsResponse(final org.thryft.protocol.TProtocol iprot) throws java.io.IOException {
                returnValue = (new com.google.common.base.Function<org.thryft.protocol.TProtocol, com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.magento.MagentoProduct>>() {
                    @Override
                    public com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.magento.MagentoProduct> apply(final org.thryft.protocol.TProtocol iprot) {
                        try {
                            final org.thryft.protocol.TSet sequenceBegin = iprot.readSetBegin();
                            final java.util.Set<com.yogento.api.models.catalog.product.magento.MagentoProduct> sequence = new java.util.LinkedHashSet<com.yogento.api.models.catalog.product.magento.MagentoProduct>();
                            for (int elementI = 0; elementI < sequenceBegin.size; elementI++) {
                                sequence.add(new com.yogento.api.models.catalog.product.magento.MagentoProduct(iprot));
                            }
                            iprot.readSetEnd();
                            return com.google.common.collect.ImmutableSet.copyOf(sequence);
                        } catch (final java.io.IOException e) {
                            return com.google.common.collect.ImmutableSet.of();
                        }
                    }
                }).apply(iprot);
            }

            public GetAgentMagentoProductsResponse(final com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.magento.MagentoProduct> returnValue) {
                this.returnValue = com.google.common.base.Preconditions.checkNotNull(returnValue, "com.yogento.api.services.agent.AgentService.getAgentMagentoProducts: missing returnValue");
            }

            @Override
            public int compareTo(final GetAgentMagentoProductsResponse other) {
                throw new UnsupportedOperationException();
            }

            @Override
            public boolean equals(final Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof GetAgentMagentoProductsResponse)) {
                    return false;
                }

                final GetAgentMagentoProductsResponse other = (GetAgentMagentoProductsResponse)otherObject;
                return
                    getReturnValue().equals(other.getReturnValue());
            }

            public Object get(final String fieldName) {
                if (fieldName.equals("return_value")) {
                    return getReturnValue();
                }
                throw new IllegalArgumentException(fieldName);
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
            public String toString() {
                final com.google.common.base.Objects.ToStringHelper helper = com.google.common.base.Objects.toStringHelper(this);
                helper.add("return_value", getReturnValue());
                return helper.toString();
            }

            @Override
            public void write(final org.thryft.protocol.TProtocol oprot) throws java.io.IOException {
                write(oprot, org.thryft.protocol.TType.STRUCT);
            }

            public void write(final org.thryft.protocol.TProtocol oprot, final byte writeAsTType) throws java.io.IOException {
                switch (writeAsTType) {
                    case org.thryft.protocol.TType.VOID: {
                        oprot.writeSetBegin(new org.thryft.protocol.TSet(org.thryft.protocol.TType.STRUCT, getReturnValue().size()));
                        for (final com.yogento.api.models.catalog.product.magento.MagentoProduct _iter0 : getReturnValue()) {
                            _iter0.write(oprot);
                        }
                        oprot.writeSetEnd();
                        break;
                    }

                    case org.thryft.protocol.TType.LIST:
                        oprot.writeListBegin(new org.thryft.protocol.TList(org.thryft.protocol.TType.VOID, 1));

                        oprot.writeSetBegin(new org.thryft.protocol.TSet(org.thryft.protocol.TType.STRUCT, getReturnValue().size()));
                        for (final com.yogento.api.models.catalog.product.magento.MagentoProduct _iter0 : getReturnValue()) {
                            _iter0.write(oprot);
                        }
                        oprot.writeSetEnd();

                        oprot.writeListEnd();
                        break;

                    case org.thryft.protocol.TType.STRUCT:
                    default:
                        oprot.writeStructBegin(new org.thryft.protocol.TStruct("GetAgentMagentoProductsResponse"));

                        oprot.writeFieldBegin(new org.thryft.protocol.TField("return_value", org.thryft.protocol.TType.SET, (short)-1));
                        oprot.writeSetBegin(new org.thryft.protocol.TSet(org.thryft.protocol.TType.STRUCT, getReturnValue().size()));
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
        public final static class HeadMagentoStoreRequest implements org.thryft.TBase<HeadMagentoStoreRequest> {
            public static class Builder {
                public Builder() {
                }

                public Builder(final HeadMagentoStoreRequest other) {
                    this.magentoStoreUrl = other.getMagentoStoreUrl();
                }

                protected HeadMagentoStoreRequest _build(final String magentoStoreUrl) {
                    return new HeadMagentoStoreRequest(magentoStoreUrl);
                }

                public HeadMagentoStoreRequest build() {
                    return _build(magentoStoreUrl);
                }

                public Builder setMagentoStoreUrl(final String magentoStoreUrl) {
                    this.magentoStoreUrl = magentoStoreUrl;
                    return this;
                }

                private String magentoStoreUrl;
            }

            public HeadMagentoStoreRequest(final HeadMagentoStoreRequest other) {
                this(other.getMagentoStoreUrl());
            }

            public HeadMagentoStoreRequest(final org.thryft.protocol.TProtocol iprot) throws java.io.IOException {
                this(iprot, org.thryft.protocol.TType.STRUCT);
            }

            public HeadMagentoStoreRequest(final org.thryft.protocol.TProtocol iprot, final byte readAsTType) throws java.io.IOException {
                String magentoStoreUrl = null;

                switch (readAsTType) {
                    case org.thryft.protocol.TType.LIST:
                        iprot.readListBegin();
                        magentoStoreUrl = iprot.readString();
                        iprot.readListEnd();
                        break;

                    case org.thryft.protocol.TType.STRUCT:
                    default:
                        iprot.readStructBegin();
                        while (true) {
                            final org.thryft.protocol.TField ifield = iprot.readFieldBegin();
                            if (ifield.type == org.thryft.protocol.TType.STOP) {
                                break;
                            } else if (ifield.name.equals("magento_store_url")) {
                                magentoStoreUrl = iprot.readString();
                            }
                            iprot.readFieldEnd();
                        }
                        iprot.readStructEnd();
                        break;
                }

                this.magentoStoreUrl = com.google.common.base.Preconditions.checkNotNull(magentoStoreUrl, "com.yogento.api.services.agent.HeadMagentoStoreRequest: missing magentoStoreUrl");
            }

            public HeadMagentoStoreRequest(final String magentoStoreUrl) {
                this.magentoStoreUrl = com.google.common.base.Preconditions.checkNotNull(magentoStoreUrl, "com.yogento.api.services.agent.HeadMagentoStoreRequest: missing magentoStoreUrl");
            }

            @Override
            public int compareTo(final HeadMagentoStoreRequest other) {
                throw new UnsupportedOperationException();
            }

            @Override
            public boolean equals(final Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof HeadMagentoStoreRequest)) {
                    return false;
                }

                final HeadMagentoStoreRequest other = (HeadMagentoStoreRequest)otherObject;
                return
                    getMagentoStoreUrl().equals(other.getMagentoStoreUrl());
            }

            public Object get(final String fieldName) {
                if (fieldName.equals("magento_store_url")) {
                    return getMagentoStoreUrl();
                }
                throw new IllegalArgumentException(fieldName);
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
            public String toString() {
                final com.google.common.base.Objects.ToStringHelper helper = com.google.common.base.Objects.toStringHelper(this);
                helper.add("magento_store_url", getMagentoStoreUrl());
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
                        oprot.writeListBegin(new org.thryft.protocol.TList(org.thryft.protocol.TType.VOID, 1));

                        oprot.writeString(getMagentoStoreUrl());

                        oprot.writeListEnd();
                        break;

                    case org.thryft.protocol.TType.STRUCT:
                    default:
                        oprot.writeStructBegin(new org.thryft.protocol.TStruct("HeadMagentoStoreRequest"));

                        oprot.writeFieldBegin(new org.thryft.protocol.TField("magento_store_url", org.thryft.protocol.TType.STRING, (short)-1));
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
        public final static class HeadMagentoStoreResponse implements org.thryft.TBase<HeadMagentoStoreResponse> {
            public static class Builder {
                public Builder() {
                }

                public Builder(final HeadMagentoStoreResponse other) {
                    this.returnValue = other.isReturnValue();
                }

                protected HeadMagentoStoreResponse _build(final boolean returnValue) {
                    return new HeadMagentoStoreResponse(returnValue);
                }

                public HeadMagentoStoreResponse build() {
                    return _build(returnValue);
                }

                public Builder setReturnValue(final boolean returnValue) {
                    this.returnValue = returnValue;
                    return this;
                }

                private Boolean returnValue;
            }

            public HeadMagentoStoreResponse(final HeadMagentoStoreResponse other) {
                this(other.isReturnValue());
            }

            public HeadMagentoStoreResponse(final org.thryft.protocol.TProtocol iprot) throws java.io.IOException {
                returnValue = iprot.readBool();
            }

            public HeadMagentoStoreResponse(final boolean returnValue) {
                this.returnValue = returnValue;
            }

            public HeadMagentoStoreResponse(final Boolean returnValue) {
                this.returnValue = returnValue;
            }

            @Override
            public int compareTo(final HeadMagentoStoreResponse other) {
                throw new UnsupportedOperationException();
            }

            @Override
            public boolean equals(final Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof HeadMagentoStoreResponse)) {
                    return false;
                }

                final HeadMagentoStoreResponse other = (HeadMagentoStoreResponse)otherObject;
                return
                    isReturnValue() == other.isReturnValue();
            }

            public Object get(final String fieldName) {
                if (fieldName.equals("return_value")) {
                    return isReturnValue();
                }
                throw new IllegalArgumentException(fieldName);
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
            public String toString() {
                final com.google.common.base.Objects.ToStringHelper helper = com.google.common.base.Objects.toStringHelper(this);
                helper.add("return_value", isReturnValue());
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
                        oprot.writeListBegin(new org.thryft.protocol.TList(org.thryft.protocol.TType.VOID, 1));

                        oprot.writeBool(isReturnValue());

                        oprot.writeListEnd();
                        break;

                    case org.thryft.protocol.TType.STRUCT:
                    default:
                        oprot.writeStructBegin(new org.thryft.protocol.TStruct("HeadMagentoStoreResponse"));

                        oprot.writeFieldBegin(new org.thryft.protocol.TField("return_value", org.thryft.protocol.TType.BOOL, (short)-1));
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
        public final static class PutAgentMagentoProductsRequest implements org.thryft.TBase<PutAgentMagentoProductsRequest> {
            public static class Builder {
                public Builder() {
                }

                public Builder(final PutAgentMagentoProductsRequest other) {
                    this.magentoProductsJson = other.getMagentoProductsJson();
                    this.ticket = other.getTicket();
                    this.username = other.getUsername();
                }

                protected PutAgentMagentoProductsRequest _build(final String magentoProductsJson, final String ticket, final String username) {
                    return new PutAgentMagentoProductsRequest(magentoProductsJson, ticket, username);
                }

                public PutAgentMagentoProductsRequest build() {
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

            public PutAgentMagentoProductsRequest(final PutAgentMagentoProductsRequest other) {
                this(other.getMagentoProductsJson(), other.getTicket(), other.getUsername());
            }

            public PutAgentMagentoProductsRequest(final org.thryft.protocol.TProtocol iprot) throws java.io.IOException {
                this(iprot, org.thryft.protocol.TType.STRUCT);
            }

            public PutAgentMagentoProductsRequest(final org.thryft.protocol.TProtocol iprot, final byte readAsTType) throws java.io.IOException {
                String magentoProductsJson = null;
                String ticket = null;
                String username = null;

                switch (readAsTType) {
                    case org.thryft.protocol.TType.LIST:
                        iprot.readListBegin();
                        magentoProductsJson = iprot.readString();
                        ticket = iprot.readString();
                        username = iprot.readString();
                        iprot.readListEnd();
                        break;

                    case org.thryft.protocol.TType.STRUCT:
                    default:
                        iprot.readStructBegin();
                        while (true) {
                            final org.thryft.protocol.TField ifield = iprot.readFieldBegin();
                            if (ifield.type == org.thryft.protocol.TType.STOP) {
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

                this.magentoProductsJson = com.google.common.base.Preconditions.checkNotNull(magentoProductsJson, "com.yogento.api.services.agent.PutAgentMagentoProductsRequest: missing magentoProductsJson");
                this.ticket = com.google.common.base.Preconditions.checkNotNull(ticket, "com.yogento.api.services.agent.PutAgentMagentoProductsRequest: missing ticket");
                this.username = com.google.common.base.Preconditions.checkNotNull(username, "com.yogento.api.services.agent.PutAgentMagentoProductsRequest: missing username");
            }

            public PutAgentMagentoProductsRequest(final String magentoProductsJson, final String ticket, final String username) {
                this.magentoProductsJson = com.google.common.base.Preconditions.checkNotNull(magentoProductsJson, "com.yogento.api.services.agent.PutAgentMagentoProductsRequest: missing magentoProductsJson");
                this.ticket = com.google.common.base.Preconditions.checkNotNull(ticket, "com.yogento.api.services.agent.PutAgentMagentoProductsRequest: missing ticket");
                this.username = com.google.common.base.Preconditions.checkNotNull(username, "com.yogento.api.services.agent.PutAgentMagentoProductsRequest: missing username");
            }

            @Override
            public int compareTo(final PutAgentMagentoProductsRequest other) {
                throw new UnsupportedOperationException();
            }

            @Override
            public boolean equals(final Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof PutAgentMagentoProductsRequest)) {
                    return false;
                }

                final PutAgentMagentoProductsRequest other = (PutAgentMagentoProductsRequest)otherObject;
                return
                    getMagentoProductsJson().equals(other.getMagentoProductsJson()) &&
                    getTicket().equals(other.getTicket()) &&
                    getUsername().equals(other.getUsername());
            }

            public Object get(final String fieldName) {
                if (fieldName.equals("magento_products_json")) {
                    return getMagentoProductsJson();
                } else if (fieldName.equals("ticket")) {
                    return getTicket();
                } else if (fieldName.equals("username")) {
                    return getUsername();
                }
                throw new IllegalArgumentException(fieldName);
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
            public String toString() {
                final com.google.common.base.Objects.ToStringHelper helper = com.google.common.base.Objects.toStringHelper(this);
                helper.add("magento_products_json", getMagentoProductsJson());
                helper.add("ticket", getTicket());
                helper.add("username", getUsername());
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
                        oprot.writeListBegin(new org.thryft.protocol.TList(org.thryft.protocol.TType.VOID, 3));

                        oprot.writeString(getMagentoProductsJson());

                        oprot.writeString(getTicket());

                        oprot.writeString(getUsername());

                        oprot.writeListEnd();
                        break;

                    case org.thryft.protocol.TType.STRUCT:
                    default:
                        oprot.writeStructBegin(new org.thryft.protocol.TStruct("PutAgentMagentoProductsRequest"));

                        oprot.writeFieldBegin(new org.thryft.protocol.TField("magento_products_json", org.thryft.protocol.TType.STRING, (short)-1));
                        oprot.writeString(getMagentoProductsJson());
                        oprot.writeFieldEnd();

                        oprot.writeFieldBegin(new org.thryft.protocol.TField("ticket", org.thryft.protocol.TType.STRING, (short)-1));
                        oprot.writeString(getTicket());
                        oprot.writeFieldEnd();

                        oprot.writeFieldBegin(new org.thryft.protocol.TField("username", org.thryft.protocol.TType.STRING, (short)-1));
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
        public final static class PutAgentMagentoProductsResponse implements org.thryft.TBase<PutAgentMagentoProductsResponse> {
            public static class Builder {
                public Builder() {
                }

                public Builder(final PutAgentMagentoProductsResponse other) {
                }

                protected PutAgentMagentoProductsResponse _build() {
                    return new PutAgentMagentoProductsResponse();
                }

                public PutAgentMagentoProductsResponse build() {
                    return _build();
                }
            }

            public PutAgentMagentoProductsResponse() {
            }

            public PutAgentMagentoProductsResponse(final PutAgentMagentoProductsResponse other) {
            }

            public PutAgentMagentoProductsResponse(final org.thryft.protocol.TProtocol iprot) throws java.io.IOException {
            }

            @Override
            public int compareTo(final PutAgentMagentoProductsResponse other) {
                throw new UnsupportedOperationException();
            }

            @Override
            public boolean equals(final Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof PutAgentMagentoProductsResponse)) {
                    return false;
                }

                return true;
            }

            public Object get(final String fieldName) {
                throw new IllegalArgumentException(fieldName);
            }

            @Override
            public int hashCode() {
                int hashCode = 17;
                return hashCode;
            }

            @Override
            public String toString() {
                final com.google.common.base.Objects.ToStringHelper helper = com.google.common.base.Objects.toStringHelper(this);
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
                        oprot.writeListBegin(new org.thryft.protocol.TList(org.thryft.protocol.TType.VOID, 0));
                        oprot.writeListEnd();
                        break;

                    case org.thryft.protocol.TType.STRUCT:
                    default:
                        oprot.writeStructBegin(new org.thryft.protocol.TStruct("PutAgentMagentoProductsResponse"));

                        oprot.writeFieldStop();

                        oprot.writeStructEnd();
                        break;
                }
            }
        }
    }

    public com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.magento.MagentoProduct> getAgentMagentoProducts(final com.google.common.base.Optional<Boolean> sync) throws com.yogento.api.services.agent.AgentException;

    public boolean headMagentoStore(final String magentoStoreUrl);

    public void putAgentMagentoProducts(final String magentoProductsJson, final String ticket, final String username);
}
