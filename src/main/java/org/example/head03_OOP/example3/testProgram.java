package org.example.head03_OOP.example3;

public class testProgram {
    public static void main(String[] args) {
        //Order order = new Order( "1212", true);
        //System.out.println("order: " + order);
        //Order order = new Order();

      Order order = new Order("1212", true, "jieun");
        System.out.println(order.getOrderId());
        System.out.println(order.getIsPaid());
        System.out.println(order.getName());

        order.setOrderId("김김김");
        order.setIsPaid(false);

        System.out.println(order.getOrderId());
        System.out.println(order.getIsPaid());

        order.setOrderId("맥북");
        System.out.println(order.getOrderId());

        order.setName("jieun");
        System.out.println(order.getName());

    }
}
