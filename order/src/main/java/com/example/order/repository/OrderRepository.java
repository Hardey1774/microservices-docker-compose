package com.example.order.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.order.model.Order;
import java.util.List;

public interface OrderRepository extends MongoRepository<Order, String> {
    List<Order> findByUserId(String userId);
}
