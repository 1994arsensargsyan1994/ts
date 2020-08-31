package task3_2;

public class GuaranteedObject {
    private boolean shouldWait;
    private final Object lock = new Object();

    void blockThread() {
        synchronized (lock) {
            shouldWait = true;
            while (shouldWait) {
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    void notifyThread() {
        synchronized (lock) {
            shouldWait = false;
            lock.notify();
        }
    }
}