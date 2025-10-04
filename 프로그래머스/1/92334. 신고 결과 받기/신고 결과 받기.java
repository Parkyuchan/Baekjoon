import java.util.*;
class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        int[][] board = new int[id_list.length][id_list.length];

        Map<String, Integer> listName = new HashMap<>();
        for (int i = 0; i< id_list.length; i++) {
            listName.put(id_list[i], i);
        }

        for (int i = 0; i < report.length; i++) {
            String[] str = report[i].split(" ");
            String sender = str[0];
            String receiver = str[1];

            if (board[listName.get(sender)][listName.get(receiver)] == 0) {
                board[listName.get(sender)][listName.get(receiver)]++;
            }
        }

        for (int i = 0; i < board.length; i++) {
            int sum = 0;
            for (int j = 0; j < board[i].length; j++) {
                sum += board[j][i];
            }

            if (sum >= k) {
                for (int j = 0; j < board[i].length; j++) {
                    if (board[j][i] == 1)
                        answer[j]++;
                }
            }

        }
    
        return answer;
    }
}