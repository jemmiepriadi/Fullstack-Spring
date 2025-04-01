package com.example.fullstack_spring.repos;

import com.example.fullstack_spring.entities.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {

}
