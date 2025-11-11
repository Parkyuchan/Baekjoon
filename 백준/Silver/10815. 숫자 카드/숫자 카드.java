import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) throws IOException {

       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringBuilder sb = new StringBuilder();

       int N = Integer.parseInt(br.readLine());
       Map<Integer, Integer> keep = new HashMap<>();
       StringTokenizer st = new StringTokenizer(br.readLine());

       for (int i = 0; i < N; i++) {
           int num = Integer.parseInt(st.nextToken());
           if (!keep.containsKey(num))
               keep.put(num, 1);
       }

       int M = Integer.parseInt(br.readLine());
       st = new StringTokenizer(br.readLine());

       for (int i = 0; i < M; i++) {
           int num = Integer.parseInt(st.nextToken());

           if (keep.containsKey(num))
               sb.append(1 + " ");
           else
               sb.append(0 + " ");
       }

        System.out.println(sb);

    }

}