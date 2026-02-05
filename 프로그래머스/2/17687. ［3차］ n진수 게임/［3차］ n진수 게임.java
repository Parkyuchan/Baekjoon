class Solution {
    public String solution(int n, int t, int m, int p) {
        String answer = "";
        int start = 0;
        int count = 0;
        
        while(answer.length() < t) {
            String now = Integer.toString(start++, n);
            
            for (int i = 0; i < now.length(); i++) {
                if (count % m + 1 == p) {
                    answer += String.valueOf(now.charAt(i)).toUpperCase();
                
                    if (answer.length() == t)
                    break;
                }
                
                count++;
            }
        }
        
        return answer;
    }
}