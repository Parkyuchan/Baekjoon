class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        
        for (int i = 0; i < prices.length; i++) {
            if (i == prices.length - 1)
                break;
            int j = i + 1;
            int count = 1;
            while(true) {
                if (prices[i] > prices[j] || j == prices.length - 1)
                    break;
                j++;
                count++;
            }

            answer[i] = count;
        }

        return answer;
    }
}