package String;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;
import java.util.List;

public class FindMostUseAlpha {
    public static void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        String[] inputStr = st.nextToken().toUpperCase().split("");
        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0; i< inputStr.length; i++){
            map.put(inputStr[i], 0);
        }
        for(String alpha: inputStr){
            map.put(alpha, map.get(alpha) + 1);
        }
        List<String> keySet = new ArrayList<>(map.keySet());
        keySet.sort((o1,o2) -> map.get(o2) - map.get(o1));

        int maxVal = map.get(keySet.get(0));
        String returnVal = new String();

        if(keySet.size()==1 || maxVal != map.get(keySet.get(1))){
            returnVal = keySet.get(0);
        }
        else if(maxVal == map.get(keySet.get(1))){
            returnVal = "?";
        }

        sb.append(returnVal);
        System.out.println(sb);
    }
    public static void main(String[] args) throws Exception{
        new FindMostUseAlpha().solution();
    }
}
