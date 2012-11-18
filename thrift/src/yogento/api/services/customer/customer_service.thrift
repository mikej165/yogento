namespace java com.yogento.api.services.customer
namespace py yogento.api.services.customer

include "yogento/api/models/customer/customer.thrift"
include "yogento/api/services/customer/no_such_customer_exception.thrift"

service CustomerService {
    bool delete_customer_by_increment_id(string increment_id);
    customer.Customer get_customer_by_increment_id(string increment_id) throws (no_such_customer_exception.NoSuchCustomerException e);
    set<string> get_customer_increment_ids();
    set<customer.Customer> get_customers();
    bool head_customer_by_increment_id(string increment_id);
    void put_customer(customer.Customer customer);
    void put_customers(set<customer.Customer> customers);
}
