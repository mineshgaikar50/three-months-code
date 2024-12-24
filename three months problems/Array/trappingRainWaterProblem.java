import java.util.Scanner;

class Solution {
    public void TappingWater(int[] height, int n) {
        int leftmax = 0;
        int rightmax = 0;
        int l = 0;
        int r = n - 1;
        int ans = 0;

        while (l <= r) {
            if (height[l] < height[r]) {
                if (height[l] > leftmax) {
                    leftmax = height[l];
                } else {
                    ans += leftmax - height[l];
                }
                l++;
            } else {
                if (height[r] > rightmax) {
                    rightmax = height[r];
                } else {
                    ans += rightmax - height[r];
                }
                r--;
            }
        }
        System.out.println(ans);

    }
}

 class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n= sc.nextInt();
        int[] arr= new int[n];

        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();


        Solution Obj = new Solution();
        Obj.TappingWater(arr, n);


        sc.close();

    }
}