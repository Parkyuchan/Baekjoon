import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        int[] num = new int[N];
        int max = 0;
        int min = 1000000;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i<N; i++) {
            num[i] = Integer.parseInt(st.nextToken());
            if(max < num[i])
                max = num[i];
            if(min > num[i])
                min = num[i];
        }

        sb.append(max*min);
        System.out.println(sb);
    }
}
