import java.util.*;

class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        
        Arrays.sort(arr);
        int count = 1;

        while (true) {
            answer = arr[arr.length - 1] * count;
            int size = 0;

            for (int i = 0; i<arr.length - 1; i++) {
                if (answer % arr[i] != 0)
                    break;

                size++;
            }

            if (size == arr.length - 1)
                break;

            count++;
        }
        
        return answer;
    }
}