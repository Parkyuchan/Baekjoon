import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int c = scanner.nextInt();
        int n = scanner.nextInt();

        int result1 = first*n + second;
        int result2 = c*n;

        if(first <= c && result1<=result2)
            System.out.println(1);
        else
            System.out.println(0);
    }

}