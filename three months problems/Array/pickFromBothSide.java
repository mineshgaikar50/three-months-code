import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr= new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        Solution obj = new Solution();

        int result =  obj.maxElement(arr,k);

        System.out.println(result);

    }
}

class Solution{
    public int maxElement(int [] arr, int key){

        int i = 0;
        int k = 1;
        int j = arr.length-1;
        int max = 0;
        int curr_max = 0;

        while (i<j){
            int sum = arr[i]+arr[j]+arr[k];

            if(sum>curr_max){
                curr_max = sum;
                max = curr_max;
            }
        }
    }
}