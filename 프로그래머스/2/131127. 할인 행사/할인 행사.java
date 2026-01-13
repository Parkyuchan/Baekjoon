import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < want.length; i++) {
            map.put(want[i], number[i]);
        }
        
        for (int i = 0; i < discount.length - 9; i++) {
            Map<String, Integer> copy = new HashMap<>(map);
            boolean numCheck = true;

            for (int j = i; j < i + 10; j++) {
                if (copy.containsKey(discount[j]) && copy.get(discount[j]) > 0) {
                    copy.put(discount[j], copy.get(discount[j]) - 1);
                } else {
                    numCheck = false;
                    break;
                }
            }
            
            if (!numCheck)
                continue;
            
            answer++;
            
        }
        
        return answer;
    }
}