import java.util.*;


public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();

        long result = factorial(n) / (factorial(k) * factorial(n-k));

        System.out.println(result);

    }

    public static long factorial(int x) {
        long result = 1;

        for(int i = 2; i<=x; i++)
            result*=i;

        return result;
    }
}