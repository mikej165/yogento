package com.yogento.api.services.user_settings;

public interface UserSettingsService {
    public static class Messages {
        @SuppressWarnings({"serial"})
        public final static class getCurrentUserSettingsRequest implements org.apache.thrift.TBase<getCurrentUserSettingsRequest, org.apache.thrift.TFieldIdEnum> {
            public static class Builder {
                public Builder() {
                }

                public Builder(final getCurrentUserSettingsRequest other) {
                }

                protected getCurrentUserSettingsRequest _build() {
                    return new getCurrentUserSettingsRequest();
                }

                public getCurrentUserSettingsRequest build() {
                    return _build();
                }


            }

            public getCurrentUserSettingsRequest() {
            }

            public getCurrentUserSettingsRequest(final getCurrentUserSettingsRequest other) {
            }

            public getCurrentUserSettingsRequest(final org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
                this(iprot, org.apache.thrift.protocol.TType.STRUCT);
            }

            public getCurrentUserSettingsRequest(final org.apache.thrift.protocol.TProtocol iprot, final byte readAsTType) throws org.apache.thrift.TException {
                switch (readAsTType) {
                    case org.apache.thrift.protocol.TType.LIST:
                        iprot.readListBegin();
                        iprot.readListEnd();
                        break;

                    case org.apache.thrift.protocol.TType.STRUCT:
                    default:
                        iprot.readStructBegin();
                        while (true) {
                            final org.apache.thrift.protocol.TField ifield = iprot.readFieldBegin();
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
            public int compareTo(final getCurrentUserSettingsRequest other) {
                throw new UnsupportedOperationException();
            }

            @Override
            public org.apache.thrift.TBase<getCurrentUserSettingsRequest, org.apache.thrift.TFieldIdEnum> deepCopy() {
                throw new UnsupportedOperationException();
            }

            @Override
            public boolean equals(final Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof getCurrentUserSettingsRequest)) {
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
            public void setFieldValue(final org.apache.thrift.TFieldIdEnum field, final Object value) {
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
                        oprot.writeStructBegin(new org.apache.thrift.protocol.TStruct("getCurrentUserSettingsRequest"));

                        oprot.writeFieldStop();

                        oprot.writeStructEnd();
                        break;
                }
            }


        }

        @SuppressWarnings({"serial"})
        public final static class getCurrentUserSettingsResponse implements org.apache.thrift.TBase<getCurrentUserSettingsResponse, org.apache.thrift.TFieldIdEnum> {
            public static class Builder {
                public Builder() {
                }

                public Builder(final getCurrentUserSettingsResponse other) {
                    this.returnValue = other.getReturnValue();
                }

                protected getCurrentUserSettingsResponse _build(final com.yogento.api.models.user_settings.UserSettings returnValue) {
                    return new getCurrentUserSettingsResponse(returnValue);
                }

                public getCurrentUserSettingsResponse build() {
                    return _build(returnValue);
                }

                public Builder setReturnValue(final com.yogento.api.models.user_settings.UserSettings returnValue) {
                    this.returnValue = returnValue;
                    return this;
                }

                private com.yogento.api.models.user_settings.UserSettings returnValue;
            }

            public getCurrentUserSettingsResponse(final getCurrentUserSettingsResponse other) {
                this(other.getReturnValue());
            }

            public getCurrentUserSettingsResponse(final org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
                returnValue = new com.yogento.api.models.user_settings.UserSettings(iprot);
            }

            public getCurrentUserSettingsResponse(final com.yogento.api.models.user_settings.UserSettings returnValue) {
                this.returnValue = com.google.common.base.Preconditions.checkNotNull(returnValue);
            }

            @Override
            public void clear() {
                throw new UnsupportedOperationException();
            }

            @Override
            public int compareTo(final getCurrentUserSettingsResponse other) {
                throw new UnsupportedOperationException();
            }

            @Override
            public org.apache.thrift.TBase<getCurrentUserSettingsResponse, org.apache.thrift.TFieldIdEnum> deepCopy() {
                throw new UnsupportedOperationException();
            }

            @Override
            public boolean equals(final Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof getCurrentUserSettingsResponse)) {
                    return false;
                }

                final getCurrentUserSettingsResponse other = (getCurrentUserSettingsResponse)otherObject;
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
                helper.add("return_value", getReturnValue());
                return helper.toString();
            }

            @Override
            public void write(final org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
                write(oprot, org.apache.thrift.protocol.TType.STRUCT);
            }

            public void write(final org.apache.thrift.protocol.TProtocol oprot, final byte writeAsTType) throws org.apache.thrift.TException {
                switch (writeAsTType) {
                    case org.apache.thrift.protocol.TType.VOID: {
                        getReturnValue().write(oprot);
                        break;
                    }

                    case org.apache.thrift.protocol.TType.LIST:
                        oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.VOID, 1));

                        getReturnValue().write(oprot);

                        oprot.writeListEnd();
                        break;

                    case org.apache.thrift.protocol.TType.STRUCT:
                    default:
                        oprot.writeStructBegin(new org.apache.thrift.protocol.TStruct("getCurrentUserSettingsResponse"));

                        oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("return_value", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
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
        public final static class putCurrentUserSettingsRequest implements org.apache.thrift.TBase<putCurrentUserSettingsRequest, org.apache.thrift.TFieldIdEnum> {
            public static class Builder {
                public Builder() {
                }

                public Builder(final putCurrentUserSettingsRequest other) {
                    this.userSettings = other.getUserSettings();
                }

                protected putCurrentUserSettingsRequest _build(final com.yogento.api.models.user_settings.UserSettings userSettings) {
                    return new putCurrentUserSettingsRequest(userSettings);
                }

                public putCurrentUserSettingsRequest build() {
                    return _build(userSettings);
                }

                public Builder setUserSettings(final com.yogento.api.models.user_settings.UserSettings userSettings) {
                    this.userSettings = userSettings;
                    return this;
                }

                private com.yogento.api.models.user_settings.UserSettings userSettings;
            }

            public putCurrentUserSettingsRequest(final putCurrentUserSettingsRequest other) {
                this(other.getUserSettings());
            }

            public putCurrentUserSettingsRequest(final org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
                this(iprot, org.apache.thrift.protocol.TType.STRUCT);
            }

            public putCurrentUserSettingsRequest(final org.apache.thrift.protocol.TProtocol iprot, final byte readAsTType) throws org.apache.thrift.TException {
                com.yogento.api.models.user_settings.UserSettings userSettings = null;

                switch (readAsTType) {
                    case org.apache.thrift.protocol.TType.LIST:
                        iprot.readListBegin();
                        userSettings = new com.yogento.api.models.user_settings.UserSettings(iprot);
                        iprot.readListEnd();
                        break;

                    case org.apache.thrift.protocol.TType.STRUCT:
                    default:
                        iprot.readStructBegin();
                        while (true) {
                            final org.apache.thrift.protocol.TField ifield = iprot.readFieldBegin();
                            if (ifield.type == org.apache.thrift.protocol.TType.STOP) {
                                break;
                            } else if (ifield.name.equals("user_settings")) {
                                userSettings = new com.yogento.api.models.user_settings.UserSettings(iprot);
                            }
                            iprot.readFieldEnd();
                        }
                        iprot.readStructEnd();
                        break;
                }

                this.userSettings = com.google.common.base.Preconditions.checkNotNull(userSettings);
            }

            public putCurrentUserSettingsRequest(final com.yogento.api.models.user_settings.UserSettings userSettings) {
                this.userSettings = com.google.common.base.Preconditions.checkNotNull(userSettings);
            }

            @Override
            public void clear() {
                throw new UnsupportedOperationException();
            }

            @Override
            public int compareTo(final putCurrentUserSettingsRequest other) {
                throw new UnsupportedOperationException();
            }

            @Override
            public org.apache.thrift.TBase<putCurrentUserSettingsRequest, org.apache.thrift.TFieldIdEnum> deepCopy() {
                throw new UnsupportedOperationException();
            }

            @Override
            public boolean equals(final Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof putCurrentUserSettingsRequest)) {
                    return false;
                }

                final putCurrentUserSettingsRequest other = (putCurrentUserSettingsRequest)otherObject;
                return
                    getUserSettings().equals(other.getUserSettings());
            }

            @Override
            public org.apache.thrift.TFieldIdEnum fieldForId(final int fieldId) {
                throw new UnsupportedOperationException();
            }

            public Object get(final String fieldName) {
                if (fieldName.equals("user_settings")) {
                    return getUserSettings();
                }
                return null;
            }

            @Override
            public Object getFieldValue(final org.apache.thrift.TFieldIdEnum field) {
                throw new UnsupportedOperationException();
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
                helper.add("user_settings", getUserSettings());
                return helper.toString();
            }

            @Override
            public void write(final org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
                write(oprot, org.apache.thrift.protocol.TType.STRUCT);
            }

            public void write(final org.apache.thrift.protocol.TProtocol oprot, final byte writeAsTType) throws org.apache.thrift.TException {
                switch (writeAsTType) {
                    case org.apache.thrift.protocol.TType.VOID: {
                        getUserSettings().write(oprot);
                        break;
                    }

                    case org.apache.thrift.protocol.TType.LIST:
                        oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.VOID, 1));

                        getUserSettings().write(oprot);

                        oprot.writeListEnd();
                        break;

                    case org.apache.thrift.protocol.TType.STRUCT:
                    default:
                        oprot.writeStructBegin(new org.apache.thrift.protocol.TStruct("putCurrentUserSettingsRequest"));

                        oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("user_settings", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
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
        public final static class putCurrentUserSettingsResponse implements org.apache.thrift.TBase<putCurrentUserSettingsResponse, org.apache.thrift.TFieldIdEnum> {
            public static class Builder {
                public Builder() {
                }

                public Builder(final putCurrentUserSettingsResponse other) {
                }

                protected putCurrentUserSettingsResponse _build() {
                    return new putCurrentUserSettingsResponse();
                }

                public putCurrentUserSettingsResponse build() {
                    return _build();
                }


            }

            public putCurrentUserSettingsResponse() {
            }

            public putCurrentUserSettingsResponse(final putCurrentUserSettingsResponse other) {
            }

            public putCurrentUserSettingsResponse(final org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
            }

            @Override
            public void clear() {
                throw new UnsupportedOperationException();
            }

            @Override
            public int compareTo(final putCurrentUserSettingsResponse other) {
                throw new UnsupportedOperationException();
            }

            @Override
            public org.apache.thrift.TBase<putCurrentUserSettingsResponse, org.apache.thrift.TFieldIdEnum> deepCopy() {
                throw new UnsupportedOperationException();
            }

            @Override
            public boolean equals(final Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof putCurrentUserSettingsResponse)) {
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
            public void setFieldValue(final org.apache.thrift.TFieldIdEnum field, final Object value) {
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
                        oprot.writeStructBegin(new org.apache.thrift.protocol.TStruct("putCurrentUserSettingsResponse"));

                        oprot.writeFieldStop();

                        oprot.writeStructEnd();
                        break;
                }
            }


        }
    }

    public com.yogento.api.models.user_settings.UserSettings getCurrentUserSettings() throws com.yogento.api.services.user_settings.NoSuchUserSettingsException;
    public void putCurrentUserSettings(com.yogento.api.models.user_settings.UserSettings userSettings);
}
