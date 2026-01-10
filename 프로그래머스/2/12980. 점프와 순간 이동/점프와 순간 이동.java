
public class Solution {
    public int solution(int n) {
        int ans = 0;
        // K칸을 "점프"할 때만 건전지 감소
        // 순간이동은 감소 x
        
        while(n > 0) {
            if (n % 2 == 0)
                n /= 2;
            else {
                n--;
                ans++;
            }
        }
        
        return ans;
    }
}
