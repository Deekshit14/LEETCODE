// https://leetcode.com/problems/search-a-2d-matrix/?envType=study-plan-v2&envId=binary-search
package BINARY_SEARCH;

public class Search_a_2D_Matrix {
    public static void main(String[] args) {
        int [][] matrix = { {1,3,5,7},
                            {10,11,16,20},
                            {23,30,34,60} };
        int target = 23;
        System.out.println(searchMatrix(matrix, target));
    }
    public static boolean searchMatrix(int[][] matrix, int target) {
        int start = 0;
        int end = matrix.length * matrix[0].length - 1;
        while (start <= end)
        {
            int mid = start + (end - start)/2;
            int row = mid / matrix[0].length;
            int col = mid % matrix[0].length;
            if (matrix[row][col] == target)
                return true;
            else if (matrix[row][col] > target)
                end = mid - 1;
            else 
                start = mid + 1;
        }
        return false;
    }
}