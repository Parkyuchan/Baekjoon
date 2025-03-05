import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int v = scanner.nextInt();
        // 마지막 날에는 a만큼 올라가므로, 마지막 날을 빼고 남은 높이
        int days = (int) Math.ceil((double)(v - a) / (a - b)) + 1;
        System.out.println(days);
    }
}