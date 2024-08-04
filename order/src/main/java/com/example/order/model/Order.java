package com.example.order.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "orders")
public class Order {
    @Id
    private String id;
    private String userId;
    private String productId;
    private int quantity;

    // Constructors, getters, and setters
}
