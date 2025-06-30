import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Map<String, Integer> map1 = new HashMap<>(N);
        Map<Integer, String> map2 = new HashMap<>(N);

        for(int i = 1; i<=N; i++) {
            String str = br.readLine();
            map1.put(str, i);
            map2.put(i, str);
        }
        
        for(int i = 0; i<M; i++) {
            String question = br.readLine();

            if(map1.containsKey(question))
                sb.append(map1.get(question)).append("\n");
            else {
                sb.append(map2.get(Integer.parseInt(question))).append("\n");
            }
        }

        System.out.println(sb);

    }
}
