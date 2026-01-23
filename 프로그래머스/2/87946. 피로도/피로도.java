class Solution {
    private static boolean[] visited;
    private static int max;
    public int solution(int k, int[][] dungeons) {
        visited = new boolean[dungeons.length];
        dfs(dungeons, 0, k);
        return max;
    }

    private void dfs(int[][] dungeons, int cnt, int k) {
        for (int i = 0; i < dungeons.length; i++) {
            if (!visited[i] && dungeons[i][0] <= k) {
                visited[i] = true;
                dfs(dungeons, cnt + 1, k - dungeons[i][1]);
                visited[i] = false;
            }
        }
        
        max = Math.max(max, cnt);
    }
}       