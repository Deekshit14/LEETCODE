package BINARY_SEARCH;

import java.util.Scanner;
public class Sqrt_x {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number");
        int x = s.nextInt();
        System.out.println("The square root of " + x + " is " + mySqrt(x));
    }
    static int mySqrt(int x) {
        int start = 0;
        int end = x;
        while (start <= end)
        {
            int mid = start + (end - start)/2;
            if ((long)mid*mid == x)
                return mid;
            else if ((long)mid*mid > x)
                end = mid - 1;
            else
                start = mid + 1;
        }
        return end;
    }
}
