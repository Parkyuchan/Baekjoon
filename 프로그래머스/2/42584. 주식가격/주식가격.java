import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Stack<Integer> q = new Stack<>();
        int n = prices.length;
        
        for (int i = 0; i < n; i++) {
            while(!q.isEmpty() && prices[i] < prices[q.peek()]) {
                int idx = q.pop();
                answer[idx] = i - idx;
            }
            
            q.push(i);
        }
        
        while(!q.isEmpty()) {
            int idx = q.pop();
            answer[idx] = n - 1 - idx;
        }
        
        return answer;
    }
}