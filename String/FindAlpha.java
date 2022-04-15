package String;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;


public class FindAlpha {
    public static void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < 26; i++) {
            map.put(Character.toString((char)(97+i)) , -1);
        }

        String tempstr = new String(st.nextToken());
        String[] tempstrArray = tempstr.split("");
        int idx = 0;

        for (String alpha : tempstrArray) {
            if (map.get(alpha) == -1){
                map.put(alpha, idx);
            }
            idx ++;
        }
        for (Integer value : map.values()){
            sb.append(value).append(" ");
        }
        System.out.println(sb);
    }

    public static void main(String[] args) throws Exception {
        new FindAlpha().solution();
    }
}



