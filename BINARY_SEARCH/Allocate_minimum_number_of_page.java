// https://www.geeksforgeeks.org/problems/allocate-minimum-number-of-pages0937/1
package BINARY_SEARCH;

public class Allocate_minimum_number_of_page {
    public static void main(String[] args) {
        int [] A = {25, 46, 28, 49, 24};
        int N = A.length;
        int M = 4; // students
        System.out.println(findPages(A, N, M));
    }

    
    //Function to find minimum number of pages.
    public static int findPages(int[]A,int N,int M)
    {
        if (A.length < M)
            return -1;
        
        int start = Integer.MIN_VALUE;
        int end = 0;
        
        for (int i=0; i<A.length; i++)
        {
            start = Math.max(start, A[i]);
            end += A[i];
        }
        
        while (start <= end)
        {
            int mid = start + (end - start)/2;
            if (find_num_stud(A, mid) <= M)
                end = mid - 1;
            else
                start = mid + 1;
        }
        return start;
    }
    
    public static int find_num_stud(int [] A, int max)
    {
        int pages = 0;
        int student = 1;
         
        for (int i=0; i<A.length; i++)
        {
            if (pages + A[i] <= max)
            {
                pages += A[i];
            }
            else 
            {
                student++;
                pages = A[i];
            }
        }
        return student;
    }
}
