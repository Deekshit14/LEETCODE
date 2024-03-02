// https://leetcode.com/problems/search-in-rotated-sorted-array/
package BINARY_SEARCH;

import java.util.Scanner;

public class Search_in_Rotated_Sorted_Array {
    public static void main(String[] args) {
        int[] arr = {4, 6, 7, 8, 10, 0, 1, 3};    /* First the elements are ascending till the largest element i.e, Peak and then descending for one time and then again
        elements are in ascending, Point to remember that after the largest element in the array the elements which occur next are all smaller than the previous elements before
        the largest element i.e {4,6,7,8,10} > {0,1,3) */
//        int [] arr = {6,9,10,0,1,2,3,4,5};
//        int [] arr = {4,5,6,7,8,9,0,1};

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the target element");
        int target_index = s.nextInt();
        int ans = search(arr, target_index);
        System.out.println(ans);
    }

    static int search(int[] arr, int target)
    {
        int start = 0;
        int end = arr.length-1;
        int pivot = pivot(arr,start,end);
        if (pivot == -1)
            return (binarysearch(arr, target, start, end));

        if (arr[pivot] == target)
            return pivot;

        if (target>=arr[start])
            return (binarysearch(arr, target, start, pivot-1 ));

        return (binarysearch(arr, target, pivot + 1, end));
    }

    static int binarysearch(int [] arr, int target, int start, int end)
    {
        while(start<=end)
        {
            int mid = start + (end - start)/2;
            if (arr[mid] > target)
                end = mid - 1;
            else if (arr[mid] < target)
                start = mid + 1;
            else
                return mid;
        }
        return -1;
    }

    static int pivot(int [] arr, int start, int end)  // 'Pivot' means finding the largest element
    {
        int mid = 0;
        while (start<end)
        {
            mid = start + (end - start)/2;
            if (arr[mid]>arr[mid+1])    // We know that the only time the largest element occur we will have descending order i.e, {10,0} rest all elements are in ascending order
                return mid;

            else if (mid > start && arr[mid]<arr[mid-1])   // Same as above statement, but we are checking in another way whether the previous element is greater than the current element
                /* The statement 'mid>start' is used because for example [3,1], to find peak element first, start=0 (index), end = 1, mid = 0, Now while evaluating if(condition)
                    i.e, 'arr[mid]<arr[mid-1]' there will be no element exists in 'mid-1' position because mid is same as start element, so no elements exists before start
                    and an Error is encountered, So we must use 'mid>start condition so that if this fails the next condition does not evaluate because of bitwise operators
                 */
                return mid-1;

            else if (arr[start] > arr[mid])
                end = mid - 1;  // If the mid element is less than start element then we know that the 'pivot' does not lie in mid or after mid so bring 'end' to (mid-1) position

            else
                start = mid + 1; /* If mid element is greater than start element then we know that 'pivot' will lie at mid or after mid, but since we have already used the
           condition to check whether the mid element is the 'pivot' in first two if(conditions) we know that mid is not pivot since condition failed so start = mid + 1 position  */

        }
        return -1;  // Return some value to avoid error
    }
}
