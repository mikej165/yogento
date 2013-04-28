package com.yogento.api.services.catalog;

public interface CatalogService {
    public static class Messages {
        @SuppressWarnings({"serial"})
        public final static class deleteProductBySkuRequest implements org.thryft.TBase<deleteProductBySkuRequest> {
            public static class Builder {
                public Builder() {
                }

                public Builder(final deleteProductBySkuRequest other) {
                    this.sku = other.getSku();
                }

                protected deleteProductBySkuRequest _build(final String sku) {
                    return new deleteProductBySkuRequest(sku);
                }

                public deleteProductBySkuRequest build() {
                    return _build(sku);
                }

                public Builder setSku(final String sku) {
                    this.sku = sku;
                    return this;
                }

                private String sku;
            }

            public deleteProductBySkuRequest(final deleteProductBySkuRequest other) {
                this(other.getSku());
            }

            public deleteProductBySkuRequest(final org.thryft.protocol.TProtocol iprot) throws java.io.IOException {
                this(iprot, org.thryft.protocol.TType.STRUCT);
            }

            public deleteProductBySkuRequest(final org.thryft.protocol.TProtocol iprot, final byte readAsTType) throws java.io.IOException {
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

                this.sku = com.google.common.base.Preconditions.checkNotNull(sku, "com.yogento.api.services.catalog.deleteProductBySkuRequest: missing sku");
            }

            public deleteProductBySkuRequest(final String sku) {
                this.sku = com.google.common.base.Preconditions.checkNotNull(sku, "com.yogento.api.services.catalog.deleteProductBySkuRequest: missing sku");
            }

            @Override
            public int compareTo(final deleteProductBySkuRequest other) {
                throw new UnsupportedOperationException();
            }

            @Override
            public boolean equals(final Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof deleteProductBySkuRequest)) {
                    return false;
                }

                final deleteProductBySkuRequest other = (deleteProductBySkuRequest)otherObject;
                return
                    getSku().equals(other.getSku());
            }

            public Object get(final String fieldName) {
                if (fieldName.equals("sku")) {
                    return getSku();
                }
                return null;
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
                        oprot.writeStructBegin(new org.thryft.protocol.TStruct("deleteProductBySkuRequest"));

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
        public final static class deleteProductBySkuResponse implements org.thryft.TBase<deleteProductBySkuResponse> {
            public static class Builder {
                public Builder() {
                }

                public Builder(final deleteProductBySkuResponse other) {
                    this.returnValue = other.isReturnValue();
                }

                protected deleteProductBySkuResponse _build(final boolean returnValue) {
                    return new deleteProductBySkuResponse(returnValue);
                }

                public deleteProductBySkuResponse build() {
                    return _build(returnValue);
                }

                public Builder setReturnValue(final boolean returnValue) {
                    this.returnValue = returnValue;
                    return this;
                }

                private Boolean returnValue;
            }

            public deleteProductBySkuResponse(final deleteProductBySkuResponse other) {
                this(other.isReturnValue());
            }

            public deleteProductBySkuResponse(final org.thryft.protocol.TProtocol iprot) throws java.io.IOException {
                returnValue = iprot.readBool();
            }

            public deleteProductBySkuResponse(final boolean returnValue) {
                this.returnValue = returnValue;
            }

            public deleteProductBySkuResponse(final Boolean returnValue) {
                this.returnValue = returnValue;
            }

            @Override
            public int compareTo(final deleteProductBySkuResponse other) {
                throw new UnsupportedOperationException();
            }

            @Override
            public boolean equals(final Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof deleteProductBySkuResponse)) {
                    return false;
                }

                final deleteProductBySkuResponse other = (deleteProductBySkuResponse)otherObject;
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
                        oprot.writeStructBegin(new org.thryft.protocol.TStruct("deleteProductBySkuResponse"));

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
        public final static class deleteProductsRequest implements org.thryft.TBase<deleteProductsRequest> {
            public static class Builder {
                public Builder() {
                }

                public Builder(final deleteProductsRequest other) {
                }

                protected deleteProductsRequest _build() {
                    return new deleteProductsRequest();
                }

                public deleteProductsRequest build() {
                    return _build();
                }
            }

            public deleteProductsRequest() {
            }

            public deleteProductsRequest(final deleteProductsRequest other) {
            }

            public deleteProductsRequest(final org.thryft.protocol.TProtocol iprot) throws java.io.IOException {
                this(iprot, org.thryft.protocol.TType.STRUCT);
            }

            public deleteProductsRequest(final org.thryft.protocol.TProtocol iprot, final byte readAsTType) throws java.io.IOException {
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

            @Override
            public int compareTo(final deleteProductsRequest other) {
                throw new UnsupportedOperationException();
            }

            @Override
            public boolean equals(final Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof deleteProductsRequest)) {
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
                        oprot.writeStructBegin(new org.thryft.protocol.TStruct("deleteProductsRequest"));

                        oprot.writeFieldStop();

                        oprot.writeStructEnd();
                        break;
                }
            }
        }

        @SuppressWarnings({"serial"})
        public final static class deleteProductsResponse implements org.thryft.TBase<deleteProductsResponse> {
            public static class Builder {
                public Builder() {
                }

                public Builder(final deleteProductsResponse other) {
                }

                protected deleteProductsResponse _build() {
                    return new deleteProductsResponse();
                }

                public deleteProductsResponse build() {
                    return _build();
                }
            }

            public deleteProductsResponse() {
            }

            public deleteProductsResponse(final deleteProductsResponse other) {
            }

            public deleteProductsResponse(final org.thryft.protocol.TProtocol iprot) throws java.io.IOException {
            }

            @Override
            public int compareTo(final deleteProductsResponse other) {
                throw new UnsupportedOperationException();
            }

            @Override
            public boolean equals(final Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof deleteProductsResponse)) {
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
                        oprot.writeStructBegin(new org.thryft.protocol.TStruct("deleteProductsResponse"));

                        oprot.writeFieldStop();

                        oprot.writeStructEnd();
                        break;
                }
            }
        }

        @SuppressWarnings({"serial"})
        public final static class getProductCountRequest implements org.thryft.TBase<getProductCountRequest> {
            public static class Builder {
                public Builder() {
                }

                public Builder(final getProductCountRequest other) {
                }

                protected getProductCountRequest _build() {
                    return new getProductCountRequest();
                }

                public getProductCountRequest build() {
                    return _build();
                }
            }

            public getProductCountRequest() {
            }

            public getProductCountRequest(final getProductCountRequest other) {
            }

            public getProductCountRequest(final org.thryft.protocol.TProtocol iprot) throws java.io.IOException {
                this(iprot, org.thryft.protocol.TType.STRUCT);
            }

            public getProductCountRequest(final org.thryft.protocol.TProtocol iprot, final byte readAsTType) throws java.io.IOException {
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

            @Override
            public int compareTo(final getProductCountRequest other) {
                throw new UnsupportedOperationException();
            }

            @Override
            public boolean equals(final Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof getProductCountRequest)) {
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
                        oprot.writeStructBegin(new org.thryft.protocol.TStruct("getProductCountRequest"));

                        oprot.writeFieldStop();

                        oprot.writeStructEnd();
                        break;
                }
            }
        }

        @SuppressWarnings({"serial"})
        public final static class getProductCountResponse implements org.thryft.TBase<getProductCountResponse> {
            public static class Builder {
                public Builder() {
                }

                public Builder(final getProductCountResponse other) {
                    this.returnValue = other.getReturnValue();
                }

                protected getProductCountResponse _build(final int returnValue) {
                    return new getProductCountResponse(returnValue);
                }

                public getProductCountResponse build() {
                    return _build(returnValue);
                }

                public Builder setReturnValue(final int returnValue) {
                    this.returnValue = returnValue;
                    return this;
                }

                private Integer returnValue;
            }

            public getProductCountResponse(final getProductCountResponse other) {
                this(other.getReturnValue());
            }

            public getProductCountResponse(final org.thryft.protocol.TProtocol iprot) throws java.io.IOException {
                returnValue = iprot.readI32();
            }

            public getProductCountResponse(final int returnValue) {
                this.returnValue = returnValue;
            }

            public getProductCountResponse(final Integer returnValue) {
                this.returnValue = returnValue;
            }

            @Override
            public int compareTo(final getProductCountResponse other) {
                throw new UnsupportedOperationException();
            }

            @Override
            public boolean equals(final Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof getProductCountResponse)) {
                    return false;
                }

                final getProductCountResponse other = (getProductCountResponse)otherObject;
                return
                    getReturnValue() == other.getReturnValue();
            }

            public Object get(final String fieldName) {
                if (fieldName.equals("return_value")) {
                    return getReturnValue();
                }
                return null;
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
                        oprot.writeStructBegin(new org.thryft.protocol.TStruct("getProductCountResponse"));

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
        public final static class getProductBySkuRequest implements org.thryft.TBase<getProductBySkuRequest> {
            public static class Builder {
                public Builder() {
                }

                public Builder(final getProductBySkuRequest other) {
                    this.sku = other.getSku();
                }

                protected getProductBySkuRequest _build(final String sku) {
                    return new getProductBySkuRequest(sku);
                }

                public getProductBySkuRequest build() {
                    return _build(sku);
                }

                public Builder setSku(final String sku) {
                    this.sku = sku;
                    return this;
                }

                private String sku;
            }

            public getProductBySkuRequest(final getProductBySkuRequest other) {
                this(other.getSku());
            }

            public getProductBySkuRequest(final org.thryft.protocol.TProtocol iprot) throws java.io.IOException {
                this(iprot, org.thryft.protocol.TType.STRUCT);
            }

            public getProductBySkuRequest(final org.thryft.protocol.TProtocol iprot, final byte readAsTType) throws java.io.IOException {
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

                this.sku = com.google.common.base.Preconditions.checkNotNull(sku, "com.yogento.api.services.catalog.getProductBySkuRequest: missing sku");
            }

            public getProductBySkuRequest(final String sku) {
                this.sku = com.google.common.base.Preconditions.checkNotNull(sku, "com.yogento.api.services.catalog.getProductBySkuRequest: missing sku");
            }

            @Override
            public int compareTo(final getProductBySkuRequest other) {
                throw new UnsupportedOperationException();
            }

            @Override
            public boolean equals(final Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof getProductBySkuRequest)) {
                    return false;
                }

                final getProductBySkuRequest other = (getProductBySkuRequest)otherObject;
                return
                    getSku().equals(other.getSku());
            }

            public Object get(final String fieldName) {
                if (fieldName.equals("sku")) {
                    return getSku();
                }
                return null;
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
                        oprot.writeStructBegin(new org.thryft.protocol.TStruct("getProductBySkuRequest"));

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
        public final static class getProductBySkuResponse implements org.thryft.TBase<getProductBySkuResponse> {
            public static class Builder {
                public Builder() {
                }

                public Builder(final getProductBySkuResponse other) {
                    this.returnValue = other.getReturnValue();
                }

                protected getProductBySkuResponse _build(final com.yogento.api.models.catalog.product.Product returnValue) {
                    return new getProductBySkuResponse(returnValue);
                }

                public getProductBySkuResponse build() {
                    return _build(returnValue);
                }

                public Builder setReturnValue(final com.yogento.api.models.catalog.product.Product returnValue) {
                    this.returnValue = returnValue;
                    return this;
                }

                private com.yogento.api.models.catalog.product.Product returnValue;
            }

            public getProductBySkuResponse(final getProductBySkuResponse other) {
                this(other.getReturnValue());
            }

            public getProductBySkuResponse(final org.thryft.protocol.TProtocol iprot) throws java.io.IOException {
                returnValue = new com.yogento.api.models.catalog.product.Product(iprot);
            }

            public getProductBySkuResponse(final com.yogento.api.models.catalog.product.Product returnValue) {
                this.returnValue = com.google.common.base.Preconditions.checkNotNull(returnValue, "com.yogento.api.services.catalog.CatalogService.getProductBySku: missing returnValue");
            }

            @Override
            public int compareTo(final getProductBySkuResponse other) {
                throw new UnsupportedOperationException();
            }

            @Override
            public boolean equals(final Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof getProductBySkuResponse)) {
                    return false;
                }

                final getProductBySkuResponse other = (getProductBySkuResponse)otherObject;
                return
                    getReturnValue().equals(other.getReturnValue());
            }

            public Object get(final String fieldName) {
                if (fieldName.equals("return_value")) {
                    return getReturnValue();
                }
                return null;
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
                        oprot.writeStructBegin(new org.thryft.protocol.TStruct("getProductBySkuResponse"));

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
        public final static class getProductsRequest implements org.thryft.TBase<getProductsRequest> {
            public static class Builder {
                public Builder() {
                }

                public Builder(final getProductsRequest other) {
                    this.includeDisabled = other.isIncludeDisabled();
                    this.query = other.getQuery();
                }

                protected getProductsRequest _build(final Boolean includeDisabled, final String query) {
                    return new getProductsRequest(includeDisabled, query);
                }

                public getProductsRequest build() {
                    return _build(includeDisabled, query);
                }

                public Builder setIncludeDisabled(final Boolean includeDisabled) {
                    this.includeDisabled = includeDisabled;
                    return this;
                }

                public Builder setQuery(final String query) {
                    this.query = query;
                    return this;
                }

                private Boolean includeDisabled;
                private String query;
            }

            public getProductsRequest() {
                includeDisabled = null;
                query = null;
            }

            public getProductsRequest(final getProductsRequest other) {
                this(other.isIncludeDisabled(), other.getQuery());
            }

            public getProductsRequest(final org.thryft.protocol.TProtocol iprot) throws java.io.IOException {
                this(iprot, org.thryft.protocol.TType.STRUCT);
            }

            public getProductsRequest(final org.thryft.protocol.TProtocol iprot, final byte readAsTType) throws java.io.IOException {
                Boolean includeDisabled = null;
                String query = null;

                switch (readAsTType) {
                    case org.thryft.protocol.TType.LIST:
                        final org.thryft.protocol.TList __list = iprot.readListBegin();
                        if (__list.size > 0) {
                            includeDisabled = iprot.readBool();
                        }
                        if (__list.size > 1) {
                            query = iprot.readString();
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
                                includeDisabled = iprot.readBool();
                            } else if (ifield.name.equals("query")) {
                                query = iprot.readString();
                            }
                            iprot.readFieldEnd();
                        }
                        iprot.readStructEnd();
                        break;
                }

                this.includeDisabled = includeDisabled;
                this.query = query;
            }

            public getProductsRequest(final Boolean includeDisabled, final String query) {
                this.includeDisabled = includeDisabled;
                this.query = query;
            }

            @Override
            public int compareTo(final getProductsRequest other) {
                throw new UnsupportedOperationException();
            }

            @Override
            public boolean equals(final Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof getProductsRequest)) {
                    return false;
                }

                final getProductsRequest other = (getProductsRequest)otherObject;
                return
                    ((isIncludeDisabled() == null && other.isIncludeDisabled() == null) ||
                    (isIncludeDisabled() != null && other.isIncludeDisabled() != null &&
                    isIncludeDisabled().equals(other.isIncludeDisabled()))) &&
                    ((getQuery() == null && other.getQuery() == null) ||
                    (getQuery() != null && other.getQuery() != null &&
                    getQuery().equals(other.getQuery())));
            }

            public Object get(final String fieldName) {
                if (fieldName.equals("include_disabled")) {
                    return isIncludeDisabled();
                } else if (fieldName.equals("query")) {
                    return getQuery();
                }
                return null;
            }

            public final String getQuery() {
                return query;
            }

            @Override
            public int hashCode() {
                int hashCode = 17;
                if (isIncludeDisabled() != null) {
                    hashCode = 31 * hashCode + (isIncludeDisabled() ? 1 : 0);
                }
                if (getQuery() != null) {
                    hashCode = 31 * hashCode + getQuery().hashCode();
                }
                return hashCode;
            }

            public final Boolean isIncludeDisabled() {
                return includeDisabled;
            }

            @Override
            public String toString() {
                final com.google.common.base.Objects.ToStringHelper helper = com.google.common.base.Objects.toStringHelper(this);
                if (isIncludeDisabled() != null) {
                    helper.add("include_disabled", isIncludeDisabled());
                }
                if (getQuery() != null) {
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

                        if (isIncludeDisabled() != null) {
                            oprot.writeBool(isIncludeDisabled());
                        } else {
                            ((org.thryft.protocol.TProtocol)oprot).writeNull();
                        }

                        if (getQuery() != null) {
                            oprot.writeString(getQuery());
                        } else {
                            ((org.thryft.protocol.TProtocol)oprot).writeNull();
                        }

                        oprot.writeListEnd();
                        break;

                    case org.thryft.protocol.TType.STRUCT:
                    default:
                        oprot.writeStructBegin(new org.thryft.protocol.TStruct("getProductsRequest"));

                        if (isIncludeDisabled() != null) {
                            oprot.writeFieldBegin(new org.thryft.protocol.TField("include_disabled", org.thryft.protocol.TType.BOOL, (short)-1));
                            oprot.writeBool(isIncludeDisabled());
                            oprot.writeFieldEnd();
                        }

                        if (getQuery() != null) {
                            oprot.writeFieldBegin(new org.thryft.protocol.TField("query", org.thryft.protocol.TType.STRING, (short)-1));
                            oprot.writeString(getQuery());
                            oprot.writeFieldEnd();
                        }

                        oprot.writeFieldStop();

                        oprot.writeStructEnd();
                        break;
                }
            }

            private final Boolean includeDisabled;

            private final String query;
        }

        @SuppressWarnings({"serial"})
        public final static class getProductsResponse implements org.thryft.TBase<getProductsResponse> {
            public static class Builder {
                public Builder() {
                }

                public Builder(final getProductsResponse other) {
                    this.returnValue = other.getReturnValue();
                }

                protected getProductsResponse _build(final com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.Product> returnValue) {
                    return new getProductsResponse(returnValue);
                }

                public getProductsResponse build() {
                    return _build(returnValue);
                }

                public Builder setReturnValue(final com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.Product> returnValue) {
                    this.returnValue = returnValue;
                    return this;
                }

                private com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.Product> returnValue;
            }

            public getProductsResponse(final getProductsResponse other) {
                this(other.getReturnValue());
            }

            public getProductsResponse(final org.thryft.protocol.TProtocol iprot) throws java.io.IOException {
                returnValue = (new com.google.common.base.Function<org.thryft.protocol.TProtocol, com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.Product>>() {
                    @Override
                    public com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.Product> apply(final org.thryft.protocol.TProtocol iprot) {
                        try {
                            final org.thryft.protocol.TSet sequenceBegin = iprot.readSetBegin();
                            final java.util.Set<com.yogento.api.models.catalog.product.Product> sequence = new java.util.LinkedHashSet<com.yogento.api.models.catalog.product.Product>();
                            for (int elementI = 0; elementI < sequenceBegin.size; elementI++) {
                                sequence.add(new com.yogento.api.models.catalog.product.Product(iprot));
                            }
                            iprot.readSetEnd();
                            return com.google.common.collect.ImmutableSet.copyOf(sequence);
                        } catch (final java.io.IOException e) {
                            return com.google.common.collect.ImmutableSet.of();
                        }
                    }
                }).apply(iprot);
            }

            public getProductsResponse(final com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.Product> returnValue) {
                this.returnValue = com.google.common.base.Preconditions.checkNotNull(returnValue, "com.yogento.api.services.catalog.CatalogService.getProducts: missing returnValue");
            }

            @Override
            public int compareTo(final getProductsResponse other) {
                throw new UnsupportedOperationException();
            }

            @Override
            public boolean equals(final Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof getProductsResponse)) {
                    return false;
                }

                final getProductsResponse other = (getProductsResponse)otherObject;
                return
                    getReturnValue().equals(other.getReturnValue());
            }

            public Object get(final String fieldName) {
                if (fieldName.equals("return_value")) {
                    return getReturnValue();
                }
                return null;
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
                        oprot.writeStructBegin(new org.thryft.protocol.TStruct("getProductsResponse"));

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
        public final static class getProductSkusRequest implements org.thryft.TBase<getProductSkusRequest> {
            public static class Builder {
                public Builder() {
                }

                public Builder(final getProductSkusRequest other) {
                }

                protected getProductSkusRequest _build() {
                    return new getProductSkusRequest();
                }

                public getProductSkusRequest build() {
                    return _build();
                }
            }

            public getProductSkusRequest() {
            }

            public getProductSkusRequest(final getProductSkusRequest other) {
            }

            public getProductSkusRequest(final org.thryft.protocol.TProtocol iprot) throws java.io.IOException {
                this(iprot, org.thryft.protocol.TType.STRUCT);
            }

            public getProductSkusRequest(final org.thryft.protocol.TProtocol iprot, final byte readAsTType) throws java.io.IOException {
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

            @Override
            public int compareTo(final getProductSkusRequest other) {
                throw new UnsupportedOperationException();
            }

            @Override
            public boolean equals(final Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof getProductSkusRequest)) {
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
                        oprot.writeStructBegin(new org.thryft.protocol.TStruct("getProductSkusRequest"));

                        oprot.writeFieldStop();

                        oprot.writeStructEnd();
                        break;
                }
            }
        }

        @SuppressWarnings({"serial"})
        public final static class getProductSkusResponse implements org.thryft.TBase<getProductSkusResponse> {
            public static class Builder {
                public Builder() {
                }

                public Builder(final getProductSkusResponse other) {
                    this.returnValue = other.getReturnValue();
                }

                protected getProductSkusResponse _build(final com.google.common.collect.ImmutableSet<String> returnValue) {
                    return new getProductSkusResponse(returnValue);
                }

                public getProductSkusResponse build() {
                    return _build(returnValue);
                }

                public Builder setReturnValue(final com.google.common.collect.ImmutableSet<String> returnValue) {
                    this.returnValue = returnValue;
                    return this;
                }

                private com.google.common.collect.ImmutableSet<String> returnValue;
            }

            public getProductSkusResponse(final getProductSkusResponse other) {
                this(other.getReturnValue());
            }

            public getProductSkusResponse(final org.thryft.protocol.TProtocol iprot) throws java.io.IOException {
                returnValue = (new com.google.common.base.Function<org.thryft.protocol.TProtocol, com.google.common.collect.ImmutableSet<String>>() {
                    @Override
                    public com.google.common.collect.ImmutableSet<String> apply(final org.thryft.protocol.TProtocol iprot) {
                        try {
                            final org.thryft.protocol.TSet sequenceBegin = iprot.readSetBegin();
                            final java.util.Set<String> sequence = new java.util.LinkedHashSet<String>();
                            for (int elementI = 0; elementI < sequenceBegin.size; elementI++) {
                                sequence.add(iprot.readString());
                            }
                            iprot.readSetEnd();
                            return com.google.common.collect.ImmutableSet.copyOf(sequence);
                        } catch (final java.io.IOException e) {
                            return com.google.common.collect.ImmutableSet.of();
                        }
                    }
                }).apply(iprot);
            }

            public getProductSkusResponse(final com.google.common.collect.ImmutableSet<String> returnValue) {
                this.returnValue = com.google.common.base.Preconditions.checkNotNull(returnValue, "com.yogento.api.services.catalog.CatalogService.getProductSkus: missing returnValue");
            }

            @Override
            public int compareTo(final getProductSkusResponse other) {
                throw new UnsupportedOperationException();
            }

            @Override
            public boolean equals(final Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof getProductSkusResponse)) {
                    return false;
                }

                final getProductSkusResponse other = (getProductSkusResponse)otherObject;
                return
                    getReturnValue().equals(other.getReturnValue());
            }

            public Object get(final String fieldName) {
                if (fieldName.equals("return_value")) {
                    return getReturnValue();
                }
                return null;
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
                        oprot.writeStructBegin(new org.thryft.protocol.TStruct("getProductSkusResponse"));

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
        public final static class getProductsBySkusRequest implements org.thryft.TBase<getProductsBySkusRequest> {
            public static class Builder {
                public Builder() {
                }

                public Builder(final getProductsBySkusRequest other) {
                    this.skus = other.getSkus();
                }

                protected getProductsBySkusRequest _build(final com.google.common.collect.ImmutableSet<String> skus) {
                    return new getProductsBySkusRequest(skus);
                }

                public getProductsBySkusRequest build() {
                    return _build(skus);
                }

                public Builder setSkus(final com.google.common.collect.ImmutableSet<String> skus) {
                    this.skus = skus;
                    return this;
                }

                private com.google.common.collect.ImmutableSet<String> skus;
            }

            public getProductsBySkusRequest(final getProductsBySkusRequest other) {
                this(other.getSkus());
            }

            public getProductsBySkusRequest(final org.thryft.protocol.TProtocol iprot) throws java.io.IOException {
                this(iprot, org.thryft.protocol.TType.STRUCT);
            }

            public getProductsBySkusRequest(final org.thryft.protocol.TProtocol iprot, final byte readAsTType) throws java.io.IOException {
                com.google.common.collect.ImmutableSet<String> skus = null;

                switch (readAsTType) {
                    case org.thryft.protocol.TType.LIST:
                        iprot.readListBegin();
                        skus = (new com.google.common.base.Function<org.thryft.protocol.TProtocol, com.google.common.collect.ImmutableSet<String>>() {
                            @Override
                            public com.google.common.collect.ImmutableSet<String> apply(final org.thryft.protocol.TProtocol iprot) {
                                try {
                                    final org.thryft.protocol.TSet sequenceBegin = iprot.readSetBegin();
                                    final java.util.Set<String> sequence = new java.util.LinkedHashSet<String>();
                                    for (int elementI = 0; elementI < sequenceBegin.size; elementI++) {
                                        sequence.add(iprot.readString());
                                    }
                                    iprot.readSetEnd();
                                    return com.google.common.collect.ImmutableSet.copyOf(sequence);
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
                                            final java.util.Set<String> sequence = new java.util.LinkedHashSet<String>();
                                            for (int elementI = 0; elementI < sequenceBegin.size; elementI++) {
                                                sequence.add(iprot.readString());
                                            }
                                            iprot.readSetEnd();
                                            return com.google.common.collect.ImmutableSet.copyOf(sequence);
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

                this.skus = com.google.common.base.Preconditions.checkNotNull(skus, "com.yogento.api.services.catalog.getProductsBySkusRequest: missing skus");
            }

            public getProductsBySkusRequest(final com.google.common.collect.ImmutableSet<String> skus) {
                this.skus = com.google.common.base.Preconditions.checkNotNull(skus, "com.yogento.api.services.catalog.getProductsBySkusRequest: missing skus");
            }

            @Override
            public int compareTo(final getProductsBySkusRequest other) {
                throw new UnsupportedOperationException();
            }

            @Override
            public boolean equals(final Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof getProductsBySkusRequest)) {
                    return false;
                }

                final getProductsBySkusRequest other = (getProductsBySkusRequest)otherObject;
                return
                    getSkus().equals(other.getSkus());
            }

            public Object get(final String fieldName) {
                if (fieldName.equals("skus")) {
                    return getSkus();
                }
                return null;
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
                        oprot.writeStructBegin(new org.thryft.protocol.TStruct("getProductsBySkusRequest"));

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
        public final static class getProductsBySkusResponse implements org.thryft.TBase<getProductsBySkusResponse> {
            public static class Builder {
                public Builder() {
                }

                public Builder(final getProductsBySkusResponse other) {
                    this.returnValue = other.getReturnValue();
                }

                protected getProductsBySkusResponse _build(final com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.Product> returnValue) {
                    return new getProductsBySkusResponse(returnValue);
                }

                public getProductsBySkusResponse build() {
                    return _build(returnValue);
                }

                public Builder setReturnValue(final com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.Product> returnValue) {
                    this.returnValue = returnValue;
                    return this;
                }

                private com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.Product> returnValue;
            }

            public getProductsBySkusResponse(final getProductsBySkusResponse other) {
                this(other.getReturnValue());
            }

            public getProductsBySkusResponse(final org.thryft.protocol.TProtocol iprot) throws java.io.IOException {
                returnValue = (new com.google.common.base.Function<org.thryft.protocol.TProtocol, com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.Product>>() {
                    @Override
                    public com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.Product> apply(final org.thryft.protocol.TProtocol iprot) {
                        try {
                            final org.thryft.protocol.TSet sequenceBegin = iprot.readSetBegin();
                            final java.util.Set<com.yogento.api.models.catalog.product.Product> sequence = new java.util.LinkedHashSet<com.yogento.api.models.catalog.product.Product>();
                            for (int elementI = 0; elementI < sequenceBegin.size; elementI++) {
                                sequence.add(new com.yogento.api.models.catalog.product.Product(iprot));
                            }
                            iprot.readSetEnd();
                            return com.google.common.collect.ImmutableSet.copyOf(sequence);
                        } catch (final java.io.IOException e) {
                            return com.google.common.collect.ImmutableSet.of();
                        }
                    }
                }).apply(iprot);
            }

            public getProductsBySkusResponse(final com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.Product> returnValue) {
                this.returnValue = com.google.common.base.Preconditions.checkNotNull(returnValue, "com.yogento.api.services.catalog.CatalogService.getProductsBySkus: missing returnValue");
            }

            @Override
            public int compareTo(final getProductsBySkusResponse other) {
                throw new UnsupportedOperationException();
            }

            @Override
            public boolean equals(final Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof getProductsBySkusResponse)) {
                    return false;
                }

                final getProductsBySkusResponse other = (getProductsBySkusResponse)otherObject;
                return
                    getReturnValue().equals(other.getReturnValue());
            }

            public Object get(final String fieldName) {
                if (fieldName.equals("return_value")) {
                    return getReturnValue();
                }
                return null;
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
                        oprot.writeStructBegin(new org.thryft.protocol.TStruct("getProductsBySkusResponse"));

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
        public final static class getProductThumbnailUrlRequest implements org.thryft.TBase<getProductThumbnailUrlRequest> {
            public static class Builder {
                public Builder() {
                }

                public Builder(final getProductThumbnailUrlRequest other) {
                    this.sku = other.getSku();
                    this.thumbnailResolution = other.getThumbnailResolution();
                }

                protected getProductThumbnailUrlRequest _build(final String sku, final com.yogento.api.models.image.ImageResolution thumbnailResolution) {
                    return new getProductThumbnailUrlRequest(sku, thumbnailResolution);
                }

                public getProductThumbnailUrlRequest build() {
                    return _build(sku, thumbnailResolution);
                }

                public Builder setSku(final String sku) {
                    this.sku = sku;
                    return this;
                }

                public Builder setThumbnailResolution(final com.yogento.api.models.image.ImageResolution thumbnailResolution) {
                    this.thumbnailResolution = thumbnailResolution;
                    return this;
                }

                private String sku;
                private com.yogento.api.models.image.ImageResolution thumbnailResolution;
            }

            public getProductThumbnailUrlRequest(final getProductThumbnailUrlRequest other) {
                this(other.getSku(), other.getThumbnailResolution());
            }

            public getProductThumbnailUrlRequest(final org.thryft.protocol.TProtocol iprot) throws java.io.IOException {
                this(iprot, org.thryft.protocol.TType.STRUCT);
            }

            public getProductThumbnailUrlRequest(final org.thryft.protocol.TProtocol iprot, final byte readAsTType) throws java.io.IOException {
                String sku = null;
                com.yogento.api.models.image.ImageResolution thumbnailResolution = null;

                switch (readAsTType) {
                    case org.thryft.protocol.TType.LIST:
                        iprot.readListBegin();
                        sku = iprot.readString();
                        thumbnailResolution = new com.yogento.api.models.image.ImageResolution(iprot);
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
                            } else if (ifield.name.equals("thumbnail_resolution")) {
                                thumbnailResolution = new com.yogento.api.models.image.ImageResolution(iprot);
                            }
                            iprot.readFieldEnd();
                        }
                        iprot.readStructEnd();
                        break;
                }

                this.sku = com.google.common.base.Preconditions.checkNotNull(sku, "com.yogento.api.services.catalog.getProductThumbnailUrlRequest: missing sku");
                this.thumbnailResolution = com.google.common.base.Preconditions.checkNotNull(thumbnailResolution, "com.yogento.api.services.catalog.getProductThumbnailUrlRequest: missing thumbnailResolution");
            }

            public getProductThumbnailUrlRequest(final String sku, final com.yogento.api.models.image.ImageResolution thumbnailResolution) {
                this.sku = com.google.common.base.Preconditions.checkNotNull(sku, "com.yogento.api.services.catalog.getProductThumbnailUrlRequest: missing sku");
                this.thumbnailResolution = com.google.common.base.Preconditions.checkNotNull(thumbnailResolution, "com.yogento.api.services.catalog.getProductThumbnailUrlRequest: missing thumbnailResolution");
            }

            @Override
            public int compareTo(final getProductThumbnailUrlRequest other) {
                throw new UnsupportedOperationException();
            }

            @Override
            public boolean equals(final Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof getProductThumbnailUrlRequest)) {
                    return false;
                }

                final getProductThumbnailUrlRequest other = (getProductThumbnailUrlRequest)otherObject;
                return
                    getSku().equals(other.getSku()) &&
                    getThumbnailResolution().equals(other.getThumbnailResolution());
            }

            public Object get(final String fieldName) {
                if (fieldName.equals("sku")) {
                    return getSku();
                } else if (fieldName.equals("thumbnail_resolution")) {
                    return getThumbnailResolution();
                }
                return null;
            }

            public final String getSku() {
                return sku;
            }

            public final com.yogento.api.models.image.ImageResolution getThumbnailResolution() {
                return thumbnailResolution;
            }

            @Override
            public int hashCode() {
                int hashCode = 17;
                hashCode = 31 * hashCode + getSku().hashCode();
                hashCode = 31 * hashCode + getThumbnailResolution().hashCode();
                return hashCode;
            }

            @Override
            public String toString() {
                final com.google.common.base.Objects.ToStringHelper helper = com.google.common.base.Objects.toStringHelper(this);
                helper.add("sku", getSku());
                helper.add("thumbnail_resolution", getThumbnailResolution());
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

                        oprot.writeString(getSku());

                        getThumbnailResolution().write(oprot);

                        oprot.writeListEnd();
                        break;

                    case org.thryft.protocol.TType.STRUCT:
                    default:
                        oprot.writeStructBegin(new org.thryft.protocol.TStruct("getProductThumbnailUrlRequest"));

                        oprot.writeFieldBegin(new org.thryft.protocol.TField("sku", org.thryft.protocol.TType.STRING, (short)-1));
                        oprot.writeString(getSku());
                        oprot.writeFieldEnd();

                        oprot.writeFieldBegin(new org.thryft.protocol.TField("thumbnail_resolution", org.thryft.protocol.TType.STRUCT, (short)-1));
                        getThumbnailResolution().write(oprot);
                        oprot.writeFieldEnd();

                        oprot.writeFieldStop();

                        oprot.writeStructEnd();
                        break;
                }
            }

            private final String sku;

            private final com.yogento.api.models.image.ImageResolution thumbnailResolution;
        }

        @SuppressWarnings({"serial"})
        public final static class getProductThumbnailUrlResponse implements org.thryft.TBase<getProductThumbnailUrlResponse> {
            public static class Builder {
                public Builder() {
                }

                public Builder(final getProductThumbnailUrlResponse other) {
                    this.returnValue = other.getReturnValue();
                }

                protected getProductThumbnailUrlResponse _build(final String returnValue) {
                    return new getProductThumbnailUrlResponse(returnValue);
                }

                public getProductThumbnailUrlResponse build() {
                    return _build(returnValue);
                }

                public Builder setReturnValue(final String returnValue) {
                    this.returnValue = returnValue;
                    return this;
                }

                private String returnValue;
            }

            public getProductThumbnailUrlResponse(final getProductThumbnailUrlResponse other) {
                this(other.getReturnValue());
            }

            public getProductThumbnailUrlResponse(final org.thryft.protocol.TProtocol iprot) throws java.io.IOException {
                returnValue = iprot.readString();
            }

            public getProductThumbnailUrlResponse(final String returnValue) {
                this.returnValue = com.google.common.base.Preconditions.checkNotNull(returnValue, "com.yogento.api.services.catalog.CatalogService.getProductThumbnailUrl: missing returnValue");
            }

            @Override
            public int compareTo(final getProductThumbnailUrlResponse other) {
                throw new UnsupportedOperationException();
            }

            @Override
            public boolean equals(final Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof getProductThumbnailUrlResponse)) {
                    return false;
                }

                final getProductThumbnailUrlResponse other = (getProductThumbnailUrlResponse)otherObject;
                return
                    getReturnValue().equals(other.getReturnValue());
            }

            public Object get(final String fieldName) {
                if (fieldName.equals("return_value")) {
                    return getReturnValue();
                }
                return null;
            }

            public final String getReturnValue() {
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
                    case org.thryft.protocol.TType.VOID:
                    case org.thryft.protocol.TType.LIST:
                        oprot.writeListBegin(new org.thryft.protocol.TList(org.thryft.protocol.TType.VOID, 1));

                        oprot.writeString(getReturnValue());

                        oprot.writeListEnd();
                        break;

                    case org.thryft.protocol.TType.STRUCT:
                    default:
                        oprot.writeStructBegin(new org.thryft.protocol.TStruct("getProductThumbnailUrlResponse"));

                        oprot.writeFieldBegin(new org.thryft.protocol.TField("return_value", org.thryft.protocol.TType.STRING, (short)-1));
                        oprot.writeString(getReturnValue());
                        oprot.writeFieldEnd();

                        oprot.writeFieldStop();

                        oprot.writeStructEnd();
                        break;
                }
            }

            private final String returnValue;
        }

        @SuppressWarnings({"serial"})
        public final static class getSampleProductThumbnailUrlRequest implements org.thryft.TBase<getSampleProductThumbnailUrlRequest> {
            public static class Builder {
                public Builder() {
                }

                public Builder(final getSampleProductThumbnailUrlRequest other) {
                    this.sku = other.getSku();
                    this.thumbnailResolution = other.getThumbnailResolution();
                }

                protected getSampleProductThumbnailUrlRequest _build(final String sku, final com.yogento.api.models.image.ImageResolution thumbnailResolution) {
                    return new getSampleProductThumbnailUrlRequest(sku, thumbnailResolution);
                }

                public getSampleProductThumbnailUrlRequest build() {
                    return _build(sku, thumbnailResolution);
                }

                public Builder setSku(final String sku) {
                    this.sku = sku;
                    return this;
                }

                public Builder setThumbnailResolution(final com.yogento.api.models.image.ImageResolution thumbnailResolution) {
                    this.thumbnailResolution = thumbnailResolution;
                    return this;
                }

                private String sku;
                private com.yogento.api.models.image.ImageResolution thumbnailResolution;
            }

            public getSampleProductThumbnailUrlRequest(final getSampleProductThumbnailUrlRequest other) {
                this(other.getSku(), other.getThumbnailResolution());
            }

            public getSampleProductThumbnailUrlRequest(final org.thryft.protocol.TProtocol iprot) throws java.io.IOException {
                this(iprot, org.thryft.protocol.TType.STRUCT);
            }

            public getSampleProductThumbnailUrlRequest(final org.thryft.protocol.TProtocol iprot, final byte readAsTType) throws java.io.IOException {
                String sku = null;
                com.yogento.api.models.image.ImageResolution thumbnailResolution = null;

                switch (readAsTType) {
                    case org.thryft.protocol.TType.LIST:
                        iprot.readListBegin();
                        sku = iprot.readString();
                        thumbnailResolution = new com.yogento.api.models.image.ImageResolution(iprot);
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
                            } else if (ifield.name.equals("thumbnail_resolution")) {
                                thumbnailResolution = new com.yogento.api.models.image.ImageResolution(iprot);
                            }
                            iprot.readFieldEnd();
                        }
                        iprot.readStructEnd();
                        break;
                }

                this.sku = com.google.common.base.Preconditions.checkNotNull(sku, "com.yogento.api.services.catalog.getSampleProductThumbnailUrlRequest: missing sku");
                this.thumbnailResolution = com.google.common.base.Preconditions.checkNotNull(thumbnailResolution, "com.yogento.api.services.catalog.getSampleProductThumbnailUrlRequest: missing thumbnailResolution");
            }

            public getSampleProductThumbnailUrlRequest(final String sku, final com.yogento.api.models.image.ImageResolution thumbnailResolution) {
                this.sku = com.google.common.base.Preconditions.checkNotNull(sku, "com.yogento.api.services.catalog.getSampleProductThumbnailUrlRequest: missing sku");
                this.thumbnailResolution = com.google.common.base.Preconditions.checkNotNull(thumbnailResolution, "com.yogento.api.services.catalog.getSampleProductThumbnailUrlRequest: missing thumbnailResolution");
            }

            @Override
            public int compareTo(final getSampleProductThumbnailUrlRequest other) {
                throw new UnsupportedOperationException();
            }

            @Override
            public boolean equals(final Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof getSampleProductThumbnailUrlRequest)) {
                    return false;
                }

                final getSampleProductThumbnailUrlRequest other = (getSampleProductThumbnailUrlRequest)otherObject;
                return
                    getSku().equals(other.getSku()) &&
                    getThumbnailResolution().equals(other.getThumbnailResolution());
            }

            public Object get(final String fieldName) {
                if (fieldName.equals("sku")) {
                    return getSku();
                } else if (fieldName.equals("thumbnail_resolution")) {
                    return getThumbnailResolution();
                }
                return null;
            }

            public final String getSku() {
                return sku;
            }

            public final com.yogento.api.models.image.ImageResolution getThumbnailResolution() {
                return thumbnailResolution;
            }

            @Override
            public int hashCode() {
                int hashCode = 17;
                hashCode = 31 * hashCode + getSku().hashCode();
                hashCode = 31 * hashCode + getThumbnailResolution().hashCode();
                return hashCode;
            }

            @Override
            public String toString() {
                final com.google.common.base.Objects.ToStringHelper helper = com.google.common.base.Objects.toStringHelper(this);
                helper.add("sku", getSku());
                helper.add("thumbnail_resolution", getThumbnailResolution());
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

                        oprot.writeString(getSku());

                        getThumbnailResolution().write(oprot);

                        oprot.writeListEnd();
                        break;

                    case org.thryft.protocol.TType.STRUCT:
                    default:
                        oprot.writeStructBegin(new org.thryft.protocol.TStruct("getSampleProductThumbnailUrlRequest"));

                        oprot.writeFieldBegin(new org.thryft.protocol.TField("sku", org.thryft.protocol.TType.STRING, (short)-1));
                        oprot.writeString(getSku());
                        oprot.writeFieldEnd();

                        oprot.writeFieldBegin(new org.thryft.protocol.TField("thumbnail_resolution", org.thryft.protocol.TType.STRUCT, (short)-1));
                        getThumbnailResolution().write(oprot);
                        oprot.writeFieldEnd();

                        oprot.writeFieldStop();

                        oprot.writeStructEnd();
                        break;
                }
            }

            private final String sku;

            private final com.yogento.api.models.image.ImageResolution thumbnailResolution;
        }

        @SuppressWarnings({"serial"})
        public final static class getSampleProductThumbnailUrlResponse implements org.thryft.TBase<getSampleProductThumbnailUrlResponse> {
            public static class Builder {
                public Builder() {
                }

                public Builder(final getSampleProductThumbnailUrlResponse other) {
                    this.returnValue = other.getReturnValue();
                }

                protected getSampleProductThumbnailUrlResponse _build(final String returnValue) {
                    return new getSampleProductThumbnailUrlResponse(returnValue);
                }

                public getSampleProductThumbnailUrlResponse build() {
                    return _build(returnValue);
                }

                public Builder setReturnValue(final String returnValue) {
                    this.returnValue = returnValue;
                    return this;
                }

                private String returnValue;
            }

            public getSampleProductThumbnailUrlResponse(final getSampleProductThumbnailUrlResponse other) {
                this(other.getReturnValue());
            }

            public getSampleProductThumbnailUrlResponse(final org.thryft.protocol.TProtocol iprot) throws java.io.IOException {
                returnValue = iprot.readString();
            }

            public getSampleProductThumbnailUrlResponse(final String returnValue) {
                this.returnValue = com.google.common.base.Preconditions.checkNotNull(returnValue, "com.yogento.api.services.catalog.CatalogService.getSampleProductThumbnailUrl: missing returnValue");
            }

            @Override
            public int compareTo(final getSampleProductThumbnailUrlResponse other) {
                throw new UnsupportedOperationException();
            }

            @Override
            public boolean equals(final Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof getSampleProductThumbnailUrlResponse)) {
                    return false;
                }

                final getSampleProductThumbnailUrlResponse other = (getSampleProductThumbnailUrlResponse)otherObject;
                return
                    getReturnValue().equals(other.getReturnValue());
            }

            public Object get(final String fieldName) {
                if (fieldName.equals("return_value")) {
                    return getReturnValue();
                }
                return null;
            }

            public final String getReturnValue() {
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
                    case org.thryft.protocol.TType.VOID:
                    case org.thryft.protocol.TType.LIST:
                        oprot.writeListBegin(new org.thryft.protocol.TList(org.thryft.protocol.TType.VOID, 1));

                        oprot.writeString(getReturnValue());

                        oprot.writeListEnd();
                        break;

                    case org.thryft.protocol.TType.STRUCT:
                    default:
                        oprot.writeStructBegin(new org.thryft.protocol.TStruct("getSampleProductThumbnailUrlResponse"));

                        oprot.writeFieldBegin(new org.thryft.protocol.TField("return_value", org.thryft.protocol.TType.STRING, (short)-1));
                        oprot.writeString(getReturnValue());
                        oprot.writeFieldEnd();

                        oprot.writeFieldStop();

                        oprot.writeStructEnd();
                        break;
                }
            }

            private final String returnValue;
        }

        @SuppressWarnings({"serial"})
        public final static class getSampleProductBySkuRequest implements org.thryft.TBase<getSampleProductBySkuRequest> {
            public static class Builder {
                public Builder() {
                }

                public Builder(final getSampleProductBySkuRequest other) {
                    this.sku = other.getSku();
                }

                protected getSampleProductBySkuRequest _build(final String sku) {
                    return new getSampleProductBySkuRequest(sku);
                }

                public getSampleProductBySkuRequest build() {
                    return _build(sku);
                }

                public Builder setSku(final String sku) {
                    this.sku = sku;
                    return this;
                }

                private String sku;
            }

            public getSampleProductBySkuRequest(final getSampleProductBySkuRequest other) {
                this(other.getSku());
            }

            public getSampleProductBySkuRequest(final org.thryft.protocol.TProtocol iprot) throws java.io.IOException {
                this(iprot, org.thryft.protocol.TType.STRUCT);
            }

            public getSampleProductBySkuRequest(final org.thryft.protocol.TProtocol iprot, final byte readAsTType) throws java.io.IOException {
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

                this.sku = com.google.common.base.Preconditions.checkNotNull(sku, "com.yogento.api.services.catalog.getSampleProductBySkuRequest: missing sku");
            }

            public getSampleProductBySkuRequest(final String sku) {
                this.sku = com.google.common.base.Preconditions.checkNotNull(sku, "com.yogento.api.services.catalog.getSampleProductBySkuRequest: missing sku");
            }

            @Override
            public int compareTo(final getSampleProductBySkuRequest other) {
                throw new UnsupportedOperationException();
            }

            @Override
            public boolean equals(final Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof getSampleProductBySkuRequest)) {
                    return false;
                }

                final getSampleProductBySkuRequest other = (getSampleProductBySkuRequest)otherObject;
                return
                    getSku().equals(other.getSku());
            }

            public Object get(final String fieldName) {
                if (fieldName.equals("sku")) {
                    return getSku();
                }
                return null;
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
                        oprot.writeStructBegin(new org.thryft.protocol.TStruct("getSampleProductBySkuRequest"));

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
        public final static class getSampleProductBySkuResponse implements org.thryft.TBase<getSampleProductBySkuResponse> {
            public static class Builder {
                public Builder() {
                }

                public Builder(final getSampleProductBySkuResponse other) {
                    this.returnValue = other.getReturnValue();
                }

                protected getSampleProductBySkuResponse _build(final com.yogento.api.models.catalog.product.Product returnValue) {
                    return new getSampleProductBySkuResponse(returnValue);
                }

                public getSampleProductBySkuResponse build() {
                    return _build(returnValue);
                }

                public Builder setReturnValue(final com.yogento.api.models.catalog.product.Product returnValue) {
                    this.returnValue = returnValue;
                    return this;
                }

                private com.yogento.api.models.catalog.product.Product returnValue;
            }

            public getSampleProductBySkuResponse(final getSampleProductBySkuResponse other) {
                this(other.getReturnValue());
            }

            public getSampleProductBySkuResponse(final org.thryft.protocol.TProtocol iprot) throws java.io.IOException {
                returnValue = new com.yogento.api.models.catalog.product.Product(iprot);
            }

            public getSampleProductBySkuResponse(final com.yogento.api.models.catalog.product.Product returnValue) {
                this.returnValue = com.google.common.base.Preconditions.checkNotNull(returnValue, "com.yogento.api.services.catalog.CatalogService.getSampleProductBySku: missing returnValue");
            }

            @Override
            public int compareTo(final getSampleProductBySkuResponse other) {
                throw new UnsupportedOperationException();
            }

            @Override
            public boolean equals(final Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof getSampleProductBySkuResponse)) {
                    return false;
                }

                final getSampleProductBySkuResponse other = (getSampleProductBySkuResponse)otherObject;
                return
                    getReturnValue().equals(other.getReturnValue());
            }

            public Object get(final String fieldName) {
                if (fieldName.equals("return_value")) {
                    return getReturnValue();
                }
                return null;
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
                        oprot.writeStructBegin(new org.thryft.protocol.TStruct("getSampleProductBySkuResponse"));

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
        public final static class getSampleProductsRequest implements org.thryft.TBase<getSampleProductsRequest> {
            public static class Builder {
                public Builder() {
                }

                public Builder(final getSampleProductsRequest other) {
                }

                protected getSampleProductsRequest _build() {
                    return new getSampleProductsRequest();
                }

                public getSampleProductsRequest build() {
                    return _build();
                }
            }

            public getSampleProductsRequest() {
            }

            public getSampleProductsRequest(final getSampleProductsRequest other) {
            }

            public getSampleProductsRequest(final org.thryft.protocol.TProtocol iprot) throws java.io.IOException {
                this(iprot, org.thryft.protocol.TType.STRUCT);
            }

            public getSampleProductsRequest(final org.thryft.protocol.TProtocol iprot, final byte readAsTType) throws java.io.IOException {
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

            @Override
            public int compareTo(final getSampleProductsRequest other) {
                throw new UnsupportedOperationException();
            }

            @Override
            public boolean equals(final Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof getSampleProductsRequest)) {
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
                        oprot.writeStructBegin(new org.thryft.protocol.TStruct("getSampleProductsRequest"));

                        oprot.writeFieldStop();

                        oprot.writeStructEnd();
                        break;
                }
            }
        }

        @SuppressWarnings({"serial"})
        public final static class getSampleProductsResponse implements org.thryft.TBase<getSampleProductsResponse> {
            public static class Builder {
                public Builder() {
                }

                public Builder(final getSampleProductsResponse other) {
                    this.returnValue = other.getReturnValue();
                }

                protected getSampleProductsResponse _build(final com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.Product> returnValue) {
                    return new getSampleProductsResponse(returnValue);
                }

                public getSampleProductsResponse build() {
                    return _build(returnValue);
                }

                public Builder setReturnValue(final com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.Product> returnValue) {
                    this.returnValue = returnValue;
                    return this;
                }

                private com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.Product> returnValue;
            }

            public getSampleProductsResponse(final getSampleProductsResponse other) {
                this(other.getReturnValue());
            }

            public getSampleProductsResponse(final org.thryft.protocol.TProtocol iprot) throws java.io.IOException {
                returnValue = (new com.google.common.base.Function<org.thryft.protocol.TProtocol, com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.Product>>() {
                    @Override
                    public com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.Product> apply(final org.thryft.protocol.TProtocol iprot) {
                        try {
                            final org.thryft.protocol.TSet sequenceBegin = iprot.readSetBegin();
                            final java.util.Set<com.yogento.api.models.catalog.product.Product> sequence = new java.util.LinkedHashSet<com.yogento.api.models.catalog.product.Product>();
                            for (int elementI = 0; elementI < sequenceBegin.size; elementI++) {
                                sequence.add(new com.yogento.api.models.catalog.product.Product(iprot));
                            }
                            iprot.readSetEnd();
                            return com.google.common.collect.ImmutableSet.copyOf(sequence);
                        } catch (final java.io.IOException e) {
                            return com.google.common.collect.ImmutableSet.of();
                        }
                    }
                }).apply(iprot);
            }

            public getSampleProductsResponse(final com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.Product> returnValue) {
                this.returnValue = com.google.common.base.Preconditions.checkNotNull(returnValue, "com.yogento.api.services.catalog.CatalogService.getSampleProducts: missing returnValue");
            }

            @Override
            public int compareTo(final getSampleProductsResponse other) {
                throw new UnsupportedOperationException();
            }

            @Override
            public boolean equals(final Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof getSampleProductsResponse)) {
                    return false;
                }

                final getSampleProductsResponse other = (getSampleProductsResponse)otherObject;
                return
                    getReturnValue().equals(other.getReturnValue());
            }

            public Object get(final String fieldName) {
                if (fieldName.equals("return_value")) {
                    return getReturnValue();
                }
                return null;
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
                        oprot.writeStructBegin(new org.thryft.protocol.TStruct("getSampleProductsResponse"));

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
        public final static class headProductBySkuRequest implements org.thryft.TBase<headProductBySkuRequest> {
            public static class Builder {
                public Builder() {
                }

                public Builder(final headProductBySkuRequest other) {
                    this.sku = other.getSku();
                }

                protected headProductBySkuRequest _build(final String sku) {
                    return new headProductBySkuRequest(sku);
                }

                public headProductBySkuRequest build() {
                    return _build(sku);
                }

                public Builder setSku(final String sku) {
                    this.sku = sku;
                    return this;
                }

                private String sku;
            }

            public headProductBySkuRequest(final headProductBySkuRequest other) {
                this(other.getSku());
            }

            public headProductBySkuRequest(final org.thryft.protocol.TProtocol iprot) throws java.io.IOException {
                this(iprot, org.thryft.protocol.TType.STRUCT);
            }

            public headProductBySkuRequest(final org.thryft.protocol.TProtocol iprot, final byte readAsTType) throws java.io.IOException {
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

                this.sku = com.google.common.base.Preconditions.checkNotNull(sku, "com.yogento.api.services.catalog.headProductBySkuRequest: missing sku");
            }

            public headProductBySkuRequest(final String sku) {
                this.sku = com.google.common.base.Preconditions.checkNotNull(sku, "com.yogento.api.services.catalog.headProductBySkuRequest: missing sku");
            }

            @Override
            public int compareTo(final headProductBySkuRequest other) {
                throw new UnsupportedOperationException();
            }

            @Override
            public boolean equals(final Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof headProductBySkuRequest)) {
                    return false;
                }

                final headProductBySkuRequest other = (headProductBySkuRequest)otherObject;
                return
                    getSku().equals(other.getSku());
            }

            public Object get(final String fieldName) {
                if (fieldName.equals("sku")) {
                    return getSku();
                }
                return null;
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
                        oprot.writeStructBegin(new org.thryft.protocol.TStruct("headProductBySkuRequest"));

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
        public final static class headProductBySkuResponse implements org.thryft.TBase<headProductBySkuResponse> {
            public static class Builder {
                public Builder() {
                }

                public Builder(final headProductBySkuResponse other) {
                    this.returnValue = other.isReturnValue();
                }

                protected headProductBySkuResponse _build(final boolean returnValue) {
                    return new headProductBySkuResponse(returnValue);
                }

                public headProductBySkuResponse build() {
                    return _build(returnValue);
                }

                public Builder setReturnValue(final boolean returnValue) {
                    this.returnValue = returnValue;
                    return this;
                }

                private Boolean returnValue;
            }

            public headProductBySkuResponse(final headProductBySkuResponse other) {
                this(other.isReturnValue());
            }

            public headProductBySkuResponse(final org.thryft.protocol.TProtocol iprot) throws java.io.IOException {
                returnValue = iprot.readBool();
            }

            public headProductBySkuResponse(final boolean returnValue) {
                this.returnValue = returnValue;
            }

            public headProductBySkuResponse(final Boolean returnValue) {
                this.returnValue = returnValue;
            }

            @Override
            public int compareTo(final headProductBySkuResponse other) {
                throw new UnsupportedOperationException();
            }

            @Override
            public boolean equals(final Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof headProductBySkuResponse)) {
                    return false;
                }

                final headProductBySkuResponse other = (headProductBySkuResponse)otherObject;
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
                        oprot.writeStructBegin(new org.thryft.protocol.TStruct("headProductBySkuResponse"));

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
        public final static class putProductRequest implements org.thryft.TBase<putProductRequest> {
            public static class Builder {
                public Builder() {
                }

                public Builder(final putProductRequest other) {
                    this.product = other.getProduct();
                }

                protected putProductRequest _build(final com.yogento.api.models.catalog.product.Product product) {
                    return new putProductRequest(product);
                }

                public putProductRequest build() {
                    return _build(product);
                }

                public Builder setProduct(final com.yogento.api.models.catalog.product.Product product) {
                    this.product = product;
                    return this;
                }

                private com.yogento.api.models.catalog.product.Product product;
            }

            public putProductRequest(final putProductRequest other) {
                this(other.getProduct());
            }

            public putProductRequest(final org.thryft.protocol.TProtocol iprot) throws java.io.IOException {
                this(iprot, org.thryft.protocol.TType.STRUCT);
            }

            public putProductRequest(final org.thryft.protocol.TProtocol iprot, final byte readAsTType) throws java.io.IOException {
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

                this.product = com.google.common.base.Preconditions.checkNotNull(product, "com.yogento.api.services.catalog.putProductRequest: missing product");
            }

            public putProductRequest(final com.yogento.api.models.catalog.product.Product product) {
                this.product = com.google.common.base.Preconditions.checkNotNull(product, "com.yogento.api.services.catalog.putProductRequest: missing product");
            }

            @Override
            public int compareTo(final putProductRequest other) {
                throw new UnsupportedOperationException();
            }

            @Override
            public boolean equals(final Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof putProductRequest)) {
                    return false;
                }

                final putProductRequest other = (putProductRequest)otherObject;
                return
                    getProduct().equals(other.getProduct());
            }

            public Object get(final String fieldName) {
                if (fieldName.equals("product")) {
                    return getProduct();
                }
                return null;
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
                        oprot.writeStructBegin(new org.thryft.protocol.TStruct("putProductRequest"));

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
        public final static class putProductResponse implements org.thryft.TBase<putProductResponse> {
            public static class Builder {
                public Builder() {
                }

                public Builder(final putProductResponse other) {
                }

                protected putProductResponse _build() {
                    return new putProductResponse();
                }

                public putProductResponse build() {
                    return _build();
                }
            }

            public putProductResponse() {
            }

            public putProductResponse(final putProductResponse other) {
            }

            public putProductResponse(final org.thryft.protocol.TProtocol iprot) throws java.io.IOException {
            }

            @Override
            public int compareTo(final putProductResponse other) {
                throw new UnsupportedOperationException();
            }

            @Override
            public boolean equals(final Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof putProductResponse)) {
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
                        oprot.writeStructBegin(new org.thryft.protocol.TStruct("putProductResponse"));

                        oprot.writeFieldStop();

                        oprot.writeStructEnd();
                        break;
                }
            }
        }

        @SuppressWarnings({"serial"})
        public final static class putProductsRequest implements org.thryft.TBase<putProductsRequest> {
            public static class Builder {
                public Builder() {
                }

                public Builder(final putProductsRequest other) {
                    this.products = other.getProducts();
                }

                protected putProductsRequest _build(final com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.Product> products) {
                    return new putProductsRequest(products);
                }

                public putProductsRequest build() {
                    return _build(products);
                }

                public Builder setProducts(final com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.Product> products) {
                    this.products = products;
                    return this;
                }

                private com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.Product> products;
            }

            public putProductsRequest(final putProductsRequest other) {
                this(other.getProducts());
            }

            public putProductsRequest(final org.thryft.protocol.TProtocol iprot) throws java.io.IOException {
                this(iprot, org.thryft.protocol.TType.STRUCT);
            }

            public putProductsRequest(final org.thryft.protocol.TProtocol iprot, final byte readAsTType) throws java.io.IOException {
                com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.Product> products = null;

                switch (readAsTType) {
                    case org.thryft.protocol.TType.LIST:
                        iprot.readListBegin();
                        products = (new com.google.common.base.Function<org.thryft.protocol.TProtocol, com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.Product>>() {
                            @Override
                            public com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.Product> apply(final org.thryft.protocol.TProtocol iprot) {
                                try {
                                    final org.thryft.protocol.TSet sequenceBegin = iprot.readSetBegin();
                                    final java.util.Set<com.yogento.api.models.catalog.product.Product> sequence = new java.util.LinkedHashSet<com.yogento.api.models.catalog.product.Product>();
                                    for (int elementI = 0; elementI < sequenceBegin.size; elementI++) {
                                        sequence.add(new com.yogento.api.models.catalog.product.Product(iprot));
                                    }
                                    iprot.readSetEnd();
                                    return com.google.common.collect.ImmutableSet.copyOf(sequence);
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
                                            final java.util.Set<com.yogento.api.models.catalog.product.Product> sequence = new java.util.LinkedHashSet<com.yogento.api.models.catalog.product.Product>();
                                            for (int elementI = 0; elementI < sequenceBegin.size; elementI++) {
                                                sequence.add(new com.yogento.api.models.catalog.product.Product(iprot));
                                            }
                                            iprot.readSetEnd();
                                            return com.google.common.collect.ImmutableSet.copyOf(sequence);
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

                this.products = com.google.common.base.Preconditions.checkNotNull(products, "com.yogento.api.services.catalog.putProductsRequest: missing products");
            }

            public putProductsRequest(final com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.Product> products) {
                this.products = com.google.common.base.Preconditions.checkNotNull(products, "com.yogento.api.services.catalog.putProductsRequest: missing products");
            }

            @Override
            public int compareTo(final putProductsRequest other) {
                throw new UnsupportedOperationException();
            }

            @Override
            public boolean equals(final Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof putProductsRequest)) {
                    return false;
                }

                final putProductsRequest other = (putProductsRequest)otherObject;
                return
                    getProducts().equals(other.getProducts());
            }

            public Object get(final String fieldName) {
                if (fieldName.equals("products")) {
                    return getProducts();
                }
                return null;
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
                        oprot.writeStructBegin(new org.thryft.protocol.TStruct("putProductsRequest"));

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
        public final static class putProductsResponse implements org.thryft.TBase<putProductsResponse> {
            public static class Builder {
                public Builder() {
                }

                public Builder(final putProductsResponse other) {
                }

                protected putProductsResponse _build() {
                    return new putProductsResponse();
                }

                public putProductsResponse build() {
                    return _build();
                }
            }

            public putProductsResponse() {
            }

            public putProductsResponse(final putProductsResponse other) {
            }

            public putProductsResponse(final org.thryft.protocol.TProtocol iprot) throws java.io.IOException {
            }

            @Override
            public int compareTo(final putProductsResponse other) {
                throw new UnsupportedOperationException();
            }

            @Override
            public boolean equals(final Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof putProductsResponse)) {
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
                        oprot.writeStructBegin(new org.thryft.protocol.TStruct("putProductsResponse"));

                        oprot.writeFieldStop();

                        oprot.writeStructEnd();
                        break;
                }
            }
        }
    }

    public boolean deleteProductBySku(String sku);

    public void deleteProducts();

    public int getProductCount();

    public com.yogento.api.models.catalog.product.Product getProductBySku(String sku) throws com.yogento.api.services.catalog.NoSuchProductException;

    public com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.Product> getProducts(Boolean includeDisabled, String query);

    public com.google.common.collect.ImmutableSet<String> getProductSkus();

    public com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.Product> getProductsBySkus(com.google.common.collect.ImmutableSet<String> skus) throws com.yogento.api.services.catalog.NoSuchProductException;

    public String getProductThumbnailUrl(String sku, com.yogento.api.models.image.ImageResolution thumbnailResolution) throws com.yogento.api.services.catalog.NoSuchProductException, com.yogento.api.services.catalog.NoSuchProductImageException;

    public String getSampleProductThumbnailUrl(String sku, com.yogento.api.models.image.ImageResolution thumbnailResolution) throws com.yogento.api.services.catalog.NoSuchProductException, com.yogento.api.services.catalog.NoSuchProductImageException;

    public com.yogento.api.models.catalog.product.Product getSampleProductBySku(String sku) throws com.yogento.api.services.catalog.NoSuchProductException;

    public com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.Product> getSampleProducts();

    public boolean headProductBySku(String sku);

    public void putProduct(com.yogento.api.models.catalog.product.Product product) throws com.yogento.api.services.catalog.ProductIoException;

    public void putProducts(com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.Product> products) throws com.yogento.api.services.catalog.ProductIoException;
}
