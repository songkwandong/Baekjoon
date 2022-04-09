package io_arithmetic;

import java.io.*;
import java.util.*;

public class ChangeYearOfAD {
    public static final int minusValForAD = 543;

    public static void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int inputYear = 0;
        int result = 0;

        inputYear = Integer.parseInt(st.nextToken());
        result = inputYear - minusValForAD;

        sb.append(result);
        System.out.println(sb);

    }
    public static void main(String[] args) throws Exception{
        new ChangeYearOfAD().solution();
    }
}
