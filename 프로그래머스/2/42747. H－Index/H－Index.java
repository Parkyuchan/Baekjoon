import java.util.*;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);

        int max = 0;
        int count = 1;
        int idx = 0;
        while (count <= citations[citations.length - 1]) {
            if (citations[idx] >= count) {
                if (max < citations.length - idx)
                    max = count;
                count++;
                continue;
            }

            idx++;
        }
        answer = max;
        return answer;
    }
}