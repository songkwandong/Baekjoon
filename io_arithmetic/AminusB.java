package io_arithmetic;

import java.io.*;
import java.util.*;

public class AminusB {
    public static void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int a, b = 0;
        int result = 0;

        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());

        sb.append(a - b);
        System.out.println(sb);
    }

    public static void main(String[] args) throws Exception {
        new AminusB().solution();
    }
}


