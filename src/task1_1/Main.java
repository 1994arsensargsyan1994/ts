package task1_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int mark = in.nextInt();
        new CheckPassFail().checkPassFail(mark);


    }
}
