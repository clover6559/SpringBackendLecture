package org.example.head04.example1;

public class Outer {
    private static int staticvalue = 100;
    private int instanceValue = 30;

    public static class StaticNested {
        public void printValues() {
            System.out.println("Outer.staticValue: " + staticvalue);
//            System.out.println(instanceValue);
        }
    }
}
