package com.yogento.api.services.customer;

public interface CustomerService {
    public boolean deleteCustomerByIncrementId(String incrementId);
    public com.yogento.api.models.customer.Customer getCustomerByIncrementId(String incrementId) throws com.yogento.api.services.customer.NoSuchCustomerException;
    public com.google.common.collect.ImmutableSet<String> getCustomerIncrementIds();
    public com.google.common.collect.ImmutableSet<com.yogento.api.models.customer.Customer> getCustomers();
    public boolean headCustomerByIncrementId(String incrementId);
    public void putCustomer(com.yogento.api.models.customer.Customer customer);
    public void putCustomers(com.google.common.collect.ImmutableSet<com.yogento.api.models.customer.Customer> customers);
}
