package com.yogento.api.services.agent;

public interface AgentService {
    public static class Messages {
        @SuppressWarnings({"serial"})
        public final static class getAgentMagentoProductsRequest implements org.thryft.TBase<getAgentMagentoProductsRequest> {
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

            public getAgentMagentoProductsRequest(final org.thryft.protocol.TProtocol iprot) throws java.io.IOException {
                this(iprot, org.thryft.protocol.TType.STRUCT);
            }

            public getAgentMagentoProductsRequest(final org.thryft.protocol.TProtocol iprot, final byte readAsTType) throws java.io.IOException {
                Boolean sync = null;

                switch (readAsTType) {
                    case org.thryft.protocol.TType.LIST:
                        final org.thryft.protocol.TList __list = iprot.readListBegin();
                        if (__list.size > 0) {
                            sync = iprot.readBool();
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
            public int compareTo(final getAgentMagentoProductsRequest other) {
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

            public Object get(final String fieldName) {
                if (fieldName.equals("sync")) {
                    return isSync();
                }
                return null;
            }

            @Override
            public int hashCode() {
                int hashCode = 17;
                if (isSync() != null) {
                    hashCode = 31 * hashCode + (isSync() ? 1 : 0);
                }
                return hashCode;
            }

            public final Boolean isSync() {
                return sync;
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
            public void write(final org.thryft.protocol.TProtocol oprot) throws java.io.IOException {
                write(oprot, org.thryft.protocol.TType.STRUCT);
            }

            public void write(final org.thryft.protocol.TProtocol oprot, final byte writeAsTType) throws java.io.IOException {
                switch (writeAsTType) {
                    case org.thryft.protocol.TType.VOID:
                    case org.thryft.protocol.TType.LIST:
                        oprot.writeListBegin(new org.thryft.protocol.TList(org.thryft.protocol.TType.VOID, 1));

                        if (isSync() != null) {
                            oprot.writeBool(isSync());
                        } else {
                            ((org.thryft.protocol.TProtocol)oprot).writeNull();
                        }

                        oprot.writeListEnd();
                        break;

                    case org.thryft.protocol.TType.STRUCT:
                    default:
                        oprot.writeStructBegin(new org.thryft.protocol.TStruct("getAgentMagentoProductsRequest"));

                        if (isSync() != null) {
                            oprot.writeFieldBegin(new org.thryft.protocol.TField("sync", org.thryft.protocol.TType.BOOL, (short)-1));
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
        public final static class getAgentMagentoProductsResponse implements org.thryft.TBase<getAgentMagentoProductsResponse> {
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

            public getAgentMagentoProductsResponse(final org.thryft.protocol.TProtocol iprot) throws java.io.IOException {
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

            public getAgentMagentoProductsResponse(final com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.magento.MagentoProduct> returnValue) {
                this.returnValue = com.google.common.base.Preconditions.checkNotNull(returnValue, "com.yogento.api.services.agent.AgentService.getAgentMagentoProducts: missing returnValue");
            }

            @Override
            public int compareTo(final getAgentMagentoProductsResponse other) {
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

            public Object get(final String fieldName) {
                if (fieldName.equals("return_value")) {
                    return getReturnValue();
                }
                return null;
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
                        oprot.writeStructBegin(new org.thryft.protocol.TStruct("getAgentMagentoProductsResponse"));

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
        public final static class headMagentoStoreRequest implements org.thryft.TBase<headMagentoStoreRequest> {
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

            public headMagentoStoreRequest(final org.thryft.protocol.TProtocol iprot) throws java.io.IOException {
                this(iprot, org.thryft.protocol.TType.STRUCT);
            }

            public headMagentoStoreRequest(final org.thryft.protocol.TProtocol iprot, final byte readAsTType) throws java.io.IOException {
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

                this.magentoStoreUrl = com.google.common.base.Preconditions.checkNotNull(magentoStoreUrl, "com.yogento.api.services.agent.headMagentoStoreRequest: missing magentoStoreUrl");
            }

            public headMagentoStoreRequest(final String magentoStoreUrl) {
                this.magentoStoreUrl = com.google.common.base.Preconditions.checkNotNull(magentoStoreUrl, "com.yogento.api.services.agent.headMagentoStoreRequest: missing magentoStoreUrl");
            }

            @Override
            public int compareTo(final headMagentoStoreRequest other) {
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

            public Object get(final String fieldName) {
                if (fieldName.equals("magento_store_url")) {
                    return getMagentoStoreUrl();
                }
                return null;
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
                        oprot.writeStructBegin(new org.thryft.protocol.TStruct("headMagentoStoreRequest"));

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
        public final static class headMagentoStoreResponse implements org.thryft.TBase<headMagentoStoreResponse> {
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

            public headMagentoStoreResponse(final org.thryft.protocol.TProtocol iprot) throws java.io.IOException {
                returnValue = iprot.readBool();
            }

            public headMagentoStoreResponse(final boolean returnValue) {
                this.returnValue = returnValue;
            }

            public headMagentoStoreResponse(final Boolean returnValue) {
                this.returnValue = returnValue;
            }

            @Override
            public int compareTo(final headMagentoStoreResponse other) {
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

            public Object get(final String fieldName) {
                if (fieldName.equals("return_value")) {
                    return isReturnValue();
                }
                return null;
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
                        oprot.writeStructBegin(new org.thryft.protocol.TStruct("headMagentoStoreResponse"));

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
        public final static class putAgentMagentoProductsRequest implements org.thryft.TBase<putAgentMagentoProductsRequest> {
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

            public putAgentMagentoProductsRequest(final org.thryft.protocol.TProtocol iprot) throws java.io.IOException {
                this(iprot, org.thryft.protocol.TType.STRUCT);
            }

            public putAgentMagentoProductsRequest(final org.thryft.protocol.TProtocol iprot, final byte readAsTType) throws java.io.IOException {
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

                this.magentoProductsJson = com.google.common.base.Preconditions.checkNotNull(magentoProductsJson, "com.yogento.api.services.agent.putAgentMagentoProductsRequest: missing magentoProductsJson");
                this.ticket = com.google.common.base.Preconditions.checkNotNull(ticket, "com.yogento.api.services.agent.putAgentMagentoProductsRequest: missing ticket");
                this.username = com.google.common.base.Preconditions.checkNotNull(username, "com.yogento.api.services.agent.putAgentMagentoProductsRequest: missing username");
            }

            public putAgentMagentoProductsRequest(final String magentoProductsJson, final String ticket, final String username) {
                this.magentoProductsJson = com.google.common.base.Preconditions.checkNotNull(magentoProductsJson, "com.yogento.api.services.agent.putAgentMagentoProductsRequest: missing magentoProductsJson");
                this.ticket = com.google.common.base.Preconditions.checkNotNull(ticket, "com.yogento.api.services.agent.putAgentMagentoProductsRequest: missing ticket");
                this.username = com.google.common.base.Preconditions.checkNotNull(username, "com.yogento.api.services.agent.putAgentMagentoProductsRequest: missing username");
            }

            @Override
            public int compareTo(final putAgentMagentoProductsRequest other) {
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
                        oprot.writeStructBegin(new org.thryft.protocol.TStruct("putAgentMagentoProductsRequest"));

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
        public final static class putAgentMagentoProductsResponse implements org.thryft.TBase<putAgentMagentoProductsResponse> {
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

            public putAgentMagentoProductsResponse(final org.thryft.protocol.TProtocol iprot) throws java.io.IOException {
            }

            @Override
            public int compareTo(final putAgentMagentoProductsResponse other) {
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

            public Object get(final String fieldName) {
                return null;
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
                        oprot.writeStructBegin(new org.thryft.protocol.TStruct("putAgentMagentoProductsResponse"));

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
