import java.io.*;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] n_m = br.readLine().split(" ");
        int N = Integer.parseInt(n_m[0]);
        int M = Integer.parseInt(n_m[1]);

        Set<String> set = new HashSet<>(N);

        for(int i = 0; i<N; i++) {
            set.add(br.readLine());
        }

        List<String> list = new ArrayList<>(M);
        for(int i = 0; i<M; i++){
            list.add(br.readLine());
        }

        int count = 0;

        for(int i = 0; i<M; i++) {
            if(set.contains(list.get(i))){
                count++;
            }

        }

        System.out.println(count);

    }

}
