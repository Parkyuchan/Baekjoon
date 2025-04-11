import java.util.*;


public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] croatias = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        String input = scanner.nextLine();

        for(int i = 0; i<croatias.length; i++) {
            if(input.contains(croatias[i]))
                input = input.replace(croatias[i], "@");
        }

        System.out.println(input.length());

    }
}