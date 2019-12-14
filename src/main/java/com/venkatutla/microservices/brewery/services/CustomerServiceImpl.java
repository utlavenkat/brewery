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
}
