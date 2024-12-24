import java.util.*;

public class array_add {

    public static int digits(long n)
    {
        int count = 0;

        while(n>0)
        {
            count = count + 1;
            n = n/10L;
        }

        return count;
    }
    static int[] calSum(int a[], int b[], int n, int m) {

        long firstNumber = 0L;
        long secondNumber = 0L;


        for(int i=0; i<n; i=i+1)
        {
            firstNumber = firstNumber * 10L + a[i];
        }

        for(int i=0; i<m; i=i+1)
        {
            secondNumber = secondNumber * 10L + b[i];
        }

        long answer = firstNumber + secondNumber;
        int countNumberOfDigits = digits(answer);

        int finalAnswer[] = new int[countNumberOfDigits];

        for(int i=countNumberOfDigits-1; i>=0; i=i-1)
        {
            // Finding the last digit
            int lastDigit = (int)(answer%10L);

            // Storing the last digit
            finalAnswer[i] = lastDigit;

            // Removing the last digit
            answer = answer/10L;
        }

        return finalAnswer;
    }

    /* Driver program to test above function */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < n1; i++) arr1[i] = sc.nextInt();

        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        for (int i = 0; i < n2; i++) arr2[i] = sc.nextInt();
        sc.close();

        int[] res = calSum(arr1, arr2, n1, n2);
        for (int i : res) System.out.println(i);
    }
}