class Solution {
    private static int maxDiff;
    private static int[] result;
    public int[] solution(int n, int[] info) {
        int[] answer = new int[11];

        result = new int[11];
        dfs(info, result, 0, n);
        
        if (maxDiff <= 0)
            answer = new int[]{-1};
        else 
            answer = result.clone();

        return answer;

    }

    private static void dfs(int[] info, int[] ryan, int idx, int arrows) {
        if (idx == 11 || arrows == 0) {
            if (arrows > 0) {
                ryan[10] = arrows;
            }

            int diff = calc(info, ryan);
            if (diff > maxDiff) {
                maxDiff = diff;
                result = ryan.clone();
            } else if (diff == maxDiff) {
                for (int i = 10; i >= 0; i--) {
                    if (ryan[i] > result[i]) {
                        result = ryan.clone();
                        break;
                    } else if (ryan[i] < result[i]) break;
                }
            }

            return;

        }

        if (arrows > info[idx])
            dfs(info, copy(ryan, idx, info[idx] + 1), idx + 1, arrows - (info[idx] + 1));

        dfs(info, copy(ryan, idx, 0), idx + 1, arrows);
    }

    private static int[] copy(int[] arr, int idx, int value) {
        int[] newArr = arr.clone();
        newArr[idx] = value;

        return newArr;
    }

    private static int calc(int[] ap, int[] ry) {
        int a = 0, l = 0;

        for (int i = 0; i<10; i++) {
            if (ap[i] == 0 && ry[i] == 0)
                continue;
            if (ap[i] > ry[i]) a += (10 - i);
            else l += (10 - i);
        }

        return l - a;
    }
}