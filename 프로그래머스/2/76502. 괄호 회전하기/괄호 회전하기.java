import java.util.*;
class Solution {
    public int solution(String s) {
        int answer = 0;
        Deque<Character> deque = new ArrayDeque<>();
        
        for (int i = 0; i < s.length(); i++) {
            deque.add(s.charAt(i));
        }
        
        for (int i = 0; i < s.length(); i++) {
            Stack<Character> stack = new Stack<>();
            boolean check = true;
            String str = "";
            for (int j = 0; j < deque.size(); j++) {
                str += deque.getFirst();
                deque.add(deque.pop());
            }
            
            for (int j = 0; j < str.length(); j++) {
                char now = str.charAt(j);
                
                if (now == ')' || now == '}' || now == ']') {
                    if (stack.isEmpty()) {
                        check = false;
                        break;
                    }
                    
                    char top = stack.peek();
                    if ((now == ')' && top == '(') || (now == '}' && top == '{') || (now == ']' && top == '[')) {
                        stack.pop();
                    } else {
                        check = false;
                        break;
                    }
                } else {
                    stack.push(now);
                }
            }
                
            if (check && stack.isEmpty())
                answer++;
            
            deque.add(deque.pop());
            
        }
        
        return answer;
    }
}