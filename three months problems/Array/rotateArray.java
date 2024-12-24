import java.util.ArrayList;
import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            arr.add(num);
        }

        int k = sc.nextInt();
        System.out.println(Solution.rotateArray(arr,k));

    }
}
class Solution{
    public static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int k) {
        // Write your code here.

        ArrayList<Integer> arr1 = new ArrayList<>();
        for (int i = 0; i < k; i++) {

            int number = arr.get(i);
            arr1.addLast(number);
        }

//        System.out.println(Arrays.toString(new ArrayList[]{arr}));
        for (int i = arr.toArray().length-1; i >= k  ; i--) {
            arr1.addFirst(arr.get(i));
        }


        return arr1;

    }
}