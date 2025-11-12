import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) throws IOException {

       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

       int M = Integer.parseInt(br.readLine());
       int N = Integer.parseInt(br.readLine());

       int result = 0;
       int min = 0;

       for (int i = M; i <= N; i++) {

           if (i == 2) {
               result += i;
               min = i;
               continue;
           }
           if (i % 2 == 0 || i < 2)
               continue;

           boolean check = false;

           for (int j = 3; j * j <= i; j+=2) {
               if (i % j == 0) {
                   check = true;
                   break;
               }
           }

           if (!check) {
               if (result == 0)
                   min = i;

               result += i;
           }
       }

       result = result != 0 ? result : -1;

       System.out.println(result);
       if (min != 0) {
           System.out.println(min);

       }
    }

}