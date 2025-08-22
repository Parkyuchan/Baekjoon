import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        int sum = 0;

        for (int i = 0; i<N; i++) {
            int num = Integer.parseInt(br.readLine());
            list.add(num);
            map.put(num, map.getOrDefault(num, 0) + 1);
            sum+=num;
        }
        Collections.sort(list);

        int max = 0;
        List<Integer> maxList = new ArrayList<>();
        for (Integer key : map.keySet()) {
            if (map.get(key) > max) {
                maxList.clear();
                maxList.add(key);
                max = map.get(key);
            } else if (map.get(key) == max) {
                maxList.add(key);
            }
        }
        Collections.sort(maxList);

        int mode = 0;
        if (maxList.size() > 1)
            mode = maxList.get(1);
        else
            mode = maxList.get(0);

        int avg = (int) Math.round((double) sum / N);

        sb.append(avg).append("\n").append(list.get(list.size()/2)).append("\n").append(mode).append("\n").append(list.get(list.size() - 1) - list.get(0));
        System.out.println(sb);


    }

}
