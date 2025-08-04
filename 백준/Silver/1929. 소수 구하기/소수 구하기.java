import java.io.*;
import java.util.*;

import static java.lang.Math.sqrt;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        boolean [] isNotPrime = new boolean[M+1];
        isNotPrime[0] = isNotPrime[1] = true;

        for(int i = 2; i*i<=M; i++) {
            if (!isNotPrime[i])
                for(int j = i*i; j<=M; j+=i) {
                    isNotPrime[j] = true;
                }
        }

        for (int i = N; i <= M; i++) {
            if (!isNotPrime[i])
                 sb.append(i).append("\n");
        }

        System.out.println(sb);

    }
}
