import java.util.*;


public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        int num = scanner.nextInt();
        int count = 2;
        while(true) {

            if(num < 2)
                return;

            boolean flag = true;
            for(int i = 2; i<=num/2; i++) {
                if(num % i == 0) {
                    list.add(i);
                    num/=i;
                    flag = false;
                    break;
                }
            }

            if(flag)
                break;

        }


        Collections.sort(list);
        for(int i = 0; i<list.size(); i++)
            System.out.println(list.get(i));

        System.out.println(num);
    }
}