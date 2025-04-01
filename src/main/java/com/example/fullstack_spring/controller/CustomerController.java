package com.example.fullstack_spring.controller;

import com.example.fullstack_spring.entities.Customer;
import com.example.fullstack_spring.services.CustomerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {
    @Autowired
    private CustomerServices customerService;

    @PostMapping
    public Customer create(@RequestBody Customer Customer) {
        return customerService.save(Customer) ;
    }
    @GetMapping
    public Iterable <Customer> findALL() {
        return customerService.findAll();
    }
    @GetMapping("/{id}")
    public Customer findOne (@PathVariable("id") String id){
        return customerService.getById(id);
    }
    @PutMapping
    public Customer update(@RequestBody Customer Customer) {
        return customerService.save(Customer);
    }
}
