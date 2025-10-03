class Solution {
    static int result = 0;

    public int solution(int[] numbers, int target) {
        int answer = 0;
        
        dfs(0, numbers, target, 0);
        answer = result;
        
        return answer;
    }
    
    public static void dfs(int idx, int[] numbers, int target, int sum) {

        if (idx == numbers.length) {
            if (target == sum)
                result++;
            return;
        }

        dfs(idx + 1, numbers, target, sum + numbers[idx]);
        dfs(idx + 1, numbers, target, sum - numbers[idx]);
    }

}