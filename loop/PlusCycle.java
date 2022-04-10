package loop;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PlusCycle {
    public static void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int inputNum = Integer.parseInt(st.nextToken());
        int tempNum = 0;
        int cycle = 0;

        String tempString = new String();
        int a = 0;
        int b = 0;

        if (inputNum == 0){
            cycle = 1;
        }
        else if (inputNum < 10){
            tempString = Integer.toString(inputNum);
            tempString = tempString + tempString;
            tempNum = Integer.parseInt(tempString);
            cycle ++;
        }
        else if (inputNum >= 10){
            a= inputNum / 10;
            b= inputNum % 10;
            tempString = Integer.toString(b) + Integer.toString((a+b) % 10);
            tempNum = Integer.parseInt(tempString);
            cycle ++;
        }

        while(inputNum != tempNum){
            a= tempNum / 10;
            b= tempNum % 10;
            tempString = Integer.toString(b) + Integer.toString((a+b) % 10);
            tempNum = Integer.parseInt(tempString);
            cycle ++;
        }

        sb.append(cycle);
        System.out.println(sb);

        br.close();
    }
    public static void main(String[] args) throws Exception{
        new PlusCycle().solution();
    }
}

