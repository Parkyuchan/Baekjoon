import java.util.*;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();
        char [][] map = new char[x][y];
        String[] target_a = {
                "WBWBWBWB",
                "BWBWBWBW",
                "WBWBWBWB",
                "BWBWBWBW",
                "WBWBWBWB",
                "BWBWBWBW",
                "WBWBWBWB",
                "BWBWBWBW"
        };

        String[] target_b = {
                "BWBWBWBW",
                "WBWBWBWB",
                "BWBWBWBW",
                "WBWBWBWB",
                "BWBWBWBW",
                "WBWBWBWB",
                "BWBWBWBW",
                "WBWBWBWB"
        };

        for(int i = 0; i<x; i++) {
            String line = scanner.next();
            map[i] = line.toCharArray();
        }
        int min = 64;
        for(int k = 0; k<=x-8; k++){
            for(int z = 0; z<=y-8; z++) {
                int count_a = 0;
                int count_b = 0;
                int target_index = 0;
                for(int i = k; i<k+8; i++){
                    int index = 0;
                    for(int j = z; j<z+8; j++) {
                        if(target_a[target_index].charAt(index) != map[i][j])
                            count_a++;
                        if(target_b[target_index].charAt(index) != map[i][j])
                            count_b++;


                        index++;
                    }

                    target_index++;
                }
                if(min > count_a)
                    min = count_a;
                if(min > count_b)
                    min = count_b;
            }
        }

        System.out.println(min);

    }

}
