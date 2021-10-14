package com.example.orderservice.dao;

import com.example.orderservice.model.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order,Integer> {
//    List<Order> findAllByOrder_id();
}
