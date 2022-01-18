package main.java.com.github.victorskg.single_responsability_principle;

import main.java.com.github.victorskg.single_responsability_principle.bad.MailService;
import main.java.com.github.victorskg.single_responsability_principle.good.CustomerMailService;

public class SingleResponsibilityPrinciple {

    // Uma classe ou método deve se propor a exercer uma, e somente uma, função ou propósito.

    public static void main(String[] args) {
        var customers = new CustomerRepository().findAll();

        // Bad Code
        var mailService = new MailService();

        // Bad Function Code
        System.out.println("Bad Function Code: ");
        mailService.sendMailToCustomersBadCode(customers);

        System.out.println();

        // Good Function Code
        System.out.println("Good Function Code: ");
        mailService.sendMailToCustomersGoodCode(customers);

        System.out.println();

        // Good Code
        var customerMailService = new CustomerMailService();
        System.out.println("Good Code: ");
        customerMailService.sendMailToCustomers(customers);
    }

}
