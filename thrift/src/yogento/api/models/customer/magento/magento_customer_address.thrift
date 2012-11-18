namespace java com.yogento.api.models.customer.magento
namespace py yogento.api.models.customer.magento

include "thryft/util/date_time.thrift"

struct MagentoCustomerAddress {
	required string city;
	required string country_id;
	required date_time.DateTime created_at;
	optional i32 customer_address_id;
	required string firstname;
	optional bool is_default_billing;
	optional bool is_default_shipping;
	required string lastname;
	required string postcode;
	required string region;
	optional i32 region_id;
	required string street;
	required string telephone;
	optional date_time.DateTime updated_at;
}
