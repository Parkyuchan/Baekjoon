import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        String game = st.nextToken();
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i<N; i++) {
            String name = br.readLine();
            if (!map.containsKey(name))
                map.put(name, 0);
        }

        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        int size = list.size();
        if (game.equals("F"))
            size/=2;
        else if (game.equals("O"))
            size/=3;

        System.out.println(size);
    }

}
