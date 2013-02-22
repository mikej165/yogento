package com.yogento.api.models.image;

@SuppressWarnings({"serial"})
public class ImageResolution implements org.apache.thrift.TBase<ImageResolution, org.apache.thrift.TFieldIdEnum> {
    public static class Builder {
        public Builder() {
        }

        public Builder(final ImageResolution other) {
            this.heightPx = other.getHeightPx();
            this.widthPx = other.getWidthPx();
        }

        protected ImageResolution _build(final int heightPx, final int widthPx) {
            return new ImageResolution(heightPx, widthPx);
        }

        public ImageResolution build() {
            return _build(heightPx, widthPx);
        }

        public Builder setHeightPx(final int heightPx) {
            this.heightPx = heightPx;
            return this;
        }

        public Builder setWidthPx(final int widthPx) {
            this.widthPx = widthPx;
            return this;
        }

        private Integer heightPx;
        private Integer widthPx;
    }

    public ImageResolution(final ImageResolution other) {
        this(other.getHeightPx(), other.getWidthPx());
    }

    public ImageResolution(final org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
        this(iprot, org.apache.thrift.protocol.TType.STRUCT);
    }

    public ImageResolution(final org.apache.thrift.protocol.TProtocol iprot, final byte readAsTType) throws org.apache.thrift.TException {
        int heightPx = 0;
        int widthPx = 0;

        switch (readAsTType) {
            case org.apache.thrift.protocol.TType.LIST:
                iprot.readListBegin();
                heightPx = iprot.readI32();
                widthPx = iprot.readI32();
                iprot.readListEnd();
                break;

            case org.apache.thrift.protocol.TType.STRUCT:
            default:
                iprot.readStructBegin();
                while (true) {
                    final org.apache.thrift.protocol.TField ifield = iprot.readFieldBegin();
                    if (ifield.type == org.apache.thrift.protocol.TType.STOP) {
                        break;
                    } else if (ifield.name.equals("height_px")) {
                        heightPx = iprot.readI32();
                    } else if (ifield.name.equals("width_px")) {
                        widthPx = iprot.readI32();
                    }
                    iprot.readFieldEnd();
                }
                iprot.readStructEnd();
                break;
        }

        this.heightPx = heightPx;
        this.widthPx = widthPx;
    }

    public ImageResolution(final int heightPx, final int widthPx) {
        this.heightPx = heightPx;
        this.widthPx = widthPx;
    }

    public ImageResolution(final Integer heightPx, final Integer widthPx) {
        this.heightPx = heightPx;
        this.widthPx = widthPx;
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException();
    }

    @Override
    public int compareTo(final ImageResolution other) {
        throw new UnsupportedOperationException();
    }

    @Override
    public org.apache.thrift.TBase<ImageResolution, org.apache.thrift.TFieldIdEnum> deepCopy() {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean equals(final Object otherObject) {
        if (otherObject == this) {
            return true;
        } else if (!(otherObject instanceof ImageResolution)) {
            return false;
        }

        final ImageResolution other = (ImageResolution)otherObject;
        return
            getHeightPx() == other.getHeightPx() &&
            getWidthPx() == other.getWidthPx();
    }

    @Override
    public org.apache.thrift.TFieldIdEnum fieldForId(final int fieldId) {
        throw new UnsupportedOperationException();
    }

    public Object get(final String fieldName) {
        if (fieldName.equals("height_px")) {
            return getHeightPx();
        } else if (fieldName.equals("width_px")) {
            return getWidthPx();
        }
        return null;
    }

    @Override
    public Object getFieldValue(final org.apache.thrift.TFieldIdEnum field) {
        throw new UnsupportedOperationException();
    }

    public final int getHeightPx() {
        return heightPx;
    }

    public final int getWidthPx() {
        return widthPx;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + ((int)getHeightPx());
        hashCode = 31 * hashCode + ((int)getWidthPx());
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
        helper.add("height_px", getHeightPx());
        helper.add("width_px", getWidthPx());
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

                oprot.writeI32(getHeightPx());

                oprot.writeI32(getWidthPx());

                oprot.writeListEnd();
                break;

            case org.apache.thrift.protocol.TType.STRUCT:
            default:
                oprot.writeStructBegin(new org.apache.thrift.protocol.TStruct("ImageResolution"));

                oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("height_px", org.apache.thrift.protocol.TType.I32, (short)-1));
                oprot.writeI32(getHeightPx());
                oprot.writeFieldEnd();

                oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("width_px", org.apache.thrift.protocol.TType.I32, (short)-1));
                oprot.writeI32(getWidthPx());
                oprot.writeFieldEnd();

                oprot.writeFieldStop();

                oprot.writeStructEnd();
                break;
        }
    }

    private final int heightPx;
    private final int widthPx;
}
