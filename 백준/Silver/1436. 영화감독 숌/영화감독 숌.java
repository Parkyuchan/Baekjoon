import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int count = 0;

        for (int i = 666; ; i++) {

            if (count == N) {
                System.out.println(i - 1);
                return;
            }

            if (String.valueOf(i).contains("666"))
                count++;
        }
    }

}