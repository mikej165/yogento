namespace java com.yogento.api.models.user_settings
namespace * yogento.api.models.user_settings

include "thryft/native/date_time.thrift"
include "thryft/native/email_address.thrift"
include "thryft/native/url.thrift"

struct UserSettings {
    /**
     *  @validation {"minLength": 1}
     */
    optional string display_name;

    /**
     * @validation {"pattern": "email"}
     */
    optional email_address.EmailAddress email;

    /**
     * @validation {"pattern": "url"}
     */
    optional url.Url logo_image_url;

    /**
     *@validation {"pattern": "url"}
     */
    optional url.Url magento_store_url;

    optional date_time.DateTime products_mtime;

    optional list<string> product_search_queries;

    optional bool use_sample_data;
}

