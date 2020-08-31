package task3_1;

public class Main {
    public static void main(String[] args) {
        RandomNumberThread sumThread1 = new RandomNumberThread();
        RandomNumberThread sumThread2 = new RandomNumberThread();
        RandomNumberThread sumThread3 = new RandomNumberThread();
        RandomNumberThread sumThread4 = new RandomNumberThread();
        RandomNumberThread sumThread5 = new RandomNumberThread();
        Thread thread1 = new Thread(sumThread1);
        Thread thread2 = new Thread(sumThread2);
        Thread thread3 = new Thread(sumThread3);
        Thread thread4 = new Thread(sumThread4);
        Thread thread5 = new Thread(sumThread5);
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        try {
            thread1.join();
            thread2.join();
            thread3.join();
            thread4.join();
            thread5.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int sum = 0;
        sum += sumThread1.getNumber();
        sum += sumThread2.getNumber();
        sum += sumThread3.getNumber();
        sum += sumThread4.getNumber();
        sum += sumThread5.getNumber();
        System.out.println(sum);
    }
}
