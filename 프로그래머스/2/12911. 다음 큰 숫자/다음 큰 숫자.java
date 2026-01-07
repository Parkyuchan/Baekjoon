class Solution {
    public int solution(int n) {
        int answer = n;
        int len = Integer.bitCount(n);
        
        while(true) {
            int nextLen = Integer.bitCount(++answer);
            
            if (len == nextLen)
                break;
        }
        return answer;
    }

}