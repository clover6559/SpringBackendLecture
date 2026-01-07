package org.example.head04.example6;

public class AnonymousClassDemo {
    public static void main(String [] args) {
        AbstractTask customTask = new AbstractTask() {
            @Override
            public void execute() {
                System.out.println("추상 클래스의 excute() 구현부");

            }
        @Override
        public void start() {
            System.out.println("추상 클래스의 start() 구현부");
        }
            };
        customTask.start();
        customTask.execute();
    }
}
