import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        int[] num = new int[N];
        int maxN = 0;

        for (int i = 0; i<N; i++) {
            num[i] = Integer.parseInt(br.readLine());
            if (maxN < num[i])
                maxN = num[i];
        }

        boolean[] prime = new boolean[maxN + 1];
        prime[2] = true;

        for (int i = 3; i<=maxN; i+=2) {
            if (isPrime(i))
                prime[i] = true;
        }

        for (int i = 0; i<N; i++) {
            int count = 0;

            if (prime[2] && prime[num[i] - 2]) count++;
            for (int j = 3; j<=num[i]/2; j+=2) {
                if (prime[j] && prime[num[i] - j])
                    count++;
            }

            sb.append(count).append("\n");
        }
        System.out.println(sb);
    }

    private static boolean isPrime(int num) {

        if (num == 2)
            return true;
        if (num < 2)
            return false;
        if (num % 2 == 0)
            return false;

        boolean check = true;

        for (int i = 3; i*i<=num; i+=2) {
            if (num % i == 0) {
                check = false;
                break;
            }
        }

        if (!check) {
            return false;
        }

        return true;
    }
}
