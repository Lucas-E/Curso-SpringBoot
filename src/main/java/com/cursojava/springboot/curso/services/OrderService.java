package com.cursojava.springboot.curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cursojava.springboot.curso.repositories.OrderRepository;
import com.cursojava.springboot.curso.entities.Order;

@Service
public class OrderService {
    
    @Autowired
    private OrderRepository orderRepository;

    public List<Order> findAll(){
        List<Order> orders = orderRepository.findAll();
        return orders;
    }

    public Order findOne(Long id){
        Optional<Order> order = orderRepository.findById(id);
        return order.get();
    }
}
