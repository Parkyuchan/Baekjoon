import java.lang.reflect.Array;
import java.util.*;


public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] list = new int[3];

        while(true) {
            for(int i = 0; i<3; i++) {
                list[i] = scanner.nextInt();
            }

            if(list[0] == 0 || list[1] == 0 || list[2] == 0)
                break;

            Arrays.sort(list);

            if(list[2] >= list[0] + list[1])
                System.out.println("Invalid");
            else if(list[0] == list[1] && list[1] == list[2])
                System.out.println("Equilateral");
            else if(list[0] == list[1] || list[1] == list[2] || list[0] == list[2])
                System.out.println("Isosceles");
            else
                System.out.println("Scalene");
        }
    }
}