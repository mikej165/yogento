namespace java com.yogento.api.services.sales
namespace py yogento.api.services.sales

include "yogento/api/models/sales/order/order.thrift"
include "yogento/api/services/sales/no_such_order_exception.thrift"

service SalesService {
    bool delete_order_by_increment_id(string increment_id);
    set<string> get_order_increment_ids();
    order.Order get_order_by_increment_id(string increment_id) throws (no_such_order_exception.NoSuchOrderException e);
    bool head_order_by_increment_id(string increment_id);
    void put_order(order.Order order);
    void put_orders(set<order.Order> orders);    
}
