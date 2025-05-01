import java.io.*;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        Set<String> set = new HashSet<>();

        for(int i = 0; i<N; i++) {
            String[] log = br.readLine().split(" ");

            String name = log[0];
            String now = log[1];

            if(now.equals("enter"))
                set.add(name);
            else
                set.remove(name);
        }

        List<String> result = new ArrayList<>(set);
        Collections.sort(result, Collections.reverseOrder());

        for(String name : result)
            System.out.println(name);
    }

}
