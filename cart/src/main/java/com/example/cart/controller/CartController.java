package com.example.cart.controller;

import com.example.cart.model.Cart;
import com.example.cart.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cart")
public class CartController {

    @Autowired
    private CartRepository cartRepository;

    @PostMapping
    public Cart addToCart(@RequestBody Cart cart) {
        return cartRepository.save(cart);
    }

    @GetMapping("/{userId}")
    public Cart getCartByUserId(@PathVariable String userId) {
        return cartRepository.findByUserId(userId);
    }

    @DeleteMapping("/{userId}")
    public void clearCart(@PathVariable String userId) {
        Cart cart = cartRepository.findByUserId(userId);
        if (cart != null) {
            cartRepository.delete(cart);
        }
    }
}
