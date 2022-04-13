package array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class CountOfNumber {
    public static void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int[] resultArray = new int[10];
        int multipleResult = 1;

        for(int i=0; i<3; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            multipleResult *= Integer.parseInt(st.nextToken());
        }

        while(multipleResult / 10 >= 1){
            resultArray[(multipleResult % 10)] += 1;
            multipleResult /= 10;
        }
        resultArray[multipleResult] += 1;

        for(int j =0; j<resultArray.length; j++){
            sb.append(resultArray[j]).append("\n");
        }
        System.out.println(sb);
        br.close();
    }
    public static void main(String[] args) throws Exception{
        new CountOfNumber().solution();
    }
}

