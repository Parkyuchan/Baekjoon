class Solution {
    private static int maxUserCount = 0;
    private static int maxMoney = 0;
    private static int[] rates = {10, 20, 30, 40};
    public int[] solution(int[][] users, int[] emoticons) {
        int[] answer = new int[2];

        dfs(0, new int[emoticons.length], users, emoticons);

        answer[0] = maxUserCount;
        answer[1] = maxMoney;

        return answer;
    }

    private static void dfs(int depth, int[] discount, int[][] users, int[] emoticons) {
        if (depth == emoticons.length) {
            calc(users, emoticons, discount);
            return;
        }

        for (int rate : rates) {
            discount[depth] = rate;
            dfs(depth + 1, discount, users, emoticons);
        }
    }

    private static void calc(int[][] users, int[] emoticons, int[] discount) {
        int totalUserCount = 0;
        int totalMoney = 0;

        for (int[] user : users) {
            int userRate = user[0];
            int userMoney = user[1];

            int money = 0;
            for (int i = 0; i < emoticons.length; i++) {
                if (userRate <= discount[i]) {
                    money += (int)(emoticons[i] * ((100 - discount[i]) * 0.01));
                }
            }

            if (money >= userMoney) {
                totalUserCount++;
            } else
                totalMoney += money;
        }

        if (totalUserCount > maxUserCount || (totalUserCount == maxUserCount && totalMoney > maxMoney)) {
            maxUserCount = totalUserCount;
            maxMoney = totalMoney;
        }
    }

}
// TODO: 이모티콘 서비스 가입자 늘리기
// TODO: 이모티콘 판매액 최대