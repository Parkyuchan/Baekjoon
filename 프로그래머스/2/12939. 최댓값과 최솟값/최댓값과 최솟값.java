import java.util.*;
class Solution {
    public String solution(String s) {
        String[] str = s.split(" ");
        int[] num = new int[str.length];
        
        for (int i = 0; i < str.length; i++) {
            num[i] = Integer.parseInt(str[i]);
        }
        
        int min = Arrays.stream(num).min().getAsInt();
        int max = Arrays.stream(num).max().getAsInt();
        
        return min + " " + max;

    }
}