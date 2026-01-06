class Solution {
    public int[] solution(String s) {
        int[] answer = {0, 0};

        while(true) {
            String re_s = s.replace("0", "");
            answer[1] += s.length() - re_s.length();
            answer[0]++;
            int len = re_s.length();
            s = "";
            while(true) {
                if (len % 2 == 0)
                    s = "0" + s;
                else
                    s = "1" + s;

                if (len == 1)
                    break;
                len /= 2;
            }

            if (s.equals("1"))
                break;
        }
        
        return answer;
    }
}