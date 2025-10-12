import java.util.*;
class Solution {
    public int solution(String s) {
        int answer = 0;

        for (int i = 0; i < s.length(); i++) {
            Stack<String> stack = new Stack<>();
            List<String> list = Arrays.asList(s.split(""));
            boolean check = true;

            for (int j = 0; j < s.length(); j++) {
                if (list.get(j).equals("{") || list.get(j).equals("(") || list.get(j).equals("[")) {
                    stack.push(list.get(j));
                } else {
                    if (stack.isEmpty()) {
                        check = false;
                        break;
                    }
                    else if (list.get(j).equals("}") && stack.peek().equals("{")) {
                        stack.pop();
                    }
                    else if (list.get(j).equals("]") && stack.peek().equals("[")) {
                        stack.pop();
                    }
                    else if (list.get(j).equals(")") && stack.peek().equals("(")) {
                        stack.pop();
                    } else {
                        check = false;
                        break;
                    }
                }
            }

            if (check && stack.isEmpty())
                answer++;

            String change = String.valueOf(s.charAt(0));
            s = s.substring(1) + change;
        }
        
        return answer;
    }
}