import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String input = br.readLine();
        StringTokenizer token = new StringTokenizer(input, " ");

        Set<Integer> set = new HashSet<>();

        for(int i = 0; i<N; i++){
            set.add(Integer.parseInt(token.nextToken()));
        }

        int M = Integer.parseInt(br.readLine());
        input = br.readLine();

        token = new StringTokenizer(input, " ");

        for(int i = 0; i<M; i++) {
            if (set.contains(Integer.parseInt(token.nextToken())))
                System.out.println(1);
            else
                System.out.println(0);
        }
    }
}