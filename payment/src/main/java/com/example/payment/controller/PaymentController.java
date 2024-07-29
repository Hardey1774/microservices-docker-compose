package com.example.payment.controller;

import com.example.payment.model.Payment;
import com.example.payment.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    private PaymentRepository paymentRepository;

    @PostMapping
    public Payment processPayment(@RequestBody Payment payment) {
        payment.setStatus("processed");
        return paymentRepository.save(payment);
    }

    @GetMapping("/{orderId}")
    public Payment getPaymentByOrderId(@PathVariable String orderId) {
        return paymentRepository.findByOrderId(orderId);
    }
}
