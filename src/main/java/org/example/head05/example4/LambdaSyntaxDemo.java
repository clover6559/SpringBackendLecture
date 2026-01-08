package org.example.head05.example4;
interface Calulator {
    int operate(int x, int y);
}

public class LambdaSyntaxDemo {
    public static void main(String[] args) {
        Calulator add = (a,b) -> a + b;
        Calulator subtract = (a,b) -> {
            System.out.println("subtracting...");
            return a - b;
        };
        System.out.println("3+5= " + add.operate(3,5));
        System.out.println("8-2 = " + subtract.operate(8,2));
    }
}
