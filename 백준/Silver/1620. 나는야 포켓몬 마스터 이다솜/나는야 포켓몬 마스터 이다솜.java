import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) throws IOException {

       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringBuilder sb = new StringBuilder();

       StringTokenizer st = new StringTokenizer(br.readLine());
       int N = Integer.parseInt(st.nextToken());
       int M = Integer.parseInt(st.nextToken());
       Map<String, String> name = new HashMap<>();
       Map<String, String> index = new HashMap<>();

       for (int i = 1; i <= N; i++) {
           String input = br.readLine();
           name.put(input, String.valueOf(i));
           index.put(String.valueOf(i), input);
       }

       for (int i = 0; i < M; i++) {
           String input = br.readLine();
           if (name.containsKey(input))
               sb.append(name.get(input));
           else
               sb.append(index.get(input));

           sb.append("\n");
       }

        System.out.println(sb);

    }

}