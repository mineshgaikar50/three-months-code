import java.util.Arrays;
import java.util.Scanner;

class Scratch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();

        Solution obj = new Solution();

        System.out.println(Arrays.toString(obj.twoSum(arr, target)));
    }
}

class Solution{
    public int[] twoSum(int[] numbers, int target) {

        int start = 0;
        int end = numbers.length-1;

        while (start<end){
            int sum = numbers[start]+numbers[end];

            if(sum == target){
                return new int[]{start+1, end+1};
            } else if (sum < target) {
                start++;
            }else {
                end--;
            }
        }
        return new int[]{};
    }
}