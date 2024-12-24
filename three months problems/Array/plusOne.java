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
        Solution obj = new Solution();
        obj.plusOne(arr);


        System.out.println(Arrays.toString(arr));

    }
}
class Solution {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }

}