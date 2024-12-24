import java.util.Scanner;

class  Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int [] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Solution obj = new Solution();
        obj.findMaxMin(arr);


    }
}
class Solution{
    public static  void findMaxMin(int [] arr){
        int max = 0;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if(max < arr[i])
            {
                max = arr[i];
            }

            if(min > arr[i])
            {
                min = arr[i];
            }
        }
        System.out.print(max + " "+ min);

    }
}