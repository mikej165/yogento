package com.yogento.api.services.user_settings;

@SuppressWarnings({"serial"})
public class UserSettingsIoException extends java.lang.Exception implements org.thryft.TBase<UserSettingsIoException> {
    public static class Builder {
        public Builder() {
        }

        public Builder(final UserSettingsIoException other) {
            this.causeMessage = other.getCauseMessage();
        }

        protected UserSettingsIoException _build(final String causeMessage) {
            return new UserSettingsIoException(causeMessage);
        }

        public UserSettingsIoException build() {
            return _build(causeMessage);
        }

        public Builder setCauseMessage(final String causeMessage) {
            this.causeMessage = causeMessage;
            return this;
        }

        private String causeMessage;
    }

    public UserSettingsIoException(final UserSettingsIoException other) {
        this(other.getCauseMessage());
    }

    public UserSettingsIoException(final org.thryft.protocol.TProtocol iprot) throws java.io.IOException {
        this(iprot, org.thryft.protocol.TType.STRUCT);
    }

    public UserSettingsIoException(final org.thryft.protocol.TProtocol iprot, final byte readAsTType) throws java.io.IOException {
        String causeMessage = null;

        switch (readAsTType) {
            case org.thryft.protocol.TType.LIST:
                iprot.readListBegin();
                causeMessage = iprot.readString();
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
                    }
                    iprot.readFieldEnd();
                }
                iprot.readStructEnd();
                break;
        }

        this.causeMessage = com.google.common.base.Preconditions.checkNotNull(causeMessage, "com.yogento.api.services.user_settings.UserSettingsIoException: missing causeMessage");
    }

    public UserSettingsIoException(final String causeMessage) {
        this.causeMessage = com.google.common.base.Preconditions.checkNotNull(causeMessage, "com.yogento.api.services.user_settings.UserSettingsIoException: missing causeMessage");
    }

    @Override
    public int compareTo(final UserSettingsIoException other) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean equals(final Object otherObject) {
        if (otherObject == this) {
            return true;
        } else if (!(otherObject instanceof UserSettingsIoException)) {
            return false;
        }

        final UserSettingsIoException other = (UserSettingsIoException)otherObject;
        return
            getCauseMessage().equals(other.getCauseMessage());
    }

    public Object get(final String fieldName) {
        if (fieldName.equals("cause_message")) {
            return getCauseMessage();
        }
        throw new IllegalArgumentException(fieldName);
    }

    public final String getCauseMessage() {
        return causeMessage;
    }

    @Override
    public String getMessage() {
        return toString();
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getCauseMessage().hashCode();
        return hashCode;
    }

    @Override
    public String toString() {
        final com.google.common.base.Objects.ToStringHelper helper = com.google.common.base.Objects.toStringHelper(this);
        helper.add("cause_message", getCauseMessage());
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

                oprot.writeString(getCauseMessage());

                oprot.writeListEnd();
                break;

            case org.thryft.protocol.TType.STRUCT:
            default:
                oprot.writeStructBegin(new org.thryft.protocol.TStruct("UserSettingsIoException"));

                oprot.writeFieldBegin(new org.thryft.protocol.TField("cause_message", org.thryft.protocol.TType.STRING, (short)-1));
                oprot.writeString(getCauseMessage());
                oprot.writeFieldEnd();

                oprot.writeFieldStop();

                oprot.writeStructEnd();
                break;
        }
    }

    private final String causeMessage;
}
