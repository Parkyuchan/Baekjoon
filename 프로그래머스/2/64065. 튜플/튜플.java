import java.util.*;

class Solution {
    public int[] solution(String s) {
        s = s.replaceAll("[{}]", "");
        String[] list = s.split(",");
        
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < list.length; i++) {
            int now = Integer.parseInt(list[i]);
            map.put(now, map.getOrDefault(now, 0) + 1);
        }
        
        List<Integer> listKey = new ArrayList<>(map.keySet());
        int[] answer = new int[listKey.size()];
        
        for (int i = listKey.size(); i > 0; i--) {
            for (int j = 0; j < listKey.size(); j++) {
                if (map.get(listKey.get(j)) == i) {
                    answer[listKey.size() - i] = listKey.get(j);
                    break;
                }
            }
        }
        
        return answer;
    }
}