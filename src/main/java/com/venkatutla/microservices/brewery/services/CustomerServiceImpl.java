package com.venkatutla.microservices.brewery.services;

import com.venkatutla.microservices.brewery.web.dto.Customer;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public Customer getCustomerById(UUID customerId) {
        return Customer.builder().id(customerId).name("Venkat").build();
    }

    @Override
    public Customer createCustomer(Customer customer) {
        return Customer.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateCustomer(UUID customerId, Customer customer) {
        //TODO - Need to implement update customer service
    }

    @Override
    public void deleteCustomer(UUID customerId) {
        //TODO - Need to implement delete customer service.
    }
}
