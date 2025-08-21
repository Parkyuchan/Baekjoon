import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int gcd = gcd(b, y);
        int lcm = b * y / gcd;

        a = a*(lcm/b);
        x = x*(lcm/y);
        int result = a + x;

        int resultGCD = gcd(lcm, result);
        lcm /= resultGCD;
        result /= resultGCD;

        sb.append(result).append(" ").append(lcm);

        System.out.println(sb);
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
