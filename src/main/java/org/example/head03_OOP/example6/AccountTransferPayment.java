package org.example.head03_OOP.example6;

import org.example.head03_OOP.example6.Payment;
import org.example.head03_OOP.example6.AbstractPayment;


public class AccountTransferPayment extends AbstractPayment {

    public void pay(double amount) {
        System.out.println("계좌이체로 " + amount + "원 결제 완료.");
    }
    public void cancel(double amount) {
        System.out.println("계좌이체로 " + amount + "원 취소 완료.");

    }
}
