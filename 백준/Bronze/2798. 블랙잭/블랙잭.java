import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int num = scanner.nextInt();
        int[] list = new int[N];

        for(int i = 0; i<N; i++)
            list[i] = scanner.nextInt();

        Arrays.sort(list);


        int max = 0;

        for(int i = 0; i<N - 2; i++) {
            for(int j = i + 1; j<N - 1; j++) {
                for(int k = j + 1; k<N; k++) {
                    int sum = list[i] + list[j] + list[k];
                    if(sum <= num && sum > max)
                        max = sum;
                }
            }
        }

        System.out.println(max);
    }
}
