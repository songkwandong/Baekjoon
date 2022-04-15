package function;




public class SelfNumber {
    public static void solution() throws Exception {
        StringBuilder sb = new StringBuilder();
        boolean[] check = new boolean[10001];

        for (int i = 1; i < 10001; i++) {
             int n = d(i);

             if(n <= 10000){
                 check[n] = true;
             }
        }

        for (int j = 1; j < 10001; j++) {
            if(check[j] == false){
                sb.append(j).append("\n");
            }
        }
        System.out.println(sb);
    }

    public static int d(int n) {
        int sum = n;
        while(n != 0){
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) throws Exception {
        new function.SelfNumber().solution();
    }
}


