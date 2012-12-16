package com.yogento.api.services.user_settings;

@SuppressWarnings({"serial"})
public class NoSuchUserSettingsException extends java.lang.Exception implements org.apache.thrift.TBase<NoSuchUserSettingsException, org.apache.thrift.TFieldIdEnum> {
    public static class Builder {
        public Builder() {
        }

        public Builder(final NoSuchUserSettingsException other) {
            this.username = other.getUsername();
        }

        protected NoSuchUserSettingsException _build(final String username) {
            return new NoSuchUserSettingsException(username);
        }

        public NoSuchUserSettingsException build() {
            return _build(username);
        }

        public Builder setUsername(final String username) {
            this.username = username;
            return this;
        }

        private String username;
    }

    public NoSuchUserSettingsException(final NoSuchUserSettingsException other) {
        this(other.getUsername());
    }

    public NoSuchUserSettingsException(final org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
        this(iprot, org.apache.thrift.protocol.TType.STRUCT);
    }

    public NoSuchUserSettingsException(final org.apache.thrift.protocol.TProtocol iprot, final byte readAsTType) throws org.apache.thrift.TException {
        String username = null;

        switch (readAsTType) {
            case org.apache.thrift.protocol.TType.LIST:
                iprot.readListBegin();
                username = iprot.readString();
                iprot.readListEnd();
                break;

            case org.apache.thrift.protocol.TType.STRUCT:
            default:
                iprot.readStructBegin();
                while (true) {
                    org.apache.thrift.protocol.TField ifield = iprot.readFieldBegin();
                    if (ifield.type == org.apache.thrift.protocol.TType.STOP) {
                        break;
                    } else                 if (ifield.name.equals("username")) {
                        username = iprot.readString();
                    }
                    iprot.readFieldEnd();
                }
                iprot.readStructEnd();
                break;
        }

        this.username = com.google.common.base.Preconditions.checkNotNull(username);
    }

    public NoSuchUserSettingsException(final String username) {
        this.username = com.google.common.base.Preconditions.checkNotNull(username);
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

        final NoSuchUserSettingsException other = (NoSuchUserSettingsException)otherObject;
        return
            getUsername().equals(other.getUsername());
    }

    @Override
    public org.apache.thrift.TFieldIdEnum fieldForId(final int fieldId) {
        throw new UnsupportedOperationException();
    }

    public Object get(final String fieldName) {
        if (fieldName.equals("username")) {
            return getUsername();
        }
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

    public final String getUsername() {
        return username;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getUsername().hashCode();
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
        helper.add("username", getUsername());
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

                oprot.writeString(getUsername());

                oprot.writeListEnd();
                break;

            case org.apache.thrift.protocol.TType.STRUCT:
            default:
                oprot.writeStructBegin(new org.apache.thrift.protocol.TStruct("NoSuchUserSettingsException"));

                oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("username", org.apache.thrift.protocol.TType.STRING, (short)-1));
                oprot.writeString(getUsername());
                oprot.writeFieldEnd();

                oprot.writeFieldStop();

                oprot.writeStructEnd();
                break;
        }
    }

    private final String username;
}
