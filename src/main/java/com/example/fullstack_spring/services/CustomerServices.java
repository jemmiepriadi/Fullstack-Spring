package com.example.fullstack_spring.services;

import com.example.fullstack_spring.entities.Customer;
import com.example.fullstack_spring.repos.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CustomerServices {
    @Autowired
    private CustomerRepository customerRepository;

    public Customer save(Customer Customer){
        return customerRepository.save(Customer);
    }

    public Customer getById(String id){
        return customerRepository.findById(id).get();
    }

    public Iterable<Customer> findAll(){
        return customerRepository.findAll();
    }

    public void delete(String id){
        customerRepository.deleteById(id);
    }
}
