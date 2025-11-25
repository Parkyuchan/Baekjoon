class Solution {
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        // h는 x좌표
        // w는 y좌표
        
        int[] dh = {0, 1, -1, 0};
        int[] dw = {1, 0, 0, -1};
        
        String color = board[h][w];
        for (int i = 0; i < 4; i++) {
            int dx = dh[i] + h;
            int dy = dw[i] + w;
            
            if (dx >= 0 && dy >= 0 && dx < board.length && dy < board[0].length)
                if (color.equals(board[dx][dy]))
                    answer++;
        }
        return answer;
    }
}