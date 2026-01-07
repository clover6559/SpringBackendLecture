package org.example.head04.example5;

public class LambdaDemo {
    public static void main(String [] args) {
        MyCalculator addAnon = new MyCalculator() {
            @Override
            public int operate(int x, int y, int z) {
                return x * y - z;
            }
        };
        System.out.println("익명 클래스: 3 * 5 = " + addAnon.operate(3,5,8));

        MyCalculator addLamba = (x,y, z) -> x * y+z;
        System.out.println("람다: 3 * 5 = " + addLamba.operate(3,5,2));
        System.out.println(addLamba.operate(3,6,3));
    }
}
