package com.yogento.api.services.catalog;

public interface CatalogService {
    public static class Messages {
        @SuppressWarnings({"serial"})
        public final static class DeleteProductBySkuRequest implements org.thryft.TBase<DeleteProductBySkuRequest> {
            public static class Builder {
                public Builder() {
                }

                public Builder(final DeleteProductBySkuRequest other) {
                    this.sku = other.getSku();
                }

                protected DeleteProductBySkuRequest _build(final String sku) {
                    return new DeleteProductBySkuRequest(sku);
                }

                public DeleteProductBySkuRequest build() {
                    return _build(sku);
                }

                public Builder setSku(final String sku) {
                    this.sku = sku;
                    return this;
                }

                private String sku;
            }

            public DeleteProductBySkuRequest(final DeleteProductBySkuRequest other) {
                this(other.getSku());
            }

            public DeleteProductBySkuRequest(final org.thryft.protocol.TProtocol iprot) throws java.io.IOException {
                this(iprot, org.thryft.protocol.TType.STRUCT);
            }

            public DeleteProductBySkuRequest(final org.thryft.protocol.TProtocol iprot, final byte readAsTType) throws java.io.IOException {
                String sku = null;

                switch (readAsTType) {
                    case org.thryft.protocol.TType.LIST:
                        iprot.readListBegin();
                        sku = iprot.readString();
                        iprot.readListEnd();
                        break;

                    case org.thryft.protocol.TType.STRUCT:
                    default:
                        iprot.readStructBegin();
                        while (true) {
                            final org.thryft.protocol.TField ifield = iprot.readFieldBegin();
                            if (ifield.type == org.thryft.protocol.TType.STOP) {
                                break;
                            } else if (ifield.name.equals("sku")) {
                                sku = iprot.readString();
                            }
                            iprot.readFieldEnd();
                        }
                        iprot.readStructEnd();
                        break;
                }

                this.sku = com.google.common.base.Preconditions.checkNotNull(sku, "com.yogento.api.services.catalog.DeleteProductBySkuRequest: missing sku");
            }

            public DeleteProductBySkuRequest(final String sku) {
                this.sku = com.google.common.base.Preconditions.checkNotNull(sku, "com.yogento.api.services.catalog.DeleteProductBySkuRequest: missing sku");
            }

            public static Builder builder() {
                return new Builder();
            }

            @Override
            public int compareTo(final DeleteProductBySkuRequest other) {
                if (other == null) {
                    throw new NullPointerException();
                }

                int result;
                result = this.sku.compareTo(other.sku);
                if (result != 0) {
                    return result;
                }

                return 0;
            }

            @Override
            public boolean equals(final Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof DeleteProductBySkuRequest)) {
                    return false;
                }

                final DeleteProductBySkuRequest other = (DeleteProductBySkuRequest)otherObject;
                return
                    getSku().equals(other.getSku());
            }

            public static DeleteProductBySkuRequest fake() {
                return fakeBuilder().build();
            }

            public static Builder fakeBuilder() {
                Builder builder = new Builder();
                builder.setSku(org.thryft.Faker.Lorem.word());
                return builder;
            }

            public Object get(final String fieldName) {
                if (fieldName.equals("sku")) {
                    return getSku();
                }
                throw new IllegalArgumentException(fieldName);
            }

            public final String getSku() {
                return sku;
            }

            @Override
            public int hashCode() {
                int hashCode = 17;
                hashCode = 31 * hashCode + getSku().hashCode();
                return hashCode;
            }

            public DeleteProductBySkuRequest replaceSku(final String sku) {
                return new DeleteProductBySkuRequest(sku);
            }

            @Override
            public String toString() {
                final com.google.common.base.Objects.ToStringHelper helper = com.google.common.base.Objects.toStringHelper(this);
                helper.add("sku", getSku());
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

                        oprot.writeString(getSku());

                        oprot.writeListEnd();
                        break;

                    case org.thryft.protocol.TType.STRUCT:
                    default:
                        oprot.writeStructBegin(new org.thryft.protocol.TStruct("DeleteProductBySkuRequest"));

                        oprot.writeFieldBegin(new org.thryft.protocol.TField("sku", org.thryft.protocol.TType.STRING, (short)-1));
                        oprot.writeString(getSku());
                        oprot.writeFieldEnd();

                        oprot.writeFieldStop();

                        oprot.writeStructEnd();
                        break;
                }
            }

            private final String sku;
        }

        @SuppressWarnings({"serial"})
        public final static class DeleteProductBySkuResponse implements org.thryft.TBase<DeleteProductBySkuResponse> {
            public static class Builder {
                public Builder() {
                }

                public Builder(final DeleteProductBySkuResponse other) {
                    this.returnValue = other.isReturnValue();
                }

                protected DeleteProductBySkuResponse _build(final boolean returnValue) {
                    return new DeleteProductBySkuResponse(returnValue);
                }

                public DeleteProductBySkuResponse build() {
                    return _build(returnValue);
                }

                public Builder setReturnValue(final boolean returnValue) {
                    this.returnValue = returnValue;
                    return this;
                }

                private Boolean returnValue;
            }

            public DeleteProductBySkuResponse(final DeleteProductBySkuResponse other) {
                this(other.isReturnValue());
            }

            public DeleteProductBySkuResponse(final org.thryft.protocol.TProtocol iprot) throws java.io.IOException {
                returnValue = iprot.readBool();
            }

            public DeleteProductBySkuResponse(final boolean returnValue) {
                this.returnValue = returnValue;
            }

            public DeleteProductBySkuResponse(final Boolean returnValue) {
                this.returnValue = returnValue;
            }

            public static Builder builder() {
                return new Builder();
            }

            @Override
            public int compareTo(final DeleteProductBySkuResponse other) {
                if (other == null) {
                    throw new NullPointerException();
                }

                int result;
                result = ((Boolean)this.returnValue).compareTo(other.returnValue);
                if (result != 0) {
                    return result;
                }

                return 0;
            }

            @Override
            public boolean equals(final Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof DeleteProductBySkuResponse)) {
                    return false;
                }

                final DeleteProductBySkuResponse other = (DeleteProductBySkuResponse)otherObject;
                return
                    isReturnValue() == other.isReturnValue();
            }

            public static DeleteProductBySkuResponse fake() {
                return fakeBuilder().build();
            }

            public static Builder fakeBuilder() {
                Builder builder = new Builder();
                builder.setReturnValue(org.thryft.Faker.randomBool());
                return builder;
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

            public DeleteProductBySkuResponse replaceReturnValue(final boolean returnValue) {
                return new DeleteProductBySkuResponse(returnValue);
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
                        oprot.writeStructBegin(new org.thryft.protocol.TStruct("DeleteProductBySkuResponse"));

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
        public final static class DeleteProductsRequest implements org.thryft.TBase<DeleteProductsRequest> {
            public static class Builder {
                public Builder() {
                }

                public Builder(final DeleteProductsRequest other) {
                }

                protected DeleteProductsRequest _build() {
                    return new DeleteProductsRequest();
                }

                public DeleteProductsRequest build() {
                    return _build();
                }
            }

            public DeleteProductsRequest() {
            }

            public DeleteProductsRequest(final DeleteProductsRequest other) {
            }

            public DeleteProductsRequest(final org.thryft.protocol.TProtocol iprot) throws java.io.IOException {
                this(iprot, org.thryft.protocol.TType.STRUCT);
            }

            public DeleteProductsRequest(final org.thryft.protocol.TProtocol iprot, final byte readAsTType) throws java.io.IOException {
                switch (readAsTType) {
                    case org.thryft.protocol.TType.LIST:
                        iprot.readListBegin();
                        iprot.readListEnd();
                        break;

                    case org.thryft.protocol.TType.STRUCT:
                    default:
                        iprot.readStructBegin();
                        while (true) {
                            final org.thryft.protocol.TField ifield = iprot.readFieldBegin();
                            if (ifield.type == org.thryft.protocol.TType.STOP) {
                                break;
                            }
                            iprot.readFieldEnd();
                        }
                        iprot.readStructEnd();
                        break;
                }
            }

            public static Builder builder() {
                return new Builder();
            }

            @Override
            public int compareTo(final DeleteProductsRequest other) {
                if (other == null) {
                    throw new NullPointerException();
                }
                return 0;
            }

            @Override
            public boolean equals(final Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof DeleteProductsRequest)) {
                    return false;
                }

                return true;
            }

            public static DeleteProductsRequest fake() {
                return fakeBuilder().build();
            }

            public static Builder fakeBuilder() {
                Builder builder = new Builder();
                return builder;
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
                        oprot.writeStructBegin(new org.thryft.protocol.TStruct("DeleteProductsRequest"));

                        oprot.writeFieldStop();

                        oprot.writeStructEnd();
                        break;
                }
            }
        }

        @SuppressWarnings({"serial"})
        public final static class DeleteProductsResponse implements org.thryft.TBase<DeleteProductsResponse> {
            public static class Builder {
                public Builder() {
                }

                public Builder(final DeleteProductsResponse other) {
                }

                protected DeleteProductsResponse _build() {
                    return new DeleteProductsResponse();
                }

                public DeleteProductsResponse build() {
                    return _build();
                }
            }

            public DeleteProductsResponse() {
            }

            public DeleteProductsResponse(final DeleteProductsResponse other) {
            }

            public DeleteProductsResponse(final org.thryft.protocol.TProtocol iprot) throws java.io.IOException {
            }

            public static Builder builder() {
                return new Builder();
            }

            @Override
            public int compareTo(final DeleteProductsResponse other) {
                if (other == null) {
                    throw new NullPointerException();
                }
                return 0;
            }

            @Override
            public boolean equals(final Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof DeleteProductsResponse)) {
                    return false;
                }

                return true;
            }

            public static DeleteProductsResponse fake() {
                return fakeBuilder().build();
            }

            public static Builder fakeBuilder() {
                Builder builder = new Builder();
                return builder;
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
                        oprot.writeStructBegin(new org.thryft.protocol.TStruct("DeleteProductsResponse"));

                        oprot.writeFieldStop();

                        oprot.writeStructEnd();
                        break;
                }
            }
        }

        @SuppressWarnings({"serial"})
        public final static class GetProductCountRequest implements org.thryft.TBase<GetProductCountRequest> {
            public static class Builder {
                public Builder() {
                }

                public Builder(final GetProductCountRequest other) {
                }

                protected GetProductCountRequest _build() {
                    return new GetProductCountRequest();
                }

                public GetProductCountRequest build() {
                    return _build();
                }
            }

            public GetProductCountRequest() {
            }

            public GetProductCountRequest(final GetProductCountRequest other) {
            }

            public GetProductCountRequest(final org.thryft.protocol.TProtocol iprot) throws java.io.IOException {
                this(iprot, org.thryft.protocol.TType.STRUCT);
            }

            public GetProductCountRequest(final org.thryft.protocol.TProtocol iprot, final byte readAsTType) throws java.io.IOException {
                switch (readAsTType) {
                    case org.thryft.protocol.TType.LIST:
                        iprot.readListBegin();
                        iprot.readListEnd();
                        break;

                    case org.thryft.protocol.TType.STRUCT:
                    default:
                        iprot.readStructBegin();
                        while (true) {
                            final org.thryft.protocol.TField ifield = iprot.readFieldBegin();
                            if (ifield.type == org.thryft.protocol.TType.STOP) {
                                break;
                            }
                            iprot.readFieldEnd();
                        }
                        iprot.readStructEnd();
                        break;
                }
            }

            public static Builder builder() {
                return new Builder();
            }

            @Override
            public int compareTo(final GetProductCountRequest other) {
                if (other == null) {
                    throw new NullPointerException();
                }
                return 0;
            }

            @Override
            public boolean equals(final Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof GetProductCountRequest)) {
                    return false;
                }

                return true;
            }

            public static GetProductCountRequest fake() {
                return fakeBuilder().build();
            }

            public static Builder fakeBuilder() {
                Builder builder = new Builder();
                return builder;
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
                        oprot.writeStructBegin(new org.thryft.protocol.TStruct("GetProductCountRequest"));

                        oprot.writeFieldStop();

                        oprot.writeStructEnd();
                        break;
                }
            }
        }

        @SuppressWarnings({"serial"})
        public final static class GetProductCountResponse implements org.thryft.TBase<GetProductCountResponse> {
            public static class Builder {
                public Builder() {
                }

                public Builder(final GetProductCountResponse other) {
                    this.returnValue = other.getReturnValue();
                }

                protected GetProductCountResponse _build(final int returnValue) {
                    return new GetProductCountResponse(returnValue);
                }

                public GetProductCountResponse build() {
                    return _build(returnValue);
                }

                public Builder setReturnValue(final int returnValue) {
                    this.returnValue = returnValue;
                    return this;
                }

                private Integer returnValue;
            }

            public GetProductCountResponse(final GetProductCountResponse other) {
                this(other.getReturnValue());
            }

            public GetProductCountResponse(final org.thryft.protocol.TProtocol iprot) throws java.io.IOException {
                returnValue = iprot.readI32();
            }

            public GetProductCountResponse(final int returnValue) {
                this.returnValue = returnValue;
            }

            public GetProductCountResponse(final Integer returnValue) {
                this.returnValue = returnValue;
            }

            public static Builder builder() {
                return new Builder();
            }

            @Override
            public int compareTo(final GetProductCountResponse other) {
                if (other == null) {
                    throw new NullPointerException();
                }

                int result;
                result = ((Integer)this.returnValue).compareTo(other.returnValue);
                if (result != 0) {
                    return result;
                }

                return 0;
            }

            @Override
            public boolean equals(final Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof GetProductCountResponse)) {
                    return false;
                }

                final GetProductCountResponse other = (GetProductCountResponse)otherObject;
                return
                    getReturnValue() == other.getReturnValue();
            }

            public static GetProductCountResponse fake() {
                return fakeBuilder().build();
            }

            public static Builder fakeBuilder() {
                Builder builder = new Builder();
                builder.setReturnValue(org.thryft.Faker.randomI32());
                return builder;
            }

            public Object get(final String fieldName) {
                if (fieldName.equals("return_value")) {
                    return getReturnValue();
                }
                throw new IllegalArgumentException(fieldName);
            }

            public final int getReturnValue() {
                return returnValue;
            }

            @Override
            public int hashCode() {
                int hashCode = 17;
                hashCode = 31 * hashCode + ((int)getReturnValue());
                return hashCode;
            }

            public GetProductCountResponse replaceReturnValue(final int returnValue) {
                return new GetProductCountResponse(returnValue);
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
                    case org.thryft.protocol.TType.VOID:
                    case org.thryft.protocol.TType.LIST:
                        oprot.writeListBegin(new org.thryft.protocol.TList(org.thryft.protocol.TType.VOID, 1));

                        oprot.writeI32(getReturnValue());

                        oprot.writeListEnd();
                        break;

                    case org.thryft.protocol.TType.STRUCT:
                    default:
                        oprot.writeStructBegin(new org.thryft.protocol.TStruct("GetProductCountResponse"));

                        oprot.writeFieldBegin(new org.thryft.protocol.TField("return_value", org.thryft.protocol.TType.I32, (short)-1));
                        oprot.writeI32(getReturnValue());
                        oprot.writeFieldEnd();

                        oprot.writeFieldStop();

                        oprot.writeStructEnd();
                        break;
                }
            }

            private final int returnValue;
        }

        @SuppressWarnings({"serial"})
        public final static class GetProductBySkuRequest implements org.thryft.TBase<GetProductBySkuRequest> {
            public static class Builder {
                public Builder() {
                }

                public Builder(final GetProductBySkuRequest other) {
                    this.sku = other.getSku();
                }

                protected GetProductBySkuRequest _build(final String sku) {
                    return new GetProductBySkuRequest(sku);
                }

                public GetProductBySkuRequest build() {
                    return _build(sku);
                }

                public Builder setSku(final String sku) {
                    this.sku = sku;
                    return this;
                }

                private String sku;
            }

            public GetProductBySkuRequest(final GetProductBySkuRequest other) {
                this(other.getSku());
            }

            public GetProductBySkuRequest(final org.thryft.protocol.TProtocol iprot) throws java.io.IOException {
                this(iprot, org.thryft.protocol.TType.STRUCT);
            }

            public GetProductBySkuRequest(final org.thryft.protocol.TProtocol iprot, final byte readAsTType) throws java.io.IOException {
                String sku = null;

                switch (readAsTType) {
                    case org.thryft.protocol.TType.LIST:
                        iprot.readListBegin();
                        sku = iprot.readString();
                        iprot.readListEnd();
                        break;

                    case org.thryft.protocol.TType.STRUCT:
                    default:
                        iprot.readStructBegin();
                        while (true) {
                            final org.thryft.protocol.TField ifield = iprot.readFieldBegin();
                            if (ifield.type == org.thryft.protocol.TType.STOP) {
                                break;
                            } else if (ifield.name.equals("sku")) {
                                sku = iprot.readString();
                            }
                            iprot.readFieldEnd();
                        }
                        iprot.readStructEnd();
                        break;
                }

                this.sku = com.google.common.base.Preconditions.checkNotNull(sku, "com.yogento.api.services.catalog.GetProductBySkuRequest: missing sku");
            }

            public GetProductBySkuRequest(final String sku) {
                this.sku = com.google.common.base.Preconditions.checkNotNull(sku, "com.yogento.api.services.catalog.GetProductBySkuRequest: missing sku");
            }

            public static Builder builder() {
                return new Builder();
            }

            @Override
            public int compareTo(final GetProductBySkuRequest other) {
                if (other == null) {
                    throw new NullPointerException();
                }

                int result;
                result = this.sku.compareTo(other.sku);
                if (result != 0) {
                    return result;
                }

                return 0;
            }

            @Override
            public boolean equals(final Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof GetProductBySkuRequest)) {
                    return false;
                }

                final GetProductBySkuRequest other = (GetProductBySkuRequest)otherObject;
                return
                    getSku().equals(other.getSku());
            }

            public static GetProductBySkuRequest fake() {
                return fakeBuilder().build();
            }

            public static Builder fakeBuilder() {
                Builder builder = new Builder();
                builder.setSku(org.thryft.Faker.Lorem.word());
                return builder;
            }

            public Object get(final String fieldName) {
                if (fieldName.equals("sku")) {
                    return getSku();
                }
                throw new IllegalArgumentException(fieldName);
            }

            public final String getSku() {
                return sku;
            }

            @Override
            public int hashCode() {
                int hashCode = 17;
                hashCode = 31 * hashCode + getSku().hashCode();
                return hashCode;
            }

            public GetProductBySkuRequest replaceSku(final String sku) {
                return new GetProductBySkuRequest(sku);
            }

            @Override
            public String toString() {
                final com.google.common.base.Objects.ToStringHelper helper = com.google.common.base.Objects.toStringHelper(this);
                helper.add("sku", getSku());
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

                        oprot.writeString(getSku());

                        oprot.writeListEnd();
                        break;

                    case org.thryft.protocol.TType.STRUCT:
                    default:
                        oprot.writeStructBegin(new org.thryft.protocol.TStruct("GetProductBySkuRequest"));

                        oprot.writeFieldBegin(new org.thryft.protocol.TField("sku", org.thryft.protocol.TType.STRING, (short)-1));
                        oprot.writeString(getSku());
                        oprot.writeFieldEnd();

                        oprot.writeFieldStop();

                        oprot.writeStructEnd();
                        break;
                }
            }

            private final String sku;
        }

        @SuppressWarnings({"serial"})
        public final static class GetProductBySkuResponse implements org.thryft.TBase<GetProductBySkuResponse> {
            public static class Builder {
                public Builder() {
                }

                public Builder(final GetProductBySkuResponse other) {
                    this.returnValue = other.getReturnValue();
                }

                protected GetProductBySkuResponse _build(final com.yogento.api.models.catalog.product.Product returnValue) {
                    return new GetProductBySkuResponse(returnValue);
                }

                public GetProductBySkuResponse build() {
                    return _build(returnValue);
                }

                public Builder setReturnValue(final com.yogento.api.models.catalog.product.Product returnValue) {
                    this.returnValue = returnValue;
                    return this;
                }

                private com.yogento.api.models.catalog.product.Product returnValue;
            }

            public GetProductBySkuResponse(final GetProductBySkuResponse other) {
                this(other.getReturnValue());
            }

            public GetProductBySkuResponse(final org.thryft.protocol.TProtocol iprot) throws java.io.IOException {
                returnValue = new com.yogento.api.models.catalog.product.Product(iprot);
            }

            public GetProductBySkuResponse(final com.yogento.api.models.catalog.product.Product returnValue) {
                this.returnValue = com.google.common.base.Preconditions.checkNotNull(returnValue, "com.yogento.api.services.catalog.CatalogService.getProductBySku: missing returnValue");
            }

            public static Builder builder() {
                return new Builder();
            }

            @Override
            public int compareTo(final GetProductBySkuResponse other) {
                if (other == null) {
                    throw new NullPointerException();
                }

                int result;
                result = this.returnValue.compareTo(other.returnValue);
                if (result != 0) {
                    return result;
                }

                return 0;
            }

            @Override
            public boolean equals(final Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof GetProductBySkuResponse)) {
                    return false;
                }

                final GetProductBySkuResponse other = (GetProductBySkuResponse)otherObject;
                return
                    getReturnValue().equals(other.getReturnValue());
            }

            public static GetProductBySkuResponse fake() {
                return fakeBuilder().build();
            }

            public static Builder fakeBuilder() {
                Builder builder = new Builder();
                builder.setReturnValue(com.yogento.api.models.catalog.product.Product.fake());
                return builder;
            }

            public Object get(final String fieldName) {
                if (fieldName.equals("return_value")) {
                    return getReturnValue();
                }
                throw new IllegalArgumentException(fieldName);
            }

            public final com.yogento.api.models.catalog.product.Product getReturnValue() {
                return returnValue;
            }

            @Override
            public int hashCode() {
                int hashCode = 17;
                hashCode = 31 * hashCode + getReturnValue().hashCode();
                return hashCode;
            }

            public GetProductBySkuResponse replaceReturnValue(final com.yogento.api.models.catalog.product.Product returnValue) {
                return new GetProductBySkuResponse(returnValue);
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
                        getReturnValue().write(oprot);
                        break;
                    }

                    case org.thryft.protocol.TType.LIST:
                        oprot.writeListBegin(new org.thryft.protocol.TList(org.thryft.protocol.TType.VOID, 1));

                        getReturnValue().write(oprot);

                        oprot.writeListEnd();
                        break;

                    case org.thryft.protocol.TType.STRUCT:
                    default:
                        oprot.writeStructBegin(new org.thryft.protocol.TStruct("GetProductBySkuResponse"));

                        oprot.writeFieldBegin(new org.thryft.protocol.TField("return_value", org.thryft.protocol.TType.STRUCT, (short)-1));
                        getReturnValue().write(oprot);
                        oprot.writeFieldEnd();

                        oprot.writeFieldStop();

                        oprot.writeStructEnd();
                        break;
                }
            }

            private final com.yogento.api.models.catalog.product.Product returnValue;
        }

        @SuppressWarnings({"serial"})
        public final static class GetProductsRequest implements org.thryft.TBase<GetProductsRequest> {
            public static class Builder {
                public Builder() {
                }

                public Builder(final GetProductsRequest other) {
                    this.includeDisabled = other.getIncludeDisabled();
                    this.query = other.getQuery();
                }

                protected GetProductsRequest _build(final com.google.common.base.Optional<Boolean> includeDisabled, final com.google.common.base.Optional<String> query) {
                    return new GetProductsRequest(includeDisabled, query);
                }

                public GetProductsRequest build() {
                    return _build(includeDisabled, query);
                }

                public Builder setIncludeDisabled(final com.google.common.base.Optional<Boolean> includeDisabled) {
                    this.includeDisabled = includeDisabled;
                    return this;
                }

                public Builder setIncludeDisabled(final boolean includeDisabled) {
                    this.includeDisabled = com.google.common.base.Optional.of(includeDisabled);
                    return this;
                }

                public Builder setQuery(final com.google.common.base.Optional<String> query) {
                    this.query = query;
                    return this;
                }

                public Builder setQuery(final String query) {
                    this.query = com.google.common.base.Optional.of(query);
                    return this;
                }

                private com.google.common.base.Optional<Boolean> includeDisabled = com.google.common.base.Optional.absent();
                private com.google.common.base.Optional<String> query = com.google.common.base.Optional.absent();
            }

            public GetProductsRequest() {
                includeDisabled = com.google.common.base.Optional.absent();
                query = com.google.common.base.Optional.absent();
            }

            public GetProductsRequest(final GetProductsRequest other) {
                this(other.getIncludeDisabled(), other.getQuery());
            }

            public GetProductsRequest(final org.thryft.protocol.TProtocol iprot) throws java.io.IOException {
                this(iprot, org.thryft.protocol.TType.STRUCT);
            }

            public GetProductsRequest(final org.thryft.protocol.TProtocol iprot, final byte readAsTType) throws java.io.IOException {
                com.google.common.base.Optional<Boolean> includeDisabled = com.google.common.base.Optional.absent();
                com.google.common.base.Optional<String> query = com.google.common.base.Optional.absent();

                switch (readAsTType) {
                    case org.thryft.protocol.TType.LIST:
                        final org.thryft.protocol.TList __list = iprot.readListBegin();
                        if (__list.size > 0) {
                            includeDisabled = com.google.common.base.Optional.of(iprot.readBool());
                        }
                        if (__list.size > 1) {
                            query = com.google.common.base.Optional.of(iprot.readString());
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
                            } else if (ifield.name.equals("include_disabled")) {
                                includeDisabled = com.google.common.base.Optional.of(iprot.readBool());
                            } else if (ifield.name.equals("query")) {
                                query = com.google.common.base.Optional.of(iprot.readString());
                            }
                            iprot.readFieldEnd();
                        }
                        iprot.readStructEnd();
                        break;
                }

                this.includeDisabled = includeDisabled;
                this.query = query;
            }

            public GetProductsRequest(final com.google.common.base.Optional<Boolean> includeDisabled, final com.google.common.base.Optional<String> query) {
                this.includeDisabled = includeDisabled;
                this.query = com.google.common.base.Preconditions.checkNotNull(query, "com.yogento.api.services.catalog.GetProductsRequest: missing query");
            }

            public static Builder builder() {
                return new Builder();
            }

            @Override
            public int compareTo(final GetProductsRequest other) {
                if (other == null) {
                    throw new NullPointerException();
                }

                int result;
                if (this.includeDisabled.isPresent()) {
                    if (other.includeDisabled.isPresent()) {
                        result = ((Boolean)this.includeDisabled.get()).compareTo(other.includeDisabled.get());
                        if (result != 0) {
                            return result;
                        }
                    } else {
                        return 1;
                    }
                } else if (other.includeDisabled.isPresent()) {
                    return -1;
                }

                if (this.query.isPresent()) {
                    if (other.query.isPresent()) {
                        result = this.query.get().compareTo(other.query.get());
                        if (result != 0) {
                            return result;
                        }
                    } else {
                        return 1;
                    }
                } else if (other.query.isPresent()) {
                    return -1;
                }

                return 0;
            }

            @Override
            public boolean equals(final Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof GetProductsRequest)) {
                    return false;
                }

                final GetProductsRequest other = (GetProductsRequest)otherObject;
                return
                    getIncludeDisabled().equals(other.getIncludeDisabled()) &&
                    getQuery().equals(other.getQuery());
            }

            public static GetProductsRequest fake() {
                return fakeBuilder().build();
            }

            public static Builder fakeBuilder() {
                Builder builder = new Builder();
                builder.setIncludeDisabled(org.thryft.Faker.randomBool());
                builder.setQuery(org.thryft.Faker.Lorem.word());
                return builder;
            }

            public Object get(final String fieldName) {
                if (fieldName.equals("include_disabled")) {
                    return getIncludeDisabled();
                } else if (fieldName.equals("query")) {
                    return getQuery();
                }
                throw new IllegalArgumentException(fieldName);
            }

            public final com.google.common.base.Optional<Boolean> getIncludeDisabled() {
                return includeDisabled;
            }

            public final com.google.common.base.Optional<String> getQuery() {
                return query;
            }

            @Override
            public int hashCode() {
                int hashCode = 17;
                if (getIncludeDisabled().isPresent()) {
                    hashCode = 31 * hashCode + (getIncludeDisabled().get() ? 1 : 0);
                }
                if (getQuery().isPresent()) {
                    hashCode = 31 * hashCode + getQuery().get().hashCode();
                }
                return hashCode;
            }

            public GetProductsRequest replaceIncludeDisabled(final com.google.common.base.Optional<Boolean> includeDisabled) {
                return new GetProductsRequest(includeDisabled, this.query);
            }

            public GetProductsRequest replaceIncludeDisabled(final boolean includeDisabled) {
                return replaceIncludeDisabled(com.google.common.base.Optional.fromNullable(includeDisabled));
            }

            public GetProductsRequest replaceQuery(final com.google.common.base.Optional<String> query) {
                return new GetProductsRequest(this.includeDisabled, query);
            }

            public GetProductsRequest replaceQuery(final String query) {
                return replaceQuery(com.google.common.base.Optional.fromNullable(query));
            }

            @Override
            public String toString() {
                final com.google.common.base.Objects.ToStringHelper helper = com.google.common.base.Objects.toStringHelper(this);
                if (getIncludeDisabled().isPresent()) {
                    helper.add("include_disabled", getIncludeDisabled());
                }
                if (getQuery().isPresent()) {
                    helper.add("query", getQuery());
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
                        oprot.writeListBegin(new org.thryft.protocol.TList(org.thryft.protocol.TType.VOID, 2));

                        if (getIncludeDisabled().isPresent()) {
                            oprot.writeBool(getIncludeDisabled().get());
                        } else {
                            oprot.writeNull();
                        }

                        if (getQuery().isPresent()) {
                            oprot.writeString(getQuery().get());
                        } else {
                            oprot.writeNull();
                        }

                        oprot.writeListEnd();
                        break;

                    case org.thryft.protocol.TType.STRUCT:
                    default:
                        oprot.writeStructBegin(new org.thryft.protocol.TStruct("GetProductsRequest"));

                        if (getIncludeDisabled().isPresent()) {
                            oprot.writeFieldBegin(new org.thryft.protocol.TField("include_disabled", org.thryft.protocol.TType.BOOL, (short)-1));
                            oprot.writeBool(getIncludeDisabled().get());
                            oprot.writeFieldEnd();
                        }

                        if (getQuery().isPresent()) {
                            oprot.writeFieldBegin(new org.thryft.protocol.TField("query", org.thryft.protocol.TType.STRING, (short)-1));
                            oprot.writeString(getQuery().get());
                            oprot.writeFieldEnd();
                        }

                        oprot.writeFieldStop();

                        oprot.writeStructEnd();
                        break;
                }
            }

            private final com.google.common.base.Optional<Boolean> includeDisabled;

            private final com.google.common.base.Optional<String> query;
        }

        @SuppressWarnings({"serial"})
        public final static class GetProductsResponse implements org.thryft.TBase<GetProductsResponse> {
            public static class Builder {
                public Builder() {
                }

                public Builder(final GetProductsResponse other) {
                    this.returnValue = other.getReturnValue();
                }

                protected GetProductsResponse _build(final com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.Product> returnValue) {
                    return new GetProductsResponse(returnValue);
                }

                public GetProductsResponse build() {
                    return _build(returnValue);
                }

                public Builder setReturnValue(final com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.Product> returnValue) {
                    this.returnValue = returnValue;
                    return this;
                }

                private com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.Product> returnValue;
            }

            public GetProductsResponse(final GetProductsResponse other) {
                this(other.getReturnValue());
            }

            public GetProductsResponse(final org.thryft.protocol.TProtocol iprot) throws java.io.IOException {
                returnValue = (new com.google.common.base.Function<org.thryft.protocol.TProtocol, com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.Product>>() {
                    @Override
                    public com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.Product> apply(final org.thryft.protocol.TProtocol iprot) {
                        try {
                            final org.thryft.protocol.TSet sequenceBegin = iprot.readSetBegin();
                            final com.google.common.collect.ImmutableSet.Builder<com.yogento.api.models.catalog.product.Product> sequence = com.google.common.collect.ImmutableSet.builder();
                            for (int elementI = 0; elementI < sequenceBegin.size; elementI++) {
                                sequence.add(new com.yogento.api.models.catalog.product.Product(iprot));
                            }
                            iprot.readSetEnd();
                            return sequence.build();
                        } catch (final java.io.IOException e) {
                            return com.google.common.collect.ImmutableSet.of();
                        }
                    }
                }).apply(iprot);
            }

            public GetProductsResponse(final com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.Product> returnValue) {
                this.returnValue = com.google.common.base.Preconditions.checkNotNull(returnValue, "com.yogento.api.services.catalog.CatalogService.getProducts: missing returnValue");
            }

            public static Builder builder() {
                return new Builder();
            }

            @Override
            public int compareTo(final GetProductsResponse other) {
                if (other == null) {
                    throw new NullPointerException();
                }

                int result;
                result = org.thryft.Comparators.compare(this.returnValue, other.returnValue);
                if (result != 0) {
                    return result;
                }

                return 0;
            }

            @Override
            public boolean equals(final Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof GetProductsResponse)) {
                    return false;
                }

                final GetProductsResponse other = (GetProductsResponse)otherObject;
                return
                    getReturnValue().equals(other.getReturnValue());
            }

            public static GetProductsResponse fake() {
                return fakeBuilder().build();
            }

            public static Builder fakeBuilder() {
                Builder builder = new Builder();
                builder.setReturnValue(com.google.common.collect.ImmutableSet.of(com.yogento.api.models.catalog.product.Product.fake()));
                return builder;
            }

            public Object get(final String fieldName) {
                if (fieldName.equals("return_value")) {
                    return getReturnValue();
                }
                throw new IllegalArgumentException(fieldName);
            }

            public final com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.Product> getReturnValue() {
                return returnValue;
            }

            @Override
            public int hashCode() {
                int hashCode = 17;
                hashCode = 31 * hashCode + getReturnValue().hashCode();
                return hashCode;
            }

            public GetProductsResponse replaceReturnValue(final com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.Product> returnValue) {
                return new GetProductsResponse(returnValue);
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
                        for (final com.yogento.api.models.catalog.product.Product _iter0 : getReturnValue()) {
                            _iter0.write(oprot);
                        }
                        oprot.writeSetEnd();
                        break;
                    }

                    case org.thryft.protocol.TType.LIST:
                        oprot.writeListBegin(new org.thryft.protocol.TList(org.thryft.protocol.TType.VOID, 1));

                        oprot.writeSetBegin(new org.thryft.protocol.TSet(org.thryft.protocol.TType.STRUCT, getReturnValue().size()));
                        for (final com.yogento.api.models.catalog.product.Product _iter0 : getReturnValue()) {
                            _iter0.write(oprot);
                        }
                        oprot.writeSetEnd();

                        oprot.writeListEnd();
                        break;

                    case org.thryft.protocol.TType.STRUCT:
                    default:
                        oprot.writeStructBegin(new org.thryft.protocol.TStruct("GetProductsResponse"));

                        oprot.writeFieldBegin(new org.thryft.protocol.TField("return_value", org.thryft.protocol.TType.SET, (short)-1));
                        oprot.writeSetBegin(new org.thryft.protocol.TSet(org.thryft.protocol.TType.STRUCT, getReturnValue().size()));
                        for (final com.yogento.api.models.catalog.product.Product _iter0 : getReturnValue()) {
                            _iter0.write(oprot);
                        }
                        oprot.writeSetEnd();
                        oprot.writeFieldEnd();

                        oprot.writeFieldStop();

                        oprot.writeStructEnd();
                        break;
                }
            }

            private final com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.Product> returnValue;
        }

        @SuppressWarnings({"serial"})
        public final static class GetProductSkusRequest implements org.thryft.TBase<GetProductSkusRequest> {
            public static class Builder {
                public Builder() {
                }

                public Builder(final GetProductSkusRequest other) {
                }

                protected GetProductSkusRequest _build() {
                    return new GetProductSkusRequest();
                }

                public GetProductSkusRequest build() {
                    return _build();
                }
            }

            public GetProductSkusRequest() {
            }

            public GetProductSkusRequest(final GetProductSkusRequest other) {
            }

            public GetProductSkusRequest(final org.thryft.protocol.TProtocol iprot) throws java.io.IOException {
                this(iprot, org.thryft.protocol.TType.STRUCT);
            }

            public GetProductSkusRequest(final org.thryft.protocol.TProtocol iprot, final byte readAsTType) throws java.io.IOException {
                switch (readAsTType) {
                    case org.thryft.protocol.TType.LIST:
                        iprot.readListBegin();
                        iprot.readListEnd();
                        break;

                    case org.thryft.protocol.TType.STRUCT:
                    default:
                        iprot.readStructBegin();
                        while (true) {
                            final org.thryft.protocol.TField ifield = iprot.readFieldBegin();
                            if (ifield.type == org.thryft.protocol.TType.STOP) {
                                break;
                            }
                            iprot.readFieldEnd();
                        }
                        iprot.readStructEnd();
                        break;
                }
            }

            public static Builder builder() {
                return new Builder();
            }

            @Override
            public int compareTo(final GetProductSkusRequest other) {
                if (other == null) {
                    throw new NullPointerException();
                }
                return 0;
            }

            @Override
            public boolean equals(final Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof GetProductSkusRequest)) {
                    return false;
                }

                return true;
            }

            public static GetProductSkusRequest fake() {
                return fakeBuilder().build();
            }

            public static Builder fakeBuilder() {
                Builder builder = new Builder();
                return builder;
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
                        oprot.writeStructBegin(new org.thryft.protocol.TStruct("GetProductSkusRequest"));

                        oprot.writeFieldStop();

                        oprot.writeStructEnd();
                        break;
                }
            }
        }

        @SuppressWarnings({"serial"})
        public final static class GetProductSkusResponse implements org.thryft.TBase<GetProductSkusResponse> {
            public static class Builder {
                public Builder() {
                }

                public Builder(final GetProductSkusResponse other) {
                    this.returnValue = other.getReturnValue();
                }

                protected GetProductSkusResponse _build(final com.google.common.collect.ImmutableSet<String> returnValue) {
                    return new GetProductSkusResponse(returnValue);
                }

                public GetProductSkusResponse build() {
                    return _build(returnValue);
                }

                public Builder setReturnValue(final com.google.common.collect.ImmutableSet<String> returnValue) {
                    this.returnValue = returnValue;
                    return this;
                }

                private com.google.common.collect.ImmutableSet<String> returnValue;
            }

            public GetProductSkusResponse(final GetProductSkusResponse other) {
                this(other.getReturnValue());
            }

            public GetProductSkusResponse(final org.thryft.protocol.TProtocol iprot) throws java.io.IOException {
                returnValue = (new com.google.common.base.Function<org.thryft.protocol.TProtocol, com.google.common.collect.ImmutableSet<String>>() {
                    @Override
                    public com.google.common.collect.ImmutableSet<String> apply(final org.thryft.protocol.TProtocol iprot) {
                        try {
                            final org.thryft.protocol.TSet sequenceBegin = iprot.readSetBegin();
                            final com.google.common.collect.ImmutableSet.Builder<String> sequence = com.google.common.collect.ImmutableSet.builder();
                            for (int elementI = 0; elementI < sequenceBegin.size; elementI++) {
                                sequence.add(iprot.readString());
                            }
                            iprot.readSetEnd();
                            return sequence.build();
                        } catch (final java.io.IOException e) {
                            return com.google.common.collect.ImmutableSet.of();
                        }
                    }
                }).apply(iprot);
            }

            public GetProductSkusResponse(final com.google.common.collect.ImmutableSet<String> returnValue) {
                this.returnValue = com.google.common.base.Preconditions.checkNotNull(returnValue, "com.yogento.api.services.catalog.CatalogService.getProductSkus: missing returnValue");
            }

            public static Builder builder() {
                return new Builder();
            }

            @Override
            public int compareTo(final GetProductSkusResponse other) {
                if (other == null) {
                    throw new NullPointerException();
                }

                int result;
                result = org.thryft.Comparators.compare(this.returnValue, other.returnValue);
                if (result != 0) {
                    return result;
                }

                return 0;
            }

            @Override
            public boolean equals(final Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof GetProductSkusResponse)) {
                    return false;
                }

                final GetProductSkusResponse other = (GetProductSkusResponse)otherObject;
                return
                    getReturnValue().equals(other.getReturnValue());
            }

            public static GetProductSkusResponse fake() {
                return fakeBuilder().build();
            }

            public static Builder fakeBuilder() {
                Builder builder = new Builder();
                builder.setReturnValue(com.google.common.collect.ImmutableSet.of(org.thryft.Faker.Lorem.word()));
                return builder;
            }

            public Object get(final String fieldName) {
                if (fieldName.equals("return_value")) {
                    return getReturnValue();
                }
                throw new IllegalArgumentException(fieldName);
            }

            public final com.google.common.collect.ImmutableSet<String> getReturnValue() {
                return returnValue;
            }

            @Override
            public int hashCode() {
                int hashCode = 17;
                hashCode = 31 * hashCode + getReturnValue().hashCode();
                return hashCode;
            }

            public GetProductSkusResponse replaceReturnValue(final com.google.common.collect.ImmutableSet<String> returnValue) {
                return new GetProductSkusResponse(returnValue);
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
                        oprot.writeSetBegin(new org.thryft.protocol.TSet(org.thryft.protocol.TType.STRING, getReturnValue().size()));
                        for (final String _iter0 : getReturnValue()) {
                            oprot.writeString(_iter0);
                        }
                        oprot.writeSetEnd();
                        break;
                    }

                    case org.thryft.protocol.TType.LIST:
                        oprot.writeListBegin(new org.thryft.protocol.TList(org.thryft.protocol.TType.VOID, 1));

                        oprot.writeSetBegin(new org.thryft.protocol.TSet(org.thryft.protocol.TType.STRING, getReturnValue().size()));
                        for (final String _iter0 : getReturnValue()) {
                            oprot.writeString(_iter0);
                        }
                        oprot.writeSetEnd();

                        oprot.writeListEnd();
                        break;

                    case org.thryft.protocol.TType.STRUCT:
                    default:
                        oprot.writeStructBegin(new org.thryft.protocol.TStruct("GetProductSkusResponse"));

                        oprot.writeFieldBegin(new org.thryft.protocol.TField("return_value", org.thryft.protocol.TType.SET, (short)-1));
                        oprot.writeSetBegin(new org.thryft.protocol.TSet(org.thryft.protocol.TType.STRING, getReturnValue().size()));
                        for (final String _iter0 : getReturnValue()) {
                            oprot.writeString(_iter0);
                        }
                        oprot.writeSetEnd();
                        oprot.writeFieldEnd();

                        oprot.writeFieldStop();

                        oprot.writeStructEnd();
                        break;
                }
            }

            private final com.google.common.collect.ImmutableSet<String> returnValue;
        }

        @SuppressWarnings({"serial"})
        public final static class GetProductsBySkusRequest implements org.thryft.TBase<GetProductsBySkusRequest> {
            public static class Builder {
                public Builder() {
                }

                public Builder(final GetProductsBySkusRequest other) {
                    this.skus = other.getSkus();
                }

                protected GetProductsBySkusRequest _build(final com.google.common.collect.ImmutableSet<String> skus) {
                    return new GetProductsBySkusRequest(skus);
                }

                public GetProductsBySkusRequest build() {
                    return _build(skus);
                }

                public Builder setSkus(final com.google.common.collect.ImmutableSet<String> skus) {
                    this.skus = skus;
                    return this;
                }

                private com.google.common.collect.ImmutableSet<String> skus;
            }

            public GetProductsBySkusRequest(final GetProductsBySkusRequest other) {
                this(other.getSkus());
            }

            public GetProductsBySkusRequest(final org.thryft.protocol.TProtocol iprot) throws java.io.IOException {
                this(iprot, org.thryft.protocol.TType.STRUCT);
            }

            public GetProductsBySkusRequest(final org.thryft.protocol.TProtocol iprot, final byte readAsTType) throws java.io.IOException {
                com.google.common.collect.ImmutableSet<String> skus = null;

                switch (readAsTType) {
                    case org.thryft.protocol.TType.LIST:
                        iprot.readListBegin();
                        skus = (new com.google.common.base.Function<org.thryft.protocol.TProtocol, com.google.common.collect.ImmutableSet<String>>() {
                            @Override
                            public com.google.common.collect.ImmutableSet<String> apply(final org.thryft.protocol.TProtocol iprot) {
                                try {
                                    final org.thryft.protocol.TSet sequenceBegin = iprot.readSetBegin();
                                    final com.google.common.collect.ImmutableSet.Builder<String> sequence = com.google.common.collect.ImmutableSet.builder();
                                    for (int elementI = 0; elementI < sequenceBegin.size; elementI++) {
                                        sequence.add(iprot.readString());
                                    }
                                    iprot.readSetEnd();
                                    return sequence.build();
                                } catch (final java.io.IOException e) {
                                    return com.google.common.collect.ImmutableSet.of();
                                }
                            }
                        }).apply(iprot);
                        iprot.readListEnd();
                        break;

                    case org.thryft.protocol.TType.STRUCT:
                    default:
                        iprot.readStructBegin();
                        while (true) {
                            final org.thryft.protocol.TField ifield = iprot.readFieldBegin();
                            if (ifield.type == org.thryft.protocol.TType.STOP) {
                                break;
                            } else if (ifield.name.equals("skus")) {
                                skus = (new com.google.common.base.Function<org.thryft.protocol.TProtocol, com.google.common.collect.ImmutableSet<String>>() {
                                    @Override
                                    public com.google.common.collect.ImmutableSet<String> apply(final org.thryft.protocol.TProtocol iprot) {
                                        try {
                                            final org.thryft.protocol.TSet sequenceBegin = iprot.readSetBegin();
                                            final com.google.common.collect.ImmutableSet.Builder<String> sequence = com.google.common.collect.ImmutableSet.builder();
                                            for (int elementI = 0; elementI < sequenceBegin.size; elementI++) {
                                                sequence.add(iprot.readString());
                                            }
                                            iprot.readSetEnd();
                                            return sequence.build();
                                        } catch (final java.io.IOException e) {
                                            return com.google.common.collect.ImmutableSet.of();
                                        }
                                    }
                                }).apply(iprot);
                            }
                            iprot.readFieldEnd();
                        }
                        iprot.readStructEnd();
                        break;
                }

                this.skus = com.google.common.base.Preconditions.checkNotNull(skus, "com.yogento.api.services.catalog.GetProductsBySkusRequest: missing skus");
            }

            public GetProductsBySkusRequest(final com.google.common.collect.ImmutableSet<String> skus) {
                this.skus = com.google.common.base.Preconditions.checkNotNull(skus, "com.yogento.api.services.catalog.GetProductsBySkusRequest: missing skus");
            }

            public static Builder builder() {
                return new Builder();
            }

            @Override
            public int compareTo(final GetProductsBySkusRequest other) {
                if (other == null) {
                    throw new NullPointerException();
                }

                int result;
                result = org.thryft.Comparators.compare(this.skus, other.skus);
                if (result != 0) {
                    return result;
                }

                return 0;
            }

            @Override
            public boolean equals(final Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof GetProductsBySkusRequest)) {
                    return false;
                }

                final GetProductsBySkusRequest other = (GetProductsBySkusRequest)otherObject;
                return
                    getSkus().equals(other.getSkus());
            }

            public static GetProductsBySkusRequest fake() {
                return fakeBuilder().build();
            }

            public static Builder fakeBuilder() {
                Builder builder = new Builder();
                builder.setSkus(com.google.common.collect.ImmutableSet.of(org.thryft.Faker.Lorem.word()));
                return builder;
            }

            public Object get(final String fieldName) {
                if (fieldName.equals("skus")) {
                    return getSkus();
                }
                throw new IllegalArgumentException(fieldName);
            }

            public final com.google.common.collect.ImmutableSet<String> getSkus() {
                return skus;
            }

            @Override
            public int hashCode() {
                int hashCode = 17;
                hashCode = 31 * hashCode + getSkus().hashCode();
                return hashCode;
            }

            public GetProductsBySkusRequest replaceSkus(final com.google.common.collect.ImmutableSet<String> skus) {
                return new GetProductsBySkusRequest(skus);
            }

            @Override
            public String toString() {
                final com.google.common.base.Objects.ToStringHelper helper = com.google.common.base.Objects.toStringHelper(this);
                helper.add("skus", getSkus());
                return helper.toString();
            }

            @Override
            public void write(final org.thryft.protocol.TProtocol oprot) throws java.io.IOException {
                write(oprot, org.thryft.protocol.TType.STRUCT);
            }

            public void write(final org.thryft.protocol.TProtocol oprot, final byte writeAsTType) throws java.io.IOException {
                switch (writeAsTType) {
                    case org.thryft.protocol.TType.VOID: {
                        oprot.writeSetBegin(new org.thryft.protocol.TSet(org.thryft.protocol.TType.STRING, getSkus().size()));
                        for (final String _iter0 : getSkus()) {
                            oprot.writeString(_iter0);
                        }
                        oprot.writeSetEnd();
                        break;
                    }

                    case org.thryft.protocol.TType.LIST:
                        oprot.writeListBegin(new org.thryft.protocol.TList(org.thryft.protocol.TType.VOID, 1));

                        oprot.writeSetBegin(new org.thryft.protocol.TSet(org.thryft.protocol.TType.STRING, getSkus().size()));
                        for (final String _iter0 : getSkus()) {
                            oprot.writeString(_iter0);
                        }
                        oprot.writeSetEnd();

                        oprot.writeListEnd();
                        break;

                    case org.thryft.protocol.TType.STRUCT:
                    default:
                        oprot.writeStructBegin(new org.thryft.protocol.TStruct("GetProductsBySkusRequest"));

                        oprot.writeFieldBegin(new org.thryft.protocol.TField("skus", org.thryft.protocol.TType.SET, (short)-1));
                        oprot.writeSetBegin(new org.thryft.protocol.TSet(org.thryft.protocol.TType.STRING, getSkus().size()));
                        for (final String _iter0 : getSkus()) {
                            oprot.writeString(_iter0);
                        }
                        oprot.writeSetEnd();
                        oprot.writeFieldEnd();

                        oprot.writeFieldStop();

                        oprot.writeStructEnd();
                        break;
                }
            }

            private final com.google.common.collect.ImmutableSet<String> skus;
        }

        @SuppressWarnings({"serial"})
        public final static class GetProductsBySkusResponse implements org.thryft.TBase<GetProductsBySkusResponse> {
            public static class Builder {
                public Builder() {
                }

                public Builder(final GetProductsBySkusResponse other) {
                    this.returnValue = other.getReturnValue();
                }

                protected GetProductsBySkusResponse _build(final com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.Product> returnValue) {
                    return new GetProductsBySkusResponse(returnValue);
                }

                public GetProductsBySkusResponse build() {
                    return _build(returnValue);
                }

                public Builder setReturnValue(final com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.Product> returnValue) {
                    this.returnValue = returnValue;
                    return this;
                }

                private com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.Product> returnValue;
            }

            public GetProductsBySkusResponse(final GetProductsBySkusResponse other) {
                this(other.getReturnValue());
            }

            public GetProductsBySkusResponse(final org.thryft.protocol.TProtocol iprot) throws java.io.IOException {
                returnValue = (new com.google.common.base.Function<org.thryft.protocol.TProtocol, com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.Product>>() {
                    @Override
                    public com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.Product> apply(final org.thryft.protocol.TProtocol iprot) {
                        try {
                            final org.thryft.protocol.TSet sequenceBegin = iprot.readSetBegin();
                            final com.google.common.collect.ImmutableSet.Builder<com.yogento.api.models.catalog.product.Product> sequence = com.google.common.collect.ImmutableSet.builder();
                            for (int elementI = 0; elementI < sequenceBegin.size; elementI++) {
                                sequence.add(new com.yogento.api.models.catalog.product.Product(iprot));
                            }
                            iprot.readSetEnd();
                            return sequence.build();
                        } catch (final java.io.IOException e) {
                            return com.google.common.collect.ImmutableSet.of();
                        }
                    }
                }).apply(iprot);
            }

            public GetProductsBySkusResponse(final com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.Product> returnValue) {
                this.returnValue = com.google.common.base.Preconditions.checkNotNull(returnValue, "com.yogento.api.services.catalog.CatalogService.getProductsBySkus: missing returnValue");
            }

            public static Builder builder() {
                return new Builder();
            }

            @Override
            public int compareTo(final GetProductsBySkusResponse other) {
                if (other == null) {
                    throw new NullPointerException();
                }

                int result;
                result = org.thryft.Comparators.compare(this.returnValue, other.returnValue);
                if (result != 0) {
                    return result;
                }

                return 0;
            }

            @Override
            public boolean equals(final Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof GetProductsBySkusResponse)) {
                    return false;
                }

                final GetProductsBySkusResponse other = (GetProductsBySkusResponse)otherObject;
                return
                    getReturnValue().equals(other.getReturnValue());
            }

            public static GetProductsBySkusResponse fake() {
                return fakeBuilder().build();
            }

            public static Builder fakeBuilder() {
                Builder builder = new Builder();
                builder.setReturnValue(com.google.common.collect.ImmutableSet.of(com.yogento.api.models.catalog.product.Product.fake()));
                return builder;
            }

            public Object get(final String fieldName) {
                if (fieldName.equals("return_value")) {
                    return getReturnValue();
                }
                throw new IllegalArgumentException(fieldName);
            }

            public final com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.Product> getReturnValue() {
                return returnValue;
            }

            @Override
            public int hashCode() {
                int hashCode = 17;
                hashCode = 31 * hashCode + getReturnValue().hashCode();
                return hashCode;
            }

            public GetProductsBySkusResponse replaceReturnValue(final com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.Product> returnValue) {
                return new GetProductsBySkusResponse(returnValue);
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
                        for (final com.yogento.api.models.catalog.product.Product _iter0 : getReturnValue()) {
                            _iter0.write(oprot);
                        }
                        oprot.writeSetEnd();
                        break;
                    }

                    case org.thryft.protocol.TType.LIST:
                        oprot.writeListBegin(new org.thryft.protocol.TList(org.thryft.protocol.TType.VOID, 1));

                        oprot.writeSetBegin(new org.thryft.protocol.TSet(org.thryft.protocol.TType.STRUCT, getReturnValue().size()));
                        for (final com.yogento.api.models.catalog.product.Product _iter0 : getReturnValue()) {
                            _iter0.write(oprot);
                        }
                        oprot.writeSetEnd();

                        oprot.writeListEnd();
                        break;

                    case org.thryft.protocol.TType.STRUCT:
                    default:
                        oprot.writeStructBegin(new org.thryft.protocol.TStruct("GetProductsBySkusResponse"));

                        oprot.writeFieldBegin(new org.thryft.protocol.TField("return_value", org.thryft.protocol.TType.SET, (short)-1));
                        oprot.writeSetBegin(new org.thryft.protocol.TSet(org.thryft.protocol.TType.STRUCT, getReturnValue().size()));
                        for (final com.yogento.api.models.catalog.product.Product _iter0 : getReturnValue()) {
                            _iter0.write(oprot);
                        }
                        oprot.writeSetEnd();
                        oprot.writeFieldEnd();

                        oprot.writeFieldStop();

                        oprot.writeStructEnd();
                        break;
                }
            }

            private final com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.Product> returnValue;
        }

        @SuppressWarnings({"serial"})
        public final static class GetProductThumbnailUrlRequest implements org.thryft.TBase<GetProductThumbnailUrlRequest> {
            public static class Builder {
                public Builder() {
                }

                public Builder(final GetProductThumbnailUrlRequest other) {
                    this.sku = other.getSku();
                    this.thumbnailHeightPx = other.getThumbnailHeightPx();
                    this.thumbnailWidthPx = other.getThumbnailWidthPx();
                }

                protected GetProductThumbnailUrlRequest _build(final String sku, final int thumbnailHeightPx, final int thumbnailWidthPx) {
                    return new GetProductThumbnailUrlRequest(sku, thumbnailHeightPx, thumbnailWidthPx);
                }

                public GetProductThumbnailUrlRequest build() {
                    return _build(sku, thumbnailHeightPx, thumbnailWidthPx);
                }

                public Builder setSku(final String sku) {
                    this.sku = sku;
                    return this;
                }

                public Builder setThumbnailHeightPx(final int thumbnailHeightPx) {
                    this.thumbnailHeightPx = thumbnailHeightPx;
                    return this;
                }

                public Builder setThumbnailWidthPx(final int thumbnailWidthPx) {
                    this.thumbnailWidthPx = thumbnailWidthPx;
                    return this;
                }

                private String sku;
                private Integer thumbnailHeightPx;
                private Integer thumbnailWidthPx;
            }

            public GetProductThumbnailUrlRequest(final GetProductThumbnailUrlRequest other) {
                this(other.getSku(), other.getThumbnailHeightPx(), other.getThumbnailWidthPx());
            }

            public GetProductThumbnailUrlRequest(final org.thryft.protocol.TProtocol iprot) throws java.io.IOException {
                this(iprot, org.thryft.protocol.TType.STRUCT);
            }

            public GetProductThumbnailUrlRequest(final org.thryft.protocol.TProtocol iprot, final byte readAsTType) throws java.io.IOException {
                String sku = null;
                int thumbnailHeightPx = 0;
                int thumbnailWidthPx = 0;

                switch (readAsTType) {
                    case org.thryft.protocol.TType.LIST:
                        iprot.readListBegin();
                        sku = iprot.readString();
                        thumbnailHeightPx = iprot.readI32();
                        thumbnailWidthPx = iprot.readI32();
                        iprot.readListEnd();
                        break;

                    case org.thryft.protocol.TType.STRUCT:
                    default:
                        iprot.readStructBegin();
                        while (true) {
                            final org.thryft.protocol.TField ifield = iprot.readFieldBegin();
                            if (ifield.type == org.thryft.protocol.TType.STOP) {
                                break;
                            } else if (ifield.name.equals("sku")) {
                                sku = iprot.readString();
                            } else if (ifield.name.equals("thumbnail_height_px")) {
                                thumbnailHeightPx = iprot.readI32();
                            } else if (ifield.name.equals("thumbnail_width_px")) {
                                thumbnailWidthPx = iprot.readI32();
                            }
                            iprot.readFieldEnd();
                        }
                        iprot.readStructEnd();
                        break;
                }

                this.sku = com.google.common.base.Preconditions.checkNotNull(sku, "com.yogento.api.services.catalog.GetProductThumbnailUrlRequest: missing sku");
                this.thumbnailHeightPx = thumbnailHeightPx;
                this.thumbnailWidthPx = thumbnailWidthPx;
            }

            public GetProductThumbnailUrlRequest(final String sku, final int thumbnailHeightPx, final int thumbnailWidthPx) {
                this.sku = com.google.common.base.Preconditions.checkNotNull(sku, "com.yogento.api.services.catalog.GetProductThumbnailUrlRequest: missing sku");
                this.thumbnailHeightPx = thumbnailHeightPx;
                this.thumbnailWidthPx = thumbnailWidthPx;
            }

            public GetProductThumbnailUrlRequest(final String sku, final Integer thumbnailHeightPx, final Integer thumbnailWidthPx) {
                this.sku = com.google.common.base.Preconditions.checkNotNull(sku, "com.yogento.api.services.catalog.GetProductThumbnailUrlRequest: missing sku");
                this.thumbnailHeightPx = thumbnailHeightPx;
                this.thumbnailWidthPx = thumbnailWidthPx;
            }

            public static Builder builder() {
                return new Builder();
            }

            @Override
            public int compareTo(final GetProductThumbnailUrlRequest other) {
                if (other == null) {
                    throw new NullPointerException();
                }

                int result;
                result = this.sku.compareTo(other.sku);
                if (result != 0) {
                    return result;
                }

                result = ((Integer)this.thumbnailHeightPx).compareTo(other.thumbnailHeightPx);
                if (result != 0) {
                    return result;
                }

                result = ((Integer)this.thumbnailWidthPx).compareTo(other.thumbnailWidthPx);
                if (result != 0) {
                    return result;
                }

                return 0;
            }

            @Override
            public boolean equals(final Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof GetProductThumbnailUrlRequest)) {
                    return false;
                }

                final GetProductThumbnailUrlRequest other = (GetProductThumbnailUrlRequest)otherObject;
                return
                    getSku().equals(other.getSku()) &&
                    getThumbnailHeightPx() == other.getThumbnailHeightPx() &&
                    getThumbnailWidthPx() == other.getThumbnailWidthPx();
            }

            public static GetProductThumbnailUrlRequest fake() {
                return fakeBuilder().build();
            }

            public static Builder fakeBuilder() {
                Builder builder = new Builder();
                builder.setSku(org.thryft.Faker.Lorem.word());
                builder.setThumbnailHeightPx(org.thryft.Faker.randomI32());
                builder.setThumbnailWidthPx(org.thryft.Faker.randomI32());
                return builder;
            }

            public Object get(final String fieldName) {
                if (fieldName.equals("sku")) {
                    return getSku();
                } else if (fieldName.equals("thumbnail_height_px")) {
                    return getThumbnailHeightPx();
                } else if (fieldName.equals("thumbnail_width_px")) {
                    return getThumbnailWidthPx();
                }
                throw new IllegalArgumentException(fieldName);
            }

            public final String getSku() {
                return sku;
            }

            public final int getThumbnailHeightPx() {
                return thumbnailHeightPx;
            }

            public final int getThumbnailWidthPx() {
                return thumbnailWidthPx;
            }

            @Override
            public int hashCode() {
                int hashCode = 17;
                hashCode = 31 * hashCode + getSku().hashCode();
                hashCode = 31 * hashCode + ((int)getThumbnailHeightPx());
                hashCode = 31 * hashCode + ((int)getThumbnailWidthPx());
                return hashCode;
            }

            public GetProductThumbnailUrlRequest replaceSku(final String sku) {
                return new GetProductThumbnailUrlRequest(sku, this.thumbnailHeightPx, this.thumbnailWidthPx);
            }

            public GetProductThumbnailUrlRequest replaceThumbnailHeightPx(final int thumbnailHeightPx) {
                return new GetProductThumbnailUrlRequest(this.sku, thumbnailHeightPx, this.thumbnailWidthPx);
            }

            public GetProductThumbnailUrlRequest replaceThumbnailWidthPx(final int thumbnailWidthPx) {
                return new GetProductThumbnailUrlRequest(this.sku, this.thumbnailHeightPx, thumbnailWidthPx);
            }

            @Override
            public String toString() {
                final com.google.common.base.Objects.ToStringHelper helper = com.google.common.base.Objects.toStringHelper(this);
                helper.add("sku", getSku());
                helper.add("thumbnail_height_px", getThumbnailHeightPx());
                helper.add("thumbnail_width_px", getThumbnailWidthPx());
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

                        oprot.writeString(getSku());

                        oprot.writeI32(getThumbnailHeightPx());

                        oprot.writeI32(getThumbnailWidthPx());

                        oprot.writeListEnd();
                        break;

                    case org.thryft.protocol.TType.STRUCT:
                    default:
                        oprot.writeStructBegin(new org.thryft.protocol.TStruct("GetProductThumbnailUrlRequest"));

                        oprot.writeFieldBegin(new org.thryft.protocol.TField("sku", org.thryft.protocol.TType.STRING, (short)-1));
                        oprot.writeString(getSku());
                        oprot.writeFieldEnd();

                        oprot.writeFieldBegin(new org.thryft.protocol.TField("thumbnail_height_px", org.thryft.protocol.TType.I32, (short)-1));
                        oprot.writeI32(getThumbnailHeightPx());
                        oprot.writeFieldEnd();

                        oprot.writeFieldBegin(new org.thryft.protocol.TField("thumbnail_width_px", org.thryft.protocol.TType.I32, (short)-1));
                        oprot.writeI32(getThumbnailWidthPx());
                        oprot.writeFieldEnd();

                        oprot.writeFieldStop();

                        oprot.writeStructEnd();
                        break;
                }
            }

            private final String sku;

            private final int thumbnailHeightPx;

            private final int thumbnailWidthPx;
        }

        @SuppressWarnings({"serial"})
        public final static class GetProductThumbnailUrlResponse implements org.thryft.TBase<GetProductThumbnailUrlResponse> {
            public static class Builder {
                public Builder() {
                }

                public Builder(final GetProductThumbnailUrlResponse other) {
                    this.returnValue = other.getReturnValue();
                }

                protected GetProductThumbnailUrlResponse _build(final org.thryft.native_.Url returnValue) {
                    return new GetProductThumbnailUrlResponse(returnValue);
                }

                public GetProductThumbnailUrlResponse build() {
                    return _build(returnValue);
                }

                public Builder setReturnValue(final org.thryft.native_.Url returnValue) {
                    this.returnValue = returnValue;
                    return this;
                }

                private org.thryft.native_.Url returnValue;
            }

            public GetProductThumbnailUrlResponse(final GetProductThumbnailUrlResponse other) {
                this(other.getReturnValue());
            }

            public GetProductThumbnailUrlResponse(final org.thryft.protocol.TProtocol iprot) throws java.io.IOException {
                try {
                    returnValue = iprot.readUrl();
                } catch (java.net.MalformedURLException e) {
                     throw new IllegalArgumentException(e);
                }
            }

            public GetProductThumbnailUrlResponse(final org.thryft.native_.Url returnValue) {
                this.returnValue = com.google.common.base.Preconditions.checkNotNull(returnValue, "com.yogento.api.services.catalog.CatalogService.getProductThumbnailUrl: missing returnValue");
            }

            public static Builder builder() {
                return new Builder();
            }

            @Override
            public int compareTo(final GetProductThumbnailUrlResponse other) {
                if (other == null) {
                    throw new NullPointerException();
                }

                int result;
                result = this.returnValue.compareTo(other.returnValue);
                if (result != 0) {
                    return result;
                }

                return 0;
            }

            @Override
            public boolean equals(final Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof GetProductThumbnailUrlResponse)) {
                    return false;
                }

                final GetProductThumbnailUrlResponse other = (GetProductThumbnailUrlResponse)otherObject;
                return
                    getReturnValue().equals(other.getReturnValue());
            }

            public static GetProductThumbnailUrlResponse fake() {
                return fakeBuilder().build();
            }

            public static Builder fakeBuilder() {
                Builder builder = new Builder();
                builder.setReturnValue(org.thryft.Faker.Internet.url());
                return builder;
            }

            public Object get(final String fieldName) {
                if (fieldName.equals("return_value")) {
                    return getReturnValue();
                }
                throw new IllegalArgumentException(fieldName);
            }

            public final org.thryft.native_.Url getReturnValue() {
                return returnValue;
            }

            @Override
            public int hashCode() {
                int hashCode = 17;
                hashCode = 31 * hashCode + getReturnValue().hashCode();
                return hashCode;
            }

            public GetProductThumbnailUrlResponse replaceReturnValue(final org.thryft.native_.Url returnValue) {
                return new GetProductThumbnailUrlResponse(returnValue);
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
                        oprot.writeUrl(getReturnValue());
                        break;
                    }

                    case org.thryft.protocol.TType.LIST:
                        oprot.writeListBegin(new org.thryft.protocol.TList(org.thryft.protocol.TType.VOID, 1));

                        oprot.writeUrl(getReturnValue());

                        oprot.writeListEnd();
                        break;

                    case org.thryft.protocol.TType.STRUCT:
                    default:
                        oprot.writeStructBegin(new org.thryft.protocol.TStruct("GetProductThumbnailUrlResponse"));

                        oprot.writeFieldBegin(new org.thryft.protocol.TField("return_value", org.thryft.protocol.TType.STRUCT, (short)-1));
                        oprot.writeUrl(getReturnValue());
                        oprot.writeFieldEnd();

                        oprot.writeFieldStop();

                        oprot.writeStructEnd();
                        break;
                }
            }

            private final org.thryft.native_.Url returnValue;
        }

        @SuppressWarnings({"serial"})
        public final static class GetSampleProductThumbnailUrlRequest implements org.thryft.TBase<GetSampleProductThumbnailUrlRequest> {
            public static class Builder {
                public Builder() {
                }

                public Builder(final GetSampleProductThumbnailUrlRequest other) {
                    this.sku = other.getSku();
                    this.thumbnailHeightPx = other.getThumbnailHeightPx();
                    this.thumbnailWidthPx = other.getThumbnailWidthPx();
                }

                protected GetSampleProductThumbnailUrlRequest _build(final String sku, final int thumbnailHeightPx, final int thumbnailWidthPx) {
                    return new GetSampleProductThumbnailUrlRequest(sku, thumbnailHeightPx, thumbnailWidthPx);
                }

                public GetSampleProductThumbnailUrlRequest build() {
                    return _build(sku, thumbnailHeightPx, thumbnailWidthPx);
                }

                public Builder setSku(final String sku) {
                    this.sku = sku;
                    return this;
                }

                public Builder setThumbnailHeightPx(final int thumbnailHeightPx) {
                    this.thumbnailHeightPx = thumbnailHeightPx;
                    return this;
                }

                public Builder setThumbnailWidthPx(final int thumbnailWidthPx) {
                    this.thumbnailWidthPx = thumbnailWidthPx;
                    return this;
                }

                private String sku;
                private Integer thumbnailHeightPx;
                private Integer thumbnailWidthPx;
            }

            public GetSampleProductThumbnailUrlRequest(final GetSampleProductThumbnailUrlRequest other) {
                this(other.getSku(), other.getThumbnailHeightPx(), other.getThumbnailWidthPx());
            }

            public GetSampleProductThumbnailUrlRequest(final org.thryft.protocol.TProtocol iprot) throws java.io.IOException {
                this(iprot, org.thryft.protocol.TType.STRUCT);
            }

            public GetSampleProductThumbnailUrlRequest(final org.thryft.protocol.TProtocol iprot, final byte readAsTType) throws java.io.IOException {
                String sku = null;
                int thumbnailHeightPx = 0;
                int thumbnailWidthPx = 0;

                switch (readAsTType) {
                    case org.thryft.protocol.TType.LIST:
                        iprot.readListBegin();
                        sku = iprot.readString();
                        thumbnailHeightPx = iprot.readI32();
                        thumbnailWidthPx = iprot.readI32();
                        iprot.readListEnd();
                        break;

                    case org.thryft.protocol.TType.STRUCT:
                    default:
                        iprot.readStructBegin();
                        while (true) {
                            final org.thryft.protocol.TField ifield = iprot.readFieldBegin();
                            if (ifield.type == org.thryft.protocol.TType.STOP) {
                                break;
                            } else if (ifield.name.equals("sku")) {
                                sku = iprot.readString();
                            } else if (ifield.name.equals("thumbnail_height_px")) {
                                thumbnailHeightPx = iprot.readI32();
                            } else if (ifield.name.equals("thumbnail_width_px")) {
                                thumbnailWidthPx = iprot.readI32();
                            }
                            iprot.readFieldEnd();
                        }
                        iprot.readStructEnd();
                        break;
                }

                this.sku = com.google.common.base.Preconditions.checkNotNull(sku, "com.yogento.api.services.catalog.GetSampleProductThumbnailUrlRequest: missing sku");
                this.thumbnailHeightPx = thumbnailHeightPx;
                this.thumbnailWidthPx = thumbnailWidthPx;
            }

            public GetSampleProductThumbnailUrlRequest(final String sku, final int thumbnailHeightPx, final int thumbnailWidthPx) {
                this.sku = com.google.common.base.Preconditions.checkNotNull(sku, "com.yogento.api.services.catalog.GetSampleProductThumbnailUrlRequest: missing sku");
                this.thumbnailHeightPx = thumbnailHeightPx;
                this.thumbnailWidthPx = thumbnailWidthPx;
            }

            public GetSampleProductThumbnailUrlRequest(final String sku, final Integer thumbnailHeightPx, final Integer thumbnailWidthPx) {
                this.sku = com.google.common.base.Preconditions.checkNotNull(sku, "com.yogento.api.services.catalog.GetSampleProductThumbnailUrlRequest: missing sku");
                this.thumbnailHeightPx = thumbnailHeightPx;
                this.thumbnailWidthPx = thumbnailWidthPx;
            }

            public static Builder builder() {
                return new Builder();
            }

            @Override
            public int compareTo(final GetSampleProductThumbnailUrlRequest other) {
                if (other == null) {
                    throw new NullPointerException();
                }

                int result;
                result = this.sku.compareTo(other.sku);
                if (result != 0) {
                    return result;
                }

                result = ((Integer)this.thumbnailHeightPx).compareTo(other.thumbnailHeightPx);
                if (result != 0) {
                    return result;
                }

                result = ((Integer)this.thumbnailWidthPx).compareTo(other.thumbnailWidthPx);
                if (result != 0) {
                    return result;
                }

                return 0;
            }

            @Override
            public boolean equals(final Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof GetSampleProductThumbnailUrlRequest)) {
                    return false;
                }

                final GetSampleProductThumbnailUrlRequest other = (GetSampleProductThumbnailUrlRequest)otherObject;
                return
                    getSku().equals(other.getSku()) &&
                    getThumbnailHeightPx() == other.getThumbnailHeightPx() &&
                    getThumbnailWidthPx() == other.getThumbnailWidthPx();
            }

            public static GetSampleProductThumbnailUrlRequest fake() {
                return fakeBuilder().build();
            }

            public static Builder fakeBuilder() {
                Builder builder = new Builder();
                builder.setSku(org.thryft.Faker.Lorem.word());
                builder.setThumbnailHeightPx(org.thryft.Faker.randomI32());
                builder.setThumbnailWidthPx(org.thryft.Faker.randomI32());
                return builder;
            }

            public Object get(final String fieldName) {
                if (fieldName.equals("sku")) {
                    return getSku();
                } else if (fieldName.equals("thumbnail_height_px")) {
                    return getThumbnailHeightPx();
                } else if (fieldName.equals("thumbnail_width_px")) {
                    return getThumbnailWidthPx();
                }
                throw new IllegalArgumentException(fieldName);
            }

            public final String getSku() {
                return sku;
            }

            public final int getThumbnailHeightPx() {
                return thumbnailHeightPx;
            }

            public final int getThumbnailWidthPx() {
                return thumbnailWidthPx;
            }

            @Override
            public int hashCode() {
                int hashCode = 17;
                hashCode = 31 * hashCode + getSku().hashCode();
                hashCode = 31 * hashCode + ((int)getThumbnailHeightPx());
                hashCode = 31 * hashCode + ((int)getThumbnailWidthPx());
                return hashCode;
            }

            public GetSampleProductThumbnailUrlRequest replaceSku(final String sku) {
                return new GetSampleProductThumbnailUrlRequest(sku, this.thumbnailHeightPx, this.thumbnailWidthPx);
            }

            public GetSampleProductThumbnailUrlRequest replaceThumbnailHeightPx(final int thumbnailHeightPx) {
                return new GetSampleProductThumbnailUrlRequest(this.sku, thumbnailHeightPx, this.thumbnailWidthPx);
            }

            public GetSampleProductThumbnailUrlRequest replaceThumbnailWidthPx(final int thumbnailWidthPx) {
                return new GetSampleProductThumbnailUrlRequest(this.sku, this.thumbnailHeightPx, thumbnailWidthPx);
            }

            @Override
            public String toString() {
                final com.google.common.base.Objects.ToStringHelper helper = com.google.common.base.Objects.toStringHelper(this);
                helper.add("sku", getSku());
                helper.add("thumbnail_height_px", getThumbnailHeightPx());
                helper.add("thumbnail_width_px", getThumbnailWidthPx());
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

                        oprot.writeString(getSku());

                        oprot.writeI32(getThumbnailHeightPx());

                        oprot.writeI32(getThumbnailWidthPx());

                        oprot.writeListEnd();
                        break;

                    case org.thryft.protocol.TType.STRUCT:
                    default:
                        oprot.writeStructBegin(new org.thryft.protocol.TStruct("GetSampleProductThumbnailUrlRequest"));

                        oprot.writeFieldBegin(new org.thryft.protocol.TField("sku", org.thryft.protocol.TType.STRING, (short)-1));
                        oprot.writeString(getSku());
                        oprot.writeFieldEnd();

                        oprot.writeFieldBegin(new org.thryft.protocol.TField("thumbnail_height_px", org.thryft.protocol.TType.I32, (short)-1));
                        oprot.writeI32(getThumbnailHeightPx());
                        oprot.writeFieldEnd();

                        oprot.writeFieldBegin(new org.thryft.protocol.TField("thumbnail_width_px", org.thryft.protocol.TType.I32, (short)-1));
                        oprot.writeI32(getThumbnailWidthPx());
                        oprot.writeFieldEnd();

                        oprot.writeFieldStop();

                        oprot.writeStructEnd();
                        break;
                }
            }

            private final String sku;

            private final int thumbnailHeightPx;

            private final int thumbnailWidthPx;
        }

        @SuppressWarnings({"serial"})
        public final static class GetSampleProductThumbnailUrlResponse implements org.thryft.TBase<GetSampleProductThumbnailUrlResponse> {
            public static class Builder {
                public Builder() {
                }

                public Builder(final GetSampleProductThumbnailUrlResponse other) {
                    this.returnValue = other.getReturnValue();
                }

                protected GetSampleProductThumbnailUrlResponse _build(final org.thryft.native_.Url returnValue) {
                    return new GetSampleProductThumbnailUrlResponse(returnValue);
                }

                public GetSampleProductThumbnailUrlResponse build() {
                    return _build(returnValue);
                }

                public Builder setReturnValue(final org.thryft.native_.Url returnValue) {
                    this.returnValue = returnValue;
                    return this;
                }

                private org.thryft.native_.Url returnValue;
            }

            public GetSampleProductThumbnailUrlResponse(final GetSampleProductThumbnailUrlResponse other) {
                this(other.getReturnValue());
            }

            public GetSampleProductThumbnailUrlResponse(final org.thryft.protocol.TProtocol iprot) throws java.io.IOException {
                try {
                    returnValue = iprot.readUrl();
                } catch (java.net.MalformedURLException e) {
                     throw new IllegalArgumentException(e);
                }
            }

            public GetSampleProductThumbnailUrlResponse(final org.thryft.native_.Url returnValue) {
                this.returnValue = com.google.common.base.Preconditions.checkNotNull(returnValue, "com.yogento.api.services.catalog.CatalogService.getSampleProductThumbnailUrl: missing returnValue");
            }

            public static Builder builder() {
                return new Builder();
            }

            @Override
            public int compareTo(final GetSampleProductThumbnailUrlResponse other) {
                if (other == null) {
                    throw new NullPointerException();
                }

                int result;
                result = this.returnValue.compareTo(other.returnValue);
                if (result != 0) {
                    return result;
                }

                return 0;
            }

            @Override
            public boolean equals(final Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof GetSampleProductThumbnailUrlResponse)) {
                    return false;
                }

                final GetSampleProductThumbnailUrlResponse other = (GetSampleProductThumbnailUrlResponse)otherObject;
                return
                    getReturnValue().equals(other.getReturnValue());
            }

            public static GetSampleProductThumbnailUrlResponse fake() {
                return fakeBuilder().build();
            }

            public static Builder fakeBuilder() {
                Builder builder = new Builder();
                builder.setReturnValue(org.thryft.Faker.Internet.url());
                return builder;
            }

            public Object get(final String fieldName) {
                if (fieldName.equals("return_value")) {
                    return getReturnValue();
                }
                throw new IllegalArgumentException(fieldName);
            }

            public final org.thryft.native_.Url getReturnValue() {
                return returnValue;
            }

            @Override
            public int hashCode() {
                int hashCode = 17;
                hashCode = 31 * hashCode + getReturnValue().hashCode();
                return hashCode;
            }

            public GetSampleProductThumbnailUrlResponse replaceReturnValue(final org.thryft.native_.Url returnValue) {
                return new GetSampleProductThumbnailUrlResponse(returnValue);
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
                        oprot.writeUrl(getReturnValue());
                        break;
                    }

                    case org.thryft.protocol.TType.LIST:
                        oprot.writeListBegin(new org.thryft.protocol.TList(org.thryft.protocol.TType.VOID, 1));

                        oprot.writeUrl(getReturnValue());

                        oprot.writeListEnd();
                        break;

                    case org.thryft.protocol.TType.STRUCT:
                    default:
                        oprot.writeStructBegin(new org.thryft.protocol.TStruct("GetSampleProductThumbnailUrlResponse"));

                        oprot.writeFieldBegin(new org.thryft.protocol.TField("return_value", org.thryft.protocol.TType.STRUCT, (short)-1));
                        oprot.writeUrl(getReturnValue());
                        oprot.writeFieldEnd();

                        oprot.writeFieldStop();

                        oprot.writeStructEnd();
                        break;
                }
            }

            private final org.thryft.native_.Url returnValue;
        }

        @SuppressWarnings({"serial"})
        public final static class GetSampleProductBySkuRequest implements org.thryft.TBase<GetSampleProductBySkuRequest> {
            public static class Builder {
                public Builder() {
                }

                public Builder(final GetSampleProductBySkuRequest other) {
                    this.sku = other.getSku();
                }

                protected GetSampleProductBySkuRequest _build(final String sku) {
                    return new GetSampleProductBySkuRequest(sku);
                }

                public GetSampleProductBySkuRequest build() {
                    return _build(sku);
                }

                public Builder setSku(final String sku) {
                    this.sku = sku;
                    return this;
                }

                private String sku;
            }

            public GetSampleProductBySkuRequest(final GetSampleProductBySkuRequest other) {
                this(other.getSku());
            }

            public GetSampleProductBySkuRequest(final org.thryft.protocol.TProtocol iprot) throws java.io.IOException {
                this(iprot, org.thryft.protocol.TType.STRUCT);
            }

            public GetSampleProductBySkuRequest(final org.thryft.protocol.TProtocol iprot, final byte readAsTType) throws java.io.IOException {
                String sku = null;

                switch (readAsTType) {
                    case org.thryft.protocol.TType.LIST:
                        iprot.readListBegin();
                        sku = iprot.readString();
                        iprot.readListEnd();
                        break;

                    case org.thryft.protocol.TType.STRUCT:
                    default:
                        iprot.readStructBegin();
                        while (true) {
                            final org.thryft.protocol.TField ifield = iprot.readFieldBegin();
                            if (ifield.type == org.thryft.protocol.TType.STOP) {
                                break;
                            } else if (ifield.name.equals("sku")) {
                                sku = iprot.readString();
                            }
                            iprot.readFieldEnd();
                        }
                        iprot.readStructEnd();
                        break;
                }

                this.sku = com.google.common.base.Preconditions.checkNotNull(sku, "com.yogento.api.services.catalog.GetSampleProductBySkuRequest: missing sku");
            }

            public GetSampleProductBySkuRequest(final String sku) {
                this.sku = com.google.common.base.Preconditions.checkNotNull(sku, "com.yogento.api.services.catalog.GetSampleProductBySkuRequest: missing sku");
            }

            public static Builder builder() {
                return new Builder();
            }

            @Override
            public int compareTo(final GetSampleProductBySkuRequest other) {
                if (other == null) {
                    throw new NullPointerException();
                }

                int result;
                result = this.sku.compareTo(other.sku);
                if (result != 0) {
                    return result;
                }

                return 0;
            }

            @Override
            public boolean equals(final Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof GetSampleProductBySkuRequest)) {
                    return false;
                }

                final GetSampleProductBySkuRequest other = (GetSampleProductBySkuRequest)otherObject;
                return
                    getSku().equals(other.getSku());
            }

            public static GetSampleProductBySkuRequest fake() {
                return fakeBuilder().build();
            }

            public static Builder fakeBuilder() {
                Builder builder = new Builder();
                builder.setSku(org.thryft.Faker.Lorem.word());
                return builder;
            }

            public Object get(final String fieldName) {
                if (fieldName.equals("sku")) {
                    return getSku();
                }
                throw new IllegalArgumentException(fieldName);
            }

            public final String getSku() {
                return sku;
            }

            @Override
            public int hashCode() {
                int hashCode = 17;
                hashCode = 31 * hashCode + getSku().hashCode();
                return hashCode;
            }

            public GetSampleProductBySkuRequest replaceSku(final String sku) {
                return new GetSampleProductBySkuRequest(sku);
            }

            @Override
            public String toString() {
                final com.google.common.base.Objects.ToStringHelper helper = com.google.common.base.Objects.toStringHelper(this);
                helper.add("sku", getSku());
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

                        oprot.writeString(getSku());

                        oprot.writeListEnd();
                        break;

                    case org.thryft.protocol.TType.STRUCT:
                    default:
                        oprot.writeStructBegin(new org.thryft.protocol.TStruct("GetSampleProductBySkuRequest"));

                        oprot.writeFieldBegin(new org.thryft.protocol.TField("sku", org.thryft.protocol.TType.STRING, (short)-1));
                        oprot.writeString(getSku());
                        oprot.writeFieldEnd();

                        oprot.writeFieldStop();

                        oprot.writeStructEnd();
                        break;
                }
            }

            private final String sku;
        }

        @SuppressWarnings({"serial"})
        public final static class GetSampleProductBySkuResponse implements org.thryft.TBase<GetSampleProductBySkuResponse> {
            public static class Builder {
                public Builder() {
                }

                public Builder(final GetSampleProductBySkuResponse other) {
                    this.returnValue = other.getReturnValue();
                }

                protected GetSampleProductBySkuResponse _build(final com.yogento.api.models.catalog.product.Product returnValue) {
                    return new GetSampleProductBySkuResponse(returnValue);
                }

                public GetSampleProductBySkuResponse build() {
                    return _build(returnValue);
                }

                public Builder setReturnValue(final com.yogento.api.models.catalog.product.Product returnValue) {
                    this.returnValue = returnValue;
                    return this;
                }

                private com.yogento.api.models.catalog.product.Product returnValue;
            }

            public GetSampleProductBySkuResponse(final GetSampleProductBySkuResponse other) {
                this(other.getReturnValue());
            }

            public GetSampleProductBySkuResponse(final org.thryft.protocol.TProtocol iprot) throws java.io.IOException {
                returnValue = new com.yogento.api.models.catalog.product.Product(iprot);
            }

            public GetSampleProductBySkuResponse(final com.yogento.api.models.catalog.product.Product returnValue) {
                this.returnValue = com.google.common.base.Preconditions.checkNotNull(returnValue, "com.yogento.api.services.catalog.CatalogService.getSampleProductBySku: missing returnValue");
            }

            public static Builder builder() {
                return new Builder();
            }

            @Override
            public int compareTo(final GetSampleProductBySkuResponse other) {
                if (other == null) {
                    throw new NullPointerException();
                }

                int result;
                result = this.returnValue.compareTo(other.returnValue);
                if (result != 0) {
                    return result;
                }

                return 0;
            }

            @Override
            public boolean equals(final Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof GetSampleProductBySkuResponse)) {
                    return false;
                }

                final GetSampleProductBySkuResponse other = (GetSampleProductBySkuResponse)otherObject;
                return
                    getReturnValue().equals(other.getReturnValue());
            }

            public static GetSampleProductBySkuResponse fake() {
                return fakeBuilder().build();
            }

            public static Builder fakeBuilder() {
                Builder builder = new Builder();
                builder.setReturnValue(com.yogento.api.models.catalog.product.Product.fake());
                return builder;
            }

            public Object get(final String fieldName) {
                if (fieldName.equals("return_value")) {
                    return getReturnValue();
                }
                throw new IllegalArgumentException(fieldName);
            }

            public final com.yogento.api.models.catalog.product.Product getReturnValue() {
                return returnValue;
            }

            @Override
            public int hashCode() {
                int hashCode = 17;
                hashCode = 31 * hashCode + getReturnValue().hashCode();
                return hashCode;
            }

            public GetSampleProductBySkuResponse replaceReturnValue(final com.yogento.api.models.catalog.product.Product returnValue) {
                return new GetSampleProductBySkuResponse(returnValue);
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
                        getReturnValue().write(oprot);
                        break;
                    }

                    case org.thryft.protocol.TType.LIST:
                        oprot.writeListBegin(new org.thryft.protocol.TList(org.thryft.protocol.TType.VOID, 1));

                        getReturnValue().write(oprot);

                        oprot.writeListEnd();
                        break;

                    case org.thryft.protocol.TType.STRUCT:
                    default:
                        oprot.writeStructBegin(new org.thryft.protocol.TStruct("GetSampleProductBySkuResponse"));

                        oprot.writeFieldBegin(new org.thryft.protocol.TField("return_value", org.thryft.protocol.TType.STRUCT, (short)-1));
                        getReturnValue().write(oprot);
                        oprot.writeFieldEnd();

                        oprot.writeFieldStop();

                        oprot.writeStructEnd();
                        break;
                }
            }

            private final com.yogento.api.models.catalog.product.Product returnValue;
        }

        @SuppressWarnings({"serial"})
        public final static class GetSampleProductsRequest implements org.thryft.TBase<GetSampleProductsRequest> {
            public static class Builder {
                public Builder() {
                }

                public Builder(final GetSampleProductsRequest other) {
                }

                protected GetSampleProductsRequest _build() {
                    return new GetSampleProductsRequest();
                }

                public GetSampleProductsRequest build() {
                    return _build();
                }
            }

            public GetSampleProductsRequest() {
            }

            public GetSampleProductsRequest(final GetSampleProductsRequest other) {
            }

            public GetSampleProductsRequest(final org.thryft.protocol.TProtocol iprot) throws java.io.IOException {
                this(iprot, org.thryft.protocol.TType.STRUCT);
            }

            public GetSampleProductsRequest(final org.thryft.protocol.TProtocol iprot, final byte readAsTType) throws java.io.IOException {
                switch (readAsTType) {
                    case org.thryft.protocol.TType.LIST:
                        iprot.readListBegin();
                        iprot.readListEnd();
                        break;

                    case org.thryft.protocol.TType.STRUCT:
                    default:
                        iprot.readStructBegin();
                        while (true) {
                            final org.thryft.protocol.TField ifield = iprot.readFieldBegin();
                            if (ifield.type == org.thryft.protocol.TType.STOP) {
                                break;
                            }
                            iprot.readFieldEnd();
                        }
                        iprot.readStructEnd();
                        break;
                }
            }

            public static Builder builder() {
                return new Builder();
            }

            @Override
            public int compareTo(final GetSampleProductsRequest other) {
                if (other == null) {
                    throw new NullPointerException();
                }
                return 0;
            }

            @Override
            public boolean equals(final Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof GetSampleProductsRequest)) {
                    return false;
                }

                return true;
            }

            public static GetSampleProductsRequest fake() {
                return fakeBuilder().build();
            }

            public static Builder fakeBuilder() {
                Builder builder = new Builder();
                return builder;
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
                        oprot.writeStructBegin(new org.thryft.protocol.TStruct("GetSampleProductsRequest"));

                        oprot.writeFieldStop();

                        oprot.writeStructEnd();
                        break;
                }
            }
        }

        @SuppressWarnings({"serial"})
        public final static class GetSampleProductsResponse implements org.thryft.TBase<GetSampleProductsResponse> {
            public static class Builder {
                public Builder() {
                }

                public Builder(final GetSampleProductsResponse other) {
                    this.returnValue = other.getReturnValue();
                }

                protected GetSampleProductsResponse _build(final com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.Product> returnValue) {
                    return new GetSampleProductsResponse(returnValue);
                }

                public GetSampleProductsResponse build() {
                    return _build(returnValue);
                }

                public Builder setReturnValue(final com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.Product> returnValue) {
                    this.returnValue = returnValue;
                    return this;
                }

                private com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.Product> returnValue;
            }

            public GetSampleProductsResponse(final GetSampleProductsResponse other) {
                this(other.getReturnValue());
            }

            public GetSampleProductsResponse(final org.thryft.protocol.TProtocol iprot) throws java.io.IOException {
                returnValue = (new com.google.common.base.Function<org.thryft.protocol.TProtocol, com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.Product>>() {
                    @Override
                    public com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.Product> apply(final org.thryft.protocol.TProtocol iprot) {
                        try {
                            final org.thryft.protocol.TSet sequenceBegin = iprot.readSetBegin();
                            final com.google.common.collect.ImmutableSet.Builder<com.yogento.api.models.catalog.product.Product> sequence = com.google.common.collect.ImmutableSet.builder();
                            for (int elementI = 0; elementI < sequenceBegin.size; elementI++) {
                                sequence.add(new com.yogento.api.models.catalog.product.Product(iprot));
                            }
                            iprot.readSetEnd();
                            return sequence.build();
                        } catch (final java.io.IOException e) {
                            return com.google.common.collect.ImmutableSet.of();
                        }
                    }
                }).apply(iprot);
            }

            public GetSampleProductsResponse(final com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.Product> returnValue) {
                this.returnValue = com.google.common.base.Preconditions.checkNotNull(returnValue, "com.yogento.api.services.catalog.CatalogService.getSampleProducts: missing returnValue");
            }

            public static Builder builder() {
                return new Builder();
            }

            @Override
            public int compareTo(final GetSampleProductsResponse other) {
                if (other == null) {
                    throw new NullPointerException();
                }

                int result;
                result = org.thryft.Comparators.compare(this.returnValue, other.returnValue);
                if (result != 0) {
                    return result;
                }

                return 0;
            }

            @Override
            public boolean equals(final Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof GetSampleProductsResponse)) {
                    return false;
                }

                final GetSampleProductsResponse other = (GetSampleProductsResponse)otherObject;
                return
                    getReturnValue().equals(other.getReturnValue());
            }

            public static GetSampleProductsResponse fake() {
                return fakeBuilder().build();
            }

            public static Builder fakeBuilder() {
                Builder builder = new Builder();
                builder.setReturnValue(com.google.common.collect.ImmutableSet.of(com.yogento.api.models.catalog.product.Product.fake()));
                return builder;
            }

            public Object get(final String fieldName) {
                if (fieldName.equals("return_value")) {
                    return getReturnValue();
                }
                throw new IllegalArgumentException(fieldName);
            }

            public final com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.Product> getReturnValue() {
                return returnValue;
            }

            @Override
            public int hashCode() {
                int hashCode = 17;
                hashCode = 31 * hashCode + getReturnValue().hashCode();
                return hashCode;
            }

            public GetSampleProductsResponse replaceReturnValue(final com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.Product> returnValue) {
                return new GetSampleProductsResponse(returnValue);
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
                        for (final com.yogento.api.models.catalog.product.Product _iter0 : getReturnValue()) {
                            _iter0.write(oprot);
                        }
                        oprot.writeSetEnd();
                        break;
                    }

                    case org.thryft.protocol.TType.LIST:
                        oprot.writeListBegin(new org.thryft.protocol.TList(org.thryft.protocol.TType.VOID, 1));

                        oprot.writeSetBegin(new org.thryft.protocol.TSet(org.thryft.protocol.TType.STRUCT, getReturnValue().size()));
                        for (final com.yogento.api.models.catalog.product.Product _iter0 : getReturnValue()) {
                            _iter0.write(oprot);
                        }
                        oprot.writeSetEnd();

                        oprot.writeListEnd();
                        break;

                    case org.thryft.protocol.TType.STRUCT:
                    default:
                        oprot.writeStructBegin(new org.thryft.protocol.TStruct("GetSampleProductsResponse"));

                        oprot.writeFieldBegin(new org.thryft.protocol.TField("return_value", org.thryft.protocol.TType.SET, (short)-1));
                        oprot.writeSetBegin(new org.thryft.protocol.TSet(org.thryft.protocol.TType.STRUCT, getReturnValue().size()));
                        for (final com.yogento.api.models.catalog.product.Product _iter0 : getReturnValue()) {
                            _iter0.write(oprot);
                        }
                        oprot.writeSetEnd();
                        oprot.writeFieldEnd();

                        oprot.writeFieldStop();

                        oprot.writeStructEnd();
                        break;
                }
            }

            private final com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.Product> returnValue;
        }

        @SuppressWarnings({"serial"})
        public final static class HeadProductBySkuRequest implements org.thryft.TBase<HeadProductBySkuRequest> {
            public static class Builder {
                public Builder() {
                }

                public Builder(final HeadProductBySkuRequest other) {
                    this.sku = other.getSku();
                }

                protected HeadProductBySkuRequest _build(final String sku) {
                    return new HeadProductBySkuRequest(sku);
                }

                public HeadProductBySkuRequest build() {
                    return _build(sku);
                }

                public Builder setSku(final String sku) {
                    this.sku = sku;
                    return this;
                }

                private String sku;
            }

            public HeadProductBySkuRequest(final HeadProductBySkuRequest other) {
                this(other.getSku());
            }

            public HeadProductBySkuRequest(final org.thryft.protocol.TProtocol iprot) throws java.io.IOException {
                this(iprot, org.thryft.protocol.TType.STRUCT);
            }

            public HeadProductBySkuRequest(final org.thryft.protocol.TProtocol iprot, final byte readAsTType) throws java.io.IOException {
                String sku = null;

                switch (readAsTType) {
                    case org.thryft.protocol.TType.LIST:
                        iprot.readListBegin();
                        sku = iprot.readString();
                        iprot.readListEnd();
                        break;

                    case org.thryft.protocol.TType.STRUCT:
                    default:
                        iprot.readStructBegin();
                        while (true) {
                            final org.thryft.protocol.TField ifield = iprot.readFieldBegin();
                            if (ifield.type == org.thryft.protocol.TType.STOP) {
                                break;
                            } else if (ifield.name.equals("sku")) {
                                sku = iprot.readString();
                            }
                            iprot.readFieldEnd();
                        }
                        iprot.readStructEnd();
                        break;
                }

                this.sku = com.google.common.base.Preconditions.checkNotNull(sku, "com.yogento.api.services.catalog.HeadProductBySkuRequest: missing sku");
            }

            public HeadProductBySkuRequest(final String sku) {
                this.sku = com.google.common.base.Preconditions.checkNotNull(sku, "com.yogento.api.services.catalog.HeadProductBySkuRequest: missing sku");
            }

            public static Builder builder() {
                return new Builder();
            }

            @Override
            public int compareTo(final HeadProductBySkuRequest other) {
                if (other == null) {
                    throw new NullPointerException();
                }

                int result;
                result = this.sku.compareTo(other.sku);
                if (result != 0) {
                    return result;
                }

                return 0;
            }

            @Override
            public boolean equals(final Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof HeadProductBySkuRequest)) {
                    return false;
                }

                final HeadProductBySkuRequest other = (HeadProductBySkuRequest)otherObject;
                return
                    getSku().equals(other.getSku());
            }

            public static HeadProductBySkuRequest fake() {
                return fakeBuilder().build();
            }

            public static Builder fakeBuilder() {
                Builder builder = new Builder();
                builder.setSku(org.thryft.Faker.Lorem.word());
                return builder;
            }

            public Object get(final String fieldName) {
                if (fieldName.equals("sku")) {
                    return getSku();
                }
                throw new IllegalArgumentException(fieldName);
            }

            public final String getSku() {
                return sku;
            }

            @Override
            public int hashCode() {
                int hashCode = 17;
                hashCode = 31 * hashCode + getSku().hashCode();
                return hashCode;
            }

            public HeadProductBySkuRequest replaceSku(final String sku) {
                return new HeadProductBySkuRequest(sku);
            }

            @Override
            public String toString() {
                final com.google.common.base.Objects.ToStringHelper helper = com.google.common.base.Objects.toStringHelper(this);
                helper.add("sku", getSku());
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

                        oprot.writeString(getSku());

                        oprot.writeListEnd();
                        break;

                    case org.thryft.protocol.TType.STRUCT:
                    default:
                        oprot.writeStructBegin(new org.thryft.protocol.TStruct("HeadProductBySkuRequest"));

                        oprot.writeFieldBegin(new org.thryft.protocol.TField("sku", org.thryft.protocol.TType.STRING, (short)-1));
                        oprot.writeString(getSku());
                        oprot.writeFieldEnd();

                        oprot.writeFieldStop();

                        oprot.writeStructEnd();
                        break;
                }
            }

            private final String sku;
        }

        @SuppressWarnings({"serial"})
        public final static class HeadProductBySkuResponse implements org.thryft.TBase<HeadProductBySkuResponse> {
            public static class Builder {
                public Builder() {
                }

                public Builder(final HeadProductBySkuResponse other) {
                    this.returnValue = other.isReturnValue();
                }

                protected HeadProductBySkuResponse _build(final boolean returnValue) {
                    return new HeadProductBySkuResponse(returnValue);
                }

                public HeadProductBySkuResponse build() {
                    return _build(returnValue);
                }

                public Builder setReturnValue(final boolean returnValue) {
                    this.returnValue = returnValue;
                    return this;
                }

                private Boolean returnValue;
            }

            public HeadProductBySkuResponse(final HeadProductBySkuResponse other) {
                this(other.isReturnValue());
            }

            public HeadProductBySkuResponse(final org.thryft.protocol.TProtocol iprot) throws java.io.IOException {
                returnValue = iprot.readBool();
            }

            public HeadProductBySkuResponse(final boolean returnValue) {
                this.returnValue = returnValue;
            }

            public HeadProductBySkuResponse(final Boolean returnValue) {
                this.returnValue = returnValue;
            }

            public static Builder builder() {
                return new Builder();
            }

            @Override
            public int compareTo(final HeadProductBySkuResponse other) {
                if (other == null) {
                    throw new NullPointerException();
                }

                int result;
                result = ((Boolean)this.returnValue).compareTo(other.returnValue);
                if (result != 0) {
                    return result;
                }

                return 0;
            }

            @Override
            public boolean equals(final Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof HeadProductBySkuResponse)) {
                    return false;
                }

                final HeadProductBySkuResponse other = (HeadProductBySkuResponse)otherObject;
                return
                    isReturnValue() == other.isReturnValue();
            }

            public static HeadProductBySkuResponse fake() {
                return fakeBuilder().build();
            }

            public static Builder fakeBuilder() {
                Builder builder = new Builder();
                builder.setReturnValue(org.thryft.Faker.randomBool());
                return builder;
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

            public HeadProductBySkuResponse replaceReturnValue(final boolean returnValue) {
                return new HeadProductBySkuResponse(returnValue);
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
                        oprot.writeStructBegin(new org.thryft.protocol.TStruct("HeadProductBySkuResponse"));

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
        public final static class PutProductRequest implements org.thryft.TBase<PutProductRequest> {
            public static class Builder {
                public Builder() {
                }

                public Builder(final PutProductRequest other) {
                    this.product = other.getProduct();
                }

                protected PutProductRequest _build(final com.yogento.api.models.catalog.product.Product product) {
                    return new PutProductRequest(product);
                }

                public PutProductRequest build() {
                    return _build(product);
                }

                public Builder setProduct(final com.yogento.api.models.catalog.product.Product product) {
                    this.product = product;
                    return this;
                }

                private com.yogento.api.models.catalog.product.Product product;
            }

            public PutProductRequest(final PutProductRequest other) {
                this(other.getProduct());
            }

            public PutProductRequest(final org.thryft.protocol.TProtocol iprot) throws java.io.IOException {
                this(iprot, org.thryft.protocol.TType.STRUCT);
            }

            public PutProductRequest(final org.thryft.protocol.TProtocol iprot, final byte readAsTType) throws java.io.IOException {
                com.yogento.api.models.catalog.product.Product product = null;

                switch (readAsTType) {
                    case org.thryft.protocol.TType.LIST:
                        iprot.readListBegin();
                        product = new com.yogento.api.models.catalog.product.Product(iprot);
                        iprot.readListEnd();
                        break;

                    case org.thryft.protocol.TType.STRUCT:
                    default:
                        iprot.readStructBegin();
                        while (true) {
                            final org.thryft.protocol.TField ifield = iprot.readFieldBegin();
                            if (ifield.type == org.thryft.protocol.TType.STOP) {
                                break;
                            } else if (ifield.name.equals("product")) {
                                product = new com.yogento.api.models.catalog.product.Product(iprot);
                            }
                            iprot.readFieldEnd();
                        }
                        iprot.readStructEnd();
                        break;
                }

                this.product = com.google.common.base.Preconditions.checkNotNull(product, "com.yogento.api.services.catalog.PutProductRequest: missing product");
            }

            public PutProductRequest(final com.yogento.api.models.catalog.product.Product product) {
                this.product = com.google.common.base.Preconditions.checkNotNull(product, "com.yogento.api.services.catalog.PutProductRequest: missing product");
            }

            public static Builder builder() {
                return new Builder();
            }

            @Override
            public int compareTo(final PutProductRequest other) {
                if (other == null) {
                    throw new NullPointerException();
                }

                int result;
                result = this.product.compareTo(other.product);
                if (result != 0) {
                    return result;
                }

                return 0;
            }

            @Override
            public boolean equals(final Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof PutProductRequest)) {
                    return false;
                }

                final PutProductRequest other = (PutProductRequest)otherObject;
                return
                    getProduct().equals(other.getProduct());
            }

            public static PutProductRequest fake() {
                return fakeBuilder().build();
            }

            public static Builder fakeBuilder() {
                Builder builder = new Builder();
                builder.setProduct(com.yogento.api.models.catalog.product.Product.fake());
                return builder;
            }

            public Object get(final String fieldName) {
                if (fieldName.equals("product")) {
                    return getProduct();
                }
                throw new IllegalArgumentException(fieldName);
            }

            public final com.yogento.api.models.catalog.product.Product getProduct() {
                return product;
            }

            @Override
            public int hashCode() {
                int hashCode = 17;
                hashCode = 31 * hashCode + getProduct().hashCode();
                return hashCode;
            }

            public PutProductRequest replaceProduct(final com.yogento.api.models.catalog.product.Product product) {
                return new PutProductRequest(product);
            }

            @Override
            public String toString() {
                final com.google.common.base.Objects.ToStringHelper helper = com.google.common.base.Objects.toStringHelper(this);
                helper.add("product", getProduct());
                return helper.toString();
            }

            @Override
            public void write(final org.thryft.protocol.TProtocol oprot) throws java.io.IOException {
                write(oprot, org.thryft.protocol.TType.STRUCT);
            }

            public void write(final org.thryft.protocol.TProtocol oprot, final byte writeAsTType) throws java.io.IOException {
                switch (writeAsTType) {
                    case org.thryft.protocol.TType.VOID: {
                        getProduct().write(oprot);
                        break;
                    }

                    case org.thryft.protocol.TType.LIST:
                        oprot.writeListBegin(new org.thryft.protocol.TList(org.thryft.protocol.TType.VOID, 1));

                        getProduct().write(oprot);

                        oprot.writeListEnd();
                        break;

                    case org.thryft.protocol.TType.STRUCT:
                    default:
                        oprot.writeStructBegin(new org.thryft.protocol.TStruct("PutProductRequest"));

                        oprot.writeFieldBegin(new org.thryft.protocol.TField("product", org.thryft.protocol.TType.STRUCT, (short)-1));
                        getProduct().write(oprot);
                        oprot.writeFieldEnd();

                        oprot.writeFieldStop();

                        oprot.writeStructEnd();
                        break;
                }
            }

            private final com.yogento.api.models.catalog.product.Product product;
        }

        @SuppressWarnings({"serial"})
        public final static class PutProductResponse implements org.thryft.TBase<PutProductResponse> {
            public static class Builder {
                public Builder() {
                }

                public Builder(final PutProductResponse other) {
                }

                protected PutProductResponse _build() {
                    return new PutProductResponse();
                }

                public PutProductResponse build() {
                    return _build();
                }
            }

            public PutProductResponse() {
            }

            public PutProductResponse(final PutProductResponse other) {
            }

            public PutProductResponse(final org.thryft.protocol.TProtocol iprot) throws java.io.IOException {
            }

            public static Builder builder() {
                return new Builder();
            }

            @Override
            public int compareTo(final PutProductResponse other) {
                if (other == null) {
                    throw new NullPointerException();
                }
                return 0;
            }

            @Override
            public boolean equals(final Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof PutProductResponse)) {
                    return false;
                }

                return true;
            }

            public static PutProductResponse fake() {
                return fakeBuilder().build();
            }

            public static Builder fakeBuilder() {
                Builder builder = new Builder();
                return builder;
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
                        oprot.writeStructBegin(new org.thryft.protocol.TStruct("PutProductResponse"));

                        oprot.writeFieldStop();

                        oprot.writeStructEnd();
                        break;
                }
            }
        }

        @SuppressWarnings({"serial"})
        public final static class PutProductsRequest implements org.thryft.TBase<PutProductsRequest> {
            public static class Builder {
                public Builder() {
                }

                public Builder(final PutProductsRequest other) {
                    this.products = other.getProducts();
                }

                protected PutProductsRequest _build(final com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.Product> products) {
                    return new PutProductsRequest(products);
                }

                public PutProductsRequest build() {
                    return _build(products);
                }

                public Builder setProducts(final com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.Product> products) {
                    this.products = products;
                    return this;
                }

                private com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.Product> products;
            }

            public PutProductsRequest(final PutProductsRequest other) {
                this(other.getProducts());
            }

            public PutProductsRequest(final org.thryft.protocol.TProtocol iprot) throws java.io.IOException {
                this(iprot, org.thryft.protocol.TType.STRUCT);
            }

            public PutProductsRequest(final org.thryft.protocol.TProtocol iprot, final byte readAsTType) throws java.io.IOException {
                com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.Product> products = null;

                switch (readAsTType) {
                    case org.thryft.protocol.TType.LIST:
                        iprot.readListBegin();
                        products = (new com.google.common.base.Function<org.thryft.protocol.TProtocol, com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.Product>>() {
                            @Override
                            public com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.Product> apply(final org.thryft.protocol.TProtocol iprot) {
                                try {
                                    final org.thryft.protocol.TSet sequenceBegin = iprot.readSetBegin();
                                    final com.google.common.collect.ImmutableSet.Builder<com.yogento.api.models.catalog.product.Product> sequence = com.google.common.collect.ImmutableSet.builder();
                                    for (int elementI = 0; elementI < sequenceBegin.size; elementI++) {
                                        sequence.add(new com.yogento.api.models.catalog.product.Product(iprot));
                                    }
                                    iprot.readSetEnd();
                                    return sequence.build();
                                } catch (final java.io.IOException e) {
                                    return com.google.common.collect.ImmutableSet.of();
                                }
                            }
                        }).apply(iprot);
                        iprot.readListEnd();
                        break;

                    case org.thryft.protocol.TType.STRUCT:
                    default:
                        iprot.readStructBegin();
                        while (true) {
                            final org.thryft.protocol.TField ifield = iprot.readFieldBegin();
                            if (ifield.type == org.thryft.protocol.TType.STOP) {
                                break;
                            } else if (ifield.name.equals("products")) {
                                products = (new com.google.common.base.Function<org.thryft.protocol.TProtocol, com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.Product>>() {
                                    @Override
                                    public com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.Product> apply(final org.thryft.protocol.TProtocol iprot) {
                                        try {
                                            final org.thryft.protocol.TSet sequenceBegin = iprot.readSetBegin();
                                            final com.google.common.collect.ImmutableSet.Builder<com.yogento.api.models.catalog.product.Product> sequence = com.google.common.collect.ImmutableSet.builder();
                                            for (int elementI = 0; elementI < sequenceBegin.size; elementI++) {
                                                sequence.add(new com.yogento.api.models.catalog.product.Product(iprot));
                                            }
                                            iprot.readSetEnd();
                                            return sequence.build();
                                        } catch (final java.io.IOException e) {
                                            return com.google.common.collect.ImmutableSet.of();
                                        }
                                    }
                                }).apply(iprot);
                            }
                            iprot.readFieldEnd();
                        }
                        iprot.readStructEnd();
                        break;
                }

                this.products = com.google.common.base.Preconditions.checkNotNull(products, "com.yogento.api.services.catalog.PutProductsRequest: missing products");
            }

            public PutProductsRequest(final com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.Product> products) {
                this.products = com.google.common.base.Preconditions.checkNotNull(products, "com.yogento.api.services.catalog.PutProductsRequest: missing products");
            }

            public static Builder builder() {
                return new Builder();
            }

            @Override
            public int compareTo(final PutProductsRequest other) {
                if (other == null) {
                    throw new NullPointerException();
                }

                int result;
                result = org.thryft.Comparators.compare(this.products, other.products);
                if (result != 0) {
                    return result;
                }

                return 0;
            }

            @Override
            public boolean equals(final Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof PutProductsRequest)) {
                    return false;
                }

                final PutProductsRequest other = (PutProductsRequest)otherObject;
                return
                    getProducts().equals(other.getProducts());
            }

            public static PutProductsRequest fake() {
                return fakeBuilder().build();
            }

            public static Builder fakeBuilder() {
                Builder builder = new Builder();
                builder.setProducts(com.google.common.collect.ImmutableSet.of(com.yogento.api.models.catalog.product.Product.fake()));
                return builder;
            }

            public Object get(final String fieldName) {
                if (fieldName.equals("products")) {
                    return getProducts();
                }
                throw new IllegalArgumentException(fieldName);
            }

            public final com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.Product> getProducts() {
                return products;
            }

            @Override
            public int hashCode() {
                int hashCode = 17;
                hashCode = 31 * hashCode + getProducts().hashCode();
                return hashCode;
            }

            public PutProductsRequest replaceProducts(final com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.Product> products) {
                return new PutProductsRequest(products);
            }

            @Override
            public String toString() {
                final com.google.common.base.Objects.ToStringHelper helper = com.google.common.base.Objects.toStringHelper(this);
                helper.add("products", getProducts());
                return helper.toString();
            }

            @Override
            public void write(final org.thryft.protocol.TProtocol oprot) throws java.io.IOException {
                write(oprot, org.thryft.protocol.TType.STRUCT);
            }

            public void write(final org.thryft.protocol.TProtocol oprot, final byte writeAsTType) throws java.io.IOException {
                switch (writeAsTType) {
                    case org.thryft.protocol.TType.VOID: {
                        oprot.writeSetBegin(new org.thryft.protocol.TSet(org.thryft.protocol.TType.STRUCT, getProducts().size()));
                        for (final com.yogento.api.models.catalog.product.Product _iter0 : getProducts()) {
                            _iter0.write(oprot);
                        }
                        oprot.writeSetEnd();
                        break;
                    }

                    case org.thryft.protocol.TType.LIST:
                        oprot.writeListBegin(new org.thryft.protocol.TList(org.thryft.protocol.TType.VOID, 1));

                        oprot.writeSetBegin(new org.thryft.protocol.TSet(org.thryft.protocol.TType.STRUCT, getProducts().size()));
                        for (final com.yogento.api.models.catalog.product.Product _iter0 : getProducts()) {
                            _iter0.write(oprot);
                        }
                        oprot.writeSetEnd();

                        oprot.writeListEnd();
                        break;

                    case org.thryft.protocol.TType.STRUCT:
                    default:
                        oprot.writeStructBegin(new org.thryft.protocol.TStruct("PutProductsRequest"));

                        oprot.writeFieldBegin(new org.thryft.protocol.TField("products", org.thryft.protocol.TType.SET, (short)-1));
                        oprot.writeSetBegin(new org.thryft.protocol.TSet(org.thryft.protocol.TType.STRUCT, getProducts().size()));
                        for (final com.yogento.api.models.catalog.product.Product _iter0 : getProducts()) {
                            _iter0.write(oprot);
                        }
                        oprot.writeSetEnd();
                        oprot.writeFieldEnd();

                        oprot.writeFieldStop();

                        oprot.writeStructEnd();
                        break;
                }
            }

            private final com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.Product> products;
        }

        @SuppressWarnings({"serial"})
        public final static class PutProductsResponse implements org.thryft.TBase<PutProductsResponse> {
            public static class Builder {
                public Builder() {
                }

                public Builder(final PutProductsResponse other) {
                }

                protected PutProductsResponse _build() {
                    return new PutProductsResponse();
                }

                public PutProductsResponse build() {
                    return _build();
                }
            }

            public PutProductsResponse() {
            }

            public PutProductsResponse(final PutProductsResponse other) {
            }

            public PutProductsResponse(final org.thryft.protocol.TProtocol iprot) throws java.io.IOException {
            }

            public static Builder builder() {
                return new Builder();
            }

            @Override
            public int compareTo(final PutProductsResponse other) {
                if (other == null) {
                    throw new NullPointerException();
                }
                return 0;
            }

            @Override
            public boolean equals(final Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof PutProductsResponse)) {
                    return false;
                }

                return true;
            }

            public static PutProductsResponse fake() {
                return fakeBuilder().build();
            }

            public static Builder fakeBuilder() {
                Builder builder = new Builder();
                return builder;
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
                        oprot.writeStructBegin(new org.thryft.protocol.TStruct("PutProductsResponse"));

                        oprot.writeFieldStop();

                        oprot.writeStructEnd();
                        break;
                }
            }
        }
    }

    public boolean deleteProductBySku(final String sku);

    public void deleteProducts();

    public int getProductCount();

    public com.yogento.api.models.catalog.product.Product getProductBySku(final String sku) throws com.yogento.api.services.catalog.NoSuchProductException;

    public com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.Product> getProducts(final com.google.common.base.Optional<Boolean> includeDisabled, final com.google.common.base.Optional<String> query);

    public com.google.common.collect.ImmutableSet<String> getProductSkus();

    public com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.Product> getProductsBySkus(final com.google.common.collect.ImmutableSet<String> skus) throws com.yogento.api.services.catalog.NoSuchProductException;

    public org.thryft.native_.Url getProductThumbnailUrl(final String sku, final int thumbnailHeightPx, final int thumbnailWidthPx) throws com.yogento.api.services.catalog.NoSuchProductException, com.yogento.api.services.catalog.NoSuchProductImageException;

    public org.thryft.native_.Url getSampleProductThumbnailUrl(final String sku, final int thumbnailHeightPx, final int thumbnailWidthPx) throws com.yogento.api.services.catalog.NoSuchProductException, com.yogento.api.services.catalog.NoSuchProductImageException;

    public com.yogento.api.models.catalog.product.Product getSampleProductBySku(final String sku) throws com.yogento.api.services.catalog.NoSuchProductException;

    public com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.Product> getSampleProducts();

    public boolean headProductBySku(final String sku);

    public void putProduct(final com.yogento.api.models.catalog.product.Product product) throws com.yogento.api.services.catalog.ProductIoException;

    public void putProducts(final com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.Product> products) throws com.yogento.api.services.catalog.ProductIoException;
}
