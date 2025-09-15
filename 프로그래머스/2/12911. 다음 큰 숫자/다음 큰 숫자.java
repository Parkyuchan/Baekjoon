class Solution {
    public int solution(int n) {
        int answer = n;
        String binary_before = Integer.toBinaryString(n);
        binary_before = binary_before.replace("0", "");
        int len_before = binary_before.length();

        while(true) {
            String binary_after = Integer.toBinaryString(++answer);
            binary_after = binary_after.replace("0", "");

            if (binary_after.length() == len_before)
                break;
        }
        
        return answer;
    }
}