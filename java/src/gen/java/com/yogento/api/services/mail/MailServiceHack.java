package com.yogento.api.services.mail;

@SuppressWarnings({"serial"})
public class MailServiceHack implements org.apache.thrift.TBase<MailServiceHack, org.apache.thrift.TFieldIdEnum> {
    public static class Builder {
        public Builder() {
        }

        public Builder(final MailServiceHack other) {
            this.campaign = other.getCampaign();
            this.content = other.getContent();
            this.scheduleTime = other.getScheduleTime();
            this.scheduleTimeB = other.getScheduleTimeB();
            this.testEmails = other.getTestEmails();
        }

        protected MailServiceHack _build(final com.yogento.api.models.mail.campaign.MailCampaign campaign, final com.yogento.api.models.mail.campaign.MailCampaignContent content, final org.joda.time.DateTime scheduleTime, final org.joda.time.DateTime scheduleTimeB, final com.google.common.collect.ImmutableList<String> testEmails) {
            return new MailServiceHack(campaign, content, scheduleTime, scheduleTimeB, testEmails);
        }

        public MailServiceHack build() {
            return _build(campaign, content, scheduleTime, scheduleTimeB, testEmails);
        }

        public Builder setCampaign(final com.yogento.api.models.mail.campaign.MailCampaign campaign) {
            this.campaign = campaign;
            return this;
        }

        public Builder setContent(final com.yogento.api.models.mail.campaign.MailCampaignContent content) {
            this.content = content;
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
        private com.yogento.api.models.mail.campaign.MailCampaignContent content;
        private org.joda.time.DateTime scheduleTime;
        private org.joda.time.DateTime scheduleTimeB;
        private com.google.common.collect.ImmutableList<String> testEmails;
    }

    public MailServiceHack(final MailServiceHack other) {
        this(other.getCampaign(), other.getContent(), other.getScheduleTime(), other.getScheduleTimeB(), other.getTestEmails());
    }

    public MailServiceHack(final org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
        this(iprot, org.apache.thrift.protocol.TType.STRUCT);
    }

    public MailServiceHack(final org.apache.thrift.protocol.TProtocol iprot, final byte readAsTType) throws org.apache.thrift.TException {
        com.yogento.api.models.mail.campaign.MailCampaign campaign = null;
        com.yogento.api.models.mail.campaign.MailCampaignContent content = null;
        org.joda.time.DateTime scheduleTime = null;
        org.joda.time.DateTime scheduleTimeB = null;
        com.google.common.collect.ImmutableList<String> testEmails = null;

        switch (readAsTType) {
            case org.apache.thrift.protocol.TType.LIST:
                iprot.readListBegin();
                campaign = new com.yogento.api.models.mail.campaign.MailCampaign(iprot);
                content = new com.yogento.api.models.mail.campaign.MailCampaignContent(iprot);
                try {
                    scheduleTime = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDateTime() : new org.joda.time.DateTime(iprot.readI64());
                } catch (IllegalArgumentException e) {
                }
                try {
                    scheduleTimeB = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDateTime() : new org.joda.time.DateTime(iprot.readI64());
                } catch (IllegalArgumentException e) {
                }
                testEmails = (new com.google.common.base.Function<org.apache.thrift.protocol.TProtocol, com.google.common.collect.ImmutableList<String>>() {
                    @Override
                    public com.google.common.collect.ImmutableList<String> apply(org.apache.thrift.protocol.TProtocol iprot) {
                        try {
                            org.apache.thrift.protocol.TList sequenceBegin = iprot.readListBegin();
                            java.util.List<String> sequence = new java.util.ArrayList<String>();
                            for (int elementI = 0; elementI < sequenceBegin.size; elementI++) {
                                sequence.add(iprot.readString());
                            }
                            iprot.readListEnd();
                            return com.google.common.collect.ImmutableList.copyOf(sequence);
                        } catch (org.apache.thrift.TException e) {
                            return com.google.common.collect.ImmutableList.of();
                        }
                    }
                }).apply(iprot);
                iprot.readListEnd();
                break;

            case org.apache.thrift.protocol.TType.STRUCT:
            default:
                iprot.readStructBegin();
                while (true) {
                    org.apache.thrift.protocol.TField ifield = iprot.readFieldBegin();
                    if (ifield.type == org.apache.thrift.protocol.TType.STOP) {
                        break;
                    } else                 if (ifield.name.equals("campaign")) {
                        campaign = new com.yogento.api.models.mail.campaign.MailCampaign(iprot);
                    } else if (ifield.name.equals("content")) {
                        content = new com.yogento.api.models.mail.campaign.MailCampaignContent(iprot);
                    } else if (ifield.name.equals("schedule_time")) {
                        try {
                            scheduleTime = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDateTime() : new org.joda.time.DateTime(iprot.readI64());
                        } catch (IllegalArgumentException e) {
                        }
                    } else if (ifield.name.equals("schedule_time_b")) {
                        try {
                            scheduleTimeB = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDateTime() : new org.joda.time.DateTime(iprot.readI64());
                        } catch (IllegalArgumentException e) {
                        }
                    } else if (ifield.name.equals("test_emails")) {
                        testEmails = (new com.google.common.base.Function<org.apache.thrift.protocol.TProtocol, com.google.common.collect.ImmutableList<String>>() {
                            @Override
                            public com.google.common.collect.ImmutableList<String> apply(org.apache.thrift.protocol.TProtocol iprot) {
                                try {
                                    org.apache.thrift.protocol.TList sequenceBegin = iprot.readListBegin();
                                    java.util.List<String> sequence = new java.util.ArrayList<String>();
                                    for (int elementI = 0; elementI < sequenceBegin.size; elementI++) {
                                        sequence.add(iprot.readString());
                                    }
                                    iprot.readListEnd();
                                    return com.google.common.collect.ImmutableList.copyOf(sequence);
                                } catch (org.apache.thrift.TException e) {
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

        this.campaign = com.google.common.base.Preconditions.checkNotNull(campaign);
        this.content = com.google.common.base.Preconditions.checkNotNull(content);
        this.scheduleTime = scheduleTime;
        this.scheduleTimeB = scheduleTimeB;
        this.testEmails = testEmails;
    }

    public MailServiceHack(final com.yogento.api.models.mail.campaign.MailCampaign campaign, final com.yogento.api.models.mail.campaign.MailCampaignContent content) {
        this.campaign = com.google.common.base.Preconditions.checkNotNull(campaign);
        this.content = com.google.common.base.Preconditions.checkNotNull(content);
        this.scheduleTime = null;
        this.scheduleTimeB = null;
        this.testEmails = null;
    }

    public MailServiceHack(final com.yogento.api.models.mail.campaign.MailCampaign campaign, final com.yogento.api.models.mail.campaign.MailCampaignContent content, final org.joda.time.DateTime scheduleTime, final org.joda.time.DateTime scheduleTimeB, final com.google.common.collect.ImmutableList<String> testEmails) {
        this.campaign = com.google.common.base.Preconditions.checkNotNull(campaign);
        this.content = com.google.common.base.Preconditions.checkNotNull(content);
        this.scheduleTime = scheduleTime;
        this.scheduleTimeB = scheduleTimeB;
        this.testEmails = testEmails;
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException();
    }

    @Override
    public int compareTo(final MailServiceHack other) {
        throw new UnsupportedOperationException();
    }

    @Override
    public org.apache.thrift.TBase<MailServiceHack, org.apache.thrift.TFieldIdEnum> deepCopy() {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean equals(final Object otherObject) {
        if (otherObject == this) {
            return true;
        } else if (!(otherObject instanceof MailServiceHack)) {
            return false;
        }

        final MailServiceHack other = (MailServiceHack)otherObject;
        return
            getCampaign().equals(other.getCampaign()) &&
            getContent().equals(other.getContent()) &&
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
        } else if (fieldName.equals("content")) {
            return getContent();
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

    public final com.yogento.api.models.mail.campaign.MailCampaignContent getContent() {
        return content;
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
        hashCode = 31 * hashCode + getContent().hashCode();
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
    public void setFieldValue(final org.apache.thrift.TFieldIdEnum field, Object value) {
        throw new UnsupportedOperationException();
    }

    @Override
    public String toString() {
        final com.google.common.base.Objects.ToStringHelper helper = com.google.common.base.Objects.toStringHelper(this);
        helper.add("campaign", getCampaign());
        helper.add("content", getContent());
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
                oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.VOID, 5));

                getCampaign().write(oprot);

                getContent().write(oprot);

                if (getScheduleTime() != null) {
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDateTime(getScheduleTime()); } else { oprot.writeI64(getScheduleTime().getMillis()); }
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getScheduleTimeB() != null) {
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDateTime(getScheduleTimeB()); } else { oprot.writeI64(getScheduleTimeB().getMillis()); }
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getTestEmails() != null) {
                    oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, getTestEmails().size()));
                    for (String _iter0 : getTestEmails()) {
                        oprot.writeString(_iter0);
                    }
                    oprot.writeListEnd();
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                oprot.writeListEnd();
                break;

            case org.apache.thrift.protocol.TType.STRUCT:
            default:
                oprot.writeStructBegin(new org.apache.thrift.protocol.TStruct("MailServiceHack"));

                oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("campaign", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                getCampaign().write(oprot);
                oprot.writeFieldEnd();

                oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("content", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                getContent().write(oprot);
                oprot.writeFieldEnd();

                if (getScheduleTime() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("schedule_time", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDateTime(getScheduleTime()); } else { oprot.writeI64(getScheduleTime().getMillis()); }
                    oprot.writeFieldEnd();
                }

                if (getScheduleTimeB() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("schedule_time_b", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDateTime(getScheduleTimeB()); } else { oprot.writeI64(getScheduleTimeB().getMillis()); }
                    oprot.writeFieldEnd();
                }

                if (getTestEmails() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("test_emails", org.apache.thrift.protocol.TType.LIST, (short)-1));
                    oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, getTestEmails().size()));
                    for (String _iter0 : getTestEmails()) {
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
    private final com.yogento.api.models.mail.campaign.MailCampaignContent content;
    private final org.joda.time.DateTime scheduleTime;
    private final org.joda.time.DateTime scheduleTimeB;
    private final com.google.common.collect.ImmutableList<String> testEmails;
}
