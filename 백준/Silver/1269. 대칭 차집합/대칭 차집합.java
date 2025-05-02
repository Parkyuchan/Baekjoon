import java.io.*;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String [] str = br.readLine().split(" ");
        int N = Integer.parseInt(str[0]);
        int M = Integer.parseInt(str[1]);

        HashSet<Integer> set1 = new HashSet<>(N);
        HashSet<Integer> set2 = new HashSet<>(M);

        String [] input1 = br.readLine().split(" ");
        for(int i = 0; i<N; i++)
            set1.add(Integer.parseInt(input1[i]));

        String [] input2 = br.readLine().split(" ");
        for(int i = 0; i<M; i++)
            set2.add(Integer.parseInt(input2[i]));

        Iterator<Integer> iterator = set1.iterator();
        List<Integer> list = new ArrayList<>(set1);

        for(int i = 0; i<list.size(); i++)
            if(set2.contains(list.get(i))){
                set1.remove(list.get(i));
                set2.remove(list.get(i));
            }

        System.out.println(set1.size() + set2.size());
    }

}
