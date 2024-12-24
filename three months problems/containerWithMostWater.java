import java.util.Scanner;

class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;

        while (left < right) {
            // 0 < 8
            maxArea = Math.max(maxArea, (right - left) * Math.min(height[left], height[right]));

            // 0    = (0, (8 - 0) *  (1,7))  ==>>  (8*1) ==>> maxArea = 8;
            // 8    = (8, (8 - 1) * (8,7)) ==>> (8 , 7*7) ==>> maxArea = 49;
            // 49   = (49,(7 - 1) * (8,3)) ==>> (49 , 6*3) ==>> max Area = 49;


            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
}

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Solution obj = new Solution();
        System.out.println(obj.maxArea(arr));
    }
}