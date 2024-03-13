// https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/description/
package BINARY_SEARCH;

public class Capacity_To_Ship_Packages_Within_D_Days {
    public static void main(String[] args) {
        // int [] weights = {1,2,3,4,5,6,7,8,9,10}; 
        int [] weights = {3,2,2,4,1,4};

        // int days = 5;
        int days = 3;
        System.out.println(shipWithinDays(weights, days));
    }
    
    public static int shipWithinDays(int[] weights, int days) {
        int start = Integer.MIN_VALUE;
        int end = 0;
        for (int num: weights)
        {
            start = Math.max(num, start);
            end += num;
        }

        while (start <= end)
        {
            int mid = start + (end - start)/2;

            if (find_days(weights, mid) > days)
                start = mid + 1;
            else 
                end = mid - 1;
        }
        return start;
    }

    public static int find_days(int [] weights, int cap)
    {
        int load = 0;
        int days = 1;
        for (int i=0; i<weights.length; i++)
        {
            if (weights[i] + load > cap)
            {
                days += 1;
                load = weights[i];
            }
            else 
            {
                load = load + weights[i];
            }
        }
        return days;
    }   
}
