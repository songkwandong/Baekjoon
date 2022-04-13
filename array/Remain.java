package array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Remain {
    public static void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        HashSet<Integer> diffRemain = new HashSet<>();

        for (int i = 0; i < 10; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            diffRemain.add(Integer.parseInt(st.nextToken()) % 42);
        }
        System.out.println(diffRemain.size());
        br.close();
    }

    public static void main(String[] args) throws Exception {
        new Remain().solution();
    }
}

