package task3_1.with_executor_service;


import java.util.concurrent.*;

public class Main {
    final static int THREADS_COUNT = 5;

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(THREADS_COUNT);
        int sum = 0;
        for (int i = 0; i < THREADS_COUNT; i++) {
            RandomNumberCallable thread = new RandomNumberCallable("tread" + i);
            Future<Integer> submit = executorService.submit(thread);
            try {
                sum += submit.get();
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }
        executorService.shutdown();

        // Wait until all threads are finish

        while (!executorService.isTerminated()) {

        }
        System.out.println(sum);
    }

}
