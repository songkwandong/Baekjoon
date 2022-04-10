package confitional;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Clock {
    public static void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int hour = Integer.parseInt(st.nextToken());
        int minute = Integer.parseInt(st.nextToken());
        int plusTime = Integer.parseInt(br.readLine());

        int totalMinute = (hour * 60) + minute + plusTime;
        int result_h = totalMinute / 60;
        int result_m = totalMinute % 60;

        if (result_h >= 24){
            result_h -= 24;
        }

        sb.append(result_h).append(" ").append(result_m);
        System.out.println(sb);

        br.close();
    }
    public static void main(String[] args) throws Exception{
        new Clock().solution();
    }
}
