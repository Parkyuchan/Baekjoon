import java.util.*;
class Solution {
    static int visited[];
    public int solution(int[] elements) {
        int answer = 0;
        Set<Integer> set = new HashSet<>();
        
        for (int i = 0; i < elements.length; i++) {
            for (int j = 0; j < elements.length; j++) {
                int sum = 0;
                for (int k = 0; k <=i; k++) {
                    sum += elements[(j + k) % elements.length];
                }
                set.add(sum);
            }
        }
        
        return set.size();
    }
}