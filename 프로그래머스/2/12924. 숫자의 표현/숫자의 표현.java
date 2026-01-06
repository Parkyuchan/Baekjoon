class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int sum = 0;
        int start = 1;
        for (int i = 1; i <= n; i++) {
            sum += i;
            
            if (sum == n) {
                answer++;
                sum -= start++;
            } else if (sum > n) {
                sum -= start++;
                sum -= i--;
            }
        }
        return answer;
    }
}