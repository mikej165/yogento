package com.yogento.api.services.agent;

@SuppressWarnings({"serial"})
public class AgentException extends java.lang.Exception implements org.apache.thrift.TBase<AgentException, org.apache.thrift.TFieldIdEnum> {
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

    public AgentException(final org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
        this(iprot, org.apache.thrift.protocol.TType.STRUCT);
    }

    public AgentException(final org.apache.thrift.protocol.TProtocol iprot, final byte readAsTType) throws org.apache.thrift.TException {
        String causeMessage = null;
        String url = null;

        switch (readAsTType) {
            case org.apache.thrift.protocol.TType.LIST:
                final org.apache.thrift.protocol.TList __list = iprot.readListBegin();
                causeMessage = iprot.readString();
                if (__list.size > 1) {
                    url = iprot.readString();
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
    public void clear() {
        throw new UnsupportedOperationException();
    }

    @Override
    public int compareTo(final AgentException other) {
        throw new UnsupportedOperationException();
    }

    @Override
    public org.apache.thrift.TBase<AgentException, org.apache.thrift.TFieldIdEnum> deepCopy() {
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

    @Override
    public org.apache.thrift.TFieldIdEnum fieldForId(final int fieldId) {
        throw new UnsupportedOperationException();
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
    public Object getFieldValue(final org.apache.thrift.TFieldIdEnum field) {
        throw new UnsupportedOperationException();
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
        helper.add("cause_message", getCauseMessage());
        if (getUrl() != null) {
            helper.add("url", getUrl());
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

                oprot.writeString(getCauseMessage());

                if (getUrl() != null) {
                    oprot.writeString(getUrl());
                } else {
                    ((org.thryft.core.protocol.Protocol)oprot).writeNull();
                }

                oprot.writeListEnd();
                break;

            case org.apache.thrift.protocol.TType.STRUCT:
            default:
                oprot.writeStructBegin(new org.apache.thrift.protocol.TStruct("AgentException"));

                oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("cause_message", org.apache.thrift.protocol.TType.STRING, (short)-1));
                oprot.writeString(getCauseMessage());
                oprot.writeFieldEnd();

                if (getUrl() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("url", org.apache.thrift.protocol.TType.STRING, (short)-1));
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
