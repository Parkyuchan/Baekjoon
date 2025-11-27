import java.util.*;

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        
        // 1: 빵, 2: 야채, 3: 고기
        // 1 2 3 1 형식이 되면 해당 내용 삭제
        // 해결방법: 스택 이용 
        // 1이 나온다면, 이후 4번째까지 1, 2, 3, 1형식이 나오면 됨
        
        Stack<Integer> stack = new Stack<>();
        
        for (int num : ingredient)  {
            stack.push(num);  
        
            if (stack.size() >= 4) {
                int size = stack.size();
                if (stack.get(size - 4) == 1 &&
                   stack.get(size - 3) == 2 &&
                   stack.get(size - 2) == 3 &&
                   stack.get(size - 1) == 1) {
                    answer++;
                
                    for (int j = 0; j < 4; j++)
                        stack.pop();
                }
            }
        }
        
        return answer;
    }
}