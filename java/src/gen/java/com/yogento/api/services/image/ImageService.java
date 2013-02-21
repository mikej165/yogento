package com.yogento.api.services.image;

public interface ImageService {
    public static class Messages {
        @SuppressWarnings({"serial"})
        public final static class deleteImageThumbnailRequest implements org.apache.thrift.TBase<deleteImageThumbnailRequest, org.apache.thrift.TFieldIdEnum> {
            public static class Builder {
                public Builder() {
                }

                public Builder(final deleteImageThumbnailRequest other) {
                    this.imageUrl = other.getImageUrl();
                    this.thumbnailResolution = other.getThumbnailResolution();
                }

                protected deleteImageThumbnailRequest _build(final String imageUrl, final com.yogento.api.models.image.ImageResolution thumbnailResolution) {
                    return new deleteImageThumbnailRequest(imageUrl, thumbnailResolution);
                }

                public deleteImageThumbnailRequest build() {
                    return _build(imageUrl, thumbnailResolution);
                }

                public Builder setImageUrl(final String imageUrl) {
                    this.imageUrl = imageUrl;
                    return this;
                }

                public Builder setThumbnailResolution(final com.yogento.api.models.image.ImageResolution thumbnailResolution) {
                    this.thumbnailResolution = thumbnailResolution;
                    return this;
                }

                private String imageUrl;
                private com.yogento.api.models.image.ImageResolution thumbnailResolution;
            }

            public deleteImageThumbnailRequest(final deleteImageThumbnailRequest other) {
                this(other.getImageUrl(), other.getThumbnailResolution());
            }

            public deleteImageThumbnailRequest(final org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
                this(iprot, org.apache.thrift.protocol.TType.STRUCT);
            }

            public deleteImageThumbnailRequest(final org.apache.thrift.protocol.TProtocol iprot, final byte readAsTType) throws org.apache.thrift.TException {
                String imageUrl = null;
                com.yogento.api.models.image.ImageResolution thumbnailResolution = null;

                switch (readAsTType) {
                    case org.apache.thrift.protocol.TType.LIST:
                        iprot.readListBegin();
                        imageUrl = iprot.readString();
                        thumbnailResolution = new com.yogento.api.models.image.ImageResolution(iprot);
                        iprot.readListEnd();
                        break;

                    case org.apache.thrift.protocol.TType.STRUCT:
                    default:
                        iprot.readStructBegin();
                        while (true) {
                            org.apache.thrift.protocol.TField ifield = iprot.readFieldBegin();
                            if (ifield.type == org.apache.thrift.protocol.TType.STOP) {
                                break;
                            } else                 if (ifield.name.equals("image_url")) {
                                imageUrl = iprot.readString();
                            } else if (ifield.name.equals("thumbnail_resolution")) {
                                thumbnailResolution = new com.yogento.api.models.image.ImageResolution(iprot);
                            }
                            iprot.readFieldEnd();
                        }
                        iprot.readStructEnd();
                        break;
                }

                this.imageUrl = com.google.common.base.Preconditions.checkNotNull(imageUrl);
                this.thumbnailResolution = com.google.common.base.Preconditions.checkNotNull(thumbnailResolution);
            }

            public deleteImageThumbnailRequest(final String imageUrl, final com.yogento.api.models.image.ImageResolution thumbnailResolution) {
                this.imageUrl = com.google.common.base.Preconditions.checkNotNull(imageUrl);
                this.thumbnailResolution = com.google.common.base.Preconditions.checkNotNull(thumbnailResolution);
            }

            @Override
            public void clear() {
                throw new UnsupportedOperationException();
            }

            @Override
            public int compareTo(final deleteImageThumbnailRequest other) {
                throw new UnsupportedOperationException();
            }

            @Override
            public org.apache.thrift.TBase<deleteImageThumbnailRequest, org.apache.thrift.TFieldIdEnum> deepCopy() {
                throw new UnsupportedOperationException();
            }

            @Override
            public boolean equals(final Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof deleteImageThumbnailRequest)) {
                    return false;
                }

                final deleteImageThumbnailRequest other = (deleteImageThumbnailRequest)otherObject;
                return
                    getImageUrl().equals(other.getImageUrl()) &&
                    getThumbnailResolution().equals(other.getThumbnailResolution());
            }

            @Override
            public org.apache.thrift.TFieldIdEnum fieldForId(final int fieldId) {
                throw new UnsupportedOperationException();
            }

            public Object get(final String fieldName) {
                if (fieldName.equals("image_url")) {
                    return getImageUrl();
                } else if (fieldName.equals("thumbnail_resolution")) {
                    return getThumbnailResolution();
                }
                return null;
            }

            @Override
            public Object getFieldValue(final org.apache.thrift.TFieldIdEnum field) {
                throw new UnsupportedOperationException();
            }

            public final String getImageUrl() {
                return imageUrl;
            }

            public final com.yogento.api.models.image.ImageResolution getThumbnailResolution() {
                return thumbnailResolution;
            }

            @Override
            public int hashCode() {
                int hashCode = 17;
                hashCode = 31 * hashCode + getImageUrl().hashCode();
                hashCode = 31 * hashCode + getThumbnailResolution().hashCode();
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
                helper.add("image_url", getImageUrl());
                helper.add("thumbnail_resolution", getThumbnailResolution());
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
                        oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.VOID, 2));

                        oprot.writeString(getImageUrl());

                        getThumbnailResolution().write(oprot);

                        oprot.writeListEnd();
                        break;

                    case org.apache.thrift.protocol.TType.STRUCT:
                    default:
                        oprot.writeStructBegin(new org.apache.thrift.protocol.TStruct("deleteImageThumbnailRequest"));

                        oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("image_url", org.apache.thrift.protocol.TType.STRING, (short)-1));
                        oprot.writeString(getImageUrl());
                        oprot.writeFieldEnd();

                        oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("thumbnail_resolution", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                        getThumbnailResolution().write(oprot);
                        oprot.writeFieldEnd();

                        oprot.writeFieldStop();

                        oprot.writeStructEnd();
                        break;
                }
            }

            private final String imageUrl;
            private final com.yogento.api.models.image.ImageResolution thumbnailResolution;
        }

        @SuppressWarnings({"serial"})
        public final static class deleteImageThumbnailResponse implements org.apache.thrift.TBase<deleteImageThumbnailResponse, org.apache.thrift.TFieldIdEnum> {
            public static class Builder {
                public Builder() {
                }

                public Builder(final deleteImageThumbnailResponse other) {
                    this.returnValue = other.isReturnValue();
                }

                protected deleteImageThumbnailResponse _build(final boolean returnValue) {
                    return new deleteImageThumbnailResponse(returnValue);
                }

                public deleteImageThumbnailResponse build() {
                    return _build(returnValue);
                }

                public Builder setReturnValue(final boolean returnValue) {
                    this.returnValue = returnValue;
                    return this;
                }

                private Boolean returnValue;
            }

            public deleteImageThumbnailResponse(final deleteImageThumbnailResponse other) {
                this(other.isReturnValue());
            }

            public deleteImageThumbnailResponse(final org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
                returnValue = iprot.readBool();
            }

            public deleteImageThumbnailResponse(final boolean returnValue) {
                this.returnValue = returnValue;
            }

            public deleteImageThumbnailResponse(final Boolean returnValue) {
                this.returnValue = returnValue;
            }

            @Override
            public void clear() {
                throw new UnsupportedOperationException();
            }

            @Override
            public int compareTo(final deleteImageThumbnailResponse other) {
                throw new UnsupportedOperationException();
            }

            @Override
            public org.apache.thrift.TBase<deleteImageThumbnailResponse, org.apache.thrift.TFieldIdEnum> deepCopy() {
                throw new UnsupportedOperationException();
            }

            @Override
            public boolean equals(final Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof deleteImageThumbnailResponse)) {
                    return false;
                }

                final deleteImageThumbnailResponse other = (deleteImageThumbnailResponse)otherObject;
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
            public void setFieldValue(final org.apache.thrift.TFieldIdEnum field, Object value) {
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
                        oprot.writeStructBegin(new org.apache.thrift.protocol.TStruct("deleteImageThumbnailResponse"));

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
        public final static class getImageThumbnailUrlRequest implements org.apache.thrift.TBase<getImageThumbnailUrlRequest, org.apache.thrift.TFieldIdEnum> {
            public static class Builder {
                public Builder() {
                }

                public Builder(final getImageThumbnailUrlRequest other) {
                    this.imageUrl = other.getImageUrl();
                    this.thumbnailResolution = other.getThumbnailResolution();
                }

                protected getImageThumbnailUrlRequest _build(final String imageUrl, final com.yogento.api.models.image.ImageResolution thumbnailResolution) {
                    return new getImageThumbnailUrlRequest(imageUrl, thumbnailResolution);
                }

                public getImageThumbnailUrlRequest build() {
                    return _build(imageUrl, thumbnailResolution);
                }

                public Builder setImageUrl(final String imageUrl) {
                    this.imageUrl = imageUrl;
                    return this;
                }

                public Builder setThumbnailResolution(final com.yogento.api.models.image.ImageResolution thumbnailResolution) {
                    this.thumbnailResolution = thumbnailResolution;
                    return this;
                }

                private String imageUrl;
                private com.yogento.api.models.image.ImageResolution thumbnailResolution;
            }

            public getImageThumbnailUrlRequest(final getImageThumbnailUrlRequest other) {
                this(other.getImageUrl(), other.getThumbnailResolution());
            }

            public getImageThumbnailUrlRequest(final org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
                this(iprot, org.apache.thrift.protocol.TType.STRUCT);
            }

            public getImageThumbnailUrlRequest(final org.apache.thrift.protocol.TProtocol iprot, final byte readAsTType) throws org.apache.thrift.TException {
                String imageUrl = null;
                com.yogento.api.models.image.ImageResolution thumbnailResolution = null;

                switch (readAsTType) {
                    case org.apache.thrift.protocol.TType.LIST:
                        iprot.readListBegin();
                        imageUrl = iprot.readString();
                        thumbnailResolution = new com.yogento.api.models.image.ImageResolution(iprot);
                        iprot.readListEnd();
                        break;

                    case org.apache.thrift.protocol.TType.STRUCT:
                    default:
                        iprot.readStructBegin();
                        while (true) {
                            org.apache.thrift.protocol.TField ifield = iprot.readFieldBegin();
                            if (ifield.type == org.apache.thrift.protocol.TType.STOP) {
                                break;
                            } else                 if (ifield.name.equals("image_url")) {
                                imageUrl = iprot.readString();
                            } else if (ifield.name.equals("thumbnail_resolution")) {
                                thumbnailResolution = new com.yogento.api.models.image.ImageResolution(iprot);
                            }
                            iprot.readFieldEnd();
                        }
                        iprot.readStructEnd();
                        break;
                }

                this.imageUrl = com.google.common.base.Preconditions.checkNotNull(imageUrl);
                this.thumbnailResolution = com.google.common.base.Preconditions.checkNotNull(thumbnailResolution);
            }

            public getImageThumbnailUrlRequest(final String imageUrl, final com.yogento.api.models.image.ImageResolution thumbnailResolution) {
                this.imageUrl = com.google.common.base.Preconditions.checkNotNull(imageUrl);
                this.thumbnailResolution = com.google.common.base.Preconditions.checkNotNull(thumbnailResolution);
            }

            @Override
            public void clear() {
                throw new UnsupportedOperationException();
            }

            @Override
            public int compareTo(final getImageThumbnailUrlRequest other) {
                throw new UnsupportedOperationException();
            }

            @Override
            public org.apache.thrift.TBase<getImageThumbnailUrlRequest, org.apache.thrift.TFieldIdEnum> deepCopy() {
                throw new UnsupportedOperationException();
            }

            @Override
            public boolean equals(final Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof getImageThumbnailUrlRequest)) {
                    return false;
                }

                final getImageThumbnailUrlRequest other = (getImageThumbnailUrlRequest)otherObject;
                return
                    getImageUrl().equals(other.getImageUrl()) &&
                    getThumbnailResolution().equals(other.getThumbnailResolution());
            }

            @Override
            public org.apache.thrift.TFieldIdEnum fieldForId(final int fieldId) {
                throw new UnsupportedOperationException();
            }

            public Object get(final String fieldName) {
                if (fieldName.equals("image_url")) {
                    return getImageUrl();
                } else if (fieldName.equals("thumbnail_resolution")) {
                    return getThumbnailResolution();
                }
                return null;
            }

            @Override
            public Object getFieldValue(final org.apache.thrift.TFieldIdEnum field) {
                throw new UnsupportedOperationException();
            }

            public final String getImageUrl() {
                return imageUrl;
            }

            public final com.yogento.api.models.image.ImageResolution getThumbnailResolution() {
                return thumbnailResolution;
            }

            @Override
            public int hashCode() {
                int hashCode = 17;
                hashCode = 31 * hashCode + getImageUrl().hashCode();
                hashCode = 31 * hashCode + getThumbnailResolution().hashCode();
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
                helper.add("image_url", getImageUrl());
                helper.add("thumbnail_resolution", getThumbnailResolution());
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
                        oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.VOID, 2));

                        oprot.writeString(getImageUrl());

                        getThumbnailResolution().write(oprot);

                        oprot.writeListEnd();
                        break;

                    case org.apache.thrift.protocol.TType.STRUCT:
                    default:
                        oprot.writeStructBegin(new org.apache.thrift.protocol.TStruct("getImageThumbnailUrlRequest"));

                        oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("image_url", org.apache.thrift.protocol.TType.STRING, (short)-1));
                        oprot.writeString(getImageUrl());
                        oprot.writeFieldEnd();

                        oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("thumbnail_resolution", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                        getThumbnailResolution().write(oprot);
                        oprot.writeFieldEnd();

                        oprot.writeFieldStop();

                        oprot.writeStructEnd();
                        break;
                }
            }

            private final String imageUrl;
            private final com.yogento.api.models.image.ImageResolution thumbnailResolution;
        }

        @SuppressWarnings({"serial"})
        public final static class getImageThumbnailUrlResponse implements org.apache.thrift.TBase<getImageThumbnailUrlResponse, org.apache.thrift.TFieldIdEnum> {
            public static class Builder {
                public Builder() {
                }

                public Builder(final getImageThumbnailUrlResponse other) {
                    this.returnValue = other.getReturnValue();
                }

                protected getImageThumbnailUrlResponse _build(final String returnValue) {
                    return new getImageThumbnailUrlResponse(returnValue);
                }

                public getImageThumbnailUrlResponse build() {
                    return _build(returnValue);
                }

                public Builder setReturnValue(final String returnValue) {
                    this.returnValue = returnValue;
                    return this;
                }

                private String returnValue;
            }

            public getImageThumbnailUrlResponse(final getImageThumbnailUrlResponse other) {
                this(other.getReturnValue());
            }

            public getImageThumbnailUrlResponse(final org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
                returnValue = iprot.readString();
            }

            public getImageThumbnailUrlResponse(final String returnValue) {
                this.returnValue = com.google.common.base.Preconditions.checkNotNull(returnValue);
            }

            @Override
            public void clear() {
                throw new UnsupportedOperationException();
            }

            @Override
            public int compareTo(final getImageThumbnailUrlResponse other) {
                throw new UnsupportedOperationException();
            }

            @Override
            public org.apache.thrift.TBase<getImageThumbnailUrlResponse, org.apache.thrift.TFieldIdEnum> deepCopy() {
                throw new UnsupportedOperationException();
            }

            @Override
            public boolean equals(final Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof getImageThumbnailUrlResponse)) {
                    return false;
                }

                final getImageThumbnailUrlResponse other = (getImageThumbnailUrlResponse)otherObject;
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
                helper.add("return_value", getReturnValue());
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

                        oprot.writeString(getReturnValue());

                        oprot.writeListEnd();
                        break;

                    case org.apache.thrift.protocol.TType.STRUCT:
                    default:
                        oprot.writeStructBegin(new org.apache.thrift.protocol.TStruct("getImageThumbnailUrlResponse"));

                        oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("return_value", org.apache.thrift.protocol.TType.STRING, (short)-1));
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
        public final static class putImageRequest implements org.apache.thrift.TBase<putImageRequest, org.apache.thrift.TFieldIdEnum> {
            public static class Builder {
                public Builder() {
                }

                public Builder(final putImageRequest other) {
                    this.image = other.getImage();
                    this.imageMimeSubtype = other.getImageMimeSubtype();
                }

                protected putImageRequest _build(final java.nio.ByteBuffer image, final String imageMimeSubtype) {
                    return new putImageRequest(image, imageMimeSubtype);
                }

                public putImageRequest build() {
                    return _build(image, imageMimeSubtype);
                }

                public Builder setImage(final java.nio.ByteBuffer image) {
                    this.image = image;
                    return this;
                }

                public Builder setImageMimeSubtype(final String imageMimeSubtype) {
                    this.imageMimeSubtype = imageMimeSubtype;
                    return this;
                }

                private java.nio.ByteBuffer image;
                private String imageMimeSubtype;
            }

            public putImageRequest(final putImageRequest other) {
                this(other.getImage(), other.getImageMimeSubtype());
            }

            public putImageRequest(final org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
                this(iprot, org.apache.thrift.protocol.TType.STRUCT);
            }

            public putImageRequest(final org.apache.thrift.protocol.TProtocol iprot, final byte readAsTType) throws org.apache.thrift.TException {
                java.nio.ByteBuffer image = null;
                String imageMimeSubtype = null;

                switch (readAsTType) {
                    case org.apache.thrift.protocol.TType.LIST:
                        iprot.readListBegin();
                        image = iprot.readBinary();
                        imageMimeSubtype = iprot.readString();
                        iprot.readListEnd();
                        break;

                    case org.apache.thrift.protocol.TType.STRUCT:
                    default:
                        iprot.readStructBegin();
                        while (true) {
                            org.apache.thrift.protocol.TField ifield = iprot.readFieldBegin();
                            if (ifield.type == org.apache.thrift.protocol.TType.STOP) {
                                break;
                            } else                 if (ifield.name.equals("image")) {
                                image = iprot.readBinary();
                            } else if (ifield.name.equals("image_mime_subtype")) {
                                imageMimeSubtype = iprot.readString();
                            }
                            iprot.readFieldEnd();
                        }
                        iprot.readStructEnd();
                        break;
                }

                this.image = com.google.common.base.Preconditions.checkNotNull(image);
                this.imageMimeSubtype = com.google.common.base.Preconditions.checkNotNull(imageMimeSubtype);
            }

            public putImageRequest(final java.nio.ByteBuffer image, final String imageMimeSubtype) {
                this.image = com.google.common.base.Preconditions.checkNotNull(image);
                this.imageMimeSubtype = com.google.common.base.Preconditions.checkNotNull(imageMimeSubtype);
            }

            @Override
            public void clear() {
                throw new UnsupportedOperationException();
            }

            @Override
            public int compareTo(final putImageRequest other) {
                throw new UnsupportedOperationException();
            }

            @Override
            public org.apache.thrift.TBase<putImageRequest, org.apache.thrift.TFieldIdEnum> deepCopy() {
                throw new UnsupportedOperationException();
            }

            @Override
            public boolean equals(final Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof putImageRequest)) {
                    return false;
                }

                final putImageRequest other = (putImageRequest)otherObject;
                return
                    getImage().equals(other.getImage()) &&
                    getImageMimeSubtype().equals(other.getImageMimeSubtype());
            }

            @Override
            public org.apache.thrift.TFieldIdEnum fieldForId(final int fieldId) {
                throw new UnsupportedOperationException();
            }

            public Object get(final String fieldName) {
                if (fieldName.equals("image")) {
                    return getImage();
                } else if (fieldName.equals("image_mime_subtype")) {
                    return getImageMimeSubtype();
                }
                return null;
            }

            @Override
            public Object getFieldValue(final org.apache.thrift.TFieldIdEnum field) {
                throw new UnsupportedOperationException();
            }

            public final java.nio.ByteBuffer getImage() {
                return image;
            }

            public final String getImageMimeSubtype() {
                return imageMimeSubtype;
            }

            @Override
            public int hashCode() {
                int hashCode = 17;
                hashCode = 31 * hashCode + getImage().hashCode();
                hashCode = 31 * hashCode + getImageMimeSubtype().hashCode();
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
                helper.add("image", getImage());
                helper.add("image_mime_subtype", getImageMimeSubtype());
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
                        oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.VOID, 2));

                        oprot.writeBinary(getImage());

                        oprot.writeString(getImageMimeSubtype());

                        oprot.writeListEnd();
                        break;

                    case org.apache.thrift.protocol.TType.STRUCT:
                    default:
                        oprot.writeStructBegin(new org.apache.thrift.protocol.TStruct("putImageRequest"));

                        oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("image", org.apache.thrift.protocol.TType.STRING, (short)-1));
                        oprot.writeBinary(getImage());
                        oprot.writeFieldEnd();

                        oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("image_mime_subtype", org.apache.thrift.protocol.TType.STRING, (short)-1));
                        oprot.writeString(getImageMimeSubtype());
                        oprot.writeFieldEnd();

                        oprot.writeFieldStop();

                        oprot.writeStructEnd();
                        break;
                }
            }

            private final java.nio.ByteBuffer image;
            private final String imageMimeSubtype;
        }

        @SuppressWarnings({"serial"})
        public final static class putImageResponse implements org.apache.thrift.TBase<putImageResponse, org.apache.thrift.TFieldIdEnum> {
            public static class Builder {
                public Builder() {
                }

                public Builder(final putImageResponse other) {
                    this.returnValue = other.getReturnValue();
                }

                protected putImageResponse _build(final String returnValue) {
                    return new putImageResponse(returnValue);
                }

                public putImageResponse build() {
                    return _build(returnValue);
                }

                public Builder setReturnValue(final String returnValue) {
                    this.returnValue = returnValue;
                    return this;
                }

                private String returnValue;
            }

            public putImageResponse(final putImageResponse other) {
                this(other.getReturnValue());
            }

            public putImageResponse(final org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
                returnValue = iprot.readString();
            }

            public putImageResponse(final String returnValue) {
                this.returnValue = com.google.common.base.Preconditions.checkNotNull(returnValue);
            }

            @Override
            public void clear() {
                throw new UnsupportedOperationException();
            }

            @Override
            public int compareTo(final putImageResponse other) {
                throw new UnsupportedOperationException();
            }

            @Override
            public org.apache.thrift.TBase<putImageResponse, org.apache.thrift.TFieldIdEnum> deepCopy() {
                throw new UnsupportedOperationException();
            }

            @Override
            public boolean equals(final Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof putImageResponse)) {
                    return false;
                }

                final putImageResponse other = (putImageResponse)otherObject;
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
                helper.add("return_value", getReturnValue());
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

                        oprot.writeString(getReturnValue());

                        oprot.writeListEnd();
                        break;

                    case org.apache.thrift.protocol.TType.STRUCT:
                    default:
                        oprot.writeStructBegin(new org.apache.thrift.protocol.TStruct("putImageResponse"));

                        oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("return_value", org.apache.thrift.protocol.TType.STRING, (short)-1));
                        oprot.writeString(getReturnValue());
                        oprot.writeFieldEnd();

                        oprot.writeFieldStop();

                        oprot.writeStructEnd();
                        break;
                }
            }

            private final String returnValue;
        }
    }

    public boolean deleteImageThumbnail(String imageUrl, com.yogento.api.models.image.ImageResolution thumbnailResolution);
    public String getImageThumbnailUrl(String imageUrl, com.yogento.api.models.image.ImageResolution thumbnailResolution) throws com.yogento.api.services.image.ImageIoException;
    public String putImage(java.nio.ByteBuffer image, String imageMimeSubtype) throws com.yogento.api.services.image.ImageIoException;
}
