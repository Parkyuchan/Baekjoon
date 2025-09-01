import java.io.*;

public class Main {
    private static char[] result;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;

        while ((line = br.readLine()) != null) {
            int N = Integer.parseInt(line);
            int n = (int)Math.pow(3, N);
            StringBuilder sb = new StringBuilder();

            result = new char[n];

            for (int i = 0; i<n; i++)
                result[i] = '-';

            splitList(0, n - 1);

            for (int i = 0; i<n; i++)
                sb.append(result[i]);
            System.out.println(sb);
        }
    }

    private static void splitList(int start, int end) {

        int len = end - start;
        if ((len <= 0))
            return;

        int spaceIndex = (len + 1) / 3;
        for (int i = start + spaceIndex; i<start + spaceIndex * 2; i++)
            result[i] = ' ';

        splitList(start, start + ((len + 1) / 3) - 1);
        splitList(start + ((len + 1) / 3 * 2), end);

    }

}
