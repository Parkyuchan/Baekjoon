import java.io.*;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        int[] num = new int[N];
        String[] list = br.readLine().split(" ");

        for(int i = 0; i<N; i++){
            num[i] = Integer.parseInt(list[i]);
        }

        int[] sortedNum = Arrays.copyOf(num, N);
        Map<Integer, Integer> map = new HashMap<>();
        Arrays.sort(num);
        int idx = 0;

        for(int i = 0; i<N; i++) {

            if(!map.containsKey(num[i]))
                map.put(num[i], idx++);
        }

        for(int i = 0; i<N; i++)
            sb.append(map.get(sortedNum[i])).append(" ");


        System.out.print(sb);

    }

}
