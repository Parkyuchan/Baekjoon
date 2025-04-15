import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int height = scanner.nextInt();
        int width = scanner.nextInt();
        int[] num = new int[width];

        for(int i = 0; i<width; i++)
            num[i] = scanner.nextInt();

        int left = 0;
        int right = width - 1;
        int leftMax = 0;
        int rightMax = 0;
        int water = 0;

        while(left <= right) {
            if(num[left] < num[right]) {
                if(num[left] >= leftMax)
                    leftMax = num[left];
                else
                    water += leftMax - num[left];

                left++;
            }
            else {
                if(num[right] >= rightMax)
                    rightMax = num[right];
                else
                    water += rightMax - num[right];

                right--;
            }
        }

        System.out.println(water);
    }

}