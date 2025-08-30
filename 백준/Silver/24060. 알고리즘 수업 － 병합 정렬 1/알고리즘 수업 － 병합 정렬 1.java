import java.io.*;
import java.util.StringTokenizer;

public class Main {

    private static int N;
    private static int K;
    private static int[] arr;

    private static int count = 0;
    private static int check = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        arr = new int[N];

        for (int i = 0; i<N; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        merge_sort(0, N - 1);

        if (K > count)
            System.out.println(-1);
        else
            System.out.println(check);
    }

    private static void merge_sort(int left, int right) {
        if (left < right) {
            int mid = (right + left) / 2;
            merge_sort(left, mid);
            merge_sort(mid + 1, right);
            merge(left, mid, right);
        }

    }

    private static void merge(int left, int mid, int right) {

        int[] temp = new int[right - left + 1];
        int i = left;
        int j = mid + 1;
        int t = 0;
        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[t++] = arr[i++];
                count++;
            } else {
                temp[t++] = arr[j++];
                count++;
            }
            if (count == K)
                check = temp[t-1];

        }

        while (i <= mid) {
            temp[t++] = arr[i++];
            count++;

            if (count == K)
                check = temp[t-1];
        }
        while (j <= right) {
            temp[t++] = arr[j++];
            count++;

            if (count == K)
                check = temp[t-1];
        }

        i = left;
        t = 0;

        while(i<=right)
            arr[i++] = temp[t++];
    }

}
