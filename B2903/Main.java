package Backjoon.B2903;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int sum = 2;

        for (int i = 0; i < n; i++)
            sum += i + 1;

        System.out.println(sum * sum);

    }
}
