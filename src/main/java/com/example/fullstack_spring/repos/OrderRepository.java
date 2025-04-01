package com.example.fullstack_spring.repos;

import com.example.fullstack_spring.entities.Order;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrderRepository extends MongoRepository<Order, String> {

}
