package com.yogento.api.services.user_settings;

@SuppressWarnings({"serial"})
public class NoSuchUserSettingsException extends java.lang.Exception implements org.thryft.TBase<NoSuchUserSettingsException> {
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

    public NoSuchUserSettingsException(final org.thryft.protocol.TProtocol iprot) throws java.io.IOException {
        this(iprot, org.thryft.protocol.TType.STRUCT);
    }

    public NoSuchUserSettingsException(final org.thryft.protocol.TProtocol iprot, final byte readAsTType) throws java.io.IOException {
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
    public int compareTo(final NoSuchUserSettingsException other) {
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

    public Object get(final String fieldName) {
        throw new IllegalArgumentException(fieldName);
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
                oprot.writeStructBegin(new org.thryft.protocol.TStruct("NoSuchUserSettingsException"));

                oprot.writeFieldStop();

                oprot.writeStructEnd();
                break;
        }
    }
}
