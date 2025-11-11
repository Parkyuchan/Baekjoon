import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) throws IOException {

       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringBuilder sb = new StringBuilder();
       StringTokenizer st = new StringTokenizer(br.readLine());

       int N = Integer.parseInt(st.nextToken());
       int M = Integer.parseInt(st.nextToken());

       Set<String> set = new HashSet<>();
       Set<String> result = new HashSet<>();

       for (int i = 0; i < N; i++) {
           set.add(br.readLine());
       }

       for (int i = 0; i < M; i++) {
           String input = br.readLine();
           if (set.contains(input)) {
               result.add(input);
           }
       }

       String[] answer = result.toArray(new String[0]);
       Arrays.sort(answer);
       sb.append(answer.length).append("\n");

       for (int i = 0; i < answer.length; i++) {
           sb.append(answer[i]).append("\n");
       }

       System.out.println(sb);

    }

}