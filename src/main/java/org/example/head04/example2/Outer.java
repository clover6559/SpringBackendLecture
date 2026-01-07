package org.example.head04.example2;

public class Outer {
    private int instanceValue = 200;
    public class Inner {
        public void printInstanceValue() {
            System.out.println("Outer instanceValue: " + instanceValue);
        }
    }
}
