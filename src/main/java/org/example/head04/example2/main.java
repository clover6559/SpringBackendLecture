package org.example.head04.example2;

public class main {
    public static void main(String [] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.printInstanceValue();
    }
}
