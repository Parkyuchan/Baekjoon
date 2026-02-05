class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        String change = Integer.toString(n, k);
        String[] list = change.split("0+");
        
        for (int i = 0; i < list.length; i++)
            if (isPrime(Long.parseLong(list[i])))
                answer++;
        
        return answer;
    }
    
    private boolean isPrime(long n) {
        if (n < 2)
            return false;
        
        if (n == 2)
            return true;
        
        for (long i = 3; i*i <= n; i+=2)
            if (n % i == 0)
                return false;
        
        return true;
    }
}