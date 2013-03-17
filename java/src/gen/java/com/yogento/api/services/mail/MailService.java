package com.yogento.api.services.mail;

public interface MailService {
    public static class Messages {
        @SuppressWarnings({"serial"})
        public final static class deleteMailCampaignRequest implements org.apache.thrift.TBase<deleteMailCampaignRequest, org.apache.thrift.TFieldIdEnum> {
            public static class Builder {
                public Builder() {
                }

                public Builder(final deleteMailCampaignRequest other) {
                    this.cid = other.getCid();
                    this.writeThrough = other.isWriteThrough();
                }

                protected deleteMailCampaignRequest _build(final String cid, final Boolean writeThrough) {
                    return new deleteMailCampaignRequest(cid, writeThrough);
                }

                public deleteMailCampaignRequest build() {
                    return _build(cid, writeThrough);
                }

                public Builder setCid(final String cid) {
                    this.cid = cid;
                    return this;
                }

                public Builder setWriteThrough(final Boolean writeThrough) {
                    this.writeThrough = writeThrough;
                    return this;
                }

                private String cid;
                private Boolean writeThrough;
            }

            public deleteMailCampaignRequest(final deleteMailCampaignRequest other) {
                this(other.getCid(), other.isWriteThrough());
            }

            public deleteMailCampaignRequest(final org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
                this(iprot, org.apache.thrift.protocol.TType.STRUCT);
            }

            public deleteMailCampaignRequest(final org.apache.thrift.protocol.TProtocol iprot, final byte readAsTType) throws org.apache.thrift.TException {
                String cid = null;
                Boolean writeThrough = null;

                switch (readAsTType) {
                    case org.apache.thrift.protocol.TType.LIST:
                        final org.apache.thrift.protocol.TList __list = iprot.readListBegin();
                        cid = iprot.readString();
                        if (__list.size > 1) {
                            writeThrough = iprot.readBool();
                        }
                        iprot.readListEnd();
                        break;

                    case org.apache.thrift.protocol.TType.STRUCT:
                    default:
                        iprot.readStructBegin();
                        while (true) {
                            final org.apache.thrift.protocol.TField ifield = iprot.readFieldBegin();
                            if (ifield.type == org.apache.thrift.protocol.TType.STOP) {
                                break;
                            } else if (ifield.name.equals("cid")) {
                                cid = iprot.readString();
                            } else if (ifield.name.equals("write_through")) {
                                writeThrough = iprot.readBool();
                            }
                            iprot.readFieldEnd();
                        }
                        iprot.readStructEnd();
                        break;
                }

                this.cid = com.google.common.base.Preconditions.checkNotNull(cid, "com.yogento.api.services.mail.deleteMailCampaignRequest: missing cid");
                this.writeThrough = writeThrough;
            }

            public deleteMailCampaignRequest(final String cid) {
                this.cid = com.google.common.base.Preconditions.checkNotNull(cid, "com.yogento.api.services.mail.deleteMailCampaignRequest: missing cid");
                this.writeThrough = null;
            }

            public deleteMailCampaignRequest(final String cid, final Boolean writeThrough) {
                this.cid = com.google.common.base.Preconditions.checkNotNull(cid, "com.yogento.api.services.mail.deleteMailCampaignRequest: missing cid");
                this.writeThrough = writeThrough;
            }

            @Override
            public void clear() {
                throw new UnsupportedOperationException();
            }

            @Override
            public int compareTo(final deleteMailCampaignRequest other) {
                throw new UnsupportedOperationException();
            }

            @Override
            public org.apache.thrift.TBase<deleteMailCampaignRequest, org.apache.thrift.TFieldIdEnum> deepCopy() {
                throw new UnsupportedOperationException();
            }

            @Override
            public boolean equals(final Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof deleteMailCampaignRequest)) {
                    return false;
                }

                final deleteMailCampaignRequest other = (deleteMailCampaignRequest)otherObject;
                return
                    getCid().equals(other.getCid()) &&
                    ((isWriteThrough() == null && other.isWriteThrough() == null) ||
                    (isWriteThrough() != null && other.isWriteThrough() != null &&
                    isWriteThrough().equals(other.isWriteThrough())));
            }

            @Override
            public org.apache.thrift.TFieldIdEnum fieldForId(final int fieldId) {
                throw new UnsupportedOperationException();
            }

            public Object get(final String fieldName) {
                if (fieldName.equals("cid")) {
                    return getCid();
                } else if (fieldName.equals("write_through")) {
                    return isWriteThrough();
                }
                return null;
            }

            public final String getCid() {
                return cid;
            }

            @Override
            public Object getFieldValue(final org.apache.thrift.TFieldIdEnum field) {
                throw new UnsupportedOperationException();
            }

            @Override
            public int hashCode() {
                int hashCode = 17;
                hashCode = 31 * hashCode + getCid().hashCode();
                if (isWriteThrough() != null) {
                    hashCode = 31 * hashCode + (isWriteThrough() ? 1 : 0);
                }
                return hashCode;
            }

            @Override
            public boolean isSet(final org.apache.thrift.TFieldIdEnum field) {
                throw new UnsupportedOperationException();
            }

            public final Boolean isWriteThrough() {
                return writeThrough;
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
                helper.add("cid", getCid());
                if (isWriteThrough() != null) {
                    helper.add("write_through", isWriteThrough());
                }
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

                        oprot.writeString(getCid());

                        if (isWriteThrough() != null) {
                            oprot.writeBool(isWriteThrough());
                        } else {
                            ((org.thryft.core.protocol.Protocol)oprot).writeNull();
                        }

                        oprot.writeListEnd();
                        break;

                    case org.apache.thrift.protocol.TType.STRUCT:
                    default:
                        oprot.writeStructBegin(new org.apache.thrift.protocol.TStruct("deleteMailCampaignRequest"));

                        oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("cid", org.apache.thrift.protocol.TType.STRING, (short)-1));
                        oprot.writeString(getCid());
                        oprot.writeFieldEnd();

                        if (isWriteThrough() != null) {
                            oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("write_through", org.apache.thrift.protocol.TType.BOOL, (short)-1));
                            oprot.writeBool(isWriteThrough());
                            oprot.writeFieldEnd();
                        }

                        oprot.writeFieldStop();

                        oprot.writeStructEnd();
                        break;
                }
            }

            private final String cid;
            private final Boolean writeThrough;
        }

        @SuppressWarnings({"serial"})
        public final static class deleteMailCampaignResponse implements org.apache.thrift.TBase<deleteMailCampaignResponse, org.apache.thrift.TFieldIdEnum> {
            public static class Builder {
                public Builder() {
                }

                public Builder(final deleteMailCampaignResponse other) {
                    this.returnValue = other.isReturnValue();
                }

                protected deleteMailCampaignResponse _build(final boolean returnValue) {
                    return new deleteMailCampaignResponse(returnValue);
                }

                public deleteMailCampaignResponse build() {
                    return _build(returnValue);
                }

                public Builder setReturnValue(final boolean returnValue) {
                    this.returnValue = returnValue;
                    return this;
                }

                private Boolean returnValue;
            }

            public deleteMailCampaignResponse(final deleteMailCampaignResponse other) {
                this(other.isReturnValue());
            }

            public deleteMailCampaignResponse(final org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
                returnValue = iprot.readBool();
            }

            public deleteMailCampaignResponse(final boolean returnValue) {
                this.returnValue = returnValue;
            }

            public deleteMailCampaignResponse(final Boolean returnValue) {
                this.returnValue = returnValue;
            }

            @Override
            public void clear() {
                throw new UnsupportedOperationException();
            }

            @Override
            public int compareTo(final deleteMailCampaignResponse other) {
                throw new UnsupportedOperationException();
            }

            @Override
            public org.apache.thrift.TBase<deleteMailCampaignResponse, org.apache.thrift.TFieldIdEnum> deepCopy() {
                throw new UnsupportedOperationException();
            }

            @Override
            public boolean equals(final Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof deleteMailCampaignResponse)) {
                    return false;
                }

                final deleteMailCampaignResponse other = (deleteMailCampaignResponse)otherObject;
                return
                    isReturnValue() == other.isReturnValue();
            }

            @Override
            public org.apache.thrift.TFieldIdEnum fieldForId(final int fieldId) {
                throw new UnsupportedOperationException();
            }

            public Object get(final String fieldName) {
                if (fieldName.equals("return_value")) {
                    return isReturnValue();
                }
                return null;
            }

            @Override
            public Object getFieldValue(final org.apache.thrift.TFieldIdEnum field) {
                throw new UnsupportedOperationException();
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
                helper.add("return_value", isReturnValue());
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

                        oprot.writeBool(isReturnValue());

                        oprot.writeListEnd();
                        break;

                    case org.apache.thrift.protocol.TType.STRUCT:
                    default:
                        oprot.writeStructBegin(new org.apache.thrift.protocol.TStruct("deleteMailCampaignResponse"));

                        oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("return_value", org.apache.thrift.protocol.TType.BOOL, (short)-1));
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
        public final static class getMailCampaignRequest implements org.apache.thrift.TBase<getMailCampaignRequest, org.apache.thrift.TFieldIdEnum> {
            public static class Builder {
                public Builder() {
                }

                public Builder(final getMailCampaignRequest other) {
                    this.cid = other.getCid();
                    this.includeContent = other.isIncludeContent();
                }

                protected getMailCampaignRequest _build(final String cid, final Boolean includeContent) {
                    return new getMailCampaignRequest(cid, includeContent);
                }

                public getMailCampaignRequest build() {
                    return _build(cid, includeContent);
                }

                public Builder setCid(final String cid) {
                    this.cid = cid;
                    return this;
                }

                public Builder setIncludeContent(final Boolean includeContent) {
                    this.includeContent = includeContent;
                    return this;
                }

                private String cid;
                private Boolean includeContent;
            }

            public getMailCampaignRequest(final getMailCampaignRequest other) {
                this(other.getCid(), other.isIncludeContent());
            }

            public getMailCampaignRequest(final org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
                this(iprot, org.apache.thrift.protocol.TType.STRUCT);
            }

            public getMailCampaignRequest(final org.apache.thrift.protocol.TProtocol iprot, final byte readAsTType) throws org.apache.thrift.TException {
                String cid = null;
                Boolean includeContent = null;

                switch (readAsTType) {
                    case org.apache.thrift.protocol.TType.LIST:
                        final org.apache.thrift.protocol.TList __list = iprot.readListBegin();
                        cid = iprot.readString();
                        if (__list.size > 1) {
                            includeContent = iprot.readBool();
                        }
                        iprot.readListEnd();
                        break;

                    case org.apache.thrift.protocol.TType.STRUCT:
                    default:
                        iprot.readStructBegin();
                        while (true) {
                            final org.apache.thrift.protocol.TField ifield = iprot.readFieldBegin();
                            if (ifield.type == org.apache.thrift.protocol.TType.STOP) {
                                break;
                            } else if (ifield.name.equals("cid")) {
                                cid = iprot.readString();
                            } else if (ifield.name.equals("include_content")) {
                                includeContent = iprot.readBool();
                            }
                            iprot.readFieldEnd();
                        }
                        iprot.readStructEnd();
                        break;
                }

                this.cid = com.google.common.base.Preconditions.checkNotNull(cid, "com.yogento.api.services.mail.getMailCampaignRequest: missing cid");
                this.includeContent = includeContent;
            }

            public getMailCampaignRequest(final String cid) {
                this.cid = com.google.common.base.Preconditions.checkNotNull(cid, "com.yogento.api.services.mail.getMailCampaignRequest: missing cid");
                this.includeContent = null;
            }

            public getMailCampaignRequest(final String cid, final Boolean includeContent) {
                this.cid = com.google.common.base.Preconditions.checkNotNull(cid, "com.yogento.api.services.mail.getMailCampaignRequest: missing cid");
                this.includeContent = includeContent;
            }

            @Override
            public void clear() {
                throw new UnsupportedOperationException();
            }

            @Override
            public int compareTo(final getMailCampaignRequest other) {
                throw new UnsupportedOperationException();
            }

            @Override
            public org.apache.thrift.TBase<getMailCampaignRequest, org.apache.thrift.TFieldIdEnum> deepCopy() {
                throw new UnsupportedOperationException();
            }

            @Override
            public boolean equals(final Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof getMailCampaignRequest)) {
                    return false;
                }

                final getMailCampaignRequest other = (getMailCampaignRequest)otherObject;
                return
                    getCid().equals(other.getCid()) &&
                    ((isIncludeContent() == null && other.isIncludeContent() == null) ||
                    (isIncludeContent() != null && other.isIncludeContent() != null &&
                    isIncludeContent().equals(other.isIncludeContent())));
            }

            @Override
            public org.apache.thrift.TFieldIdEnum fieldForId(final int fieldId) {
                throw new UnsupportedOperationException();
            }

            public Object get(final String fieldName) {
                if (fieldName.equals("cid")) {
                    return getCid();
                } else if (fieldName.equals("include_content")) {
                    return isIncludeContent();
                }
                return null;
            }

            public final String getCid() {
                return cid;
            }

            @Override
            public Object getFieldValue(final org.apache.thrift.TFieldIdEnum field) {
                throw new UnsupportedOperationException();
            }

            @Override
            public int hashCode() {
                int hashCode = 17;
                hashCode = 31 * hashCode + getCid().hashCode();
                if (isIncludeContent() != null) {
                    hashCode = 31 * hashCode + (isIncludeContent() ? 1 : 0);
                }
                return hashCode;
            }

            public final Boolean isIncludeContent() {
                return includeContent;
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
                helper.add("cid", getCid());
                if (isIncludeContent() != null) {
                    helper.add("include_content", isIncludeContent());
                }
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

                        oprot.writeString(getCid());

                        if (isIncludeContent() != null) {
                            oprot.writeBool(isIncludeContent());
                        } else {
                            ((org.thryft.core.protocol.Protocol)oprot).writeNull();
                        }

                        oprot.writeListEnd();
                        break;

                    case org.apache.thrift.protocol.TType.STRUCT:
                    default:
                        oprot.writeStructBegin(new org.apache.thrift.protocol.TStruct("getMailCampaignRequest"));

                        oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("cid", org.apache.thrift.protocol.TType.STRING, (short)-1));
                        oprot.writeString(getCid());
                        oprot.writeFieldEnd();

                        if (isIncludeContent() != null) {
                            oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("include_content", org.apache.thrift.protocol.TType.BOOL, (short)-1));
                            oprot.writeBool(isIncludeContent());
                            oprot.writeFieldEnd();
                        }

                        oprot.writeFieldStop();

                        oprot.writeStructEnd();
                        break;
                }
            }

            private final String cid;
            private final Boolean includeContent;
        }

        @SuppressWarnings({"serial"})
        public final static class getMailCampaignResponse implements org.apache.thrift.TBase<getMailCampaignResponse, org.apache.thrift.TFieldIdEnum> {
            public static class Builder {
                public Builder() {
                }

                public Builder(final getMailCampaignResponse other) {
                    this.returnValue = other.getReturnValue();
                }

                protected getMailCampaignResponse _build(final com.yogento.api.models.mail.campaign.MailCampaign returnValue) {
                    return new getMailCampaignResponse(returnValue);
                }

                public getMailCampaignResponse build() {
                    return _build(returnValue);
                }

                public Builder setReturnValue(final com.yogento.api.models.mail.campaign.MailCampaign returnValue) {
                    this.returnValue = returnValue;
                    return this;
                }

                private com.yogento.api.models.mail.campaign.MailCampaign returnValue;
            }

            public getMailCampaignResponse(final getMailCampaignResponse other) {
                this(other.getReturnValue());
            }

            public getMailCampaignResponse(final org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
                returnValue = new com.yogento.api.models.mail.campaign.MailCampaign(iprot);
            }

            public getMailCampaignResponse(final com.yogento.api.models.mail.campaign.MailCampaign returnValue) {
                this.returnValue = com.google.common.base.Preconditions.checkNotNull(returnValue, "com.yogento.api.services.mail.MailService.getMailCampaign: missing returnValue");
            }

            @Override
            public void clear() {
                throw new UnsupportedOperationException();
            }

            @Override
            public int compareTo(final getMailCampaignResponse other) {
                throw new UnsupportedOperationException();
            }

            @Override
            public org.apache.thrift.TBase<getMailCampaignResponse, org.apache.thrift.TFieldIdEnum> deepCopy() {
                throw new UnsupportedOperationException();
            }

            @Override
            public boolean equals(final Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof getMailCampaignResponse)) {
                    return false;
                }

                final getMailCampaignResponse other = (getMailCampaignResponse)otherObject;
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

            public final com.yogento.api.models.mail.campaign.MailCampaign getReturnValue() {
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
                        oprot.writeStructBegin(new org.apache.thrift.protocol.TStruct("getMailCampaignResponse"));

                        oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("return_value", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                        getReturnValue().write(oprot);
                        oprot.writeFieldEnd();

                        oprot.writeFieldStop();

                        oprot.writeStructEnd();
                        break;
                }
            }

            private final com.yogento.api.models.mail.campaign.MailCampaign returnValue;
        }

        @SuppressWarnings({"serial"})
        public final static class getMailCampaignsRequest implements org.apache.thrift.TBase<getMailCampaignsRequest, org.apache.thrift.TFieldIdEnum> {
            public static class Builder {
                public Builder() {
                }

                public Builder(final getMailCampaignsRequest other) {
                    this.includeContent = other.isIncludeContent();
                }

                protected getMailCampaignsRequest _build(final Boolean includeContent) {
                    return new getMailCampaignsRequest(includeContent);
                }

                public getMailCampaignsRequest build() {
                    return _build(includeContent);
                }

                public Builder setIncludeContent(final Boolean includeContent) {
                    this.includeContent = includeContent;
                    return this;
                }

                private Boolean includeContent;
            }

            public getMailCampaignsRequest() {
                includeContent = null;
            }

            public getMailCampaignsRequest(final getMailCampaignsRequest other) {
                this(other.isIncludeContent());
            }

            public getMailCampaignsRequest(final org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
                this(iprot, org.apache.thrift.protocol.TType.STRUCT);
            }

            public getMailCampaignsRequest(final org.apache.thrift.protocol.TProtocol iprot, final byte readAsTType) throws org.apache.thrift.TException {
                Boolean includeContent = null;

                switch (readAsTType) {
                    case org.apache.thrift.protocol.TType.LIST:
                        final org.apache.thrift.protocol.TList __list = iprot.readListBegin();
                        if (__list.size > 0) {
                            includeContent = iprot.readBool();
                        }
                        iprot.readListEnd();
                        break;

                    case org.apache.thrift.protocol.TType.STRUCT:
                    default:
                        iprot.readStructBegin();
                        while (true) {
                            final org.apache.thrift.protocol.TField ifield = iprot.readFieldBegin();
                            if (ifield.type == org.apache.thrift.protocol.TType.STOP) {
                                break;
                            } else if (ifield.name.equals("include_content")) {
                                includeContent = iprot.readBool();
                            }
                            iprot.readFieldEnd();
                        }
                        iprot.readStructEnd();
                        break;
                }

                this.includeContent = includeContent;
            }

            public getMailCampaignsRequest(final Boolean includeContent) {
                this.includeContent = includeContent;
            }

            @Override
            public void clear() {
                throw new UnsupportedOperationException();
            }

            @Override
            public int compareTo(final getMailCampaignsRequest other) {
                throw new UnsupportedOperationException();
            }

            @Override
            public org.apache.thrift.TBase<getMailCampaignsRequest, org.apache.thrift.TFieldIdEnum> deepCopy() {
                throw new UnsupportedOperationException();
            }

            @Override
            public boolean equals(final Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof getMailCampaignsRequest)) {
                    return false;
                }

                final getMailCampaignsRequest other = (getMailCampaignsRequest)otherObject;
                return
                    ((isIncludeContent() == null && other.isIncludeContent() == null) ||
                    (isIncludeContent() != null && other.isIncludeContent() != null &&
                    isIncludeContent().equals(other.isIncludeContent())));
            }

            @Override
            public org.apache.thrift.TFieldIdEnum fieldForId(final int fieldId) {
                throw new UnsupportedOperationException();
            }

            public Object get(final String fieldName) {
                if (fieldName.equals("include_content")) {
                    return isIncludeContent();
                }
                return null;
            }

            @Override
            public Object getFieldValue(final org.apache.thrift.TFieldIdEnum field) {
                throw new UnsupportedOperationException();
            }

            @Override
            public int hashCode() {
                int hashCode = 17;
                if (isIncludeContent() != null) {
                    hashCode = 31 * hashCode + (isIncludeContent() ? 1 : 0);
                }
                return hashCode;
            }

            public final Boolean isIncludeContent() {
                return includeContent;
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
                if (isIncludeContent() != null) {
                    helper.add("include_content", isIncludeContent());
                }
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

                        if (isIncludeContent() != null) {
                            oprot.writeBool(isIncludeContent());
                        } else {
                            ((org.thryft.core.protocol.Protocol)oprot).writeNull();
                        }

                        oprot.writeListEnd();
                        break;

                    case org.apache.thrift.protocol.TType.STRUCT:
                    default:
                        oprot.writeStructBegin(new org.apache.thrift.protocol.TStruct("getMailCampaignsRequest"));

                        if (isIncludeContent() != null) {
                            oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("include_content", org.apache.thrift.protocol.TType.BOOL, (short)-1));
                            oprot.writeBool(isIncludeContent());
                            oprot.writeFieldEnd();
                        }

                        oprot.writeFieldStop();

                        oprot.writeStructEnd();
                        break;
                }
            }

            private final Boolean includeContent;
        }

        @SuppressWarnings({"serial"})
        public final static class getMailCampaignsResponse implements org.apache.thrift.TBase<getMailCampaignsResponse, org.apache.thrift.TFieldIdEnum> {
            public static class Builder {
                public Builder() {
                }

                public Builder(final getMailCampaignsResponse other) {
                    this.returnValue = other.getReturnValue();
                }

                protected getMailCampaignsResponse _build(final com.google.common.collect.ImmutableSet<com.yogento.api.models.mail.campaign.MailCampaign> returnValue) {
                    return new getMailCampaignsResponse(returnValue);
                }

                public getMailCampaignsResponse build() {
                    return _build(returnValue);
                }

                public Builder setReturnValue(final com.google.common.collect.ImmutableSet<com.yogento.api.models.mail.campaign.MailCampaign> returnValue) {
                    this.returnValue = returnValue;
                    return this;
                }

                private com.google.common.collect.ImmutableSet<com.yogento.api.models.mail.campaign.MailCampaign> returnValue;
            }

            public getMailCampaignsResponse(final getMailCampaignsResponse other) {
                this(other.getReturnValue());
            }

            public getMailCampaignsResponse(final org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
                returnValue = (new com.google.common.base.Function<org.apache.thrift.protocol.TProtocol, com.google.common.collect.ImmutableSet<com.yogento.api.models.mail.campaign.MailCampaign>>() {
                    @Override
                    public com.google.common.collect.ImmutableSet<com.yogento.api.models.mail.campaign.MailCampaign> apply(final org.apache.thrift.protocol.TProtocol iprot) {
                        try {
                            final org.apache.thrift.protocol.TSet sequenceBegin = iprot.readSetBegin();
                            final java.util.Set<com.yogento.api.models.mail.campaign.MailCampaign> sequence = new java.util.LinkedHashSet<com.yogento.api.models.mail.campaign.MailCampaign>();
                            for (int elementI = 0; elementI < sequenceBegin.size; elementI++) {
                                sequence.add(new com.yogento.api.models.mail.campaign.MailCampaign(iprot));
                            }
                            iprot.readSetEnd();
                            return com.google.common.collect.ImmutableSet.copyOf(sequence);
                        } catch (final org.apache.thrift.TException e) {
                            return com.google.common.collect.ImmutableSet.of();
                        }
                    }
                }).apply(iprot);
            }

            public getMailCampaignsResponse(final com.google.common.collect.ImmutableSet<com.yogento.api.models.mail.campaign.MailCampaign> returnValue) {
                this.returnValue = com.google.common.base.Preconditions.checkNotNull(returnValue, "com.yogento.api.services.mail.MailService.getMailCampaigns: missing returnValue");
            }

            @Override
            public void clear() {
                throw new UnsupportedOperationException();
            }

            @Override
            public int compareTo(final getMailCampaignsResponse other) {
                throw new UnsupportedOperationException();
            }

            @Override
            public org.apache.thrift.TBase<getMailCampaignsResponse, org.apache.thrift.TFieldIdEnum> deepCopy() {
                throw new UnsupportedOperationException();
            }

            @Override
            public boolean equals(final Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof getMailCampaignsResponse)) {
                    return false;
                }

                final getMailCampaignsResponse other = (getMailCampaignsResponse)otherObject;
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

            public final com.google.common.collect.ImmutableSet<com.yogento.api.models.mail.campaign.MailCampaign> getReturnValue() {
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
                        oprot.writeSetBegin(new org.apache.thrift.protocol.TSet(org.apache.thrift.protocol.TType.STRUCT, getReturnValue().size()));
                        for (final com.yogento.api.models.mail.campaign.MailCampaign _iter0 : getReturnValue()) {
                            _iter0.write(oprot);
                        }
                        oprot.writeSetEnd();
                        break;
                    }

                    case org.apache.thrift.protocol.TType.LIST:
                        oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.VOID, 1));

                        oprot.writeSetBegin(new org.apache.thrift.protocol.TSet(org.apache.thrift.protocol.TType.STRUCT, getReturnValue().size()));
                        for (final com.yogento.api.models.mail.campaign.MailCampaign _iter0 : getReturnValue()) {
                            _iter0.write(oprot);
                        }
                        oprot.writeSetEnd();

                        oprot.writeListEnd();
                        break;

                    case org.apache.thrift.protocol.TType.STRUCT:
                    default:
                        oprot.writeStructBegin(new org.apache.thrift.protocol.TStruct("getMailCampaignsResponse"));

                        oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("return_value", org.apache.thrift.protocol.TType.SET, (short)-1));
                        oprot.writeSetBegin(new org.apache.thrift.protocol.TSet(org.apache.thrift.protocol.TType.STRUCT, getReturnValue().size()));
                        for (final com.yogento.api.models.mail.campaign.MailCampaign _iter0 : getReturnValue()) {
                            _iter0.write(oprot);
                        }
                        oprot.writeSetEnd();
                        oprot.writeFieldEnd();

                        oprot.writeFieldStop();

                        oprot.writeStructEnd();
                        break;
                }
            }

            private final com.google.common.collect.ImmutableSet<com.yogento.api.models.mail.campaign.MailCampaign> returnValue;
        }

        @SuppressWarnings({"serial"})
        public final static class getMailCampaignStatsRequest implements org.apache.thrift.TBase<getMailCampaignStatsRequest, org.apache.thrift.TFieldIdEnum> {
            public static class Builder {
                public Builder() {
                }

                public Builder(final getMailCampaignStatsRequest other) {
                    this.cid = other.getCid();
                }

                protected getMailCampaignStatsRequest _build(final String cid) {
                    return new getMailCampaignStatsRequest(cid);
                }

                public getMailCampaignStatsRequest build() {
                    return _build(cid);
                }

                public Builder setCid(final String cid) {
                    this.cid = cid;
                    return this;
                }

                private String cid;
            }

            public getMailCampaignStatsRequest(final getMailCampaignStatsRequest other) {
                this(other.getCid());
            }

            public getMailCampaignStatsRequest(final org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
                this(iprot, org.apache.thrift.protocol.TType.STRUCT);
            }

            public getMailCampaignStatsRequest(final org.apache.thrift.protocol.TProtocol iprot, final byte readAsTType) throws org.apache.thrift.TException {
                String cid = null;

                switch (readAsTType) {
                    case org.apache.thrift.protocol.TType.LIST:
                        iprot.readListBegin();
                        cid = iprot.readString();
                        iprot.readListEnd();
                        break;

                    case org.apache.thrift.protocol.TType.STRUCT:
                    default:
                        iprot.readStructBegin();
                        while (true) {
                            final org.apache.thrift.protocol.TField ifield = iprot.readFieldBegin();
                            if (ifield.type == org.apache.thrift.protocol.TType.STOP) {
                                break;
                            } else if (ifield.name.equals("cid")) {
                                cid = iprot.readString();
                            }
                            iprot.readFieldEnd();
                        }
                        iprot.readStructEnd();
                        break;
                }

                this.cid = com.google.common.base.Preconditions.checkNotNull(cid, "com.yogento.api.services.mail.getMailCampaignStatsRequest: missing cid");
            }

            public getMailCampaignStatsRequest(final String cid) {
                this.cid = com.google.common.base.Preconditions.checkNotNull(cid, "com.yogento.api.services.mail.getMailCampaignStatsRequest: missing cid");
            }

            @Override
            public void clear() {
                throw new UnsupportedOperationException();
            }

            @Override
            public int compareTo(final getMailCampaignStatsRequest other) {
                throw new UnsupportedOperationException();
            }

            @Override
            public org.apache.thrift.TBase<getMailCampaignStatsRequest, org.apache.thrift.TFieldIdEnum> deepCopy() {
                throw new UnsupportedOperationException();
            }

            @Override
            public boolean equals(final Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof getMailCampaignStatsRequest)) {
                    return false;
                }

                final getMailCampaignStatsRequest other = (getMailCampaignStatsRequest)otherObject;
                return
                    getCid().equals(other.getCid());
            }

            @Override
            public org.apache.thrift.TFieldIdEnum fieldForId(final int fieldId) {
                throw new UnsupportedOperationException();
            }

            public Object get(final String fieldName) {
                if (fieldName.equals("cid")) {
                    return getCid();
                }
                return null;
            }

            public final String getCid() {
                return cid;
            }

            @Override
            public Object getFieldValue(final org.apache.thrift.TFieldIdEnum field) {
                throw new UnsupportedOperationException();
            }

            @Override
            public int hashCode() {
                int hashCode = 17;
                hashCode = 31 * hashCode + getCid().hashCode();
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
                helper.add("cid", getCid());
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

                        oprot.writeString(getCid());

                        oprot.writeListEnd();
                        break;

                    case org.apache.thrift.protocol.TType.STRUCT:
                    default:
                        oprot.writeStructBegin(new org.apache.thrift.protocol.TStruct("getMailCampaignStatsRequest"));

                        oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("cid", org.apache.thrift.protocol.TType.STRING, (short)-1));
                        oprot.writeString(getCid());
                        oprot.writeFieldEnd();

                        oprot.writeFieldStop();

                        oprot.writeStructEnd();
                        break;
                }
            }

            private final String cid;
        }

        @SuppressWarnings({"serial"})
        public final static class getMailCampaignStatsResponse implements org.apache.thrift.TBase<getMailCampaignStatsResponse, org.apache.thrift.TFieldIdEnum> {
            public static class Builder {
                public Builder() {
                }

                public Builder(final getMailCampaignStatsResponse other) {
                    this.returnValue = other.getReturnValue();
                }

                protected getMailCampaignStatsResponse _build(final com.yogento.api.models.mail.campaign.MailCampaignStats returnValue) {
                    return new getMailCampaignStatsResponse(returnValue);
                }

                public getMailCampaignStatsResponse build() {
                    return _build(returnValue);
                }

                public Builder setReturnValue(final com.yogento.api.models.mail.campaign.MailCampaignStats returnValue) {
                    this.returnValue = returnValue;
                    return this;
                }

                private com.yogento.api.models.mail.campaign.MailCampaignStats returnValue;
            }

            public getMailCampaignStatsResponse(final getMailCampaignStatsResponse other) {
                this(other.getReturnValue());
            }

            public getMailCampaignStatsResponse(final org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
                returnValue = new com.yogento.api.models.mail.campaign.MailCampaignStats(iprot);
            }

            public getMailCampaignStatsResponse(final com.yogento.api.models.mail.campaign.MailCampaignStats returnValue) {
                this.returnValue = com.google.common.base.Preconditions.checkNotNull(returnValue, "com.yogento.api.services.mail.MailService.getMailCampaignStats: missing returnValue");
            }

            @Override
            public void clear() {
                throw new UnsupportedOperationException();
            }

            @Override
            public int compareTo(final getMailCampaignStatsResponse other) {
                throw new UnsupportedOperationException();
            }

            @Override
            public org.apache.thrift.TBase<getMailCampaignStatsResponse, org.apache.thrift.TFieldIdEnum> deepCopy() {
                throw new UnsupportedOperationException();
            }

            @Override
            public boolean equals(final Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof getMailCampaignStatsResponse)) {
                    return false;
                }

                final getMailCampaignStatsResponse other = (getMailCampaignStatsResponse)otherObject;
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

            public final com.yogento.api.models.mail.campaign.MailCampaignStats getReturnValue() {
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
                        oprot.writeStructBegin(new org.apache.thrift.protocol.TStruct("getMailCampaignStatsResponse"));

                        oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("return_value", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                        getReturnValue().write(oprot);
                        oprot.writeFieldEnd();

                        oprot.writeFieldStop();

                        oprot.writeStructEnd();
                        break;
                }
            }

            private final com.yogento.api.models.mail.campaign.MailCampaignStats returnValue;
        }

        @SuppressWarnings({"serial"})
        public final static class getMailListsRequest implements org.apache.thrift.TBase<getMailListsRequest, org.apache.thrift.TFieldIdEnum> {
            public static class Builder {
                public Builder() {
                }

                public Builder(final getMailListsRequest other) {
                }

                protected getMailListsRequest _build() {
                    return new getMailListsRequest();
                }

                public getMailListsRequest build() {
                    return _build();
                }
            }

            public getMailListsRequest() {
            }

            public getMailListsRequest(final getMailListsRequest other) {
            }

            public getMailListsRequest(final org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
                this(iprot, org.apache.thrift.protocol.TType.STRUCT);
            }

            public getMailListsRequest(final org.apache.thrift.protocol.TProtocol iprot, final byte readAsTType) throws org.apache.thrift.TException {
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
            public int compareTo(final getMailListsRequest other) {
                throw new UnsupportedOperationException();
            }

            @Override
            public org.apache.thrift.TBase<getMailListsRequest, org.apache.thrift.TFieldIdEnum> deepCopy() {
                throw new UnsupportedOperationException();
            }

            @Override
            public boolean equals(final Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof getMailListsRequest)) {
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
                        oprot.writeStructBegin(new org.apache.thrift.protocol.TStruct("getMailListsRequest"));

                        oprot.writeFieldStop();

                        oprot.writeStructEnd();
                        break;
                }
            }
        }

        @SuppressWarnings({"serial"})
        public final static class getMailListsResponse implements org.apache.thrift.TBase<getMailListsResponse, org.apache.thrift.TFieldIdEnum> {
            public static class Builder {
                public Builder() {
                }

                public Builder(final getMailListsResponse other) {
                    this.returnValue = other.getReturnValue();
                }

                protected getMailListsResponse _build(final com.google.common.collect.ImmutableSet<com.yogento.api.models.mail.list.MailList> returnValue) {
                    return new getMailListsResponse(returnValue);
                }

                public getMailListsResponse build() {
                    return _build(returnValue);
                }

                public Builder setReturnValue(final com.google.common.collect.ImmutableSet<com.yogento.api.models.mail.list.MailList> returnValue) {
                    this.returnValue = returnValue;
                    return this;
                }

                private com.google.common.collect.ImmutableSet<com.yogento.api.models.mail.list.MailList> returnValue;
            }

            public getMailListsResponse(final getMailListsResponse other) {
                this(other.getReturnValue());
            }

            public getMailListsResponse(final org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
                returnValue = (new com.google.common.base.Function<org.apache.thrift.protocol.TProtocol, com.google.common.collect.ImmutableSet<com.yogento.api.models.mail.list.MailList>>() {
                    @Override
                    public com.google.common.collect.ImmutableSet<com.yogento.api.models.mail.list.MailList> apply(final org.apache.thrift.protocol.TProtocol iprot) {
                        try {
                            final org.apache.thrift.protocol.TSet sequenceBegin = iprot.readSetBegin();
                            final java.util.Set<com.yogento.api.models.mail.list.MailList> sequence = new java.util.LinkedHashSet<com.yogento.api.models.mail.list.MailList>();
                            for (int elementI = 0; elementI < sequenceBegin.size; elementI++) {
                                sequence.add(new com.yogento.api.models.mail.list.MailList(iprot));
                            }
                            iprot.readSetEnd();
                            return com.google.common.collect.ImmutableSet.copyOf(sequence);
                        } catch (final org.apache.thrift.TException e) {
                            return com.google.common.collect.ImmutableSet.of();
                        }
                    }
                }).apply(iprot);
            }

            public getMailListsResponse(final com.google.common.collect.ImmutableSet<com.yogento.api.models.mail.list.MailList> returnValue) {
                this.returnValue = com.google.common.base.Preconditions.checkNotNull(returnValue, "com.yogento.api.services.mail.MailService.getMailLists: missing returnValue");
            }

            @Override
            public void clear() {
                throw new UnsupportedOperationException();
            }

            @Override
            public int compareTo(final getMailListsResponse other) {
                throw new UnsupportedOperationException();
            }

            @Override
            public org.apache.thrift.TBase<getMailListsResponse, org.apache.thrift.TFieldIdEnum> deepCopy() {
                throw new UnsupportedOperationException();
            }

            @Override
            public boolean equals(final Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof getMailListsResponse)) {
                    return false;
                }

                final getMailListsResponse other = (getMailListsResponse)otherObject;
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

            public final com.google.common.collect.ImmutableSet<com.yogento.api.models.mail.list.MailList> getReturnValue() {
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
                        oprot.writeSetBegin(new org.apache.thrift.protocol.TSet(org.apache.thrift.protocol.TType.STRUCT, getReturnValue().size()));
                        for (final com.yogento.api.models.mail.list.MailList _iter0 : getReturnValue()) {
                            _iter0.write(oprot);
                        }
                        oprot.writeSetEnd();
                        break;
                    }

                    case org.apache.thrift.protocol.TType.LIST:
                        oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.VOID, 1));

                        oprot.writeSetBegin(new org.apache.thrift.protocol.TSet(org.apache.thrift.protocol.TType.STRUCT, getReturnValue().size()));
                        for (final com.yogento.api.models.mail.list.MailList _iter0 : getReturnValue()) {
                            _iter0.write(oprot);
                        }
                        oprot.writeSetEnd();

                        oprot.writeListEnd();
                        break;

                    case org.apache.thrift.protocol.TType.STRUCT:
                    default:
                        oprot.writeStructBegin(new org.apache.thrift.protocol.TStruct("getMailListsResponse"));

                        oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("return_value", org.apache.thrift.protocol.TType.SET, (short)-1));
                        oprot.writeSetBegin(new org.apache.thrift.protocol.TSet(org.apache.thrift.protocol.TType.STRUCT, getReturnValue().size()));
                        for (final com.yogento.api.models.mail.list.MailList _iter0 : getReturnValue()) {
                            _iter0.write(oprot);
                        }
                        oprot.writeSetEnd();
                        oprot.writeFieldEnd();

                        oprot.writeFieldStop();

                        oprot.writeStructEnd();
                        break;
                }
            }

            private final com.google.common.collect.ImmutableSet<com.yogento.api.models.mail.list.MailList> returnValue;
        }

        @SuppressWarnings({"serial"})
        public final static class getMailTemplatesRequest implements org.apache.thrift.TBase<getMailTemplatesRequest, org.apache.thrift.TFieldIdEnum> {
            public static class Builder {
                public Builder() {
                }

                public Builder(final getMailTemplatesRequest other) {
                    this.types = other.getTypes();
                }

                protected getMailTemplatesRequest _build(final com.google.common.collect.ImmutableSet<com.yogento.api.models.mail.template.MailTemplateType> types) {
                    return new getMailTemplatesRequest(types);
                }

                public getMailTemplatesRequest build() {
                    return _build(types);
                }

                public Builder setTypes(final com.google.common.collect.ImmutableSet<com.yogento.api.models.mail.template.MailTemplateType> types) {
                    this.types = types;
                    return this;
                }

                private com.google.common.collect.ImmutableSet<com.yogento.api.models.mail.template.MailTemplateType> types;
            }

            public getMailTemplatesRequest() {
                types = null;
            }

            public getMailTemplatesRequest(final getMailTemplatesRequest other) {
                this(other.getTypes());
            }

            public getMailTemplatesRequest(final org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
                this(iprot, org.apache.thrift.protocol.TType.STRUCT);
            }

            public getMailTemplatesRequest(final org.apache.thrift.protocol.TProtocol iprot, final byte readAsTType) throws org.apache.thrift.TException {
                com.google.common.collect.ImmutableSet<com.yogento.api.models.mail.template.MailTemplateType> types = null;

                switch (readAsTType) {
                    case org.apache.thrift.protocol.TType.LIST:
                        final org.apache.thrift.protocol.TList __list = iprot.readListBegin();
                        if (__list.size > 0) {
                            types = (new com.google.common.base.Function<org.apache.thrift.protocol.TProtocol, com.google.common.collect.ImmutableSet<com.yogento.api.models.mail.template.MailTemplateType>>() {
                                @Override
                                public com.google.common.collect.ImmutableSet<com.yogento.api.models.mail.template.MailTemplateType> apply(final org.apache.thrift.protocol.TProtocol iprot) {
                                    try {
                                        final org.apache.thrift.protocol.TSet sequenceBegin = iprot.readSetBegin();
                                        final java.util.Set<com.yogento.api.models.mail.template.MailTemplateType> sequence = new java.util.LinkedHashSet<com.yogento.api.models.mail.template.MailTemplateType>();
                                        for (int elementI = 0; elementI < sequenceBegin.size; elementI++) {
                                            sequence.add(new com.yogento.api.models.mail.template.MailTemplateType(iprot));
                                        }
                                        iprot.readSetEnd();
                                        return com.google.common.collect.ImmutableSet.copyOf(sequence);
                                    } catch (final org.apache.thrift.TException e) {
                                        return com.google.common.collect.ImmutableSet.of();
                                    }
                                }
                            }).apply(iprot);
                        }
                        iprot.readListEnd();
                        break;

                    case org.apache.thrift.protocol.TType.STRUCT:
                    default:
                        iprot.readStructBegin();
                        while (true) {
                            final org.apache.thrift.protocol.TField ifield = iprot.readFieldBegin();
                            if (ifield.type == org.apache.thrift.protocol.TType.STOP) {
                                break;
                            } else if (ifield.name.equals("types")) {
                                types = (new com.google.common.base.Function<org.apache.thrift.protocol.TProtocol, com.google.common.collect.ImmutableSet<com.yogento.api.models.mail.template.MailTemplateType>>() {
                                    @Override
                                    public com.google.common.collect.ImmutableSet<com.yogento.api.models.mail.template.MailTemplateType> apply(final org.apache.thrift.protocol.TProtocol iprot) {
                                        try {
                                            final org.apache.thrift.protocol.TSet sequenceBegin = iprot.readSetBegin();
                                            final java.util.Set<com.yogento.api.models.mail.template.MailTemplateType> sequence = new java.util.LinkedHashSet<com.yogento.api.models.mail.template.MailTemplateType>();
                                            for (int elementI = 0; elementI < sequenceBegin.size; elementI++) {
                                                sequence.add(new com.yogento.api.models.mail.template.MailTemplateType(iprot));
                                            }
                                            iprot.readSetEnd();
                                            return com.google.common.collect.ImmutableSet.copyOf(sequence);
                                        } catch (final org.apache.thrift.TException e) {
                                            return com.google.common.collect.ImmutableSet.of();
                                        }
                                    }
                                }).apply(iprot);
                            }
                            iprot.readFieldEnd();
                        }
                        iprot.readStructEnd();
                        break;
                }

                this.types = types;
            }

            public getMailTemplatesRequest(final com.google.common.collect.ImmutableSet<com.yogento.api.models.mail.template.MailTemplateType> types) {
                this.types = types;
            }

            @Override
            public void clear() {
                throw new UnsupportedOperationException();
            }

            @Override
            public int compareTo(final getMailTemplatesRequest other) {
                throw new UnsupportedOperationException();
            }

            @Override
            public org.apache.thrift.TBase<getMailTemplatesRequest, org.apache.thrift.TFieldIdEnum> deepCopy() {
                throw new UnsupportedOperationException();
            }

            @Override
            public boolean equals(final Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof getMailTemplatesRequest)) {
                    return false;
                }

                final getMailTemplatesRequest other = (getMailTemplatesRequest)otherObject;
                return
                    ((getTypes() == null && other.getTypes() == null) ||
                    (getTypes() != null && other.getTypes() != null &&
                    getTypes().equals(other.getTypes())));
            }

            @Override
            public org.apache.thrift.TFieldIdEnum fieldForId(final int fieldId) {
                throw new UnsupportedOperationException();
            }

            public Object get(final String fieldName) {
                if (fieldName.equals("types")) {
                    return getTypes();
                }
                return null;
            }

            @Override
            public Object getFieldValue(final org.apache.thrift.TFieldIdEnum field) {
                throw new UnsupportedOperationException();
            }

            public final com.google.common.collect.ImmutableSet<com.yogento.api.models.mail.template.MailTemplateType> getTypes() {
                return types;
            }

            @Override
            public int hashCode() {
                int hashCode = 17;
                if (getTypes() != null) {
                    hashCode = 31 * hashCode + getTypes().hashCode();
                }
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
                if (getTypes() != null) {
                    helper.add("types", getTypes());
                }
                return helper.toString();
            }

            @Override
            public void write(final org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
                write(oprot, org.apache.thrift.protocol.TType.STRUCT);
            }

            public void write(final org.apache.thrift.protocol.TProtocol oprot, final byte writeAsTType) throws org.apache.thrift.TException {
                switch (writeAsTType) {
                    case org.apache.thrift.protocol.TType.VOID: {
                        oprot.writeSetBegin(new org.apache.thrift.protocol.TSet(org.apache.thrift.protocol.TType.STRUCT, getTypes().size()));
                        for (final com.yogento.api.models.mail.template.MailTemplateType _iter0 : getTypes()) {
                            _iter0.write(oprot);
                        }
                        oprot.writeSetEnd();
                        break;
                    }

                    case org.apache.thrift.protocol.TType.LIST:
                        oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.VOID, 1));

                        if (getTypes() != null) {
                            oprot.writeSetBegin(new org.apache.thrift.protocol.TSet(org.apache.thrift.protocol.TType.STRUCT, getTypes().size()));
                            for (final com.yogento.api.models.mail.template.MailTemplateType _iter0 : getTypes()) {
                                _iter0.write(oprot);
                            }
                            oprot.writeSetEnd();
                        } else {
                            ((org.thryft.core.protocol.Protocol)oprot).writeNull();
                        }

                        oprot.writeListEnd();
                        break;

                    case org.apache.thrift.protocol.TType.STRUCT:
                    default:
                        oprot.writeStructBegin(new org.apache.thrift.protocol.TStruct("getMailTemplatesRequest"));

                        if (getTypes() != null) {
                            oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("types", org.apache.thrift.protocol.TType.SET, (short)-1));
                            oprot.writeSetBegin(new org.apache.thrift.protocol.TSet(org.apache.thrift.protocol.TType.STRUCT, getTypes().size()));
                            for (final com.yogento.api.models.mail.template.MailTemplateType _iter0 : getTypes()) {
                                _iter0.write(oprot);
                            }
                            oprot.writeSetEnd();
                            oprot.writeFieldEnd();
                        }

                        oprot.writeFieldStop();

                        oprot.writeStructEnd();
                        break;
                }
            }

            private final com.google.common.collect.ImmutableSet<com.yogento.api.models.mail.template.MailTemplateType> types;
        }

        @SuppressWarnings({"serial"})
        public final static class getMailTemplatesResponse implements org.apache.thrift.TBase<getMailTemplatesResponse, org.apache.thrift.TFieldIdEnum> {
            public static class Builder {
                public Builder() {
                }

                public Builder(final getMailTemplatesResponse other) {
                    this.returnValue = other.getReturnValue();
                }

                protected getMailTemplatesResponse _build(final com.google.common.collect.ImmutableSet<com.yogento.api.models.mail.template.MailTemplate> returnValue) {
                    return new getMailTemplatesResponse(returnValue);
                }

                public getMailTemplatesResponse build() {
                    return _build(returnValue);
                }

                public Builder setReturnValue(final com.google.common.collect.ImmutableSet<com.yogento.api.models.mail.template.MailTemplate> returnValue) {
                    this.returnValue = returnValue;
                    return this;
                }

                private com.google.common.collect.ImmutableSet<com.yogento.api.models.mail.template.MailTemplate> returnValue;
            }

            public getMailTemplatesResponse(final getMailTemplatesResponse other) {
                this(other.getReturnValue());
            }

            public getMailTemplatesResponse(final org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
                returnValue = (new com.google.common.base.Function<org.apache.thrift.protocol.TProtocol, com.google.common.collect.ImmutableSet<com.yogento.api.models.mail.template.MailTemplate>>() {
                    @Override
                    public com.google.common.collect.ImmutableSet<com.yogento.api.models.mail.template.MailTemplate> apply(final org.apache.thrift.protocol.TProtocol iprot) {
                        try {
                            final org.apache.thrift.protocol.TSet sequenceBegin = iprot.readSetBegin();
                            final java.util.Set<com.yogento.api.models.mail.template.MailTemplate> sequence = new java.util.LinkedHashSet<com.yogento.api.models.mail.template.MailTemplate>();
                            for (int elementI = 0; elementI < sequenceBegin.size; elementI++) {
                                sequence.add(new com.yogento.api.models.mail.template.MailTemplate(iprot));
                            }
                            iprot.readSetEnd();
                            return com.google.common.collect.ImmutableSet.copyOf(sequence);
                        } catch (final org.apache.thrift.TException e) {
                            return com.google.common.collect.ImmutableSet.of();
                        }
                    }
                }).apply(iprot);
            }

            public getMailTemplatesResponse(final com.google.common.collect.ImmutableSet<com.yogento.api.models.mail.template.MailTemplate> returnValue) {
                this.returnValue = com.google.common.base.Preconditions.checkNotNull(returnValue, "com.yogento.api.services.mail.MailService.getMailTemplates: missing returnValue");
            }

            @Override
            public void clear() {
                throw new UnsupportedOperationException();
            }

            @Override
            public int compareTo(final getMailTemplatesResponse other) {
                throw new UnsupportedOperationException();
            }

            @Override
            public org.apache.thrift.TBase<getMailTemplatesResponse, org.apache.thrift.TFieldIdEnum> deepCopy() {
                throw new UnsupportedOperationException();
            }

            @Override
            public boolean equals(final Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof getMailTemplatesResponse)) {
                    return false;
                }

                final getMailTemplatesResponse other = (getMailTemplatesResponse)otherObject;
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

            public final com.google.common.collect.ImmutableSet<com.yogento.api.models.mail.template.MailTemplate> getReturnValue() {
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
                        oprot.writeSetBegin(new org.apache.thrift.protocol.TSet(org.apache.thrift.protocol.TType.STRUCT, getReturnValue().size()));
                        for (final com.yogento.api.models.mail.template.MailTemplate _iter0 : getReturnValue()) {
                            _iter0.write(oprot);
                        }
                        oprot.writeSetEnd();
                        break;
                    }

                    case org.apache.thrift.protocol.TType.LIST:
                        oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.VOID, 1));

                        oprot.writeSetBegin(new org.apache.thrift.protocol.TSet(org.apache.thrift.protocol.TType.STRUCT, getReturnValue().size()));
                        for (final com.yogento.api.models.mail.template.MailTemplate _iter0 : getReturnValue()) {
                            _iter0.write(oprot);
                        }
                        oprot.writeSetEnd();

                        oprot.writeListEnd();
                        break;

                    case org.apache.thrift.protocol.TType.STRUCT:
                    default:
                        oprot.writeStructBegin(new org.apache.thrift.protocol.TStruct("getMailTemplatesResponse"));

                        oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("return_value", org.apache.thrift.protocol.TType.SET, (short)-1));
                        oprot.writeSetBegin(new org.apache.thrift.protocol.TSet(org.apache.thrift.protocol.TType.STRUCT, getReturnValue().size()));
                        for (final com.yogento.api.models.mail.template.MailTemplate _iter0 : getReturnValue()) {
                            _iter0.write(oprot);
                        }
                        oprot.writeSetEnd();
                        oprot.writeFieldEnd();

                        oprot.writeFieldStop();

                        oprot.writeStructEnd();
                        break;
                }
            }

            private final com.google.common.collect.ImmutableSet<com.yogento.api.models.mail.template.MailTemplate> returnValue;
        }

        @SuppressWarnings({"serial"})
        public final static class getMailTemplateInfoRequest implements org.apache.thrift.TBase<getMailTemplateInfoRequest, org.apache.thrift.TFieldIdEnum> {
            public static class Builder {
                public Builder() {
                }

                public Builder(final getMailTemplateInfoRequest other) {
                    this.tid = other.getTid();
                    this.type = other.getType();
                }

                protected getMailTemplateInfoRequest _build(final int tid, final com.yogento.api.models.mail.template.MailTemplateType type) {
                    return new getMailTemplateInfoRequest(tid, type);
                }

                public getMailTemplateInfoRequest build() {
                    return _build(tid, type);
                }

                public Builder setTid(final int tid) {
                    this.tid = tid;
                    return this;
                }

                public Builder setType(final com.yogento.api.models.mail.template.MailTemplateType type) {
                    this.type = type;
                    return this;
                }

                private Integer tid;
                private com.yogento.api.models.mail.template.MailTemplateType type;
            }

            public getMailTemplateInfoRequest(final getMailTemplateInfoRequest other) {
                this(other.getTid(), other.getType());
            }

            public getMailTemplateInfoRequest(final org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
                this(iprot, org.apache.thrift.protocol.TType.STRUCT);
            }

            public getMailTemplateInfoRequest(final org.apache.thrift.protocol.TProtocol iprot, final byte readAsTType) throws org.apache.thrift.TException {
                int tid = 0;
                com.yogento.api.models.mail.template.MailTemplateType type = null;

                switch (readAsTType) {
                    case org.apache.thrift.protocol.TType.LIST:
                        final org.apache.thrift.protocol.TList __list = iprot.readListBegin();
                        tid = iprot.readI32();
                        if (__list.size > 1) {
                            type = new com.yogento.api.models.mail.template.MailTemplateType(iprot);
                        }
                        iprot.readListEnd();
                        break;

                    case org.apache.thrift.protocol.TType.STRUCT:
                    default:
                        iprot.readStructBegin();
                        while (true) {
                            final org.apache.thrift.protocol.TField ifield = iprot.readFieldBegin();
                            if (ifield.type == org.apache.thrift.protocol.TType.STOP) {
                                break;
                            } else if (ifield.name.equals("tid")) {
                                tid = iprot.readI32();
                            } else if (ifield.name.equals("type")) {
                                type = new com.yogento.api.models.mail.template.MailTemplateType(iprot);
                            }
                            iprot.readFieldEnd();
                        }
                        iprot.readStructEnd();
                        break;
                }

                this.tid = tid;
                this.type = type;
            }

            public getMailTemplateInfoRequest(final int tid) {
                this.tid = tid;
                this.type = null;
            }

            public getMailTemplateInfoRequest(final int tid, final com.yogento.api.models.mail.template.MailTemplateType type) {
                this.tid = tid;
                this.type = type;
            }

            public getMailTemplateInfoRequest(final Integer tid, final com.yogento.api.models.mail.template.MailTemplateType type) {
                this.tid = tid;
                this.type = type;
            }

            @Override
            public void clear() {
                throw new UnsupportedOperationException();
            }

            @Override
            public int compareTo(final getMailTemplateInfoRequest other) {
                throw new UnsupportedOperationException();
            }

            @Override
            public org.apache.thrift.TBase<getMailTemplateInfoRequest, org.apache.thrift.TFieldIdEnum> deepCopy() {
                throw new UnsupportedOperationException();
            }

            @Override
            public boolean equals(final Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof getMailTemplateInfoRequest)) {
                    return false;
                }

                final getMailTemplateInfoRequest other = (getMailTemplateInfoRequest)otherObject;
                return
                    getTid() == other.getTid() &&
                    ((getType() == null && other.getType() == null) ||
                    (getType() != null && other.getType() != null &&
                    getType().equals(other.getType())));
            }

            @Override
            public org.apache.thrift.TFieldIdEnum fieldForId(final int fieldId) {
                throw new UnsupportedOperationException();
            }

            public Object get(final String fieldName) {
                if (fieldName.equals("tid")) {
                    return getTid();
                } else if (fieldName.equals("type")) {
                    return getType();
                }
                return null;
            }

            @Override
            public Object getFieldValue(final org.apache.thrift.TFieldIdEnum field) {
                throw new UnsupportedOperationException();
            }

            public final int getTid() {
                return tid;
            }

            public final com.yogento.api.models.mail.template.MailTemplateType getType() {
                return type;
            }

            @Override
            public int hashCode() {
                int hashCode = 17;
                hashCode = 31 * hashCode + ((int)getTid());
                if (getType() != null) {
                    hashCode = 31 * hashCode + getType().hashCode();
                }
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
                helper.add("tid", getTid());
                if (getType() != null) {
                    helper.add("type", getType());
                }
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

                        oprot.writeI32(getTid());

                        if (getType() != null) {
                            getType().write(oprot);
                        } else {
                            ((org.thryft.core.protocol.Protocol)oprot).writeNull();
                        }

                        oprot.writeListEnd();
                        break;

                    case org.apache.thrift.protocol.TType.STRUCT:
                    default:
                        oprot.writeStructBegin(new org.apache.thrift.protocol.TStruct("getMailTemplateInfoRequest"));

                        oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("tid", org.apache.thrift.protocol.TType.I32, (short)-1));
                        oprot.writeI32(getTid());
                        oprot.writeFieldEnd();

                        if (getType() != null) {
                            oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("type", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                            getType().write(oprot);
                            oprot.writeFieldEnd();
                        }

                        oprot.writeFieldStop();

                        oprot.writeStructEnd();
                        break;
                }
            }

            private final int tid;
            private final com.yogento.api.models.mail.template.MailTemplateType type;
        }

        @SuppressWarnings({"serial"})
        public final static class getMailTemplateInfoResponse implements org.apache.thrift.TBase<getMailTemplateInfoResponse, org.apache.thrift.TFieldIdEnum> {
            public static class Builder {
                public Builder() {
                }

                public Builder(final getMailTemplateInfoResponse other) {
                    this.returnValue = other.getReturnValue();
                }

                protected getMailTemplateInfoResponse _build(final com.yogento.api.models.mail.template.MailTemplateInfo returnValue) {
                    return new getMailTemplateInfoResponse(returnValue);
                }

                public getMailTemplateInfoResponse build() {
                    return _build(returnValue);
                }

                public Builder setReturnValue(final com.yogento.api.models.mail.template.MailTemplateInfo returnValue) {
                    this.returnValue = returnValue;
                    return this;
                }

                private com.yogento.api.models.mail.template.MailTemplateInfo returnValue;
            }

            public getMailTemplateInfoResponse(final getMailTemplateInfoResponse other) {
                this(other.getReturnValue());
            }

            public getMailTemplateInfoResponse(final org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
                returnValue = new com.yogento.api.models.mail.template.MailTemplateInfo(iprot);
            }

            public getMailTemplateInfoResponse(final com.yogento.api.models.mail.template.MailTemplateInfo returnValue) {
                this.returnValue = com.google.common.base.Preconditions.checkNotNull(returnValue, "com.yogento.api.services.mail.MailService.getMailTemplateInfo: missing returnValue");
            }

            @Override
            public void clear() {
                throw new UnsupportedOperationException();
            }

            @Override
            public int compareTo(final getMailTemplateInfoResponse other) {
                throw new UnsupportedOperationException();
            }

            @Override
            public org.apache.thrift.TBase<getMailTemplateInfoResponse, org.apache.thrift.TFieldIdEnum> deepCopy() {
                throw new UnsupportedOperationException();
            }

            @Override
            public boolean equals(final Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof getMailTemplateInfoResponse)) {
                    return false;
                }

                final getMailTemplateInfoResponse other = (getMailTemplateInfoResponse)otherObject;
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

            public final com.yogento.api.models.mail.template.MailTemplateInfo getReturnValue() {
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
                        oprot.writeStructBegin(new org.apache.thrift.protocol.TStruct("getMailTemplateInfoResponse"));

                        oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("return_value", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                        getReturnValue().write(oprot);
                        oprot.writeFieldEnd();

                        oprot.writeFieldStop();

                        oprot.writeStructEnd();
                        break;
                }
            }

            private final com.yogento.api.models.mail.template.MailTemplateInfo returnValue;
        }

        @SuppressWarnings({"serial"})
        public final static class postMailCampaignRequest implements org.apache.thrift.TBase<postMailCampaignRequest, org.apache.thrift.TFieldIdEnum> {
            public static class Builder {
                public Builder() {
                }

                public Builder(final postMailCampaignRequest other) {
                    this.campaign = other.getCampaign();
                    this.scheduleTime = other.getScheduleTime();
                    this.scheduleTimeB = other.getScheduleTimeB();
                    this.testEmails = other.getTestEmails();
                }

                protected postMailCampaignRequest _build(final com.yogento.api.models.mail.campaign.MailCampaign campaign, final org.joda.time.DateTime scheduleTime, final org.joda.time.DateTime scheduleTimeB, final com.google.common.collect.ImmutableList<String> testEmails) {
                    return new postMailCampaignRequest(campaign, scheduleTime, scheduleTimeB, testEmails);
                }

                public postMailCampaignRequest build() {
                    return _build(campaign, scheduleTime, scheduleTimeB, testEmails);
                }

                public Builder setCampaign(final com.yogento.api.models.mail.campaign.MailCampaign campaign) {
                    this.campaign = campaign;
                    return this;
                }

                public Builder setScheduleTime(final org.joda.time.DateTime scheduleTime) {
                    this.scheduleTime = scheduleTime;
                    return this;
                }

                public Builder setScheduleTimeB(final org.joda.time.DateTime scheduleTimeB) {
                    this.scheduleTimeB = scheduleTimeB;
                    return this;
                }

                public Builder setTestEmails(final com.google.common.collect.ImmutableList<String> testEmails) {
                    this.testEmails = testEmails;
                    return this;
                }

                private com.yogento.api.models.mail.campaign.MailCampaign campaign;
                private org.joda.time.DateTime scheduleTime;
                private org.joda.time.DateTime scheduleTimeB;
                private com.google.common.collect.ImmutableList<String> testEmails;
            }

            public postMailCampaignRequest(final postMailCampaignRequest other) {
                this(other.getCampaign(), other.getScheduleTime(), other.getScheduleTimeB(), other.getTestEmails());
            }

            public postMailCampaignRequest(final org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
                this(iprot, org.apache.thrift.protocol.TType.STRUCT);
            }

            public postMailCampaignRequest(final org.apache.thrift.protocol.TProtocol iprot, final byte readAsTType) throws org.apache.thrift.TException {
                com.yogento.api.models.mail.campaign.MailCampaign campaign = null;
                org.joda.time.DateTime scheduleTime = null;
                org.joda.time.DateTime scheduleTimeB = null;
                com.google.common.collect.ImmutableList<String> testEmails = null;

                switch (readAsTType) {
                    case org.apache.thrift.protocol.TType.LIST:
                        final org.apache.thrift.protocol.TList __list = iprot.readListBegin();
                        campaign = new com.yogento.api.models.mail.campaign.MailCampaign(iprot);
                        if (__list.size > 1) {
                            try {
                                scheduleTime = (iprot instanceof org.thryft.core.protocol.Protocol) ? ((org.thryft.core.protocol.Protocol)iprot).readDateTime() : new org.joda.time.DateTime(iprot.readI64());
                            } catch (IllegalArgumentException e) {
                            }
                        }
                        if (__list.size > 2) {
                            try {
                                scheduleTimeB = (iprot instanceof org.thryft.core.protocol.Protocol) ? ((org.thryft.core.protocol.Protocol)iprot).readDateTime() : new org.joda.time.DateTime(iprot.readI64());
                            } catch (IllegalArgumentException e) {
                            }
                        }
                        if (__list.size > 3) {
                            testEmails = (new com.google.common.base.Function<org.apache.thrift.protocol.TProtocol, com.google.common.collect.ImmutableList<String>>() {
                                @Override
                                public com.google.common.collect.ImmutableList<String> apply(final org.apache.thrift.protocol.TProtocol iprot) {
                                    try {
                                        final org.apache.thrift.protocol.TList sequenceBegin = iprot.readListBegin();
                                        final java.util.List<String> sequence = new java.util.ArrayList<String>();
                                        for (int elementI = 0; elementI < sequenceBegin.size; elementI++) {
                                            sequence.add(iprot.readString());
                                        }
                                        iprot.readListEnd();
                                        return com.google.common.collect.ImmutableList.copyOf(sequence);
                                    } catch (final org.apache.thrift.TException e) {
                                        return com.google.common.collect.ImmutableList.of();
                                    }
                                }
                            }).apply(iprot);
                        }
                        iprot.readListEnd();
                        break;

                    case org.apache.thrift.protocol.TType.STRUCT:
                    default:
                        iprot.readStructBegin();
                        while (true) {
                            final org.apache.thrift.protocol.TField ifield = iprot.readFieldBegin();
                            if (ifield.type == org.apache.thrift.protocol.TType.STOP) {
                                break;
                            } else if (ifield.name.equals("campaign")) {
                                campaign = new com.yogento.api.models.mail.campaign.MailCampaign(iprot);
                            } else if (ifield.name.equals("schedule_time")) {
                                try {
                                    scheduleTime = (iprot instanceof org.thryft.core.protocol.Protocol) ? ((org.thryft.core.protocol.Protocol)iprot).readDateTime() : new org.joda.time.DateTime(iprot.readI64());
                                } catch (IllegalArgumentException e) {
                                }
                            } else if (ifield.name.equals("schedule_time_b")) {
                                try {
                                    scheduleTimeB = (iprot instanceof org.thryft.core.protocol.Protocol) ? ((org.thryft.core.protocol.Protocol)iprot).readDateTime() : new org.joda.time.DateTime(iprot.readI64());
                                } catch (IllegalArgumentException e) {
                                }
                            } else if (ifield.name.equals("test_emails")) {
                                testEmails = (new com.google.common.base.Function<org.apache.thrift.protocol.TProtocol, com.google.common.collect.ImmutableList<String>>() {
                                    @Override
                                    public com.google.common.collect.ImmutableList<String> apply(final org.apache.thrift.protocol.TProtocol iprot) {
                                        try {
                                            final org.apache.thrift.protocol.TList sequenceBegin = iprot.readListBegin();
                                            final java.util.List<String> sequence = new java.util.ArrayList<String>();
                                            for (int elementI = 0; elementI < sequenceBegin.size; elementI++) {
                                                sequence.add(iprot.readString());
                                            }
                                            iprot.readListEnd();
                                            return com.google.common.collect.ImmutableList.copyOf(sequence);
                                        } catch (final org.apache.thrift.TException e) {
                                            return com.google.common.collect.ImmutableList.of();
                                        }
                                    }
                                }).apply(iprot);
                            }
                            iprot.readFieldEnd();
                        }
                        iprot.readStructEnd();
                        break;
                }

                this.campaign = com.google.common.base.Preconditions.checkNotNull(campaign, "com.yogento.api.services.mail.postMailCampaignRequest: missing campaign");
                this.scheduleTime = scheduleTime;
                this.scheduleTimeB = scheduleTimeB;
                this.testEmails = testEmails;
            }

            public postMailCampaignRequest(final com.yogento.api.models.mail.campaign.MailCampaign campaign) {
                this.campaign = com.google.common.base.Preconditions.checkNotNull(campaign, "com.yogento.api.services.mail.postMailCampaignRequest: missing campaign");
                this.scheduleTime = null;
                this.scheduleTimeB = null;
                this.testEmails = null;
            }

            public postMailCampaignRequest(final com.yogento.api.models.mail.campaign.MailCampaign campaign, final org.joda.time.DateTime scheduleTime, final org.joda.time.DateTime scheduleTimeB, final com.google.common.collect.ImmutableList<String> testEmails) {
                this.campaign = com.google.common.base.Preconditions.checkNotNull(campaign, "com.yogento.api.services.mail.postMailCampaignRequest: missing campaign");
                this.scheduleTime = scheduleTime;
                this.scheduleTimeB = scheduleTimeB;
                this.testEmails = testEmails;
            }

            @Override
            public void clear() {
                throw new UnsupportedOperationException();
            }

            @Override
            public int compareTo(final postMailCampaignRequest other) {
                throw new UnsupportedOperationException();
            }

            @Override
            public org.apache.thrift.TBase<postMailCampaignRequest, org.apache.thrift.TFieldIdEnum> deepCopy() {
                throw new UnsupportedOperationException();
            }

            @Override
            public boolean equals(final Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof postMailCampaignRequest)) {
                    return false;
                }

                final postMailCampaignRequest other = (postMailCampaignRequest)otherObject;
                return
                    getCampaign().equals(other.getCampaign()) &&
                    ((getScheduleTime() == null && other.getScheduleTime() == null) ||
                    (getScheduleTime() != null && other.getScheduleTime() != null &&
                    getScheduleTime().equals(other.getScheduleTime()))) &&
                    ((getScheduleTimeB() == null && other.getScheduleTimeB() == null) ||
                    (getScheduleTimeB() != null && other.getScheduleTimeB() != null &&
                    getScheduleTimeB().equals(other.getScheduleTimeB()))) &&
                    ((getTestEmails() == null && other.getTestEmails() == null) ||
                    (getTestEmails() != null && other.getTestEmails() != null &&
                    getTestEmails().equals(other.getTestEmails())));
            }

            @Override
            public org.apache.thrift.TFieldIdEnum fieldForId(final int fieldId) {
                throw new UnsupportedOperationException();
            }

            public Object get(final String fieldName) {
                if (fieldName.equals("campaign")) {
                    return getCampaign();
                } else if (fieldName.equals("schedule_time")) {
                    return getScheduleTime();
                } else if (fieldName.equals("schedule_time_b")) {
                    return getScheduleTimeB();
                } else if (fieldName.equals("test_emails")) {
                    return getTestEmails();
                }
                return null;
            }

            public final com.yogento.api.models.mail.campaign.MailCampaign getCampaign() {
                return campaign;
            }

            @Override
            public Object getFieldValue(final org.apache.thrift.TFieldIdEnum field) {
                throw new UnsupportedOperationException();
            }

            public final org.joda.time.DateTime getScheduleTime() {
                return scheduleTime;
            }

            public final org.joda.time.DateTime getScheduleTimeB() {
                return scheduleTimeB;
            }

            public final com.google.common.collect.ImmutableList<String> getTestEmails() {
                return testEmails;
            }

            @Override
            public int hashCode() {
                int hashCode = 17;
                hashCode = 31 * hashCode + getCampaign().hashCode();
                if (getScheduleTime() != null) {
                    hashCode = 31 * hashCode + getScheduleTime().hashCode();
                }
                if (getScheduleTimeB() != null) {
                    hashCode = 31 * hashCode + getScheduleTimeB().hashCode();
                }
                if (getTestEmails() != null) {
                    hashCode = 31 * hashCode + getTestEmails().hashCode();
                }
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
                helper.add("campaign", getCampaign());
                if (getScheduleTime() != null) {
                    helper.add("schedule_time", getScheduleTime());
                }
                if (getScheduleTimeB() != null) {
                    helper.add("schedule_time_b", getScheduleTimeB());
                }
                if (getTestEmails() != null) {
                    helper.add("test_emails", getTestEmails());
                }
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
                        oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.VOID, 4));

                        getCampaign().write(oprot);

                        if (getScheduleTime() != null) {
                            if (oprot instanceof org.thryft.core.protocol.Protocol) { ((org.thryft.core.protocol.Protocol)oprot).writeDateTime(getScheduleTime()); } else { oprot.writeI64(getScheduleTime().getMillis()); }
                        } else {
                            ((org.thryft.core.protocol.Protocol)oprot).writeNull();
                        }

                        if (getScheduleTimeB() != null) {
                            if (oprot instanceof org.thryft.core.protocol.Protocol) { ((org.thryft.core.protocol.Protocol)oprot).writeDateTime(getScheduleTimeB()); } else { oprot.writeI64(getScheduleTimeB().getMillis()); }
                        } else {
                            ((org.thryft.core.protocol.Protocol)oprot).writeNull();
                        }

                        if (getTestEmails() != null) {
                            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, getTestEmails().size()));
                            for (final String _iter0 : getTestEmails()) {
                                oprot.writeString(_iter0);
                            }
                            oprot.writeListEnd();
                        } else {
                            ((org.thryft.core.protocol.Protocol)oprot).writeNull();
                        }

                        oprot.writeListEnd();
                        break;

                    case org.apache.thrift.protocol.TType.STRUCT:
                    default:
                        oprot.writeStructBegin(new org.apache.thrift.protocol.TStruct("postMailCampaignRequest"));

                        oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("campaign", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                        getCampaign().write(oprot);
                        oprot.writeFieldEnd();

                        if (getScheduleTime() != null) {
                            oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("schedule_time", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                            if (oprot instanceof org.thryft.core.protocol.Protocol) { ((org.thryft.core.protocol.Protocol)oprot).writeDateTime(getScheduleTime()); } else { oprot.writeI64(getScheduleTime().getMillis()); }
                            oprot.writeFieldEnd();
                        }

                        if (getScheduleTimeB() != null) {
                            oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("schedule_time_b", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                            if (oprot instanceof org.thryft.core.protocol.Protocol) { ((org.thryft.core.protocol.Protocol)oprot).writeDateTime(getScheduleTimeB()); } else { oprot.writeI64(getScheduleTimeB().getMillis()); }
                            oprot.writeFieldEnd();
                        }

                        if (getTestEmails() != null) {
                            oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("test_emails", org.apache.thrift.protocol.TType.LIST, (short)-1));
                            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, getTestEmails().size()));
                            for (final String _iter0 : getTestEmails()) {
                                oprot.writeString(_iter0);
                            }
                            oprot.writeListEnd();
                            oprot.writeFieldEnd();
                        }

                        oprot.writeFieldStop();

                        oprot.writeStructEnd();
                        break;
                }
            }

            private final com.yogento.api.models.mail.campaign.MailCampaign campaign;
            private final org.joda.time.DateTime scheduleTime;
            private final org.joda.time.DateTime scheduleTimeB;
            private final com.google.common.collect.ImmutableList<String> testEmails;
        }

        @SuppressWarnings({"serial"})
        public final static class postMailCampaignResponse implements org.apache.thrift.TBase<postMailCampaignResponse, org.apache.thrift.TFieldIdEnum> {
            public static class Builder {
                public Builder() {
                }

                public Builder(final postMailCampaignResponse other) {
                    this.returnValue = other.getReturnValue();
                }

                protected postMailCampaignResponse _build(final com.yogento.api.models.mail.campaign.MailCampaign returnValue) {
                    return new postMailCampaignResponse(returnValue);
                }

                public postMailCampaignResponse build() {
                    return _build(returnValue);
                }

                public Builder setReturnValue(final com.yogento.api.models.mail.campaign.MailCampaign returnValue) {
                    this.returnValue = returnValue;
                    return this;
                }

                private com.yogento.api.models.mail.campaign.MailCampaign returnValue;
            }

            public postMailCampaignResponse(final postMailCampaignResponse other) {
                this(other.getReturnValue());
            }

            public postMailCampaignResponse(final org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
                returnValue = new com.yogento.api.models.mail.campaign.MailCampaign(iprot);
            }

            public postMailCampaignResponse(final com.yogento.api.models.mail.campaign.MailCampaign returnValue) {
                this.returnValue = com.google.common.base.Preconditions.checkNotNull(returnValue, "com.yogento.api.services.mail.MailService.postMailCampaign: missing returnValue");
            }

            @Override
            public void clear() {
                throw new UnsupportedOperationException();
            }

            @Override
            public int compareTo(final postMailCampaignResponse other) {
                throw new UnsupportedOperationException();
            }

            @Override
            public org.apache.thrift.TBase<postMailCampaignResponse, org.apache.thrift.TFieldIdEnum> deepCopy() {
                throw new UnsupportedOperationException();
            }

            @Override
            public boolean equals(final Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof postMailCampaignResponse)) {
                    return false;
                }

                final postMailCampaignResponse other = (postMailCampaignResponse)otherObject;
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

            public final com.yogento.api.models.mail.campaign.MailCampaign getReturnValue() {
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
                        oprot.writeStructBegin(new org.apache.thrift.protocol.TStruct("postMailCampaignResponse"));

                        oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("return_value", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                        getReturnValue().write(oprot);
                        oprot.writeFieldEnd();

                        oprot.writeFieldStop();

                        oprot.writeStructEnd();
                        break;
                }
            }

            private final com.yogento.api.models.mail.campaign.MailCampaign returnValue;
        }

        @SuppressWarnings({"serial"})
        public final static class putMailCampaignRequest implements org.apache.thrift.TBase<putMailCampaignRequest, org.apache.thrift.TFieldIdEnum> {
            public static class Builder {
                public Builder() {
                }

                public Builder(final putMailCampaignRequest other) {
                    this.campaign = other.getCampaign();
                    this.writeThrough = other.isWriteThrough();
                }

                protected putMailCampaignRequest _build(final com.yogento.api.models.mail.campaign.MailCampaign campaign, final Boolean writeThrough) {
                    return new putMailCampaignRequest(campaign, writeThrough);
                }

                public putMailCampaignRequest build() {
                    return _build(campaign, writeThrough);
                }

                public Builder setCampaign(final com.yogento.api.models.mail.campaign.MailCampaign campaign) {
                    this.campaign = campaign;
                    return this;
                }

                public Builder setWriteThrough(final Boolean writeThrough) {
                    this.writeThrough = writeThrough;
                    return this;
                }

                private com.yogento.api.models.mail.campaign.MailCampaign campaign;
                private Boolean writeThrough;
            }

            public putMailCampaignRequest(final putMailCampaignRequest other) {
                this(other.getCampaign(), other.isWriteThrough());
            }

            public putMailCampaignRequest(final org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
                this(iprot, org.apache.thrift.protocol.TType.STRUCT);
            }

            public putMailCampaignRequest(final org.apache.thrift.protocol.TProtocol iprot, final byte readAsTType) throws org.apache.thrift.TException {
                com.yogento.api.models.mail.campaign.MailCampaign campaign = null;
                Boolean writeThrough = null;

                switch (readAsTType) {
                    case org.apache.thrift.protocol.TType.LIST:
                        final org.apache.thrift.protocol.TList __list = iprot.readListBegin();
                        campaign = new com.yogento.api.models.mail.campaign.MailCampaign(iprot);
                        if (__list.size > 1) {
                            writeThrough = iprot.readBool();
                        }
                        iprot.readListEnd();
                        break;

                    case org.apache.thrift.protocol.TType.STRUCT:
                    default:
                        iprot.readStructBegin();
                        while (true) {
                            final org.apache.thrift.protocol.TField ifield = iprot.readFieldBegin();
                            if (ifield.type == org.apache.thrift.protocol.TType.STOP) {
                                break;
                            } else if (ifield.name.equals("campaign")) {
                                campaign = new com.yogento.api.models.mail.campaign.MailCampaign(iprot);
                            } else if (ifield.name.equals("write_through")) {
                                writeThrough = iprot.readBool();
                            }
                            iprot.readFieldEnd();
                        }
                        iprot.readStructEnd();
                        break;
                }

                this.campaign = com.google.common.base.Preconditions.checkNotNull(campaign, "com.yogento.api.services.mail.putMailCampaignRequest: missing campaign");
                this.writeThrough = writeThrough;
            }

            public putMailCampaignRequest(final com.yogento.api.models.mail.campaign.MailCampaign campaign) {
                this.campaign = com.google.common.base.Preconditions.checkNotNull(campaign, "com.yogento.api.services.mail.putMailCampaignRequest: missing campaign");
                this.writeThrough = null;
            }

            public putMailCampaignRequest(final com.yogento.api.models.mail.campaign.MailCampaign campaign, final Boolean writeThrough) {
                this.campaign = com.google.common.base.Preconditions.checkNotNull(campaign, "com.yogento.api.services.mail.putMailCampaignRequest: missing campaign");
                this.writeThrough = writeThrough;
            }

            @Override
            public void clear() {
                throw new UnsupportedOperationException();
            }

            @Override
            public int compareTo(final putMailCampaignRequest other) {
                throw new UnsupportedOperationException();
            }

            @Override
            public org.apache.thrift.TBase<putMailCampaignRequest, org.apache.thrift.TFieldIdEnum> deepCopy() {
                throw new UnsupportedOperationException();
            }

            @Override
            public boolean equals(final Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof putMailCampaignRequest)) {
                    return false;
                }

                final putMailCampaignRequest other = (putMailCampaignRequest)otherObject;
                return
                    getCampaign().equals(other.getCampaign()) &&
                    ((isWriteThrough() == null && other.isWriteThrough() == null) ||
                    (isWriteThrough() != null && other.isWriteThrough() != null &&
                    isWriteThrough().equals(other.isWriteThrough())));
            }

            @Override
            public org.apache.thrift.TFieldIdEnum fieldForId(final int fieldId) {
                throw new UnsupportedOperationException();
            }

            public Object get(final String fieldName) {
                if (fieldName.equals("campaign")) {
                    return getCampaign();
                } else if (fieldName.equals("write_through")) {
                    return isWriteThrough();
                }
                return null;
            }

            public final com.yogento.api.models.mail.campaign.MailCampaign getCampaign() {
                return campaign;
            }

            @Override
            public Object getFieldValue(final org.apache.thrift.TFieldIdEnum field) {
                throw new UnsupportedOperationException();
            }

            @Override
            public int hashCode() {
                int hashCode = 17;
                hashCode = 31 * hashCode + getCampaign().hashCode();
                if (isWriteThrough() != null) {
                    hashCode = 31 * hashCode + (isWriteThrough() ? 1 : 0);
                }
                return hashCode;
            }

            @Override
            public boolean isSet(final org.apache.thrift.TFieldIdEnum field) {
                throw new UnsupportedOperationException();
            }

            public final Boolean isWriteThrough() {
                return writeThrough;
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
                helper.add("campaign", getCampaign());
                if (isWriteThrough() != null) {
                    helper.add("write_through", isWriteThrough());
                }
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

                        getCampaign().write(oprot);

                        if (isWriteThrough() != null) {
                            oprot.writeBool(isWriteThrough());
                        } else {
                            ((org.thryft.core.protocol.Protocol)oprot).writeNull();
                        }

                        oprot.writeListEnd();
                        break;

                    case org.apache.thrift.protocol.TType.STRUCT:
                    default:
                        oprot.writeStructBegin(new org.apache.thrift.protocol.TStruct("putMailCampaignRequest"));

                        oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("campaign", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                        getCampaign().write(oprot);
                        oprot.writeFieldEnd();

                        if (isWriteThrough() != null) {
                            oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("write_through", org.apache.thrift.protocol.TType.BOOL, (short)-1));
                            oprot.writeBool(isWriteThrough());
                            oprot.writeFieldEnd();
                        }

                        oprot.writeFieldStop();

                        oprot.writeStructEnd();
                        break;
                }
            }

            private final com.yogento.api.models.mail.campaign.MailCampaign campaign;
            private final Boolean writeThrough;
        }

        @SuppressWarnings({"serial"})
        public final static class putMailCampaignResponse implements org.apache.thrift.TBase<putMailCampaignResponse, org.apache.thrift.TFieldIdEnum> {
            public static class Builder {
                public Builder() {
                }

                public Builder(final putMailCampaignResponse other) {
                    this.returnValue = other.getReturnValue();
                }

                protected putMailCampaignResponse _build(final com.yogento.api.models.mail.campaign.MailCampaign returnValue) {
                    return new putMailCampaignResponse(returnValue);
                }

                public putMailCampaignResponse build() {
                    return _build(returnValue);
                }

                public Builder setReturnValue(final com.yogento.api.models.mail.campaign.MailCampaign returnValue) {
                    this.returnValue = returnValue;
                    return this;
                }

                private com.yogento.api.models.mail.campaign.MailCampaign returnValue;
            }

            public putMailCampaignResponse(final putMailCampaignResponse other) {
                this(other.getReturnValue());
            }

            public putMailCampaignResponse(final org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
                returnValue = new com.yogento.api.models.mail.campaign.MailCampaign(iprot);
            }

            public putMailCampaignResponse(final com.yogento.api.models.mail.campaign.MailCampaign returnValue) {
                this.returnValue = com.google.common.base.Preconditions.checkNotNull(returnValue, "com.yogento.api.services.mail.MailService.putMailCampaign: missing returnValue");
            }

            @Override
            public void clear() {
                throw new UnsupportedOperationException();
            }

            @Override
            public int compareTo(final putMailCampaignResponse other) {
                throw new UnsupportedOperationException();
            }

            @Override
            public org.apache.thrift.TBase<putMailCampaignResponse, org.apache.thrift.TFieldIdEnum> deepCopy() {
                throw new UnsupportedOperationException();
            }

            @Override
            public boolean equals(final Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof putMailCampaignResponse)) {
                    return false;
                }

                final putMailCampaignResponse other = (putMailCampaignResponse)otherObject;
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

            public final com.yogento.api.models.mail.campaign.MailCampaign getReturnValue() {
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
                        oprot.writeStructBegin(new org.apache.thrift.protocol.TStruct("putMailCampaignResponse"));

                        oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("return_value", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                        getReturnValue().write(oprot);
                        oprot.writeFieldEnd();

                        oprot.writeFieldStop();

                        oprot.writeStructEnd();
                        break;
                }
            }

            private final com.yogento.api.models.mail.campaign.MailCampaign returnValue;
        }
    }

    public boolean deleteMailCampaign(String cid, Boolean writeThrough) throws com.yogento.api.services.mail.MailException;
    public com.yogento.api.models.mail.campaign.MailCampaign getMailCampaign(String cid, Boolean includeContent) throws com.yogento.api.services.mail.MailException;
    public com.google.common.collect.ImmutableSet<com.yogento.api.models.mail.campaign.MailCampaign> getMailCampaigns(Boolean includeContent) throws com.yogento.api.services.mail.MailException;
    public com.yogento.api.models.mail.campaign.MailCampaignStats getMailCampaignStats(String cid) throws com.yogento.api.services.mail.MailException;
    public com.google.common.collect.ImmutableSet<com.yogento.api.models.mail.list.MailList> getMailLists() throws com.yogento.api.services.mail.MailException;
    public com.google.common.collect.ImmutableSet<com.yogento.api.models.mail.template.MailTemplate> getMailTemplates(com.google.common.collect.ImmutableSet<com.yogento.api.models.mail.template.MailTemplateType> types) throws com.yogento.api.services.mail.MailException;
    public com.yogento.api.models.mail.template.MailTemplateInfo getMailTemplateInfo(int tid, com.yogento.api.models.mail.template.MailTemplateType type) throws com.yogento.api.services.mail.MailException;
    public com.yogento.api.models.mail.campaign.MailCampaign postMailCampaign(com.yogento.api.models.mail.campaign.MailCampaign campaign, org.joda.time.DateTime scheduleTime, org.joda.time.DateTime scheduleTimeB, com.google.common.collect.ImmutableList<String> testEmails) throws com.yogento.api.services.mail.MailException;
    public com.yogento.api.models.mail.campaign.MailCampaign putMailCampaign(com.yogento.api.models.mail.campaign.MailCampaign campaign, Boolean writeThrough) throws com.yogento.api.services.mail.MailException;
}
