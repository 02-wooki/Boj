package Backjoon.lessthanX;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int x = in.nextInt();

        for (int i = 0; i < n; i++) {
            int input = in.nextInt();

            if (input < x)
                System.out.printf("%d ", input);
        }
    }
}
