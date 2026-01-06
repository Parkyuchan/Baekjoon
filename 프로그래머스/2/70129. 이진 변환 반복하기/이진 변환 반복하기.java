class Solution {
    public int[] solution(String s) {
        int[] answer = {0, 0};
        
        // 1. s의 0을 제거
        // 2. 제거한 문자열의 길이 판단
        // 3. 길이에 대한 이진수 값 최신화
        // 반복
        
        int retry = 0;
        int zero = 0;
        
        while (s.length() > 1) {
            int len = s.length();
            s = s.replaceAll("0", "");
            int changeLen = s.length();
            zero += len - changeLen;
            s = toBinary(changeLen);
            retry++;
        }
        
        answer[0] = retry;
        answer[1] = zero;
        
        return answer;
    }
    
    private String toBinary(int len) {
        String re = "";
        while(len > 0) {
            if (len % 2 == 0) {
                re = "0" + re;
            } else {
                re = "1" + re;
            }
            
            len /= 2;
        }
        
        return re;
    }
}