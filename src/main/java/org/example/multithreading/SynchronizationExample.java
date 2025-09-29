package org.example.multithreading;

// Synchronization is a technique that is used to prevent concurrent access to shared resources.
public class SynchronizationExample {
    public class Counter {
        private int c = 0; // Shared variable

        // Synchronized method to increment counter
        public synchronized void inc() {
            c++;
        }

        public void dec() {
            synchronized (this) {
                c--;
            }
        }

        // Synchronized method to get counter value
        public synchronized int get() {
            return c;
        }
    }

    public static void main(String[] args) {
        SynchronizationExample synchronizationExample = new SynchronizationExample();
        Counter counter = synchronizationExample.new Counter();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.inc();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.inc();
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(counter.get());
    }

}
