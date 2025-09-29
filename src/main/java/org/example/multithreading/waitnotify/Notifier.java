package org.example.multithreading.waitnotify;

public class Notifier implements Runnable {
    private Message message;

    public Notifier(Message message) {
        this.message = message;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println(name + " started");
        try {
            Thread.sleep(1000);
            synchronized (message) {
                message.setMessage(name + " Notifier work done");
                // message.notify(); // notify only one thread
                message.notifyAll(); // notify all threads
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
