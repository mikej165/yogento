package com.yogento.api.models.catalog.product.magento;

public enum MagentoProductStatus {
    DISABLED(2),
    ENABLED(1);

    private MagentoProductStatus(int value) {
        this.value = value;
    }
    
    public static MagentoProductStatus valueOf(final int value) {
        switch (value) {
        case 2: return DISABLED;
        case 1: return ENABLED;
        default: throw new IllegalArgumentException();
        }
    }

    public static MagentoProductStatus valueOf(final Integer value) {
        return valueOf(value.intValue());
    }

    public final int value() {
        return value;
    }
        
    private final int value;
}
