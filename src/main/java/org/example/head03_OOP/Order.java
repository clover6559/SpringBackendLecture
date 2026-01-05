package org.example.head03_OOP;

class Order {
    String custmerName;
    String product;
    int quantity;
    int price;
    Order(String custmerName, String product, int quantity, int price) {
        this.custmerName = custmerName;
        this.product = product;
        this.quantity = quantity;
        this.price = price;
    }
}
