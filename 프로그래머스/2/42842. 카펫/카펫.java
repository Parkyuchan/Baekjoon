import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];

        for (int i = yellow; i >= 1; i--) {
            if (yellow % i == 0) {
                System.out.println(i);
                int sum = (i + 2) * 2 + (yellow / i) * 2;
                if (sum == brown) {
                    answer[0] = i + 2;
                    answer[1] = yellow / i + 2;
                    break;
                }
            }
        }

        return answer;
    }
}