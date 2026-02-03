import java.util.*;

class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();
        
        for (int i = 0; i < str1.length() - 1; i++) {
            String now = str1.substring(i, i + 2).toUpperCase();
            if (!now.matches("[A-Za-z]{2}")) {
                continue;
            }

            map1.put(now, map1.getOrDefault(now, 0) + 1);
        }
        
        for (int i = 0; i < str2.length() - 1; i++) {
            String now = str2.substring(i, i + 2).toUpperCase();
            if (!now.matches("[A-Za-z]{2}")) {
                continue;
            }
            map2.put(now, map2.getOrDefault(now, 0) + 1);
        }
        
        List<String> listKey1 = new ArrayList<>(map1.keySet());
        List<String> listKey2 = new ArrayList<>(map2.keySet());
        
        double inter = 0;
        double union = 0;
        for (int i = 0; i < listKey1.size(); i++) {
            String key1 = listKey1.get(i);
            if (listKey2.contains(key1)) {
                inter += Math.min(map1.get(key1), map2.get(key1));
                union += Math.max(map1.get(key1), map2.get(key1));
                System.out.println("key1 = " + key1 + ", map1.get = " + map1.get(key1) + ", map2.get = " + map2.get(key1));
            }
            else {
                union += map1.get(key1);
                System.out.println("key1 = " + key1 + ", map1.get = " + map1.get(key1));
            }
        }
        
        for (int i = 0; i < listKey2.size(); i++) {
            String key2 = listKey2.get(i);
            if (!listKey1.contains(key2)) {
                union += map2.get(key2);
                System.out.println("key2 = " + key2 + ", map2.get = " + map2.get(key2));
            }
        }

        if (inter == 0 && union == 0)
            answer = 65536;
        else
            answer = (int)(inter / union * 65536);
        
        return answer;
    }
}