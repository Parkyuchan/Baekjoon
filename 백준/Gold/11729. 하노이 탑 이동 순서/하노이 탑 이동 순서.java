import java.io.*;
import java.util.Stack;

public class Main {

    private static int N;
    private static StringBuilder sb = new StringBuilder();
    private static int count = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        hanoi(N, 1, 3);

        System.out.println(count);
        System.out.println(sb);
    }

    private static void hanoi(int n, int x, int y) {
        count++;

        if (n > 1) {
            hanoi(n - 1, x, 6 - x - y);
        }

        sb.append(x).append(" ").append(y).append("\n");

        if (n > 1) {
            hanoi(n - 1, 6 - x - y, y);
        }



    }
}
