import java.util.Arrays;
import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Solution ob = new Solution();
        System.out.println(Arrays.toString(ob.getSumAbsoluteDifferences(arr)));
    }
}
class Solution{
    public int[] getSumAbsoluteDifferences(int[] nums) {

//        int sum = 0;
//        int [] arr = new int[nums.length];
//        int []  arr1 = new int[nums.length];
//
//        for (int i = 0; i < nums.length; i++) {
//
//            for (int k = 0; k < nums.length; k++) {
//
//                sum+= Math.abs(nums[i]-nums[k]);
//
//            }
//            arr[i] = sum;
//
//        }
//
//        arr1[0] = arr[0];
//        for (int i = 1; i < arr.length; i++) {
//            arr1[i] = Math.abs(arr[i]-arr[i-1]);
//        }
//
//        return arr1;


        int n = nums.length;
        int[] result = new int[n];
        int totalSum = 0;
        int prefixSum = 0;

        // Calculate the total sum of the array
        for (int num : nums) {
            totalSum += num;
        }

        // Calculate the sum of absolute differences for each element
        for (int i = 0; i < n; i++) {
            int leftSum = i * nums[i] - prefixSum; // Contribution from left
            int rightSum = (totalSum - prefixSum - nums[i]) - (n - i - 1) * nums[i]; // Contribution from right
            result[i] = leftSum + rightSum;
            prefixSum += nums[i]; // Update prefix sum
        }

        return result;
    }
}