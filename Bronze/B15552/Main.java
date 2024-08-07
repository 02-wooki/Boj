package Backjoon.Bronze.B15552;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {

            String s = br.readLine();
            StringTokenizer st = new StringTokenizer(s);

            bw.write(String.format("%d\n", Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())));
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
