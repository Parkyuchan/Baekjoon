class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];
        //NOTE: 장애물이 있다면 해당 명령 무시, 다음 명령을 수행
        int[][] map = new int[park.length][park[0].length()];
            
        for (int i = 0; i < park.length; i++) {
            for (int j = 0; j < park[i].length(); j++) {
                if (park[i].charAt(j) == 'X')
                    continue;
                
                map[i][j] = 1;
                if (park[i].charAt(j) == 'S') {
                    answer[0] = i;
                    answer[1] = j;
                }
            }
        }
        
        for (int i = 0; i < routes.length; i++) {
            String[] info = routes[i].split(" ");
            boolean check = true;
            if (info[0].equals("E")) {
                for (int j = 1; j <= Integer.parseInt(info[1]); j++) {
                    if (answer[1] + Integer.parseInt(info[1]) >= map[0].length || map[answer[0]][answer[1] + j] == 0) {
                        check = false;
                        break;
                    }
                }
                if (check)
                    answer[1] += Integer.parseInt(info[1]);
            } if (info[0].equals("W")) {
                for (int j = 1; j <= Integer.parseInt(info[1]); j++) {
                    if (answer[1] - Integer.parseInt(info[1]) < 0 || map[answer[0]][answer[1] - j] == 0) {
                        check = false;
                        break;
                    }
                }
                if (check)
                    answer[1] -= Integer.parseInt(info[1]);
            } if (info[0].equals("S")) {
                for (int j = 1; j <= Integer.parseInt(info[1]); j++) {
                    if (answer[0] + Integer.parseInt(info[1]) >= map.length || map[answer[0] + j][answer[1]] == 0) {
                        check = false;
                        break;
                    }
                }
                
                if (check)
                    answer[0] += Integer.parseInt(info[1]);
            } if (info[0].equals("N")) {
                for (int j = 1; j <= Integer.parseInt(info[1]); j++) {
                    if (answer[0] - Integer.parseInt(info[1]) < 0 || map[answer[0] - j][answer[1]] == 0) {
                        check = false;
                        break;
                    }
                }
                
                if (check)
                    answer[0] -= Integer.parseInt(info[1]);
            }
            
        }
        return answer;
    }
}