import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer;
        int[] result = new int[progresses.length];
        List<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < progresses.length; i++) {
            result[i] = (100 - progresses[i]) % speeds[i] == 0 ? (100 - progresses[i]) / speeds[i] : ((100 - progresses[i]) / speeds[i]) + 1;
        }
        
        int start = 0;
        int end = 1;
        while(start < progresses.length) {
            if (start == progresses.length - 1 || end == progresses.length) {
                list.add(end - start);
                break;
            }
            
            if (result[start] >= result[end]) {
                end++;
            } else {
                list.add(end - start);
                start = end++;
                continue;
            }
            
        }
        answer = list.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}