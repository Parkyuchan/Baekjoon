class Solution {
    private static int[][] dp;
    public int solution(int[][] triangle) {
        int answer = 0;
        dp = new int[triangle.length][triangle.length];

        answer = dfs(0, 0, triangle);

        return answer;
    }

    private static int dfs(int depth, int idx, int[][] triangle) {

        if (dp[depth][idx] != 0)
            return dp[depth][idx];

        if (depth == triangle.length - 1) {
            return dp[depth][idx] = triangle[depth][idx];
        }

        int left = dfs(depth + 1, idx, triangle);
        int right = dfs(depth + 1, idx + 1, triangle);

        return dp[depth][idx] = triangle[depth][idx] + Math.max(left, right);
    }
}