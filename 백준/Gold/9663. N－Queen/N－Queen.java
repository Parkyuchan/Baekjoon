import java.io.*;

public class Main {

    private static int N;
    private static int[] nq;
    private static boolean[] flag_a;
    private static boolean[] flag_b;
    private static boolean[] flag_c;
    private static int count = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        nq = new int[N];
        flag_a = new boolean[N];
        flag_b = new boolean[N * 2 - 1];
        flag_c = new boolean[N * 2 - 1];

        queen(0);
        System.out.println(count);
    }

    private static void queen(int n) {
        for (int i = 0; i < N; i++) {
            if (!flag_a[i] && !flag_b[n + i] && !flag_c[n - i + N - 1]) {
                nq[i] = n;

                if (n == N - 1) {
                    count++;
                } else {
                    flag_a[i] = flag_b[n + i] = flag_c[n - i + N - 1] = true;
                    queen(n + 1);
                    flag_a[i] = flag_b[n + i] = flag_c[n - i + N - 1] = false;
                }
            }
        }
    }
}
