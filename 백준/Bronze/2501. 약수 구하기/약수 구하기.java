import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int count = 0 ;
        int i;

        for(i = 1; i<=n; i++){
            if(n%i == 0)
                count++;

            if(count == k)
                break;
        }

        if(i > n)
            System.out.println(0);
        else
            System.out.println(i);

    }
}