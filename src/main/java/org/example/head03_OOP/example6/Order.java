package org.example.head03_OOP.example6;

public class Order {
    private Payment payment;

    public Order(Payment payment) {
        this.payment = payment;
    }

    public void process(double amount) {
        payment.pay(amount);
    }
}