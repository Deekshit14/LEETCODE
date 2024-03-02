package BINARY_SEARCH;
import java.util.Scanner;
public class Kth_Missing_Positive_Number {
    public static void main(String[] args) {
        int [] arr = {2,3,4,7,11};
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the target");
        int target = s.nextInt(); 
        System.out.println(findKthPositive(arr, target));
    }
    public static int findKthPositive(int[] arr, int k) {
        int start = 0;
        int end = arr.length-1;
        while (start <= end)
        {
            int mid = start + (end - start)/2;
            int missing = arr[mid] - (mid + 1);
            if (missing < k)
                start = mid + 1;
            else 
                end = mid - 1;
        }
        return start + k;          //end + 1 + k 
    }
    
}
