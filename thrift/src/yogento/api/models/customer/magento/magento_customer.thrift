namespace java com.yogento.api.models.customer.magento
namespace py yogento.api.models.customer.magento

include "thryft/util/date_time.thrift"
include "yogento/api/models/customer/magento/magento_customer_address.thrift"

struct MagentoCustomer {
    optional set<magento_customer_address.MagentoCustomerAddress> addresses;
    required date_time.DateTime created_at;
    optional bool confirmation;
    optional i32 customer_id;
    optional string dob;
    optional string email;
    optional string firstname;
    optional i32 group_id;
    required string increment_id;
    optional string lastname;
    optional string middlename;
    optional string prefix;
    optional string suffix;
    optional i32 store_id;
    optional string taxvat;    
    required date_time.DateTime updated_at;
    optional i32 website_id;
}
