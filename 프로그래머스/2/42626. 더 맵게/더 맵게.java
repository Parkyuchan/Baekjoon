import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> heap = new PriorityQueue<>();

        for (int num : scoville)
            heap.add(num);

        while(true) {
            
            int minFirst = heap.poll();
            if (minFirst >= K)
                break;
            
            if (heap.isEmpty()) {
                answer = -1;
                break;
            }
            
            int minSecond = heap.poll();

            int newScroville = minFirst + (minSecond * 2);
            heap.add(newScroville);
            answer++;
        }
        
        return answer;
    }
}