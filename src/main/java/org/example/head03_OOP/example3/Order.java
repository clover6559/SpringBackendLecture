package org.example.head03_OOP.example3;

public class Order {
    private String orderId;
    private boolean isPaid;
    private String name;

    public Order() {
        this.orderId = "NONE";
        this.isPaid = false;
    }


    public Order (String orderId, boolean isPaid, String name) {
        this.orderId = orderId;
        this.isPaid = isPaid;
        this.name = name;
    }
    public Order (String orderId) {
        this.orderId = orderId;
    }



    public String getOrderId() {
        return orderId;
    }
    public boolean getIsPaid() {
        return isPaid;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public void setIsPaid(boolean isPaid) {
        this.isPaid = isPaid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
