package com.yogento.api.services.catalog;

public interface CatalogService {
    public boolean deleteCategoryTree();
    public boolean deleteProductBySku(String sku);
    public void deleteProducts();
    public com.yogento.api.models.catalog.category.Category getCategoryTree() throws com.yogento.api.services.catalog.NoSuchCategoryException;
    public int getProductCount();
    public com.yogento.api.models.catalog.product.Product getProductBySku(String sku) throws com.yogento.api.services.catalog.NoSuchProductException;
    public com.google.common.collect.ImmutableSet<String> getProductSkus();
    public com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.Product> getProducts(Boolean includeDisabled, String query);
    public com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.Product> getProductsBySkus(com.google.common.collect.ImmutableSet<String> skus) throws com.yogento.api.services.catalog.NoSuchProductException;
    public String getProductThumbnailUrl(String sku, com.yogento.api.models.image.ImageResolution thumbnailResolution) throws com.yogento.api.services.catalog.NoSuchProductException, com.yogento.api.services.catalog.NoSuchProductImageException;
    public boolean headProductBySku(String sku);
    public void putCategoryTree(com.yogento.api.models.catalog.category.Category categoryTree);
    public void putProduct(com.yogento.api.models.catalog.product.Product product);
    public void putProducts(com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.Product> products);
}
