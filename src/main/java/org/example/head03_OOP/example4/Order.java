package org.example.head03_OOP.example4;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private String orderId;
    private List<Product> products;
    private boolean isPaid;

    // 기본 생성자
    public Order() {
        this.orderId = "NONE";
        this.products = new ArrayList<>();
        this.isPaid = false;
    }

    // 오버로딩된 생성자
    public Order(String orderId, List<Product> products) {
        this.orderId = orderId;
        this.products = products;
        this.isPaid = false;
    }

    // this() 호출 예시
    public Order(String orderId) {
        this(orderId, new ArrayList<>());
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public boolean getIsPaid() {
        return isPaid;
    }

    public void setIsPaid(boolean paid) {
        isPaid = paid;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
//getter 생성 법 실습
}
