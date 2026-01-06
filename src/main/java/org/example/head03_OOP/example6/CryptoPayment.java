package org.example.head03_OOP.example6;

public class CryptoPayment extends AbstractPayment
{
    @Override
    public void pay(double amount) {
        System.out.println("가상화폐로 " + amount + "원 결제 완료.");
    }
    public void cancel(double amount) {
        System.out.println("가상화폐로 " + amount + "원 취소 완료.");

    }
}
