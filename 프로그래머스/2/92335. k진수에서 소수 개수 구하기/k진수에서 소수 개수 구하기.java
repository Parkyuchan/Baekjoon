class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        String change = "";

        if (k == 10)
            change = Integer.toString(n);
        else
            change = Integer.toString(n, k);

        String[] split = change.split("0+");

        for (int i = 0; i < split.length; i++) {
            boolean check = isPrime(Long.parseLong(split[i]));

            if (check)
                answer++;
        }

        return answer;
    }

    private static boolean isPrime(long num) {

        if (num == 2)
            return true;

        if (num < 2 || num % 2 == 0)
            return false;

        for (long i = 3; i*i <= num; i+=2) {
            if (num % i == 0)
                return false;
        }

        return true;
    }
    
}