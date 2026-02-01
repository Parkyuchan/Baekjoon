import java.util.*;

class Solution {
    public int solution(String dirs) {
        int answer = 0;
        
        Set<String> set = new HashSet<>();
        int[] loc = {0, 0};
        
        for (int i = 0; i < dirs.length(); i++) {
            char now = dirs.charAt(i);
            String str = "";
            switch(now) {
                case 'U' :
                    if (checkMove(loc[1] + 1)) {
                        str = "(" + loc[0] + ", " + loc[1] + ") -> (" + loc[0] + ", " + (loc[1] + 1) + ")";
                        loc[1]++;
                        set.add(str);
                    }
                    break;
                    
                case 'D' :
                    if (checkMove(loc[1] - 1)) {
                        str = "(" + loc[0] + ", " + (loc[1] - 1) + ") -> (" + loc[0] + ", " + loc[1] + ")";
                        loc[1]--;
                        set.add(str);
                    }
                    break;
                    
                case 'R' :
                    if (checkMove(loc[0] + 1)) {
                        str = "(" + loc[0] + ", " + loc[1] + ") -> (" + (loc[0] + 1) + ", " + loc[1] + ")";
                        loc[0]++;
                        set.add(str);
                    }
                    break;
                    
                case 'L' :
                    if (checkMove(loc[0] - 1)) {
                        str = "(" + (loc[0] - 1) + ", " + loc[1] + ") -> (" + loc[0] + ", " + loc[1] + ")";
                        loc[0]--;
                        set.add(str);
                    }
                    break;
            }
            
        }
        
        return set.size();
    }
    
    private boolean checkMove(int value) {
        if (value > 5 || value < -5)
            return false;
        
        return true;
    }
}