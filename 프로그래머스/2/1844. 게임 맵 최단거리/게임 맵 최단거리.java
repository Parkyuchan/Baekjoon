import java.util.*;

class Solution {
    private static int[] dx = {-1, 1, 0, 0};
    private static int[] dy = {0, 0, -1, 1};
    private static boolean[][] visited;

    public int solution(int[][] maps) {
        int answer = 0;
        visited = new boolean[maps.length][maps[0].length];
        answer = game(maps);
        return answer;
    }
    
    private int game(int[][] maps) { 
        
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{0, 0, 1});
        visited[0][0] = true;
        
        while(!q.isEmpty()) {
            int[] now = q.poll();
            if (now[0] == maps[0].length - 1 && now[1] == maps.length - 1)
                return now[2];
        
            for (int i = 0; i < 4; i++) {
                int x = now[0] + dx[i];
                int y = now[1] + dy[i];
                if (x > -1 && x < maps[0].length && y > -1 && y < maps.length) {
                    if (maps[y][x] != 0 && !visited[y][x]) {
                        q.offer(new int[]{x, y, now[2] + 1});
                        visited[y][x] = true;
                    }
                }
            }
            
            
        }
        
        return -1;
        
    }
}