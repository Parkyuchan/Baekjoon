import java.util.*;

class Solution {
    private static Map<String, Integer> map = new LinkedHashMap<>();
    private static char[] arr;
    public String[] solution(String[] orders, int[] course) {
        String[] answer;

        for (int i = 0; i < orders.length; i++) {
            arr = orders[i].toCharArray();

            Arrays.sort(arr);

            for (int j = 0; j < course.length; j++) {
                combination(new StringBuilder(), 0, course[j], arr.length);
            }
        }

        List<String> listKey = new ArrayList<>(map.keySet());
        List<Integer> listValue = new ArrayList<>(map.values());
        List<String> result = new ArrayList<>();

        for (int i = 0; i<course.length; i++) {
            int max = 0;
            for (int j = 0; j<listKey.size(); j++) {
                if (listKey.get(j).length() == course[i] && listValue.get(j) >= 2 && max < listValue.get(j)) {
                    max = listValue.get(j);
                }
            }

            for (int j = 0; j < listKey.size(); j++) {
                if (listKey.get(j).length() == course[i] && max == listValue.get(j))
                    result.add(listKey.get(j));
            }
        }

        answer = new String[result.size()];

        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }
        Arrays.sort(answer);
        
        return answer;

    }

    private static void combination(StringBuilder sb, int start, int r, int len) {
        if (sb.length() == r) {
            map.put(sb.toString(), map.getOrDefault(sb.toString(), 0) + 1);
            return;
        }

        for (int i = start; i < len; i++) {
            sb.append(arr[i]);
            combination(sb, i + 1, r, len);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}