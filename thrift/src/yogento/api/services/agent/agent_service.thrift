namespace java com.yogento.api.services.agent
namespace gwt_client_java com.yogento.gui.client.services.agent
namespace gwt_server_java com.yogento.gui.server.services.agent
namespace * yogento.api.services.agent

include "yogento/api/services/agent/agent_exception.thrift"
include "yogento/api/models/catalog/product/magento/magento_product.thrift"
include "thryft/native/url.thrift"

service AgentService {
    set<magento_product.MagentoProduct> get_agent_magento_products(optional bool sync) throws (agent_exception.AgentException e);
    bool head_magento_store(url.Url magento_store_url);
    void put_agent_magento_products(string magento_products_json, string ticket, string username);
}
