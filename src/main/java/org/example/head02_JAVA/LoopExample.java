package org.example.head02_JAVA;

public class LoopExample {
    public static void main(String[] args) {
        for(int i = 1; i <=3; i++) {
            System.out.println("i = " + i);
        }
        int count = 0;
        while (count < 3) {
            System.out.println("count: " + count);
            count++;
        }
    }
}
