import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int count = 0;

        for(int i = 666; ; i++) {


            if(count == num) {
                System.out.println(i - 1);
                break;
            }

            String change = String.valueOf(i);

            if(change.contains("666"))
                count++;
        }


    }

}