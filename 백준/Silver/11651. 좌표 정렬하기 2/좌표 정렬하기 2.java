import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int [][] num = new int[N][2];

        for(int i = 0; i<N; i++){
            String str = br.readLine();
            String[] str2 = str.split(" ");
            for(int j = 0; j<2; j++)
                num[i][j] = Integer.parseInt(str2[j]);
        }

        Arrays.sort(num, (a, b) -> {
            if(a[1] == b[1])
                return Integer.compare(a[0], b[0]);

            return Integer.compare(a[1], b[1]);
        });

        for(int i = 0; i<N; i++) {
            for (int j = 0; j < 2; j++)
                System.out.print(num[i][j] + " ");
            System.out.println();
        }

    }

}
