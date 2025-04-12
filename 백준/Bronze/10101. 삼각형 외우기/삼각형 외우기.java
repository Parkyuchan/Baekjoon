import java.util.*;


public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();

        if(x == y && y == z && x == 60)
            System.out.println("Equilateral");
        else if((x + y + z) != 180)
            System.out.println("Error");
        else if(x == y || y == z || x == z)
            System.out.println("Isosceles");
        else
            System.out.println("Scalene");
    }
}