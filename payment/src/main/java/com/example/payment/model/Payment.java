package com.example.payment.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "payments")
public class Payment {
    @Id
    private String id;
    private String userId;
    private String orderId;
    private double amount;
    private String status;

    // Getters and setters
}
