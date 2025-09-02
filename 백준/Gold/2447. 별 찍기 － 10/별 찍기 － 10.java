import java.io.*;

public class Main {

    private static int N;
    private static char[][] star;
    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        star = new char[N][N];

        for (int i = 0; i<N; i++) {
            for (int j = 0; j<N; j++)
                star[i][j] = '*';
        }

        for (int i = 0; i<N; i++) {
            for (int j = 0; j<N; j++)
                throwStar(i, j);
        }
        for (int i = 0; i<N; i++) {
            for (int j = 0; j<N; j++)
                sb.append(star[i][j]);
            sb.append("\n");
        }

        System.out.println(sb);
    }

    private static void throwStar(int x, int y) {

        int i = x;
        int j = y;

        while (x > 0 || y > 0) {
            if (x % 3 == 1 && y % 3 == 1) {
                star[i][j] = ' ';
                return;
            }
            x /= 3;
            y /= 3;
        }
    }

}
