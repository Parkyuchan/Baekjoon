class Solution {
    public int solution(int n) {
        int answer = 0;
        int first = 0;
        int second = 1;
        
        for (long i = 2; i <= n; i++) {
            answer = (second + first) % 1234567;
            first = second;
            second = answer;
        }
                
        return answer;
    }
}