import java.util.*;
class Solution
{
    public int solution(String s)
    {
        int answer = 0;
        Stack<String> stack = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
            if (stack.isEmpty() || !stack.peek().equals(s.substring(i, i + 1))) {
                stack.add(s.substring(i, i + 1));
            } else if (stack.peek().equals(s.substring(i, i + 1))){
                    stack.pop();
            }
        }
        
        return stack.isEmpty() ? 1 : 0;
    }
}