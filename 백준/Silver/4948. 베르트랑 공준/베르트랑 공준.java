import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();


        while(true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0)
                break;

            int count = 0;
            for (int i = n + 1; i<=n*2; i++)
                count += isPrime(i);

            sb.append(count).append("\n");
        }
        System.out.println(sb);
    }

    private static int isPrime(int num) {

        boolean check = true;
        if (num == 2)
            return 1;

        if (num % 2 == 0)
            return 0;

        for (int i = 3; i*i<=num; i+=2) {
            if (num % i == 0) {
                check = false;
                break;
            }
        }

        if (!check)
            return 0;
        else return 1;
    }
}
