package com.yogento.api.services.image;

@SuppressWarnings({"serial"})
public class NoSuchImageException extends java.lang.Exception implements org.apache.thrift.TBase<NoSuchImageException, org.apache.thrift.TFieldIdEnum> {
    public static class Builder {
        public Builder() {
        }

        public Builder(final NoSuchImageException other) {
            this.causeMessage = other.getCauseMessage();
            this.imageUrl = other.getImageUrl();
        }

        protected NoSuchImageException _build(final String causeMessage, final String imageUrl) {
            return new NoSuchImageException(causeMessage, imageUrl);
        }

        public NoSuchImageException build() {
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

    public NoSuchImageException(final NoSuchImageException other) {
        this(other.getCauseMessage(), other.getImageUrl());
    }

    public NoSuchImageException(final org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
        this(iprot, org.apache.thrift.protocol.TType.STRUCT);
    }

    public NoSuchImageException(final org.apache.thrift.protocol.TProtocol iprot, final byte readAsTType) throws org.apache.thrift.TException {
        String causeMessage = null;
        String imageUrl = null;

        switch (readAsTType) {
            case org.apache.thrift.protocol.TType.LIST:
                iprot.readListBegin();
                causeMessage = iprot.readString();
                imageUrl = iprot.readString();
                iprot.readListEnd();
                break;

            case org.apache.thrift.protocol.TType.STRUCT:
            default:
                iprot.readStructBegin();
                while (true) {
                    org.apache.thrift.protocol.TField ifield = iprot.readFieldBegin();
                    if (ifield.type == org.apache.thrift.protocol.TType.STOP) {
                        break;
                    } else                 if (ifield.name.equals("cause_message")) {
                        causeMessage = iprot.readString();
                    } else if (ifield.name.equals("image_url")) {
                        imageUrl = iprot.readString();
                    }
                    iprot.readFieldEnd();
                }
                iprot.readStructEnd();
                break;
        }

        this.causeMessage = com.google.common.base.Preconditions.checkNotNull(causeMessage);
        this.imageUrl = com.google.common.base.Preconditions.checkNotNull(imageUrl);
    }

    public NoSuchImageException(final String causeMessage, final String imageUrl) {
        this.causeMessage = com.google.common.base.Preconditions.checkNotNull(causeMessage);
        this.imageUrl = com.google.common.base.Preconditions.checkNotNull(imageUrl);
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException();
    }

    @Override
    public int compareTo(final NoSuchImageException other) {
        throw new UnsupportedOperationException();
    }

    @Override
    public org.apache.thrift.TBase<NoSuchImageException, org.apache.thrift.TFieldIdEnum> deepCopy() {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean equals(final Object otherObject) {
        if (otherObject == this) {
            return true;
        } else if (!(otherObject instanceof NoSuchImageException)) {
            return false;
        }

        final NoSuchImageException other = (NoSuchImageException)otherObject;
        return
            getCauseMessage().equals(other.getCauseMessage()) &&
            getImageUrl().equals(other.getImageUrl());
    }

    @Override
    public org.apache.thrift.TFieldIdEnum fieldForId(final int fieldId) {
        throw new UnsupportedOperationException();
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

    @Override
    public Object getFieldValue(final org.apache.thrift.TFieldIdEnum field) {
        throw new UnsupportedOperationException();
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
        hashCode = 31 * hashCode + getImageUrl().hashCode();
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
        helper.add("cause_message", getCauseMessage());
        helper.add("image_url", getImageUrl());
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

                oprot.writeString(getCauseMessage());

                oprot.writeString(getImageUrl());

                oprot.writeListEnd();
                break;

            case org.apache.thrift.protocol.TType.STRUCT:
            default:
                oprot.writeStructBegin(new org.apache.thrift.protocol.TStruct("NoSuchImageException"));

                oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("cause_message", org.apache.thrift.protocol.TType.STRING, (short)-1));
                oprot.writeString(getCauseMessage());
                oprot.writeFieldEnd();

                oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("image_url", org.apache.thrift.protocol.TType.STRING, (short)-1));
                oprot.writeString(getImageUrl());
                oprot.writeFieldEnd();

                oprot.writeFieldStop();

                oprot.writeStructEnd();
                break;
        }
    }

    private final String causeMessage;
    private final String imageUrl;
}
