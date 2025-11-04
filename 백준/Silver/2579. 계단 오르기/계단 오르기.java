import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] step = new int[N + 1];

        for (int i = 1; i <= N; i++)
            step[i] = Integer.parseInt(br.readLine());

        int[] dp = new int[N + 1];
        if (N == 1) {
            System.out.println(step[1]);
            return;
        }
        if (N == 2) {
            System.out.println(step[1] + step[2]);
            return;
        }
        dp[1] = step[1];
        dp[2] = step[1] + step[2];
        dp[3] = Math.max(step[1], step[2]) + step[3];

        for (int i = 4; i < N + 1; i++) {
            dp[i] = Math.max(dp[i - 3] + step[i - 1], dp[i - 2]) + step[i];
        }
        System.out.println(dp[N]);
    }

}