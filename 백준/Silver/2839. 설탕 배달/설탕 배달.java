import java.io.*;
class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int remain = N % 5;
        int count = N / 5;

        while (remain > 0) {
            if (count == -1)
                break;

            if (remain % 3 == 0) {
                count += remain / 3;
                break;
            }

            count--;
            remain += 5;
        }

        System.out.println(count);

    }

}