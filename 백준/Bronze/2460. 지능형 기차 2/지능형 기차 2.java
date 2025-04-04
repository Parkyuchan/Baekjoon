import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int in;
        int out;
        int max = 0;
        int sum = 0;

        for(int i = 0; i<10; i++) {
            out = scanner.nextInt();
            in = scanner.nextInt();
            sum += (in - out);

            if(sum > max)
                max = sum;
        }

        System.out.println(max);

    }
}

