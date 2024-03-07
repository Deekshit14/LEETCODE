// https://leetcode.com/problems/intersection-of-two-arrays/description/
package BINARY_SEARCH;

import java.util.ArrayList;
import java.util.Arrays;

public class Intersection_of_Two_Arrays {
    public static void main(String[] args) {
        int [] nums1 = {4,9,5};
        int [] nums2 = {9,4,9,8,4};
        System.out.println(Arrays.toString(intersection(nums1, nums2)));
    }
    public static int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> ans = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        for (int i = 0; i < nums1.length; i++) {
            int a = search(nums1[i], nums2);
            if (a != -1 && !ans.contains(a)) {
                ans.add(a);
            }
        }

        int[] inter = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            inter[i] = ans.get(i);
        }

        return inter;
    }

    public static int search(int target, int[] nums2) {
        int start = 0;
        int end = nums2.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums2[mid] == target) {
                return nums2[mid];
            } else if (nums2[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
