package confitional;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CompareTwoValue {
    public static void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        String result = new String();
        if (a > b){
            result = ">";
        }
        else if (a < b){
            result = "<";
        }
        else{
            result = "==";
        }

        sb.append(result);
        System.out.println(sb);

        br.close();
    }
    public static void main(String[] args) throws Exception{
        new CompareTwoValue().solution();
    }
}
