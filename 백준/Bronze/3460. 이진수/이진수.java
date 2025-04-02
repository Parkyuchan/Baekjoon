import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        for(int i = 0; i<N; i++){
            int num = scanner.nextInt();
            int j = 1;
            int index = 0;
            int changeNum = 0;
            while(num >= 1){
                if(num == 1){
                    changeNum = num*j;
                    System.out.print(index + " ");
                    break;
                }

                int na = num%2;
                num/=2;
                
                if(na == 1) {
                    changeNum = na*j;
                    System.out.print(index + " ");
                }

                j*=10;
                index += 1;
            }
        }


    }
}