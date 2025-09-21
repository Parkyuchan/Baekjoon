import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        int firstIdx = 0;
        int secondIdx = 0;
        int[] firstAnswer = new int[2];
        int[] secondAnswer = new int[2];

        List<String> list = new ArrayList<>();

        for (int i = 0; i<words.length; i++) {
            if (list.contains(words[i]) || words[i].length() < 2 || words[i].length() > 50) {
                int idx = (i + 1) % n;
                firstAnswer[0] = idx == 0 ? n : idx;
                firstAnswer[1] = idx == 0 ? (i + 1) / n : (i + 1) / n + 1;
                firstIdx = i;
                break;
            }

            list.add(words[i]);
        }

        for (int i = 1; i<words.length; i++) {
            char beforeWord = words[i - 1].charAt(words[i - 1].length() - 1);
            char afterWord = words[i].charAt(0);

            if (beforeWord != afterWord) {
                int idx = (i + 1) % n;
                secondAnswer[0] = idx == 0 ? n : idx;
                secondAnswer[1] = (i + 1) % n == 0 ? (i + 1) / n : (i + 1) / n + 1;
                secondIdx = i;
                break;
            }
        }

        if (firstIdx > secondIdx) {
            if (secondIdx == 0) {
                answer[0] = firstAnswer[0];
                answer[1] = firstAnswer[1];
            } else {
                answer[0] = secondAnswer[0];
                answer[1] = secondAnswer[1];
            }
        } else {
            if (firstIdx == 0) {
                answer[0] = secondAnswer[0];
                answer[1] = secondAnswer[1];
            } else {
                answer[0] = firstAnswer[0];
                answer[1] = firstAnswer[1];
            }
        }

        return answer;
    }
}