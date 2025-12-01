import java.util.*;
class Solution {
    public int solution(int[] mats, String[][] park) {
        //TODO: -1이 나올 때, count값만큼 세로도 같이 조사
        //TODO: 만약 정사각형을 충족하지 않는다면 해당 가로 길이 만큼 정사각형이 불가
        //TODO: 가로로 움직이며, 세로로 만족하면 최대 한변 길이 mats 리스트와 비교
        
        int n = park.length;
        int m = park[0].length;

        // 1) Prefix Sum 준비 (모든 -1을 1로 변환)
        int[][] sum = new int[n + 1][m + 1];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int val = park[i][j].equals("-1") ? 1 : 0;
                sum[i + 1][j + 1] = val + sum[i][j + 1] + sum[i + 1][j] - sum[i][j];
            }
        }

        // 2) mats를 큰 값부터 검사
        Arrays.sort(mats);

        // 큰 정사각형부터 찾으면 즉시 return
        for (int k = mats.length - 1; k >= 0; k--) {
            int size = mats[k];

            // 모든 좌표(i, j)를 좌상단으로 가정하고 조사
            for (int i = 0; i + size <= n; i++) {
                for (int j = 0; j + size <= m; j++) {

                    // 3) prefix sum으로 해당 영역이 정사각형(-1)인지 O(1)로 검사
                    int total = getSum(sum, i, j, i + size - 1, j + size - 1);

                    if (total == size * size) {
                        return size;  // 가장 큰 정사각형 발견 → 즉시 종료
                    }
                }
            }
        }

        return -1;
    }

    // (r1, c1) ~ (r2, c2) 영역의 합 구하기 (prefix sum)
    private int getSum(int[][] sum, int r1, int c1, int r2, int c2) {
        return sum[r2 + 1][c2 + 1]
                - sum[r1][c2 + 1]
                - sum[r2 + 1][c1]
                + sum[r1][c1];
    }
}