package main.java.com.github.victorskg.single_responsability_principle.good;

import main.java.com.github.victorskg.single_responsability_principle.Customer;
import main.java.com.github.victorskg.single_responsability_principle.CustomerRepository;

public class CustomerService {

    CustomerRepository customerRepository = new CustomerRepository();

    public Customer findById(Integer id) {
        return customerRepository.findById(id);
    }

    public boolean activeCustomers(Customer customer) {
        var dbCustomer = findById(customer.getId());
        return dbCustomer.isActive();
    }

}
