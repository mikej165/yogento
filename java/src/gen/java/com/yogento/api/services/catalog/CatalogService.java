package com.yogento.api.services.catalog;

public interface CatalogService {
    public boolean deleteCategoryTree();
    public boolean deleteProductBySku(String sku);
    public void deleteProducts();
    public com.yogento.api.models.catalog.category.Category getCategoryTree() throws com.yogento.api.services.catalog.NoSuchCategoryException;
    public com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.Product> getProducts(Boolean includeDisabled, String query);
    public int getProductCount();
    public com.google.common.collect.ImmutableSet<String> getProductSkus();
    public com.yogento.api.models.catalog.product.Product getProductBySku(String sku) throws com.yogento.api.services.catalog.NoSuchProductException;
    public com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.Product> getProductsBySkus(com.google.common.collect.ImmutableSet<String> skus) throws com.yogento.api.services.catalog.NoSuchProductException;
    public boolean headProductBySku(String sku);
    public void putCategoryTree(com.yogento.api.models.catalog.category.Category categoryTree);
    public void putProduct(com.yogento.api.models.catalog.product.Product product);
    public void putProducts(com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.Product> products);
}
