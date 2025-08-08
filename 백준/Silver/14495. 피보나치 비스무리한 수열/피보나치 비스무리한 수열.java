import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        long[] fibo = new long[116];
        fibo[0] = fibo[1] = fibo[2] = 1;

        if (N > 3) {
            for (int i = 3; i < N; i++) {
                fibo[i] = fibo[i - 1] + fibo[i - 3];
            }
        }

        System.out.println(fibo[N-1]);
    }

}
