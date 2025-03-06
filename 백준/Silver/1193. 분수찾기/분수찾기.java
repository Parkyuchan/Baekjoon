import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        int n = (int) Math.ceil((Math.sqrt(8*x+1) - 1) / 2);
        int offset = x - ((n-1)*n / 2);
        int numerator, denominator;


        if(n % 2 != 0){
            numerator = n + 1 - offset;
            denominator = offset;
        }
        else {
            numerator = offset;
            denominator = n + 1 -offset;
        }

        System.out.println(numerator + "/" + denominator);
    }
}