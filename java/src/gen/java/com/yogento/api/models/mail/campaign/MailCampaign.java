package com.yogento.api.models.mail.campaign;

@SuppressWarnings({"serial"})
public class MailCampaign implements org.thryft.TBase<MailCampaign> {
    public static class Builder {
        public Builder() {
        }

        public Builder(final MailCampaign other) {
            this.content = other.getContent();
            this.id = other.getId();
            this.mailChimpCampaign = other.getMailChimpCampaign();
            this.mailChimpTemplateId = other.getMailChimpTemplateId();
            this.status = other.getStatus();
        }

        protected MailCampaign _build(final com.google.common.base.Optional<com.yogento.api.models.mail.campaign.MailCampaignContent> content, final com.google.common.base.Optional<String> id, final com.google.common.base.Optional<com.yochimp.models.campaign.Campaign> mailChimpCampaign, final com.google.common.base.Optional<String> mailChimpTemplateId, final com.google.common.base.Optional<com.yogento.api.models.mail.campaign.MailCampaignStatus> status) {
            return new MailCampaign(content, id, mailChimpCampaign, mailChimpTemplateId, status);
        }

        public MailCampaign build() {
            return _build(content, id, mailChimpCampaign, mailChimpTemplateId, status);
        }

        public Builder setContent(final com.google.common.base.Optional<com.yogento.api.models.mail.campaign.MailCampaignContent> content) {
            this.content = content;
            return this;
        }

        public Builder setContent(final com.yogento.api.models.mail.campaign.MailCampaignContent content) {
            this.content = com.google.common.base.Optional.of(content);
            return this;
        }

        public Builder setId(final com.google.common.base.Optional<String> id) {
            this.id = id;
            return this;
        }

        public Builder setId(final String id) {
            this.id = com.google.common.base.Optional.of(id);
            return this;
        }

        public Builder setMailChimpCampaign(final com.google.common.base.Optional<com.yochimp.models.campaign.Campaign> mailChimpCampaign) {
            this.mailChimpCampaign = mailChimpCampaign;
            return this;
        }

        public Builder setMailChimpCampaign(final com.yochimp.models.campaign.Campaign mailChimpCampaign) {
            this.mailChimpCampaign = com.google.common.base.Optional.of(mailChimpCampaign);
            return this;
        }

        public Builder setMailChimpTemplateId(final com.google.common.base.Optional<String> mailChimpTemplateId) {
            this.mailChimpTemplateId = mailChimpTemplateId;
            return this;
        }

        public Builder setMailChimpTemplateId(final String mailChimpTemplateId) {
            this.mailChimpTemplateId = com.google.common.base.Optional.of(mailChimpTemplateId);
            return this;
        }

        public Builder setStatus(final com.google.common.base.Optional<com.yogento.api.models.mail.campaign.MailCampaignStatus> status) {
            this.status = status;
            return this;
        }

        public Builder setStatus(final com.yogento.api.models.mail.campaign.MailCampaignStatus status) {
            this.status = com.google.common.base.Optional.of(status);
            return this;
        }

        private com.google.common.base.Optional<com.yogento.api.models.mail.campaign.MailCampaignContent> content = com.google.common.base.Optional.absent();
        private com.google.common.base.Optional<String> id = com.google.common.base.Optional.absent();
        private com.google.common.base.Optional<com.yochimp.models.campaign.Campaign> mailChimpCampaign = com.google.common.base.Optional.absent();
        private com.google.common.base.Optional<String> mailChimpTemplateId = com.google.common.base.Optional.absent();
        private com.google.common.base.Optional<com.yogento.api.models.mail.campaign.MailCampaignStatus> status = com.google.common.base.Optional.absent();
    }

    public MailCampaign() {
        content = com.google.common.base.Optional.absent();
        id = com.google.common.base.Optional.absent();
        mailChimpCampaign = com.google.common.base.Optional.absent();
        mailChimpTemplateId = com.google.common.base.Optional.absent();
        status = com.google.common.base.Optional.absent();
    }

    public MailCampaign(final MailCampaign other) {
        this(other.getContent(), other.getId(), other.getMailChimpCampaign(), other.getMailChimpTemplateId(), other.getStatus());
    }

    public MailCampaign(final org.thryft.protocol.TProtocol iprot) throws java.io.IOException {
        this(iprot, org.thryft.protocol.TType.STRUCT);
    }

    public MailCampaign(final org.thryft.protocol.TProtocol iprot, final byte readAsTType) throws java.io.IOException {
        com.google.common.base.Optional<com.yogento.api.models.mail.campaign.MailCampaignContent> content = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<String> id = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<com.yochimp.models.campaign.Campaign> mailChimpCampaign = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<String> mailChimpTemplateId = com.google.common.base.Optional.absent();
        com.google.common.base.Optional<com.yogento.api.models.mail.campaign.MailCampaignStatus> status = com.google.common.base.Optional.absent();

        switch (readAsTType) {
            case org.thryft.protocol.TType.LIST:
                final org.thryft.protocol.TList __list = iprot.readListBegin();
                if (__list.size > 0) {
                    content = com.google.common.base.Optional.of(new com.yogento.api.models.mail.campaign.MailCampaignContent(iprot));
                }
                if (__list.size > 1) {
                    id = com.google.common.base.Optional.of(iprot.readString());
                }
                if (__list.size > 2) {
                    mailChimpCampaign = com.google.common.base.Optional.of(new com.yochimp.models.campaign.Campaign(iprot));
                }
                if (__list.size > 3) {
                    mailChimpTemplateId = com.google.common.base.Optional.of(iprot.readString());
                }
                if (__list.size > 4) {
                    try {
                        status = com.google.common.base.Optional.of(iprot.readEnum(com.yogento.api.models.mail.campaign.MailCampaignStatus.class));
                    } catch (IllegalArgumentException e) {
                    }
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
                    } else if (ifield.name.equals("content")) {
                        content = com.google.common.base.Optional.of(new com.yogento.api.models.mail.campaign.MailCampaignContent(iprot));
                    } else if (ifield.name.equals("id")) {
                        id = com.google.common.base.Optional.of(iprot.readString());
                    } else if (ifield.name.equals("mail_chimp_campaign")) {
                        mailChimpCampaign = com.google.common.base.Optional.of(new com.yochimp.models.campaign.Campaign(iprot));
                    } else if (ifield.name.equals("mail_chimp_template_id")) {
                        mailChimpTemplateId = com.google.common.base.Optional.of(iprot.readString());
                    } else if (ifield.name.equals("status")) {
                        try {
                            status = com.google.common.base.Optional.of(iprot.readEnum(com.yogento.api.models.mail.campaign.MailCampaignStatus.class));
                        } catch (IllegalArgumentException e) {
                        }
                    }
                    iprot.readFieldEnd();
                }
                iprot.readStructEnd();
                break;
        }

        this.content = content;
        this.id = id;
        this.mailChimpCampaign = mailChimpCampaign;
        this.mailChimpTemplateId = mailChimpTemplateId;
        this.status = status;
    }

    public MailCampaign(final com.google.common.base.Optional<com.yogento.api.models.mail.campaign.MailCampaignContent> content, final com.google.common.base.Optional<String> id, final com.google.common.base.Optional<com.yochimp.models.campaign.Campaign> mailChimpCampaign, final com.google.common.base.Optional<String> mailChimpTemplateId, final com.google.common.base.Optional<com.yogento.api.models.mail.campaign.MailCampaignStatus> status) {
        this.content = com.google.common.base.Preconditions.checkNotNull(content, "com.yogento.api.models.mail.campaign.MailCampaign: missing content");
        this.id = com.google.common.base.Preconditions.checkNotNull(id, "com.yogento.api.models.mail.campaign.MailCampaign: missing id");
        this.mailChimpCampaign = com.google.common.base.Preconditions.checkNotNull(mailChimpCampaign, "com.yogento.api.models.mail.campaign.MailCampaign: missing mailChimpCampaign");
        this.mailChimpTemplateId = com.google.common.base.Preconditions.checkNotNull(mailChimpTemplateId, "com.yogento.api.models.mail.campaign.MailCampaign: missing mailChimpTemplateId");
        this.status = com.google.common.base.Preconditions.checkNotNull(status, "com.yogento.api.models.mail.campaign.MailCampaign: missing status");
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public int compareTo(final MailCampaign other) {
        if (other == null) {
            throw new NullPointerException();
        }

        int result;
        if (this.content.isPresent()) {
            if (other.content.isPresent()) {
                result = this.content.get().compareTo(other.content.get());
                if (result != 0) {
                    return result;
                }
            } else {
                return 1;
            }
        } else if (other.content.isPresent()) {
            return -1;
        }

        if (this.id.isPresent()) {
            if (other.id.isPresent()) {
                result = this.id.get().compareTo(other.id.get());
                if (result != 0) {
                    return result;
                }
            } else {
                return 1;
            }
        } else if (other.id.isPresent()) {
            return -1;
        }

        if (this.mailChimpCampaign.isPresent()) {
            if (other.mailChimpCampaign.isPresent()) {
                result = this.mailChimpCampaign.get().compareTo(other.mailChimpCampaign.get());
                if (result != 0) {
                    return result;
                }
            } else {
                return 1;
            }
        } else if (other.mailChimpCampaign.isPresent()) {
            return -1;
        }

        if (this.mailChimpTemplateId.isPresent()) {
            if (other.mailChimpTemplateId.isPresent()) {
                result = this.mailChimpTemplateId.get().compareTo(other.mailChimpTemplateId.get());
                if (result != 0) {
                    return result;
                }
            } else {
                return 1;
            }
        } else if (other.mailChimpTemplateId.isPresent()) {
            return -1;
        }

        if (this.status.isPresent()) {
            if (other.status.isPresent()) {
                result = this.status.get().compareTo(other.status.get());
                if (result != 0) {
                    return result;
                }
            } else {
                return 1;
            }
        } else if (other.status.isPresent()) {
            return -1;
        }

        return 0;
    }

    @Override
    public boolean equals(final Object otherObject) {
        if (otherObject == this) {
            return true;
        } else if (!(otherObject instanceof MailCampaign)) {
            return false;
        }

        final MailCampaign other = (MailCampaign)otherObject;
        return
            getContent().equals(other.getContent()) &&
            getId().equals(other.getId()) &&
            getMailChimpCampaign().equals(other.getMailChimpCampaign()) &&
            getMailChimpTemplateId().equals(other.getMailChimpTemplateId()) &&
            getStatus().equals(other.getStatus());
    }

    public static MailCampaign fake() {
        return fakeBuilder().build();
    }

    public static Builder fakeBuilder() {
        Builder builder = new Builder();
        builder.setContent(com.yogento.api.models.mail.campaign.MailCampaignContent.fake());
        builder.setId(org.thryft.Faker.Lorem.word());
        builder.setMailChimpCampaign(com.yochimp.models.campaign.Campaign.fake());
        builder.setMailChimpTemplateId(org.thryft.Faker.Lorem.word());
        builder.setStatus(org.thryft.Faker.randomEnum(com.google.common.collect.ImmutableList.of(com.yogento.api.models.mail.campaign.MailCampaignStatus.DRAFT, com.yogento.api.models.mail.campaign.MailCampaignStatus.SAVED_MSP, com.yogento.api.models.mail.campaign.MailCampaignStatus.SENT_MSP)));
        return builder;
    }

    public Object get(final String fieldName) {
        if (fieldName.equals("content")) {
            return getContent();
        } else if (fieldName.equals("id")) {
            return getId();
        } else if (fieldName.equals("mail_chimp_campaign")) {
            return getMailChimpCampaign();
        } else if (fieldName.equals("mail_chimp_template_id")) {
            return getMailChimpTemplateId();
        } else if (fieldName.equals("status")) {
            return getStatus();
        }
        throw new IllegalArgumentException(fieldName);
    }

    public final com.google.common.base.Optional<com.yogento.api.models.mail.campaign.MailCampaignContent> getContent() {
        return content;
    }

    public final com.google.common.base.Optional<String> getId() {
        return id;
    }

    public final com.google.common.base.Optional<com.yochimp.models.campaign.Campaign> getMailChimpCampaign() {
        return mailChimpCampaign;
    }

    public final com.google.common.base.Optional<String> getMailChimpTemplateId() {
        return mailChimpTemplateId;
    }

    public final com.google.common.base.Optional<com.yogento.api.models.mail.campaign.MailCampaignStatus> getStatus() {
        return status;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        if (getContent().isPresent()) {
            hashCode = 31 * hashCode + getContent().get().hashCode();
        }
        if (getId().isPresent()) {
            hashCode = 31 * hashCode + getId().get().hashCode();
        }
        if (getMailChimpCampaign().isPresent()) {
            hashCode = 31 * hashCode + getMailChimpCampaign().get().hashCode();
        }
        if (getMailChimpTemplateId().isPresent()) {
            hashCode = 31 * hashCode + getMailChimpTemplateId().get().hashCode();
        }
        if (getStatus().isPresent()) {
            hashCode = 31 * hashCode + getStatus().get().ordinal();
        }
        return hashCode;
    }

    public MailCampaign replaceContent(final com.google.common.base.Optional<com.yogento.api.models.mail.campaign.MailCampaignContent> content) {
        return new MailCampaign(content, this.id, this.mailChimpCampaign, this.mailChimpTemplateId, this.status);
    }

    public MailCampaign replaceContent(final com.yogento.api.models.mail.campaign.MailCampaignContent content) {
        return replaceContent(com.google.common.base.Optional.fromNullable(content));
    }

    public MailCampaign replaceId(final com.google.common.base.Optional<String> id) {
        return new MailCampaign(this.content, id, this.mailChimpCampaign, this.mailChimpTemplateId, this.status);
    }

    public MailCampaign replaceId(final String id) {
        return replaceId(com.google.common.base.Optional.fromNullable(id));
    }

    public MailCampaign replaceMailChimpCampaign(final com.google.common.base.Optional<com.yochimp.models.campaign.Campaign> mailChimpCampaign) {
        return new MailCampaign(this.content, this.id, mailChimpCampaign, this.mailChimpTemplateId, this.status);
    }

    public MailCampaign replaceMailChimpCampaign(final com.yochimp.models.campaign.Campaign mailChimpCampaign) {
        return replaceMailChimpCampaign(com.google.common.base.Optional.fromNullable(mailChimpCampaign));
    }

    public MailCampaign replaceMailChimpTemplateId(final com.google.common.base.Optional<String> mailChimpTemplateId) {
        return new MailCampaign(this.content, this.id, this.mailChimpCampaign, mailChimpTemplateId, this.status);
    }

    public MailCampaign replaceMailChimpTemplateId(final String mailChimpTemplateId) {
        return replaceMailChimpTemplateId(com.google.common.base.Optional.fromNullable(mailChimpTemplateId));
    }

    public MailCampaign replaceStatus(final com.google.common.base.Optional<com.yogento.api.models.mail.campaign.MailCampaignStatus> status) {
        return new MailCampaign(this.content, this.id, this.mailChimpCampaign, this.mailChimpTemplateId, status);
    }

    public MailCampaign replaceStatus(final com.yogento.api.models.mail.campaign.MailCampaignStatus status) {
        return replaceStatus(com.google.common.base.Optional.fromNullable(status));
    }

    @Override
    public String toString() {
        final com.google.common.base.Objects.ToStringHelper helper = com.google.common.base.Objects.toStringHelper(this);
        if (getContent().isPresent()) {
            helper.add("content", getContent());
        }
        if (getId().isPresent()) {
            helper.add("id", getId());
        }
        if (getMailChimpCampaign().isPresent()) {
            helper.add("mail_chimp_campaign", getMailChimpCampaign());
        }
        if (getMailChimpTemplateId().isPresent()) {
            helper.add("mail_chimp_template_id", getMailChimpTemplateId());
        }
        if (getStatus().isPresent()) {
            helper.add("status", getStatus());
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
                oprot.writeListBegin(new org.thryft.protocol.TList(org.thryft.protocol.TType.VOID, 5));

                if (getContent().isPresent()) {
                    getContent().get().write(oprot);
                } else {
                    oprot.writeNull();
                }

                if (getId().isPresent()) {
                    oprot.writeString(getId().get());
                } else {
                    oprot.writeNull();
                }

                if (getMailChimpCampaign().isPresent()) {
                    getMailChimpCampaign().get().write(oprot);
                } else {
                    oprot.writeNull();
                }

                if (getMailChimpTemplateId().isPresent()) {
                    oprot.writeString(getMailChimpTemplateId().get());
                } else {
                    oprot.writeNull();
                }

                if (getStatus().isPresent()) {
                    oprot.writeEnum(getStatus().get());
                } else {
                    oprot.writeNull();
                }

                oprot.writeListEnd();
                break;

            case org.thryft.protocol.TType.STRUCT:
            default:
                oprot.writeStructBegin(new org.thryft.protocol.TStruct("MailCampaign"));

                if (getContent().isPresent()) {
                    oprot.writeFieldBegin(new org.thryft.protocol.TField("content", org.thryft.protocol.TType.STRUCT, (short)-1));
                    getContent().get().write(oprot);
                    oprot.writeFieldEnd();
                }

                if (getId().isPresent()) {
                    oprot.writeFieldBegin(new org.thryft.protocol.TField("id", org.thryft.protocol.TType.STRING, (short)-1));
                    oprot.writeString(getId().get());
                    oprot.writeFieldEnd();
                }

                if (getMailChimpCampaign().isPresent()) {
                    oprot.writeFieldBegin(new org.thryft.protocol.TField("mail_chimp_campaign", org.thryft.protocol.TType.STRUCT, (short)-1));
                    getMailChimpCampaign().get().write(oprot);
                    oprot.writeFieldEnd();
                }

                if (getMailChimpTemplateId().isPresent()) {
                    oprot.writeFieldBegin(new org.thryft.protocol.TField("mail_chimp_template_id", org.thryft.protocol.TType.STRING, (short)-1));
                    oprot.writeString(getMailChimpTemplateId().get());
                    oprot.writeFieldEnd();
                }

                if (getStatus().isPresent()) {
                    oprot.writeFieldBegin(new org.thryft.protocol.TField("status", org.thryft.protocol.TType.STRING, (short)-1));
                    oprot.writeEnum(getStatus().get());
                    oprot.writeFieldEnd();
                }

                oprot.writeFieldStop();

                oprot.writeStructEnd();
                break;
        }
    }

    private final com.google.common.base.Optional<com.yogento.api.models.mail.campaign.MailCampaignContent> content;

    private final com.google.common.base.Optional<String> id;

    private final com.google.common.base.Optional<com.yochimp.models.campaign.Campaign> mailChimpCampaign;

    private final com.google.common.base.Optional<String> mailChimpTemplateId;

    private final com.google.common.base.Optional<com.yogento.api.models.mail.campaign.MailCampaignStatus> status;
}
