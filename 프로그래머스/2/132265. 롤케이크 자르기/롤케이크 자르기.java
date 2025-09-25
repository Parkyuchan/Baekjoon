import java.util.*;

class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        
        Map<Integer, Integer> mapFirst = new LinkedHashMap<>();
        Map<Integer, Integer> mapSecond = new LinkedHashMap<>();

        for (int i = 0; i<topping.length; i++)
            mapSecond.put(topping[i], mapSecond.getOrDefault(topping[i], 0) + 1);

        for (int i = 0; i<topping.length; i++) {
            mapFirst.put(topping[i], mapFirst.getOrDefault(topping[i], 0) + 1);

            if (mapSecond.containsKey(topping[i])) {
                if (mapSecond.get(topping[i]) == 1)
                    mapSecond.remove(topping[i]);
                else
                    mapSecond.put(topping[i], mapSecond.get(topping[i]) - 1);
            }

            if (mapFirst.size() == mapSecond.size())
                answer++;
        }


        return answer;
    }
}