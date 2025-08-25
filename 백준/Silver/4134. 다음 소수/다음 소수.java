import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        for (long i = 0; i<N; i++) {
            long num = Long.parseLong(br.readLine());

            if (num <= 2) {
                sb.append(2).append("\n");
                continue;
            }
            if (num % 2 == 0)
                num++;

            while (true) {
                boolean isPrime = true;
                for (long j = 3; j*j<=num; j+=2)
                    if (num % j == 0) {
                        isPrime = false;
                        break;
                    }

                if (!isPrime)
                    num += 2;
                else {
                    sb.append(num).append("\n");
                    break;
                }
            }
        }

        System.out.println(sb);
    }
}
