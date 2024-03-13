// https://www.geeksforgeeks.org/problems/aggressive-cows/1
package BINARY_SEARCH;

import java.util.Arrays;

public class AGGRESSIVE_COWS{
    public static void main(String[] args) {
        int [] stalls = {0,3,4,7,9,10};
        int cows = 4;
        System.out.println(solve(cows, stalls));
    }

    public static int solve(int cows, int[] stalls) {
        Arrays.sort(stalls);
        int start = 1;
        int end = stalls[stalls.length-1] - stalls[0];
        
        while (start <= end)
        {
            int mid = start + (end - start)/2;
            
            if (Could_we_Place(stalls, mid, cows))
                start = mid + 1;
            else 
                end = mid - 1;
        }
        return end;
    }
    
    public static boolean Could_we_Place(int [] stalls, int dist, int cows)
    {
        int count_cows = 1;
        int last = stalls[0];
        
        for (int i=1; i<stalls.length; i++)
        {
            if (stalls[i] - last >= dist)
            {
                count_cows++;
                last = stalls[i];
            }
            if (count_cows >= cows)
                return true;
        }
        return false;
    }
}