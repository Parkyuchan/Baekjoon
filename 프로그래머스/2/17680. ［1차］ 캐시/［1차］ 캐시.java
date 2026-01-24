import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        List<String> list = new LinkedList<>();
        
        if (cacheSize == 0)
            return cities.length * 5;
        
        for (int i = 0; i < cities.length; i++) {
            cities[i] = cities[i].toUpperCase();
            if (list.contains(cities[i])) {
                answer+=1;
                list.remove(cities[i]);
                list.add(cities[i]);
            } else {
                if (list.size() == cacheSize) 
                    list.remove(0);
                answer += 5;
                list.add(cities[i]);
            }
            
        }
        
        return answer;
    }
}