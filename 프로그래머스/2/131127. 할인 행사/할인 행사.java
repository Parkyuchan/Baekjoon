import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        int size = 0;
        Map<String, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i<number.length; i++) {
            size += number[i];
        }

        for (int i = 0; i<size; i++) {
            map.put(discount[i], map.getOrDefault(discount[i], 0) + 1);
        }

        int count = 0;

        while(count + size <= discount.length) {
            Map<String, Integer> mapCheck = map.entrySet()
                    .stream()
                    .collect(Collectors.toMap(
                            Map.Entry::getKey,
                            Map.Entry::getValue,
                            (e1, e2) -> e1,
                            LinkedHashMap::new
                    ));

            int i;

            boolean check = true;
            for (i = 0; i<want.length; i++) {
                if (!(mapCheck.containsKey(want[i])) || mapCheck.get(want[i]) < number[i]) {
                    check = false;
                    break;
                }
                mapCheck.put(want[i], mapCheck.get(want[i]) - number[i]);
            }
            if (check)
                answer++;

            if (count + size == discount.length)
                break;

            map.put(discount[count], map.get(discount[count]) - 1);
            if (map.get(discount[count]) == 0)
                map.remove(discount[count]);

            map.put(discount[count + size], map.getOrDefault(discount[count + size], 0) + 1);
            count++;
        }
        return answer;
    }
}