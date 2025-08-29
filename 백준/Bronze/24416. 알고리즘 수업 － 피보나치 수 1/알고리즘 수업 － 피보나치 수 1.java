import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int count_rec = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] fibo = new int[N + 1];
        fibo[1] = 1;
        fibo[2] = 1;
        int count_dp = 0;

        for (int i = 3; i<=N; i++) {
            fibo[i] = fibo[i - 1] + fibo[i - 2];
            count_dp++;
        }

        fibo(N);

        System.out.println(count_rec + " " + count_dp);
    }

    private static int fibo(int n) {

        if (n == 1 || n == 2) {
            count_rec++;
            return 1;
        }

        return fibo(n - 1) + fibo(n - 2);
    }

}
