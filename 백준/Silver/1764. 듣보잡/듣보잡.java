import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        String[] line = br.readLine().split(" ");

        int N = Integer.parseInt(line[0]);
        int M = Integer.parseInt(line[1]);

        Map<String, Integer> map = new HashMap<>(N);

        for(int i = 0; i<N; i++)
            map.put(br.readLine(), 0);

        List<String> list = new ArrayList<>();

        for(int i = 0; i<M; i++) {
            String str = br.readLine();
            if(map.containsKey(str))
                list.add(str);
        }

        Collections.sort(list);

        sb.append(list.size()).append("\n");

        for(int i = 0; i<list.size(); i++)
            sb.append(list.get(i)).append("\n");

        System.out.println(sb);
    }
}
