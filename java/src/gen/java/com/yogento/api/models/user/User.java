package com.yogento.api.models.user;

@SuppressWarnings({"serial"})
public class User implements org.apache.thrift.TBase<User, org.apache.thrift.TFieldIdEnum> {
    public static class Builder {
        public Builder() {
        }

        public Builder(final User other) {
            this.ctime = other.getCtime();
            this.displayName = other.getDisplayName();
            this.email = other.getEmail();
            this.password = other.getPassword();
            this.roles = other.getRoles();
            this.username = other.getUsername();
        }

        protected User _build(final org.joda.time.DateTime ctime, final String displayName, final String email, final String password, final com.google.common.collect.ImmutableSet<String> roles, final String username) {
            return new User(ctime, displayName, email, password, roles, username);
        }

        public User build() {
            return _build(ctime, displayName, email, password, roles, username);
        }

        public Builder setCtime(final org.joda.time.DateTime ctime) {
            this.ctime = ctime;
            return this;
        }

        public Builder setDisplayName(final String displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setEmail(final String email) {
            this.email = email;
            return this;
        }

        public Builder setPassword(final String password) {
            this.password = password;
            return this;
        }

        public Builder setRoles(final com.google.common.collect.ImmutableSet<String> roles) {
            this.roles = roles;
            return this;
        }

        public Builder setUsername(final String username) {
            this.username = username;
            return this;
        }

        private org.joda.time.DateTime ctime;
        private String displayName;
        private String email;
        private String password;
        private com.google.common.collect.ImmutableSet<String> roles;
        private String username;
    }

    public User(final User other) {
        this(other.getCtime(), other.getDisplayName(), other.getEmail(), other.getPassword(), other.getRoles(), other.getUsername());
    }

    public User(final org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
        this(iprot, org.apache.thrift.protocol.TType.STRUCT);
    }

    public User(final org.apache.thrift.protocol.TProtocol iprot, final byte readAsTType) throws org.apache.thrift.TException {
        org.joda.time.DateTime ctime = null;
        String displayName = null;
        String email = null;
        String password = null;
        com.google.common.collect.ImmutableSet<String> roles = null;
        String username = null;

        switch (readAsTType) {
            case org.apache.thrift.protocol.TType.LIST:
                iprot.readListBegin();
                ctime = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDateTime() : new org.joda.time.DateTime(iprot.readI64());
                displayName = iprot.readString();
                email = iprot.readString();
                password = iprot.readString();
                roles = (new com.google.common.base.Function<org.apache.thrift.protocol.TProtocol, com.google.common.collect.ImmutableSet<String>>() {
                    @Override
                    public com.google.common.collect.ImmutableSet<String> apply(org.apache.thrift.protocol.TProtocol iprot) {
                        try {
                            org.apache.thrift.protocol.TSet sequenceBegin = iprot.readSetBegin();
                            java.util.Set<String> sequence = new java.util.LinkedHashSet<String>();
                            for (int elementI = 0; elementI < sequenceBegin.size; elementI++) {
                                sequence.add(iprot.readString());
                            }
                            iprot.readSetEnd();
                            return com.google.common.collect.ImmutableSet.copyOf(sequence);
                        } catch (org.apache.thrift.TException e) {
                            return com.google.common.collect.ImmutableSet.of();
                        }
                    }
                }).apply(iprot);
                username = iprot.readString();
                iprot.readListEnd();
                break;

            case org.apache.thrift.protocol.TType.STRUCT:
            default:
                iprot.readStructBegin();
                while (true) {
                    org.apache.thrift.protocol.TField ifield = iprot.readFieldBegin();
                    if (ifield.type == org.apache.thrift.protocol.TType.STOP) {
                        break;
                    } else                 if (ifield.name.equals("ctime")) {
                        ctime = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDateTime() : new org.joda.time.DateTime(iprot.readI64());
                    } else if (ifield.name.equals("display_name")) {
                        displayName = iprot.readString();
                    } else if (ifield.name.equals("email")) {
                        email = iprot.readString();
                    } else if (ifield.name.equals("password")) {
                        password = iprot.readString();
                    } else if (ifield.name.equals("roles")) {
                        roles = (new com.google.common.base.Function<org.apache.thrift.protocol.TProtocol, com.google.common.collect.ImmutableSet<String>>() {
                            @Override
                            public com.google.common.collect.ImmutableSet<String> apply(org.apache.thrift.protocol.TProtocol iprot) {
                                try {
                                    org.apache.thrift.protocol.TSet sequenceBegin = iprot.readSetBegin();
                                    java.util.Set<String> sequence = new java.util.LinkedHashSet<String>();
                                    for (int elementI = 0; elementI < sequenceBegin.size; elementI++) {
                                        sequence.add(iprot.readString());
                                    }
                                    iprot.readSetEnd();
                                    return com.google.common.collect.ImmutableSet.copyOf(sequence);
                                } catch (org.apache.thrift.TException e) {
                                    return com.google.common.collect.ImmutableSet.of();
                                }
                            }
                        }).apply(iprot);
                    } else if (ifield.name.equals("username")) {
                        username = iprot.readString();
                    }
                    iprot.readFieldEnd();
                }
                iprot.readStructEnd();
                break;
        }

        this.ctime = com.google.common.base.Preconditions.checkNotNull(ctime);
        this.displayName = displayName;
        this.email = email;
        this.password = com.google.common.base.Preconditions.checkNotNull(password);
        this.roles = com.google.common.base.Preconditions.checkNotNull(roles);
        this.username = com.google.common.base.Preconditions.checkNotNull(username);
    }

    public User(final org.joda.time.DateTime ctime, final String password, final com.google.common.collect.ImmutableSet<String> roles, final String username) {
        this.ctime = com.google.common.base.Preconditions.checkNotNull(ctime);
        this.displayName = null;
        this.email = null;
        this.password = com.google.common.base.Preconditions.checkNotNull(password);
        this.roles = com.google.common.base.Preconditions.checkNotNull(roles);
        this.username = com.google.common.base.Preconditions.checkNotNull(username);
    }

    public User(final org.joda.time.DateTime ctime, final String displayName, final String email, final String password, final com.google.common.collect.ImmutableSet<String> roles, final String username) {
        this.ctime = com.google.common.base.Preconditions.checkNotNull(ctime);
        this.displayName = displayName;
        this.email = email;
        this.password = com.google.common.base.Preconditions.checkNotNull(password);
        this.roles = com.google.common.base.Preconditions.checkNotNull(roles);
        this.username = com.google.common.base.Preconditions.checkNotNull(username);
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException();
    }

    @Override
    public int compareTo(final User other) {
        throw new UnsupportedOperationException();
    }

    @Override
    public org.apache.thrift.TBase<User, org.apache.thrift.TFieldIdEnum> deepCopy() {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean equals(final Object otherObject) {
        if (otherObject == this) {
            return true;
        } else if (!(otherObject instanceof User)) {
            return false;
        }

        final User other = (User)otherObject;
        return
            getCtime().equals(other.getCtime()) &&
            ((getDisplayName() == null && other.getDisplayName() == null) ||
            (getDisplayName() != null && other.getDisplayName() != null &&
            getDisplayName().equals(other.getDisplayName()))) &&
            ((getEmail() == null && other.getEmail() == null) ||
            (getEmail() != null && other.getEmail() != null &&
            getEmail().equals(other.getEmail()))) &&
            getPassword().equals(other.getPassword()) &&
            getRoles().equals(other.getRoles()) &&
            getUsername().equals(other.getUsername());
    }

    @Override
    public org.apache.thrift.TFieldIdEnum fieldForId(final int fieldId) {
        throw new UnsupportedOperationException();
    }

    public Object get(final String fieldName) {
        if (fieldName.equals("ctime")) {
            return getCtime();
        } else if (fieldName.equals("display_name")) {
            return getDisplayName();
        } else if (fieldName.equals("email")) {
            return getEmail();
        } else if (fieldName.equals("password")) {
            return getPassword();
        } else if (fieldName.equals("roles")) {
            return getRoles();
        } else if (fieldName.equals("username")) {
            return getUsername();
        }
        return null;
    }

    public final org.joda.time.DateTime getCtime() {
        return ctime;
    }

    public final String getDisplayName() {
        return displayName;
    }

    public final String getEmail() {
        return email;
    }

    @Override
    public Object getFieldValue(final org.apache.thrift.TFieldIdEnum field) {
        throw new UnsupportedOperationException();
    }

    public final String getPassword() {
        return password;
    }

    public final com.google.common.collect.ImmutableSet<String> getRoles() {
        return roles;
    }

    public final String getUsername() {
        return username;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + getCtime().hashCode();
        if (getDisplayName() != null) {
            hashCode = 31 * hashCode + getDisplayName().hashCode();
        }
        if (getEmail() != null) {
            hashCode = 31 * hashCode + getEmail().hashCode();
        }
        hashCode = 31 * hashCode + getPassword().hashCode();
        hashCode = 31 * hashCode + getRoles().hashCode();
        hashCode = 31 * hashCode + getUsername().hashCode();
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
        helper.add("ctime", getCtime());
        if (getDisplayName() != null) {
            helper.add("display_name", getDisplayName());
        }
        if (getEmail() != null) {
            helper.add("email", getEmail());
        }
        helper.add("password", getPassword());
        helper.add("roles", getRoles());
        helper.add("username", getUsername());
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
                oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.VOID, 6));

                if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDateTime(getCtime()); } else { oprot.writeI64(getCtime().getMillis()); }

                if (getDisplayName() != null) {
                    oprot.writeString(getDisplayName());
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getEmail() != null) {
                    oprot.writeString(getEmail());
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                oprot.writeString(getPassword());

                oprot.writeSetBegin(new org.apache.thrift.protocol.TSet(org.apache.thrift.protocol.TType.STRING, getRoles().size()));
                for (String _iter0 : getRoles()) {
                    oprot.writeString(_iter0);
                }
                oprot.writeSetEnd();

                oprot.writeString(getUsername());

                oprot.writeListEnd();
                break;

            case org.apache.thrift.protocol.TType.STRUCT:
            default:
                oprot.writeStructBegin(new org.apache.thrift.protocol.TStruct("User"));

                oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("ctime", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDateTime(getCtime()); } else { oprot.writeI64(getCtime().getMillis()); }
                oprot.writeFieldEnd();

                if (getDisplayName() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("display_name", org.apache.thrift.protocol.TType.STRING, (short)-1));
                    oprot.writeString(getDisplayName());
                    oprot.writeFieldEnd();
                }

                if (getEmail() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("email", org.apache.thrift.protocol.TType.STRING, (short)-1));
                    oprot.writeString(getEmail());
                    oprot.writeFieldEnd();
                }

                oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("password", org.apache.thrift.protocol.TType.STRING, (short)-1));
                oprot.writeString(getPassword());
                oprot.writeFieldEnd();

                oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("roles", org.apache.thrift.protocol.TType.SET, (short)-1));
                oprot.writeSetBegin(new org.apache.thrift.protocol.TSet(org.apache.thrift.protocol.TType.STRING, getRoles().size()));
                for (String _iter0 : getRoles()) {
                    oprot.writeString(_iter0);
                }
                oprot.writeSetEnd();
                oprot.writeFieldEnd();

                oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("username", org.apache.thrift.protocol.TType.STRING, (short)-1));
                oprot.writeString(getUsername());
                oprot.writeFieldEnd();

                oprot.writeFieldStop();

                oprot.writeStructEnd();
                break;
        }
    }

    private final org.joda.time.DateTime ctime;
    private final String displayName;
    private final String email;
    private final String password;
    private final com.google.common.collect.ImmutableSet<String> roles;
    private final String username;
}
