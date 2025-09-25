import java.util.*;
import java.util.stream.Collectors;
class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        List<Integer> listValue = Arrays.stream(priorities)
                .boxed()
                .collect(Collectors.toList());
        List<Integer> listIdx = new LinkedList<>();

        for (int i = 0; i<priorities.length; i++)
            listIdx.add(i);

        while (!listValue.isEmpty()) {
            boolean check = true;

            for (int i = 1; i<listValue.size(); i++) {
                if (listValue.get(0) < listValue.get(i)) {
                    int popValue = listValue.remove(0);
                    listValue.add(popValue);
                    int popIdx = listIdx.remove(0);
                    listIdx.add(popIdx);
                    check = false;
                    break;
                }
            }
            if (check) {
                listValue.remove(0);
                answer++;

                if (listIdx.remove(0) == location)
                    break;
            }

        }
        
        return answer;
    }
}