package com.example.fullstack_spring.repos;


import com.example.fullstack_spring.entities.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository<Customer, String> {
}
