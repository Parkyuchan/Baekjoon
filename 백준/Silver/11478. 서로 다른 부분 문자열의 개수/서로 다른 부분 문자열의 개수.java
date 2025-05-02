import java.io.*;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();

        int size = str.length();
        int count = 0;

        for(int i = 0; i<size; i++) {
            Set<String> set = new HashSet<>();

            for(int j = 0; j<size; j++) {

                if(j+i <= size) {
                    set.add(str.substring(j, j + i));
                }
            }

            count+=set.size();
        }

        System.out.println(count);
    }

}
