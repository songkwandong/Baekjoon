package array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MinMax {
    public static void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int numCnt = Integer.parseInt(br.readLine());
        int[] numList = new int[numCnt];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i =0; i<numList.length; i++){
            numList[i] = Integer.parseInt(st.nextToken());
        }

        sb.append(getMinVal(numList)).append(" ").append(getMaxVal(numList));
        System.out.println(sb);
        br.close();
    }

    public static int getMinVal(int[] numList) throws Exception{
        int minVal = numList[0];
        for(int i =1; i<numList.length; i++){
            if (minVal > numList[i]){
                minVal = numList[i];
            }
        }
        return minVal;
    }

    public static int getMaxVal(int[] numList) throws Exception{
        int maxVal = numList[0];
        for(int i =1; i<numList.length; i++){
            if (maxVal < numList[i]){
                maxVal = numList[i];
            }
        }
        return maxVal;
    }

    public static void main(String[] args) throws Exception{
        new MinMax().solution();
    }
}

