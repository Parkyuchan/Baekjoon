import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());


        Deque<Integer> queue = new ArrayDeque<>();

        for(int i = 0; i<N; i++){
            String input = br.readLine();
            StringTokenizer token = new StringTokenizer(input, " ");
            switch (token.nextToken()) {
                case "push":
                    queue.add(Integer.parseInt(token.nextToken()));
                    break;
                case "pop":
                    if (queue.isEmpty())
                        sb.append(-1).append("\n");
                    else
                        sb.append(queue.removeFirst()).append("\n");
                    break;
                case "size":
                    sb.append(queue.size()).append("\n");
                    break;
                case "empty":
                    if (queue.isEmpty())
                        sb.append(1).append("\n");
                    else
                        sb.append(0).append("\n");
                    break;
                case "front":
                    if (queue.isEmpty())
                        sb.append(-1).append("\n");
                    else
                        sb.append(queue.getFirst()).append("\n");
                    break;
                case "back":
                    if (queue.isEmpty())
                        sb.append(-1).append("\n");
                    else
                        sb.append(queue.getLast()).append("\n");
                    break;
            }
        }
        System.out.println(sb);
    }
}