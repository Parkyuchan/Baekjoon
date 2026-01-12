import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {0, 0};
        Stack<String> stack = new Stack<>();
        Set<String> set = new HashSet<>();
        
        set.add(words[0]);
        stack.push(words[0]);
        
        for (int i = 1; i < words.length; i++) {
            String pop = stack.pop();
            if (pop.charAt(pop.length() - 1) != words[i].charAt(0) || set.contains(words[i])) {
                answer[0] = i % n + 1;
                answer[1] = i / n + 1;
                break;
            }
            
            set.add(words[i]);
            stack.push(words[i]);
        }
        
        return answer;
    }
}