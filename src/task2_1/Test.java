package task2_1;

import java.io.IOException;

public class Test {
    public static void main(String[] args)
    {
        String ch = args[0];
        try {
            CountsOfCharacter countsOfCharacter = new CountsOfCharacter();
            int count = countsOfCharacter.countCharacter(ch);
            System.out.println("counts the number<" + ch +">:"+ count);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
