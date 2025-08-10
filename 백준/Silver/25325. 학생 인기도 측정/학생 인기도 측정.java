import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        Map<String, Integer> map = new HashMap<>(N);
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i<N; i++)
            map.put(st.nextToken(), 0);

        for (int i = 0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            while(st.hasMoreTokens()) {
                String str = st.nextToken();
                map.put(str, map.get(str) + 1);
            }
        }

        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((a, b) -> {
            int c = Integer.compare(b.getValue(), a.getValue());
            if (c != 0) return c;
            return a.getKey().compareTo(b.getKey());
        });

        for (int i = 0; i<N; i++)
            sb.append(list.get(i).getKey()).append(" ").append(list.get(i).getValue()).append("\n");
        System.out.println(sb);

    }

}
