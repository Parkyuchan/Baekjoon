import java.io.*;
import java.util.StringTokenizer;

public class Main {

    static int N;
    static int M;
    static int[] arr;
    static boolean[] visit;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[M];
        visit = new boolean[N];
        dfs(0);
    }

    private static void dfs(int depth) {
        if (M == depth) {
            for (int val : arr) {
                System.out.print(val + " ");
            }
            System.out.println();
            return;
        }

        for (int i = 0; i<N; i++) {
            if (!visit[i]) {
                visit[i] = true;
                arr[depth] = i + 1;
                dfs(depth + 1);
                visit[i] = false;
            }
        }
    }
}
