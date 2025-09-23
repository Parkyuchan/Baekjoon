import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        List<String> list = new LinkedList<>();

        if (cacheSize == 0) {
            answer += 5*cities.length;
            return answer;
        }

        for (int i = 0; i<cities.length; i++) {
            String city = cities[i].toLowerCase();
            
            if (!list.contains(city)) {
                answer += 5;
                if (list.size() == cacheSize) {
                    list.remove(0);
                    list.add(city);
                } else {
                    list.add(city);
                }

                continue;
            }

            answer += 1;
            list.remove(city);
            list.add(city);
        }
        
        return answer;
    }
}