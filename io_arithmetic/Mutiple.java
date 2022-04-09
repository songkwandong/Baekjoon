package io_arithmetic;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Mutiple {

    public static void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int a = Integer.parseInt(br.readLine());
        String stringDisits = br.readLine();
        int disits = stringDisits.length();
        int b = Integer.parseInt(stringDisits);

        int[] resultList = new int[disits + 1];
        resultList[disits] = a * b;

        for (int i =0; i <disits; i++){
            resultList[i] = a * (b % 10);
            b = b / 10;
        }
        for (int i=0; i<resultList.length; i++){
            sb.append(resultList[i]).append("\n");
        }

        System.out.println(sb);
        br.close();
    }
    public static void main(String[] args) throws Exception{
        new Mutiple().solution();
    }
}
