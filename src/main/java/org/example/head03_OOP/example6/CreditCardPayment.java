package org.example.head03_OOP.example6;

public class CreditCardPayment extends AbstractPayment {
    @Override
    public void pay(double amount) {
        System.out.println("신용카드로 " + amount + "원 결제 완료.");
    }
    public void cancel(double amount) {
        System.out.println("신용카드로 " + amount + "원 취소 완료.");

    }
}
