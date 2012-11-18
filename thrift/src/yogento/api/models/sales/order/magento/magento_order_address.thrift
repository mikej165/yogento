namespace java com.yogento.api.models.sales.order.magento
namespace py yogento.api.models.sales.order.magento

include "yogento/api/models/sales/order/magento/magento_order_address_type.thrift"

struct MagentoOrderAddress {
	optional magento_order_address_type.MagentoOrderAddressType address_type;
	optional string city;
	optional string company;
	optional string country_id;
	optional string email;
	optional string fax;
	optional string firstname;
	optional string lastname;
	optional string middlename;
	optional string postcode;
	optional string prefix;
	optional string region;
	optional string street;
	optional string suffix;
	optional string telephone;
}
