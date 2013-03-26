package com.yogento.api.models.catalog.product.magento;

public enum MagentoProductImageType {
    IMAGE(0),
    SMALL_IMAGE(1),
    THUMBNAIL(2);

    private MagentoProductImageType(int value) {
        this.value = value;
    }

    public static MagentoProductImageType valueOf(final int value) {
        switch (value) {
        case 0: return IMAGE;
        case 1: return SMALL_IMAGE;
        case 2: return THUMBNAIL;
        default: throw new IllegalArgumentException();
        }
    }

    public static MagentoProductImageType valueOf(final Integer value) {
        return valueOf(value.intValue());
    }

    public final int value() {
        return value;
    }

    private final int value;
}
