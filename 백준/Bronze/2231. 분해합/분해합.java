import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int result = 0;

        int digits = String.valueOf(N).length();
        int start = N - (digits * 9);
        if (start < 1) start = 1;

        for (int i = start; i < N; i++) {
            int sum = i;
            int x = i;

            while(x > 0) {
                sum += x % 10;
                x /= 10;
            }

            if (sum == N) {
                result = i;
                break;
            }
        }

        System.out.println(result);
    }

}