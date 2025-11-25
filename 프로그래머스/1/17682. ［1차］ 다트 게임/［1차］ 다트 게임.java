import java.util.*;
class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        //1. 숫자만 배열에 뽑기
        //2. 숫자를 제거하고 뽑기
        //3. 문자를 기반으로 숫자 업데이트
        //4. 숫자 배열 모두 더하기
        String[] splitNum = dartResult.split("\\D+");
        String change = dartResult.replaceAll("[0-9]", "");
        String[] splitChar = change.split("");
        Map<String, Integer> map = new HashMap<>();
        map.put("S", 1);
        map.put("D", 2);
        map.put("T", 3);
        map.put("*", 2);
        map.put("#", -1);
        
        int[] num = new int[3];
        for (int i = 0; i < 3; i++) {
            num[i] = Integer.parseInt(splitNum[i]);
        }
        
        int len = splitChar.length;
        int count = 0;
        for (int i = 0; i < len; i++) {
            String now = splitChar[i];
            if (now.equals("S") || now.equals("D") || now.equals("T")) {
                num[count] = (int)Math.pow(num[count], map.get(now));
                
                if (i < len - 1 && (splitChar[i + 1].equals("S") || splitChar[i + 1].equals("D") || splitChar[i + 1].equals("T")))
                    count++;
                
            } else {
                if (now.equals("*")) {
                    if (count > 0)
                        num[count - 1] = num[count - 1] * map.get(now);
                }
                num[count] = num[count] * map.get(now);    
                count++;
            }
        }
        
        for (int i = 0; i < 3; i++) 
            answer += num[i];

        return answer;
    }
}