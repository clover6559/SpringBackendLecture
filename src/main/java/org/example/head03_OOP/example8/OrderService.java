package org.example.head03_OOP.example8;

public class OrderService {
    public void processPayment(Payment method, double amount) {
        method.pay(amount);
    }
}