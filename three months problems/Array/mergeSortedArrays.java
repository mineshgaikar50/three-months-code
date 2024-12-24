import java.util.*;

class Scratch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [] arr1 = new int[n];
        int [] arr2 = new int[m];

        for (int i = 0; i < n; i++) {
            arr1[i]= sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }

        int[] mergedArray = mergeSortedArrays(arr1, arr2);

        System.out.println(Arrays.toString(mergedArray));
    }
    public static int[] mergeSortedArrays(int[] arr1, int[] arr2)
    {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] mergedArray = new int[n1 + n2];

        int i = 0, j = 0, k = 0;

        // Merge the two arrays
        while (i < n1 && j < n2) {
            if (arr1[i] <= arr2[j]) {
                mergedArray[k++] = arr1[i++];
            } else {
                mergedArray[k++] = arr2[j++];
            }
        }

        // Copy remaining elements of arr1 if any
        while (i < n1) {
            mergedArray[k++] = arr1[i++];
        }

        // Copy remaining elements of arr2 if any
        while (j < n2) {
            mergedArray[k++] = arr2[j++];
        }

        return mergedArray;

    }
}
