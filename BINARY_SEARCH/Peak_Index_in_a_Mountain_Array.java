// https://leetcode.com/problems/peak-index-in-a-mountain-array/
package BINARY_SEARCH;

public class Peak_Index_in_a_Mountain_Array {
    public static void main(String[] args) {
        int arr[] = {1,2,3,5,6,4,3,2};
        int ans = peakIndexInMountainArray(arr);
        System.out.println(ans);
    }
    static int peakIndexInMountainArray(int arr[])
    {
        int start = 0;
        int end = arr.length-1;
        while(start<end)
        {
            int mid = start + (end - start)/2;
            if (arr[mid]<arr[mid+1])
                start = mid + 1;
            else
                end = mid;
        }
        return start;   // OR return end;
    }
}
