import java.math.BigInteger;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        System.out.println(MenOfPassion(N));
        System.out.println(1);
    }

    public static int MenOfPassion(int n) {
        int sum = 0;
        for(int i = 1; i<=n; i++)
            sum ++;
        return sum;
    }
}