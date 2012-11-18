from xmlrpclib import Fault
from yogento.api.models.customer.customer import Customer
from yogento.api.models.customer.magento.magento_customer import MagentoCustomer
from yogento.api.services.customer.customer_service import CustomerService
from yogento.api.services.customer.no_such_customer_exception import \
    NoSuchCustomerException
from yogento.client.protocols.magento_xmlrpc_protocol import \
    MagentoXmlrpcProtocol
from yogento.client.services._magento_xmlrpc_service import \
    _MagentoXmlrpcService


class MagentoXmlrpcCustomerService(_MagentoXmlrpcService , CustomerService):
    def _get_customer_by_increment_id(self, increment_id):
        with self._magento_xmlrpc_api_client.login() as magento_api:
            try:
                customer_dict = magento_api.customer.info(increment_id)
                try:
                    customer_dict['addresses'] = \
                        self.__get_customer_addresses(
                            customer_dict['customer_id'],
                            magento_api
                        )
                except NoSuchCustomerException:
                    pass
            except Fault, fault:
                if fault.faultCode == 102:
                    raise NoSuchCustomerException
                else:
                    raise
            return Customer(MagentoCustomer.read(MagentoXmlrpcProtocol(customer_dict)))

    def _get_customer_increment_ids(self):
        with self._magento_xmlrpc_api_client.login() as magento_api:
            customer_dict_list = magento_api.customer.list()
            return tuple([customer_dict['increment_id']
                          for customer_dict in customer_dict_list])

    def _get_customers(self):
        with self._magento_xmlrpc_api_client.login() as magento_api:
            customer_dict_list = magento_api.order.list()
            for customer_dict in customer_dict_list:
                try:
                    customer_dict['addresses'] = \
                        self.__get_customer_addresses(
                            customer_dict['customer_id'],
                            magento_api
                        )
                except NoSuchCustomerException:
                    pass
            iprot = MagentoXmlrpcProtocol(customer_dict_list)
            customers = [Customer(MagentoCustomer.read(iprot))
                         for _ in xrange(iprot.readListBegin()[1])]
            iprot.readListEnd()
            return tuple(customers)

    def __get_customer_addresses(self, customer_id, magento_api):
        try:
            return magento_api.customer_address.list(customer_id)
        except Fault, fault:
            if fault.faultCode == 102:
                raise NoSuchCustomerException
            else:
                raise

    def _head_customer_by_increment_id(self, increment_id):
        try:
            self._get_customer_by_increment_id(increment_id)
            return True
        except NoSuchCustomerException:
            return False
