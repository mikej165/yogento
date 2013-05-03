package com.yogento.api.services.user_settings;

public interface UserSettingsService {
    public static class Messages {
        @SuppressWarnings({"serial"})
        public final static class GetCurrentUserSettingsRequest implements org.thryft.TBase<GetCurrentUserSettingsRequest> {
            public static class Builder {
                public Builder() {
                }

                public Builder(final GetCurrentUserSettingsRequest other) {
                }

                protected GetCurrentUserSettingsRequest _build() {
                    return new GetCurrentUserSettingsRequest();
                }

                public GetCurrentUserSettingsRequest build() {
                    return _build();
                }
            }

            public GetCurrentUserSettingsRequest() {
            }

            public GetCurrentUserSettingsRequest(final GetCurrentUserSettingsRequest other) {
            }

            public GetCurrentUserSettingsRequest(final org.thryft.protocol.TProtocol iprot) throws java.io.IOException {
                this(iprot, org.thryft.protocol.TType.STRUCT);
            }

            public GetCurrentUserSettingsRequest(final org.thryft.protocol.TProtocol iprot, final byte readAsTType) throws java.io.IOException {
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
            public int compareTo(final GetCurrentUserSettingsRequest other) {
                throw new UnsupportedOperationException();
            }

            @Override
            public boolean equals(final Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof GetCurrentUserSettingsRequest)) {
                    return false;
                }

                return true;
            }

            public Object get(final String fieldName) {
                throw new IllegalArgumentException(fieldName);
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
                        oprot.writeStructBegin(new org.thryft.protocol.TStruct("GetCurrentUserSettingsRequest"));

                        oprot.writeFieldStop();

                        oprot.writeStructEnd();
                        break;
                }
            }
        }

        @SuppressWarnings({"serial"})
        public final static class GetCurrentUserSettingsResponse implements org.thryft.TBase<GetCurrentUserSettingsResponse> {
            public static class Builder {
                public Builder() {
                }

                public Builder(final GetCurrentUserSettingsResponse other) {
                    this.returnValue = other.getReturnValue();
                }

                protected GetCurrentUserSettingsResponse _build(final com.yogento.api.models.user_settings.UserSettings returnValue) {
                    return new GetCurrentUserSettingsResponse(returnValue);
                }

                public GetCurrentUserSettingsResponse build() {
                    return _build(returnValue);
                }

                public Builder setReturnValue(final com.yogento.api.models.user_settings.UserSettings returnValue) {
                    this.returnValue = returnValue;
                    return this;
                }

                private com.yogento.api.models.user_settings.UserSettings returnValue;
            }

            public GetCurrentUserSettingsResponse(final GetCurrentUserSettingsResponse other) {
                this(other.getReturnValue());
            }

            public GetCurrentUserSettingsResponse(final org.thryft.protocol.TProtocol iprot) throws java.io.IOException {
                returnValue = new com.yogento.api.models.user_settings.UserSettings(iprot);
            }

            public GetCurrentUserSettingsResponse(final com.yogento.api.models.user_settings.UserSettings returnValue) {
                this.returnValue = com.google.common.base.Preconditions.checkNotNull(returnValue, "com.yogento.api.services.user_settings.UserSettingsService.getCurrentUserSettings: missing returnValue");
            }

            @Override
            public int compareTo(final GetCurrentUserSettingsResponse other) {
                throw new UnsupportedOperationException();
            }

            @Override
            public boolean equals(final Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof GetCurrentUserSettingsResponse)) {
                    return false;
                }

                final GetCurrentUserSettingsResponse other = (GetCurrentUserSettingsResponse)otherObject;
                return
                    getReturnValue().equals(other.getReturnValue());
            }

            public Object get(final String fieldName) {
                if (fieldName.equals("return_value")) {
                    return getReturnValue();
                }
                throw new IllegalArgumentException(fieldName);
            }

            public final com.yogento.api.models.user_settings.UserSettings getReturnValue() {
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
                        oprot.writeStructBegin(new org.thryft.protocol.TStruct("GetCurrentUserSettingsResponse"));

                        oprot.writeFieldBegin(new org.thryft.protocol.TField("return_value", org.thryft.protocol.TType.STRUCT, (short)-1));
                        getReturnValue().write(oprot);
                        oprot.writeFieldEnd();

                        oprot.writeFieldStop();

                        oprot.writeStructEnd();
                        break;
                }
            }

            private final com.yogento.api.models.user_settings.UserSettings returnValue;
        }

        @SuppressWarnings({"serial"})
        public final static class PutCurrentUserSettingsRequest implements org.thryft.TBase<PutCurrentUserSettingsRequest> {
            public static class Builder {
                public Builder() {
                }

                public Builder(final PutCurrentUserSettingsRequest other) {
                    this.userSettings = other.getUserSettings();
                }

                protected PutCurrentUserSettingsRequest _build(final com.yogento.api.models.user_settings.UserSettings userSettings) {
                    return new PutCurrentUserSettingsRequest(userSettings);
                }

                public PutCurrentUserSettingsRequest build() {
                    return _build(userSettings);
                }

                public Builder setUserSettings(final com.yogento.api.models.user_settings.UserSettings userSettings) {
                    this.userSettings = userSettings;
                    return this;
                }

                private com.yogento.api.models.user_settings.UserSettings userSettings;
            }

            public PutCurrentUserSettingsRequest(final PutCurrentUserSettingsRequest other) {
                this(other.getUserSettings());
            }

            public PutCurrentUserSettingsRequest(final org.thryft.protocol.TProtocol iprot) throws java.io.IOException {
                this(iprot, org.thryft.protocol.TType.STRUCT);
            }

            public PutCurrentUserSettingsRequest(final org.thryft.protocol.TProtocol iprot, final byte readAsTType) throws java.io.IOException {
                com.yogento.api.models.user_settings.UserSettings userSettings = null;

                switch (readAsTType) {
                    case org.thryft.protocol.TType.LIST:
                        iprot.readListBegin();
                        userSettings = new com.yogento.api.models.user_settings.UserSettings(iprot);
                        iprot.readListEnd();
                        break;

                    case org.thryft.protocol.TType.STRUCT:
                    default:
                        iprot.readStructBegin();
                        while (true) {
                            final org.thryft.protocol.TField ifield = iprot.readFieldBegin();
                            if (ifield.type == org.thryft.protocol.TType.STOP) {
                                break;
                            } else if (ifield.name.equals("user_settings")) {
                                userSettings = new com.yogento.api.models.user_settings.UserSettings(iprot);
                            }
                            iprot.readFieldEnd();
                        }
                        iprot.readStructEnd();
                        break;
                }

                this.userSettings = com.google.common.base.Preconditions.checkNotNull(userSettings, "com.yogento.api.services.user_settings.PutCurrentUserSettingsRequest: missing userSettings");
            }

            public PutCurrentUserSettingsRequest(final com.yogento.api.models.user_settings.UserSettings userSettings) {
                this.userSettings = com.google.common.base.Preconditions.checkNotNull(userSettings, "com.yogento.api.services.user_settings.PutCurrentUserSettingsRequest: missing userSettings");
            }

            @Override
            public int compareTo(final PutCurrentUserSettingsRequest other) {
                throw new UnsupportedOperationException();
            }

            @Override
            public boolean equals(final Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof PutCurrentUserSettingsRequest)) {
                    return false;
                }

                final PutCurrentUserSettingsRequest other = (PutCurrentUserSettingsRequest)otherObject;
                return
                    getUserSettings().equals(other.getUserSettings());
            }

            public Object get(final String fieldName) {
                if (fieldName.equals("user_settings")) {
                    return getUserSettings();
                }
                throw new IllegalArgumentException(fieldName);
            }

            public final com.yogento.api.models.user_settings.UserSettings getUserSettings() {
                return userSettings;
            }

            @Override
            public int hashCode() {
                int hashCode = 17;
                hashCode = 31 * hashCode + getUserSettings().hashCode();
                return hashCode;
            }

            @Override
            public String toString() {
                final com.google.common.base.Objects.ToStringHelper helper = com.google.common.base.Objects.toStringHelper(this);
                helper.add("user_settings", getUserSettings());
                return helper.toString();
            }

            @Override
            public void write(final org.thryft.protocol.TProtocol oprot) throws java.io.IOException {
                write(oprot, org.thryft.protocol.TType.STRUCT);
            }

            public void write(final org.thryft.protocol.TProtocol oprot, final byte writeAsTType) throws java.io.IOException {
                switch (writeAsTType) {
                    case org.thryft.protocol.TType.VOID: {
                        getUserSettings().write(oprot);
                        break;
                    }

                    case org.thryft.protocol.TType.LIST:
                        oprot.writeListBegin(new org.thryft.protocol.TList(org.thryft.protocol.TType.VOID, 1));

                        getUserSettings().write(oprot);

                        oprot.writeListEnd();
                        break;

                    case org.thryft.protocol.TType.STRUCT:
                    default:
                        oprot.writeStructBegin(new org.thryft.protocol.TStruct("PutCurrentUserSettingsRequest"));

                        oprot.writeFieldBegin(new org.thryft.protocol.TField("user_settings", org.thryft.protocol.TType.STRUCT, (short)-1));
                        getUserSettings().write(oprot);
                        oprot.writeFieldEnd();

                        oprot.writeFieldStop();

                        oprot.writeStructEnd();
                        break;
                }
            }

            private final com.yogento.api.models.user_settings.UserSettings userSettings;
        }

        @SuppressWarnings({"serial"})
        public final static class PutCurrentUserSettingsResponse implements org.thryft.TBase<PutCurrentUserSettingsResponse> {
            public static class Builder {
                public Builder() {
                }

                public Builder(final PutCurrentUserSettingsResponse other) {
                }

                protected PutCurrentUserSettingsResponse _build() {
                    return new PutCurrentUserSettingsResponse();
                }

                public PutCurrentUserSettingsResponse build() {
                    return _build();
                }
            }

            public PutCurrentUserSettingsResponse() {
            }

            public PutCurrentUserSettingsResponse(final PutCurrentUserSettingsResponse other) {
            }

            public PutCurrentUserSettingsResponse(final org.thryft.protocol.TProtocol iprot) throws java.io.IOException {
            }

            @Override
            public int compareTo(final PutCurrentUserSettingsResponse other) {
                throw new UnsupportedOperationException();
            }

            @Override
            public boolean equals(final Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof PutCurrentUserSettingsResponse)) {
                    return false;
                }

                return true;
            }

            public Object get(final String fieldName) {
                throw new IllegalArgumentException(fieldName);
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
                        oprot.writeStructBegin(new org.thryft.protocol.TStruct("PutCurrentUserSettingsResponse"));

                        oprot.writeFieldStop();

                        oprot.writeStructEnd();
                        break;
                }
            }
        }
    }

    public com.yogento.api.models.user_settings.UserSettings getCurrentUserSettings() throws com.yogento.api.services.user_settings.NoSuchUserSettingsException;

    public void putCurrentUserSettings(final com.yogento.api.models.user_settings.UserSettings userSettings) throws com.yogento.api.services.user_settings.UserSettingsIoException;
}
