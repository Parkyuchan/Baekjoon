import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();
        String[] str2 = str.split("");
        int[] num = new int[str2.length];

        for(int i = 0; i<str2.length; i++)
            num[i] = Integer.parseInt(str2[i]);


        Arrays.sort(num);

        for(int i = num.length - 1; i>=0; i--)
            sb.append(num[i]);

        System.out.println(sb);
    }

}
