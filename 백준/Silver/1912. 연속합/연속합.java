import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] num = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++)
            num[i] = Integer.parseInt(st.nextToken());

        int dp[] = new int[N];
        dp[0] = num[0];
        int max = dp[0];

        for (int i = 1; i < N; i++) {
            dp[i] = Math.max(num[i], dp[i - 1] + num[i]);

            max = Math.max(max, dp[i]);
        }
        System.out.println(max);
    }
}