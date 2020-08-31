package task2_2;


import java.io.IOException;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        SumOfValues sumOfValues = new SumOfValues();
        try {
            Map<String, Integer> map = sumOfValues.sum();
            System.out.println(map);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
