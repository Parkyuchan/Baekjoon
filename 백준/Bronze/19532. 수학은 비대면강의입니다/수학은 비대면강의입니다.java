import java.util.*;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int result1 = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int result2 = scanner.nextInt();

        for(int x = -999; x<=999; x++) {
            for(int y = -999; y<=999; y++) {
                if(a*x + b*y == result1 && c*x + d*y == result2) {
                    System.out.println(x + " " + y);
                    return;
                }

            }
        }

    }

}
