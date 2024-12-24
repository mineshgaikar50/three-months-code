import java.util.*;

 class Main
{
    static int subarraySum(int[] arr, int k) {
        HashMap<Integer, Integer> prefixSumMap = new HashMap<>();
        int currentSum = 0;
        int maxLength = 0;

        for (int i = 0; i < arr.length; i++) {
            // Add the current element to the running sum
            currentSum += arr[i];

            // Check if current sum is equal to k
            if (currentSum == k) {
                maxLength = i + 1;
            }

            // If (currentSum - k) is found in the map, it means that the subarray between
            // the index where (currentSum - k) was first found and the current index has a sum of k
            if (prefixSumMap.containsKey(currentSum - k)) {
                maxLength = Math.max(maxLength, i - prefixSumMap.get(currentSum - k));
            }

            // Store currentSum in the map if it hasn't been stored before
            if (!prefixSumMap.containsKey(currentSum)) {
                prefixSumMap.put(currentSum, i);
            }
        }

        return maxLength;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for(int i=0; i<t; i++)
        {
            int n, k;
            n=input.nextInt();
            k=input.nextInt();
            int arr[] = new int[n];
            for(int j=0; j<n; j++)
            {
                arr[j] = input.nextInt();
            }
            System.out.println(subarraySum(arr,k));
        }
    }
}
