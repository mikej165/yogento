package com.yogento.api.services.mail;

public interface MailService {
    public static class Messages {
        @SuppressWarnings({"serial"})
        public final static class DeleteMailCampaignRequest implements org.thryft.TBase<DeleteMailCampaignRequest> {
            public static class Builder {
                public Builder() {
                }

                public Builder(final DeleteMailCampaignRequest other) {
                    this.cid = other.getCid();
                    this.writeThrough = other.getWriteThrough();
                }

                protected DeleteMailCampaignRequest _build(final String cid, final com.google.common.base.Optional<Boolean> writeThrough) {
                    return new DeleteMailCampaignRequest(cid, writeThrough);
                }

                public DeleteMailCampaignRequest build() {
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

            public DeleteMailCampaignRequest(final DeleteMailCampaignRequest other) {
                this(other.getCid(), other.getWriteThrough());
            }

            public DeleteMailCampaignRequest(final org.thryft.protocol.TProtocol iprot) throws java.io.IOException {
                this(iprot, org.thryft.protocol.TType.STRUCT);
            }

            public DeleteMailCampaignRequest(final org.thryft.protocol.TProtocol iprot, final byte readAsTType) throws java.io.IOException {
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

                this.cid = com.google.common.base.Preconditions.checkNotNull(cid, "com.yogento.api.services.mail.DeleteMailCampaignRequest: missing cid");
                this.writeThrough = writeThrough;
            }

            public DeleteMailCampaignRequest(final String cid) {
                this.cid = com.google.common.base.Preconditions.checkNotNull(cid, "com.yogento.api.services.mail.DeleteMailCampaignRequest: missing cid");
                this.writeThrough = com.google.common.base.Optional.absent();
            }

            public DeleteMailCampaignRequest(final String cid, final com.google.common.base.Optional<Boolean> writeThrough) {
                this.cid = com.google.common.base.Preconditions.checkNotNull(cid, "com.yogento.api.services.mail.DeleteMailCampaignRequest: missing cid");
                this.writeThrough = writeThrough;
            }

            public static Builder builder() {
                return new Builder();
            }

            @Override
            public int compareTo(final DeleteMailCampaignRequest other) {
                if (other == null) {
                    throw new NullPointerException();
                }

                int result;
                result = this.cid.compareTo(other.cid);
                if (result != 0) {
                    return result;
                }

                if (this.writeThrough.isPresent()) {
                    if (other.writeThrough.isPresent()) {
                        result = ((Boolean)this.writeThrough.get()).compareTo(other.writeThrough.get());
                        if (result != 0) {
                            return result;
                        }
                    } else {
                        return 1;
                    }
                } else if (other.writeThrough.isPresent()) {
                    return -1;
                }

                return 0;
            }

            @Override
            public boolean equals(final Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof DeleteMailCampaignRequest)) {
                    return false;
                }

                final DeleteMailCampaignRequest other = (DeleteMailCampaignRequest)otherObject;
                return
                    getCid().equals(other.getCid()) &&
                    getWriteThrough().equals(other.getWriteThrough());
            }

            public static DeleteMailCampaignRequest fake() {
                return fakeBuilder().build();
            }

            public static Builder fakeBuilder() {
                Builder builder = new Builder();
                builder.setCid(org.thryft.Faker.Lorem.word());
                builder.setWriteThrough(org.thryft.Faker.randomBool());
                return builder;
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

            public DeleteMailCampaignRequest replaceCid(final String cid) {
                return new DeleteMailCampaignRequest(cid, this.writeThrough);
            }

            public DeleteMailCampaignRequest replaceWriteThrough(final com.google.common.base.Optional<Boolean> writeThrough) {
                return new DeleteMailCampaignRequest(this.cid, writeThrough);
            }

            public DeleteMailCampaignRequest replaceWriteThrough(final boolean writeThrough) {
                return replaceWriteThrough(com.google.common.base.Optional.fromNullable(writeThrough));
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
                        oprot.writeStructBegin(new org.thryft.protocol.TStruct("DeleteMailCampaignRequest"));

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
        public final static class DeleteMailCampaignResponse implements org.thryft.TBase<DeleteMailCampaignResponse> {
            public static class Builder {
                public Builder() {
                }

                public Builder(final DeleteMailCampaignResponse other) {
                    this.returnValue = other.isReturnValue();
                }

                protected DeleteMailCampaignResponse _build(final boolean returnValue) {
                    return new DeleteMailCampaignResponse(returnValue);
                }

                public DeleteMailCampaignResponse build() {
                    return _build(returnValue);
                }

                public Builder setReturnValue(final boolean returnValue) {
                    this.returnValue = returnValue;
                    return this;
                }

                private Boolean returnValue;
            }

            public DeleteMailCampaignResponse(final DeleteMailCampaignResponse other) {
                this(other.isReturnValue());
            }

            public DeleteMailCampaignResponse(final org.thryft.protocol.TProtocol iprot) throws java.io.IOException {
                returnValue = iprot.readBool();
            }

            public DeleteMailCampaignResponse(final boolean returnValue) {
                this.returnValue = returnValue;
            }

            public DeleteMailCampaignResponse(final Boolean returnValue) {
                this.returnValue = returnValue;
            }

            public static Builder builder() {
                return new Builder();
            }

            @Override
            public int compareTo(final DeleteMailCampaignResponse other) {
                if (other == null) {
                    throw new NullPointerException();
                }

                int result;
                result = ((Boolean)this.returnValue).compareTo(other.returnValue);
                if (result != 0) {
                    return result;
                }

                return 0;
            }

            @Override
            public boolean equals(final Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof DeleteMailCampaignResponse)) {
                    return false;
                }

                final DeleteMailCampaignResponse other = (DeleteMailCampaignResponse)otherObject;
                return
                    isReturnValue() == other.isReturnValue();
            }

            public static DeleteMailCampaignResponse fake() {
                return fakeBuilder().build();
            }

            public static Builder fakeBuilder() {
                Builder builder = new Builder();
                builder.setReturnValue(org.thryft.Faker.randomBool());
                return builder;
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

            public DeleteMailCampaignResponse replaceReturnValue(final boolean returnValue) {
                return new DeleteMailCampaignResponse(returnValue);
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
                        oprot.writeStructBegin(new org.thryft.protocol.TStruct("DeleteMailCampaignResponse"));

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
        public final static class GetMailCampaignRequest implements org.thryft.TBase<GetMailCampaignRequest> {
            public static class Builder {
                public Builder() {
                }

                public Builder(final GetMailCampaignRequest other) {
                    this.cid = other.getCid();
                    this.includeContent = other.getIncludeContent();
                }

                protected GetMailCampaignRequest _build(final String cid, final com.google.common.base.Optional<Boolean> includeContent) {
                    return new GetMailCampaignRequest(cid, includeContent);
                }

                public GetMailCampaignRequest build() {
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

            public GetMailCampaignRequest(final GetMailCampaignRequest other) {
                this(other.getCid(), other.getIncludeContent());
            }

            public GetMailCampaignRequest(final org.thryft.protocol.TProtocol iprot) throws java.io.IOException {
                this(iprot, org.thryft.protocol.TType.STRUCT);
            }

            public GetMailCampaignRequest(final org.thryft.protocol.TProtocol iprot, final byte readAsTType) throws java.io.IOException {
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

                this.cid = com.google.common.base.Preconditions.checkNotNull(cid, "com.yogento.api.services.mail.GetMailCampaignRequest: missing cid");
                this.includeContent = includeContent;
            }

            public GetMailCampaignRequest(final String cid) {
                this.cid = com.google.common.base.Preconditions.checkNotNull(cid, "com.yogento.api.services.mail.GetMailCampaignRequest: missing cid");
                this.includeContent = com.google.common.base.Optional.absent();
            }

            public GetMailCampaignRequest(final String cid, final com.google.common.base.Optional<Boolean> includeContent) {
                this.cid = com.google.common.base.Preconditions.checkNotNull(cid, "com.yogento.api.services.mail.GetMailCampaignRequest: missing cid");
                this.includeContent = includeContent;
            }

            public static Builder builder() {
                return new Builder();
            }

            @Override
            public int compareTo(final GetMailCampaignRequest other) {
                if (other == null) {
                    throw new NullPointerException();
                }

                int result;
                result = this.cid.compareTo(other.cid);
                if (result != 0) {
                    return result;
                }

                if (this.includeContent.isPresent()) {
                    if (other.includeContent.isPresent()) {
                        result = ((Boolean)this.includeContent.get()).compareTo(other.includeContent.get());
                        if (result != 0) {
                            return result;
                        }
                    } else {
                        return 1;
                    }
                } else if (other.includeContent.isPresent()) {
                    return -1;
                }

                return 0;
            }

            @Override
            public boolean equals(final Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof GetMailCampaignRequest)) {
                    return false;
                }

                final GetMailCampaignRequest other = (GetMailCampaignRequest)otherObject;
                return
                    getCid().equals(other.getCid()) &&
                    getIncludeContent().equals(other.getIncludeContent());
            }

            public static GetMailCampaignRequest fake() {
                return fakeBuilder().build();
            }

            public static Builder fakeBuilder() {
                Builder builder = new Builder();
                builder.setCid(org.thryft.Faker.Lorem.word());
                builder.setIncludeContent(org.thryft.Faker.randomBool());
                return builder;
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

            public GetMailCampaignRequest replaceCid(final String cid) {
                return new GetMailCampaignRequest(cid, this.includeContent);
            }

            public GetMailCampaignRequest replaceIncludeContent(final com.google.common.base.Optional<Boolean> includeContent) {
                return new GetMailCampaignRequest(this.cid, includeContent);
            }

            public GetMailCampaignRequest replaceIncludeContent(final boolean includeContent) {
                return replaceIncludeContent(com.google.common.base.Optional.fromNullable(includeContent));
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
                        oprot.writeStructBegin(new org.thryft.protocol.TStruct("GetMailCampaignRequest"));

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
        public final static class GetMailCampaignResponse implements org.thryft.TBase<GetMailCampaignResponse> {
            public static class Builder {
                public Builder() {
                }

                public Builder(final GetMailCampaignResponse other) {
                    this.returnValue = other.getReturnValue();
                }

                protected GetMailCampaignResponse _build(final com.yogento.api.models.mail.campaign.MailCampaign returnValue) {
                    return new GetMailCampaignResponse(returnValue);
                }

                public GetMailCampaignResponse build() {
                    return _build(returnValue);
                }

                public Builder setReturnValue(final com.yogento.api.models.mail.campaign.MailCampaign returnValue) {
                    this.returnValue = returnValue;
                    return this;
                }

                private com.yogento.api.models.mail.campaign.MailCampaign returnValue;
            }

            public GetMailCampaignResponse(final GetMailCampaignResponse other) {
                this(other.getReturnValue());
            }

            public GetMailCampaignResponse(final org.thryft.protocol.TProtocol iprot) throws java.io.IOException {
                returnValue = new com.yogento.api.models.mail.campaign.MailCampaign(iprot);
            }

            public GetMailCampaignResponse(final com.yogento.api.models.mail.campaign.MailCampaign returnValue) {
                this.returnValue = com.google.common.base.Preconditions.checkNotNull(returnValue, "com.yogento.api.services.mail.MailService.getMailCampaign: missing returnValue");
            }

            public static Builder builder() {
                return new Builder();
            }

            @Override
            public int compareTo(final GetMailCampaignResponse other) {
                if (other == null) {
                    throw new NullPointerException();
                }

                int result;
                result = this.returnValue.compareTo(other.returnValue);
                if (result != 0) {
                    return result;
                }

                return 0;
            }

            @Override
            public boolean equals(final Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof GetMailCampaignResponse)) {
                    return false;
                }

                final GetMailCampaignResponse other = (GetMailCampaignResponse)otherObject;
                return
                    getReturnValue().equals(other.getReturnValue());
            }

            public static GetMailCampaignResponse fake() {
                return fakeBuilder().build();
            }

            public static Builder fakeBuilder() {
                Builder builder = new Builder();
                builder.setReturnValue(com.yogento.api.models.mail.campaign.MailCampaign.fake());
                return builder;
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

            public GetMailCampaignResponse replaceReturnValue(final com.yogento.api.models.mail.campaign.MailCampaign returnValue) {
                return new GetMailCampaignResponse(returnValue);
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
                        oprot.writeStructBegin(new org.thryft.protocol.TStruct("GetMailCampaignResponse"));

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
        public final static class GetMailCampaignsRequest implements org.thryft.TBase<GetMailCampaignsRequest> {
            public static class Builder {
                public Builder() {
                }

                public Builder(final GetMailCampaignsRequest other) {
                    this.includeContent = other.getIncludeContent();
                }

                protected GetMailCampaignsRequest _build(final com.google.common.base.Optional<Boolean> includeContent) {
                    return new GetMailCampaignsRequest(includeContent);
                }

                public GetMailCampaignsRequest build() {
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

            public GetMailCampaignsRequest() {
                includeContent = com.google.common.base.Optional.absent();
            }

            public GetMailCampaignsRequest(final GetMailCampaignsRequest other) {
                this(other.getIncludeContent());
            }

            public GetMailCampaignsRequest(final org.thryft.protocol.TProtocol iprot) throws java.io.IOException {
                this(iprot, org.thryft.protocol.TType.STRUCT);
            }

            public GetMailCampaignsRequest(final org.thryft.protocol.TProtocol iprot, final byte readAsTType) throws java.io.IOException {
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

            public GetMailCampaignsRequest(final com.google.common.base.Optional<Boolean> includeContent) {
                this.includeContent = includeContent;
            }

            public static Builder builder() {
                return new Builder();
            }

            @Override
            public int compareTo(final GetMailCampaignsRequest other) {
                if (other == null) {
                    throw new NullPointerException();
                }

                int result;
                if (this.includeContent.isPresent()) {
                    if (other.includeContent.isPresent()) {
                        result = ((Boolean)this.includeContent.get()).compareTo(other.includeContent.get());
                        if (result != 0) {
                            return result;
                        }
                    } else {
                        return 1;
                    }
                } else if (other.includeContent.isPresent()) {
                    return -1;
                }

                return 0;
            }

            @Override
            public boolean equals(final Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof GetMailCampaignsRequest)) {
                    return false;
                }

                final GetMailCampaignsRequest other = (GetMailCampaignsRequest)otherObject;
                return
                    getIncludeContent().equals(other.getIncludeContent());
            }

            public static GetMailCampaignsRequest fake() {
                return fakeBuilder().build();
            }

            public static Builder fakeBuilder() {
                Builder builder = new Builder();
                builder.setIncludeContent(org.thryft.Faker.randomBool());
                return builder;
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

            public GetMailCampaignsRequest replaceIncludeContent(final com.google.common.base.Optional<Boolean> includeContent) {
                return new GetMailCampaignsRequest(includeContent);
            }

            public GetMailCampaignsRequest replaceIncludeContent(final boolean includeContent) {
                return replaceIncludeContent(com.google.common.base.Optional.fromNullable(includeContent));
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
                        oprot.writeStructBegin(new org.thryft.protocol.TStruct("GetMailCampaignsRequest"));

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
        public final static class GetMailCampaignsResponse implements org.thryft.TBase<GetMailCampaignsResponse> {
            public static class Builder {
                public Builder() {
                }

                public Builder(final GetMailCampaignsResponse other) {
                    this.returnValue = other.getReturnValue();
                }

                protected GetMailCampaignsResponse _build(final com.google.common.collect.ImmutableSet<com.yogento.api.models.mail.campaign.MailCampaign> returnValue) {
                    return new GetMailCampaignsResponse(returnValue);
                }

                public GetMailCampaignsResponse build() {
                    return _build(returnValue);
                }

                public Builder setReturnValue(final com.google.common.collect.ImmutableSet<com.yogento.api.models.mail.campaign.MailCampaign> returnValue) {
                    this.returnValue = returnValue;
                    return this;
                }

                private com.google.common.collect.ImmutableSet<com.yogento.api.models.mail.campaign.MailCampaign> returnValue;
            }

            public GetMailCampaignsResponse(final GetMailCampaignsResponse other) {
                this(other.getReturnValue());
            }

            public GetMailCampaignsResponse(final org.thryft.protocol.TProtocol iprot) throws java.io.IOException {
                returnValue = (new com.google.common.base.Function<org.thryft.protocol.TProtocol, com.google.common.collect.ImmutableSet<com.yogento.api.models.mail.campaign.MailCampaign>>() {
                    @Override
                    public com.google.common.collect.ImmutableSet<com.yogento.api.models.mail.campaign.MailCampaign> apply(final org.thryft.protocol.TProtocol iprot) {
                        try {
                            final org.thryft.protocol.TSet sequenceBegin = iprot.readSetBegin();
                            final com.google.common.collect.ImmutableSet.Builder<com.yogento.api.models.mail.campaign.MailCampaign> sequence = com.google.common.collect.ImmutableSet.builder();
                            for (int elementI = 0; elementI < sequenceBegin.size; elementI++) {
                                sequence.add(new com.yogento.api.models.mail.campaign.MailCampaign(iprot));
                            }
                            iprot.readSetEnd();
                            return sequence.build();
                        } catch (final java.io.IOException e) {
                            return com.google.common.collect.ImmutableSet.of();
                        }
                    }
                }).apply(iprot);
            }

            public GetMailCampaignsResponse(final com.google.common.collect.ImmutableSet<com.yogento.api.models.mail.campaign.MailCampaign> returnValue) {
                this.returnValue = com.google.common.base.Preconditions.checkNotNull(returnValue, "com.yogento.api.services.mail.MailService.getMailCampaigns: missing returnValue");
            }

            public static Builder builder() {
                return new Builder();
            }

            @Override
            public int compareTo(final GetMailCampaignsResponse other) {
                if (other == null) {
                    throw new NullPointerException();
                }

                int result;
                result = org.thryft.Comparators.compare(this.returnValue, other.returnValue);
                if (result != 0) {
                    return result;
                }

                return 0;
            }

            @Override
            public boolean equals(final Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof GetMailCampaignsResponse)) {
                    return false;
                }

                final GetMailCampaignsResponse other = (GetMailCampaignsResponse)otherObject;
                return
                    getReturnValue().equals(other.getReturnValue());
            }

            public static GetMailCampaignsResponse fake() {
                return fakeBuilder().build();
            }

            public static Builder fakeBuilder() {
                Builder builder = new Builder();
                builder.setReturnValue(com.google.common.collect.ImmutableSet.of(com.yogento.api.models.mail.campaign.MailCampaign.fake()));
                return builder;
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

            public GetMailCampaignsResponse replaceReturnValue(final com.google.common.collect.ImmutableSet<com.yogento.api.models.mail.campaign.MailCampaign> returnValue) {
                return new GetMailCampaignsResponse(returnValue);
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
                        oprot.writeStructBegin(new org.thryft.protocol.TStruct("GetMailCampaignsResponse"));

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
        public final static class GetMailCampaignStatsRequest implements org.thryft.TBase<GetMailCampaignStatsRequest> {
            public static class Builder {
                public Builder() {
                }

                public Builder(final GetMailCampaignStatsRequest other) {
                    this.cid = other.getCid();
                }

                protected GetMailCampaignStatsRequest _build(final String cid) {
                    return new GetMailCampaignStatsRequest(cid);
                }

                public GetMailCampaignStatsRequest build() {
                    return _build(cid);
                }

                public Builder setCid(final String cid) {
                    this.cid = cid;
                    return this;
                }

                private String cid;
            }

            public GetMailCampaignStatsRequest(final GetMailCampaignStatsRequest other) {
                this(other.getCid());
            }

            public GetMailCampaignStatsRequest(final org.thryft.protocol.TProtocol iprot) throws java.io.IOException {
                this(iprot, org.thryft.protocol.TType.STRUCT);
            }

            public GetMailCampaignStatsRequest(final org.thryft.protocol.TProtocol iprot, final byte readAsTType) throws java.io.IOException {
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

                this.cid = com.google.common.base.Preconditions.checkNotNull(cid, "com.yogento.api.services.mail.GetMailCampaignStatsRequest: missing cid");
            }

            public GetMailCampaignStatsRequest(final String cid) {
                this.cid = com.google.common.base.Preconditions.checkNotNull(cid, "com.yogento.api.services.mail.GetMailCampaignStatsRequest: missing cid");
            }

            public static Builder builder() {
                return new Builder();
            }

            @Override
            public int compareTo(final GetMailCampaignStatsRequest other) {
                if (other == null) {
                    throw new NullPointerException();
                }

                int result;
                result = this.cid.compareTo(other.cid);
                if (result != 0) {
                    return result;
                }

                return 0;
            }

            @Override
            public boolean equals(final Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof GetMailCampaignStatsRequest)) {
                    return false;
                }

                final GetMailCampaignStatsRequest other = (GetMailCampaignStatsRequest)otherObject;
                return
                    getCid().equals(other.getCid());
            }

            public static GetMailCampaignStatsRequest fake() {
                return fakeBuilder().build();
            }

            public static Builder fakeBuilder() {
                Builder builder = new Builder();
                builder.setCid(org.thryft.Faker.Lorem.word());
                return builder;
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

            public GetMailCampaignStatsRequest replaceCid(final String cid) {
                return new GetMailCampaignStatsRequest(cid);
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
                        oprot.writeStructBegin(new org.thryft.protocol.TStruct("GetMailCampaignStatsRequest"));

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
        public final static class GetMailCampaignStatsResponse implements org.thryft.TBase<GetMailCampaignStatsResponse> {
            public static class Builder {
                public Builder() {
                }

                public Builder(final GetMailCampaignStatsResponse other) {
                    this.returnValue = other.getReturnValue();
                }

                protected GetMailCampaignStatsResponse _build(final com.yogento.api.models.mail.campaign.MailCampaignStats returnValue) {
                    return new GetMailCampaignStatsResponse(returnValue);
                }

                public GetMailCampaignStatsResponse build() {
                    return _build(returnValue);
                }

                public Builder setReturnValue(final com.yogento.api.models.mail.campaign.MailCampaignStats returnValue) {
                    this.returnValue = returnValue;
                    return this;
                }

                private com.yogento.api.models.mail.campaign.MailCampaignStats returnValue;
            }

            public GetMailCampaignStatsResponse(final GetMailCampaignStatsResponse other) {
                this(other.getReturnValue());
            }

            public GetMailCampaignStatsResponse(final org.thryft.protocol.TProtocol iprot) throws java.io.IOException {
                returnValue = new com.yogento.api.models.mail.campaign.MailCampaignStats(iprot);
            }

            public GetMailCampaignStatsResponse(final com.yogento.api.models.mail.campaign.MailCampaignStats returnValue) {
                this.returnValue = com.google.common.base.Preconditions.checkNotNull(returnValue, "com.yogento.api.services.mail.MailService.getMailCampaignStats: missing returnValue");
            }

            public static Builder builder() {
                return new Builder();
            }

            @Override
            public int compareTo(final GetMailCampaignStatsResponse other) {
                if (other == null) {
                    throw new NullPointerException();
                }

                int result;
                result = this.returnValue.compareTo(other.returnValue);
                if (result != 0) {
                    return result;
                }

                return 0;
            }

            @Override
            public boolean equals(final Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof GetMailCampaignStatsResponse)) {
                    return false;
                }

                final GetMailCampaignStatsResponse other = (GetMailCampaignStatsResponse)otherObject;
                return
                    getReturnValue().equals(other.getReturnValue());
            }

            public static GetMailCampaignStatsResponse fake() {
                return fakeBuilder().build();
            }

            public static Builder fakeBuilder() {
                Builder builder = new Builder();
                builder.setReturnValue(com.yogento.api.models.mail.campaign.MailCampaignStats.fake());
                return builder;
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

            public GetMailCampaignStatsResponse replaceReturnValue(final com.yogento.api.models.mail.campaign.MailCampaignStats returnValue) {
                return new GetMailCampaignStatsResponse(returnValue);
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
                        oprot.writeStructBegin(new org.thryft.protocol.TStruct("GetMailCampaignStatsResponse"));

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
        public final static class GetMailListsRequest implements org.thryft.TBase<GetMailListsRequest> {
            public static class Builder {
                public Builder() {
                }

                public Builder(final GetMailListsRequest other) {
                }

                protected GetMailListsRequest _build() {
                    return new GetMailListsRequest();
                }

                public GetMailListsRequest build() {
                    return _build();
                }
            }

            public GetMailListsRequest() {
            }

            public GetMailListsRequest(final GetMailListsRequest other) {
            }

            public GetMailListsRequest(final org.thryft.protocol.TProtocol iprot) throws java.io.IOException {
                this(iprot, org.thryft.protocol.TType.STRUCT);
            }

            public GetMailListsRequest(final org.thryft.protocol.TProtocol iprot, final byte readAsTType) throws java.io.IOException {
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

            public static Builder builder() {
                return new Builder();
            }

            @Override
            public int compareTo(final GetMailListsRequest other) {
                if (other == null) {
                    throw new NullPointerException();
                }
                return 0;
            }

            @Override
            public boolean equals(final Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof GetMailListsRequest)) {
                    return false;
                }

                return true;
            }

            public static GetMailListsRequest fake() {
                return fakeBuilder().build();
            }

            public static Builder fakeBuilder() {
                Builder builder = new Builder();
                return builder;
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
                        oprot.writeStructBegin(new org.thryft.protocol.TStruct("GetMailListsRequest"));

                        oprot.writeFieldStop();

                        oprot.writeStructEnd();
                        break;
                }
            }
        }

        @SuppressWarnings({"serial"})
        public final static class GetMailListsResponse implements org.thryft.TBase<GetMailListsResponse> {
            public static class Builder {
                public Builder() {
                }

                public Builder(final GetMailListsResponse other) {
                    this.returnValue = other.getReturnValue();
                }

                protected GetMailListsResponse _build(final com.google.common.collect.ImmutableSet<com.yogento.api.models.mail.list.MailList> returnValue) {
                    return new GetMailListsResponse(returnValue);
                }

                public GetMailListsResponse build() {
                    return _build(returnValue);
                }

                public Builder setReturnValue(final com.google.common.collect.ImmutableSet<com.yogento.api.models.mail.list.MailList> returnValue) {
                    this.returnValue = returnValue;
                    return this;
                }

                private com.google.common.collect.ImmutableSet<com.yogento.api.models.mail.list.MailList> returnValue;
            }

            public GetMailListsResponse(final GetMailListsResponse other) {
                this(other.getReturnValue());
            }

            public GetMailListsResponse(final org.thryft.protocol.TProtocol iprot) throws java.io.IOException {
                returnValue = (new com.google.common.base.Function<org.thryft.protocol.TProtocol, com.google.common.collect.ImmutableSet<com.yogento.api.models.mail.list.MailList>>() {
                    @Override
                    public com.google.common.collect.ImmutableSet<com.yogento.api.models.mail.list.MailList> apply(final org.thryft.protocol.TProtocol iprot) {
                        try {
                            final org.thryft.protocol.TSet sequenceBegin = iprot.readSetBegin();
                            final com.google.common.collect.ImmutableSet.Builder<com.yogento.api.models.mail.list.MailList> sequence = com.google.common.collect.ImmutableSet.builder();
                            for (int elementI = 0; elementI < sequenceBegin.size; elementI++) {
                                sequence.add(new com.yogento.api.models.mail.list.MailList(iprot));
                            }
                            iprot.readSetEnd();
                            return sequence.build();
                        } catch (final java.io.IOException e) {
                            return com.google.common.collect.ImmutableSet.of();
                        }
                    }
                }).apply(iprot);
            }

            public GetMailListsResponse(final com.google.common.collect.ImmutableSet<com.yogento.api.models.mail.list.MailList> returnValue) {
                this.returnValue = com.google.common.base.Preconditions.checkNotNull(returnValue, "com.yogento.api.services.mail.MailService.getMailLists: missing returnValue");
            }

            public static Builder builder() {
                return new Builder();
            }

            @Override
            public int compareTo(final GetMailListsResponse other) {
                if (other == null) {
                    throw new NullPointerException();
                }

                int result;
                result = org.thryft.Comparators.compare(this.returnValue, other.returnValue);
                if (result != 0) {
                    return result;
                }

                return 0;
            }

            @Override
            public boolean equals(final Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof GetMailListsResponse)) {
                    return false;
                }

                final GetMailListsResponse other = (GetMailListsResponse)otherObject;
                return
                    getReturnValue().equals(other.getReturnValue());
            }

            public static GetMailListsResponse fake() {
                return fakeBuilder().build();
            }

            public static Builder fakeBuilder() {
                Builder builder = new Builder();
                builder.setReturnValue(com.google.common.collect.ImmutableSet.of(com.yogento.api.models.mail.list.MailList.fake()));
                return builder;
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

            public GetMailListsResponse replaceReturnValue(final com.google.common.collect.ImmutableSet<com.yogento.api.models.mail.list.MailList> returnValue) {
                return new GetMailListsResponse(returnValue);
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
                        oprot.writeStructBegin(new org.thryft.protocol.TStruct("GetMailListsResponse"));

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
        public final static class GetMailTemplatesRequest implements org.thryft.TBase<GetMailTemplatesRequest> {
            public static class Builder {
                public Builder() {
                }

                public Builder(final GetMailTemplatesRequest other) {
                    this.types = other.getTypes();
                }

                protected GetMailTemplatesRequest _build(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<com.yogento.api.models.mail.template.MailTemplateType>> types) {
                    return new GetMailTemplatesRequest(types);
                }

                public GetMailTemplatesRequest build() {
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

            public GetMailTemplatesRequest() {
                types = com.google.common.base.Optional.absent();
            }

            public GetMailTemplatesRequest(final GetMailTemplatesRequest other) {
                this(other.getTypes());
            }

            public GetMailTemplatesRequest(final org.thryft.protocol.TProtocol iprot) throws java.io.IOException {
                this(iprot, org.thryft.protocol.TType.STRUCT);
            }

            public GetMailTemplatesRequest(final org.thryft.protocol.TProtocol iprot, final byte readAsTType) throws java.io.IOException {
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
                                        final com.google.common.collect.ImmutableSet.Builder<com.yogento.api.models.mail.template.MailTemplateType> sequence = com.google.common.collect.ImmutableSet.builder();
                                        for (int elementI = 0; elementI < sequenceBegin.size; elementI++) {
                                            sequence.add(new com.yogento.api.models.mail.template.MailTemplateType(iprot));
                                        }
                                        iprot.readSetEnd();
                                        return sequence.build();
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
                                            final com.google.common.collect.ImmutableSet.Builder<com.yogento.api.models.mail.template.MailTemplateType> sequence = com.google.common.collect.ImmutableSet.builder();
                                            for (int elementI = 0; elementI < sequenceBegin.size; elementI++) {
                                                sequence.add(new com.yogento.api.models.mail.template.MailTemplateType(iprot));
                                            }
                                            iprot.readSetEnd();
                                            return sequence.build();
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

            public GetMailTemplatesRequest(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<com.yogento.api.models.mail.template.MailTemplateType>> types) {
                this.types = com.google.common.base.Preconditions.checkNotNull(types, "com.yogento.api.services.mail.GetMailTemplatesRequest: missing types");
            }

            public static Builder builder() {
                return new Builder();
            }

            @Override
            public int compareTo(final GetMailTemplatesRequest other) {
                if (other == null) {
                    throw new NullPointerException();
                }

                int result;
                if (this.types.isPresent()) {
                    if (other.types.isPresent()) {
                        result = org.thryft.Comparators.compare(this.types.get(), other.types.get());
                        if (result != 0) {
                            return result;
                        }
                    } else {
                        return 1;
                    }
                } else if (other.types.isPresent()) {
                    return -1;
                }

                return 0;
            }

            @Override
            public boolean equals(final Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof GetMailTemplatesRequest)) {
                    return false;
                }

                final GetMailTemplatesRequest other = (GetMailTemplatesRequest)otherObject;
                return
                    getTypes().equals(other.getTypes());
            }

            public static GetMailTemplatesRequest fake() {
                return fakeBuilder().build();
            }

            public static Builder fakeBuilder() {
                Builder builder = new Builder();
                builder.setTypes(com.google.common.collect.ImmutableSet.of(com.yogento.api.models.mail.template.MailTemplateType.fake()));
                return builder;
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

            public GetMailTemplatesRequest replaceTypes(final com.google.common.base.Optional<com.google.common.collect.ImmutableSet<com.yogento.api.models.mail.template.MailTemplateType>> types) {
                return new GetMailTemplatesRequest(types);
            }

            public GetMailTemplatesRequest replaceTypes(final com.google.common.collect.ImmutableSet<com.yogento.api.models.mail.template.MailTemplateType> types) {
                return replaceTypes(com.google.common.base.Optional.fromNullable(types));
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
                        oprot.writeStructBegin(new org.thryft.protocol.TStruct("GetMailTemplatesRequest"));

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
        public final static class GetMailTemplatesResponse implements org.thryft.TBase<GetMailTemplatesResponse> {
            public static class Builder {
                public Builder() {
                }

                public Builder(final GetMailTemplatesResponse other) {
                    this.returnValue = other.getReturnValue();
                }

                protected GetMailTemplatesResponse _build(final com.google.common.collect.ImmutableSet<com.yogento.api.models.mail.template.MailTemplate> returnValue) {
                    return new GetMailTemplatesResponse(returnValue);
                }

                public GetMailTemplatesResponse build() {
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

            public GetMailTemplatesResponse(final GetMailTemplatesResponse other) {
                this(other.getReturnValue());
            }

            public GetMailTemplatesResponse(final org.thryft.protocol.TProtocol iprot) throws java.io.IOException {
                returnValue = (new com.google.common.base.Function<org.thryft.protocol.TProtocol, com.google.common.collect.ImmutableSet<com.yogento.api.models.mail.template.MailTemplate>>() {
                    @Override
                    public com.google.common.collect.ImmutableSet<com.yogento.api.models.mail.template.MailTemplate> apply(final org.thryft.protocol.TProtocol iprot) {
                        try {
                            final org.thryft.protocol.TSet sequenceBegin = iprot.readSetBegin();
                            final com.google.common.collect.ImmutableSet.Builder<com.yogento.api.models.mail.template.MailTemplate> sequence = com.google.common.collect.ImmutableSet.builder();
                            for (int elementI = 0; elementI < sequenceBegin.size; elementI++) {
                                sequence.add(new com.yogento.api.models.mail.template.MailTemplate(iprot));
                            }
                            iprot.readSetEnd();
                            return sequence.build();
                        } catch (final java.io.IOException e) {
                            return com.google.common.collect.ImmutableSet.of();
                        }
                    }
                }).apply(iprot);
            }

            public GetMailTemplatesResponse(final com.google.common.collect.ImmutableSet<com.yogento.api.models.mail.template.MailTemplate> returnValue) {
                this.returnValue = com.google.common.base.Preconditions.checkNotNull(returnValue, "com.yogento.api.services.mail.MailService.getMailTemplates: missing returnValue");
            }

            public static Builder builder() {
                return new Builder();
            }

            @Override
            public int compareTo(final GetMailTemplatesResponse other) {
                if (other == null) {
                    throw new NullPointerException();
                }

                int result;
                result = org.thryft.Comparators.compare(this.returnValue, other.returnValue);
                if (result != 0) {
                    return result;
                }

                return 0;
            }

            @Override
            public boolean equals(final Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof GetMailTemplatesResponse)) {
                    return false;
                }

                final GetMailTemplatesResponse other = (GetMailTemplatesResponse)otherObject;
                return
                    getReturnValue().equals(other.getReturnValue());
            }

            public static GetMailTemplatesResponse fake() {
                return fakeBuilder().build();
            }

            public static Builder fakeBuilder() {
                Builder builder = new Builder();
                builder.setReturnValue(com.google.common.collect.ImmutableSet.of(com.yogento.api.models.mail.template.MailTemplate.fake()));
                return builder;
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

            public GetMailTemplatesResponse replaceReturnValue(final com.google.common.collect.ImmutableSet<com.yogento.api.models.mail.template.MailTemplate> returnValue) {
                return new GetMailTemplatesResponse(returnValue);
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
                        oprot.writeStructBegin(new org.thryft.protocol.TStruct("GetMailTemplatesResponse"));

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
        public final static class GetMailTemplateInfoRequest implements org.thryft.TBase<GetMailTemplateInfoRequest> {
            public static class Builder {
                public Builder() {
                }

                public Builder(final GetMailTemplateInfoRequest other) {
                    this.tid = other.getTid();
                    this.type = other.getType();
                }

                protected GetMailTemplateInfoRequest _build(final int tid, final com.google.common.base.Optional<com.yogento.api.models.mail.template.MailTemplateType> type) {
                    return new GetMailTemplateInfoRequest(tid, type);
                }

                public GetMailTemplateInfoRequest build() {
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

            public GetMailTemplateInfoRequest(final GetMailTemplateInfoRequest other) {
                this(other.getTid(), other.getType());
            }

            public GetMailTemplateInfoRequest(final org.thryft.protocol.TProtocol iprot) throws java.io.IOException {
                this(iprot, org.thryft.protocol.TType.STRUCT);
            }

            public GetMailTemplateInfoRequest(final org.thryft.protocol.TProtocol iprot, final byte readAsTType) throws java.io.IOException {
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

            public GetMailTemplateInfoRequest(final int tid) {
                this.tid = tid;
                this.type = com.google.common.base.Optional.absent();
            }

            public GetMailTemplateInfoRequest(final int tid, final com.google.common.base.Optional<com.yogento.api.models.mail.template.MailTemplateType> type) {
                this.tid = tid;
                this.type = com.google.common.base.Preconditions.checkNotNull(type, "com.yogento.api.services.mail.GetMailTemplateInfoRequest: missing type");
            }

            public GetMailTemplateInfoRequest(final Integer tid, final com.google.common.base.Optional<com.yogento.api.models.mail.template.MailTemplateType> type) {
                this.tid = tid;
                this.type = com.google.common.base.Preconditions.checkNotNull(type, "com.yogento.api.services.mail.GetMailTemplateInfoRequest: missing type");
            }

            public static Builder builder() {
                return new Builder();
            }

            @Override
            public int compareTo(final GetMailTemplateInfoRequest other) {
                if (other == null) {
                    throw new NullPointerException();
                }

                int result;
                result = ((Integer)this.tid).compareTo(other.tid);
                if (result != 0) {
                    return result;
                }

                if (this.type.isPresent()) {
                    if (other.type.isPresent()) {
                        result = this.type.get().compareTo(other.type.get());
                        if (result != 0) {
                            return result;
                        }
                    } else {
                        return 1;
                    }
                } else if (other.type.isPresent()) {
                    return -1;
                }

                return 0;
            }

            @Override
            public boolean equals(final Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof GetMailTemplateInfoRequest)) {
                    return false;
                }

                final GetMailTemplateInfoRequest other = (GetMailTemplateInfoRequest)otherObject;
                return
                    getTid() == other.getTid() &&
                    getType().equals(other.getType());
            }

            public static GetMailTemplateInfoRequest fake() {
                return fakeBuilder().build();
            }

            public static Builder fakeBuilder() {
                Builder builder = new Builder();
                builder.setTid(org.thryft.Faker.randomI32());
                builder.setType(com.yogento.api.models.mail.template.MailTemplateType.fake());
                return builder;
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

            public GetMailTemplateInfoRequest replaceTid(final int tid) {
                return new GetMailTemplateInfoRequest(tid, this.type);
            }

            public GetMailTemplateInfoRequest replaceType(final com.google.common.base.Optional<com.yogento.api.models.mail.template.MailTemplateType> type) {
                return new GetMailTemplateInfoRequest(this.tid, type);
            }

            public GetMailTemplateInfoRequest replaceType(final com.yogento.api.models.mail.template.MailTemplateType type) {
                return replaceType(com.google.common.base.Optional.fromNullable(type));
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
                        oprot.writeStructBegin(new org.thryft.protocol.TStruct("GetMailTemplateInfoRequest"));

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
        public final static class GetMailTemplateInfoResponse implements org.thryft.TBase<GetMailTemplateInfoResponse> {
            public static class Builder {
                public Builder() {
                }

                public Builder(final GetMailTemplateInfoResponse other) {
                    this.returnValue = other.getReturnValue();
                }

                protected GetMailTemplateInfoResponse _build(final com.yogento.api.models.mail.template.MailTemplateInfo returnValue) {
                    return new GetMailTemplateInfoResponse(returnValue);
                }

                public GetMailTemplateInfoResponse build() {
                    return _build(returnValue);
                }

                public Builder setReturnValue(final com.yogento.api.models.mail.template.MailTemplateInfo returnValue) {
                    this.returnValue = returnValue;
                    return this;
                }

                private com.yogento.api.models.mail.template.MailTemplateInfo returnValue;
            }

            public GetMailTemplateInfoResponse(final GetMailTemplateInfoResponse other) {
                this(other.getReturnValue());
            }

            public GetMailTemplateInfoResponse(final org.thryft.protocol.TProtocol iprot) throws java.io.IOException {
                returnValue = new com.yogento.api.models.mail.template.MailTemplateInfo(iprot);
            }

            public GetMailTemplateInfoResponse(final com.yogento.api.models.mail.template.MailTemplateInfo returnValue) {
                this.returnValue = com.google.common.base.Preconditions.checkNotNull(returnValue, "com.yogento.api.services.mail.MailService.getMailTemplateInfo: missing returnValue");
            }

            public static Builder builder() {
                return new Builder();
            }

            @Override
            public int compareTo(final GetMailTemplateInfoResponse other) {
                if (other == null) {
                    throw new NullPointerException();
                }

                int result;
                result = this.returnValue.compareTo(other.returnValue);
                if (result != 0) {
                    return result;
                }

                return 0;
            }

            @Override
            public boolean equals(final Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof GetMailTemplateInfoResponse)) {
                    return false;
                }

                final GetMailTemplateInfoResponse other = (GetMailTemplateInfoResponse)otherObject;
                return
                    getReturnValue().equals(other.getReturnValue());
            }

            public static GetMailTemplateInfoResponse fake() {
                return fakeBuilder().build();
            }

            public static Builder fakeBuilder() {
                Builder builder = new Builder();
                builder.setReturnValue(com.yogento.api.models.mail.template.MailTemplateInfo.fake());
                return builder;
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

            public GetMailTemplateInfoResponse replaceReturnValue(final com.yogento.api.models.mail.template.MailTemplateInfo returnValue) {
                return new GetMailTemplateInfoResponse(returnValue);
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
                        oprot.writeStructBegin(new org.thryft.protocol.TStruct("GetMailTemplateInfoResponse"));

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
        public final static class PostMailCampaignRequest implements org.thryft.TBase<PostMailCampaignRequest> {
            public static class Builder {
                public Builder() {
                }

                public Builder(final PostMailCampaignRequest other) {
                    this.campaign = other.getCampaign();
                    this.scheduleTime = other.getScheduleTime();
                    this.scheduleTimeB = other.getScheduleTimeB();
                    this.testEmails = other.getTestEmails();
                }

                protected PostMailCampaignRequest _build(final com.yogento.api.models.mail.campaign.MailCampaign campaign, final com.google.common.base.Optional<org.joda.time.DateTime> scheduleTime, final com.google.common.base.Optional<org.joda.time.DateTime> scheduleTimeB, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.thryft.native_.EmailAddress>> testEmails) {
                    return new PostMailCampaignRequest(campaign, scheduleTime, scheduleTimeB, testEmails);
                }

                public PostMailCampaignRequest build() {
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

            public PostMailCampaignRequest(final PostMailCampaignRequest other) {
                this(other.getCampaign(), other.getScheduleTime(), other.getScheduleTimeB(), other.getTestEmails());
            }

            public PostMailCampaignRequest(final org.thryft.protocol.TProtocol iprot) throws java.io.IOException {
                this(iprot, org.thryft.protocol.TType.STRUCT);
            }

            public PostMailCampaignRequest(final org.thryft.protocol.TProtocol iprot, final byte readAsTType) throws java.io.IOException {
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
                                        final com.google.common.collect.ImmutableList.Builder<org.thryft.native_.EmailAddress> sequence = com.google.common.collect.ImmutableList.builder();
                                        for (int elementI = 0; elementI < sequenceBegin.size; elementI++) {
                                            sequence.add(iprot.readEmailAddress());
                                        }
                                        iprot.readListEnd();
                                        return sequence.build();
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
                                            final com.google.common.collect.ImmutableList.Builder<org.thryft.native_.EmailAddress> sequence = com.google.common.collect.ImmutableList.builder();
                                            for (int elementI = 0; elementI < sequenceBegin.size; elementI++) {
                                                sequence.add(iprot.readEmailAddress());
                                            }
                                            iprot.readListEnd();
                                            return sequence.build();
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

                this.campaign = com.google.common.base.Preconditions.checkNotNull(campaign, "com.yogento.api.services.mail.PostMailCampaignRequest: missing campaign");
                this.scheduleTime = scheduleTime;
                this.scheduleTimeB = scheduleTimeB;
                this.testEmails = testEmails;
            }

            public PostMailCampaignRequest(final com.yogento.api.models.mail.campaign.MailCampaign campaign) {
                this.campaign = com.google.common.base.Preconditions.checkNotNull(campaign, "com.yogento.api.services.mail.PostMailCampaignRequest: missing campaign");
                this.scheduleTime = com.google.common.base.Optional.absent();
                this.scheduleTimeB = com.google.common.base.Optional.absent();
                this.testEmails = com.google.common.base.Optional.absent();
            }

            public PostMailCampaignRequest(final com.yogento.api.models.mail.campaign.MailCampaign campaign, final com.google.common.base.Optional<org.joda.time.DateTime> scheduleTime, final com.google.common.base.Optional<org.joda.time.DateTime> scheduleTimeB, final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.thryft.native_.EmailAddress>> testEmails) {
                this.campaign = com.google.common.base.Preconditions.checkNotNull(campaign, "com.yogento.api.services.mail.PostMailCampaignRequest: missing campaign");
                this.scheduleTime = com.google.common.base.Preconditions.checkNotNull(scheduleTime, "com.yogento.api.services.mail.PostMailCampaignRequest: missing scheduleTime");
                this.scheduleTimeB = com.google.common.base.Preconditions.checkNotNull(scheduleTimeB, "com.yogento.api.services.mail.PostMailCampaignRequest: missing scheduleTimeB");
                this.testEmails = com.google.common.base.Preconditions.checkNotNull(testEmails, "com.yogento.api.services.mail.PostMailCampaignRequest: missing testEmails");
            }

            public static Builder builder() {
                return new Builder();
            }

            @Override
            public int compareTo(final PostMailCampaignRequest other) {
                if (other == null) {
                    throw new NullPointerException();
                }

                int result;
                result = this.campaign.compareTo(other.campaign);
                if (result != 0) {
                    return result;
                }

                if (this.scheduleTime.isPresent()) {
                    if (other.scheduleTime.isPresent()) {
                        result = this.scheduleTime.get().compareTo(other.scheduleTime.get());
                        if (result != 0) {
                            return result;
                        }
                    } else {
                        return 1;
                    }
                } else if (other.scheduleTime.isPresent()) {
                    return -1;
                }

                if (this.scheduleTimeB.isPresent()) {
                    if (other.scheduleTimeB.isPresent()) {
                        result = this.scheduleTimeB.get().compareTo(other.scheduleTimeB.get());
                        if (result != 0) {
                            return result;
                        }
                    } else {
                        return 1;
                    }
                } else if (other.scheduleTimeB.isPresent()) {
                    return -1;
                }

                if (this.testEmails.isPresent()) {
                    if (other.testEmails.isPresent()) {
                        result = org.thryft.Comparators.compare(this.testEmails.get(), other.testEmails.get());
                        if (result != 0) {
                            return result;
                        }
                    } else {
                        return 1;
                    }
                } else if (other.testEmails.isPresent()) {
                    return -1;
                }

                return 0;
            }

            @Override
            public boolean equals(final Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof PostMailCampaignRequest)) {
                    return false;
                }

                final PostMailCampaignRequest other = (PostMailCampaignRequest)otherObject;
                return
                    getCampaign().equals(other.getCampaign()) &&
                    getScheduleTime().equals(other.getScheduleTime()) &&
                    getScheduleTimeB().equals(other.getScheduleTimeB()) &&
                    getTestEmails().equals(other.getTestEmails());
            }

            public static PostMailCampaignRequest fake() {
                return fakeBuilder().build();
            }

            public static Builder fakeBuilder() {
                Builder builder = new Builder();
                builder.setCampaign(com.yogento.api.models.mail.campaign.MailCampaign.fake());
                builder.setScheduleTime(org.joda.time.DateTime.now());
                builder.setScheduleTimeB(org.joda.time.DateTime.now());
                builder.setTestEmails(com.google.common.collect.ImmutableList.of(org.thryft.Faker.Internet.email()));
                return builder;
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

            public PostMailCampaignRequest replaceCampaign(final com.yogento.api.models.mail.campaign.MailCampaign campaign) {
                return new PostMailCampaignRequest(campaign, this.scheduleTime, this.scheduleTimeB, this.testEmails);
            }

            public PostMailCampaignRequest replaceScheduleTime(final com.google.common.base.Optional<org.joda.time.DateTime> scheduleTime) {
                return new PostMailCampaignRequest(this.campaign, scheduleTime, this.scheduleTimeB, this.testEmails);
            }

            public PostMailCampaignRequest replaceScheduleTimeB(final com.google.common.base.Optional<org.joda.time.DateTime> scheduleTimeB) {
                return new PostMailCampaignRequest(this.campaign, this.scheduleTime, scheduleTimeB, this.testEmails);
            }

            public PostMailCampaignRequest replaceScheduleTimeB(final org.joda.time.DateTime scheduleTimeB) {
                return replaceScheduleTimeB(com.google.common.base.Optional.fromNullable(scheduleTimeB));
            }

            public PostMailCampaignRequest replaceScheduleTime(final org.joda.time.DateTime scheduleTime) {
                return replaceScheduleTime(com.google.common.base.Optional.fromNullable(scheduleTime));
            }

            public PostMailCampaignRequest replaceTestEmails(final com.google.common.base.Optional<com.google.common.collect.ImmutableList<org.thryft.native_.EmailAddress>> testEmails) {
                return new PostMailCampaignRequest(this.campaign, this.scheduleTime, this.scheduleTimeB, testEmails);
            }

            public PostMailCampaignRequest replaceTestEmails(final com.google.common.collect.ImmutableList<org.thryft.native_.EmailAddress> testEmails) {
                return replaceTestEmails(com.google.common.base.Optional.fromNullable(testEmails));
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
                        oprot.writeStructBegin(new org.thryft.protocol.TStruct("PostMailCampaignRequest"));

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
        public final static class PostMailCampaignResponse implements org.thryft.TBase<PostMailCampaignResponse> {
            public static class Builder {
                public Builder() {
                }

                public Builder(final PostMailCampaignResponse other) {
                    this.returnValue = other.getReturnValue();
                }

                protected PostMailCampaignResponse _build(final com.yogento.api.models.mail.campaign.MailCampaign returnValue) {
                    return new PostMailCampaignResponse(returnValue);
                }

                public PostMailCampaignResponse build() {
                    return _build(returnValue);
                }

                public Builder setReturnValue(final com.yogento.api.models.mail.campaign.MailCampaign returnValue) {
                    this.returnValue = returnValue;
                    return this;
                }

                private com.yogento.api.models.mail.campaign.MailCampaign returnValue;
            }

            public PostMailCampaignResponse(final PostMailCampaignResponse other) {
                this(other.getReturnValue());
            }

            public PostMailCampaignResponse(final org.thryft.protocol.TProtocol iprot) throws java.io.IOException {
                returnValue = new com.yogento.api.models.mail.campaign.MailCampaign(iprot);
            }

            public PostMailCampaignResponse(final com.yogento.api.models.mail.campaign.MailCampaign returnValue) {
                this.returnValue = com.google.common.base.Preconditions.checkNotNull(returnValue, "com.yogento.api.services.mail.MailService.postMailCampaign: missing returnValue");
            }

            public static Builder builder() {
                return new Builder();
            }

            @Override
            public int compareTo(final PostMailCampaignResponse other) {
                if (other == null) {
                    throw new NullPointerException();
                }

                int result;
                result = this.returnValue.compareTo(other.returnValue);
                if (result != 0) {
                    return result;
                }

                return 0;
            }

            @Override
            public boolean equals(final Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof PostMailCampaignResponse)) {
                    return false;
                }

                final PostMailCampaignResponse other = (PostMailCampaignResponse)otherObject;
                return
                    getReturnValue().equals(other.getReturnValue());
            }

            public static PostMailCampaignResponse fake() {
                return fakeBuilder().build();
            }

            public static Builder fakeBuilder() {
                Builder builder = new Builder();
                builder.setReturnValue(com.yogento.api.models.mail.campaign.MailCampaign.fake());
                return builder;
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

            public PostMailCampaignResponse replaceReturnValue(final com.yogento.api.models.mail.campaign.MailCampaign returnValue) {
                return new PostMailCampaignResponse(returnValue);
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
                        oprot.writeStructBegin(new org.thryft.protocol.TStruct("PostMailCampaignResponse"));

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
        public final static class PutMailCampaignRequest implements org.thryft.TBase<PutMailCampaignRequest> {
            public static class Builder {
                public Builder() {
                }

                public Builder(final PutMailCampaignRequest other) {
                    this.campaign = other.getCampaign();
                    this.writeThrough = other.getWriteThrough();
                }

                protected PutMailCampaignRequest _build(final com.yogento.api.models.mail.campaign.MailCampaign campaign, final com.google.common.base.Optional<Boolean> writeThrough) {
                    return new PutMailCampaignRequest(campaign, writeThrough);
                }

                public PutMailCampaignRequest build() {
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

            public PutMailCampaignRequest(final PutMailCampaignRequest other) {
                this(other.getCampaign(), other.getWriteThrough());
            }

            public PutMailCampaignRequest(final org.thryft.protocol.TProtocol iprot) throws java.io.IOException {
                this(iprot, org.thryft.protocol.TType.STRUCT);
            }

            public PutMailCampaignRequest(final org.thryft.protocol.TProtocol iprot, final byte readAsTType) throws java.io.IOException {
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

                this.campaign = com.google.common.base.Preconditions.checkNotNull(campaign, "com.yogento.api.services.mail.PutMailCampaignRequest: missing campaign");
                this.writeThrough = writeThrough;
            }

            public PutMailCampaignRequest(final com.yogento.api.models.mail.campaign.MailCampaign campaign) {
                this.campaign = com.google.common.base.Preconditions.checkNotNull(campaign, "com.yogento.api.services.mail.PutMailCampaignRequest: missing campaign");
                this.writeThrough = com.google.common.base.Optional.absent();
            }

            public PutMailCampaignRequest(final com.yogento.api.models.mail.campaign.MailCampaign campaign, final com.google.common.base.Optional<Boolean> writeThrough) {
                this.campaign = com.google.common.base.Preconditions.checkNotNull(campaign, "com.yogento.api.services.mail.PutMailCampaignRequest: missing campaign");
                this.writeThrough = writeThrough;
            }

            public static Builder builder() {
                return new Builder();
            }

            @Override
            public int compareTo(final PutMailCampaignRequest other) {
                if (other == null) {
                    throw new NullPointerException();
                }

                int result;
                result = this.campaign.compareTo(other.campaign);
                if (result != 0) {
                    return result;
                }

                if (this.writeThrough.isPresent()) {
                    if (other.writeThrough.isPresent()) {
                        result = ((Boolean)this.writeThrough.get()).compareTo(other.writeThrough.get());
                        if (result != 0) {
                            return result;
                        }
                    } else {
                        return 1;
                    }
                } else if (other.writeThrough.isPresent()) {
                    return -1;
                }

                return 0;
            }

            @Override
            public boolean equals(final Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof PutMailCampaignRequest)) {
                    return false;
                }

                final PutMailCampaignRequest other = (PutMailCampaignRequest)otherObject;
                return
                    getCampaign().equals(other.getCampaign()) &&
                    getWriteThrough().equals(other.getWriteThrough());
            }

            public static PutMailCampaignRequest fake() {
                return fakeBuilder().build();
            }

            public static Builder fakeBuilder() {
                Builder builder = new Builder();
                builder.setCampaign(com.yogento.api.models.mail.campaign.MailCampaign.fake());
                builder.setWriteThrough(org.thryft.Faker.randomBool());
                return builder;
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

            public PutMailCampaignRequest replaceCampaign(final com.yogento.api.models.mail.campaign.MailCampaign campaign) {
                return new PutMailCampaignRequest(campaign, this.writeThrough);
            }

            public PutMailCampaignRequest replaceWriteThrough(final com.google.common.base.Optional<Boolean> writeThrough) {
                return new PutMailCampaignRequest(this.campaign, writeThrough);
            }

            public PutMailCampaignRequest replaceWriteThrough(final boolean writeThrough) {
                return replaceWriteThrough(com.google.common.base.Optional.fromNullable(writeThrough));
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
                        oprot.writeStructBegin(new org.thryft.protocol.TStruct("PutMailCampaignRequest"));

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
        public final static class PutMailCampaignResponse implements org.thryft.TBase<PutMailCampaignResponse> {
            public static class Builder {
                public Builder() {
                }

                public Builder(final PutMailCampaignResponse other) {
                    this.returnValue = other.getReturnValue();
                }

                protected PutMailCampaignResponse _build(final com.yogento.api.models.mail.campaign.MailCampaign returnValue) {
                    return new PutMailCampaignResponse(returnValue);
                }

                public PutMailCampaignResponse build() {
                    return _build(returnValue);
                }

                public Builder setReturnValue(final com.yogento.api.models.mail.campaign.MailCampaign returnValue) {
                    this.returnValue = returnValue;
                    return this;
                }

                private com.yogento.api.models.mail.campaign.MailCampaign returnValue;
            }

            public PutMailCampaignResponse(final PutMailCampaignResponse other) {
                this(other.getReturnValue());
            }

            public PutMailCampaignResponse(final org.thryft.protocol.TProtocol iprot) throws java.io.IOException {
                returnValue = new com.yogento.api.models.mail.campaign.MailCampaign(iprot);
            }

            public PutMailCampaignResponse(final com.yogento.api.models.mail.campaign.MailCampaign returnValue) {
                this.returnValue = com.google.common.base.Preconditions.checkNotNull(returnValue, "com.yogento.api.services.mail.MailService.putMailCampaign: missing returnValue");
            }

            public static Builder builder() {
                return new Builder();
            }

            @Override
            public int compareTo(final PutMailCampaignResponse other) {
                if (other == null) {
                    throw new NullPointerException();
                }

                int result;
                result = this.returnValue.compareTo(other.returnValue);
                if (result != 0) {
                    return result;
                }

                return 0;
            }

            @Override
            public boolean equals(final Object otherObject) {
                if (otherObject == this) {
                    return true;
                } else if (!(otherObject instanceof PutMailCampaignResponse)) {
                    return false;
                }

                final PutMailCampaignResponse other = (PutMailCampaignResponse)otherObject;
                return
                    getReturnValue().equals(other.getReturnValue());
            }

            public static PutMailCampaignResponse fake() {
                return fakeBuilder().build();
            }

            public static Builder fakeBuilder() {
                Builder builder = new Builder();
                builder.setReturnValue(com.yogento.api.models.mail.campaign.MailCampaign.fake());
                return builder;
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

            public PutMailCampaignResponse replaceReturnValue(final com.yogento.api.models.mail.campaign.MailCampaign returnValue) {
                return new PutMailCampaignResponse(returnValue);
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
                        oprot.writeStructBegin(new org.thryft.protocol.TStruct("PutMailCampaignResponse"));

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
