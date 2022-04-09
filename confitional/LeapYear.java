package confitional;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class LeapYear {
    public static void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int year = Integer.parseInt(st.nextToken());
        int isLeapYear = 0;
        if ((((year % 4) == 0) && ((year % 100) != 0)) || ((year % 400) == 0)){
            isLeapYear = 1;
        }

        sb.append(isLeapYear);
        System.out.println(sb);
        br.close();
    }
    public static void main(String[] args) throws Exception{
        new LeapYear().solution();
    }
}
