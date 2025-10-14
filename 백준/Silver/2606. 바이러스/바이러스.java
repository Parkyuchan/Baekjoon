import java.io.*;
import java.util.*;

public class Main {
    private static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    private static int count = 0;
    private static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());       // 컴퓨터 수
        int M = Integer.parseInt(br.readLine());       // 간선 수
        visited = new boolean[N + 1];

        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            graph.get(start).add(end);
            graph.get(end).add(start);
        }

        bfs(1);
        System.out.println(count);

    }

    private static void bfs(int r) {
        Queue<Integer> queue = new LinkedList<>();
        visited[r] = true;
        queue.add(r);

        while(!queue.isEmpty()) {
            int now = queue.poll();

            for (int next : graph.get(now)) {
                if (!visited[next]) {
                    count++;
                    visited[next] = true;
                    queue.add(next);
                }
            }
        }
    }

}