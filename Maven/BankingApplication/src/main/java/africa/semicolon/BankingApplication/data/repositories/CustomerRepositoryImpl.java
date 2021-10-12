package africa.semicolon.BankingApplication.data.repositories;

import africa.semicolon.BankingApplication.data.models.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepositoryImpl implements CustomerRepository{
    List<Customer> customers = new ArrayList<>();

    @Override
    public Customer save(Customer customer) {
        customers.add(customer);
        return findById(customer.getBvn());
    }

    @Override
    public Customer findById(String id) {
        for (Customer customer : customers) {
            if (customer.getBvn().equalsIgnoreCase(id)) return customer;
        }
        return null;
    }

    @Override
    public void delete(Customer customer) {

    }

    @Override
    public void delete(String id) {

    }

    @Override
    public List<Customer> findAll() {
        return null;
    }
}
