import java.io.*;
import java.util.*;

public class Main {

    private static boolean[] visitedDFS;
    private static boolean[] visitedBFS;
    private static StringBuilder sb;

    private static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());   // 노드 수
        int M = Integer.parseInt(st.nextToken());   // 간선 수
        int V = Integer.parseInt(st.nextToken());   // 시작 노드
        visitedDFS = new boolean[N + 1];
        visitedBFS = new boolean[N + 1];

        for (int i = 0; i <= N; i++)
            graph.add(new ArrayList<>());

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int node1 = Integer.parseInt(st.nextToken());
            int node2 = Integer.parseInt(st.nextToken());

            graph.get(node1).add(node2);
            graph.get(node2).add(node1);
        }

        for (int i = 0; i <= N; i++)
            Collections.sort(graph.get(i));

        dfs(V);
        sb.append("\n");
        bfs(V);

        System.out.println(sb);

    }

    private static void dfs(int v) {
        visitedDFS[v] = true;
        sb.append(v).append(" ");

        for (int next : graph.get(v)) {
            if (!visitedDFS[next])
                dfs(next);
        }
    }

    private static void bfs(int v) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(v);
        visitedBFS[v] = true;

        while(!queue.isEmpty()) {
            int now = queue.poll();
            sb.append(now).append(" ");

            for (int next : graph.get(now)) {
                if (!visitedBFS[next]) {
                    visitedBFS[next] = true;
                    queue.add(next);
                }
            }

        }
    }


}