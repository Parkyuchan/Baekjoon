import java.util.*;


public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int[][] xy = new int[N][2];

        for(int i = 0; i<N; i++){
            xy[i][0] = scanner.nextInt();
            xy[i][1] = scanner.nextInt();
        }

        int max_x = -10000;
        int min_x = 10000;
        int max_y = -10000;
        int min_y = 10000;

        for(int i = 0; i<N; i++) {

            min_x = Math.min(min_x, xy[i][0]);
            max_x = Math.max(max_x, xy[i][0]);

            min_y = Math.min(min_y, xy[i][1]);
            max_y = Math.max(max_y, xy[i][1]);

        }

        int result = (max_x - min_x) * (max_y - min_y);
        System.out.println(result);
    }
}