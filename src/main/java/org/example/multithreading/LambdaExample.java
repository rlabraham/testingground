package org.example.multithreading;

public class LambdaExample {
    public static void main(String[] args) {

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println(i + ") Hello from new thread1");
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println(i + ") Hello from new thread2");
            }
        });

        thread1.start();
        thread2.start();
    }
}
