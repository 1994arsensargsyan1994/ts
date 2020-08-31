package task3_2;

import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    private static final GuaranteedObject guaranteedObject = new GuaranteedObject();
    private static final AtomicInteger counter = new AtomicInteger();
    private static final int NUMBER_OF_INCREMENTS = 1_000_000;
    public static void main(String[] args) {
        System.out.println("Working...\n");
        IncrementerThread incrementerThread = new IncrementerThread();
        incrementerThread.start();
        PrinterThread printerThread = new PrinterThread();
        printerThread.start();
    }
    static class IncrementerThread extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < NUMBER_OF_INCREMENTS; ++i) {
                counter.incrementAndGet();
                guaranteedObject.blockThread();
            }
        }
    }
    static class PrinterThread extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < NUMBER_OF_INCREMENTS; ++i) {
                try {
                    Thread.sleep(5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("counter = " + counter.get());
                guaranteedObject.notifyThread();
            }
        }
    }
}