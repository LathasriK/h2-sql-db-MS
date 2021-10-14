package com.example.orderservice.controller;

import com.example.orderservice.dao.OrderRepository;
import com.example.orderservice.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class OrderController {

    @Autowired
    public OrderRepository repository;

    @PostMapping("/saveOrder")
    public String saveOrder(@RequestBody Order orderr){
         repository.save(orderr);
         return "Order saved...";
    }

    @GetMapping("/getAllOrders")
    public List<Order> getAll(){
        return (List<Order>) repository.findAll();
    }

    @GetMapping("/getOrder/{order_id}")
    public Optional<Order> getOrderByOrder_id(@PathVariable int order_id){
        return repository.findById(order_id);
    }
}
