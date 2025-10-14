class Solution {
    private static boolean[] visited;
    private static int max;
    private static int result = 0;
    public int solution(int k, int[][] dungeons) {
        int answer = 0;
        max = 0;

        visited = new boolean[dungeons.length];
        dfs(dungeons, k, max);
        answer = result;
        
        return answer;
    }
    private static void dfs(int[][] dun, int k, int max) {

        if (max > result)
            result = max;
        for (int i = 0; i < dun.length; i++) {
            if (visited[i])
                continue;
            if (dun[i][0] <= k) {
                visited[i] = true;
                dfs(dun, k - dun[i][1], max + 1);
                visited[i] = false;
            }

        }
    }
}       