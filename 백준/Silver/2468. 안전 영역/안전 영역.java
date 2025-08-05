import java.io.*;
import java.util.*;

public class Main {

    private static int map[][];
    private static boolean visited[][];
    private static int N;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());
        map = new int[N][N];

        int maxHeight = 0;
        for(int i = 0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j<N; j++) {
                int height = Integer.parseInt(st.nextToken());
                map[i][j] = height;

                if (maxHeight < height)
                    maxHeight = height;

            }
        }

        int maxSafeArea = 0;

        for (int height = 0; height<=maxHeight; height++) {
            visited = new boolean[N][N];
            int count = 0;
            for (int i = 0; i<N; i++)
                for (int j = 0; j<N; j++){
                    if (!visited[i][j] && map[i][j] > height) {
                        checkMap(i, j, height);
                        count++;
                    }
                }
            maxSafeArea = Math.max(maxSafeArea, count);

        }
        System.out.println(maxSafeArea);

    }

    private static void checkMap(int x, int y, int height) {

        visited[x][y] = true;

        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        for (int i = 0; i<4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && ny >= 0 && nx < N && ny < N) {
                if (!visited[nx][ny] && map[nx][ny] > height) {
                    checkMap(nx, ny, height);
                }
            }
        }
    }
}
