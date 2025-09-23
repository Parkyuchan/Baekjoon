import java.util.*;

class Solution {
    public int[] solution(int n, long left, long right) {
        int[] answer = new int[(int)(right - left + 1)];

        int count = 0;
        for (long i = left; i<=right; i++) {
            long x = i / n;
            long y = i % n;

            answer[count++] = (int)Math.max(x, y) + 1;
        }
        
        return answer;
    }
}