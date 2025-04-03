import java.util.*;

public class Main {

    static int MAX = Integer.MIN_VALUE;
    static int MIN = Integer.MAX_VALUE;
    static int[] value;
    static int[] list = new int[4];
    static int N;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        N = scanner.nextInt();
        value = new int[N];

        for(int i = 0; i<N; i++)
            value[i] = scanner.nextInt();

        for(int i = 0; i<4; i++)
            list[i] = scanner.nextInt();

        dfs(value[0], 1);

        System.out.println(MAX);
        System.out.println(MIN);

    }

    public static void dfs(int num, int idx) {

        if (idx == N) {
            MAX = Math.max(MAX, num);
            MIN = Math.min(MIN, num);
            return;
        }

        for(int i = 0; i<4; i++){
            if(list[i] > 0){
                list[i]--;

                switch(i) {
                    case 0 :
                        dfs(num + value[idx], idx + 1); break;
                    case 1 :
                        dfs(num - value[idx], idx + 1); break;
                    case 2 :
                        dfs(num * value[idx], idx + 1); break;
                    case 3 :
                        dfs(num / value[idx], idx + 1); break;

                }
                list[i]++;
            }


        }


    }
}