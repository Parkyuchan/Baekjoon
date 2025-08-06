import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] list = new int[N];

        for (int i = 0; i<N; i++)
            list[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(list);

        int sum = 0;

        for (int i = 0; i<N; i++) {
            if (sum + 1 < list[i])
                break;

            sum += list[i];
        }

        System.out.println(sum + 1);

    }

}
