namespace java com.yogento.api.models.user_settings
namespace * yogento.api.models.user_settings

include "thryft/util/date_time.thrift"

struct UserSettings {
    optional string display_name;
    optional string email;
    optional string logo_image_url;
    optional string magento_store_url;
    optional date_time.DateTime products_mtime;
    optional list<string> product_search_queries;
    optional bool use_sample_data;
}
