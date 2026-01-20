import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 0;
        Map<String, Integer> map = new HashMap<>();
        
        for (int i = 0; i < clothes.length; i++) {
            map.put(clothes[i][1], map.getOrDefault(clothes[i][1], 0) + 1);
        }
        
        List<String> listKey = new ArrayList<>(map.keySet());
        List<Integer> listValue = new ArrayList<>(map.values());
        
        if (listKey.size() > 1) {
            answer = 1;
            for (int i = 0; i < listValue.size(); i++) 
                answer *= (listValue.get(i) + 1);
            
            answer--;
        } else {
            answer = listValue.get(0);
        }
        
        return answer;
    }
}