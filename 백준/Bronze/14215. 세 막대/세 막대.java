import java.lang.reflect.Array;
import java.util.*;


public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] list = new int[3];

        for(int i = 0; i<3; i++) {
            list[i] = scanner.nextInt();
        }

        Arrays.sort(list);

        if(list[2] >= list[0] + list[1])
            list[2] = list[0] + list[1] - 1;

        System.out.println(list[0] + list[1] + list[2]);

    }
}