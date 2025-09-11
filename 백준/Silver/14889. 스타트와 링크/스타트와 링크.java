import java.io.*;
import java.util.StringTokenizer;

public class Main {

    private static int N;
    private static int min = 200;
    private static boolean visited[];
    private static int[][] S;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        S = new int[N][N];
        visited = new boolean[N];

        for (int i = 0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j<N; j++)
                S[i][j] = Integer.parseInt(st.nextToken());
        }

        start(0, 0);
        System.out.println(min);
    }

    private static void start(int idx, int count) {
        if (count == N / 2) {
            calc();
            return;
        }
        for (int i = idx; i < N; i++) {
            visited[i] = true;
            start(i + 1, count + 1);
            visited[i] = false;
        }
    }

    private static void calc() {
        int start = 0;
        int link = 0;

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (visited[i] && visited[j])
                    start += S[i][j] + S[j][i];
                else if (!visited[i] && !visited[j])
                    link += S[i][j] + S[j][i];
            }
        }

        min = Math.min(min, Math.abs(start - link));

    }
}
