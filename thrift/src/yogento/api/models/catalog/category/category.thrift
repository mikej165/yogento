namespace java com.yogento.api.models.catalog.category
namespace py yogento.api.models.catalog.category

include "yogento/api/models/catalog/category/magento/magento_category.thrift"

struct Category {
    required magento_category.MagentoCategory magento_category;
}
