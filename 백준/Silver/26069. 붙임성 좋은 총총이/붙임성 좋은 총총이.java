import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Set<String> set = new HashSet<>();
        String me = "ChongChong";

        for(int i = 0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String a = st.nextToken();
            String b = st.nextToken();

            if(a.equals(me) || b.equals(me) || set.contains(a) || set.contains(b)) {
                set.add(a);
                set.add(b);
            }

        }

        System.out.println(set.size());
    }
}
