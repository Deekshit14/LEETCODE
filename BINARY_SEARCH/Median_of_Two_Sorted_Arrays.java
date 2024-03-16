// https://leetcode.com/problems/median-of-two-sorted-arrays/
package BINARY_SEARCH;

public class Median_of_Two_Sorted_Arrays {
    public static void main(String[] args) {
        // For even 
        // int [] nums1 = {1,3,4,7,10,12};
        // int [] nums2 = {2,3,6,15};
        
        // For odd
        int [] nums1 = {2,3,4};  
        int [] nums2 = {1,3};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        if (m > n)
            return findMedianSortedArrays(nums2 , nums1);
        int start = 0;
        int end = m;
        int total = m + n;
        int left = (total + 1)/2;

        while (start <= end)
        {
            int mid1 = start + (end - start)/2;
            int mid2 = left - mid1;
            int L1 = Integer.MIN_VALUE;
            int L2 = Integer.MIN_VALUE;
            int R1 = Integer.MAX_VALUE;
            int R2 = Integer.MAX_VALUE;
            if (mid1 < m) 
                R1 = nums1[mid1];
            if (mid2 < n)
                R2 = nums2[mid2];
            if (mid1 - 1 >= 0)
                L1 = nums1[mid1 - 1];
            if (mid2 - 1 >= 0)
                L2 = nums2[mid2 - 1];
            if (L1 <= R2 && L2 <= R1)
            {
                if (total % 2 == 1)
                    return Math.max(L1, L2);
                else
                    return ((double)(Math.max(L1, L2) + Math.min(R1, R2)))/2.0;
            }
            else if (L1 > R2)
                end = mid1 - 1;
            else
                start = mid1 + 1;
        }
        return 0;
    }
}

//Better approach than linear solution but not better than Binary search, Time complexity O(n + m)

//     public double findMedianSortedArrays(int[] nums1, int[] nums2) {
//         int m = nums1.length;
//         int n = nums2.length;
//         int total = m + n;
//         int count = 0;
//         int index2 = total/2;
//         int index1 = index2 - 1;
//         int index_value1 = -1;
//         int index_value2 = -1;
//         int i = 0;
//         int j = 0;
//         while (i<m && j<n)
//         {
//             if (nums1[i] < nums2[j])
//             {
//                 if (count == index1)
//                     index_value1 = nums1[i];
//                 if (count == index2)
//                     index_value2 = nums1[i]; 
//                 count++;
//                 i++;
//             }
//             else
//             {
//                 if (count == index1)
//                     index_value1 = nums2[j];
//                 if (count == index2)
//                     index_value2 = nums2[j];
//                 count++;
//                 j++;
//             }
//         }

//         while (i<m)
//         {
//             if (count == index1)
//                 index_value1 = nums1[i];
//             if (count == index2)
//                 index_value2 = nums1[i]; 
//             count++;
//             i++;
//         }

//         while (j<n)
//         {
//             if (count == index1)
//                 index_value1 = nums2[j];
//             if (count == index2)
//                 index_value2 = nums2[j];
//             count++;
//             j++;
//         }

//         if (total % 2 == 1)
//             return (double)index_value2;

//         return (double)((double)(index_value1 + index_value2))/ 2.0; 
//     }
