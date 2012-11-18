package com.yogento.api.services.sales;

public interface SalesService {
    public boolean deleteOrderByIncrementId(String incrementId);
    public com.google.common.collect.ImmutableSet<String> getOrderIncrementIds();
    public com.yogento.api.models.sales.order.Order getOrderByIncrementId(String incrementId) throws com.yogento.api.services.sales.NoSuchOrderException;
    public boolean headOrderByIncrementId(String incrementId);
    public void putOrder(com.yogento.api.models.sales.order.Order order);
    public void putOrders(com.google.common.collect.ImmutableSet<com.yogento.api.models.sales.order.Order> orders);
}
