import java.math.BigInteger;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        for(int i = 0; i<N; i++) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            BigInteger result;

            if (n >= k) {
                result = factorial(BigInteger.valueOf(n))
                        .divide(factorial(BigInteger.valueOf(k))
                                .multiply(factorial(BigInteger.valueOf(n - k))));
            } else {
                result = factorial(BigInteger.valueOf(k))
                        .divide(factorial(BigInteger.valueOf(n))
                                .multiply(factorial(BigInteger.valueOf(k - n))));
            }

            System.out.println(result);

        }
    }

    public static BigInteger factorial(BigInteger x) {
        BigInteger result = BigInteger.ONE;

        for(BigInteger i = BigInteger.valueOf(2); i.compareTo(x) <= 0; i = i.add(BigInteger.ONE))
            result = result.multiply(i);

        return result;
    }
}