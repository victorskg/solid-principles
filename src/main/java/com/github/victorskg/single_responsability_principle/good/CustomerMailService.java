package main.java.com.github.victorskg.single_responsability_principle.good;

import main.java.com.github.victorskg.single_responsability_principle.Customer;

import java.util.List;

import static java.lang.String.format;

public class CustomerMailService {

    MailService mailService = new MailService();
    CustomerService customerService = new CustomerService();

    public void sendMailToCustomers(List<Customer> customers) {
        customers.stream().filter(customerService::activeCustomers).
                forEach(this::sendMailToCustomer);
    }

    public void sendMailToCustomer(Customer customer) {
        var mailContent = buildMailContent(customer);
        mailService.sendMail(mailContent, customer.getEmail());
    }

    private String buildMailContent(Customer customer) {
        return format("Email do cliente de ID: %d e NOME: %s.", customer.getId(), customer.getName());
    }

}
