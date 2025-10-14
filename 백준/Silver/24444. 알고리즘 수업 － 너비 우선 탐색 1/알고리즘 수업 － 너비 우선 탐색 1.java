import java.io.*;
import java.util.*;

public class Main {
    private static int[] visited;
    private static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    private static int count = 1;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());
        visited = new int[N + 1];

        for (int i = 0; i <= N; i++)
            graph.add(new ArrayList<>());

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        for (int i = 0; i <= N; i++)
            Collections.sort(graph.get(i));

        bfs(R);

        for (int i = 1; i <= N; i++)
            System.out.println(visited[i]);

    }

    private static void bfs(int r) {
        Queue<Integer> queue = new LinkedList<>();
        visited[r] = count++;
        queue.add(r);

        while(!queue.isEmpty()) {
            int now = queue.poll();

            for (int next : graph.get(now)) {
                if (visited[next] == 0) {
                    visited[next] = count++;
                    queue.add(next);
                }
            }
        }
    }

}