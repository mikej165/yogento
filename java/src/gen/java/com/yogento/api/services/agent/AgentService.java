package com.yogento.api.services.agent;

public interface AgentService {
    public com.google.common.collect.ImmutableSet<com.yogento.api.models.catalog.product.magento.MagentoProduct> getAgentMagentoProducts(Boolean sync) throws com.yogento.api.services.agent.AgentException;
    public void putAgentMagentoProducts(String magentoProductsJson, String ticket, String username);
}
