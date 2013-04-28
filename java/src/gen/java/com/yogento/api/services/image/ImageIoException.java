package com.yogento.api.services.image;

@SuppressWarnings({"serial"})
public class ImageIoException extends java.lang.Exception implements org.thryft.TBase<ImageIoException> {
    public static class Builder {
        public Builder() {
        }

        public Builder(final ImageIoException other) {
            this.causeMessage = other.getCauseMessage();
            this.imageUrl = other.getImageUrl();
        }

        protected ImageIoException _build(final String causeMessage, final String imageUrl) {
            return new ImageIoException(causeMessage, imageUrl);
        }

        public ImageIoException build() {
            return _build(causeMessage, imageUrl);
        }

        public Builder setCauseMessage(final String causeMessage) {
            this.causeMessage = causeMessage;
            return this;
        }

        public Builder setImageUrl(final String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }

        private String causeMessage;
        private String imageUrl;
    }

    public ImageIoException(final ImageIoException other) {
        this(other.getCauseMessage(), other.getImageUrl());
    }

    public ImageIoException(final org.thryft.protocol.TProtocol iprot) throws java.io.IOException {
        this(iprot, org.thryft.protocol.TType.STRUCT);
    }

    public ImageIoException(final org.thryft.protocol.TProtocol iprot, final byte readAsTType) throws java.io.IOException {
        String causeMessage = null;
        String imageUrl = null;

        switch (readAsTType) {
            case org.thryft.protocol.TType.LIST:
                final org.thryft.protocol.TList __list = iprot.readListBegin();
                causeMessage = iprot.readString();
                if (__list.size > 1) {
                    imageUrl = iprot.readString();
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
                    } else if (ifield.name.equals("cause_message")) {
                        causeMessage = iprot.readString();
                    } else if (ifield.name.equals("image_url")) {
                        imageUrl = iprot.readString();
                    }
                    iprot.readFieldEnd();
                }
                iprot.readStructEnd();
                break;
        }

        this.causeMessage = com.google.common.base.Preconditions.checkNotNull(causeMessage, "com.yogento.api.services.image.ImageIoException: missing causeMessage");
        this.imageUrl = imageUrl;
    }

    public ImageIoException(final String causeMessage) {
        this.causeMessage = com.google.common.base.Preconditions.checkNotNull(causeMessage, "com.yogento.api.services.image.ImageIoException: missing causeMessage");
        this.imageUrl = null;
    }

    public ImageIoException(final String causeMessage, final String imageUrl) {
        this.causeMessage = com.google.common.base.Preconditions.checkNotNull(causeMessage, "com.yogento.api.services.image.ImageIoException: missing causeMessage");
        this.imageUrl = imageUrl;
    }

    @Override
    public int compareTo(final ImageIoException other) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean equals(final Object otherObject) {
        if (otherObject == this) {
            return true;
        } else if (!(otherObject instanceof ImageIoException)) {
            return false;
        }

        final ImageIoException other = (ImageIoException)otherObject;
        return
            getCauseMessage().equals(other.getCauseMessage()) &&
            ((getImageUrl() == null && other.getImageUrl() == null) ||
            (getImageUrl() != null && other.getImageUrl() != null &&
            getImageUrl().equals(other.getImageUrl())));
    }

    public Object get(final String fieldName) {
        if (fieldName.equals("cause_message")) {
            return getCauseMessage();
        } else if (fieldName.equals("image_url")) {
            return getImageUrl();
        }
        return null;
    }

    public final String getCauseMessage() {
        return causeMessage;
    }

    public final String getImageUrl() {
        return imageUrl;
    }

    @Override
    public String getMessage() {
        return toString();
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getCauseMessage().hashCode();
        if (getImageUrl() != null) {
            hashCode = 31 * hashCode + getImageUrl().hashCode();
        }
        return hashCode;
    }

    @Override
    public String toString() {
        final com.google.common.base.Objects.ToStringHelper helper = com.google.common.base.Objects.toStringHelper(this);
        helper.add("cause_message", getCauseMessage());
        if (getImageUrl() != null) {
            helper.add("image_url", getImageUrl());
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

                oprot.writeString(getCauseMessage());

                if (getImageUrl() != null) {
                    oprot.writeString(getImageUrl());
                } else {
                    ((org.thryft.protocol.TProtocol)oprot).writeNull();
                }

                oprot.writeListEnd();
                break;

            case org.thryft.protocol.TType.STRUCT:
            default:
                oprot.writeStructBegin(new org.thryft.protocol.TStruct("ImageIoException"));

                oprot.writeFieldBegin(new org.thryft.protocol.TField("cause_message", org.thryft.protocol.TType.STRING, (short)-1));
                oprot.writeString(getCauseMessage());
                oprot.writeFieldEnd();

                if (getImageUrl() != null) {
                    oprot.writeFieldBegin(new org.thryft.protocol.TField("image_url", org.thryft.protocol.TType.STRING, (short)-1));
                    oprot.writeString(getImageUrl());
                    oprot.writeFieldEnd();
                }

                oprot.writeFieldStop();

                oprot.writeStructEnd();
                break;
        }
    }

    private final String causeMessage;

    private final String imageUrl;
}
