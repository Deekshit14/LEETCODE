// https://leetcode.com/problems/split-array-largest-sum/description/
package BINARY_SEARCH;

public class Split_Array_Largest_Sum {
    public static void main(String[] args) {
        int [] nums = {7,2,5,10,8};
        int k = 2;
        System.out.println(splitArray(nums, k));
    }
    public static int splitArray(int[] nums, int k) {
        int start = Integer.MIN_VALUE;
        int end = 0;
        for (int i=0; i<nums.length; i++)
        {
            start = Math.max(start, nums[i]);
            end += nums[i];
        }

        while (start <= end)
        {
            int mid = start + (end - start)/2;
            if (find_no_k(nums, mid) <= k)
                end = mid - 1;
            else 
                start = mid + 1;
        }
        return start;
    }

    public static int find_no_k(int [] nums, int max)
    {
        int k=1;
        int last = 0;
        for (int i=0; i<nums.length; i++)
        {
            if (last + nums[i] <= max)
                last += nums[i];
            else
            {
                k++;
                last = nums[i];
            }
        }
        return k;
    }
}
