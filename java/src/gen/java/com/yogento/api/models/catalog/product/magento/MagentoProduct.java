package com.yogento.api.models.catalog.product.magento;

@SuppressWarnings({"serial"})
public class MagentoProduct implements org.thryft.TBase<MagentoProduct> {
    public static class Builder {
        public Builder() {
        }

        public Builder(final MagentoProduct other) {
            this.activationInformation = other.getActivationInformation();
            this.backorders = other.getBackorders();
            this.children = other.getChildren();
            this.cost = other.getCost();
            this.createdAt = other.getCreatedAt();
            this.description = other.getDescription();
            this.images = other.getImages();
            this.isInStock = other.isInStock();
            this.isQtyDecimal = other.isQtyDecimal();
            this.isRecurring = other.isRecurring();
            this.lowStockDate = other.getLowStockDate();
            this.maxSaleQty = other.getMaxSaleQty();
            this.metaDescription = other.getMetaDescription();
            this.metaKeyword = other.getMetaKeyword();
            this.metaTitle = other.getMetaTitle();
            this.minimalPrice = other.getMinimalPrice();
            this.minQty = other.getMinQty();
            this.minSaleQty = other.getMinSaleQty();
            this.model = other.getModel();
            this.name = other.getName();
            this.newsFromDate = other.getNewsFromDate();
            this.newsToDate = other.getNewsToDate();
            this.notifyStockQty = other.getNotifyStockQty();
            this.price = other.getPrice();
            this.qty = other.getQty();
            this.shippingPolicy = other.getShippingPolicy();
            this.shortDescription = other.getShortDescription();
            this.sku = other.getSku();
            this.specialFromDate = other.getSpecialFromDate();
            this.specialPrice = other.getSpecialPrice();
            this.specialToDate = other.getSpecialToDate();
            this.store = other.getStore();
            this.status = other.getStatus();
            this.tags = other.getTags();
            this.type = other.getType();
            this.updatedAt = other.getUpdatedAt();
            this.urlKey = other.getUrlKey();
            this.urlPath = other.getUrlPath();
            this.visibility = other.getVisibility();
            this.weight = other.getWeight();
        }

        protected MagentoProduct _build(final String activationInformation, final Integer backorders, final com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.magento.MagentoProduct> children, final java.math.BigDecimal cost, final org.joda.time.DateTime createdAt, final String description, final com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.magento.MagentoProductImage> images, final Boolean isInStock, final Boolean isQtyDecimal, final Boolean isRecurring, final org.joda.time.DateTime lowStockDate, final java.math.BigDecimal maxSaleQty, final String metaDescription, final String metaKeyword, final String metaTitle, final java.math.BigDecimal minimalPrice, final java.math.BigDecimal minQty, final java.math.BigDecimal minSaleQty, final String model, final String name, final org.joda.time.DateTime newsFromDate, final org.joda.time.DateTime newsToDate, final java.math.BigDecimal notifyStockQty, final java.math.BigDecimal price, final java.math.BigDecimal qty, final String shippingPolicy, final String shortDescription, final String sku, final org.joda.time.DateTime specialFromDate, final java.math.BigDecimal specialPrice, final org.joda.time.DateTime specialToDate, final String store, final com.yogento.api.models.catalog.product.magento.MagentoProductStatus status, final com.google.common.collect.ImmutableSet<String> tags, final String type, final org.joda.time.DateTime updatedAt, final String urlKey, final String urlPath, final com.google.common.collect.ImmutableSet<String> visibility, final java.math.BigDecimal weight) {
            return new MagentoProduct(activationInformation, backorders, children, cost, createdAt, description, images, isInStock, isQtyDecimal, isRecurring, lowStockDate, maxSaleQty, metaDescription, metaKeyword, metaTitle, minimalPrice, minQty, minSaleQty, model, name, newsFromDate, newsToDate, notifyStockQty, price, qty, shippingPolicy, shortDescription, sku, specialFromDate, specialPrice, specialToDate, store, status, tags, type, updatedAt, urlKey, urlPath, visibility, weight);
        }

        public MagentoProduct build() {
            return _build(activationInformation, backorders, children, cost, createdAt, description, images, isInStock, isQtyDecimal, isRecurring, lowStockDate, maxSaleQty, metaDescription, metaKeyword, metaTitle, minimalPrice, minQty, minSaleQty, model, name, newsFromDate, newsToDate, notifyStockQty, price, qty, shippingPolicy, shortDescription, sku, specialFromDate, specialPrice, specialToDate, store, status, tags, type, updatedAt, urlKey, urlPath, visibility, weight);
        }

        public Builder setActivationInformation(final String activationInformation) {
            this.activationInformation = activationInformation;
            return this;
        }

        public Builder setBackorders(final Integer backorders) {
            this.backorders = backorders;
            return this;
        }

        public Builder setChildren(final com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.magento.MagentoProduct> children) {
            this.children = children;
            return this;
        }

        public Builder setCost(final java.math.BigDecimal cost) {
            this.cost = cost;
            return this;
        }

        public Builder setCreatedAt(final org.joda.time.DateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Builder setDescription(final String description) {
            this.description = description;
            return this;
        }

        public Builder setImages(final com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.magento.MagentoProductImage> images) {
            this.images = images;
            return this;
        }

        public Builder setIsInStock(final Boolean isInStock) {
            this.isInStock = isInStock;
            return this;
        }

        public Builder setIsQtyDecimal(final Boolean isQtyDecimal) {
            this.isQtyDecimal = isQtyDecimal;
            return this;
        }

        public Builder setIsRecurring(final Boolean isRecurring) {
            this.isRecurring = isRecurring;
            return this;
        }

        public Builder setLowStockDate(final org.joda.time.DateTime lowStockDate) {
            this.lowStockDate = lowStockDate;
            return this;
        }

        public Builder setMaxSaleQty(final java.math.BigDecimal maxSaleQty) {
            this.maxSaleQty = maxSaleQty;
            return this;
        }

        public Builder setMetaDescription(final String metaDescription) {
            this.metaDescription = metaDescription;
            return this;
        }

        public Builder setMetaKeyword(final String metaKeyword) {
            this.metaKeyword = metaKeyword;
            return this;
        }

        public Builder setMetaTitle(final String metaTitle) {
            this.metaTitle = metaTitle;
            return this;
        }

        public Builder setMinQty(final java.math.BigDecimal minQty) {
            this.minQty = minQty;
            return this;
        }

        public Builder setMinSaleQty(final java.math.BigDecimal minSaleQty) {
            this.minSaleQty = minSaleQty;
            return this;
        }

        public Builder setMinimalPrice(final java.math.BigDecimal minimalPrice) {
            this.minimalPrice = minimalPrice;
            return this;
        }

        public Builder setModel(final String model) {
            this.model = model;
            return this;
        }

        public Builder setName(final String name) {
            this.name = name;
            return this;
        }

        public Builder setNewsFromDate(final org.joda.time.DateTime newsFromDate) {
            this.newsFromDate = newsFromDate;
            return this;
        }

        public Builder setNewsToDate(final org.joda.time.DateTime newsToDate) {
            this.newsToDate = newsToDate;
            return this;
        }

        public Builder setNotifyStockQty(final java.math.BigDecimal notifyStockQty) {
            this.notifyStockQty = notifyStockQty;
            return this;
        }

        public Builder setPrice(final java.math.BigDecimal price) {
            this.price = price;
            return this;
        }

        public Builder setQty(final java.math.BigDecimal qty) {
            this.qty = qty;
            return this;
        }

        public Builder setShippingPolicy(final String shippingPolicy) {
            this.shippingPolicy = shippingPolicy;
            return this;
        }

        public Builder setShortDescription(final String shortDescription) {
            this.shortDescription = shortDescription;
            return this;
        }

        public Builder setSku(final String sku) {
            this.sku = sku;
            return this;
        }

        public Builder setSpecialFromDate(final org.joda.time.DateTime specialFromDate) {
            this.specialFromDate = specialFromDate;
            return this;
        }

        public Builder setSpecialPrice(final java.math.BigDecimal specialPrice) {
            this.specialPrice = specialPrice;
            return this;
        }

        public Builder setSpecialToDate(final org.joda.time.DateTime specialToDate) {
            this.specialToDate = specialToDate;
            return this;
        }

        public Builder setStatus(final com.yogento.api.models.catalog.product.magento.MagentoProductStatus status) {
            this.status = status;
            return this;
        }

        public Builder setStore(final String store) {
            this.store = store;
            return this;
        }

        public Builder setTags(final com.google.common.collect.ImmutableSet<String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setType(final String type) {
            this.type = type;
            return this;
        }

        public Builder setUpdatedAt(final org.joda.time.DateTime updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        public Builder setUrlKey(final String urlKey) {
            this.urlKey = urlKey;
            return this;
        }

        public Builder setUrlPath(final String urlPath) {
            this.urlPath = urlPath;
            return this;
        }

        public Builder setVisibility(final com.google.common.collect.ImmutableSet<String> visibility) {
            this.visibility = visibility;
            return this;
        }

        public Builder setWeight(final java.math.BigDecimal weight) {
            this.weight = weight;
            return this;
        }

        private String activationInformation;
        private Integer backorders;
        private com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.magento.MagentoProduct> children;
        private java.math.BigDecimal cost;
        private org.joda.time.DateTime createdAt;
        private String description;
        private com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.magento.MagentoProductImage> images;
        private Boolean isInStock;
        private Boolean isQtyDecimal;
        private Boolean isRecurring;
        private org.joda.time.DateTime lowStockDate;
        private java.math.BigDecimal maxSaleQty;
        private String metaDescription;
        private String metaKeyword;
        private String metaTitle;
        private java.math.BigDecimal minimalPrice;
        private java.math.BigDecimal minQty;
        private java.math.BigDecimal minSaleQty;
        private String model;
        private String name;
        private org.joda.time.DateTime newsFromDate;
        private org.joda.time.DateTime newsToDate;
        private java.math.BigDecimal notifyStockQty;
        /**
         * Optional in 1.3
         */
        private java.math.BigDecimal price;
        private java.math.BigDecimal qty;
        private String shippingPolicy;
        private String shortDescription;
        private String sku;
        private org.joda.time.DateTime specialFromDate;
        private java.math.BigDecimal specialPrice;
        private org.joda.time.DateTime specialToDate;
        private String store;
        /**
         * Optional in 1.3
         */
        private com.yogento.api.models.catalog.product.magento.MagentoProductStatus status;
        private com.google.common.collect.ImmutableSet<String> tags;
        /**
         * Optional in 1.3
         */
        private String type;
        private org.joda.time.DateTime updatedAt;
        private String urlKey;
        /**
         * Optional in 1.3
         */
        private String urlPath;
        /**
         * Formerly an enum; the strings differ between Magento versions
         */
        private com.google.common.collect.ImmutableSet<String> visibility;
        private java.math.BigDecimal weight;
    }

    public MagentoProduct(final MagentoProduct other) {
        this(other.getActivationInformation(), other.getBackorders(), other.getChildren(), other.getCost(), other.getCreatedAt(), other.getDescription(), other.getImages(), other.isInStock(), other.isQtyDecimal(), other.isRecurring(), other.getLowStockDate(), other.getMaxSaleQty(), other.getMetaDescription(), other.getMetaKeyword(), other.getMetaTitle(), other.getMinimalPrice(), other.getMinQty(), other.getMinSaleQty(), other.getModel(), other.getName(), other.getNewsFromDate(), other.getNewsToDate(), other.getNotifyStockQty(), other.getPrice(), other.getQty(), other.getShippingPolicy(), other.getShortDescription(), other.getSku(), other.getSpecialFromDate(), other.getSpecialPrice(), other.getSpecialToDate(), other.getStore(), other.getStatus(), other.getTags(), other.getType(), other.getUpdatedAt(), other.getUrlKey(), other.getUrlPath(), other.getVisibility(), other.getWeight());
    }

    public MagentoProduct(final org.thryft.protocol.TProtocol iprot) throws java.io.IOException {
        this(iprot, org.thryft.protocol.TType.STRUCT);
    }

    public MagentoProduct(final org.thryft.protocol.TProtocol iprot, final byte readAsTType) throws java.io.IOException {
        String activationInformation = null;
        Integer backorders = null;
        com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.magento.MagentoProduct> children = null;
        java.math.BigDecimal cost = null;
        org.joda.time.DateTime createdAt = null;
        String description = null;
        com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.magento.MagentoProductImage> images = null;
        Boolean isInStock = null;
        Boolean isQtyDecimal = null;
        Boolean isRecurring = null;
        org.joda.time.DateTime lowStockDate = null;
        java.math.BigDecimal maxSaleQty = null;
        String metaDescription = null;
        String metaKeyword = null;
        String metaTitle = null;
        java.math.BigDecimal minimalPrice = null;
        java.math.BigDecimal minQty = null;
        java.math.BigDecimal minSaleQty = null;
        String model = null;
        String name = null;
        org.joda.time.DateTime newsFromDate = null;
        org.joda.time.DateTime newsToDate = null;
        java.math.BigDecimal notifyStockQty = null;
        java.math.BigDecimal price = null;
        java.math.BigDecimal qty = null;
        String shippingPolicy = null;
        String shortDescription = null;
        String sku = null;
        org.joda.time.DateTime specialFromDate = null;
        java.math.BigDecimal specialPrice = null;
        org.joda.time.DateTime specialToDate = null;
        String store = null;
        com.yogento.api.models.catalog.product.magento.MagentoProductStatus status = null;
        com.google.common.collect.ImmutableSet<String> tags = null;
        String type = null;
        org.joda.time.DateTime updatedAt = null;
        String urlKey = null;
        String urlPath = null;
        com.google.common.collect.ImmutableSet<String> visibility = null;
        java.math.BigDecimal weight = null;

        switch (readAsTType) {
            case org.thryft.protocol.TType.LIST:
                final org.thryft.protocol.TList __list = iprot.readListBegin();
                activationInformation = iprot.readString();
                try {
                    backorders = iprot.readI32();
                } catch (NumberFormatException e) {
                }
                children = (new com.google.common.base.Function<org.thryft.protocol.TProtocol, com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.magento.MagentoProduct>>() {
                    @Override
                    public com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.magento.MagentoProduct> apply(final org.thryft.protocol.TProtocol iprot) {
                        try {
                            final org.thryft.protocol.TSet sequenceBegin = iprot.readSetBegin();
                            final java.util.Set<com.yogento.api.models.catalog.product.magento.MagentoProduct> sequence = new java.util.LinkedHashSet<com.yogento.api.models.catalog.product.magento.MagentoProduct>();
                            for (int elementI = 0; elementI < sequenceBegin.size; elementI++) {
                                sequence.add(new com.yogento.api.models.catalog.product.magento.MagentoProduct(iprot));
                            }
                            iprot.readSetEnd();
                            return com.google.common.collect.ImmutableSet.copyOf(sequence);
                        } catch (final java.io.IOException e) {
                            return com.google.common.collect.ImmutableSet.of();
                        }
                    }
                }).apply(iprot);
                try {
                    cost = iprot.readDecimal();
                } catch (NumberFormatException e) {
                }
                try {
                    createdAt = iprot.readDateTime();
                } catch (IllegalArgumentException e) {
                }
                description = iprot.readString();
                images = (new com.google.common.base.Function<org.thryft.protocol.TProtocol, com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.magento.MagentoProductImage>>() {
                    @Override
                    public com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.magento.MagentoProductImage> apply(final org.thryft.protocol.TProtocol iprot) {
                        try {
                            final org.thryft.protocol.TSet sequenceBegin = iprot.readSetBegin();
                            final java.util.Set<com.yogento.api.models.catalog.product.magento.MagentoProductImage> sequence = new java.util.LinkedHashSet<com.yogento.api.models.catalog.product.magento.MagentoProductImage>();
                            for (int elementI = 0; elementI < sequenceBegin.size; elementI++) {
                                sequence.add(new com.yogento.api.models.catalog.product.magento.MagentoProductImage(iprot));
                            }
                            iprot.readSetEnd();
                            return com.google.common.collect.ImmutableSet.copyOf(sequence);
                        } catch (final java.io.IOException e) {
                            return com.google.common.collect.ImmutableSet.of();
                        }
                    }
                }).apply(iprot);
                isInStock = iprot.readBool();
                isQtyDecimal = iprot.readBool();
                isRecurring = iprot.readBool();
                try {
                    lowStockDate = iprot.readDateTime();
                } catch (IllegalArgumentException e) {
                }
                try {
                    maxSaleQty = iprot.readDecimal();
                } catch (NumberFormatException e) {
                }
                metaDescription = iprot.readString();
                metaKeyword = iprot.readString();
                metaTitle = iprot.readString();
                try {
                    minimalPrice = iprot.readDecimal();
                } catch (NumberFormatException e) {
                }
                try {
                    minQty = iprot.readDecimal();
                } catch (NumberFormatException e) {
                }
                try {
                    minSaleQty = iprot.readDecimal();
                } catch (NumberFormatException e) {
                }
                model = iprot.readString();
                name = iprot.readString();
                try {
                    newsFromDate = iprot.readDateTime();
                } catch (IllegalArgumentException e) {
                }
                try {
                    newsToDate = iprot.readDateTime();
                } catch (IllegalArgumentException e) {
                }
                try {
                    notifyStockQty = iprot.readDecimal();
                } catch (NumberFormatException e) {
                }
                try {
                    price = iprot.readDecimal();
                } catch (NumberFormatException e) {
                }
                try {
                    qty = iprot.readDecimal();
                } catch (NumberFormatException e) {
                }
                shippingPolicy = iprot.readString();
                shortDescription = iprot.readString();
                sku = iprot.readString();
                try {
                    specialFromDate = iprot.readDateTime();
                } catch (IllegalArgumentException e) {
                }
                try {
                    specialPrice = iprot.readDecimal();
                } catch (NumberFormatException e) {
                }
                try {
                    specialToDate = iprot.readDateTime();
                } catch (IllegalArgumentException e) {
                }
                store = iprot.readString();
                try {
                    status = iprot.readEnum(com.yogento.api.models.catalog.product.magento.MagentoProductStatus.class);
                } catch (IllegalArgumentException e) {
                }
                tags = (new com.google.common.base.Function<org.thryft.protocol.TProtocol, com.google.common.collect.ImmutableSet<String>>() {
                    @Override
                    public com.google.common.collect.ImmutableSet<String> apply(final org.thryft.protocol.TProtocol iprot) {
                        try {
                            final org.thryft.protocol.TSet sequenceBegin = iprot.readSetBegin();
                            final java.util.Set<String> sequence = new java.util.LinkedHashSet<String>();
                            for (int elementI = 0; elementI < sequenceBegin.size; elementI++) {
                                sequence.add(iprot.readString());
                            }
                            iprot.readSetEnd();
                            return com.google.common.collect.ImmutableSet.copyOf(sequence);
                        } catch (final java.io.IOException e) {
                            return com.google.common.collect.ImmutableSet.of();
                        }
                    }
                }).apply(iprot);
                type = iprot.readString();
                try {
                    updatedAt = iprot.readDateTime();
                } catch (IllegalArgumentException e) {
                }
                urlKey = iprot.readString();
                urlPath = iprot.readString();
                visibility = (new com.google.common.base.Function<org.thryft.protocol.TProtocol, com.google.common.collect.ImmutableSet<String>>() {
                    @Override
                    public com.google.common.collect.ImmutableSet<String> apply(final org.thryft.protocol.TProtocol iprot) {
                        try {
                            final org.thryft.protocol.TSet sequenceBegin = iprot.readSetBegin();
                            final java.util.Set<String> sequence = new java.util.LinkedHashSet<String>();
                            for (int elementI = 0; elementI < sequenceBegin.size; elementI++) {
                                sequence.add(iprot.readString());
                            }
                            iprot.readSetEnd();
                            return com.google.common.collect.ImmutableSet.copyOf(sequence);
                        } catch (final java.io.IOException e) {
                            return com.google.common.collect.ImmutableSet.of();
                        }
                    }
                }).apply(iprot);
                if (__list.size > 39) {
                    try {
                        weight = iprot.readDecimal();
                    } catch (NumberFormatException e) {
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
                    } else if (ifield.name.equals("activation_information")) {
                        activationInformation = iprot.readString();
                    } else if (ifield.name.equals("backorders")) {
                        try {
                            backorders = iprot.readI32();
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("children")) {
                        children = (new com.google.common.base.Function<org.thryft.protocol.TProtocol, com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.magento.MagentoProduct>>() {
                            @Override
                            public com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.magento.MagentoProduct> apply(final org.thryft.protocol.TProtocol iprot) {
                                try {
                                    final org.thryft.protocol.TSet sequenceBegin = iprot.readSetBegin();
                                    final java.util.Set<com.yogento.api.models.catalog.product.magento.MagentoProduct> sequence = new java.util.LinkedHashSet<com.yogento.api.models.catalog.product.magento.MagentoProduct>();
                                    for (int elementI = 0; elementI < sequenceBegin.size; elementI++) {
                                        sequence.add(new com.yogento.api.models.catalog.product.magento.MagentoProduct(iprot));
                                    }
                                    iprot.readSetEnd();
                                    return com.google.common.collect.ImmutableSet.copyOf(sequence);
                                } catch (final java.io.IOException e) {
                                    return com.google.common.collect.ImmutableSet.of();
                                }
                            }
                        }).apply(iprot);
                    } else if (ifield.name.equals("cost")) {
                        try {
                            cost = iprot.readDecimal();
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("created_at")) {
                        try {
                            createdAt = iprot.readDateTime();
                        } catch (IllegalArgumentException e) {
                        }
                    } else if (ifield.name.equals("description")) {
                        description = iprot.readString();
                    } else if (ifield.name.equals("images")) {
                        images = (new com.google.common.base.Function<org.thryft.protocol.TProtocol, com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.magento.MagentoProductImage>>() {
                            @Override
                            public com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.magento.MagentoProductImage> apply(final org.thryft.protocol.TProtocol iprot) {
                                try {
                                    final org.thryft.protocol.TSet sequenceBegin = iprot.readSetBegin();
                                    final java.util.Set<com.yogento.api.models.catalog.product.magento.MagentoProductImage> sequence = new java.util.LinkedHashSet<com.yogento.api.models.catalog.product.magento.MagentoProductImage>();
                                    for (int elementI = 0; elementI < sequenceBegin.size; elementI++) {
                                        sequence.add(new com.yogento.api.models.catalog.product.magento.MagentoProductImage(iprot));
                                    }
                                    iprot.readSetEnd();
                                    return com.google.common.collect.ImmutableSet.copyOf(sequence);
                                } catch (final java.io.IOException e) {
                                    return com.google.common.collect.ImmutableSet.of();
                                }
                            }
                        }).apply(iprot);
                    } else if (ifield.name.equals("is_in_stock")) {
                        isInStock = iprot.readBool();
                    } else if (ifield.name.equals("is_qty_decimal")) {
                        isQtyDecimal = iprot.readBool();
                    } else if (ifield.name.equals("is_recurring")) {
                        isRecurring = iprot.readBool();
                    } else if (ifield.name.equals("low_stock_date")) {
                        try {
                            lowStockDate = iprot.readDateTime();
                        } catch (IllegalArgumentException e) {
                        }
                    } else if (ifield.name.equals("max_sale_qty")) {
                        try {
                            maxSaleQty = iprot.readDecimal();
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("meta_description")) {
                        metaDescription = iprot.readString();
                    } else if (ifield.name.equals("meta_keyword")) {
                        metaKeyword = iprot.readString();
                    } else if (ifield.name.equals("meta_title")) {
                        metaTitle = iprot.readString();
                    } else if (ifield.name.equals("minimal_price")) {
                        try {
                            minimalPrice = iprot.readDecimal();
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("min_qty")) {
                        try {
                            minQty = iprot.readDecimal();
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("min_sale_qty")) {
                        try {
                            minSaleQty = iprot.readDecimal();
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("model")) {
                        model = iprot.readString();
                    } else if (ifield.name.equals("name")) {
                        name = iprot.readString();
                    } else if (ifield.name.equals("news_from_date")) {
                        try {
                            newsFromDate = iprot.readDateTime();
                        } catch (IllegalArgumentException e) {
                        }
                    } else if (ifield.name.equals("news_to_date")) {
                        try {
                            newsToDate = iprot.readDateTime();
                        } catch (IllegalArgumentException e) {
                        }
                    } else if (ifield.name.equals("notify_stock_qty")) {
                        try {
                            notifyStockQty = iprot.readDecimal();
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("price")) {
                        try {
                            price = iprot.readDecimal();
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("qty")) {
                        try {
                            qty = iprot.readDecimal();
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("shipping_policy")) {
                        shippingPolicy = iprot.readString();
                    } else if (ifield.name.equals("short_description")) {
                        shortDescription = iprot.readString();
                    } else if (ifield.name.equals("sku")) {
                        sku = iprot.readString();
                    } else if (ifield.name.equals("special_from_date")) {
                        try {
                            specialFromDate = iprot.readDateTime();
                        } catch (IllegalArgumentException e) {
                        }
                    } else if (ifield.name.equals("special_price")) {
                        try {
                            specialPrice = iprot.readDecimal();
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("special_to_date")) {
                        try {
                            specialToDate = iprot.readDateTime();
                        } catch (IllegalArgumentException e) {
                        }
                    } else if (ifield.name.equals("store")) {
                        store = iprot.readString();
                    } else if (ifield.name.equals("status")) {
                        try {
                            status = iprot.readEnum(com.yogento.api.models.catalog.product.magento.MagentoProductStatus.class);
                        } catch (IllegalArgumentException e) {
                        }
                    } else if (ifield.name.equals("tags")) {
                        tags = (new com.google.common.base.Function<org.thryft.protocol.TProtocol, com.google.common.collect.ImmutableSet<String>>() {
                            @Override
                            public com.google.common.collect.ImmutableSet<String> apply(final org.thryft.protocol.TProtocol iprot) {
                                try {
                                    final org.thryft.protocol.TSet sequenceBegin = iprot.readSetBegin();
                                    final java.util.Set<String> sequence = new java.util.LinkedHashSet<String>();
                                    for (int elementI = 0; elementI < sequenceBegin.size; elementI++) {
                                        sequence.add(iprot.readString());
                                    }
                                    iprot.readSetEnd();
                                    return com.google.common.collect.ImmutableSet.copyOf(sequence);
                                } catch (final java.io.IOException e) {
                                    return com.google.common.collect.ImmutableSet.of();
                                }
                            }
                        }).apply(iprot);
                    } else if (ifield.name.equals("type")) {
                        type = iprot.readString();
                    } else if (ifield.name.equals("updated_at")) {
                        try {
                            updatedAt = iprot.readDateTime();
                        } catch (IllegalArgumentException e) {
                        }
                    } else if (ifield.name.equals("url_key")) {
                        urlKey = iprot.readString();
                    } else if (ifield.name.equals("url_path")) {
                        urlPath = iprot.readString();
                    } else if (ifield.name.equals("visibility")) {
                        visibility = (new com.google.common.base.Function<org.thryft.protocol.TProtocol, com.google.common.collect.ImmutableSet<String>>() {
                            @Override
                            public com.google.common.collect.ImmutableSet<String> apply(final org.thryft.protocol.TProtocol iprot) {
                                try {
                                    final org.thryft.protocol.TSet sequenceBegin = iprot.readSetBegin();
                                    final java.util.Set<String> sequence = new java.util.LinkedHashSet<String>();
                                    for (int elementI = 0; elementI < sequenceBegin.size; elementI++) {
                                        sequence.add(iprot.readString());
                                    }
                                    iprot.readSetEnd();
                                    return com.google.common.collect.ImmutableSet.copyOf(sequence);
                                } catch (final java.io.IOException e) {
                                    return com.google.common.collect.ImmutableSet.of();
                                }
                            }
                        }).apply(iprot);
                    } else if (ifield.name.equals("weight")) {
                        try {
                            weight = iprot.readDecimal();
                        } catch (NumberFormatException e) {
                        }
                    }
                    iprot.readFieldEnd();
                }
                iprot.readStructEnd();
                break;
        }

        this.activationInformation = activationInformation;
        this.backorders = backorders;
        this.children = children;
        this.cost = cost;
        this.createdAt = createdAt;
        this.description = description;
        this.images = images;
        this.isInStock = isInStock;
        this.isQtyDecimal = isQtyDecimal;
        this.isRecurring = isRecurring;
        this.lowStockDate = lowStockDate;
        this.maxSaleQty = maxSaleQty;
        this.metaDescription = metaDescription;
        this.metaKeyword = metaKeyword;
        this.metaTitle = metaTitle;
        this.minimalPrice = minimalPrice;
        this.minQty = minQty;
        this.minSaleQty = minSaleQty;
        this.model = model;
        this.name = com.google.common.base.Preconditions.checkNotNull(name, "com.yogento.api.models.catalog.product.magento.MagentoProduct: missing name");
        this.newsFromDate = newsFromDate;
        this.newsToDate = newsToDate;
        this.notifyStockQty = notifyStockQty;
        this.price = price;
        this.qty = qty;
        this.shippingPolicy = shippingPolicy;
        this.shortDescription = com.google.common.base.Preconditions.checkNotNull(shortDescription, "com.yogento.api.models.catalog.product.magento.MagentoProduct: missing shortDescription");
        this.sku = com.google.common.base.Preconditions.checkNotNull(sku, "com.yogento.api.models.catalog.product.magento.MagentoProduct: missing sku");
        this.specialFromDate = specialFromDate;
        this.specialPrice = specialPrice;
        this.specialToDate = specialToDate;
        this.store = com.google.common.base.Preconditions.checkNotNull(store, "com.yogento.api.models.catalog.product.magento.MagentoProduct: missing store");
        this.status = status;
        this.tags = tags;
        this.type = type;
        this.updatedAt = updatedAt;
        this.urlKey = com.google.common.base.Preconditions.checkNotNull(urlKey, "com.yogento.api.models.catalog.product.magento.MagentoProduct: missing urlKey");
        this.urlPath = urlPath;
        this.visibility = com.google.common.base.Preconditions.checkNotNull(visibility, "com.yogento.api.models.catalog.product.magento.MagentoProduct: missing visibility");
        this.weight = weight;
    }

    public MagentoProduct(final String name, final String shortDescription, final String sku, final String store, final String urlKey, final com.google.common.collect.ImmutableSet<String> visibility) {
        this.activationInformation = null;
        this.backorders = null;
        this.children = null;
        this.cost = null;
        this.createdAt = null;
        this.description = null;
        this.images = null;
        this.isInStock = null;
        this.isQtyDecimal = null;
        this.isRecurring = null;
        this.lowStockDate = null;
        this.maxSaleQty = null;
        this.metaDescription = null;
        this.metaKeyword = null;
        this.metaTitle = null;
        this.minimalPrice = null;
        this.minQty = null;
        this.minSaleQty = null;
        this.model = null;
        this.name = com.google.common.base.Preconditions.checkNotNull(name, "com.yogento.api.models.catalog.product.magento.MagentoProduct: missing name");
        this.newsFromDate = null;
        this.newsToDate = null;
        this.notifyStockQty = null;
        this.price = null;
        this.qty = null;
        this.shippingPolicy = null;
        this.shortDescription = com.google.common.base.Preconditions.checkNotNull(shortDescription, "com.yogento.api.models.catalog.product.magento.MagentoProduct: missing shortDescription");
        this.sku = com.google.common.base.Preconditions.checkNotNull(sku, "com.yogento.api.models.catalog.product.magento.MagentoProduct: missing sku");
        this.specialFromDate = null;
        this.specialPrice = null;
        this.specialToDate = null;
        this.store = com.google.common.base.Preconditions.checkNotNull(store, "com.yogento.api.models.catalog.product.magento.MagentoProduct: missing store");
        this.status = null;
        this.tags = null;
        this.type = null;
        this.updatedAt = null;
        this.urlKey = com.google.common.base.Preconditions.checkNotNull(urlKey, "com.yogento.api.models.catalog.product.magento.MagentoProduct: missing urlKey");
        this.urlPath = null;
        this.visibility = com.google.common.base.Preconditions.checkNotNull(visibility, "com.yogento.api.models.catalog.product.magento.MagentoProduct: missing visibility");
        this.weight = null;
    }

    public MagentoProduct(final String activationInformation, final Integer backorders, final com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.magento.MagentoProduct> children, final java.math.BigDecimal cost, final org.joda.time.DateTime createdAt, final String description, final com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.magento.MagentoProductImage> images, final Boolean isInStock, final Boolean isQtyDecimal, final Boolean isRecurring, final org.joda.time.DateTime lowStockDate, final java.math.BigDecimal maxSaleQty, final String metaDescription, final String metaKeyword, final String metaTitle, final java.math.BigDecimal minimalPrice, final java.math.BigDecimal minQty, final java.math.BigDecimal minSaleQty, final String model, final String name, final org.joda.time.DateTime newsFromDate, final org.joda.time.DateTime newsToDate, final java.math.BigDecimal notifyStockQty, final java.math.BigDecimal price, final java.math.BigDecimal qty, final String shippingPolicy, final String shortDescription, final String sku, final org.joda.time.DateTime specialFromDate, final java.math.BigDecimal specialPrice, final org.joda.time.DateTime specialToDate, final String store, final com.yogento.api.models.catalog.product.magento.MagentoProductStatus status, final com.google.common.collect.ImmutableSet<String> tags, final String type, final org.joda.time.DateTime updatedAt, final String urlKey, final String urlPath, final com.google.common.collect.ImmutableSet<String> visibility, final java.math.BigDecimal weight) {
        this.activationInformation = activationInformation;
        this.backorders = backorders;
        this.children = children;
        this.cost = cost;
        this.createdAt = createdAt;
        this.description = description;
        this.images = images;
        this.isInStock = isInStock;
        this.isQtyDecimal = isQtyDecimal;
        this.isRecurring = isRecurring;
        this.lowStockDate = lowStockDate;
        this.maxSaleQty = maxSaleQty;
        this.metaDescription = metaDescription;
        this.metaKeyword = metaKeyword;
        this.metaTitle = metaTitle;
        this.minimalPrice = minimalPrice;
        this.minQty = minQty;
        this.minSaleQty = minSaleQty;
        this.model = model;
        this.name = com.google.common.base.Preconditions.checkNotNull(name, "com.yogento.api.models.catalog.product.magento.MagentoProduct: missing name");
        this.newsFromDate = newsFromDate;
        this.newsToDate = newsToDate;
        this.notifyStockQty = notifyStockQty;
        this.price = price;
        this.qty = qty;
        this.shippingPolicy = shippingPolicy;
        this.shortDescription = com.google.common.base.Preconditions.checkNotNull(shortDescription, "com.yogento.api.models.catalog.product.magento.MagentoProduct: missing shortDescription");
        this.sku = com.google.common.base.Preconditions.checkNotNull(sku, "com.yogento.api.models.catalog.product.magento.MagentoProduct: missing sku");
        this.specialFromDate = specialFromDate;
        this.specialPrice = specialPrice;
        this.specialToDate = specialToDate;
        this.store = com.google.common.base.Preconditions.checkNotNull(store, "com.yogento.api.models.catalog.product.magento.MagentoProduct: missing store");
        this.status = status;
        this.tags = tags;
        this.type = type;
        this.updatedAt = updatedAt;
        this.urlKey = com.google.common.base.Preconditions.checkNotNull(urlKey, "com.yogento.api.models.catalog.product.magento.MagentoProduct: missing urlKey");
        this.urlPath = urlPath;
        this.visibility = com.google.common.base.Preconditions.checkNotNull(visibility, "com.yogento.api.models.catalog.product.magento.MagentoProduct: missing visibility");
        this.weight = weight;
    }

    @Override
    public int compareTo(final MagentoProduct other) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean equals(final Object otherObject) {
        if (otherObject == this) {
            return true;
        } else if (!(otherObject instanceof MagentoProduct)) {
            return false;
        }

        final MagentoProduct other = (MagentoProduct)otherObject;
        return
            ((getActivationInformation() == null && other.getActivationInformation() == null) ||
            (getActivationInformation() != null && other.getActivationInformation() != null &&
            getActivationInformation().equals(other.getActivationInformation()))) &&
            ((getBackorders() == null && other.getBackorders() == null) ||
            (getBackorders() != null && other.getBackorders() != null &&
            getBackorders().equals(other.getBackorders()))) &&
            ((getChildren() == null && other.getChildren() == null) ||
            (getChildren() != null && other.getChildren() != null &&
            getChildren().equals(other.getChildren()))) &&
            ((getCost() == null && other.getCost() == null) ||
            (getCost() != null && other.getCost() != null &&
            getCost().equals(other.getCost()))) &&
            ((getCreatedAt() == null && other.getCreatedAt() == null) ||
            (getCreatedAt() != null && other.getCreatedAt() != null &&
            getCreatedAt().equals(other.getCreatedAt()))) &&
            ((getDescription() == null && other.getDescription() == null) ||
            (getDescription() != null && other.getDescription() != null &&
            getDescription().equals(other.getDescription()))) &&
            ((getImages() == null && other.getImages() == null) ||
            (getImages() != null && other.getImages() != null &&
            getImages().equals(other.getImages()))) &&
            ((isInStock() == null && other.isInStock() == null) ||
            (isInStock() != null && other.isInStock() != null &&
            isInStock().equals(other.isInStock()))) &&
            ((isQtyDecimal() == null && other.isQtyDecimal() == null) ||
            (isQtyDecimal() != null && other.isQtyDecimal() != null &&
            isQtyDecimal().equals(other.isQtyDecimal()))) &&
            ((isRecurring() == null && other.isRecurring() == null) ||
            (isRecurring() != null && other.isRecurring() != null &&
            isRecurring().equals(other.isRecurring()))) &&
            ((getLowStockDate() == null && other.getLowStockDate() == null) ||
            (getLowStockDate() != null && other.getLowStockDate() != null &&
            getLowStockDate().equals(other.getLowStockDate()))) &&
            ((getMaxSaleQty() == null && other.getMaxSaleQty() == null) ||
            (getMaxSaleQty() != null && other.getMaxSaleQty() != null &&
            getMaxSaleQty().equals(other.getMaxSaleQty()))) &&
            ((getMetaDescription() == null && other.getMetaDescription() == null) ||
            (getMetaDescription() != null && other.getMetaDescription() != null &&
            getMetaDescription().equals(other.getMetaDescription()))) &&
            ((getMetaKeyword() == null && other.getMetaKeyword() == null) ||
            (getMetaKeyword() != null && other.getMetaKeyword() != null &&
            getMetaKeyword().equals(other.getMetaKeyword()))) &&
            ((getMetaTitle() == null && other.getMetaTitle() == null) ||
            (getMetaTitle() != null && other.getMetaTitle() != null &&
            getMetaTitle().equals(other.getMetaTitle()))) &&
            ((getMinimalPrice() == null && other.getMinimalPrice() == null) ||
            (getMinimalPrice() != null && other.getMinimalPrice() != null &&
            getMinimalPrice().equals(other.getMinimalPrice()))) &&
            ((getMinQty() == null && other.getMinQty() == null) ||
            (getMinQty() != null && other.getMinQty() != null &&
            getMinQty().equals(other.getMinQty()))) &&
            ((getMinSaleQty() == null && other.getMinSaleQty() == null) ||
            (getMinSaleQty() != null && other.getMinSaleQty() != null &&
            getMinSaleQty().equals(other.getMinSaleQty()))) &&
            ((getModel() == null && other.getModel() == null) ||
            (getModel() != null && other.getModel() != null &&
            getModel().equals(other.getModel()))) &&
            getName().equals(other.getName()) &&
            ((getNewsFromDate() == null && other.getNewsFromDate() == null) ||
            (getNewsFromDate() != null && other.getNewsFromDate() != null &&
            getNewsFromDate().equals(other.getNewsFromDate()))) &&
            ((getNewsToDate() == null && other.getNewsToDate() == null) ||
            (getNewsToDate() != null && other.getNewsToDate() != null &&
            getNewsToDate().equals(other.getNewsToDate()))) &&
            ((getNotifyStockQty() == null && other.getNotifyStockQty() == null) ||
            (getNotifyStockQty() != null && other.getNotifyStockQty() != null &&
            getNotifyStockQty().equals(other.getNotifyStockQty()))) &&
            ((getPrice() == null && other.getPrice() == null) ||
            (getPrice() != null && other.getPrice() != null &&
            getPrice().equals(other.getPrice()))) &&
            ((getQty() == null && other.getQty() == null) ||
            (getQty() != null && other.getQty() != null &&
            getQty().equals(other.getQty()))) &&
            ((getShippingPolicy() == null && other.getShippingPolicy() == null) ||
            (getShippingPolicy() != null && other.getShippingPolicy() != null &&
            getShippingPolicy().equals(other.getShippingPolicy()))) &&
            getShortDescription().equals(other.getShortDescription()) &&
            getSku().equals(other.getSku()) &&
            ((getSpecialFromDate() == null && other.getSpecialFromDate() == null) ||
            (getSpecialFromDate() != null && other.getSpecialFromDate() != null &&
            getSpecialFromDate().equals(other.getSpecialFromDate()))) &&
            ((getSpecialPrice() == null && other.getSpecialPrice() == null) ||
            (getSpecialPrice() != null && other.getSpecialPrice() != null &&
            getSpecialPrice().equals(other.getSpecialPrice()))) &&
            ((getSpecialToDate() == null && other.getSpecialToDate() == null) ||
            (getSpecialToDate() != null && other.getSpecialToDate() != null &&
            getSpecialToDate().equals(other.getSpecialToDate()))) &&
            getStore().equals(other.getStore()) &&
            ((getStatus() == null && other.getStatus() == null) ||
            (getStatus() != null && other.getStatus() != null &&
            getStatus().equals(other.getStatus()))) &&
            ((getTags() == null && other.getTags() == null) ||
            (getTags() != null && other.getTags() != null &&
            getTags().equals(other.getTags()))) &&
            ((getType() == null && other.getType() == null) ||
            (getType() != null && other.getType() != null &&
            getType().equals(other.getType()))) &&
            ((getUpdatedAt() == null && other.getUpdatedAt() == null) ||
            (getUpdatedAt() != null && other.getUpdatedAt() != null &&
            getUpdatedAt().equals(other.getUpdatedAt()))) &&
            getUrlKey().equals(other.getUrlKey()) &&
            ((getUrlPath() == null && other.getUrlPath() == null) ||
            (getUrlPath() != null && other.getUrlPath() != null &&
            getUrlPath().equals(other.getUrlPath()))) &&
            getVisibility().equals(other.getVisibility()) &&
            ((getWeight() == null && other.getWeight() == null) ||
            (getWeight() != null && other.getWeight() != null &&
            getWeight().equals(other.getWeight())));
    }

    public Object get(final String fieldName) {
        if (fieldName.equals("activation_information")) {
            return getActivationInformation();
        } else if (fieldName.equals("backorders")) {
            return getBackorders();
        } else if (fieldName.equals("children")) {
            return getChildren();
        } else if (fieldName.equals("cost")) {
            return getCost();
        } else if (fieldName.equals("created_at")) {
            return getCreatedAt();
        } else if (fieldName.equals("description")) {
            return getDescription();
        } else if (fieldName.equals("images")) {
            return getImages();
        } else if (fieldName.equals("is_in_stock")) {
            return isInStock();
        } else if (fieldName.equals("is_qty_decimal")) {
            return isQtyDecimal();
        } else if (fieldName.equals("is_recurring")) {
            return isRecurring();
        } else if (fieldName.equals("low_stock_date")) {
            return getLowStockDate();
        } else if (fieldName.equals("max_sale_qty")) {
            return getMaxSaleQty();
        } else if (fieldName.equals("meta_description")) {
            return getMetaDescription();
        } else if (fieldName.equals("meta_keyword")) {
            return getMetaKeyword();
        } else if (fieldName.equals("meta_title")) {
            return getMetaTitle();
        } else if (fieldName.equals("minimal_price")) {
            return getMinimalPrice();
        } else if (fieldName.equals("min_qty")) {
            return getMinQty();
        } else if (fieldName.equals("min_sale_qty")) {
            return getMinSaleQty();
        } else if (fieldName.equals("model")) {
            return getModel();
        } else if (fieldName.equals("name")) {
            return getName();
        } else if (fieldName.equals("news_from_date")) {
            return getNewsFromDate();
        } else if (fieldName.equals("news_to_date")) {
            return getNewsToDate();
        } else if (fieldName.equals("notify_stock_qty")) {
            return getNotifyStockQty();
        } else if (fieldName.equals("price")) {
            return getPrice();
        } else if (fieldName.equals("qty")) {
            return getQty();
        } else if (fieldName.equals("shipping_policy")) {
            return getShippingPolicy();
        } else if (fieldName.equals("short_description")) {
            return getShortDescription();
        } else if (fieldName.equals("sku")) {
            return getSku();
        } else if (fieldName.equals("special_from_date")) {
            return getSpecialFromDate();
        } else if (fieldName.equals("special_price")) {
            return getSpecialPrice();
        } else if (fieldName.equals("special_to_date")) {
            return getSpecialToDate();
        } else if (fieldName.equals("store")) {
            return getStore();
        } else if (fieldName.equals("status")) {
            return getStatus();
        } else if (fieldName.equals("tags")) {
            return getTags();
        } else if (fieldName.equals("type")) {
            return getType();
        } else if (fieldName.equals("updated_at")) {
            return getUpdatedAt();
        } else if (fieldName.equals("url_key")) {
            return getUrlKey();
        } else if (fieldName.equals("url_path")) {
            return getUrlPath();
        } else if (fieldName.equals("visibility")) {
            return getVisibility();
        } else if (fieldName.equals("weight")) {
            return getWeight();
        }
        return null;
    }

    public final String getActivationInformation() {
        return activationInformation;
    }

    public final Integer getBackorders() {
        return backorders;
    }

    public final com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.magento.MagentoProduct> getChildren() {
        return children;
    }

    public final java.math.BigDecimal getCost() {
        return cost;
    }

    public final org.joda.time.DateTime getCreatedAt() {
        return createdAt;
    }

    public final String getDescription() {
        return description;
    }

    public final com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.magento.MagentoProductImage> getImages() {
        return images;
    }

    public final org.joda.time.DateTime getLowStockDate() {
        return lowStockDate;
    }

    public final java.math.BigDecimal getMaxSaleQty() {
        return maxSaleQty;
    }

    public final String getMetaDescription() {
        return metaDescription;
    }

    public final String getMetaKeyword() {
        return metaKeyword;
    }

    public final String getMetaTitle() {
        return metaTitle;
    }

    public final java.math.BigDecimal getMinQty() {
        return minQty;
    }

    public final java.math.BigDecimal getMinSaleQty() {
        return minSaleQty;
    }

    public final java.math.BigDecimal getMinimalPrice() {
        return minimalPrice;
    }

    public final String getModel() {
        return model;
    }

    public final String getName() {
        return name;
    }

    public final org.joda.time.DateTime getNewsFromDate() {
        return newsFromDate;
    }

    public final org.joda.time.DateTime getNewsToDate() {
        return newsToDate;
    }

    public final java.math.BigDecimal getNotifyStockQty() {
        return notifyStockQty;
    }

    /**
     * Optional in 1.3
     */
    public final java.math.BigDecimal getPrice() {
        return price;
    }

    public final java.math.BigDecimal getQty() {
        return qty;
    }

    public final String getShippingPolicy() {
        return shippingPolicy;
    }

    public final String getShortDescription() {
        return shortDescription;
    }

    public final String getSku() {
        return sku;
    }

    public final org.joda.time.DateTime getSpecialFromDate() {
        return specialFromDate;
    }

    public final java.math.BigDecimal getSpecialPrice() {
        return specialPrice;
    }

    public final org.joda.time.DateTime getSpecialToDate() {
        return specialToDate;
    }

    /**
     * Optional in 1.3
     */
    public final com.yogento.api.models.catalog.product.magento.MagentoProductStatus getStatus() {
        return status;
    }

    public final String getStore() {
        return store;
    }

    public final com.google.common.collect.ImmutableSet<String> getTags() {
        return tags;
    }

    /**
     * Optional in 1.3
     */
    public final String getType() {
        return type;
    }

    public final org.joda.time.DateTime getUpdatedAt() {
        return updatedAt;
    }

    public final String getUrlKey() {
        return urlKey;
    }

    /**
     * Optional in 1.3
     */
    public final String getUrlPath() {
        return urlPath;
    }

    /**
     * Formerly an enum; the strings differ between Magento versions
     */
    public final com.google.common.collect.ImmutableSet<String> getVisibility() {
        return visibility;
    }

    public final java.math.BigDecimal getWeight() {
        return weight;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        if (getActivationInformation() != null) {
            hashCode = 31 * hashCode + getActivationInformation().hashCode();
        }
        if (getBackorders() != null) {
            hashCode = 31 * hashCode + ((int)getBackorders());
        }
        if (getChildren() != null) {
            hashCode = 31 * hashCode + getChildren().hashCode();
        }
        if (getCost() != null) {
            hashCode = 31 * hashCode + getCost().hashCode();
        }
        if (getCreatedAt() != null) {
            hashCode = 31 * hashCode + getCreatedAt().hashCode();
        }
        if (getDescription() != null) {
            hashCode = 31 * hashCode + getDescription().hashCode();
        }
        if (getImages() != null) {
            hashCode = 31 * hashCode + getImages().hashCode();
        }
        if (isInStock() != null) {
            hashCode = 31 * hashCode + (isInStock() ? 1 : 0);
        }
        if (isQtyDecimal() != null) {
            hashCode = 31 * hashCode + (isQtyDecimal() ? 1 : 0);
        }
        if (isRecurring() != null) {
            hashCode = 31 * hashCode + (isRecurring() ? 1 : 0);
        }
        if (getLowStockDate() != null) {
            hashCode = 31 * hashCode + getLowStockDate().hashCode();
        }
        if (getMaxSaleQty() != null) {
            hashCode = 31 * hashCode + getMaxSaleQty().hashCode();
        }
        if (getMetaDescription() != null) {
            hashCode = 31 * hashCode + getMetaDescription().hashCode();
        }
        if (getMetaKeyword() != null) {
            hashCode = 31 * hashCode + getMetaKeyword().hashCode();
        }
        if (getMetaTitle() != null) {
            hashCode = 31 * hashCode + getMetaTitle().hashCode();
        }
        if (getMinimalPrice() != null) {
            hashCode = 31 * hashCode + getMinimalPrice().hashCode();
        }
        if (getMinQty() != null) {
            hashCode = 31 * hashCode + getMinQty().hashCode();
        }
        if (getMinSaleQty() != null) {
            hashCode = 31 * hashCode + getMinSaleQty().hashCode();
        }
        if (getModel() != null) {
            hashCode = 31 * hashCode + getModel().hashCode();
        }
        hashCode = 31 * hashCode + getName().hashCode();
        if (getNewsFromDate() != null) {
            hashCode = 31 * hashCode + getNewsFromDate().hashCode();
        }
        if (getNewsToDate() != null) {
            hashCode = 31 * hashCode + getNewsToDate().hashCode();
        }
        if (getNotifyStockQty() != null) {
            hashCode = 31 * hashCode + getNotifyStockQty().hashCode();
        }
        if (getPrice() != null) {
            hashCode = 31 * hashCode + getPrice().hashCode();
        }
        if (getQty() != null) {
            hashCode = 31 * hashCode + getQty().hashCode();
        }
        if (getShippingPolicy() != null) {
            hashCode = 31 * hashCode + getShippingPolicy().hashCode();
        }
        hashCode = 31 * hashCode + getShortDescription().hashCode();
        hashCode = 31 * hashCode + getSku().hashCode();
        if (getSpecialFromDate() != null) {
            hashCode = 31 * hashCode + getSpecialFromDate().hashCode();
        }
        if (getSpecialPrice() != null) {
            hashCode = 31 * hashCode + getSpecialPrice().hashCode();
        }
        if (getSpecialToDate() != null) {
            hashCode = 31 * hashCode + getSpecialToDate().hashCode();
        }
        hashCode = 31 * hashCode + getStore().hashCode();
        if (getStatus() != null) {
            hashCode = 31 * hashCode + getStatus().ordinal();
        }
        if (getTags() != null) {
            hashCode = 31 * hashCode + getTags().hashCode();
        }
        if (getType() != null) {
            hashCode = 31 * hashCode + getType().hashCode();
        }
        if (getUpdatedAt() != null) {
            hashCode = 31 * hashCode + getUpdatedAt().hashCode();
        }
        hashCode = 31 * hashCode + getUrlKey().hashCode();
        if (getUrlPath() != null) {
            hashCode = 31 * hashCode + getUrlPath().hashCode();
        }
        hashCode = 31 * hashCode + getVisibility().hashCode();
        if (getWeight() != null) {
            hashCode = 31 * hashCode + getWeight().hashCode();
        }
        return hashCode;
    }

    public final Boolean isInStock() {
        return isInStock;
    }

    public final Boolean isQtyDecimal() {
        return isQtyDecimal;
    }

    public final Boolean isRecurring() {
        return isRecurring;
    }

    @Override
    public String toString() {
        final com.google.common.base.Objects.ToStringHelper helper = com.google.common.base.Objects.toStringHelper(this);
        if (getActivationInformation() != null) {
            helper.add("activation_information", getActivationInformation());
        }
        if (getBackorders() != null) {
            helper.add("backorders", getBackorders());
        }
        if (getChildren() != null) {
            helper.add("children", getChildren());
        }
        if (getCost() != null) {
            helper.add("cost", getCost());
        }
        if (getCreatedAt() != null) {
            helper.add("created_at", getCreatedAt());
        }
        if (getDescription() != null) {
            helper.add("description", getDescription());
        }
        if (getImages() != null) {
            helper.add("images", getImages());
        }
        if (isInStock() != null) {
            helper.add("is_in_stock", isInStock());
        }
        if (isQtyDecimal() != null) {
            helper.add("is_qty_decimal", isQtyDecimal());
        }
        if (isRecurring() != null) {
            helper.add("is_recurring", isRecurring());
        }
        if (getLowStockDate() != null) {
            helper.add("low_stock_date", getLowStockDate());
        }
        if (getMaxSaleQty() != null) {
            helper.add("max_sale_qty", getMaxSaleQty());
        }
        if (getMetaDescription() != null) {
            helper.add("meta_description", getMetaDescription());
        }
        if (getMetaKeyword() != null) {
            helper.add("meta_keyword", getMetaKeyword());
        }
        if (getMetaTitle() != null) {
            helper.add("meta_title", getMetaTitle());
        }
        if (getMinimalPrice() != null) {
            helper.add("minimal_price", getMinimalPrice());
        }
        if (getMinQty() != null) {
            helper.add("min_qty", getMinQty());
        }
        if (getMinSaleQty() != null) {
            helper.add("min_sale_qty", getMinSaleQty());
        }
        if (getModel() != null) {
            helper.add("model", getModel());
        }
        helper.add("name", getName());
        if (getNewsFromDate() != null) {
            helper.add("news_from_date", getNewsFromDate());
        }
        if (getNewsToDate() != null) {
            helper.add("news_to_date", getNewsToDate());
        }
        if (getNotifyStockQty() != null) {
            helper.add("notify_stock_qty", getNotifyStockQty());
        }
        if (getPrice() != null) {
            helper.add("price", getPrice());
        }
        if (getQty() != null) {
            helper.add("qty", getQty());
        }
        if (getShippingPolicy() != null) {
            helper.add("shipping_policy", getShippingPolicy());
        }
        helper.add("short_description", getShortDescription());
        helper.add("sku", getSku());
        if (getSpecialFromDate() != null) {
            helper.add("special_from_date", getSpecialFromDate());
        }
        if (getSpecialPrice() != null) {
            helper.add("special_price", getSpecialPrice());
        }
        if (getSpecialToDate() != null) {
            helper.add("special_to_date", getSpecialToDate());
        }
        helper.add("store", getStore());
        if (getStatus() != null) {
            helper.add("status", getStatus());
        }
        if (getTags() != null) {
            helper.add("tags", getTags());
        }
        if (getType() != null) {
            helper.add("type", getType());
        }
        if (getUpdatedAt() != null) {
            helper.add("updated_at", getUpdatedAt());
        }
        helper.add("url_key", getUrlKey());
        if (getUrlPath() != null) {
            helper.add("url_path", getUrlPath());
        }
        helper.add("visibility", getVisibility());
        if (getWeight() != null) {
            helper.add("weight", getWeight());
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
                oprot.writeListBegin(new org.thryft.protocol.TList(org.thryft.protocol.TType.VOID, 40));

                if (getActivationInformation() != null) {
                    oprot.writeString(getActivationInformation());
                } else {
                    ((org.thryft.protocol.TProtocol)oprot).writeNull();
                }

                if (getBackorders() != null) {
                    oprot.writeI32(getBackorders());
                } else {
                    ((org.thryft.protocol.TProtocol)oprot).writeNull();
                }

                if (getChildren() != null) {
                    oprot.writeSetBegin(new org.thryft.protocol.TSet(org.thryft.protocol.TType.STRUCT, getChildren().size()));
                    for (final com.yogento.api.models.catalog.product.magento.MagentoProduct _iter0 : getChildren()) {
                        _iter0.write(oprot);
                    }
                    oprot.writeSetEnd();
                } else {
                    ((org.thryft.protocol.TProtocol)oprot).writeNull();
                }

                if (getCost() != null) {
                    oprot.writeDecimal(getCost());
                } else {
                    ((org.thryft.protocol.TProtocol)oprot).writeNull();
                }

                if (getCreatedAt() != null) {
                    oprot.writeDateTime(getCreatedAt());
                } else {
                    ((org.thryft.protocol.TProtocol)oprot).writeNull();
                }

                if (getDescription() != null) {
                    oprot.writeString(getDescription());
                } else {
                    ((org.thryft.protocol.TProtocol)oprot).writeNull();
                }

                if (getImages() != null) {
                    oprot.writeSetBegin(new org.thryft.protocol.TSet(org.thryft.protocol.TType.STRUCT, getImages().size()));
                    for (final com.yogento.api.models.catalog.product.magento.MagentoProductImage _iter0 : getImages()) {
                        _iter0.write(oprot);
                    }
                    oprot.writeSetEnd();
                } else {
                    ((org.thryft.protocol.TProtocol)oprot).writeNull();
                }

                if (isInStock() != null) {
                    oprot.writeBool(isInStock());
                } else {
                    ((org.thryft.protocol.TProtocol)oprot).writeNull();
                }

                if (isQtyDecimal() != null) {
                    oprot.writeBool(isQtyDecimal());
                } else {
                    ((org.thryft.protocol.TProtocol)oprot).writeNull();
                }

                if (isRecurring() != null) {
                    oprot.writeBool(isRecurring());
                } else {
                    ((org.thryft.protocol.TProtocol)oprot).writeNull();
                }

                if (getLowStockDate() != null) {
                    oprot.writeDateTime(getLowStockDate());
                } else {
                    ((org.thryft.protocol.TProtocol)oprot).writeNull();
                }

                if (getMaxSaleQty() != null) {
                    oprot.writeDecimal(getMaxSaleQty());
                } else {
                    ((org.thryft.protocol.TProtocol)oprot).writeNull();
                }

                if (getMetaDescription() != null) {
                    oprot.writeString(getMetaDescription());
                } else {
                    ((org.thryft.protocol.TProtocol)oprot).writeNull();
                }

                if (getMetaKeyword() != null) {
                    oprot.writeString(getMetaKeyword());
                } else {
                    ((org.thryft.protocol.TProtocol)oprot).writeNull();
                }

                if (getMetaTitle() != null) {
                    oprot.writeString(getMetaTitle());
                } else {
                    ((org.thryft.protocol.TProtocol)oprot).writeNull();
                }

                if (getMinimalPrice() != null) {
                    oprot.writeDecimal(getMinimalPrice());
                } else {
                    ((org.thryft.protocol.TProtocol)oprot).writeNull();
                }

                if (getMinQty() != null) {
                    oprot.writeDecimal(getMinQty());
                } else {
                    ((org.thryft.protocol.TProtocol)oprot).writeNull();
                }

                if (getMinSaleQty() != null) {
                    oprot.writeDecimal(getMinSaleQty());
                } else {
                    ((org.thryft.protocol.TProtocol)oprot).writeNull();
                }

                if (getModel() != null) {
                    oprot.writeString(getModel());
                } else {
                    ((org.thryft.protocol.TProtocol)oprot).writeNull();
                }

                oprot.writeString(getName());

                if (getNewsFromDate() != null) {
                    oprot.writeDateTime(getNewsFromDate());
                } else {
                    ((org.thryft.protocol.TProtocol)oprot).writeNull();
                }

                if (getNewsToDate() != null) {
                    oprot.writeDateTime(getNewsToDate());
                } else {
                    ((org.thryft.protocol.TProtocol)oprot).writeNull();
                }

                if (getNotifyStockQty() != null) {
                    oprot.writeDecimal(getNotifyStockQty());
                } else {
                    ((org.thryft.protocol.TProtocol)oprot).writeNull();
                }

                if (getPrice() != null) {
                    oprot.writeDecimal(getPrice());
                } else {
                    ((org.thryft.protocol.TProtocol)oprot).writeNull();
                }

                if (getQty() != null) {
                    oprot.writeDecimal(getQty());
                } else {
                    ((org.thryft.protocol.TProtocol)oprot).writeNull();
                }

                if (getShippingPolicy() != null) {
                    oprot.writeString(getShippingPolicy());
                } else {
                    ((org.thryft.protocol.TProtocol)oprot).writeNull();
                }

                oprot.writeString(getShortDescription());

                oprot.writeString(getSku());

                if (getSpecialFromDate() != null) {
                    oprot.writeDateTime(getSpecialFromDate());
                } else {
                    ((org.thryft.protocol.TProtocol)oprot).writeNull();
                }

                if (getSpecialPrice() != null) {
                    oprot.writeDecimal(getSpecialPrice());
                } else {
                    ((org.thryft.protocol.TProtocol)oprot).writeNull();
                }

                if (getSpecialToDate() != null) {
                    oprot.writeDateTime(getSpecialToDate());
                } else {
                    ((org.thryft.protocol.TProtocol)oprot).writeNull();
                }

                oprot.writeString(getStore());

                if (getStatus() != null) {
                    oprot.writeEnum(getStatus());
                } else {
                    ((org.thryft.protocol.TProtocol)oprot).writeNull();
                }

                if (getTags() != null) {
                    oprot.writeSetBegin(new org.thryft.protocol.TSet(org.thryft.protocol.TType.STRING, getTags().size()));
                    for (final String _iter0 : getTags()) {
                        oprot.writeString(_iter0);
                    }
                    oprot.writeSetEnd();
                } else {
                    ((org.thryft.protocol.TProtocol)oprot).writeNull();
                }

                if (getType() != null) {
                    oprot.writeString(getType());
                } else {
                    ((org.thryft.protocol.TProtocol)oprot).writeNull();
                }

                if (getUpdatedAt() != null) {
                    oprot.writeDateTime(getUpdatedAt());
                } else {
                    ((org.thryft.protocol.TProtocol)oprot).writeNull();
                }

                oprot.writeString(getUrlKey());

                if (getUrlPath() != null) {
                    oprot.writeString(getUrlPath());
                } else {
                    ((org.thryft.protocol.TProtocol)oprot).writeNull();
                }

                oprot.writeSetBegin(new org.thryft.protocol.TSet(org.thryft.protocol.TType.STRING, getVisibility().size()));
                for (final String _iter0 : getVisibility()) {
                    oprot.writeString(_iter0);
                }
                oprot.writeSetEnd();

                if (getWeight() != null) {
                    oprot.writeDecimal(getWeight());
                } else {
                    ((org.thryft.protocol.TProtocol)oprot).writeNull();
                }

                oprot.writeListEnd();
                break;

            case org.thryft.protocol.TType.STRUCT:
            default:
                oprot.writeStructBegin(new org.thryft.protocol.TStruct("MagentoProduct"));

                if (getActivationInformation() != null) {
                    oprot.writeFieldBegin(new org.thryft.protocol.TField("activation_information", org.thryft.protocol.TType.STRING, (short)-1));
                    oprot.writeString(getActivationInformation());
                    oprot.writeFieldEnd();
                }

                if (getBackorders() != null) {
                    oprot.writeFieldBegin(new org.thryft.protocol.TField("backorders", org.thryft.protocol.TType.I32, (short)-1));
                    oprot.writeI32(getBackorders());
                    oprot.writeFieldEnd();
                }

                if (getChildren() != null) {
                    oprot.writeFieldBegin(new org.thryft.protocol.TField("children", org.thryft.protocol.TType.SET, (short)-1));
                    oprot.writeSetBegin(new org.thryft.protocol.TSet(org.thryft.protocol.TType.STRUCT, getChildren().size()));
                    for (final com.yogento.api.models.catalog.product.magento.MagentoProduct _iter0 : getChildren()) {
                        _iter0.write(oprot);
                    }
                    oprot.writeSetEnd();
                    oprot.writeFieldEnd();
                }

                if (getCost() != null) {
                    oprot.writeFieldBegin(new org.thryft.protocol.TField("cost", org.thryft.protocol.TType.STRUCT, (short)-1));
                    oprot.writeDecimal(getCost());
                    oprot.writeFieldEnd();
                }

                if (getCreatedAt() != null) {
                    oprot.writeFieldBegin(new org.thryft.protocol.TField("created_at", org.thryft.protocol.TType.STRUCT, (short)-1));
                    oprot.writeDateTime(getCreatedAt());
                    oprot.writeFieldEnd();
                }

                if (getDescription() != null) {
                    oprot.writeFieldBegin(new org.thryft.protocol.TField("description", org.thryft.protocol.TType.STRING, (short)-1));
                    oprot.writeString(getDescription());
                    oprot.writeFieldEnd();
                }

                if (getImages() != null) {
                    oprot.writeFieldBegin(new org.thryft.protocol.TField("images", org.thryft.protocol.TType.SET, (short)-1));
                    oprot.writeSetBegin(new org.thryft.protocol.TSet(org.thryft.protocol.TType.STRUCT, getImages().size()));
                    for (final com.yogento.api.models.catalog.product.magento.MagentoProductImage _iter0 : getImages()) {
                        _iter0.write(oprot);
                    }
                    oprot.writeSetEnd();
                    oprot.writeFieldEnd();
                }

                if (isInStock() != null) {
                    oprot.writeFieldBegin(new org.thryft.protocol.TField("is_in_stock", org.thryft.protocol.TType.BOOL, (short)-1));
                    oprot.writeBool(isInStock());
                    oprot.writeFieldEnd();
                }

                if (isQtyDecimal() != null) {
                    oprot.writeFieldBegin(new org.thryft.protocol.TField("is_qty_decimal", org.thryft.protocol.TType.BOOL, (short)-1));
                    oprot.writeBool(isQtyDecimal());
                    oprot.writeFieldEnd();
                }

                if (isRecurring() != null) {
                    oprot.writeFieldBegin(new org.thryft.protocol.TField("is_recurring", org.thryft.protocol.TType.BOOL, (short)-1));
                    oprot.writeBool(isRecurring());
                    oprot.writeFieldEnd();
                }

                if (getLowStockDate() != null) {
                    oprot.writeFieldBegin(new org.thryft.protocol.TField("low_stock_date", org.thryft.protocol.TType.STRUCT, (short)-1));
                    oprot.writeDateTime(getLowStockDate());
                    oprot.writeFieldEnd();
                }

                if (getMaxSaleQty() != null) {
                    oprot.writeFieldBegin(new org.thryft.protocol.TField("max_sale_qty", org.thryft.protocol.TType.STRUCT, (short)-1));
                    oprot.writeDecimal(getMaxSaleQty());
                    oprot.writeFieldEnd();
                }

                if (getMetaDescription() != null) {
                    oprot.writeFieldBegin(new org.thryft.protocol.TField("meta_description", org.thryft.protocol.TType.STRING, (short)-1));
                    oprot.writeString(getMetaDescription());
                    oprot.writeFieldEnd();
                }

                if (getMetaKeyword() != null) {
                    oprot.writeFieldBegin(new org.thryft.protocol.TField("meta_keyword", org.thryft.protocol.TType.STRING, (short)-1));
                    oprot.writeString(getMetaKeyword());
                    oprot.writeFieldEnd();
                }

                if (getMetaTitle() != null) {
                    oprot.writeFieldBegin(new org.thryft.protocol.TField("meta_title", org.thryft.protocol.TType.STRING, (short)-1));
                    oprot.writeString(getMetaTitle());
                    oprot.writeFieldEnd();
                }

                if (getMinimalPrice() != null) {
                    oprot.writeFieldBegin(new org.thryft.protocol.TField("minimal_price", org.thryft.protocol.TType.STRUCT, (short)-1));
                    oprot.writeDecimal(getMinimalPrice());
                    oprot.writeFieldEnd();
                }

                if (getMinQty() != null) {
                    oprot.writeFieldBegin(new org.thryft.protocol.TField("min_qty", org.thryft.protocol.TType.STRUCT, (short)-1));
                    oprot.writeDecimal(getMinQty());
                    oprot.writeFieldEnd();
                }

                if (getMinSaleQty() != null) {
                    oprot.writeFieldBegin(new org.thryft.protocol.TField("min_sale_qty", org.thryft.protocol.TType.STRUCT, (short)-1));
                    oprot.writeDecimal(getMinSaleQty());
                    oprot.writeFieldEnd();
                }

                if (getModel() != null) {
                    oprot.writeFieldBegin(new org.thryft.protocol.TField("model", org.thryft.protocol.TType.STRING, (short)-1));
                    oprot.writeString(getModel());
                    oprot.writeFieldEnd();
                }

                oprot.writeFieldBegin(new org.thryft.protocol.TField("name", org.thryft.protocol.TType.STRING, (short)-1));
                oprot.writeString(getName());
                oprot.writeFieldEnd();

                if (getNewsFromDate() != null) {
                    oprot.writeFieldBegin(new org.thryft.protocol.TField("news_from_date", org.thryft.protocol.TType.STRUCT, (short)-1));
                    oprot.writeDateTime(getNewsFromDate());
                    oprot.writeFieldEnd();
                }

                if (getNewsToDate() != null) {
                    oprot.writeFieldBegin(new org.thryft.protocol.TField("news_to_date", org.thryft.protocol.TType.STRUCT, (short)-1));
                    oprot.writeDateTime(getNewsToDate());
                    oprot.writeFieldEnd();
                }

                if (getNotifyStockQty() != null) {
                    oprot.writeFieldBegin(new org.thryft.protocol.TField("notify_stock_qty", org.thryft.protocol.TType.STRUCT, (short)-1));
                    oprot.writeDecimal(getNotifyStockQty());
                    oprot.writeFieldEnd();
                }

                if (getPrice() != null) {
                    oprot.writeFieldBegin(new org.thryft.protocol.TField("price", org.thryft.protocol.TType.STRUCT, (short)-1));
                    oprot.writeDecimal(getPrice());
                    oprot.writeFieldEnd();
                }

                if (getQty() != null) {
                    oprot.writeFieldBegin(new org.thryft.protocol.TField("qty", org.thryft.protocol.TType.STRUCT, (short)-1));
                    oprot.writeDecimal(getQty());
                    oprot.writeFieldEnd();
                }

                if (getShippingPolicy() != null) {
                    oprot.writeFieldBegin(new org.thryft.protocol.TField("shipping_policy", org.thryft.protocol.TType.STRING, (short)-1));
                    oprot.writeString(getShippingPolicy());
                    oprot.writeFieldEnd();
                }

                oprot.writeFieldBegin(new org.thryft.protocol.TField("short_description", org.thryft.protocol.TType.STRING, (short)-1));
                oprot.writeString(getShortDescription());
                oprot.writeFieldEnd();

                oprot.writeFieldBegin(new org.thryft.protocol.TField("sku", org.thryft.protocol.TType.STRING, (short)-1));
                oprot.writeString(getSku());
                oprot.writeFieldEnd();

                if (getSpecialFromDate() != null) {
                    oprot.writeFieldBegin(new org.thryft.protocol.TField("special_from_date", org.thryft.protocol.TType.STRUCT, (short)-1));
                    oprot.writeDateTime(getSpecialFromDate());
                    oprot.writeFieldEnd();
                }

                if (getSpecialPrice() != null) {
                    oprot.writeFieldBegin(new org.thryft.protocol.TField("special_price", org.thryft.protocol.TType.STRUCT, (short)-1));
                    oprot.writeDecimal(getSpecialPrice());
                    oprot.writeFieldEnd();
                }

                if (getSpecialToDate() != null) {
                    oprot.writeFieldBegin(new org.thryft.protocol.TField("special_to_date", org.thryft.protocol.TType.STRUCT, (short)-1));
                    oprot.writeDateTime(getSpecialToDate());
                    oprot.writeFieldEnd();
                }

                oprot.writeFieldBegin(new org.thryft.protocol.TField("store", org.thryft.protocol.TType.STRING, (short)-1));
                oprot.writeString(getStore());
                oprot.writeFieldEnd();

                if (getStatus() != null) {
                    oprot.writeFieldBegin(new org.thryft.protocol.TField("status", org.thryft.protocol.TType.STRING, (short)-1));
                    oprot.writeEnum(getStatus());
                    oprot.writeFieldEnd();
                }

                if (getTags() != null) {
                    oprot.writeFieldBegin(new org.thryft.protocol.TField("tags", org.thryft.protocol.TType.SET, (short)-1));
                    oprot.writeSetBegin(new org.thryft.protocol.TSet(org.thryft.protocol.TType.STRING, getTags().size()));
                    for (final String _iter0 : getTags()) {
                        oprot.writeString(_iter0);
                    }
                    oprot.writeSetEnd();
                    oprot.writeFieldEnd();
                }

                if (getType() != null) {
                    oprot.writeFieldBegin(new org.thryft.protocol.TField("type", org.thryft.protocol.TType.STRING, (short)-1));
                    oprot.writeString(getType());
                    oprot.writeFieldEnd();
                }

                if (getUpdatedAt() != null) {
                    oprot.writeFieldBegin(new org.thryft.protocol.TField("updated_at", org.thryft.protocol.TType.STRUCT, (short)-1));
                    oprot.writeDateTime(getUpdatedAt());
                    oprot.writeFieldEnd();
                }

                oprot.writeFieldBegin(new org.thryft.protocol.TField("url_key", org.thryft.protocol.TType.STRING, (short)-1));
                oprot.writeString(getUrlKey());
                oprot.writeFieldEnd();

                if (getUrlPath() != null) {
                    oprot.writeFieldBegin(new org.thryft.protocol.TField("url_path", org.thryft.protocol.TType.STRING, (short)-1));
                    oprot.writeString(getUrlPath());
                    oprot.writeFieldEnd();
                }

                oprot.writeFieldBegin(new org.thryft.protocol.TField("visibility", org.thryft.protocol.TType.SET, (short)-1));
                oprot.writeSetBegin(new org.thryft.protocol.TSet(org.thryft.protocol.TType.STRING, getVisibility().size()));
                for (final String _iter0 : getVisibility()) {
                    oprot.writeString(_iter0);
                }
                oprot.writeSetEnd();
                oprot.writeFieldEnd();

                if (getWeight() != null) {
                    oprot.writeFieldBegin(new org.thryft.protocol.TField("weight", org.thryft.protocol.TType.STRUCT, (short)-1));
                    oprot.writeDecimal(getWeight());
                    oprot.writeFieldEnd();
                }

                oprot.writeFieldStop();

                oprot.writeStructEnd();
                break;
        }
    }

    private final String activationInformation;

    private final Integer backorders;

    private final com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.magento.MagentoProduct> children;

    private final java.math.BigDecimal cost;

    private final org.joda.time.DateTime createdAt;

    private final String description;

    private final com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.magento.MagentoProductImage> images;

    private final Boolean isInStock;

    private final Boolean isQtyDecimal;

    private final Boolean isRecurring;

    private final org.joda.time.DateTime lowStockDate;

    private final java.math.BigDecimal maxSaleQty;

    private final String metaDescription;

    private final String metaKeyword;

    private final String metaTitle;

    private final java.math.BigDecimal minimalPrice;

    private final java.math.BigDecimal minQty;

    private final java.math.BigDecimal minSaleQty;

    private final String model;

    private final String name;

    private final org.joda.time.DateTime newsFromDate;

    private final org.joda.time.DateTime newsToDate;

    private final java.math.BigDecimal notifyStockQty;

    /**
     * Optional in 1.3
     */
    private final java.math.BigDecimal price;

    private final java.math.BigDecimal qty;

    private final String shippingPolicy;

    private final String shortDescription;

    private final String sku;

    private final org.joda.time.DateTime specialFromDate;

    private final java.math.BigDecimal specialPrice;

    private final org.joda.time.DateTime specialToDate;

    private final String store;

    /**
     * Optional in 1.3
     */
    private final com.yogento.api.models.catalog.product.magento.MagentoProductStatus status;

    private final com.google.common.collect.ImmutableSet<String> tags;

    /**
     * Optional in 1.3
     */
    private final String type;

    private final org.joda.time.DateTime updatedAt;

    private final String urlKey;

    /**
     * Optional in 1.3
     */
    private final String urlPath;

    /**
     * Formerly an enum; the strings differ between Magento versions
     */
    private final com.google.common.collect.ImmutableSet<String> visibility;

    private final java.math.BigDecimal weight;
}
