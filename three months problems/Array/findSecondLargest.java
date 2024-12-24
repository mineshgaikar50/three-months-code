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
        int res = ob.findSecondLargest(n,arr);
        System.out.println(res);
    }
}

class Solution{
    public int findSecondLargest(int n, int[] arr){

        if(arr.length<2){
            return 0;
        }

        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;


        for (int num : arr){
            if(num>max){
                smax = max;
                max = num;
            } else if (num>smax && num != max) {
                smax = num;
            }
        }
        return (smax == Integer.MIN_VALUE)? -1 : smax;

    }
}