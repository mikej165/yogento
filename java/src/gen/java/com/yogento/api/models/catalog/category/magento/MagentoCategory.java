package com.yogento.api.models.catalog.category.magento;

@SuppressWarnings({"serial"})
public class MagentoCategory implements org.apache.thrift.TBase<MagentoCategory, org.apache.thrift.TFieldIdEnum> {
    public static class Builder {
        public Builder() {
        }

        public Builder(final MagentoCategory other) {
            this.categoryId = other.getCategoryId();
            this.children = other.getChildren();
            this.createdAt = other.getCreatedAt();
            this.description = other.getDescription();
            this.displayMode = other.getDisplayMode();
            this.filterPriceRange = other.getFilterPriceRange();
            this.image = other.getImage();
            this.includeInMenu = other.isIncludeInMenu();
            this.incrementId = other.getIncrementId();
            this.isActive = other.isActive();
            this.isAnchor = other.isAnchor();
            this.landingPage = other.getLandingPage();
            this.level = other.getLevel();
            this.metaDescription = other.getMetaDescription();
            this.metaKeywords = other.getMetaKeywords();
            this.metaTitle = other.getMetaTitle();
            this.name = other.getName();
            this.pageLayout = other.getPageLayout();
            this.parentId = other.getParentId();
            this.path = other.getPath();
            this.pathInStore = other.getPathInStore();
            this.position = other.getPosition();
            this.thumbnail = other.getThumbnail();
            this.updatedAt = other.getUpdatedAt();
            this.urlKey = other.getUrlKey();
            this.urlPath = other.getUrlPath();
        }

        protected MagentoCategory _build(final int categoryId, final com.google.common.collect.ImmutableList<com.yogento.api.models.catalog.category.magento.MagentoCategory> children, final org.joda.time.DateTime createdAt, final String description, final com.yogento.api.models.catalog.category.magento.MagentoCategoryDisplayMode displayMode, final String filterPriceRange, final String image, final Boolean includeInMenu, final String incrementId, final boolean isActive, final Boolean isAnchor, final String landingPage, final int level, final String metaDescription, final String metaKeywords, final String metaTitle, final String name, final String pageLayout, final int parentId, final String path, final String pathInStore, final int position, final String thumbnail, final org.joda.time.DateTime updatedAt, final String urlKey, final String urlPath) {
            return new MagentoCategory(categoryId, children, createdAt, description, displayMode, filterPriceRange, image, includeInMenu, incrementId, isActive, isAnchor, landingPage, level, metaDescription, metaKeywords, metaTitle, name, pageLayout, parentId, path, pathInStore, position, thumbnail, updatedAt, urlKey, urlPath);
        }

        public MagentoCategory build() {
            return _build(categoryId, children, createdAt, description, displayMode, filterPriceRange, image, includeInMenu, incrementId, isActive, isAnchor, landingPage, level, metaDescription, metaKeywords, metaTitle, name, pageLayout, parentId, path, pathInStore, position, thumbnail, updatedAt, urlKey, urlPath);
        }

        public Builder setCategoryId(final int categoryId) {
            this.categoryId = categoryId;
            return this;
        }

        public Builder setChildren(final com.google.common.collect.ImmutableList<com.yogento.api.models.catalog.category.magento.MagentoCategory> children) {
            this.children = children;
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

        public Builder setDisplayMode(final com.yogento.api.models.catalog.category.magento.MagentoCategoryDisplayMode displayMode) {
            this.displayMode = displayMode;
            return this;
        }

        public Builder setFilterPriceRange(final String filterPriceRange) {
            this.filterPriceRange = filterPriceRange;
            return this;
        }

        public Builder setImage(final String image) {
            this.image = image;
            return this;
        }

        public Builder setIncludeInMenu(final Boolean includeInMenu) {
            this.includeInMenu = includeInMenu;
            return this;
        }

        public Builder setIncrementId(final String incrementId) {
            this.incrementId = incrementId;
            return this;
        }

        public Builder setIsActive(final boolean isActive) {
            this.isActive = isActive;
            return this;
        }

        public Builder setIsAnchor(final Boolean isAnchor) {
            this.isAnchor = isAnchor;
            return this;
        }

        public Builder setLandingPage(final String landingPage) {
            this.landingPage = landingPage;
            return this;
        }

        public Builder setLevel(final int level) {
            this.level = level;
            return this;
        }

        public Builder setMetaDescription(final String metaDescription) {
            this.metaDescription = metaDescription;
            return this;
        }

        public Builder setMetaKeywords(final String metaKeywords) {
            this.metaKeywords = metaKeywords;
            return this;
        }

        public Builder setMetaTitle(final String metaTitle) {
            this.metaTitle = metaTitle;
            return this;
        }

        public Builder setName(final String name) {
            this.name = name;
            return this;
        }

        public Builder setPageLayout(final String pageLayout) {
            this.pageLayout = pageLayout;
            return this;
        }

        public Builder setParentId(final int parentId) {
            this.parentId = parentId;
            return this;
        }

        public Builder setPath(final String path) {
            this.path = path;
            return this;
        }

        public Builder setPathInStore(final String pathInStore) {
            this.pathInStore = pathInStore;
            return this;
        }

        public Builder setPosition(final int position) {
            this.position = position;
            return this;
        }

        public Builder setThumbnail(final String thumbnail) {
            this.thumbnail = thumbnail;
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

        private Integer categoryId;
        private com.google.common.collect.ImmutableList<com.yogento.api.models.catalog.category.magento.MagentoCategory> children;
        private org.joda.time.DateTime createdAt;
        private String description;
        private com.yogento.api.models.catalog.category.magento.MagentoCategoryDisplayMode displayMode;
        private String filterPriceRange;
        private String image;
        private Boolean includeInMenu;
        private String incrementId;
        private Boolean isActive;
        private Boolean isAnchor;
        private String landingPage;
        private Integer level;
        private String metaDescription;
        private String metaKeywords;
        private String metaTitle;
        private String name;
        private String pageLayout;
        private Integer parentId;
        private String path;
        private String pathInStore;
        private Integer position;
        private String thumbnail;
        private org.joda.time.DateTime updatedAt;
        private String urlKey;
        private String urlPath;
    }

    public MagentoCategory(final MagentoCategory other) {
        this(other.getCategoryId(), other.getChildren(), other.getCreatedAt(), other.getDescription(), other.getDisplayMode(), other.getFilterPriceRange(), other.getImage(), other.isIncludeInMenu(), other.getIncrementId(), other.isActive(), other.isAnchor(), other.getLandingPage(), other.getLevel(), other.getMetaDescription(), other.getMetaKeywords(), other.getMetaTitle(), other.getName(), other.getPageLayout(), other.getParentId(), other.getPath(), other.getPathInStore(), other.getPosition(), other.getThumbnail(), other.getUpdatedAt(), other.getUrlKey(), other.getUrlPath());
    }

    public MagentoCategory(final org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
        this(iprot, org.apache.thrift.protocol.TType.STRUCT);
    }

    public MagentoCategory(final org.apache.thrift.protocol.TProtocol iprot, final byte readAsTType) throws org.apache.thrift.TException {
        int categoryId = 0;
        com.google.common.collect.ImmutableList<com.yogento.api.models.catalog.category.magento.MagentoCategory> children = null;
        org.joda.time.DateTime createdAt = null;
        String description = null;
        com.yogento.api.models.catalog.category.magento.MagentoCategoryDisplayMode displayMode = null;
        String filterPriceRange = null;
        String image = null;
        Boolean includeInMenu = null;
        String incrementId = null;
        boolean isActive = false;
        Boolean isAnchor = null;
        String landingPage = null;
        int level = 0;
        String metaDescription = null;
        String metaKeywords = null;
        String metaTitle = null;
        String name = null;
        String pageLayout = null;
        int parentId = 0;
        String path = null;
        String pathInStore = null;
        int position = 0;
        String thumbnail = null;
        org.joda.time.DateTime updatedAt = null;
        String urlKey = null;
        String urlPath = null;

        switch (readAsTType) {
            case org.apache.thrift.protocol.TType.LIST:
                org.apache.thrift.protocol.TList __list = iprot.readListBegin();
                categoryId = iprot.readI32();
                children = (new com.google.common.base.Function<org.apache.thrift.protocol.TProtocol, com.google.common.collect.ImmutableList<com.yogento.api.models.catalog.category.magento.MagentoCategory>>() {
                    @Override
                    public com.google.common.collect.ImmutableList<com.yogento.api.models.catalog.category.magento.MagentoCategory> apply(org.apache.thrift.protocol.TProtocol iprot) {
                        try {
                            org.apache.thrift.protocol.TList sequenceBegin = iprot.readListBegin();
                            java.util.List<com.yogento.api.models.catalog.category.magento.MagentoCategory> sequence = new java.util.ArrayList<com.yogento.api.models.catalog.category.magento.MagentoCategory>();
                            for (int elementI = 0; elementI < sequenceBegin.size; elementI++) {
                                sequence.add(new com.yogento.api.models.catalog.category.magento.MagentoCategory(iprot));
                            }
                            iprot.readListEnd();
                            return com.google.common.collect.ImmutableList.copyOf(sequence);
                        } catch (org.apache.thrift.TException e) {
                            return com.google.common.collect.ImmutableList.of();
                        }
                    }
                }).apply(iprot);
                createdAt = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDateTime() : new org.joda.time.DateTime(iprot.readI64());
                description = iprot.readString();
                try {
                    displayMode = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readEnum(com.yogento.api.models.catalog.category.magento.MagentoCategoryDisplayMode.class) : com.yogento.api.models.catalog.category.magento.MagentoCategoryDisplayMode.valueOf(iprot.readString().trim().toUpperCase());
                } catch (IllegalArgumentException e) {
                }
                filterPriceRange = iprot.readString();
                image = iprot.readString();
                includeInMenu = iprot.readBool();
                incrementId = iprot.readString();
                isActive = iprot.readBool();
                isAnchor = iprot.readBool();
                landingPage = iprot.readString();
                level = iprot.readI32();
                metaDescription = iprot.readString();
                metaKeywords = iprot.readString();
                metaTitle = iprot.readString();
                name = iprot.readString();
                pageLayout = iprot.readString();
                parentId = iprot.readI32();
                path = iprot.readString();
                pathInStore = iprot.readString();
                position = iprot.readI32();
                thumbnail = iprot.readString();
                updatedAt = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDateTime() : new org.joda.time.DateTime(iprot.readI64());
                if (__list.size > 24) {
                    urlKey = iprot.readString();
                }
                if (__list.size > 25) {
                    urlPath = iprot.readString();
                }
                iprot.readListEnd();
                break;

            case org.apache.thrift.protocol.TType.STRUCT:
            default:
                iprot.readStructBegin();
                while (true) {
                    org.apache.thrift.protocol.TField ifield = iprot.readFieldBegin();
                    if (ifield.type == org.apache.thrift.protocol.TType.STOP) {
                        break;
                    } else                 if (ifield.name.equals("category_id")) {
                        categoryId = iprot.readI32();
                    } else if (ifield.name.equals("children")) {
                        children = (new com.google.common.base.Function<org.apache.thrift.protocol.TProtocol, com.google.common.collect.ImmutableList<com.yogento.api.models.catalog.category.magento.MagentoCategory>>() {
                            @Override
                            public com.google.common.collect.ImmutableList<com.yogento.api.models.catalog.category.magento.MagentoCategory> apply(org.apache.thrift.protocol.TProtocol iprot) {
                                try {
                                    org.apache.thrift.protocol.TList sequenceBegin = iprot.readListBegin();
                                    java.util.List<com.yogento.api.models.catalog.category.magento.MagentoCategory> sequence = new java.util.ArrayList<com.yogento.api.models.catalog.category.magento.MagentoCategory>();
                                    for (int elementI = 0; elementI < sequenceBegin.size; elementI++) {
                                        sequence.add(new com.yogento.api.models.catalog.category.magento.MagentoCategory(iprot));
                                    }
                                    iprot.readListEnd();
                                    return com.google.common.collect.ImmutableList.copyOf(sequence);
                                } catch (org.apache.thrift.TException e) {
                                    return com.google.common.collect.ImmutableList.of();
                                }
                            }
                        }).apply(iprot);
                    } else if (ifield.name.equals("created_at")) {
                        createdAt = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDateTime() : new org.joda.time.DateTime(iprot.readI64());
                    } else if (ifield.name.equals("description")) {
                        description = iprot.readString();
                    } else if (ifield.name.equals("display_mode")) {
                        try {
                            displayMode = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readEnum(com.yogento.api.models.catalog.category.magento.MagentoCategoryDisplayMode.class) : com.yogento.api.models.catalog.category.magento.MagentoCategoryDisplayMode.valueOf(iprot.readString().trim().toUpperCase());
                        } catch (IllegalArgumentException e) {
                        }
                    } else if (ifield.name.equals("filter_price_range")) {
                        filterPriceRange = iprot.readString();
                    } else if (ifield.name.equals("image")) {
                        image = iprot.readString();
                    } else if (ifield.name.equals("include_in_menu")) {
                        includeInMenu = iprot.readBool();
                    } else if (ifield.name.equals("increment_id")) {
                        incrementId = iprot.readString();
                    } else if (ifield.name.equals("is_active")) {
                        isActive = iprot.readBool();
                    } else if (ifield.name.equals("is_anchor")) {
                        isAnchor = iprot.readBool();
                    } else if (ifield.name.equals("landing_page")) {
                        landingPage = iprot.readString();
                    } else if (ifield.name.equals("level")) {
                        level = iprot.readI32();
                    } else if (ifield.name.equals("meta_description")) {
                        metaDescription = iprot.readString();
                    } else if (ifield.name.equals("meta_keywords")) {
                        metaKeywords = iprot.readString();
                    } else if (ifield.name.equals("meta_title")) {
                        metaTitle = iprot.readString();
                    } else if (ifield.name.equals("name")) {
                        name = iprot.readString();
                    } else if (ifield.name.equals("page_layout")) {
                        pageLayout = iprot.readString();
                    } else if (ifield.name.equals("parent_id")) {
                        parentId = iprot.readI32();
                    } else if (ifield.name.equals("path")) {
                        path = iprot.readString();
                    } else if (ifield.name.equals("path_in_store")) {
                        pathInStore = iprot.readString();
                    } else if (ifield.name.equals("position")) {
                        position = iprot.readI32();
                    } else if (ifield.name.equals("thumbnail")) {
                        thumbnail = iprot.readString();
                    } else if (ifield.name.equals("updated_at")) {
                        updatedAt = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDateTime() : new org.joda.time.DateTime(iprot.readI64());
                    } else if (ifield.name.equals("url_key")) {
                        urlKey = iprot.readString();
                    } else if (ifield.name.equals("url_path")) {
                        urlPath = iprot.readString();
                    }
                    iprot.readFieldEnd();
                }
                iprot.readStructEnd();
                break;
        }

        this.categoryId = categoryId;
        this.children = children;
        this.createdAt = com.google.common.base.Preconditions.checkNotNull(createdAt);
        this.description = description;
        this.displayMode = displayMode;
        this.filterPriceRange = filterPriceRange;
        this.image = image;
        this.includeInMenu = includeInMenu;
        this.incrementId = incrementId;
        this.isActive = isActive;
        this.isAnchor = isAnchor;
        this.landingPage = landingPage;
        this.level = level;
        this.metaDescription = metaDescription;
        this.metaKeywords = metaKeywords;
        this.metaTitle = metaTitle;
        this.name = name;
        this.pageLayout = pageLayout;
        this.parentId = parentId;
        this.path = com.google.common.base.Preconditions.checkNotNull(path);
        this.pathInStore = pathInStore;
        this.position = position;
        this.thumbnail = thumbnail;
        this.updatedAt = com.google.common.base.Preconditions.checkNotNull(updatedAt);
        this.urlKey = urlKey;
        this.urlPath = urlPath;
    }

    public MagentoCategory(final int categoryId, final org.joda.time.DateTime createdAt, final boolean isActive, final int level, final int parentId, final String path, final int position, final org.joda.time.DateTime updatedAt) {
        this.categoryId = categoryId;
        this.children = null;
        this.createdAt = com.google.common.base.Preconditions.checkNotNull(createdAt);
        this.description = null;
        this.displayMode = null;
        this.filterPriceRange = null;
        this.image = null;
        this.includeInMenu = null;
        this.incrementId = null;
        this.isActive = isActive;
        this.isAnchor = null;
        this.landingPage = null;
        this.level = level;
        this.metaDescription = null;
        this.metaKeywords = null;
        this.metaTitle = null;
        this.name = null;
        this.pageLayout = null;
        this.parentId = parentId;
        this.path = com.google.common.base.Preconditions.checkNotNull(path);
        this.pathInStore = null;
        this.position = position;
        this.thumbnail = null;
        this.updatedAt = com.google.common.base.Preconditions.checkNotNull(updatedAt);
        this.urlKey = null;
        this.urlPath = null;
    }

    public MagentoCategory(final int categoryId, final com.google.common.collect.ImmutableList<com.yogento.api.models.catalog.category.magento.MagentoCategory> children, final org.joda.time.DateTime createdAt, final String description, final com.yogento.api.models.catalog.category.magento.MagentoCategoryDisplayMode displayMode, final String filterPriceRange, final String image, final Boolean includeInMenu, final String incrementId, final boolean isActive, final Boolean isAnchor, final String landingPage, final int level, final String metaDescription, final String metaKeywords, final String metaTitle, final String name, final String pageLayout, final int parentId, final String path, final String pathInStore, final int position, final String thumbnail, final org.joda.time.DateTime updatedAt, final String urlKey, final String urlPath) {
        this.categoryId = categoryId;
        this.children = children;
        this.createdAt = com.google.common.base.Preconditions.checkNotNull(createdAt);
        this.description = description;
        this.displayMode = displayMode;
        this.filterPriceRange = filterPriceRange;
        this.image = image;
        this.includeInMenu = includeInMenu;
        this.incrementId = incrementId;
        this.isActive = isActive;
        this.isAnchor = isAnchor;
        this.landingPage = landingPage;
        this.level = level;
        this.metaDescription = metaDescription;
        this.metaKeywords = metaKeywords;
        this.metaTitle = metaTitle;
        this.name = name;
        this.pageLayout = pageLayout;
        this.parentId = parentId;
        this.path = com.google.common.base.Preconditions.checkNotNull(path);
        this.pathInStore = pathInStore;
        this.position = position;
        this.thumbnail = thumbnail;
        this.updatedAt = com.google.common.base.Preconditions.checkNotNull(updatedAt);
        this.urlKey = urlKey;
        this.urlPath = urlPath;
    }

    public MagentoCategory(final Integer categoryId, final com.google.common.collect.ImmutableList<com.yogento.api.models.catalog.category.magento.MagentoCategory> children, final org.joda.time.DateTime createdAt, final String description, final com.yogento.api.models.catalog.category.magento.MagentoCategoryDisplayMode displayMode, final String filterPriceRange, final String image, final Boolean includeInMenu, final String incrementId, final Boolean isActive, final Boolean isAnchor, final String landingPage, final Integer level, final String metaDescription, final String metaKeywords, final String metaTitle, final String name, final String pageLayout, final Integer parentId, final String path, final String pathInStore, final Integer position, final String thumbnail, final org.joda.time.DateTime updatedAt, final String urlKey, final String urlPath) {
        this.categoryId = categoryId;
        this.children = children;
        this.createdAt = com.google.common.base.Preconditions.checkNotNull(createdAt);
        this.description = description;
        this.displayMode = displayMode;
        this.filterPriceRange = filterPriceRange;
        this.image = image;
        this.includeInMenu = includeInMenu;
        this.incrementId = incrementId;
        this.isActive = isActive;
        this.isAnchor = isAnchor;
        this.landingPage = landingPage;
        this.level = level;
        this.metaDescription = metaDescription;
        this.metaKeywords = metaKeywords;
        this.metaTitle = metaTitle;
        this.name = name;
        this.pageLayout = pageLayout;
        this.parentId = parentId;
        this.path = com.google.common.base.Preconditions.checkNotNull(path);
        this.pathInStore = pathInStore;
        this.position = position;
        this.thumbnail = thumbnail;
        this.updatedAt = com.google.common.base.Preconditions.checkNotNull(updatedAt);
        this.urlKey = urlKey;
        this.urlPath = urlPath;
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException();
    }

    @Override
    public int compareTo(final MagentoCategory other) {
        throw new UnsupportedOperationException();
    }

    @Override
    public org.apache.thrift.TBase<MagentoCategory, org.apache.thrift.TFieldIdEnum> deepCopy() {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean equals(final Object otherObject) {
        if (otherObject == this) {
            return true;
        } else if (!(otherObject instanceof MagentoCategory)) {
            return false;
        }

        final MagentoCategory other = (MagentoCategory)otherObject;
        return
            getCategoryId() == other.getCategoryId() &&
            ((getChildren() == null && other.getChildren() == null) ||
            (getChildren() != null && other.getChildren() != null &&
            getChildren().equals(other.getChildren()))) &&
            getCreatedAt().equals(other.getCreatedAt()) &&
            ((getDescription() == null && other.getDescription() == null) ||
            (getDescription() != null && other.getDescription() != null &&
            getDescription().equals(other.getDescription()))) &&
            ((getDisplayMode() == null && other.getDisplayMode() == null) ||
            (getDisplayMode() != null && other.getDisplayMode() != null &&
            getDisplayMode().equals(other.getDisplayMode()))) &&
            ((getFilterPriceRange() == null && other.getFilterPriceRange() == null) ||
            (getFilterPriceRange() != null && other.getFilterPriceRange() != null &&
            getFilterPriceRange().equals(other.getFilterPriceRange()))) &&
            ((getImage() == null && other.getImage() == null) ||
            (getImage() != null && other.getImage() != null &&
            getImage().equals(other.getImage()))) &&
            ((isIncludeInMenu() == null && other.isIncludeInMenu() == null) ||
            (isIncludeInMenu() != null && other.isIncludeInMenu() != null &&
            isIncludeInMenu().equals(other.isIncludeInMenu()))) &&
            ((getIncrementId() == null && other.getIncrementId() == null) ||
            (getIncrementId() != null && other.getIncrementId() != null &&
            getIncrementId().equals(other.getIncrementId()))) &&
            isActive() == other.isActive() &&
            ((isAnchor() == null && other.isAnchor() == null) ||
            (isAnchor() != null && other.isAnchor() != null &&
            isAnchor().equals(other.isAnchor()))) &&
            ((getLandingPage() == null && other.getLandingPage() == null) ||
            (getLandingPage() != null && other.getLandingPage() != null &&
            getLandingPage().equals(other.getLandingPage()))) &&
            getLevel() == other.getLevel() &&
            ((getMetaDescription() == null && other.getMetaDescription() == null) ||
            (getMetaDescription() != null && other.getMetaDescription() != null &&
            getMetaDescription().equals(other.getMetaDescription()))) &&
            ((getMetaKeywords() == null && other.getMetaKeywords() == null) ||
            (getMetaKeywords() != null && other.getMetaKeywords() != null &&
            getMetaKeywords().equals(other.getMetaKeywords()))) &&
            ((getMetaTitle() == null && other.getMetaTitle() == null) ||
            (getMetaTitle() != null && other.getMetaTitle() != null &&
            getMetaTitle().equals(other.getMetaTitle()))) &&
            ((getName() == null && other.getName() == null) ||
            (getName() != null && other.getName() != null &&
            getName().equals(other.getName()))) &&
            ((getPageLayout() == null && other.getPageLayout() == null) ||
            (getPageLayout() != null && other.getPageLayout() != null &&
            getPageLayout().equals(other.getPageLayout()))) &&
            getParentId() == other.getParentId() &&
            getPath().equals(other.getPath()) &&
            ((getPathInStore() == null && other.getPathInStore() == null) ||
            (getPathInStore() != null && other.getPathInStore() != null &&
            getPathInStore().equals(other.getPathInStore()))) &&
            getPosition() == other.getPosition() &&
            ((getThumbnail() == null && other.getThumbnail() == null) ||
            (getThumbnail() != null && other.getThumbnail() != null &&
            getThumbnail().equals(other.getThumbnail()))) &&
            getUpdatedAt().equals(other.getUpdatedAt()) &&
            ((getUrlKey() == null && other.getUrlKey() == null) ||
            (getUrlKey() != null && other.getUrlKey() != null &&
            getUrlKey().equals(other.getUrlKey()))) &&
            ((getUrlPath() == null && other.getUrlPath() == null) ||
            (getUrlPath() != null && other.getUrlPath() != null &&
            getUrlPath().equals(other.getUrlPath())));
    }

    @Override
    public org.apache.thrift.TFieldIdEnum fieldForId(final int fieldId) {
        throw new UnsupportedOperationException();
    }

    public Object get(final String fieldName) {
        if (fieldName.equals("category_id")) {
            return getCategoryId();
        } else if (fieldName.equals("children")) {
            return getChildren();
        } else if (fieldName.equals("created_at")) {
            return getCreatedAt();
        } else if (fieldName.equals("description")) {
            return getDescription();
        } else if (fieldName.equals("display_mode")) {
            return getDisplayMode();
        } else if (fieldName.equals("filter_price_range")) {
            return getFilterPriceRange();
        } else if (fieldName.equals("image")) {
            return getImage();
        } else if (fieldName.equals("include_in_menu")) {
            return isIncludeInMenu();
        } else if (fieldName.equals("increment_id")) {
            return getIncrementId();
        } else if (fieldName.equals("is_active")) {
            return isActive();
        } else if (fieldName.equals("is_anchor")) {
            return isAnchor();
        } else if (fieldName.equals("landing_page")) {
            return getLandingPage();
        } else if (fieldName.equals("level")) {
            return getLevel();
        } else if (fieldName.equals("meta_description")) {
            return getMetaDescription();
        } else if (fieldName.equals("meta_keywords")) {
            return getMetaKeywords();
        } else if (fieldName.equals("meta_title")) {
            return getMetaTitle();
        } else if (fieldName.equals("name")) {
            return getName();
        } else if (fieldName.equals("page_layout")) {
            return getPageLayout();
        } else if (fieldName.equals("parent_id")) {
            return getParentId();
        } else if (fieldName.equals("path")) {
            return getPath();
        } else if (fieldName.equals("path_in_store")) {
            return getPathInStore();
        } else if (fieldName.equals("position")) {
            return getPosition();
        } else if (fieldName.equals("thumbnail")) {
            return getThumbnail();
        } else if (fieldName.equals("updated_at")) {
            return getUpdatedAt();
        } else if (fieldName.equals("url_key")) {
            return getUrlKey();
        } else if (fieldName.equals("url_path")) {
            return getUrlPath();
        }
        return null;
    }

    public final int getCategoryId() {
        return categoryId;
    }

    public final com.google.common.collect.ImmutableList<com.yogento.api.models.catalog.category.magento.MagentoCategory> getChildren() {
        return children;
    }

    public final org.joda.time.DateTime getCreatedAt() {
        return createdAt;
    }

    public final String getDescription() {
        return description;
    }

    public final com.yogento.api.models.catalog.category.magento.MagentoCategoryDisplayMode getDisplayMode() {
        return displayMode;
    }

    @Override
    public Object getFieldValue(final org.apache.thrift.TFieldIdEnum field) {
        throw new UnsupportedOperationException();
    }

    public final String getFilterPriceRange() {
        return filterPriceRange;
    }

    public final String getImage() {
        return image;
    }

    public final String getIncrementId() {
        return incrementId;
    }

    public final String getLandingPage() {
        return landingPage;
    }

    public final int getLevel() {
        return level;
    }

    public final String getMetaDescription() {
        return metaDescription;
    }

    public final String getMetaKeywords() {
        return metaKeywords;
    }

    public final String getMetaTitle() {
        return metaTitle;
    }

    public final String getName() {
        return name;
    }

    public final String getPageLayout() {
        return pageLayout;
    }

    public final int getParentId() {
        return parentId;
    }

    public final String getPath() {
        return path;
    }

    public final String getPathInStore() {
        return pathInStore;
    }

    public final int getPosition() {
        return position;
    }

    public final String getThumbnail() {
        return thumbnail;
    }

    public final org.joda.time.DateTime getUpdatedAt() {
        return updatedAt;
    }

    public final String getUrlKey() {
        return urlKey;
    }

    public final String getUrlPath() {
        return urlPath;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + ((int)getCategoryId());
        if (getChildren() != null) {
            hashCode = 31 * hashCode + getChildren().hashCode();
        }
        hashCode = 31 * hashCode + getCreatedAt().hashCode();
        if (getDescription() != null) {
            hashCode = 31 * hashCode + getDescription().hashCode();
        }
        if (getDisplayMode() != null) {
            hashCode = 31 * hashCode + getDisplayMode().ordinal();
        }
        if (getFilterPriceRange() != null) {
            hashCode = 31 * hashCode + getFilterPriceRange().hashCode();
        }
        if (getImage() != null) {
            hashCode = 31 * hashCode + getImage().hashCode();
        }
        if (isIncludeInMenu() != null) {
            hashCode = 31 * hashCode + (isIncludeInMenu() ? 1 : 0);
        }
        if (getIncrementId() != null) {
            hashCode = 31 * hashCode + getIncrementId().hashCode();
        }
        hashCode = 31 * hashCode + (isActive() ? 1 : 0);
        if (isAnchor() != null) {
            hashCode = 31 * hashCode + (isAnchor() ? 1 : 0);
        }
        if (getLandingPage() != null) {
            hashCode = 31 * hashCode + getLandingPage().hashCode();
        }
        hashCode = 31 * hashCode + ((int)getLevel());
        if (getMetaDescription() != null) {
            hashCode = 31 * hashCode + getMetaDescription().hashCode();
        }
        if (getMetaKeywords() != null) {
            hashCode = 31 * hashCode + getMetaKeywords().hashCode();
        }
        if (getMetaTitle() != null) {
            hashCode = 31 * hashCode + getMetaTitle().hashCode();
        }
        if (getName() != null) {
            hashCode = 31 * hashCode + getName().hashCode();
        }
        if (getPageLayout() != null) {
            hashCode = 31 * hashCode + getPageLayout().hashCode();
        }
        hashCode = 31 * hashCode + ((int)getParentId());
        hashCode = 31 * hashCode + getPath().hashCode();
        if (getPathInStore() != null) {
            hashCode = 31 * hashCode + getPathInStore().hashCode();
        }
        hashCode = 31 * hashCode + ((int)getPosition());
        if (getThumbnail() != null) {
            hashCode = 31 * hashCode + getThumbnail().hashCode();
        }
        hashCode = 31 * hashCode + getUpdatedAt().hashCode();
        if (getUrlKey() != null) {
            hashCode = 31 * hashCode + getUrlKey().hashCode();
        }
        if (getUrlPath() != null) {
            hashCode = 31 * hashCode + getUrlPath().hashCode();
        }
        return hashCode;
    }

    public final boolean isActive() {
        return isActive;
    }

    public final Boolean isAnchor() {
        return isAnchor;
    }

    public final Boolean isIncludeInMenu() {
        return includeInMenu;
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
        helper.add("category_id", getCategoryId());
        if (getChildren() != null) {
            helper.add("children", getChildren());
        }
        helper.add("created_at", getCreatedAt());
        if (getDescription() != null) {
            helper.add("description", getDescription());
        }
        if (getDisplayMode() != null) {
            helper.add("display_mode", getDisplayMode());
        }
        if (getFilterPriceRange() != null) {
            helper.add("filter_price_range", getFilterPriceRange());
        }
        if (getImage() != null) {
            helper.add("image", getImage());
        }
        if (isIncludeInMenu() != null) {
            helper.add("include_in_menu", isIncludeInMenu());
        }
        if (getIncrementId() != null) {
            helper.add("increment_id", getIncrementId());
        }
        helper.add("is_active", isActive());
        if (isAnchor() != null) {
            helper.add("is_anchor", isAnchor());
        }
        if (getLandingPage() != null) {
            helper.add("landing_page", getLandingPage());
        }
        helper.add("level", getLevel());
        if (getMetaDescription() != null) {
            helper.add("meta_description", getMetaDescription());
        }
        if (getMetaKeywords() != null) {
            helper.add("meta_keywords", getMetaKeywords());
        }
        if (getMetaTitle() != null) {
            helper.add("meta_title", getMetaTitle());
        }
        if (getName() != null) {
            helper.add("name", getName());
        }
        if (getPageLayout() != null) {
            helper.add("page_layout", getPageLayout());
        }
        helper.add("parent_id", getParentId());
        helper.add("path", getPath());
        if (getPathInStore() != null) {
            helper.add("path_in_store", getPathInStore());
        }
        helper.add("position", getPosition());
        if (getThumbnail() != null) {
            helper.add("thumbnail", getThumbnail());
        }
        helper.add("updated_at", getUpdatedAt());
        if (getUrlKey() != null) {
            helper.add("url_key", getUrlKey());
        }
        if (getUrlPath() != null) {
            helper.add("url_path", getUrlPath());
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
                oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.VOID, 26));

                oprot.writeI32(getCategoryId());

                if (getChildren() != null) {
                    oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, getChildren().size()));
                    for (com.yogento.api.models.catalog.category.magento.MagentoCategory _iter0 : getChildren()) {
                        _iter0.write(oprot);
                    }
                    oprot.writeListEnd();
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDateTime(getCreatedAt()); } else { oprot.writeI64(getCreatedAt().getMillis()); }

                if (getDescription() != null) {
                    oprot.writeString(getDescription());
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getDisplayMode() != null) {
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeEnum(getDisplayMode()); } else { oprot.writeString(getDisplayMode().toString()); }
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getFilterPriceRange() != null) {
                    oprot.writeString(getFilterPriceRange());
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getImage() != null) {
                    oprot.writeString(getImage());
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (isIncludeInMenu() != null) {
                    oprot.writeBool(isIncludeInMenu());
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getIncrementId() != null) {
                    oprot.writeString(getIncrementId());
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                oprot.writeBool(isActive());

                if (isAnchor() != null) {
                    oprot.writeBool(isAnchor());
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getLandingPage() != null) {
                    oprot.writeString(getLandingPage());
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                oprot.writeI32(getLevel());

                if (getMetaDescription() != null) {
                    oprot.writeString(getMetaDescription());
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getMetaKeywords() != null) {
                    oprot.writeString(getMetaKeywords());
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getMetaTitle() != null) {
                    oprot.writeString(getMetaTitle());
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getName() != null) {
                    oprot.writeString(getName());
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getPageLayout() != null) {
                    oprot.writeString(getPageLayout());
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                oprot.writeI32(getParentId());

                oprot.writeString(getPath());

                if (getPathInStore() != null) {
                    oprot.writeString(getPathInStore());
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                oprot.writeI32(getPosition());

                if (getThumbnail() != null) {
                    oprot.writeString(getThumbnail());
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDateTime(getUpdatedAt()); } else { oprot.writeI64(getUpdatedAt().getMillis()); }

                if (getUrlKey() != null) {
                    oprot.writeString(getUrlKey());
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getUrlPath() != null) {
                    oprot.writeString(getUrlPath());
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                oprot.writeListEnd();
                break;

            case org.apache.thrift.protocol.TType.STRUCT:
            default:
                oprot.writeStructBegin(new org.apache.thrift.protocol.TStruct("MagentoCategory"));

                oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("category_id", org.apache.thrift.protocol.TType.I32, (short)-1));
                oprot.writeI32(getCategoryId());
                oprot.writeFieldEnd();

                if (getChildren() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("children", org.apache.thrift.protocol.TType.LIST, (short)-1));
                    oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, getChildren().size()));
                    for (com.yogento.api.models.catalog.category.magento.MagentoCategory _iter0 : getChildren()) {
                        _iter0.write(oprot);
                    }
                    oprot.writeListEnd();
                    oprot.writeFieldEnd();
                }

                oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("created_at", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDateTime(getCreatedAt()); } else { oprot.writeI64(getCreatedAt().getMillis()); }
                oprot.writeFieldEnd();

                if (getDescription() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("description", org.apache.thrift.protocol.TType.STRING, (short)-1));
                    oprot.writeString(getDescription());
                    oprot.writeFieldEnd();
                }

                if (getDisplayMode() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("display_mode", org.apache.thrift.protocol.TType.STRING, (short)-1));
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeEnum(getDisplayMode()); } else { oprot.writeString(getDisplayMode().toString()); }
                    oprot.writeFieldEnd();
                }

                if (getFilterPriceRange() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("filter_price_range", org.apache.thrift.protocol.TType.STRING, (short)-1));
                    oprot.writeString(getFilterPriceRange());
                    oprot.writeFieldEnd();
                }

                if (getImage() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("image", org.apache.thrift.protocol.TType.STRING, (short)-1));
                    oprot.writeString(getImage());
                    oprot.writeFieldEnd();
                }

                if (isIncludeInMenu() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("include_in_menu", org.apache.thrift.protocol.TType.BOOL, (short)-1));
                    oprot.writeBool(isIncludeInMenu());
                    oprot.writeFieldEnd();
                }

                if (getIncrementId() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("increment_id", org.apache.thrift.protocol.TType.STRING, (short)-1));
                    oprot.writeString(getIncrementId());
                    oprot.writeFieldEnd();
                }

                oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("is_active", org.apache.thrift.protocol.TType.BOOL, (short)-1));
                oprot.writeBool(isActive());
                oprot.writeFieldEnd();

                if (isAnchor() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("is_anchor", org.apache.thrift.protocol.TType.BOOL, (short)-1));
                    oprot.writeBool(isAnchor());
                    oprot.writeFieldEnd();
                }

                if (getLandingPage() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("landing_page", org.apache.thrift.protocol.TType.STRING, (short)-1));
                    oprot.writeString(getLandingPage());
                    oprot.writeFieldEnd();
                }

                oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("level", org.apache.thrift.protocol.TType.I32, (short)-1));
                oprot.writeI32(getLevel());
                oprot.writeFieldEnd();

                if (getMetaDescription() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("meta_description", org.apache.thrift.protocol.TType.STRING, (short)-1));
                    oprot.writeString(getMetaDescription());
                    oprot.writeFieldEnd();
                }

                if (getMetaKeywords() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("meta_keywords", org.apache.thrift.protocol.TType.STRING, (short)-1));
                    oprot.writeString(getMetaKeywords());
                    oprot.writeFieldEnd();
                }

                if (getMetaTitle() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("meta_title", org.apache.thrift.protocol.TType.STRING, (short)-1));
                    oprot.writeString(getMetaTitle());
                    oprot.writeFieldEnd();
                }

                if (getName() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("name", org.apache.thrift.protocol.TType.STRING, (short)-1));
                    oprot.writeString(getName());
                    oprot.writeFieldEnd();
                }

                if (getPageLayout() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("page_layout", org.apache.thrift.protocol.TType.STRING, (short)-1));
                    oprot.writeString(getPageLayout());
                    oprot.writeFieldEnd();
                }

                oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("parent_id", org.apache.thrift.protocol.TType.I32, (short)-1));
                oprot.writeI32(getParentId());
                oprot.writeFieldEnd();

                oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("path", org.apache.thrift.protocol.TType.STRING, (short)-1));
                oprot.writeString(getPath());
                oprot.writeFieldEnd();

                if (getPathInStore() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("path_in_store", org.apache.thrift.protocol.TType.STRING, (short)-1));
                    oprot.writeString(getPathInStore());
                    oprot.writeFieldEnd();
                }

                oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("position", org.apache.thrift.protocol.TType.I32, (short)-1));
                oprot.writeI32(getPosition());
                oprot.writeFieldEnd();

                if (getThumbnail() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("thumbnail", org.apache.thrift.protocol.TType.STRING, (short)-1));
                    oprot.writeString(getThumbnail());
                    oprot.writeFieldEnd();
                }

                oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("updated_at", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDateTime(getUpdatedAt()); } else { oprot.writeI64(getUpdatedAt().getMillis()); }
                oprot.writeFieldEnd();

                if (getUrlKey() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("url_key", org.apache.thrift.protocol.TType.STRING, (short)-1));
                    oprot.writeString(getUrlKey());
                    oprot.writeFieldEnd();
                }

                if (getUrlPath() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("url_path", org.apache.thrift.protocol.TType.STRING, (short)-1));
                    oprot.writeString(getUrlPath());
                    oprot.writeFieldEnd();
                }

                oprot.writeFieldStop();

                oprot.writeStructEnd();
                break;
        }
    }

    private final int categoryId;
    private final com.google.common.collect.ImmutableList<com.yogento.api.models.catalog.category.magento.MagentoCategory> children;
    private final org.joda.time.DateTime createdAt;
    private final String description;
    private final com.yogento.api.models.catalog.category.magento.MagentoCategoryDisplayMode displayMode;
    private final String filterPriceRange;
    private final String image;
    private final Boolean includeInMenu;
    private final String incrementId;
    private final boolean isActive;
    private final Boolean isAnchor;
    private final String landingPage;
    private final int level;
    private final String metaDescription;
    private final String metaKeywords;
    private final String metaTitle;
    private final String name;
    private final String pageLayout;
    private final int parentId;
    private final String path;
    private final String pathInStore;
    private final int position;
    private final String thumbnail;
    private final org.joda.time.DateTime updatedAt;
    private final String urlKey;
    private final String urlPath;
}
