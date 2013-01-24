namespace java com.yogento.api.services.catalog
namespace py yogento.api.services.catalog

include "yogento/api/models/catalog/category/category.thrift"
include "yogento/api/models/catalog/product/product.thrift"
include "yogento/api/models/image/image_resolution.thrift"
include "yogento/api/services/catalog/no_such_category_exception.thrift"
include "yogento/api/services/catalog/no_such_product_exception.thrift"
include "yogento/api/services/catalog/no_such_product_image_exception.thrift"

service CatalogService {
    bool delete_category_tree();
    bool delete_product_by_sku(string sku);
    void delete_products();
    
    category.Category get_category_tree() throws (no_such_category_exception.NoSuchCategoryException e);
    	
    i32 get_product_count();
    product.Product get_product_by_sku(string sku) throws (no_such_product_exception.NoSuchProductException e);
    set<product.Product> get_products(optional bool include_disabled, optional string query);
    set<string> get_product_skus();
    set<product.Product> get_products_by_skus(set<string> skus) throws (no_such_product_exception.NoSuchProductException e);
    string get_product_thumbnail_url(string sku, image_resolution.ImageResolution thumbnail_resolution) throws (no_such_product_exception.NoSuchProductException e1, no_such_product_image_exception.NoSuchProductImageException e1);

    string get_sample_product_thumbnail_url(string sku, image_resolution.ImageResolution thumbnail_resolution) throws (no_such_product_exception.NoSuchProductException e1, no_such_product_image_exception.NoSuchProductImageException e1);
    product.Product get_sample_product_by_sku(string sku) throws (no_such_product_exception.NoSuchProductException e);
    set<product.Product> get_sample_products();
        
    bool head_product_by_sku(string sku);
    
    void put_category_tree(category.Category category_tree);
    void put_product(product.Product product);
    void put_products(set<product.Product> products);
}
