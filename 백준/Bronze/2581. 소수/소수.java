import java.util.*;


public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = scanner.nextInt();
        int end = scanner.nextInt();
        int sum = 0;
        int min = -1;

        for(int i = start; i<=end; i++) {
            boolean flag = true;
            if(i < 2)
                continue;
                
            for(int j = 2; j<=(int)Math.sqrt(i); j++) {
                if(i % j == 0) {
                    flag = false;
                    break;
                }
            }

            if(flag) {
                if(sum == 0)
                    min = i;
                sum += i;
            }
        }

        if(sum != 0)
            System.out.println(sum);
        System.out.println(min);
    }
}