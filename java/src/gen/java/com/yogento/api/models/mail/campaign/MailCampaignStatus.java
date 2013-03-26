package com.yogento.api.models.mail.campaign;

public enum MailCampaignStatus {
    DRAFT(0),
    SAVED_MSP(1),
    SENT_MSP(2);

    private MailCampaignStatus(int value) {
        this.value = value;
    }

    public static MailCampaignStatus valueOf(final int value) {
        switch (value) {
        case 0: return DRAFT;
        case 1: return SAVED_MSP;
        case 2: return SENT_MSP;
        default: throw new IllegalArgumentException();
        }
    }

    public static MailCampaignStatus valueOf(final Integer value) {
        return valueOf(value.intValue());
    }

    public final int value() {
        return value;
    }

    private final int value;
}
