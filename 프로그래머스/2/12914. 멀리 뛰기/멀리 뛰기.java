import java.util.*;

class Solution {
    private static int[] dp;
    public long solution(int n) {
        long answer = 0;
        dp = new int[n + 1];
        
        for (int i = 0; i < dp.length; i++)
            dp[i] = -1;
        
        answer = dfs(0, n);

        return answer;
    }

    private static int dfs(int sum, int n) {
        
        if (sum == n)
            return 1;
        else if (sum > n)
            return 0;
        
        if (dp[sum] != -1)
            return dp[sum];
        
        dp[sum] = (dfs(sum + 1, n) + dfs(sum + 2, n)) % 1234567;
        return dp[sum];

    }
}