import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];

        int total = brown + yellow;

        for (int height = 3; height <= total; height++) {
            if (total % height == 0) {
                int width = total / height;

                if ((width - 2) * (height - 2) == yellow) {
                    answer[0] = Math.max(width, height);
                    answer[1] = Math.min(width, height);
                }
            }
        }

        return answer;
    }
}