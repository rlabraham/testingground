package org.example.multithreading;

/**
 * In this example, highPriorityThread may continuously acquire the lock,
 * preventing lowPriorityThread from accessing the shared resource and leading to starvation.
 *
 * The output might show the high-priority thread executing much more frequently than the low-priority thread,
 * or even exclusively, depending on the system's thread scheduling.
 */
public class StarvationExample {

    private static final Object lock = new Object();
    private static int sharedResource = 0;

    public static void main(String[] args) {
        // Create and start multiple threads with varying priorities
        Thread highPriorityThread = new Thread(new Worker("High-Priority", 10));
        Thread lowPriorityThread = new Thread(new Worker("Low-Priority", 1));

        highPriorityThread.setPriority(Thread.MAX_PRIORITY);
        lowPriorityThread.setPriority(Thread.MIN_PRIORITY);

        highPriorityThread.start();
        lowPriorityThread.start();
    }

    static class Worker implements Runnable {
        private final String name;
        private final int priority;

        public Worker(String name, int priority) {
            this.name = name;
            this.priority = priority;
        }

        @Override
        public void run() {
            for (int i = 0; i < 50000; i++) {
                synchronized (lock) {
                    sharedResource++;
                    System.out.println(name + " (Priority " + priority + "): Accessed resource, value = " + sharedResource);
                    // Simulate some work
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}

