package org.example.head02_JAVA;

public class ImprovedForLoop {
    public static void main(String[] args) {
        int scores [] = {90, 85, 78};

        for (int s : scores) {
            System.out.println("점수: " +s);
        }
    }
}
