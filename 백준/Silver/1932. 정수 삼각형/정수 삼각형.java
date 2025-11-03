import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[][] triangle = new int[N][];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            triangle[i] = new int[i + 1];
            for (int j = 0; j < triangle[i].length; j++)
                triangle[i][j] = Integer.parseInt(st.nextToken());
        }

        int max = 0;
        int[][] dp = new int[N][N];
        dp[0][0] = triangle[0][0];

        for (int i = 1; i < N; i++) {
            for (int j = 0; j < triangle[i].length; j++) {
                if (j == 0)
                    dp[i][j] = triangle[i][j] + dp[i - 1][j];
                else if (j == triangle[i].length - 1)
                    dp[i][j] = triangle[i][j] + dp[i - 1][j - 1];
                else
                    dp[i][j] = triangle[i][j] + Math.max(dp[i - 1][j - 1], dp[i - 1][j]);
            }

        }

        for (int i = 0; i < dp[N - 1].length; i++) {
            max = Math.max(max, dp[N - 1][i]);
        }

        System.out.println(max);
    }

}