package RECURSION;
import java.util.Scanner;
public class Binary_Search {
    public static void main(String [] args){
        int [] nums = {-1,0,3,5,9,12};
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the target");
        int target = s.nextInt();
        int index = search(nums, target);
        System.out.println(index);
    }
    public static int search(int[] nums, int target){
        return search1(nums, target, 0, nums.length-1);
    }
    public static int search1(int[] nums, int target, int start, int end) {
        if (start > end)
            return -1;
        int mid = start + (end - start)/2;

        if (nums[mid] == target)
            return mid;
        else if (nums[mid] > target)
            return search1(nums, target, start, mid-1);
        return search1(nums, target, mid + 1, end);
    }
}
