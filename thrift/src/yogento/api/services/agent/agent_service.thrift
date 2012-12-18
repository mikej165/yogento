namespace java com.yogento.api.services.agent
namespace py yogento.api.services.agent

include "yogento/api/services/agent/agent_exception.thrift"
include "yogento/api/models/catalog/product/magento/magento_product.thrift"

service AgentService {
    set<magento_product.MagentoProduct> get_agent_magento_products(optional bool sync) throws (agent_exception.AgentException e);
    void put_agent_magento_products(required string magento_products_json, required string ticket, required string username);
}
