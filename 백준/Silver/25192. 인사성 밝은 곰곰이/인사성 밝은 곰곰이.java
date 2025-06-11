import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        int size = 0;
        Set<String> set = new HashSet<>();
        for(int i = 0; i<N; i++) {
            String str = br.readLine();
            if(str.equals("ENTER")) {
                size+=set.size();
                set = new HashSet<>();
            }
            else {
                set.add(str);
            }

        }

        size+=set.size();
        System.out.println(size);
    }
}
