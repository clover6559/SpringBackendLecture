package org.example.head04.example9;

public class EnumSwitchTest {
    public enum OrderStatus {
        ORDERED, READY, DELIVERED
    }
    public static void printStatus(OrderStatus status) {
        switch (status) {
            case READY :
                System.out.println("준비 완료");
                break;
            case ORDERED:
                System.out.println("주문됨");
                break;
            case DELIVERED:
                System.out.println("배송됨");
        }
    }
    public static void main(String[] args) {
        printStatus(OrderStatus.DELIVERED);
    }
}
