// https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/
package BINARY_SEARCH;

public class Count_Negative_Numbers_in_a_Sorted_Matrix {
    public static void main(String[] args) {
        int [][] grid ={ {4,3,2,-1},
                         {3,2,1,-1},
                         {1,1,-1,-2},
                         {-1,-1,-2,-3} };
        System.out.println(countNegatives(grid));
    }
    public static int countNegatives(int[][] grid) {
        int ans = 0;
        for (int i=0; i<grid.length; i++)
        {
            int start = 0;
            int end = grid[i].length-1;
            while (start <= end)
            {
                int mid = start + (end - start)/2;
                if (grid[i][mid] >= 0)
                    start = mid + 1;
                else 
                    end = mid - 1;
            }
            ans += grid[i].length - start;
        }
        return ans;
    }
}
