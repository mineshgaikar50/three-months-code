import java.util.Arrays;
import java.util.Scanner;

class Scratch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
    //    int n = sc.nextInt();
        int [] arr = {0,0,1,1,1,2,2,3,3,4};

//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
        Solution obj = new Solution();
        obj.removeDuplicates(arr);

        System.out.println(Arrays.toString(arr));
    }
}
class Solution {
    public int removeDuplicates(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }

        // Pointer for unique elements
        int uniqueIndex = 0;

        // Iterate through the array
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[uniqueIndex]) {
                uniqueIndex++;
                arr[uniqueIndex] = arr[i];
            }
        }

        // The length of the array with unique elements
        return uniqueIndex + 1;
    }
}