import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        String str = br.readLine();
        List<String> list = new ArrayList<>();

        for (int i = 0; i < (1 << N); i++) {
            String bin = Integer.toBinaryString(i);

            if (bin.length() < N) {
                bin = "0".repeat(N - bin.length()) + bin;
            }

            list.add(bin);
        }

        Collections.sort(list, (a, b) -> {
            int ca = countOne(a);
            int cb = countOne(b);

            if (ca != cb) return ca - cb;

            String ra = new StringBuilder(a).reverse().toString();
            String rb = new StringBuilder(b).reverse().toString();
            return ra.compareTo(rb);
        });

        int answer = list.indexOf(str);
        System.out.println(answer);

    }

    static int countOne(String s) {
        int c = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '1') c++;
        }

        return c;
    }

}