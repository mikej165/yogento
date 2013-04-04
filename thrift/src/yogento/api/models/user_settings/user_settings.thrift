namespace java com.yogento.api.models.user_settings
namespace * yogento.api.models.user_settings

include "thryft/util/date_time.thrift"

struct UserSettings {
    /**
     *  @validation {"minLength": 1}
     */
    optional string display_name;

    /**
     * @validation {"pattern": "email"}
     */
    optional string email;

    /**
     * @validation {"pattern": "url"}
     */
    optional string logo_image_url;

    /**
     *@validation {"pattern": "url"}
     */
    optional string magento_store_url;

    optional date_time.DateTime products_mtime;

    optional list<string> product_search_queries;

    optional bool use_sample_data;
}

