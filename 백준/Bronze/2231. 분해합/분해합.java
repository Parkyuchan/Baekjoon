import java.util.*;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int con = 0;

        for(int i = num - 9 * String.valueOf(num).length(); i<num; i++) {
            int sum = i;
            int temp = i;

            while(temp != 0) {
                sum += temp % 10;
                temp /= 10;
            }

            if(sum == num) {
                con = i;
                break;
            }
        }

        System.out.println(con);
    }

}
