namespace java com.yogento.api.services.catalog
namespace py yogento.api.services.catalog

include "yogento/api/models/catalog/category/category.thrift"
include "yogento/api/models/catalog/product/product.thrift"
include "yogento/api/services/catalog/no_such_category_exception.thrift"
include "yogento/api/services/catalog/no_such_product_exception.thrift"

service CatalogService {
    bool delete_category_tree();
    bool delete_product_by_sku(string sku);
    void delete_products();
    
    category.Category get_category_tree() throws (no_such_category_exception.NoSuchCategoryException e);
    	
    set<product.Product> get_products(optional bool include_disabled, optional string query);
    i32 get_product_count();
    set<string> get_product_skus();
    product.Product get_product_by_sku(string sku) throws (no_such_product_exception.NoSuchProductException e);
    set<product.Product> get_products_by_skus(set<string> skus) throws (no_such_product_exception.NoSuchProductException e);
        
    bool head_product_by_sku(string sku);
    
    void put_category_tree(category.Category category_tree);
    void put_product(product.Product product);
    void put_products(set<product.Product> products);
}
