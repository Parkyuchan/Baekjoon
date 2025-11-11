import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) throws IOException {

       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringBuilder sb = new StringBuilder();

       int N = Integer.parseInt(br.readLine());
       Set<String> set = new HashSet<>();

       for (int i = 0; i < N; i++) {
           String[] input = br.readLine().split(" ");

           if (input[1].equals("enter"))
               set.add(input[0]);
           else
               set.remove(input[0]);
       }

       String[] enter = set.toArray(new String[0]);
       Arrays.sort(enter);

       for (int i = enter.length - 1; i >= 0; i--)
           sb.append(enter[i]).append("\n");

        System.out.println(sb);

    }

}