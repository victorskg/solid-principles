package main.java.com.github.victorskg.single_responsability_principle.bad;

import main.java.com.github.victorskg.single_responsability_principle.Customer;
import main.java.com.github.victorskg.single_responsability_principle.CustomerRepository;

import java.util.List;

import static java.lang.String.format;

public class MailService {

    CustomerRepository customerRepository = new CustomerRepository();

    public Customer findCustomerById(Integer id) {
        return customerRepository.findById(id);
    }

    // Bad Function Code
    public void sendMailToCustomersBadCode(List<Customer> customers) {
        for (var customer : customers) {
            var dbCustomer = findCustomerById(customer.getId());
            if (dbCustomer.isActive()) {
                var mailContent = format("Email do cliente de ID: %d e NOME: %s.", customer.getId(), customer.getName());
                // Lógica de envio de email.
                System.out.println("Email enviado para: " + customer.getEmail());
                System.out.println("Conteúdo: " + mailContent);
            }
        }
    }

    // Good Function Code
    public void sendMailToCustomersGoodCode(List<Customer> customers) {
        customers.stream().filter(this::activeCustomers).
                forEach(this::sendMailToCustomer);
    }

    public boolean activeCustomers(Customer customer) {
        var dbCustomer = findCustomerById(customer.getId());
        return dbCustomer.isActive();
    }

    public void sendMailToCustomer(Customer customer) {
        var mailContent = buildMailContent(customer);
        sendMail(mailContent, customer.getEmail());
    }

    public String buildMailContent(Customer customer) {
        return format("Email do cliente de ID: %d e NOME: %s.", customer.getId(), customer.getName());
    }

    public void sendMail(String content, String to) {
        // Lógica de envio de email.
        System.out.println("Email enviado para: " + to);
        System.out.println("Conteúdo: " + content);
    }

}
