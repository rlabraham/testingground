package org.example.multithreading;

public class ImplementRunnableExample {
    static class MyRunnable implements Runnable {
        private final String name;

        public MyRunnable(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.println(i + ") Hello from new thread " + name);
            }
        }
    }

    public static void main(String[] args) {
        MyRunnable myRunnable1 = new MyRunnable("foo");
        MyRunnable myRunnable2 = new MyRunnable("bar");

        Thread thread1 = new Thread(myRunnable1);
        Thread thread2 = new Thread(myRunnable2);

        thread1.start();
        thread2.start();
    }
}
