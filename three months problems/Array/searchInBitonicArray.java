
import java.io.*;
import java.util.*;
 class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int arr[]=new int[N];
        for(int i=0;i<N;i++)
            arr[i]=sc.nextInt();

        int target=sc.nextInt();

        Accio ob = new Accio();
        int ans= ob.findElement(arr, N,target);

        System.out.println(ans);

    }
}


class Accio {

    static int findElement(int arr[], int n,int target)
    {
        // your code here

    }
}