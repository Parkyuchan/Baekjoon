import java.io.*;
import java.util.*;

public class Main {

    static int[] xrr = {-1, -1, -1, 0, 0, 1, 1, 1};
    static int[] yrr = {-1, 0, 1, -1, 1, -1, 0, 1};

    static boolean[][] visit;

    static int[][] map;
    static int w;
    static int h;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while(true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            w = Integer.parseInt(st.nextToken());
            h = Integer.parseInt(st.nextToken());

            if (w == 0 && h == 0)
                break;

            map = new int[h][w];
            visit = new boolean[h][w];

            for (int i = 0; i < h; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < w; j++)
                    map[i][j] = Integer.parseInt(st.nextToken());
            }

            int result = 0;
            for (int i = 0; i<h; i++) {
                for (int j = 0; j<w; j++) {
                    if (map[i][j] == 1 && !visit[i][j]) {
                        dfs(i, j);
                        result++;
                    }
                }
            }

            sb.append(result).append("\n");

        }

        System.out.println(sb);

    }

    private static void dfs(int lh, int lw) {

        visit[lh][lw] = true;

        for (int i = 0; i<8; i++) {
            if (lh + xrr[i] < 0 || lh + xrr[i] >= h || lw + yrr[i] < 0 || lw + yrr[i] >= w)
                continue;
            if (map[lh + xrr[i]][lw + yrr[i]] == 1 && !visit[lh + xrr[i]][lw + yrr[i]])
                    dfs(lh + xrr[i], lw + yrr[i]);

        }
    }

}
