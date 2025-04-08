import java.util.*;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] arr = new int[9];
        int sum = 0;

        for(int i = 0; i<9; i++) {
            int num = scanner.nextInt();
            arr[i] = num;
            sum += num;
        }
        Arrays.sort(arr);

        int a = 0;
        int b = 0;

        for(int i = 0; i<9; i++) {
            for(int j = i + 1; j<9; j++) {
                if(sum - arr[i] - arr[j] == 100){
                    a = i;
                    b = j;
                }
            }
        }

        for(int i = 0; i<9; i++) {
            if(i != a && i != b) {
                System.out.println(arr[i]);
            }
        }

    }
}

