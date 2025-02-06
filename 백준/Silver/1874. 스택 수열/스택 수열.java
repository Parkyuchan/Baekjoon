import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();

        int[] num = new int[N];
        for(int i = 0; i<N; i++)
            num[i] = Integer.parseInt(br.readLine());

        int count = 1;
        for(int i = 0; i<N; i++){

            while(count <= num[i]){
                stack.push(count++);
                sb.append("+").append("\n");
            }

            if(stack.peek() == num[i]){
                stack.pop();
                sb.append("-").append("\n");
            }
            else{
                System.out.println("NO");
                return;
            }
        }

        System.out.println(sb);
    }
}