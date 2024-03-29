// https://leetcode.com/problems/check-if-n-and-its-double-exist/
package BINARY_SEARCH;

import java.util.Arrays;

public class Check_If_N_and_Its_Double_Exist {
    public static void main(String[] args) {
        int [] arr = {10,2,5,3};
        System.out.println(checkIfExist(arr));
    }
    public static boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        for (int j=0; j<arr.length; j++)
        {
            int target = 2*arr[j];
            int start = 0;
            int end = arr.length - 1;
            while(start <= end) 
            {
                int mid = start + (end-start)/2;
                if (arr[mid] == target && mid != j) // i!=j as per question. Note: i variable is not used in this code
                    return true;
                else if (arr[mid] < target)
                    start = mid + 1;
                else 
                    end = mid - 1;
            }
        }
        return false;
    }
}
