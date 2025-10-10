import java.util.*;

class Solution {
    public long solution(int cap, int n, int[] deliveries, int[] pickups) {
        long answer = 0;
        Stack<Integer> stackDelivery = new Stack<>();
        Stack<Integer> stackPickUp = new Stack<>();

        for (int i = 0; i < n; i++) {
            if (deliveries[i] > 0)
                stackDelivery.push(i);
            if (pickups[i] > 0)
                stackPickUp.push(i);
        }

        while(!stackDelivery.isEmpty() || !stackPickUp.isEmpty()) {
            int distance = 0;
            if (!stackDelivery.isEmpty()) distance = Math.max(distance, stackDelivery.peek() + 1);
            if (!stackPickUp.isEmpty()) distance = Math.max(distance, stackPickUp.peek() + 1);

            answer += distance * 2L;

            int remain = cap;
            while (!stackDelivery.isEmpty() && remain > 0) {
                int idx = stackDelivery.peek();
                if (deliveries[idx] <= remain) {
                    remain -= deliveries[idx];
                    deliveries[idx] = 0;
                    stackDelivery.pop();
                } else {
                    deliveries[idx] -= remain;
                    remain = 0;
                }
            }

            remain = cap;
            while(!stackPickUp.isEmpty() && remain > 0) {
                int idx = stackPickUp.peek();
                if (pickups[idx] <= remain) {
                    remain -= pickups[idx];
                    pickups[idx] = 0;
                    stackPickUp.pop();
                } else {
                    pickups[idx] -= remain;
                    remain = 0;
                }
            }
        }
        return answer;
    }
}