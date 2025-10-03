import java.util.*;

class Solution {
    static int row, col;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    public int solution(int[][] maps) {
        int answer = 0;
        row = maps.length;
        col = maps[0].length;
        visited = new boolean[row][col];

        answer = bfs(0, 0, row - 1, col - 1, maps);
        System.out.println(answer);
        return answer;
    }
    
    public static int bfs(int startX, int startY, int endX, int endY, int[][] maps) {

        Queue<int[]> queue = new ArrayDeque<>();
        queue.offer(new int[] {startX, startY, 0});
        visited[startX][startY] = true;

        while(!queue.isEmpty()) {
            int[] poll = queue.poll();

            if (poll[0] == endX && poll[1] == endY) {
                return poll[2] + 1;
            }

            for (int delta = 0; delta < 4; delta++) {
                int nx = poll[0] + dx[delta];
                int ny = poll[1] + dy[delta];

                if (nx >= 0 && nx < row && ny >= 0 && ny < col && !visited[nx][ny] && maps[nx][ny] == 1) {
                    queue.offer(new int[] {nx, ny, poll[2] + 1});

                    visited[nx][ny] = true;
                }
            }
        }

        return -1;

    }
}