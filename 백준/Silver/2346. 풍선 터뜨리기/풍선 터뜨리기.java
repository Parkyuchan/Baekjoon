import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        Deque<int[]> deque = new ArrayDeque<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int[] tmp = new int[2];
            tmp[0] = i + 1;
            tmp[1] = Integer.parseInt(st.nextToken());
            deque.add(tmp);
        }

        for (int i = 0; i < N; i++) {
            int tmp = deque.peekFirst()[1];
            sb.append(deque.pollFirst()[0]).append(" ");

            if (deque.size() == 0)
                break;

            if (tmp > 0) {
                for (int j = 0; j < tmp-1; j++) {
                    deque.offerLast(deque.pollFirst());
                }
            } else {
                for (int j = tmp; j < 0; j++) {
                    deque.offerFirst(deque.pollLast());
                }
            }

        }

        System.out.println(sb);


    }

}