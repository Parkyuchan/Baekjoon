import java.util.*;

class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        Map<Integer, Integer> map1 = new HashMap<>();
        Map<Integer, Integer> map2 = new HashMap<>();
        
        for (int i = 0; i < topping.length; i++)
            map2.put(topping[i], map2.getOrDefault(topping[i], 0) + 1);
        
        for (int i = 0; i < topping.length; i++) {
            for (int j = i; j < i + 1; j++) {
                map1.put(topping[j], map1.getOrDefault(topping[i], 0) + 1);
                
                if (map2.containsKey(topping[j])) {
                    if (map2.get(topping[j]) == 1)
                    map2.remove(topping[j]);
                else if (map2.get(topping[j]) > 1)
                    map2.put(topping[j], map2.get(topping[j]) - 1);
                }
            }
            if (map1.size() == map2.size())
                answer++;
        }
        return answer;
    }
}