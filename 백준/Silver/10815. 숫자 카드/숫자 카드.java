import java.io.*;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        String[] num = br.readLine().split(" ");
        Set<Integer> first_set = new HashSet<>(N);

        for(int i = 0; i<N; i++)
            first_set.add(Integer.parseInt(num[i]));

        int M = Integer.parseInt(br.readLine());

        String[] eq = br.readLine().split(" ");
        List<Integer> list_second = new ArrayList<>(M);

        for(int i = 0; i<M; i++) {
            list_second.add(Integer.parseInt(eq[i]));
            if (first_set.contains(list_second.get(i)))
                sb.append(1).append(" ");
            else
                sb.append(0).append(" ");

        }

        System.out.println(sb);
    }

}
