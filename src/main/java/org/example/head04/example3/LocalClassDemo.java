package org.example.head04.example3;

public class LocalClassDemo {
    public void executeTask() {
        final int taskId = 999;
        class LocalWorker {
            public void run() {
                System.out.println("LocalWorker started With taskId = " + taskId);

            }
        }
        LocalWorker worker = new LocalWorker();
        worker.run();
    }
    public static void main(String[] args) {
        LocalClassDemo demo = new LocalClassDemo();
        demo.executeTask();
    }
}
