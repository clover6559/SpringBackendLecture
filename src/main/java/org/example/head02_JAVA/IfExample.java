package org.example.head02_JAVA;

public class IfExample {
    public static void main(String[] args) {
        int score = 85;

        if (score >= 90) {
            System.out.println("A학점");
        } else if (score >= 80) {
            System.out.println("B학점");
        } else {
            System.out.println("C 이하");
        }
    }
}
