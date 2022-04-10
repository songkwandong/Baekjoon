package confitional;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Dice {
    public static void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int equalCnt = 0;
        int result = 0;
        int duplicationNum = 0;
        int[] diceNumber = new int[3];

        for(int i = 0; i <3; i ++){
            diceNumber[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i <3; i ++){
            for(int j = i + 1; j < 3 ; j ++){
                if (diceNumber[i] == diceNumber[j]){
                    duplicationNum = diceNumber[i];
                    equalCnt++;
                }
            }
        }

        if (equalCnt == 0){
            //같은수 0개
            result = getMaxValue(diceNumber) * 100;
        }
        else if (equalCnt == 1){
            //같은수 2개
            result = 1000 + (duplicationNum * 100);
        }
        else if (equalCnt == 3){
            //같은수 3개
            result = 10000 + (duplicationNum * 1000);
        }

        sb.append(result);
        System.out.println(sb);
        br.close();
    }

    public static int getMaxValue(int[] diceNumber) {
        int maxVal = 0;
        for(int i = 0; i < diceNumber.length; i++){
            if (maxVal < diceNumber[i]){
                maxVal = diceNumber[i];
            }
        }
        return maxVal;
    }
    public static void main(String[] args) throws Exception{
        new Dice().solution();
    }
}
