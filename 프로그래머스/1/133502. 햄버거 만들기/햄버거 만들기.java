import java.util.*;

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        
        // 1: 빵, 2: 야채, 3: 고기
        // 1 2 3 1 형식이 되면 해당 내용 삭제
        // 해결방법: 스택 이용 
        // 1이 나온다면, 이후 4번째까지 1, 2, 3, 1형식이 나오면 됨
        
        Stack<Integer> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();
        int len = ingredient.length;

        for (int i = 0; i < len; i++)
            list.add(ingredient[i]);
        
        len = list.size();
        for (int i = 0; i < len; i++) {
            if (list.get(i) == 1 && i + 3 < len) {
                if (list.get(i + 1) == 2
                   && list.get(i + 2) == 3
                   && list.get(i + 3) == 1) {
                    answer++;
                    for (int j = 0; j < 4; j++)
                        list.remove(i);
                    i = stack.isEmpty() ? i - 1 : stack.pop() - 1;
                    len = list.size();
                } else {
                    stack.push(i);

                }
            }
            
        }
        return answer;
    }
}