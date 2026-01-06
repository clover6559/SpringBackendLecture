package org.example.head03_OOP.example8;

public class CryptoPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("가상화폐로 " + amount + "원 결제 완료.");
    }
}
