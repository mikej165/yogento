from yogento.api.models.customer.customer import Customer
from yogento.client.services._yogento_rest_service import _YogentoRestService
from yogento.api.services.customer.customer_service import CustomerService


class YogentoRestCustomerService(_YogentoRestService, CustomerService):
    def _delete_customer_by_increment_id(self, increment_id):
        return self._delete_model('/customers/' + increment_id)

    def _get_customer_by_increment_id(self, increment_id):
        return self._get_model(Customer, '/customers/' + increment_id)

    def _get_customer_increment_ids(self):
        return self._get_string_set('/customers/increment_ids')

    def _head_customer_by_increment_id(self, increment_id):
        return self._head_model('/customers/' + increment_id)

    def _put_customer(self, customer):
        return self._put_model(customer, '/customers/' + customer.increment_id)

    def _put_customers(self, customers):
        return self._put_model_set(customers, '/customers')
