package org.example.head04.example10;

public class PaymentMethodDemo {
    public static void main(String[] args) {
        for(PaymentMethod method : PaymentMethod.values()) {
            System.out.println(method.name() + " => " + method.getDisplayName());
        }
    }
}
