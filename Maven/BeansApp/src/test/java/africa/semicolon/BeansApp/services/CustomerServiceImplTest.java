package africa.semicolon.BeansApp.services;

import africa.semicolon.BeansApp.data.models.Customer;
import africa.semicolon.BeansApp.dtos.requests.RegisterCustomerRequest;
import africa.semicolon.BeansApp.dtos.responses.RegisterCustomerResponse;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class CustomerServiceImplTest {
    CustomerService customerService;

    @BeforeEach
    void setUp() {
        customerService = new CustomerServiceImpl();
    }

    @AfterEach
    void tearDown() {
        customerService.deleteAllCustomers();
    }

    public RegisterCustomerResponse saveCustomerResponseHelper() {
        RegisterCustomerRequest registerCustomerRequest = new RegisterCustomerRequest();
        registerCustomerRequest.setCustomerEmail("mrchibob@email.com");
        registerCustomerRequest.setCustomerFullName("Uncle Chibob");
        registerCustomerRequest.setCustomerPassword("semicolon001");
        return customerService.registerCustomer(registerCustomerRequest);
    }

    @Test
    void registerCustomer() {
        RegisterCustomerResponse registerCustomerResponse = saveCustomerResponseHelper();
        Customer foundCustomer = customerService.findCustomerByEmail(registerCustomerResponse.getCustomerEmail()).get();

        assertEquals(registerCustomerResponse.getCustomerEmail(),
                customerService.findAllCustomers().get(0).getEmail()
                );
        assertEquals(1, customerService.findAllCustomers().size());
        assertEquals(foundCustomer,
                customerService.findCustomer(customerService.findAllCustomers().get(0)).get()
        );
    }

    @Test
    void findCustomer() {
        RegisterCustomerResponse registerCustomerResponse = saveCustomerResponseHelper();
        Customer foundCustomer = customerService.findCustomerByEmail(registerCustomerResponse.getCustomerEmail()).get();

        assertEquals(registerCustomerResponse.getCustomerEmail(),
                customerService.findCustomer(customerService.findAllCustomers().get(0)).get().getEmail()
        );
        assertEquals(foundCustomer,
                customerService.findCustomer(customerService.findAllCustomers().get(0)).get()
        );
    }

    @Test
    void findCustomerByEmail() {
        RegisterCustomerResponse registerCustomerResponse = saveCustomerResponseHelper();
        assertEquals(registerCustomerResponse.getCustomerEmail(),
                customerService.findCustomerByEmail(customerService.findAllCustomers().get(0).getEmail()).get().getEmail()
        );
    }

    @Test
    void findAllCustomers() {
        saveCustomerResponseHelper();
        assertEquals(1, customerService.findAllCustomers().size());
    }

    @Test
    void updateCustomerPassword() {
        RegisterCustomerResponse registerCustomerResponse = saveCustomerResponseHelper();
        Customer foundCustomer = customerService.findCustomerByEmail(registerCustomerResponse.getCustomerEmail()).get();
        assertEquals("semicolon001", foundCustomer.getPassword());

        customerService.updateCustomerPassword(foundCustomer, "1234567890");
        assertEquals("1234567890", foundCustomer.getPassword());
    }

    @Test
    void deleteCustomer() {
        RegisterCustomerResponse registerCustomerResponse = saveCustomerResponseHelper();
        assertEquals(1, customerService.findAllCustomers().size());

        Customer foundCustomer = customerService.findCustomerByEmail(registerCustomerResponse.getCustomerEmail()).get();
        customerService.deleteCustomer(foundCustomer);
        assertEquals(0, customerService.findAllCustomers().size());
    }

    @Test
    void deleteAllCustomers() {
        RegisterCustomerResponse registerCustomerResponse = saveCustomerResponseHelper();
        customerService.deleteAllCustomers();
        assertEquals(0, customerService.findAllCustomers().size());
    }
}