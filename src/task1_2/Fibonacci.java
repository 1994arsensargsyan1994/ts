package task1_2;

public class Fibonacci {

    public void fibonacci(int n) {

        int f1 = 0, f2 = 1;
        double sum = 0;


        System.out.print("The first " + n +" Fibonacci numbers are:\n");
        for (int i = 1; i <= n; i++) {
            System.out.print(f2 + " ");
            sum += f2;
            int next = f1 + f2;
            f1 = f2;
            f2 = next;
        }
        System.out.println("\nThe average is:" + sum / n);
    }
}
