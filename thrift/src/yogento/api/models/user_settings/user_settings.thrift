namespace java com.yogento.api.models.user_settings
namespace * yogento.api.models.user_settings

include "thryft/util/date_time.thrift"

struct UserSettings {
    /**
     *  @validate {required: false, minLength: 1}
     */
    optional string display_name;


    /**
     * @validate {required: false, pattern: 'email'}
     */
    optional string email;


    /**
     * @validate {required: false, pattern: 'url}
     */
    optional string logo_image_url;


    /**
     *@validate {required: false, pattern: 'url'}
     */
    optional string magento_store_url;

    /**
     * @validate {required: false}
     */
    optional date_time.DateTime products_mtime;

    /**
     * @validate {required: false }
     */
    optional list<string> product_search_queries;

    /**
     * @validate {required: false, oneOf: [true,false]}
     */
    optional bool use_sample_data;
}
