import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> que = new PriorityQueue<>();
        
        for (int i = 0; i < scoville.length; i++) {
            que.offer(scoville[i]);
        }
        
        while(que.peek() < K) {
            if (que.size() < 2) {
                return -1;
            }
            
            int a = que.poll();
            int b = que.poll();

            int result = a + (b * 2);
            que.offer(result);
            answer++;
        }
        
        return answer;
    }
}