import java.util.*;

class Solution {
    public int solution(int[] arr) {
        Arrays.sort(arr);
        int answer = arr[0];
        
        while(true) {
            boolean check = true;
            if (answer >= arr[arr.length - 1]) {
                for (int i = 1; i < arr.length; i++) {
                    if (answer % arr[i] != 0) {
                        check = false;
                        break;
                    }
                }
                    
                if (check)
                    break;
            }
            
            answer += arr[0];
        }
        
        return answer;
    }
}