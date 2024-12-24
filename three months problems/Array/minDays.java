import java.io.*;
import java.util.*;

class Solution {
    public int minDays(int[] arr, int boq, int flower) {
        //write code here
        if(boq*flower>arr.length)
        {
            return -1;
        }
        int low = arr[0], high = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<low)
            {
                low = arr[i];
            }
            if(arr[i]>high)
            {
                high = arr[i];
            }
        }
        int res = -1;

        while (low<=high)
        {
            int mid =(low+high)/2;
            if(isPossible(arr,boq,flower,mid)==true)
            {
                res = mid;
                high = mid-1;
            }
            else
            {
                low = mid+1;
            }
        }
        return res;
    }
    public boolean isPossible(int [] arr, int boq, int flower, int mid)
    {
        int adj = 0, bq = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<=mid)
            {
                adj++;
                if(adj == flower)
                {
                    bq++;
                    if (bq==boq)
                    {
                        return  true;
                    }
                    adj = 0;
                }
            }
            else
            {
                adj = 0;
            }
        }
        return false;
    }
}

class Main {
    public static void main(String[] args) throws IOException {

        //m = bouquet
        //k = adj flowers
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        Solution obj = new Solution();
        System.out.println(obj.minDays(arr, m, k));
        sc.close();
    }
}
