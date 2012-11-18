namespace java com.yogento.api.models.catalog.category.magento
namespace py yogento.api.models.catalog.category.magento

include "thryft/util/date_time.thrift"
include "yogento/api/models/catalog/category/magento/magento_category_display_mode.thrift"

struct MagentoCategory {
	required i32 category_id;
	optional list<magento_category.MagentoCategory> children;
	required date_time.DateTime created_at;
	optional string description; 
	optional magento_category_display_mode.MagentoCategoryDisplayMode display_mode;
	optional string filter_price_range;
	optional string image;
	optional bool include_in_menu;
	optional string increment_id;
	required bool is_active;
	optional bool is_anchor;
	optional string landing_page;
	required i32 level;
	optional string meta_description; 
	optional string meta_keywords; 
	optional string meta_title; 
	optional string name;
	optional string page_layout; 
	required i32 parent_id;
	required string path;
	optional string path_in_store;
	required i32 position;
	optional string thumbnail;
	required date_time.DateTime updated_at;
	optional string url_key;
	optional string url_path;
}
