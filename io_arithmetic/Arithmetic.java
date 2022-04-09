package io_arithmetic;

import java.io.*;
import java.util.*;

public class Arithmetic {
    public static void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int a = 0;
        int b = 0;

        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());

        int plusResult = a + b;
        int minusResult = a - b;
        int multipleResult = a * b;
        int divisionResult = a / b;
        int remainderResult = a % b;

        sb.append(plusResult).append("\n");
        sb.append(minusResult).append("\n");
        sb.append(multipleResult).append("\n");
        sb.append(divisionResult).append("\n");
        sb.append(remainderResult).append("\n");

        System.out.println(sb);
    }

    public static void main(String[] args) throws Exception {
        new Arithmetic().solution();
    }
}
