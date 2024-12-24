 class OptimizedSubArraySum {
    // Optimized function to calculate the sum of all subarrays
    public static long sumOfAllSubarrays(int[] arr) {
        int n = arr.length;
        long totalSum = 0;

        // Loop through each element in the array
        for (int i = 0; i < n; i++) {
            // Calculate the contribution of arr[i] to the sum of all subarrays
            long contribution = (long) arr[i] * (i + 1) * (n - i);
            totalSum += contribution;
        }

        return totalSum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println("Sum of all subarrays: " + sumOfAllSubarrays(arr));
    }
}
