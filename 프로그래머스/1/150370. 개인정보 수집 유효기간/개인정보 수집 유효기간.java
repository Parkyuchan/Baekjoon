import java.util.*;
class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        int[] answer = {};
        //TODO: 답을 저장할 리스트 선언
        List<Integer> list = new ArrayList<>();
        //TODO: today 년, 월, 일로 분리(.으로 분리)
        String[] todaySplit = today.split("\\.");
        int todayYear = Integer.parseInt(todaySplit[0]);
        int todayMonth = Integer.parseInt(todaySplit[1]);
        int todayDay = Integer.parseInt(todaySplit[2]);
        //TODO: terms를 Map으로 유효기간 저장(공백으로 분리)
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < terms.length; i++) {
            String[] termsSplit = terms[i].split(" ");
            map.put(termsSplit[0], Integer.parseInt(termsSplit[1]));
        }
        //TODO: privacies를 공백으로 분리하여 일시와 유형을 분리
        for (int i = 0; i < privacies.length; i++) {
            //TODO: 분리된 일시는 .으로 다시 분리하여 년/월/일을 분리
            String[] privaSplit = privacies[i].split(" ");
            String[] priDateSplit = privaSplit[0].split("\\.");
            int priYear = Integer.parseInt(priDateSplit[0]);
            int priMonth = Integer.parseInt(priDateSplit[1]);
            int priDay = Integer.parseInt(priDateSplit[2]);
            String priType = privaSplit[1];

            //TODO: 유형에 따라 만료 일자를 정하고 유효됐는지 판단
            int possibleYear = priYear;
            int possibleMonth = priMonth + map.get(priType);
            int possibleDay = priDay;
            while(possibleMonth > 12) {
                possibleMonth -= 12;
                possibleYear++;
            }
            possibleDay--;
            if (possibleDay == 0) {
                possibleMonth--;
                if (possibleMonth == 0) {
                    possibleMonth = 12;
                    possibleYear--;
                }
                possibleDay = 28;
            }
            
            if (possibleYear < todayYear) {
                list.add(i + 1);
                continue;
            }

            if (possibleYear == todayYear && possibleMonth < todayMonth) {
                list.add(i + 1);
                continue;
            }

            if (possibleYear == todayYear && possibleMonth == todayMonth && possibleDay < todayDay) {
                list.add(i + 1);
            }
        }
        
        //TODO: 리스트를 배열로 변환
        answer = list.stream()
                .mapToInt(Integer::intValue)
                .toArray();
        return answer;
    }
}