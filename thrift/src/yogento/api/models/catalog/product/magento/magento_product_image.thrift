namespace java com.yogento.api.models.catalog.product.magento
namespace py yogento.api.models.catalog.product.magento

include "yogento/api/models/catalog/product/magento/magento_product_image_type.thrift"

struct MagentoProductImage {
    optional bool exclude;
    required string file;
    optional string label;
    optional i32 position;
    optional set<magento_product_image_type.MagentoProductImageType> types;
    optional string url;
}
