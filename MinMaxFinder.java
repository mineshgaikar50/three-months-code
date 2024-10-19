import java.util.Scanner;

class Main{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // size of array
        int [] arr = new int[n];

        int max = 0;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {

            arr[i] = sc.nextInt();

            if(max < arr[i]){
                max = arr[i];
            }
            if(min > arr[i]){

                min = arr[i];
            }
        }
        System.out.print(max + " " + min);
    }
}