package org.example.head03_OOP.example6;
import org.example.head03_OOP.example6.AbstractPayment;


public class Order {
    private AbstractPayment payment;

    public Order(AbstractPayment payment) {
        this.payment = payment;
    }

    public void process(double amount) {
        payment.pay(amount);
    }

    public void can(double amount) {
        payment.cancel(amount);
    }
}