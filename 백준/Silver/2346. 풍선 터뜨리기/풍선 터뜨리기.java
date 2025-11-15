import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        Deque<int[]> deque = new ArrayDeque<>();
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        for(int i = 0; i<N; i++) {
        	int[] tmp = new int[2];
        	tmp[0] = i+1;
        	tmp[1] = Integer.parseInt(st.nextToken());
        	deque.offerLast(tmp);
        }
        
        br.close();
        
        for(int i = 0; i<N; i++) {
        	int tmp = deque.peekFirst()[1];
        	arr[i] = deque.pollFirst()[0];
        	if(deque.size() == 0)
        		break;
        	
        	if(tmp < 0) {
        		for(int j = 0; j<-tmp; j++)
        			deque.offerFirst(deque.pollLast());
        	}
        	else
        		for(int j = 0; j<tmp-1; j++)
        			deque.offerLast(deque.pollFirst());
        }
        
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        for(int i = 0; i<N; i++)
        	bw.write(String.valueOf(arr[i]) + " ");
        
        bw.flush();
        bw.close();
    }
    
    
}
