package main.java.com.github.victorskg.single_responsability_principle;

import java.util.List;
import java.util.NoSuchElementException;

import static java.lang.String.format;

public class CustomerRepository {

    private final List<Customer> customers = List.of(
            new Customer(1, "Cliente 1", "1.email.com", true),
            new Customer(2, "Cliente 2", "2.email.com", true),
            new Customer(3, "Cliente 3", "3.email.com", false)
    );

    public List<Customer> findAll() {
        return customers;
    }

    public Customer findById(Integer id) {
        return customers.stream().filter(c -> c.getId().equals(id)).findAny().orElseThrow(() ->
                new NoSuchElementException(format("Cliente de ID: %d não encontrado na base de dados.", id)));
    }

}
