package com.win.cdc.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.win.cdc.entity.Customer;
import com.win.cdc.repository.CustomerRepository;
import io.debezium.data.Envelope.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Map;

@Service
public class CustomerService {

//    @Autowired
//    private CustomerRepository customerRepository;

    public void replicateData(Map<String, Object> customerData, Operation operation) {
        final Customer customer = new ObjectMapper().convertValue(customerData, Customer.class);

        if (Operation.DELETE == operation) {
//            customerRepository.deleteById(customer.getId());
        } else {
//            customerRepository.save(customer);
        }
    }
}