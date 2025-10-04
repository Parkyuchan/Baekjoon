import java.util.*;

class Solution {
    public int[] solution(int[] fees, String[] records) {
        int[] answer;
        Map<String, String> car = new HashMap<>();
        Map<String, Integer> time = new HashMap<>();
        for (int i = 0; i < records.length; i++) {
            String[] carInfo = records[i].split(" ");

            String carNumber = carInfo[1];
            String behavior = carInfo[2];

            if (behavior.equals("IN")) {
                car.put(carNumber, carInfo[0]);
            } else if (behavior.equals("OUT")){
                String[] timeIn = car.get(carNumber).split(":");
                int inHour = Integer.parseInt(timeIn[0]);
                int inMinute = Integer.parseInt(timeIn[1]);

                String[] timeOut = carInfo[0].split(":");
                int outHour = Integer.parseInt(timeOut[0]);
                int outMinute = Integer.parseInt(timeOut[1]);

                int totalMinute = (outHour - inHour) * 60 + outMinute - inMinute;
                time.put(carNumber, time.getOrDefault(carNumber, 0) + totalMinute);

                car.remove(carNumber);

            }
        }

        if (!car.isEmpty()) {
            for (String number : car.keySet()) {
                String[] timeIn = car.get(number).split(":");
                int inHour = Integer.parseInt(timeIn[0]);
                int inMinute = Integer.parseInt(timeIn[1]);

                int outHour = 23;
                int outMinute = 59;

                int totalMinute = (outHour - inHour) * 60 + outMinute - inMinute;
                time.put(number, time.getOrDefault(number, 0) + totalMinute);

            }
        }

        answer = new int[time.size()];
        Map<String, Integer> result = new LinkedHashMap<>();

        for (String number : time.keySet()) {
            int money;
            if (time.get(number) <= fees[0]) {
                money = fees[1];
                result.put(number, money);
                continue;
            }

            money = fees[1] + ((time.get(number) - fees[0]) / fees[2]) * fees[3];

            if ((time.get(number) - fees[0]) % fees[2] > 0)
                money += fees[3];
            result.put(number, money);
        }
        List<String> numberList = new ArrayList<>(time.keySet());
        Collections.sort(numberList);

        for (int i = 0; i<numberList.size(); i++) {
            answer[i] = result.get(numberList.get(i));
        }
        return answer;
    }
}