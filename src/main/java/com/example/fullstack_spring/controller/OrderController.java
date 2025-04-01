package com.example.fullstack_spring.controller;

import com.example.fullstack_spring.entities.Order;
import com.example.fullstack_spring.services.OrderServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/order")
public class OrderController {
    @Autowired
    private OrderServices orderService;

    @PostMapping
    public Order create(@RequestBody Order Order) {
        return orderService.save(Order) ;
    }
    @GetMapping
    public Iterable <Order> findALL() {
        return orderService.findAll();
    }
    @GetMapping("/{id}")
    public Order findOne (@PathVariable("id") String id){
        return orderService.getById(id);
    }
    @PutMapping
    public Order update(@RequestBody Order Order) {
        return orderService.save(Order);
    }
}
