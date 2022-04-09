package io_arithmetic;

import java.io.*;
import java.util.*;

public class Suprise {
    public static void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        String result = st.nextToken() + "??!";
        sb.append(result);
        System.out.println(sb);
    }
    public static void main(String[] args) throws Exception {
        new Suprise().solution();
    }
}
