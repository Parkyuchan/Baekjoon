import java.util.*;


public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int h = scanner.nextInt();
        int w = scanner.nextInt();

        int min_x = Math.min(x, h-x);
        int min_y = Math.min(y, w-y);

        System.out.println(Math.min(min_y, min_x));
    }
}