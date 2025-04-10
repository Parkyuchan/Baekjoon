import java.util.*;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        for(int i = 0; i<N; i++) {
            int [] num = new int[10];

            for(int j = 0; j<10; j++) {
                num[j] = scanner.nextInt();
            }

            Arrays.sort(num);

            System.out.println(num[7]);
        }
    }
}