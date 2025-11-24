import java.util.*;
class Solution {
    boolean solution(String s) {
        // 결과값을 담을 변수 선언
        boolean answer = true;
        // 괄호 개수를 저장할 변수 선언
        int openSum = 0;
        
        // 반복문을 통해 스택에 문자열 차례대로 넣기
        for (int i = 0; i < s.length(); i++) {
            // '(' 차례라면 스택에 집어넣기
            if (s.charAt(i) == '(')
                openSum++;
            else {
                // 만약 openSum이 0이고, 그다음 문자가 ')'인 경우 false 처리 후 break
                if (openSum == 0) {
                    answer = false;
                    break;
                }
                // 닫힌 괄호만큼 열린 괄호 제거
                openSum--;
            }
            
        }
        
        // 반복문 후 스택이 비어있지 않으면, false 처리
        if (openSum != 0)
            answer = false;
        
        return answer;
    }
}