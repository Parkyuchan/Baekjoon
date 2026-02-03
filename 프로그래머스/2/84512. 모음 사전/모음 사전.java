import java.util.*;
class Solution {
    List<String> list = new ArrayList<>();
    public int solution(String word) {
        dfs("", 0);
        return list.indexOf(word);
    }
    
    private void dfs(String word, int len) {
        if (len > 5) return;
        list.add(word);
        for (int i = 0; i < 5; i++) {
            dfs(word + "AEIOU".charAt(i), len + 1);
        }
    }
}