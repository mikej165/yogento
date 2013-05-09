package com.yogento.api.services.image;

public interface ImageService {
    public static class Messages {
        @SuppressWarnings({"serial"})
        public final static class DeleteImageThumbnailRequest implements org.thryft.TBase<DeleteImageThumbnailRequest> {
            public static class Builder {
                public Builder() {
                }

                public Builder(final DeleteImageThumbnailRequest other) {
                    this.imageUrl = other.getImageUrl();
                    this.thumbnailResolution = other.getThumbnailResolution();
                }

                protected DeleteImageThumbnailRequest _build(final String imageUrl, final com.yogento.api.models.image.ImageResolution thumbnailResolution) {
                    return new DeleteImageThumbnailRequest(imageUrl, thumbnailResolution);
                }

                public DeleteImageThumbnailRequest build() {
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

            public DeleteImageThumbnailRequest(final DeleteImageThumbnailRequest other) {
                this(other.getImageUrl(), other.getThumbnailResolution());
            }

            public DeleteImageThumbnailRequest(final org.thryft.protocol.TProtocol iprot) throws java.io.IOException {
                this(iprot, org.thryft.protocol.TType.STRUCT);
            }

            public DeleteImageThumbnailRequest(final org.thryft.protocol.TProtocol iprot, final byte readAsTType) throws java.io.IOException {
                String imageUrl = null;
                com.yogento.api.models.image.ImageResolution thumbnailResolution = null;

                switch (readAsTType) {
                    case org.thryft.protocol.TType.LIST:
                        iprot.readListBegin();
                        imageUrl = iprot.readString();
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
                            } else if (ifield.name.equals("image_url")) {
                                imageUrl = iprot.readString();
                            } else if (ifield.name.equals("thumbnail_resolution")) {
                                thumbnailResolution = new com.yogento.api.models.image.ImageResolution(iprot);
                            }
                            iprot.readFieldEnd();
                        }
                        iprot.readStructEnd();
                        break;
                }

                this.imageUrl = com.google.common.base.Preconditions.checkNotNull(imageUrl, "com.yogento.api.services.image.DeleteImageThumbnailRequest: missing imageUrl");
                this.thumbnailResolution = com.google.common.base.Preconditions.checkNotNull(thumbnailResolution, "com.yogento.api.services.image.DeleteImageThumbnailRequest: missing thumbnailResolution");
            }

            public DeleteImageThumbnailRequest(final String imageUrl, final com.yogento.api.models.image.ImageResolution thumbnailResolution) {
                this.imageUrl = com.google.common.base.Preconditions.checkNotNull(imageUrl, "com.yogento.api.services.image.DeleteImageThumbnailRequest: missing imageUrl");
                this.thumbnailResolution = com.google.common.base.Preconditions.checkNotNull(thumbnailResolution, "com.yogento.api.services.image.DeleteImageThumbnailRequest: missing thumbnailResolution");
            }

            @Override
            public int compareTo(final DeleteImageThumbnailRequest other) {
                if (other == null) {
                    throw new NullPointerException();
                }

                int result;
                result = this.imageUrl.compareTo(other.imageUrl);
                if (result != 0) {
                    return result;
                }

                result = this.thumbnailResolution.compareTo(other.thumbnailResolution);
                if (result != 0) {
                    return result;
                }

                return 0;
            }

            @Override
            public boolean equals(final Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof DeleteImageThumbnailRequest)) {
                    return false;
                }

                final DeleteImageThumbnailRequest other = (DeleteImageThumbnailRequest)otherObject;
                return
                    getImageUrl().equals(other.getImageUrl()) &&
                    getThumbnailResolution().equals(other.getThumbnailResolution());
            }

            public Object get(final String fieldName) {
                if (fieldName.equals("image_url")) {
                    return getImageUrl();
                } else if (fieldName.equals("thumbnail_resolution")) {
                    return getThumbnailResolution();
                }
                throw new IllegalArgumentException(fieldName);
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
            public String toString() {
                final com.google.common.base.Objects.ToStringHelper helper = com.google.common.base.Objects.toStringHelper(this);
                helper.add("image_url", getImageUrl());
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

                        oprot.writeString(getImageUrl());

                        getThumbnailResolution().write(oprot);

                        oprot.writeListEnd();
                        break;

                    case org.thryft.protocol.TType.STRUCT:
                    default:
                        oprot.writeStructBegin(new org.thryft.protocol.TStruct("DeleteImageThumbnailRequest"));

                        oprot.writeFieldBegin(new org.thryft.protocol.TField("image_url", org.thryft.protocol.TType.STRING, (short)-1));
                        oprot.writeString(getImageUrl());
                        oprot.writeFieldEnd();

                        oprot.writeFieldBegin(new org.thryft.protocol.TField("thumbnail_resolution", org.thryft.protocol.TType.STRUCT, (short)-1));
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
        public final static class DeleteImageThumbnailResponse implements org.thryft.TBase<DeleteImageThumbnailResponse> {
            public static class Builder {
                public Builder() {
                }

                public Builder(final DeleteImageThumbnailResponse other) {
                    this.returnValue = other.isReturnValue();
                }

                protected DeleteImageThumbnailResponse _build(final boolean returnValue) {
                    return new DeleteImageThumbnailResponse(returnValue);
                }

                public DeleteImageThumbnailResponse build() {
                    return _build(returnValue);
                }

                public Builder setReturnValue(final boolean returnValue) {
                    this.returnValue = returnValue;
                    return this;
                }

                private Boolean returnValue;
            }

            public DeleteImageThumbnailResponse(final DeleteImageThumbnailResponse other) {
                this(other.isReturnValue());
            }

            public DeleteImageThumbnailResponse(final org.thryft.protocol.TProtocol iprot) throws java.io.IOException {
                returnValue = iprot.readBool();
            }

            public DeleteImageThumbnailResponse(final boolean returnValue) {
                this.returnValue = returnValue;
            }

            public DeleteImageThumbnailResponse(final Boolean returnValue) {
                this.returnValue = returnValue;
            }

            @Override
            public int compareTo(final DeleteImageThumbnailResponse other) {
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
                } else if (!(otherObject instanceof DeleteImageThumbnailResponse)) {
                    return false;
                }

                final DeleteImageThumbnailResponse other = (DeleteImageThumbnailResponse)otherObject;
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
                        oprot.writeStructBegin(new org.thryft.protocol.TStruct("DeleteImageThumbnailResponse"));

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
        public final static class GetImageThumbnailUrlRequest implements org.thryft.TBase<GetImageThumbnailUrlRequest> {
            public static class Builder {
                public Builder() {
                }

                public Builder(final GetImageThumbnailUrlRequest other) {
                    this.imageUrl = other.getImageUrl();
                    this.thumbnailResolution = other.getThumbnailResolution();
                }

                protected GetImageThumbnailUrlRequest _build(final String imageUrl, final com.yogento.api.models.image.ImageResolution thumbnailResolution) {
                    return new GetImageThumbnailUrlRequest(imageUrl, thumbnailResolution);
                }

                public GetImageThumbnailUrlRequest build() {
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

            public GetImageThumbnailUrlRequest(final GetImageThumbnailUrlRequest other) {
                this(other.getImageUrl(), other.getThumbnailResolution());
            }

            public GetImageThumbnailUrlRequest(final org.thryft.protocol.TProtocol iprot) throws java.io.IOException {
                this(iprot, org.thryft.protocol.TType.STRUCT);
            }

            public GetImageThumbnailUrlRequest(final org.thryft.protocol.TProtocol iprot, final byte readAsTType) throws java.io.IOException {
                String imageUrl = null;
                com.yogento.api.models.image.ImageResolution thumbnailResolution = null;

                switch (readAsTType) {
                    case org.thryft.protocol.TType.LIST:
                        iprot.readListBegin();
                        imageUrl = iprot.readString();
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
                            } else if (ifield.name.equals("image_url")) {
                                imageUrl = iprot.readString();
                            } else if (ifield.name.equals("thumbnail_resolution")) {
                                thumbnailResolution = new com.yogento.api.models.image.ImageResolution(iprot);
                            }
                            iprot.readFieldEnd();
                        }
                        iprot.readStructEnd();
                        break;
                }

                this.imageUrl = com.google.common.base.Preconditions.checkNotNull(imageUrl, "com.yogento.api.services.image.GetImageThumbnailUrlRequest: missing imageUrl");
                this.thumbnailResolution = com.google.common.base.Preconditions.checkNotNull(thumbnailResolution, "com.yogento.api.services.image.GetImageThumbnailUrlRequest: missing thumbnailResolution");
            }

            public GetImageThumbnailUrlRequest(final String imageUrl, final com.yogento.api.models.image.ImageResolution thumbnailResolution) {
                this.imageUrl = com.google.common.base.Preconditions.checkNotNull(imageUrl, "com.yogento.api.services.image.GetImageThumbnailUrlRequest: missing imageUrl");
                this.thumbnailResolution = com.google.common.base.Preconditions.checkNotNull(thumbnailResolution, "com.yogento.api.services.image.GetImageThumbnailUrlRequest: missing thumbnailResolution");
            }

            @Override
            public int compareTo(final GetImageThumbnailUrlRequest other) {
                if (other == null) {
                    throw new NullPointerException();
                }

                int result;
                result = this.imageUrl.compareTo(other.imageUrl);
                if (result != 0) {
                    return result;
                }

                result = this.thumbnailResolution.compareTo(other.thumbnailResolution);
                if (result != 0) {
                    return result;
                }

                return 0;
            }

            @Override
            public boolean equals(final Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof GetImageThumbnailUrlRequest)) {
                    return false;
                }

                final GetImageThumbnailUrlRequest other = (GetImageThumbnailUrlRequest)otherObject;
                return
                    getImageUrl().equals(other.getImageUrl()) &&
                    getThumbnailResolution().equals(other.getThumbnailResolution());
            }

            public Object get(final String fieldName) {
                if (fieldName.equals("image_url")) {
                    return getImageUrl();
                } else if (fieldName.equals("thumbnail_resolution")) {
                    return getThumbnailResolution();
                }
                throw new IllegalArgumentException(fieldName);
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
            public String toString() {
                final com.google.common.base.Objects.ToStringHelper helper = com.google.common.base.Objects.toStringHelper(this);
                helper.add("image_url", getImageUrl());
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

                        oprot.writeString(getImageUrl());

                        getThumbnailResolution().write(oprot);

                        oprot.writeListEnd();
                        break;

                    case org.thryft.protocol.TType.STRUCT:
                    default:
                        oprot.writeStructBegin(new org.thryft.protocol.TStruct("GetImageThumbnailUrlRequest"));

                        oprot.writeFieldBegin(new org.thryft.protocol.TField("image_url", org.thryft.protocol.TType.STRING, (short)-1));
                        oprot.writeString(getImageUrl());
                        oprot.writeFieldEnd();

                        oprot.writeFieldBegin(new org.thryft.protocol.TField("thumbnail_resolution", org.thryft.protocol.TType.STRUCT, (short)-1));
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
        public final static class GetImageThumbnailUrlResponse implements org.thryft.TBase<GetImageThumbnailUrlResponse> {
            public static class Builder {
                public Builder() {
                }

                public Builder(final GetImageThumbnailUrlResponse other) {
                    this.returnValue = other.getReturnValue();
                }

                protected GetImageThumbnailUrlResponse _build(final String returnValue) {
                    return new GetImageThumbnailUrlResponse(returnValue);
                }

                public GetImageThumbnailUrlResponse build() {
                    return _build(returnValue);
                }

                public Builder setReturnValue(final String returnValue) {
                    this.returnValue = returnValue;
                    return this;
                }

                private String returnValue;
            }

            public GetImageThumbnailUrlResponse(final GetImageThumbnailUrlResponse other) {
                this(other.getReturnValue());
            }

            public GetImageThumbnailUrlResponse(final org.thryft.protocol.TProtocol iprot) throws java.io.IOException {
                returnValue = iprot.readString();
            }

            public GetImageThumbnailUrlResponse(final String returnValue) {
                this.returnValue = com.google.common.base.Preconditions.checkNotNull(returnValue, "com.yogento.api.services.image.ImageService.getImageThumbnailUrl: missing returnValue");
            }

            @Override
            public int compareTo(final GetImageThumbnailUrlResponse other) {
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
                } else if (!(otherObject instanceof GetImageThumbnailUrlResponse)) {
                    return false;
                }

                final GetImageThumbnailUrlResponse other = (GetImageThumbnailUrlResponse)otherObject;
                return
                    getReturnValue().equals(other.getReturnValue());
            }

            public Object get(final String fieldName) {
                if (fieldName.equals("return_value")) {
                    return getReturnValue();
                }
                throw new IllegalArgumentException(fieldName);
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
                        oprot.writeStructBegin(new org.thryft.protocol.TStruct("GetImageThumbnailUrlResponse"));

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
        public final static class PutImageRequest implements org.thryft.TBase<PutImageRequest> {
            public static class Builder {
                public Builder() {
                }

                public Builder(final PutImageRequest other) {
                    this.image = other.getImage();
                    this.imageMimeSubtype = other.getImageMimeSubtype();
                }

                protected PutImageRequest _build(final byte[] image, final String imageMimeSubtype) {
                    return new PutImageRequest(image, imageMimeSubtype);
                }

                public PutImageRequest build() {
                    return _build(image, imageMimeSubtype);
                }

                public Builder setImage(final byte[] image) {
                    this.image = image;
                    return this;
                }

                public Builder setImageMimeSubtype(final String imageMimeSubtype) {
                    this.imageMimeSubtype = imageMimeSubtype;
                    return this;
                }

                private byte[] image;
                private String imageMimeSubtype;
            }

            public PutImageRequest(final PutImageRequest other) {
                this(other.getImage(), other.getImageMimeSubtype());
            }

            public PutImageRequest(final org.thryft.protocol.TProtocol iprot) throws java.io.IOException {
                this(iprot, org.thryft.protocol.TType.STRUCT);
            }

            public PutImageRequest(final org.thryft.protocol.TProtocol iprot, final byte readAsTType) throws java.io.IOException {
                byte[] image = null;
                String imageMimeSubtype = null;

                switch (readAsTType) {
                    case org.thryft.protocol.TType.LIST:
                        iprot.readListBegin();
                        image = iprot.readBinary();
                        imageMimeSubtype = iprot.readString();
                        iprot.readListEnd();
                        break;

                    case org.thryft.protocol.TType.STRUCT:
                    default:
                        iprot.readStructBegin();
                        while (true) {
                            final org.thryft.protocol.TField ifield = iprot.readFieldBegin();
                            if (ifield.type == org.thryft.protocol.TType.STOP) {
                                break;
                            } else if (ifield.name.equals("image")) {
                                image = iprot.readBinary();
                            } else if (ifield.name.equals("image_mime_subtype")) {
                                imageMimeSubtype = iprot.readString();
                            }
                            iprot.readFieldEnd();
                        }
                        iprot.readStructEnd();
                        break;
                }

                this.image = com.google.common.base.Preconditions.checkNotNull(image, "com.yogento.api.services.image.PutImageRequest: missing image");
                this.imageMimeSubtype = com.google.common.base.Preconditions.checkNotNull(imageMimeSubtype, "com.yogento.api.services.image.PutImageRequest: missing imageMimeSubtype");
            }

            public PutImageRequest(final byte[] image, final String imageMimeSubtype) {
                this.image = com.google.common.base.Preconditions.checkNotNull(image, "com.yogento.api.services.image.PutImageRequest: missing image");
                this.imageMimeSubtype = com.google.common.base.Preconditions.checkNotNull(imageMimeSubtype, "com.yogento.api.services.image.PutImageRequest: missing imageMimeSubtype");
            }

            @Override
            public int compareTo(final PutImageRequest other) {
                if (other == null) {
                    throw new NullPointerException();
                }

                int result;
                result = org.thryft.Comparators.compare(this.image, other.image);
                if (result != 0) {
                    return result;
                }

                result = this.imageMimeSubtype.compareTo(other.imageMimeSubtype);
                if (result != 0) {
                    return result;
                }

                return 0;
            }

            @Override
            public boolean equals(final Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof PutImageRequest)) {
                    return false;
                }

                final PutImageRequest other = (PutImageRequest)otherObject;
                return
                    java.util.Arrays.equals(getImage(), other.getImage()) &&
                    getImageMimeSubtype().equals(other.getImageMimeSubtype());
            }

            public Object get(final String fieldName) {
                if (fieldName.equals("image")) {
                    return getImage();
                } else if (fieldName.equals("image_mime_subtype")) {
                    return getImageMimeSubtype();
                }
                throw new IllegalArgumentException(fieldName);
            }

            public final byte[] getImage() {
                return image;
            }

            public final String getImageMimeSubtype() {
                return imageMimeSubtype;
            }

            @Override
            public int hashCode() {
                int hashCode = 17;
                hashCode = 31 * hashCode + java.util.Arrays.hashCode(getImage());
                hashCode = 31 * hashCode + getImageMimeSubtype().hashCode();
                return hashCode;
            }

            @Override
            public String toString() {
                final com.google.common.base.Objects.ToStringHelper helper = com.google.common.base.Objects.toStringHelper(this);
                helper.add("image", getImage());
                helper.add("image_mime_subtype", getImageMimeSubtype());
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

                        oprot.writeBinary(getImage());

                        oprot.writeString(getImageMimeSubtype());

                        oprot.writeListEnd();
                        break;

                    case org.thryft.protocol.TType.STRUCT:
                    default:
                        oprot.writeStructBegin(new org.thryft.protocol.TStruct("PutImageRequest"));

                        oprot.writeFieldBegin(new org.thryft.protocol.TField("image", org.thryft.protocol.TType.STRING, (short)-1));
                        oprot.writeBinary(getImage());
                        oprot.writeFieldEnd();

                        oprot.writeFieldBegin(new org.thryft.protocol.TField("image_mime_subtype", org.thryft.protocol.TType.STRING, (short)-1));
                        oprot.writeString(getImageMimeSubtype());
                        oprot.writeFieldEnd();

                        oprot.writeFieldStop();

                        oprot.writeStructEnd();
                        break;
                }
            }

            private final byte[] image;

            private final String imageMimeSubtype;
        }

        @SuppressWarnings({"serial"})
        public final static class PutImageResponse implements org.thryft.TBase<PutImageResponse> {
            public static class Builder {
                public Builder() {
                }

                public Builder(final PutImageResponse other) {
                    this.returnValue = other.getReturnValue();
                }

                protected PutImageResponse _build(final String returnValue) {
                    return new PutImageResponse(returnValue);
                }

                public PutImageResponse build() {
                    return _build(returnValue);
                }

                public Builder setReturnValue(final String returnValue) {
                    this.returnValue = returnValue;
                    return this;
                }

                private String returnValue;
            }

            public PutImageResponse(final PutImageResponse other) {
                this(other.getReturnValue());
            }

            public PutImageResponse(final org.thryft.protocol.TProtocol iprot) throws java.io.IOException {
                returnValue = iprot.readString();
            }

            public PutImageResponse(final String returnValue) {
                this.returnValue = com.google.common.base.Preconditions.checkNotNull(returnValue, "com.yogento.api.services.image.ImageService.putImage: missing returnValue");
            }

            @Override
            public int compareTo(final PutImageResponse other) {
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
                } else if (!(otherObject instanceof PutImageResponse)) {
                    return false;
                }

                final PutImageResponse other = (PutImageResponse)otherObject;
                return
                    getReturnValue().equals(other.getReturnValue());
            }

            public Object get(final String fieldName) {
                if (fieldName.equals("return_value")) {
                    return getReturnValue();
                }
                throw new IllegalArgumentException(fieldName);
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
                        oprot.writeStructBegin(new org.thryft.protocol.TStruct("PutImageResponse"));

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
    }

    public boolean deleteImageThumbnail(final String imageUrl, final com.yogento.api.models.image.ImageResolution thumbnailResolution);

    public String getImageThumbnailUrl(final String imageUrl, final com.yogento.api.models.image.ImageResolution thumbnailResolution) throws com.yogento.api.services.image.ImageIoException;

    public String putImage(final byte[] image, final String imageMimeSubtype) throws com.yogento.api.services.image.ImageIoException;
}
