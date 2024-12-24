import java.util.Arrays;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m-1, p2 = n-1, i=m+n-1;

        while(p2>=0)
        {
            if(p1>=0 && nums1[p1]>nums2[p2])
            {
                nums1[i--] = nums1[p1--];
            }
            else
            {
                nums1[i--] = nums2[p2--];
            }

        }
        System.out.println(Arrays.toString(nums1));
    }
}

class Main{
    public static void main(String[] args) {
        Solution obj = new Solution();

        int [] num1 = {1,2,3,0,0,0};
        int [] num2 = {2,5,6};
        int m = 3;
        int n = 3;
        obj.merge(num1,m,num2,n);
    }
}