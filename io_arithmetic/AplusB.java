package io_arithmetic;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AplusB {

    private static int a = 0;
    private static int b = 0;
    private static int result = 0;

    public static void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());

        sb.append(a + b);
        System.out.println(sb);

    }
    public static void main(String[] args) throws Exception {
        new AplusB().solution();
    }
}


