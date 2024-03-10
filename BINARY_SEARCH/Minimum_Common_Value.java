package BINARY_SEARCH;
public class Minimum_Common_Value {
    public static void main(String[] args) {
        int [] nums1 = {1,2,3};
        int [] nums2 = {2,4};
        System.out.println(getCommon(nums1, nums2));
    }
    public static int getCommon(int[] nums1, int[] nums2) {
        int first = 0;
        int second = 0;
        while (first < nums1.length && second < nums2.length)
        {
            if (nums1[first] == nums2[second])
                return nums1[first];
            else if (nums1[first] < nums2[second])
                first++;
            else 
                second++;
        }
        return -1;
    }
}