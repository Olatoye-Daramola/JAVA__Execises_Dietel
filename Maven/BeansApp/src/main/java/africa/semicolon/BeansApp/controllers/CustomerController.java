package africa.semicolon.BeansApp.controllers;

import africa.semicolon.BeansApp.dtos.requests.RegisterCustomerRequest;
import africa.semicolon.BeansApp.dtos.responses.RegisterCustomerResponse;
import africa.semicolon.BeansApp.exceptions.CustomerNotFoundException;
import africa.semicolon.BeansApp.services.CustomerService;
import africa.semicolon.BeansApp.services.CustomerServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
    private final CustomerService customerService = new CustomerServiceImpl();

    @PostMapping("/api/addPackage")
    public ResponseEntity<?> addCustomer(@RequestBody RegisterCustomerRequest registerCustomerRequest) {
        try {
            RegisterCustomerResponse response = customerService.registerCustomer(registerCustomerRequest);
            return new ResponseEntity<>(response, HttpStatus.OK);
            }
        catch (CustomerNotFoundException error ) {
            return new ResponseEntity<>(error.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }


}
