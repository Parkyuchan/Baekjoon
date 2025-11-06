import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int remain = N % 5;
        int count = N / 5;

        while(remain <= N) {
            if (remain % 3 == 0) {
                count += remain / 3;
                break;
            }

            remain += 5;
            count--;
        }

        System.out.println(count);

    }

}