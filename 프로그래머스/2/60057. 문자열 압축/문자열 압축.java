class Solution {
    public int solution(String s) {
        int answer = s.length();


        for (int i = 1; i <= s.length() / 2; i++) {
            int len = 0;
            int count = 1;

            String prev = s.substring(0, i);

            for (int j = i; j < s.length(); j+=i) {
                String now = s.substring(j, Math.min(j + i, s.length()));

                if (prev.equals(now)) {
                    count++;
                } else {
                    len += i + (count > 1 ? String.valueOf(count).length() : 0);
                    count = 1;
                    prev = now;
                }
            }

            len += prev.length() + (count > 1 ? String.valueOf(count).length() : 0);

            answer = Math.min(answer, len);
        }
        
        
        return answer;
    }
}