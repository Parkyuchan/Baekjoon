import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        long[] pibo = new long[101];
        pibo[1] = pibo[2] = pibo[3] = 1;

        for (int i = 0; i < N; i++) {
            int input = Integer.parseInt(br.readLine());

            if (input > 3) {
                for (int j = 4; j <= input; j++) {
                    pibo[j] = pibo[j - 2] + pibo[j - 3];
                }
            }

            sb.append(pibo[input]).append("\n");
        }

        System.out.println(sb);

    }
}