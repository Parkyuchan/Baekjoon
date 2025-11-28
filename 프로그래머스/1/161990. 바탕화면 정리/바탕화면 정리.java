class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = new int[4];
        answer[0] = wallpaper.length;
        answer[1] = wallpaper[0].length();
        
        for (int i = 0; i < wallpaper.length; i++) {
            for (int j = 0; j < wallpaper[0].length(); j++) {
                if (wallpaper[i].charAt(j) == '#') {
                    answer[0] = answer[0] > i ? i : answer[0];
                    answer[1] = answer[1] > j ? j : answer[1];
                    answer[2] = answer[2] < i ? i : answer[2];
                    answer[3] = answer[3] < j ? j : answer[3];
                }
            }
        }
        
        answer[2] += 1;
        answer[3] += 1;
        return answer;
    }
}