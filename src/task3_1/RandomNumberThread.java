package task3_1;

import java.util.Random;

public class RandomNumberThread implements Runnable {


    private int number;
    private Random random;

    public RandomNumberThread() {
        this.number = 0;
        this.random = new Random();
    }

    public int getNumber() {
        return number;
    }

    @Override
    public void run() {
        number = random.nextInt(10);
    }
}
