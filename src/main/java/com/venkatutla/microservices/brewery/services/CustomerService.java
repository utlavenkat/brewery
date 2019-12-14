package com.venkatutla.microservices.brewery.services;

import com.venkatutla.microservices.brewery.web.dto.Customer;

import java.util.UUID;

public interface CustomerService {
    Customer getCustomerById(UUID customerId);
    Customer createCustomer(Customer customer);
    void updateCustomer(UUID customerId, Customer customer);
    void deleteCustomer(UUID customerId);
}
