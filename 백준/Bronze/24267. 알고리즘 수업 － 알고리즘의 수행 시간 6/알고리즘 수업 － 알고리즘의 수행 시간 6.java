import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        System.out.println((long) n * (n-1) * (n-2) / 6); // 정확한 수행 횟수
        System.out.println(3);
    }

}