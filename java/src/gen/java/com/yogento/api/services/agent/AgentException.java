package com.yogento.api.services.agent;

@SuppressWarnings({"serial"})
public class AgentException extends java.lang.Exception implements org.thryft.TBase<AgentException> {
    public static class Builder {
        public Builder() {
        }

        public Builder(final AgentException other) {
            this.causeMessage = other.getCauseMessage();
            this.url = other.getUrl();
        }

        protected AgentException _build(final String causeMessage, final String url) {
            return new AgentException(causeMessage, url);
        }

        public AgentException build() {
            return _build(causeMessage, url);
        }

        public Builder setCauseMessage(final String causeMessage) {
            this.causeMessage = causeMessage;
            return this;
        }

        public Builder setUrl(final String url) {
            this.url = url;
            return this;
        }

        private String causeMessage;
        private String url;
    }

    public AgentException(final AgentException other) {
        this(other.getCauseMessage(), other.getUrl());
    }

    public AgentException(final org.thryft.protocol.TProtocol iprot) throws java.io.IOException {
        this(iprot, org.thryft.protocol.TType.STRUCT);
    }

    public AgentException(final org.thryft.protocol.TProtocol iprot, final byte readAsTType) throws java.io.IOException {
        String causeMessage = null;
        String url = null;

        switch (readAsTType) {
            case org.thryft.protocol.TType.LIST:
                final org.thryft.protocol.TList __list = iprot.readListBegin();
                causeMessage = iprot.readString();
                if (__list.size > 1) {
                    url = iprot.readString();
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
                    } else if (ifield.name.equals("cause_message")) {
                        causeMessage = iprot.readString();
                    } else if (ifield.name.equals("url")) {
                        url = iprot.readString();
                    }
                    iprot.readFieldEnd();
                }
                iprot.readStructEnd();
                break;
        }

        this.causeMessage = com.google.common.base.Preconditions.checkNotNull(causeMessage, "com.yogento.api.services.agent.AgentException: missing causeMessage");
        this.url = url;
    }

    public AgentException(final String causeMessage) {
        this.causeMessage = com.google.common.base.Preconditions.checkNotNull(causeMessage, "com.yogento.api.services.agent.AgentException: missing causeMessage");
        this.url = null;
    }

    public AgentException(final String causeMessage, final String url) {
        this.causeMessage = com.google.common.base.Preconditions.checkNotNull(causeMessage, "com.yogento.api.services.agent.AgentException: missing causeMessage");
        this.url = url;
    }

    @Override
    public int compareTo(final AgentException other) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean equals(final Object otherObject) {
        if (otherObject == this) {
            return true;
        } else if (!(otherObject instanceof AgentException)) {
            return false;
        }

        final AgentException other = (AgentException)otherObject;
        return
            getCauseMessage().equals(other.getCauseMessage()) &&
            ((getUrl() == null && other.getUrl() == null) ||
            (getUrl() != null && other.getUrl() != null &&
            getUrl().equals(other.getUrl())));
    }

    public Object get(final String fieldName) {
        if (fieldName.equals("cause_message")) {
            return getCauseMessage();
        } else if (fieldName.equals("url")) {
            return getUrl();
        }
        return null;
    }

    public final String getCauseMessage() {
        return causeMessage;
    }

    @Override
    public String getMessage() {
        return toString();
    }

    public final String getUrl() {
        return url;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getCauseMessage().hashCode();
        if (getUrl() != null) {
            hashCode = 31 * hashCode + getUrl().hashCode();
        }
        return hashCode;
    }

    @Override
    public String toString() {
        final com.google.common.base.Objects.ToStringHelper helper = com.google.common.base.Objects.toStringHelper(this);
        helper.add("cause_message", getCauseMessage());
        if (getUrl() != null) {
            helper.add("url", getUrl());
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

                oprot.writeString(getCauseMessage());

                if (getUrl() != null) {
                    oprot.writeString(getUrl());
                } else {
                    ((org.thryft.protocol.TProtocol)oprot).writeNull();
                }

                oprot.writeListEnd();
                break;

            case org.thryft.protocol.TType.STRUCT:
            default:
                oprot.writeStructBegin(new org.thryft.protocol.TStruct("AgentException"));

                oprot.writeFieldBegin(new org.thryft.protocol.TField("cause_message", org.thryft.protocol.TType.STRING, (short)-1));
                oprot.writeString(getCauseMessage());
                oprot.writeFieldEnd();

                if (getUrl() != null) {
                    oprot.writeFieldBegin(new org.thryft.protocol.TField("url", org.thryft.protocol.TType.STRING, (short)-1));
                    oprot.writeString(getUrl());
                    oprot.writeFieldEnd();
                }

                oprot.writeFieldStop();

                oprot.writeStructEnd();
                break;
        }
    }

    private final String causeMessage;

    private final String url;
}
