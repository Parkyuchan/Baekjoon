import java.util.*;
class Solution {
    boolean solution(String s) {
        boolean answer = true;
        if (s.charAt(0) == ')')
            return false;
            
        int count = 1;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == '(')
                count++;
            else
                count--;
            
            if (count < 0)
                return false;
        }
        
        if (count > 0)
            return false;
        
        return answer;
    }
}