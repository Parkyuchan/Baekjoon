import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] list = new int[N];

        for (int i = 0; i<N; i++)
            list[i] = Integer.parseInt(br.readLine());

        Arrays.sort(list);

        int gcd = 0;
        for (int i = 0; i<N - 1; i++)
            gcd = gcd(list[i + 1] - list[i], gcd);

        System.out.println((list[N - 1] - list[0]) / gcd + 1 - list.length);
    }

    private static int gcd(int a, int b) {
        while (b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }

        return a;
    }

}
