import java.util.*;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int min = 0;

        int i = 1;
        while(i <= a && i <= b) {
            if(a % i == 0 && b % i == 0)
                min = i;
            i++;
        }

        int result = 1;

        i = 1;
        while(i<=a && i<=b) {
            if(a%i == 0 && b%i == 0){
                result = i;
            }
            i++;
        }

        int result_num = (a*b) / result;

        System.out.println(min);
        System.out.println(result_num);
    }
}