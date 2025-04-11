import java.util.*;


public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] num = new int[N];

        for(int i = 0; i<N; i++) {
            num[i] = scanner.nextInt();
        }

        int count = 0;

        for(int i = 0; i<N; i++) {
            if(num[i] < 2) {
                continue;
            }

            boolean flag = true;

            for(int j = 2; j<=(int)Math.sqrt(num[i]); j++){
                if(num[i]%j == 0){
                    flag = false;
                    break;
                }

            }

            if(flag)
                count++;
        }
        System.out.println(count);
    }
}