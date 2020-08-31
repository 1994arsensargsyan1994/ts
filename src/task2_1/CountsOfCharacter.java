package task2_1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountsOfCharacter {


    int countCharacter(String ch) throws IOException {


        if (ch == null) {
            throw new NullPointerException("write character in command line ");
        }

        String line;

        int count = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(Constants.PATH_FILE))) {
            while ((line = reader.readLine()) != null) {


                for (int i = 0; i < line.length(); i++) {
                    Character character = line.charAt(i);
                    if (character.equals('e')) {
                        count++;
                    }
                }

            }

        }
        return count;
    }


}
