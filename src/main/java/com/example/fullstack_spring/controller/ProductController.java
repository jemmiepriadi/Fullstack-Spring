package com.example.fullstack_spring.controller;

import com.example.fullstack_spring.entities.Product;
import com.example.fullstack_spring.services.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    @Autowired
    private ProductServices productService;

    @PostMapping
    public Product create(@RequestBody Product product) {
        return productService.save(product) ;
    }
    @GetMapping
    public Iterable <Product> findALL() {
        return productService.findAll();
    }
    @GetMapping("/{id}")
    public Product findOne (@PathVariable("id") String id){
        return productService.getById(id);
    }
    @PutMapping
    public Product update(@RequestBody Product product) {
        return productService.save(product);
    }
}
