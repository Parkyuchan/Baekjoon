import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long S = scanner.nextLong();
        long sum = 0;
        long num = 1;
        int N = 0;
        
        while(sum + num <= S) {

            sum += num;
            N++;
            num++;
        }

        System.out.println(N);
    }
}
