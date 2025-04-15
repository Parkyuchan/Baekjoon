import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = scanner.nextInt();
        int end = scanner.nextInt();

        int all_sum = 0;
        int part_sum = 0;
        int count = 0;
        int result = 0;

        for(int i = 1; i<=end; i++) {
            for(int j = 0; j<i; j++) {
                if(count == end)
                    break;
                all_sum += i;
                count++;
            }

            if(count == end)
                break;
        }

        count = 0;
        for(int i = 1; i<start; i++) {

            for(int j = 0; j<i; j++){
                if(count == start - 1)
                    break;
                part_sum += i;
                count++;
            }

            if(count == start - 1)
                break;
        }


        result = all_sum - part_sum;
        System.out.println(result);

    }

}
