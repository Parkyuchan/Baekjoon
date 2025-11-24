import java.util.*;
class Solution {
    public String solution(String s) {
        String[] str = s.split(" ");
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        for (int i = 0; i < str.length; i++) {
            int now = Integer.parseInt(str[i]);
            
            if (min > now)
                min = now;
            if (max < now)
                max = now;
        }

        return min + " " + max;

    }
}