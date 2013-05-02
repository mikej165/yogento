package com.yogento.api.services.mail;

public interface MailService {
    public static class Messages {
        @SuppressWarnings({"serial"})
        public final static class deleteMailCampaignRequest implements org.thryft.TBase<deleteMailCampaignRequest> {
            public static class Builder {
                public Builder() {
                }

                public Builder(final deleteMailCampaignRequest other) {
                    this.cid = other.getCid();
                    this.writeThrough = other.getWriteThrough();
                }

                protected deleteMailCampaignRequest _build(final String cid, final com.google.common.base.Optional<Boolean> writeThrough) {
                    return new deleteMailCampaignRequest(cid, writeThrough);
                }

                public deleteMailCampaignRequest build() {
                    return _build(cid, writeThrough);
                }

                public Builder setCid(final String cid) {
                    this.cid = cid;
                    return this;
                }

                public Builder setWriteThrough(final com.google.common.base.Optional<Boolean> writeThrough) {
                    this.writeThrough = writeThrough;
                    return this;
                }

                public Builder setWriteThrough(final boolean writeThrough) {
                    this.writeThrough = com.google.common.base.Optional.of(writeThrough);
                    return this;
                }

                private String cid;
                private com.google.common.base.Optional<Boolean> writeThrough = com.google.common.base.Optional.absent();
            }

            public deleteMailCampaignRequest(final deleteMailCampaignRequest other) {
                this(other.getCid(), other.getWriteThrough());
            }

            public deleteMailCampaignRequest(final org.thryft.protocol.TProtocol iprot) throws java.io.IOException {
                this(iprot, org.thryft.protocol.TType.STRUCT);
            }

            public deleteMailCampaignRequest(final org.thryft.protocol.TProtocol iprot, final byte readAsTType) throws java.io.IOException {
                String cid = null;
                com.google.common.base.Optional<Boolean> writeThrough = com.google.common.base.Optional.absent();

                switch (readAsTType) {
                    case org.thryft.protocol.TType.LIST:
                        final org.thryft.protocol.TList __list = iprot.readListBegin();
                        cid = iprot.readString();
                        if (__list.size > 1) {
                            writeThrough = com.google.common.base.Optional.of(iprot.readBool());
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
                            } else if (ifield.name.equals("cid")) {
                                cid = iprot.readString();
                            } else if (ifield.name.equals("write_through")) {
                                writeThrough = com.google.common.base.Optional.of(iprot.readBool());
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
                this.writeThrough = com.google.common.base.Optional.absent();
            }

            public deleteMailCampaignRequest(final String cid, final com.google.common.base.Optional<Boolean> writeThrough) {
                this.cid = com.google.common.base.Preconditions.checkNotNull(cid, "com.yogento.api.services.mail.deleteMailCampaignRequest: missing cid");
                this.writeThrough = writeThrough;
            }

            @Override
            public int compareTo(final deleteMailCampaignRequest other) {
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
                    getWriteThrough().equals(other.getWriteThrough());
            }

            public Object get(final String fieldName) {
                if (fieldName.equals("cid")) {
                    return getCid();
                } else if (fieldName.equals("write_through")) {
                    return getWriteThrough();
                }
                throw new IllegalArgumentException(fieldName);
            }

            public final String getCid() {
                return cid;
            }

            public final com.google.common.base.Optional<Boolean> getWriteThrough() {
                return writeThrough;
            }

            @Override
            public int hashCode() {
                int hashCode = 17;
                hashCode = 31 * hashCode + getCid().hashCode();
                if (getWriteThrough().isPresent()) {
                    hashCode = 31 * hashCode + (getWriteThrough().get() ? 1 : 0);
                }
                return hashCode;
            }

            @Override
            public String toString() {
                final com.google.common.base.Objects.ToStringHelper helper = com.google.common.base.Objects.toStringHelper(this);
                helper.add("cid", getCid());
                if (getWriteThrough().isPresent()) {
                    helper.add("write_through", getWriteThrough());
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

                        oprot.writeString(getCid());

                        if (getWriteThrough().isPresent()) {
                            oprot.writeBool(getWriteThrough().get());
                        } else {
                            oprot.writeNull();
                        }

                        oprot.writeListEnd();
                        break;

                    case org.thryft.protocol.TType.STRUCT:
                    default:
                        oprot.writeStructBegin(new org.thryft.protocol.TStruct("deleteMailCampaignRequest"));

                        oprot.writeFieldBegin(new org.thryft.protocol.TField("cid", org.thryft.protocol.TType.STRING, (short)-1));
                        oprot.writeString(getCid());
                        oprot.writeFieldEnd();

                        if (getWriteThrough().isPresent()) {
                            oprot.writeFieldBegin(new org.thryft.protocol.TField("write_through", org.thryft.protocol.TType.BOOL, (short)-1));
                            oprot.writeBool(getWriteThrough().get());
                            oprot.writeFieldEnd();
                        }

                        oprot.writeFieldStop();

                        oprot.writeStructEnd();
                        break;
                }
            }

            private final String cid;

            private final com.google.common.base.Optional<Boolean> writeThrough;
        }

        @SuppressWarnings({"serial"})
        public final static class deleteMailCampaignResponse implements org.thryft.TBase<deleteMailCampaignResponse> {
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

            public deleteMailCampaignResponse(final org.thryft.protocol.TProtocol iprot) throws java.io.IOException {
                returnValue = iprot.readBool();
            }

            public deleteMailCampaignResponse(final boolean returnValue) {
                this.returnValue = returnValue;
            }

            public deleteMailCampaignResponse(final Boolean returnValue) {
                this.returnValue = returnValue;
            }

            @Override
            public int compareTo(final deleteMailCampaignResponse other) {
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

            public Object get(final String fieldName) {
                if (fieldName.equals("return_value")) {
                    return isReturnValue();
                }
                throw new IllegalArgumentException(fieldName);
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
            public String toString() {
                final com.google.common.base.Objects.ToStringHelper helper = com.google.common.base.Objects.toStringHelper(this);
                helper.add("return_value", isReturnValue());
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

                        oprot.writeBool(isReturnValue());

                        oprot.writeListEnd();
                        break;

                    case org.thryft.protocol.TType.STRUCT:
                    default:
                        oprot.writeStructBegin(new org.thryft.protocol.TStruct("deleteMailCampaignResponse"));

                        oprot.writeFieldBegin(new org.thryft.protocol.TField("return_value", org.thryft.protocol.TType.BOOL, (short)-1));
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
        public final static class getMailCampaignRequest implements org.thryft.TBase<getMailCampaignRequest> {
            public static class Builder {
                public Builder() {
                }

                public Builder(final getMailCampaignRequest other) {
                    this.cid = other.getCid();
                    this.includeContent = other.getIncludeContent();
                }

                protected getMailCampaignRequest _build(final String cid, final com.google.common.base.Optional<Boolean> includeContent) {
                    return new getMailCampaignRequest(cid, includeContent);
                }

                public getMailCampaignRequest build() {
                    return _build(cid, includeContent);
                }

                public Builder setCid(final String cid) {
                    this.cid = cid;
                    return this;
                }

                public Builder setIncludeContent(final com.google.common.base.Optional<Boolean> includeContent) {
                    this.includeContent = includeContent;
                    return this;
                }

                public Builder setIncludeContent(final boolean includeContent) {
                    this.includeContent = com.google.common.base.Optional.of(includeContent);
                    return this;
                }

                private String cid;
                private com.google.common.base.Optional<Boolean> includeContent = com.google.common.base.Optional.absent();
            }

            public getMailCampaignRequest(final getMailCampaignRequest other) {
                this(other.getCid(), other.getIncludeContent());
            }

            public getMailCampaignRequest(final org.thryft.protocol.TProtocol iprot) throws java.io.IOException {
                this(iprot, org.thryft.protocol.TType.STRUCT);
            }

            public getMailCampaignRequest(final org.thryft.protocol.TProtocol iprot, final byte readAsTType) throws java.io.IOException {
                String cid = null;
                com.google.common.base.Optional<Boolean> includeContent = com.google.common.base.Optional.absent();

                switch (readAsTType) {
                    case org.thryft.protocol.TType.LIST:
                        final org.thryft.protocol.TList __list = iprot.readListBegin();
                        cid = iprot.readString();
                        if (__list.size > 1) {
                            includeContent = com.google.common.base.Optional.of(iprot.readBool());
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
                            } else if (ifield.name.equals("cid")) {
                                cid = iprot.readString();
                            } else if (ifield.name.equals("include_content")) {
                                includeContent = com.google.common.base.Optional.of(iprot.readBool());
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
                this.includeContent = com.google.common.base.Optional.absent();
            }

            public getMailCampaignRequest(final String cid, final com.google.common.base.Optional<Boolean> includeContent) {
                this.cid = com.google.common.base.Preconditions.checkNotNull(cid, "com.yogento.api.services.mail.getMailCampaignRequest: missing cid");
                this.includeContent = includeContent;
            }

            @Override
            public int compareTo(final getMailCampaignRequest other) {
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
                    getIncludeContent().equals(other.getIncludeContent());
            }

            public Object get(final String fieldName) {
                if (fieldName.equals("cid")) {
                    return getCid();
                } else if (fieldName.equals("include_content")) {
                    return getIncludeContent();
                }
                throw new IllegalArgumentException(fieldName);
            }

            public final String getCid() {
                return cid;
            }

            public final com.google.common.base.Optional<Boolean> getIncludeContent() {
                return includeContent;
            }

            @Override
            public int hashCode() {
                int hashCode = 17;
                hashCode = 31 * hashCode + getCid().hashCode();
                if (getIncludeContent().isPresent()) {
                    hashCode = 31 * hashCode + (getIncludeContent().get() ? 1 : 0);
                }
                return hashCode;
            }

            @Override
            public String toString() {
                final com.google.common.base.Objects.ToStringHelper helper = com.google.common.base.Objects.toStringHelper(this);
                helper.add("cid", getCid());
                if (getIncludeContent().isPresent()) {
                    helper.add("include_content", getIncludeContent());
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

                        oprot.writeString(getCid());

                        if (getIncludeContent().isPresent()) {
                            oprot.writeBool(getIncludeContent().get());
                        } else {
                            oprot.writeNull();
                        }

                        oprot.writeListEnd();
                        break;

                    case org.thryft.protocol.TType.STRUCT:
                    default:
                        oprot.writeStructBegin(new org.thryft.protocol.TStruct("getMailCampaignRequest"));

                        oprot.writeFieldBegin(new org.thryft.protocol.TField("cid", org.thryft.protocol.TType.STRING, (short)-1));
                        oprot.writeString(getCid());
                        oprot.writeFieldEnd();

                        if (getIncludeContent().isPresent()) {
                            oprot.writeFieldBegin(new org.thryft.protocol.TField("include_content", org.thryft.protocol.TType.BOOL, (short)-1));
                            oprot.writeBool(getIncludeContent().get());
                            oprot.writeFieldEnd();
                        }

                        oprot.writeFieldStop();

                        oprot.writeStructEnd();
                        break;
                }
            }

            private final String cid;

            private final com.google.common.base.Optional<Boolean> includeContent;
        }

        @SuppressWarnings({"serial"})
        public final static class getMailCampaignResponse implements org.thryft.TBase<getMailCampaignResponse> {
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

            public getMailCampaignResponse(final org.thryft.protocol.TProtocol iprot) throws java.io.IOException {
                returnValue = new com.yogento.api.models.mail.campaign.MailCampaign(iprot);
            }

            public getMailCampaignResponse(final com.yogento.api.models.mail.campaign.MailCampaign returnValue) {
                this.returnValue = com.google.common.base.Preconditions.checkNotNull(returnValue, "com.yogento.api.services.mail.MailService.getMailCampaign: missing returnValue");
            }

            @Override
            public int compareTo(final getMailCampaignResponse other) {
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

            public Object get(final String fieldName) {
                if (fieldName.equals("return_value")) {
                    return getReturnValue();
                }
                throw new IllegalArgumentException(fieldName);
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
                        oprot.writeStructBegin(new org.thryft.protocol.TStruct("getMailCampaignResponse"));

                        oprot.writeFieldBegin(new org.thryft.protocol.TField("return_value", org.thryft.protocol.TType.STRUCT, (short)-1));
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
        public final static class getMailCampaignsRequest implements org.thryft.TBase<getMailCampaignsRequest> {
            public static class Builder {
                public Builder() {
                }

                public Builder(final getMailCampaignsRequest other) {
                    this.includeContent = other.getIncludeContent();
                }

                protected getMailCampaignsRequest _build(final com.google.common.base.Optional<Boolean> includeContent) {
                    return new getMailCampaignsRequest(includeContent);
                }

                public getMailCampaignsRequest build() {
                    return _build(includeContent);
                }

                public Builder setIncludeContent(final com.google.common.base.Optional<Boolean> includeContent) {
                    this.includeContent = includeContent;
                    return this;
                }

                public Builder setIncludeContent(final boolean includeContent) {
                    this.includeContent = com.google.common.base.Optional.of(includeContent);
                    return this;
                }

                private com.google.common.base.Optional<Boolean> includeContent = com.google.common.base.Optional.absent();
            }

            public getMailCampaignsRequest() {
                includeContent = com.google.common.base.Optional.absent();
            }

            public getMailCampaignsRequest(final getMailCampaignsRequest other) {
                this(other.getIncludeContent());
            }

            public getMailCampaignsRequest(final org.thryft.protocol.TProtocol iprot) throws java.io.IOException {
                this(iprot, org.thryft.protocol.TType.STRUCT);
            }

            public getMailCampaignsRequest(final org.thryft.protocol.TProtocol iprot, final byte readAsTType) throws java.io.IOException {
                com.google.common.base.Optional<Boolean> includeContent = com.google.common.base.Optional.absent();

                switch (readAsTType) {
                    case org.thryft.protocol.TType.LIST:
                        final org.thryft.protocol.TList __list = iprot.readListBegin();
                        if (__list.size > 0) {
                            includeContent = com.google.common.base.Optional.of(iprot.readBool());
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
                            } else if (ifield.name.equals("include_content")) {
                                includeContent = com.google.common.base.Optional.of(iprot.readBool());
                            }
                            iprot.readFieldEnd();
                        }
                        iprot.readStructEnd();
                        break;
                }

                this.includeContent = includeContent;
            }

            public getMailCampaignsRequest(final com.google.common.base.Optional<Boolean> includeContent) {
                this.includeContent = includeContent;
            }

            @Override
            public int compareTo(final getMailCampaignsRequest other) {
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
                    getIncludeContent().equals(other.getIncludeContent());
            }

            public Object get(final String fieldName) {
                if (fieldName.equals("include_content")) {
                    return getIncludeContent();
                }
                throw new IllegalArgumentException(fieldName);
            }

            public final com.google.common.base.Optional<Boolean> getIncludeContent() {
                return includeContent;
            }

            @Override
            public int hashCode() {
                int hashCode = 17;
                if (getIncludeContent().isPresent()) {
                    hashCode = 31 * hashCode + (getIncludeContent().get() ? 1 : 0);
                }
                return hashCode;
            }

            @Override
            public String toString() {
                final com.google.common.base.Objects.ToStringHelper helper = com.google.common.base.Objects.toStringHelper(this);
                if (getIncludeContent().isPresent()) {
                    helper.add("include_content", getIncludeContent());
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
                        oprot.writeListBegin(new org.thryft.protocol.TList(org.thryft.protocol.TType.VOID, 1));

                        if (getIncludeContent().isPresent()) {
                            oprot.writeBool(getIncludeContent().get());
                        } else {
                            oprot.writeNull();
                        }

                        oprot.writeListEnd();
                        break;

                    case org.thryft.protocol.TType.STRUCT:
                    default:
                        oprot.writeStructBegin(new org.thryft.protocol.TStruct("getMailCampaignsRequest"));

                        if (getIncludeContent().isPresent()) {
                            oprot.writeFieldBegin(new org.thryft.protocol.TField("include_content", org.thryft.protocol.TType.BOOL, (short)-1));
                            oprot.writeBool(getIncludeContent().get());
                            oprot.writeFieldEnd();
                        }

                        oprot.writeFieldStop();

                        oprot.writeStructEnd();
                        break;
                }
            }

            private final com.google.common.base.Optional<Boolean> includeContent;
        }

        @SuppressWarnings({"serial"})
        public final static class getMailCampaignsResponse implements org.thryft.TBase<getMailCampaignsResponse> {
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

            public getMailCampaignsResponse(final org.thryft.protocol.TProtocol iprot) throws java.io.IOException {
                returnValue = (new com.google.common.base.Function<org.thryft.protocol.TProtocol, com.google.common.collect.ImmutableSet<com.yogento.api.models.mail.campaign.MailCampaign>>() {
                    @Override
                    public com.google.common.collect.ImmutableSet<com.yogento.api.models.mail.campaign.MailCampaign> apply(final org.thryft.protocol.TProtocol iprot) {
                        try {
                            final org.thryft.protocol.TSet sequenceBegin = iprot.readSetBegin();
                            final java.util.Set<com.yogento.api.models.mail.campaign.MailCampaign> sequence = new java.util.LinkedHashSet<com.yogento.api.models.mail.campaign.MailCampaign>();
                            for (int elementI = 0; elementI < sequenceBegin.size; elementI++) {
                                sequence.add(new com.yogento.api.models.mail.campaign.MailCampaign(iprot));
                            }
                            iprot.readSetEnd();
                            return com.google.common.collect.ImmutableSet.copyOf(sequence);
                        } catch (final java.io.IOException e) {
                            return com.google.common.collect.ImmutableSet.of();
                        }
                    }
                }).apply(iprot);
            }

            public getMailCampaignsResponse(final com.google.common.collect.ImmutableSet<com.yogento.api.models.mail.campaign.MailCampaign> returnValue) {
                this.returnValue = com.google.common.base.Preconditions.checkNotNull(returnValue, "com.yogento.api.services.mail.MailService.getMailCampaigns: missing returnValue");
            }

            @Override
            public int compareTo(final getMailCampaignsResponse other) {
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

            public Object get(final String fieldName) {
                if (fieldName.equals("return_value")) {
                    return getReturnValue();
                }
                throw new IllegalArgumentException(fieldName);
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
                        oprot.writeSetBegin(new org.thryft.protocol.TSet(org.thryft.protocol.TType.STRUCT, getReturnValue().size()));
                        for (final com.yogento.api.models.mail.campaign.MailCampaign _iter0 : getReturnValue()) {
                            _iter0.write(oprot);
                        }
                        oprot.writeSetEnd();
                        break;
                    }

                    case org.thryft.protocol.TType.LIST:
                        oprot.writeListBegin(new org.thryft.protocol.TList(org.thryft.protocol.TType.VOID, 1));

                        oprot.writeSetBegin(new org.thryft.protocol.TSet(org.thryft.protocol.TType.STRUCT, getReturnValue().size()));
                        for (final com.yogento.api.models.mail.campaign.MailCampaign _iter0 : getReturnValue()) {
                            _iter0.write(oprot);
                        }
                        oprot.writeSetEnd();

                        oprot.writeListEnd();
                        break;

                    case org.thryft.protocol.TType.STRUCT:
                    default:
                        oprot.writeStructBegin(new org.thryft.protocol.TStruct("getMailCampaignsResponse"));

                        oprot.writeFieldBegin(new org.thryft.protocol.TField("return_value", org.thryft.protocol.TType.SET, (short)-1));
                        oprot.writeSetBegin(new org.thryft.protocol.TSet(org.thryft.protocol.TType.STRUCT, getReturnValue().size()));
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
        public final static class getMailCampaignStatsRequest implements org.thryft.TBase<getMailCampaignStatsRequest> {
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

            public getMailCampaignStatsRequest(final org.thryft.protocol.TProtocol iprot) throws java.io.IOException {
                this(iprot, org.thryft.protocol.TType.STRUCT);
            }

            public getMailCampaignStatsRequest(final org.thryft.protocol.TProtocol iprot, final byte readAsTType) throws java.io.IOException {
                String cid = null;

                switch (readAsTType) {
                    case org.thryft.protocol.TType.LIST:
                        iprot.readListBegin();
                        cid = iprot.readString();
                        iprot.readListEnd();
                        break;

                    case org.thryft.protocol.TType.STRUCT:
                    default:
                        iprot.readStructBegin();
                        while (true) {
                            final org.thryft.protocol.TField ifield = iprot.readFieldBegin();
                            if (ifield.type == org.thryft.protocol.TType.STOP) {
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
            public int compareTo(final getMailCampaignStatsRequest other) {
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

            public Object get(final String fieldName) {
                if (fieldName.equals("cid")) {
                    return getCid();
                }
                throw new IllegalArgumentException(fieldName);
            }

            public final String getCid() {
                return cid;
            }

            @Override
            public int hashCode() {
                int hashCode = 17;
                hashCode = 31 * hashCode + getCid().hashCode();
                return hashCode;
            }

            @Override
            public String toString() {
                final com.google.common.base.Objects.ToStringHelper helper = com.google.common.base.Objects.toStringHelper(this);
                helper.add("cid", getCid());
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

                        oprot.writeString(getCid());

                        oprot.writeListEnd();
                        break;

                    case org.thryft.protocol.TType.STRUCT:
                    default:
                        oprot.writeStructBegin(new org.thryft.protocol.TStruct("getMailCampaignStatsRequest"));

                        oprot.writeFieldBegin(new org.thryft.protocol.TField("cid", org.thryft.protocol.TType.STRING, (short)-1));
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
        public final static class getMailCampaignStatsResponse implements org.thryft.TBase<getMailCampaignStatsResponse> {
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

            public getMailCampaignStatsResponse(final org.thryft.protocol.TProtocol iprot) throws java.io.IOException {
                returnValue = new com.yogento.api.models.mail.campaign.MailCampaignStats(iprot);
            }

            public getMailCampaignStatsResponse(final com.yogento.api.models.mail.campaign.MailCampaignStats returnValue) {
                this.returnValue = com.google.common.base.Preconditions.checkNotNull(returnValue, "com.yogento.api.services.mail.MailService.getMailCampaignStats: missing returnValue");
            }

            @Override
            public int compareTo(final getMailCampaignStatsResponse other) {
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

            public Object get(final String fieldName) {
                if (fieldName.equals("return_value")) {
                    return getReturnValue();
                }
                throw new IllegalArgumentException(fieldName);
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
                        oprot.writeStructBegin(new org.thryft.protocol.TStruct("getMailCampaignStatsResponse"));

                        oprot.writeFieldBegin(new org.thryft.protocol.TField("return_value", org.thryft.protocol.TType.STRUCT, (short)-1));
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
        public final static class getMailListsRequest implements org.thryft.TBase<getMailListsRequest> {
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

            public getMailListsRequest(final org.thryft.protocol.TProtocol iprot) throws java.io.IOException {
                this(iprot, org.thryft.protocol.TType.STRUCT);
            }

            public getMailListsRequest(final org.thryft.protocol.TProtocol iprot, final byte readAsTType) throws java.io.IOException {
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
            public int compareTo(final getMailListsRequest other) {
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
                        oprot.writeStructBegin(new org.thryft.protocol.TStruct("getMailListsRequest"));

                        oprot.writeFieldStop();

                        oprot.writeStructEnd();
                        break;
                }
            }
        }

        @SuppressWarnings({"serial"})
        public final static class getMailListsResponse implements org.thryft.TBase<getMailListsResponse> {
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

            public getMailListsResponse(final org.thryft.protocol.TProtocol iprot) throws java.io.IOException {
                returnValue = (new com.google.common.base.Function<org.thryft.protocol.TProtocol, com.google.common.collect.ImmutableSet<com.yogento.api.models.mail.list.MailList>>() {
                    @Override
                    public com.google.common.collect.ImmutableSet<com.yogento.api.models.mail.list.MailList> apply(final org.thryft.protocol.TProtocol iprot) {
                        try {
                            final org.thryft.protocol.TSet sequenceBegin = iprot.readSetBegin();
                            final java.util.Set<com.yogento.api.models.mail.list.MailList> sequence = new java.util.LinkedHashSet<com.yogento.api.models.mail.list.MailList>();
                            for (int elementI = 0; elementI < sequenceBegin.size; elementI++) {
                                sequence.add(new com.yogento.api.models.mail.list.MailList(iprot));
                            }
                            iprot.readSetEnd();
                            return com.google.common.collect.ImmutableSet.copyOf(sequence);
                        } catch (final java.io.IOException e) {
                            return com.google.common.collect.ImmutableSet.of();
                        }
                    }
                }).apply(iprot);
            }

            public getMailListsResponse(final com.google.common.collect.ImmutableSet<com.yogento.api.models.mail.list.MailList> returnValue) {
                this.returnValue = com.google.common.base.Preconditions.checkNotNull(returnValue, "com.yogento.api.services.mail.MailService.getMailLists: missing returnValue");
            }

            @Override
            public int compareTo(final getMailListsResponse other) {
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

            public Object get(final String fieldName) {
                if (fieldName.equals("return_value")) {
                    return getReturnValue();
                }
                throw new IllegalArgumentException(fieldName);
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
                        oprot.writeSetBegin(new org.thryft.protocol.TSet(org.thryft.protocol.TType.STRUCT, getReturnValue().size()));
                        for (final com.yogento.api.models.mail.list.MailList _iter0 : getReturnValue()) {
                            _iter0.write(oprot);
                        }
                        oprot.writeSetEnd();
                        break;
                    }

                    case org.thryft.protocol.TType.LIST:
                        oprot.writeListBegin(new org.thryft.protocol.TList(org.thryft.protocol.TType.VOID, 1));

                        oprot.writeSetBegin(new org.thryft.protocol.TSet(org.thryft.protocol.TType.STRUCT, getReturnValue().size()));
                        for (final com.yogento.api.models.mail.list.MailList _iter0 : getReturnValue()) {
                            _iter0.write(oprot);
                        }
                        oprot.writeSetEnd();

                        oprot.writeListEnd();
                        break;

                    case org.thryft.protocol.TType.STRUCT:
                    default:
                        oprot.writeStructBegin(new org.thryft.protocol.TStruct("getMailListsResponse"));

                        oprot.writeFieldBegin(new org.thryft.protocol.TField("return_value", org.thryft.protocol.TType.SET, (short)-1));
                        oprot.writeSetBegin(new org.thryft.protocol.TSet(org.thryft.protocol.TType.STRUCT, getReturnValue().size()));
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
        public final static class getMailTemplatesRequest implements org.thryft.TBase<getMailTemplatesRequest> {
            public static class Builder {
                public Builder() {
                }

                public Builder(final getMailTemplatesRequest other) {
                    this.types = other.getTypes();
                }

                protected getMailTemplatesRequest _build(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<com.yogento.api.models.mail.template.MailTemplateType>> types) {
                    return new getMailTemplatesRequest(types);
                }

                public getMailTemplatesRequest build() {
                    return _build(types);
                }

                public Builder setTypes(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<com.yogento.api.models.mail.template.MailTemplateType>> types) {
                    this.types = types;
                    return this;
                }

                public Builder setTypes(final com.google.common.collect.ImmutableSet<com.yogento.api.models.mail.template.MailTemplateType> types) {
                    this.types = com.google.common.base.Optional.of(types);
                    return this;
                }

                /**
                 * types of mail templates to include
                 */
                private com.google.common.base.Optional<com.google.common.collect.ImmutableSet<com.yogento.api.models.mail.template.MailTemplateType>> types = com.google.common.base.Optional.absent();
            }

            public getMailTemplatesRequest() {
                types = com.google.common.base.Optional.absent();
            }

            public getMailTemplatesRequest(final getMailTemplatesRequest other) {
                this(other.getTypes());
            }

            public getMailTemplatesRequest(final org.thryft.protocol.TProtocol iprot) throws java.io.IOException {
                this(iprot, org.thryft.protocol.TType.STRUCT);
            }

            public getMailTemplatesRequest(final org.thryft.protocol.TProtocol iprot, final byte readAsTType) throws java.io.IOException {
                com.google.common.base.Optional<com.google.common.collect.ImmutableSet<com.yogento.api.models.mail.template.MailTemplateType>> types = com.google.common.base.Optional.absent();

                switch (readAsTType) {
                    case org.thryft.protocol.TType.LIST:
                        final org.thryft.protocol.TList __list = iprot.readListBegin();
                        if (__list.size > 0) {
                            types = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.TProtocol, com.google.common.collect.ImmutableSet<com.yogento.api.models.mail.template.MailTemplateType>>() {
                                @Override
                                public com.google.common.collect.ImmutableSet<com.yogento.api.models.mail.template.MailTemplateType> apply(final org.thryft.protocol.TProtocol iprot) {
                                    try {
                                        final org.thryft.protocol.TSet sequenceBegin = iprot.readSetBegin();
                                        final java.util.Set<com.yogento.api.models.mail.template.MailTemplateType> sequence = new java.util.LinkedHashSet<com.yogento.api.models.mail.template.MailTemplateType>();
                                        for (int elementI = 0; elementI < sequenceBegin.size; elementI++) {
                                            sequence.add(new com.yogento.api.models.mail.template.MailTemplateType(iprot));
                                        }
                                        iprot.readSetEnd();
                                        return com.google.common.collect.ImmutableSet.copyOf(sequence);
                                    } catch (final java.io.IOException e) {
                                        return com.google.common.collect.ImmutableSet.of();
                                    }
                                }
                            }).apply(iprot));
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
                            } else if (ifield.name.equals("types")) {
                                types = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.TProtocol, com.google.common.collect.ImmutableSet<com.yogento.api.models.mail.template.MailTemplateType>>() {
                                    @Override
                                    public com.google.common.collect.ImmutableSet<com.yogento.api.models.mail.template.MailTemplateType> apply(final org.thryft.protocol.TProtocol iprot) {
                                        try {
                                            final org.thryft.protocol.TSet sequenceBegin = iprot.readSetBegin();
                                            final java.util.Set<com.yogento.api.models.mail.template.MailTemplateType> sequence = new java.util.LinkedHashSet<com.yogento.api.models.mail.template.MailTemplateType>();
                                            for (int elementI = 0; elementI < sequenceBegin.size; elementI++) {
                                                sequence.add(new com.yogento.api.models.mail.template.MailTemplateType(iprot));
                                            }
                                            iprot.readSetEnd();
                                            return com.google.common.collect.ImmutableSet.copyOf(sequence);
                                        } catch (final java.io.IOException e) {
                                            return com.google.common.collect.ImmutableSet.of();
                                        }
                                    }
                                }).apply(iprot));
                            }
                            iprot.readFieldEnd();
                        }
                        iprot.readStructEnd();
                        break;
                }

                this.types = types;
            }

            public getMailTemplatesRequest(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<com.yogento.api.models.mail.template.MailTemplateType>> types) {
                this.types = com.google.common.base.Preconditions.checkNotNull(types, "com.yogento.api.services.mail.getMailTemplatesRequest: missing types");
            }

            @Override
            public int compareTo(final getMailTemplatesRequest other) {
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
                    getTypes().equals(other.getTypes());
            }

            public Object get(final String fieldName) {
                if (fieldName.equals("types")) {
                    return getTypes();
                }
                throw new IllegalArgumentException(fieldName);
            }

            /**
             * types of mail templates to include
             */
            public final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<com.yogento.api.models.mail.template.MailTemplateType>> getTypes() {
                return types;
            }

            @Override
            public int hashCode() {
                int hashCode = 17;
                if (getTypes().isPresent()) {
                    hashCode = 31 * hashCode + getTypes().get().hashCode();
                }
                return hashCode;
            }

            @Override
            public String toString() {
                final com.google.common.base.Objects.ToStringHelper helper = com.google.common.base.Objects.toStringHelper(this);
                if (getTypes().isPresent()) {
                    helper.add("types", getTypes());
                }
                return helper.toString();
            }

            @Override
            public void write(final org.thryft.protocol.TProtocol oprot) throws java.io.IOException {
                write(oprot, org.thryft.protocol.TType.STRUCT);
            }

            public void write(final org.thryft.protocol.TProtocol oprot, final byte writeAsTType) throws java.io.IOException {
                switch (writeAsTType) {
                    case org.thryft.protocol.TType.VOID: {
                        oprot.writeSetBegin(new org.thryft.protocol.TSet(org.thryft.protocol.TType.STRUCT, getTypes().get().size()));
                        for (final com.yogento.api.models.mail.template.MailTemplateType _iter0 : getTypes().get()) {
                            _iter0.write(oprot);
                        }
                        oprot.writeSetEnd();
                        break;
                    }

                    case org.thryft.protocol.TType.LIST:
                        oprot.writeListBegin(new org.thryft.protocol.TList(org.thryft.protocol.TType.VOID, 1));

                        if (getTypes().isPresent()) {
                            oprot.writeSetBegin(new org.thryft.protocol.TSet(org.thryft.protocol.TType.STRUCT, getTypes().get().size()));
                            for (final com.yogento.api.models.mail.template.MailTemplateType _iter0 : getTypes().get()) {
                                _iter0.write(oprot);
                            }
                            oprot.writeSetEnd();
                        } else {
                            oprot.writeNull();
                        }

                        oprot.writeListEnd();
                        break;

                    case org.thryft.protocol.TType.STRUCT:
                    default:
                        oprot.writeStructBegin(new org.thryft.protocol.TStruct("getMailTemplatesRequest"));

                        if (getTypes().isPresent()) {
                            oprot.writeFieldBegin(new org.thryft.protocol.TField("types", org.thryft.protocol.TType.SET, (short)-1));
                            oprot.writeSetBegin(new org.thryft.protocol.TSet(org.thryft.protocol.TType.STRUCT, getTypes().get().size()));
                            for (final com.yogento.api.models.mail.template.MailTemplateType _iter0 : getTypes().get()) {
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

            /**
             * types of mail templates to include
             */
            private final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<com.yogento.api.models.mail.template.MailTemplateType>> types;
        }

        @SuppressWarnings({"serial"})
        public final static class getMailTemplatesResponse implements org.thryft.TBase<getMailTemplatesResponse> {
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

                /**
                 * set of matching mail templates
                 */
                private com.google.common.collect.ImmutableSet<com.yogento.api.models.mail.template.MailTemplate> returnValue;
            }

            public getMailTemplatesResponse(final getMailTemplatesResponse other) {
                this(other.getReturnValue());
            }

            public getMailTemplatesResponse(final org.thryft.protocol.TProtocol iprot) throws java.io.IOException {
                returnValue = (new com.google.common.base.Function<org.thryft.protocol.TProtocol, com.google.common.collect.ImmutableSet<com.yogento.api.models.mail.template.MailTemplate>>() {
                    @Override
                    public com.google.common.collect.ImmutableSet<com.yogento.api.models.mail.template.MailTemplate> apply(final org.thryft.protocol.TProtocol iprot) {
                        try {
                            final org.thryft.protocol.TSet sequenceBegin = iprot.readSetBegin();
                            final java.util.Set<com.yogento.api.models.mail.template.MailTemplate> sequence = new java.util.LinkedHashSet<com.yogento.api.models.mail.template.MailTemplate>();
                            for (int elementI = 0; elementI < sequenceBegin.size; elementI++) {
                                sequence.add(new com.yogento.api.models.mail.template.MailTemplate(iprot));
                            }
                            iprot.readSetEnd();
                            return com.google.common.collect.ImmutableSet.copyOf(sequence);
                        } catch (final java.io.IOException e) {
                            return com.google.common.collect.ImmutableSet.of();
                        }
                    }
                }).apply(iprot);
            }

            public getMailTemplatesResponse(final com.google.common.collect.ImmutableSet<com.yogento.api.models.mail.template.MailTemplate> returnValue) {
                this.returnValue = com.google.common.base.Preconditions.checkNotNull(returnValue, "com.yogento.api.services.mail.MailService.getMailTemplates: missing returnValue");
            }

            @Override
            public int compareTo(final getMailTemplatesResponse other) {
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

            public Object get(final String fieldName) {
                if (fieldName.equals("return_value")) {
                    return getReturnValue();
                }
                throw new IllegalArgumentException(fieldName);
            }

            /**
             * set of matching mail templates
             */
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
                        oprot.writeSetBegin(new org.thryft.protocol.TSet(org.thryft.protocol.TType.STRUCT, getReturnValue().size()));
                        for (final com.yogento.api.models.mail.template.MailTemplate _iter0 : getReturnValue()) {
                            _iter0.write(oprot);
                        }
                        oprot.writeSetEnd();
                        break;
                    }

                    case org.thryft.protocol.TType.LIST:
                        oprot.writeListBegin(new org.thryft.protocol.TList(org.thryft.protocol.TType.VOID, 1));

                        oprot.writeSetBegin(new org.thryft.protocol.TSet(org.thryft.protocol.TType.STRUCT, getReturnValue().size()));
                        for (final com.yogento.api.models.mail.template.MailTemplate _iter0 : getReturnValue()) {
                            _iter0.write(oprot);
                        }
                        oprot.writeSetEnd();

                        oprot.writeListEnd();
                        break;

                    case org.thryft.protocol.TType.STRUCT:
                    default:
                        oprot.writeStructBegin(new org.thryft.protocol.TStruct("getMailTemplatesResponse"));

                        oprot.writeFieldBegin(new org.thryft.protocol.TField("return_value", org.thryft.protocol.TType.SET, (short)-1));
                        oprot.writeSetBegin(new org.thryft.protocol.TSet(org.thryft.protocol.TType.STRUCT, getReturnValue().size()));
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

            /**
             * set of matching mail templates
             */
            private final com.google.common.collect.ImmutableSet<com.yogento.api.models.mail.template.MailTemplate> returnValue;
        }

        @SuppressWarnings({"serial"})
        public final static class getMailTemplateInfoRequest implements org.thryft.TBase<getMailTemplateInfoRequest> {
            public static class Builder {
                public Builder() {
                }

                public Builder(final getMailTemplateInfoRequest other) {
                    this.tid = other.getTid();
                    this.type = other.getType();
                }

                protected getMailTemplateInfoRequest _build(final int tid, final com.google.common.base.Optional<com.yogento.api.models.mail.template.MailTemplateType> type) {
                    return new getMailTemplateInfoRequest(tid, type);
                }

                public getMailTemplateInfoRequest build() {
                    return _build(tid, type);
                }

                public Builder setTid(final int tid) {
                    this.tid = tid;
                    return this;
                }

                public Builder setType(final com.google.common.base.Optional<com.yogento.api.models.mail.template.MailTemplateType> type) {
                    this.type = type;
                    return this;
                }

                public Builder setType(final com.yogento.api.models.mail.template.MailTemplateType type) {
                    this.type = com.google.common.base.Optional.of(type);
                    return this;
                }

                private Integer tid;
                private com.google.common.base.Optional<com.yogento.api.models.mail.template.MailTemplateType> type = com.google.common.base.Optional.absent();
            }

            public getMailTemplateInfoRequest(final getMailTemplateInfoRequest other) {
                this(other.getTid(), other.getType());
            }

            public getMailTemplateInfoRequest(final org.thryft.protocol.TProtocol iprot) throws java.io.IOException {
                this(iprot, org.thryft.protocol.TType.STRUCT);
            }

            public getMailTemplateInfoRequest(final org.thryft.protocol.TProtocol iprot, final byte readAsTType) throws java.io.IOException {
                int tid = 0;
                com.google.common.base.Optional<com.yogento.api.models.mail.template.MailTemplateType> type = com.google.common.base.Optional.absent();

                switch (readAsTType) {
                    case org.thryft.protocol.TType.LIST:
                        final org.thryft.protocol.TList __list = iprot.readListBegin();
                        tid = iprot.readI32();
                        if (__list.size > 1) {
                            type = com.google.common.base.Optional.of(new com.yogento.api.models.mail.template.MailTemplateType(iprot));
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
                            } else if (ifield.name.equals("tid")) {
                                tid = iprot.readI32();
                            } else if (ifield.name.equals("type")) {
                                type = com.google.common.base.Optional.of(new com.yogento.api.models.mail.template.MailTemplateType(iprot));
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
                this.type = com.google.common.base.Optional.absent();
            }

            public getMailTemplateInfoRequest(final int tid, final com.google.common.base.Optional<com.yogento.api.models.mail.template.MailTemplateType> type) {
                this.tid = tid;
                this.type = com.google.common.base.Preconditions.checkNotNull(type, "com.yogento.api.services.mail.getMailTemplateInfoRequest: missing type");
            }

            public getMailTemplateInfoRequest(final Integer tid, final com.google.common.base.Optional<com.yogento.api.models.mail.template.MailTemplateType> type) {
                this.tid = tid;
                this.type = com.google.common.base.Preconditions.checkNotNull(type, "com.yogento.api.services.mail.getMailTemplateInfoRequest: missing type");
            }

            @Override
            public int compareTo(final getMailTemplateInfoRequest other) {
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
                    getType().equals(other.getType());
            }

            public Object get(final String fieldName) {
                if (fieldName.equals("tid")) {
                    return getTid();
                } else if (fieldName.equals("type")) {
                    return getType();
                }
                throw new IllegalArgumentException(fieldName);
            }

            public final int getTid() {
                return tid;
            }

            public final com.google.common.base.Optional<com.yogento.api.models.mail.template.MailTemplateType> getType() {
                return type;
            }

            @Override
            public int hashCode() {
                int hashCode = 17;
                hashCode = 31 * hashCode + ((int)getTid());
                if (getType().isPresent()) {
                    hashCode = 31 * hashCode + getType().get().hashCode();
                }
                return hashCode;
            }

            @Override
            public String toString() {
                final com.google.common.base.Objects.ToStringHelper helper = com.google.common.base.Objects.toStringHelper(this);
                helper.add("tid", getTid());
                if (getType().isPresent()) {
                    helper.add("type", getType());
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

                        oprot.writeI32(getTid());

                        if (getType().isPresent()) {
                            getType().get().write(oprot);
                        } else {
                            oprot.writeNull();
                        }

                        oprot.writeListEnd();
                        break;

                    case org.thryft.protocol.TType.STRUCT:
                    default:
                        oprot.writeStructBegin(new org.thryft.protocol.TStruct("getMailTemplateInfoRequest"));

                        oprot.writeFieldBegin(new org.thryft.protocol.TField("tid", org.thryft.protocol.TType.I32, (short)-1));
                        oprot.writeI32(getTid());
                        oprot.writeFieldEnd();

                        if (getType().isPresent()) {
                            oprot.writeFieldBegin(new org.thryft.protocol.TField("type", org.thryft.protocol.TType.STRUCT, (short)-1));
                            getType().get().write(oprot);
                            oprot.writeFieldEnd();
                        }

                        oprot.writeFieldStop();

                        oprot.writeStructEnd();
                        break;
                }
            }

            private final int tid;

            private final com.google.common.base.Optional<com.yogento.api.models.mail.template.MailTemplateType> type;
        }

        @SuppressWarnings({"serial"})
        public final static class getMailTemplateInfoResponse implements org.thryft.TBase<getMailTemplateInfoResponse> {
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

            public getMailTemplateInfoResponse(final org.thryft.protocol.TProtocol iprot) throws java.io.IOException {
                returnValue = new com.yogento.api.models.mail.template.MailTemplateInfo(iprot);
            }

            public getMailTemplateInfoResponse(final com.yogento.api.models.mail.template.MailTemplateInfo returnValue) {
                this.returnValue = com.google.common.base.Preconditions.checkNotNull(returnValue, "com.yogento.api.services.mail.MailService.getMailTemplateInfo: missing returnValue");
            }

            @Override
            public int compareTo(final getMailTemplateInfoResponse other) {
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

            public Object get(final String fieldName) {
                if (fieldName.equals("return_value")) {
                    return getReturnValue();
                }
                throw new IllegalArgumentException(fieldName);
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
                        oprot.writeStructBegin(new org.thryft.protocol.TStruct("getMailTemplateInfoResponse"));

                        oprot.writeFieldBegin(new org.thryft.protocol.TField("return_value", org.thryft.protocol.TType.STRUCT, (short)-1));
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
        public final static class postMailCampaignRequest implements org.thryft.TBase<postMailCampaignRequest> {
            public static class Builder {
                public Builder() {
                }

                public Builder(final postMailCampaignRequest other) {
                    this.campaign = other.getCampaign();
                    this.scheduleTime = other.getScheduleTime();
                    this.scheduleTimeB = other.getScheduleTimeB();
                    this.testEmails = other.getTestEmails();
                }

                protected postMailCampaignRequest _build(final com.yogento.api.models.mail.campaign.MailCampaign campaign, final com.google.common.base.Optional<org.joda.time.DateTime> scheduleTime, final com.google.common.base.Optional<org.joda.time.DateTime> scheduleTimeB, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.thryft.native_.EmailAddress>> testEmails) {
                    return new postMailCampaignRequest(campaign, scheduleTime, scheduleTimeB, testEmails);
                }

                public postMailCampaignRequest build() {
                    return _build(campaign, scheduleTime, scheduleTimeB, testEmails);
                }

                public Builder setCampaign(final com.yogento.api.models.mail.campaign.MailCampaign campaign) {
                    this.campaign = campaign;
                    return this;
                }

                public Builder setScheduleTime(final com.google.common.base.Optional<org.joda.time.DateTime> scheduleTime) {
                    this.scheduleTime = scheduleTime;
                    return this;
                }

                public Builder setScheduleTime(final org.joda.time.DateTime scheduleTime) {
                    this.scheduleTime = com.google.common.base.Optional.of(scheduleTime);
                    return this;
                }

                public Builder setScheduleTimeB(final com.google.common.base.Optional<org.joda.time.DateTime> scheduleTimeB) {
                    this.scheduleTimeB = scheduleTimeB;
                    return this;
                }

                public Builder setScheduleTimeB(final org.joda.time.DateTime scheduleTimeB) {
                    this.scheduleTimeB = com.google.common.base.Optional.of(scheduleTimeB);
                    return this;
                }

                public Builder setTestEmails(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.thryft.native_.EmailAddress>> testEmails) {
                    this.testEmails = testEmails;
                    return this;
                }

                public Builder setTestEmails(final com.google.common.collect.ImmutableList<org.thryft.native_.EmailAddress> testEmails) {
                    this.testEmails = com.google.common.base.Optional.of(testEmails);
                    return this;
                }

                private com.yogento.api.models.mail.campaign.MailCampaign campaign;
                private com.google.common.base.Optional<org.joda.time.DateTime> scheduleTime = com.google.common.base.Optional.absent();
                private com.google.common.base.Optional<org.joda.time.DateTime> scheduleTimeB = com.google.common.base.Optional.absent();
                private com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.thryft.native_.EmailAddress>> testEmails = com.google.common.base.Optional.absent();
            }

            public postMailCampaignRequest(final postMailCampaignRequest other) {
                this(other.getCampaign(), other.getScheduleTime(), other.getScheduleTimeB(), other.getTestEmails());
            }

            public postMailCampaignRequest(final org.thryft.protocol.TProtocol iprot) throws java.io.IOException {
                this(iprot, org.thryft.protocol.TType.STRUCT);
            }

            public postMailCampaignRequest(final org.thryft.protocol.TProtocol iprot, final byte readAsTType) throws java.io.IOException {
                com.yogento.api.models.mail.campaign.MailCampaign campaign = null;
                com.google.common.base.Optional<org.joda.time.DateTime> scheduleTime = com.google.common.base.Optional.absent();
                com.google.common.base.Optional<org.joda.time.DateTime> scheduleTimeB = com.google.common.base.Optional.absent();
                com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.thryft.native_.EmailAddress>> testEmails = com.google.common.base.Optional.absent();

                switch (readAsTType) {
                    case org.thryft.protocol.TType.LIST:
                        final org.thryft.protocol.TList __list = iprot.readListBegin();
                        campaign = new com.yogento.api.models.mail.campaign.MailCampaign(iprot);
                        if (__list.size > 1) {
                            try {
                                scheduleTime = com.google.common.base.Optional.of(iprot.readDateTime());
                            } catch (IllegalArgumentException e) {
                            }
                        }
                        if (__list.size > 2) {
                            try {
                                scheduleTimeB = com.google.common.base.Optional.of(iprot.readDateTime());
                            } catch (IllegalArgumentException e) {
                            }
                        }
                        if (__list.size > 3) {
                            testEmails = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.TProtocol, com.google.common.collect.ImmutableList<org.thryft.native_.EmailAddress>>() {
                                @Override
                                public com.google.common.collect.ImmutableList<org.thryft.native_.EmailAddress> apply(final org.thryft.protocol.TProtocol iprot) {
                                    try {
                                        final org.thryft.protocol.TList sequenceBegin = iprot.readListBegin();
                                        final java.util.List<org.thryft.native_.EmailAddress> sequence = new java.util.ArrayList<org.thryft.native_.EmailAddress>();
                                        for (int elementI = 0; elementI < sequenceBegin.size; elementI++) {
                                            sequence.add(iprot.readEmailAddress());
                                        }
                                        iprot.readListEnd();
                                        return com.google.common.collect.ImmutableList.copyOf(sequence);
                                    } catch (final java.io.IOException e) {
                                        return com.google.common.collect.ImmutableList.of();
                                    }
                                }
                            }).apply(iprot));
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
                            } else if (ifield.name.equals("campaign")) {
                                campaign = new com.yogento.api.models.mail.campaign.MailCampaign(iprot);
                            } else if (ifield.name.equals("schedule_time")) {
                                try {
                                    scheduleTime = com.google.common.base.Optional.of(iprot.readDateTime());
                                } catch (IllegalArgumentException e) {
                                }
                            } else if (ifield.name.equals("schedule_time_b")) {
                                try {
                                    scheduleTimeB = com.google.common.base.Optional.of(iprot.readDateTime());
                                } catch (IllegalArgumentException e) {
                                }
                            } else if (ifield.name.equals("test_emails")) {
                                testEmails = com.google.common.base.Optional.of((new com.google.common.base.Function<org.thryft.protocol.TProtocol, com.google.common.collect.ImmutableList<org.thryft.native_.EmailAddress>>() {
                                    @Override
                                    public com.google.common.collect.ImmutableList<org.thryft.native_.EmailAddress> apply(final org.thryft.protocol.TProtocol iprot) {
                                        try {
                                            final org.thryft.protocol.TList sequenceBegin = iprot.readListBegin();
                                            final java.util.List<org.thryft.native_.EmailAddress> sequence = new java.util.ArrayList<org.thryft.native_.EmailAddress>();
                                            for (int elementI = 0; elementI < sequenceBegin.size; elementI++) {
                                                sequence.add(iprot.readEmailAddress());
                                            }
                                            iprot.readListEnd();
                                            return com.google.common.collect.ImmutableList.copyOf(sequence);
                                        } catch (final java.io.IOException e) {
                                            return com.google.common.collect.ImmutableList.of();
                                        }
                                    }
                                }).apply(iprot));
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
                this.scheduleTime = com.google.common.base.Optional.absent();
                this.scheduleTimeB = com.google.common.base.Optional.absent();
                this.testEmails = com.google.common.base.Optional.absent();
            }

            public postMailCampaignRequest(final com.yogento.api.models.mail.campaign.MailCampaign campaign, final com.google.common.base.Optional<org.joda.time.DateTime> scheduleTime, final com.google.common.base.Optional<org.joda.time.DateTime> scheduleTimeB, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.thryft.native_.EmailAddress>> testEmails) {
                this.campaign = com.google.common.base.Preconditions.checkNotNull(campaign, "com.yogento.api.services.mail.postMailCampaignRequest: missing campaign");
                this.scheduleTime = com.google.common.base.Preconditions.checkNotNull(scheduleTime, "com.yogento.api.services.mail.postMailCampaignRequest: missing scheduleTime");
                this.scheduleTimeB = com.google.common.base.Preconditions.checkNotNull(scheduleTimeB, "com.yogento.api.services.mail.postMailCampaignRequest: missing scheduleTimeB");
                this.testEmails = com.google.common.base.Preconditions.checkNotNull(testEmails, "com.yogento.api.services.mail.postMailCampaignRequest: missing testEmails");
            }

            @Override
            public int compareTo(final postMailCampaignRequest other) {
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
                    getScheduleTime().equals(other.getScheduleTime()) &&
                    getScheduleTimeB().equals(other.getScheduleTimeB()) &&
                    getTestEmails().equals(other.getTestEmails());
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
                throw new IllegalArgumentException(fieldName);
            }

            public final com.yogento.api.models.mail.campaign.MailCampaign getCampaign() {
                return campaign;
            }

            public final com.google.common.base.Optional<org.joda.time.DateTime> getScheduleTime() {
                return scheduleTime;
            }

            public final com.google.common.base.Optional<org.joda.time.DateTime> getScheduleTimeB() {
                return scheduleTimeB;
            }

            public final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.thryft.native_.EmailAddress>> getTestEmails() {
                return testEmails;
            }

            @Override
            public int hashCode() {
                int hashCode = 17;
                hashCode = 31 * hashCode + getCampaign().hashCode();
                if (getScheduleTime().isPresent()) {
                    hashCode = 31 * hashCode + getScheduleTime().get().hashCode();
                }
                if (getScheduleTimeB().isPresent()) {
                    hashCode = 31 * hashCode + getScheduleTimeB().get().hashCode();
                }
                if (getTestEmails().isPresent()) {
                    hashCode = 31 * hashCode + getTestEmails().get().hashCode();
                }
                return hashCode;
            }

            @Override
            public String toString() {
                final com.google.common.base.Objects.ToStringHelper helper = com.google.common.base.Objects.toStringHelper(this);
                helper.add("campaign", getCampaign());
                if (getScheduleTime().isPresent()) {
                    helper.add("schedule_time", getScheduleTime());
                }
                if (getScheduleTimeB().isPresent()) {
                    helper.add("schedule_time_b", getScheduleTimeB());
                }
                if (getTestEmails().isPresent()) {
                    helper.add("test_emails", getTestEmails());
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
                        oprot.writeListBegin(new org.thryft.protocol.TList(org.thryft.protocol.TType.VOID, 4));

                        getCampaign().write(oprot);

                        if (getScheduleTime().isPresent()) {
                            oprot.writeDateTime(getScheduleTime().get());
                        } else {
                            oprot.writeNull();
                        }

                        if (getScheduleTimeB().isPresent()) {
                            oprot.writeDateTime(getScheduleTimeB().get());
                        } else {
                            oprot.writeNull();
                        }

                        if (getTestEmails().isPresent()) {
                            oprot.writeListBegin(new org.thryft.protocol.TList(org.thryft.protocol.TType.STRUCT, getTestEmails().get().size()));
                            for (final org.thryft.native_.EmailAddress _iter0 : getTestEmails().get()) {
                                oprot.writeEmailAddress(_iter0);
                            }
                            oprot.writeListEnd();
                        } else {
                            oprot.writeNull();
                        }

                        oprot.writeListEnd();
                        break;

                    case org.thryft.protocol.TType.STRUCT:
                    default:
                        oprot.writeStructBegin(new org.thryft.protocol.TStruct("postMailCampaignRequest"));

                        oprot.writeFieldBegin(new org.thryft.protocol.TField("campaign", org.thryft.protocol.TType.STRUCT, (short)-1));
                        getCampaign().write(oprot);
                        oprot.writeFieldEnd();

                        if (getScheduleTime().isPresent()) {
                            oprot.writeFieldBegin(new org.thryft.protocol.TField("schedule_time", org.thryft.protocol.TType.STRUCT, (short)-1));
                            oprot.writeDateTime(getScheduleTime().get());
                            oprot.writeFieldEnd();
                        }

                        if (getScheduleTimeB().isPresent()) {
                            oprot.writeFieldBegin(new org.thryft.protocol.TField("schedule_time_b", org.thryft.protocol.TType.STRUCT, (short)-1));
                            oprot.writeDateTime(getScheduleTimeB().get());
                            oprot.writeFieldEnd();
                        }

                        if (getTestEmails().isPresent()) {
                            oprot.writeFieldBegin(new org.thryft.protocol.TField("test_emails", org.thryft.protocol.TType.LIST, (short)-1));
                            oprot.writeListBegin(new org.thryft.protocol.TList(org.thryft.protocol.TType.STRUCT, getTestEmails().get().size()));
                            for (final org.thryft.native_.EmailAddress _iter0 : getTestEmails().get()) {
                                oprot.writeEmailAddress(_iter0);
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

            private final com.google.common.base.Optional<org.joda.time.DateTime> scheduleTime;

            private final com.google.common.base.Optional<org.joda.time.DateTime> scheduleTimeB;

            private final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.thryft.native_.EmailAddress>> testEmails;
        }

        @SuppressWarnings({"serial"})
        public final static class postMailCampaignResponse implements org.thryft.TBase<postMailCampaignResponse> {
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

            public postMailCampaignResponse(final org.thryft.protocol.TProtocol iprot) throws java.io.IOException {
                returnValue = new com.yogento.api.models.mail.campaign.MailCampaign(iprot);
            }

            public postMailCampaignResponse(final com.yogento.api.models.mail.campaign.MailCampaign returnValue) {
                this.returnValue = com.google.common.base.Preconditions.checkNotNull(returnValue, "com.yogento.api.services.mail.MailService.postMailCampaign: missing returnValue");
            }

            @Override
            public int compareTo(final postMailCampaignResponse other) {
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

            public Object get(final String fieldName) {
                if (fieldName.equals("return_value")) {
                    return getReturnValue();
                }
                throw new IllegalArgumentException(fieldName);
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
                        oprot.writeStructBegin(new org.thryft.protocol.TStruct("postMailCampaignResponse"));

                        oprot.writeFieldBegin(new org.thryft.protocol.TField("return_value", org.thryft.protocol.TType.STRUCT, (short)-1));
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
        public final static class putMailCampaignRequest implements org.thryft.TBase<putMailCampaignRequest> {
            public static class Builder {
                public Builder() {
                }

                public Builder(final putMailCampaignRequest other) {
                    this.campaign = other.getCampaign();
                    this.writeThrough = other.getWriteThrough();
                }

                protected putMailCampaignRequest _build(final com.yogento.api.models.mail.campaign.MailCampaign campaign, final com.google.common.base.Optional<Boolean> writeThrough) {
                    return new putMailCampaignRequest(campaign, writeThrough);
                }

                public putMailCampaignRequest build() {
                    return _build(campaign, writeThrough);
                }

                public Builder setCampaign(final com.yogento.api.models.mail.campaign.MailCampaign campaign) {
                    this.campaign = campaign;
                    return this;
                }

                public Builder setWriteThrough(final com.google.common.base.Optional<Boolean> writeThrough) {
                    this.writeThrough = writeThrough;
                    return this;
                }

                public Builder setWriteThrough(final boolean writeThrough) {
                    this.writeThrough = com.google.common.base.Optional.of(writeThrough);
                    return this;
                }

                private com.yogento.api.models.mail.campaign.MailCampaign campaign;
                private com.google.common.base.Optional<Boolean> writeThrough = com.google.common.base.Optional.absent();
            }

            public putMailCampaignRequest(final putMailCampaignRequest other) {
                this(other.getCampaign(), other.getWriteThrough());
            }

            public putMailCampaignRequest(final org.thryft.protocol.TProtocol iprot) throws java.io.IOException {
                this(iprot, org.thryft.protocol.TType.STRUCT);
            }

            public putMailCampaignRequest(final org.thryft.protocol.TProtocol iprot, final byte readAsTType) throws java.io.IOException {
                com.yogento.api.models.mail.campaign.MailCampaign campaign = null;
                com.google.common.base.Optional<Boolean> writeThrough = com.google.common.base.Optional.absent();

                switch (readAsTType) {
                    case org.thryft.protocol.TType.LIST:
                        final org.thryft.protocol.TList __list = iprot.readListBegin();
                        campaign = new com.yogento.api.models.mail.campaign.MailCampaign(iprot);
                        if (__list.size > 1) {
                            writeThrough = com.google.common.base.Optional.of(iprot.readBool());
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
                            } else if (ifield.name.equals("campaign")) {
                                campaign = new com.yogento.api.models.mail.campaign.MailCampaign(iprot);
                            } else if (ifield.name.equals("write_through")) {
                                writeThrough = com.google.common.base.Optional.of(iprot.readBool());
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
                this.writeThrough = com.google.common.base.Optional.absent();
            }

            public putMailCampaignRequest(final com.yogento.api.models.mail.campaign.MailCampaign campaign, final com.google.common.base.Optional<Boolean> writeThrough) {
                this.campaign = com.google.common.base.Preconditions.checkNotNull(campaign, "com.yogento.api.services.mail.putMailCampaignRequest: missing campaign");
                this.writeThrough = writeThrough;
            }

            @Override
            public int compareTo(final putMailCampaignRequest other) {
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
                    getWriteThrough().equals(other.getWriteThrough());
            }

            public Object get(final String fieldName) {
                if (fieldName.equals("campaign")) {
                    return getCampaign();
                } else if (fieldName.equals("write_through")) {
                    return getWriteThrough();
                }
                throw new IllegalArgumentException(fieldName);
            }

            public final com.yogento.api.models.mail.campaign.MailCampaign getCampaign() {
                return campaign;
            }

            public final com.google.common.base.Optional<Boolean> getWriteThrough() {
                return writeThrough;
            }

            @Override
            public int hashCode() {
                int hashCode = 17;
                hashCode = 31 * hashCode + getCampaign().hashCode();
                if (getWriteThrough().isPresent()) {
                    hashCode = 31 * hashCode + (getWriteThrough().get() ? 1 : 0);
                }
                return hashCode;
            }

            @Override
            public String toString() {
                final com.google.common.base.Objects.ToStringHelper helper = com.google.common.base.Objects.toStringHelper(this);
                helper.add("campaign", getCampaign());
                if (getWriteThrough().isPresent()) {
                    helper.add("write_through", getWriteThrough());
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

                        getCampaign().write(oprot);

                        if (getWriteThrough().isPresent()) {
                            oprot.writeBool(getWriteThrough().get());
                        } else {
                            oprot.writeNull();
                        }

                        oprot.writeListEnd();
                        break;

                    case org.thryft.protocol.TType.STRUCT:
                    default:
                        oprot.writeStructBegin(new org.thryft.protocol.TStruct("putMailCampaignRequest"));

                        oprot.writeFieldBegin(new org.thryft.protocol.TField("campaign", org.thryft.protocol.TType.STRUCT, (short)-1));
                        getCampaign().write(oprot);
                        oprot.writeFieldEnd();

                        if (getWriteThrough().isPresent()) {
                            oprot.writeFieldBegin(new org.thryft.protocol.TField("write_through", org.thryft.protocol.TType.BOOL, (short)-1));
                            oprot.writeBool(getWriteThrough().get());
                            oprot.writeFieldEnd();
                        }

                        oprot.writeFieldStop();

                        oprot.writeStructEnd();
                        break;
                }
            }

            private final com.yogento.api.models.mail.campaign.MailCampaign campaign;

            private final com.google.common.base.Optional<Boolean> writeThrough;
        }

        @SuppressWarnings({"serial"})
        public final static class putMailCampaignResponse implements org.thryft.TBase<putMailCampaignResponse> {
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

            public putMailCampaignResponse(final org.thryft.protocol.TProtocol iprot) throws java.io.IOException {
                returnValue = new com.yogento.api.models.mail.campaign.MailCampaign(iprot);
            }

            public putMailCampaignResponse(final com.yogento.api.models.mail.campaign.MailCampaign returnValue) {
                this.returnValue = com.google.common.base.Preconditions.checkNotNull(returnValue, "com.yogento.api.services.mail.MailService.putMailCampaign: missing returnValue");
            }

            @Override
            public int compareTo(final putMailCampaignResponse other) {
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

            public Object get(final String fieldName) {
                if (fieldName.equals("return_value")) {
                    return getReturnValue();
                }
                throw new IllegalArgumentException(fieldName);
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
                        oprot.writeStructBegin(new org.thryft.protocol.TStruct("putMailCampaignResponse"));

                        oprot.writeFieldBegin(new org.thryft.protocol.TField("return_value", org.thryft.protocol.TType.STRUCT, (short)-1));
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

    /**
     * Delete a campaign.
     * Never calls the mail service provider; will orphan a campaign on the
     * mail service provider if the campaign has been sent.
     *
     */
    public boolean deleteMailCampaign(final String cid, final com.google.common.base.Optional<Boolean> writeThrough) throws com.yogento.api.services.mail.MailException;

    /**
     * Get a locally-stored campaign.
     * Used as an intermediate "restore" before sending a campaign to the mail
     * service provider.
     * Never calls the mail service provider.
     *
     */
    public com.yogento.api.models.mail.campaign.MailCampaign getMailCampaign(final String cid, final com.google.common.base.Optional<Boolean> includeContent) throws com.yogento.api.services.mail.MailException;

    /**
     * Get all locally-stored campaigns, sans content.
     *
     */
    public com.google.common.collect.ImmutableSet<com.yogento.api.models.mail.campaign.MailCampaign> getMailCampaigns(final com.google.common.base.Optional<Boolean> includeContent) throws com.yogento.api.services.mail.MailException;

    /**
     * Get the campaign statistics kept by the mail service provider.
     * Always calls the mail service provider, stores nothing locally.
     *
     */
    public com.yogento.api.models.mail.campaign.MailCampaignStats getMailCampaignStats(final String cid) throws com.yogento.api.services.mail.MailException;

    /**
     * Get the lists of subscribers kept by the mail service provider.
     * Always calls the mail service provider, stores nothing locally.
     *
     */
    public com.google.common.collect.ImmutableSet<com.yogento.api.models.mail.list.MailList> getMailLists() throws com.yogento.api.services.mail.MailException;

    /**
     * Get the templates kept by the mail service provider.
     * Always calls the mail service provider, stores nothing locally.
     *
     * @param types types of mail templates to include
     * @return set of matching mail templates
     * @throws com.yogento.api.services.mail.MailException generic MailException on any error
     */
    public com.google.common.collect.ImmutableSet<com.yogento.api.models.mail.template.MailTemplate> getMailTemplates(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<com.yogento.api.models.mail.template.MailTemplateType>> types) throws com.yogento.api.services.mail.MailException;

    /**
     * Get information about a template from the mail service provider.
     * Always calls the mail service provider, stores nothing locally.
     *
     */
    public com.yogento.api.models.mail.template.MailTemplateInfo getMailTemplateInfo(final int tid, final com.google.common.base.Optional<com.yogento.api.models.mail.template.MailTemplateType> type) throws com.yogento.api.services.mail.MailException;

    /**
     * Send a mail campaign to the mail service provider.
     * Always calls the mail service provider.
     * Overwrites locally-stored campaign and campaign content.
     * Returns an updated copy of the campaign with e.g., new IDs.
     *
     */
    public com.yogento.api.models.mail.campaign.MailCampaign postMailCampaign(final com.yogento.api.models.mail.campaign.MailCampaign campaign, final com.google.common.base.Optional<org.joda.time.DateTime> scheduleTime, final com.google.common.base.Optional<org.joda.time.DateTime> scheduleTimeB, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.thryft.native_.EmailAddress>> testEmails) throws com.yogento.api.services.mail.MailException;

    /**
     * Overwrite the mail campaign.
     * Used as an intermediate "save" before sending a campaign.
     * Copies to the mail service provider if write_through is true.
     * Returns an updated copy of the campaign with e.g., new IDs.
     *
     */
    public com.yogento.api.models.mail.campaign.MailCampaign putMailCampaign(final com.yogento.api.models.mail.campaign.MailCampaign campaign, final com.google.common.base.Optional<Boolean> writeThrough) throws com.yogento.api.services.mail.MailException;
}
