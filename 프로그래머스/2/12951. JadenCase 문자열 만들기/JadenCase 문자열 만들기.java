import java.io.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] split = s.split("\\s+");
        int[] space = new int[split.length];
        boolean check = false;
        int start = -1;
        
        for (int i = 0; i < s.length(); i++) {
            if (!check && s.charAt(i) == ' ') {
                check = true;
                space[++start]++;
            } else if (s.charAt(i) == ' ')
                space[start]++;
            else if (check && s.charAt(i) != ' ')
                check = false;
        }
        
        for (int i = 0; i < split.length; i++) {
            char first = split[i].charAt(0);
            String remain = "";
            if (split[i].length() > 1)
                remain = split[i].substring(1).toLowerCase();
            
            if (first >= 'a' && first <= 'z')
                split[i] = String.valueOf(Character.toUpperCase(first)) + remain;
            else split[i] = String.valueOf(first) + remain;
            
            answer += split[i];
            for (int j = 0; j < space[i]; j++)
                answer += " ";
        }
        
        return answer;
    }
}