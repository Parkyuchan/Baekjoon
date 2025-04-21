import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        Set<String> set = new HashSet<>();
        while (N-- > 0) {
            set.add(br.readLine());
        }

        List<String> list = new ArrayList<>(set);

        Collections.sort(list, (a, b) -> {
            if(a.length() > b.length())
                return 1;
            else if(a.length() == b.length())
                return a.compareTo(b);

            return -1;
        });

        for(int i = 0; i<list.size(); i++)
            System.out.println(list.get(i));

    }

}
