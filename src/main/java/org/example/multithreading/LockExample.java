package org.example.multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockExample {
    class Counter {
        private int c = 0; // Shared variable
        private Lock lock = new ReentrantLock();

        // Synchronized method to increment counter
        public void inc() {
            lock.lock();
            try {
                c++;
            } finally {
                lock.unlock();
            }
        }

        // Synchronized method to get counter value
        public int get() {
            lock.lock();
            try {
                return c;
            } finally {
                lock.unlock();
            }
        }
    }

    public static void main(String[] args) {
        LockExample lockExample = new LockExample();
        Counter counter = lockExample.new Counter();

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
