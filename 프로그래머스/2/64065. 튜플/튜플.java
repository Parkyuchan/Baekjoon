import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer;
        s = s.replaceAll("[{}]", "");

        String[] str = s.split(",");
        Map<Integer, Integer> map = new LinkedHashMap<>();


        for (int i = 0; i<str.length; i++) {
            int num = Integer.parseInt(str[i]);
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Integer> listValue = new LinkedList<>(map.values());
        List<Integer> listKey = new LinkedList<>(map.keySet());
        Collections.sort(listValue);

        answer = new int[listKey.size()];
        for (int i = 0; i<listKey.size(); i++) {
            int idxList = listValue.indexOf(map.get(listKey.get(i)));
            answer[answer.length - idxList - 1] = listKey.get(i);
        }
        
        return answer;
    }
}