namespace java com.yogento.api.models.sales.order.magento
namespace py yogento.api.models.sales.order.magento

include "thryft/util/date_time.thrift"
include "yogento/api/models/sales/order/magento/magento_order_status.thrift"

struct MagentoOrderStatusHistory {
	optional string comment;
	required date_time.DateTime created_at;
	optional string entity_name;
	optional bool is_customer_notified;
	optional bool is_visible_on_front;
	optional i32 parent_id;
	required magento_order_status.MagentoOrderStatus status;
	optional i32 store_id;
}
