import java.util.*;

class Solution {
    public int solution(String dirs) {
        int answer = 0;
        Set<String> visited = new HashSet<>();
        int x = 0;
        int y = 0;
        int nx = 0;
        int ny = 0;

        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, 1, -1};

        for (int i = 0; i<dirs.length(); i++) {
            switch (dirs.charAt(i)) {
                case 'U' :
                    if (ny + dy[2] > 5)
                        continue;
                    ny += dy[2];
                    break;
                case 'D' :
                    if (ny + dy[3] < -5)
                        continue;
                    ny += dy[3];
                    break;
                case 'L' :
                    if (nx + dx[1] < -5)
                        continue;
                    nx += dx[1];
                    break;
                case 'R' :
                    if (nx + dx[0] > 5)
                        continue;
                    nx += dx[0];
                    break;
            }

            String edgeFirst = x + "," + y + "->" + nx + "," + ny;
            String edgeSecond = nx + "," + ny + "->" + x + "," + y;
            if (!visited.contains(edgeFirst) && !visited.contains(edgeSecond)) {
                visited.add(edgeFirst);
                visited.add(edgeSecond);
                answer++;
            }

            x = nx;
            y = ny;
        }
        return answer;
    }
}