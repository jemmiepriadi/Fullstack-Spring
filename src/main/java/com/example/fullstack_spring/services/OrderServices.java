package com.example.fullstack_spring.services;

import com.example.fullstack_spring.entities.Order;
import com.example.fullstack_spring.repos.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class OrderServices {
    @Autowired
    private OrderRepository orderRepository;

    public Order save(Order order){
        return orderRepository.save(order);
    }

    public Order getById(String id){
        return orderRepository.findById(id).get();
    }

    public Iterable<Order> findAll(){
        return orderRepository.findAll();
    }

    public void delete(String id){
        orderRepository.deleteById(id);
    }
}
