package array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Max {
    public static void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int[] numArray = new int[9];

        for(int i =0; i<numArray.length; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            numArray[i] = Integer.parseInt(st.nextToken());
        }

        int idx = getIndexFromArray(numArray);
        Arrays.sort(numArray);
        int maxVal = numArray[8];

        sb.append(maxVal).append("\n").append(idx);
        System.out.println(sb);
        br.close();
    }

    public static int getIndexFromArray(int[] numArray) throws Exception{
        int maxVal = numArray[0];
        int idx = 0;

        for(int i = 1; i < numArray.length; i++){
            if (maxVal < numArray[i]){
                maxVal = numArray[i];
                idx = i;
            }
        }
        return idx + 1;
    }

    public static void main(String[] args) throws Exception{
        new Max().solution();
    }
}

