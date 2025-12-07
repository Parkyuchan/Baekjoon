class Solution {
    public int solution(int n, int w, int num) {
        //NOTE: n은 총 택배 상자 개수
        //NOTE: w는 가로로 놓는 상자 개수
        //NOTE: num은 꺼내려는 탠ㄱ배 상자 번호
        
        int answer = 0;
        int row = n / w + 2;
        int col = w + 1;
        int[][] box = new int[row][col];
        int count = 1;

        boolean check = true;
        //TODO: 배열을 활용하여 데이터 저장
        for (int i = 1; i < row; i++) {
            if (check) {
                for (int j = 1; j < col; j++) {
                    if (count > n)
                        break;

                    box[i][j] = count++;
                }
            } else {
                for (int j = col - 1; j > 0; j--) {
                    if (count > n)
                        break;

                    box[i][j] = count++;
                }
            }

            check = check ? false : true;
        }

        //TODO: 각 열을 맨 처음 줄에 들어가는 값들을 통해 인식(7이라면 w로 나눈 후 나머지로 확인)
        //TODO: 최상위 행(ex. 4)에서 꺼내려는 택배의 행(ex. 2)을 빼서 결과 출력
        int outBoxRow;
        int outBoxCol;

        if (num % w == 0) {
            outBoxRow = num / w;
        }
        else {
            outBoxRow = num / w + 1;
        }
        int move = w * outBoxRow - num + 1;
        outBoxCol = outBoxRow % 2 == 0 ? move : col - move;

        if (box[row - 1][outBoxCol] != 0)
            answer = row - outBoxRow;
        else
            answer = row - outBoxRow - 1;
        
        return answer;
    }
}