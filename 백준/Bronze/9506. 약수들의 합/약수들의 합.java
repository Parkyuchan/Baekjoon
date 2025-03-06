import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            int sum = 0;
            List<Integer> list = new ArrayList<>();
            int n = scanner.nextInt();

            if(n == -1)
                break;

            for(int i = 1; i<=n / 2; i++) {
                if (n % i == 0) {
                    list.add(i);
                    sum += i;
                }
            }
            if (sum == n && n > 0) {
                System.out.print(n + " = ");
                for(int i = 0; i<list.size(); i++){
                    System.out.print(list.get(i));
                    if(i < list.size()-1)
                        System.out.print(" + ");
                }
            }
            else {

                System.out.print(n + " is NOT perfect.");
            }

            System.out.println();
        }

    }
}