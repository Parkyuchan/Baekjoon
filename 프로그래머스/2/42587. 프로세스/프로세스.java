import java.util.*;
import java.util.stream.Collectors;
class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        
        Queue<int[]> que = new LinkedList<>();
        
        for (int i = 0; i < priorities.length; i++)
            que.offer(new int[]{priorities[i], i});
        
        while(!que.isEmpty()) {
            int[] now = que.poll();
            int size = que.size();
            boolean check = false;
            for (int i = 0; i < size; i++) {
                int[] che = que.poll();
                que.offer(che);
                
                if (che[0] > now[0]) {
                    check = true;
                }
            }
            
            if (check) {
                que.offer(now);
            } else {
                answer++;
                
                if (now[1] == location)
                    break;
            }
        }
        
        return answer;
    }
}