package task2_2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class SumOfValues {


    Map<String,Integer> sum() throws IOException {
        int x, y, sumX, sumY;
        x = y = sumX = sumY = 0;
        String line;
        HashMap<String, Integer> map = new HashMap<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(Constants.PATH_FILE))) {
            while ((line = reader.readLine()) != null) {
                String[] strings = line.split(" ");
                String variable = strings[0].substring(0, strings[0].length() - 1);
                String value = strings[1];
                if (variable.equals("x")) {
                    x = Integer.parseInt(value);
                    sumX += x;
                } else {
                        y = Integer.parseInt(value);
                        sumY += y;
                    }

                }
            }
        map.put("x",sumX);
        map.put("y",sumY);
        return  map;
        }
    }

