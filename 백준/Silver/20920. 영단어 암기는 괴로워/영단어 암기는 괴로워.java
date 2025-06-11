import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        Map<String, Integer> map = new LinkedHashMap<>();
        List<String> list = new ArrayList<>();

        int N = Integer.parseInt(st.nextToken());
        int len = Integer.parseInt(st.nextToken());

        for(int i = 0; i<N; i++) {
            String str = br.readLine();

            if(str.length() >= len) {
                if(map.get(str) == null)
                    list.add(str);

                map.put(str, map.getOrDefault(str, 0) + 1);
            }
        }

        list.sort((word1, word2) -> {
            if(map.get(word1) != map.get(word2)) {
                return map.get(word2) - map.get(word1);
            } else if(word1.length() != word2.length()) {
                return word2.length() - word1.length();
            } else {
                return word1.compareTo(word2);
            }
        });

        for(int i = 0; i<list.size(); i++) {
            bw.write(list.get(i));
            bw.newLine();
        }

        bw.flush();

    }
}
