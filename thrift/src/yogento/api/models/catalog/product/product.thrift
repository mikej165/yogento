namespace java com.yogento.api.models.catalog.product
namespace py yogento.api.models.catalog.product

include "yogento/api/models/catalog/product/magento/magento_product.thrift"

struct Product {
    required magento_product.MagentoProduct magento_product;
}
