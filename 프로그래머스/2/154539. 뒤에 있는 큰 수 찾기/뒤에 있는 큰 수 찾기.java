import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        answer[numbers.length - 1] = -1;
        Stack<Integer> stack = new Stack<>();
        stack.add(numbers[numbers.length - 1]);
        
        for (int i = numbers.length - 2; i >=0; i--) {
            while(!stack.isEmpty()) {
                if (numbers[i] >= stack.peek()) {
                    stack.pop();
                } else {
                    answer[i] = stack.peek();
                    stack.push(numbers[i]);
                    break;
                }
            }
            if (stack.isEmpty()) {
                stack.push(numbers[i]);
                answer[i] = -1;
                continue;
            }
        }
        return answer;
    }
}
