import java.util.*;

class Solution {
    public int[] solution(String msg) {
        int[] answer;
        List<Integer> list = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        char first = 'A';
        for (int i = 0; i < 26; i++) {
            map.put(String.valueOf((char)(first + i)), i + 1);
        }
        int last = 27;
        
        int start = 0;
        int end = 1;
        while(true) {
            String now = msg.substring(start, end);
            
            if (!map.containsKey(now)) {
                map.put(now, last++);
                now = msg.substring(start, end - 1);
                list.add(map.get(now));
                start = end - 1;
                end = start + 1;
                continue;
            }
            
            end++;
            
            if (start == msg.length() - 1 || end > msg.length()) {
                list.add(map.get(now));
                break;
            }
        }
        
        answer = list.stream()
                   .mapToInt(Integer::intValue)
                   .toArray();
        
        return answer;
    }
}
