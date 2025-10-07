import java.util.*;

class Solution {
    private static Map<String, List<Integer>> map = new HashMap<>();

    public int[] solution(String[] info, String[] query) {
        int[] answer = new int[query.length];

        String[][] infoList = new String[info.length][5];
        String[][] queryList = new String[query.length][5];

        for (int i = 0; i<info.length; i++) {
            infoList[i] = info[i].split(" ");   // 문자열 분리
            String[] keys = new String[4];
            for (int j = 0; j<4; j++) {
                keys[j] = infoList[i][j];
            }
            int score = Integer.parseInt(infoList[i][4]);
            makeCombination(keys, "", 0, score);
        }

        for (List<Integer> list : map.values()) {
            Collections.sort(list);
        }

        for (int i = 0; i < query.length; i++) {
            queryList[i] = query[i].replaceAll("and ", "").split(" ");
            int score = Integer.parseInt(queryList[i][4]);
            String key = queryList[i][0] + queryList[i][1] + queryList[i][2] + queryList[i][3];

            if (map.containsKey(key)) {
                List<Integer> list = map.get(key);
                int idx = lowerBound(list, score);
                answer[i] = list.size() - idx;
            } else {
                answer[i] = 0;
            }
        }

        
        return answer;

    }
    private static void makeCombination(String[] arr, String key, int depth, int score) {
        if (depth == 4) {
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(score);
            return;
        }

        makeCombination(arr, key + arr[depth], depth + 1, score);
        makeCombination(arr, key + "-", depth + 1, score);
    }

    private static int lowerBound(List<Integer> list, int score) {
        int start = 0, end = list.size();
        while(start < end) {
            int mid = (start + end) / 2;
            if (list.get(mid) < score)
                start = mid + 1;
            else
                end = mid;
        }

        return start;
    }
}