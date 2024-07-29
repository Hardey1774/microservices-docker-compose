package com.example.order.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "orders")
public class Order {
    @Id
    private String id;
    private String userId;
    private List<String> items;
    private double totalAmount;

    // Getters and setters
}
