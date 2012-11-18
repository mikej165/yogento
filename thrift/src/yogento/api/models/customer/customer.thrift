namespace java com.yogento.api.models.customer
namespace py yogento.api.models.customer

include "yogento/api/models/customer/magento/magento_customer.thrift"

struct Customer {
    required magento_customer.MagentoCustomer magento_customer;
}
