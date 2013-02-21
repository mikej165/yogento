package com.yogento.api.services.user_settings;

@SuppressWarnings({"serial"})
public class NoSuchUserSettingsException extends java.lang.Exception implements org.apache.thrift.TBase<NoSuchUserSettingsException, org.apache.thrift.TFieldIdEnum> {
    public static class Builder {
        public Builder() {
        }

        public Builder(final NoSuchUserSettingsException other) {
        }

        protected NoSuchUserSettingsException _build() {
            return new NoSuchUserSettingsException();
        }

        public NoSuchUserSettingsException build() {
            return _build();
        }


    }

    public NoSuchUserSettingsException() {
    }

    public NoSuchUserSettingsException(final NoSuchUserSettingsException other) {
    }

    public NoSuchUserSettingsException(final org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
        this(iprot, org.apache.thrift.protocol.TType.STRUCT);
    }

    public NoSuchUserSettingsException(final org.apache.thrift.protocol.TProtocol iprot, final byte readAsTType) throws org.apache.thrift.TException {
        switch (readAsTType) {
            case org.apache.thrift.protocol.TType.LIST:
                iprot.readListBegin();
                iprot.readListEnd();
                break;

            case org.apache.thrift.protocol.TType.STRUCT:
            default:
                iprot.readStructBegin();
                while (true) {
                    org.apache.thrift.protocol.TField ifield = iprot.readFieldBegin();
                    if (ifield.type == org.apache.thrift.protocol.TType.STOP) {
                        break;
                    }
                    iprot.readFieldEnd();
                }
                iprot.readStructEnd();
                break;
        }
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException();
    }

    @Override
    public int compareTo(final NoSuchUserSettingsException other) {
        throw new UnsupportedOperationException();
    }

    @Override
    public org.apache.thrift.TBase<NoSuchUserSettingsException, org.apache.thrift.TFieldIdEnum> deepCopy() {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean equals(final Object otherObject) {
        if (otherObject == this) {
            return true;
        } else if (!(otherObject instanceof NoSuchUserSettingsException)) {
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
    public String getMessage() {
        return toString();
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
    public void setFieldValue(final org.apache.thrift.TFieldIdEnum field, Object value) {
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
                oprot.writeStructBegin(new org.apache.thrift.protocol.TStruct("NoSuchUserSettingsException"));

                oprot.writeFieldStop();

                oprot.writeStructEnd();
                break;
        }
    }


}
