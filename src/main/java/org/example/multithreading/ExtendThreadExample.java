package org.example.multithreading;

public class ExtendThreadExample {
    public static class MyThread extends Thread {
        private final String name;

        public MyThread(String name) {
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
        MyThread thread1 = new MyThread("foo");
        MyThread thread2 = new MyThread("bar");

        thread1.start();
        thread2.start();
    }
}
