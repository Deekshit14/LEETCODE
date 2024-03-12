package BINARY_SEARCH;

public class Find_the_Smallest_Divisor_Given_a_Threshold {
    public static void main(String[] args) {
        int [] nums = {44,22,33,11,1};
        int threshold = 5;
        System.out.println(smallestDivisor(nums, threshold));
    }
    public static int smallestDivisor(int[] nums, int threshold) {
        
        int start = 1;
        int end = findmax(nums, Integer.MIN_VALUE);

        while (start <= end)
        {
            int mid = start + (end - start)/2;
            if (find_sum(nums, mid, threshold))
                end = mid - 1;
            else 
                start = mid + 1;
        }
        return start;
    }

    public static boolean find_sum(int [] nums, int div, int threshold)
    {
        int sum = 0;
        for (int i=0; i<nums.length; i++)
        {
            sum +=  (nums[i] + div - 1)/div;
        }   
        if (sum <= threshold)
            return true; 
        return false;
    }
    
    public static int findmax(int[] nums, int max) 
    {
        for (int i=0; i<nums.length; i++) 
        {
            max = Math.max(nums[i], max);
        }
        return max;
    }
}
