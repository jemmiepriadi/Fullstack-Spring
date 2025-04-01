package com.example.fullstack_spring.services;

import com.example.fullstack_spring.entities.Product;
import com.example.fullstack_spring.repos.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ProductServices {
    @Autowired
    private ProductRepository productRepository;

    public Product save(Product product){
        return productRepository.save(product);
    }

    public Product getById(String id){
        return productRepository.findById(id).get();
    }

    public Iterable<Product> findAll(){
        return productRepository.findAll();
    }

    public void delete(String id){
         productRepository.deleteById(id);
    }
}
