import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            Stack<String> stack = new Stack<>();
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            boolean check = true;
            for (int j = 0; j < str.length(); j++) {
                if (String.valueOf(str.charAt(j)).equals("("))
                    stack.push("(");
                else {
                    if (stack.isEmpty()) {
                        check = false;
                        break;
                    }

                    stack.pop();
                }
            }

            if (!check || !stack.isEmpty())
                sb.append("NO");
            else sb.append("YES");
            sb.append("\n");
        }

        System.out.println(sb);

    }

}