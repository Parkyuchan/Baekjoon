import java.util.*;


public class Main {

    static int N;
    static int[][] map;
    static List<Integer> danji;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        N = scanner.nextInt();
        scanner.nextLine();
        map = new int[N][N];
        danji = new ArrayList<>();

        for(int i = 0; i<N; i++) {
            String input = scanner.nextLine();
            String[] num = input.split("");
            for(int j = 0; j<N; j++)
                map[i][j] = Integer.parseInt(num[j]);
        }

        for(int i = 0; i<N; i++) {
            for(int j = 0; j<N; j++) {
                if(map[i][j] == 1) {
                    danji.add(0);
                    dfs(i, j);
                }

            }
        }

        Collections.sort(danji);
        System.out.println(danji.size());
        for(int count : danji) {
            System.out.println(count);
        }

    }

    public static void dfs(int i, int j) {

        if(map[i][j] == 1) {
            map[i][j] = 0;

            danji.set(danji.size() - 1, danji.get(danji.size() - 1) + 1);

            if(i - 1 >= 0)
                dfs(i - 1, j);
            if(i + 1 < N)
                dfs(i + 1, j);
            if(j + 1 < N)
                dfs(i, j + 1);
            if(j - 1 >= 0)
                dfs(i, j - 1);

        }

    }
}
