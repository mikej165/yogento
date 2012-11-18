namespace java com.yogento.api.models.sales.order
namespace py yogento.api.models.sales.order

include "yogento/api/models/sales/order/magento/magento_order.thrift"

struct Order {
    required magento_order.MagentoOrder magento_order;
}
