import java.util.HashSet;
import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr= new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Solution obj = new Solution();

        int result =  obj.containsDuplicate(arr);

        System.out.println(result);

    }
}

class Solution{
    public  int containsDuplicate(int [] arr){

        int res = 0;
        HashSet<Integer> seen = new HashSet<>();

        for(int num:arr){
            if(!seen.add(num)){
                return num;
            }
        }
        return -1;
    }
}