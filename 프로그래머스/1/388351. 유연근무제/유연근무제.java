class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;
        //NOTE: 출근 희망 시각 + 10분까지 출근해야 됨
        //NOTE: 토요일, 일요일은 영향 x
        //NOTE: 모든 시각 시에 100을 곱하고 분을 더한 정수로 표현
        
        //TODO: 출근 시간 재조정(+10분)
        for (int i = 0 ; i < schedules.length; i++) {
            schedules[i] += 10;
            if (schedules[i] % 100 >= 60) {
                schedules[i] +=40;
            }
        }
        
        //TODO: 이벤트 시작일부터 조사
        for (int i = 0; i < timelogs.length; i++) {
            boolean check = true;
            int start = startday;
            for (int j = 0; j < timelogs[i].length; j++) {
                if (start == 6) {
                    start++;
                    continue;
                }
                if (start == 7) {
                    start = 1;
                    continue;
                }
                
                if (timelogs[i][j] > schedules[i]) {
                    check = false;
                    break;
                }
                
                start = start % 7 == 0 ? 1 : start + 1;
            }
            
            if (check)
                answer++;
        }
        
        return answer;
    }
}