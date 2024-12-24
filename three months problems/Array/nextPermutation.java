class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;

        // Step 1: Find the rightmost pair where nums[i] < nums[i + 1]
        int i = n - 2;
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        // If such a pair is found
        if (i >= 0) {
            // Step 2: Find the smallest element to the right of nums[i] that is greater than nums[i]
            int j = n - 1;
            while (j >= 0 && nums[j] <= nums[i]) {
                j--;
            }

            // Step 3: Swap elements at i and j
            swap(nums, i, j);
        }

        // Step 4: Reverse the sequence to the right of i
        reverse(nums, i + 1, n - 1);
    }
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }
}