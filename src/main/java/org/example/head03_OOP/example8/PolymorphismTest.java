package org.example.head03_OOP.example8;

public class PolymorphismTest {
    public static void main(String[] args) {
        OrderService service = new OrderService();
        service.processPayment(new CreditCardPayment(), 10000);
        service.processPayment(new AccountTransferPayment(), 20000);
        service.processPayment(new CryptoPayment(), 30000);
        double[] paymentAmounts = new double[] {
                30000,
                70000,
                20000
        };
       Payment[] payments = {
               new CryptoPayment(),
               new AccountTransferPayment(),
               new CryptoPayment()
       };

        for(Payment p : payments) {
            if (p instanceof CreditCardPayment){
                service.processPayment(p,paymentAmounts[0]);
            } else if(p instanceof AccountTransferPayment) {
                service.processPayment(p,paymentAmounts[1]);
            } else if (p instanceof CryptoPayment) {
                service.processPayment(p,paymentAmounts[2]);
            }
        }
    }
}
