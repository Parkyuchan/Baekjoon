import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        String pattern = br.readLine();

        String[] parts = pattern.split("\\*", -1);
        String prefix = parts[0];
        String suffix = parts[1];

        for (int i = 0; i<N; i++) {
            String input = br.readLine();

            if (input.length() < prefix.length() + suffix.length()) {
                sb.append("NE\n");
                continue;
            }

            boolean check = input.startsWith(prefix) && input.endsWith(suffix);
            sb.append(check ? "DA\n" : "NE\n");
        }

        System.out.println(sb);
    }

}
